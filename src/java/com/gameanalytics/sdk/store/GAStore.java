package com.gameanalytics.sdk.store;

import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import com.gameanalytics.sdk.device.GADevice;
import com.gameanalytics.sdk.events.EGASdkErrorAction;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.http.GAHTTPApi;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.state.GAState;
import com.gameanalytics.sdk.utilities.GAUtilities;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GAStore {
    private static final GAStore INSTANCE = new GAStore();
    private static final long MaxDbSizeBytes = 6291456;
    private static final long MaxDbSizeBytesBeforeTrim = 5242880;
    private String dbPath = "";
    private SQLiteDatabase sqlDatabase = null;
    boolean dbReady = false;
    boolean tableReady = false;

    private GAStore() {
    }

    private static GAStore getInstance() {
        return INSTANCE;
    }

    public static JSONArray executeQuerySync(final String sql) {
        return executeQuerySync(sql, new ArrayList());
    }

    public static JSONArray executeQuerySync(final String sql, ArrayList<String> parameters) {
        return executeQuerySync(sql, parameters, false);
    }

    public static JSONArray executeQuerySync(final String sql, ArrayList<String> parameters, boolean useTransaction) {
        Cursor cursor;
        Cursor cursorRawQuery;
        boolean z = GAUtilities.stringMatch(sql.toUpperCase(Locale.US), "^(UPDATE|INSERT|DELETE)") ? true : useTransaction;
        SQLiteDatabase database = getInstance().getDatabase();
        JSONArray jSONArray = new JSONArray();
        if (z) {
            try {
                database.execSQL("BEGIN;");
            } catch (Exception e) {
                GALogger.e("SQLITE3 BEGIN ERROR: ");
                e.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlBegin, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
                return null;
            }
        }
        try {
            if (!parameters.isEmpty()) {
                cursorRawQuery = database.rawQuery(sql, (String[]) parameters.toArray(new String[parameters.size()]));
            } else {
                cursorRawQuery = database.rawQuery(sql, null);
            }
            cursor = cursorRawQuery;
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        }
        try {
            int columnCount = cursor.getColumnCount();
            while (cursor.moveToNext()) {
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < columnCount; i++) {
                    String columnName = cursor.getColumnName(i);
                    if (columnName != null) {
                        try {
                            setColumn(cursor, ((SQLiteCursor) cursor).getWindow(), cursor.getPosition(), i, jSONObject, columnName);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlSetColumn, e3.toString(), GAState.getGameKey(), GAState.getSecretKey());
                        }
                    }
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception e4) {
            e = e4;
            GALogger.e("SQLITE3 PREPARE ERROR: ");
            e.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlRawQuery, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
            jSONArray = null;
        }
        try {
            cursor.close();
            if (z) {
                try {
                    database.execSQL("COMMIT");
                } catch (Exception e5) {
                    GALogger.e("SQLITE3 COMMIT ERROR: ");
                    e5.printStackTrace();
                    GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlCommit, e5.toString(), GAState.getGameKey(), GAState.getSecretKey());
                    return null;
                }
            }
            return jSONArray;
        } catch (Exception e6) {
            GALogger.d("SQLITE3 FINALIZE ERROR: ");
            e6.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlCommit, e6.toString(), GAState.getGameKey(), GAState.getSecretKey());
            if (!z) {
                return null;
            }
            try {
                database.execSQL("ROLLBACK");
                return null;
            } catch (Exception e7) {
                GALogger.e("SQLITE3 ROLLBACK ERROR: ");
                e7.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.SqlRollback, e7.toString(), GAState.getGameKey(), GAState.getSecretKey());
                return null;
            }
        }
    }

    private SQLiteDatabase getDatabase() {
        return this.sqlDatabase;
    }

    private static boolean trimEventTable() {
        if (getDbSizeBytes() <= MaxDbSizeBytesBeforeTrim) {
            return true;
        }
        JSONArray jSONArrayExecuteQuerySync = executeQuerySync("SELECT session_id, Max(client_ts) FROM ga_events GROUP BY session_id ORDER BY client_ts LIMIT 3");
        if (jSONArrayExecuteQuerySync == null || jSONArrayExecuteQuerySync.length() <= 0) {
            return false;
        }
        String str = "";
        for (int i = 0; i < jSONArrayExecuteQuerySync.length(); i++) {
            str = str + jSONArrayExecuteQuerySync.optString(i, "");
            if (i < jSONArrayExecuteQuerySync.length() - 1) {
                str = str + ",";
            }
        }
        GALogger.w("Database too large when initializing. Deleting the oldest 3 sessions.");
        executeQuerySync("DELETE FROM ga_events WHERE session_id IN (\"" + str + "\");");
        executeQuerySync("VACUUM");
        return true;
    }

    public static boolean isDbTooLargeForEvents() {
        return getDbSizeBytes() > MaxDbSizeBytes;
    }

    public static boolean ensureDatabase(boolean dropDatabase) {
        if (getInstance().dbPath.length() == 0) {
            getInstance().dbPath = GADevice.getWritableFilePath() + "/ga.sqlite3";
        }
        try {
            getInstance().sqlDatabase = SQLiteDatabase.openOrCreateDatabase(getInstance().dbPath, (SQLiteDatabase.CursorFactory) null);
            getInstance().dbReady = true;
            GALogger.i("Database opened: " + getInstance().dbPath);
            if (dropDatabase) {
                GALogger.d("Drop tables");
                executeQuerySync("DROP TABLE ga_events");
                executeQuerySync("DROP TABLE ga_state");
                executeQuerySync("DROP TABLE ga_session");
                executeQuerySync("DROP TABLE ga_progression");
                executeQuerySync("VACUUM");
            }
            if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_events(status CHAR(50) NOT NULL, category CHAR(50) NOT NULL, session_id CHAR(50) NOT NULL, client_ts CHAR(50) NOT NULL, event TEXT NOT NULL);") == null) {
                return false;
            }
            if (executeQuerySync("SELECT status FROM ga_events LIMIT 0,1") == null) {
                GALogger.d("ga_events corrupt, recreating.");
                executeQuerySync("DROP TABLE ga_events");
                if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_events(status CHAR(50) NOT NULL, category CHAR(50) NOT NULL, session_id CHAR(50) NOT NULL, client_ts CHAR(50) NOT NULL, event TEXT NOT NULL);") == null) {
                    GALogger.w("ga_events corrupt, could not recreate it.");
                    return false;
                }
            }
            if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_session(session_id CHAR(50) PRIMARY KEY NOT NULL, timestamp CHAR(50) NOT NULL, event TEXT NOT NULL);") == null) {
                return false;
            }
            if (executeQuerySync("SELECT session_id FROM ga_session LIMIT 0,1") == null) {
                GALogger.d("ga_session corrupt, recreating.");
                executeQuerySync("DROP TABLE ga_session");
                if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_session(session_id CHAR(50) PRIMARY KEY NOT NULL, timestamp CHAR(50) NOT NULL, event TEXT NOT NULL);") == null) {
                    GALogger.w("ga_session corrupt, could not recreate it.");
                    return false;
                }
            }
            if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_state(key CHAR(255) PRIMARY KEY NOT NULL, value TEXT);") == null) {
                return false;
            }
            if (executeQuerySync("SELECT key FROM ga_state LIMIT 0,1") == null) {
                GALogger.d("ga_state corrupt, recreating.");
                executeQuerySync("DROP TABLE ga_state");
                if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_state(key CHAR(255) PRIMARY KEY NOT NULL, value TEXT);") == null) {
                    GALogger.w("ga_state corrupt, could not recreate it.");
                    return false;
                }
            }
            if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_progression(progression CHAR(255) PRIMARY KEY NOT NULL, tries CHAR(255));") == null) {
                return false;
            }
            if (executeQuerySync("SELECT progression FROM ga_progression LIMIT 0,1") == null) {
                GALogger.d("ga_progression corrupt, recreating.");
                executeQuerySync("DROP TABLE ga_progression");
                if (executeQuerySync("CREATE TABLE IF NOT EXISTS ga_progression(progression CHAR(255) PRIMARY KEY NOT NULL, tries CHAR(255));") == null) {
                    GALogger.w("ga_progression corrupt, could not recreate it.");
                    return false;
                }
            }
            trimEventTable();
            getInstance().tableReady = true;
            GALogger.d("Database tables ensured present");
            return true;
        } catch (Exception e) {
            getInstance().dbReady = false;
            GALogger.w("Could not open database: " + getInstance().dbPath);
            e.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.Sql, EGASdkErrorAction.DatabaseOpenOrCreate, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
            return false;
        }
    }

    private static void setColumn(Cursor cursor, CursorWindow cursorWindow, int pos, int i, JSONObject row, String column) throws Exception {
        try {
            int type = cursorWindow.getType(pos, i);
            if (type == 1) {
                row.put(column, cursor.getInt(i));
            } else if (type == 2) {
                row.put(column, cursor.getDouble(i));
            } else {
                row.put(column, cursor.getString(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static boolean setState(final String key, final String value) {
        if (value == null || value.length() == 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(key);
            return executeQuerySync("DELETE FROM ga_state WHERE key = ?;", arrayList) != null;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(key);
        arrayList2.add(value);
        return executeQuerySync("INSERT OR REPLACE INTO ga_state (key, value) VALUES(?, ?);", arrayList2, true) != null;
    }

    public static long getDbSizeBytes() {
        return new File(getInstance().sqlDatabase.getPath()).length();
    }

    public static boolean getTableReady() {
        return getInstance().tableReady;
    }
}
