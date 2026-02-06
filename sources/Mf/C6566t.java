package mf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C6610b;

/* renamed from: mf.t  reason: case insensitive filesystem */
abstract class C6566t {
    public static List a(List list) {
        C6496s.h(list, "builder");
        return ((C6610b) list).E();
    }

    public static final Object[] b(Object[] objArr, boolean z10) {
        C6496s.h(objArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (z10 && C6496s.c(objArr.getClass(), cls)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, cls);
        C6496s.g(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static List c() {
        return new C6610b(0, 1, (DefaultConstructorMarker) null);
    }

    public static List d(int i10) {
        return new C6610b(i10);
    }

    public static List e(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C6496s.g(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List f(Iterable iterable) {
        C6496s.h(iterable, "<this>");
        List g12 = C6543C.g1(iterable);
        Collections.shuffle(g12);
        return g12;
    }

    public static Object[] g(int i10, Object[] objArr) {
        C6496s.h(objArr, "array");
        if (i10 < objArr.length) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
