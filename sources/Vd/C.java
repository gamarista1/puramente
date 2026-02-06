package vd;

import android.view.VelocityTracker;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class C {

    /* renamed from: f  reason: collision with root package name */
    public static final a f61802f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C f61803g = new C(-1.0d, 0.0d);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C f61804h = new C(1.0d, 0.0d);
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final C f61805i = new C(0.0d, -1.0d);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final C f61806j = new C(0.0d, 1.0d);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final C f61807k = new C(1.0d, -1.0d);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final C f61808l = new C(1.0d, 1.0d);
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final C f61809m = new C(-1.0d, -1.0d);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final C f61810n = new C(-1.0d, 1.0d);
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public static final C f61811o = new C(0.0d, 0.0d);

    /* renamed from: a  reason: collision with root package name */
    private final double f61812a;

    /* renamed from: b  reason: collision with root package name */
    private final double f61813b;

    /* renamed from: c  reason: collision with root package name */
    private final double f61814c;

    /* renamed from: d  reason: collision with root package name */
    private final double f61815d;

    /* renamed from: e  reason: collision with root package name */
    private final double f61816e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a(int i10) {
            switch (i10) {
                case 1:
                    return C.f61804h;
                case 2:
                    return C.f61803g;
                case 4:
                    return C.f61805i;
                case 5:
                    return C.f61807k;
                case 6:
                    return C.f61809m;
                case 8:
                    return C.f61806j;
                case 9:
                    return C.f61808l;
                case 10:
                    return C.f61810n;
                default:
                    return C.f61811o;
            }
        }

        public final C b(VelocityTracker velocityTracker) {
            C6496s.h(velocityTracker, "tracker");
            velocityTracker.computeCurrentVelocity(1000);
            return new C((double) velocityTracker.getXVelocity(), (double) velocityTracker.getYVelocity());
        }

        private a() {
        }
    }

    public C(double d10, double d11) {
        boolean z10;
        double d12;
        this.f61812a = d10;
        this.f61813b = d11;
        double hypot = Math.hypot(d10, d11);
        this.f61816e = hypot;
        if (hypot > 0.1d) {
            z10 = true;
        } else {
            z10 = false;
        }
        double d13 = 0.0d;
        if (z10) {
            d12 = d10 / hypot;
        } else {
            d12 = 0.0d;
        }
        this.f61814c = d12;
        this.f61815d = z10 ? d11 / hypot : d13;
    }

    private final double j(C c10) {
        return (this.f61814c * c10.f61814c) + (this.f61815d * c10.f61815d);
    }

    public final double k() {
        return this.f61816e;
    }

    public final boolean l(C c10, double d10) {
        C6496s.h(c10, "vector");
        if (j(c10) > d10) {
            return true;
        }
        return false;
    }
}
