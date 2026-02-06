package com.facebook.react;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.C3405c0;
import com.facebook.react.uimanager.C3406d;
import com.facebook.react.uimanager.C3407d0;
import com.facebook.react.uimanager.C3408e;
import com.facebook.react.uimanager.C3425s;
import com.facebook.react.uimanager.C3426t;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.S;
import com.facebook.react.uimanager.T;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import f8.C3519a;
import java.util.concurrent.atomic.AtomicInteger;
import n7.C3863a;
import z8.C4236a;

public class Z extends FrameLayout implements C3405c0, S {

    /* renamed from: a  reason: collision with root package name */
    private J f40310a;

    /* renamed from: b  reason: collision with root package name */
    private String f40311b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f40312c;

    /* renamed from: d  reason: collision with root package name */
    private a f40313d;

    /* renamed from: e  reason: collision with root package name */
    private int f40314e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40315f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f40316g;

    /* renamed from: h  reason: collision with root package name */
    private C3426t f40317h;

    /* renamed from: i  reason: collision with root package name */
    private C3425s f40318i;

    /* renamed from: j  reason: collision with root package name */
    private final C3445w f40319j = new C3445w(this);

    /* renamed from: k  reason: collision with root package name */
    private boolean f40320k = false;

    /* renamed from: l  reason: collision with root package name */
    private int f40321l = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* renamed from: m  reason: collision with root package name */
    private int f40322m = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* renamed from: n  reason: collision with root package name */
    private int f40323n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f40324o = 0;

    /* renamed from: p  reason: collision with root package name */
    private int f40325p = Integer.MIN_VALUE;

    /* renamed from: q  reason: collision with root package name */
    private int f40326q = Integer.MIN_VALUE;

    /* renamed from: r  reason: collision with root package name */
    private int f40327r = 1;

    /* renamed from: s  reason: collision with root package name */
    private final AtomicInteger f40328s = new AtomicInteger(0);

    private class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f40329a;

        /* renamed from: b  reason: collision with root package name */
        private final int f40330b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f40331c = false;

        /* renamed from: d  reason: collision with root package name */
        private int f40332d = 0;

        /* renamed from: e  reason: collision with root package name */
        private int f40333e = 0;

        a() {
            C3408e.g(Z.this.getContext().getApplicationContext());
            this.f40329a = new Rect();
            this.f40330b = (int) G.h(60.0f);
        }

        private void a() {
            g();
        }

        private void b() {
            int rotation = ((WindowManager) Z.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f40333e != rotation) {
                this.f40333e = rotation;
                C3408e.f(Z.this.getContext().getApplicationContext());
                f(rotation);
            }
        }

        private void c() {
            boolean a10;
            int i10;
            Z.this.getRootView().getWindowVisibleDisplayFrame(this.f40329a);
            WindowInsets rootWindowInsets = Z.this.getRootView().getRootWindowInsets();
            if (rootWindowInsets != null && (a10 = rootWindowInsets.isVisible(WindowInsets.Type.ime())) != this.f40331c) {
                this.f40331c = a10;
                if (a10) {
                    int a11 = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom - rootWindowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
                    ViewGroup.LayoutParams layoutParams = Z.this.getRootView().getLayoutParams();
                    C3863a.a(layoutParams instanceof WindowManager.LayoutParams);
                    if (((WindowManager.LayoutParams) layoutParams).softInputMode == 48) {
                        i10 = this.f40329a.bottom - a11;
                    } else {
                        i10 = this.f40329a.bottom;
                    }
                    Z.this.p("keyboardDidShow", e((double) G.f((float) i10), (double) G.f((float) this.f40329a.left), (double) G.f((float) this.f40329a.width()), (double) G.f((float) a11)));
                    return;
                }
                Z.this.p("keyboardDidHide", e((double) G.f((float) this.f40329a.height()), 0.0d, (double) G.f((float) this.f40329a.width()), 0.0d));
            }
        }

