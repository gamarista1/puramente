package androidx.compose.foundation.layout;

import C.I;
import H0.C1193n;
import H0.C1194o;
import H0.E;
import H0.H;
import c1.b;

final class k extends j {

    /* renamed from: n  reason: collision with root package name */
    private I f12858n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12859o;

    public k(I i10, boolean z10) {
        this.f12858n = i10;
        this.f12859o = z10;
    }

    public int G(C1194o oVar, C1193n nVar, int i10) {
        if (this.f12858n == I.Min) {
            return nVar.s0(i10);
        }
        return nVar.t0(i10);
    }

    public long l2(H h10, E e10, long j10) {
        int i10;
        if (this.f12858n == I.Min) {
            i10 = e10.s0(b.k(j10));
        } else {
            i10 = e10.t0(b.k(j10));
        }
        if (i10 < 0) {
            i10 = 0;
        }
        return b.f19206b.e(i10);
    }

    public boolean m2() {
        return this.f12859o;
    }

    public void n2(boolean z10) {
        this.f12859o = z10;
    }

    public final void o2(I i10) {
        this.f12858n = i10;
    }

    public int x(C1194o oVar, C1193n nVar, int i10) {
        if (this.f12858n == I.Min) {
            return nVar.s0(i10);
        }
        return nVar.t0(i10);
    }
}
