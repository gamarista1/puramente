package z;

import D0.A;
import q0.C2421g;
import q0.C2422h;

/* renamed from: z.E  reason: case insensitive filesystem */
final class C2941E {

    /* renamed from: a  reason: collision with root package name */
    private final q f28870a;

    /* renamed from: b  reason: collision with root package name */
    private long f28871b = C2421g.f25320b.c();

    public C2941E(q qVar) {
        this.f28870a = qVar;
    }

    private final long b(float f10) {
        if (this.f28870a == null) {
            long j10 = this.f28871b;
            return C2421g.q(this.f28871b, C2421g.s(C2421g.h(j10, C2421g.k(j10)), f10));
        }
        float d10 = d(this.f28871b) - (Math.signum(d(this.f28871b)) * f10);
        float c10 = c(this.f28871b);
        if (this.f28870a == q.Horizontal) {
            return C2422h.a(d10, c10);
        }
        return C2422h.a(c10, d10);
    }

    public final C2421g a(A a10, float f10) {
        float f11;
        long r10 = C2421g.r(this.f28871b, C2421g.q(a10.h(), a10.k()));
        this.f28871b = r10;
        if (this.f28870a == null) {
            f11 = C2421g.k(r10);
        } else {
            f11 = Math.abs(d(r10));
        }
        if (f11 >= f10) {
            return C2421g.d(b(f10));
        }
        return null;
    }

    public final float c(long j10) {
        if (this.f28870a == q.Horizontal) {
            return C2421g.n(j10);
        }
        return C2421g.m(j10);
    }

    public final float d(long j10) {
        if (this.f28870a == q.Horizontal) {
            return C2421g.m(j10);
        }
        return C2421g.n(j10);
    }

    public final void e() {
        this.f28871b = C2421g.f25320b.c();
    }
}
