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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C1680b0;
import com.facebook.react.C3367m;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
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
import j8.o;
import java.lang.reflect.Field;
import java.util.List;
import n7.C3863a;
import z8.C4236a;

public class f extends ScrollView implements K, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, P, i.c, i.e, i.a, i.b, i.d {

    /* renamed from: I  reason: collision with root package name */
    private static Field f41991I = null;

    /* renamed from: f0  reason: collision with root package name */
    private static boolean f41992f0 = false;

    /* renamed from: A  reason: collision with root package name */
    private int f41993A = -1;

    /* renamed from: B  reason: collision with root package name */
    private C3413g0 f41994B = null;

    /* renamed from: C  reason: collision with root package name */
    private final i.g f41995C = new i.g();

    /* renamed from: D  reason: collision with root package name */
    private final ValueAnimator f41996D = ObjectAnimator.ofInt(this, "scrollY", new int[]{0, 0});

    /* renamed from: E  reason: collision with root package name */
    private H f41997E = H.AUTO;

    /* renamed from: F  reason: collision with root package name */
    private long f41998F = 0;

    /* renamed from: G  reason: collision with root package name */
    private int f41999G = 0;

    /* renamed from: H  reason: collision with root package name */
    private b f42000H = null;

    /* renamed from: a  reason: collision with root package name */
    private final c f42001a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final OverScroller f42002b = getOverScrollerFromParent();

    /* renamed from: c  reason: collision with root package name */
    private final l f42003c = new l();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f42004d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f42005e = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f42006f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f42007g;

    /* renamed from: h  reason: collision with root package name */
    private o f42008h = o.SCROLL;

    /* renamed from: i  reason: collision with root package name */
    private boolean f42009i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f42010j = false;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public Runnable f42011k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f42012l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f42013m = true;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f42014n;

    /* renamed from: o  reason: collision with root package name */
    private String f42015o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f42016p;

    /* renamed from: q  reason: collision with root package name */
    private int f42017q = 0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f42018r = false;

    /* renamed from: s  reason: collision with root package name */
    private int f42019s = 0;

    /* renamed from: t  reason: collision with root package name */
    private List f42020t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f42021u = true;

    /* renamed from: v  reason: collision with root package name */
    private boolean f42022v = true;

    /* renamed from: w  reason: collision with root package name */
    private int f42023w = 0;

    /* renamed from: x  reason: collision with root package name */
    private View f42024x;

    /* renamed from: y  reason: collision with root package name */
    private ReadableMap f42025y = null;

    /* renamed from: z  reason: collision with root package name */
    private int f42026z = -1;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private boolean f42027a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f42028b = 0;

        a() {
        }

