package com.gameanalytics.sdk.state;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.aheaditec.talsec.security.T0;
import com.gameanalytics.sdk.Consts;
import com.gameanalytics.sdk.GAErrorSeverity;
import com.gameanalytics.sdk.GAPlatform;
import com.gameanalytics.sdk.IRemoteConfigsListener;
import com.gameanalytics.sdk.device.GADevice;
import com.gameanalytics.sdk.events.EGASdkErrorAction;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.events.GAEvents;
import com.gameanalytics.sdk.http.EGAHTTPApiResponse;
import com.gameanalytics.sdk.http.GAHTTPApi;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.store.GAStore;
import com.gameanalytics.sdk.threading.GAThreading;
import com.gameanalytics.sdk.threading.IBlock;
import com.gameanalytics.sdk.utilities.GAUtilities;
import com.gameanalytics.sdk.validators.GAValidator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GAState {
    private static final String CATEGORY_SDK_ERROR = "sdk_error";
    private static final int MAX_CUSTOM_FIELDS_COUNT = 50;
    private static final int MAX_CUSTOM_FIELDS_KEY_LENGTH = 64;
    private static final int MAX_CUSTOM_FIELDS_VALUE_STRING_LENGTH = 256;
    private static final int MAX_ERROR_COUNT = 10;
    public static final int fpsTableLength = 121;
    public static final int maxFpsValue = 120;
    private static boolean useManualSessionHandling;
    private long clientServerTimeOffset;
    private boolean initAuthorized;
    private boolean isInitialized;
    private boolean newInstall;
    private boolean remoteConfigsIsReady;
    private int sessionNum;
    private long sessionStart;
    private int transactionNum;
    private boolean useRandomId;
    private ValueAnimator v_animator;
    private static final GAState INSTANCE = new GAState();
    private static final HashMap<String, Integer> countMap = new HashMap<>();
    private static final HashMap<String, Date> timestampMap = new HashMap<>();
    static int countEndSession = 0;
    private JSONObject sdkConfig = null;
    private JSONObject sdkConfigCached = null;
    private final JSONObject sdkConfigDefault = new JSONObject();
    private JSONObject configurations = new JSONObject();
    private final ArrayList<IRemoteConfigsListener> remoteConfigsListeners = new ArrayList<>();
    private String[] availableCustomDimensions01 = new String[0];
    private String[] availableCustomDimensions02 = new String[0];
    private String[] availableCustomDimensions03 = new String[0];
    private String currentCustomDimension01 = "";
    private String currentCustomDimension02 = "";
    private String currentCustomDimension03 = "";
    private final Map<String, Object> currentGlobalCustomEventFields = new HashMap();
    private boolean doSendEvents = true;
    private String[] availableResourceCurrencies = new String[0];
    private String[] availableResourceItemTypes = new String[0];
    private String build = "";
    private String sessionId = "";
    private final HashMap<String, Integer> progressionTries = new HashMap<>();
    private String userId = "";
    private String externalUserId = "";
    private boolean enableErrorReporting = true;
    private boolean enableEventSubmision = true;
    private String configsHash = "";
    private String abId = "";
    private String abVariantId = "";
    private boolean autoDetectAppVersion = false;
    private boolean inForeground = true;
    private boolean healthEventErrorFlag = false;
    private String gameKey = "";
    private String secretKey = "";
    long lastTimestamp = 0;
    long lastFpsLogTimestamp = 0;
    long lastMemSampleTimestamp = 0;
    boolean isFirstTimeRunning = true;
    private int sumFpsLastFrame = 0;
    private int samplesFpsLastFrame = 0;
    private final long fpsSampleFrequency = 1000;
    private final long memSampleFrequency = T0.t;
    private long[] fpsTable = new long[fpsTableLength];
    private boolean wasFpsTrackingStarted = false;
    private AtomicBoolean doSampleFps = new AtomicBoolean(false);
    private AtomicBoolean doSampleMemory = new AtomicBoolean(false);

    private GAState() {
        logFPS();
    }

    public static void enableFpsSampling(boolean value) {
        GADevice.DeviceInfo.enableFPSTracking = value;
        INSTANCE.doSampleFps.set(value);
    }

    public static void enableMemorySampling(boolean value) {
        GADevice.DeviceInfo.enableMemoryHistograms = value;
        INSTANCE.doSampleMemory.set(value);
        if (value) {
            GADevice.DeviceInfo.enableMemoryTracking = true;
        }
    }

    public static void stopAnimator() {
        try {
            ValueAnimator valueAnimator = INSTANCE.v_animator;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void startAnimator() {
        try {
            ValueAnimator valueAnimator = INSTANCE.v_animator;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void logFPS() {
        try {
            this.lastTimestamp = System.currentTimeMillis();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.v_animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatCount(-1);
            this.v_animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.gameanalytics.sdk.state.GAState$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.m269lambda$logFPS$0$comgameanalyticssdkstateGAState(valueAnimator);
                }
            });
            this.v_animator.start();
            this.wasFpsTrackingStarted = true;
        } catch (RuntimeException e) {
            this.healthEventErrorFlag = true;
            GALogger.e("Failed to log FPS (please ensure you are running on the main thread):" + e.getMessage());
        } catch (Throwable th) {
            this.healthEventErrorFlag = true;
            GALogger.e("Failed to log FPS with reason:" + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: lambda$logFPS$0$com-gameanalytics-sdk-state-GAState, reason: not valid java name */
    /* synthetic */ void m269lambda$logFPS$0$comgameanalyticssdkstateGAState(ValueAnimator valueAnimator) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.isFirstTimeRunning) {
                for (int i = 0; i < 121; i++) {
                    this.fpsTable[i] = 0;
                }
                this.lastTimestamp = jCurrentTimeMillis;
                this.isFirstTimeRunning = false;
                return;
            }
            long jMax = Math.max(jCurrentTimeMillis - this.lastTimestamp, 1L);
            if (this.inForeground) {
                int iMax = (int) Math.max(Math.min(Math.round(1000.0d / jMax), 120L), 0L);
                if (jCurrentTimeMillis - this.lastFpsLogTimestamp >= 1000) {
                    this.lastFpsLogTimestamp = jCurrentTimeMillis;
                    int iMax2 = Math.max(this.sumFpsLastFrame, 1) / Math.max(this.samplesFpsLastFrame, 1);
                    this.samplesFpsLastFrame = 0;
                    this.sumFpsLastFrame = 0;
                    long[] jArr = this.fpsTable;
                    jArr[iMax2] = jArr[iMax2] + 1;
                }
                this.sumFpsLastFrame += iMax;
                this.samplesFpsLastFrame++;
                if (this.doSampleMemory.get() && jCurrentTimeMillis - this.lastMemSampleTimestamp >= T0.t) {
                    this.lastMemSampleTimestamp = jCurrentTimeMillis;
                    GADevice.DeviceInfo.SampleMemoryUsage();
                }
            }
            this.lastTimestamp = jCurrentTimeMillis;
        } catch (Exception e) {
            GALogger.e("Failed to sample health metrics: " + e.getMessage());
        } catch (Throwable th) {
            GALogger.e("Failed to sample health metrics: " + th.getMessage());
        }
    }

    private static GAState getInstance() {
        return INSTANCE;
    }

    private static void ensurePersistedStates() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayExecuteQuerySync = GAStore.executeQuerySync("SELECT * FROM ga_state;");
        if (jSONArrayExecuteQuerySync != null && jSONArrayExecuteQuerySync.length() != 0) {
            for (int i = 0; i < jSONArrayExecuteQuerySync.length(); i++) {
                JSONObject jSONObject2 = jSONArrayExecuteQuerySync.getJSONObject(i);
                jSONObject.put(jSONObject2.getString("key"), jSONObject2.get("value"));
            }
        }
        GAState gAState = getInstance();
        gAState.sessionNum = jSONObject.optInt("session_num", 0);
        SharedPreferences sharedPreferences = GAPlatform.getApplicationContext().getSharedPreferences(Consts.GA_SHARED_PREFERENCES_NAME, 0);
        if (sharedPreferences != null) {
            if (gAState.sessionNum == 0) {
                gAState.sessionNum = sharedPreferences.getInt(Consts.GA_SESSION_NUM_KEY, 0);
            }
            gAState.abId = sharedPreferences.getString(Consts.GA_AB_ID_KEY, gAState.abId);
            gAState.abVariantId = sharedPreferences.getString(Consts.GA_AB_VARIANT_ID_KEY, gAState.abVariantId);
        }
        gAState.transactionNum = jSONObject.optInt("transaction_num", 0);
        if (!jSONObject.has("new_install")) {
            if (GAStore.setState("new_install", Boolean.toString(false))) {
                gAState.newInstall = true;
                GALogger.d("new_install not found in DB initializing value to 'true'");
            } else {
                GALogger.d("Failed to set value for key='new_install' in DB");
            }
        } else {
            boolean zOptBoolean = jSONObject.optBoolean("new_install", false);
            gAState.newInstall = zOptBoolean;
            if (zOptBoolean) {
                GALogger.d("new_install found in DB: " + gAState.newInstall);
            }
        }
        if (jSONObject.has("use_random_id")) {
            gAState.useRandomId = jSONObject.optBoolean("use_random_id", false);
        }
        if (gAState.newInstall) {
            if (GAStore.setState("use_random_id", Boolean.toString(true))) {
                gAState.useRandomId = true;
                GALogger.d("use_random_id not found in DB initializing value to 'true'");
            } else {
                GALogger.d("Failed to set value for key='use_random_id' in DB");
            }
        }
        if (gAState.useRandomId) {
            GALogger.d("Using random generated id as user_id");
        }
        if (!TextUtils.isEmpty(gAState.currentCustomDimension01)) {
            GAStore.setState("dimension01", gAState.currentCustomDimension01);
        } else {
            String strOptString = jSONObject.optString("dimension01", "");
            gAState.currentCustomDimension01 = strOptString;
            if (strOptString.length() != 0) {
                GALogger.d("Dimension01 found in cache: " + gAState.currentCustomDimension01);
            }
        }
        if (!TextUtils.isEmpty(gAState.currentCustomDimension02)) {
            GAStore.setState("dimension02", gAState.currentCustomDimension02);
        } else {
            String strOptString2 = jSONObject.optString("dimension02", "");
            gAState.currentCustomDimension02 = strOptString2;
            if (strOptString2.length() != 0) {
                GALogger.d("Dimension02 found cache: " + gAState.currentCustomDimension02);
            }
        }
        if (!TextUtils.isEmpty(gAState.currentCustomDimension03)) {
            GAStore.setState("dimension03", gAState.currentCustomDimension03);
        } else {
            String strOptString3 = jSONObject.optString("dimension03", "");
            gAState.currentCustomDimension03 = strOptString3;
            if (strOptString3.length() != 0) {
                GALogger.d("Dimension03 found in cache: " + gAState.currentCustomDimension03);
            }
        }
        String strOptString4 = jSONObject.optString("sdk_config_cached", "");
        if (strOptString4.length() != 0) {
            JSONObject jSONObjectDictionary = GAUtilities.dictionary(strOptString4);
            if (jSONObjectDictionary.length() != 0) {
                if (!getLastUsedIdentifier().equals(getIdentifier())) {
                    GALogger.w("New identifier spotted compared to last one used, clearing cached configs hash!!");
                    jSONObjectDictionary.remove("configs_hash");
                }
                gAState.sdkConfigCached = jSONObjectDictionary;
            }
        }
        getInstance().configsHash = getSdkConfig().optString("configs_hash", "");
        getInstance().abId = getSdkConfig().optString("ab_id", gAState.abId);
        getInstance().abVariantId = getSdkConfig().optString("ab_variant_id", gAState.abVariantId);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!TextUtils.isEmpty(gAState.abId)) {
                editorEdit.putString(Consts.GA_AB_ID_KEY, gAState.abId);
            }
            if (!TextUtils.isEmpty(gAState.abVariantId)) {
                editorEdit.putString(Consts.GA_AB_VARIANT_ID_KEY, gAState.abVariantId);
            }
            editorEdit.apply();
        }
        JSONArray jSONArrayExecuteQuerySync2 = GAStore.executeQuerySync("SELECT * FROM ga_progression;");
        if (jSONArrayExecuteQuerySync2 == null || jSONArrayExecuteQuerySync2.length() == 0) {
            return;
        }
        for (int i2 = 0; i2 < jSONArrayExecuteQuerySync2.length(); i2++) {
            JSONObject jSONObject3 = jSONArrayExecuteQuerySync2.getJSONObject(i2);
            gAState.progressionTries.put(jSONObject3.getString("progression"), Integer.valueOf(jSONObject3.getInt("tries")));
        }
    }

    public static void setInForeground(boolean value) {
        getInstance().inForeground = value;
    }

    public static boolean isInForeground() {
        return getInstance().inForeground;
    }

    public static void setInitialized(boolean isInitialized) {
        getInstance().isInitialized = isInitialized;
    }

    public static void setEnableErrorReporting(boolean flag) {
        GALogger.d("setEnableErrorReporting: " + flag);
        getInstance().enableErrorReporting = flag;
    }

    public static void setEnableEventSubmission(boolean flag, boolean doCacheEventsLocally) {
        getInstance().doSendEvents = flag;
        if (flag) {
            getInstance().enableEventSubmision = true;
        } else {
            getInstance().enableEventSubmision = doCacheEventsLocally;
        }
    }

    public static void setAutoDetectAppVersion(boolean flag) {
        getInstance().autoDetectAppVersion = flag;
        if (flag) {
            GALogger.i("Enabled auto detect app version for build field");
        } else {
            GALogger.i("Disabled auto detect app version for build field");
        }
    }

    public static boolean useErrorReporting() {
        return getInstance().enableErrorReporting;
    }

    public static boolean isEventSubmissionEnabled() {
        return getInstance().enableEventSubmision;
    }

    public static boolean doSendEvents() {
        return getInstance().doSendEvents;
    }

    public static boolean isAutoDetectAppVersionEnabled() {
        return getInstance().autoDetectAppVersion;
    }

    public static void setNewInstall(boolean newInstall) {
        getInstance().newInstall = newInstall;
    }

    public static void setKeys(final String gameKey, final String gameSecret) {
        getInstance().gameKey = gameKey;
        getInstance().secretKey = gameSecret;
    }

    public static void setBuild(final String build) {
        getInstance().build = build;
        GALogger.i("Set build version: " + build);
    }

    public static void setExternalUserId(final String userId) {
        getInstance().externalUserId = userId;
    }

    public static String getExternalUserId() {
        return getInstance().externalUserId;
    }

    public static void incrementSessionNum() {
        getInstance().sessionNum = getSessionNum() + 1;
    }

    public static void incrementTransactionNum() {
        getInstance().transactionNum = getTransactionNum() + 1;
    }

    public static void incrementProgressionTries(final String progression) {
        int progressionTries = getProgressionTries(progression) + 1;
        getInstance().progressionTries.put(progression, Integer.valueOf(progressionTries));
        ArrayList arrayList = new ArrayList();
        arrayList.add(progression);
        arrayList.add(progressionTries + "");
        GAStore.executeQuerySync("INSERT OR REPLACE INTO ga_progression (progression, tries) VALUES(?, ?);", arrayList);
    }

    public static void clearProgressionTries(final String progression) {
        HashMap<String, Integer> map = getInstance().progressionTries;
        if (map.containsKey(progression)) {
            map.remove(progression);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(progression);
        GAStore.executeQuerySync("DELETE FROM ga_progression WHERE progression = ?;", arrayList);
    }

    public static void setAvailableCustomDimensions01(String... availableCustomDimensions) {
        if (GAValidator.validateCustomDimensions(availableCustomDimensions)) {
            getInstance().availableCustomDimensions01 = availableCustomDimensions;
            validateAndFixCurrentDimensions();
            GALogger.i("Set available custom01 dimension values: (" + GAUtilities.joinStringArray(availableCustomDimensions, ", ") + ")");
        }
    }

    public static void setAvailableCustomDimensions02(String... availableCustomDimensions) {
        if (GAValidator.validateCustomDimensions(availableCustomDimensions)) {
            getInstance().availableCustomDimensions02 = availableCustomDimensions;
            validateAndFixCurrentDimensions();
            GALogger.i("Set available custom02 dimension values: (" + GAUtilities.joinStringArray(availableCustomDimensions, ", ") + ")");
        }
    }

    public static void setAvailableCustomDimensions03(String... availableCustomDimensions) {
        if (GAValidator.validateCustomDimensions(availableCustomDimensions)) {
            getInstance().availableCustomDimensions03 = availableCustomDimensions;
            validateAndFixCurrentDimensions();
            GALogger.i("Set available custom03 dimension values: (" + GAUtilities.joinStringArray(availableCustomDimensions, ", ") + ")");
        }
    }

    public static void setAvailableResourceCurrencies(String... availableResourceCurrencies) {
        if (GAValidator.validateResourceCurrencies(availableResourceCurrencies)) {
            getInstance().availableResourceCurrencies = availableResourceCurrencies;
            GALogger.i("Set available resource currencies: (" + GAUtilities.joinStringArray(availableResourceCurrencies, ", ") + ")");
        }
    }

    public static void setAvailableResourceItemTypes(String... availableResourceItemTypes) {
        if (GAValidator.validateResourceItemTypes(availableResourceItemTypes)) {
            getInstance().availableResourceItemTypes = availableResourceItemTypes;
            GALogger.i("Set available resource item types: (" + GAUtilities.joinStringArray(availableResourceItemTypes, ", ") + ")");
        }
    }

    public static void setCustomDimension01(final String dimension) {
        getInstance().currentCustomDimension01 = dimension;
        if (GAStore.getTableReady()) {
            GAStore.setState("dimension01", dimension);
        }
        GALogger.i("Set custom01 dimension value: " + dimension);
    }

    public static void setCustomDimension02(final String dimension) {
        getInstance().currentCustomDimension02 = dimension;
        if (GAStore.getTableReady()) {
            GAStore.setState("dimension02", dimension);
        }
        GALogger.i("Set custom02 dimension value: " + dimension);
    }

    public static void setCustomDimension03(final String dimension) {
        getInstance().currentCustomDimension03 = dimension;
        if (GAStore.getTableReady()) {
            GAStore.setState("dimension03", dimension);
        }
        GALogger.i("Set custom03 dimension value: " + dimension);
    }

    public static void setGlobalCustomEventFields(final Map<String, Object> customFields) {
        if (customFields == null || customFields.isEmpty()) {
            getInstance().currentGlobalCustomEventFields.clear();
            return;
        }
        getInstance().currentGlobalCustomEventFields.clear();
        getInstance().currentGlobalCustomEventFields.putAll(customFields);
        GALogger.i("Set global custom event fields: " + new JSONObject(customFields));
    }

    public static JSONObject validateAndCleanCustomFields(final Map<String, Object> fields) {
        JSONObject jSONObject = new JSONObject();
        if (fields != null) {
            int i = 0;
            for (Map.Entry<String, Object> entry : fields.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    String str = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its key or value is null", entry.getKey(), entry.getValue());
                    GALogger.w(str);
                    addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its key or value is null", GAErrorSeverity.Warning, str);
                } else if (i < MAX_CUSTOM_FIELDS_COUNT) {
                    if (GAUtilities.stringMatch(entry.getKey(), "^[a-zA-Z0-9_]{1,64}$")) {
                        if (entry.getValue() instanceof Character) {
                            String string = entry.getValue().toString();
                            if (string.length() <= MAX_CUSTOM_FIELDS_VALUE_STRING_LENGTH && string.length() > 0) {
                                try {
                                    jSONObject.put(entry.getKey(), string);
                                    i++;
                                } catch (JSONException unused) {
                                    String str2 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", entry.getKey(), entry.getValue().toString());
                                    GALogger.w(str2);
                                    addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", GAErrorSeverity.Warning, str2);
                                }
                            } else {
                                String str3 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is an empty string or exceeds the max number of characters (256)", entry.getKey(), entry.getValue().toString());
                                GALogger.w(str3);
                                addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is an empty string or exceeds the max number of characters (256)", GAErrorSeverity.Warning, str3);
                            }
                        } else if (entry.getValue() instanceof String) {
                            String str4 = (String) entry.getValue();
                            if (str4.length() <= MAX_CUSTOM_FIELDS_VALUE_STRING_LENGTH && str4.length() > 0) {
                                try {
                                    jSONObject.put(entry.getKey(), str4);
                                    i++;
                                } catch (JSONException unused2) {
                                    String str5 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", entry.getKey(), entry.getValue().toString());
                                    GALogger.w(str5);
                                    addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", GAErrorSeverity.Warning, str5);
                                }
                            } else {
                                String str6 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is an empty string or exceeds the max number of characters (256)", entry.getKey(), entry.getValue().toString());
                                GALogger.w(str6);
                                addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is an empty string or exceeds the max number of characters (256)", GAErrorSeverity.Warning, str6);
                            }
                        } else if (entry.getValue() instanceof Number) {
                            try {
                                jSONObject.put(entry.getKey(), (Number) entry.getValue());
                                i++;
                            } catch (JSONException unused3) {
                                String str7 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", entry.getKey(), entry.getValue().toString());
                                GALogger.w(str7);
                                addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s could not be added as JSON", GAErrorSeverity.Warning, str7);
                            }
                        } else {
                            String str8 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is not a string or number", entry.getKey(), entry.getValue().toString());
                            GALogger.w(str8);
                            addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its value is not a string or number", GAErrorSeverity.Warning, str8);
                        }
                    } else {
                        String str9 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its key contains illegal character, is empty or exceeds the max number of characters (64)", entry.getKey(), entry.getValue().toString());
                        GALogger.w(str9);
                        addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because its key contains illegal character, is empty or exceeds the max number of characters (64)", GAErrorSeverity.Warning, str9);
                    }
                } else {
                    String str10 = String.format("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because it exceeds the max number of custom fields (50)", entry.getKey(), entry.getValue().toString());
                    GALogger.w(str10);
                    addErrorEvent("validateAndCleanCustomFields: entry with key=%s, value=%s has been omitted because it exceeds the max number of custom fields (50)", GAErrorSeverity.Warning, str10);
                }
            }
        }
        return jSONObject;
    }

    public static void setManualSessionHandling(final boolean flag) {
        useManualSessionHandling = flag;
        GALogger.i("Use manual session handling: " + flag);
    }

    public static boolean useManualSessionHandling() {
        return useManualSessionHandling;
    }

    private static void validateAndFixCurrentDimensions() {
        if (!GAValidator.validateDimension01(getInstance().currentCustomDimension01)) {
            GALogger.d("Invalid dimension01 found in variable. Setting to nil. Invalid dimension: " + getInstance().currentCustomDimension01);
            setCustomDimension01("");
        }
        if (!GAValidator.validateDimension02(getInstance().currentCustomDimension02)) {
            GALogger.d("Invalid dimension02 found in variable. Setting to nil. Invalid dimension: " + getInstance().currentCustomDimension02);
            setCustomDimension02("");
        }
        if (GAValidator.validateDimension03(getInstance().currentCustomDimension03)) {
            return;
        }
        GALogger.d("Invalid dimension03 found in variable. Setting to nil. Invalid dimension: " + getInstance().currentCustomDimension03);
        setCustomDimension03("");
    }

    public static void setUserId(final String uId) {
        GAState gAState = getInstance();
        if (uId == null) {
            uId = "";
        }
        gAState.userId = uId;
        GALogger.i("Set user id: " + getInstance().userId);
    }

    public static boolean isEnabled() {
        return getInstance().initAuthorized;
    }

    private static void startNewSession() {
        if (isEventSubmissionEnabled()) {
            GALogger.i("Starting a new session.");
        }
        validateAndFixCurrentDimensions();
        if (isAutoDetectAppVersionEnabled()) {
            String appVersion = GADevice.getAppVersion();
            if (GAValidator.validateAppVersion(appVersion)) {
                setBuild(appVersion);
                GALogger.i("Auto detecting app version and setting build field to: " + appVersion);
            }
        }
        GADevice.reloadAdId();
        GAHTTPApi.GAHTTPApiResponseJSONObjectPair gAHTTPApiResponseJSONObjectPairRequestInitReturningDict = GAHTTPApi.getInstance().requestInitReturningDict(getInstance().configsHash);
        EGAHTTPApiResponse eGAHTTPApiResponse = gAHTTPApiResponseJSONObjectPairRequestInitReturningDict.response;
        JSONObject jSONObject = gAHTTPApiResponseJSONObjectPairRequestInitReturningDict.json;
        int i = 0;
        if ((eGAHTTPApiResponse == EGAHTTPApiResponse.Ok || eGAHTTPApiResponse == EGAHTTPApiResponse.Created) && jSONObject != null) {
            try {
                jSONObject.put("time_offset", ((double) jSONObject.optLong("server_ts", -1L)) > 0.0d ? calculateServerTimeOffset(jSONObject.optLong("server_ts", -1L)) : 0L);
            } catch (JSONException e) {
                GALogger.e("startNewSession: error creating json");
                e.printStackTrace();
            }
            if (eGAHTTPApiResponse != EGAHTTPApiResponse.Created) {
                try {
                    if (getSdkConfig().has("configs")) {
                        jSONObject.put("configs", getSdkConfig().optJSONArray("configs"));
                    }
                    if (getSdkConfig().has("configs_hash")) {
                        jSONObject.put("configs_hash", getSdkConfig().optString("configs_hash", ""));
                    }
                    if (getSdkConfig().has("ab_id")) {
                        jSONObject.put("ab_id", getSdkConfig().optString("ab_id", ""));
                    }
                    if (getSdkConfig().has("ab_variant_id")) {
                        jSONObject.put("ab_variant_id", getSdkConfig().optString("ab_variant_id", ""));
                    }
                } catch (JSONException e2) {
                    GALogger.e("startNewSession: error creating json");
                    e2.printStackTrace();
                }
            }
            getInstance().configsHash = jSONObject.optString("configs_hash", "");
            getInstance().abId = jSONObject.optString("ab_id", "");
            getInstance().abVariantId = jSONObject.optString("ab_variant_id", "");
            GAStore.setState("sdk_config_cached", jSONObject.toString());
            getInstance().sdkConfigCached = jSONObject;
            getInstance().sdkConfig = jSONObject;
            getInstance().initAuthorized = true;
        } else if (eGAHTTPApiResponse == EGAHTTPApiResponse.Unauthorized) {
            GALogger.w("Initialize SDK failed - Unauthorized");
            getInstance().initAuthorized = false;
        } else {
            if (eGAHTTPApiResponse == EGAHTTPApiResponse.NoResponse || eGAHTTPApiResponse == EGAHTTPApiResponse.RequestTimeout) {
                GALogger.i("Init call (session start) failed - no response. Could be offline or timeout.");
            } else if (eGAHTTPApiResponse == EGAHTTPApiResponse.BadResponse || eGAHTTPApiResponse == EGAHTTPApiResponse.JsonEncodeFailed || eGAHTTPApiResponse == EGAHTTPApiResponse.JsonDecodeFailed) {
                GALogger.i("Init call (session start) failed - bad response. Could be bad response from proxy or GA servers.");
            } else if (eGAHTTPApiResponse == EGAHTTPApiResponse.BadRequest || eGAHTTPApiResponse == EGAHTTPApiResponse.UnknownResponseCode) {
                GALogger.i("Init call (session start) failed - bad request or unknown response.");
            }
            if (getInstance().sdkConfig == null) {
                if (getInstance().sdkConfigCached != null) {
                    GALogger.i("Init call (session start) failed - using cached init values.");
                    getInstance().sdkConfig = getInstance().sdkConfigCached;
                } else {
                    GALogger.i("Init call (session start) failed - using default init values.");
                    getInstance().sdkConfig = getInstance().sdkConfigDefault;
                }
            } else {
                GALogger.i("Init call (session start) failed - using cached init values.");
            }
            getInstance().initAuthorized = true;
        }
        getInstance().clientServerTimeOffset = getSdkConfig().optLong("time_offset", 0L);
        populateConfigurations(getSdkConfig());
        if (!isEnabled()) {
            GALogger.w("Could not start session: SDK is disabled.");
            GAEvents.stopEventQueue();
            return;
        }
        GAEvents.ensureEventQueueIsRunning();
        getInstance().sessionId = UUID.randomUUID().toString().toLowerCase(Locale.US);
        getInstance().sessionStart = getClientTsAdjusted();
        while (true) {
            getInstance();
            if (i < 120) {
                getInstance().fpsTable[i] = 0;
                i++;
            } else {
                getInstance().updateLastUsedSDKVersion();
                GAEvents.addSessionStartEvent();
                return;
            }
        }
    }

    private void updateLastUsedSDKVersion() {
        SharedPreferences sharedPreferences = GAPlatform.getApplicationContext().getSharedPreferences(Consts.GA_SHARED_PREFERENCES_NAME, 0);
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(Consts.GA_SDK_VERSION_KEY, "");
            String relevantSdkVersion = GADevice.getRelevantSdkVersion();
            if (TextUtils.isEmpty(relevantSdkVersion)) {
                return;
            }
            if (TextUtils.isEmpty(string) || !relevantSdkVersion.equals(string)) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(Consts.GA_SDK_VERSION_KEY, GADevice.getRelevantSdkVersion());
                editorEdit.apply();
            }
        }
    }

    private static long calculateServerTimeOffset(long serverTs) {
        return serverTs - GAUtilities.timeIntervalSince1970();
    }

    public static boolean sessionIsStarted() {
        return ((double) getInstance().sessionStart) != 0.0d;
    }

    public static void resumeSessionAndStartQueue() {
        if (isInitialized() && !sessionIsStarted()) {
            GALogger.i("Resuming session.");
            GAThreading.start();
            startNewSession();
        }
    }

    public static void endSessionAndStopQueue() {
        if (isInitialized()) {
            countEndSession++;
            GALogger.i("End session: " + countEndSession);
            if (isEnabled() && sessionIsStarted()) {
                GALogger.i("Ending session.");
                GAEvents.stopEventQueue();
                GAEvents.addHealthEvent(getInstance().fpsTable, getInstance().healthEventErrorFlag);
                GAEvents.addSessionEndEvent();
                getInstance().sessionStart = 0L;
                GAThreading.stop();
            }
        }
    }

    public static long getSessionStart() {
        return getInstance().sessionStart;
    }

    public static String getRemoteConfigsStringValue(String key, String defaultValue) {
        return getInstance().configurations.optString(key, defaultValue);
    }

    public static boolean isRemoteConfigsReady() {
        return getInstance().remoteConfigsIsReady;
    }

    public static void addRemoteConfigsListener(IRemoteConfigsListener listener) {
        if (getInstance().remoteConfigsListeners.contains(listener)) {
            return;
        }
        getInstance().remoteConfigsListeners.add(listener);
    }

    public static void removeRemoteConfigsListener(IRemoteConfigsListener listener) {
        if (getInstance().remoteConfigsListeners.contains(listener)) {
            getInstance().remoteConfigsListeners.remove(listener);
        }
    }

    public static String getSessionId() {
        return getInstance().sessionId;
    }

    private static String getConfigsHash() {
        return getInstance().configsHash;
    }

    public static String getUserId() {
        return getInstance().userId;
    }

    public static boolean isNewInstall() {
        return getInstance().newInstall;
    }

    public static boolean isInitialized() {
        return getInstance().isInitialized;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00af A[Catch: all -> 0x00bb, LOOP:1: B:23:0x00a9->B:25:0x00af, LOOP_END, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000f, B:7:0x001b, B:9:0x0021, B:11:0x0027, B:18:0x0055, B:20:0x0079, B:21:0x0095, B:22:0x0098, B:23:0x00a9, B:25:0x00af, B:26:0x00b9), top: B:33:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void populateConfigurations(org.json.JSONObject r11) {
        /*
            com.gameanalytics.sdk.state.GAState r0 = getInstance()
            org.json.JSONObject r0 = r0.configurations
            monitor-enter(r0)
            java.lang.String r1 = "configs"
            org.json.JSONArray r11 = r11.optJSONArray(r1)     // Catch: java.lang.Throwable -> Lbb
            if (r11 == 0) goto L98
            com.gameanalytics.sdk.state.GAState r1 = getInstance()     // Catch: java.lang.Throwable -> Lbb
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lbb
            r2.<init>()     // Catch: java.lang.Throwable -> Lbb
            r1.configurations = r2     // Catch: java.lang.Throwable -> Lbb
            r1 = 0
        L1b:
            int r2 = r11.length()     // Catch: java.lang.Throwable -> Lbb
            if (r1 >= r2) goto L98
            org.json.JSONObject r2 = r11.optJSONObject(r1)     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto L95
            java.lang.String r3 = "key"
            java.lang.String r3 = r2.optString(r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = "value"
            java.lang.Object r4 = r2.opt(r4)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r5 = "start_ts"
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            long r5 = r2.optLong(r5, r6)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r7 = "end_ts"
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r7 = r2.optLong(r7, r8)     // Catch: java.lang.Throwable -> Lbb
            long r9 = getClientTsAdjusted()     // Catch: java.lang.Throwable -> Lbb
            if (r3 == 0) goto L95
            if (r4 == 0) goto L95
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 <= 0) goto L95
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 >= 0) goto L95
            com.gameanalytics.sdk.state.GAState r5 = getInstance()     // Catch: org.json.JSONException -> L79 java.lang.Throwable -> Lbb
            org.json.JSONObject r5 = r5.configurations     // Catch: org.json.JSONException -> L79 java.lang.Throwable -> Lbb
            r5.put(r3, r4)     // Catch: org.json.JSONException -> L79 java.lang.Throwable -> Lbb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L79 java.lang.Throwable -> Lbb
            r4.<init>()     // Catch: org.json.JSONException -> L79 java.lang.Throwable -> Lbb
            java.lang.String r5 = "configuration added: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: org.json.JSONException -> L79 java.lang.Throwable -> Lbb
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L79 java.lang.Throwable -> Lbb
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch: org.json.JSONException -> L79 java.lang.Throwable -> Lbb
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L79 java.lang.Throwable -> Lbb
            com.gameanalytics.sdk.logging.GALogger.d(r2)     // Catch: org.json.JSONException -> L79 java.lang.Throwable -> Lbb
            goto L95
        L79:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r2.<init>()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = "populateConfigurations failed - unable to add configuration '"
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r3 = "'."
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lbb
            com.gameanalytics.sdk.logging.GALogger.w(r2)     // Catch: java.lang.Throwable -> Lbb
        L95:
            int r1 = r1 + 1
            goto L1b
        L98:
            com.gameanalytics.sdk.state.GAState r11 = getInstance()     // Catch: java.lang.Throwable -> Lbb
            r1 = 1
            r11.remoteConfigsIsReady = r1     // Catch: java.lang.Throwable -> Lbb
            com.gameanalytics.sdk.state.GAState r11 = getInstance()     // Catch: java.lang.Throwable -> Lbb
            java.util.ArrayList<com.gameanalytics.sdk.IRemoteConfigsListener> r11 = r11.remoteConfigsListeners     // Catch: java.lang.Throwable -> Lbb
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Lbb
        La9:
            boolean r1 = r11.hasNext()     // Catch: java.lang.Throwable -> Lbb
            if (r1 == 0) goto Lb9
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> Lbb
            com.gameanalytics.sdk.IRemoteConfigsListener r1 = (com.gameanalytics.sdk.IRemoteConfigsListener) r1     // Catch: java.lang.Throwable -> Lbb
            r1.onRemoteConfigsUpdated()     // Catch: java.lang.Throwable -> Lbb
            goto La9
        Lb9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbb
            return
        Lbb:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbb
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gameanalytics.sdk.state.GAState.populateConfigurations(org.json.JSONObject):void");
    }

    public static String getRemoteConfigsContentAsString() {
        try {
            return getInstance().configurations.toString(4);
        } catch (JSONException unused) {
            return getInstance().configurations.toString();
        }
    }

    public static JSONObject getRemoteConfigsContentAsJson() {
        try {
            return new JSONObject(getInstance().configurations.toString());
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String getABTestingId() {
        return getInstance().abId;
    }

    public static String getABTestingVariantId() {
        return getInstance().abVariantId;
    }

    private static JSONObject getSdkConfig() {
        if (getInstance().sdkConfig != null) {
            return getInstance().sdkConfig;
        }
        if (getInstance().sdkConfigCached != null) {
            return getInstance().sdkConfigCached;
        }
        return getInstance().sdkConfigDefault;
    }

    private static String getBuild() {
        return getInstance().build;
    }

    public static String getSecretKey() {
        return getInstance().secretKey;
    }

    public static String getGameKey() {
        return getInstance().gameKey;
    }

    public static long getClientTsAdjusted() {
        long jTimeIntervalSince1970 = GAUtilities.timeIntervalSince1970();
        long j = getInstance().clientServerTimeOffset + jTimeIntervalSince1970;
        return GAValidator.validateClientTs(j) ? j : jTimeIntervalSince1970;
    }

    public static JSONObject getEventAnnotations() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", 2);
        jSONObject.put("user_id", getIdentifier());
        jSONObject.put("event_uuid", UUID.randomUUID().toString().toLowerCase(Locale.US));
        if (!TextUtils.isEmpty(GADevice.getGAID()) && !GAUtilities.isZeroId(GADevice.getGAID()) && !GADevice.getIsLimitedAdTracking()) {
            jSONObject.put("google_aid", GADevice.getGAID());
            if (!TextUtils.isEmpty(GADevice.getAdIdSource())) {
                jSONObject.put("google_aid_src", GADevice.getAdIdSource());
            }
            if (!TextUtils.isEmpty(GADevice.getOAID())) {
                jSONObject.put("oaid", GADevice.getOAID());
            }
        } else if (!TextUtils.isEmpty(GADevice.getOAID()) && !GAUtilities.isZeroId(GADevice.getOAID())) {
            jSONObject.put("oaid", GADevice.getOAID());
        }
        if (!TextUtils.isEmpty(GADevice.getAppSetId())) {
            jSONObject.put("android_app_set_id", GADevice.getAppSetId());
        }
        if (getInstance().configurations != null && getInstance().configurations.length() > 0) {
            jSONObject.put("configurations", getInstance().configurations);
        }
        if (!TextUtils.isEmpty(getInstance().abId)) {
            jSONObject.put("ab_id", getInstance().abId);
        }
        if (!TextUtils.isEmpty(getInstance().abVariantId)) {
            jSONObject.put("ab_variant_id", getInstance().abVariantId);
        }
        jSONObject.put("client_ts", getClientTsAdjusted());
        jSONObject.put("sdk_version", GADevice.getRelevantSdkVersion());
        jSONObject.put("os_version", GADevice.getBuildPlatform() + " " + GADevice.getOSVersion());
        jSONObject.put("manufacturer", GADevice.getDeviceManufacturer());
        jSONObject.put("device", GADevice.getDeviceModel());
        jSONObject.put("platform", GADevice.getBuildPlatform());
        jSONObject.put("session_id", getInstance().sessionId);
        jSONObject.put("session_num", getSessionNum());
        String connectionType = GADevice.getConnectionType();
        if (GAValidator.validateConnectionType(connectionType)) {
            jSONObject.put("connection_type", connectionType);
        }
        String bundleIdentifier = GADevice.getBundleIdentifier();
        if (GAValidator.validateBundleID(bundleIdentifier)) {
            jSONObject.put("android_bundle_id", bundleIdentifier);
        }
        String appVersion = GADevice.getAppVersion();
        if (GAValidator.validateAppVersion(appVersion)) {
            jSONObject.put("android_app_version", appVersion);
        }
        Integer numValueOf = Integer.valueOf(GADevice.getAppBuild());
        if (GAValidator.validateAppBuild(numValueOf)) {
            jSONObject.put("android_app_build", String.valueOf(numValueOf));
        }
        String appSignature = GADevice.getAppSignature();
        if (GAValidator.validateAppSignature(appSignature)) {
            jSONObject.put("android_app_signature", appSignature);
        }
        String channelId = GADevice.getChannelId();
        if (GAValidator.validateChannelId(channelId)) {
            jSONObject.put("android_channel_id", channelId);
        }
        if (GADevice.getGameEngineVersion().length() != 0) {
            jSONObject.put("engine_version", GADevice.getGameEngineVersion());
        }
        if (!TextUtils.isEmpty(getExternalUserId())) {
            jSONObject.put("user_id_ext", getExternalUserId());
        }
        if (GADevice.getIsHacked()) {
            jSONObject.put("jailbroken", true);
        }
        if (GADevice.getIsLimitedAdTracking()) {
            jSONObject.put("limited_ad_tracking", true);
        }
        if (getBuild().length() != 0) {
            jSONObject.put("build", getBuild());
        }
        return jSONObject;
    }

    public static JSONObject getSdkErrorEventAnnotations() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", 2);
        jSONObject.put("event_uuid", UUID.randomUUID().toString().toLowerCase(Locale.US));
        jSONObject.put("category", CATEGORY_SDK_ERROR);
        jSONObject.put("sdk_version", GADevice.getRelevantSdkVersion());
        jSONObject.put("os_version", GADevice.getBuildPlatform() + " " + GADevice.getOSVersion());
        jSONObject.put("manufacturer", GADevice.getDeviceManufacturer());
        jSONObject.put("device", GADevice.getDeviceModel());
        jSONObject.put("platform", GADevice.getBuildPlatform());
        if (GADevice.getGameEngineVersion().length() != 0) {
            jSONObject.put("engine_version", GADevice.getGameEngineVersion());
        }
        if (GADevice.getIsHacked()) {
            jSONObject.put("jailbroken", true);
        }
        return jSONObject;
    }

    public static JSONObject getInitAnnotations() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", isEventSubmissionEnabled() ? getIdentifier() : "");
            jSONObject.put("sdk_version", GADevice.getRelevantSdkVersion());
            jSONObject.put("os_version", GADevice.getBuildPlatform() + " " + GADevice.getOSVersion());
            jSONObject.put("platform", GADevice.getBuildPlatform());
            if (!TextUtils.isEmpty(getBuild())) {
                jSONObject.put("build", getBuild());
            } else {
                jSONObject.put("build", (Object) null);
            }
            if (!TextUtils.isEmpty(getInstance().abId)) {
                jSONObject.put("ab_id", getInstance().abId);
            }
            if (!TextUtils.isEmpty(getInstance().abVariantId)) {
                jSONObject.put("ab_variant_id", getInstance().abVariantId);
            }
            jSONObject.put("session_num", getSessionNum());
            jSONObject.put("random_salt", getSessionNum());
        } catch (JSONException e) {
            e.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.InitRequest, EGASdkErrorAction.FailHttpJsonDecode, e.toString(), getGameKey(), getSecretKey());
        }
        return jSONObject;
    }

    public static String getIdentifier() {
        String gaid;
        String userId = getUserId();
        if (!TextUtils.isEmpty(userId)) {
            GALogger.d("getIdentifier: Using custom user id");
            updateLastUsedIdentifier(userId);
            return userId;
        }
        if (GADevice.doTrackGAID) {
            gaid = GADevice.getGAID();
            if (!getInstance().useRandomId && !TextUtils.isEmpty(gaid) && !GAUtilities.isZeroId(gaid) && !GADevice.getIsLimitedAdTracking()) {
                GALogger.d("getIdentifier: Using GAID");
                updateLastUsedIdentifier(gaid);
                return gaid;
            }
            String oaid = GADevice.getOAID();
            if (!getInstance().useRandomId && !TextUtils.isEmpty(oaid) && !GAUtilities.isZeroId(oaid)) {
                GALogger.d("getIdentifier: Using OAID");
                updateLastUsedIdentifier(oaid);
                return oaid;
            }
        } else {
            gaid = "";
        }
        if (getInstance().useRandomId || GADevice.getIsLimitedAdTracking() || (!TextUtils.isEmpty(gaid) && GAUtilities.isZeroId(gaid))) {
            boolean z = false;
            SharedPreferences sharedPreferences = GAPlatform.getApplicationContext().getSharedPreferences(Consts.GA_SHARED_PREFERENCES_NAME, 0);
            if (sharedPreferences != null) {
                GALogger.d("getIdentifier: Using random id");
                String string = sharedPreferences.getString(Consts.GA_RANDOM_USER_ID_PREFERENCES_KEY, "");
                String lastUsedIdentifier = getLastUsedIdentifier();
                if (!TextUtils.isEmpty(lastUsedIdentifier) && !TextUtils.isEmpty(gaid) && !GAUtilities.isZeroId(gaid) && lastUsedIdentifier.equals(gaid) && GADevice.doTrackGAID && !GADevice.getIsLimitedAdTracking()) {
                    z = true;
                }
                if (TextUtils.isEmpty(string)) {
                    if (!getInstance().newInstall && getInstance().useRandomId && z) {
                        return lastUsedIdentifier;
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    string = UUID.randomUUID().toString();
                    editorEdit.putString(Consts.GA_RANDOM_USER_ID_PREFERENCES_KEY, string);
                    editorEdit.apply();
                } else if (z) {
                    return lastUsedIdentifier;
                }
                updateLastUsedIdentifier(string);
                return string;
            }
            return "00000000-0000-0000-0000-000000000000";
        }
        return "00000000-0000-0000-0000-000000000000";
    }

    private static void updateLastUsedIdentifier(String currentId) {
        SharedPreferences sharedPreferences = GAPlatform.getApplicationContext().getSharedPreferences(Consts.GA_SHARED_PREFERENCES_NAME, 0);
        if (sharedPreferences == null || TextUtils.isEmpty(currentId) || currentId.equals(getLastUsedIdentifier())) {
            return;
        }
        GALogger.d("updateLastUsedIdentifier: newId=" + currentId);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(Consts.GA_LAST_USED_IDENTIFIER_PREFERENCES_KEY, currentId);
        editorEdit.apply();
    }

    private static String getLastUsedIdentifier() {
        SharedPreferences sharedPreferences = GAPlatform.getApplicationContext().getSharedPreferences(Consts.GA_SHARED_PREFERENCES_NAME, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString(Consts.GA_LAST_USED_IDENTIFIER_PREFERENCES_KEY, "");
        }
        return null;
    }

    private static void addErrorEvent(final String baseMessage, final GAErrorSeverity severity, final String message) {
        if (isEventSubmissionEnabled()) {
            Date date = new Date();
            HashMap<String, Date> map = timestampMap;
            if (!map.containsKey(baseMessage)) {
                map.put(baseMessage, date);
            }
            HashMap<String, Integer> map2 = countMap;
            if (!map2.containsKey(baseMessage)) {
                map2.put(baseMessage, 0);
            }
            if (TimeUnit.MILLISECONDS.toMinutes(date.getTime() - map.get(baseMessage).getTime()) >= 60) {
                map2.put(baseMessage, 0);
                map.put(baseMessage, date);
            }
            if (map2.get(baseMessage).intValue() >= 10) {
                return;
            }
            final GAPlatform.FunctionInfo functionInfo = new GAPlatform.FunctionInfo();
            GAThreading.performTaskOnGAThread(new IBlock() { // from class: com.gameanalytics.sdk.state.GAState.1
                @Override // com.gameanalytics.sdk.threading.IBlock
                public void execute() {
                    GAEvents.addErrorEvent(severity, message, null, true, functionInfo.method, functionInfo.line, functionInfo.module);
                    GAState.countMap.put(baseMessage, Integer.valueOf(((Integer) GAState.countMap.get(baseMessage)).intValue() + 1));
                }

                @Override // com.gameanalytics.sdk.threading.IBlock
                public String getName() {
                    return "addErrorEvent";
                }
            });
        }
    }

    public static boolean hasAvailableCustomDimensions01(final String dimension1) {
        return GAUtilities.stringArrayContainsString(getInstance().availableCustomDimensions01, dimension1);
    }

    public static boolean hasAvailableCustomDimensions02(final String dimension2) {
        return GAUtilities.stringArrayContainsString(getInstance().availableCustomDimensions02, dimension2);
    }

    public static boolean hasAvailableCustomDimensions03(final String dimension3) {
        return GAUtilities.stringArrayContainsString(getInstance().availableCustomDimensions03, dimension3);
    }

    public static boolean hasAvailableResourceCurrency(final String currency) {
        return GAUtilities.stringArrayContainsString(getInstance().availableResourceCurrencies, currency);
    }

    public static boolean hasAvailableResourceItemType(final String itemType) {
        return GAUtilities.stringArrayContainsString(getInstance().availableResourceItemTypes, itemType);
    }

    public static int getSessionNum() {
        return getInstance().sessionNum;
    }

    public static int getTransactionNum() {
        return getInstance().transactionNum;
    }

    public static int getProgressionTries(final String progression) {
        if (getInstance().progressionTries.containsKey(progression)) {
            return getInstance().progressionTries.get(progression).intValue();
        }
        return 0;
    }

    public static String getDimension01() {
        return getInstance().currentCustomDimension01;
    }

    public static String getDimension02() {
        return getInstance().currentCustomDimension02;
    }

    public static String getDimension03() {
        return getInstance().currentCustomDimension03;
    }

    public static Map<String, Object> getGlobalCustomEventFields() {
        return getInstance().currentGlobalCustomEventFields;
    }

    public static void internalInitialize() {
        if (GAStore.getTableReady()) {
            try {
                ensurePersistedStates();
            } catch (JSONException e) {
                GALogger.e("internalInitialize: error creating json in ensurePersistedStates()");
                e.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.InitialInit, EGASdkErrorAction.FailHttpJsonDecode, e.toString(), getGameKey(), getSecretKey());
            }
            setInitialized(true);
            startNewSession();
            GAEvents.addSdkInitEvent();
            if (isEnabled()) {
                GAEvents.ensureEventQueueIsRunning();
            }
        }
    }
}
