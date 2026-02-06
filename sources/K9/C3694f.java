package k9;

import N9.M;
import ja.C3645a;
import ja.u;
import l9.s0;
import n9.C3871g;

/* renamed from: k9.f  reason: case insensitive filesystem */
public abstract class C3694f implements a1, b1 {

    /* renamed from: a  reason: collision with root package name */
    private final int f45542a;

    /* renamed from: b  reason: collision with root package name */
    private final C3718r0 f45543b = new C3718r0();

    /* renamed from: c  reason: collision with root package name */
    private c1 f45544c;

    /* renamed from: d  reason: collision with root package name */
    private int f45545d;

    /* renamed from: e  reason: collision with root package name */
    private s0 f45546e;

    /* renamed from: f  reason: collision with root package name */
    private int f45547f;

    /* renamed from: g  reason: collision with root package name */
    private M f45548g;

    /* renamed from: h  reason: collision with root package name */
    private C3717q0[] f45549h;

    /* renamed from: i  reason: collision with root package name */
    private long f45550i;

    /* renamed from: j  reason: collision with root package name */
    private long f45551j;

    /* renamed from: k  reason: collision with root package name */
    private long f45552k = Long.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    private boolean f45553l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f45554m;

    public C3694f(int i10) {
        this.f45542a = i10;
    }

    private void V(long j10, boolean z10) {
        this.f45553l = false;
        this.f45551j = j10;
        this.f45552k = j10;
        P(j10, z10);
    }

    public u A() {
        return null;
    }

    public final void D(C3717q0[] q0VarArr, M m10, long j10, long j11) {
        C3645a.f(!this.f45553l);
        this.f45548g = m10;
        if (this.f45552k == Long.MIN_VALUE) {
            this.f45552k = j10;
        }
        this.f45549h = q0VarArr;
        this.f45550i = j11;
        T(q0VarArr, j10, j11);
    }

    public final void E(c1 c1Var, C3717q0[] q0VarArr, M m10, long j10, boolean z10, boolean z11, long j11, long j12) {
        boolean z12;
        boolean z13 = z10;
        if (this.f45547f == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        C3645a.f(z12);
        this.f45544c = c1Var;
        this.f45547f = 1;
        O(z10, z11);
        D(q0VarArr, m10, j11, j12);
        long j13 = j10;
        V(j10, z10);
    }

    /* access modifiers changed from: protected */
    public final r F(Throwable th2, C3717q0 q0Var, int i10) {
        return G(th2, q0Var, false, i10);
    }

    /* access modifiers changed from: protected */
    public final r G(Throwable th2, C3717q0 q0Var, boolean z10, int i10) {
        int i11;
        if (q0Var != null && !this.f45554m) {
            this.f45554m = true;
            try {
                i11 = b1.B(a(q0Var));
            } catch (r unused) {
            } finally {
                this.f45554m = false;
            }
            return r.g(th2, getName(), J(), q0Var, i11, z10, i10);
        }
        i11 = 4;
        return r.g(th2, getName(), J(), q0Var, i11, z10, i10);
    }

    /* access modifiers changed from: protected */
    public final c1 H() {
        return (c1) C3645a.e(this.f45544c);
    }

    /* access modifiers changed from: protected */
    public final C3718r0 I() {
        this.f45543b.a();
        return this.f45543b;
    }

    /* access modifiers changed from: protected */
    public final int J() {
        return this.f45545d;
    }

    /* access modifiers changed from: protected */
    public final s0 K() {
        return (s0) C3645a.e(this.f45546e);
    }

    /* access modifiers changed from: protected */
    public final C3717q0[] L() {
        return (C3717q0[]) C3645a.e(this.f45549h);
    }

    /* access modifiers changed from: protected */
    public final boolean M() {
        if (h()) {
            return this.f45553l;
        }
        return ((M) C3645a.e(this.f45548g)).d();
    }

    /* access modifiers changed from: protected */
    public abstract void N();

    /* access modifiers changed from: protected */
    public abstract void P(long j10, boolean z10);

    /* access modifiers changed from: protected */
    public abstract void T(C3717q0[] q0VarArr, long j10, long j11);

    /* access modifiers changed from: protected */
    public final int U(C3718r0 r0Var, C3871g gVar, int i10) {
        int q10 = ((M) C3645a.e(this.f45548g)).q(r0Var, gVar, i10);
        if (q10 == -4) {
            if (gVar.p()) {
                this.f45552k = Long.MIN_VALUE;
                if (this.f45553l) {
                    return -4;
                }
                return -3;
            }
            long j10 = gVar.f46952e + this.f45550i;
            gVar.f46952e = j10;
            this.f45552k = Math.max(this.f45552k, j10);
        } else if (q10 == -5) {
            C3717q0 q0Var = (C3717q0) C3645a.e(r0Var.f45824b);
            if (q0Var.f45774p != Long.MAX_VALUE) {
                r0Var.f45824b = q0Var.b().i0(q0Var.f45774p + this.f45550i).E();
            }
        }
        return q10;
    }

    /* access modifiers changed from: protected */
    public int W(long j10) {
        return ((M) C3645a.e(this.f45548g)).k(j10 - this.f45550i);
    }

    public final void disable() {
        boolean z10 = true;
        if (this.f45547f != 1) {
            z10 = false;
        }
        C3645a.f(z10);
        this.f45543b.a();
        this.f45547f = 0;
        this.f45548g = null;
        this.f45549h = null;
        this.f45553l = false;
        N();
    }

    public final int e() {
        return this.f45542a;
    }

    public final int getState() {
        return this.f45547f;
    }

    public final boolean h() {
        if (this.f45552k == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final void j(int i10, s0 s0Var) {
        this.f45545d = i10;
        this.f45546e = s0Var;
    }

    public final void k() {
        this.f45553l = true;
    }

    public final void q() {
        ((M) C3645a.e(this.f45548g)).e();
    }

    public final boolean r() {
        return this.f45553l;
    }

    public final void reset() {
        boolean z10;
        if (this.f45547f == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        this.f45543b.a();
        Q();
    }

    public final void start() {
        boolean z10 = true;
        if (this.f45547f != 1) {
            z10 = false;
        }
        C3645a.f(z10);
        this.f45547f = 2;
        R();
    }

    public final void stop() {
        boolean z10;
        if (this.f45547f == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        this.f45547f = 1;
        S();
    }

    public int w() {
        return 0;
    }

    public final M x() {
        return this.f45548g;
    }

    public final long y() {
        return this.f45552k;
    }

    public final void z(long j10) {
        V(j10, false);
    }

    /* access modifiers changed from: protected */
    public void Q() {
    }

    /* access modifiers changed from: protected */
    public void R() {
    }

    /* access modifiers changed from: protected */
    public void S() {
    }

    public final b1 t() {
        return this;
    }

    /* access modifiers changed from: protected */
    public void O(boolean z10, boolean z11) {
    }

    public void p(int i10, Object obj) {
    }
}
