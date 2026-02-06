package G;

import C0.a;
import C0.e;
import Ef.m;
import c1.y;
import java.util.concurrent.CancellationException;
import q0.C2421g;
import qf.C6658d;
import z.q;

/* renamed from: G.a  reason: case insensitive filesystem */
final class C1175a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C f2248a;

    /* renamed from: b  reason: collision with root package name */
    private final q f2249b;

    public C1175a(C c10, q qVar) {
        this.f2248a = c10;
        this.f2249b = qVar;
    }

    private final float b(long j10) {
        if (this.f2249b == q.Horizontal) {
            return C2421g.m(j10);
        }
        return C2421g.n(j10);
    }

    public long M0(long j10, long j11, int i10) {
        if (!e.d(i10, e.f1131a.a()) || b(j11) == 0.0f) {
            return C2421g.f25320b.c();
        }
        throw new CancellationException("Scroll cancelled");
    }

    public final long a(long j10, q qVar) {
        if (qVar == q.Vertical) {
            return y.e(j10, 0.0f, 0.0f, 2, (Object) null);
        }
        return y.e(j10, 0.0f, 0.0f, 1, (Object) null);
    }

    public Object b0(long j10, long j11, C6658d dVar) {
        return y.b(a(j11, this.f2249b));
    }

    public long q1(long j10, int i10) {
        float f10;
        float f11;
        if (!e.d(i10, e.f1131a.b()) || ((double) Math.abs(this.f2248a.w())) <= 1.0E-6d) {
            return C2421g.f25320b.c();
        }
        float w10 = this.f2248a.w() * ((float) this.f2248a.G());
        float i11 = (((float) (this.f2248a.C().i() + this.f2248a.C().l())) * (-Math.signum(this.f2248a.w()))) + w10;
        if (this.f2248a.w() > 0.0f) {
            float f12 = i11;
            i11 = w10;
            w10 = f12;
        }
        q qVar = this.f2249b;
        q qVar2 = q.Horizontal;
        if (qVar == qVar2) {
            f10 = C2421g.m(j10);
        } else {
            f10 = C2421g.n(j10);
        }
        float f13 = -this.f2248a.f(-m.k(f10, w10, i11));
        if (this.f2249b == qVar2) {
            f11 = f13;
        } else {
            f11 = C2421g.m(j10);
        }
        if (this.f2249b != q.Vertical) {
            f13 = C2421g.n(j10);
        }
        return C2421g.f(j10, f11, f13);
    }
}
