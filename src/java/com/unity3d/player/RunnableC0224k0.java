package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: renamed from: com.unity3d.player.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class RunnableC0224k0 implements Runnable {
    final /* synthetic */ Semaphore a;
    final /* synthetic */ UnityAccessibilityDelegate b;

    RunnableC0224k0(UnityAccessibilityDelegate unityAccessibilityDelegate, Semaphore semaphore) {
        this.b = unityAccessibilityDelegate;
        this.a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UnityAccessibilityDelegate unityAccessibilityDelegate = this.b;
            if (unityAccessibilityDelegate.c != null) {
                unityAccessibilityDelegate.d = new AccessibilityManagerAccessibilityStateChangeListenerC0252u0(unityAccessibilityDelegate);
            }
            UnityAccessibilityDelegate unityAccessibilityDelegate2 = this.b;
            if (unityAccessibilityDelegate2.e != null) {
                unityAccessibilityDelegate2.f = new C0256w0(this.b);
            }
        } finally {
            this.a.release();
        }
    }
}
