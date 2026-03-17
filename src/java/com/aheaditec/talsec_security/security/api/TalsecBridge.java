package com.aheaditec.talsec_security.security.api;

import com.aheaditec.talsec.security.r1;
import java.nio.ByteBuffer;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public abstract class TalsecBridge {
    public static r1 a;

    public static ByteBuffer getTalsecFlags() {
        r1 r1Var = a;
        return r1Var == null ? ByteBuffer.wrap(new byte[0]) : r1Var.d();
    }
}
