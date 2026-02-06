package Yf;

import Eg.i;
import Eg.m;
import Ff.l;
import Lf.o;
import ag.k;
import eg.C5824a;
import eg.C5825b;
import eg.C5828e;
import eg.C5836m;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6502A;
import mf.C6565s;
import tg.g;

public final class n extends c {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ l[] f66762h = {O.i(new F(O.b(n.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g  reason: collision with root package name */
    private final i f66763g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(C5824a aVar, k kVar) {
        super(kVar, aVar, o.a.f63968H);
        C6496s.h(aVar, "annotation");
        C6496s.h(kVar, "c");
        this.f66763g = kVar.e().g(new m(this));
    }

    /* access modifiers changed from: private */
    public static final Map j(n nVar) {
        g gVar;
        C5825b c10 = nVar.c();
        Map map = null;
        if (c10 instanceof C5828e) {
            gVar = f.f66750a.d(((C5828e) nVar.c()).c());
        } else if (c10 instanceof C5836m) {
            gVar = f.f66750a.d(C6565s.e(nVar.c()));
        } else {
            gVar = null;
        }
        if (gVar != null) {
            map = mf.O.f(C6502A.a(d.f66744a.d(), gVar));
        }
        if (map == null) {
            return mf.O.i();
        }
        return map;
    }

    public Map a() {
        return (Map) m.a(this.f66763g, this, f66762h[0]);
    }
}
