package com.unity3d.player;

import android.app.GameManager;
import android.app.GameState;
import android.content.Context;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/10.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class UnityGameState {
    private static String ModeName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? String.valueOf(i) : "CONTENT" : "GAMEPLAY_UNINTERRUPTIBLE" : "GAMEPLAY_INTERRUPTIBLE" : "NONE" : "UNKNOWN";
    }

    public static void setGameState(Context context, boolean z, int i) {
        if (!PlatformSupport.TIRAMISU_SUPPORT) {
            D.Log(6, "setGameState: API level not supported. API level 33 is required.");
            return;
        }
        GameManager gameManager = (GameManager) UnityGameManager.getGameManager(context);
        if (gameManager == null) {
            D.Log(6, "UnityGame: GameManager not available.");
        } else {
            D.Log(4, "SetGameState: " + z + " " + i);
            gameManager.setGameState(new GameState(z, i));
        }
    }

    public static void setGameState(Context context, boolean z, int i, int i2, int i3) {
        if (!PlatformSupport.TIRAMISU_SUPPORT) {
            D.Log(6, "setGameState: API level not supported. API level 33 is required.");
            return;
        }
        GameManager gameManager = (GameManager) UnityGameManager.getGameManager(context);
        if (gameManager == null) {
            D.Log(6, "UnityGame: GameManager not available.");
        } else {
            D.Log(4, "SetGameState: isLoading: " + z + ", mode: " + ModeName(i) + ", label: " + i2 + ", quality: " + i3);
            gameManager.setGameState(new GameState(z, i, i2, i3));
        }
    }
}
