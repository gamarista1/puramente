package q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: q0.m  reason: case insensitive filesystem */
public final class C2427m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f25341b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f25342c = d(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f25343d = d(9205357640488583168L);

    /* renamed from: a  reason: collision with root package name */
    private final long f25344a;

    /* renamed from: q0.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C2427m.f25343d;
        }

        public final long b() {
            return C2427m.f25342c;
        }

        private a() {
        }
    }

    private /* synthetic */ C2427m(long j10) {
        this.f25344a = j10;
    }

    public static final /* synthetic */ C2427m c(long j10) {
        return new C2427m(j10);
    }

    public static final long e(long j10, float f10, float f11) {
        return d((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }

    public static /* synthetic */ long f(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 >> 32));
        }
        if ((i10 & 2) != 0) {
            f11 = Float.intBitsToFloat((int) (4294967295L & j10));
        }
        return e(j10, f10, f11);
    }

    public static boolean g(long j10, Object obj) {
        if ((obj instanceof C2427m) && j10 == ((C2427m) obj).o()) {
            return true;
        }
        return false;
    }

    public static final boolean h(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float i(long j10) {
        if (j10 == 9205357640488583168L) {
            C2418d.a("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final float j(long j10) {
        if (j10 == 9205357640488583168L) {
            C2418d.a("Size is unspecified");
        }
        return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j10 & 2147483647L)));
    }

    public static final float k(long j10) {
        if (j10 == 9205357640488583168L) {
            C2418d.a("Size is unspecified");
        }
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static int l(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean m(long j10) {
        if (j10 == 9205357640488583168L) {
            C2418d.a("Size is unspecified");
        }
        long j11 = j10 & (~(((-9223372034707292160L & j10) >>> 31) * ((long) -1)));
        if ((j11 & 4294967295L & (j11 >>> 32)) == 0) {
            return true;
        }
        return false;
    }

    public static String n(long j10) {
        if (j10 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + C2417c.a(k(j10), 1) + ", " + C2417c.a(i(j10), 1) + ')';
    }

    public boolean equals(Object obj) {
        return g(this.f25344a, obj);
    }

    public int hashCode() {
        return l(this.f25344a);
    }

    public final /* synthetic */ long o() {
        return this.f25344a;
    }

    public String toString() {
        return n(this.f25344a);
    }

    public static long d(long j10) {
        return j10;
    }
}
