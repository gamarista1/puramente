package Ug;

import Rg.h;
import Ug.C5600w0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C6494p;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;

abstract /* synthetic */ class C0 {

    /* synthetic */ class a extends C6494p implements C6798l {
        a(Object obj) {
            super(1, obj, C5592s0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        public final void i(Throwable th2) {
            ((C5592s0) this.receiver).b(th2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            i((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public static final C5605z a(C5600w0 w0Var) {
        return new C5606z0(w0Var);
    }

    public static /* synthetic */ C5605z b(C5600w0 w0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w0Var = null;
        }
        return A0.a(w0Var);
    }

    public static final void c(C5600w0 w0Var, String str, Throwable th2) {
        w0Var.n(C5577k0.a(str, th2));
    }

    public static final void d(g gVar, CancellationException cancellationException) {
        C5600w0 w0Var = (C5600w0) gVar.b(C5600w0.f65416O);
        if (w0Var != null) {
            w0Var.n(cancellationException);
        }
    }

    public static /* synthetic */ void e(C5600w0 w0Var, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        A0.c(w0Var, str, th2);
    }

    public static /* synthetic */ void f(g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        A0.d(gVar, cancellationException);
    }

    public static final Object g(C5600w0 w0Var, C6658d dVar) {
        C5600w0.a.a(w0Var, (CancellationException) null, 1, (Object) null);
        Object B02 = w0Var.B0(dVar);
        if (B02 == C6680b.f()) {
            return B02;
        }
        return C6514M.f71813a;
    }

    public static final void h(g gVar, CancellationException cancellationException) {
        h<C5600w0> E10;
        C5600w0 w0Var = (C5600w0) gVar.b(C5600w0.f65416O);
        if (w0Var != null && (E10 = w0Var.E()) != null) {
            for (C5600w0 n10 : E10) {
                n10.n(cancellationException);
            }
        }
    }

    public static /* synthetic */ void i(g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        A0.h(gVar, cancellationException);
    }

    public static final C5559b0 j(C5600w0 w0Var, C5559b0 b0Var) {
        return o(w0Var, false, false, new C5563d0(b0Var), 3, (Object) null);
    }

    public static final void k(C5600w0 w0Var) {
        if (!w0Var.a()) {
            throw w0Var.M();
        }
    }

    public static final void l(g gVar) {
        C5600w0 w0Var = (C5600w0) gVar.b(C5600w0.f65416O);
        if (w0Var != null) {
            A0.l(w0Var);
        }
    }

    public static final C5600w0 m(g gVar) {
        C5600w0 w0Var = (C5600w0) gVar.b(C5600w0.f65416O);
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }

    public static final C5559b0 n(C5600w0 w0Var, boolean z10, boolean z11, C5592s0 s0Var) {
        if (w0Var instanceof E0) {
            return ((E0) w0Var).s0(z10, z11, s0Var);
        }
        return w0Var.x0(z10, z11, new a(s0Var));
    }

    public static /* synthetic */ C5559b0 o(C5600w0 w0Var, boolean z10, boolean z11, C5592s0 s0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return A0.o(w0Var, z10, z11, s0Var);
    }

    public static final boolean p(g gVar) {
        C5600w0 w0Var = (C5600w0) gVar.b(C5600w0.f65416O);
        if (w0Var != null) {
            return w0Var.a();
        }
        return true;
    }
}
