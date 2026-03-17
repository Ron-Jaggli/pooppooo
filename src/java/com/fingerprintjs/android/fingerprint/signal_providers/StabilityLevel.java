package com.fingerprintjs.android.fingerprint.signal_providers;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: StabilityLevel.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/signal_providers/StabilityLevel;", "", "(Ljava/lang/String;I)V", "atLeastAsStableAs", "", "other", "atLeastAsStableAs$fingerprint_release", "STABLE", "OPTIMAL", "UNIQUE", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StabilityLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StabilityLevel[] $VALUES;
    public static final StabilityLevel STABLE = new StabilityLevel("STABLE", 0);
    public static final StabilityLevel OPTIMAL = new StabilityLevel("OPTIMAL", 1);
    public static final StabilityLevel UNIQUE = new StabilityLevel("UNIQUE", 2);

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/6.dex
     */
    /* JADX INFO: compiled from: StabilityLevel.kt */
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

    private static final /* synthetic */ StabilityLevel[] $values() {
        return new StabilityLevel[]{STABLE, OPTIMAL, UNIQUE};
    }

    public static EnumEntries<StabilityLevel> getEntries() {
        return $ENTRIES;
    }

    public static StabilityLevel valueOf(String str) {
        return (StabilityLevel) Enum.valueOf(StabilityLevel.class, str);
    }

    public static StabilityLevel[] values() {
        return (StabilityLevel[]) $VALUES.clone();
    }

    private StabilityLevel(String str, int i) {
    }

    static {
        StabilityLevel[] stabilityLevelArr$values = $values();
        $VALUES = stabilityLevelArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(stabilityLevelArr$values);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean atLeastAsStableAs$fingerprint_release(StabilityLevel stabilityLevel) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(stabilityLevel, "other");
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[stabilityLevel.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[stabilityLevel.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    return true;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }
}
