package com.facebook.react.views.scroll;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.core.view.C1680b0;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.A;
import com.facebook.react.uimanager.C3400a;
import com.facebook.react.uimanager.C3413g0;
import com.facebook.react.uimanager.C3430x;
import com.facebook.react.uimanager.C3431y;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.K;
import com.facebook.react.uimanager.L;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.events.k;
import com.facebook.react.views.scroll.b;
import com.facebook.react.views.scroll.i;
import com.google.android.gms.common.api.a;
import j8.d;
import j8.f;
import j8.o;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n7.C3863a;
import z8.C4236a;

public class e extends HorizontalScrollView implements K, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, P, i.c, i.e, i.a, i.b, i.d {

    /* renamed from: f0  reason: collision with root package name */
    private static boolean f41947f0 = false;

    /* renamed from: g0  reason: collision with root package name */
    private static String f41948g0 = "e";

    /* renamed from: h0  reason: collision with root package name */
    private static int f41949h0 = Integer.MIN_VALUE;

    /* renamed from: i0  reason: collision with root package name */
    private static Field f41950i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    private static boolean f41951j0 = false;

    /* renamed from: A  reason: collision with root package name */
    private C3413g0 f41952A = null;

    /* renamed from: B  reason: collision with root package name */
    private final i.g f41953B;

    /* renamed from: C  reason: collision with root package name */
    private final ValueAnimator f41954C = ObjectAnimator.ofInt(this, "scrollX", new int[]{0, 0});

    /* renamed from: D  reason: collision with root package name */
    private H f41955D = H.AUTO;

    /* renamed from: E  reason: collision with root package name */
    private long f41956E = 0;

    /* renamed from: F  reason: collision with root package name */
    private int f41957F = 0;

    /* renamed from: G  reason: collision with root package name */
    private View f41958G;

    /* renamed from: H  reason: collision with root package name */
    private b f41959H;

    /* renamed from: I  reason: collision with root package name */
    private final Rect f41960I = new Rect();

    /* renamed from: a  reason: collision with root package name */
    private int f41961a = f41949h0;

    /* renamed from: b  reason: collision with root package name */
    private final c f41962b = new c();

    /* renamed from: c  reason: collision with root package name */
    private final OverScroller f41963c;

    /* renamed from: d  reason: collision with root package name */
    private final l f41964d = new l();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f41965e = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f41966f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f41967g;

    /* renamed from: h  reason: collision with root package name */
    private o f41968h = o.SCROLL;

    /* renamed from: i  reason: collision with root package name */
    private boolean f41969i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f41970j = false;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public Runnable f41971k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f41972l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f41973m = true;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f41974n;

    /* renamed from: o  reason: collision with root package name */
    private String f41975o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f41976p;

    /* renamed from: q  reason: collision with root package name */
    private int f41977q = 0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f41978r = false;

    /* renamed from: s  reason: collision with root package name */
    private int f41979s = 0;

    /* renamed from: t  reason: collision with root package name */
    private List f41980t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f41981u = true;

    /* renamed from: v  reason: collision with root package name */
    private boolean f41982v = true;

    /* renamed from: w  reason: collision with root package name */
    private int f41983w = 0;

    /* renamed from: x  reason: collision with root package name */
    private boolean f41984x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f41985y = -1;

    /* renamed from: z  reason: collision with root package name */
    private int f41986z = -1;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private boolean f41987a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f41988b = 0;

        a() {
        }

