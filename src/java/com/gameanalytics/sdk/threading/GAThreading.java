package com.gameanalytics.sdk.threading;

import com.gameanalytics.sdk.logging.GALogger;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public final class GAThreading extends Timer {
    private static final GAThreading INSTANCE = new GAThreading();
    private static final long THREAD_WAIT_TIME_IN_MS = 1000;
    private final FIFOPriorityQueue<TimedBlock> blocks;
    private TimerTask task;

    private static TimerTask createTask() {
        return new TimerTask() { // from class: com.gameanalytics.sdk.threading.GAThreading.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        TimedBlock nextBlock = GAThreading.getNextBlock();
                        if (nextBlock == null) {
                            return;
                        } else {
                            nextBlock.block.execute();
                        }
                    } catch (Exception e) {
                        GALogger.e("Error on GA thread");
                        e.printStackTrace();
                        return;
                    }
                }
            }
        };
    }

    private GAThreading() {
        super("GA Thread");
        this.blocks = new FIFOPriorityQueue<>();
        this.task = null;
        startInternal();
    }

    private void startInternal() {
        if (this.task == null) {
            GALogger.d("Starting GA Thread");
            synchronized (this) {
                TimerTask timerTaskCreateTask = createTask();
                this.task = timerTaskCreateTask;
                scheduleAtFixedRate(timerTaskCreateTask, 0L, 1000L);
            }
        }
    }

    public static void start() {
        getInstance().startInternal();
    }

    public static void stop() {
        if (getInstance().task != null) {
            GALogger.d("Stopping GA Thread");
            synchronized (getInstance()) {
                getInstance().task.cancel();
                getInstance().task = null;
            }
        }
    }

    private static GAThreading getInstance() {
        return INSTANCE;
    }

    private void addTimedBlock(final TimedBlock timedBlock) {
        this.blocks.add(timedBlock);
    }

    public static void performTaskOnGAThread(final IBlock taskBlock) {
        performTaskDelayed(taskBlock, 0L);
    }

    public static void performTaskDelayed(final IBlock taskBlock, long delayInSeconds) {
        synchronized (getInstance()) {
            Date date = new Date();
            date.setTime(date.getTime() + (delayInSeconds * 1000));
            getInstance().addTimedBlock(new TimedBlock(date, taskBlock));
        }
    }

    public static void scheduleTimer(double interval, final IBlock callback) {
        synchronized (getInstance()) {
            Date date = new Date();
            date.setTime(date.getTime() + ((long) (interval * 1000.0d)));
            getInstance().addTimedBlock(new TimedBlock(date, callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TimedBlock getNextBlock() {
        synchronized (getInstance()) {
            Date date = new Date();
            if (getInstance().blocks.isEmpty() || ((TimedBlock) getInstance().blocks.peek()).deadLine.compareTo(date) > 0) {
                return null;
            }
            return (TimedBlock) getInstance().blocks.poll();
        }
    }
}
