package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class C0229m implements OnCompleteListener {
    private IAssetPackManagerStatusQueryCallback a;
    private UnityPlayer b;
    private String[] c;

    public C0229m(UnityPlayer unityPlayer, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, String[] strArr) {
        this.b = unityPlayer;
        this.a = iAssetPackManagerStatusQueryCallback;
        this.c = strArr;
    }

    public final void onComplete(Task task) {
        int errorCode;
        if (this.a == null) {
            return;
        }
        int i = 0;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map mapPackStates = assetPackStates.packStates();
            int size = mapPackStates.size();
            String[] strArr = new String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (AssetPackState assetPackState : mapPackStates.values()) {
                strArr[i] = assetPackState.name();
                iArr[i] = assetPackState.status();
                iArr2[i] = assetPackState.errorCode();
                i++;
            }
            this.b.invokeOnMainThread(new RunnableC0226l(this.a, assetPackStates.totalBytes(), strArr, iArr, iArr2));
        } catch (RuntimeExecutionException e) {
            e = e;
            String message = e.getMessage();
            String[] strArr2 = this.c;
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                int errorCode2 = -100;
                if (i2 < length) {
                    String str = strArr2[i2];
                    if (message.contains(str)) {
                        UnityPlayer unityPlayer = this.b;
                        IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback = this.a;
                        String[] strArr3 = {str};
                        int[] iArr3 = {0};
                        while (true) {
                            if (!(e instanceof AssetPackException)) {
                                e = e.getCause();
                                if (e == null) {
                                    break;
                                }
                            } else {
                                errorCode2 = ((AssetPackException) e).getErrorCode();
                                break;
                            }
                        }
                        unityPlayer.invokeOnMainThread(new RunnableC0226l(iAssetPackManagerStatusQueryCallback, 0L, strArr3, iArr3, new int[]{errorCode2}));
                        return;
                    }
                    i2++;
                } else {
                    String[] strArr4 = this.c;
                    int[] iArr4 = new int[strArr4.length];
                    int[] iArr5 = new int[strArr4.length];
                    int i3 = 0;
                    while (true) {
                        String[] strArr5 = this.c;
                        if (i3 >= strArr5.length) {
                            this.b.invokeOnMainThread(new RunnableC0226l(this.a, 0L, strArr5, iArr4, iArr5));
                            return;
                        }
                        iArr4[i3] = 0;
                        Throwable cause = e;
                        while (true) {
                            if (cause instanceof AssetPackException) {
                                errorCode = ((AssetPackException) cause).getErrorCode();
                                break;
                            }
                            cause = cause.getCause();
                            if (cause == null) {
                                errorCode = -100;
                                break;
                            }
                        }
                        iArr5[i3] = errorCode;
                        i3++;
                    }
                }
            }
        }
    }
}
