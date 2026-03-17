package com.yahoo.sketches;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/11.dex
 */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
public enum Family {
    ALPHA(1, "Alpha", 3, 3),
    QUICKSELECT(2, "QuickSelect", 3, 3),
    COMPACT(3, "Compact", 1, 3),
    UNION(4, "Union", 4, 4),
    INTERSECTION(5, "Intersection", 3, 3),
    A_NOT_B(6, "AnotB", 3, 3),
    HLL(7, "HLL", 1, 1),
    QUANTILES(8, "QUANTILES", 1, 2),
    TUPLE(9, "TUPLE", 1, 1),
    FREQUENCY(10, "FREQUENCY", 1, 4),
    RESERVOIR(11, "RESERVOIR", 1, 2),
    RESERVOIR_UNION(12, "RESERVOIR_UNION", 1, 1),
    VAROPT(13, "VAROPT", 1, 4),
    VAROPT_UNION(14, "VAROPT_UNION", 1, 4),
    KLL(15, "KLL", 1, 2);

    private String famName_;
    private int id_;
    private int maxPreLongs_;
    private int minPreLongs_;
    private static final Map<Integer, Family> lookupID = new HashMap();
    private static final Map<String, Family> lookupFamName = new HashMap();

    static {
        for (Family family : values()) {
            lookupID.put(Integer.valueOf(family.getID()), family);
            lookupFamName.put(family.getFamilyName().toUpperCase(), family);
        }
    }

    Family(final int id, final String famName, final int minPreLongs, final int maxPreLongs) {
        this.id_ = id;
        this.famName_ = famName.toUpperCase();
        this.minPreLongs_ = minPreLongs;
        this.maxPreLongs_ = maxPreLongs;
    }

    public int getID() {
        return this.id_;
    }

    public void checkFamilyID(final int id) {
        if (id != this.id_) {
            throw new SketchesArgumentException("Possible Corruption: This Family " + toString() + " does not match the ID of the given Family: " + idToFamily(id).toString());
        }
    }

    public String getFamilyName() {
        return this.famName_;
    }

    public int getMinPreLongs() {
        return this.minPreLongs_;
    }

    public int getMaxPreLongs() {
        return this.maxPreLongs_;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.famName_;
    }

    public static Family idToFamily(final int id) {
        Family family = lookupID.get(Integer.valueOf(id));
        if (family != null) {
            return family;
        }
        throw new SketchesArgumentException("Possible Corruption: Illegal Family ID: " + id);
    }

    public static Family stringToFamily(final String famName) {
        Family family = lookupFamName.get(famName.toUpperCase());
        if (family != null) {
            return family;
        }
        throw new SketchesArgumentException("Possible Corruption: Illegal Family Name: " + famName);
    }
}
