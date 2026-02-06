package Fg;

import Fg.C5397y;
import Gg.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

/* renamed from: Fg.h0  reason: case insensitive filesystem */
public abstract class C5374h0 {
    public static final C5359a a(S s10) {
        C6496s.h(s10, "<this>");
        M0 Q02 = s10.Q0();
        if (Q02 instanceof C5359a) {
            return (C5359a) Q02;
        }
        return null;
    }

    public static final C5366d0 b(S s10) {
        C6496s.h(s10, "<this>");
        C5359a a10 = a(s10);
        if (a10 != null) {
            return a10.Z0();
        }
        return null;
    }

    public static final boolean c(S s10) {
        C6496s.h(s10, "<this>");
        return s10.Q0() instanceof C5397y;
    }

    private static final Q d(Q q10) {
        S s10;
        Iterable l10 = q10.l();
        ArrayList arrayList = new ArrayList(C6565s.y(l10, 10));
        Iterator it = l10.iterator();
        boolean z10 = false;
        while (true) {
            s10 = null;
            if (!it.hasNext()) {
                break;
            }
            S s11 = (S) it.next();
            if (J0.l(s11)) {
                s11 = f(s11.Q0(), false, 1, (Object) null);
                z10 = true;
            }
            arrayList.add(s11);
        }
        if (!z10) {
            return null;
        }
        S h10 = q10.h();
        if (h10 != null) {
            if (J0.l(h10)) {
                h10 = f(h10.Q0(), false, 1, (Object) null);
            }
            s10 = h10;
        }
        return new Q(arrayList).s(s10);
    }

    public static final M0 e(M0 m02, boolean z10) {
        C6496s.h(m02, "<this>");
        C5397y c10 = C5397y.a.c(C5397y.f63080d, m02, z10, false, 4, (Object) null);
        if (c10 != null) {
            return c10;
        }
        C5366d0 g10 = g(m02);
        if (g10 != null) {
            return g10;
        }
        return m02.R0(false);
    }

    public static /* synthetic */ M0 f(M0 m02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(m02, z10);
    }

    private static final C5366d0 g(S s10) {
        Q q10;
        Q d10;
        v0 N02 = s10.N0();
        if (N02 instanceof Q) {
            q10 = (Q) N02;
        } else {
            q10 = null;
        }
        if (q10 == null || (d10 = d(q10)) == null) {
            return null;
        }
        return d10.f();
    }

    public static final C5366d0 h(C5366d0 d0Var, boolean z10) {
        C6496s.h(d0Var, "<this>");
        C5397y c10 = C5397y.a.c(C5397y.f63080d, d0Var, z10, false, 4, (Object) null);
        if (c10 != null) {
            return c10;
        }
        C5366d0 g10 = g(d0Var);
        if (g10 == null) {
            return d0Var.U0(false);
        }
        return g10;
    }

    public static /* synthetic */ C5366d0 i(C5366d0 d0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(d0Var, z10);
    }

    public static final C5366d0 j(C5366d0 d0Var, C5366d0 d0Var2) {
        C6496s.h(d0Var, "<this>");
        C6496s.h(d0Var2, "abbreviatedType");
        if (W.a(d0Var)) {
            return d0Var;
        }
        return new C5359a(d0Var, d0Var2);
    }

    public static final i k(i iVar) {
        C6496s.h(iVar, "<this>");
        return new i(iVar.W0(), iVar.N0(), iVar.Y0(), iVar.M0(), iVar.O0(), true);
    }
}
