package u0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import c1.d;
import c1.r;
import c1.s;
import c1.t;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;
import q0.C2422h;
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
import yf.C6798l;

/* renamed from: u0.f  reason: case insensitive filesystem */
public final class C2676f implements C2674d {

    /* renamed from: F  reason: collision with root package name */
    public static final a f26507F = new a((DefaultConstructorMarker) null);

    /* renamed from: G  reason: collision with root package name */
    private static boolean f26508G;

    /* renamed from: H  reason: collision with root package name */
    private static final AtomicBoolean f26509H = new AtomicBoolean(true);

    /* renamed from: A  reason: collision with root package name */
    private float f26510A;

    /* renamed from: B  reason: collision with root package name */
    private boolean f26511B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f26512C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f26513D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f26514E;

    /* renamed from: b  reason: collision with root package name */
    private final long f26515b;

    /* renamed from: c  reason: collision with root package name */
    private final C2523q0 f26516c;

    /* renamed from: d  reason: collision with root package name */
    private final C2600a f26517d;

    /* renamed from: e  reason: collision with root package name */
    private final RenderNode f26518e;

    /* renamed from: f  reason: collision with root package name */
    private long f26519f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f26520g;

    /* renamed from: h  reason: collision with root package name */
    private Matrix f26521h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f26522i;

    /* renamed from: j  reason: collision with root package name */
    private long f26523j;

    /* renamed from: k  reason: collision with root package name */
    private int f26524k;

    /* renamed from: l  reason: collision with root package name */
    private int f26525l;

    /* renamed from: m  reason: collision with root package name */
    private C2547y0 f26526m;

    /* renamed from: n  reason: collision with root package name */
    private float f26527n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f26528o;

    /* renamed from: p  reason: collision with root package name */
    private long f26529p;

    /* renamed from: q  reason: collision with root package name */
    private float f26530q;

    /* renamed from: r  reason: collision with root package name */
    private float f26531r;

    /* renamed from: s  reason: collision with root package name */
    private float f26532s;

    /* renamed from: t  reason: collision with root package name */
    private float f26533t;

    /* renamed from: u  reason: collision with root package name */
    private float f26534u;

    /* renamed from: v  reason: collision with root package name */
    private long f26535v;

    /* renamed from: w  reason: collision with root package name */
    private long f26536w;

    /* renamed from: x  reason: collision with root package name */
    private float f26537x;

    /* renamed from: y  reason: collision with root package name */
    private float f26538y;

    /* renamed from: z  reason: collision with root package name */
    private float f26539z;

