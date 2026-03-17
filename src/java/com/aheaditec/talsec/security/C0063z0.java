package com.aheaditec.talsec.security;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/2.dex
 */
/* JADX INFO: renamed from: com.aheaditec.talsec.security.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class C0063z0 extends AbstractC0034k1 {
    public static final String A;
    public final Set<String> z;

    static {
        byte[] bArr = {124, -35, -45, 71, -100, 21, -76, 112, 59, -70, -15, 58, 40, 28, 16, 100, 55};
        c(bArr, new byte[]{29, -66, -80, 34, -17, 102, -35, 18, 82, -42, -104, 78, 81, 93, 96, 20, 68});
        A = new String(bArr, StandardCharsets.UTF_8).intern();
    }

    public C0063z0(InterfaceC0057w0 interfaceC0057w0, C0028i1 c0028i1, U u, Set<String> set, String str, boolean z) {
        super(interfaceC0057w0, c0028i1, u, str, z);
        this.z = set;
    }

    public static Set<String> a(Context context) {
        ServiceInfo serviceInfo;
        ApplicationInfo applicationInfo;
        byte[] bArr = {-91, 89, 109, 60, 18, 9, 93, 86, -109, -127, -14, 19, -22};
        c(bArr, new byte[]{-60, 58, 14, 89, 97, 122, 52, 52, -6, -19, -101, 103, -109});
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService(new String(bArr, StandardCharsets.UTF_8).intern());
        if (accessibilityManager == null) {
            return new HashSet();
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        if (enabledAccessibilityServiceList == null || enabledAccessibilityServiceList.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet(enabledAccessibilityServiceList.size());
        Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = it.next().getResolveInfo();
            if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && (applicationInfo = serviceInfo.applicationInfo) != null) {
                hashSet.add(applicationInfo.packageName);
            }
        }
        return hashSet;
    }

    @Override // com.aheaditec.talsec.security.AbstractC0034k1, com.aheaditec.talsec.security.I
    public JSONObject c() throws JSONException {
        JSONObject jSONObjectC = super.c();
        if (this.z != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = this.z.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            byte[] bArr = {53, 59, -113, 73, -120, -45, -126, -18, -76, -124, 84, 78, 16, 84, 11, -97, 48};
            c(bArr, new byte[]{84, 88, -20, 44, -5, -96, -21, -116, -35, -24, 61, 58, 105, 21, 123, -17, 67});
            jSONObjectC.put(new String(bArr, StandardCharsets.UTF_8).intern(), jSONArray);
        }
        return jSONObjectC;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void c(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = null;
        int i2 = -585497720;
        int i3 = 0;
        int i4 = 0;
        int length = 0;
        byte[] bArr4 = null;
        while (true) {
            int i5 = ((i2 & 16777216) * (i2 | 16777216)) + ((i2 & (-16777217)) * ((~i2) & 16777216));
            int i6 = i2 >>> 8;
            int i7 = ~((((~i6) | (-238348293)) | i5) - ((i6 & (-238348293)) | i5));
            int i8 = (-1081514022) - ((i7 & 2) | ((-10362931) - i7));
            int iA = y1.a(i8 | (-428181225), 2, i8, -428181225);
            int i9 = -1057239115;
            switch (iA) {
                case -1819084085:
                    int length2 = bArr3.length;
                    int i10 = 0 - i3;
                    int length3 = bArr3.length;
                    int i11 = 0 - i10;
                    byte b = bArr3[(length3 & (~i11)) - ((~length3) & i11)];
                    int length4 = bArr3.length;
                    byte b2 = bArr4[((length4 | i10) - (((-1678010279) & (~i10)) & length4)) + ((i10 | (-1678010279)) & length4)];
                    bArr3[((length2 | i10) * 2) - (length2 ^ i10)] = (byte) (((byte) (((byte) (((byte) 2) * ((byte) (b2 | b)))) - b2)) - b);
                    length = 4 - ((5 - i3) | (i3 & 2));
                    int i12 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                    int i13 = i12 != 0 ? 2100390411 : -897645243;
                    if (i12 == 0) {
                        i = -2079636786;
                        i2 = i;
                    } else {
                        i2 = i13;
                    }
                    break;
                case -1350640889:
                    int length5 = bArr.length;
                    int length6 = 0 - (bArr.length % 4);
                    boolean z = ((length5 | length6) - ((942778902 & (~length6)) & length5)) + ((length6 | 942778902) & length5) > 0;
                    i = z ? -1469476344 : z ? -897645243 : 1251644638;
                    bArr4 = bArr2;
                    bArr3 = bArr;
                    i4 = 0;
                    i2 = i;
                    break;
                case -477594107:
                    int length7 = bArr3.length;
                    int i14 = 0 - i3;
                    int i15 = ((length7 | i14) - (((-515406864) & (~i14)) & length7)) + ((i14 | (-515406864)) & length7);
                    byte b3 = bArr4[i15];
                    int length8 = bArr3.length;
                    byte b4 = bArr4[((i14 | length8) * 2) - (length8 ^ i14)];
                    int i16 = ((byte) 0) - b3;
                    int i17 = i16 | b4;
                    bArr4[i15] = (byte) (((byte) (((byte) i17) - ((byte) (((byte) 2) * ((byte) i16))))) + ((byte) ((b4 ^ i16) ^ i17)));
                    i2 = i9;
                    break;
                case 769572960:
                    break;
                case 783648904:
                    int i18 = i4 + 4 + (((-1) - i4) | (-4));
                    byte b5 = bArr4[i18];
                    int i19 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
                    int i20 = i4 & 2;
                    int i21 = (i4 + 2) - i20;
                    int i22 = bArr4[i21] & 255;
                    int i23 = i22 * ((~i22) & 65536);
                    int i24 = ~(((467314697 | (~i23)) | i19) - ((i23 & 467314697) | i19));
                    int i25 = (i4 + 1) - (i4 & 1);
                    int i26 = bArr4[i25] & 255;
                    int i27 = i26 * ((~i26) & 256);
                    int i28 = ~((i24 | ((~i27) | 1328859631)) - ((i27 & 1328859631) | i24));
                    int i29 = bArr4[i4] & 255;
                    int iA2 = J.a(i28, i29, 1, ((-1) - i28) | ((-1) - i29));
                    byte b6 = bArr3[i18];
                    int i30 = ((b6 & 16777216) * (b6 | 16777216)) + (((-16777217) & b6) * ((~b6) & 16777216));
                    int i31 = bArr3[i21] & 255;
                    int i32 = i31 * ((~i31) & 65536);
                    int iA3 = K.a((~i30) & 1647046022 & i32, i32, i30, (1647046022 | i30) & i32);
                    int i33 = bArr3[i25] & 255;
                    int i34 = i33 * ((~i33) & 256);
                    int i35 = ~((iA3 | ((~i34) | (-2059442874))) - (((-2059442874) & i34) | iA3));
                    int i36 = bArr3[i4] & 255;
                    int iA4 = J.a(i35, i36, 1, ((-1) - i35) | ((-1) - i36));
                    int i37 = iA2 << ((iA2 > Double.NaN ? 1 : (iA2 == Double.NaN ? 0 : -1)) >>> 31);
                    int i38 = (i37 + iA4) - ((i37 & iA4) * 2);
                    bArr3[i4] = (byte) i38;
                    bArr3[i25] = (byte) (i38 >>> 8);
                    bArr3[i21] = (byte) (i38 >>> 16);
                    bArr3[i18] = (byte) (i38 >>> 24);
                    i4 = (-11) - (((-15) - i4) | i20);
                    int length9 = bArr3.length;
                    int iA5 = C0001a.a(bArr3.length, 4, 0, 0);
                    int i39 = ((i4 > (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 1 : (i4 == (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 0 : -1)) >>> 31) & 1;
                    i2 = i39 != 0 ? -897645243 : 1251644638;
                    if (i39 != 0) {
                        i2 = -1469476344;
                    }
                    break;
                case 1758587480:
                    int length10 = bArr3.length;
                    int i40 = 0 - length;
                    i2 = (((double) ((byte) bArr4[((length10 | i40) - (((~i40) & 822835569) & length10)) + ((822835569 | i40) & length10)])) > Double.NaN ? 1 : (((double) ((byte) bArr4[((length10 | i40) - (((~i40) & 822835569) & length10)) + ((822835569 | i40) & length10)])) == Double.NaN ? 0 : -1)) > -1 ? -1057239115 : -897645243;
                    i3 = length;
                    break;
                case 2013813686:
                    length = bArr3.length % 4;
                    int i41 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i9 = i41 != 0 ? 2100390411 : -897645243;
                    if (i41 == 0) {
                        i = -2079636786;
                        i2 = i;
                    } else {
                        i2 = i9;
                    }
                    break;
                default:
                    i2 = -897645243;
                    break;
            }
            return;
        }
    }
}
