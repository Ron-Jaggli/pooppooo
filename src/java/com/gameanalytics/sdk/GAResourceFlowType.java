package com.gameanalytics.sdk;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public enum GAResourceFlowType {
    Undefined("", 0),
    Source("Source", 1),
    Sink("Sink", 2);

    private int id;
    private String value;

    GAResourceFlowType(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public static GAResourceFlowType valueOf(int id) {
        for (GAResourceFlowType gAResourceFlowType : values()) {
            if (gAResourceFlowType.id == id) {
                return gAResourceFlowType;
            }
        }
        return Undefined;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
