package com.fingerprintjs.android.fingerprint.tools.parsers;

import com.fingerprintjs.android.fingerprint.info_providers.CpuInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX WARN: Classes with same name are omitted, all sources:
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex
  /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/8.dex
 */
/* JADX INFO: compiled from: CpuInfoParser.kt */
/* JADX INFO: loaded from: /storage/emulated/0/Documents/jadec/sources/com.TrassGames.G2Companion/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"SINGLE_PROCESSOR_KEY", "", "parseCpuInfo", "Lcom/fingerprintjs/android/fingerprint/info_providers/CpuInfo;", "contents", "fingerprint_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CpuInfoParserKt {
    private static final String SINGLE_PROCESSOR_KEY = "processor";

    public static final CpuInfo parseCpuInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "contents");
        List listPlus = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.listOf(""), StringsKt.lines(str)), CollectionsKt.listOf(""));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        int i = 0;
        for (Object obj : listPlus) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to((String) obj, Integer.valueOf(i)));
            i = i2;
        }
        List listFilterNotNull = CollectionsKt.filterNotNull(CollectionsKt.windowed(arrayList, 2, 1, false, new Function1<List<? extends Pair<? extends String, ? extends Integer>>, Integer>() { // from class: com.fingerprintjs.android.fingerprint.tools.parsers.CpuInfoParserKt$parseCpuInfo$repeatedBlankLinesIndices$2
            public final Integer invoke(List<Pair<String, Integer>> list) {
                Intrinsics.checkNotNullParameter(list, "it");
                String str2 = (String) list.get(0).component1();
                Pair<String, Integer> pair = list.get(1);
                String str3 = (String) pair.component1();
                int iIntValue = ((Number) pair.component2()).intValue();
                if (StringsKt.isBlank(str2) && StringsKt.isBlank(str3)) {
                    return Integer.valueOf(iIntValue);
                }
                return null;
            }
        }));
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        for (Object obj2 : listPlus) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!listFilterNotNull.contains(Integer.valueOf(i3))) {
                arrayList2.add(obj2);
            }
            i3 = i4;
        }
        final ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        int i5 = 0;
        for (Object obj3 : arrayList4) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Integer numValueOf = Integer.valueOf(i5);
            numValueOf.intValue();
            if (!StringsKt.isBlank((String) obj3)) {
                numValueOf = null;
            }
            arrayList5.add(numValueOf);
            i5 = i6;
        }
        List<List> listWindowed = CollectionsKt.windowed(CollectionsKt.filterNotNull(arrayList5), 2, 1, false, new Function1<List<? extends Integer>, List<? extends String>>() { // from class: com.fingerprintjs.android.fingerprint.tools.parsers.CpuInfoParserKt$parseCpuInfo$sectionsOfLines$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final List<String> invoke(List<Integer> list) {
                Intrinsics.checkNotNullParameter(list, "it");
                return CollectionsKt.slice(arrayList3, new IntRange(list.get(0).intValue() + 1, list.get(1).intValue() - 1));
            }
        });
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listWindowed, 10));
        for (List list : listWindowed) {
            ArrayList arrayList7 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair<String, String> cpuInfo$parseLine = parseCpuInfo$parseLine((String) it.next());
                if (cpuInfo$parseLine != null) {
                    arrayList7.add(cpuInfo$parseLine);
                }
            }
            arrayList6.add(arrayList7);
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj4 : arrayList6) {
            if (!((List) obj4).isEmpty()) {
                arrayList8.add(obj4);
            }
        }
        ArrayList arrayList9 = arrayList8;
        ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
        Iterator it2 = arrayList9.iterator();
        while (it2.hasNext()) {
            arrayList10.add(parseCpuInfo$extractProcessorInfo((List) it2.next()));
        }
        ArrayList arrayList11 = new ArrayList();
        for (Object obj5 : arrayList10) {
            if (!((List) obj5).isEmpty()) {
                arrayList11.add(obj5);
            }
        }
        ArrayList<List> arrayList12 = arrayList11;
        ArrayList arrayList13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList12, 10));
        for (List list2 : arrayList12) {
            ArrayList arrayList14 = new ArrayList();
            for (Object obj6 : list2) {
                if (!parseCpuInfo$isSingleProcessorPair((Pair) obj6)) {
                    arrayList14.add(obj6);
                }
            }
            arrayList13.add(arrayList14);
        }
        ArrayList arrayList15 = arrayList13;
        ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
        Iterator it3 = arrayList9.iterator();
        while (it3.hasNext()) {
            arrayList16.add(parseCpuInfo$extractCommonInfo((List) it3.next()));
        }
        ArrayList arrayList17 = new ArrayList();
        for (Object obj7 : arrayList16) {
            if (!((List) obj7).isEmpty()) {
                arrayList17.add(obj7);
            }
        }
        return new CpuInfo(CollectionsKt.flatten(arrayList17), arrayList15);
    }

    private static final Pair<String, String> parseCpuInfo$parseLine(String str) {
        String strSubstring;
        String strSubstring2;
        List listSplit$default = StringsKt.split$default(str, new String[]{":"}, false, 2, 2, (Object) null);
        if (listSplit$default.size() != 2) {
            listSplit$default = null;
        }
        if (listSplit$default == null) {
            return null;
        }
        List<String> list = listSplit$default;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (String str2 : list) {
            int length = str2.length();
            int i = 0;
            while (true) {
                strSubstring = "";
                if (i >= length) {
                    strSubstring2 = "";
                    break;
                }
                if (!CharsKt.isWhitespace(str2.charAt(i))) {
                    strSubstring2 = str2.substring(i);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    break;
                }
                i++;
            }
            int lastIndex = StringsKt.getLastIndex(strSubstring2);
            while (true) {
                if (-1 >= lastIndex) {
                    break;
                }
                if (!CharsKt.isWhitespace(strSubstring2.charAt(lastIndex))) {
                    strSubstring = strSubstring2.substring(0, lastIndex + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    break;
                }
                lastIndex--;
            }
            arrayList.add(strSubstring);
        }
        ArrayList arrayList2 = arrayList;
        return TuplesKt.to(arrayList2.get(0), arrayList2.get(1));
    }

    private static final boolean parseCpuInfo$isSingleProcessorPair(Pair<String, String> pair) {
        if (!Intrinsics.areEqual(pair.getFirst(), SINGLE_PROCESSOR_KEY)) {
            return false;
        }
        CharSequence charSequence = (CharSequence) pair.getSecond();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static final List<Pair<String, String>> parseCpuInfo$extractProcessorInfo(List<Pair<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Object obj : list) {
            if (!z) {
                if (parseCpuInfo$isSingleProcessorPair((Pair) obj)) {
                    arrayList.add(obj);
                    z = true;
                }
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static final List<Pair<String, String>> parseCpuInfo$extractCommonInfo(List<Pair<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (parseCpuInfo$isSingleProcessorPair((Pair) obj)) {
                break;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
