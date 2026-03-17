package com.fingerprintjs.android.fingerprint.tools.hashers;

import com.aheaditec.talsec.security.P0;
import com.instacart.truetime.sntp.SntpImpl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/7.dex
 */
/* JADX INFO: compiled from: MurMur3x64x128Hasher.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/tools/hashers/MurMur3x64x128Hasher;", "Lcom/fingerprintjs/android/fingerprint/tools/hashers/Hasher;", "()V", "X64_128_C1", "", "X64_128_C2", "fmix64", "kPrev", "hash", "", "data", "hash_x64_128", "", "", "length", "", "seed", "mixK1", "k1Prev", "mixK2", "k2Prev", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MurMur3x64x128Hasher implements Hasher {
    private final long X64_128_C1 = -8663945395140668459L;
    private final long X64_128_C2 = 5545529020109919103L;

    private final long fmix64(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    @Override // com.fingerprintjs.android.fingerprint.tools.hashers.Hasher
    public String hash(String str) {
        Intrinsics.checkNotNullParameter(str, "data");
        byte[] bytes = str.getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        long[] jArrHash_x64_128$default = hash_x64_128$default(this, bytes, str.length(), 0L, 4, null);
        StringBuilder sb = new StringBuilder();
        for (long j : jArrHash_x64_128$default) {
            sb.append(Long.toHexString(j));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    static /* synthetic */ long[] hash_x64_128$default(MurMur3x64x128Hasher murMur3x64x128Hasher, byte[] bArr, int i, long j, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = 0;
        }
        return murMur3x64x128Hasher.hash_x64_128(bArr, i, j);
    }

    private final long[] hash_x64_128(byte[] bArr, int i, long j) {
        long j2;
        long j3;
        byte b;
        long j4;
        byte b2;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        long jMixK1 = j;
        long jMixK2 = jMixK1;
        while (byteBufferWrap.remaining() >= 16) {
            long j5 = byteBufferWrap.getLong();
            long j6 = byteBufferWrap.getLong();
            long j7 = 5;
            jMixK1 = ((Long.rotateLeft(jMixK1 ^ mixK1(j5), 27) + jMixK2) * j7) + ((long) 1390208809);
            jMixK2 = ((Long.rotateLeft(jMixK2 ^ mixK2(j6), 31) + jMixK1) * j7) + ((long) 944331445);
        }
        byteBufferWrap.compact();
        byteBufferWrap.flip();
        if (byteBufferWrap.remaining() > 0) {
            long j8 = 0;
            switch (byteBufferWrap.remaining()) {
                case 1:
                    j2 = ((long) byteBufferWrap.get(0)) & 255;
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case 2:
                    j3 = (((long) byteBufferWrap.get(1)) & 255) << 8;
                    b = byteBufferWrap.get(0);
                    j2 = j3 ^ (((long) b) & 255);
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case 3:
                    j3 = ((((long) byteBufferWrap.get(2)) & 255) << 16) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b = byteBufferWrap.get(0);
                    j2 = j3 ^ (((long) b) & 255);
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case 4:
                    j4 = (((((long) byteBufferWrap.get(3)) & 255) << 24) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b2 = byteBufferWrap.get(0);
                    j2 = j4 ^ (((long) b2) & 255);
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case SntpImpl.RESPONSE_INDEX_DISPERSION /* 5 */:
                    j4 = ((((((long) byteBufferWrap.get(4)) & 255) << 32) ^ ((((long) byteBufferWrap.get(3)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b2 = byteBufferWrap.get(0);
                    j2 = j4 ^ (((long) b2) & 255);
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case SntpImpl.RESPONSE_INDEX_STRATUM /* 6 */:
                    j4 = (((((((long) byteBufferWrap.get(5)) & 255) << 40) ^ ((((long) byteBufferWrap.get(4)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(3)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b2 = byteBufferWrap.get(0);
                    j2 = j4 ^ (((long) b2) & 255);
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case SntpImpl.RESPONSE_INDEX_RESPONSE_TICKS /* 7 */:
                    j4 = ((((((((long) byteBufferWrap.get(5)) & 255) << 40) ^ ((((long) byteBufferWrap.get(6)) & 255) << 48)) ^ ((((long) byteBufferWrap.get(4)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(3)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b2 = byteBufferWrap.get(0);
                    j2 = j4 ^ (((long) b2) & 255);
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case 8:
                    j2 = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case 9:
                    j8 = ((long) byteBufferWrap.get(8)) & 255;
                    j2 = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case 10:
                    j8 = ((((long) byteBufferWrap.get(9)) & 255) << 8) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j2 = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case 11:
                    j8 = (((((long) byteBufferWrap.get(10)) & 255) << 16) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j2 = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case 12:
                    j8 = ((((((long) byteBufferWrap.get(11)) & 255) << 24) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j2 = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case 13:
                    j8 = (((((((long) byteBufferWrap.get(12)) & 255) << 32) ^ ((((long) byteBufferWrap.get(11)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j2 = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case 14:
                    j8 = ((((((((long) byteBufferWrap.get(13)) & 255) << 40) ^ ((((long) byteBufferWrap.get(12)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(11)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j2 = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                case P0.s /* 15 */:
                    j8 = (((((((((long) byteBufferWrap.get(14)) & 255) << 48) ^ ((((long) byteBufferWrap.get(13)) & 255) << 40)) ^ ((((long) byteBufferWrap.get(12)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(11)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j2 = byteBufferWrap.getLong();
                    jMixK1 ^= mixK1(j2);
                    jMixK2 ^= mixK2(j8);
                    break;
                default:
                    throw new AssertionError("Code should not reach here!");
            }
        }
        long j9 = i;
        long j10 = jMixK2 ^ j9;
        long j11 = (jMixK1 ^ j9) + j10;
        long j12 = j10 + j11;
        long jFmix64 = fmix64(j11);
        long jFmix642 = fmix64(j12);
        long j13 = jFmix64 + jFmix642;
        return new long[]{j13, jFmix642 + j13};
    }

    private final long mixK1(long j) {
        return Long.rotateLeft(j * this.X64_128_C1, 31) * this.X64_128_C2;
    }

    private final long mixK2(long j) {
        return Long.rotateLeft(j * this.X64_128_C2, 33) * this.X64_128_C1;
    }
}
