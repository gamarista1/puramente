package com.google.common.collect;

import java.util.Comparator;
import nb.C5112g;
import nb.o;

public abstract class O implements Comparator {
    protected O() {
    }

    public static O b(Comparator comparator) {
        if (comparator instanceof O) {
            return (O) comparator;
        }
        return new C4762m(comparator);
    }

    public static O d() {
        return L.f56622a;
    }

    public O a(Comparator comparator) {
        return new C4764o(this, (Comparator) o.j(comparator));
    }

    public C4770v c(Iterable iterable) {
        return C4770v.W(this, iterable);
    }

    public abstract int compare(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public O e() {
        return f(G.e());
    }

    public O f(C5112g gVar) {
        return new C4757h(gVar, this);
    }

    public O g() {
        return new W(this);
    }
}