        public void run() {
            NativeAnimatedModule nativeAnimatedModule;
            if (f.this.f42006f) {
                f.this.f42006f = false;
                this.f42028b = 0;
                C1680b0.h0(f.this, this, 20);
                return;
            }
            i.s(f.this);
            int i10 = this.f42028b + 1;
            this.f42028b = i10;
            if (i10 >= 3) {
                f.this.f42011k = null;
                if (f.this.f42014n) {
                    i.j(f.this);
                }
                ReactContext reactContext = (ReactContext) f.this.getContext();
                if (!(reactContext == null || (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) == null)) {
                    nativeAnimatedModule.userDrivenScrollEnded(f.this.getId());
                }
                f.this.n();
                return;
            }
            if (f.this.f42010j && !this.f42027a) {
                this.f42027a = true;
                f.this.q(0);
            }
            C1680b0.h0(f.this, this, 20);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f42030a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                j8.o[] r0 = j8.o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42030a = r0
                j8.o r1 = j8.o.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42030a     // Catch:{ NoSuchFieldError -> 0x001d }
                j8.o r1 = j8.o.SCROLL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42030a     // Catch:{ NoSuchFieldError -> 0x0028 }
                j8.o r1 = j8.o.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.f.b.<clinit>():void");
        }
    }

    public f(Context context, a aVar) {
        super(context);
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        C1680b0.o0(this, new g());
    }

    private void A(int i10) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.f42002b;
        if (overScroller != null && !overScroller.isFinished()) {
            int currY = this.f42002b.getCurrY();
            boolean computeScrollOffset = this.f42002b.computeScrollOffset();
            this.f42002b.forceFinished(true);
            if (computeScrollOffset) {
                int i11 = i10;
                this.f42002b.fling(getScrollX(), i11, 0, (int) (this.f42002b.getCurrVelocity() * Math.signum((float) (this.f42002b.getFinalY() - this.f42002b.getStartY()))), 0, 0, 0, a.e.API_PRIORITY_OTHER);
                return;
            }
            scrollTo(getScrollX(), i10 + (this.f42002b.getCurrX() - currY));
        }
    }

    private void B(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private void D(int i10, int i11) {
        if (w()) {
            this.f42026z = -1;
            this.f41993A = -1;
            return;
        }
        this.f42026z = i10;
        this.f41993A = i11;
    }

    private void E(int i10) {
        double snapInterval = (double) getSnapInterval();
        double m10 = (double) i.m(this, getScrollY(), getReactScrollViewScrollState().b().y, i10);
        double d10 = m10 / snapInterval;
        int floor = (int) Math.floor(d10);
        int ceil = (int) Math.ceil(d10);
        int round = (int) Math.round(d10);
        int round2 = (int) Math.round(((double) z(i10)) / snapInterval);
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
            this.f42006f = true;
            b(getScrollX(), (int) d11);
        }
    }

    private void F(int i10) {
        getReactScrollViewScrollState().l(i10);
        i.k(this);
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getMaxScrollY() {
        int i10;
        View view = this.f42024x;
        if (view == null) {
            i10 = 0;
        } else {
            i10 = view.getHeight();
        }
        return Math.max(0, i10 - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!f41992f0) {
            f41992f0 = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                f41991I = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                U5.a.I("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = f41991I;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            U5.a.I("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to get mScroller from ScrollView!", e10);
        }
    }

    private int getSnapInterval() {
        int i10 = this.f42019s;
        if (i10 != 0) {
            return i10;
        }
        return getHeight();
    }

    private void l() {
        Runnable runnable = this.f42011k;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f42011k = null;
            getFlingAnimator().cancel();
        }
    }

    private int m(int i10) {
        if (Build.VERSION.SDK_INT != 28) {
            return i10;
        }
        float signum = Math.signum(this.f42001a.b());
        if (signum == 0.0f) {
            signum = Math.signum((float) i10);
        }
        return (int) (((float) Math.abs(i10)) * signum);
    }

    /* access modifiers changed from: private */
    public void n() {
        if (y()) {
            C3863a.c((Object) null);
            C3863a.c(this.f42015o);
            throw null;
        }
    }

    private void o() {
        if (y()) {
            C3863a.c((Object) null);
            C3863a.c(this.f42015o);
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(int r28) {
        /*
            r27 = this;
            r0 = r27
            int r1 = r27.getChildCount()
            if (r1 > 0) goto L_0x0009
            return
        L_0x0009:
            int r1 = r0.f42019s
            if (r1 != 0) goto L_0x0019
            java.util.List r1 = r0.f42020t
            if (r1 != 0) goto L_0x0019
            int r1 = r0.f42023w
            if (r1 != 0) goto L_0x0019
            r27.E(r28)
            return
        L_0x0019:
            android.animation.ValueAnimator r1 = r27.getFlingAnimator()
            android.animation.ValueAnimator r2 = r0.f41996D
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L_0x0025
            r1 = r3
            goto L_0x0026
        L_0x0025:
            r1 = r4
        L_0x0026:
            int r2 = r27.getMaxScrollY()
            int r5 = r27.z(r28)
            boolean r6 = r0.f42018r
            if (r6 == 0) goto L_0x0036
            int r5 = r27.getScrollY()
        L_0x0036:
            int r6 = r27.getHeight()
            int r7 = r27.getPaddingBottom()
            int r6 = r6 - r7
            int r7 = r27.getPaddingTop()
            int r6 = r6 - r7
            java.util.List r7 = r0.f42020t
            r8 = 2
            if (r7 == 0) goto L_0x0090
            java.lang.Object r7 = r7.get(r4)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.util.List r9 = r0.f42020t
            int r10 = r9.size()
            int r10 = r10 - r3
            java.lang.Object r9 = r9.get(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r12 = r2
            r10 = r4
            r11 = r10
        L_0x0067:
            java.util.List r13 = r0.f42020t
            int r13 = r13.size()
            if (r10 >= r13) goto L_0x015a
            java.util.List r13 = r0.f42020t
            java.lang.Object r13 = r13.get(r10)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            if (r13 > r5) goto L_0x0084
            int r14 = r5 - r13
            int r15 = r5 - r11
            if (r14 >= r15) goto L_0x0084
            r11 = r13
        L_0x0084:
            if (r13 < r5) goto L_0x008d
            int r14 = r13 - r5
            int r15 = r12 - r5
            if (r14 >= r15) goto L_0x008d
            r12 = r13
        L_0x008d:
            int r10 = r10 + 1
            goto L_0x0067
        L_0x0090:
            int r7 = r0.f42023w
            if (r7 == 0) goto L_0x013f
            int r9 = r0.f42019s
            if (r9 <= 0) goto L_0x00c4
            double r10 = (double) r5
            double r12 = (double) r9
            double r10 = r10 / r12
            double r12 = java.lang.Math.floor(r10)
            int r9 = r0.f42019s
            double r14 = (double) r9
            double r12 = r12 * r14
            int r12 = (int) r12
            int r7 = r0.s(r7, r12, r9, r6)
            int r7 = java.lang.Math.max(r7, r4)
            int r9 = r0.f42023w
            double r10 = java.lang.Math.ceil(r10)
            int r12 = r0.f42019s
            double r13 = (double) r12
            double r10 = r10 * r13
            int r10 = (int) r10
            int r9 = r0.s(r9, r10, r12, r6)
            int r12 = java.lang.Math.min(r9, r2)
            r9 = r2
            r11 = r7
        L_0x00c1:
            r7 = r4
            goto L_0x015a
        L_0x00c4:
            android.view.View r7 = r27.getContentView()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r11 = r2
            r12 = r11
            r9 = r4
            r10 = r9
            r13 = r10
        L_0x00cf:
            int r14 = r7.getChildCount()
            if (r9 >= r14) goto L_0x0135
            android.view.View r14 = r7.getChildAt(r9)
            int r15 = r0.f42023w
            if (r15 == r3) goto L_0x0113
            if (r15 == r8) goto L_0x0107
            r3 = 3
            if (r15 != r3) goto L_0x00ee
            int r3 = r14.getTop()
            int r14 = r14.getHeight()
            int r14 = r6 - r14
        L_0x00ec:
            int r3 = r3 - r14
            goto L_0x0117
        L_0x00ee:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid SnapToAlignment value: "
            r2.append(r3)
            int r3 = r0.f42023w
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0107:
            int r3 = r14.getTop()
            int r14 = r14.getHeight()
            int r14 = r6 - r14
            int r14 = r14 / r8
            goto L_0x00ec
        L_0x0113:
            int r3 = r14.getTop()
        L_0x0117:
            if (r3 > r5) goto L_0x0120
            int r14 = r5 - r3
            int r15 = r5 - r10
            if (r14 >= r15) goto L_0x0120
            r10 = r3
        L_0x0120:
            if (r3 < r5) goto L_0x0129
            int r14 = r3 - r5
            int r15 = r12 - r5
            if (r14 >= r15) goto L_0x0129
            r12 = r3
        L_0x0129:
            int r11 = java.lang.Math.min(r11, r3)
            int r13 = java.lang.Math.max(r13, r3)
            int r9 = r9 + 1
            r3 = 1
            goto L_0x00cf
        L_0x0135:
            int r11 = java.lang.Math.max(r10, r11)
            int r12 = java.lang.Math.min(r12, r13)
            r9 = r2
            goto L_0x00c1
        L_0x013f:
            int r3 = r27.getSnapInterval()
            double r9 = (double) r3
            double r11 = (double) r5
            double r11 = r11 / r9
            double r13 = java.lang.Math.floor(r11)
            double r13 = r13 * r9
            int r3 = (int) r13
            double r11 = java.lang.Math.ceil(r11)
            double r11 = r11 * r9
            int r7 = (int) r11
            int r12 = java.lang.Math.min(r7, r2)
            r9 = r2
            r11 = r3
            goto L_0x00c1
        L_0x015a:
            int r3 = r5 - r11
            int r10 = java.lang.Math.abs(r3)
            int r13 = r12 - r5
            int r14 = java.lang.Math.abs(r13)
            if (r10 >= r14) goto L_0x016a
            r10 = r11
            goto L_0x016b
        L_0x016a:
            r10 = r12
        L_0x016b:
            boolean r14 = r0.f42022v
            if (r14 != 0) goto L_0x017c
            if (r5 < r9) goto L_0x017c
            int r3 = r27.getScrollY()
            if (r3 < r9) goto L_0x0178
            goto L_0x0188
        L_0x0178:
            r3 = r28
            r5 = r9
            goto L_0x01b0
        L_0x017c:
            boolean r9 = r0.f42021u
            if (r9 != 0) goto L_0x018f
            if (r5 > r7) goto L_0x018f
            int r3 = r27.getScrollY()
            if (r3 > r7) goto L_0x018b
        L_0x0188:
            r3 = r28
            goto L_0x01b0
        L_0x018b:
            r3 = r28
            r5 = r7
            goto L_0x01b0
        L_0x018f:
            r14 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r28 <= 0) goto L_0x019f
            if (r1 != 0) goto L_0x019b
            double r9 = (double) r13
            double r9 = r9 * r14
            int r3 = (int) r9
            int r3 = r28 + r3
            goto L_0x019d
        L_0x019b:
            r3 = r28
        L_0x019d:
            r5 = r12
            goto L_0x01b0
        L_0x019f:
            if (r28 >= 0) goto L_0x01ad
            if (r1 != 0) goto L_0x01a9
            double r9 = (double) r3
            double r9 = r9 * r14
            int r3 = (int) r9
            int r3 = r28 - r3
            goto L_0x01ab
        L_0x01a9:
            r3 = r28
        L_0x01ab:
            r5 = r11
            goto L_0x01b0
        L_0x01ad:
            r3 = r28
            r5 = r10
        L_0x01b0:
            int r5 = java.lang.Math.max(r4, r5)
            int r5 = java.lang.Math.min(r5, r2)
            if (r1 != 0) goto L_0x01f6
            android.widget.OverScroller r1 = r0.f42002b
            if (r1 != 0) goto L_0x01bf
            goto L_0x01f6
        L_0x01bf:
            r7 = 1
            r0.f42006f = r7
            int r17 = r27.getScrollX()
            int r18 = r27.getScrollY()
            if (r3 == 0) goto L_0x01cf
        L_0x01cc:
            r20 = r3
            goto L_0x01d6
        L_0x01cf:
            int r3 = r27.getScrollY()
            int r3 = r5 - r3
            goto L_0x01cc
        L_0x01d6:
            if (r5 == 0) goto L_0x01de
            if (r5 != r2) goto L_0x01db
            goto L_0x01de
        L_0x01db:
            r26 = r4
            goto L_0x01e1
        L_0x01de:
            int r4 = r6 / 2
            goto L_0x01db
        L_0x01e1:
            r19 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r16 = r1
            r23 = r5
            r24 = r5
            r16.fling(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r27.postInvalidateOnAnimation()
            goto L_0x01fd
        L_0x01f6:
            int r1 = r27.getScrollX()
            r0.b(r1, r5)
        L_0x01fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.f.q(int):void");
    }

    private int s(int i10, int i11, int i12, int i13) {
        int i14;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            i14 = (i13 - i12) / 2;
        } else if (i10 == 3) {
            i14 = i13 - i12;
        } else {
            throw new IllegalStateException("Invalid SnapToAlignment value: " + this.f42023w);
        }
        return i11 - i14;
    }

    private int t(View view) {
        view.getDrawingRect(this.f42004d);
        offsetDescendantRectToMyCoords(view, this.f42004d);
        return computeScrollDeltaToGetChildRectOnScreen(this.f42004d);
    }

    private void v(int i10, int i11) {
        if (this.f42011k == null) {
            if (this.f42014n) {
                o();
                i.i(this, i10, i11);
            }
            this.f42006f = false;
            a aVar = new a();
            this.f42011k = aVar;
            C1680b0.h0(this, aVar, 20);
        }
    }

    private boolean w() {
        View contentView = getContentView();
        if (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) {
            return false;
        }
        return true;
    }

    private boolean y() {
        return false;
    }

    private int z(int i10) {
        if (getFlingAnimator() == this.f41996D) {
            return i.p(this, 0, i10, 0, getMaxScrollY()).y;
        }
        return r(i10) + i.m(this, getScrollY(), getReactScrollViewScrollState().b().y, i10);
    }

    public void C(float f10, int i10) {
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
        A(i11);
    }

    public void b(int i10, int i11) {
        i.r(this, i10, i11);
        D(i10, i11);
    }

    public void c(int i10, int i11) {
        int i12;
        this.f41996D.cancel();
        int l10 = i.l(getContext());
        this.f41996D.setDuration((long) l10).setIntValues(new int[]{i10, i11});
        this.f41996D.start();
        if (this.f42014n) {
            if (l10 > 0) {
                i12 = (i11 - i10) / l10;
            } else {
                i12 = 0;
            }
            i.i(this, 0, i12);
            i.a(this);
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!H.c(this.f41997E)) {
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        if (this.f42017q != 0) {
            View contentView = getContentView();
            if (!(this.f42016p == null || contentView == null || contentView.getBottom() >= getHeight())) {
                this.f42016p.setBounds(0, contentView.getBottom(), getWidth(), getHeight());
                this.f42016p.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f42013m || (keyCode != 19 && keyCode != 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public void fling(int i10) {
        int m10 = m(i10);
        if (this.f42010j) {
            q(m10);
        } else if (this.f42002b != null) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            this.f42002b.fling(getScrollX(), getScrollY(), 0, m10, 0, 0, 0, a.e.API_PRIORITY_OTHER, 0, height / 2);
            C1680b0.f0(this);
        } else {
            super.fling(m10);
        }
        v(0, m10);
    }

    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    public void getClippingRect(Rect rect) {
        rect.set((Rect) C3863a.c(this.f42007g));
    }

    public ValueAnimator getFlingAnimator() {
        return this.f41996D;
    }

    public long getLastScrollDispatchTime() {
        return this.f41998F;
    }

    public String getOverflow() {
        int i10 = b.f42030a[this.f42008h.ordinal()];
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
        return this.f42005e;
    }

    public H getPointerEvents() {
        return this.f41997E;
    }

    public i.g getReactScrollViewScrollState() {
        return this.f41995C;
    }

    public boolean getRemoveClippedSubviews() {
        return this.f42012l;
    }

    public boolean getScrollEnabled() {
        return this.f42013m;
    }

    public int getScrollEventThrottle() {
        return this.f41999G;
    }

    public C3413g0 getStateWrapper() {
        return this.f41994B;
    }

    public void k() {
        OverScroller overScroller = this.f42002b;
        if (overScroller != null && !overScroller.isFinished()) {
            this.f42002b.abortAnimation();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f42012l) {
            updateClippingRect();
        }
        b bVar = this.f42000H;
        if (bVar != null) {
            bVar.f();
        }
    }

    public void onChildViewAdded(View view, View view2) {
        this.f42024x = view2;
        view2.addOnLayoutChangeListener(this);
    }

    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.f42024x;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.f42024x = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f42000H;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.f42008h != o.VISIBLE) {
            C3400a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(C3367m.f40944t);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f42013m) {
            return false;
        }
        if (!H.c(this.f41997E)) {
            return true;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                u(motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e10) {
            U5.a.J("ReactNative", "Error intercepting touch event.", e10);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (w()) {
            int i14 = this.f42026z;
            if (i14 == -1) {
                i14 = getScrollX();
            }
            int i15 = this.f41993A;
            if (i15 == -1) {
                i15 = getScrollY();
            }
            scrollTo(i14, i15);
        }
        i.c(this);
    }

    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int maxScrollY;
        if (this.f42024x != null) {
            b bVar = this.f42000H;
            if (bVar != null) {
                bVar.h();
            }
            if (isShown() && w() && getScrollY() > (maxScrollY = getMaxScrollY())) {
                scrollTo(getScrollX(), maxScrollY);
            }
            i.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        A.a(i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        int maxScrollY;
        OverScroller overScroller = this.f42002b;
        if (!(overScroller == null || this.f42024x == null || overScroller.isFinished() || this.f42002b.getCurrY() == this.f42002b.getFinalY() || i11 < (maxScrollY = getMaxScrollY()))) {
            this.f42002b.abortAnimation();
            i11 = maxScrollY;
        }
        super.onOverScrolled(i10, i11, z10, z11);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        C4236a.c(0, "ReactScrollView.onScrollChanged");
        try {
            super.onScrollChanged(i10, i11, i12, i13);
            this.f42006f = true;
            if (this.f42001a.c(i10, i11)) {
                if (this.f42012l) {
                    updateClippingRect();
                }
                i.u(this, this.f42001a.a(), this.f42001a.b());
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
        if (this.f42012l) {
            updateClippingRect();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f42013m || !H.b(this.f41997E)) {
            return false;
        }
        this.f42003c.a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.f42009i) {
            i.s(this);
            float b10 = this.f42003c.b();
            float c10 = this.f42003c.c();
            i.e(this, b10, c10);
            k.a(this, motionEvent);
            this.f42009i = false;
            v(Math.round(b10), Math.round(c10));
        }
        if (actionMasked == 0) {
            l();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        awakenScrollBars();
    }

    public int r(int i10) {
        return i.p(this, 0, i10, 0, getMaxScrollY()).y;
    }

    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            B(view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void scrollTo(int i10, int i11) {
        super.scrollTo(i10, i11);
        i.s(this);
        D(i10, i11);
    }

    public void setBackgroundColor(int i10) {
        C3400a.o(this, Integer.valueOf(i10));
    }

    public void setBorderRadius(float f10) {
        C(f10, d.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        j8.f fVar;
        if (str == null) {
            fVar = null;
        } else {
            fVar = j8.f.b(str);
        }
        C3400a.s(this, fVar);
    }

    public void setContentOffset(ReadableMap readableMap) {
        double d10;
        ReadableMap readableMap2 = this.f42025y;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.f42025y = readableMap;
            if (readableMap != null) {
                double d11 = 0.0d;
                if (readableMap.hasKey("x")) {
                    d10 = readableMap.getDouble("x");
                } else {
                    d10 = 0.0d;
                }
                if (readableMap.hasKey("y")) {
                    d11 = readableMap.getDouble("y");
                }
                scrollTo((int) G.g(d10), (int) G.g(d11));
                return;
            }
            scrollTo(0, 0);
        }
    }

    public void setDecelerationRate(float f10) {
        getReactScrollViewScrollState().h(f10);
        OverScroller overScroller = this.f42002b;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f10);
        }
    }

    public void setDisableIntervalMomentum(boolean z10) {
        this.f42018r = z10;
    }

    public void setEndFillColor(int i10) {
        if (i10 != this.f42017q) {
            this.f42017q = i10;
            this.f42016p = new ColorDrawable(this.f42017q);
        }
    }

    public void setLastScrollDispatchTime(long j10) {
        this.f41998F = j10;
    }

    public void setMaintainVisibleContentPosition(b.C0649b bVar) {
        b bVar2;
        if (bVar != null && this.f42000H == null) {
            b bVar3 = new b(this, false);
            this.f42000H = bVar3;
            bVar3.f();
        } else if (bVar == null && (bVar2 = this.f42000H) != null) {
            bVar2.g();
            this.f42000H = null;
        }
        b bVar4 = this.f42000H;
        if (bVar4 != null) {
            bVar4.e(bVar);
        }
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f42008h = o.SCROLL;
        } else {
            o b10 = o.b(str);
            if (b10 == null) {
                b10 = o.SCROLL;
            }
            this.f42008h = b10;
        }
        invalidate();
    }

    public void setOverflowInset(int i10, int i11, int i12, int i13) {
        this.f42005e.set(i10, i11, i12, i13);
    }

    public void setPagingEnabled(boolean z10) {
        this.f42010j = z10;
    }

    public void setPointerEvents(H h10) {
        this.f41997E = h10;
    }

    public void setRemoveClippedSubviews(boolean z10) {
        if (z10 && this.f42007g == null) {
            this.f42007g = new Rect();
        }
        this.f42012l = z10;
        updateClippingRect();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i10) {
        int childCount = getChildCount();
        boolean z10 = true;
        if (childCount > 1) {
            z10 = false;
        }
        C3863a.b(z10, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setTranslationY((float) i10);
            }
            setPadding(0, 0, 0, i10);
        }
        F(i10);
        setRemoveClippedSubviews(this.f42012l);
    }

    public void setScrollEnabled(boolean z10) {
        this.f42013m = z10;
    }

    public void setScrollEventThrottle(int i10) {
        this.f41999G = i10;
    }

    public void setScrollPerfTag(String str) {
        this.f42015o = str;
    }

    public void setSendMomentumEvents(boolean z10) {
        this.f42014n = z10;
    }

    public void setSnapInterval(int i10) {
        this.f42019s = i10;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.f42020t = list;
    }

    public void setSnapToAlignment(int i10) {
        this.f42023w = i10;
    }

    public void setSnapToEnd(boolean z10) {
        this.f42022v = z10;
    }

    public void setSnapToStart(boolean z10) {
        this.f42021u = z10;
    }

    public void setStateWrapper(C3413g0 g0Var) {
        this.f41994B = g0Var;
    }

    /* access modifiers changed from: protected */
    public void u(MotionEvent motionEvent) {
        k.b(this, motionEvent);
        i.d(this);
        this.f42009i = true;
        o();
        getFlingAnimator().cancel();
    }

    public void updateClippingRect() {
        if (this.f42012l) {
            C4236a.c(0, "ReactScrollView.updateClippingRect");
            try {
                C3863a.c(this.f42007g);
                L.a(this, this.f42007g);
                View contentView = getContentView();
                if (contentView instanceof K) {
                    ((K) contentView).updateClippingRect();
                }
            } finally {
                C4236a.i(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean x(View view) {
        int t10 = t(view);
        view.getDrawingRect(this.f42004d);
        if (t10 == 0 || Math.abs(t10) >= this.f42004d.width()) {
            return false;
        }
        return true;
    }
}
