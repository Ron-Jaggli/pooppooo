package com.gameanalytics.sdk.threading;

import java.util.Date;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
class TimedBlock implements Comparable<TimedBlock> {
    public final IBlock block;
    public final Date deadLine;

    public TimedBlock(Date deadLine, IBlock block) {
        this.deadLine = deadLine;
        this.block = block;
    }

    @Override // java.lang.Comparable
    public int compareTo(TimedBlock other) {
        return this.deadLine.compareTo(other.deadLine);
    }

    public String toString() {
        return "{TimedBlock: deadLine=" + this.deadLine.getTime() + ", block=" + this.block.getName() + "}";
    }
}
