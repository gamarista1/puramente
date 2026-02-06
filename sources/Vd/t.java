package vd;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vd.C5260d;
import wd.g;

public final class t extends C5260d {

    /* renamed from: r0  reason: collision with root package name */
    public static final a f61941r0 = new a((DefaultConstructorMarker) null);

    /* renamed from: O  reason: collision with root package name */
    private float f61942O;

    /* renamed from: P  reason: collision with root package name */
    private float f61943P;

    /* renamed from: Q  reason: collision with root package name */
    private final float f61944Q;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public float f61945R = Float.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public float f61946S = Float.MAX_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public float f61947T = Float.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: U  reason: collision with root package name */
    public float f61948U = Float.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: V  reason: collision with root package name */
    public float f61949V = Float.MAX_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: W  reason: collision with root package name */
    public float f61950W = Float.MAX_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: X  reason: collision with root package name */
    public float f61951X = Float.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: Y  reason: collision with root package name */
    public float f61952Y = Float.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: Z  reason: collision with root package name */
    public float f61953Z = Float.MAX_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: a0  reason: collision with root package name */
    public float f61954a0 = Float.MAX_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: b0  reason: collision with root package name */
    public float f61955b0 = Float.MAX_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public float f61956c0 = Float.MAX_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: d0  reason: collision with root package name */
    public int f61957d0 = 1;
    /* access modifiers changed from: private */

    /* renamed from: e0  reason: collision with root package name */
    public int f61958e0 = 10;

    /* renamed from: f0  reason: collision with root package name */
    private float f61959f0;

    /* renamed from: g0  reason: collision with root package name */
    private float f61960g0;

    /* renamed from: h0  reason: collision with root package name */
    private float f61961h0;

    /* renamed from: i0  reason: collision with root package name */
    private float f61962i0;

    /* renamed from: j0  reason: collision with root package name */
    private float f61963j0;

    /* renamed from: k0  reason: collision with root package name */
    private float f61964k0;

    /* renamed from: l0  reason: collision with root package name */
    private VelocityTracker f61965l0;
    /* access modifiers changed from: private */

    /* renamed from: m0  reason: collision with root package name */
    public boolean f61966m0;
    /* access modifiers changed from: private */

    /* renamed from: n0  reason: collision with root package name */
    public long f61967n0;

    /* renamed from: o0  reason: collision with root package name */
    private final Runnable f61968o0 = new s(this);

    /* renamed from: p0  reason: collision with root package name */
    private Handler f61969p0;

