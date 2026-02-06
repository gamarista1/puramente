package androidx.compose.ui.platform;

import J0.l0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.f;
import c1.n;
import c1.r;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q0.C2419e;
import q0.C2421g;
import r0.C2448H;
import r0.C2468U;
import r0.C2520p0;
import r0.C2523q0;
import r0.C2550z0;
import r0.M1;
import r0.Q1;
import r0.S1;
import r0.a2;
import r0.b2;
import u0.C2673c;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: androidx.compose.ui.platform.e1  reason: case insensitive filesystem */
public final class C1627e1 implements l0 {

    /* renamed from: n  reason: collision with root package name */
    public static final b f13720n = new b((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    public static final int f13721o = 8;

    /* renamed from: p  reason: collision with root package name */
    private static final p f13722p = a.f13736a;

    /* renamed from: a  reason: collision with root package name */
    private final r f13723a;

    /* renamed from: b  reason: collision with root package name */
    private p f13724b;

    /* renamed from: c  reason: collision with root package name */
    private C6787a f13725c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13726d;

    /* renamed from: e  reason: collision with root package name */
    private final K0 f13727e = new K0();

    /* renamed from: f  reason: collision with root package name */
    private boolean f13728f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13729g;

    /* renamed from: h  reason: collision with root package name */
    private Q1 f13730h;

    /* renamed from: i  reason: collision with root package name */
    private final F0 f13731i = new F0(f13722p);

    /* renamed from: j  reason: collision with root package name */
    private final C2523q0 f13732j = new C2523q0();

    /* renamed from: k  reason: collision with root package name */
    private long f13733k = f.f13431b.a();

    /* renamed from: l  reason: collision with root package name */
    private final C1653n0 f13734l;

    /* renamed from: m  reason: collision with root package name */
    private int f13735m;

    /* renamed from: androidx.compose.ui.platform.e1$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13736a = new a();

        a() {
            super(2);
        }

        public final void a(C1653n0 n0Var, Matrix matrix) {
            n0Var.B(matrix);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1653n0) obj, (Matrix) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.e1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: androidx.compose.ui.platform.e1$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f13737a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar) {
            super(1);
            this.f13737a = pVar;
        }

        public final void a(C2520p0 p0Var) {
            this.f13737a.invoke(p0Var, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2520p0) obj);
            return C6514M.f71813a;
        }
    }

    public C1627e1(r rVar, p pVar, C6787a aVar) {
        C1653n0 n0Var;
        this.f13723a = rVar;
        this.f13724b = pVar;
        this.f13725c = aVar;
        if (Build.VERSION.SDK_INT >= 29) {
            n0Var = new C1621c1(rVar);
        } else {
            n0Var = new P0(rVar);
        }
        n0Var.A(true);
        n0Var.u(false);
        this.f13734l = n0Var;
    }

    private final void l(C2520p0 p0Var) {
        if (this.f13734l.z() || this.f13734l.r()) {
            this.f13727e.a(p0Var);
        }
    }

    private final void m(boolean z10) {
        if (z10 != this.f13726d) {
            this.f13726d = z10;
            this.f13723a.z0(this, z10);
        }
    }

    private final void n() {
        if (Build.VERSION.SDK_INT >= 26) {
            L1.f13611a.a(this.f13723a);
        } else {
            this.f13723a.invalidate();
        }
    }

    public void a(float[] fArr) {
        M1.n(fArr, this.f13731i.b(this.f13734l));
    }

    public void b(C2419e eVar, boolean z10) {
        if (z10) {
            float[] a10 = this.f13731i.a(this.f13734l);
            if (a10 == null) {
                eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                M1.g(a10, eVar);
            }
        } else {
            M1.g(this.f13731i.b(this.f13734l), eVar);
        }
    }

    public long c(long j10, boolean z10) {
        if (!z10) {
            return M1.f(this.f13731i.b(this.f13734l), j10);
        }
        float[] a10 = this.f13731i.a(this.f13734l);
        if (a10 != null) {
            return M1.f(a10, j10);
        }
        return C2421g.f25320b.a();
    }

    public void d(long j10) {
        int g10 = r.g(j10);
        int f10 = r.f(j10);
        this.f13734l.E(f.f(this.f13733k) * ((float) g10));
        this.f13734l.F(f.g(this.f13733k) * ((float) f10));
        C1653n0 n0Var = this.f13734l;
        if (n0Var.v(n0Var.b(), this.f13734l.y(), this.f13734l.b() + g10, this.f13734l.y() + f10)) {
            this.f13734l.G(this.f13727e.b());
            invalidate();
            this.f13731i.c();
        }
    }

    public void destroy() {
        if (this.f13734l.s()) {
            this.f13734l.p();
        }
        this.f13724b = null;
        this.f13725c = null;
        this.f13728f = true;
        m(false);
        this.f13723a.K0();
        this.f13723a.I0(this);
    }

    public void e(p pVar, C6787a aVar) {
        m(false);
        this.f13728f = false;
        this.f13729g = false;
        this.f13733k = f.f13431b.a();
        this.f13724b = pVar;
        this.f13725c = aVar;
    }

    public boolean f(long j10) {
        float m10 = C2421g.m(j10);
        float n10 = C2421g.n(j10);
        if (this.f13734l.r()) {
            if (0.0f > m10 || m10 >= ((float) this.f13734l.e()) || 0.0f > n10 || n10 >= ((float) this.f13734l.d())) {
                return false;
            }
            return true;
        } else if (this.f13734l.z()) {
            return this.f13727e.f(j10);
        } else {
            return true;
        }
    }

    public void g(d dVar) {
        boolean z10;
        boolean z11;
        C6787a aVar;
        boolean z12;
        int x10 = dVar.x() | this.f13735m;
        int i10 = x10 & 4096;
        if (i10 != 0) {
            this.f13733k = dVar.B0();
        }
        boolean z13 = false;
        if (!this.f13734l.z() || this.f13727e.e()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((x10 & 1) != 0) {
            this.f13734l.h(dVar.A());
        }
        if ((x10 & 2) != 0) {
            this.f13734l.m(dVar.J());
        }
        if ((x10 & 4) != 0) {
            this.f13734l.c(dVar.a());
        }
        if ((x10 & 8) != 0) {
            this.f13734l.n(dVar.H());
        }
        if ((x10 & 16) != 0) {
            this.f13734l.f(dVar.F());
        }
        if ((x10 & 32) != 0) {
            this.f13734l.w(dVar.G());
        }
        if ((x10 & 64) != 0) {
            this.f13734l.I(C2550z0.k(dVar.e()));
        }
        if ((x10 & 128) != 0) {
            this.f13734l.K(C2550z0.k(dVar.O()));
        }
        if ((x10 & 1024) != 0) {
            this.f13734l.l(dVar.t());
        }
        if ((x10 & 256) != 0) {
            this.f13734l.j(dVar.I());
        }
        if ((x10 & 512) != 0) {
            this.f13734l.k(dVar.r());
        }
        if ((x10 & 2048) != 0) {
            this.f13734l.i(dVar.w());
        }
        if (i10 != 0) {
            this.f13734l.E(f.f(this.f13733k) * ((float) this.f13734l.e()));
            this.f13734l.F(f.g(this.f13733k) * ((float) this.f13734l.d()));
        }
        if (!dVar.o() || dVar.L() == a2.a()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((x10 & 24576) != 0) {
            this.f13734l.J(z11);
            C1653n0 n0Var = this.f13734l;
            if (!dVar.o() || dVar.L() != a2.a()) {
                z12 = false;
            } else {
                z12 = true;
            }
            n0Var.u(z12);
        }
        if ((131072 & x10) != 0) {
            C1653n0 n0Var2 = this.f13734l;
            dVar.D();
            n0Var2.g((b2) null);
        }
        if ((32768 & x10) != 0) {
            this.f13734l.q(dVar.p());
        }
        boolean h10 = this.f13727e.h(dVar.B(), dVar.a(), z11, dVar.G(), dVar.d());
        if (this.f13727e.c()) {
            this.f13734l.G(this.f13727e.b());
        }
        if (z11 && !this.f13727e.e()) {
            z13 = true;
        }
        if (z10 != z13 || (z13 && h10)) {
            invalidate();
        } else {
            n();
        }
        if (!this.f13729g && this.f13734l.L() > 0.0f && (aVar = this.f13725c) != null) {
            aVar.invoke();
        }
        if ((x10 & 7963) != 0) {
            this.f13731i.c();
        }
        this.f13735m = dVar.x();
    }

    public void h(C2520p0 p0Var, C2673c cVar) {
        Canvas d10 = C2448H.d(p0Var);
        boolean z10 = false;
        if (d10.isHardwareAccelerated()) {
            k();
            if (this.f13734l.L() > 0.0f) {
                z10 = true;
            }
            this.f13729g = z10;
            if (z10) {
                p0Var.n();
            }
            this.f13734l.t(d10);
            if (this.f13729g) {
                p0Var.r();
                return;
            }
            return;
        }
        float b10 = (float) this.f13734l.b();
        float y10 = (float) this.f13734l.y();
        float o10 = (float) this.f13734l.o();
        float D10 = (float) this.f13734l.D();
        if (this.f13734l.a() < 1.0f) {
            Q1 q12 = this.f13730h;
            if (q12 == null) {
                q12 = C2468U.a();
                this.f13730h = q12;
            }
            q12.c(this.f13734l.a());
            d10.saveLayer(b10, y10, o10, D10, q12.q());
        } else {
            p0Var.q();
        }
        p0Var.d(b10, y10);
        p0Var.s(this.f13731i.b(this.f13734l));
        l(p0Var);
        p pVar = this.f13724b;
        if (pVar != null) {
            pVar.invoke(p0Var, (Object) null);
        }
        p0Var.h();
        m(false);
    }

    public void i(float[] fArr) {
        float[] a10 = this.f13731i.a(this.f13734l);
        if (a10 != null) {
            M1.n(fArr, a10);
        }
    }

    public void invalidate() {
        if (!this.f13726d && !this.f13728f) {
            this.f13723a.invalidate();
            m(true);
        }
    }

    public void j(long j10) {
        int b10 = this.f13734l.b();
        int y10 = this.f13734l.y();
        int j11 = n.j(j10);
        int k10 = n.k(j10);
        if (b10 != j11 || y10 != k10) {
            if (b10 != j11) {
                this.f13734l.C(j11 - b10);
            }
            if (y10 != k10) {
                this.f13734l.x(k10 - y10);
            }
            n();
            this.f13731i.c();
        }
    }

    public void k() {
        S1 s12;
        if (this.f13726d || !this.f13734l.s()) {
            if (!this.f13734l.z() || this.f13727e.e()) {
                s12 = null;
            } else {
                s12 = this.f13727e.d();
            }
            p pVar = this.f13724b;
            if (pVar != null) {
                this.f13734l.H(this.f13732j, s12, new c(pVar));
            }
            m(false);
        }
    }
}
