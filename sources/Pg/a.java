package Pg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public abstract class a {
    public static final void a(Collection collection, Object obj) {
        C6496s.h(collection, "<this>");
        if (obj != null) {
            collection.add(obj);
        }
    }

    private static final int b(int i10) {
        if (i10 < 3) {
            return 3;
        }
        return i10 + (i10 / 3) + 1;
    }

    public static final List c(ArrayList arrayList) {
        C6496s.h(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C6565s.n();
        }
        if (size == 1) {
            return C6565s.e(C6565s.o0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final Map d(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        for (Object put : iterable) {
            linkedHashMap.put(put, Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    public static final HashMap e(int i10) {
        return new HashMap(b(i10));
    }

    public static final HashSet f(int i10) {
        return new HashSet(b(i10));
    }

    public static final LinkedHashSet g(int i10) {
        return new LinkedHashSet(b(i10));
    }
}
