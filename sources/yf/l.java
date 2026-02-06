package Yf;

import Eg.i;
import Eg.m;
import Lf.o;
import ag.k;
import eg.C5824a;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6502A;
import tg.g;

public final class l extends c {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ Ff.l[] f66759h = {O.i(new F(O.b(l.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g  reason: collision with root package name */
    private final i f66760g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(C5824a aVar, k kVar) {
        super(kVar, aVar, o.a.f63976L);
        C6496s.h(aVar, "annotation");
        C6496s.h(kVar, "c");
        this.f66760g = kVar.e().g(new k(this));
    }

    /* access modifiers changed from: private */
    public static final Map j(l lVar) {
        Map map;
        g b10 = f.f66750a.b(lVar.c());
        if (b10 != null) {
            map = mf.O.f(C6502A.a(d.f66744a.c(), b10));
        } else {
            map = null;
        }
        if (map == null) {
            return mf.O.i();
        }
        return map;
    }

    public Map a() {
        return (Map) m.a(this.f66760g, this, f66759h[0]);
    }
}
