package com.instacart.truetime;

import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: compiled from: InvalidNtpServerResponseException.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/instacart/truetime/InvalidNtpServerResponseException;", "Ljava/io/IOException;", "detailMessage", "", "(Ljava/lang/String;)V", "message", "property", "actualValue", "", "expectedValue", "(Ljava/lang/String;Ljava/lang/String;FF)V", "getActualValue", "()F", "getExpectedValue", "getProperty", "()Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InvalidNtpServerResponseException extends IOException {
    private final float actualValue;
    private final float expectedValue;
    private final String property;

    public final String getProperty() {
        return this.property;
    }

    public final float getExpectedValue() {
        return this.expectedValue;
    }

    public final float getActualValue() {
        return this.actualValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidNtpServerResponseException(String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "detailMessage");
        this.property = "na";
        this.expectedValue = 0.0f;
        this.actualValue = 0.0f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InvalidNtpServerResponseException(String str, String str2, float f, float f2) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, "property");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format(Locale.getDefault(), str, Arrays.copyOf(new Object[]{str2, Float.valueOf(f), Float.valueOf(f2)}, 3));
        Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
        super(str3);
        this.property = str2;
        this.actualValue = f;
        this.expectedValue = f2;
    }
}
