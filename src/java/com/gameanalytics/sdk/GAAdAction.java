package com.gameanalytics.sdk;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public enum GAAdAction {
    Undefined("", 0),
    Clicked("clicked", 1),
    Show("show", 2),
    FailedShow("failed_show", 3),
    RewardReceived("reward_received", 4),
    Request("request", 5),
    Loaded("loaded", 6);

    private int id;
    private String value;

    GAAdAction(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public static GAAdAction valueOf(int id) {
        for (GAAdAction gAAdAction : values()) {
            if (gAAdAction.id == id) {
                return gAAdAction;
            }
        }
        return Undefined;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
