package We;

import We.C5632i0;
import bf.C5733c;
import bf.C5734d;
import ff.C5868v;
import java.io.Closeable;
import p003if.d;
import p003if.h;

/* renamed from: We.r0  reason: case insensitive filesystem */
public final class C5649r0 implements C5658w {

    /* renamed from: a  reason: collision with root package name */
    private final C5656v f65928a;

    /* renamed from: b  reason: collision with root package name */
    private final C5656v f65929b;

    /* renamed from: c  reason: collision with root package name */
    private final C5656v f65930c;

    /* renamed from: d  reason: collision with root package name */
    private final C5649r0 f65931d;

    /* renamed from: e  reason: collision with root package name */
    private final String f65932e;

    /* renamed from: f  reason: collision with root package name */
    private final C5623e f65933f;

    /* renamed from: g  reason: collision with root package name */
    private final C5621d f65934g;

    public C5649r0(C5656v vVar, C5656v vVar2, C5656v vVar3, String str) {
        this(vVar, vVar2, vVar3, (C5649r0) null, str);
    }

    private void C(C5868v vVar) {
        s().f(vVar);
    }

    private static void D(M0 m02) {
        h.c(m02, "SentryOptions is required.");
        if (m02.n() == null || m02.n().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
    }

    private void k(C5663y0 y0Var) {
        s().c(y0Var);
    }

    private C5656v l(C5656v vVar, C5634j0 j0Var) {
        if (j0Var != null) {
            try {
                C5656v clone = vVar.clone();
                j0Var.a(clone);
                return clone;
            } catch (Throwable th2) {
                t().s().a(E0.ERROR, "Error in the 'ScopeCallback' callback.", th2);
            }
        }
        return vVar;
    }

    private C5868v m(C5663y0 y0Var, C5643o oVar, C5634j0 j0Var) {
        C5868v vVar = C5868v.f67577b;
        if (!u()) {
            t().s().b(E0.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return vVar;
        } else if (y0Var == null) {
            t().s().b(E0.WARNING, "captureEvent called with null parameter.", new Object[0]);
            return vVar;
        } else {
            try {
                k(y0Var);
                vVar = r().c(y0Var, l(s(), j0Var), oVar);
                C(vVar);
                return vVar;
            } catch (Throwable th2) {
                C5654u s10 = t().s();
                E0 e02 = E0.ERROR;
                s10.a(e02, "Error while capturing event with id: " + y0Var.b(), th2);
                return vVar;
            }
        }
    }

    private C5660x r() {
        return s().e();
    }

    private C5656v s() {
        return this.f65934g;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(C5662y yVar) {
        yVar.a(t().x());
    }

    public void B() {
        if (!u()) {
            t().s().b(E0.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        C5632i0.a g10 = s().g();
        if (g10 != null) {
            if (g10.b() != null) {
                r().b(g10.b(), d.a(new C5733c()));
            }
            r().b(g10.a(), d.a(new C5734d()));
            return;
        }
        t().s().b(E0.WARNING, "Session could not be started.", new Object[0]);
    }

    public C5611D a() {
        if (!u()) {
            t().s().b(E0.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
            return null;
        }
        s().a();
        return null;
    }

    public C5868v c(C5663y0 y0Var, C5643o oVar) {
        return m(y0Var, oVar, (C5634j0) null);
    }

    public void d(C5636k0 k0Var, C5634j0 j0Var) {
        if (!u()) {
            t().s().b(E0.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            j0Var.a(this.f65934g.i(k0Var));
        } catch (Throwable th2) {
            t().s().a(E0.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    public void n() {
        o(false);
    }

    public void o(boolean z10) {
        if (!u()) {
            t().s().b(E0.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (J j10 : t().r()) {
                if (j10 instanceof Closeable) {
                    ((Closeable) j10).close();
                }
            }
            b(new C5638l0());
            C5636k0 k0Var = C5636k0.ISOLATION;
            d(k0Var, new C5640m0());
            t().h().close();
            t().A().close();
            t().k().a(true);
            t().j().close();
            C5662y p10 = t().p();
            if (z10) {
                p10.submit(new C5642n0(this, p10));
            } else {
                p10.a(t().x());
            }
            d(C5636k0.CURRENT, new C5644o0(z10));
            d(k0Var, new C5646p0(z10));
            d(C5636k0.GLOBAL, new C5648q0(z10));
        } catch (Throwable th2) {
            t().s().a(E0.ERROR, "Error while closing the Scopes.", th2);
        }
    }

    public void p() {
        if (!u()) {
            t().s().b(E0.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        U0 d10 = s().d();
        if (d10 != null) {
            r().b(d10, d.a(new C5733c()));
        }
    }

    public C5658w q(String str) {
        return new C5649r0(this.f65928a.clone(), this.f65929b.clone(), this.f65930c, this, str);
    }

    public M0 t() {
        return this.f65934g.b();
    }

    public boolean u() {
        return r().isEnabled();
    }

    private C5649r0(C5656v vVar, C5656v vVar2, C5656v vVar3, C5649r0 r0Var, String str) {
        this.f65934g = new C5621d(vVar3, vVar2, vVar);
        this.f65928a = vVar;
        this.f65929b = vVar2;
        this.f65930c = vVar3;
        this.f65931d = r0Var;
        this.f65932e = str;
        M0 t10 = t();
        D(t10);
        this.f65933f = t10.j();
    }

    public C5652t clone() {
        if (!u()) {
            t().s().b(E0.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new C5645p(q("scopes clone"));
    }
}
