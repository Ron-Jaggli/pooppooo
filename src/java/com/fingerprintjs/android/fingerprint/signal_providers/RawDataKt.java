package com.fingerprintjs.android.fingerprint.signal_providers;

import com.fingerprintjs.android.fingerprint.tools.DeprecationMessages;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX INFO: compiled from: RawData.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a(\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a(\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001*\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"filterByStabilityLevel", "", "Lcom/fingerprintjs/android/fingerprint/signal_providers/IdentificationSignal;", "stabilityLevel", "Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "filterByVersion", "version", "", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RawDataKt {

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
     */
    /* JADX INFO: compiled from: RawData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StabilityLevel.values().length];
            try {
                iArr[StabilityLevel.STABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StabilityLevel.OPTIMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StabilityLevel.UNIQUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
    public static final List<IdentificationSignal<?>> filterByStabilityLevel(List<? extends IdentificationSignal<?>> list, StabilityLevel stabilityLevel) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(stabilityLevel, "stabilityLevel");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            IdentificationSignal identificationSignal = (IdentificationSignal) obj;
            int i = WhenMappings.$EnumSwitchMapping$0[stabilityLevel.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                } else {
                    z = (identificationSignal.getStabilityLevel() == StabilityLevel.OPTIMAL) | (identificationSignal.getStabilityLevel() == StabilityLevel.STABLE);
                }
            } else if (identificationSignal.getStabilityLevel() == StabilityLevel.STABLE) {
                z = true;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Deprecated(message = DeprecationMessages.DEPRECATED_SYMBOL)
    public static final List<IdentificationSignal<?>> filterByVersion(List<? extends IdentificationSignal<?>> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            IdentificationSignal identificationSignal = (IdentificationSignal) obj;
            boolean z = false;
            boolean z2 = identificationSignal.getRemovedInVersion() == null || identificationSignal.getRemovedInVersion().intValue() > i;
            int addedInVersion = identificationSignal.getAddedInVersion();
            if (1 <= addedInVersion && addedInVersion <= i) {
                z = true;
            }
            if (z2 && z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
