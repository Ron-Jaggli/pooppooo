package com.gameanalytics.sdk.unity;

import com.gameanalytics.sdk.GameAnalytics;
import com.gameanalytics.sdk.IRemoteConfigsListener;
import com.gameanalytics.sdk.logging.GALogger;
import com.unity3d.player.UnityPlayer;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class UnityGameAnalytics {
    private static final String GameAnalyticsGameObjectName = "GameAnalytics";
    private static final String OnRemoteConfigsUpdatedMethodName = "OnRemoteConfigsUpdated";
    private static final IRemoteConfigsListener remoteConfigsListener = new IRemoteConfigsListener() { // from class: com.gameanalytics.sdk.unity.UnityGameAnalytics.1
        @Override // com.gameanalytics.sdk.IRemoteConfigsListener
        public void onRemoteConfigsUpdated() {
            GALogger.d("UnityGameAnalytics: onRemoteConfigsUpdated called");
            UnityPlayer.UnitySendMessage("GameAnalytics", UnityGameAnalytics.OnRemoteConfigsUpdatedMethodName, "");
        }
    };

    public static void initialize() {
        GALogger.d("UnityGameAnalytics: initialize called");
        GameAnalytics.addRemoteConfigsListener(remoteConfigsListener);
    }
}
