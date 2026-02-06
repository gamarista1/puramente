package u4;

import A4.e;
import A4.h;
import D4.c;
import F4.v;
import H4.f;
import H4.g;
import H4.i;
import H4.k;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v4.C4103a;
import y4.C4185a;
import z4.C4230a;
import z4.C4231b;

public class L extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: m0  reason: collision with root package name */
    private static final boolean f48326m0;

    /* renamed from: n0  reason: collision with root package name */
    private static final List f48327n0 = Arrays.asList(new String[]{"reduced motion", "reduced_motion", "reduced-motion", "reducedmotion"});

    /* renamed from: o0  reason: collision with root package name */
    private static final Executor f48328o0 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new g());

    /* renamed from: A  reason: collision with root package name */
    private Bitmap f48329A;

    /* renamed from: B  reason: collision with root package name */
    private Canvas f48330B;

    /* renamed from: C  reason: collision with root package name */
    private Rect f48331C;

    /* renamed from: D  reason: collision with root package name */
    private RectF f48332D;

    /* renamed from: E  reason: collision with root package name */
    private Paint f48333E;

    /* renamed from: F  reason: collision with root package name */
    private Rect f48334F;

    /* renamed from: G  reason: collision with root package name */
    private Rect f48335G;

    /* renamed from: H  reason: collision with root package name */
    private RectF f48336H;

    /* renamed from: I  reason: collision with root package name */
    private RectF f48337I;

    /* renamed from: X  reason: collision with root package name */
    private Matrix f48338X;

    /* renamed from: Y  reason: collision with root package name */
    private Matrix f48339Y;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f48340Z = false;

    /* renamed from: a  reason: collision with root package name */
    private C4071k f48341a;

    /* renamed from: b  reason: collision with root package name */
    private final i f48342b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f48343c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48344d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f48345e = false;

    /* renamed from: f  reason: collision with root package name */
    private b f48346f = b.NONE;

    /* renamed from: f0  reason: collision with root package name */
    private C4061a f48347f0;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList f48348g = new ArrayList();

    /* renamed from: g0  reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f48349g0;

    /* renamed from: h  reason: collision with root package name */
    private C4231b f48350h;

    /* renamed from: h0  reason: collision with root package name */
    private final Semaphore f48351h0;

    /* renamed from: i  reason: collision with root package name */
    private String f48352i;

    /* renamed from: i0  reason: collision with root package name */
    private Handler f48353i0;

    /* renamed from: j  reason: collision with root package name */
    private C4230a f48354j;

    /* renamed from: j0  reason: collision with root package name */
    private Runnable f48355j0;

    /* renamed from: k  reason: collision with root package name */
    private Map f48356k;

    /* renamed from: k0  reason: collision with root package name */
    private final Runnable f48357k0;

    /* renamed from: l  reason: collision with root package name */
    String f48358l;

    /* renamed from: l0  reason: collision with root package name */
    private float f48359l0;

    /* renamed from: m  reason: collision with root package name */
    C4062b f48360m;

    /* renamed from: n  reason: collision with root package name */
    c0 f48361n;

    /* renamed from: o  reason: collision with root package name */
    private final N f48362o = new N();

    /* renamed from: p  reason: collision with root package name */
    private boolean f48363p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f48364q = true;

    /* renamed from: r  reason: collision with root package name */
    private c f48365r;

    /* renamed from: s  reason: collision with root package name */
    private int f48366s = 255;

    /* renamed from: t  reason: collision with root package name */
    private boolean f48367t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f48368u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f48369v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f48370w = false;

    /* renamed from: x  reason: collision with root package name */
    private a0 f48371x = a0.AUTOMATIC;

    /* renamed from: y  reason: collision with root package name */
    private boolean f48372y = false;

    /* renamed from: z  reason: collision with root package name */
    private final Matrix f48373z = new Matrix();

    private interface a {
        void a(C4071k kVar);
    }

    private enum b {
        NONE,
        PLAY,
        RESUME
    }

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT <= 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        f48326m0 = z10;
    }

    public L() {
        i iVar = new i();
        this.f48342b = iVar;
        F f10 = new F(this);
        this.f48349g0 = f10;
        this.f48351h0 = new Semaphore(1);
        this.f48357k0 = new G(this);
        this.f48359l0 = -3.4028235E38f;
        iVar.addUpdateListener(f10);
    }

    private void C(int i10, int i11) {
        Bitmap bitmap = this.f48329A;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f48329A.getHeight() < i11) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f48329A = createBitmap;
            this.f48330B.setBitmap(createBitmap);
            this.f48340Z = true;
        } else if (this.f48329A.getWidth() > i10 || this.f48329A.getHeight() > i11) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f48329A, 0, 0, i10, i11);
            this.f48329A = createBitmap2;
            this.f48330B.setBitmap(createBitmap2);
            this.f48340Z = true;
        }
    }

    private void D() {
        if (this.f48330B == null) {
            this.f48330B = new Canvas();
            this.f48337I = new RectF();
            this.f48338X = new Matrix();
            this.f48339Y = new Matrix();
            this.f48331C = new Rect();
            this.f48332D = new RectF();
            this.f48333E = new C4103a();
            this.f48334F = new Rect();
            this.f48335G = new Rect();
            this.f48336H = new RectF();
        }
    }

    private void D0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    private Context K() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private C4230a L() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f48354j == null) {
            C4230a aVar = new C4230a(getCallback(), this.f48360m);
            this.f48354j = aVar;
            String str = this.f48358l;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f48354j;
    }

    private C4231b N() {
        C4231b bVar = this.f48350h;
        if (bVar != null && !bVar.b(K())) {
            this.f48350h = null;
        }
        if (this.f48350h == null) {
            this.f48350h = new C4231b(getCallback(), this.f48352i, (C4063c) null, this.f48341a.j());
        }
        return this.f48350h;
    }

    private boolean c0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h0(e eVar, Object obj, I4.c cVar, C4071k kVar) {
        r(eVar, obj, cVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i0(ValueAnimator valueAnimator) {
        if (F()) {
            invalidateSelf();
            return;
        }
        c cVar = this.f48365r;
        if (cVar != null) {
            cVar.N(this.f48342b.l());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j0() {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    private boolean j1() {
        C4071k kVar = this.f48341a;
        if (kVar == null) {
            return false;
        }
        float f10 = this.f48359l0;
        float l10 = this.f48342b.l();
        this.f48359l0 = l10;
        if (Math.abs(l10 - f10) * kVar.d() >= 50.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k0() {
        c cVar = this.f48365r;
        if (cVar != null) {
            try {
                this.f48351h0.acquire();
                cVar.N(this.f48342b.l());
                if (f48326m0 && this.f48340Z) {
                    if (this.f48353i0 == null) {
                        this.f48353i0 = new Handler(Looper.getMainLooper());
                        this.f48355j0 = new C4057B(this);
                    }
                    this.f48353i0.post(this.f48355j0);
                }
            } catch (InterruptedException unused) {
            } catch (Throwable th2) {
                this.f48351h0.release();
                throw th2;
            }
            this.f48351h0.release();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l0(C4071k kVar) {
        y0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m0(C4071k kVar) {
        B0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n0(int i10, C4071k kVar) {
        M0(i10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o0(String str, C4071k kVar) {
        S0(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p0(int i10, C4071k kVar) {
        R0(i10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q0(float f10, C4071k kVar) {
        T0(f10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r0(String str, C4071k kVar) {
        V0(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s0(int i10, int i11, C4071k kVar) {
        U0(i10, i11);
    }

    private void t() {
        C4071k kVar = this.f48341a;
        if (kVar != null) {
            c cVar = new c(this, v.b(kVar), kVar.k(), kVar);
            this.f48365r = cVar;
            if (this.f48368u) {
                cVar.L(true);
            }
            this.f48365r.R(this.f48364q);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void t0(int i10, C4071k kVar) {
        W0(i10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u0(String str, C4071k kVar) {
        X0(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v0(float f10, C4071k kVar) {
        Y0(f10);
    }

    private void w() {
        C4071k kVar = this.f48341a;
        if (kVar != null) {
            this.f48372y = this.f48371x.b(Build.VERSION.SDK_INT, kVar.q(), kVar.m());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w0(float f10, C4071k kVar) {
        b1(f10);
    }

    private void x(Rect rect, RectF rectF) {
        rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    private void y(RectF rectF, Rect rect) {
        rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
    }

    private void z(Canvas canvas) {
        c cVar = this.f48365r;
        C4071k kVar = this.f48341a;
        if (cVar != null && kVar != null) {
            this.f48373z.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                this.f48373z.preScale(((float) bounds.width()) / ((float) kVar.b().width()), ((float) bounds.height()) / ((float) kVar.b().height()));
                this.f48373z.preTranslate((float) bounds.left, (float) bounds.top);
            }
            cVar.h(canvas, this.f48373z, this.f48366s);
        }
    }

    private void z0(Canvas canvas, c cVar) {
        if (this.f48341a != null && cVar != null) {
            D();
            canvas.getMatrix(this.f48338X);
            canvas.getClipBounds(this.f48331C);
            x(this.f48331C, this.f48332D);
            this.f48338X.mapRect(this.f48332D);
            y(this.f48332D, this.f48331C);
            if (this.f48364q) {
                this.f48337I.set(0.0f, 0.0f, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
            } else {
                cVar.f(this.f48337I, (Matrix) null, false);
            }
            this.f48338X.mapRect(this.f48337I);
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) getIntrinsicWidth());
            float height = ((float) bounds.height()) / ((float) getIntrinsicHeight());
            D0(this.f48337I, width, height);
            if (!c0()) {
                RectF rectF = this.f48337I;
                Rect rect = this.f48331C;
                rectF.intersect((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
            }
            int ceil = (int) Math.ceil((double) this.f48337I.width());
            int ceil2 = (int) Math.ceil((double) this.f48337I.height());
            if (ceil > 0 && ceil2 > 0) {
                C(ceil, ceil2);
                if (this.f48340Z) {
                    this.f48373z.set(this.f48338X);
                    this.f48373z.preScale(width, height);
                    Matrix matrix = this.f48373z;
                    RectF rectF2 = this.f48337I;
                    matrix.postTranslate(-rectF2.left, -rectF2.top);
                    this.f48329A.eraseColor(0);
                    cVar.h(this.f48330B, this.f48373z, this.f48366s);
                    this.f48338X.invert(this.f48339Y);
                    this.f48339Y.mapRect(this.f48336H, this.f48337I);
                    y(this.f48336H, this.f48335G);
                }
                this.f48334F.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.f48329A, this.f48334F, this.f48335G, this.f48333E);
            }
        }
    }

    public void A(M m10, boolean z10) {
        boolean a10 = this.f48362o.a(m10, z10);
        if (this.f48341a != null && a10) {
            t();
        }
    }

    public List A0(e eVar) {
        if (this.f48365r == null) {
            f.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f48365r.d(eVar, 0, arrayList, new e(new String[0]));
        return arrayList;
    }

    public void B() {
        this.f48348g.clear();
        this.f48342b.k();
        if (!isVisible()) {
            this.f48346f = b.NONE;
        }
    }

    public void B0() {
        float f10;
        if (this.f48365r == null) {
            this.f48348g.add(new C4058C(this));
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.f48342b.z();
                this.f48346f = b.NONE;
            } else {
                this.f48346f = b.RESUME;
            }
        }
        if (!s(K())) {
            if (Z() < 0.0f) {
                f10 = T();
            } else {
                f10 = S();
            }
            M0((int) f10);
            this.f48342b.k();
            if (!isVisible()) {
                this.f48346f = b.NONE;
            }
        }
    }

    public void C0() {
        this.f48342b.A();
    }

    public C4061a E() {
        C4061a aVar = this.f48347f0;
        if (aVar != null) {
            return aVar;
        }
        return C4065e.d();
    }

    public void E0(boolean z10) {
        this.f48369v = z10;
    }

    public boolean F() {
        if (E() == C4061a.ENABLED) {
            return true;
        }
        return false;
    }

    public void F0(C4061a aVar) {
        this.f48347f0 = aVar;
    }

    public Bitmap G(String str) {
        C4231b N10 = N();
        if (N10 != null) {
            return N10.a(str);
        }
        return null;
    }

    public void G0(boolean z10) {
        if (z10 != this.f48370w) {
            this.f48370w = z10;
            invalidateSelf();
        }
    }

    public boolean H() {
        return this.f48370w;
    }

    public void H0(boolean z10) {
        if (z10 != this.f48364q) {
            this.f48364q = z10;
            c cVar = this.f48365r;
            if (cVar != null) {
                cVar.R(z10);
            }
            invalidateSelf();
        }
    }

    public boolean I() {
        return this.f48364q;
    }

    public boolean I0(C4071k kVar) {
        if (this.f48341a == kVar) {
            return false;
        }
        this.f48340Z = true;
        v();
        this.f48341a = kVar;
        t();
        this.f48342b.B(kVar);
        b1(this.f48342b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f48348g).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.a(kVar);
            }
            it.remove();
        }
        this.f48348g.clear();
        kVar.v(this.f48367t);
        w();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable((Drawable) null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public C4071k J() {
        return this.f48341a;
    }

    public void J0(String str) {
        this.f48358l = str;
        C4230a L10 = L();
        if (L10 != null) {
            L10.c(str);
        }
    }

    public void K0(C4062b bVar) {
        this.f48360m = bVar;
        C4230a aVar = this.f48354j;
        if (aVar != null) {
            aVar.d(bVar);
        }
    }

    public void L0(Map map) {
        if (map != this.f48356k) {
            this.f48356k = map;
            invalidateSelf();
        }
    }

    public int M() {
        return (int) this.f48342b.m();
    }

    public void M0(int i10) {
        if (this.f48341a == null) {
            this.f48348g.add(new K(this, i10));
        } else {
            this.f48342b.C((float) i10);
        }
    }

    public void N0(boolean z10) {
        this.f48344d = z10;
    }

    public String O() {
        return this.f48352i;
    }

    public void O0(C4063c cVar) {
        C4231b bVar = this.f48350h;
        if (bVar != null) {
            bVar.d(cVar);
        }
    }

    public O P(String str) {
        C4071k kVar = this.f48341a;
        if (kVar == null) {
            return null;
        }
        return (O) kVar.j().get(str);
    }

    public void P0(String str) {
        this.f48352i = str;
    }

    public boolean Q() {
        return this.f48363p;
    }

    public void Q0(boolean z10) {
        this.f48363p = z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x0019, LOOP_START, PHI: r1 
      PHI: (r1v1 A4.h) = (r1v0 A4.h), (r1v5 A4.h) binds: [B:0:0x0000, B:4:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A4.h R() {
        /*
            r3 = this;
            java.util.List r0 = f48327n0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            u4.k r2 = r3.f48341a
            A4.h r1 = r2.l(r1)
            if (r1 == 0) goto L_0x0007
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.L.R():A4.h");
    }

    public void R0(int i10) {
        if (this.f48341a == null) {
            this.f48348g.add(new C4083x(this, i10));
        } else {
            this.f48342b.D(((float) i10) + 0.99f);
        }
    }

    public float S() {
        return this.f48342b.p();
    }

    public void S0(String str) {
        C4071k kVar = this.f48341a;
        if (kVar == null) {
            this.f48348g.add(new C4059D(this, str));
            return;
        }
        h l10 = kVar.l(str);
        if (l10 != null) {
            R0((int) (l10.f29372b + l10.f29373c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public float T() {
        return this.f48342b.q();
    }

    public void T0(float f10) {
        C4071k kVar = this.f48341a;
        if (kVar == null) {
            this.f48348g.add(new C4056A(this, f10));
        } else {
            this.f48342b.D(k.i(kVar.p(), this.f48341a.f(), f10));
        }
    }

    public X U() {
        C4071k kVar = this.f48341a;
        if (kVar != null) {
            return kVar.n();
        }
        return null;
    }

    public void U0(int i10, int i11) {
        if (this.f48341a == null) {
            this.f48348g.add(new C4082w(this, i10, i11));
        } else {
            this.f48342b.E((float) i10, ((float) i11) + 0.99f);
        }
    }

    public float V() {
        return this.f48342b.l();
    }

    public void V0(String str) {
        C4071k kVar = this.f48341a;
        if (kVar == null) {
            this.f48348g.add(new C4081v(this, str));
            return;
        }
        h l10 = kVar.l(str);
        if (l10 != null) {
            int i10 = (int) l10.f29372b;
            U0(i10, ((int) l10.f29373c) + i10);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public a0 W() {
        if (this.f48372y) {
            return a0.SOFTWARE;
        }
        return a0.HARDWARE;
    }

    public void W0(int i10) {
        if (this.f48341a == null) {
            this.f48348g.add(new C4084y(this, i10));
        } else {
            this.f48342b.F(i10);
        }
    }

    public int X() {
        return this.f48342b.getRepeatCount();
    }

    public void X0(String str) {
        C4071k kVar = this.f48341a;
        if (kVar == null) {
            this.f48348g.add(new C4060E(this, str));
            return;
        }
        h l10 = kVar.l(str);
        if (l10 != null) {
            W0((int) l10.f29372b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public int Y() {
        return this.f48342b.getRepeatMode();
    }

    public void Y0(float f10) {
        C4071k kVar = this.f48341a;
        if (kVar == null) {
            this.f48348g.add(new I(this, f10));
        } else {
            W0((int) k.i(kVar.p(), this.f48341a.f(), f10));
        }
    }

    public float Z() {
        return this.f48342b.r();
    }

    public void Z0(boolean z10) {
        if (this.f48368u != z10) {
            this.f48368u = z10;
            c cVar = this.f48365r;
            if (cVar != null) {
                cVar.L(z10);
            }
        }
    }

    public c0 a0() {
        return this.f48361n;
    }

    public void a1(boolean z10) {
        this.f48367t = z10;
        C4071k kVar = this.f48341a;
        if (kVar != null) {
            kVar.v(z10);
        }
    }

    public Typeface b0(A4.c cVar) {
        Map map = this.f48356k;
        if (map != null) {
            String a10 = cVar.a();
            if (map.containsKey(a10)) {
                return (Typeface) map.get(a10);
            }
            String b10 = cVar.b();
            if (map.containsKey(b10)) {
                return (Typeface) map.get(b10);
            }
            String str = cVar.a() + "-" + cVar.c();
            if (map.containsKey(str)) {
                return (Typeface) map.get(str);
            }
        }
        C4230a L10 = L();
        if (L10 != null) {
            return L10.b(cVar);
        }
        return null;
    }

    public void b1(float f10) {
        if (this.f48341a == null) {
            this.f48348g.add(new J(this, f10));
            return;
        }
        if (C4065e.h()) {
            C4065e.b("Drawable#setProgress");
        }
        this.f48342b.C(this.f48341a.h(f10));
        if (C4065e.h()) {
            C4065e.c("Drawable#setProgress");
        }
    }

    public void c1(a0 a0Var) {
        this.f48371x = a0Var;
        w();
    }

    public boolean d0() {
        i iVar = this.f48342b;
        if (iVar == null) {
            return false;
        }
        return iVar.isRunning();
    }

    public void d1(int i10) {
        this.f48342b.setRepeatCount(i10);
    }

    public void draw(Canvas canvas) {
        c cVar = this.f48365r;
        if (cVar != null) {
            boolean F10 = F();
            if (F10) {
                try {
                    this.f48351h0.acquire();
                } catch (InterruptedException unused) {
                    if (C4065e.h()) {
                        C4065e.c("Drawable#draw");
                    }
                    if (F10) {
                        this.f48351h0.release();
                        if (cVar.Q() == this.f48342b.l()) {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    if (C4065e.h()) {
                        C4065e.c("Drawable#draw");
                    }
                    if (F10) {
                        this.f48351h0.release();
                        if (cVar.Q() != this.f48342b.l()) {
                            f48328o0.execute(this.f48357k0);
                        }
                    }
                    throw th2;
                }
            }
            if (C4065e.h()) {
                C4065e.b("Drawable#draw");
            }
            if (F10 && j1()) {
                b1(this.f48342b.l());
            }
            if (this.f48345e) {
                try {
                    if (this.f48372y) {
                        z0(canvas, cVar);
                    } else {
                        z(canvas);
                    }
                } catch (Throwable th3) {
                    f.b("Lottie crashed in draw!", th3);
                }
            } else if (this.f48372y) {
                z0(canvas, cVar);
            } else {
                z(canvas);
            }
            this.f48340Z = false;
            if (C4065e.h()) {
                C4065e.c("Drawable#draw");
            }
            if (F10) {
                this.f48351h0.release();
                if (cVar.Q() == this.f48342b.l()) {
                    return;
                }
                f48328o0.execute(this.f48357k0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e0() {
        if (isVisible()) {
            return this.f48342b.isRunning();
        }
        b bVar = this.f48346f;
        if (bVar == b.PLAY || bVar == b.RESUME) {
            return true;
        }
        return false;
    }

    public void e1(int i10) {
        this.f48342b.setRepeatMode(i10);
    }

    public boolean f0() {
        return this.f48369v;
    }

    public void f1(boolean z10) {
        this.f48345e = z10;
    }

    public boolean g0(M m10) {
        return this.f48362o.b(m10);
    }

    public void g1(float f10) {
        this.f48342b.G(f10);
    }

    public int getAlpha() {
        return this.f48366s;
    }

    public int getIntrinsicHeight() {
        C4071k kVar = this.f48341a;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().height();
    }

    public int getIntrinsicWidth() {
        C4071k kVar = this.f48341a;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().width();
    }

    public int getOpacity() {
        return -3;
    }

    public void h1(c0 c0Var) {
        this.f48361n = c0Var;
    }

    public void i1(boolean z10) {
        this.f48342b.H(z10);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void invalidateSelf() {
        Drawable.Callback callback;
        if (!this.f48340Z) {
            this.f48340Z = true;
            if ((!f48326m0 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        return d0();
    }

    public boolean k1() {
        if (this.f48356k == null && this.f48361n == null && this.f48341a.c().o() > 0) {
            return true;
        }
        return false;
    }

    public void q(Animator.AnimatorListener animatorListener) {
        this.f48342b.addListener(animatorListener);
    }

    public void r(e eVar, Object obj, I4.c cVar) {
        c cVar2 = this.f48365r;
        if (cVar2 == null) {
            this.f48348g.add(new C4085z(this, eVar, obj, cVar));
            return;
        }
        boolean z10 = true;
        if (eVar == e.f29366c) {
            cVar2.e(obj, cVar);
        } else if (eVar.d() != null) {
            eVar.d().e(obj, cVar);
        } else {
            List A02 = A0(eVar);
            for (int i10 = 0; i10 < A02.size(); i10++) {
                ((e) A02.get(i10)).d().e(obj, cVar);
            }
            z10 = true ^ A02.isEmpty();
        }
        if (z10) {
            invalidateSelf();
            if (obj == T.f48392E) {
                b1(V());
            }
        }
    }

    public boolean s(Context context) {
        if (this.f48344d) {
            return true;
        }
        if (!this.f48343c || C4065e.f().a(context) != C4185a.STANDARD_MOTION) {
            return false;
        }
        return true;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        this.f48366s = i10;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        f.c("Use addColorFilter instead.");
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            b bVar = this.f48346f;
            if (bVar == b.PLAY) {
                y0();
            } else if (bVar == b.RESUME) {
                B0();
            }
        } else if (this.f48342b.isRunning()) {
            x0();
            this.f48346f = b.RESUME;
        } else if (isVisible) {
            this.f48346f = b.NONE;
        }
        return visible;
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || !((View) callback).isInEditMode()) {
            y0();
        }
    }

    public void stop() {
        B();
    }

    public void u() {
        this.f48348g.clear();
        this.f48342b.cancel();
        if (!isVisible()) {
            this.f48346f = b.NONE;
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v() {
        if (this.f48342b.isRunning()) {
            this.f48342b.cancel();
            if (!isVisible()) {
                this.f48346f = b.NONE;
            }
        }
        this.f48341a = null;
        this.f48365r = null;
        this.f48350h = null;
        this.f48359l0 = -3.4028235E38f;
        this.f48342b.j();
        invalidateSelf();
    }

    public void x0() {
        this.f48348g.clear();
        this.f48342b.t();
        if (!isVisible()) {
            this.f48346f = b.NONE;
        }
    }

    public void y0() {
        float f10;
        if (this.f48365r == null) {
            this.f48348g.add(new H(this));
            return;
        }
        w();
        if (s(K()) || X() == 0) {
            if (isVisible()) {
                this.f48342b.u();
                this.f48346f = b.NONE;
            } else {
                this.f48346f = b.PLAY;
            }
        }
        if (!s(K())) {
            h R10 = R();
            if (R10 != null) {
                M0((int) R10.f29372b);
            } else {
                if (Z() < 0.0f) {
                    f10 = T();
                } else {
                    f10 = S();
                }
                M0((int) f10);
            }
            this.f48342b.k();
            if (!isVisible()) {
                this.f48346f = b.NONE;
            }
        }
    }
}
