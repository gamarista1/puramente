package A;

import qf.C6658d;
import rf.C6680b;
import w.C2800l;
import w.C2814z;
import yf.C6798l;
import z.v;

final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final C2814z f366a;

    public c(C2814z zVar) {
        this.f366a = zVar;
    }

    public /* bridge */ /* synthetic */ Object a(v vVar, Object obj, Object obj2, C6798l lVar, C6658d dVar) {
        return b(vVar, ((Number) obj).floatValue(), ((Number) obj2).floatValue(), lVar, dVar);
    }

    public Object b(v vVar, float f10, float f11, C6798l lVar, C6658d dVar) {
        Object a10 = h.f(vVar, f10, C2800l.c(0.0f, f11, 0, 0, false, 28, (Object) null), this.f366a, lVar, dVar);
        if (a10 == C6680b.f()) {
            return a10;
        }
        return (a) a10;
    }
}
