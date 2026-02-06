package Ug;

import Zg.C5722k;
import Zg.K;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import qf.g;

public abstract class Y {
    public static final void a(X x10, int i10) {
        boolean z10;
        C6658d d10 = x10.d();
        if (i10 == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || !(d10 instanceof C5722k) || b(i10) != b(x10.f65339c)) {
            d(x10, d10, z10);
            return;
        }
        G g10 = ((C5722k) d10).f66977d;
        g context = d10.getContext();
        if (g10.B1(context)) {
            g10.z1(context, x10);
        } else {
            e(x10);
        }
    }

    public static final boolean b(int i10) {
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public static final boolean c(int i10) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    public static final void d(X x10, C6658d dVar, boolean z10) {
        Object f10;
        g1 g1Var;
        Object h10 = x10.h();
        Throwable e10 = x10.e(h10);
        if (e10 != null) {
            v.a aVar = v.f71841b;
            f10 = w.a(e10);
        } else {
            v.a aVar2 = v.f71841b;
            f10 = x10.f(h10);
        }
        Object b10 = v.b(f10);
        if (z10) {
            C6496s.f(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C5722k kVar = (C5722k) dVar;
            C6658d dVar2 = kVar.f66978e;
            Object obj = kVar.f66980g;
            g context = dVar2.getContext();
            Object c10 = K.c(context, obj);
            if (c10 != K.f66954a) {
                g1Var = F.g(dVar2, context, c10);
            } else {
                g1Var = null;
            }
            try {
                kVar.f66978e.resumeWith(b10);
                C6514M m10 = C6514M.f71813a;
            } finally {
                if (g1Var == null || g1Var.g1()) {
                    K.a(context, c10);
                }
            }
        } else {
            dVar.resumeWith(b10);
        }
    }

    private static final void e(X x10) {
        C5567f0 b10 = W0.f65337a.b();
        if (b10.K1()) {
            b10.G1(x10);
            return;
        }
        b10.I1(true);
        try {
            d(x10, x10.d(), true);
            do {
            } while (b10.N1());
        } catch (Throwable th2) {
            b10.D1(true);
            throw th2;
        }
        b10.D1(true);
    }
}
