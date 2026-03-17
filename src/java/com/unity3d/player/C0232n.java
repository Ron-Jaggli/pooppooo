package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import java.util.Arrays;
import java.util.HashSet;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class C0232n {
    private static C0232n e;
    private UnityPlayer a;
    private AssetPackManager b;
    private HashSet c;
    private Object d;

    private C0232n(UnityPlayer unityPlayer, Context context) {
        if (e != null) {
            throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        }
        this.a = unityPlayer;
        this.b = AssetPackManagerFactory.getInstance(context);
        this.c = new HashSet();
    }

    public static C0232n a(UnityPlayer unityPlayer, Context context) {
        if (e == null) {
            e = new C0232n(unityPlayer, context);
        }
        return e;
    }

    public final Object a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        C0214h c0214h = new C0214h(this, this.a, iAssetPackManagerDownloadStatusCallback);
        this.b.registerListener(c0214h);
        return c0214h;
    }

    public final String a(String str) {
        AssetPackLocation packLocation = this.b.getPackLocation(str);
        return packLocation == null ? "" : packLocation.assetsPath();
    }

    public final void a(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.b.showCellularDataConfirmation(activity).addOnSuccessListener(new C0220j(this.a, iAssetPackManagerMobileDataConfirmationCallback));
    }

    public final void a(Object obj) {
        if (obj instanceof C0214h) {
            this.b.unregisterListener((C0214h) obj);
        }
    }

    public final void a(String[] strArr) {
        this.b.cancel(Arrays.asList(strArr));
    }

    public final void a(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        this.b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C0223k(this.a, iAssetPackManagerDownloadStatusCallback, strArr));
    }

    public final void a(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        this.b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C0229m(this.a, iAssetPackManagerStatusQueryCallback, strArr));
    }

    public final void b(String str) {
        this.b.removePack(str);
    }
}