    /* renamed from: q0  reason: collision with root package name */
    private z f61970q0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, (DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void b(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            C6496s.e(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }

        private a() {
        }
    }

    public static final class b extends C5260d.c {

        /* renamed from: d  reason: collision with root package name */
        public static final a f61971d = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private final Class f61972b = t.class;

        /* renamed from: c  reason: collision with root package name */
        private final String f61973c = "PanGestureHandler";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public String d() {
            return this.f61973c;
        }

        public Class e() {
            return this.f61972b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public t a(Context context) {
            return new t(context);
        }

        /* renamed from: h */
        public g c(t tVar) {
            C6496s.h(tVar, "handler");
            return new g(tVar);
        }

        /* renamed from: i */
        public void f(t tVar, ReadableMap readableMap) {
            boolean z10;
            C6496s.h(tVar, "handler");
            C6496s.h(readableMap, "config");
            super.f(tVar, readableMap);
            boolean z11 = true;
            if (readableMap.hasKey("activeOffsetXStart")) {
                tVar.f61946S = G.g(readableMap.getDouble("activeOffsetXStart"));
                z10 = true;
            } else {
                z10 = false;
            }
            if (readableMap.hasKey("activeOffsetXEnd")) {
                tVar.f61947T = G.g(readableMap.getDouble("activeOffsetXEnd"));
                z10 = true;
            }
            if (readableMap.hasKey("failOffsetXStart")) {
                tVar.f61948U = G.g(readableMap.getDouble("failOffsetXStart"));
                z10 = true;
            }
            if (readableMap.hasKey("failOffsetXEnd")) {
                tVar.f61949V = G.g(readableMap.getDouble("failOffsetXEnd"));
                z10 = true;
            }
            if (readableMap.hasKey("activeOffsetYStart")) {
                tVar.f61950W = G.g(readableMap.getDouble("activeOffsetYStart"));
                z10 = true;
            }
            if (readableMap.hasKey("activeOffsetYEnd")) {
                tVar.f61951X = G.g(readableMap.getDouble("activeOffsetYEnd"));
                z10 = true;
            }
            if (readableMap.hasKey("failOffsetYStart")) {
                tVar.f61952Y = G.g(readableMap.getDouble("failOffsetYStart"));
                z10 = true;
            }
            if (readableMap.hasKey("failOffsetYEnd")) {
                tVar.f61953Z = G.g(readableMap.getDouble("failOffsetYEnd"));
                z10 = true;
            }
            if (readableMap.hasKey("minVelocity")) {
                tVar.f61956c0 = G.g(readableMap.getDouble("minVelocity"));
                z10 = true;
            }
            if (readableMap.hasKey("minVelocityX")) {
                tVar.f61954a0 = G.g(readableMap.getDouble("minVelocityX"));
                z10 = true;
            }
            if (readableMap.hasKey("minVelocityY")) {
                tVar.f61955b0 = G.g(readableMap.getDouble("minVelocityY"));
            } else {
                z11 = z10;
            }
            if (readableMap.hasKey("minDist")) {
                tVar.f61945R = G.g(readableMap.getDouble("minDist"));
            } else if (z11) {
                tVar.f61945R = Float.MAX_VALUE;
            }
            if (readableMap.hasKey("minPointers")) {
                tVar.f61957d0 = readableMap.getInt("minPointers");
            }
            if (readableMap.hasKey("maxPointers")) {
                tVar.f61958e0 = readableMap.getInt("maxPointers");
            }
            if (readableMap.hasKey("avgTouches")) {
                tVar.f61966m0 = readableMap.getBoolean("avgTouches");
            }
            if (readableMap.hasKey("activateAfterLongPress")) {
                tVar.f61967n0 = (long) readableMap.getInt("activateAfterLongPress");
            }
        }
    }

    public t(Context context) {
        C6496s.e(context);
        float scaledTouchSlop = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        this.f61944Q = scaledTouchSlop;
        this.f61945R = scaledTouchSlop;
    }

    /* access modifiers changed from: private */
    public static final void l1(t tVar) {
        tVar.k();
    }

    private final boolean r1() {
        float f10 = (this.f61963j0 - this.f61959f0) + this.f61961h0;
        float f11 = this.f61946S;
        if (f11 != Float.MAX_VALUE && f10 < f11) {
            return true;
        }
        float f12 = this.f61947T;
        if (f12 != Float.MIN_VALUE && f10 > f12) {
            return true;
        }
        float f13 = (this.f61964k0 - this.f61960g0) + this.f61962i0;
        float f14 = this.f61950W;
        if (f14 != Float.MAX_VALUE && f13 < f14) {
            return true;
        }
        float f15 = this.f61951X;
        if (f15 != Float.MIN_VALUE && f13 > f15) {
            return true;
        }
        float f16 = (f10 * f10) + (f13 * f13);
        float f17 = this.f61945R;
        if (f17 != Float.MAX_VALUE && f16 >= f17 * f17) {
            return true;
        }
        float f18 = this.f61942O;
        float f19 = this.f61954a0;
        if (f19 != Float.MAX_VALUE && ((f19 < 0.0f && f18 <= f19) || (0.0f <= f19 && f19 <= f18))) {
            return true;
        }
        float f20 = this.f61943P;
        float f21 = this.f61955b0;
        if (f21 != Float.MAX_VALUE && ((f21 < 0.0f && f18 <= f21) || (0.0f <= f21 && f21 <= f18))) {
            return true;
        }
        float f22 = (f18 * f18) + (f20 * f20);
        float f23 = this.f61956c0;
        if (f23 != Float.MAX_VALUE && f22 >= f23 * f23) {
            return true;
        }
        return false;
    }

    private final boolean s1() {
        float f10 = (this.f61963j0 - this.f61959f0) + this.f61961h0;
        float f11 = (this.f61964k0 - this.f61960g0) + this.f61962i0;
        if (this.f61967n0 > 0) {
            float f12 = (f10 * f10) + (f11 * f11);
            float f13 = this.f61944Q;
            if (f12 > f13 * f13) {
                Handler handler = this.f61969p0;
                if (handler != null) {
                    handler.removeCallbacksAndMessages((Object) null);
                }
                return true;
            }
        }
        float f14 = this.f61948U;
        if (f14 != Float.MIN_VALUE && f10 < f14) {
            return true;
        }
        float f15 = this.f61949V;
        if (f15 != Float.MAX_VALUE && f10 > f15) {
            return true;
        }
        float f16 = this.f61952Y;
        if (f16 != Float.MIN_VALUE && f11 < f16) {
            return true;
        }
        float f17 = this.f61953Z;
        if (f17 != Float.MAX_VALUE && f11 > f17) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void j0() {
        Handler handler = this.f61969p0;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    public void l(boolean z10) {
        if (S() != 4) {
            t0();
        }
        super.l(z10);
    }

    /* access modifiers changed from: protected */
    public void l0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C6496s.h(motionEvent, "event");
        C6496s.h(motionEvent2, "sourceEvent");
        if (J0(motionEvent2)) {
            if (motionEvent.getToolType(0) == 2) {
                this.f61970q0 = z.f62036f.a(motionEvent);
            }
            int S10 = S();
            int actionMasked = motionEvent2.getActionMasked();
            if (actionMasked == 5 || actionMasked == 6) {
                this.f61961h0 += this.f61963j0 - this.f61959f0;
                this.f61962i0 += this.f61964k0 - this.f61960g0;
                k kVar = k.f61899a;
                this.f61963j0 = kVar.b(motionEvent2, this.f61966m0);
                float c10 = kVar.c(motionEvent2, this.f61966m0);
                this.f61964k0 = c10;
                this.f61959f0 = this.f61963j0;
                this.f61960g0 = c10;
            } else {
                k kVar2 = k.f61899a;
                this.f61963j0 = kVar2.b(motionEvent2, this.f61966m0);
                this.f61964k0 = kVar2.c(motionEvent2, this.f61966m0);
            }
            if (S10 != 0 || motionEvent2.getPointerCount() < this.f61957d0) {
                VelocityTracker velocityTracker = this.f61965l0;
                if (velocityTracker != null) {
                    f61941r0.b(velocityTracker, motionEvent2);
                    VelocityTracker velocityTracker2 = this.f61965l0;
                    C6496s.e(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    VelocityTracker velocityTracker3 = this.f61965l0;
                    C6496s.e(velocityTracker3);
                    this.f61942O = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.f61965l0;
                    C6496s.e(velocityTracker4);
                    this.f61943P = velocityTracker4.getYVelocity();
                }
            } else {
                t0();
                this.f61961h0 = 0.0f;
                this.f61962i0 = 0.0f;
                this.f61942O = 0.0f;
                this.f61943P = 0.0f;
                VelocityTracker obtain = VelocityTracker.obtain();
                this.f61965l0 = obtain;
                f61941r0.b(obtain, motionEvent2);
                p();
                if (this.f61967n0 > 0) {
                    if (this.f61969p0 == null) {
                        this.f61969p0 = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = this.f61969p0;
                    C6496s.e(handler);
                    handler.postDelayed(this.f61968o0, this.f61967n0);
                }
            }
            if (actionMasked == 1 || actionMasked == 12) {
                if (S10 == 4) {
                    B();
                } else {
                    D();
                }
            } else if (actionMasked != 5 || motionEvent2.getPointerCount() <= this.f61958e0) {
                if (actionMasked == 6 && S10 == 4 && motionEvent2.getPointerCount() < this.f61957d0) {
                    D();
                } else if (S10 != 2) {
                } else {
                    if (s1()) {
                        D();
                    } else if (r1()) {
                        k();
                    }
                }
            } else if (S10 == 4) {
                q();
            } else {
                D();
            }
        }
    }

    public final z m1() {
        return this.f61970q0;
    }

    public final float n1() {
        return (this.f61963j0 - this.f61959f0) + this.f61961h0;
    }

    /* access modifiers changed from: protected */
    public void o0() {
        Handler handler = this.f61969p0;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        VelocityTracker velocityTracker = this.f61965l0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f61965l0 = null;
        }
        this.f61970q0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, (DefaultConstructorMarker) null);
    }

    public final float o1() {
        return (this.f61964k0 - this.f61960g0) + this.f61962i0;
    }

    public final float p1() {
        return this.f61942O;
    }

    public final float q1() {
        return this.f61943P;
    }

    public void s0() {
        super.s0();
        this.f61946S = Float.MAX_VALUE;
        this.f61947T = Float.MIN_VALUE;
        this.f61948U = Float.MIN_VALUE;
        this.f61949V = Float.MAX_VALUE;
        this.f61950W = Float.MAX_VALUE;
        this.f61951X = Float.MIN_VALUE;
        this.f61952Y = Float.MIN_VALUE;
        this.f61953Z = Float.MAX_VALUE;
        this.f61954a0 = Float.MAX_VALUE;
        this.f61955b0 = Float.MAX_VALUE;
        this.f61956c0 = Float.MAX_VALUE;
        this.f61945R = this.f61944Q;
        this.f61957d0 = 1;
        this.f61958e0 = 10;
        this.f61967n0 = 0;
        this.f61966m0 = false;
    }

    public void t0() {
        this.f61959f0 = this.f61963j0;
        this.f61960g0 = this.f61964k0;
    }
}