    /* renamed from: u0.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C2676f(View view, long j10, C2523q0 q0Var, C2600a aVar) {
        this.f26515b = j10;
        this.f26516c = q0Var;
        this.f26517d = aVar;
        RenderNode create = RenderNode.create("Compose", view);
        this.f26518e = create;
        r.a aVar2 = r.f19235b;
        this.f26519f = aVar2.a();
        this.f26523j = aVar2.a();
        if (f26509H.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            U(create);
            Q();
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        if (!f26508G) {
            create.setClipToBounds(false);
            C2672b.a aVar3 = C2672b.f26472a;
            P(aVar3.a());
            this.f26524k = aVar3.a();
            this.f26525l = C2490f0.f25500a.B();
            this.f26527n = 1.0f;
            this.f26529p = C2421g.f25320b.b();
            this.f26530q = 1.0f;
            this.f26531r = 1.0f;
            C2544x0.a aVar4 = C2544x0.f25560b;
            this.f26535v = aVar4.a();
            this.f26536w = aVar4.a();
            this.f26510A = 8.0f;
            this.f26514E = true;
            return;
        }
        throw new NoClassDefFoundError();
    }

    private final void O() {
        boolean z10;
        boolean z11 = false;
        if (!R() || this.f26522i) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (R() && this.f26522i) {
            z11 = true;
        }
        if (z10 != this.f26512C) {
            this.f26512C = z10;
            this.f26518e.setClipToBounds(z10);
        }
        if (z11 != this.f26513D) {
            this.f26513D = z11;
            this.f26518e.setClipToOutline(z11);
        }
    }

    private final void P(int i10) {
        RenderNode renderNode = this.f26518e;
        C2672b.a aVar = C2672b.f26472a;
        if (C2672b.e(i10, aVar.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f26520g);
            renderNode.setHasOverlappingRendering(true);
        } else if (C2672b.e(i10, aVar.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f26520g);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f26520g);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final boolean S() {
        if (C2672b.e(o(), C2672b.f26472a.c()) || !C2490f0.E(e(), C2490f0.f25500a.B()) || b() != null) {
            return true;
        }
        return false;
    }

    private final void T() {
        if (S()) {
            P(C2672b.f26472a.c());
        } else {
            P(o());
        }
    }

    private final void U(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            P p10 = P.f26450a;
            p10.c(renderNode, p10.a(renderNode));
            p10.d(renderNode, p10.b(renderNode));
        }
    }

    public float A() {
        return this.f26530q;
    }

    public long B() {
        return this.f26536w;
    }

    public void C(float f10) {
        this.f26534u = f10;
        this.f26518e.setElevation(f10);
    }

    public Matrix D() {
        Matrix matrix = this.f26521h;
        if (matrix == null) {
            matrix = new Matrix();
            this.f26521h = matrix;
        }
        this.f26518e.getMatrix(matrix);
        return matrix;
    }

    public void E(boolean z10) {
        this.f26514E = z10;
    }

    public float F() {
        return this.f26533t;
    }

    public void G(Outline outline, long j10) {
        boolean z10;
        this.f26523j = j10;
        this.f26518e.setOutline(outline);
        if (outline != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f26522i = z10;
        O();
    }

    public float H() {
        return this.f26532s;
    }

    public float I() {
        return this.f26537x;
    }

    public float J() {
        return this.f26531r;
    }

    public void K(long j10) {
        this.f26529p = j10;
        if (C2422h.d(j10)) {
            this.f26528o = true;
            this.f26518e.setPivotX(((float) r.g(this.f26519f)) / 2.0f);
            this.f26518e.setPivotY(((float) r.f(this.f26519f)) / 2.0f);
            return;
        }
        this.f26528o = false;
        this.f26518e.setPivotX(C2421g.m(j10));
        this.f26518e.setPivotY(C2421g.n(j10));
    }

    public void L(int i10) {
        this.f26524k = i10;
        T();
    }

    public void M(d dVar, t tVar, C2673c cVar, C6798l lVar) {
        C2446G a10;
        C2600a aVar;
        d density;
        t layoutDirection;
        C2520p0 f10;
        long d10;
        C2673c i10;
        Canvas start = this.f26518e.start(Math.max(r.g(this.f26519f), r.g(this.f26523j)), Math.max(r.f(this.f26519f), r.f(this.f26523j)));
        try {
            C2523q0 q0Var = this.f26516c;
            Canvas a11 = q0Var.a().a();
            q0Var.a().z(start);
            a10 = q0Var.a();
            aVar = this.f26517d;
            long d11 = s.d(this.f26519f);
            density = aVar.w1().getDensity();
            layoutDirection = aVar.w1().getLayoutDirection();
            f10 = aVar.w1().f();
            d10 = aVar.w1().d();
            i10 = aVar.w1().i();
            C2603d w12 = aVar.w1();
            w12.b(dVar);
            w12.a(tVar);
            w12.c(a10);
            w12.h(d11);
            w12.g(cVar);
            a10.q();
            lVar.invoke(aVar);
            a10.h();
            C2603d w13 = aVar.w1();
            w13.b(density);
            w13.a(layoutDirection);
            w13.c(f10);
            w13.h(d10);
            w13.g(i10);
            q0Var.a().z(a11);
            this.f26518e.end(start);
            E(false);
        } catch (Throwable th2) {
            this.f26518e.end(start);
            throw th2;
        }
    }

    public float N() {
        return this.f26534u;
    }

    public final void Q() {
        O.f26449a.a(this.f26518e);
    }

    public boolean R() {
        return this.f26511B;
    }

    public float a() {
        return this.f26527n;
    }

    public C2547y0 b() {
        return this.f26526m;
    }

    public void c(float f10) {
        this.f26527n = f10;
        this.f26518e.setAlpha(f10);
    }

    public b2 d() {
        return null;
    }

    public int e() {
        return this.f26525l;
    }

    public void f(float f10) {
        this.f26533t = f10;
        this.f26518e.setTranslationY(f10);
    }

    public void h(float f10) {
        this.f26530q = f10;
        this.f26518e.setScaleX(f10);
    }

    public void i(float f10) {
        this.f26510A = f10;
        this.f26518e.setCameraDistance(-f10);
    }

    public void j(float f10) {
        this.f26537x = f10;
        this.f26518e.setRotationX(f10);
    }

    public void k(float f10) {
        this.f26538y = f10;
        this.f26518e.setRotationY(f10);
    }

    public void l(float f10) {
        this.f26539z = f10;
        this.f26518e.setRotation(f10);
    }

    public void m(float f10) {
        this.f26531r = f10;
        this.f26518e.setScaleY(f10);
    }

    public void n(float f10) {
        this.f26532s = f10;
        this.f26518e.setTranslationX(f10);
    }

    public int o() {
        return this.f26524k;
    }

    public void p() {
        Q();
    }

    public void q(C2520p0 p0Var) {
        DisplayListCanvas d10 = C2448H.d(p0Var);
        C6496s.f(d10, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        d10.drawRenderNode(this.f26518e);
    }

    public float r() {
        return this.f26538y;
    }

    public boolean s() {
        return this.f26518e.isValid();
    }

    public float t() {
        return this.f26539z;
    }

    public void u(int i10, int i11, long j10) {
        this.f26518e.setLeftTopRightBottom(i10, i11, r.g(j10) + i10, r.f(j10) + i11);
        if (!r.e(this.f26519f, j10)) {
            if (this.f26528o) {
                this.f26518e.setPivotX(((float) r.g(j10)) / 2.0f);
                this.f26518e.setPivotY(((float) r.f(j10)) / 2.0f);
            }
            this.f26519f = j10;
        }
    }

    public void v(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f26535v = j10;
            P.f26450a.c(this.f26518e, C2550z0.k(j10));
        }
    }

    public float w() {
        return this.f26510A;
    }

    public long x() {
        return this.f26535v;
    }

    public void y(boolean z10) {
        this.f26511B = z10;
        O();
    }

    public void z(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f26536w = j10;
            P.f26450a.d(this.f26518e, C2550z0.k(j10));
        }
    }

    public void g(b2 b2Var) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2676f(View view, long j10, C2523q0 q0Var, C2600a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j10, (i10 & 4) != 0 ? new C2523q0() : q0Var, (i10 & 8) != 0 ? new C2600a() : aVar);
    }
}
