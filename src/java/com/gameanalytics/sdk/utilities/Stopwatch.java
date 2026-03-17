package com.gameanalytics.sdk.utilities;

import com.gameanalytics.sdk.logging.GALogger;
import java.util.HashMap;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class Stopwatch {
    private static HashMap<String, Stopwatch> timers = new HashMap<>();
    private long startTimestamp;
    private long totalTime = 0;
    private boolean isRunning = false;

    public Stopwatch() {
        start();
    }

    public static void startTimer(String key) {
        if (timers.containsKey(key)) {
            GALogger.w("startTimer: overriding old value for key=" + key);
        }
        timers.put(key, new Stopwatch());
    }

    public static void pauseTimer(String key) {
        if (timers.containsKey(key)) {
            timers.get(key).pause();
        } else {
            GALogger.w("pauseTimer: no value found for key=" + key);
        }
    }

    public static void resumeTimer(String key) {
        if (timers.containsKey(key)) {
            timers.get(key).resume();
        } else {
            GALogger.w("resumeTimer: no value found for key=" + key);
        }
    }

    public static long stopTimer(String key) {
        if (timers.containsKey(key)) {
            return timers.get(key).stop();
        }
        GALogger.w("stopTimer: no value found for key=" + key);
        return 0L;
    }

    public void start() {
        if (this.isRunning) {
            return;
        }
        this.startTimestamp = System.currentTimeMillis();
        this.isRunning = true;
    }

    public void resume() {
        start();
    }

    public void pause() {
        if (this.isRunning) {
            updateTotalTime();
            this.isRunning = false;
        }
    }

    public long stop() {
        if (this.isRunning) {
            updateTotalTime();
            this.isRunning = false;
        }
        return this.totalTime;
    }

    public void reset() {
        this.totalTime = 0L;
        this.startTimestamp = System.currentTimeMillis();
    }

    public long split() {
        if (this.isRunning) {
            updateTotalTime();
        }
        return this.totalTime;
    }

    private void updateTotalTime() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.startTimestamp;
        this.startTimestamp = jCurrentTimeMillis;
        this.totalTime += j;
    }

    public long getTime() {
        updateTotalTime();
        return this.totalTime;
    }

    public String getTimeString() {
        return getTimeString(getTime());
    }

    public static String getTimeString(long timeMillis) {
        if (timeMillis < 10000) {
            return timeMillis + " ms";
        }
        return (timeMillis / 1000.0d) + " s";
    }
}
