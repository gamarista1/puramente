package androidx.compose.animation;

import c1.r;
import c1.s;
import k0.c;
import k0.i;
import o0.C2342e;
import w.C2763G;
import w.C2798j;
import w.G0;
import yf.p;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static final long f12307a = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    public static final i a(i iVar, C2763G g10, p pVar) {
        return C2342e.b(iVar).h(new SizeAnimationModifierElement(g10, c.f23044a.o(), pVar));
    }

    public static /* synthetic */ i b(i iVar, C2763G g10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            g10 = C2798j.h(0.0f, 400.0f, r.b(G0.d(r.f19235b)), 1, (Object) null);
        }
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        return a(iVar, g10, pVar);
    }

    public static final long c() {
        return f12307a;
    }

    public static final boolean d(long j10) {
        return !r.e(j10, f12307a);
    }
}
