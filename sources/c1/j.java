package c1;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19218b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f19219c = b(0);

    /* renamed from: d  reason: collision with root package name */
    private static final long f19220d = b(9205357640488583168L);

    /* renamed from: a  reason: collision with root package name */
    private final long f19221a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ j(long j10) {
        this.f19221a = j10;
    }

    public static final /* synthetic */ j a(long j10) {
        return new j(j10);
    }

    public static boolean c(long j10, Object obj) {
        if ((obj instanceof j) && j10 == ((j) obj).i()) {
            return true;
        }
        return false;
    }

    public static final boolean d(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float e(long j10) {
        return h.j(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static final float f(long j10) {
        return h.j(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static String h(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return '(' + h.p(e(j10)) + ", " + h.p(f(j10)) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f19221a, obj);
    }

    public int hashCode() {
        return g(this.f19221a);
    }

    public final /* synthetic */ long i() {
        return this.f19221a;
    }

    public String toString() {
        return h(this.f19221a);
    }

    public static long b(long j10) {
        return j10;
    }
}
