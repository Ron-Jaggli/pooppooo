package com.gameanalytics.sdk.events;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public enum EGASdkErrorArea {
    Undefined("", 0),
    BusinessEvent("business", 1),
    ResourceEvent("resource", 2),
    ProgressionEvent("progression", 3),
    DesignEvent("design", 4),
    ErrorEvent("error", 5),
    Sql("sql", 6),
    EnsurePersistedStates("ensure_persisted_states", 7),
    SessionEnd("session_end", 8),
    InitHttp("init_http", 9),
    EventsHttp("events_http", 10),
    ProcessEvents("process_events", 11),
    AddEventsToStore("add_events_to_store", 12),
    JsonStringToMap("json_string_to_map", 13),
    SessionStart("session_start", 14),
    AddDimensions("add_dimensions", 15),
    AddFields("add_fields", 16),
    InitRequest("init_request", 17),
    SendEvents("send_events", 18),
    InitialInit("internal_init", 19),
    AdEvent("ad", 20),
    ImpressionEvent("impression", 21),
    HealthEvent("health", 1);

    private int id;
    private String value;

    EGASdkErrorArea(String value, int id) {
        this.value = value;
        this.id = id;
    }

    public static EGASdkErrorArea valueOf(int id) {
        for (EGASdkErrorArea eGASdkErrorArea : values()) {
            if (eGASdkErrorArea.id == id) {
                return eGASdkErrorArea;
            }
        }
        return Undefined;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
