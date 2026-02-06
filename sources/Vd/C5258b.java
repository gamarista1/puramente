package vd;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vd.C5260d;
import wd.C5266a;

/* renamed from: vd.b  reason: case insensitive filesystem */
public final class C5258b extends C5260d {

    /* renamed from: W  reason: collision with root package name */
    public static final a f61818W = new a((DefaultConstructorMarker) null);

    /* renamed from: X  reason: collision with root package name */
    private static final double f61819X;

    /* renamed from: Y  reason: collision with root package name */
    private static final double f61820Y;

    /* renamed from: O  reason: collision with root package name */
    private int f61821O = 1;

    /* renamed from: P  reason: collision with root package name */
    private int f61822P = 1;

    /* renamed from: Q  reason: collision with root package name */
    private final long f61823Q = 800;

    /* renamed from: R  reason: collision with root package name */
    private final long f61824R = 2000;

    /* renamed from: S  reason: collision with root package name */
    private Handler f61825S;

    /* renamed from: T  reason: collision with root package name */
    private int f61826T;

    /* renamed from: U  reason: collision with root package name */
    private final Runnable f61827U = new C5257a(this);

    /* renamed from: V  reason: collision with root package name */
    private VelocityTracker f61828V;

    /* renamed from: vd.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: vd.b$b  reason: collision with other inner class name */
    public static final class C0913b extends C5260d.c {

        /* renamed from: d  reason: collision with root package name */
        public static final a f61829d = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private final Class f61830b = C5258b.class;

        /* renamed from: c  reason: collision with root package name */
        private final String f61831c = "FlingGestureHandler";

        /* renamed from: vd.b$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public String d() {
            return this.f61831c;
        }

        public Class e() {
            return this.f61830b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C5258b a(Context context) {
            return new C5258b();
        }

        /* renamed from: h */
        public C5266a c(C5258b bVar) {
            C6496s.h(bVar, "handler");
            return new C5266a(bVar);
        }

        /* renamed from: i */
        public void f(C5258b bVar, ReadableMap readableMap) {
            C6496s.h(bVar, "handler");
            C6496s.h(readableMap, "config");
            super.f(bVar, readableMap);
            if (readableMap.hasKey("numberOfPointers")) {
                bVar.Z0(readableMap.getInt("numberOfPointers"));
            }
            if (readableMap.hasKey("direction")) {
                bVar.Y0(readableMap.getInt("direction"));
            }
        }
    }

    static {
        k kVar = k.f61899a;
        f61819X = kVar.a(30.0d);
        f61820Y = kVar.a(60.0d);
    }

    private final void V0(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        C6496s.e(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    private final void W0(MotionEvent motionEvent) {
        if (!b1(motionEvent)) {
            D();
        }
    }

    /* access modifiers changed from: private */
    public static final void X0(C5258b bVar) {
        bVar.D();
    }

    private final void a1(MotionEvent motionEvent) {
        this.f61828V = VelocityTracker.obtain();
        p();
        this.f61826T = 1;
        Handler handler = this.f61825S;
        if (handler == null) {
            this.f61825S = new Handler(Looper.getMainLooper());
        } else {
            C6496s.e(handler);
            handler.removeCallbacksAndMessages((Object) null);
        }
        Handler handler2 = this.f61825S;
        C6496s.e(handler2);
        handler2.postDelayed(this.f61827U, this.f61823Q);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b1(android.view.MotionEvent r11) {
        /*
            r10 = this;
            android.view.VelocityTracker r0 = r10.f61828V
            r10.V0(r0, r11)
            vd.C$a r11 = vd.C.f61802f
            android.view.VelocityTracker r0 = r10.f61828V
            kotlin.jvm.internal.C6496s.e(r0)
            vd.C r11 = r11.b(r0)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r2, r4, r5}
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r4 = 0
            r5 = r4
        L_0x0030:
            if (r5 >= r3) goto L_0x0048
            r6 = r0[r5]
            int r6 = r6.intValue()
            double r7 = f61819X
            boolean r6 = c1(r10, r11, r6, r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r2.add(r6)
            int r5 = r5 + 1
            goto L_0x0030
        L_0x0048:
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 10
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r5, r6, r7}
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            r6 = r4
        L_0x0068:
            if (r6 >= r3) goto L_0x0080
            r7 = r0[r6]
            int r7 = r7.intValue()
            double r8 = f61820Y
            boolean r7 = c1(r10, r11, r7, r8)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r5.add(r7)
            int r6 = r6 + 1
            goto L_0x0068
        L_0x0080:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0088
        L_0x0086:
            r0 = r4
            goto L_0x009f
        L_0x0088:
            java.util.Iterator r0 = r2.iterator()
        L_0x008c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0086
            java.lang.Object r2 = r0.next()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x008c
            r0 = r1
        L_0x009f:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x00a7
        L_0x00a5:
            r2 = r4
            goto L_0x00be
        L_0x00a7:
            java.util.Iterator r2 = r5.iterator()
        L_0x00ab:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00a5
            java.lang.Object r3 = r2.next()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x00ab
            r2 = r1
        L_0x00be:
            r0 = r0 | r2
            double r2 = r11.k()
            long r5 = r10.f61824R
            double r5 = (double) r5
            int r11 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x00cc
            r11 = r1
            goto L_0x00cd
        L_0x00cc:
            r11 = r4
        L_0x00cd:
            int r2 = r10.f61826T
            int r3 = r10.f61821O
            if (r2 != r3) goto L_0x00e4
            if (r0 == 0) goto L_0x00e4
            if (r11 == 0) goto L_0x00e4
            android.os.Handler r11 = r10.f61825S
            kotlin.jvm.internal.C6496s.e(r11)
            r0 = 0
            r11.removeCallbacksAndMessages(r0)
            r10.k()
            goto L_0x00e5
        L_0x00e4:
            r1 = r4
        L_0x00e5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vd.C5258b.b1(android.view.MotionEvent):boolean");
    }

    private static final boolean c1(C5258b bVar, C c10, int i10, double d10) {
        if ((bVar.f61822P & i10) != i10 || !c10.l(C.f61802f.a(i10), d10)) {
            return false;
        }
        return true;
    }

    public final void Y0(int i10) {
        this.f61822P = i10;
    }

    public final void Z0(int i10) {
        this.f61821O = i10;
    }

    /* access modifiers changed from: protected */
    public void j0() {
        Handler handler = this.f61825S;
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
            if (S10 == 0) {
                a1(motionEvent2);
            }
            if (S10 == 2) {
                b1(motionEvent2);
                if (motionEvent2.getPointerCount() > this.f61826T) {
                    this.f61826T = motionEvent2.getPointerCount();
                }
                if (motionEvent2.getActionMasked() == 1) {
                    W0(motionEvent2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o0() {
        VelocityTracker velocityTracker = this.f61828V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f61828V = null;
        Handler handler = this.f61825S;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    public void s0() {
        super.s0();
        this.f61821O = 1;
        this.f61822P = 1;
    }
}
