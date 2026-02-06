package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
import com.revenuecat.purchases.common.UtilsKt;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class r extends e {

    /* renamed from: u  reason: collision with root package name */
    public static final a f40526u = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private long f40527e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40528f;

    /* renamed from: g  reason: collision with root package name */
    private double f40529g;

    /* renamed from: h  reason: collision with root package name */
    private double f40530h;

    /* renamed from: i  reason: collision with root package name */
    private double f40531i;

    /* renamed from: j  reason: collision with root package name */
    private double f40532j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f40533k;

    /* renamed from: l  reason: collision with root package name */
    private final b f40534l;

    /* renamed from: m  reason: collision with root package name */
    private double f40535m;

    /* renamed from: n  reason: collision with root package name */
    private double f40536n;

    /* renamed from: o  reason: collision with root package name */
    private double f40537o;

    /* renamed from: p  reason: collision with root package name */
    private double f40538p;

    /* renamed from: q  reason: collision with root package name */
    private double f40539q;

    /* renamed from: r  reason: collision with root package name */
    private int f40540r;

    /* renamed from: s  reason: collision with root package name */
    private int f40541s;

    /* renamed from: t  reason: collision with root package name */
    private double f40542t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private double f40543a;

        /* renamed from: b  reason: collision with root package name */
        private double f40544b;

        public b(double d10, double d11) {
            this.f40543a = d10;
            this.f40544b = d11;
        }

        public final double a() {
            return this.f40543a;
        }

        public final double b() {
            return this.f40544b;
        }

        public final void c(double d10) {
            this.f40543a = d10;
        }

        public final void d(double d10) {
            this.f40544b = d10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f40543a, bVar.f40543a) == 0 && Double.compare(this.f40544b, bVar.f40544b) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.f40543a) * 31) + Double.hashCode(this.f40544b);
        }

        public String toString() {
            double d10 = this.f40543a;
            double d11 = this.f40544b;
            return "PhysicsState(position=" + d10 + ", velocity=" + d11 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
        }
    }

    public r(ReadableMap readableMap) {
        C6496s.h(readableMap, "config");
        b bVar = new b(0.0d, 0.0d, 3, (DefaultConstructorMarker) null);
        this.f40534l = bVar;
        bVar.d(readableMap.getDouble("initialVelocity"));
        a(readableMap);
    }

    private final void c(double d10) {
        double d11;
        double d12;
        if (!e()) {
            double d13 = 0.064d;
            if (d10 <= 0.064d) {
                d13 = d10;
            }
            this.f40539q += d13;
            double d14 = this.f40530h;
            double d15 = this.f40531i;
            double d16 = this.f40529g;
            double d17 = -this.f40532j;
            double sqrt = d14 / (((double) 2) * Math.sqrt(d16 * d15));
            double sqrt2 = Math.sqrt(d16 / d15);
            double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
            double d18 = this.f40536n - this.f40535m;
            double d19 = this.f40539q;
            if (sqrt < 1.0d) {
                double exp = Math.exp((-sqrt) * sqrt2 * d19);
                double d20 = sqrt * sqrt2;
                double d21 = d17 + (d20 * d18);
                double d22 = d19 * sqrt3;
                double d23 = exp;
                d11 = this.f40536n - ((((d21 / sqrt3) * Math.sin(d22)) + (Math.cos(d22) * d18)) * d23);
                d12 = ((d20 * d23) * (((Math.sin(d22) * d21) / sqrt3) + (Math.cos(d22) * d18))) - (((Math.cos(d22) * d21) - ((sqrt3 * d18) * Math.sin(d22))) * d23);
            } else {
                double exp2 = Math.exp((-sqrt2) * d19);
                d12 = exp2 * ((d17 * ((d19 * sqrt2) - ((double) 1))) + (d19 * d18 * sqrt2 * sqrt2));
                d11 = this.f40536n - (((((sqrt2 * d18) + d17) * d19) + d18) * exp2);
            }
            this.f40534l.c(d11);
            this.f40534l.d(d12);
            if (e() || (this.f40533k && f())) {
                if (this.f40529g > 0.0d) {
                    double d24 = this.f40536n;
                    this.f40535m = d24;
                    this.f40534l.c(d24);
                } else {
                    double a10 = this.f40534l.a();
                    this.f40536n = a10;
                    this.f40535m = a10;
                }
                this.f40534l.d(0.0d);
            }
        }
    }

    private final double d(b bVar) {
        return Math.abs(this.f40536n - bVar.a());
    }

    private final boolean e() {
        if (Math.abs(this.f40534l.b()) > this.f40537o || (d(this.f40534l) > this.f40538p && this.f40529g != 0.0d)) {
            return false;
        }
        return true;
    }

    private final boolean f() {
        if (this.f40529g <= 0.0d || ((this.f40535m >= this.f40536n || this.f40534l.a() <= this.f40536n) && (this.f40535m <= this.f40536n || this.f40534l.a() >= this.f40536n))) {
            return false;
        }
        return true;
    }

    public void a(ReadableMap readableMap) {
        int i10;
        C6496s.h(readableMap, "config");
        this.f40529g = readableMap.getDouble("stiffness");
        this.f40530h = readableMap.getDouble("damping");
        this.f40531i = readableMap.getDouble("mass");
        this.f40532j = this.f40534l.b();
        this.f40536n = readableMap.getDouble("toValue");
        this.f40537o = readableMap.getDouble("restSpeedThreshold");
        this.f40538p = readableMap.getDouble("restDisplacementThreshold");
        this.f40533k = readableMap.getBoolean("overshootClamping");
        boolean z10 = true;
        if (readableMap.hasKey("iterations")) {
            i10 = readableMap.getInt("iterations");
        } else {
            i10 = 1;
        }
        this.f40540r = i10;
        if (i10 != 0) {
            z10 = false;
        }
        this.f40449a = z10;
        this.f40541s = 0;
        this.f40539q = 0.0d;
        this.f40528f = false;
    }

    public void b(long j10) {
        w wVar = this.f40450b;
        if (wVar != null) {
            long j11 = j10 / ((long) UtilsKt.MICROS_MULTIPLIER);
            if (!this.f40528f) {
                if (this.f40541s == 0) {
                    this.f40542t = wVar.f40562f;
                    this.f40541s = 1;
                }
                this.f40534l.c(wVar.f40562f);
                this.f40535m = this.f40534l.a();
                this.f40527e = j11;
                this.f40539q = 0.0d;
                this.f40528f = true;
            }
            c(((double) (j11 - this.f40527e)) / 1000.0d);
            this.f40527e = j11;
            wVar.f40562f = this.f40534l.a();
            if (e()) {
                int i10 = this.f40540r;
                if (i10 == -1 || this.f40541s < i10) {
                    this.f40528f = false;
                    wVar.f40562f = this.f40542t;
                    this.f40541s++;
                    return;
                }
                this.f40449a = true;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Animated value should not be null");
    }
}
