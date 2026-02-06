package androidx.compose.ui.platform;

import J0.l0;
import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import c1.d;
import c1.f;
import c1.n;
import c1.r;
import c1.s;
import c1.t;
import com.google.android.gms.common.api.a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q0.C2419e;
import q0.C2421g;
import q0.C2422h;
import q0.C2428n;
import r0.C2448H;
import r0.C2468U;
import r0.C2472Y;
import r0.C2520p0;
import r0.F1;
import r0.M1;
import r0.O1;
import r0.Q1;
import r0.S1;
import r0.b2;
import t0.C2600a;
import t0.C2603d;
import t0.C2605f;
import u0.C2672b;
import u0.C2673c;
import u0.C2675e;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: androidx.compose.ui.platform.u0  reason: case insensitive filesystem */
public final class C1666u0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private C2673c f13961a;

    /* renamed from: b  reason: collision with root package name */
    private final F1 f13962b;

    /* renamed from: c  reason: collision with root package name */
    private final r f13963c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public p f13964d;

    /* renamed from: e  reason: collision with root package name */
    private C6787a f13965e;

    /* renamed from: f  reason: collision with root package name */
    private long f13966f = s.a(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER);

    /* renamed from: g  reason: collision with root package name */
    private boolean f13967g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f13968h = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private float[] f13969i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f13970j;

    /* renamed from: k  reason: collision with root package name */
    private d f13971k = f.b(1.0f, 0.0f, 2, (Object) null);

    /* renamed from: l  reason: collision with root package name */
    private t f13972l = t.Ltr;

    /* renamed from: m  reason: collision with root package name */
    private final C2600a f13973m = new C2600a();

    /* renamed from: n  reason: collision with root package name */
    private int f13974n;

    /* renamed from: o  reason: collision with root package name */
    private long f13975o = androidx.compose.ui.graphics.f.f13431b.a();

    /* renamed from: p  reason: collision with root package name */
    private O1 f13976p;

    /* renamed from: q  reason: collision with root package name */
    private S1 f13977q;

    /* renamed from: r  reason: collision with root package name */
    private Q1 f13978r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f13979s;

    /* renamed from: t  reason: collision with root package name */
    private final C6798l f13980t = new a(this);

    /* renamed from: androidx.compose.ui.platform.u0$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1666u0 f13981a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1666u0 u0Var) {
            super(1);
            this.f13981a = u0Var;
        }

        public final void a(C2605f fVar) {
            C1666u0 u0Var = this.f13981a;
            C2520p0 f10 = fVar.w1().f();
            p l10 = u0Var.f13964d;
            if (l10 != null) {
                l10.invoke(f10, fVar.w1().i());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    public C1666u0(C2673c cVar, F1 f12, r rVar, p pVar, C6787a aVar) {
        this.f13961a = cVar;
        this.f13962b = f12;
        this.f13963c = rVar;
        this.f13964d = pVar;
        this.f13965e = aVar;
    }

    private final void m(C2520p0 p0Var) {
        if (this.f13961a.k()) {
            O1 n10 = this.f13961a.n();
            if (n10 instanceof O1.b) {
                C2520p0.t(p0Var, ((O1.b) n10).b(), 0, 2, (Object) null);
            } else if (n10 instanceof O1.c) {
                S1 s12 = this.f13977q;
                if (s12 == null) {
                    s12 = C2472Y.a();
                    this.f13977q = s12;
                }
                s12.reset();
                S1.a(s12, ((O1.c) n10).b(), (S1.b) null, 2, (Object) null);
                C2520p0.p(p0Var, s12, 0, 2, (Object) null);
            } else if (n10 instanceof O1.a) {
                C2520p0.p(p0Var, ((O1.a) n10).b(), 0, 2, (Object) null);
            }
        }
    }

    private final float[] n() {
        float[] o10 = o();
        float[] fArr = this.f13969i;
        if (fArr == null) {
            fArr = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f13969i = fArr;
        }
        if (D0.a(o10, fArr)) {
            return fArr;
        }
        return null;
    }

    private final float[] o() {
        r();
        return this.f13968h;
    }

    private final void p(boolean z10) {
        if (z10 != this.f13970j) {
            this.f13970j = z10;
            this.f13963c.z0(this, z10);
        }
    }

    private final void q() {
        if (Build.VERSION.SDK_INT >= 26) {
            L1.f13611a.a(this.f13963c);
        } else {
            this.f13963c.invalidate();
        }
    }

    private final void r() {
        long j10;
        C2673c cVar = this.f13961a;
        if (C2422h.d(cVar.o())) {
            j10 = C2428n.b(s.d(this.f13966f));
        } else {
            j10 = cVar.o();
        }
        M1.h(this.f13968h);
        float[] fArr = this.f13968h;
        float[] c10 = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);
        M1.q(c10, -C2421g.m(j10), -C2421g.n(j10), 0.0f, 4, (Object) null);
        M1.n(fArr, c10);
        float[] fArr2 = this.f13968h;
        float[] c11 = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);
        M1.q(c11, cVar.x(), cVar.y(), 0.0f, 4, (Object) null);
        M1.i(c11, cVar.p());
        M1.j(c11, cVar.q());
        M1.k(c11, cVar.r());
        M1.m(c11, cVar.s(), cVar.t(), 0.0f, 4, (Object) null);
        M1.n(fArr2, c11);
        float[] fArr3 = this.f13968h;
        float[] c12 = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);
        M1.q(c12, C2421g.m(j10), C2421g.n(j10), 0.0f, 4, (Object) null);
        M1.n(fArr3, c12);
    }

    private final void s() {
        C6787a aVar;
        O1 o12 = this.f13976p;
        if (o12 != null) {
            C2675e.b(this.f13961a, o12);
            if ((o12 instanceof O1.a) && Build.VERSION.SDK_INT < 33 && (aVar = this.f13965e) != null) {
                aVar.invoke();
            }
        }
    }

    public void a(float[] fArr) {
        M1.n(fArr, o());
    }

    public void b(C2419e eVar, boolean z10) {
        if (z10) {
            float[] n10 = n();
            if (n10 == null) {
                eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                M1.g(n10, eVar);
            }
        } else {
            M1.g(o(), eVar);
        }
    }

    public long c(long j10, boolean z10) {
        if (!z10) {
            return M1.f(o(), j10);
        }
        float[] n10 = n();
        if (n10 != null) {
            return M1.f(n10, j10);
        }
        return C2421g.f25320b.a();
    }

    public void d(long j10) {
        if (!r.e(j10, this.f13966f)) {
            this.f13966f = j10;
            invalidate();
        }
    }

    public void destroy() {
        this.f13964d = null;
        this.f13965e = null;
        this.f13967g = true;
        p(false);
        F1 f12 = this.f13962b;
        if (f12 != null) {
            f12.a(this.f13961a);
            this.f13963c.I0(this);
        }
    }

    public void e(p pVar, C6787a aVar) {
        F1 f12 = this.f13962b;
        if (f12 == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        } else if (this.f13961a.z()) {
            this.f13961a = f12.b();
            this.f13967g = false;
            this.f13964d = pVar;
            this.f13965e = aVar;
            this.f13975o = androidx.compose.ui.graphics.f.f13431b.a();
            this.f13979s = false;
            this.f13966f = s.a(a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER);
            this.f13976p = null;
            this.f13974n = 0;
        } else {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
    }

    public boolean f(long j10) {
        float m10 = C2421g.m(j10);
        float n10 = C2421g.n(j10);
        if (this.f13961a.k()) {
            return C1648l1.c(this.f13961a.n(), m10, n10, (S1) null, (S1) null, 24, (Object) null);
        }
        return true;
    }

    public void g(androidx.compose.ui.graphics.d dVar) {
        boolean z10;
        int i10;
        C6787a aVar;
        int x10 = dVar.x() | this.f13974n;
        this.f13972l = dVar.u();
        this.f13971k = dVar.s();
        int i11 = x10 & 4096;
        if (i11 != 0) {
            this.f13975o = dVar.B0();
        }
        if ((x10 & 1) != 0) {
            this.f13961a.X(dVar.A());
        }
        if ((x10 & 2) != 0) {
            this.f13961a.Y(dVar.J());
        }
        if ((x10 & 4) != 0) {
            this.f13961a.J(dVar.a());
        }
        if ((x10 & 8) != 0) {
            this.f13961a.d0(dVar.H());
        }
        if ((x10 & 16) != 0) {
            this.f13961a.e0(dVar.F());
        }
        if ((x10 & 32) != 0) {
            this.f13961a.Z(dVar.G());
            if (dVar.G() > 0.0f && !this.f13979s && (aVar = this.f13965e) != null) {
                aVar.invoke();
            }
        }
        if ((x10 & 64) != 0) {
            this.f13961a.K(dVar.e());
        }
        if ((x10 & 128) != 0) {
            this.f13961a.b0(dVar.O());
        }
        if ((x10 & 1024) != 0) {
            this.f13961a.V(dVar.t());
        }
        if ((x10 & 256) != 0) {
            this.f13961a.T(dVar.I());
        }
        if ((x10 & 512) != 0) {
            this.f13961a.U(dVar.r());
        }
        if ((x10 & 2048) != 0) {
            this.f13961a.L(dVar.w());
        }
        if (i11 != 0) {
            if (androidx.compose.ui.graphics.f.e(this.f13975o, androidx.compose.ui.graphics.f.f13431b.a())) {
                this.f13961a.P(C2421g.f25320b.b());
            } else {
                this.f13961a.P(C2422h.a(androidx.compose.ui.graphics.f.f(this.f13975o) * ((float) r.g(this.f13966f)), androidx.compose.ui.graphics.f.g(this.f13975o) * ((float) r.f(this.f13966f))));
            }
        }
        if ((x10 & 16384) != 0) {
            this.f13961a.M(dVar.o());
        }
        if ((131072 & x10) != 0) {
            C2673c cVar = this.f13961a;
            dVar.D();
            cVar.S((b2) null);
        }
        if ((32768 & x10) != 0) {
            C2673c cVar2 = this.f13961a;
            int p10 = dVar.p();
            a.C0255a aVar2 = androidx.compose.ui.graphics.a.f13386a;
            if (androidx.compose.ui.graphics.a.e(p10, aVar2.a())) {
                i10 = C2672b.f26472a.a();
            } else if (androidx.compose.ui.graphics.a.e(p10, aVar2.c())) {
                i10 = C2672b.f26472a.c();
            } else if (androidx.compose.ui.graphics.a.e(p10, aVar2.b())) {
                i10 = C2672b.f26472a.b();
            } else {
                throw new IllegalStateException("Not supported composition strategy");
            }
            cVar2.N(i10);
        }
        if (!C6496s.c(this.f13976p, dVar.B())) {
            this.f13976p = dVar.B();
            s();
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13974n = dVar.x();
        if (x10 != 0 || z10) {
            q();
        }
    }

    public void h(C2520p0 p0Var, C2673c cVar) {
        boolean z10;
        Canvas d10 = C2448H.d(p0Var);
        if (d10.isHardwareAccelerated()) {
            k();
            if (this.f13961a.u() > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f13979s = z10;
            C2603d w12 = this.f13973m.w1();
            w12.c(p0Var);
            w12.g(cVar);
            C2675e.a(this.f13973m, this.f13961a);
            return;
        }
        float j10 = (float) n.j(this.f13961a.w());
        float k10 = (float) n.k(this.f13961a.w());
        float g10 = j10 + ((float) r.g(this.f13966f));
        float f10 = k10 + ((float) r.f(this.f13966f));
        if (this.f13961a.i() < 1.0f) {
            Q1 q12 = this.f13978r;
            if (q12 == null) {
                q12 = C2468U.a();
                this.f13978r = q12;
            }
            q12.c(this.f13961a.i());
            d10.saveLayer(j10, k10, g10, f10, q12.q());
        } else {
            p0Var.q();
        }
        p0Var.d(j10, k10);
        p0Var.s(o());
        if (this.f13961a.k()) {
            m(p0Var);
        }
        p pVar = this.f13964d;
        if (pVar != null) {
            pVar.invoke(p0Var, (Object) null);
        }
        p0Var.h();
    }

    public void i(float[] fArr) {
        float[] n10 = n();
        if (n10 != null) {
            M1.n(fArr, n10);
        }
    }

    public void invalidate() {
        if (!this.f13970j && !this.f13967g) {
            this.f13963c.invalidate();
            p(true);
        }
    }

    public void j(long j10) {
        this.f13961a.c0(j10);
        q();
    }

    public void k() {
        if (this.f13970j) {
            if (!androidx.compose.ui.graphics.f.e(this.f13975o, androidx.compose.ui.graphics.f.f13431b.a()) && !r.e(this.f13961a.v(), this.f13966f)) {
                this.f13961a.P(C2422h.a(androidx.compose.ui.graphics.f.f(this.f13975o) * ((float) r.g(this.f13966f)), androidx.compose.ui.graphics.f.g(this.f13975o) * ((float) r.f(this.f13966f))));
            }
            this.f13961a.E(this.f13971k, this.f13972l, this.f13966f, this.f13980t);
            p(false);
        }
    }
}
