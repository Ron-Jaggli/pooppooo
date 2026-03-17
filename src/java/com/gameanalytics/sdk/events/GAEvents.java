package com.gameanalytics.sdk.events;

import android.content.SharedPreferences;
import android.util.Base64;
import com.gameanalytics.sdk.Consts;
import com.gameanalytics.sdk.GAAdAction;
import com.gameanalytics.sdk.GAAdError;
import com.gameanalytics.sdk.GAAdType;
import com.gameanalytics.sdk.GAErrorSeverity;
import com.gameanalytics.sdk.GAPlatform;
import com.gameanalytics.sdk.GAProgressionStatus;
import com.gameanalytics.sdk.GAResourceFlowType;
import com.gameanalytics.sdk.device.GADevice;
import com.gameanalytics.sdk.http.EGAHTTPApiResponse;
import com.gameanalytics.sdk.http.GAHTTPApi;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.state.GAState;
import com.gameanalytics.sdk.store.GAStore;
import com.gameanalytics.sdk.threading.GAThreading;
import com.gameanalytics.sdk.threading.IBlock;
import com.gameanalytics.sdk.utilities.GAUtilities;
import com.gameanalytics.sdk.validators.GAValidator;
import com.gameanalytics.sdk.validators.ValidationResult;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GAEvents {
    private static final String CATEGORY_ADS = "ads";
    private static final String CATEGORY_BUSINESS = "business";
    private static final String CATEGORY_DESIGN = "design";
    private static final String CATEGORY_ERROR = "error";
    private static final String CATEGORY_HEALTH = "health";
    private static final String CATEGORY_IMPRESSION = "impression";
    private static final String CATEGORY_PROGRESSION = "progression";
    private static final String CATEGORY_RESOURCE = "resource";
    private static final String CATEGORY_SDK_INIT = "sdk_init";
    private static final String CATEGORY_SESSION_END = "session_end";
    private static final String CATEGORY_SESSION_START = "user";
    private static final int MAX_EVENTS_SIZE = 500;
    private boolean isRunning;
    private boolean keepRunning;
    private static final GAEvents INSTANCE = new GAEvents();
    public static boolean isSdkInitEventEnabled = false;
    private static int countEnd = 0;
    private static int countUser = 0;
    private static int countMissingEnd = 0;
    private static HashSet<Integer> fixedMissingSessionEnds = new HashSet<>();
    private static final IBlock processEventQueueBlock = new IBlock() { // from class: com.gameanalytics.sdk.events.GAEvents.1
        @Override // com.gameanalytics.sdk.threading.IBlock
        public void execute() {
            GAEvents.processEventQueue();
        }

        @Override // com.gameanalytics.sdk.threading.IBlock
        public String getName() {
            return "processEventQueue";
        }
    };

    private GAEvents() {
    }

    private static GAEvents getInstance() {
        return INSTANCE;
    }

    public static void ensureEventQueueIsRunning() {
        getInstance().keepRunning = true;
        if (getInstance().isRunning) {
            return;
        }
        getInstance().isRunning = true;
        GAThreading.scheduleTimer(8.0d, processEventQueueBlock);
    }

    public static void stopEventQueue() {
        getInstance().keepRunning = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void processEventQueue() {
        processEvents("", true);
        if (getInstance().keepRunning) {
            GAThreading.scheduleTimer(8.0d, processEventQueueBlock);
        } else {
            getInstance().isRunning = false;
        }
    }

    public static void processEvents(final String category, boolean performCleanup) {
        if (GAState.doSendEvents()) {
            try {
                String string = UUID.randomUUID().toString();
                String str = "DELETE FROM ga_events WHERE status = '" + string + "'";
                String str2 = "UPDATE ga_events SET status = 'new' WHERE status = '" + string + "';";
                if (performCleanup) {
                    cleanupEvents();
                    fixMissingSessionEndEvents();
                }
                String str3 = category.length() != 0 ? " AND category='" + category + "' " : "";
                String str4 = "UPDATE ga_events SET status = '" + string + "' WHERE status = 'new' " + str3 + ";";
                JSONArray jSONArrayExecuteQuerySync = GAStore.executeQuerySync("SELECT event FROM ga_events WHERE status = 'new' " + str3 + ";");
                if (jSONArrayExecuteQuerySync != null && jSONArrayExecuteQuerySync.length() != 0) {
                    if (jSONArrayExecuteQuerySync.length() > MAX_EVENTS_SIZE) {
                        JSONArray jSONArrayExecuteQuerySync2 = GAStore.executeQuerySync("SELECT client_ts FROM ga_events WHERE status = 'new' " + str3 + " ORDER BY client_ts ASC LIMIT 0,500;");
                        if (jSONArrayExecuteQuerySync2 == null) {
                            return;
                        }
                        String string2 = ((JSONObject) jSONArrayExecuteQuerySync2.get(jSONArrayExecuteQuerySync2.length() - 1)).getString("client_ts");
                        JSONArray jSONArrayExecuteQuerySync3 = GAStore.executeQuerySync("SELECT event FROM ga_events WHERE status = 'new' " + str3 + " AND client_ts<='" + string2 + "';");
                        if (jSONArrayExecuteQuerySync3 == null) {
                            return;
                        }
                        str4 = "UPDATE ga_events SET status='" + string + "' WHERE status='new' " + str3 + " AND client_ts<='" + string2 + "';";
                        jSONArrayExecuteQuerySync = jSONArrayExecuteQuerySync3;
                    }
                    GALogger.i("Event queue: Sending " + jSONArrayExecuteQuerySync.length() + " events.");
                    if (GAStore.executeQuerySync(str4) == null) {
                        return;
                    }
                    ArrayList<JSONObject> arrayList = new ArrayList<>();
                    for (int i = 0; i < jSONArrayExecuteQuerySync.length(); i++) {
                        JSONObject jSONObjectDictionary = GAUtilities.dictionary(((JSONObject) jSONArrayExecuteQuerySync.get(i)).getString("event"));
                        if (jSONObjectDictionary.length() != 0) {
                            if (jSONObjectDictionary.has("client_ts") && !GAValidator.validateClientTs(jSONObjectDictionary.getLong("client_ts"))) {
                                jSONObjectDictionary.remove("client_ts");
                            }
                            arrayList.add(jSONObjectDictionary);
                        }
                    }
                    GAHTTPApi.GAHTTPApiResponseJSONObjectPair gAHTTPApiResponseJSONObjectPairSendEventsInArray = GAHTTPApi.getInstance().sendEventsInArray(arrayList);
                    EGAHTTPApiResponse eGAHTTPApiResponse = gAHTTPApiResponseJSONObjectPairSendEventsInArray.response;
                    JSONObject jSONObject = gAHTTPApiResponseJSONObjectPairSendEventsInArray.json;
                    if (eGAHTTPApiResponse == EGAHTTPApiResponse.Ok) {
                        GAStore.executeQuerySync(str);
                        GALogger.i("Event queue: " + jSONArrayExecuteQuerySync.length() + " events sent.");
                        return;
                    }
                    if (eGAHTTPApiResponse == EGAHTTPApiResponse.NoResponse) {
                        GALogger.w("Event queue: Failed to send events to collector - Retrying next time");
                        GAStore.executeQuerySync(str2);
                        return;
                    }
                    if (jSONObject != null) {
                        Object objNextValue = new JSONTokener(jSONObject.toString()).nextValue();
                        GALogger.d(jSONObject.toString());
                        if (eGAHTTPApiResponse == EGAHTTPApiResponse.BadRequest && (objNextValue instanceof JSONArray)) {
                            GALogger.w("Event queue: " + jSONArrayExecuteQuerySync.length() + " events sent. " + jSONObject.length() + " events failed GA server validation.");
                        } else {
                            GALogger.w("Event queue: Failed to send events.");
                        }
                    } else {
                        GALogger.w("Event queue: Failed to send events.");
                    }
                    GAStore.executeQuerySync(str);
                    return;
                }
                GALogger.i("Event queue: No events to send");
                updateSessionTime();
            } catch (JSONException e) {
                e.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.ProcessEvents, EGASdkErrorAction.JsonError, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
            }
        }
    }

    private static void updateSessionTime() throws JSONException {
        if (GAState.sessionIsStarted()) {
            JSONObject eventAnnotations = GAState.getEventAnnotations();
            addDimensionsToEvent(eventAnnotations);
            addCustomFieldsToEvent(eventAnnotations, GAState.validateAndCleanCustomFields(GAState.getGlobalCustomEventFields()));
            String string = eventAnnotations.toString();
            ArrayList arrayList = new ArrayList();
            arrayList.add(eventAnnotations.getString("session_id"));
            arrayList.add(String.valueOf(GAState.getSessionStart()));
            arrayList.add(string);
            GAStore.executeQuerySync("INSERT OR REPLACE INTO ga_session(session_id, timestamp, event) VALUES(?, ?, ?);", arrayList);
        }
    }

    public static void cleanupEvents() {
        GAStore.executeQuerySync("UPDATE ga_events SET status = 'new';");
    }

    public static void fixMissingSessionEndEvents() throws JSONException {
        if (GAState.isEventSubmissionEnabled()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(GAState.getSessionId());
            JSONArray jSONArrayExecuteQuerySync = GAStore.executeQuerySync("SELECT timestamp, event FROM ga_session WHERE session_id != ?;", arrayList);
            if (jSONArrayExecuteQuerySync == null || jSONArrayExecuteQuerySync.length() == 0) {
                return;
            }
            GALogger.i(jSONArrayExecuteQuerySync.length() + " session(s) located with missing session_end event.");
            for (int i = 0; i < jSONArrayExecuteQuerySync.length(); i++) {
                JSONObject jSONObject = jSONArrayExecuteQuerySync.getJSONObject(i);
                JSONObject jSONObjectDictionary = GAUtilities.dictionary(jSONObject.getString("event"));
                long j = jSONObjectDictionary.getLong("client_ts");
                long jOptLong = jSONObject.optLong("timestamp", 0L);
                long jMax = Math.max(0L, j - jOptLong);
                int i2 = jSONObjectDictionary.getInt("session_num");
                if (fixedMissingSessionEnds.contains(Integer.valueOf(i2))) {
                    GALogger.e("fixMissingSessionEndEvents duplicate session_end!");
                } else {
                    fixedMissingSessionEnds.add(Integer.valueOf(i2));
                    GALogger.d("fixMissingSessionEndEvents length calculated: " + jMax + ", start_ts=" + jOptLong + ", event_ts=" + j + "-> for session " + i2);
                    jSONObjectDictionary.put("category", CATEGORY_SESSION_END);
                    jSONObjectDictionary.put("length", jMax);
                    addEventToStore(jSONObjectDictionary);
                }
            }
        }
    }

    private static void addEventToStore(final JSONObject eventData) {
        if (GAState.isEventSubmissionEnabled()) {
            if (!GAStore.getTableReady()) {
                GALogger.w("Could not add event: SDK datastore error");
                return;
            }
            if (!GAState.isInitialized()) {
                GALogger.w("Could not add event: SDK is not initialized");
                return;
            }
            try {
                if (GAStore.isDbTooLargeForEvents() && !GAUtilities.stringMatch(eventData.getString("category"), "^(user|session_end|business)$")) {
                    GALogger.w("Database too large. Event has been blocked.");
                    GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.AddEventsToStore, EGASdkErrorAction.DatabaseTooLarge, "", GAState.getGameKey(), GAState.getSecretKey());
                    return;
                }
                JSONObject eventAnnotations = GAState.getEventAnnotations();
                Iterator<String> itKeys = eventData.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    eventAnnotations.put(next, eventData.get(next));
                }
                String string = eventAnnotations.toString();
                GALogger.ii("Event added to queue: " + string);
                ArrayList arrayList = new ArrayList();
                arrayList.add("new");
                arrayList.add(eventAnnotations.getString("category"));
                arrayList.add(eventAnnotations.getString("session_id"));
                arrayList.add(eventAnnotations.getString("client_ts"));
                arrayList.add(string);
                GAStore.executeQuerySync("INSERT INTO ga_events (status, category, session_id, client_ts, event) VALUES(?, ?, ?, ?, ?);", arrayList);
                if (eventData.getString("category").equals(CATEGORY_SESSION_END)) {
                    arrayList.clear();
                    arrayList.add(eventAnnotations.getString("session_id"));
                    GAStore.executeQuerySync("DELETE FROM ga_session WHERE session_id = ?;", arrayList);
                    return;
                }
                updateSessionTime();
            } catch (JSONException e) {
                GALogger.e("addEventToStore: error using json");
                e.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Database, EGASdkErrorArea.AddEventsToStore, EGASdkErrorAction.DatabaseTooLarge, "", GAState.getGameKey(), GAState.getSecretKey());
            }
        }
    }

    public static void addSessionStartEvent() {
        if (GAState.isEventSubmissionEnabled()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", CATEGORY_SESSION_START);
                if (GAState.isNewInstall()) {
                    jSONObject.put("install", true);
                    GAState.setNewInstall(false);
                }
            } catch (JSONException e) {
                GALogger.e("addSessionStartEvent: error creating json");
                e.printStackTrace();
            }
            GAState.incrementSessionNum();
            ArrayList arrayList = new ArrayList();
            arrayList.add("session_num");
            arrayList.add(String.valueOf(GAState.getSessionNum()));
            GAStore.executeQuerySync("INSERT OR REPLACE INTO ga_state (key, value) VALUES(?, ?);", arrayList);
            SharedPreferences sharedPreferences = GAPlatform.getApplicationContext().getSharedPreferences(Consts.GA_SHARED_PREFERENCES_NAME, 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putInt(Consts.GA_SESSION_NUM_KEY, GAState.getSessionNum());
                editorEdit.apply();
            }
            addDimensionsToEvent(jSONObject);
            addCustomFieldsToEvent(jSONObject, GAState.validateAndCleanCustomFields(GAState.getGlobalCustomEventFields()));
            int i = countUser + 1;
            countUser = i;
            if (countEnd > i) {
                GALogger.e("Invalid pairs of user/end session events:" + countUser + "-" + countEnd);
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.SessionEnd, EGASdkErrorAction.JsonError, "Duplicate session end events", GAState.getGameKey(), GAState.getSecretKey());
            }
            addEventToStore(jSONObject);
            GALogger.i("Add SESSION START event");
            processEvents(CATEGORY_SESSION_START, false);
        }
    }

    public static void addSessionEndEvent() {
        if (GAState.isEventSubmissionEnabled()) {
            int i = countEnd + 1;
            countEnd = i;
            if (i > countUser) {
                GALogger.e("Invalid pairs of user/end session events:" + countUser + "-" + countEnd);
            }
            long clientTsAdjusted = GAState.getClientTsAdjusted() - GAState.getSessionStart();
            if (clientTsAdjusted < 0) {
                GALogger.w("Session length was calculated to be less then 0. Should not be possible. Resetting to 0.");
                clientTsAdjusted = 0;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", CATEGORY_SESSION_END);
                jSONObject.put("length", clientTsAdjusted);
            } catch (JSONException e) {
                GALogger.e("addSessionEndEvent: error creating json");
                e.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.SessionEnd, EGASdkErrorAction.JsonError, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
            }
            addDimensionsToEvent(jSONObject);
            addCustomFieldsToEvent(jSONObject, GAState.validateAndCleanCustomFields(GAState.getGlobalCustomEventFields()));
            addEventToStore(jSONObject);
            GALogger.i("Add SESSION END event.");
            processEvents("", false);
        }
    }

    private static void addHealthAnnotations(JSONObject eventDict, GADevice.DeviceInfo deviceInfo) {
        if (eventDict == null || deviceInfo == null) {
            return;
        }
        try {
            if (GADevice.DeviceInfo.enableHardwareTracking) {
                if (deviceInfo.cpuName != null && !deviceInfo.cpuName.isEmpty()) {
                    eventDict.put("cpu_model", deviceInfo.cpuName);
                }
                if (deviceInfo.hardware != null && !deviceInfo.hardware.isEmpty()) {
                    eventDict.put("hardware", deviceInfo.hardware);
                }
                if (deviceInfo.numCores > 0) {
                    eventDict.put("cpu_num_cores", deviceInfo.numCores);
                }
            }
            if (GADevice.DeviceInfo.enableMemoryTracking) {
                if (deviceInfo.memTotal > 0.0d) {
                    eventDict.put("memory_sys_total", deviceInfo.memTotal);
                    eventDict.put("memory_sys_used", deviceInfo.UsedSysMemory());
                }
                if (deviceInfo.appMemoryUsage > 0.0d) {
                    eventDict.put("memory_app_used", deviceInfo.appMemoryUsage);
                }
            }
            if (GADevice.DeviceInfo.enableStorageTracking) {
                if (deviceInfo.totalDeviceStorage > 0.0d) {
                    eventDict.put("storage_device_total", deviceInfo.totalDeviceStorage);
                }
                if (deviceInfo.availableDeviceStorage > 0.0d) {
                    eventDict.put("storage_device_free", deviceInfo.availableDeviceStorage);
                }
                if (GADevice.DeviceInfo.enableExternalStorageTracking) {
                    if (deviceInfo.totalExternalStorage > 0.0d) {
                        eventDict.put("storage_external_total", deviceInfo.totalExternalStorage);
                    }
                    if (deviceInfo.availableExternalStorage > 0.0d) {
                        eventDict.put("storage_external_free", deviceInfo.availableExternalStorage);
                    }
                }
            }
            if (deviceInfo.screenHeight <= 0 || deviceInfo.screenWidth <= 0) {
                return;
            }
            eventDict.put("resolution", new StringBuilder().append(deviceInfo.screenWidth).append('x').append(deviceInfo.screenHeight).toString());
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void addSdkInitEvent() {
        if (isSdkInitEventEnabled) {
            JSONObject jSONObject = new JSONObject();
            try {
                addHealthAnnotations(jSONObject, GADevice.ReadDeviceInfo());
                jSONObject.put("category", CATEGORY_SDK_INIT);
                jSONObject.put("app_boot_time", GADevice.DeviceInfo.GetAppUptime());
                boolean z = true;
                if (GAState.getSessionNum() != 1) {
                    z = false;
                }
                jSONObject.put("is_first_sdk_init", z);
                addDimensionsToEvent(jSONObject);
                addCustomFieldsToEvent(jSONObject, GAState.validateAndCleanCustomFields(GAState.getGlobalCustomEventFields()));
                addEventToStore(jSONObject);
                GALogger.i("Add SDK_INIT event.");
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void addHealthEvent(final long[] frameData, boolean errorFlag) {
        if (GAState.isEventSubmissionEnabled() && GADevice.DeviceInfo.IsHealthEventEnabled()) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (GADevice.DeviceInfo.enableFPSTracking) {
                    JSONArray jSONArray = new JSONArray();
                    if (frameData == null || frameData.length != 121) {
                        GALogger.e("addHealthEvent: Invalid fps metrics");
                        for (int i = 0; i < 121; i++) {
                            jSONArray.put(0L);
                        }
                        errorFlag = true;
                    } else {
                        for (long j : frameData) {
                            jSONArray.put(j);
                        }
                    }
                    if (errorFlag) {
                        GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.HealthEvent, EGASdkErrorAction.JsonError, "An error occured during calculating the fps metrics. Fps health event may not be accurate", GAState.getGameKey(), GAState.getSecretKey());
                        GALogger.e("addHealthEvent: Inaccurate fps reading.");
                    }
                    jSONObject.put("fps_data_table", jSONArray);
                }
                GADevice.DeviceInfo deviceInfoReadDeviceInfo = GADevice.ReadDeviceInfo();
                jSONObject.put("category", CATEGORY_HEALTH);
                addHealthAnnotations(jSONObject, deviceInfoReadDeviceInfo);
                if (GADevice.DeviceInfo.enableMemoryTracking && GADevice.DeviceInfo.enableMemoryHistograms) {
                    int[] iArrGetAppMemoryPercentage = GADevice.DeviceInfo.GetAppMemoryPercentage();
                    int[] iArrGetSysMemoryPercentage = GADevice.DeviceInfo.GetSysMemoryPercentage();
                    if (iArrGetSysMemoryPercentage != null && iArrGetSysMemoryPercentage.length > 0) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i2 : iArrGetSysMemoryPercentage) {
                            jSONArray2.put(i2);
                        }
                        jSONObject.put("memory_sys_data_table", jSONArray2);
                    }
                    if (iArrGetAppMemoryPercentage != null && iArrGetAppMemoryPercentage.length > 0) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (int i3 : iArrGetAppMemoryPercentage) {
                            jSONArray3.put(i3);
                        }
                        jSONObject.put("memory_app_data_table", jSONArray3);
                    }
                }
                addDimensionsToEvent(jSONObject);
                addCustomFieldsToEvent(jSONObject, GAState.validateAndCleanCustomFields(GAState.getGlobalCustomEventFields()));
                addEventToStore(jSONObject);
                GALogger.i("Add HEALTH event.");
            } catch (JSONException e) {
                GALogger.e("addHealthEvent: Error creating json");
                e.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.HealthEvent, EGASdkErrorAction.JsonError, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void addBusinessEvent(final String currency, int amount, final String itemType, final String itemId, final String cartType, final String receipt, final String store, final String signature, final Map<String, Object> fields, final boolean mergeFields) {
        if (GAState.isEventSubmissionEnabled()) {
            ValidationResult validationResultValidateBusinessEvent = GAValidator.validateBusinessEvent(currency, amount, cartType, itemType, itemId, receipt, store, signature);
            if (validationResultValidateBusinessEvent != null) {
                GAHTTPApi.getInstance().sendSdkErrorEvent(validationResultValidateBusinessEvent.category, validationResultValidateBusinessEvent.area, validationResultValidateBusinessEvent.action, validationResultValidateBusinessEvent.parameter, validationResultValidateBusinessEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
                return;
            }
            JSONObject jSONObject = new JSONObject();
            GAState.incrementTransactionNum();
            ArrayList arrayList = new ArrayList();
            arrayList.add("transaction_num");
            arrayList.add(String.valueOf(GAState.getTransactionNum()));
            GAStore.executeQuerySync("INSERT OR REPLACE INTO ga_state (key, value) VALUES(?, ?);", arrayList);
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (receipt != null && receipt.length() != 0) {
                    try {
                        jSONObject2.put("receipt", Base64.encodeToString(receipt.getBytes("UTF-8"), 0));
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    jSONObject2.put("store", store);
                    if (signature != null && signature.length() != 0) {
                        jSONObject2.put("signature", signature);
                    }
                }
                jSONObject.put("event_id", itemType + ":" + itemId);
                jSONObject.put("category", CATEGORY_BUSINESS);
                jSONObject.put("currency", currency);
                jSONObject.put("amount", amount);
                jSONObject.put("transaction_num", GAState.getTransactionNum());
                if (cartType != null && cartType.length() != 0) {
                    jSONObject.put("cart_type", cartType);
                }
                if (jSONObject2.length() != 0) {
                    jSONObject.put("receipt_info", jSONObject2);
                }
                addDimensionsToEvent(jSONObject);
                HashMap map = new HashMap((fields == null || fields.isEmpty()) ? GAState.getGlobalCustomEventFields() : fields);
                if (mergeFields && fields != null && !fields.isEmpty()) {
                    for (Map.Entry<String, Object> entry : GAState.getGlobalCustomEventFields().entrySet()) {
                        if (!map.containsKey(entry.getKey())) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                addCustomFieldsToEvent(jSONObject, GAState.validateAndCleanCustomFields(map));
                StringBuilder sbAppend = new StringBuilder().append("Add BUSINESS event: {currency:").append(currency).append(", amount:").append(amount).append(", itemType:").append(itemType).append(", itemId:").append(itemId).append(", cartType:").append(cartType);
                String string = "";
                if (receipt != null && receipt.length() != 0) {
                    StringBuilder sbAppend2 = new StringBuilder().append(", receipt_info: { store: ").append(store).append(", receipt: #RECEIPT#");
                    if (signature != null && signature.length() != 0) {
                        string = ", signature: " + signature;
                    }
                    string = sbAppend2.append(string).append("}").toString();
                }
                GALogger.i(sbAppend.append(string).append("}").toString());
                addEventToStore(jSONObject);
            } catch (JSONException e2) {
                GALogger.e("addBusinessEvent: Error creating json");
                e2.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.JsonError, e2.toString(), GAState.getGameKey(), GAState.getSecretKey());
            }
        }
    }

    public static void addResourceEvent(GAResourceFlowType flowType, final String currency, double amount, final String itemType, final String itemId, final Map<String, Object> fields, final boolean mergeFields) {
        if (GAState.isEventSubmissionEnabled()) {
            ValidationResult validationResultValidateResourceEvent = GAValidator.validateResourceEvent(flowType, currency, (long) amount, itemType, itemId);
            if (validationResultValidateResourceEvent != null) {
                GAHTTPApi.getInstance().sendSdkErrorEvent(validationResultValidateResourceEvent.category, validationResultValidateResourceEvent.area, validationResultValidateResourceEvent.action, validationResultValidateResourceEvent.parameter, validationResultValidateResourceEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
                return;
            }
            if (flowType == GAResourceFlowType.Sink) {
                amount *= -1.0d;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_id", flowType.toString() + ":" + currency + ":" + itemType + ":" + itemId);
                jSONObject.put("category", CATEGORY_RESOURCE);
                jSONObject.put("amount", amount);
                addDimensionsToEvent(jSONObject);
                HashMap map = new HashMap((fields == null || fields.isEmpty()) ? GAState.getGlobalCustomEventFields() : fields);
                if (mergeFields && fields != null && !fields.isEmpty()) {
                    for (Map.Entry<String, Object> entry : GAState.getGlobalCustomEventFields().entrySet()) {
                        if (!map.containsKey(entry.getKey())) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                addCustomFieldsToEvent(jSONObject, GAState.validateAndCleanCustomFields(map));
                GALogger.i("Add RESOURCE event: {currency:" + currency + ", amount:" + amount + ", itemType:" + itemType + ", itemId:" + itemId + "}");
                addEventToStore(jSONObject);
            } catch (JSONException e) {
                GALogger.e("addResourceEvent: Error creating json");
                e.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.JsonError, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
            }
        }
    }

    public static void addProgressionEvent(GAProgressionStatus progressionStatus, final String progression01, final String progression02, final String progression03, int score, boolean sendScore, final Map<String, Object> fields, boolean mergeFields) {
        String str;
        int progressionTries;
        if (GAState.isEventSubmissionEnabled()) {
            String string = progressionStatus.toString();
            ValidationResult validationResultValidateProgressionEvent = GAValidator.validateProgressionEvent(progressionStatus, progression01, progression02, progression03);
            if (validationResultValidateProgressionEvent != null) {
                GAHTTPApi.getInstance().sendSdkErrorEvent(validationResultValidateProgressionEvent.category, validationResultValidateProgressionEvent.area, validationResultValidateProgressionEvent.action, validationResultValidateProgressionEvent.parameter, validationResultValidateProgressionEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (progression02 == null || progression02.length() == 0) {
                str = progression01;
            } else {
                str = (progression03 == null || progression03.length() == 0) ? progression01 + ":" + progression02 : progression01 + ":" + progression02 + ":" + progression03;
            }
            try {
                jSONObject.put("category", CATEGORY_PROGRESSION);
                jSONObject.put("event_id", string + ":" + str);
                if (sendScore && progressionStatus != GAProgressionStatus.Start) {
                    jSONObject.put("score", score);
                }
                if (progressionStatus == GAProgressionStatus.Fail) {
                    GAState.incrementProgressionTries(str);
                }
                if (progressionStatus == GAProgressionStatus.Complete) {
                    GAState.incrementProgressionTries(str);
                    progressionTries = GAState.getProgressionTries(str);
                    jSONObject.put("attempt_num", progressionTries);
                    GAState.clearProgressionTries(str);
                } else {
                    progressionTries = 0;
                }
                addDimensionsToEvent(jSONObject);
                HashMap map = new HashMap((fields == null || fields.isEmpty()) ? GAState.getGlobalCustomEventFields() : fields);
                if (mergeFields && fields != null && !fields.isEmpty()) {
                    for (Map.Entry<String, Object> entry : GAState.getGlobalCustomEventFields().entrySet()) {
                        if (!map.containsKey(entry.getKey())) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                addCustomFieldsToEvent(jSONObject, GAState.validateAndCleanCustomFields(map));
                GALogger.i("Add PROGRESSION event: {status:" + string + ", progression01:" + progression01 + ", progression02:" + progression02 + ", progression03:" + progression03 + ", score:" + score + ", attempt:" + progressionTries + "}");
                addEventToStore(jSONObject);
            } catch (JSONException e) {
                GALogger.e("addProgressionEvent: Error creating json");
                e.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.JsonError, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
            }
        }
    }

    public static void addDesignEvent(final String eventId, double value, boolean sendValue, final Map<String, Object> fields, boolean mergeFields) {
        if (GAState.isEventSubmissionEnabled()) {
            ValidationResult validationResultValidateDesignEvent = GAValidator.validateDesignEvent(eventId);
            if (validationResultValidateDesignEvent != null) {
                GAHTTPApi.getInstance().sendSdkErrorEvent(validationResultValidateDesignEvent.category, validationResultValidateDesignEvent.area, validationResultValidateDesignEvent.action, validationResultValidateDesignEvent.parameter, validationResultValidateDesignEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", CATEGORY_DESIGN);
                jSONObject.put("event_id", eventId);
                if (sendValue) {
                    jSONObject.put("value", value);
                }
                addDimensionsToEvent(jSONObject);
                HashMap map = new HashMap((fields == null || fields.isEmpty()) ? GAState.getGlobalCustomEventFields() : fields);
                if (mergeFields && fields != null && !fields.isEmpty()) {
                    for (Map.Entry<String, Object> entry : GAState.getGlobalCustomEventFields().entrySet()) {
                        if (!map.containsKey(entry.getKey())) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                addCustomFieldsToEvent(jSONObject, GAState.validateAndCleanCustomFields(map));
                GALogger.i("Add DESIGN event: {eventId:" + eventId + ", value:" + value + "}");
                addEventToStore(jSONObject);
            } catch (JSONException e) {
                GALogger.e("addDesignEvent: Error creating json");
                e.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.DesignEvent, EGASdkErrorAction.JsonError, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
            }
        }
    }

    public static void addErrorEvent(GAErrorSeverity severity, final String message, final Map<String, Object> fields, boolean mergeFields, String method, int line, String module) {
        addErrorEvent(severity, message, fields, mergeFields, false, method, line, module);
    }

    public static void addErrorEvent(GAErrorSeverity severity, final String message, final Map<String, Object> fields, boolean mergeFields, boolean skipAddingFields, String method, int line, String module) {
        if (GAState.isEventSubmissionEnabled()) {
            String string = severity.toString();
            ValidationResult validationResultValidateErrorEvent = GAValidator.validateErrorEvent(severity, message);
            if (validationResultValidateErrorEvent != null) {
                GAHTTPApi.getInstance().sendSdkErrorEvent(validationResultValidateErrorEvent.category, validationResultValidateErrorEvent.area, validationResultValidateErrorEvent.action, validationResultValidateErrorEvent.parameter, validationResultValidateErrorEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", CATEGORY_ERROR);
                jSONObject.put("severity", string);
                jSONObject.put("message", message);
                addDimensionsToEvent(jSONObject);
                if (!skipAddingFields) {
                    HashMap map = new HashMap((fields == null || fields.isEmpty()) ? GAState.getGlobalCustomEventFields() : fields);
                    if (mergeFields && fields != null && !fields.isEmpty()) {
                        for (Map.Entry<String, Object> entry : GAState.getGlobalCustomEventFields().entrySet()) {
                            if (!map.containsKey(entry.getKey())) {
                                map.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    addCustomFieldsToEvent(jSONObject, GAState.validateAndCleanCustomFields(map));
                }
                if (method != null && !method.isEmpty()) {
                    jSONObject.put("function_name", method);
                }
                if (line >= 0) {
                    jSONObject.put("line_number", line);
                }
                GALogger.i("Add ERROR event: {severity:" + string + ", message:" + message + "}");
                addEventToStore(jSONObject);
            } catch (JSONException e) {
                GALogger.e("addErrorEvent: Error creating json");
                e.printStackTrace();
                GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.ErrorEvent, EGASdkErrorAction.JsonError, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
            }
        }
    }

    public static void addAdEvent(GAAdAction adAction, GAAdType adType, String adSdkName, String adPlacement, GAAdError noAdReason, long duration, boolean sendDuration, final Map<String, Object> fields, boolean mergeFields) {
        if (GAState.isEventSubmissionEnabled()) {
            String string = adAction.toString();
            String string2 = adType.toString();
            String string3 = noAdReason.toString();
            ValidationResult validationResultValidateAdEvent = GAValidator.validateAdEvent(adAction, adType, adSdkName, adPlacement);
            if (validationResultValidateAdEvent != null) {
                GAHTTPApi.getInstance().sendSdkErrorEvent(validationResultValidateAdEvent.category, validationResultValidateAdEvent.area, validationResultValidateAdEvent.action, validationResultValidateAdEvent.parameter, validationResultValidateAdEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", CATEGORY_ADS);
                jSONObject.put("ad_sdk_name", adSdkName);
                jSONObject.put("ad_placement", adPlacement);
                jSONObject.put("ad_type", string2);
                jSONObject.put("ad_action", string);
                if (adAction == GAAdAction.FailedShow && string3.length() > 0) {
                    jSONObject.put("ad_fail_show_reason", string3);
                }
                if (sendDuration && (adType == GAAdType.RewardedVideo || adType == GAAdType.Video)) {
                    jSONObject.put("ad_duration", duration);
                }
                addDimensionsToEvent(jSONObject);
                HashMap map = new HashMap((fields == null || fields.isEmpty()) ? GAState.getGlobalCustomEventFields() : fields);
                if (mergeFields && fields != null && !fields.isEmpty()) {
                    for (Map.Entry<String, Object> entry : GAState.getGlobalCustomEventFields().entrySet()) {
                        if (!map.containsKey(entry.getKey())) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                addCustomFieldsToEvent(jSONObject, GAState.validateAndCleanCustomFields(map));
                StringBuilder sbAppend = new StringBuilder().append("Add AD event: {ad_sdk_name:").append(adSdkName).append(", ad_placement:").append(adPlacement).append(", ad_type:").append(string2).append(", ad_action:").append(string);
                String str = "";
                StringBuilder sbAppend2 = sbAppend.append((adAction != GAAdAction.FailedShow || string3.length() <= 0) ? "" : ", ad_fail_show_reason:" + string3);
                if (sendDuration && (adType == GAAdType.RewardedVideo || adType == GAAdType.Video)) {
                    str = ", ad_duration:" + duration;
                }
                GALogger.i(sbAppend2.append(str).append("}").toString());
                addEventToStore(jSONObject);
            } catch (JSONException e) {
                GALogger.e("addAdEvent: Error creating json");
                e.printStackTrace();
            }
        }
    }

    public static void addImpressionEvent(String adNetworkName, String adNetworkVersion, JSONObject impressionData, final Map<String, Object> fields, boolean mergeFields) {
        if (GAState.isEventSubmissionEnabled()) {
            ValidationResult validationResultValidateImpressionEvent = GAValidator.validateImpressionEvent(adNetworkName, adNetworkVersion, impressionData);
            if (validationResultValidateImpressionEvent != null) {
                GAHTTPApi.getInstance().sendSdkErrorEvent(validationResultValidateImpressionEvent.category, validationResultValidateImpressionEvent.area, validationResultValidateImpressionEvent.action, validationResultValidateImpressionEvent.parameter, validationResultValidateImpressionEvent.reason, GAState.getGameKey(), GAState.getSecretKey());
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", CATEGORY_IMPRESSION);
                jSONObject.put("ad_network_name", adNetworkName);
                jSONObject.put("ad_network_version", adNetworkVersion);
                if (impressionData != null && impressionData.length() > 0) {
                    jSONObject.put("impression_data", impressionData);
                }
                addDimensionsToEvent(jSONObject);
                HashMap map = new HashMap((fields == null || fields.isEmpty()) ? GAState.getGlobalCustomEventFields() : fields);
                if (mergeFields && fields != null && !fields.isEmpty()) {
                    for (Map.Entry<String, Object> entry : GAState.getGlobalCustomEventFields().entrySet()) {
                        if (!map.containsKey(entry.getKey())) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                addCustomFieldsToEvent(jSONObject, GAState.validateAndCleanCustomFields(map));
                GALogger.i("Add IMPRESSION event: {ad_network_name:" + adNetworkName + ", ad_network_version:" + adNetworkVersion + ", impression_data:#impressionData}");
                addEventToStore(jSONObject);
            } catch (JSONException e) {
                GALogger.e("addImpressionEvent: Error creating json");
                e.printStackTrace();
            }
        }
    }

    public static void addDimensionsToEvent(JSONObject eventData) {
        if (eventData == null) {
            return;
        }
        try {
            if (GAState.getDimension01().length() != 0) {
                eventData.put("custom_01", GAState.getDimension01());
            }
            if (GAState.getDimension02().length() != 0) {
                eventData.put("custom_02", GAState.getDimension02());
            }
            if (GAState.getDimension03().length() != 0) {
                eventData.put("custom_03", GAState.getDimension03());
            }
        } catch (JSONException e) {
            GALogger.e("addDimensionsToEvent: Error creating json");
            e.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.AddDimensions, EGASdkErrorAction.JsonError, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
    }

    private static void addCustomFieldsToEvent(JSONObject eventData, JSONObject fields) {
        if (eventData == null || fields == null) {
            return;
        }
        try {
            if (fields.length() > 0) {
                eventData.put("custom_fields", fields);
            }
        } catch (JSONException e) {
            GALogger.e("addFieldsToEvent: Error creating json");
            e.printStackTrace();
            GAHTTPApi.getInstance().sendSdkErrorEvent(EGASdkErrorCategory.Json, EGASdkErrorArea.AddFields, EGASdkErrorAction.JsonError, e.toString(), GAState.getGameKey(), GAState.getSecretKey());
        }
    }
}
