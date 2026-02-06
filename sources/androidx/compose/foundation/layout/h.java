package androidx.compose.foundation.layout;

import C.I;
import H0.C1193n;
import H0.C1194o;
import H0.E;
import H0.H;
import c1.b;

final class h extends j {

    /* renamed from: n  reason: collision with root package name */
    private I f12853n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12854o;

    public h(I i10, boolean z10) {
        this.f12853n = i10;
        this.f12854o = z10;
    }

    public int B(C1194o oVar, C1193n nVar, int i10) {
        if (this.f12853n == I.Min) {
            return nVar.e0(i10);
        }
        return nVar.s(i10);
    }

    public int D(C1194o oVar, C1193n nVar, int i10) {
        if (this.f12853n == I.Min) {
            return nVar.e0(i10);
        }
        return nVar.s(i10);
    }

    public long l2(H h10, E e10, long j10) {
        int i10;
        if (this.f12853n == I.Min) {
            i10 = e10.e0(b.l(j10));
        } else {
            i10 = e10.s(b.l(j10));
        }
        if (i10 < 0) {
            i10 = 0;
        }
        return b.f19206b.d(i10);
    }

    public boolean m2() {
        return this.f12854o;
    }

    public void n2(boolean z10) {
        this.f12854o = z10;
    }

    public final void o2(I i10) {
        this.f12853n = i10;
    }
}
