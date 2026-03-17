package com.aheaditec.talsec.security;

import java.util.UUID;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0019f1 {
    public static volatile String a;

    public static String a() {
        if (a == null) {
            synchronized (C0019f1.class) {
                if (a == null) {
                    a = UUID.randomUUID().toString();
                }
            }
        }
        return a;
    }
}
