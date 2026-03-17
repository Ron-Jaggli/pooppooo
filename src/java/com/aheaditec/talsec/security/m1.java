package com.aheaditec.talsec.security;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/1.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class m1 extends Exception {
    public final int a;

    public m1(int i, String str) {
        super(str);
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public m1(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
