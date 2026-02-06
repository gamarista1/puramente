package H2;

import O2.a;
import T2.m;
import W2.s;
import com.reactnativecommunity.clipboard.ClipboardModule;
import f2.s;
import f2.z;
import i2.C2073A;
import i2.C2076a;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.r;

final class b implements C2972p {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f2639a = new C2073A(6);

    /* renamed from: b  reason: collision with root package name */
    private r f2640b;

    /* renamed from: c  reason: collision with root package name */
    private int f2641c;

    /* renamed from: d  reason: collision with root package name */
    private int f2642d;

    /* renamed from: e  reason: collision with root package name */
    private int f2643e;

    /* renamed from: f  reason: collision with root package name */
    private long f2644f = -1;

    /* renamed from: g  reason: collision with root package name */
    private a f2645g;

    /* renamed from: h  reason: collision with root package name */
    private C2973q f2646h;

    /* renamed from: i  reason: collision with root package name */
    private d f2647i;

    /* renamed from: j  reason: collision with root package name */
    private m f2648j;

    private void b(C2973q qVar) {
        this.f2639a.Q(2);
        qVar.l(this.f2639a.e(), 0, 2);
        qVar.h(this.f2639a.N() - 2);
    }

    private void c() {
        ((r) C2076a.e(this.f2640b)).k();
        this.f2640b.u(new J.b(-9223372036854775807L));
        this.f2641c = 6;
    }

    private static a d(String str, long j10) {
        c a10;
        if (j10 == -1 || (a10 = f.a(str)) == null) {
            return null;
        }
        return a10.a(j10);
    }

    private void e(a aVar) {
        ((r) C2076a.e(this.f2640b)).d(1024, 4).c(new s.b().Q(ClipboardModule.MIMETYPE_JPEG).h0(new z(aVar)).K());
    }

    private int g(C2973q qVar) {
        this.f2639a.Q(2);
        qVar.l(this.f2639a.e(), 0, 2);
        return this.f2639a.N();
    }

    private void l(C2973q qVar) {
        this.f2639a.Q(2);
        qVar.readFully(this.f2639a.e(), 0, 2);
        int N10 = this.f2639a.N();
        this.f2642d = N10;
        if (N10 == 65498) {
            if (this.f2644f != -1) {
                this.f2641c = 4;
            } else {
                c();
            }
        } else if ((N10 < 65488 || N10 > 65497) && N10 != 65281) {
            this.f2641c = 1;
        }
    }

    private void m(C2973q qVar) {
        String B10;
        if (this.f2642d == 65505) {
            C2073A a10 = new C2073A(this.f2643e);
            qVar.readFully(a10.e(), 0, this.f2643e);
            if (this.f2645g == null && "http://ns.adobe.com/xap/1.0/".equals(a10.B()) && (B10 = a10.B()) != null) {
                a d10 = d(B10, qVar.a());
                this.f2645g = d10;
                if (d10 != null) {
                    this.f2644f = d10.f4724d;
                }
            }
        } else {
            qVar.j(this.f2643e);
        }
        this.f2641c = 0;
    }

    private void n(C2973q qVar) {
        this.f2639a.Q(2);
        qVar.readFully(this.f2639a.e(), 0, 2);
        this.f2643e = this.f2639a.N() - 2;
        this.f2641c = 2;
    }

    private void o(C2973q qVar) {
        if (!qVar.c(this.f2639a.e(), 0, 1, true)) {
            c();
            return;
        }
        qVar.e();
        if (this.f2648j == null) {
            this.f2648j = new m(s.a.f8664a, 8);
        }
        d dVar = new d(qVar, this.f2644f);
        this.f2647i = dVar;
        if (this.f2648j.j(dVar)) {
            this.f2648j.f(new e(this.f2644f, (r) C2076a.e(this.f2640b)));
            p();
            return;
        }
        c();
    }

    private void p() {
        e((a) C2076a.e(this.f2645g));
        this.f2641c = 5;
    }

    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f2641c = 0;
            this.f2648j = null;
        } else if (this.f2641c == 5) {
            ((m) C2076a.e(this.f2648j)).a(j10, j11);
        }
    }

    public void f(r rVar) {
        this.f2640b = rVar;
    }

    public int i(C2973q qVar, I i10) {
        int i11 = this.f2641c;
        if (i11 == 0) {
            l(qVar);
            return 0;
        } else if (i11 == 1) {
            n(qVar);
            return 0;
        } else if (i11 == 2) {
            m(qVar);
            return 0;
        } else if (i11 == 4) {
            long position = qVar.getPosition();
            long j10 = this.f2644f;
            if (position != j10) {
                i10.f29106a = j10;
                return 1;
            }
            o(qVar);
            return 0;
        } else if (i11 == 5) {
            if (this.f2647i == null || qVar != this.f2646h) {
                this.f2646h = qVar;
                this.f2647i = new d(qVar, this.f2644f);
            }
            int i12 = ((m) C2076a.e(this.f2648j)).i(this.f2647i, i10);
            if (i12 == 1) {
                i10.f29106a += this.f2644f;
            }
            return i12;
        } else if (i11 == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean j(C2973q qVar) {
        if (g(qVar) != 65496) {
            return false;
        }
        int g10 = g(qVar);
        this.f2642d = g10;
        if (g10 == 65504) {
            b(qVar);
            this.f2642d = g(qVar);
        }
        if (this.f2642d != 65505) {
            return false;
        }
        qVar.h(2);
        this.f2639a.Q(6);
        qVar.l(this.f2639a.e(), 0, 6);
        if (this.f2639a.J() == 1165519206 && this.f2639a.N() == 0) {
            return true;
        }
        return false;
    }

    public void release() {
        m mVar = this.f2648j;
        if (mVar != null) {
            mVar.release();
        }
    }
}
