package mf;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C6496s;

/* renamed from: mf.y  reason: case insensitive filesystem */
abstract class C6571y extends C6570x {
    public static void B(List list) {
        C6496s.h(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void C(List list, Comparator comparator) {
        C6496s.h(list, "<this>");
        C6496s.h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
