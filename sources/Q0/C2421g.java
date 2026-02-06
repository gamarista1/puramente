package q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q0.g  reason: case insensitive filesystem */
public final class C2421g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f25320b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f25321c = e(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f25322d = e(9187343241974906880L);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final long f25323e = e(9205357640488583168L);

    /* renamed from: a  reason: collision with root package name */
    private final long f25324a;

    /* renamed from: q0.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C2421g.f25322d;
        }

        public final long b() {
            return C2421g.f25323e;
        }

        public final long c() {
            return C2421g.f25321c;
        }

        private a() {
        }
    }

    private /* synthetic */ C2421g(long j10) {
        this.f25324a = j10;
    }

    public static final /* synthetic */ C2421g d(long j10) {
        return new C2421g(j10);
    }

    public static final long f(long j10, float f10, float f11) {
        return e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }

    public static /* synthetic */ long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return f(j10, f10, f11);
    }

    public static final long h(long j10, float f10) {
        return e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) / f10)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) / f10)) & 4294967295L));
    }

    public static boolean i(long j10, Object obj) {
        if ((obj instanceof C2421g) && j10 == ((C2421g) obj).v()) {
            return true;
        }
        return false;
    }

    public static final boolean j(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float k(long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (float) Math.sqrt((double) ((intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2)));
    }

    public static final float l(long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2);
    }

    public static final float m(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float n(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean p(long j10) {
        long j11 = j10 & 9223372034707292159L;
        if (((~j11) & (j11 - 9187343246269874177L) & -9223372034707292160L) == -9223372034707292160L) {
            return true;
        }
        return false;
    }

    public static final long q(long j10, long j11) {
        return e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    public static final long r(long j10, long j11) {
        return e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j11 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    public static final long s(long j10, float f10) {
        return e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) * f10)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10)) & 4294967295L));
    }

    public static String t(long j10) {
        if (!C2422h.c(j10)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + C2417c.a(m(j10), 1) + ", " + C2417c.a(n(j10), 1) + ')';
    }

    public static final long u(long j10) {
        return e(j10 ^ -9223372034707292160L);
    }

    public boolean equals(Object obj) {
        return i(this.f25324a, obj);
    }

    public int hashCode() {
        return o(this.f25324a);
    }

    public String toString() {
        return t(this.f25324a);
    }

    public final /* synthetic */ long v() {
        return this.f25324a;
    }

    public static long e(long j10) {
        return j10;
    }
}
