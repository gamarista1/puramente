package Ug;

import Zg.C;
import Zg.C5718g;
import ah.b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.h;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

public abstract class L {
    public static final K a(g gVar) {
        if (gVar.b(C5600w0.f65416O) == null) {
            gVar = gVar.n1(C0.b((C5600w0) null, 1, (Object) null));
        }
        return new C5718g(gVar);
    }

    public static final K b() {
        return new C5718g(U0.b((C5600w0) null, 1, (Object) null).n1(Z.c()));
    }

    public static final void c(K k10, CancellationException cancellationException) {
        C5600w0 w0Var = (C5600w0) k10.getCoroutineContext().b(C5600w0.f65416O);
        if (w0Var != null) {
            w0Var.n(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + k10).toString());
    }

    public static /* synthetic */ void d(K k10, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        c(k10, cancellationException);
    }

    public static final Object e(p pVar, C6658d dVar) {
        C c10 = new C(dVar.getContext(), dVar);
        Object b10 = b.b(c10, c10, pVar);
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    public static final void f(K k10) {
        A0.m(k10.getCoroutineContext());
    }

    public static final boolean g(K k10) {
        C5600w0 w0Var = (C5600w0) k10.getCoroutineContext().b(C5600w0.f65416O);
        if (w0Var != null) {
            return w0Var.a();
        }
        return true;
    }

    public static final K h(K k10, g gVar) {
        return new C5718g(k10.getCoroutineContext().n1(gVar));
    }
}
