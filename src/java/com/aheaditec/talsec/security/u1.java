package com.aheaditec.talsec.security;

import com.aheaditec.talsec.security.t1;
import java.nio.ByteBuffer;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class u1 {
    public final byte[] a;
    public final B0 b;

    public u1(B0 b0) {
        this.b = b0;
        this.a = b0.d();
    }

    public ByteBuffer a() {
        return ByteBuffer.wrap(this.a).asReadOnlyBuffer();
    }

    public final void b(int i, int i2) {
        byte[] bArr = this.a;
        bArr[i] = (byte) ((1 << i2) | bArr[i]);
    }

    public final void a(int i, int i2) {
        byte[] bArr = this.a;
        bArr[i] = (byte) ((~(1 << i2)) & bArr[i]);
    }

    public final void b() {
        this.b.a(this.a);
    }

    public void a(t1.a aVar, boolean z) {
        a(aVar.a, aVar.b, z);
    }

    public final void a(int i, int i2, boolean z) {
        if (z) {
            b(i, i2);
        } else {
            a(i, i2);
        }
        this.b.a(this.a);
    }
}
