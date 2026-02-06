package androidx.media3.exoplayer;

import androidx.media3.exoplayer.U;
import f2.H;
import i2.C2076a;
import i2.p;
import java.io.IOException;
import t2.C2614B;
import t2.C2615C;
import t2.C2638d;
import t2.C2652r;
import t2.Z;
import t2.j0;
import v2.C;
import v2.D;
import v2.x;
import w2.C2820b;

final class V {

    /* renamed from: a  reason: collision with root package name */
    public final C2614B f17549a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f17550b;

    /* renamed from: c  reason: collision with root package name */
    public final Z[] f17551c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17552d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17553e;

    /* renamed from: f  reason: collision with root package name */
    public W f17554f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17555g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f17556h;

    /* renamed from: i  reason: collision with root package name */
    private final r0[] f17557i;

    /* renamed from: j  reason: collision with root package name */
    private final C f17558j;

    /* renamed from: k  reason: collision with root package name */
    private final m0 f17559k;

    /* renamed from: l  reason: collision with root package name */
    private V f17560l;

    /* renamed from: m  reason: collision with root package name */
    private j0 f17561m = j0.f26269d;

    /* renamed from: n  reason: collision with root package name */
    private D f17562n;

    /* renamed from: o  reason: collision with root package name */
    private long f17563o;

    interface a {
        V a(W w10, long j10);
    }

    public V(r0[] r0VarArr, long j10, C c10, C2820b bVar, m0 m0Var, W w10, D d10) {
        this.f17557i = r0VarArr;
        this.f17563o = j10;
        this.f17558j = c10;
        this.f17559k = m0Var;
        C2615C.b bVar2 = w10.f17564a;
        this.f17550b = bVar2.f25960a;
        this.f17554f = w10;
        this.f17562n = d10;
        this.f17551c = new Z[r0VarArr.length];
        this.f17556h = new boolean[r0VarArr.length];
        this.f17549a = f(bVar2, m0Var, bVar, w10.f17565b, w10.f17567d);
    }

