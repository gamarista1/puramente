package J;

import Q0.C1321d;
import Q0.K;
import Q0.L;
import Q0.T;
import V0.h;
import c1.b;
import c1.d;
import c1.t;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public abstract class Z {
    public static final boolean a(L l10, C1321d dVar, T t10, List list, int i10, boolean z10, int i11, d dVar2, t tVar, h.b bVar, long j10) {
        K l11 = l10.l();
        if (l10.w().j().c() || !C6496s.c(l11.j(), dVar) || !l11.i().G(t10) || !C6496s.c(l11.g(), list) || l11.e() != i10 || l11.h() != z10 || !b1.t.e(l11.f(), i11) || !C6496s.c(l11.b(), dVar2) || l11.d() != tVar || !C6496s.c(l11.c(), bVar) || b.n(j10) != b.n(l11.a())) {
            return false;
        }
        if (!z10 && !b1.t.e(i11, b1.t.f19154a.b())) {
            return true;
        }
        if (b.l(j10) == b.l(l11.a()) && b.k(j10) == b.k(l11.a())) {
            return true;
        }
        return false;
    }
}
