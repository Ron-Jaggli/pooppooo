package com.unity3d.player;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
final class E1 {
    private static boolean e;
    private boolean a = false;
    private boolean b = false;
    private boolean c = true;
    private boolean d = false;

    E1() {
    }

    static boolean d() {
        return e;
    }

    static void e() {
        e = true;
    }

    static void f() {
        e = false;
    }

    final boolean a() {
        return this.d;
    }

    final boolean a(boolean z) {
        return e && !((!z && !this.a) || this.c || this.b);
    }

    final void b(boolean z) {
        this.a = z;
    }

    final boolean b() {
        return this.c;
    }

    final void c(boolean z) {
        this.b = z;
    }

    final boolean c() {
        return this.b;
    }

    final void d(boolean z) {
        this.d = z;
    }

    final void e(boolean z) {
        this.c = z;
    }

    public final String toString() {
        return super.toString();
    }
}
