package com.gameanalytics.sdk;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public enum GAErrorSeverity {
    Undefined("", 0),
    Debug("debug", 1),
    Info("info", 2),
    Warning("warning", 3),
    Error("error", 4),
    Critical("critical", 5);

    private int id;
    private String value;

    GAErrorSeverity(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public static GAErrorSeverity valueOf(int id) {
        for (GAErrorSeverity gAErrorSeverity : values()) {
            if (gAErrorSeverity.id == id) {
                return gAErrorSeverity;
            }
        }
        return Undefined;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
