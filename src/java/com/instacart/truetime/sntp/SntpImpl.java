package com.instacart.truetime.sntp;

import android.os.SystemClock;
import com.instacart.truetime.InvalidNtpServerResponseException;
import com.instacart.truetime.SntpEventListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class SntpImpl implements Sntp {
    private static final int INDEX_ORIGINATE_TIME = 24;
    private static final int INDEX_RECEIVE_TIME = 32;
    private static final int INDEX_ROOT_DELAY = 4;
    private static final int INDEX_ROOT_DISPERSION = 8;
    private static final int INDEX_TRANSMIT_TIME = 40;
    private static final int INDEX_VERSION = 0;
    private static final int NTP_MODE = 3;
    private static final int NTP_PACKET_SIZE = 48;
    private static final int NTP_PORT = 123;
    private static final int NTP_VERSION = 3;
    private static final long OFFSET_1900_TO_1970 = 2208988800L;
    public static final int RESPONSE_INDEX_DISPERSION = 5;
    public static final int RESPONSE_INDEX_ORIGINATE_TIME = 0;
    public static final int RESPONSE_INDEX_RECEIVE_TIME = 1;
    public static final int RESPONSE_INDEX_RESPONSE_TICKS = 7;
    public static final int RESPONSE_INDEX_RESPONSE_TIME = 3;
    public static final int RESPONSE_INDEX_ROOT_DELAY = 4;
    public static final int RESPONSE_INDEX_SIZE = 8;
    public static final int RESPONSE_INDEX_STRATUM = 6;
    public static final int RESPONSE_INDEX_TRANSMIT_TIME = 2;

    private double doubleMillis(long j) {
        return j / 65.536d;
    }

    private int ui(byte b) {
        return b & 255;
    }

    @Override // com.instacart.truetime.sntp.Sntp
    public long roundTripDelay(long[] jArr) {
        return (jArr[3] - jArr[0]) - (jArr[2] - jArr[1]);
    }

    @Override // com.instacart.truetime.sntp.Sntp
    public long clockOffset(long[] jArr) {
        return ((jArr[1] - jArr[0]) + (jArr[2] - jArr[3])) / 2;
    }

    @Override // com.instacart.truetime.sntp.Sntp
    public long trueTime(long[] jArr) {
        return jArr[3] + clockOffset(jArr);
    }

    @Override // com.instacart.truetime.sntp.Sntp
    public long timeSinceBoot(long[] jArr) {
        return jArr[7];
    }

    @Override // com.instacart.truetime.sntp.Sntp
    public synchronized long[] requestTime(InetAddress inetAddress, float f, float f2, int i, int i2, SntpEventListener sntpEventListener) throws IOException {
        DatagramSocket datagramSocket;
        long[] jArr;
        sntpEventListener.sntpRequest(inetAddress);
        DatagramSocket datagramSocket2 = null;
        try {
            try {
                datagramSocket = new DatagramSocket();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            datagramSocket.setSoTimeout(i2);
            byte[] bArr = new byte[NTP_PACKET_SIZE];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, NTP_PACKET_SIZE, inetAddress, NTP_PORT);
            writeNtpVersion(bArr);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            writeTimeStamp(bArr, INDEX_TRANSMIT_TIME, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            jArr = new long[8];
            datagramSocket.receive(new DatagramPacket(bArr, NTP_PACKET_SIZE));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            jArr[7] = jElapsedRealtime2;
            long timeStamp = readTimeStamp(bArr, INDEX_ORIGINATE_TIME);
            long timeStamp2 = readTimeStamp(bArr, 32);
            long timeStamp3 = readTimeStamp(bArr, INDEX_TRANSMIT_TIME);
            long j = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            jArr[0] = timeStamp;
            jArr[1] = timeStamp2;
            jArr[2] = timeStamp3;
            jArr[3] = j;
            long j2 = read(bArr, 4);
            jArr[4] = j2;
            double dDoubleMillis = doubleMillis(j2);
            if (dDoubleMillis > f) {
                throw new InvalidNtpServerResponseException("Invalid response from NTP server. %s violation. %f [actual] > %f [expected]", "root_delay", (float) dDoubleMillis, f);
            }
            long j3 = read(bArr, 8);
            jArr[5] = j3;
            double dDoubleMillis2 = doubleMillis(j3);
            if (dDoubleMillis2 > f2) {
                throw new InvalidNtpServerResponseException("Invalid response from NTP server. %s violation. %f [actual] > %f [expected]", "root_dispersion", (float) dDoubleMillis2, f2);
            }
            byte b = bArr[0];
            byte b2 = (byte) (b & 7);
            if (b2 != 4 && b2 != 5) {
                throw new InvalidNtpServerResponseException("untrusted mode value for TrueTime: " + ((int) b2));
            }
            int i3 = bArr[1] & 255;
            jArr[6] = i3;
            if (i3 < 1 || i3 > 15) {
                throw new InvalidNtpServerResponseException("untrusted stratum value for TrueTime: " + i3);
            }
            if (((byte) ((b >> 6) & 3)) == 3) {
                throw new InvalidNtpServerResponseException("unsynchronized server responded for TrueTime");
            }
            double dAbs = Math.abs((j - timeStamp) - (timeStamp3 - timeStamp2));
            if (dAbs >= i) {
                throw new InvalidNtpServerResponseException("%s too large for comfort %f [actual] >= %f [expected]", "server_response_delay", (float) dAbs, i);
            }
            long jAbs = Math.abs(timeStamp - System.currentTimeMillis());
            if (jAbs >= 10000) {
                throw new InvalidNtpServerResponseException("Request was sent more than 10 seconds back " + jAbs);
            }
            sntpEventListener.sntpRequestSuccessful(inetAddress);
            datagramSocket.close();
        } catch (Exception e2) {
            e = e2;
            sntpEventListener.sntpRequestFailed(inetAddress, e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            datagramSocket2 = datagramSocket;
            if (datagramSocket2 != null) {
                datagramSocket2.close();
            }
            throw th;
        }
        return jArr;
    }

    private void writeNtpVersion(byte[] bArr) {
        bArr[0] = 27;
    }

    private void writeTimeStamp(byte[] bArr, int i, long j) {
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + OFFSET_1900_TO_1970;
        bArr[i] = (byte) (j4 >> 24);
        bArr[i + 1] = (byte) (j4 >> 16);
        bArr[i + 2] = (byte) (j4 >> 8);
        bArr[i + 3] = (byte) j4;
        long j5 = (j3 * 4294967296L) / 1000;
        bArr[i + 4] = (byte) (j5 >> 24);
        bArr[i + 5] = (byte) (j5 >> 16);
        bArr[i + 6] = (byte) (j5 >> 8);
        bArr[i + 7] = (byte) (Math.random() * 255.0d);
    }

    private long readTimeStamp(byte[] bArr, int i) {
        return ((read(bArr, i) - OFFSET_1900_TO_1970) * 1000) + ((read(bArr, i + 4) * 1000) / 4294967296L);
    }

    private long read(byte[] bArr, int i) {
        return (((long) ui(bArr[i])) << 24) + (((long) ui(bArr[i + 1])) << 16) + (((long) ui(bArr[i + 2])) << 8) + ((long) ui(bArr[i + 3]));
    }
}
