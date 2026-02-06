package u0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.L;
import androidx.collection.X;
import c1.d;
import c1.n;
import c1.r;
import c1.s;
import c1.t;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q0.C2416b;
import q0.C2421g;
import q0.C2423i;
import q0.C2426l;
import q0.C2427m;
import r0.C2448H;
import r0.C2468U;
import r0.C2469V;
import r0.C2472Y;
import r0.C2490f0;
import r0.C2520p0;
import r0.C2541w0;
import r0.C2544x0;
import r0.C2547y0;
import r0.O1;
import r0.Q1;
import r0.S1;
import r0.b2;
import t0.C2603d;
import t0.C2604e;
import t0.C2605f;
import yf.C6798l;

/* renamed from: u0.c  reason: case insensitive filesystem */
public final class C2673c {

    /* renamed from: x  reason: collision with root package name */
    public static final a f26476x = new a((DefaultConstructorMarker) null);

    /* renamed from: y  reason: collision with root package name */
    private static final G f26477y;

    /* renamed from: a  reason: collision with root package name */
    private final C2674d f26478a;

    /* renamed from: b  reason: collision with root package name */
    private d f26479b = C2604e.a();

    /* renamed from: c  reason: collision with root package name */
    private t f26480c = t.Ltr;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C6798l f26481d = C0437c.f26502a;

    /* renamed from: e  reason: collision with root package name */
    private final C6798l f26482e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private Outline f26483f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f26484g = true;

    /* renamed from: h  reason: collision with root package name */
    private long f26485h;

    /* renamed from: i  reason: collision with root package name */
    private long f26486i;

    /* renamed from: j  reason: collision with root package name */
    private float f26487j;

    /* renamed from: k  reason: collision with root package name */
    private O1 f26488k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public S1 f26489l;

    /* renamed from: m  reason: collision with root package name */
    private S1 f26490m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f26491n;

    /* renamed from: o  reason: collision with root package name */
    private Q1 f26492o;

    /* renamed from: p  reason: collision with root package name */
    private int f26493p;

    /* renamed from: q  reason: collision with root package name */
    private final C2671a f26494q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f26495r;

    /* renamed from: s  reason: collision with root package name */
    private long f26496s;

    /* renamed from: t  reason: collision with root package name */
    private long f26497t;

    /* renamed from: u  reason: collision with root package name */
    private long f26498u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f26499v;

    /* renamed from: w  reason: collision with root package name */
    private RectF f26500w;

