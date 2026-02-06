package Yf;

import Eg.i;
import Eg.m;
import Ff.l;
import Fg.C5366d0;
import Of.h0;
import Zf.g;
import ag.k;
import eg.C5824a;
import eg.C5825b;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mf.C6565s;

public class c implements g {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ l[] f66738f = {O.i(new F(O.b(c.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a  reason: collision with root package name */
    private final ng.c f66739a;

    /* renamed from: b  reason: collision with root package name */
    private final h0 f66740b;

    /* renamed from: c  reason: collision with root package name */
    private final i f66741c;

    /* renamed from: d  reason: collision with root package name */
    private final C5825b f66742d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f66743e;

    public c(k kVar, C5824a aVar, ng.c cVar) {
        h0 h0Var;
        C5825b bVar;
        Collection c10;
        C6496s.h(kVar, "c");
        C6496s.h(cVar, "fqName");
        this.f66739a = cVar;
        if (aVar == null || (h0Var = kVar.a().t().a(aVar)) == null) {
            h0Var = h0.f64497a;
            C6496s.g(h0Var, "NO_SOURCE");
        }
        this.f66740b = h0Var;
        this.f66741c = kVar.e().g(new b(kVar, this));
        if (aVar == null || (c10 = aVar.c()) == null) {
            bVar = null;
        } else {
            bVar = (C5825b) C6565s.p0(c10);
        }
        this.f66742d = bVar;
        boolean z10 = false;
        if (aVar != null && aVar.e()) {
            z10 = true;
        }
        this.f66743e = z10;
    }

    /* access modifiers changed from: private */
    public static final C5366d0 g(k kVar, c cVar) {
        C5366d0 p10 = kVar.d().m().o(cVar.f()).p();
        C6496s.g(p10, "getDefaultType(...)");
        return p10;
    }

    public Map a() {
        return mf.O.i();
    }

    /* access modifiers changed from: protected */
    public final C5825b c() {
        return this.f66742d;
    }

    /* renamed from: d */
    public C5366d0 getType() {
        return (C5366d0) m.a(this.f66741c, this, f66738f[0]);
    }

    public boolean e() {
        return this.f66743e;
    }

    public ng.c f() {
        return this.f66739a;
    }

    public h0 i() {
        return this.f66740b;
    }
}
