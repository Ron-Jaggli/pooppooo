package com.fingerprintjs.android.fingerprint.fingerprinting_signals;

import com.fingerprintjs.android.fingerprint.Fingerprinter;
import com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignal;
import com.fingerprintjs.android.fingerprint.info_providers.BatteryInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.CameraInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.CodecInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.CpuInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.DevicePersonalizationInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.DeviceSecurityInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.FingerprintSensorInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.GpuInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.InputDeviceDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.MediaCodecInfo;
import com.fingerprintjs.android.fingerprint.info_providers.MemInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.OsBuildInfoProvider;
import com.fingerprintjs.android.fingerprint.info_providers.PackageManagerDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.SensorDataSource;
import com.fingerprintjs.android.fingerprint.info_providers.SettingsDataSource;
import com.fingerprintjs.android.fingerprint.signal_providers.StabilityLevel;
import com.fingerprintjs.android.fingerprint.tools.FingerprintingLegacySchemeSupportExtensions;
import com.fingerprintjs.android.fingerprint.tools.SignalsUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/4.dex
 */
/* JADX INFO: compiled from: FingerprintingSignalsProvider.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u0086\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001By\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ)\u0010\u0099\u0002\u001a\u000e\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u009b\u00020\u009a\u00022\b\u0010\u009c\u0002\u001a\u00030\u009d\u00022\b\u0010\u009e\u0002\u001a\u00030\u009f\u0002H\u0007R\u001b\u0010\u001f\u001a\u00020 8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u0002058GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b6\u00107R\u001b\u00109\u001a\u00020:8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b;\u0010<R\u001b\u0010>\u001a\u00020?8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010$\u001a\u0004\b@\u0010AR\u001b\u0010C\u001a\u00020D8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010$\u001a\u0004\bE\u0010FR\u001b\u0010H\u001a\u00020I8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010$\u001a\u0004\bJ\u0010KR\u001b\u0010M\u001a\u00020N8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010$\u001a\u0004\bO\u0010PR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010R\u001a\u00020S8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bV\u0010$\u001a\u0004\bT\u0010UR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010W\u001a\u00020X8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b[\u0010$\u001a\u0004\bY\u0010ZR\u001b\u0010\\\u001a\u00020]8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b`\u0010$\u001a\u0004\b^\u0010_R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010a\u001a\u00020b8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\be\u0010$\u001a\u0004\bc\u0010dR\u001b\u0010f\u001a\u00020g8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bj\u0010$\u001a\u0004\bh\u0010iR\u001b\u0010k\u001a\u00020l8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bo\u0010$\u001a\u0004\bm\u0010nR\u001b\u0010p\u001a\u00020q8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bt\u0010$\u001a\u0004\br\u0010sR\u001b\u0010u\u001a\u00020v8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\by\u0010$\u001a\u0004\bw\u0010xR\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010z\u001a\u00020{8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b~\u0010$\u001a\u0004\b|\u0010}R\u001f\u0010\u007f\u001a\u00030\u0080\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010$\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0084\u0001\u001a\u00030\u0085\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010$\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u0089\u0001\u001a\u00030\u008a\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010$\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u008e\u0001\u001a\u00030\u008f\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0092\u0001\u0010$\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R \u0010\u0093\u0001\u001a\u00030\u0094\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0097\u0001\u0010$\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0098\u0001\u001a\u00030\u0099\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010$\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u009d\u0001\u001a\u00030\u009e\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¡\u0001\u0010$\u001a\u0006\b\u009f\u0001\u0010 \u0001R \u0010¢\u0001\u001a\u00030£\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¦\u0001\u0010$\u001a\u0006\b¤\u0001\u0010¥\u0001R \u0010§\u0001\u001a\u00030¨\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bª\u0001\u0010$\u001a\u0006\b§\u0001\u0010©\u0001R \u0010«\u0001\u001a\u00030¬\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¯\u0001\u0010$\u001a\u0006\b\u00ad\u0001\u0010®\u0001R \u0010°\u0001\u001a\u00030±\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b´\u0001\u0010$\u001a\u0006\b²\u0001\u0010³\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010µ\u0001\u001a\u00030¶\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¹\u0001\u0010$\u001a\u0006\b·\u0001\u0010¸\u0001R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010º\u0001\u001a\u00030»\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b¾\u0001\u0010$\u001a\u0006\b¼\u0001\u0010½\u0001R \u0010¿\u0001\u001a\u00030À\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bÃ\u0001\u0010$\u001a\u0006\bÁ\u0001\u0010Â\u0001R \u0010Ä\u0001\u001a\u00030Å\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bÈ\u0001\u0010$\u001a\u0006\bÆ\u0001\u0010Ç\u0001R \u0010É\u0001\u001a\u00030Ê\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bÍ\u0001\u0010$\u001a\u0006\bË\u0001\u0010Ì\u0001R \u0010Î\u0001\u001a\u00030Ï\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bÒ\u0001\u0010$\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R \u0010Ó\u0001\u001a\u00030Ô\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b×\u0001\u0010$\u001a\u0006\bÕ\u0001\u0010Ö\u0001R \u0010Ø\u0001\u001a\u00030Ù\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bÜ\u0001\u0010$\u001a\u0006\bÚ\u0001\u0010Û\u0001R \u0010Ý\u0001\u001a\u00030Þ\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bá\u0001\u0010$\u001a\u0006\bß\u0001\u0010à\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010â\u0001\u001a\u00030ã\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bæ\u0001\u0010$\u001a\u0006\bä\u0001\u0010å\u0001R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010ç\u0001\u001a\u00030è\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bë\u0001\u0010$\u001a\u0006\bé\u0001\u0010ê\u0001R \u0010ì\u0001\u001a\u00030í\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bð\u0001\u0010$\u001a\u0006\bî\u0001\u0010ï\u0001R \u0010ñ\u0001\u001a\u00030ò\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bõ\u0001\u0010$\u001a\u0006\bó\u0001\u0010ô\u0001R \u0010ö\u0001\u001a\u00030÷\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bú\u0001\u0010$\u001a\u0006\bø\u0001\u0010ù\u0001R \u0010û\u0001\u001a\u00030ü\u00018GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bÿ\u0001\u0010$\u001a\u0006\bý\u0001\u0010þ\u0001R \u0010\u0080\u0002\u001a\u00030\u0081\u00028GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0084\u0002\u0010$\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R \u0010\u0085\u0002\u001a\u00030\u0086\u00028GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0089\u0002\u0010$\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002R \u0010\u008a\u0002\u001a\u00030\u008b\u00028GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u008e\u0002\u0010$\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002R \u0010\u008f\u0002\u001a\u00030\u0090\u00028GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0093\u0002\u0010$\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R \u0010\u0094\u0002\u001a\u00030\u0095\u00028GX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0002\u0010$\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002¨\u0006 \u0002"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignalsProvider;", "", "cpuInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProvider;", "memInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProvider;", "sensorsDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSource;", "inputDeviceDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceDataSource;", "batteryInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProvider;", "cameraInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProvider;", "gpuInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/GpuInfoProvider;", "osBuildInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;", "codecInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProvider;", "deviceSecurityInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;", "packageManagerDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSource;", "settingsDataSource", "Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;", "devicePersonalizationInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProvider;", "fingerprintSensorInfoProvider", "Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProvider;", "(Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/MemInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/SensorDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/InputDeviceDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/BatteryInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/CameraInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/GpuInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/OsBuildInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/CodecInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/DeviceSecurityInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/PackageManagerDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/SettingsDataSource;Lcom/fingerprintjs/android/fingerprint/info_providers/DevicePersonalizationInfoProvider;Lcom/fingerprintjs/android/fingerprint/info_providers/FingerprintSensorInfoProvider;)V", "abiTypeSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AbiTypeSignal;", "getAbiTypeSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AbiTypeSignal;", "abiTypeSignal$delegate", "Lkotlin/Lazy;", "accessibilityEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AccessibilityEnabledSignal;", "getAccessibilityEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AccessibilityEnabledSignal;", "accessibilityEnabledSignal$delegate", "adbEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AdbEnabledSignal;", "getAdbEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AdbEnabledSignal;", "adbEnabledSignal$delegate", "alarmAlertPathSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AlarmAlertPathSignal;", "getAlarmAlertPathSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AlarmAlertPathSignal;", "alarmAlertPathSignal$delegate", "androidVersionSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AndroidVersionSignal;", "getAndroidVersionSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AndroidVersionSignal;", "androidVersionSignal$delegate", "applicationsListSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ApplicationsListSignal;", "getApplicationsListSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ApplicationsListSignal;", "applicationsListSignal$delegate", "availableLocalesSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AvailableLocalesSignal;", "getAvailableLocalesSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/AvailableLocalesSignal;", "availableLocalesSignal$delegate", "batteryFullCapacitySignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacitySignal;", "getBatteryFullCapacitySignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacitySignal;", "batteryFullCapacitySignal$delegate", "batteryFullCapacityV2Signal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacityV2Signal;", "getBatteryFullCapacityV2Signal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryFullCapacityV2Signal;", "batteryFullCapacityV2Signal$delegate", "batteryHealthSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryHealthSignal;", "getBatteryHealthSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/BatteryHealthSignal;", "batteryHealthSignal$delegate", "cameraListSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CameraListSignal;", "getCameraListSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CameraListSignal;", "cameraListSignal$delegate", "codecListSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CodecListSignal;", "getCodecListSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CodecListSignal;", "codecListSignal$delegate", "coresCountSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CoresCountSignal;", "getCoresCountSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/CoresCountSignal;", "coresCountSignal$delegate", "dataRoamingEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DataRoamingEnabledSignal;", "getDataRoamingEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DataRoamingEnabledSignal;", "dataRoamingEnabledSignal$delegate", "dateFormatSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DateFormatSignal;", "getDateFormatSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DateFormatSignal;", "dateFormatSignal$delegate", "defaultInputMethodSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultInputMethodSignal;", "getDefaultInputMethodSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultInputMethodSignal;", "defaultInputMethodSignal$delegate", "defaultLanguageSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultLanguageSignal;", "getDefaultLanguageSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DefaultLanguageSignal;", "defaultLanguageSignal$delegate", "developmentSettingsEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DevelopmentSettingsEnabledSignal;", "getDevelopmentSettingsEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/DevelopmentSettingsEnabledSignal;", "developmentSettingsEnabledSignal$delegate", "encryptionStatusSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EncryptionStatusSignal;", "getEncryptionStatusSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EncryptionStatusSignal;", "encryptionStatusSignal$delegate", "endButtonBehaviourSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EndButtonBehaviourSignal;", "getEndButtonBehaviourSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/EndButtonBehaviourSignal;", "endButtonBehaviourSignal$delegate", "fingerprintSensorStatusSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSensorStatusSignal;", "getFingerprintSensorStatusSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSensorStatusSignal;", "fingerprintSensorStatusSignal$delegate", "fingerprintSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSignal;", "getFingerprintSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintSignal;", "fingerprintSignal$delegate", "fontScaleSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FontScaleSignal;", "getFontScaleSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FontScaleSignal;", "fontScaleSignal$delegate", "glesVersionSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/GlesVersionSignal;", "getGlesVersionSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/GlesVersionSignal;", "glesVersionSignal$delegate", "httpProxySignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/HttpProxySignal;", "getHttpProxySignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/HttpProxySignal;", "httpProxySignal$delegate", "inputDevicesSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesSignal;", "getInputDevicesSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesSignal;", "inputDevicesSignal$delegate", "inputDevicesV2Signal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesV2Signal;", "getInputDevicesV2Signal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/InputDevicesV2Signal;", "inputDevicesV2Signal$delegate", "isPinSecurityEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/IsPinSecurityEnabledSignal;", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/IsPinSecurityEnabledSignal;", "isPinSecurityEnabledSignal$delegate", "kernelVersionSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/KernelVersionSignal;", "getKernelVersionSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/KernelVersionSignal;", "kernelVersionSignal$delegate", "manufacturerNameSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ManufacturerNameSignal;", "getManufacturerNameSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ManufacturerNameSignal;", "manufacturerNameSignal$delegate", "modelNameSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ModelNameSignal;", "getModelNameSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ModelNameSignal;", "modelNameSignal$delegate", "procCpuInfoSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoSignal;", "getProcCpuInfoSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoSignal;", "procCpuInfoSignal$delegate", "procCpuInfoV2Signal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoV2Signal;", "getProcCpuInfoV2Signal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ProcCpuInfoV2Signal;", "procCpuInfoV2Signal$delegate", "regionCountrySignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RegionCountrySignal;", "getRegionCountrySignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RegionCountrySignal;", "regionCountrySignal$delegate", "ringtoneSourceSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RingtoneSourceSignal;", "getRingtoneSourceSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RingtoneSourceSignal;", "ringtoneSourceSignal$delegate", "rttCallingModeSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RttCallingModeSignal;", "getRttCallingModeSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/RttCallingModeSignal;", "rttCallingModeSignal$delegate", "screenOffTimeoutSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ScreenOffTimeoutSignal;", "getScreenOffTimeoutSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/ScreenOffTimeoutSignal;", "screenOffTimeoutSignal$delegate", "sdkVersionSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SdkVersionSignal;", "getSdkVersionSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SdkVersionSignal;", "sdkVersionSignal$delegate", "securityProvidersSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SecurityProvidersSignal;", "getSecurityProvidersSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SecurityProvidersSignal;", "securityProvidersSignal$delegate", "sensorsSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SensorsSignal;", "getSensorsSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SensorsSignal;", "sensorsSignal$delegate", "systemApplicationsListSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SystemApplicationsListSignal;", "getSystemApplicationsListSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/SystemApplicationsListSignal;", "systemApplicationsListSignal$delegate", "textAutoPunctuateSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoPunctuateSignal;", "getTextAutoPunctuateSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoPunctuateSignal;", "textAutoPunctuateSignal$delegate", "textAutoReplaceEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoReplaceEnabledSignal;", "getTextAutoReplaceEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TextAutoReplaceEnabledSignal;", "textAutoReplaceEnabledSignal$delegate", "time12Or24Signal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/Time12Or24Signal;", "getTime12Or24Signal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/Time12Or24Signal;", "time12Or24Signal$delegate", "timezoneSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TimezoneSignal;", "getTimezoneSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TimezoneSignal;", "timezoneSignal$delegate", "totalInternalStorageSpaceSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalInternalStorageSpaceSignal;", "getTotalInternalStorageSpaceSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalInternalStorageSpaceSignal;", "totalInternalStorageSpaceSignal$delegate", "totalRamSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalRamSignal;", "getTotalRamSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TotalRamSignal;", "totalRamSignal$delegate", "touchExplorationEnabledSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TouchExplorationEnabledSignal;", "getTouchExplorationEnabledSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TouchExplorationEnabledSignal;", "touchExplorationEnabledSignal$delegate", "transitionAnimationScaleSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TransitionAnimationScaleSignal;", "getTransitionAnimationScaleSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/TransitionAnimationScaleSignal;", "transitionAnimationScaleSignal$delegate", "windowAnimationScaleSignal", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/WindowAnimationScaleSignal;", "getWindowAnimationScaleSignal", "()Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/WindowAnimationScaleSignal;", "windowAnimationScaleSignal$delegate", "getSignalsMatching", "", "Lcom/fingerprintjs/android/fingerprint/fingerprinting_signals/FingerprintingSignal;", "version", "Lcom/fingerprintjs/android/fingerprint/Fingerprinter$Version;", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FingerprintingSignalsProvider {
    private final Lazy abiTypeSignal$delegate;
    private final Lazy accessibilityEnabledSignal$delegate;
    private final Lazy adbEnabledSignal$delegate;
    private final Lazy alarmAlertPathSignal$delegate;
    private final Lazy androidVersionSignal$delegate;
    private final Lazy applicationsListSignal$delegate;
    private final Lazy availableLocalesSignal$delegate;
    private final Lazy batteryFullCapacitySignal$delegate;
    private final Lazy batteryFullCapacityV2Signal$delegate;
    private final Lazy batteryHealthSignal$delegate;
    private final BatteryInfoProvider batteryInfoProvider;
    private final CameraInfoProvider cameraInfoProvider;
    private final Lazy cameraListSignal$delegate;
    private final CodecInfoProvider codecInfoProvider;
    private final Lazy codecListSignal$delegate;
    private final Lazy coresCountSignal$delegate;
    private final CpuInfoProvider cpuInfoProvider;
    private final Lazy dataRoamingEnabledSignal$delegate;
    private final Lazy dateFormatSignal$delegate;
    private final Lazy defaultInputMethodSignal$delegate;
    private final Lazy defaultLanguageSignal$delegate;
    private final Lazy developmentSettingsEnabledSignal$delegate;
    private final DevicePersonalizationInfoProvider devicePersonalizationInfoProvider;
    private final DeviceSecurityInfoProvider deviceSecurityInfoProvider;
    private final Lazy encryptionStatusSignal$delegate;
    private final Lazy endButtonBehaviourSignal$delegate;
    private final FingerprintSensorInfoProvider fingerprintSensorInfoProvider;
    private final Lazy fingerprintSensorStatusSignal$delegate;
    private final Lazy fingerprintSignal$delegate;
    private final Lazy fontScaleSignal$delegate;
    private final Lazy glesVersionSignal$delegate;
    private final GpuInfoProvider gpuInfoProvider;
    private final Lazy httpProxySignal$delegate;
    private final InputDeviceDataSource inputDeviceDataSource;
    private final Lazy inputDevicesSignal$delegate;
    private final Lazy inputDevicesV2Signal$delegate;
    private final Lazy isPinSecurityEnabledSignal$delegate;
    private final Lazy kernelVersionSignal$delegate;
    private final Lazy manufacturerNameSignal$delegate;
    private final MemInfoProvider memInfoProvider;
    private final Lazy modelNameSignal$delegate;
    private final OsBuildInfoProvider osBuildInfoProvider;
    private final PackageManagerDataSource packageManagerDataSource;
    private final Lazy procCpuInfoSignal$delegate;
    private final Lazy procCpuInfoV2Signal$delegate;
    private final Lazy regionCountrySignal$delegate;
    private final Lazy ringtoneSourceSignal$delegate;
    private final Lazy rttCallingModeSignal$delegate;
    private final Lazy screenOffTimeoutSignal$delegate;
    private final Lazy sdkVersionSignal$delegate;
    private final Lazy securityProvidersSignal$delegate;
    private final SensorDataSource sensorsDataSource;
    private final Lazy sensorsSignal$delegate;
    private final SettingsDataSource settingsDataSource;
    private final Lazy systemApplicationsListSignal$delegate;
    private final Lazy textAutoPunctuateSignal$delegate;
    private final Lazy textAutoReplaceEnabledSignal$delegate;
    private final Lazy time12Or24Signal$delegate;
    private final Lazy timezoneSignal$delegate;
    private final Lazy totalInternalStorageSpaceSignal$delegate;
    private final Lazy totalRamSignal$delegate;
    private final Lazy touchExplorationEnabledSignal$delegate;
    private final Lazy transitionAnimationScaleSignal$delegate;
    private final Lazy windowAnimationScaleSignal$delegate;

    public FingerprintingSignalsProvider(CpuInfoProvider cpuInfoProvider, MemInfoProvider memInfoProvider, SensorDataSource sensorDataSource, InputDeviceDataSource inputDeviceDataSource, BatteryInfoProvider batteryInfoProvider, CameraInfoProvider cameraInfoProvider, GpuInfoProvider gpuInfoProvider, OsBuildInfoProvider osBuildInfoProvider, CodecInfoProvider codecInfoProvider, DeviceSecurityInfoProvider deviceSecurityInfoProvider, PackageManagerDataSource packageManagerDataSource, SettingsDataSource settingsDataSource, DevicePersonalizationInfoProvider devicePersonalizationInfoProvider, FingerprintSensorInfoProvider fingerprintSensorInfoProvider) {
        Intrinsics.checkNotNullParameter(cpuInfoProvider, "cpuInfoProvider");
        Intrinsics.checkNotNullParameter(memInfoProvider, "memInfoProvider");
        Intrinsics.checkNotNullParameter(sensorDataSource, "sensorsDataSource");
        Intrinsics.checkNotNullParameter(inputDeviceDataSource, "inputDeviceDataSource");
        Intrinsics.checkNotNullParameter(batteryInfoProvider, "batteryInfoProvider");
        Intrinsics.checkNotNullParameter(cameraInfoProvider, "cameraInfoProvider");
        Intrinsics.checkNotNullParameter(gpuInfoProvider, "gpuInfoProvider");
        Intrinsics.checkNotNullParameter(osBuildInfoProvider, "osBuildInfoProvider");
        Intrinsics.checkNotNullParameter(deviceSecurityInfoProvider, "deviceSecurityInfoProvider");
        Intrinsics.checkNotNullParameter(packageManagerDataSource, "packageManagerDataSource");
        Intrinsics.checkNotNullParameter(settingsDataSource, "settingsDataSource");
        Intrinsics.checkNotNullParameter(devicePersonalizationInfoProvider, "devicePersonalizationInfoProvider");
        Intrinsics.checkNotNullParameter(fingerprintSensorInfoProvider, "fingerprintSensorInfoProvider");
        this.cpuInfoProvider = cpuInfoProvider;
        this.memInfoProvider = memInfoProvider;
        this.sensorsDataSource = sensorDataSource;
        this.inputDeviceDataSource = inputDeviceDataSource;
        this.batteryInfoProvider = batteryInfoProvider;
        this.cameraInfoProvider = cameraInfoProvider;
        this.gpuInfoProvider = gpuInfoProvider;
        this.osBuildInfoProvider = osBuildInfoProvider;
        this.codecInfoProvider = codecInfoProvider;
        this.deviceSecurityInfoProvider = deviceSecurityInfoProvider;
        this.packageManagerDataSource = packageManagerDataSource;
        this.settingsDataSource = settingsDataSource;
        this.devicePersonalizationInfoProvider = devicePersonalizationInfoProvider;
        this.fingerprintSensorInfoProvider = fingerprintSensorInfoProvider;
        this.manufacturerNameSignal$delegate = LazyKt.lazy(new Function0<ManufacturerNameSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$manufacturerNameSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ManufacturerNameSignal m119invoke() {
                return new ManufacturerNameSignal(this.this$0.osBuildInfoProvider.manufacturerName());
            }
        });
        this.modelNameSignal$delegate = LazyKt.lazy(new Function0<ModelNameSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$modelNameSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ModelNameSignal m120invoke() {
                return new ModelNameSignal(this.this$0.osBuildInfoProvider.modelName());
            }
        });
        this.totalRamSignal$delegate = LazyKt.lazy(new Function0<TotalRamSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$totalRamSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TotalRamSignal m136invoke() {
                return new TotalRamSignal(this.this$0.memInfoProvider.totalRAM());
            }
        });
        this.totalInternalStorageSpaceSignal$delegate = LazyKt.lazy(new Function0<TotalInternalStorageSpaceSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$totalInternalStorageSpaceSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TotalInternalStorageSpaceSignal m135invoke() {
                return new TotalInternalStorageSpaceSignal(this.this$0.memInfoProvider.totalInternalStorageSpace());
            }
        });
        this.procCpuInfoSignal$delegate = LazyKt.lazy(new Function0<ProcCpuInfoSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$procCpuInfoSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ProcCpuInfoSignal m121invoke() {
                return new ProcCpuInfoSignal(this.this$0.cpuInfoProvider.cpuInfo());
            }
        });
        this.procCpuInfoV2Signal$delegate = LazyKt.lazy(new Function0<ProcCpuInfoV2Signal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$procCpuInfoV2Signal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ProcCpuInfoV2Signal m122invoke() {
                return new ProcCpuInfoV2Signal(this.this$0.cpuInfoProvider.cpuInfoV2());
            }
        });
        this.sensorsSignal$delegate = LazyKt.lazy(new Function0<SensorsSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$sensorsSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SensorsSignal m129invoke() {
                return new SensorsSignal(this.this$0.sensorsDataSource.sensors());
            }
        });
        this.inputDevicesSignal$delegate = LazyKt.lazy(new Function0<InputDevicesSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$inputDevicesSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final InputDevicesSignal m115invoke() {
                return new InputDevicesSignal(this.this$0.inputDeviceDataSource.getInputDeviceData());
            }
        });
        this.inputDevicesV2Signal$delegate = LazyKt.lazy(new Function0<InputDevicesV2Signal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$inputDevicesV2Signal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final InputDevicesV2Signal m116invoke() {
                return new InputDevicesV2Signal(this.this$0.inputDeviceDataSource.getInputDeviceData());
            }
        });
        this.batteryHealthSignal$delegate = LazyKt.lazy(new Function0<BatteryHealthSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$batteryHealthSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final BatteryHealthSignal m49invoke() {
                return new BatteryHealthSignal(this.this$0.batteryInfoProvider.batteryHealth());
            }
        });
        this.batteryFullCapacitySignal$delegate = LazyKt.lazy(new Function0<BatteryFullCapacitySignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$batteryFullCapacitySignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final BatteryFullCapacitySignal m47invoke() {
                return new BatteryFullCapacitySignal(this.this$0.batteryInfoProvider.batteryTotalCapacity());
            }
        });
        this.batteryFullCapacityV2Signal$delegate = LazyKt.lazy(new Function0<BatteryFullCapacityV2Signal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$batteryFullCapacityV2Signal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final BatteryFullCapacityV2Signal m48invoke() {
                return new BatteryFullCapacityV2Signal(this.this$0.batteryInfoProvider.batteryTotalCapacity());
            }
        });
        this.cameraListSignal$delegate = LazyKt.lazy(new Function0<CameraListSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$cameraListSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final CameraListSignal m50invoke() {
                return new CameraListSignal(this.this$0.cameraInfoProvider.getCameraInfo());
            }
        });
        this.glesVersionSignal$delegate = LazyKt.lazy(new Function0<GlesVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$glesVersionSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final GlesVersionSignal m113invoke() {
                return new GlesVersionSignal(this.this$0.gpuInfoProvider.glesVersion());
            }
        });
        this.abiTypeSignal$delegate = LazyKt.lazy(new Function0<AbiTypeSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$abiTypeSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AbiTypeSignal m40invoke() {
                return new AbiTypeSignal(this.this$0.cpuInfoProvider.abiType());
            }
        });
        this.coresCountSignal$delegate = LazyKt.lazy(new Function0<CoresCountSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$coresCountSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final CoresCountSignal m52invoke() {
                return new CoresCountSignal(this.this$0.cpuInfoProvider.coresCount());
            }
        });
        this.fingerprintSignal$delegate = LazyKt.lazy(new Function0<FingerprintSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$fingerprintSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final FingerprintSignal m61invoke() {
                return new FingerprintSignal(this.this$0.osBuildInfoProvider.fingerprint());
            }
        });
        this.androidVersionSignal$delegate = LazyKt.lazy(new Function0<AndroidVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$androidVersionSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AndroidVersionSignal m44invoke() {
                return new AndroidVersionSignal(this.this$0.osBuildInfoProvider.androidVersion());
            }
        });
        this.sdkVersionSignal$delegate = LazyKt.lazy(new Function0<SdkVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$sdkVersionSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SdkVersionSignal m127invoke() {
                return new SdkVersionSignal(this.this$0.osBuildInfoProvider.sdkVersion());
            }
        });
        this.kernelVersionSignal$delegate = LazyKt.lazy(new Function0<KernelVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$kernelVersionSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final KernelVersionSignal m118invoke() {
                return new KernelVersionSignal(this.this$0.osBuildInfoProvider.kernelVersion());
            }
        });
        this.encryptionStatusSignal$delegate = LazyKt.lazy(new Function0<EncryptionStatusSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$encryptionStatusSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final EncryptionStatusSignal m58invoke() {
                return new EncryptionStatusSignal(this.this$0.deviceSecurityInfoProvider.encryptionStatus());
            }
        });
        this.codecListSignal$delegate = LazyKt.lazy(new Function0<CodecListSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$codecListSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final CodecListSignal m51invoke() {
                List<MediaCodecInfo> listEmptyList;
                CodecInfoProvider codecInfoProvider2 = this.this$0.codecInfoProvider;
                if (codecInfoProvider2 == null || (listEmptyList = codecInfoProvider2.codecsList()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                return new CodecListSignal(listEmptyList);
            }
        });
        this.securityProvidersSignal$delegate = LazyKt.lazy(new Function0<SecurityProvidersSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$securityProvidersSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SecurityProvidersSignal m128invoke() {
                return new SecurityProvidersSignal(this.this$0.deviceSecurityInfoProvider.securityProvidersData());
            }
        });
        this.applicationsListSignal$delegate = LazyKt.lazy(new Function0<ApplicationsListSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$applicationsListSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ApplicationsListSignal m45invoke() {
                return new ApplicationsListSignal(this.this$0.packageManagerDataSource.getApplicationsList());
            }
        });
        this.systemApplicationsListSignal$delegate = LazyKt.lazy(new Function0<SystemApplicationsListSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$systemApplicationsListSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SystemApplicationsListSignal m130invoke() {
                return new SystemApplicationsListSignal(this.this$0.packageManagerDataSource.getSystemApplicationsList());
            }
        });
        this.adbEnabledSignal$delegate = LazyKt.lazy(new Function0<AdbEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$adbEnabledSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AdbEnabledSignal m42invoke() {
                return new AdbEnabledSignal(this.this$0.settingsDataSource.adbEnabled());
            }
        });
        this.developmentSettingsEnabledSignal$delegate = LazyKt.lazy(new Function0<DevelopmentSettingsEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$developmentSettingsEnabledSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DevelopmentSettingsEnabledSignal m57invoke() {
                return new DevelopmentSettingsEnabledSignal(this.this$0.settingsDataSource.developmentSettingsEnabled());
            }
        });
        this.httpProxySignal$delegate = LazyKt.lazy(new Function0<HttpProxySignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$httpProxySignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final HttpProxySignal m114invoke() {
                return new HttpProxySignal(this.this$0.settingsDataSource.httpProxy());
            }
        });
        this.transitionAnimationScaleSignal$delegate = LazyKt.lazy(new Function0<TransitionAnimationScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$transitionAnimationScaleSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TransitionAnimationScaleSignal m138invoke() {
                return new TransitionAnimationScaleSignal(this.this$0.settingsDataSource.transitionAnimationScale());
            }
        });
        this.windowAnimationScaleSignal$delegate = LazyKt.lazy(new Function0<WindowAnimationScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$windowAnimationScaleSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final WindowAnimationScaleSignal m139invoke() {
                return new WindowAnimationScaleSignal(this.this$0.settingsDataSource.windowAnimationScale());
            }
        });
        this.dataRoamingEnabledSignal$delegate = LazyKt.lazy(new Function0<DataRoamingEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$dataRoamingEnabledSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DataRoamingEnabledSignal m53invoke() {
                return new DataRoamingEnabledSignal(this.this$0.settingsDataSource.dataRoamingEnabled());
            }
        });
        this.accessibilityEnabledSignal$delegate = LazyKt.lazy(new Function0<AccessibilityEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$accessibilityEnabledSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AccessibilityEnabledSignal m41invoke() {
                return new AccessibilityEnabledSignal(this.this$0.settingsDataSource.accessibilityEnabled());
            }
        });
        this.defaultInputMethodSignal$delegate = LazyKt.lazy(new Function0<DefaultInputMethodSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$defaultInputMethodSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DefaultInputMethodSignal m55invoke() {
                return new DefaultInputMethodSignal(this.this$0.settingsDataSource.defaultInputMethod());
            }
        });
        this.rttCallingModeSignal$delegate = LazyKt.lazy(new Function0<RttCallingModeSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$rttCallingModeSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final RttCallingModeSignal m125invoke() {
                return new RttCallingModeSignal(this.this$0.settingsDataSource.rttCallingMode());
            }
        });
        this.touchExplorationEnabledSignal$delegate = LazyKt.lazy(new Function0<TouchExplorationEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$touchExplorationEnabledSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TouchExplorationEnabledSignal m137invoke() {
                return new TouchExplorationEnabledSignal(this.this$0.settingsDataSource.touchExplorationEnabled());
            }
        });
        this.alarmAlertPathSignal$delegate = LazyKt.lazy(new Function0<AlarmAlertPathSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$alarmAlertPathSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AlarmAlertPathSignal m43invoke() {
                return new AlarmAlertPathSignal(this.this$0.settingsDataSource.alarmAlertPath());
            }
        });
        this.dateFormatSignal$delegate = LazyKt.lazy(new Function0<DateFormatSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$dateFormatSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DateFormatSignal m54invoke() {
                return new DateFormatSignal(this.this$0.settingsDataSource.dateFormat());
            }
        });
        this.endButtonBehaviourSignal$delegate = LazyKt.lazy(new Function0<EndButtonBehaviourSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$endButtonBehaviourSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final EndButtonBehaviourSignal m59invoke() {
                return new EndButtonBehaviourSignal(this.this$0.settingsDataSource.endButtonBehaviour());
            }
        });
        this.fontScaleSignal$delegate = LazyKt.lazy(new Function0<FontScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$fontScaleSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final FontScaleSignal m62invoke() {
                return new FontScaleSignal(this.this$0.settingsDataSource.fontScale());
            }
        });
        this.screenOffTimeoutSignal$delegate = LazyKt.lazy(new Function0<ScreenOffTimeoutSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$screenOffTimeoutSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ScreenOffTimeoutSignal m126invoke() {
                return new ScreenOffTimeoutSignal(this.this$0.settingsDataSource.screenOffTimeout());
            }
        });
        this.textAutoReplaceEnabledSignal$delegate = LazyKt.lazy(new Function0<TextAutoReplaceEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$textAutoReplaceEnabledSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TextAutoReplaceEnabledSignal m132invoke() {
                return new TextAutoReplaceEnabledSignal(this.this$0.settingsDataSource.textAutoReplaceEnable());
            }
        });
        this.textAutoPunctuateSignal$delegate = LazyKt.lazy(new Function0<TextAutoPunctuateSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$textAutoPunctuateSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TextAutoPunctuateSignal m131invoke() {
                return new TextAutoPunctuateSignal(this.this$0.settingsDataSource.textAutoPunctuate());
            }
        });
        this.time12Or24Signal$delegate = LazyKt.lazy(new Function0<Time12Or24Signal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$time12Or24Signal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Time12Or24Signal m133invoke() {
                return new Time12Or24Signal(this.this$0.settingsDataSource.time12Or24());
            }
        });
        this.isPinSecurityEnabledSignal$delegate = LazyKt.lazy(new Function0<IsPinSecurityEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider.isPinSecurityEnabledSignal.2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final IsPinSecurityEnabledSignal m117invoke() {
                return new IsPinSecurityEnabledSignal(FingerprintingSignalsProvider.this.deviceSecurityInfoProvider.isPinSecurityEnabled());
            }
        });
        this.fingerprintSensorStatusSignal$delegate = LazyKt.lazy(new Function0<FingerprintSensorStatusSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$fingerprintSensorStatusSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final FingerprintSensorStatusSignal m60invoke() {
                return new FingerprintSensorStatusSignal(this.this$0.fingerprintSensorInfoProvider.getStatus().getStringDescription());
            }
        });
        this.ringtoneSourceSignal$delegate = LazyKt.lazy(new Function0<RingtoneSourceSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$ringtoneSourceSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final RingtoneSourceSignal m124invoke() {
                return new RingtoneSourceSignal(this.this$0.devicePersonalizationInfoProvider.ringtoneSource());
            }
        });
        this.availableLocalesSignal$delegate = LazyKt.lazy(new Function0<AvailableLocalesSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$availableLocalesSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AvailableLocalesSignal m46invoke() {
                return new AvailableLocalesSignal(ArraysKt.toList(this.this$0.devicePersonalizationInfoProvider.availableLocales()));
            }
        });
        this.regionCountrySignal$delegate = LazyKt.lazy(new Function0<RegionCountrySignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$regionCountrySignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final RegionCountrySignal m123invoke() {
                return new RegionCountrySignal(this.this$0.devicePersonalizationInfoProvider.regionCountry());
            }
        });
        this.defaultLanguageSignal$delegate = LazyKt.lazy(new Function0<DefaultLanguageSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$defaultLanguageSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DefaultLanguageSignal m56invoke() {
                return new DefaultLanguageSignal(this.this$0.devicePersonalizationInfoProvider.defaultLanguage());
            }
        });
        this.timezoneSignal$delegate = LazyKt.lazy(new Function0<TimezoneSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$timezoneSignal$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TimezoneSignal m134invoke() {
                return new TimezoneSignal(this.this$0.devicePersonalizationInfoProvider.timezone());
            }
        });
    }

    public final List<FingerprintingSignal<?>> getSignalsMatching(Fingerprinter.Version version, StabilityLevel stabilityLevel) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        final List<Pair> listListOf = CollectionsKt.listOf(new Pair[]{TuplesKt.to(ManufacturerNameSignal.Companion.getInfo(), new Function0<ManufacturerNameSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ManufacturerNameSignal m63invoke() {
                return this.this$0.getManufacturerNameSignal();
            }
        }), TuplesKt.to(ModelNameSignal.Companion.getInfo(), new Function0<ModelNameSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$2
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ModelNameSignal m74invoke() {
                return this.this$0.getModelNameSignal();
            }
        }), TuplesKt.to(TotalRamSignal.Companion.getInfo(), new Function0<TotalRamSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$3
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TotalRamSignal m85invoke() {
                return this.this$0.getTotalRamSignal();
            }
        }), TuplesKt.to(TotalInternalStorageSpaceSignal.Companion.getInfo(), new Function0<TotalInternalStorageSpaceSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$4
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TotalInternalStorageSpaceSignal m96invoke() {
                return this.this$0.getTotalInternalStorageSpaceSignal();
            }
        }), TuplesKt.to(ProcCpuInfoSignal.Companion.getInfo(), new Function0<ProcCpuInfoSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$5
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ProcCpuInfoSignal m107invoke() {
                return this.this$0.getProcCpuInfoSignal();
            }
        }), TuplesKt.to(ProcCpuInfoV2Signal.Companion.getInfo(), new Function0<ProcCpuInfoV2Signal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$6
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ProcCpuInfoV2Signal m109invoke() {
                return this.this$0.getProcCpuInfoV2Signal();
            }
        }), TuplesKt.to(SensorsSignal.Companion.getInfo(), new Function0<SensorsSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$7
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SensorsSignal m110invoke() {
                return this.this$0.getSensorsSignal();
            }
        }), TuplesKt.to(InputDevicesSignal.Companion.getInfo(), new Function0<InputDevicesSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$8
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final InputDevicesSignal m111invoke() {
                return this.this$0.getInputDevicesSignal();
            }
        }), TuplesKt.to(InputDevicesV2Signal.Companion.getInfo(), new Function0<InputDevicesV2Signal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$9
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final InputDevicesV2Signal m112invoke() {
                return this.this$0.getInputDevicesV2Signal();
            }
        }), TuplesKt.to(BatteryHealthSignal.Companion.getInfo(), new Function0<BatteryHealthSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$10
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final BatteryHealthSignal m64invoke() {
                return this.this$0.getBatteryHealthSignal();
            }
        }), TuplesKt.to(BatteryFullCapacitySignal.Companion.getInfo(), new Function0<BatteryFullCapacitySignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$11
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final BatteryFullCapacitySignal m65invoke() {
                return this.this$0.getBatteryFullCapacitySignal();
            }
        }), TuplesKt.to(BatteryFullCapacityV2Signal.Companion.getInfo(), new Function0<BatteryFullCapacityV2Signal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$12
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final BatteryFullCapacityV2Signal m66invoke() {
                return this.this$0.getBatteryFullCapacityV2Signal();
            }
        }), TuplesKt.to(CameraListSignal.Companion.getInfo(), new Function0<CameraListSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$13
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final CameraListSignal m67invoke() {
                return this.this$0.getCameraListSignal();
            }
        }), TuplesKt.to(GlesVersionSignal.Companion.getInfo(), new Function0<GlesVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$14
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final GlesVersionSignal m68invoke() {
                return this.this$0.getGlesVersionSignal();
            }
        }), TuplesKt.to(AbiTypeSignal.Companion.getInfo(), new Function0<AbiTypeSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$15
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AbiTypeSignal m69invoke() {
                return this.this$0.getAbiTypeSignal();
            }
        }), TuplesKt.to(CoresCountSignal.Companion.getInfo(), new Function0<CoresCountSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$16
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final CoresCountSignal m70invoke() {
                return this.this$0.getCoresCountSignal();
            }
        }), TuplesKt.to(FingerprintSignal.Companion.getInfo(), new Function0<FingerprintSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$17
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final FingerprintSignal m71invoke() {
                return this.this$0.getFingerprintSignal();
            }
        }), TuplesKt.to(AndroidVersionSignal.Companion.getInfo(), new Function0<AndroidVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$18
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AndroidVersionSignal m72invoke() {
                return this.this$0.getAndroidVersionSignal();
            }
        }), TuplesKt.to(SdkVersionSignal.Companion.getInfo(), new Function0<SdkVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$19
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SdkVersionSignal m73invoke() {
                return this.this$0.getSdkVersionSignal();
            }
        }), TuplesKt.to(KernelVersionSignal.Companion.getInfo(), new Function0<KernelVersionSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$20
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final KernelVersionSignal m75invoke() {
                return this.this$0.getKernelVersionSignal();
            }
        }), TuplesKt.to(EncryptionStatusSignal.Companion.getInfo(), new Function0<EncryptionStatusSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$21
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final EncryptionStatusSignal m76invoke() {
                return this.this$0.getEncryptionStatusSignal();
            }
        }), TuplesKt.to(CodecListSignal.Companion.getInfo(), new Function0<CodecListSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$22
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final CodecListSignal m77invoke() {
                return this.this$0.getCodecListSignal();
            }
        }), TuplesKt.to(SecurityProvidersSignal.Companion.getInfo(), new Function0<SecurityProvidersSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$23
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SecurityProvidersSignal m78invoke() {
                return this.this$0.getSecurityProvidersSignal();
            }
        }), TuplesKt.to(ApplicationsListSignal.Companion.getInfo(), new Function0<ApplicationsListSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$24
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ApplicationsListSignal m79invoke() {
                return this.this$0.getApplicationsListSignal();
            }
        }), TuplesKt.to(SystemApplicationsListSignal.Companion.getInfo(), new Function0<SystemApplicationsListSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$25
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SystemApplicationsListSignal m80invoke() {
                return this.this$0.getSystemApplicationsListSignal();
            }
        }), TuplesKt.to(AdbEnabledSignal.Companion.getInfo(), new Function0<AdbEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$26
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AdbEnabledSignal m81invoke() {
                return this.this$0.getAdbEnabledSignal();
            }
        }), TuplesKt.to(DevelopmentSettingsEnabledSignal.Companion.getInfo(), new Function0<DevelopmentSettingsEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$27
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DevelopmentSettingsEnabledSignal m82invoke() {
                return this.this$0.getDevelopmentSettingsEnabledSignal();
            }
        }), TuplesKt.to(HttpProxySignal.Companion.getInfo(), new Function0<HttpProxySignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$28
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final HttpProxySignal m83invoke() {
                return this.this$0.getHttpProxySignal();
            }
        }), TuplesKt.to(TransitionAnimationScaleSignal.Companion.getInfo(), new Function0<TransitionAnimationScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$29
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TransitionAnimationScaleSignal m84invoke() {
                return this.this$0.getTransitionAnimationScaleSignal();
            }
        }), TuplesKt.to(WindowAnimationScaleSignal.Companion.getInfo(), new Function0<WindowAnimationScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$30
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final WindowAnimationScaleSignal m86invoke() {
                return this.this$0.getWindowAnimationScaleSignal();
            }
        }), TuplesKt.to(DataRoamingEnabledSignal.Companion.getInfo(), new Function0<DataRoamingEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$31
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DataRoamingEnabledSignal m87invoke() {
                return this.this$0.getDataRoamingEnabledSignal();
            }
        }), TuplesKt.to(AccessibilityEnabledSignal.Companion.getInfo(), new Function0<AccessibilityEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$32
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AccessibilityEnabledSignal m88invoke() {
                return this.this$0.getAccessibilityEnabledSignal();
            }
        }), TuplesKt.to(DefaultInputMethodSignal.Companion.getInfo(), new Function0<DefaultInputMethodSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$33
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DefaultInputMethodSignal m89invoke() {
                return this.this$0.getDefaultInputMethodSignal();
            }
        }), TuplesKt.to(RttCallingModeSignal.Companion.getInfo(), new Function0<RttCallingModeSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$34
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final RttCallingModeSignal m90invoke() {
                return this.this$0.getRttCallingModeSignal();
            }
        }), TuplesKt.to(TouchExplorationEnabledSignal.Companion.getInfo(), new Function0<TouchExplorationEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$35
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TouchExplorationEnabledSignal m91invoke() {
                return this.this$0.getTouchExplorationEnabledSignal();
            }
        }), TuplesKt.to(AlarmAlertPathSignal.Companion.getInfo(), new Function0<AlarmAlertPathSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$36
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AlarmAlertPathSignal m92invoke() {
                return this.this$0.getAlarmAlertPathSignal();
            }
        }), TuplesKt.to(DateFormatSignal.Companion.getInfo(), new Function0<DateFormatSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$37
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DateFormatSignal m93invoke() {
                return this.this$0.getDateFormatSignal();
            }
        }), TuplesKt.to(EndButtonBehaviourSignal.Companion.getInfo(), new Function0<EndButtonBehaviourSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$38
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final EndButtonBehaviourSignal m94invoke() {
                return this.this$0.getEndButtonBehaviourSignal();
            }
        }), TuplesKt.to(FontScaleSignal.Companion.getInfo(), new Function0<FontScaleSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$39
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final FontScaleSignal m95invoke() {
                return this.this$0.getFontScaleSignal();
            }
        }), TuplesKt.to(ScreenOffTimeoutSignal.Companion.getInfo(), new Function0<ScreenOffTimeoutSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$40
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final ScreenOffTimeoutSignal m97invoke() {
                return this.this$0.getScreenOffTimeoutSignal();
            }
        }), TuplesKt.to(TextAutoReplaceEnabledSignal.Companion.getInfo(), new Function0<TextAutoReplaceEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$41
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TextAutoReplaceEnabledSignal m98invoke() {
                return this.this$0.getTextAutoReplaceEnabledSignal();
            }
        }), TuplesKt.to(TextAutoPunctuateSignal.Companion.getInfo(), new Function0<TextAutoPunctuateSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$42
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TextAutoPunctuateSignal m99invoke() {
                return this.this$0.getTextAutoPunctuateSignal();
            }
        }), TuplesKt.to(Time12Or24Signal.Companion.getInfo(), new Function0<Time12Or24Signal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$43
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final Time12Or24Signal m100invoke() {
                return this.this$0.getTime12Or24Signal();
            }
        }), TuplesKt.to(IsPinSecurityEnabledSignal.Companion.getInfo(), new Function0<IsPinSecurityEnabledSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$44
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final IsPinSecurityEnabledSignal m101invoke() {
                return this.this$0.isPinSecurityEnabledSignal();
            }
        }), TuplesKt.to(FingerprintSensorStatusSignal.Companion.getInfo(), new Function0<FingerprintSensorStatusSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$45
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final FingerprintSensorStatusSignal m102invoke() {
                return this.this$0.getFingerprintSensorStatusSignal();
            }
        }), TuplesKt.to(RingtoneSourceSignal.Companion.getInfo(), new Function0<RingtoneSourceSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$46
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final RingtoneSourceSignal m103invoke() {
                return this.this$0.getRingtoneSourceSignal();
            }
        }), TuplesKt.to(AvailableLocalesSignal.Companion.getInfo(), new Function0<AvailableLocalesSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$47
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final AvailableLocalesSignal m104invoke() {
                return this.this$0.getAvailableLocalesSignal();
            }
        }), TuplesKt.to(RegionCountrySignal.Companion.getInfo(), new Function0<RegionCountrySignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$48
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final RegionCountrySignal m105invoke() {
                return this.this$0.getRegionCountrySignal();
            }
        }), TuplesKt.to(DefaultLanguageSignal.Companion.getInfo(), new Function0<DefaultLanguageSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$49
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final DefaultLanguageSignal m106invoke() {
                return this.this$0.getDefaultLanguageSignal();
            }
        }), TuplesKt.to(TimezoneSignal.Companion.getInfo(), new Function0<TimezoneSignal>() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$allSignalsInfoToFactory$50
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final TimezoneSignal m108invoke() {
                return this.this$0.getTimezoneSignal();
            }
        })});
        Fingerprinter.Version version2 = Fingerprinter.Version.V_1;
        if (version.compareTo((Object) Fingerprinter.Version.Companion.getFingerprintingGroupedSignalsLastVersion$fingerprint_release()) <= 0 && version.compareTo((Object) version2) >= 0) {
            return CollectionsKt.sortedWith(CollectionsKt.flatten(CollectionsKt.listOf(new List[]{FingerprintingLegacySchemeSupportExtensions.INSTANCE.getHardwareSignals(this, version, stabilityLevel), FingerprintingLegacySchemeSupportExtensions.INSTANCE.getOsBuildSignals(this, version, stabilityLevel), FingerprintingLegacySchemeSupportExtensions.INSTANCE.getDeviceStateSignals(this, version, stabilityLevel), FingerprintingLegacySchemeSupportExtensions.INSTANCE.getInstalledAppsSignals(this, version, stabilityLevel)})), new Comparator() { // from class: com.fingerprintjs.android.fingerprint.fingerprinting_signals.FingerprintingSignalsProvider$getSignalsMatching$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int i;
                    FingerprintingSignal fingerprintingSignal = (FingerprintingSignal) t;
                    Iterator it = listListOf.iterator();
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        i = -1;
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        if (((Pair) it.next()).getFirst() == fingerprintingSignal.getInfo()) {
                            break;
                        }
                        i3++;
                    }
                    Integer numValueOf = Integer.valueOf(i3);
                    FingerprintingSignal fingerprintingSignal2 = (FingerprintingSignal) t2;
                    Iterator it2 = listListOf.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((Pair) it2.next()).getFirst() == fingerprintingSignal2.getInfo()) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(i));
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : listListOf) {
            FingerprintingSignal fingerprintingSignalCreateSignalIfNeeded = SignalsUtils.INSTANCE.createSignalIfNeeded(version, stabilityLevel, (FingerprintingSignal.Info) pair.getFirst(), (Function0) pair.getSecond());
            if (fingerprintingSignalCreateSignalIfNeeded != null) {
                arrayList.add(fingerprintingSignalCreateSignalIfNeeded);
            }
        }
        return arrayList;
    }

    public final ManufacturerNameSignal getManufacturerNameSignal() {
        return (ManufacturerNameSignal) this.manufacturerNameSignal$delegate.getValue();
    }

    public final ModelNameSignal getModelNameSignal() {
        return (ModelNameSignal) this.modelNameSignal$delegate.getValue();
    }

    public final TotalRamSignal getTotalRamSignal() {
        return (TotalRamSignal) this.totalRamSignal$delegate.getValue();
    }

    public final TotalInternalStorageSpaceSignal getTotalInternalStorageSpaceSignal() {
        return (TotalInternalStorageSpaceSignal) this.totalInternalStorageSpaceSignal$delegate.getValue();
    }

    public final ProcCpuInfoSignal getProcCpuInfoSignal() {
        return (ProcCpuInfoSignal) this.procCpuInfoSignal$delegate.getValue();
    }

    public final ProcCpuInfoV2Signal getProcCpuInfoV2Signal() {
        return (ProcCpuInfoV2Signal) this.procCpuInfoV2Signal$delegate.getValue();
    }

    public final SensorsSignal getSensorsSignal() {
        return (SensorsSignal) this.sensorsSignal$delegate.getValue();
    }

    public final InputDevicesSignal getInputDevicesSignal() {
        return (InputDevicesSignal) this.inputDevicesSignal$delegate.getValue();
    }

    public final InputDevicesV2Signal getInputDevicesV2Signal() {
        return (InputDevicesV2Signal) this.inputDevicesV2Signal$delegate.getValue();
    }

    public final BatteryHealthSignal getBatteryHealthSignal() {
        return (BatteryHealthSignal) this.batteryHealthSignal$delegate.getValue();
    }

    public final BatteryFullCapacitySignal getBatteryFullCapacitySignal() {
        return (BatteryFullCapacitySignal) this.batteryFullCapacitySignal$delegate.getValue();
    }

    public final BatteryFullCapacityV2Signal getBatteryFullCapacityV2Signal() {
        return (BatteryFullCapacityV2Signal) this.batteryFullCapacityV2Signal$delegate.getValue();
    }

    public final CameraListSignal getCameraListSignal() {
        return (CameraListSignal) this.cameraListSignal$delegate.getValue();
    }

    public final GlesVersionSignal getGlesVersionSignal() {
        return (GlesVersionSignal) this.glesVersionSignal$delegate.getValue();
    }

    public final AbiTypeSignal getAbiTypeSignal() {
        return (AbiTypeSignal) this.abiTypeSignal$delegate.getValue();
    }

    public final CoresCountSignal getCoresCountSignal() {
        return (CoresCountSignal) this.coresCountSignal$delegate.getValue();
    }

    public final FingerprintSignal getFingerprintSignal() {
        return (FingerprintSignal) this.fingerprintSignal$delegate.getValue();
    }

    public final AndroidVersionSignal getAndroidVersionSignal() {
        return (AndroidVersionSignal) this.androidVersionSignal$delegate.getValue();
    }

    public final SdkVersionSignal getSdkVersionSignal() {
        return (SdkVersionSignal) this.sdkVersionSignal$delegate.getValue();
    }

    public final KernelVersionSignal getKernelVersionSignal() {
        return (KernelVersionSignal) this.kernelVersionSignal$delegate.getValue();
    }

    public final EncryptionStatusSignal getEncryptionStatusSignal() {
        return (EncryptionStatusSignal) this.encryptionStatusSignal$delegate.getValue();
    }

    public final CodecListSignal getCodecListSignal() {
        return (CodecListSignal) this.codecListSignal$delegate.getValue();
    }

    public final SecurityProvidersSignal getSecurityProvidersSignal() {
        return (SecurityProvidersSignal) this.securityProvidersSignal$delegate.getValue();
    }

    public final ApplicationsListSignal getApplicationsListSignal() {
        return (ApplicationsListSignal) this.applicationsListSignal$delegate.getValue();
    }

    public final SystemApplicationsListSignal getSystemApplicationsListSignal() {
        return (SystemApplicationsListSignal) this.systemApplicationsListSignal$delegate.getValue();
    }

    public final AdbEnabledSignal getAdbEnabledSignal() {
        return (AdbEnabledSignal) this.adbEnabledSignal$delegate.getValue();
    }

    public final DevelopmentSettingsEnabledSignal getDevelopmentSettingsEnabledSignal() {
        return (DevelopmentSettingsEnabledSignal) this.developmentSettingsEnabledSignal$delegate.getValue();
    }

    public final HttpProxySignal getHttpProxySignal() {
        return (HttpProxySignal) this.httpProxySignal$delegate.getValue();
    }

    public final TransitionAnimationScaleSignal getTransitionAnimationScaleSignal() {
        return (TransitionAnimationScaleSignal) this.transitionAnimationScaleSignal$delegate.getValue();
    }

    public final WindowAnimationScaleSignal getWindowAnimationScaleSignal() {
        return (WindowAnimationScaleSignal) this.windowAnimationScaleSignal$delegate.getValue();
    }

    public final DataRoamingEnabledSignal getDataRoamingEnabledSignal() {
        return (DataRoamingEnabledSignal) this.dataRoamingEnabledSignal$delegate.getValue();
    }

    public final AccessibilityEnabledSignal getAccessibilityEnabledSignal() {
        return (AccessibilityEnabledSignal) this.accessibilityEnabledSignal$delegate.getValue();
    }

    public final DefaultInputMethodSignal getDefaultInputMethodSignal() {
        return (DefaultInputMethodSignal) this.defaultInputMethodSignal$delegate.getValue();
    }

    public final RttCallingModeSignal getRttCallingModeSignal() {
        return (RttCallingModeSignal) this.rttCallingModeSignal$delegate.getValue();
    }

    public final TouchExplorationEnabledSignal getTouchExplorationEnabledSignal() {
        return (TouchExplorationEnabledSignal) this.touchExplorationEnabledSignal$delegate.getValue();
    }

    public final AlarmAlertPathSignal getAlarmAlertPathSignal() {
        return (AlarmAlertPathSignal) this.alarmAlertPathSignal$delegate.getValue();
    }

    public final DateFormatSignal getDateFormatSignal() {
        return (DateFormatSignal) this.dateFormatSignal$delegate.getValue();
    }

    public final EndButtonBehaviourSignal getEndButtonBehaviourSignal() {
        return (EndButtonBehaviourSignal) this.endButtonBehaviourSignal$delegate.getValue();
    }

    public final FontScaleSignal getFontScaleSignal() {
        return (FontScaleSignal) this.fontScaleSignal$delegate.getValue();
    }

    public final ScreenOffTimeoutSignal getScreenOffTimeoutSignal() {
        return (ScreenOffTimeoutSignal) this.screenOffTimeoutSignal$delegate.getValue();
    }

    public final TextAutoReplaceEnabledSignal getTextAutoReplaceEnabledSignal() {
        return (TextAutoReplaceEnabledSignal) this.textAutoReplaceEnabledSignal$delegate.getValue();
    }

    public final TextAutoPunctuateSignal getTextAutoPunctuateSignal() {
        return (TextAutoPunctuateSignal) this.textAutoPunctuateSignal$delegate.getValue();
    }

    public final Time12Or24Signal getTime12Or24Signal() {
        return (Time12Or24Signal) this.time12Or24Signal$delegate.getValue();
    }

    public final IsPinSecurityEnabledSignal isPinSecurityEnabledSignal() {
        return (IsPinSecurityEnabledSignal) this.isPinSecurityEnabledSignal$delegate.getValue();
    }

    public final FingerprintSensorStatusSignal getFingerprintSensorStatusSignal() {
        return (FingerprintSensorStatusSignal) this.fingerprintSensorStatusSignal$delegate.getValue();
    }

    public final RingtoneSourceSignal getRingtoneSourceSignal() {
        return (RingtoneSourceSignal) this.ringtoneSourceSignal$delegate.getValue();
    }

    public final AvailableLocalesSignal getAvailableLocalesSignal() {
        return (AvailableLocalesSignal) this.availableLocalesSignal$delegate.getValue();
    }

    public final RegionCountrySignal getRegionCountrySignal() {
        return (RegionCountrySignal) this.regionCountrySignal$delegate.getValue();
    }

    public final DefaultLanguageSignal getDefaultLanguageSignal() {
        return (DefaultLanguageSignal) this.defaultLanguageSignal$delegate.getValue();
    }

    public final TimezoneSignal getTimezoneSignal() {
        return (TimezoneSignal) this.timezoneSignal$delegate.getValue();
    }
}