        private void d() {
            int i10;
            WindowInsets rootWindowInsets;
            DisplayCutout a10;
            Z.this.getRootView().getWindowVisibleDisplayFrame(this.f40329a);
            if (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = Z.this.getRootView().getRootWindowInsets()) == null || (a10 = rootWindowInsets.getDisplayCutout()) == null) {
                i10 = 0;
            } else {
                i10 = a10.getSafeInsetTop();
            }
            int i11 = C3408e.e().heightPixels;
            Rect rect = this.f40329a;
            int i12 = rect.bottom;
            int i13 = (i11 - i12) + i10;
            int i14 = this.f40332d;
            if (i14 != i13 && i13 > this.f40330b) {
                this.f40332d = i13;
                this.f40331c = true;
                Z.this.p("keyboardDidShow", e((double) G.f((float) i12), (double) G.f((float) this.f40329a.left), (double) G.f((float) this.f40329a.width()), (double) G.f((float) this.f40332d)));
            } else if (i14 != 0 && i13 <= this.f40330b) {
                this.f40332d = 0;
                this.f40331c = false;
                Z.this.p("keyboardDidHide", e((double) G.f((float) rect.height()), 0.0d, (double) G.f((float) this.f40329a.width()), 0.0d));
            }
        }

        private WritableMap e(double d10, double d11, double d12, double d13) {
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble(Snapshot.HEIGHT, d13);
            createMap2.putDouble("screenX", d11);
            createMap2.putDouble(Snapshot.WIDTH, d12);
            createMap2.putDouble("screenY", d10);
            createMap.putMap("endCoordinates", createMap2);
            createMap.putString("easing", "keyboard");
            createMap.putDouble("duration", 0.0d);
            return createMap;
        }

        private void f(int i10) {
            String str;
            double d10;
            boolean z10 = false;
            if (i10 != 0) {
                if (i10 == 1) {
                    str = "landscape-primary";
                    d10 = -90.0d;
                } else if (i10 == 2) {
                    str = "portrait-secondary";
                    d10 = 180.0d;
                } else if (i10 == 3) {
                    str = "landscape-secondary";
                    d10 = 90.0d;
                } else {
                    return;
                }
                z10 = true;
            } else {
                str = "portrait-primary";
                d10 = 0.0d;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("name", str);
            createMap.putDouble("rotationDegrees", d10);
            createMap.putBoolean("isLandscape", z10);
            Z.this.p("namedOrientationDidChange", createMap);
        }

        private void g() {
            DeviceInfoModule deviceInfoModule;
            ReactContext currentReactContext = Z.this.getCurrentReactContext();
            if (currentReactContext != null && (deviceInfoModule = (DeviceInfoModule) currentReactContext.getNativeModule(DeviceInfoModule.class)) != null) {
                deviceInfoModule.emitUpdateDimensionsEvent();
            }
        }

        public void onGlobalLayout() {
            if (Z.this.g() && Z.this.m()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    c();
                } else {
                    d();
                }
                b();
                a();
            }
        }
    }

    public interface b {
    }

    public Z(Context context) {
        super(context);
        i();
    }

    private void c() {
        C4236a.c(0, "attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactRootView", new r("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID."));
        }
        try {
            if (!this.f40315f) {
                this.f40315f = true;
                ((J) C3863a.c(this.f40310a)).t(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
                ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
                C4236a.i(0);
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
            C4236a.i(0);
        }
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f40313d == null) {
            this.f40313d = new a();
        }
        return this.f40313d;
    }

    private void i() {
        setRootViewTag(T.a());
        setClipChildren(false);
    }

    private boolean j() {
        if (!g() || !m()) {
            U5.a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return false;
        } else if (this.f40317h == null) {
            U5.a.I("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
            return false;
        } else if (!ReactFeatureFlags.dispatchPointerEvents || this.f40318i != null) {
            return true;
        } else {
            U5.a.I("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
            return false;
        }
    }

    private boolean k() {
        if (getUIManagerType() == 2) {
            return true;
        }
        return false;
    }

    private boolean l() {
        int i10 = this.f40314e;
        if (i10 == 0 || i10 == -1) {
            return false;
        }
        return true;
    }

    private void o() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void q() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f40321l = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
        this.f40322m = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
    }

    private void u(boolean z10, int i10, int i11) {
        UIManager g10;
        int i12;
        int i13;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (!h()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            U5.a.I("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean k10 = k();
        if (!k10 || l()) {
            ReactContext currentReactContext = getCurrentReactContext();
            if (!(currentReactContext == null || (g10 = n0.g(currentReactContext, getUIManagerType())) == null)) {
                if (k10) {
                    Point b10 = C3407d0.b(this);
                    i12 = b10.x;
                    i13 = b10.y;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                if (!(!z10 && i12 == this.f40325p && i13 == this.f40326q)) {
                    g10.updateRootLayoutSpecs(getRootViewTag(), i10, i11, i12, i13);
                }
                this.f40325p = i12;
                this.f40326q = i13;
            }
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            return;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
        U5.a.m("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
    }

    public void a(int i10) {
        if (i10 == 101) {
            n();
        }
    }

    public void b() {
        C4236a.c(0, "ReactRootView.runApplication");
        try {
            if (h()) {
                if (m()) {
                    ReactContext currentReactContext = getCurrentReactContext();
                    if (currentReactContext == null) {
                        C4236a.i(0);
                        return;
                    }
                    CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                    String jSModuleName = getJSModuleName();
                    if (this.f40320k) {
                        u(true, this.f40321l, this.f40322m);
                    }
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("rootTag", (double) getRootViewTag());
                    Bundle appProperties = getAppProperties();
                    if (appProperties != null) {
                        writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                    }
                    this.f40316g = true;
                    ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
                    C4236a.i(0);
                }
            }
        } finally {
            C4236a.i(0);
        }
    }

    /* access modifiers changed from: protected */
    public void d(MotionEvent motionEvent, boolean z10) {
        if (!g() || !m()) {
            U5.a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.f40318i != null) {
            EventDispatcher b10 = n0.b(getCurrentReactContext(), getUIManagerType());
            if (b10 != null) {
                this.f40318i.k(motionEvent, b10, z10);
            }
        } else if (ReactFeatureFlags.dispatchPointerEvents) {
            U5.a.I("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e10) {
            f(e10);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!g() || !m()) {
            U5.a.I("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f40319j.d(keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j10) {
        BlendMode blendMode;
        if (Build.VERSION.SDK_INT < 29 || C3519a.c(this) != 2 || !C3406d.a(this)) {
            blendMode = null;
        } else {
            blendMode = W.a(view.getTag(C3367m.f40942r));
            if (blendMode != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendMode);
                canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), paint);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (blendMode != null) {
            canvas.restore();
        }
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void e(MotionEvent motionEvent) {
        if (!g() || !m()) {
            U5.a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        } else if (this.f40317h == null) {
            U5.a.I("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
        } else {
            EventDispatcher b10 = n0.b(getCurrentReactContext(), getUIManagerType());
            if (b10 != null) {
                this.f40317h.c(motionEvent, b10, getCurrentReactContext());
            }
        }
    }

    public void f(Throwable th2) {
        if (g()) {
            getCurrentReactContext().handleException(new r(th2.getMessage(), this, th2));
            return;
        }
        throw new RuntimeException(th2);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        C3863a.b(!this.f40315f, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    public boolean g() {
        J j10 = this.f40310a;
        if (j10 == null || j10.D() == null) {
            return false;
        }
        return true;
    }

    public Bundle getAppProperties() {
        return this.f40312c;
    }

    public ReactContext getCurrentReactContext() {
        J j10 = this.f40310a;
        if (j10 == null) {
            return null;
        }
        return j10.D();
    }

    public int getHeightMeasureSpec() {
        return this.f40322m;
    }

    public String getJSModuleName() {
        return (String) C3863a.c(this.f40311b);
    }

    public J getReactInstanceManager() {
        return this.f40310a;
    }

    public ViewGroup getRootViewGroup() {
        return this;
    }

    public int getRootViewTag() {
        return this.f40314e;
    }

    public AtomicInteger getState() {
        return this.f40328s;
    }

    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    public int getUIManagerType() {
        return this.f40327r;
    }

    public int getWidthMeasureSpec() {
        return this.f40321l;
    }

    public boolean h() {
        if (this.f40310a != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        return this.f40315f;
    }

    public void n() {
        this.f40317h = new C3426t(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f40318i = new C3425s(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m()) {
            o();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    public void onChildEndedNativeGesture(View view, MotionEvent motionEvent) {
        EventDispatcher b10;
        if (j() && (b10 = n0.b(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f40317h.e(motionEvent, b10);
            C3425s sVar = this.f40318i;
            if (sVar != null) {
                sVar.o();
            }
        }
    }

    public void onChildStartedNativeGesture(View view, MotionEvent motionEvent) {
        EventDispatcher b10;
        C3425s sVar;
        if (j() && (b10 = n0.b(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f40317h.f(motionEvent, b10);
            if (view != null && (sVar = this.f40318i) != null) {
                sVar.p(view, motionEvent, b10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (m()) {
            o();
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!g() || !m()) {
            U5.a.I("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z10, i10, rect);
            return;
        }
        this.f40319j.a();
        super.onFocusChanged(z10, i10, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        d(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        d(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (r(motionEvent)) {
            e(motionEvent);
        }
        d(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f40320k && k()) {
            u(false, this.f40321l, this.f40322m);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ all -> 0x0019 }, LOOP:0: B:17:0x0033->B:19:0x0039, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c A[Catch:{ all -> 0x0019 }, LOOP:1: B:26:0x0066->B:28:0x006c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009f A[ADDED_TO_REGION, Catch:{ all -> 0x0019 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "ReactRootView.onMeasure"
            r1 = 0
            z8.C4236a.c(r1, r0)
            com.facebook.react.bridge.ReactMarkerConstants r0 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START
            com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r0)
            int r0 = r10.f40321l     // Catch:{ all -> 0x0019 }
            r3 = 1
            r4 = 0
            if (r11 != r0) goto L_0x001c
            int r0 = r10.f40322m     // Catch:{ all -> 0x0019 }
            if (r12 == r0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            r0 = r4
            goto L_0x001d
        L_0x0019:
            r11 = move-exception
            goto L_0x00bd
        L_0x001c:
            r0 = r3
        L_0x001d:
            r10.f40321l = r11     // Catch:{ all -> 0x0019 }
            r10.f40322m = r12     // Catch:{ all -> 0x0019 }
            int r5 = android.view.View.MeasureSpec.getMode(r11)     // Catch:{ all -> 0x0019 }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x0031
            if (r5 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch:{ all -> 0x0019 }
            goto L_0x0057
        L_0x0031:
            r11 = r4
            r5 = r11
        L_0x0033:
            int r7 = r10.getChildCount()     // Catch:{ all -> 0x0019 }
            if (r5 >= r7) goto L_0x0057
            android.view.View r7 = r10.getChildAt(r5)     // Catch:{ all -> 0x0019 }
            int r8 = r7.getLeft()     // Catch:{ all -> 0x0019 }
            int r9 = r7.getMeasuredWidth()     // Catch:{ all -> 0x0019 }
            int r8 = r8 + r9
            int r9 = r7.getPaddingLeft()     // Catch:{ all -> 0x0019 }
            int r8 = r8 + r9
            int r7 = r7.getPaddingRight()     // Catch:{ all -> 0x0019 }
            int r8 = r8 + r7
            int r11 = java.lang.Math.max(r11, r8)     // Catch:{ all -> 0x0019 }
            int r5 = r5 + 1
            goto L_0x0033
        L_0x0057:
            int r5 = android.view.View.MeasureSpec.getMode(r12)     // Catch:{ all -> 0x0019 }
            if (r5 == r6) goto L_0x0065
            if (r5 != 0) goto L_0x0060
            goto L_0x0065
        L_0x0060:
            int r12 = android.view.View.MeasureSpec.getSize(r12)     // Catch:{ all -> 0x0019 }
            goto L_0x008a
        L_0x0065:
            r12 = r4
        L_0x0066:
            int r5 = r10.getChildCount()     // Catch:{ all -> 0x0019 }
            if (r4 >= r5) goto L_0x008a
            android.view.View r5 = r10.getChildAt(r4)     // Catch:{ all -> 0x0019 }
            int r6 = r5.getTop()     // Catch:{ all -> 0x0019 }
            int r7 = r5.getMeasuredHeight()     // Catch:{ all -> 0x0019 }
            int r6 = r6 + r7
            int r7 = r5.getPaddingTop()     // Catch:{ all -> 0x0019 }
            int r6 = r6 + r7
            int r5 = r5.getPaddingBottom()     // Catch:{ all -> 0x0019 }
            int r6 = r6 + r5
            int r12 = java.lang.Math.max(r12, r6)     // Catch:{ all -> 0x0019 }
            int r4 = r4 + 1
            goto L_0x0066
        L_0x008a:
            r10.setMeasuredDimension(r11, r12)     // Catch:{ all -> 0x0019 }
            r10.f40320k = r3     // Catch:{ all -> 0x0019 }
            boolean r4 = r10.h()     // Catch:{ all -> 0x0019 }
            if (r4 == 0) goto L_0x009f
            boolean r4 = r10.m()     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x009f
            r10.c()     // Catch:{ all -> 0x0019 }
            goto L_0x00b0
        L_0x009f:
            if (r0 != 0) goto L_0x00a9
            int r0 = r10.f40323n     // Catch:{ all -> 0x0019 }
            if (r0 != r11) goto L_0x00a9
            int r0 = r10.f40324o     // Catch:{ all -> 0x0019 }
            if (r0 == r12) goto L_0x00b0
        L_0x00a9:
            int r0 = r10.f40321l     // Catch:{ all -> 0x0019 }
            int r4 = r10.f40322m     // Catch:{ all -> 0x0019 }
            r10.u(r3, r0, r4)     // Catch:{ all -> 0x0019 }
        L_0x00b0:
            r10.f40323n = r11     // Catch:{ all -> 0x0019 }
            r10.f40324o = r12     // Catch:{ all -> 0x0019 }
            com.facebook.react.bridge.ReactMarkerConstants r11 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END
            com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r11)
            z8.C4236a.i(r1)
            return
        L_0x00bd:
            com.facebook.react.bridge.ReactMarkerConstants r12 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END
            com.facebook.react.bridge.ReactMarker.logMarker((com.facebook.react.bridge.ReactMarkerConstants) r12)
            z8.C4236a.i(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.Z.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (r(motionEvent)) {
            e(motionEvent);
        }
        d(motionEvent, false);
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f40316g) {
            this.f40316g = false;
            ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, getJSModuleName(), this.f40314e);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(String str, WritableMap writableMap) {
        if (h()) {
            getCurrentReactContext().emitDeviceEvent(str, writableMap);
        }
    }

    public boolean r(MotionEvent motionEvent) {
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!g() || !m()) {
            U5.a.I("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
            return;
        }
        this.f40319j.e(view2);
        super.requestChildFocus(view, view2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z10);
        }
    }

    public void s(J j10, String str, Bundle bundle) {
        boolean z10;
        C4236a.c(0, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            if (this.f40310a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3863a.b(z10, "This root view has already been attached to a catalyst instance manager");
            this.f40310a = j10;
            this.f40311b = str;
            this.f40312c = bundle;
            j10.z();
            if (M7.b.f()) {
                if (!this.f40320k) {
                    q();
                }
                c();
            }
            C4236a.i(0);
        } catch (Throwable th2) {
            C4236a.i(0);
            throw th2;
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f40312c = bundle;
        if (l()) {
            b();
        }
    }

    public void setEventListener(b bVar) {
    }

    public void setIsFabric(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        this.f40327r = i10;
    }

    public void setRootViewTag(int i10) {
        this.f40314e = i10;
    }

    public void setShouldLogContentAppeared(boolean z10) {
        this.f40316g = z10;
    }

    public void t() {
        UiThreadUtil.assertOnUiThread();
        J j10 = this.f40310a;
        if (j10 != null && this.f40315f) {
            j10.B(this);
            this.f40315f = false;
        }
        this.f40310a = null;
        this.f40316g = false;
    }
}
