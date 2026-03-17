package com.gameanalytics.sdk;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public enum GAAdType {
    Undefined("", 0),
    Video("video", 1),
    RewardedVideo("rewarded_video", 2),
    Playable("playable", 3),
    Interstitial("interstitial", 4),
    OfferWall("offer_wall", 5),
    Banner("banner", 6),
    AppOpen("app_open", 7);

    private int id;
    private String value;

    GAAdType(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public static GAAdType valueOf(int id) {
        for (GAAdType gAAdType : values()) {
            if (gAAdType.id == id) {
                return gAAdType;
            }
        }
        return Undefined;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
