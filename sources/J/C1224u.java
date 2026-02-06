package J;

import W0.r;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.platform.C1651m1;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import p0.e;
import yf.C6798l;

/* renamed from: J.u  reason: case insensitive filesystem */
public final class C1224u implements C1225v {

    /* renamed from: a  reason: collision with root package name */
    private final C1651m1 f3475a;

    /* renamed from: b  reason: collision with root package name */
    public C1226w f3476b;

    /* renamed from: c  reason: collision with root package name */
    public e f3477c;

    public C1224u(C1651m1 m1Var) {
        this.f3475a = m1Var;
    }

    public void a(int i10) {
        boolean z10;
        boolean z11;
        r.a aVar = r.f8593b;
        if (r.m(i10, aVar.d())) {
            b().e(d.f13315b.e());
        } else if (r.m(i10, aVar.f())) {
            b().e(d.f13315b.f());
        } else if (r.m(i10, aVar.b())) {
            C1651m1 m1Var = this.f3475a;
            if (m1Var != null) {
                m1Var.a();
            }
        } else {
            boolean z12 = true;
            if (r.m(i10, aVar.c())) {
                z10 = true;
            } else {
                z10 = r.m(i10, aVar.g());
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = r.m(i10, aVar.h());
            }
            if (!z11) {
                z12 = r.m(i10, aVar.a());
            }
            if (!z12) {
                r.m(i10, aVar.e());
            }
        }
    }

    public final e b() {
        e eVar = this.f3477c;
        if (eVar != null) {
            return eVar;
        }
        C6496s.v("focusManager");
        return null;
    }

    public final C1226w c() {
        C1226w wVar = this.f3476b;
        if (wVar != null) {
            return wVar;
        }
        C6496s.v("keyboardActions");
        return null;
    }

    public final void d(int i10) {
        C6798l lVar;
        boolean z10;
        r.a aVar = r.f8593b;
        C6514M m10 = null;
        if (r.m(i10, aVar.b())) {
            lVar = c().b();
        } else if (r.m(i10, aVar.c())) {
            lVar = c().c();
        } else if (r.m(i10, aVar.d())) {
            lVar = c().d();
        } else if (r.m(i10, aVar.f())) {
            lVar = c().e();
        } else if (r.m(i10, aVar.g())) {
            lVar = c().f();
        } else if (r.m(i10, aVar.h())) {
            lVar = c().g();
        } else {
            if (r.m(i10, aVar.a())) {
                z10 = true;
            } else {
                z10 = r.m(i10, aVar.e());
            }
            if (z10) {
                lVar = null;
            } else {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        if (lVar != null) {
            lVar.invoke(this);
            m10 = C6514M.f71813a;
        }
        if (m10 == null) {
            a(i10);
        }
    }

    public final void e(e eVar) {
        this.f3477c = eVar;
    }

    public final void f(C1226w wVar) {
        this.f3476b = wVar;
    }
}
