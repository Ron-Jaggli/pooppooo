package com.gameanalytics.sdk.utilities;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.aheaditec.talsec.security.G0;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class MacAddressUtil {
    public static String getMacAddress(Context context) {
        String rawMacAddress = getRawMacAddress(context);
        if (rawMacAddress == null) {
            return null;
        }
        return removeSpaceString(rawMacAddress.toUpperCase(Locale.US));
    }

    private static String getRawMacAddress(Context context) {
        String strLoadAddress = loadAddress("wlan0");
        if (strLoadAddress != null) {
            return strLoadAddress;
        }
        String strLoadAddress2 = loadAddress("eth0");
        if (strLoadAddress2 != null) {
            return strLoadAddress2;
        }
        try {
            String macAddress = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (macAddress != null) {
                return macAddress;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String loadAddress(final String interfaceName) {
        try {
            StringBuilder sb = new StringBuilder(G0.s);
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/sys/class/net/" + interfaceName + "/address"), 1024);
            char[] cArr = new char[1024];
            while (true) {
                int i = bufferedReader.read(cArr);
                if (i != -1) {
                    sb.append(String.valueOf(cArr, 0, i));
                } else {
                    bufferedReader.close();
                    return sb.toString();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private static String removeSpaceString(final String inputString) {
        if (inputString == null) {
            return null;
        }
        String strReplaceAll = inputString.replaceAll("\\s", "");
        if (TextUtils.isEmpty(strReplaceAll)) {
            return null;
        }
        return strReplaceAll;
    }
}
