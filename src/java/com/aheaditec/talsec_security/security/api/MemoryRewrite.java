package com.aheaditec.talsec_security.security.api;

import java.util.Date;
import java.util.Random;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class MemoryRewrite {
    public static final Random a = new Random(new Date().getTime());

    public static void rewriteWithRandomness(byte[] bArr) {
        if (bArr != null) {
            a.nextBytes(bArr);
        }
    }

    public static void rewriteWithRandomness(char[] cArr) {
        for (int i = 0; i < cArr.length; i++) {
            cArr[i] = (char) (a.nextInt(26) + 97);
        }
    }
}
