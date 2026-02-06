package u0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import c1.d;
import c1.r;
import c1.s;
import c1.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;
import q0.C2422h;
import q0.C2427m;
import r0.C2446G;
import r0.C2448H;
import r0.C2490f0;
import r0.C2520p0;
import r0.C2523q0;
import r0.C2544x0;
import r0.C2547y0;
import r0.C2550z0;
import r0.b2;
import t0.C2600a;
import t0.C2603d;
import u0.C2672b;
import x.C2877p;
import yf.C6798l;

public final class D implements C2674d {

    /* renamed from: A  reason: collision with root package name */
    private boolean f26377A;

    /* renamed from: B  reason: collision with root package name */
    private int f26378B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f26379C;

    /* renamed from: b  reason: collision with root package name */
    private final long f26380b;

    /* renamed from: c  reason: collision with root package name */
    private final C2523q0 f26381c;

    /* renamed from: d  reason: collision with root package name */
    private final C2600a f26382d;

    /* renamed from: e  reason: collision with root package name */
    private final RenderNode f26383e;

    /* renamed from: f  reason: collision with root package name */
    private long f26384f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f26385g;

    /* renamed from: h  reason: collision with root package name */
    private Matrix f26386h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f26387i;

    /* renamed from: j  reason: collision with root package name */
    private float f26388j;

    /* renamed from: k  reason: collision with root package name */
    private int f26389k;

    /* renamed from: l  reason: collision with root package name */
    private C2547y0 f26390l;

    /* renamed from: m  reason: collision with root package name */
    private long f26391m;

    /* renamed from: n  reason: collision with root package name */
    private float f26392n;

    /* renamed from: o  reason: collision with root package name */
    private float f26393o;

    /* renamed from: p  reason: collision with root package name */
    private float f26394p;

    /* renamed from: q  reason: collision with root package name */
    private float f26395q;

    /* renamed from: r  reason: collision with root package name */
    private float f26396r;

    /* renamed from: s  reason: collision with root package name */
    private long f26397s;

    /* renamed from: t  reason: collision with root package name */
    private long f26398t;

    /* renamed from: u  reason: collision with root package name */
    private float f26399u;

    /* renamed from: v  reason: collision with root package name */
    private float f26400v;

    /* renamed from: w  reason: collision with root package name */
    private float f26401w;

    /* renamed from: x  reason: collision with root package name */
    private float f26402x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f26403y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f26404z;

    public D(long j10, C2523q0 q0Var, C2600a aVar) {
        this.f26380b = j10;
        this.f26381c = q0Var;
        this.f26382d = aVar;
        RenderNode a10 = C2877p.a("graphicsLayer");
        this.f26383e = a10;
        this.f26384f = C2427m.f25341b.b();
        boolean unused = a10.setClipToBounds(false);
        C2672b.a aVar2 = C2672b.f26472a;
        P(a10, aVar2.a());
        this.f26388j = 1.0f;
        this.f26389k = C2490f0.f25500a.B();
        this.f26391m = C2421g.f25320b.b();
        this.f26392n = 1.0f;
        this.f26393o = 1.0f;
        C2544x0.a aVar3 = C2544x0.f25560b;
        this.f26397s = aVar3.a();
        this.f26398t = aVar3.a();
        this.f26402x = 8.0f;
        this.f26378B = aVar2.a();
        this.f26379C = true;
    }

    private final void O() {
        boolean z10;
        boolean z11 = false;
        if (!Q() || this.f26387i) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (Q() && this.f26387i) {
            z11 = true;
        }
        if (z10 != this.f26404z) {
            this.f26404z = z10;
            boolean unused = this.f26383e.setClipToBounds(z10);
        }
        if (z11 != this.f26377A) {
            this.f26377A = z11;
            boolean unused2 = this.f26383e.setClipToOutline(z11);
        }
    }

