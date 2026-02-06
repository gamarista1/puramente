package A;

import qf.C6658d;
import rf.C6680b;
import w.C2797i;
import w.C2800l;
import yf.C6798l;
import z.v;

final class l implements b {

    /* renamed from: a  reason: collision with root package name */
    private final C2797i f419a;

    public l(C2797i iVar) {
        this.f419a = iVar;
    }

    public /* bridge */ /* synthetic */ Object a(v vVar, Object obj, Object obj2, C6798l lVar, C6658d dVar) {
        return b(vVar, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), lVar, dVar);
    }

    public Object b(v vVar, float f10, float f11, C6798l lVar, C6658d dVar) {
        v vVar2 = vVar;
        float f12 = f10;
        Object c10 = h.h(vVar2, Math.abs(f10) * Math.signum(f11), f12, C2800l.c(0.0f, f11, 0, 0, false, 28, (Object) null), this.f419a, lVar, dVar);
        if (c10 == C6680b.f()) {
            return c10;
        }
        return (a) c10;
    }
}
