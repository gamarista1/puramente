package Pf;

import Rg.h;
import Rg.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import mf.C6565s;
import ng.c;

public final class o implements h {

    /* renamed from: a  reason: collision with root package name */
    private final List f64614a;

    public o(List list) {
        C6496s.h(list, "delegates");
        this.f64614a = list;
    }

    /* access modifiers changed from: private */
    public static final c g(c cVar, h hVar) {
        C6496s.h(hVar, "it");
        return hVar.i(cVar);
    }

    /* access modifiers changed from: private */
    public static final h k(h hVar) {
        C6496s.h(hVar, "it");
        return C6565s.b0(hVar);
    }

    public c i(c cVar) {
        C6496s.h(cVar, "fqName");
        return (c) k.r(k.y(C6565s.b0(this.f64614a), new m(cVar)));
    }

    public boolean isEmpty() {
        Iterable<h> iterable = this.f64614a;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (h isEmpty : iterable) {
            if (!isEmpty.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Iterator iterator() {
        return k.s(C6565s.b0(this.f64614a), n.f64613a).iterator();
    }

    public boolean n0(c cVar) {
        C6496s.h(cVar, "fqName");
        for (h n02 : C6565s.b0(this.f64614a)) {
            if (n02.n0(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o(h... hVarArr) {
        this(C6559l.n1(hVarArr));
        C6496s.h(hVarArr, "delegates");
    }
}