    /* renamed from: u0.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: u0.c$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2673c f26501a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2673c cVar) {
            super(1);
            this.f26501a = cVar;
        }

        public final void a(C2605f fVar) {
            S1 b10 = this.f26501a.f26489l;
            if (!this.f26501a.f26491n || !this.f26501a.k() || b10 == null) {
                this.f26501a.f26481d.invoke(fVar);
                return;
            }
            C6798l a10 = this.f26501a.f26481d;
            int b11 = C2541w0.f25557a.b();
            C2603d w12 = fVar.w1();
            long d10 = w12.d();
            w12.f().q();
            try {
                w12.e().b(b10, b11);
                a10.invoke(fVar);
            } finally {
                w12.f().h();
                w12.h(d10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }
    }

    static {
        G g10;
        if (F.f26442a.a()) {
            g10 = H.f26444a;
        } else if (Build.VERSION.SDK_INT >= 28) {
            g10 = J.f26446a;
        } else if (S.f26452a.a()) {
            g10 = I.f26445a;
        } else {
            g10 = H.f26444a;
        }
        f26477y = g10;
    }

    public C2673c(C2674d dVar, F f10) {
        this.f26478a = dVar;
        C2421g.a aVar = C2421g.f25320b;
        this.f26485h = aVar.c();
        this.f26486i = C2427m.f25341b.a();
        this.f26494q = new C2671a();
        dVar.y(false);
        this.f26496s = n.f19226b.a();
        this.f26497t = r.f19235b.a();
        this.f26498u = aVar.b();
    }

    private final Outline A() {
        Outline outline = this.f26483f;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.f26483f = outline2;
        return outline2;
    }

    private final RectF B() {
        RectF rectF = this.f26500w;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.f26500w = rectF2;
        return rectF2;
    }

    private final void C() {
        this.f26493p++;
    }

    private final void D() {
        this.f26493p--;
        f();
    }

    private final void F() {
        C2671a aVar = this.f26494q;
        aVar.f26468b = aVar.f26467a;
        L a10 = aVar.f26469c;
        if (a10 != null && a10.e()) {
            L c10 = aVar.f26470d;
            if (c10 == null) {
                c10 = X.a();
                aVar.f26470d = c10;
            }
            c10.i(a10);
            a10.m();
        }
        aVar.f26471e = true;
        this.f26478a.M(this.f26479b, this.f26480c, this, this.f26482e);
        aVar.f26471e = false;
        C2673c d10 = aVar.f26468b;
        if (d10 != null) {
            d10.D();
        }
        L c11 = aVar.f26470d;
        if (c11 != null && c11.e()) {
            Object[] objArr = c11.f12131b;
            long[] jArr = c11.f12130a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                ((C2673c) objArr[(i10 << 3) + i12]).D();
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            c11.m();
        }
    }

    private final void G() {
        if (!this.f26478a.s()) {
            try {
                F();
            } catch (Throwable unused) {
            }
        }
    }

    private final void I() {
        this.f26488k = null;
        this.f26489l = null;
        this.f26486i = C2427m.f25341b.a();
        this.f26485h = C2421g.f25320b.c();
        this.f26487j = 0.0f;
        this.f26484g = true;
        this.f26491n = false;
    }

    private final void Q(long j10, long j11) {
        this.f26478a.u(n.j(j10), n.k(j10), j11);
    }

    private final void a0(long j10) {
        if (!r.e(this.f26497t, j10)) {
            this.f26497t = j10;
            Q(this.f26496s, j10);
            if (this.f26486i == 9205357640488583168L) {
                this.f26484g = true;
                e();
            }
        }
    }

    private final void d(C2673c cVar) {
        if (this.f26494q.i(cVar)) {
            cVar.C();
        }
    }

    private final void e() {
        long j10;
        if (this.f26484g) {
            Outline outline = null;
            if (this.f26499v || u() > 0.0f) {
                S1 s12 = this.f26489l;
                if (s12 != null) {
                    RectF B10 = B();
                    if (s12 instanceof C2469V) {
                        ((C2469V) s12).u().computeBounds(B10, false);
                        Outline g02 = g0(s12);
                        if (g02 != null) {
                            g02.setAlpha(i());
                            outline = g02;
                        }
                        this.f26478a.G(outline, s.a(Math.round(B10.width()), Math.round(B10.height())));
                        if (!this.f26491n || !this.f26499v) {
                            this.f26478a.y(this.f26499v);
                        } else {
                            this.f26478a.y(false);
                            this.f26478a.p();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                } else {
                    this.f26478a.y(this.f26499v);
                    C2427m.f25341b.b();
                    Outline A10 = A();
                    long d10 = s.d(this.f26497t);
                    long j11 = this.f26485h;
                    long j12 = this.f26486i;
                    if (j12 == 9205357640488583168L) {
                        j10 = d10;
                    } else {
                        j10 = j12;
                    }
                    A10.setRoundRect(Math.round(C2421g.m(j11)), Math.round(C2421g.n(j11)), Math.round(C2421g.m(j11) + C2427m.k(j10)), Math.round(C2421g.n(j11) + C2427m.i(j10)), this.f26487j);
                    A10.setAlpha(i());
                    this.f26478a.G(A10, s.c(j10));
                }
            } else {
                this.f26478a.y(false);
                this.f26478a.G((Outline) null, r.f19235b.a());
            }
        }
        this.f26484g = false;
    }

    private final void f() {
        if (this.f26495r && this.f26493p == 0) {
            g();
        }
    }

    private final void f0(Canvas canvas) {
        float j10 = (float) n.j(this.f26496s);
        float k10 = (float) n.k(this.f26496s);
        float j11 = ((float) n.j(this.f26496s)) + ((float) r.g(this.f26497t));
        float k11 = ((float) n.k(this.f26496s)) + ((float) r.f(this.f26497t));
        float i10 = i();
        C2547y0 l10 = l();
        int j12 = j();
        if (i10 < 1.0f || !C2490f0.E(j12, C2490f0.f25500a.B()) || l10 != null || C2672b.e(m(), C2672b.f26472a.c())) {
            Q1 q12 = this.f26492o;
            if (q12 == null) {
                q12 = C2468U.a();
                this.f26492o = q12;
            }
            q12.c(i10);
            q12.h(j12);
            q12.f(l10);
            canvas.saveLayer(j10, k10, j11, k11, q12.q());
        } else {
            canvas.save();
        }
        canvas.translate(j10, k10);
        canvas.concat(this.f26478a.D());
    }

    private final Outline g0(S1 s12) {
        Outline outline;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || s12.b()) {
            Outline A10 = A();
            if (i10 >= 30) {
                M.f26448a.a(A10, s12);
            } else if (s12 instanceof C2469V) {
                A10.setConvexPath(((C2469V) s12).u());
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            this.f26491n = !A10.canClip();
            outline = A10;
        } else {
            Outline outline2 = this.f26483f;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.f26491n = true;
            this.f26478a.E(true);
            outline = null;
        }
        this.f26489l = s12;
        return outline;
    }

    public final void E(d dVar, t tVar, long j10, C6798l lVar) {
        a0(j10);
        this.f26479b = dVar;
        this.f26480c = tVar;
        this.f26481d = lVar;
        this.f26478a.E(true);
        F();
    }

    public final void H() {
        if (!this.f26495r) {
            this.f26495r = true;
            f();
        }
    }

    public final void J(float f10) {
        if (this.f26478a.a() != f10) {
            this.f26478a.c(f10);
        }
    }

    public final void K(long j10) {
        if (!C2544x0.q(j10, this.f26478a.x())) {
            this.f26478a.v(j10);
        }
    }

    public final void L(float f10) {
        if (this.f26478a.w() != f10) {
            this.f26478a.i(f10);
        }
    }

    public final void M(boolean z10) {
        if (this.f26499v != z10) {
            this.f26499v = z10;
            this.f26484g = true;
            e();
        }
    }

    public final void N(int i10) {
        if (!C2672b.e(this.f26478a.o(), i10)) {
            this.f26478a.L(i10);
        }
    }

    public final void O(S1 s12) {
        I();
        this.f26489l = s12;
        e();
    }

    public final void P(long j10) {
        if (!C2421g.j(this.f26498u, j10)) {
            this.f26498u = j10;
            this.f26478a.K(j10);
        }
    }

    public final void R(long j10, long j11) {
        W(j10, j11, 0.0f);
    }

    public final void S(b2 b2Var) {
        this.f26478a.d();
        if (!C6496s.c((Object) null, b2Var)) {
            this.f26478a.g(b2Var);
        }
    }

    public final void T(float f10) {
        if (this.f26478a.I() != f10) {
            this.f26478a.j(f10);
        }
    }

    public final void U(float f10) {
        if (this.f26478a.r() != f10) {
            this.f26478a.k(f10);
        }
    }

    public final void V(float f10) {
        if (this.f26478a.t() != f10) {
            this.f26478a.l(f10);
        }
    }

    public final void W(long j10, long j11, float f10) {
        if (!C2421g.j(this.f26485h, j10) || !C2427m.h(this.f26486i, j11) || this.f26487j != f10 || this.f26489l != null) {
            I();
            this.f26485h = j10;
            this.f26486i = j11;
            this.f26487j = f10;
            e();
        }
    }

    public final void X(float f10) {
        if (this.f26478a.A() != f10) {
            this.f26478a.h(f10);
        }
    }

    public final void Y(float f10) {
        if (this.f26478a.J() != f10) {
            this.f26478a.m(f10);
        }
    }

    public final void Z(float f10) {
        if (this.f26478a.N() != f10) {
            this.f26478a.C(f10);
            this.f26484g = true;
            e();
        }
    }

    public final void b0(long j10) {
        if (!C2544x0.q(j10, this.f26478a.B())) {
            this.f26478a.z(j10);
        }
    }

    public final void c0(long j10) {
        if (!n.i(this.f26496s, j10)) {
            this.f26496s = j10;
            Q(j10, this.f26497t);
        }
    }

    public final void d0(float f10) {
        if (this.f26478a.H() != f10) {
            this.f26478a.n(f10);
        }
    }

    public final void e0(float f10) {
        if (this.f26478a.F() != f10) {
            this.f26478a.f(f10);
        }
    }

    public final void g() {
        C2671a aVar = this.f26494q;
        C2673c b10 = aVar.f26467a;
        if (b10 != null) {
            b10.D();
            aVar.f26467a = null;
        }
        L a10 = aVar.f26469c;
        if (a10 != null) {
            Object[] objArr = a10.f12131b;
            long[] jArr = a10.f12130a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                ((C2673c) objArr[(i10 << 3) + i12]).D();
                            }
                            j10 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            a10.m();
        }
        this.f26478a.p();
    }

    public final void h(C2520p0 p0Var, C2673c cVar) {
        boolean z10;
        if (!this.f26495r) {
            e();
            G();
            boolean z11 = true;
            if (u() > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                p0Var.n();
            }
            Canvas d10 = C2448H.d(p0Var);
            boolean isHardwareAccelerated = d10.isHardwareAccelerated();
            if (!isHardwareAccelerated) {
                d10.save();
                f0(d10);
            }
            if (isHardwareAccelerated || !this.f26499v) {
                z11 = false;
            }
            if (z11) {
                p0Var.q();
                O1 n10 = n();
                if (n10 instanceof O1.b) {
                    C2520p0.t(p0Var, n10.a(), 0, 2, (Object) null);
                } else if (n10 instanceof O1.c) {
                    S1 s12 = this.f26490m;
                    if (s12 != null) {
                        s12.o();
                    } else {
                        s12 = C2472Y.a();
                        this.f26490m = s12;
                    }
                    S1.a(s12, ((O1.c) n10).b(), (S1.b) null, 2, (Object) null);
                    C2520p0.p(p0Var, s12, 0, 2, (Object) null);
                } else if (n10 instanceof O1.a) {
                    C2520p0.p(p0Var, ((O1.a) n10).b(), 0, 2, (Object) null);
                }
            }
            if (cVar != null) {
                cVar.d(this);
            }
            this.f26478a.q(p0Var);
            if (z11) {
                p0Var.h();
            }
            if (z10) {
                p0Var.r();
            }
            if (!isHardwareAccelerated) {
                d10.restore();
            }
        }
    }

    public final float i() {
        return this.f26478a.a();
    }

    public final int j() {
        return this.f26478a.e();
    }

    public final boolean k() {
        return this.f26499v;
    }

    public final C2547y0 l() {
        return this.f26478a.b();
    }

    public final int m() {
        return this.f26478a.o();
    }

    public final O1 n() {
        O1 o12;
        O1 o13 = this.f26488k;
        S1 s12 = this.f26489l;
        if (o13 != null) {
            return o13;
        }
        if (s12 != null) {
            O1.a aVar = new O1.a(s12);
            this.f26488k = aVar;
            return aVar;
        }
        long d10 = s.d(this.f26497t);
        long j10 = this.f26485h;
        long j11 = this.f26486i;
        if (j11 != 9205357640488583168L) {
            d10 = j11;
        }
        float m10 = C2421g.m(j10);
        float n10 = C2421g.n(j10);
        float k10 = m10 + C2427m.k(d10);
        float i10 = n10 + C2427m.i(d10);
        float f10 = this.f26487j;
        if (f10 > 0.0f) {
            o12 = new O1.c(C2426l.c(m10, n10, k10, i10, C2416b.b(f10, 0.0f, 2, (Object) null)));
        } else {
            o12 = new O1.b(new C2423i(m10, n10, k10, i10));
        }
        this.f26488k = o12;
        return o12;
    }

    public final long o() {
        return this.f26498u;
    }

    public final float p() {
        return this.f26478a.I();
    }

    public final float q() {
        return this.f26478a.r();
    }

    public final float r() {
        return this.f26478a.t();
    }

    public final float s() {
        return this.f26478a.A();
    }

    public final float t() {
        return this.f26478a.J();
    }

    public final float u() {
        return this.f26478a.N();
    }

    public final long v() {
        return this.f26497t;
    }

    public final long w() {
        return this.f26496s;
    }

    public final float x() {
        return this.f26478a.H();
    }

    public final float y() {
        return this.f26478a.F();
    }

    public final boolean z() {
        return this.f26495r;
    }

    /* renamed from: u0.c$c  reason: collision with other inner class name */
    static final class C0437c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final C0437c f26502a = new C0437c();

        C0437c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2605f) obj);
            return C6514M.f71813a;
        }

        public final void a(C2605f fVar) {
        }
    }
}
