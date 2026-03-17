package com.yahoo.sketches;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public class SketchesReadOnlyException extends SketchesException {
    private static final long serialVersionUID = 1;

    public SketchesReadOnlyException() {
        super("Write operation attempted on a read-only class.");
    }

    public SketchesReadOnlyException(final String message) {
        super(message);
    }
}