    private final void P(RenderNode renderNode, int i10) {
        C2672b.a aVar = C2672b.f26472a;
        if (C2672b.e(i10, aVar.c())) {
            boolean unused = renderNode.setUseCompositingLayer(true, this.f26385g);
            boolean unused2 = renderNode.setHasOverlappingRendering(true);
        } else if (C2672b.e(i10, aVar.b())) {
            boolean unused3 = renderNode.setUseCompositingLayer(false, this.f26385g);
            boolean unused4 = renderNode.setHasOverlappingRendering(false);
        } else {
            boolean unused5 = renderNode.setUseCompositingLayer(false, this.f26385g);
            boolean unused6 = renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean R() {
        if (C2672b.e(o(), C2672b.f26472a.c()) || S()) {
            return true;
        }
        d();
        return false;
    }

    private final boolean S() {
        if (!C2490f0.E(e(), C2490f0.f25500a.B()) || b() != null) {
            return true;
        }
        return false;
    }

    private final void T() {
        if (R()) {
            P(this.f26383e, C2672b.f26472a.c());
        } else {
            P(this.f26383e, o());
        }
    }

    public float A() {
        return this.f26392n;
    }

    public long B() {
        return this.f26398t;
    }

    public void C(float f10) {
        this.f26396r = f10;
        boolean unused = this.f26383e.setElevation(f10);
    }

    public Matrix D() {
        Matrix matrix = this.f26386h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f26386h = matrix;
        }
        this.f26383e.getMatrix(matrix);
        return matrix;
    }

    public void E(boolean z10) {
        this.f26379C = z10;
    }

    public float F() {
        return this.f26395q;
    }

    public void G(Outline outline, long j10) {
        boolean z10;
        boolean unused = this.f26383e.setOutline(outline);
        if (outline != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26387i = z10;
        O();
    }

    public float H() {
        return this.f26394p;
    }

    public float I() {
        return this.f26399u;
    }

    public float J() {
        return this.f26393o;
    }

    public void K(long j10) {
        this.f26391m = j10;
        if (C2422h.d(j10)) {
            boolean unused = this.f26383e.resetPivot();
            return;
        }
        boolean unused2 = this.f26383e.setPivotX(C2421g.m(j10));
        boolean unused3 = this.f26383e.setPivotY(C2421g.n(j10));
    }

    public void L(int i10) {
        this.f26378B = i10;
        T();
    }

    /* JADX INFO: finally extract failed */
    public void M(d dVar, t tVar, C2673c cVar, C6798l lVar) {
        RecordingCanvas a10 = this.f26383e.beginRecording();
        try {
            C2523q0 q0Var = this.f26381c;
            Canvas a11 = q0Var.a().a();
            q0Var.a().z(a10);
            C2446G a12 = q0Var.a();
            C2603d w12 = this.f26382d.w1();
            w12.b(dVar);
            w12.a(tVar);
            w12.g(cVar);
            w12.h(this.f26384f);
            w12.c(a12);
            lVar.invoke(this.f26382d);
            q0Var.a().z(a11);
            this.f26383e.endRecording();
            E(false);
        } catch (Throwable th2) {
            this.f26383e.endRecording();
            throw th2;
        }
    }

    public float N() {
        return this.f26396r;
    }

    public boolean Q() {
        return this.f26403y;
    }

    public float a() {
        return this.f26388j;
    }

    public C2547y0 b() {
        return this.f26390l;
    }

    public void c(float f10) {
        this.f26388j = f10;
        boolean unused = this.f26383e.setAlpha(f10);
    }

    public b2 d() {
        return null;
    }

    public int e() {
        return this.f26389k;
    }

    public void f(float f10) {
        this.f26395q = f10;
        boolean unused = this.f26383e.setTranslationY(f10);
    }

    public void g(b2 b2Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            Q.f26451a.a(this.f26383e, b2Var);
        }
    }

    public void h(float f10) {
        this.f26392n = f10;
        boolean unused = this.f26383e.setScaleX(f10);
    }

    public void i(float f10) {
        this.f26402x = f10;
        boolean unused = this.f26383e.setCameraDistance(f10);
    }

    public void j(float f10) {
        this.f26399u = f10;
        boolean unused = this.f26383e.setRotationX(f10);
    }

    public void k(float f10) {
        this.f26400v = f10;
        boolean unused = this.f26383e.setRotationY(f10);
    }

    public void l(float f10) {
        this.f26401w = f10;
        boolean unused = this.f26383e.setRotationZ(f10);
    }

    public void m(float f10) {
        this.f26393o = f10;
        boolean unused = this.f26383e.setScaleY(f10);
    }

    public void n(float f10) {
        this.f26394p = f10;
        boolean unused = this.f26383e.setTranslationX(f10);
    }

    public int o() {
        return this.f26378B;
    }

    public void p() {
        this.f26383e.discardDisplayList();
    }

    public void q(C2520p0 p0Var) {
        C2448H.d(p0Var).drawRenderNode(this.f26383e);
    }

    public float r() {
        return this.f26400v;
    }

    public boolean s() {
        return this.f26383e.hasDisplayList();
    }

    public float t() {
        return this.f26401w;
    }

    public void u(int i10, int i11, long j10) {
        boolean unused = this.f26383e.setPosition(i10, i11, r.g(j10) + i10, r.f(j10) + i11);
        this.f26384f = s.d(j10);
    }

    public void v(long j10) {
        this.f26397s = j10;
        boolean unused = this.f26383e.setAmbientShadowColor(C2550z0.k(j10));
    }

    public float w() {
        return this.f26402x;
    }

    public long x() {
        return this.f26397s;
    }

    public void y(boolean z10) {
        this.f26403y = z10;
        O();
    }

    public void z(long j10) {
        this.f26398t = j10;
        boolean unused = this.f26383e.setSpotShadowColor(C2550z0.k(j10));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(long j10, C2523q0 q0Var, C2600a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? new C2523q0() : q0Var, (i10 & 4) != 0 ? new C2600a() : aVar);
    }
}