        public void run() {
            NativeAnimatedModule nativeAnimatedModule;
            if (e.this.f41966f) {
                e.this.f41966f = false;
                this.f41988b = 0;
                C1680b0.h0(e.this, this, 20);
                return;
            }
            i.s(e.this);
            int i10 = this.f41988b + 1;
            this.f41988b = i10;
            if (i10 >= 3) {
                e.this.f41971k = null;
                if (e.this.f41974n) {
                    i.j(e.this);
                }
                ReactContext reactContext = (ReactContext) e.this.getContext();
                if (!(reactContext == null || (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) == null)) {
                    nativeAnimatedModule.userDrivenScrollEnded(e.this.getId());
                }
                e.this.n();
                return;
            }
            if (e.this.f41970j && !this.f41987a) {
                this.f41987a = true;
                e.this.s(0);
            }
            C1680b0.h0(e.this, this, 20);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f41990a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                j8.o[] r0 = j8.o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41990a = r0
                j8.o r1 = j8.o.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41990a     // Catch:{ NoSuchFieldError -> 0x001d }
                j8.o r1 = j8.o.SCROLL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41990a     // Catch:{ NoSuchFieldError -> 0x0028 }
                j8.o r1 = j8.o.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.e.b.<clinit>():void");
        }
    }

    public e(Context context, a aVar) {
        super(context);
        C1680b0.o0(this, new g());
        this.f41963c = getOverScrollerFromParent();
        this.f41953B = new i.g();
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
    }

    private boolean B() {
        return false;
    }

    private boolean C(View view) {
        if (v(view) == 0) {
            return true;
        }
        return false;
    }

    private int D(int i10) {
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        if (getFlingAnimator() == this.f41954C) {
            return i.p(this, i10, 0, max, 0).x;
        }
        return t(i10) + i.m(this, getScrollX(), getReactScrollViewScrollState().b().x, i10);
    }

    private void E(int i10, int i11) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f41963c;
        if (overScroller != null && !overScroller.isFinished()) {
            int currX = this.f41963c.getCurrX();
            boolean computeScrollOffset = this.f41963c.computeScrollOffset();
            this.f41963c.forceFinished(true);
            if (computeScrollOffset) {
                int i12 = i10;
                this.f41963c.fling(i12, getScrollY(), (int) (this.f41963c.getCurrVelocity() * Math.signum((float) (this.f41963c.getFinalX() - this.f41963c.getStartX()))), 0, 0, i11, 0, 0);
                return;
            }
            scrollTo(i10 + (this.f41963c.getCurrX() - currX), getScrollY());
        }
    }

    private void F(View view) {
        int v10 = v(view);
        if (v10 != 0) {
            scrollBy(v10, 0);
        }
    }

    private void H(int i10, int i11) {
        if (f41947f0) {
            U5.a.u(f41948g0, "setPendingContentOffsets[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (y()) {
            this.f41985y = -1;
            this.f41986z = -1;
            return;
        }
        this.f41985y = i10;
        this.f41986z = i11;
    }

    private void I(int i10) {
        if (f41947f0) {
            U5.a.t(f41948g0, "smoothScrollAndSnap[%d] velocity %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        double snapInterval = (double) getSnapInterval();
        double m10 = (double) i.m(this, getScrollX(), getReactScrollViewScrollState().b().x, i10);
        double d10 = m10 / snapInterval;
        int floor = (int) Math.floor(d10);
        int ceil = (int) Math.ceil(d10);
        int round = (int) Math.round(d10);
        int round2 = (int) Math.round(((double) D(i10)) / snapInterval);
        if (i10 > 0 && ceil == floor) {
            ceil++;
        } else if (i10 < 0 && floor == ceil) {
            floor--;
        }
        if (i10 > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i10 < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d11 = ((double) round) * snapInterval;
        if (d11 != m10) {
            this.f41966f = true;
            b((int) d11, getScrollY());
        }
    }

    private void J(int i10) {
        int i11;
        if (f41947f0) {
            U5.a.t(f41948g0, "smoothScrollToNextPage[%d] direction %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i12 = scrollX / width;
        if (scrollX % width != 0) {
            i12++;
        }
        if (i10 == 17) {
            i11 = i12 - 1;
        } else {
            i11 = i12 + 1;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        b(i11 * width, getScrollY());
        x(0, 0);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f41951j0) {
            f41951j0 = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                f41950i0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                U5.a.I(f41948g0, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f41950i0;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            U5.a.I(f41948g0, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e10);
        }
    }

    private int getSnapInterval() {
        int i10 = this.f41979s;
        if (i10 != 0) {
            return i10;
        }
        return getWidth();
    }

    private void l(int i10, int i11, int i12, int i13) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().end();
        }
        int i14 = i11 - i10;
        int scrollX = i14 - (i13 - getScrollX());
        scrollTo(scrollX, getScrollY());
        E(scrollX, i14 - getWidth());
    }

    private void m() {
        Runnable runnable = this.f41971k;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f41971k = null;
            getFlingAnimator().cancel();
        }
    }

    /* access modifiers changed from: private */
    public void n() {
        if (B()) {
            C3863a.c((Object) null);
            C3863a.c(this.f41975o);
            throw null;
        }
    }

    private void o() {
        if (B()) {
            C3863a.c((Object) null);
            C3863a.c(this.f41975o);
            throw null;
        }
    }

    private static HorizontalScrollView p(View view, MotionEvent motionEvent) {
        return q(view, motionEvent, true);
    }

    private static HorizontalScrollView q(View view, MotionEvent motionEvent, boolean z10) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z10 && (view instanceof HorizontalScrollView) && C1680b0.T(view) && (view instanceof e) && ((e) view).f41973m) {
            return (HorizontalScrollView) view;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                HorizontalScrollView q10 = q(viewGroup.getChildAt(i10), motionEvent, false);
                if (q10 != null) {
                    return q10;
                }
                i10++;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void s(int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        OverScroller overScroller;
        int i17;
        if (f41947f0) {
            U5.a.t(f41948g0, "smoothScrollAndSnap[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        if (getChildCount() > 0) {
            if (this.f41979s == 0 && this.f41980t == null && this.f41983w == 0) {
                I(i10);
                return;
            }
            if (getFlingAnimator() != this.f41954C) {
                z10 = true;
            } else {
                z10 = false;
            }
            int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
            int D10 = D(i10);
            if (this.f41978r) {
                D10 = getScrollX();
            }
            int width = (getWidth() - C1680b0.F(this)) - C1680b0.E(this);
            if (getLayoutDirection() == 1) {
                D10 = max - D10;
                i11 = -i10;
            } else {
                i11 = i10;
            }
            List list = this.f41980t;
            if (list == null || list.isEmpty()) {
                int i18 = this.f41983w;
                if (i18 != 0) {
                    int i19 = this.f41979s;
                    if (i19 > 0) {
                        double d10 = ((double) D10) / ((double) i19);
                        double floor = Math.floor(d10);
                        int i20 = this.f41979s;
                        int max2 = Math.max(u(i18, (int) (floor * ((double) i20)), i20, width), 0);
                        int i21 = this.f41983w;
                        double ceil = Math.ceil(d10);
                        int i22 = this.f41979s;
                        i12 = Math.min(u(i21, (int) (ceil * ((double) i22)), i22, width), max);
                        i14 = max;
                        i13 = max2;
                        i15 = 0;
                    } else {
                        ViewGroup viewGroup = (ViewGroup) getContentView();
                        int i23 = max;
                        int i24 = i23;
                        int i25 = 0;
                        int i26 = 0;
                        for (int i27 = 0; i27 < viewGroup.getChildCount(); i27++) {
                            View childAt = viewGroup.getChildAt(i27);
                            int u10 = u(this.f41983w, childAt.getLeft(), childAt.getWidth(), width);
                            if (u10 <= D10 && D10 - u10 < D10 - i25) {
                                i25 = u10;
                            }
                            if (u10 >= D10 && u10 - D10 < i24 - D10) {
                                i24 = u10;
                            }
                            i23 = Math.min(i23, u10);
                            i26 = Math.max(i26, u10);
                        }
                        i13 = Math.max(i25, i23);
                        i12 = Math.min(i24, i26);
                        i14 = max;
                    }
                } else {
                    double snapInterval = (double) getSnapInterval();
                    double d11 = ((double) D10) / snapInterval;
                    int floor2 = (int) (Math.floor(d11) * snapInterval);
                    i12 = Math.min((int) (Math.ceil(d11) * snapInterval), max);
                    i14 = max;
                    i13 = floor2;
                }
                i15 = 0;
            } else {
                i15 = ((Integer) this.f41980t.get(0)).intValue();
                List list2 = this.f41980t;
                i14 = ((Integer) list2.get(list2.size() - 1)).intValue();
                i12 = max;
                i13 = 0;
                for (int i28 = 0; i28 < this.f41980t.size(); i28++) {
                    int intValue = ((Integer) this.f41980t.get(i28)).intValue();
                    if (intValue <= D10 && D10 - intValue < D10 - i13) {
                        i13 = intValue;
                    }
                    if (intValue >= D10 && intValue - D10 < i12 - D10) {
                        i12 = intValue;
                    }
                }
            }
            int i29 = D10 - i13;
            int i30 = i12 - D10;
            if (Math.abs(i29) < Math.abs(i30)) {
                i16 = i13;
            } else {
                i16 = i12;
            }
            int scrollX = getScrollX();
            if (getLayoutDirection() == 1) {
                scrollX = max - scrollX;
            }
            if (this.f41982v || D10 < i14) {
                if (this.f41981u || D10 > i15) {
                    if (i11 > 0) {
                        if (!z10) {
                            i11 += (int) (((double) i30) * 10.0d);
                        }
                        D10 = i12;
                    } else if (i11 < 0) {
                        if (!z10) {
                            i11 -= (int) (((double) i29) * 10.0d);
                        }
                        D10 = i13;
                    } else {
                        D10 = i16;
                    }
                } else if (scrollX > i15) {
                    D10 = i15;
                }
            } else if (scrollX < i14) {
                D10 = i14;
            }
            int i31 = 0;
            int min = Math.min(Math.max(0, D10), max);
            if (getLayoutDirection() == 1) {
                min = max - min;
                i11 = -i11;
            }
            int i32 = min;
            if (z10 || (overScroller = this.f41963c) == null) {
                b(i32, getScrollY());
                return;
            }
            this.f41966f = true;
            int scrollX2 = getScrollX();
            int scrollY = getScrollY();
            if (i11 != 0) {
                i17 = i11;
            } else {
                i17 = i32 - getScrollX();
            }
            if (i32 == 0 || i32 == max) {
                i31 = width / 2;
            }
            overScroller.fling(scrollX2, scrollY, i17, 0, i32, i32, 0, 0, i31, 0);
            postInvalidateOnAnimation();
        }
    }

    private int u(int i10, int i11, int i12, int i13) {
        int i14;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            i14 = (i13 - i12) / 2;
        } else if (i10 == 3) {
            i14 = i13 - i12;
        } else {
            throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f41983w);
        }
        return i11 - i14;
    }

    private int v(View view) {
        view.getDrawingRect(this.f41960I);
        offsetDescendantRectToMyCoords(view, this.f41960I);
        return computeScrollDeltaToGetChildRectOnScreen(this.f41960I);
    }

    private void x(int i10, int i11) {
        if (f41947f0) {
            U5.a.u(f41948g0, "handlePostTouchScrolling[%d] velocityX %d velocityY %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        if (this.f41971k == null) {
            if (this.f41974n) {
                i.i(this, i10, i11);
            }
            this.f41966f = false;
            a aVar = new a();
            this.f41971k = aVar;
            C1680b0.h0(this, aVar, 20);
        }
    }

    private boolean y() {
        View contentView = getContentView();
        if (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) {
            return false;
        }
        return true;
    }

    private boolean z(View view) {
        int v10 = v(view);
        view.getDrawingRect(this.f41960I);
        if (v10 == 0 || Math.abs(v10) >= this.f41960I.width() / 2) {
            return false;
        }
        return true;
    }

    public boolean A(View view) {
        int v10 = v(view);
        view.getDrawingRect(this.f41960I);
        if (v10 == 0 || Math.abs(v10) >= this.f41960I.width()) {
            return false;
        }
        return true;
    }

    public void G(float f10, int i10) {
        C3430x xVar;
        if (Float.isNaN(f10)) {
            xVar = null;
        } else {
            xVar = new C3430x(G.f(f10), C3431y.POINT);
        }
        C3400a.r(this, d.values()[i10], xVar);
    }

    public void a(int i10, int i11) {
        scrollTo(i10, i11);
        E(i10, a.e.API_PRIORITY_OTHER);
    }

    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        if (!this.f41970j || this.f41984x) {
            super.addFocusables(arrayList, i10, i11);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i10, i11);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (C(view) || A(view) || view.isFocused()) {
                arrayList.add(view);
            }
        }
    }

    public boolean arrowScroll(int i10) {
        if (!this.f41970j) {
            return super.arrowScroll(i10);
        }
        boolean z10 = true;
        this.f41984x = true;
        if (getChildCount() > 0) {
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i10);
            View contentView = getContentView();
            if (contentView == null || findNextFocus == null || findNextFocus.getParent() != contentView) {
                J(i10);
            } else {
                if (!C(findNextFocus) && !z(findNextFocus)) {
                    J(i10);
                }
                findNextFocus.requestFocus();
            }
        } else {
            z10 = false;
        }
        this.f41984x = false;
        return z10;
    }

    public void b(int i10, int i11) {
        i.r(this, i10, i11);
        H(i10, i11);
    }

    public void c(int i10, int i11) {
        int i12;
        this.f41954C.cancel();
        int l10 = i.l(getContext());
        this.f41954C.setDuration((long) l10).setIntValues(new int[]{i10, i11});
        this.f41954C.start();
        if (this.f41974n) {
            if (l10 > 0) {
                i12 = (i11 - i10) / l10;
            } else {
                i12 = 0;
            }
            i.i(this, i12, 0);
            i.a(this);
        }
    }

    public boolean canScrollHorizontally(int i10) {
        if (!this.f41973m || !super.canScrollHorizontally(i10)) {
            return false;
        }
        return true;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!H.c(this.f41955D)) {
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        if (this.f41977q != 0) {
            View contentView = getContentView();
            if (!(this.f41976p == null || contentView == null || contentView.getRight() >= getWidth())) {
                this.f41976p.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.f41976p.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f41973m || (keyCode != 21 && keyCode != 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public void fling(int i10) {
        if (f41947f0) {
            U5.a.t(f41948g0, "fling[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i10));
        }
        if (Build.VERSION.SDK_INT == 28) {
            i10 = (int) (((float) Math.abs(i10)) * Math.signum(this.f41962b.a()));
        }
        if (this.f41970j) {
            s(i10);
        } else if (this.f41963c != null) {
            int width = (getWidth() - C1680b0.F(this)) - C1680b0.E(this);
            this.f41963c.fling(getScrollX(), getScrollY(), i10, 0, 0, a.e.API_PRIORITY_OTHER, 0, 0, width / 2, 0);
            C1680b0.f0(this);
        } else {
            super.fling(i10);
        }
        x(i10, 0);
    }

    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    public void getClippingRect(Rect rect) {
        rect.set((Rect) C3863a.c(this.f41967g));
    }

    public ValueAnimator getFlingAnimator() {
        return this.f41954C;
    }

    public long getLastScrollDispatchTime() {
        return this.f41956E;
    }

    public String getOverflow() {
        int i10 = b.f41990a[this.f41968h.ordinal()];
        if (i10 == 1) {
            return "hidden";
        }
        if (i10 == 2) {
            return "scroll";
        }
        if (i10 != 3) {
            return null;
        }
        return "visible";
    }

    public Rect getOverflowInset() {
        return this.f41965e;
    }

    public H getPointerEvents() {
        return this.f41955D;
    }

    public i.g getReactScrollViewScrollState() {
        return this.f41953B;
    }

    public boolean getRemoveClippedSubviews() {
        return this.f41972l;
    }

    public boolean getScrollEnabled() {
        return this.f41973m;
    }

    public int getScrollEventThrottle() {
        return this.f41957F;
    }

    public C3413g0 getStateWrapper() {
        return this.f41952A;
    }

    public void k() {
        OverScroller overScroller = this.f41963c;
        if (overScroller != null && !overScroller.isFinished()) {
            this.f41963c.abortAnimation();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f41972l) {
            updateClippingRect();
        }
        b bVar = this.f41959H;
        if (bVar != null) {
            bVar.f();
        }
    }

    public void onChildViewAdded(View view, View view2) {
        this.f41958G = view2;
        view2.addOnLayoutChangeListener(this);
    }

    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.f41958G;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.f41958G = null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f41959H;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.f41968h != o.VISIBLE) {
            C3400a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f41973m) {
            return false;
        }
        if (motionEvent.getAction() == 0 && p(this, motionEvent) != null) {
            return false;
        }
        if (!H.c(this.f41955D)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                w(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e10) {
            U5.a.J("ReactNative", "Error intercepting touch event.", e10);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        OverScroller overScroller;
        if (f41947f0) {
            U5.a.v(f41948g0, "onLayout[%d] l %d t %d r %d b %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        int i14 = this.f41961a;
        if (!(i14 == f41949h0 || (overScroller = this.f41963c) == null || i14 == overScroller.getFinalX() || this.f41963c.isFinished())) {
            if (f41947f0) {
                U5.a.t(f41948g0, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d", Integer.valueOf(getId()), Integer.valueOf(this.f41961a));
            }
            OverScroller overScroller2 = this.f41963c;
            overScroller2.startScroll(this.f41961a, overScroller2.getFinalY(), 0, 0);
            this.f41963c.forceFinished(true);
            this.f41961a = f41949h0;
        }
        if (y()) {
            int i15 = this.f41985y;
            if (i15 == -1) {
                i15 = getScrollX();
            }
            int i16 = this.f41986z;
            if (i16 == -1) {
                i16 = getScrollY();
            }
            scrollTo(i15, i16);
        }
        i.c(this);
    }

    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f41958G != null) {
            if (view.getLayoutDirection() == 1) {
                l(i10, i12, i14, i16);
            } else {
                b bVar = this.f41959H;
                if (bVar != null) {
                    bVar.h();
                }
            }
            i.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        boolean z10;
        OverScroller overScroller;
        A.a(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (f41947f0) {
            U5.a.u(f41948g0, "onMeasure[%d] measured width: %d measured height: %d", Integer.valueOf(getId()), Integer.valueOf(size), Integer.valueOf(size2));
        }
        if (getMeasuredHeight() != size2) {
            z10 = true;
        } else {
            z10 = false;
        }
        setMeasuredDimension(size, size2);
        if (z10 && (overScroller = this.f41963c) != null) {
            this.f41961a = overScroller.getCurrX();
        }
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        int max;
        if (f41947f0) {
            U5.a.v(f41948g0, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Boolean.valueOf(z11));
        }
        OverScroller overScroller = this.f41963c;
        if (overScroller != null && !overScroller.isFinished() && this.f41963c.getCurrX() != this.f41963c.getFinalX() && i10 >= (max = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            this.f41963c.abortAnimation();
            i10 = max;
        }
        super.onOverScrolled(i10, i11, z10, z11);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (f41947f0) {
            U5.a.v(f41948g0, "onScrollChanged[%d] x %d y %d oldx %d oldy %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        C4236a.c(0, "ReactHorizontalScrollView.onScrollChanged");
        try {
            super.onScrollChanged(i10, i11, i12, i13);
            this.f41966f = true;
            if (this.f41962b.c(i10, i11)) {
                if (this.f41972l) {
                    updateClippingRect();
                }
                i.u(this, this.f41962b.a(), this.f41962b.b());
            }
            C4236a.i(0);
        } catch (Throwable th2) {
            C4236a.i(0);
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.f41972l) {
            updateClippingRect();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f41973m || !H.b(this.f41955D)) {
            return false;
        }
        this.f41964d.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f41969i) {
            i.s(this);
            float b10 = this.f41964d.b();
            float c10 = this.f41964d.c();
            i.e(this, b10, c10);
            k.a(this, motionEvent);
            this.f41969i = false;
            x(Math.round(b10), Math.round(c10));
        }
        if (actionMasked == 0) {
            m();
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean pageScroll(int i10) {
        boolean pageScroll = super.pageScroll(i10);
        if (this.f41970j && pageScroll) {
            x(0, 0);
        }
        return pageScroll;
    }

    public void r() {
        awakenScrollBars();
    }

    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.f41970j) {
            F(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void scrollTo(int i10, int i11) {
        if (f41947f0) {
            U5.a.u(f41948g0, "scrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i10), Integer.valueOf(i11));
        }
        super.scrollTo(i10, i11);
        i.s(this);
        H(i10, i11);
    }

    public void setBackgroundColor(int i10) {
        C3400a.o(this, Integer.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        G(f10, d.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = f.b(str);
        }
        C3400a.s(this, fVar);
    }

    public void setDecelerationRate(float f10) {
        getReactScrollViewScrollState().h(f10);
        OverScroller overScroller = this.f41963c;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f10);
        }
    }

    public void setDisableIntervalMomentum(boolean z10) {
        this.f41978r = z10;
    }

    public void setEndFillColor(int i10) {
        if (i10 != this.f41977q) {
            this.f41977q = i10;
            this.f41976p = new ColorDrawable(this.f41977q);
        }
    }

    public void setLastScrollDispatchTime(long j10) {
        this.f41956E = j10;
    }

    public void setMaintainVisibleContentPosition(b.C0649b bVar) {
        b bVar2;
        if (bVar != null && this.f41959H == null) {
            b bVar3 = new b(this, true);
            this.f41959H = bVar3;
            bVar3.f();
        } else if (bVar == null && (bVar2 = this.f41959H) != null) {
            bVar2.g();
            this.f41959H = null;
        }
        b bVar4 = this.f41959H;
        if (bVar4 != null) {
            bVar4.e(bVar);
        }
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f41968h = o.SCROLL;
        } else {
            o b10 = o.b(str);
            if (b10 == null) {
                b10 = o.SCROLL;
            }
            this.f41968h = b10;
        }
        invalidate();
    }

    public void setOverflowInset(int i10, int i11, int i12, int i13) {
        this.f41965e.set(i10, i11, i12, i13);
    }

    public void setPagingEnabled(boolean z10) {
        this.f41970j = z10;
    }

    public void setPointerEvents(H h10) {
        this.f41955D = h10;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 && this.f41967g == null) {
            this.f41967g = new Rect();
        }
        this.f41972l = z10;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z10) {
        this.f41973m = z10;
    }

    public void setScrollEventThrottle(int i10) {
        this.f41957F = i10;
    }

    public void setScrollPerfTag(String str) {
        this.f41975o = str;
    }

    public void setSendMomentumEvents(boolean z10) {
        this.f41974n = z10;
    }

    public void setSnapInterval(int i10) {
        this.f41979s = i10;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f41980t = list;
    }

    public void setSnapToAlignment(int i10) {
        this.f41983w = i10;
    }

    public void setSnapToEnd(boolean z10) {
        this.f41982v = z10;
    }

    public void setSnapToStart(boolean z10) {
        this.f41981u = z10;
    }

    public void setStateWrapper(C3413g0 g0Var) {
        this.f41952A = g0Var;
    }

    public int t(int i10) {
        return i.p(this, i10, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x;
    }

    public void updateClippingRect() {
        if (this.f41972l) {
            C4236a.c(0, "ReactHorizontalScrollView.updateClippingRect");
            try {
                C3863a.c(this.f41967g);
                L.a(this, this.f41967g);
                View contentView = getContentView();
                if (contentView instanceof K) {
                    ((K) contentView).updateClippingRect();
                }
            } finally {
                C4236a.i(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void w(MotionEvent motionEvent) {
        k.b(this, motionEvent);
        i.d(this);
        this.f41969i = true;
        o();
        getFlingAnimator().cancel();
    }
}
