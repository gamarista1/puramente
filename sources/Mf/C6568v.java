package mf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;

/* renamed from: mf.v  reason: case insensitive filesystem */
abstract class C6568v extends C6567u {
    public static List A(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C6565s.D(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static int y(Iterable iterable, int i10) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i10;
    }

    public static final Integer z(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }
}
