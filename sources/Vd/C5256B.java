package vd;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.G;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vd.C5260d;
import wd.j;

/* renamed from: vd.B  reason: case insensitive filesystem */
public final class C5256B extends C5260d {

    /* renamed from: f0  reason: collision with root package name */
    public static final a f61781f0 = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: O  reason: collision with root package name */
    public float f61782O = Float.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: P  reason: collision with root package name */
    public float f61783P = Float.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public float f61784Q = Float.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: R  reason: collision with root package name */
    public long f61785R = 500;
    /* access modifiers changed from: private */

    /* renamed from: S  reason: collision with root package name */
    public long f61786S = 200;
    /* access modifiers changed from: private */

    /* renamed from: T  reason: collision with root package name */
    public int f61787T = 1;
    /* access modifiers changed from: private */

    /* renamed from: U  reason: collision with root package name */
    public int f61788U = 1;

    /* renamed from: V  reason: collision with root package name */
    private int f61789V = 1;

    /* renamed from: W  reason: collision with root package name */
    private float f61790W;

    /* renamed from: X  reason: collision with root package name */
    private float f61791X;

    /* renamed from: Y  reason: collision with root package name */
    private float f61792Y;

    /* renamed from: Z  reason: collision with root package name */
    private float f61793Z;

    /* renamed from: a0  reason: collision with root package name */
    private float f61794a0;

    /* renamed from: b0  reason: collision with root package name */
    private float f61795b0;

    /* renamed from: c0  reason: collision with root package name */
    private Handler f61796c0;

    /* renamed from: d0  reason: collision with root package name */
    private int f61797d0;

    /* renamed from: e0  reason: collision with root package name */
    private final Runnable f61798e0 = new C5255A(this);

    /* renamed from: vd.B$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: vd.B$b */
    public static final class b extends C5260d.c {

        /* renamed from: d  reason: collision with root package name */
        public static final a f61799d = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private final Class f61800b = C5256B.class;

        /* renamed from: c  reason: collision with root package name */
        private final String f61801c = "TapGestureHandler";

        /* renamed from: vd.B$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public String d() {
            return this.f61801c;
        }

        public Class e() {
            return this.f61800b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C5256B a(Context context) {
            return new C5256B();
        }

        /* renamed from: h */
        public j c(C5256B b10) {
            C6496s.h(b10, "handler");
            return new j(b10);
        }

        /* renamed from: i */
        public void f(C5256B b10, ReadableMap readableMap) {
            C6496s.h(b10, "handler");
            C6496s.h(readableMap, "config");
            super.f(b10, readableMap);
            if (readableMap.hasKey("numberOfTaps")) {
                b10.f61787T = readableMap.getInt("numberOfTaps");
            }
            if (readableMap.hasKey("maxDurationMs")) {
                b10.f61785R = (long) readableMap.getInt("maxDurationMs");
            }
            if (readableMap.hasKey("maxDelayMs")) {
                b10.f61786S = (long) readableMap.getInt("maxDelayMs");
            }
            if (readableMap.hasKey("maxDeltaX")) {
                b10.f61782O = G.g(readableMap.getDouble("maxDeltaX"));
            }
            if (readableMap.hasKey("maxDeltaY")) {
                b10.f61783P = G.g(readableMap.getDouble("maxDeltaY"));
            }
            if (readableMap.hasKey("maxDist")) {
                b10.f61784Q = G.g(readableMap.getDouble("maxDist"));
            }
            if (readableMap.hasKey("minPointers")) {
                b10.f61788U = readableMap.getInt("minPointers");
            }
        }
    }

    public C5256B() {
        G0(true);
    }

    private final void c1() {
        Handler handler = this.f61796c0;
        if (handler == null) {
            this.f61796c0 = new Handler(Looper.getMainLooper());
        } else {
            C6496s.e(handler);
            handler.removeCallbacksAndMessages((Object) null);
        }
        int i10 = this.f61797d0 + 1;
        this.f61797d0 = i10;
        if (i10 != this.f61787T || this.f61789V < this.f61788U) {
            Handler handler2 = this.f61796c0;
            C6496s.e(handler2);
            handler2.postDelayed(this.f61798e0, this.f61786S);
            return;
        }
        k();
    }

    /* access modifiers changed from: private */
    public static final void d1(C5256B b10) {
        b10.D();
    }

    private final boolean e1() {
        float f10 = (this.f61794a0 - this.f61790W) + this.f61792Y;
        if (this.f61782O != Float.MIN_VALUE && Math.abs(f10) > this.f61782O) {
            return true;
        }
        float f11 = (this.f61795b0 - this.f61791X) + this.f61793Z;
        if (this.f61783P != Float.MIN_VALUE && Math.abs(f11) > this.f61783P) {
            return true;
        }
        float f12 = (f11 * f11) + (f10 * f10);
        float f13 = this.f61784Q;
        if (f13 != Float.MIN_VALUE && f12 > f13 * f13) {
            return true;
        }
        return false;
    }

    private final void f1() {
        Handler handler = this.f61796c0;
        if (handler == null) {
            this.f61796c0 = new Handler(Looper.getMainLooper());
        } else {
            C6496s.e(handler);
            handler.removeCallbacksAndMessages((Object) null);
        }
        Handler handler2 = this.f61796c0;
        C6496s.e(handler2);
        handler2.postDelayed(this.f61798e0, this.f61785R);
    }

    /* access modifiers changed from: protected */
    public void j0() {
        Handler handler = this.f61796c0;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    public void l(boolean z10) {
        super.l(z10);
        B();
    }

    /* access modifiers changed from: protected */
    public void l0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C6496s.h(motionEvent, "event");
        C6496s.h(motionEvent2, "sourceEvent");
        if (J0(motionEvent2)) {
            int S10 = S();
            int actionMasked = motionEvent2.getActionMasked();
            if (S10 == 0) {
                this.f61792Y = 0.0f;
                this.f61793Z = 0.0f;
                k kVar = k.f61899a;
                this.f61790W = kVar.b(motionEvent2, true);
                this.f61791X = kVar.c(motionEvent2, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.f61792Y += this.f61794a0 - this.f61790W;
                this.f61793Z += this.f61795b0 - this.f61791X;
                k kVar2 = k.f61899a;
                this.f61794a0 = kVar2.b(motionEvent2, true);
                float c10 = kVar2.c(motionEvent2, true);
                this.f61795b0 = c10;
                this.f61790W = this.f61794a0;
                this.f61791X = c10;
            } else {
                k kVar3 = k.f61899a;
                this.f61794a0 = kVar3.b(motionEvent2, true);
                this.f61795b0 = kVar3.c(motionEvent2, true);
            }
            if (this.f61789V < motionEvent2.getPointerCount()) {
                this.f61789V = motionEvent2.getPointerCount();
            }
            if (e1()) {
                D();
            } else if (S10 == 0) {
                if (actionMasked == 0 || actionMasked == 11) {
                    p();
                }
                f1();
            } else if (S10 == 2) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 11) {
                            if (actionMasked != 12) {
                                return;
                            }
                        }
                    }
                    c1();
                    return;
                }
                f1();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o0() {
        this.f61797d0 = 0;
        this.f61789V = 0;
        Handler handler = this.f61796c0;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    public void s0() {
        super.s0();
        this.f61782O = Float.MIN_VALUE;
        this.f61783P = Float.MIN_VALUE;
        this.f61784Q = Float.MIN_VALUE;
        this.f61785R = 500;
        this.f61786S = 200;
        this.f61787T = 1;
        this.f61788U = 1;
        G0(true);
    }
}
