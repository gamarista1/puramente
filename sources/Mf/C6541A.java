package mf;

import Ef.i;
import java.util.List;
import kotlin.jvm.internal.C6496s;

/* renamed from: mf.A  reason: case insensitive filesystem */
abstract class C6541A extends C6572z {
    public static List U(List list) {
        C6496s.h(list, "<this>");
        return new W(list);
    }

    public static List V(List list) {
        C6496s.h(list, "<this>");
        return new V(list);
    }

    /* access modifiers changed from: private */
    public static final int W(List list, int i10) {
        if (i10 >= 0 && i10 <= C6565s.p(list)) {
            return C6565s.p(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new i(0, C6565s.p(list)) + "].");
    }

    /* access modifiers changed from: private */
    public static final int X(List list, int i10) {
        return C6565s.p(list) - i10;
    }

    /* access modifiers changed from: private */
    public static final int Y(List list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new i(0, list.size()) + "].");
    }
}
