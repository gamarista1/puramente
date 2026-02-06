package u0;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import c1.d;
import c1.r;
import c1.s;
import c1.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
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
import u0.C2672b;
import v0.C2744a;
import yf.C6798l;

public final class E implements C2674d {

    /* renamed from: J  reason: collision with root package name */
    public static final b f26405J = new b((DefaultConstructorMarker) null);

    /* renamed from: K  reason: collision with root package name */
    private static final boolean f26406K = (!S.f26452a.a());

    /* renamed from: L  reason: collision with root package name */
    private static final Canvas f26407L = new a();

    /* renamed from: A  reason: collision with root package name */
    private float f26408A;

    /* renamed from: B  reason: collision with root package name */
    private float f26409B;

    /* renamed from: C  reason: collision with root package name */
    private float f26410C;

    /* renamed from: D  reason: collision with root package name */
    private float f26411D;

    /* renamed from: E  reason: collision with root package name */
    private long f26412E;

    /* renamed from: F  reason: collision with root package name */
    private long f26413F;

    /* renamed from: G  reason: collision with root package name */
    private float f26414G;

    /* renamed from: H  reason: collision with root package name */
    private float f26415H;

    /* renamed from: I  reason: collision with root package name */
    private float f26416I;

    /* renamed from: b  reason: collision with root package name */
    private final C2744a f26417b;

    /* renamed from: c  reason: collision with root package name */
    private final long f26418c;

    /* renamed from: d  reason: collision with root package name */
    private final C2523q0 f26419d;

    /* renamed from: e  reason: collision with root package name */
    private final T f26420e;

    /* renamed from: f  reason: collision with root package name */
    private final Resources f26421f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f26422g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f26423h;

    /* renamed from: i  reason: collision with root package name */
    private final Picture f26424i;

    /* renamed from: j  reason: collision with root package name */
    private final C2600a f26425j;

    /* renamed from: k  reason: collision with root package name */
    private final C2523q0 f26426k;

    /* renamed from: l  reason: collision with root package name */
    private int f26427l;

    /* renamed from: m  reason: collision with root package name */
    private int f26428m;

    /* renamed from: n  reason: collision with root package name */
    private long f26429n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f26430o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f26431p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f26432q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f26433r;

    /* renamed from: s  reason: collision with root package name */
    private final long f26434s;

    /* renamed from: t  reason: collision with root package name */
    private int f26435t;

    /* renamed from: u  reason: collision with root package name */
    private C2547y0 f26436u;

    /* renamed from: v  reason: collision with root package name */
    private int f26437v;

    /* renamed from: w  reason: collision with root package name */
    private float f26438w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f26439x;

    /* renamed from: y  reason: collision with root package name */
    private long f26440y;

    /* renamed from: z  reason: collision with root package name */
    private float f26441z;

    public static final class a extends Canvas {
        a() {
        }

