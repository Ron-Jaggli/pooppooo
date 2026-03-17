package com.gameanalytics.sdk.utilities;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new Parcelable.Creator<Timer>() { // from class: com.gameanalytics.sdk.utilities.Timer.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timer createFromParcel(final Parcel in) {
            return new Timer(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timer[] newArray(final int size) {
            return new Timer[size];
        }
    };
    private long highResTime;
    private long timeInMicros;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Timer() {
        this.timeInMicros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.highResTime = System.nanoTime();
    }

    public Timer(final long time, final long highResTime) {
        this.timeInMicros = time;
        this.highResTime = highResTime;
    }

    private Timer(final Parcel in) {
        this.timeInMicros = in.readLong();
        this.highResTime = in.readLong();
    }

    public void reset() {
        this.timeInMicros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.highResTime = System.nanoTime();
    }

    public long getMicros() {
        return this.timeInMicros;
    }

    public long getDurationMicros() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.highResTime);
    }

    public long getDurationMicros(final Timer end) {
        return TimeUnit.NANOSECONDS.toMicros(end.highResTime - this.highResTime);
    }

    public long getCurrentTimestampMicros() {
        return this.timeInMicros + getDurationMicros();
    }

    public long getHighResTime() {
        return TimeUnit.NANOSECONDS.toMicros(this.highResTime);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        out.writeLong(this.timeInMicros);
        out.writeLong(this.highResTime);
    }
}
