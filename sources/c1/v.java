package c1;

import c1.x;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class v {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19242b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final x[] f19243c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f19244d = w.i(0, Float.NaN);

    /* renamed from: a  reason: collision with root package name */
    private final long f19245a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return v.f19244d;
        }

        private a() {
        }
    }

    static {
        x.a aVar = x.f19246b;
        f19243c = new x[]{x.d(aVar.c()), x.d(aVar.b()), x.d(aVar.a())};
    }

    private /* synthetic */ v(long j10) {
        this.f19245a = j10;
    }

    public static final /* synthetic */ v b(long j10) {
        return new v(j10);
    }

    public static boolean d(long j10, Object obj) {
        if ((obj instanceof v) && j10 == ((v) obj).k()) {
            return true;
        }
        return false;
    }

    public static final boolean e(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final long f(long j10) {
        return j10 & 1095216660480L;
    }

    public static final long g(long j10) {
        return f19243c[(int) (f(j10) >>> 32)].j();
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        long g10 = g(j10);
        x.a aVar = x.f19246b;
        if (x.g(g10, aVar.c())) {
            return "Unspecified";
        }
        if (x.g(g10, aVar.b())) {
            return h(j10) + ".sp";
        } else if (!x.g(g10, aVar.a())) {
            return "Invalid";
        } else {
            return h(j10) + ".em";
        }
    }

    public boolean equals(Object obj) {
        return d(this.f19245a, obj);
    }

    public int hashCode() {
        return i(this.f19245a);
    }

    public final /* synthetic */ long k() {
        return this.f19245a;
    }

    public String toString() {
        return j(this.f19245a);
    }

    public static long c(long j10) {
        return j10;
    }
}
