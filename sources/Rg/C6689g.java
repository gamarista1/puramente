package rg;

import Fg.v0;
import Gg.g;
import Of.C5483a;
import Of.C5484b;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.D;
import Of.N;
import Of.h0;
import Of.m0;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import rg.C6697o;
import yf.p;

/* renamed from: rg.g  reason: case insensitive filesystem */
public final class C6689g {

    /* renamed from: a  reason: collision with root package name */
    public static final C6689g f73019a = new C6689g();

    private C6689g() {
    }

    public static /* synthetic */ boolean f(C6689g gVar, C5483a aVar, C5483a aVar2, boolean z10, boolean z11, boolean z12, g gVar2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            z12 = false;
        }
        return gVar.e(aVar, aVar2, z10, z13, z12, gVar2);
    }

    /* access modifiers changed from: private */
    public static final boolean g(C5495m mVar, C5495m mVar2) {
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean h(boolean z10, C5483a aVar, C5483a aVar2, v0 v0Var, v0 v0Var2) {
        C6496s.h(v0Var, "c1");
        C6496s.h(v0Var2, "c2");
        if (C6496s.c(v0Var, v0Var2)) {
            return true;
        }
        C5490h o10 = v0Var.o();
        C5490h o11 = v0Var2.o();
        if (!(o10 instanceof m0) || !(o11 instanceof m0)) {
            return false;
        }
        return f73019a.n((m0) o10, (m0) o11, z10, new C6688f(aVar, aVar2));
    }

    /* access modifiers changed from: private */
    public static final boolean i(C5483a aVar, C5483a aVar2, C5495m mVar, C5495m mVar2) {
        if (!C6496s.c(mVar, aVar) || !C6496s.c(mVar2, aVar2)) {
            return false;
        }
        return true;
    }

    private final boolean j(C5487e eVar, C5487e eVar2) {
        return C6496s.c(eVar.l(), eVar2.l());
    }

    public static /* synthetic */ boolean l(C6689g gVar, C5495m mVar, C5495m mVar2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return gVar.k(mVar, mVar2, z10, z11);
    }

    public static /* synthetic */ boolean o(C6689g gVar, m0 m0Var, m0 m0Var2, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            pVar = C6685c.f73012a;
        }
        return gVar.n(m0Var, m0Var2, z10, pVar);
    }

    /* access modifiers changed from: private */
    public static final boolean p(C5495m mVar, C5495m mVar2) {
        return false;
    }

    private final boolean q(C5495m mVar, C5495m mVar2, p pVar, boolean z10) {
        C5495m b10 = mVar.b();
        C5495m b11 = mVar2.b();
        if ((b10 instanceof C5484b) || (b11 instanceof C5484b)) {
            return ((Boolean) pVar.invoke(b10, b11)).booleanValue();
        }
        return l(this, b10, b11, z10, false, 8, (Object) null);
    }

    private final h0 r(C5483a aVar) {
        while (aVar instanceof C5484b) {
            C5484b bVar = (C5484b) aVar;
            if (bVar.h() != C5484b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection e10 = bVar.e();
            C6496s.g(e10, "getOverriddenDescriptors(...)");
            aVar = (C5484b) C6565s.Q0(e10);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.i();
    }

    public final boolean e(C5483a aVar, C5483a aVar2, boolean z10, boolean z11, boolean z12, g gVar) {
        C6496s.h(aVar, "a");
        C6496s.h(aVar2, "b");
        C6496s.h(gVar, "kotlinTypeRefiner");
        if (C6496s.c(aVar, aVar2)) {
            return true;
        }
        if (!C6496s.c(aVar.getName(), aVar2.getName())) {
            return false;
        }
        if (z11 && (aVar instanceof D) && (aVar2 instanceof D) && ((D) aVar).k0() != ((D) aVar2).k0()) {
            return false;
        }
        if ((C6496s.c(aVar.b(), aVar2.b()) && (!z10 || !C6496s.c(r(aVar), r(aVar2)))) || C6691i.E(aVar) || C6691i.E(aVar2) || !q(aVar, aVar2, C6686d.f73013a, z10)) {
            return false;
        }
        C6697o i10 = C6697o.i(gVar, new C6687e(z10, aVar, aVar2));
        C6496s.g(i10, "create(...)");
        C6697o.i.a c10 = i10.E(aVar, aVar2, (C5487e) null, !z12).c();
        C6697o.i.a aVar3 = C6697o.i.a.OVERRIDABLE;
        if (c10 == aVar3 && i10.E(aVar2, aVar, (C5487e) null, !z12).c() == aVar3) {
            return true;
        }
        return false;
    }

    public final boolean k(C5495m mVar, C5495m mVar2, boolean z10, boolean z11) {
        if ((mVar instanceof C5487e) && (mVar2 instanceof C5487e)) {
            return j((C5487e) mVar, (C5487e) mVar2);
        }
        if ((mVar instanceof m0) && (mVar2 instanceof m0)) {
            return o(this, (m0) mVar, (m0) mVar2, z10, (p) null, 8, (Object) null);
        } else if ((mVar instanceof C5483a) && (mVar2 instanceof C5483a)) {
            return f(this, (C5483a) mVar, (C5483a) mVar2, z10, z11, false, g.a.f63180a, 16, (Object) null);
        } else if (!(mVar instanceof N) || !(mVar2 instanceof N)) {
            return C6496s.c(mVar, mVar2);
        } else {
            return C6496s.c(((N) mVar).f(), ((N) mVar2).f());
        }
    }

    public final boolean m(m0 m0Var, m0 m0Var2, boolean z10) {
        C6496s.h(m0Var, "a");
        C6496s.h(m0Var2, "b");
        return o(this, m0Var, m0Var2, z10, (p) null, 8, (Object) null);
    }

    public final boolean n(m0 m0Var, m0 m0Var2, boolean z10, p pVar) {
        C6496s.h(m0Var, "a");
        C6496s.h(m0Var2, "b");
        C6496s.h(pVar, "equivalentCallables");
        if (C6496s.c(m0Var, m0Var2)) {
            return true;
        }
        if (C6496s.c(m0Var.b(), m0Var2.b()) || !q(m0Var, m0Var2, pVar, z10)) {
            return false;
        }
        if (m0Var.getIndex() == m0Var2.getIndex()) {
            return true;
        }
        return false;
    }
}
