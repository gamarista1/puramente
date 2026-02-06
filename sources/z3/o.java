package Z3;

import Ef.m;
import H0.C1187h;
import H0.c0;
import Y.C1488g1;
import Y.C1503n0;
import Y.C1505o0;
import Y.C1510r0;
import Y.D0;
import Y.o1;
import android.os.SystemClock;
import q0.C2427m;
import q0.C2428n;
import r0.C2547y0;
import t0.C2605f;
import w0.C2817c;

public final class o extends C2817c {

    /* renamed from: g  reason: collision with root package name */
    private C2817c f10486g;

    /* renamed from: h  reason: collision with root package name */
    private final C2817c f10487h;

    /* renamed from: i  reason: collision with root package name */
    private final C1187h f10488i;

    /* renamed from: j  reason: collision with root package name */
    private final int f10489j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f10490k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f10491l;

    /* renamed from: m  reason: collision with root package name */
    private final C1505o0 f10492m = C1488g1.a(0);

    /* renamed from: n  reason: collision with root package name */
    private long f10493n = -1;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10494o;

    /* renamed from: p  reason: collision with root package name */
    private final C1503n0 f10495p = D0.a(1.0f);

    /* renamed from: q  reason: collision with root package name */
    private final C1510r0 f10496q = u1.d((Object) null, (o1) null, 2, (Object) null);

    public o(C2817c cVar, C2817c cVar2, C1187h hVar, int i10, boolean z10, boolean z11) {
        this.f10486g = cVar;
        this.f10487h = cVar2;
        this.f10488i = hVar;
        this.f10489j = i10;
        this.f10490k = z10;
        this.f10491l = z11;
    }

    private final long n(long j10, long j11) {
        C2427m.a aVar = C2427m.f25341b;
        if (j10 != aVar.a() && !C2427m.m(j10) && j11 != aVar.a() && !C2427m.m(j11)) {
            return c0.b(j10, this.f10488i.a(j10, j11));
        }
        return j11;
    }

    private final long o() {
        long j10;
        long j11;
        boolean z10;
        C2817c cVar = this.f10486g;
        if (cVar != null) {
            j10 = cVar.k();
        } else {
            j10 = C2427m.f25341b.b();
        }
        C2817c cVar2 = this.f10487h;
        if (cVar2 != null) {
            j11 = cVar2.k();
        } else {
            j11 = C2427m.f25341b.b();
        }
        C2427m.a aVar = C2427m.f25341b;
        boolean z11 = false;
        if (j10 != aVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j11 != aVar.a()) {
            z11 = true;
        }
        if (z10 && z11) {
            return C2428n.a(Math.max(C2427m.k(j10), C2427m.k(j11)), Math.max(C2427m.i(j10), C2427m.i(j11)));
        }
        if (this.f10491l) {
            if (z10) {
                return j10;
            }
            if (z11) {
                return j11;
            }
        }
        return aVar.a();
    }

    private final void p(C2605f fVar, C2817c cVar, float f10) {
        if (cVar != null && f10 > 0.0f) {
            long d10 = fVar.d();
            long n10 = n(cVar.k(), d10);
            if (d10 != C2427m.f25341b.a() && !C2427m.m(d10)) {
                float f11 = (float) 2;
                float k10 = (C2427m.k(d10) - C2427m.k(n10)) / f11;
                float i10 = (C2427m.i(d10) - C2427m.i(n10)) / f11;
                fVar.w1().e().i(k10, i10, k10, i10);
                cVar.j(fVar, n10, f10, q());
                float f12 = -k10;
                float f13 = -i10;
                fVar.w1().e().i(f12, f13, f12, f13);
                return;
            }
            cVar.j(fVar, n10, f10, q());
        }
    }

    private final C2547y0 q() {
        return (C2547y0) this.f10496q.getValue();
    }

    private final int r() {
        return this.f10492m.b();
    }

    private final float s() {
        return this.f10495p.c();
    }

    private final void t(C2547y0 y0Var) {
        this.f10496q.setValue(y0Var);
    }

    private final void u(int i10) {
        this.f10492m.f(i10);
    }

    private final void v(float f10) {
        this.f10495p.l(f10);
    }

    /* access modifiers changed from: protected */
    public boolean a(float f10) {
        v(f10);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean e(C2547y0 y0Var) {
        t(y0Var);
        return true;
    }

    public long k() {
        return o();
    }

    /* access modifiers changed from: protected */
    public void m(C2605f fVar) {
        float f10;
        boolean z10;
        if (this.f10494o) {
            p(fVar, this.f10487h, s());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f10493n == -1) {
            this.f10493n = uptimeMillis;
        }
        float f11 = ((float) (uptimeMillis - this.f10493n)) / ((float) this.f10489j);
        float k10 = m.k(f11, 0.0f, 1.0f) * s();
        if (this.f10490k) {
            f10 = s() - k10;
        } else {
            f10 = s();
        }
        if (f11 >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10494o = z10;
        p(fVar, this.f10486g, f10);
        p(fVar, this.f10487h, k10);
        if (this.f10494o) {
            this.f10486g = null;
        } else {
            u(r() + 1);
        }
    }
}
