package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1692h0;
import androidx.fragment.app.C1769q;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.K;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.swmansion.rnscreens.C4936u;
import ib.C5020g;
import ib.C5024k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import sf.C6714a;
import yd.C5297d;
import yd.q;

public final class r extends C4922f implements C4936u.a {

    /* renamed from: I  reason: collision with root package name */
    public static final b f59834I = new b((DefaultConstructorMarker) null);

    /* renamed from: A  reason: collision with root package name */
    private String f59835A;

    /* renamed from: B  reason: collision with root package name */
    private Boolean f59836B;

    /* renamed from: C  reason: collision with root package name */
    private Boolean f59837C;

    /* renamed from: D  reason: collision with root package name */
    private Integer f59838D;

    /* renamed from: E  reason: collision with root package name */
    private Integer f59839E;

    /* renamed from: F  reason: collision with root package name */
    private Boolean f59840F;

    /* renamed from: G  reason: collision with root package name */
    private Boolean f59841G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f59842H;

    /* renamed from: d  reason: collision with root package name */
    private final ReactContext f59843d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference f59844e = new WeakReference((Object) null);

    /* renamed from: f  reason: collision with root package name */
    private z f59845f;

    /* renamed from: g  reason: collision with root package name */
    private C4935t f59846g;

    /* renamed from: h  reason: collision with root package name */
    private a f59847h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f59848i;

    /* renamed from: j  reason: collision with root package name */
    private e f59849j = e.PUSH;

    /* renamed from: k  reason: collision with root package name */
    private c f59850k = c.POP;

    /* renamed from: l  reason: collision with root package name */
    private d f59851l = d.DEFAULT;

    /* renamed from: m  reason: collision with root package name */
    private boolean f59852m = true;

    /* renamed from: n  reason: collision with root package name */
    private Integer f59853n;

    /* renamed from: o  reason: collision with root package name */
    private Boolean f59854o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f59855p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f59856q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f59857r;

    /* renamed from: s  reason: collision with root package name */
    private float f59858s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f59859t = true;

    /* renamed from: u  reason: collision with root package name */
    private List f59860u = C6565s.t(Double.valueOf(1.0d));

    /* renamed from: v  reason: collision with root package name */
    private int f59861v = -1;

    /* renamed from: w  reason: collision with root package name */
    private int f59862w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f59863x = true;

    /* renamed from: y  reason: collision with root package name */
    private float f59864y = 24.0f;

    /* renamed from: z  reason: collision with root package name */
    private C4938w f59865z;

    public enum a {
        INACTIVE,
        TRANSITIONING_OR_BELOW_TOP,
        ON_TOP;

        static {
            a[] a10;
            f59870e = C6714a.a(a10);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public enum c {
        PUSH,
        POP;

        static {
            c[] a10;
            f59874d = C6714a.a(a10);
        }
    }

    public enum d {
        DEFAULT,
        NONE,
        FADE,
        SLIDE_FROM_BOTTOM,
        SLIDE_FROM_RIGHT,
        SLIDE_FROM_LEFT,
        FADE_FROM_BOTTOM,
        IOS_FROM_RIGHT,
        IOS_FROM_LEFT;

        static {
            d[] a10;
            f59885k = C6714a.a(a10);
        }
    }

    public enum e {
        PUSH,
        MODAL,
        TRANSPARENT_MODAL,
        FORM_SHEET;

        static {
            e[] a10;
            f59891f = C6714a.a(a10);
        }
    }

    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f59892a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.swmansion.rnscreens.r$e[] r0 = com.swmansion.rnscreens.r.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.swmansion.rnscreens.r$e r1 = com.swmansion.rnscreens.r.e.TRANSPARENT_MODAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.swmansion.rnscreens.r$e r1 = com.swmansion.rnscreens.r.e.FORM_SHEET     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f59892a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.r.f.<clinit>():void");
        }
    }

    public enum g {
        ORIENTATION,
        COLOR,
        STYLE,
        TRANSLUCENT,
        HIDDEN,
        ANIMATED,
        NAVIGATION_BAR_COLOR,
        NAVIGATION_BAR_TRANSLUCENT,
        NAVIGATION_BAR_HIDDEN;

