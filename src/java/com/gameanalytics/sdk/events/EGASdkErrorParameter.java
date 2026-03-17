package com.gameanalytics.sdk.events;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public enum EGASdkErrorParameter {
    Undefined("", 0),
    Currency("currency", 1),
    CartType("cart_type", 2),
    ItemType("item_type", 3),
    ItemId("item_id", 4),
    Store("store", 5),
    FlowType("flow_type", 6),
    Amount("amount", 7),
    Progression01("progression01", 8),
    Progression02("progression02", 9),
    Progression03("progression03", 10),
    EventId("event_id", 11),
    ProgressionStatus("progression_status", 12),
    Severity("severity", 13),
    Message("message", 14),
    AdAction("ad_action", 15),
    AdType("ad_type", 16),
    AdSdkName("ad_sdk_name", 17),
    AdPlacement("ad_placement", 18),
    AdNetwork("ad_network", 19),
    ImpressionData("impression_data", 20),
    AdNetworkVersion("ad_network_version", 19);

    private int id;
    private String value;

    EGASdkErrorParameter(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public static EGASdkErrorParameter valueOf(int id) {
        for (EGASdkErrorParameter eGASdkErrorParameter : values()) {
            if (eGASdkErrorParameter.id == id) {
                return eGASdkErrorParameter;
            }
        }
        return Undefined;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
