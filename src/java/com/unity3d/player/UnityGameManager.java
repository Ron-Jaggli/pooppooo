package com.unity3d.player;

import android.app.GameManager;
import android.content.Context;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class UnityGameManager {
    private static Object mGameManager;

    public static Object getGameManager(Context context) {
        String str;
        if (PlatformSupport.SNOW_CONE_SUPPORT) {
            Object obj = mGameManager;
            if (obj != null) {
                return obj;
            }
            if (context != null) {
                Object systemService = context.getSystemService((Class<Object>) GameManager.class);
                mGameManager = systemService;
                return systemService;
            }
            str = "UnityGame: Request for GameManager supplied with null context.";
        } else {
            str = "getGameManager: API level not supported. API level 31 is required.";
        }
        D.Log(6, str);
        return null;
    }

    public static int getGameMode(Context context) {
        String str;
        if (PlatformSupport.SNOW_CONE_SUPPORT) {
            GameManager gameManager = (GameManager) getGameManager(context);
            if (gameManager != null) {
                return gameManager.getGameMode();
            }
            str = "UnityGame: GameManager not available.";
        } else {
            str = "getGameMode: API level not supported. API level 31 is required.";
        }
        D.Log(6, str);
        return 0;
    }
}