    private void c(Z[] zArr) {
        int i10 = 0;
        while (true) {
            r0[] r0VarArr = this.f17557i;
            if (i10 < r0VarArr.length) {
                if (r0VarArr[i10].e() == -2 && this.f17562n.c(i10)) {
                    zArr[i10] = new C2652r();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private static C2614B f(C2615C.b bVar, m0 m0Var, C2820b bVar2, long j10, long j11) {
        C2614B h10 = m0Var.h(bVar, bVar2, j10);
        if (j11 != -9223372036854775807L) {
            return new C2638d(h10, true, 0, j11);
        }
        return h10;
    }

    private void g() {
        if (t()) {
            int i10 = 0;
            while (true) {
                D d10 = this.f17562n;
                if (i10 < d10.f26965a) {
                    boolean c10 = d10.c(i10);
                    x xVar = this.f17562n.f26967c[i10];
                    if (c10 && xVar != null) {
                        xVar.disable();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private void h(Z[] zArr) {
        int i10 = 0;
        while (true) {
            r0[] r0VarArr = this.f17557i;
            if (i10 < r0VarArr.length) {
                if (r0VarArr[i10].e() == -2) {
                    zArr[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void i() {
        if (t()) {
            int i10 = 0;
            while (true) {
                D d10 = this.f17562n;
                if (i10 < d10.f26965a) {
                    boolean c10 = d10.c(i10);
                    x xVar = this.f17562n.f26967c[i10];
                    if (c10 && xVar != null) {
                        xVar.enable();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private boolean t() {
        if (this.f17560l == null) {
            return true;
        }
        return false;
    }

    private static void w(m0 m0Var, C2614B b10) {
        try {
            if (b10 instanceof C2638d) {
                m0Var.z(((C2638d) b10).f26183a);
            } else {
                m0Var.z(b10);
            }
        } catch (RuntimeException e10) {
            p.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public long A(long j10) {
        return j10 - m();
    }

    public long B(long j10) {
        return j10 + m();
    }

    public void C() {
        C2614B b10 = this.f17549a;
        if (b10 instanceof C2638d) {
            long j10 = this.f17554f.f17567d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((C2638d) b10).u(0, j10);
        }
    }

    public long a(D d10, long j10, boolean z10) {
        return b(d10, j10, z10, new boolean[this.f17557i.length]);
    }

    public long b(D d10, long j10, boolean z10, boolean[] zArr) {
        boolean z11;
        D d11 = d10;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= d11.f26965a) {
                break;
            }
            boolean[] zArr2 = this.f17556h;
            if (z10 || !d10.b(this.f17562n, i10)) {
                z12 = false;
            }
            zArr2[i10] = z12;
            i10++;
        }
        h(this.f17551c);
        g();
        this.f17562n = d11;
        i();
        long t10 = this.f17549a.t(d11.f26967c, this.f17556h, this.f17551c, zArr, j10);
        c(this.f17551c);
        this.f17553e = false;
        int i11 = 0;
        while (true) {
            Z[] zArr3 = this.f17551c;
            if (i11 >= zArr3.length) {
                return t10;
            }
            if (zArr3[i11] != null) {
                C2076a.g(d10.c(i11));
                if (this.f17557i[i11].e() != -2) {
                    this.f17553e = true;
                }
            } else {
                if (d11.f26967c[i11] == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C2076a.g(z11);
            }
            i11++;
        }
    }

    public boolean d(W w10) {
        if (Y.d(this.f17554f.f17568e, w10.f17568e)) {
            W w11 = this.f17554f;
            if (w11.f17565b != w10.f17565b || !w11.f17564a.equals(w10.f17564a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void e(long j10, float f10, long j11) {
        C2076a.g(t());
        this.f17549a.e(new U.b().f(A(j10)).g(f10).e(j11).d());
    }

    public long j() {
        long j10;
        if (!this.f17552d) {
            return this.f17554f.f17565b;
        }
        if (this.f17553e) {
            j10 = this.f17549a.c();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f17554f.f17568e;
        }
        return j10;
    }

    public V k() {
        return this.f17560l;
    }

    public long l() {
        if (!this.f17552d) {
            return 0;
        }
        return this.f17549a.a();
    }

    public long m() {
        return this.f17563o;
    }

    public long n() {
        return this.f17554f.f17565b + this.f17563o;
    }

    public j0 o() {
        return this.f17561m;
    }

    public D p() {
        return this.f17562n;
    }

    public void q(float f10, H h10) {
        this.f17552d = true;
        this.f17561m = this.f17549a.n();
        D x10 = x(f10, h10);
        W w10 = this.f17554f;
        long j10 = w10.f17565b;
        long j11 = w10.f17568e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0, j11 - 1);
        }
        long a10 = a(x10, j10, false);
        long j12 = this.f17563o;
        W w11 = this.f17554f;
        this.f17563o = j12 + (w11.f17565b - a10);
        this.f17554f = w11.b(a10);
    }

    public boolean r() {
        try {
            if (!this.f17552d) {
                this.f17549a.j();
            } else {
                for (Z z10 : this.f17551c) {
                    if (z10 != null) {
                        z10.e();
                    }
                }
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (!this.f17552d || (this.f17553e && this.f17549a.c() != Long.MIN_VALUE)) {
            return false;
        }
        return true;
    }

    public void u(long j10) {
        C2076a.g(t());
        if (this.f17552d) {
            this.f17549a.f(A(j10));
        }
    }

    public void v() {
        g();
        w(this.f17559k, this.f17549a);
    }

    public D x(float f10, H h10) {
        D k10 = this.f17558j.k(this.f17557i, o(), this.f17554f.f17564a, h10);
        for (int i10 = 0; i10 < k10.f26965a; i10++) {
            boolean z10 = true;
            if (k10.c(i10)) {
                if (k10.f26967c[i10] == null && this.f17557i[i10].e() != -2) {
                    z10 = false;
                }
                C2076a.g(z10);
            } else {
                if (k10.f26967c[i10] != null) {
                    z10 = false;
                }
                C2076a.g(z10);
            }
        }
        for (x xVar : k10.f26967c) {
            if (xVar != null) {
                xVar.d(f10);
            }
        }
        return k10;
    }

    public void y(V v10) {
        if (v10 != this.f17560l) {
            g();
            this.f17560l = v10;
            i();
        }
    }

    public void z(long j10) {
        this.f17563o = j10;
    }
}
