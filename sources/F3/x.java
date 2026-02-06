package f3;

import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.G;
import i2.L;
import z2.O;
import z2.r;

public final class x implements D {

    /* renamed from: a  reason: collision with root package name */
    private s f20780a;

    /* renamed from: b  reason: collision with root package name */
    private G f20781b;

    /* renamed from: c  reason: collision with root package name */
    private O f20782c;

    public x(String str) {
        this.f20780a = new s.b().o0(str).K();
    }

    private void a() {
        C2076a.i(this.f20781b);
        L.h(this.f20782c);
    }

    public void b(C2073A a10) {
        a();
        long e10 = this.f20781b.e();
        long f10 = this.f20781b.f();
        if (e10 != -9223372036854775807L && f10 != -9223372036854775807L) {
            s sVar = this.f20780a;
            if (f10 != sVar.f20088s) {
                s K10 = sVar.a().s0(f10).K();
                this.f20780a = K10;
                this.f20782c.c(K10);
            }
            int a11 = a10.a();
            this.f20782c.f(a10, a11);
            this.f20782c.d(e10, 1, a11, 0, (O.a) null);
        }
    }

    public void c(G g10, r rVar, K.d dVar) {
        this.f20781b = g10;
        dVar.a();
        O d10 = rVar.d(dVar.c(), 5);
        this.f20782c = d10;
        d10.c(this.f20780a);
    }
}
