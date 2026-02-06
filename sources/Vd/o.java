package vd;

import Ef.i;
import Ef.m;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.G;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.L;
import vd.C5260d;
import wd.d;

public final class o extends C5260d {

    /* renamed from: Y  reason: collision with root package name */
    public static final a f61909Y = new a((DefaultConstructorMarker) null);

    /* renamed from: O  reason: collision with root package name */
    private long f61910O = 500;

    /* renamed from: P  reason: collision with root package name */
    private final float f61911P;
    /* access modifiers changed from: private */

    /* renamed from: Q  reason: collision with root package name */
    public float f61912Q;

    /* renamed from: R  reason: collision with root package name */
    private int f61913R;

    /* renamed from: S  reason: collision with root package name */
    private float f61914S;

    /* renamed from: T  reason: collision with root package name */
    private float f61915T;

    /* renamed from: U  reason: collision with root package name */
    private long f61916U;

    /* renamed from: V  reason: collision with root package name */
    private long f61917V;

    /* renamed from: W  reason: collision with root package name */
    private Handler f61918W;

    /* renamed from: X  reason: collision with root package name */
    private int f61919X;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends C5260d.c {

        /* renamed from: d  reason: collision with root package name */
        public static final a f61920d = new a((DefaultConstructorMarker) null);

        /* renamed from: b  reason: collision with root package name */
        private final Class f61921b = o.class;

        /* renamed from: c  reason: collision with root package name */
        private final String f61922c = "LongPressGestureHandler";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public String d() {
            return this.f61922c;
        }

        public Class e() {
            return this.f61921b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public o a(Context context) {
            C6496s.e(context);
            return new o(context);
        }

        /* renamed from: h */
        public d c(o oVar) {
            C6496s.h(oVar, "handler");
            return new d(oVar);
        }

        /* renamed from: i */
        public void f(o oVar, ReadableMap readableMap) {
            C6496s.h(oVar, "handler");
            C6496s.h(readableMap, "config");
            super.f(oVar, readableMap);
            if (readableMap.hasKey("minDurationMs")) {
                oVar.a1((long) readableMap.getInt("minDurationMs"));
            }
            if (readableMap.hasKey("maxDist")) {
                oVar.f61912Q = G.g(readableMap.getDouble("maxDist"));
            }
            if (readableMap.hasKey("numberOfPointers")) {
                oVar.D0(readableMap.getInt("numberOfPointers"));
            }
        }
    }

    public o(Context context) {
        C6496s.h(context, "context");
        G0(true);
        float f10 = context.getResources().getDisplayMetrics().density * 10.0f;
        this.f61911P = f10;
        this.f61912Q = f10;
        this.f61913R = 1;
    }

    private final Pair W0(MotionEvent motionEvent, boolean z10) {
        if (!z10) {
            i u10 = m.u(0, motionEvent.getPointerCount());
            ArrayList arrayList = new ArrayList(C6565s.y(u10, 10));
            Iterator it = u10.iterator();
            while (it.hasNext()) {
                arrayList.add(Float.valueOf(motionEvent.getX(((L) it).a())));
            }
            float c02 = (float) C6565s.c0(arrayList);
            i u11 = m.u(0, motionEvent.getPointerCount());
            ArrayList arrayList2 = new ArrayList(C6565s.y(u11, 10));
            Iterator it2 = u11.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Float.valueOf(motionEvent.getY(((L) it2).a())));
            }
            return new Pair(Float.valueOf(c02), Float.valueOf((float) C6565s.c0(arrayList2)));
        }
        int pointerCount = motionEvent.getPointerCount();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < pointerCount; i10++) {
            if (i10 != motionEvent.getActionIndex()) {
                f10 += motionEvent.getX(i10);
                f11 += motionEvent.getY(i10);
            }
        }
        return new Pair(Float.valueOf(f10 / ((float) (motionEvent.getPointerCount() - 1))), Float.valueOf(f11 / ((float) (motionEvent.getPointerCount() - 1))));
    }

    static /* synthetic */ Pair X0(o oVar, MotionEvent motionEvent, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return oVar.W0(motionEvent, z10);
    }

    /* access modifiers changed from: private */
    public static final void Z0(o oVar) {
        oVar.k();
    }

    public final int Y0() {
        return (int) (this.f61917V - this.f61916U);
    }

    public final void a1(long j10) {
        this.f61910O = j10;
    }

    /* access modifiers changed from: protected */
    public void l0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        C6496s.h(motionEvent, "event");
        C6496s.h(motionEvent2, "sourceEvent");
        if (J0(motionEvent2)) {
            if (S() == 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                this.f61917V = uptimeMillis;
                this.f61916U = uptimeMillis;
                p();
                Pair X02 = X0(this, motionEvent2, false, 2, (Object) null);
                float floatValue = ((Number) X02.a()).floatValue();
                float floatValue2 = ((Number) X02.b()).floatValue();
                this.f61914S = floatValue;
                this.f61915T = floatValue2;
                this.f61919X++;
            }
            if (motionEvent2.getActionMasked() == 5) {
                this.f61919X++;
                Pair X03 = X0(this, motionEvent2, false, 2, (Object) null);
                float floatValue3 = ((Number) X03.a()).floatValue();
                float floatValue4 = ((Number) X03.b()).floatValue();
                this.f61914S = floatValue3;
                this.f61915T = floatValue4;
                if (this.f61919X > this.f61913R) {
                    D();
                    this.f61919X = 0;
                }
            }
            if (S() == 2 && this.f61919X == this.f61913R && (motionEvent2.getActionMasked() == 0 || motionEvent2.getActionMasked() == 5)) {
                Handler handler = new Handler(Looper.getMainLooper());
                this.f61918W = handler;
                long j10 = this.f61910O;
                if (j10 > 0) {
                    C6496s.e(handler);
                    handler.postDelayed(new n(this), this.f61910O);
                } else if (j10 == 0) {
                    k();
                }
            }
            if (motionEvent2.getActionMasked() == 1 || motionEvent2.getActionMasked() == 12) {
                this.f61919X--;
                Handler handler2 = this.f61918W;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages((Object) null);
                    this.f61918W = null;
                }
                if (S() == 4) {
                    B();
                } else {
                    D();
                }
            } else if (motionEvent2.getActionMasked() == 6) {
                int i10 = this.f61919X - 1;
                this.f61919X = i10;
                if (i10 >= this.f61913R || S() == 4) {
                    Pair W02 = W0(motionEvent2, true);
                    float floatValue5 = ((Number) W02.a()).floatValue();
                    float floatValue6 = ((Number) W02.b()).floatValue();
                    this.f61914S = floatValue5;
                    this.f61915T = floatValue6;
                    return;
                }
                D();
                this.f61919X = 0;
            } else {
                Pair X04 = X0(this, motionEvent2, false, 2, (Object) null);
                float floatValue7 = ((Number) X04.a()).floatValue();
                float floatValue8 = ((Number) X04.b()).floatValue();
                float f10 = floatValue7 - this.f61914S;
                float f11 = floatValue8 - this.f61915T;
                float f12 = (f10 * f10) + (f11 * f11);
                float f13 = this.f61912Q;
                if (f12 <= f13 * f13) {
                    return;
                }
                if (S() == 4) {
                    q();
                } else {
                    D();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o0() {
        super.o0();
        this.f61919X = 0;
    }

    /* access modifiers changed from: protected */
    public void p0(int i10, int i11) {
        Handler handler = this.f61918W;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f61918W = null;
        }
    }

    public void s0() {
        super.s0();
        this.f61910O = 500;
        this.f61912Q = this.f61911P;
        G0(true);
    }

    public void v(MotionEvent motionEvent) {
        C6496s.h(motionEvent, "event");
        this.f61917V = SystemClock.uptimeMillis();
        super.v(motionEvent);
    }

    public void w(int i10, int i11) {
        this.f61917V = SystemClock.uptimeMillis();
        super.w(i10, i11);
    }
}
