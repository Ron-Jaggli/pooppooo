package com.unity3d.player;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class C0248s0 extends AccessibilityNodeProvider {
    final /* synthetic */ UnityAccessibilityDelegate a;

    C0248s0(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.a = unityAccessibilityDelegate;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        if (i != -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            if (UnityAccessibilityDelegate.populateNodeInfo(accessibilityNodeInfoObtain, i, this.a.b)) {
                return accessibilityNodeInfoObtain;
            }
            return null;
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(this.a.b);
        Object parent = this.a.b.getParent();
        if (parent instanceof View) {
            accessibilityNodeInfoObtain2.setParent((View) parent);
        }
        int[] rootNodeIds = UnityAccessibilityDelegate.getRootNodeIds();
        if (rootNodeIds != null) {
            for (int i2 : rootNodeIds) {
                accessibilityNodeInfoObtain2.addChild(this.a.b, i2);
            }
        }
        return accessibilityNodeInfoObtain2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        UnityAccessibilityDelegate unityAccessibilityDelegate;
        int i3;
        if (i2 == 64) {
            unityAccessibilityDelegate = this.a;
            i3 = 32768;
        } else {
            if (i2 != 128) {
                if (i2 == 16) {
                    if (!UnityAccessibilityDelegate.isNodeSelectable(i)) {
                        return false;
                    }
                    UnityPlayer unityPlayer = this.a.a;
                    Objects.requireNonNull(unityPlayer);
                    this.a.a.invokeOnMainThread((Runnable) new C0239p0(this, unityPlayer, i));
                    return true;
                }
                if (i2 == 4096 || i2 == 8192) {
                    UnityPlayer unityPlayer2 = this.a.a;
                    Objects.requireNonNull(unityPlayer2);
                    this.a.a.invokeOnMainThread((Runnable) new C0242q0(this, unityPlayer2, i2, i));
                    return true;
                }
                if (i2 != 1048576 || !UnityAccessibilityDelegate.isNodeDismissable(i)) {
                    return false;
                }
                UnityPlayer unityPlayer3 = this.a.a;
                Objects.requireNonNull(unityPlayer3);
                this.a.a.invokeOnMainThread((Runnable) new C0245r0(unityPlayer3, i));
                return true;
            }
            unityAccessibilityDelegate = this.a;
            i3 = 65536;
        }
        return unityAccessibilityDelegate.sendEventForVirtualViewId(i, i3);
    }
}
