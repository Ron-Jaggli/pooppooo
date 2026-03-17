package com.yahoo.sketches;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public enum ResizeFactor {
    X1(0),
    X2(1),
    X4(2),
    X8(3);

    private int lg_;

    ResizeFactor(final int lg) {
        this.lg_ = lg;
    }

    public int lg() {
        return this.lg_;
    }

    public static ResizeFactor getRF(final int lg) {
        ResizeFactor resizeFactor = X1;
        if (resizeFactor.lg() == lg) {
            return resizeFactor;
        }
        ResizeFactor resizeFactor2 = X2;
        if (resizeFactor2.lg() == lg) {
            return resizeFactor2;
        }
        ResizeFactor resizeFactor3 = X4;
        return resizeFactor3.lg() == lg ? resizeFactor3 : X8;
    }

    public int getValue() {
        return 1 << this.lg_;
    }
}
