package com.gameanalytics.sdk.http;

import android.text.TextUtils;
import com.gameanalytics.sdk.events.EGASdkErrorAction;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.events.EGASdkErrorParameter;
import com.gameanalytics.sdk.events.SdkErrorTask;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.state.GAState;
import com.gameanalytics.sdk.utilities.GAUtilities;
import com.gameanalytics.sdk.utilities.TaskRunner;
import com.gameanalytics.sdk.validators.GAValidator;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GAHTTPApi {
    private static final int MAX_ERROR_MESSAGE_LENGTH = 256;
    private static final GAHTTPApi INSTANCE = new GAHTTPApi();
    private static int SDK_ERROR_TIMEOUT = 3600000;
    private static int MAX_SDK_ERROR_EVENTS = 10;
    private String protocol = "https";
    private String hostName = "api.gameanalytics.com";
    private String version = "v2";
    private String remoteConfigsVersion = "v1";
    private String baseUrl = this.protocol + "://" + this.hostName + "/" + this.version;
    private String remoteConfigsBaseUrl = this.protocol + "://" + this.hostName + "/remote_configs/" + this.remoteConfigsVersion;
    private String initializeUrlPath = "init";
    private String eventsUrlPath = "events";
    private boolean useGzip = true;
    private HashMap<String, SdkErrorEventCounter> sdkErrorEventTimeout = new HashMap<>();

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
     */
    private static class SdkErrorEventCounter {
        public int count = 0;
        public long timestamp;

        SdkErrorEventCounter(long _timestamp) {
            this.timestamp = _timestamp;
        }
    }

    private GAHTTPApi() {
    }

    public static GAHTTPApi getInstance() {
        return INSTANCE;
    }

    public void setBaseUrl(final String url) {
        this.baseUrl = url;
        GALogger.d("New base URL: " + this.baseUrl);
    }

    private EGAHTTPApiResponse processRequestResponse(HttpURLConnection connection, final String body, final String requestId) {
        int responseCode;
        String responseMessage;
        try {
            responseCode = connection.getResponseCode();
        } catch (IOException | Exception unused) {
            responseCode = 0;
        }
        if (body.length() == 0) {
            try {
                responseMessage = connection.getResponseMessage();
            } catch (IOException | Exception unused2) {
                responseMessage = "";
            }
            GALogger.d(requestId + " request. failed. Might be no connection. Description: " + responseMessage + ", Status code: " + responseCode);
            return EGAHTTPApiResponse.NoResponse;
        }
        if (responseCode == 200) {
            return EGAHTTPApiResponse.Ok;
        }
        if (responseCode == 201) {
            return EGAHTTPApiResponse.Created;
        }
        if (responseCode == 0 || responseCode == 401) {
            GALogger.d(requestId + " request. 401 - Unauthorized.");
            return EGAHTTPApiResponse.Unauthorized;
        }
        if (responseCode == 400) {
            GALogger.d(requestId + " request. 400 - Bad Request.");
            return EGAHTTPApiResponse.BadRequest;
        }
        if (responseCode == 500) {
            GALogger.d(requestId + " request. 500 - Internal Server Error.");
            return EGAHTTPApiResponse.InternalServerError;
        }
        return EGAHTTPApiResponse.UnknownResponseCode;
    }

    public byte[] createPayloadData(final String payload, boolean gzip) throws Exception {
        if (gzip) {
            byte[] bArrGzipCompress = GAUtilities.gzipCompress(payload);
            GALogger.d("Gzip stats. Size: " + payload.getBytes("UTF-8").length + ", Compressed: " + bArrGzipCompress.length + ", Content: " + payload);
            return bArrGzipCompress;
        }
        return payload.getBytes("UTF-8");
    }

    private HttpURLConnection createRequest(final String url, final byte[] payloadData, boolean gzip) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(payloadData.length));
        if (gzip) {
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        }
        httpURLConnection.setRequestProperty("Authorization", GAUtilities.hmac(GAState.getSecretKey(), payloadData));
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.gameanalytics.sdk.http.GAHTTPApi.GAHTTPApiResponseJSONObjectPair requestInitReturningDict(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gameanalytics.sdk.http.GAHTTPApi.requestInitReturningDict(java.lang.String):com.gameanalytics.sdk.http.GAHTTPApi$GAHTTPApiResponseJSONObjectPair");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.gameanalytics.sdk.http.GAHTTPApi.GAHTTPApiResponseJSONObjectPair sendEventsInArray(java.util.ArrayList<org.json.JSONObject> r14) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gameanalytics.sdk.http.GAHTTPApi.sendEventsInArray(java.util.ArrayList):com.gameanalytics.sdk.http.GAHTTPApi$GAHTTPApiResponseJSONObjectPair");
    }

    public void sendSdkErrorEvent(EGASdkErrorCategory category, EGASdkErrorArea area, EGASdkErrorAction action, String reason, String gameKey, String secretKey) {
        sendSdkErrorEventInternal(category, area, action, EGASdkErrorParameter.Undefined, reason, gameKey, secretKey);
    }

    public void sendSdkErrorEvent(EGASdkErrorCategory category, EGASdkErrorArea area, EGASdkErrorAction action, EGASdkErrorParameter parameter, String reason, String gameKey, String secretKey) {
        sendSdkErrorEventInternal(category, area, action, parameter, reason, gameKey, secretKey);
    }

    private void sendSdkErrorEventInternal(EGASdkErrorCategory category, EGASdkErrorArea area, EGASdkErrorAction action, EGASdkErrorParameter parameter, String reason, String gameKey, String secretKey) {
        String str;
        String strJsonString = "";
        if (GAState.doSendEvents()) {
            String string = area.toString();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.sdkErrorEventTimeout.containsKey(string)) {
                SdkErrorEventCounter sdkErrorEventCounter = new SdkErrorEventCounter(jCurrentTimeMillis);
                sdkErrorEventCounter.count++;
                this.sdkErrorEventTimeout.put(string, sdkErrorEventCounter);
            } else {
                SdkErrorEventCounter sdkErrorEventCounter2 = this.sdkErrorEventTimeout.get(string);
                if (sdkErrorEventCounter2.count >= MAX_SDK_ERROR_EVENTS) {
                    if (jCurrentTimeMillis - sdkErrorEventCounter2.timestamp > SDK_ERROR_TIMEOUT) {
                        sdkErrorEventCounter2.timestamp = jCurrentTimeMillis;
                        sdkErrorEventCounter2.count = 0;
                    } else {
                        GALogger.e("Too many errors have been registered while sending events, error code: \"" + string + "\". Please check if your event submission is correct. Maximum error events allowed is: " + MAX_SDK_ERROR_EVENTS + " per hour!");
                        return;
                    }
                }
                sdkErrorEventCounter2.count++;
            }
            if (GAValidator.validateSdkErrorEvent(gameKey, secretKey, category, area, action)) {
                String str2 = this.baseUrl + "/" + gameKey + "/" + this.eventsUrlPath;
                GALogger.d("Sending 'events' URL: " + str2);
                try {
                    JSONObject sdkErrorEventAnnotations = GAState.getSdkErrorEventAnnotations();
                    String string2 = category.toString();
                    sdkErrorEventAnnotations.put("error_category", string2);
                    str = "" + string2;
                    try {
                        String string3 = area.toString();
                        sdkErrorEventAnnotations.put("error_area", string3);
                        str = str + ":" + string3;
                        sdkErrorEventAnnotations.put("error_action", action.toString());
                        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                        String methodName = stackTrace[4].getMethodName();
                        sdkErrorEventAnnotations.put("function_name", methodName);
                        int lineNumber = stackTrace[4].getLineNumber();
                        sdkErrorEventAnnotations.put("line_number", lineNumber);
                        StringBuilder sb = new StringBuilder();
                        for (int i = 4; i < stackTrace.length; i++) {
                            sb.append(stackTrace[i].toString() + "\n");
                        }
                        if (sb.length() > 4096) {
                            sb.setLength(4096);
                        }
                        sdkErrorEventAnnotations.put("stacktrace", sb.toString());
                        GALogger.e("sendSdkErrorEvent: " + methodName + "at line: " + lineNumber + " with stacktrace:\n" + ((Object) sb));
                        String string4 = parameter.toString();
                        if (!TextUtils.isEmpty(string4)) {
                            sdkErrorEventAnnotations.put("error_parameter", string4);
                        }
                        if (!TextUtils.isEmpty(reason)) {
                            sdkErrorEventAnnotations.put("reason", reason.length() > MAX_ERROR_MESSAGE_LENGTH ? reason.substring(0, MAX_ERROR_MESSAGE_LENGTH) : reason);
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(sdkErrorEventAnnotations);
                        strJsonString = GAUtilities.jsonString(arrayList);
                    } catch (JSONException e) {
                        e = e;
                        e.printStackTrace();
                    }
                } catch (JSONException e2) {
                    e = e2;
                    str = "";
                }
                if (TextUtils.isEmpty(strJsonString)) {
                    GALogger.w("sendSdkErrorEvent: JSON encoding failed.");
                    return;
                }
                try {
                    GALogger.d("sendSdkErrorEvent json: " + strJsonString);
                    TaskRunner.executeAsync(new SdkErrorTask(str2, str, strJsonString.getBytes("UTF-8"), secretKey), null);
                } catch (UnsupportedEncodingException e3) {
                    GALogger.w("sendSdkErrorEvent: Payload data encoding failed.");
                    e3.printStackTrace();
                }
            }
        }
    }

    private JSONObject validateAndCleanInitRequestResponse(JSONObject initResponse, boolean configsCreated) {
        if (initResponse == null) {
            GALogger.w("validateInitRequestResponse failed - no response dictionary.");
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (initResponse.has("server_ts")) {
            try {
                double dOptDouble = initResponse.optDouble("server_ts", -1.0d);
                if (dOptDouble > 0.0d) {
                    jSONObject.put("server_ts", dOptDouble);
                }
            } catch (JSONException unused) {
                GALogger.w("validateInitRequestResponse failed - invalid type in 'server_ts' field.");
                return null;
            }
        }
        if (configsCreated) {
            if (initResponse.has("configs")) {
                try {
                    jSONObject.put("configs", initResponse.getJSONArray("configs"));
                } catch (JSONException unused2) {
                    GALogger.w("validateInitRequestResponse failed - invalid type in 'configs' field.");
                    return null;
                }
            }
            if (initResponse.has("configs_hash")) {
                try {
                    jSONObject.put("configs_hash", initResponse.getString("configs_hash"));
                } catch (JSONException unused3) {
                    GALogger.w("validateInitRequestResponse failed - invalid type in 'configs_hash' field.");
                    return null;
                }
            }
            if (initResponse.has("ab_id")) {
                try {
                    jSONObject.put("ab_id", initResponse.getString("ab_id"));
                } catch (JSONException unused4) {
                    GALogger.w("validateInitRequestResponse failed - invalid type in 'ab_id' field.");
                    return null;
                }
            }
            if (initResponse.has("ab_variant_id")) {
                try {
                    jSONObject.put("ab_variant_id", initResponse.getString("ab_variant_id"));
                } catch (JSONException unused5) {
                    GALogger.w("validateInitRequestResponse failed - invalid type in 'ab_variant_id' field.");
                    return null;
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
     */
    public class GAHTTPApiResponseJSONObjectPair {
        public JSONObject json;
        public EGAHTTPApiResponse response;

        public GAHTTPApiResponseJSONObjectPair() {
        }
    }
}
