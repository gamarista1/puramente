package pf;

import java.util.Comparator;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

/* renamed from: pf.c  reason: case insensitive filesystem */
abstract class C6634c {
    public static Comparator b(C6798l... lVarArr) {
        C6496s.h(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return new C6633b(lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* access modifiers changed from: private */
    public static final int c(C6798l[] lVarArr, Object obj, Object obj2) {
        return e(obj, obj2, lVarArr);
    }

    public static int d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    private static final int e(Object obj, Object obj2, C6798l[] lVarArr) {
        for (C6798l lVar : lVarArr) {
            int d10 = C6632a.d((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
            if (d10 != 0) {
                return d10;
            }
        }
        return 0;
    }

    public static Comparator f() {
        C6637f fVar = C6637f.f72482a;
        C6496s.f(fVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return fVar;
    }

    public static Comparator g() {
        C6638g gVar = C6638g.f72483a;
        C6496s.f(gVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return gVar;
    }
}
