package com.gameanalytics.sdk;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public enum GAProgressionStatus {
    Undefined("", 0),
    Start("Start", 1),
    Complete("Complete", 2),
    Fail("Fail", 3);

    private int id;
    private String value;

    GAProgressionStatus(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public static GAProgressionStatus valueOf(int id) {
        for (GAProgressionStatus gAProgressionStatus : values()) {
            if (gAProgressionStatus.id == id) {
                return gAProgressionStatus;
            }
        }
        return Undefined;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
