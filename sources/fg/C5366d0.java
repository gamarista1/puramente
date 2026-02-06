package Fg;

import Jg.j;
import Jg.k;
import Pf.c;
import Pf.e;
import Sg.p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import qg.n;
import yf.C6798l;

/* renamed from: Fg.d0  reason: case insensitive filesystem */
public abstract class C5366d0 extends M0 implements j, k {
    public C5366d0() {
        super((DefaultConstructorMarker) null);
    }

    public abstract C5366d0 U0(boolean z10);

    public abstract C5366d0 V0(r0 r0Var);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (c Q10 : getAnnotations()) {
            p.i(sb2, "[", n.Q(n.f72702k, Q10, (e) null, 2, (Object) null), "] ");
        }
        sb2.append(N0());
        if (!L0().isEmpty()) {
            C6565s.v0(L0(), sb2, ", ", "<", ">", 0, (CharSequence) null, (C6798l) null, 112, (Object) null);
        }
        if (O0()) {
            sb2.append("?");
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }
}
