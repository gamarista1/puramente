package Y;

import qf.C6658d;
import qf.g;
import yf.C6798l;

/* renamed from: Y.j0  reason: case insensitive filesystem */
public abstract class C1495j0 {
    public static final C1490h0 a(g gVar) {
        C1490h0 h0Var = (C1490h0) gVar.b(C1490h0.f10013R);
        if (h0Var != null) {
            return h0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(C6798l lVar, C6658d dVar) {
        return a(dVar.getContext()).L0(new C1493i0(lVar), dVar);
    }

    public static final Object c(C6798l lVar, C6658d dVar) {
        return a(dVar.getContext()).L0(lVar, dVar);
    }
}
