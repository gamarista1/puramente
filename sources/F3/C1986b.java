package f3;

import f3.K;
import i2.C2073A;
import z2.C2958b;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.r;
import z2.u;

/* renamed from: f3.b  reason: case insensitive filesystem */
public final class C1986b implements C2972p {

    /* renamed from: d  reason: collision with root package name */
    public static final u f20486d = new C1985a();

    /* renamed from: a  reason: collision with root package name */
    private final C1987c f20487a = new C1987c();

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f20488b = new C2073A(2786);

    /* renamed from: c  reason: collision with root package name */
    private boolean f20489c;

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] c() {
        return new C2972p[]{new C1986b()};
    }

    public void a(long j10, long j11) {
        this.f20489c = false;
        this.f20487a.a();
    }

    public void f(r rVar) {
        this.f20487a.e(rVar, new K.d(0, 1));
        rVar.k();
        rVar.u(new J.b(-9223372036854775807L));
    }

    public int i(C2973q qVar, I i10) {
        int read = qVar.read(this.f20488b.e(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f20488b.U(0);
        this.f20488b.T(read);
        if (!this.f20489c) {
            this.f20487a.d(0, 4);
            this.f20489c = true;
        }
        this.f20487a.b(this.f20488b);
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
            qVar.l(a10.e(), 0, 6);
            a10.U(0);
            if (a10.N() != 2935) {
                qVar.e();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                qVar.h(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int g10 = C2958b.g(a10.e());
                if (g10 == -1) {
                    return false;
                }
                qVar.h(g10 - 6);
            }
        }
    }

    public void release() {
    }
}
