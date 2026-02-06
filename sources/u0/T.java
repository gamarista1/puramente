package u0;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import c1.d;
import c1.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2428n;
import r0.C2446G;
import r0.C2520p0;
import r0.C2523q0;
import t0.C2600a;
import t0.C2603d;
import t0.C2604e;
import yf.C6798l;

public final class T extends View {

    /* renamed from: k  reason: collision with root package name */
    public static final b f26453k = new b((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    private static final ViewOutlineProvider f26454l = new a();

    /* renamed from: a  reason: collision with root package name */
    private final View f26455a;

    /* renamed from: b  reason: collision with root package name */
    private final C2523q0 f26456b;

    /* renamed from: c  reason: collision with root package name */
    private final C2600a f26457c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f26458d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Outline f26459e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f26460f = true;

    /* renamed from: g  reason: collision with root package name */
    private d f26461g = C2604e.a();

    /* renamed from: h  reason: collision with root package name */
    private t f26462h = t.Ltr;

    /* renamed from: i  reason: collision with root package name */
    private C6798l f26463i = C2674d.f26503a.a();

    /* renamed from: j  reason: collision with root package name */
    private C2673c f26464j;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        public void getOutline(View view, Outline outline) {
            Outline a10;
            if ((view instanceof T) && (a10 = ((T) view).f26459e) != null) {
                outline.set(a10);
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public T(View view, C2523q0 q0Var, C2600a aVar) {
        super(view.getContext());
        this.f26455a = view;
        this.f26456b = q0Var;
        this.f26457c = aVar;
        setOutlineProvider(f26454l);
        setWillNotDraw(false);
        setClipBounds((Rect) null);
    }

    public final void b(d dVar, t tVar, C2673c cVar, C6798l lVar) {
        this.f26461g = dVar;
        this.f26462h = tVar;
        this.f26463i = lVar;
        this.f26464j = cVar;
    }

    public final boolean c(Outline outline) {
        this.f26459e = outline;
        return K.f26447a.a(this);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C2523q0 q0Var = this.f26456b;
        Canvas a10 = q0Var.a().a();
        q0Var.a().z(canvas);
        C2446G a11 = q0Var.a();
        C2600a aVar = this.f26457c;
        d dVar = this.f26461g;
        t tVar = this.f26462h;
        long a12 = C2428n.a((float) getWidth(), (float) getHeight());
        C2673c cVar = this.f26464j;
        C6798l lVar = this.f26463i;
        d density = aVar.w1().getDensity();
        t layoutDirection = aVar.w1().getLayoutDirection();
        C2520p0 f10 = aVar.w1().f();
        long d10 = aVar.w1().d();
        C2673c i10 = aVar.w1().i();
        Canvas canvas2 = a10;
        C2603d w12 = aVar.w1();
        w12.b(dVar);
        w12.a(tVar);
        w12.c(a11);
        w12.h(a12);
        w12.g(cVar);
        a11.q();
        try {
            lVar.invoke(aVar);
            a11.h();
            C2603d w13 = aVar.w1();
            w13.b(density);
            w13.a(layoutDirection);
            w13.c(f10);
            w13.h(d10);
            w13.g(i10);
            q0Var.a().z(canvas2);
            this.f26458d = false;
        } catch (Throwable th2) {
            C2673c cVar2 = i10;
            Throwable th3 = th2;
            a11.h();
            C2603d w14 = aVar.w1();
            w14.b(density);
            w14.a(layoutDirection);
            w14.c(f10);
            w14.h(d10);
            w14.g(cVar2);
            throw th3;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f26460f;
    }

    public final C2523q0 getCanvasHolder() {
        return this.f26456b;
    }

    public final View getOwnerView() {
        return this.f26455a;
    }

    public boolean hasOverlappingRendering() {
        return this.f26460f;
    }

    public void invalidate() {
        if (!this.f26458d) {
            this.f26458d = true;
            super.invalidate();
        }
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.f26460f != z10) {
            this.f26460f = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.f26458d = z10;
    }

    public void forceLayout() {
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
