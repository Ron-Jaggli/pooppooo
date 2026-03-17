package com.unity3d.player;

import android.view.accessibility.AccessibilityManager;
import java.util.Objects;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class AccessibilityManagerAccessibilityStateChangeListenerC0252u0 implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    final /* synthetic */ UnityAccessibilityDelegate a;

    AccessibilityManagerAccessibilityStateChangeListenerC0252u0(UnityAccessibilityDelegate unityAccessibilityDelegate) {
        this.a = unityAccessibilityDelegate;
        unityAccessibilityDelegate.c.addAccessibilityStateChangeListener(this);
        unityAccessibilityDelegate.c.addTouchExplorationStateChangeListener(this);
        if (unityAccessibilityDelegate.c.isEnabled()) {
            onAccessibilityStateChanged(true);
        }
    }

    protected void cleanup() {
        this.a.c.removeAccessibilityStateChangeListener(this);
        this.a.c.removeTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        if (!z) {
            this.a.b.setAccessibilityDelegate(null);
            this.a.b.setWillNotDraw(true);
            onTouchExplorationStateChanged(false);
        } else {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.a;
            unityAccessibilityDelegate.b.setAccessibilityDelegate(unityAccessibilityDelegate);
            this.a.b.setWillNotDraw(false);
            onTouchExplorationStateChanged(this.a.c.isTouchExplorationEnabled());
        }
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        boolean z2 = this.a.c.isEnabled() && z;
        UnityAccessibilityDelegate unityAccessibilityDelegate = this.a;
        if (z2) {
            unityAccessibilityDelegate.b.setOnHoverListener(new ViewOnHoverListenerC0258x0(unityAccessibilityDelegate));
        } else {
            unityAccessibilityDelegate.b.setOnHoverListener(null);
        }
        UnityAccessibilityDelegate unityAccessibilityDelegate2 = this.a;
        if (unityAccessibilityDelegate2.i == z2) {
            return;
        }
        unityAccessibilityDelegate2.i = z2;
        UnityPlayer unityPlayer = unityAccessibilityDelegate2.a;
        Objects.requireNonNull(unityPlayer);
        this.a.a.invokeOnMainThread((Runnable) new C0250t0(unityPlayer, z2));
    }
}
