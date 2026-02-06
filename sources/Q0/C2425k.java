package q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q0.k  reason: case insensitive filesystem */
public final class C2425k {

    /* renamed from: i  reason: collision with root package name */
    public static final a f25331i = new a((DefaultConstructorMarker) null);

    /* renamed from: j  reason: collision with root package name */
    private static final C2425k f25332j = C2426l.c(0.0f, 0.0f, 0.0f, 0.0f, C2415a.f25314a.a());

    /* renamed from: a  reason: collision with root package name */
    private final float f25333a;

    /* renamed from: b  reason: collision with root package name */
    private final float f25334b;

    /* renamed from: c  reason: collision with root package name */
    private final float f25335c;

    /* renamed from: d  reason: collision with root package name */
    private final float f25336d;

    /* renamed from: e  reason: collision with root package name */
    private final long f25337e;

    /* renamed from: f  reason: collision with root package name */
    private final long f25338f;

    /* renamed from: g  reason: collision with root package name */
    private final long f25339g;

    /* renamed from: h  reason: collision with root package name */
    private final long f25340h;

    /* renamed from: q0.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ C2425k(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    public final float a() {
        return this.f25336d;
    }

    public final long b() {
        return this.f25340h;
    }

    public final long c() {
        return this.f25339g;
    }

    public final float d() {
        return this.f25336d - this.f25334b;
    }

    public final float e() {
        return this.f25333a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2425k)) {
            return false;
        }
        C2425k kVar = (C2425k) obj;
        if (Float.compare(this.f25333a, kVar.f25333a) == 0 && Float.compare(this.f25334b, kVar.f25334b) == 0 && Float.compare(this.f25335c, kVar.f25335c) == 0 && Float.compare(this.f25336d, kVar.f25336d) == 0 && C2415a.c(this.f25337e, kVar.f25337e) && C2415a.c(this.f25338f, kVar.f25338f) && C2415a.c(this.f25339g, kVar.f25339g) && C2415a.c(this.f25340h, kVar.f25340h)) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.f25335c;
    }

    public final float g() {
        return this.f25334b;
    }

    public final long h() {
        return this.f25337e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.f25333a) * 31) + Float.hashCode(this.f25334b)) * 31) + Float.hashCode(this.f25335c)) * 31) + Float.hashCode(this.f25336d)) * 31) + C2415a.f(this.f25337e)) * 31) + C2415a.f(this.f25338f)) * 31) + C2415a.f(this.f25339g)) * 31) + C2415a.f(this.f25340h);
    }

    public final long i() {
        return this.f25338f;
    }

    public final float j() {
        return this.f25335c - this.f25333a;
    }

    public String toString() {
        long j10 = this.f25337e;
        long j11 = this.f25338f;
        long j12 = this.f25339g;
        long j13 = this.f25340h;
        String str = C2417c.a(this.f25333a, 1) + ", " + C2417c.a(this.f25334b, 1) + ", " + C2417c.a(this.f25335c, 1) + ", " + C2417c.a(this.f25336d, 1);
        if (!C2415a.c(j10, j11) || !C2415a.c(j11, j12) || !C2415a.c(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + C2415a.g(j10) + ", topRight=" + C2415a.g(j11) + ", bottomRight=" + C2415a.g(j12) + ", bottomLeft=" + C2415a.g(j13) + ')';
        } else if (C2415a.d(j10) == C2415a.e(j10)) {
            return "RoundRect(rect=" + str + ", radius=" + C2417c.a(C2415a.d(j10), 1) + ')';
        } else {
            return "RoundRect(rect=" + str + ", x=" + C2417c.a(C2415a.d(j10), 1) + ", y=" + C2417c.a(C2415a.e(j10), 1) + ')';
        }
    }

    private C2425k(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f25333a = f10;
        this.f25334b = f11;
        this.f25335c = f12;
        this.f25336d = f13;
        this.f25337e = j10;
        this.f25338f = j11;
        this.f25339g = j12;
        this.f25340h = j13;
    }
}
