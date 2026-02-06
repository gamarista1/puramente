package mf;

import Ef.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import pf.C6632a;
import yf.C6798l;

/* renamed from: mf.u  reason: case insensitive filesystem */
abstract class C6567u extends C6566t {
    public static ArrayList h(Object... objArr) {
        C6496s.h(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C6557j(objArr, true));
    }

    public static final Collection i(Object[] objArr) {
        C6496s.h(objArr, "<this>");
        return new C6557j(objArr, false);
    }

    public static int j(List list, int i10, int i11, C6798l lVar) {
        C6496s.h(list, "<this>");
        C6496s.h(lVar, "comparison");
        v(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int intValue = ((Number) lVar.invoke(list.get(i13))).intValue();
            if (intValue < 0) {
                i10 = i13 + 1;
            } else if (intValue <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final int k(List list, Comparable comparable, int i10, int i11) {
        C6496s.h(list, "<this>");
        v(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int d10 = C6632a.d((Comparable) list.get(i13), comparable);
            if (d10 < 0) {
                i10 = i13 + 1;
            } else if (d10 <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int l(List list, int i10, int i11, C6798l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return C6565s.j(list, i10, i11, lVar);
    }

    public static /* synthetic */ int m(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return k(list, comparable, i10, i11);
    }

    public static List n() {
        return C6545E.f72029a;
    }

    public static i o(Collection collection) {
        C6496s.h(collection, "<this>");
        return new i(0, collection.size() - 1);
    }

    public static int p(List list) {
        C6496s.h(list, "<this>");
        return list.size() - 1;
    }

    public static List q(Object... objArr) {
        C6496s.h(objArr, "elements");
        if (objArr.length > 0) {
            return C6559l.e(objArr);
        }
        return C6565s.n();
    }

    public static List r(Object obj) {
        if (obj != null) {
            return C6565s.e(obj);
        }
        return C6565s.n();
    }

    public static List s(Object... objArr) {
        C6496s.h(objArr, "elements");
        return C6559l.Z(objArr);
    }

    public static List t(Object... objArr) {
        C6496s.h(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C6557j(objArr, true));
    }

    public static final List u(List list) {
        C6496s.h(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return C6565s.n();
        }
        if (size != 1) {
            return list;
        }
        return C6565s.e(list.get(0));
    }

    private static final void v(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        } else if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        } else if (i12 > i10) {
            throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
        }
    }

    public static void w() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void x() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
