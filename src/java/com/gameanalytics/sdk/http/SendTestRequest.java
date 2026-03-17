package com.gameanalytics.sdk.http;

import com.gameanalytics.sdk.logging.GALogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class SendTestRequest implements Callable<String> {
    private String body;
    private String contentType = "application/json";

    public void setBody(String body) {
        this.body = body;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override // java.util.concurrent.Callable
    public String call() {
        BufferedReader bufferedReader;
        StringBuffer stringBuffer;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://ennu5mo7xan0n.x.pipedream.net").openConnection();
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", this.contentType);
            byte[] bytes = this.body.getBytes("UTF-8");
            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
            httpURLConnection.getOutputStream().write(bytes);
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            stringBuffer = new StringBuffer();
        } catch (IOException unused) {
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            stringBuffer.append(line);
            GALogger.d("Request has been sent");
            return null;
        }
        bufferedReader.close();
        GALogger.d("Request has been sent");
        return null;
    }
}
