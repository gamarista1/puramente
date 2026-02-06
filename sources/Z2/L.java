package z2;

import f2.s;
import i2.C2073A;
import i2.C2076a;
import z2.O;

public final class L implements C2972p {

    /* renamed from: a  reason: collision with root package name */
    private final int f29114a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29115b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29116c;

    /* renamed from: d  reason: collision with root package name */
    private int f29117d;

    /* renamed from: e  reason: collision with root package name */
    private int f29118e;

    /* renamed from: f  reason: collision with root package name */
    private r f29119f;

    /* renamed from: g  reason: collision with root package name */
    private O f29120g;

    public L(int i10, int i11, String str) {
        this.f29114a = i10;
        this.f29115b = i11;
        this.f29116c = str;
    }

    private void b(String str) {
        O d10 = this.f29119f.d(1024, 4);
        this.f29120g = d10;
        d10.c(new s.b().o0(str).K());
        this.f29119f.k();
        this.f29119f.u(new M(-9223372036854775807L));
        this.f29118e = 1;
    }

    private void c(C2973q qVar) {
        int a10 = ((O) C2076a.e(this.f29120g)).a(qVar, 1024, true);
        if (a10 == -1) {
            this.f29118e = 2;
            this.f29120g.d(0, 1, this.f29117d, 0, (O.a) null);
            this.f29117d = 0;
            return;
        }
        this.f29117d += a10;
    }

    public void a(long j10, long j11) {
        if (j10 == 0 || this.f29118e == 1) {
            this.f29118e = 1;
            this.f29117d = 0;
        }
    }

    public void f(r rVar) {
        this.f29119f = rVar;
        b(this.f29116c);
    }

    public int i(C2973q qVar, I i10) {
        int i11 = this.f29118e;
        if (i11 == 1) {
            c(qVar);
            return 0;
        } else if (i11 == 2) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean j(C2973q qVar) {
        boolean z10;
        if (this.f29114a == -1 || this.f29115b == -1) {
            z10 = false;
        } else {
            z10 = true;
        }
        C2076a.g(z10);
        C2073A a10 = new C2073A(this.f29115b);
        qVar.l(a10.e(), 0, this.f29115b);
        if (a10.N() == this.f29114a) {
            return true;
        }
        return false;
    }

    public void release() {
    }
}
