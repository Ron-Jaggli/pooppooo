package com.gameanalytics.sdk.utilities;

import android.content.Context;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class GAUtilities {
    public static final String GAID_PACKAGE_NAME = "com.google.android.gms.ads.identifier";
    public static final String OAID_PACKAGE_NAME = "com.huawei.hms.ads.identifier";

    public static byte[] gzipCompress(final String data) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        if (data == null || data.length() == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2) { // from class: com.gameanalytics.sdk.utilities.GAUtilities.1
                    {
                        this.def.setLevel(9);
                    }
                };
                try {
                    gZIPOutputStream.write(data.getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    try {
                        byteArrayOutputStream2.close();
                        gZIPOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            throw th;
                        }
                    }
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream = null;
        }
    }

    public static String gzipDecompress(byte[] data) throws Exception {
        GZIPInputStream gZIPInputStream;
        Throwable th;
        BufferedReader bufferedReader;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(data));
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
                String str = "";
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        str = str + line;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                                throw th;
                            }
                        }
                        if (gZIPInputStream != null) {
                            gZIPInputStream.close();
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                try {
                    bufferedReader.close();
                    gZIPInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return str;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            gZIPInputStream = null;
            th = th4;
            bufferedReader = null;
        }
    }

    public static JSONObject dictionary(final String string) {
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static JSONArray array(final String string) {
        try {
            return new JSONArray(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String jsonString(ArrayList<JSONObject> arr) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<JSONObject> it = arr.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            return jSONArray.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean stringMatch(final String string, final String pattern) {
        if (string == null || pattern == null) {
            return false;
        }
        return Pattern.matches(pattern, string);
    }

    public static long timeIntervalSince1970() {
        return System.currentTimeMillis() / 1000;
    }

    public static String hmac(final String key, final byte[] data) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256"));
            return Base64.encodeToString(mac.doFinal(data), 0);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
            return "";
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
            return "";
        }
    }

    public static String joinStringArray(String[] v, final String delimiter) {
        StringBuilder sb = new StringBuilder();
        int length = v.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(delimiter);
            }
            sb.append(v[i]);
        }
        return sb.toString();
    }

    public static boolean stringArrayContainsString(String[] array, String search) {
        if (array.length == 0) {
            return false;
        }
        for (String str : array) {
            if (str.equals(search)) {
                return true;
            }
        }
        return false;
    }

    public static String getGAID(Context context) {
        return Reflection.getAdId(GAID_PACKAGE_NAME, context);
    }

    public static String getOAID(Context context) {
        try {
            String adId = Reflection.getAdId(OAID_PACKAGE_NAME, context);
            if (isZeroId(adId)) {
                return null;
            }
            return adId;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean isLimitAdTrackingEnabled(String packageName, Context context) {
        return Reflection.isLimitAdTrackingEnabled(packageName, context);
    }

    public static boolean isZeroId(String id) {
        boolean z = id != null && (UUID.fromString(id) == UUID.fromString("00000000-0000-0000-0000-000000000000"));
        if (!z && id != null) {
            for (int i = 0; i < id.length(); i++) {
                z = id.charAt(i) == '0';
                if (!z) {
                    break;
                }
            }
        }
        return z;
    }
}