        static {
            g[] a10;
            f59903k = C6714a.a(a10);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(ReactContext reactContext) {
        super(reactContext);
        C6496s.h(reactContext, "reactContext");
        this.f59843d = reactContext;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.f59842H = true;
    }

    private final boolean e(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && e((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    private final void m(int i10) {
        Context context = getContext();
        C6496s.f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int e10 = n0.e(reactContext);
        EventDispatcher c10 = n0.c(reactContext, getId());
        if (c10 != null) {
            c10.h(new C5297d(e10, getId(), i10));
        }
    }

    private final void s(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((viewGroup instanceof androidx.swiperefreshlayout.widget.c) && (childAt instanceof ImageView)) {
                    viewGroup.addView(new View(getContext()), i10);
                } else if (childAt != null) {
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof H) {
                    s(((H) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    if ((childAt instanceof K) && ((K) childAt).getRemoveClippedSubviews() && !(childAt instanceof com.facebook.react.views.scroll.f) && !(childAt instanceof com.facebook.react.views.scroll.e)) {
                        try {
                            int childCount2 = ((ViewGroup) childAt).getChildCount();
                            for (int i11 = 0; i11 < childCount2; i11++) {
                                ((ViewGroup) childAt).addView(new View(getContext()));
                            }
                        } catch (Exception unused) {
                        }
                    }
                    s((ViewGroup) childAt);
                }
            }
        }
    }

    public void a(boolean z10, int i10, int i11, int i12, int i13) {
        BottomSheetBehavior<r> sheetBehavior;
        int i14 = i13 - i11;
        if (this.f59860u.size() == 1 && ((Number) C6565s.o0(this.f59860u)).doubleValue() == -1.0d && (sheetBehavior = getSheetBehavior()) != null && sheetBehavior.i0() != i14) {
            sheetBehavior.B0(i14);
        }
    }

    public final void d(int i10) {
        C4920d toolbar;
        setImportantForAccessibility(i10);
        H headerConfig = getHeaderConfig();
        if (headerConfig != null && (toolbar = headerConfig.getToolbar()) != null) {
            toolbar.setImportantForAccessibility(i10);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        C6496s.h(sparseArray, "container");
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        C6496s.h(sparseArray, "container");
    }

    public final boolean f() {
        return this.f59855p;
    }

    public final Boolean g() {
        return this.f59841G;
    }

    public final a getActivityState() {
        return this.f59847h;
    }

    public final C4935t getContainer() {
        return this.f59846g;
    }

    public final WeakReference<C4936u> getContentWrapper() {
        return this.f59844e;
    }

    public final C4938w getFooter() {
        return this.f59865z;
    }

    public final C1769q getFragment() {
        z zVar = this.f59845f;
        if (zVar != null) {
            return zVar.c();
        }
        return null;
    }

    public final z getFragmentWrapper() {
        return this.f59845f;
    }

    public final H getHeaderConfig() {
        Object obj;
        Iterator it = C1692h0.a(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((View) obj) instanceof H) {
                break;
            }
        }
        if (obj instanceof H) {
            return (H) obj;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f59842H;
    }

    public final Integer getNavigationBarColor() {
        return this.f59839E;
    }

    public final ReactContext getReactContext() {
        return this.f59843d;
    }

    public final EventDispatcher getReactEventDispatcher() {
        return n0.c(this.f59843d, getId());
    }

    public final c getReplaceAnimation() {
        return this.f59850k;
    }

    public final Integer getScreenOrientation() {
        return this.f59853n;
    }

    public final BottomSheetBehavior<r> getSheetBehavior() {
        CoordinatorLayout.f fVar;
        CoordinatorLayout.c cVar;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            fVar = (CoordinatorLayout.f) layoutParams;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            cVar = fVar.e();
        } else {
            cVar = null;
        }
        if (cVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVar;
        }
        return null;
    }

    public final boolean getSheetClosesOnTouchOutside() {
        return this.f59863x;
    }

    public final float getSheetCornerRadius() {
        return this.f59858s;
    }

    public final List<Double> getSheetDetents() {
        return this.f59860u;
    }

    public final float getSheetElevation() {
        return this.f59864y;
    }

    public final boolean getSheetExpandsWhenScrolledToEdge() {
        return this.f59859t;
    }

    public final int getSheetInitialDetentIndex() {
        return this.f59862w;
    }

    public final int getSheetLargestUndimmedDetentIndex() {
        return this.f59861v;
    }

    public final d getStackAnimation() {
        return this.f59851l;
    }

    public final e getStackPresentation() {
        return this.f59849j;
    }

    public final Integer getStatusBarColor() {
        return this.f59838D;
    }

    public final String getStatusBarStyle() {
        return this.f59835A;
    }

    public final Boolean h() {
        return this.f59840F;
    }

    public final Boolean i() {
        return this.f59854o;
    }

    public final Boolean j() {
        return this.f59836B;
    }

    public final Boolean k() {
        return this.f59837C;
    }

    public final boolean l() {
        int i10 = f.f59892a[this.f59849j.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        int e10 = n0.e(this.f59843d);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.h(new q(e10, getId(), i10, z10));
        }
    }

    public final void o() {
        if (this.f59857r) {
            this.f59857r = false;
            p();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if ((this.f59846g instanceof B) && z10) {
            b(i12 - i10, i13 - i11, i11);
            C4938w wVar = this.f59865z;
            if (wVar != null) {
                C4935t tVar = this.f59846g;
                C6496s.e(tVar);
                wVar.y(z10, i10, i11, i12, i13, tVar.getHeight());
            }
            m(i11);
        }
    }

    public final void p() {
        C5020g gVar;
        if (this.f59849j == e.FORM_SHEET && getBackground() != null) {
            Drawable background = getBackground();
            if (background instanceof C5020g) {
                gVar = (C5020g) background;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                float f10 = G.f(this.f59858s);
                C5024k.b bVar = new C5024k.b();
                bVar.y(0, f10);
                bVar.D(0, f10);
                gVar.setShapeAppearanceModel(bVar.m());
            }
        }
    }

    public final void q(C4936u uVar) {
        C6496s.h(uVar, "wrapper");
        uVar.setDelegate$react_native_screens_release(this);
        this.f59844e = new WeakReference(uVar);
    }

    public final void r() {
        if (!this.f59855p) {
            this.f59855p = true;
            s(this);
        }
    }

    public final void setActivityState(a aVar) {
        C6496s.h(aVar, "activityState");
        a aVar2 = this.f59847h;
        if (aVar != aVar2) {
            if ((this.f59846g instanceof B) && aVar2 != null) {
                C6496s.e(aVar2);
                if (aVar.compareTo(aVar2) < 0) {
                    throw new IllegalStateException("[RNScreens] activityState can only progress in NativeStack");
                }
            }
            this.f59847h = aVar;
            C4935t tVar = this.f59846g;
            if (tVar != null) {
                tVar.o();
            }
        }
    }

    public final void setBeingRemoved(boolean z10) {
        this.f59855p = z10;
    }

    public final void setContainer(C4935t tVar) {
        this.f59846g = tVar;
    }

    public final void setContentWrapper(WeakReference<C4936u> weakReference) {
        C6496s.h(weakReference, "<set-?>");
        this.f59844e = weakReference;
    }

    public final void setFooter(C4938w wVar) {
        BottomSheetBehavior<r> sheetBehavior;
        if (wVar == null && this.f59865z != null) {
            BottomSheetBehavior<r> sheetBehavior2 = getSheetBehavior();
            if (sheetBehavior2 != null) {
                C4938w wVar2 = this.f59865z;
                C6496s.e(wVar2);
                wVar2.E(sheetBehavior2);
            }
        } else if (!(wVar == null || (sheetBehavior = getSheetBehavior()) == null)) {
            wVar.z(sheetBehavior);
        }
        this.f59865z = wVar;
    }

    public final void setFragmentWrapper(z zVar) {
        this.f59845f = zVar;
    }

    public final void setGestureEnabled(boolean z10) {
        this.f59852m = z10;
    }

    public void setLayerType(int i10, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z10) {
        this.f59842H = z10;
    }

    public final void setNavigationBarColor(Integer num) {
        if (num != null) {
            O.f59726a.e();
        }
        this.f59839E = num;
        z zVar = this.f59845f;
        if (zVar != null) {
            O.f59726a.q(this, zVar.b());
        }
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            O.f59726a.e();
        }
        this.f59841G = bool;
        z zVar = this.f59845f;
        if (zVar != null) {
            O.f59726a.r(this, zVar.b());
        }
    }

    public final void setNavigationBarTranslucent(Boolean bool) {
        if (bool != null) {
            O.f59726a.e();
        }
        this.f59840F = bool;
        z zVar = this.f59845f;
        if (zVar != null) {
            O.f59726a.s(this, zVar.b());
        }
    }

    public final void setReplaceAnimation(c cVar) {
        C6496s.h(cVar, "<set-?>");
        this.f59850k = cVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setScreenOrientation(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0006
            r3 = 0
            r2.f59853n = r3
            return
        L_0x0006:
            com.swmansion.rnscreens.O r0 = com.swmansion.rnscreens.O.f59726a
            r0.f()
            int r1 = r3.hashCode()
            switch(r1) {
                case -1894896954: goto L_0x0057;
                case 96673: goto L_0x004b;
                case 729267099: goto L_0x0040;
                case 1430647483: goto L_0x0035;
                case 1651658175: goto L_0x002a;
                case 1730732811: goto L_0x001e;
                case 2118770584: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x005f
        L_0x0013:
            java.lang.String r1 = "landscape_right"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x001c
            goto L_0x005f
        L_0x001c:
            r3 = 0
            goto L_0x0063
        L_0x001e:
            java.lang.String r1 = "landscape_left"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0027
            goto L_0x005f
        L_0x0027:
            r3 = 8
            goto L_0x0063
        L_0x002a:
            java.lang.String r1 = "portrait_up"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0033
            goto L_0x005f
        L_0x0033:
            r3 = 1
            goto L_0x0063
        L_0x0035:
            java.lang.String r1 = "landscape"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x003e
            goto L_0x005f
        L_0x003e:
            r3 = 6
            goto L_0x0063
        L_0x0040:
            java.lang.String r1 = "portrait"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0049
            goto L_0x005f
        L_0x0049:
            r3 = 7
            goto L_0x0063
        L_0x004b:
            java.lang.String r1 = "all"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0054
            goto L_0x005f
        L_0x0054:
            r3 = 10
            goto L_0x0063
        L_0x0057:
            java.lang.String r1 = "portrait_down"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0061
        L_0x005f:
            r3 = -1
            goto L_0x0063
        L_0x0061:
            r3 = 9
        L_0x0063:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.f59853n = r3
            com.swmansion.rnscreens.z r3 = r2.f59845f
            if (r3 == 0) goto L_0x0074
            android.app.Activity r3 = r3.b()
            r0.t(r2, r3)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.r.setScreenOrientation(java.lang.String):void");
    }

    public final void setSheetClosesOnTouchOutside(boolean z10) {
        this.f59863x = z10;
    }

    public final void setSheetCornerRadius(float f10) {
        if (this.f59858s != f10) {
            this.f59858s = f10;
            this.f59857r = true;
        }
    }

    public final void setSheetDetents(List<Double> list) {
        C6496s.h(list, "<set-?>");
        this.f59860u = list;
    }

    public final void setSheetElevation(float f10) {
        this.f59864y = f10;
    }

    public final void setSheetExpandsWhenScrolledToEdge(boolean z10) {
        this.f59859t = z10;
    }

    public final void setSheetGrabberVisible(boolean z10) {
        this.f59856q = z10;
    }

    public final void setSheetInitialDetentIndex(int i10) {
        this.f59862w = i10;
    }

    public final void setSheetLargestUndimmedDetentIndex(int i10) {
        this.f59861v = i10;
    }

    public final void setStackAnimation(d dVar) {
        C6496s.h(dVar, "<set-?>");
        this.f59851l = dVar;
    }

    public final void setStackPresentation(e eVar) {
        C6496s.h(eVar, "<set-?>");
        this.f59849j = eVar;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.f59854o = bool;
    }

    public final void setStatusBarColor(Integer num) {
        if (num != null) {
            O.f59726a.g();
        }
        this.f59838D = num;
        z zVar = this.f59845f;
        if (zVar != null) {
            O.f59726a.m(this, zVar.b(), zVar.q());
        }
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            O.f59726a.g();
        }
        this.f59836B = bool;
        z zVar = this.f59845f;
        if (zVar != null) {
            O.f59726a.o(this, zVar.b());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            O.f59726a.g();
        }
        this.f59835A = str;
        z zVar = this.f59845f;
        if (zVar != null) {
            O.f59726a.v(this, zVar.b(), zVar.q());
        }
    }

    public final void setStatusBarTranslucent(Boolean bool) {
        if (bool != null) {
            O.f59726a.g();
        }
        this.f59837C = bool;
        z zVar = this.f59845f;
        if (zVar != null) {
            O.f59726a.w(this, zVar.b(), zVar.q());
        }
    }

    public final void setTransitioning(boolean z10) {
        if (this.f59848i != z10) {
            this.f59848i = z10;
            boolean e10 = e(this);
            int i10 = 2;
            if (!e10 || getLayerType() == 2) {
                if (!z10 || e10) {
                    i10 = 0;
                }
                super.setLayerType(i10, (Paint) null);
            }
        }
    }
}
