package Dg;

import Eg.i;
import Eg.m;
import Eg.n;
import Ff.l;
import Pf.c;
import Pf.h;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import yf.C6787a;

/* renamed from: Dg.a  reason: case insensitive filesystem */
public class C5340a implements h {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ l[] f62708b = {O.i(new F(O.b(C5340a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a  reason: collision with root package name */
    private final i f62709a;

    public C5340a(n nVar, C6787a aVar) {
        C6496s.h(nVar, "storageManager");
        C6496s.h(aVar, "compute");
        this.f62709a = nVar.g(aVar);
    }

    private final List a() {
        return (List) m.a(this.f62709a, this, f62708b[0]);
    }

    public c i(ng.c cVar) {
        return h.b.a(this, cVar);
    }

    public boolean isEmpty() {
        return a().isEmpty();
    }

    public Iterator iterator() {
        return a().iterator();
    }

    public boolean n0(ng.c cVar) {
        return h.b.b(this, cVar);
    }
}
