package com.gameanalytics.sdk.threading;

import java.lang.Comparable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
class FIFOPriorityQueue<T extends Comparable<? super T>> {
    private final PriorityBlockingQueue<FIFOEntry<T>> _queue = new PriorityBlockingQueue<>();

    public void add(T value) {
        this._queue.add(new FIFOEntry<>(value));
    }

    public boolean isEmpty() {
        return this._queue.isEmpty();
    }

    public T peek() {
        FIFOEntry<T> fIFOEntryPeek = this._queue.peek();
        if (fIFOEntryPeek == null) {
            return null;
        }
        return (T) fIFOEntryPeek.getEntry();
    }

    public T poll() {
        FIFOEntry<T> fIFOEntryPoll = this._queue.poll();
        if (fIFOEntryPoll == null) {
            return null;
        }
        return (T) fIFOEntryPoll.getEntry();
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
      /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/9.dex
     */
    private static class FIFOEntry<E extends Comparable<? super E>> implements Comparable<FIFOEntry<E>> {
        private static final AtomicLong seq = new AtomicLong();
        private final E entry;
        private final long seqNum;

        private FIFOEntry(E entry) {
            this.seqNum = seq.getAndIncrement();
            this.entry = entry;
        }

        public E getEntry() {
            return this.entry;
        }

        @Override // java.lang.Comparable
        public int compareTo(FIFOEntry<E> other) {
            int iCompareTo = this.entry.compareTo(other.entry);
            if (iCompareTo != 0 || other.entry == this.entry) {
                return iCompareTo;
            }
            return this.seqNum < other.seqNum ? -1 : 1;
        }
    }
}
