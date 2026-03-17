package com.gameanalytics.sdk.events;

import android.text.TextUtils;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.state.GAState;
import com.gameanalytics.sdk.utilities.GAUtilities;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class SdkErrorTask implements Callable<HttpURLConnection> {
    private static final int MAX_COUNT = 10;
    private static HashMap<String, Integer> countMap = new HashMap<>();
    private static HashMap<String, Date> timestampMap = new HashMap<>();
    protected String body = "";
    protected String hashHmac;
    protected byte[] payloadData;
    protected String type;
    protected String url;

    public SdkErrorTask(String url, String type, byte[] payloadData, String secretKey) {
        this.url = url;
        this.type = type;
        this.payloadData = payloadData;
        this.hashHmac = GAUtilities.hmac(secretKey, payloadData);
    }

    @Override // java.util.concurrent.Callable
    public HttpURLConnection call() {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        StringBuffer stringBuffer;
        HttpURLConnection httpURLConnection2 = null;
        if (!GAState.isEventSubmissionEnabled()) {
            return null;
        }
        Date date = new Date();
        if (!timestampMap.containsKey(this.type)) {
            timestampMap.put(this.type, date);
        }
        if (!countMap.containsKey(this.type)) {
            countMap.put(this.type, 0);
        }
        if (TimeUnit.MILLISECONDS.toMinutes(date.getTime() - timestampMap.get(this.type).getTime()) >= 60) {
            countMap.put(this.type, 0);
            timestampMap.put(this.type, date);
        }
        if (countMap.get(this.type).intValue() >= 10) {
            return null;
        }
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(this.url).openConnection();
            } catch (IOException unused) {
            }
        } catch (IOException | Exception unused2) {
        }
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.payloadData.length));
            httpURLConnection.setRequestProperty("Authorization", this.hashHmac);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            GALogger.d("sdk error request url : " + this.url);
            GALogger.d("sdk error request Authorization : " + this.hashHmac);
            httpURLConnection.getOutputStream().write(this.payloadData);
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            stringBuffer = new StringBuffer();
        } catch (IOException unused3) {
            httpURLConnection2 = httpURLConnection;
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection2.getErrorStream()));
            StringBuffer stringBuffer2 = new StringBuffer();
            while (true) {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    break;
                }
                stringBuffer2.append(line);
                httpURLConnection = httpURLConnection2;
            }
            bufferedReader2.close();
            this.body = stringBuffer2.toString();
            httpURLConnection = httpURLConnection2;
        } catch (Exception unused4) {
            httpURLConnection2 = httpURLConnection;
            httpURLConnection = httpURLConnection2;
        }
        while (true) {
            String line2 = bufferedReader.readLine();
            if (line2 == null) {
                break;
            }
            stringBuffer.append(line2);
            GALogger.d("sdk error request content : " + this.body);
            return httpURLConnection;
        }
        bufferedReader.close();
        this.body = stringBuffer.toString();
        GALogger.d("sdk error request content : " + this.body);
        return httpURLConnection;
    }

    protected void onPostExecute(HttpURLConnection result) {
        int responseCode;
        String responseMessage;
        if (result != null) {
            try {
                responseCode = result.getResponseCode();
            } catch (IOException unused) {
                responseCode = 0;
            }
            try {
                responseMessage = result.getResponseMessage();
            } catch (IOException unused2) {
                responseMessage = "";
            }
            if (TextUtils.isEmpty(this.body)) {
                GALogger.d("sdk error failed. Might be no connection. Description: " + responseMessage + ", Status code: " + responseCode);
            } else {
                if (responseCode != 200) {
                    GALogger.d("sdk error failed. response code not 200. status code: " + responseCode + ", description: " + responseMessage + ", body: " + this.body);
                    return;
                }
                HashMap<String, Integer> map = countMap;
                String str = this.type;
                map.put(str, Integer.valueOf(map.get(str).intValue() + 1));
            }
        }
    }
}
