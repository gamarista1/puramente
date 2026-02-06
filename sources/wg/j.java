package Wg;

import Ug.i1;
import Zg.D;
import Zg.G;
import Zg.y;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.C6496s;
import qf.g;
import yf.C6798l;

public final class j extends D {

    /* renamed from: e  reason: collision with root package name */
    private final b f66036e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f66037f = new AtomicReferenceArray(c.f66009b * 2);

    public j(long j10, j jVar, b bVar, int i10) {
        super(j10, jVar, i10);
        this.f66036e = bVar;
    }

    private final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f66037f;
    }

    public final Object A(int i10) {
        return z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().h1((this.f66948c * ((long) c.f66009b)) + ((long) i10));
        }
        t();
    }

    public final Object D(int i10) {
        Object A10 = A(i10);
        w(i10);
        return A10;
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, Object obj) {
        E(i10, obj);
    }

    public int r() {
        return c.f66009b;
    }

    public void s(int i10, Throwable th2, g gVar) {
        boolean z10;
        G g10;
        C6798l lVar;
        C6798l lVar2;
        int i11 = c.f66009b;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 -= i11;
        }
        Object A10 = A(i10);
        while (true) {
            Object B10 = B(i10);
            if ((B10 instanceof i1) || (B10 instanceof v)) {
                if (z10) {
                    g10 = c.f66017j;
                } else {
                    g10 = c.f66018k;
                }
                if (v(i10, B10, g10)) {
                    w(i10);
                    C(i10, !z10);
                    if (z10 && (lVar = y().f65985b) != null) {
                        y.b(lVar, A10, gVar);
                        return;
                    }
                    return;
                }
            } else if (B10 == c.f66017j || B10 == c.f66018k) {
                w(i10);
            } else if (!(B10 == c.f66014g || B10 == c.f66013f)) {
                if (B10 != c.f66016i && B10 != c.f66011d && B10 != c.z()) {
                    throw new IllegalStateException(("unexpected state: " + B10).toString());
                }
                return;
            }
        }
        w(i10);
        if (z10 && (lVar2 = y().f65985b) != null) {
            y.b(lVar2, A10, gVar);
        }
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return i.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, (Object) null);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    public final b y() {
        b bVar = this.f66036e;
        C6496s.e(bVar);
        return bVar;
    }
}
