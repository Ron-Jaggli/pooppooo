package com.gameanalytics.sdk.validators;

import com.gameanalytics.sdk.events.EGASdkErrorAction;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.events.EGASdkErrorParameter;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class ValidationResult {
    public EGASdkErrorAction action;
    public EGASdkErrorArea area;
    public EGASdkErrorCategory category;
    public EGASdkErrorParameter parameter;
    public String reason;

    public ValidationResult(EGASdkErrorCategory category, EGASdkErrorArea area, EGASdkErrorAction action, EGASdkErrorParameter parameter, String reason) {
        this.category = category;
        this.area = area;
        this.action = action;
        this.parameter = parameter;
        this.reason = reason;
    }
}
