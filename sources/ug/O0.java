package Ug;

import lf.v;
import lf.w;

final class O0 extends D0 {

    /* renamed from: e  reason: collision with root package name */
    private final C5584o f65328e;

    public O0(C5584o oVar) {
        this.f65328e = oVar;
    }

    public void b(Throwable th2) {
        Object l02 = v().l0();
        if (l02 instanceof B) {
            C5584o oVar = this.f65328e;
            v.a aVar = v.f71841b;
            oVar.resumeWith(v.b(w.a(((B) l02).f65278a)));
            return;
        }
        C5584o oVar2 = this.f65328e;
        v.a aVar2 = v.f71841b;
        oVar2.resumeWith(v.b(F0.h(l02)));
    }
}
