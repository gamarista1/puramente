package Wg;

import Wg.h;
import Zg.P;
import Zg.y;
import kotlin.jvm.internal.O;
import lf.C6514M;
import lf.C6523g;
import qf.C6658d;
import yf.C6798l;

public class o extends b {

    /* renamed from: m  reason: collision with root package name */
    private final int f66038m;

    /* renamed from: n  reason: collision with root package name */
    private final a f66039n;

    public o(int i10, a aVar, C6798l lVar) {
        super(i10, lVar);
        this.f66038m = i10;
        this.f66039n = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + O.b(b.class).w() + " instead").toString());
        } else if (i10 < 1) {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
        }
    }

    static /* synthetic */ Object i1(o oVar, Object obj, C6658d dVar) {
        P d10;
        Object k12 = oVar.k1(obj, true);
        if (!(k12 instanceof h.a)) {
            return C6514M.f71813a;
        }
        h.e(k12);
        C6798l lVar = oVar.f65985b;
        if (lVar == null || (d10 = y.d(lVar, obj, (P) null, 2, (Object) null)) == null) {
            throw oVar.c0();
        }
        C6523g.a(d10, oVar.c0());
        throw d10;
    }

    private final Object j1(Object obj, boolean z10) {
        C6798l lVar;
        P d10;
        Object c10 = super.c(obj);
        if (h.i(c10) || h.h(c10)) {
            return c10;
        }
        if (!z10 || (lVar = this.f65985b) == null || (d10 = y.d(lVar, obj, (P) null, 2, (Object) null)) == null) {
            return h.f66032b.c(C6514M.f71813a);
        }
        throw d10;
    }

    private final Object k1(Object obj, boolean z10) {
        if (this.f66039n == a.DROP_LATEST) {
            return j1(obj, z10);
        }
        return Y0(obj);
    }

    public Object c(Object obj) {
        return k1(obj, false);
    }

    public Object k(Object obj, C6658d dVar) {
        return i1(this, obj, dVar);
    }

    /* access modifiers changed from: protected */
    public boolean r0() {
        if (this.f66039n == a.DROP_OLDEST) {
            return true;
        }
        return false;
    }
}
