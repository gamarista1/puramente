package androidx.compose.ui.graphics;

import H0.E;
import H0.G;
import H0.H;
import H0.U;
import J0.B;
import J0.C1235c0;
import J0.C1239e0;
import J0.C1245k;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import r0.C2544x0;
import r0.b2;
import r0.g2;
import yf.C6798l;

final class e extends i.c implements B {

    /* renamed from: A  reason: collision with root package name */
    private long f13411A;

    /* renamed from: B  reason: collision with root package name */
    private long f13412B;

    /* renamed from: C  reason: collision with root package name */
    private int f13413C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public C6798l f13414D;

    /* renamed from: n  reason: collision with root package name */
    private float f13415n;

    /* renamed from: o  reason: collision with root package name */
    private float f13416o;

    /* renamed from: p  reason: collision with root package name */
    private float f13417p;

    /* renamed from: q  reason: collision with root package name */
    private float f13418q;

    /* renamed from: r  reason: collision with root package name */
    private float f13419r;

    /* renamed from: s  reason: collision with root package name */
    private float f13420s;

    /* renamed from: t  reason: collision with root package name */
    private float f13421t;

    /* renamed from: u  reason: collision with root package name */
    private float f13422u;

    /* renamed from: v  reason: collision with root package name */
    private float f13423v;

    /* renamed from: w  reason: collision with root package name */
    private float f13424w;

    /* renamed from: x  reason: collision with root package name */
    private long f13425x;

    /* renamed from: y  reason: collision with root package name */
    private g2 f13426y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f13427z;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f13428a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(1);
            this.f13428a = eVar;
        }

        public final void a(c cVar) {
            cVar.h(this.f13428a.A());
            cVar.m(this.f13428a.J());
            cVar.c(this.f13428a.m2());
            cVar.n(this.f13428a.H());
            cVar.f(this.f13428a.F());
            cVar.C(this.f13428a.r2());
            cVar.j(this.f13428a.I());
            cVar.k(this.f13428a.r());
            cVar.l(this.f13428a.t());
            cVar.i(this.f13428a.w());
            cVar.F0(this.f13428a.B0());
            cVar.O0(this.f13428a.s2());
            cVar.y(this.f13428a.o2());
            this.f13428a.q2();
            cVar.g((b2) null);
            cVar.v(this.f13428a.n2());
            cVar.z(this.f13428a.t2());
            cVar.q(this.f13428a.p2());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ U f13429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f13430b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(U u10, e eVar) {
            super(1);
            this.f13429a = u10;
            this.f13430b = eVar;
        }

        public final void a(U.a aVar) {
            U.a.v(aVar, this.f13429a, 0, 0, 0.0f, this.f13430b.f13414D, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ e(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g2 g2Var, boolean z10, b2 b2Var, long j11, long j12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, g2Var, z10, b2Var, j11, j12, i10);
    }

    public final float A() {
        return this.f13415n;
    }

    public final long B0() {
        return this.f13425x;
    }

    public final void C(float f10) {
        this.f13420s = f10;
    }

    public final float F() {
        return this.f13419r;
    }

    public final void F0(long j10) {
        this.f13425x = j10;
    }

    public final float H() {
        return this.f13418q;
    }

    public final float I() {
        return this.f13421t;
    }

    public final float J() {
        return this.f13416o;
    }

    public final void O0(g2 g2Var) {
        this.f13426y = g2Var;
    }

    public boolean Q1() {
        return false;
    }

    public final void c(float f10) {
        this.f13417p = f10;
    }

    public final void f(float f10) {
        this.f13419r = f10;
    }

    public final void h(float f10) {
        this.f13415n = f10;
    }

    public final void i(float f10) {
        this.f13424w = f10;
    }

    public final void j(float f10) {
        this.f13421t = f10;
    }

    public final void k(float f10) {
        this.f13422u = f10;
    }

    public final void l(float f10) {
        this.f13423v = f10;
    }

    public final void m(float f10) {
        this.f13416o = f10;
    }

    public final float m2() {
        return this.f13417p;
    }

    public final void n(float f10) {
        this.f13418q = f10;
    }

    public final long n2() {
        return this.f13411A;
    }

    public G o(H h10, E e10, long j10) {
        U v02 = e10.v0(j10);
        return H.N(h10, v02.X0(), v02.R0(), (Map) null, new b(v02, this), 4, (Object) null);
    }

    public final boolean o2() {
        return this.f13427z;
    }

    public final int p2() {
        return this.f13413C;
    }

    public final void q(int i10) {
        this.f13413C = i10;
    }

    public final b2 q2() {
        return null;
    }

    public final float r() {
        return this.f13422u;
    }

    public final float r2() {
        return this.f13420s;
    }

    public final g2 s2() {
        return this.f13426y;
    }

    public final float t() {
        return this.f13423v;
    }

    public final long t2() {
        return this.f13412B;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f13415n + ", scaleY=" + this.f13416o + ", alpha = " + this.f13417p + ", translationX=" + this.f13418q + ", translationY=" + this.f13419r + ", shadowElevation=" + this.f13420s + ", rotationX=" + this.f13421t + ", rotationY=" + this.f13422u + ", rotationZ=" + this.f13423v + ", cameraDistance=" + this.f13424w + ", transformOrigin=" + f.i(this.f13425x) + ", shape=" + this.f13426y + ", clip=" + this.f13427z + ", renderEffect=" + null + ", ambientShadowColor=" + C2544x0.x(this.f13411A) + ", spotShadowColor=" + C2544x0.x(this.f13412B) + ", compositingStrategy=" + a.g(this.f13413C) + ')';
    }

    public final void u2() {
        C1235c0 E22 = C1245k.h(this, C1239e0.a(2)).E2();
        if (E22 != null) {
            E22.s3(this.f13414D, true);
        }
    }

    public final void v(long j10) {
        this.f13411A = j10;
    }

    public final float w() {
        return this.f13424w;
    }

    public final void y(boolean z10) {
        this.f13427z = z10;
    }

    public final void z(long j10) {
        this.f13412B = j10;
    }

    private e(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, g2 g2Var, boolean z10, b2 b2Var, long j11, long j12, int i10) {
        this.f13415n = f10;
        this.f13416o = f11;
        this.f13417p = f12;
        this.f13418q = f13;
        this.f13419r = f14;
        this.f13420s = f15;
        this.f13421t = f16;
        this.f13422u = f17;
        this.f13423v = f18;
        this.f13424w = f19;
        this.f13425x = j10;
        this.f13426y = g2Var;
        this.f13427z = z10;
        this.f13411A = j11;
        this.f13412B = j12;
        this.f13413C = i10;
        this.f13414D = new a(this);
    }

    public final void g(b2 b2Var) {
    }
}
