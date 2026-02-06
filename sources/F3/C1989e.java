package f3;

import f3.K;
import i2.C2073A;
import z2.C2959c;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.r;
import z2.u;

/* renamed from: f3.e  reason: case insensitive filesystem */
public final class C1989e implements C2972p {

    /* renamed from: d  reason: collision with root package name */
    public static final u f20503d = new C1988d();

    /* renamed from: a  reason: collision with root package name */
    private final C1990f f20504a = new C1990f();

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f20505b = new C2073A(16384);

    /* renamed from: c  reason: collision with root package name */
    private boolean f20506c;

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] c() {
        return new C2972p[]{new C1989e()};
    }

    public void a(long j10, long j11) {
        this.f20506c = false;
        this.f20504a.a();
    }

    public void f(r rVar) {
        this.f20504a.e(rVar, new K.d(0, 1));
        rVar.k();
        rVar.u(new J.b(-9223372036854775807L));
    }

    public int i(C2973q qVar, I i10) {
        int read = qVar.read(this.f20505b.e(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f20505b.U(0);
        this.f20505b.T(read);
        if (!this.f20506c) {
            this.f20504a.d(0, 4);
            this.f20506c = true;
        }
        this.f20504a.b(this.f20505b);
        return 0;
    }

    public boolean j(C2973q qVar) {
        C2073A a10 = new C2073A(10);
        int i10 = 0;
        while (true) {
            qVar.l(a10.e(), 0, 10);
            a10.U(0);
            if (a10.K() != 4801587) {
                break;
            }
            a10.V(3);
            int G10 = a10.G();
            i10 += G10 + 10;
            qVar.h(G10);
        }
        qVar.e();
        qVar.h(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            qVar.l(a10.e(), 0, 7);
            a10.U(0);
            int N10 = a10.N();
            if (N10 == 44096 || N10 == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int e10 = C2959c.e(a10.e(), N10);
                if (e10 == -1) {
                    return false;
                }
                qVar.h(e10 - 7);
            } else {
                qVar.e();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                qVar.h(i12);
                i11 = 0;
            }
        }
    }

    public void release() {
    }
}