        public boolean isHardwareAccelerated() {
            return true;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public E(C2744a aVar, long j10, C2523q0 q0Var, C2600a aVar2) {
        this.f26417b = aVar;
        this.f26418c = j10;
        this.f26419d = q0Var;
        T t10 = new T(aVar, q0Var, aVar2);
        this.f26420e = t10;
        this.f26421f = aVar.getResources();
        this.f26422g = new Rect();
        boolean z10 = f26406K;
        this.f26424i = z10 ? new Picture() : null;
        this.f26425j = z10 ? new C2600a() : null;
        this.f26426k = z10 ? new C2523q0() : null;
        aVar.addView(t10);
        t10.setClipBounds((Rect) null);
        this.f26429n = r.f19235b.a();
        this.f26431p = true;
        this.f26434s = (long) View.generateViewId();
        this.f26435t = C2490f0.f25500a.B();
        this.f26437v = C2672b.f26472a.a();
        this.f26438w = 1.0f;
        this.f26440y = C2421g.f25320b.c();
        this.f26441z = 1.0f;
        this.f26408A = 1.0f;
        C2544x0.a aVar3 = C2544x0.f25560b;
        this.f26412E = aVar3.a();
        this.f26413F = aVar3.a();
    }

    private final void O(int i10) {
        T t10 = this.f26420e;
        C2672b.a aVar = C2672b.f26472a;
        boolean z10 = true;
        if (C2672b.e(i10, aVar.c())) {
            this.f26420e.setLayerType(2, this.f26423h);
        } else if (C2672b.e(i10, aVar.b())) {
            this.f26420e.setLayerType(0, this.f26423h);
            z10 = false;
        } else {
            this.f26420e.setLayerType(0, this.f26423h);
        }
        t10.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    private final void Q() {
        try {
            C2523q0 q0Var = this.f26419d;
            Canvas canvas = f26407L;
            Canvas a10 = q0Var.a().a();
            q0Var.a().z(canvas);
            C2446G a11 = q0Var.a();
            C2744a aVar = this.f26417b;
            T t10 = this.f26420e;
            aVar.a(a11, t10, t10.getDrawingTime());
            q0Var.a().z(a10);
        } catch (Throwable unused) {
        }
    }

    private final boolean R() {
        if (C2672b.e(o(), C2672b.f26472a.c()) || S()) {
            return true;
        }
        return false;
    }

    private final boolean S() {
        if (!C2490f0.E(e(), C2490f0.f25500a.B()) || b() != null) {
            return true;
        }
        return false;
    }

    private final void T() {
        Rect rect;
        if (this.f26430o) {
            T t10 = this.f26420e;
            if (!P() || this.f26432q) {
                rect = null;
            } else {
                rect = this.f26422g;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.f26420e.getWidth();
                rect.bottom = this.f26420e.getHeight();
            }
            t10.setClipBounds(rect);
        }
    }

    private final void U() {
        if (R()) {
            O(C2672b.f26472a.c());
        } else {
            O(o());
        }
    }

    public float A() {
        return this.f26441z;
    }

    public long B() {
        return this.f26413F;
    }

    public void C(float f10) {
        this.f26411D = f10;
        this.f26420e.setElevation(f10);
    }

    public Matrix D() {
        return this.f26420e.getMatrix();
    }

    public void E(boolean z10) {
        this.f26431p = z10;
    }

    public float F() {
        return this.f26410C;
    }

    public void G(Outline outline, long j10) {
        boolean c10 = this.f26420e.c(outline);
        boolean z10 = false;
        if (P() && outline != null) {
            this.f26420e.setClipToOutline(true);
            if (this.f26433r) {
                this.f26433r = false;
                this.f26430o = true;
            }
        }
        if (outline != null) {
            z10 = true;
        }
        this.f26432q = z10;
        if (!c10) {
            this.f26420e.invalidate();
            Q();
        }
    }

    public float H() {
        return this.f26409B;
    }

    public float I() {
        return this.f26414G;
    }

    public float J() {
        return this.f26408A;
    }

    public void K(long j10) {
        this.f26440y = j10;
        if (!C2422h.d(j10)) {
            this.f26439x = false;
            this.f26420e.setPivotX(C2421g.m(j10));
            this.f26420e.setPivotY(C2421g.n(j10));
        } else if (Build.VERSION.SDK_INT >= 28) {
            X.f26465a.a(this.f26420e);
        } else {
            this.f26439x = true;
            this.f26420e.setPivotX(((float) r.g(this.f26429n)) / 2.0f);
            this.f26420e.setPivotY(((float) r.f(this.f26429n)) / 2.0f);
        }
    }

    public void L(int i10) {
        this.f26437v = i10;
        U();
    }

    public void M(d dVar, t tVar, C2673c cVar, C6798l lVar) {
        C2523q0 q0Var;
        Canvas canvas;
        d dVar2 = dVar;
        t tVar2 = tVar;
        C6798l lVar2 = lVar;
        if (this.f26420e.getParent() == null) {
            this.f26417b.addView(this.f26420e);
        }
        this.f26420e.b(dVar2, tVar2, cVar, lVar2);
        if (this.f26420e.isAttachedToWindow()) {
            this.f26420e.setVisibility(4);
            this.f26420e.setVisibility(0);
            Q();
            Picture picture = this.f26424i;
            if (picture != null) {
                Canvas beginRecording = picture.beginRecording(r.g(this.f26429n), r.f(this.f26429n));
                try {
                    C2523q0 q0Var2 = this.f26426k;
                    if (q0Var2 != null) {
                        Canvas a10 = q0Var2.a().a();
                        q0Var2.a().z(beginRecording);
                        C2446G a11 = q0Var2.a();
                        C2600a aVar = this.f26425j;
                        if (aVar != null) {
                            long d10 = s.d(this.f26429n);
                            C2600a.C0435a D10 = aVar.D();
                            d a12 = D10.a();
                            t b10 = D10.b();
                            C2520p0 c10 = D10.c();
                            q0Var = q0Var2;
                            canvas = a10;
                            long d11 = D10.d();
                            C2600a.C0435a D11 = aVar.D();
                            D11.j(dVar2);
                            D11.k(tVar2);
                            D11.i(a11);
                            D11.l(d10);
                            a11.q();
                            lVar2.invoke(aVar);
                            a11.h();
                            C2600a.C0435a D12 = aVar.D();
                            D12.j(a12);
                            D12.k(b10);
                            D12.i(c10);
                            D12.l(d11);
                        } else {
                            q0Var = q0Var2;
                            canvas = a10;
                        }
                        q0Var.a().z(canvas);
                        C6514M m10 = C6514M.f71813a;
                    }
                    picture.endRecording();
                } catch (Throwable th2) {
                    picture.endRecording();
                    throw th2;
                }
            }
        }
    }

    public float N() {
        return this.f26411D;
    }

    public boolean P() {
        if (this.f26433r || this.f26420e.getClipToOutline()) {
            return true;
        }
        return false;
    }

    public float a() {
        return this.f26438w;
    }

    public C2547y0 b() {
        return this.f26436u;
    }

    public void c(float f10) {
        this.f26438w = f10;
        this.f26420e.setAlpha(f10);
    }

    public b2 d() {
        return null;
    }

    public int e() {
        return this.f26435t;
    }

    public void f(float f10) {
        this.f26410C = f10;
        this.f26420e.setTranslationY(f10);
    }

    public void g(b2 b2Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            Z.f26466a.a(this.f26420e, b2Var);
        }
    }

    public void h(float f10) {
        this.f26441z = f10;
        this.f26420e.setScaleX(f10);
    }

    public void i(float f10) {
        this.f26420e.setCameraDistance(f10 * ((float) this.f26421f.getDisplayMetrics().densityDpi));
    }

    public void j(float f10) {
        this.f26414G = f10;
        this.f26420e.setRotationX(f10);
    }

    public void k(float f10) {
        this.f26415H = f10;
        this.f26420e.setRotationY(f10);
    }

    public void l(float f10) {
        this.f26416I = f10;
        this.f26420e.setRotation(f10);
    }

    public void m(float f10) {
        this.f26408A = f10;
        this.f26420e.setScaleY(f10);
    }

    public void n(float f10) {
        this.f26409B = f10;
        this.f26420e.setTranslationX(f10);
    }

    public int o() {
        return this.f26437v;
    }

    public void p() {
        this.f26417b.removeViewInLayout(this.f26420e);
    }

    public void q(C2520p0 p0Var) {
        T();
        Canvas d10 = C2448H.d(p0Var);
        if (d10.isHardwareAccelerated()) {
            C2744a aVar = this.f26417b;
            T t10 = this.f26420e;
            aVar.a(p0Var, t10, t10.getDrawingTime());
            return;
        }
        Picture picture = this.f26424i;
        if (picture != null) {
            d10.drawPicture(picture);
        }
    }

    public float r() {
        return this.f26415H;
    }

    public float t() {
        return this.f26416I;
    }

    public void u(int i10, int i11, long j10) {
        if (!r.e(this.f26429n, j10)) {
            if (P()) {
                this.f26430o = true;
            }
            this.f26420e.layout(i10, i11, r.g(j10) + i10, r.f(j10) + i11);
            this.f26429n = j10;
            if (this.f26439x) {
                this.f26420e.setPivotX(((float) r.g(j10)) / 2.0f);
                this.f26420e.setPivotY(((float) r.f(j10)) / 2.0f);
            }
        } else {
            int i12 = this.f26427l;
            if (i12 != i10) {
                this.f26420e.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f26428m;
            if (i13 != i11) {
                this.f26420e.offsetTopAndBottom(i11 - i13);
            }
        }
        this.f26427l = i10;
        this.f26428m = i11;
    }

    public void v(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f26412E = j10;
            X.f26465a.b(this.f26420e, C2550z0.k(j10));
        }
    }

    public float w() {
        return this.f26420e.getCameraDistance() / ((float) this.f26421f.getDisplayMetrics().densityDpi);
    }

    public long x() {
        return this.f26412E;
    }

    public void y(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (!z10 || this.f26432q) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f26433r = z11;
        this.f26430o = true;
        T t10 = this.f26420e;
        if (z10 && this.f26432q) {
            z12 = true;
        }
        t10.setClipToOutline(z12);
    }

    public void z(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f26413F = j10;
            X.f26465a.c(this.f26420e, C2550z0.k(j10));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(C2744a aVar, long j10, C2523q0 q0Var, C2600a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j10, (i10 & 4) != 0 ? new C2523q0() : q0Var, (i10 & 8) != 0 ? new C2600a() : aVar2);
    }
}
