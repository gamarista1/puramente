package Xg;

import Ug.C5584o;
import Yg.c;
import Yg.d;
import Zg.C5717f;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.v;
import qf.C6658d;
import rf.C6680b;
import w.C2780Y;

final class O extends d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f66475a = new AtomicReference((Object) null);

    /* renamed from: d */
    public boolean a(M m10) {
        if (C5717f.a(this.f66475a) != null) {
            return false;
        }
        C5717f.b(this.f66475a, N.f66473a);
        return true;
    }

    public final Object e(C6658d dVar) {
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        if (!C2780Y.a(this.f66475a, N.f66473a, oVar)) {
            v.a aVar = v.f71841b;
            oVar.resumeWith(v.b(C6514M.f71813a));
        }
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        if (v10 == C6680b.f()) {
            return v10;
        }
        return C6514M.f71813a;
    }

    /* renamed from: f */
    public C6658d[] b(M m10) {
        C5717f.b(this.f66475a, (Object) null);
        return c.f66782a;
    }

    public final void g() {
        AtomicReference atomicReference = this.f66475a;
        while (true) {
            Object a10 = C5717f.a(atomicReference);
            if (a10 != null && a10 != N.f66474b) {
                if (a10 == N.f66473a) {
                    if (C2780Y.a(this.f66475a, a10, N.f66474b)) {
                        return;
                    }
                } else if (C2780Y.a(this.f66475a, a10, N.f66473a)) {
                    v.a aVar = v.f71841b;
                    ((C5584o) a10).resumeWith(v.b(C6514M.f71813a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f66475a.getAndSet(N.f66473a);
        C6496s.e(andSet);
        if (andSet == N.f66474b) {
            return true;
        }
        return false;
    }
}
