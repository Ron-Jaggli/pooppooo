package com.gameanalytics.sdk;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public enum GAAdError {
    Undefined("", 0),
    Unknown("unknown", 1),
    Offline("offline", 2),
    NoFill("no_fill", 3),
    InternalError("internal_error", 4),
    InvalidRequest("invalid_request", 5),
    UnableToPrecache("unable_to_precache", 6);

    private int id;
    private String value;

    GAAdError(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public static GAAdError valueOf(int id) {
        for (GAAdError gAAdError : values()) {
            if (gAAdError.id == id) {
                return gAAdError;
            }
        }
        return Undefined;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
