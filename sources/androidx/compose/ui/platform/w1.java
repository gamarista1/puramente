package androidx.compose.ui.platform;

import J0.l0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.graphics.f;
import c1.n;
import c1.r;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q0.C2419e;
import q0.C2421g;
import r0.C2446G;
import r0.C2520p0;
import r0.C2523q0;
import r0.C2550z0;
import r0.M1;
import r0.S1;
import r0.a2;
import r0.b2;
import u0.C2673c;
import yf.C6787a;
import yf.p;

public final class w1 extends View implements l0 {

    /* renamed from: p  reason: collision with root package name */
    public static final c f13987p = new c((DefaultConstructorMarker) null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f13988q = 8;

    /* renamed from: r  reason: collision with root package name */
    private static final p f13989r = b.f14010a;

    /* renamed from: s  reason: collision with root package name */
    private static final ViewOutlineProvider f13990s = new a();
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static Method f13991t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static Field f13992u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static boolean f13993v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public static boolean f13994w;

    /* renamed from: a  reason: collision with root package name */
    private final r f13995a;

    /* renamed from: b  reason: collision with root package name */
    private final C1660r0 f13996b;

    /* renamed from: c  reason: collision with root package name */
    private p f13997c;

    /* renamed from: d  reason: collision with root package name */
    private C6787a f13998d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final K0 f13999e = new K0();

    /* renamed from: f  reason: collision with root package name */
    private boolean f14000f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f14001g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f14002h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14003i;

    /* renamed from: j  reason: collision with root package name */
    private final C2523q0 f14004j = new C2523q0();

    /* renamed from: k  reason: collision with root package name */
    private final F0 f14005k = new F0(f13989r);

    /* renamed from: l  reason: collision with root package name */
    private long f14006l = f.f13431b.a();

    /* renamed from: m  reason: collision with root package name */
    private boolean f14007m = true;

    /* renamed from: n  reason: collision with root package name */
    private final long f14008n;

    /* renamed from: o  reason: collision with root package name */
    private int f14009o;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            C6496s.f(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline b10 = ((w1) view).f13999e.b();
            C6496s.e(b10);
            outline.set(b10);
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14010a = new b();

        b() {
            super(2);
        }

        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((View) obj, (Matrix) obj2);
            return C6514M.f71813a;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return w1.f13993v;
        }

        public final boolean b() {
            return w1.f13994w;
        }

        public final void c(boolean z10) {
            w1.f13994w = z10;
        }

        public final void d(View view) {
            Class<String> cls = String.class;
            Class<Class> cls2 = Class.class;
            try {
                if (!a()) {
                    w1.f13993v = true;
                    Class<View> cls3 = View.class;
                    if (Build.VERSION.SDK_INT < 28) {
                        w1.f13991t = cls3.getDeclaredMethod("updateDisplayListIfDirty", (Class[]) null);
                        w1.f13992u = cls3.getDeclaredField("mRecreateDisplayList");
                    } else {
                        w1.f13991t = (Method) cls2.getDeclaredMethod("getDeclaredMethod", new Class[]{cls, new Class[0].getClass()}).invoke(cls3, new Object[]{"updateDisplayListIfDirty", new Class[0]});
                        w1.f13992u = (Field) cls2.getDeclaredMethod("getDeclaredField", new Class[]{cls}).invoke(cls3, new Object[]{"mRecreateDisplayList"});
                    }
                    Method p10 = w1.f13991t;
                    if (p10 != null) {
                        p10.setAccessible(true);
                    }
                    Field n10 = w1.f13992u;
                    if (n10 != null) {
                        n10.setAccessible(true);
                    }
                }
                Field n11 = w1.f13992u;
                if (n11 != null) {
                    n11.setBoolean(view, true);
                }
                Method p11 = w1.f13991t;
                if (p11 != null) {
                    p11.invoke(view, (Object[]) null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        private c() {
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f14011a = new d();

        private d() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public w1(r rVar, C1660r0 r0Var, p pVar, C6787a aVar) {
        super(rVar.getContext());
        this.f13995a = rVar;
        this.f13996b = r0Var;
        this.f13997c = pVar;
        this.f13998d = aVar;
        setWillNotDraw(false);
        r0Var.addView(this);
        this.f14008n = (long) View.generateViewId();
    }

    private final S1 getManualClipPath() {
        if (!getClipToOutline() || this.f13999e.e()) {
            return null;
        }
        return this.f13999e.d();
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f14002h) {
            this.f14002h = z10;
            this.f13995a.z0(this, z10);
        }
    }

    private final void v() {
        Rect rect;
        if (this.f14000f) {
            Rect rect2 = this.f14001g;
            if (rect2 == null) {
                this.f14001g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                C6496s.e(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f14001g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void w() {
        ViewOutlineProvider viewOutlineProvider;
        if (this.f13999e.b() != null) {
            viewOutlineProvider = f13990s;
        } else {
            viewOutlineProvider = null;
        }
        setOutlineProvider(viewOutlineProvider);
    }

    public void a(float[] fArr) {
        M1.n(fArr, this.f14005k.b(this));
    }

    public void b(C2419e eVar, boolean z10) {
        if (z10) {
            float[] a10 = this.f14005k.a(this);
            if (a10 != null) {
                M1.g(a10, eVar);
            } else {
                eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
            }
        } else {
            M1.g(this.f14005k.b(this), eVar);
        }
    }

    public long c(long j10, boolean z10) {
        if (!z10) {
            return M1.f(this.f14005k.b(this), j10);
        }
        float[] a10 = this.f14005k.a(this);
        if (a10 != null) {
            return M1.f(a10, j10);
        }
        return C2421g.f25320b.a();
    }

    public void d(long j10) {
        int g10 = r.g(j10);
        int f10 = r.f(j10);
        if (g10 != getWidth() || f10 != getHeight()) {
            setPivotX(f.f(this.f14006l) * ((float) g10));
            setPivotY(f.g(this.f14006l) * ((float) f10));
            w();
            layout(getLeft(), getTop(), getLeft() + g10, getTop() + f10);
            v();
            this.f14005k.c();
        }
    }

    public void destroy() {
        setInvalidated(false);
        this.f13995a.K0();
        this.f13997c = null;
        this.f13998d = null;
        this.f13995a.I0(this);
        this.f13996b.removeViewInLayout(this);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        C2523q0 q0Var = this.f14004j;
        Canvas a10 = q0Var.a().a();
        q0Var.a().z(canvas);
        C2446G a11 = q0Var.a();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            a11.q();
            this.f13999e.a(a11);
            z10 = true;
        } else {
            z10 = false;
        }
        p pVar = this.f13997c;
        if (pVar != null) {
            pVar.invoke(a11, (Object) null);
        }
        if (z10) {
            a11.h();
        }
        q0Var.a().z(a10);
        setInvalidated(false);
    }

    public void e(p pVar, C6787a aVar) {
        this.f13996b.addView(this);
        this.f14000f = false;
        this.f14003i = false;
        this.f14006l = f.f13431b.a();
        this.f13997c = pVar;
        this.f13998d = aVar;
    }

    public boolean f(long j10) {
        float m10 = C2421g.m(j10);
        float n10 = C2421g.n(j10);
        if (this.f14000f) {
            if (0.0f > m10 || m10 >= ((float) getWidth()) || 0.0f > n10 || n10 >= ((float) getHeight())) {
                return false;
            }
            return true;
        } else if (getClipToOutline()) {
            return this.f13999e.f(j10);
        } else {
            return true;
        }
    }

    public void forceLayout() {
    }

    public void g(androidx.compose.ui.graphics.d dVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        C6787a aVar;
        boolean z13;
        int x10 = dVar.x() | this.f14009o;
        if ((x10 & 4096) != 0) {
            long B02 = dVar.B0();
            this.f14006l = B02;
            setPivotX(f.f(B02) * ((float) getWidth()));
            setPivotY(f.g(this.f14006l) * ((float) getHeight()));
        }
        if ((x10 & 1) != 0) {
            setScaleX(dVar.A());
        }
        if ((x10 & 2) != 0) {
            setScaleY(dVar.J());
        }
        if ((x10 & 4) != 0) {
            setAlpha(dVar.a());
        }
        if ((x10 & 8) != 0) {
            setTranslationX(dVar.H());
        }
        if ((x10 & 16) != 0) {
            setTranslationY(dVar.F());
        }
        if ((x10 & 32) != 0) {
            setElevation(dVar.G());
        }
        if ((x10 & 1024) != 0) {
            setRotation(dVar.t());
        }
        if ((x10 & 256) != 0) {
            setRotationX(dVar.I());
        }
        if ((x10 & 512) != 0) {
            setRotationY(dVar.r());
        }
        if ((x10 & 2048) != 0) {
            setCameraDistancePx(dVar.w());
        }
        boolean z14 = false;
        if (getManualClipPath() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!dVar.o() || dVar.L() == a2.a()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((x10 & 24576) != 0) {
            if (!dVar.o() || dVar.L() != a2.a()) {
                z13 = false;
            } else {
                z13 = true;
            }
            this.f14000f = z13;
            v();
            setClipToOutline(z11);
        }
        boolean h10 = this.f13999e.h(dVar.B(), dVar.a(), z11, dVar.G(), dVar.d());
        if (this.f13999e.c()) {
            w();
        }
        if (getManualClipPath() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12 || (z12 && h10)) {
            invalidate();
        }
        if (!this.f14003i && getElevation() > 0.0f && (aVar = this.f13998d) != null) {
            aVar.invoke();
        }
        if ((x10 & 7963) != 0) {
            this.f14005k.c();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if ((x10 & 64) != 0) {
                y1.f14092a.a(this, C2550z0.k(dVar.e()));
            }
            if ((x10 & 128) != 0) {
                y1.f14092a.b(this, C2550z0.k(dVar.O()));
            }
        }
        if (i10 >= 31 && (131072 & x10) != 0) {
            z1 z1Var = z1.f14097a;
            dVar.D();
            z1Var.a(this, (b2) null);
        }
        if ((x10 & 32768) != 0) {
            int p10 = dVar.p();
            a.C0255a aVar2 = androidx.compose.ui.graphics.a.f13386a;
            if (androidx.compose.ui.graphics.a.e(p10, aVar2.c())) {
                setLayerType(2, (Paint) null);
            } else if (androidx.compose.ui.graphics.a.e(p10, aVar2.b())) {
                setLayerType(0, (Paint) null);
                this.f14007m = z14;
            } else {
                setLayerType(0, (Paint) null);
            }
            z14 = true;
            this.f14007m = z14;
        }
        this.f14009o = dVar.x();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final C1660r0 getContainer() {
        return this.f13996b;
    }

    public long getLayerId() {
        return this.f14008n;
    }

    public final r getOwnerView() {
        return this.f13995a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.f13995a);
        }
        return -1;
    }

    public void h(C2520p0 p0Var, C2673c cVar) {
        boolean z10;
        if (getElevation() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14003i = z10;
        if (z10) {
            p0Var.n();
        }
        this.f13996b.a(p0Var, this, getDrawingTime());
        if (this.f14003i) {
            p0Var.r();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f14007m;
    }

    public void i(float[] fArr) {
        float[] a10 = this.f14005k.a(this);
        if (a10 != null) {
            M1.n(fArr, a10);
        }
    }

    public void invalidate() {
        if (!this.f14002h) {
            setInvalidated(true);
            super.invalidate();
            this.f13995a.invalidate();
        }
    }

    public void j(long j10) {
        int j11 = n.j(j10);
        if (j11 != getLeft()) {
            offsetLeftAndRight(j11 - getLeft());
            this.f14005k.c();
        }
        int k10 = n.k(j10);
        if (k10 != getTop()) {
            offsetTopAndBottom(k10 - getTop());
            this.f14005k.c();
        }
    }

    public void k() {
        if (this.f14002h && !f13994w) {
            f13987p.d(this);
            setInvalidated(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * ((float) getResources().getDisplayMetrics().densityDpi));
    }

    public final boolean u() {
        return this.f14002h;
    }
}
