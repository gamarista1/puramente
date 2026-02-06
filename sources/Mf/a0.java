package mf;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

abstract class a0 extends Z {
    public static Set e() {
        return C6547G.f72031a;
    }

    public static HashSet f(Object... objArr) {
        C6496s.h(objArr, "elements");
        return (HashSet) C6563p.f1(objArr, new HashSet(O.e(objArr.length)));
    }

    public static LinkedHashSet g(Object... objArr) {
        C6496s.h(objArr, "elements");
        return (LinkedHashSet) C6563p.f1(objArr, new LinkedHashSet(O.e(objArr.length)));
    }

    public static Set h(Object... objArr) {
        C6496s.h(objArr, "elements");
        return (Set) C6563p.f1(objArr, new LinkedHashSet(O.e(objArr.length)));
    }

    public static final Set i(Set set) {
        C6496s.h(set, "<this>");
        int size = set.size();
        if (size == 0) {
            return Y.e();
        }
        if (size != 1) {
            return set;
        }
        return Y.d(set.iterator().next());
    }

    public static Set j(Object... objArr) {
        C6496s.h(objArr, "elements");
        return C6559l.z1(objArr);
    }

    public static Set k(Object... objArr) {
        C6496s.h(objArr, "elements");
        return (Set) C6563p.a0(objArr, new LinkedHashSet());
    }
}
