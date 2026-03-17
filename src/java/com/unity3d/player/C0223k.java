package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class C0223k implements OnCompleteListener {
    private IAssetPackManagerDownloadStatusCallback a;
    private UnityPlayer b;
    private String[] c;

    public C0223k(UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String[] strArr) {
        this.b = unityPlayer;
        this.a = iAssetPackManagerDownloadStatusCallback;
        this.c = strArr;
    }

    public final void onComplete(Task task) {
        int errorCode;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map mapPackStates = assetPackStates.packStates();
            if (mapPackStates.size() == 0) {
                return;
            }
            Vector vector = new Vector();
            for (AssetPackState assetPackState : mapPackStates.values()) {
                if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                    String strName = assetPackState.name();
                    int iStatus = assetPackState.status();
                    int iErrorCode = assetPackState.errorCode();
                    long j = assetPackStates.totalBytes();
                    this.b.invokeOnMainThread(new RunnableC0211g(Collections.singleton(this.a), strName, iStatus, j, iStatus == 4 ? j : 0L, 0, iErrorCode));
                } else {
                    vector.add(assetPackState.name());
                }
            }
            if (vector.size() > 0) {
                C0232n c0232n = C0232n.e;
                UnityPlayer unityPlayer = this.b;
                IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.a;
                c0232n.getClass();
                synchronized (C0232n.e) {
                    Object obj = c0232n.d;
                    if (obj == null) {
                        C0214h c0214h = new C0214h(c0232n, unityPlayer, iAssetPackManagerDownloadStatusCallback);
                        c0232n.b.registerListener(c0214h);
                        c0232n.d = c0214h;
                    } else {
                        ((C0214h) obj).a(iAssetPackManagerDownloadStatusCallback);
                    }
                    c0232n.c.addAll(vector);
                    c0232n.b.fetch(vector);
                }
            }
        } catch (RuntimeExecutionException e) {
            e = e;
            String[] strArr = this.c;
            if (strArr.length == 1) {
                String str = strArr[0];
                while (true) {
                    if (e instanceof AssetPackException) {
                        errorCode = ((AssetPackException) e).getErrorCode();
                        break;
                    }
                    e = e.getCause();
                    if (e == null) {
                        errorCode = -100;
                        break;
                    }
                }
                this.b.invokeOnMainThread(new RunnableC0211g(Collections.singleton(this.a), str, 0, 0L, 0L, 0, errorCode));
                return;
            }
            C0232n c0232n2 = C0232n.e;
            IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback2 = this.a;
            c0232n2.getClass();
            for (String str2 : strArr) {
                c0232n2.b.getPackStates(Collections.singletonList(str2)).addOnCompleteListener(new C0223k(c0232n2.a, iAssetPackManagerDownloadStatusCallback2, new String[]{str2}));
            }
        }
    }
}
