package k9;

import N9.C3055d;
import N9.C3062k;
import N9.C3070t;
import N9.M;
import N9.V;
import N9.r;
import ga.A;
import ga.B;
import ia.C3604b;
import ja.C3645a;
import ja.s;

final class E0 {

    /* renamed from: a  reason: collision with root package name */
    public final r f45265a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f45266b;

    /* renamed from: c  reason: collision with root package name */
    public final M[] f45267c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f45268d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f45269e;

    /* renamed from: f  reason: collision with root package name */
    public F0 f45270f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f45271g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f45272h;

    /* renamed from: i  reason: collision with root package name */
    private final b1[] f45273i;

    /* renamed from: j  reason: collision with root package name */
    private final A f45274j;

    /* renamed from: k  reason: collision with root package name */
    private final K0 f45275k;

    /* renamed from: l  reason: collision with root package name */
    private E0 f45276l;

    /* renamed from: m  reason: collision with root package name */
    private V f45277m = V.f33194d;

    /* renamed from: n  reason: collision with root package name */
    private B f45278n;

    /* renamed from: o  reason: collision with root package name */
    private long f45279o;

    public E0(b1[] b1VarArr, long j10, A a10, C3604b bVar, K0 k02, F0 f02, B b10) {
        this.f45273i = b1VarArr;
        this.f45279o = j10;
        this.f45274j = a10;
        this.f45275k = k02;
        C3070t.b bVar2 = f02.f45281a;
        this.f45266b = bVar2.f33285a;
        this.f45270f = f02;
        this.f45278n = b10;
        this.f45267c = new M[b1VarArr.length];
        this.f45272h = new boolean[b1VarArr.length];
        this.f45265a = e(bVar2, k02, bVar, f02.f45282b, f02.f45284d);
    }

    private void c(M[] mArr) {
        int i10 = 0;
        while (true) {
            b1[] b1VarArr = this.f45273i;
            if (i10 < b1VarArr.length) {
                if (b1VarArr[i10].e() == -2 && this.f45278n.c(i10)) {
                    mArr[i10] = new C3062k();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private static r e(C3070t.b bVar, K0 k02, C3604b bVar2, long j10, long j11) {
        r h10 = k02.h(bVar, bVar2, j10);
        if (j11 != -9223372036854775807L) {
            return new C3055d(h10, true, 0, j11);
        }
        return h10;
    }

    private void f() {
        if (r()) {
            int i10 = 0;
            while (true) {
                B b10 = this.f45278n;
                if (i10 < b10.f43758a) {
                    boolean c10 = b10.c(i10);
                    ga.r rVar = this.f45278n.f43760c[i10];
                    if (c10 && rVar != null) {
                        rVar.disable();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private void g(M[] mArr) {
        int i10 = 0;
        while (true) {
            b1[] b1VarArr = this.f45273i;
            if (i10 < b1VarArr.length) {
                if (b1VarArr[i10].e() == -2) {
                    mArr[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void h() {
        if (r()) {
            int i10 = 0;
            while (true) {
                B b10 = this.f45278n;
                if (i10 < b10.f43758a) {
                    boolean c10 = b10.c(i10);
                    ga.r rVar = this.f45278n.f43760c[i10];
                    if (c10 && rVar != null) {
                        rVar.enable();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private boolean r() {
        if (this.f45276l == null) {
            return true;
        }
        return false;
    }

    private static void u(K0 k02, r rVar) {
        try {
            if (rVar instanceof C3055d) {
                k02.y(((C3055d) rVar).f33210a);
            } else {
                k02.y(rVar);
            }
        } catch (RuntimeException e10) {
            s.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A() {
        r rVar = this.f45265a;
        if (rVar instanceof C3055d) {
            long j10 = this.f45270f.f45284d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((C3055d) rVar).v(0, j10);
        }
    }

    public long a(B b10, long j10, boolean z10) {
        return b(b10, j10, z10, new boolean[this.f45273i.length]);
    }

    public long b(B b10, long j10, boolean z10, boolean[] zArr) {
        boolean z11;
        B b11 = b10;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= b11.f43758a) {
                break;
            }
            boolean[] zArr2 = this.f45272h;
            if (z10 || !b10.b(this.f45278n, i10)) {
                z12 = false;
            }
            zArr2[i10] = z12;
            i10++;
        }
        g(this.f45267c);
        f();
        this.f45278n = b11;
        h();
        long s10 = this.f45265a.s(b11.f43760c, this.f45272h, this.f45267c, zArr, j10);
        c(this.f45267c);
        this.f45269e = false;
        int i11 = 0;
        while (true) {
            M[] mArr = this.f45267c;
            if (i11 >= mArr.length) {
                return s10;
            }
            if (mArr[i11] != null) {
                C3645a.f(b10.c(i11));
                if (this.f45273i[i11].e() != -2) {
                    this.f45269e = true;
                }
            } else {
                if (b11.f43760c[i11] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C3645a.f(z11);
            }
            i11++;
        }
    }

    public void d(long j10) {
        C3645a.f(r());
        this.f45265a.m(y(j10));
    }

    public long i() {
        long j10;
        if (!this.f45268d) {
            return this.f45270f.f45282b;
        }
        if (this.f45269e) {
            j10 = this.f45265a.c();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f45270f.f45285e;
        }
        return j10;
    }

    public E0 j() {
        return this.f45276l;
    }

    public long k() {
        if (!this.f45268d) {
            return 0;
        }
        return this.f45265a.a();
    }

    public long l() {
        return this.f45279o;
    }

    public long m() {
        return this.f45270f.f45282b + this.f45279o;
    }

    public V n() {
        return this.f45277m;
    }

    public B o() {
        return this.f45278n;
    }

    public void p(float f10, n1 n1Var) {
        this.f45268d = true;
        this.f45277m = this.f45265a.n();
        B v10 = v(f10, n1Var);
        F0 f02 = this.f45270f;
        long j10 = f02.f45282b;
        long j11 = f02.f45285e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0, j11 - 1);
        }
        long a10 = a(v10, j10, false);
        long j12 = this.f45279o;
        F0 f03 = this.f45270f;
        this.f45279o = j12 + (f03.f45282b - a10);
        this.f45270f = f03.b(a10);
    }

    public boolean q() {
        if (!this.f45268d || (this.f45269e && this.f45265a.c() != Long.MIN_VALUE)) {
            return false;
        }
        return true;
    }

    public void s(long j10) {
        C3645a.f(r());
        if (this.f45268d) {
            this.f45265a.f(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f45275k, this.f45265a);
    }

    public B v(float f10, n1 n1Var) {
        B g10 = this.f45274j.g(this.f45273i, n(), this.f45270f.f45281a, n1Var);
        for (ga.r rVar : g10.f43760c) {
            if (rVar != null) {
                rVar.d(f10);
            }
        }
        return g10;
    }

    public void w(E0 e02) {
        if (e02 != this.f45276l) {
            f();
            this.f45276l = e02;
            h();
        }
    }

    public void x(long j10) {
        this.f45279o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
