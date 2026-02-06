package U2;

import f2.C1961B;
import i2.C2073A;
import i2.C2076a;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.O;
import z2.r;
import z2.u;

public class d implements C2972p {

    /* renamed from: d  reason: collision with root package name */
    public static final u f6355d = new c();

    /* renamed from: a  reason: collision with root package name */
    private r f6356a;

    /* renamed from: b  reason: collision with root package name */
    private i f6357b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6358c;

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] c() {
        return new C2972p[]{new d()};
    }

    private static C2073A d(C2073A a10) {
        a10.U(0);
        return a10;
    }

    private boolean e(C2973q qVar) {
        f fVar = new f();
        if (fVar.a(qVar, true) && (fVar.f6365b & 2) == 2) {
            int min = Math.min(fVar.f6372i, 8);
            C2073A a10 = new C2073A(min);
            qVar.l(a10.e(), 0, min);
            if (b.p(d(a10))) {
                this.f6357b = new b();
            } else if (j.r(d(a10))) {
                this.f6357b = new j();
            } else if (h.o(d(a10))) {
                this.f6357b = new h();
            }
            return true;
        }
        return false;
    }

    public void a(long j10, long j11) {
        i iVar = this.f6357b;
        if (iVar != null) {
            iVar.m(j10, j11);
        }
    }

    public void f(r rVar) {
        this.f6356a = rVar;
    }

    public int i(C2973q qVar, I i10) {
        C2076a.i(this.f6356a);
        if (this.f6357b == null) {
            if (e(qVar)) {
                qVar.e();
            } else {
                throw C1961B.a("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.f6358c) {
            O d10 = this.f6356a.d(0, 1);
            this.f6356a.k();
            this.f6357b.d(this.f6356a, d10);
            this.f6358c = true;
        }
        return this.f6357b.g(qVar, i10);
    }

    public boolean j(C2973q qVar) {
        try {
            return e(qVar);
        } catch (C1961B unused) {
            return false;
        }
    }

    public void release() {
    }
}
