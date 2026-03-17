package com.gameanalytics.sdk.events;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public enum EGASdkErrorCategory {
    Undefined("", 0),
    EventValidation("event_validation", 1),
    Database("db", 2),
    Init("init", 3),
    Http("http", 4),
    Json("json", 5);

    private int id;
    private String value;

    EGASdkErrorCategory(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public static EGASdkErrorCategory valueOf(int id) {
        for (EGASdkErrorCategory eGASdkErrorCategory : values()) {
            if (eGASdkErrorCategory.id == id) {
                return eGASdkErrorCategory;
            }
        }
        return Undefined;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
