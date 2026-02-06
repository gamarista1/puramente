package c1;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19222b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f19223c = d(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f19224d = d(9205357640488583168L);

    /* renamed from: a  reason: collision with root package name */
    private final long f19225a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return k.f19224d;
        }

        public final long b() {
            return k.f19223c;
        }

        private a() {
        }
    }

    private /* synthetic */ k(long j10) {
        this.f19225a = j10;
    }

    public static final /* synthetic */ k c(long j10) {
        return new k(j10);
    }

    public static boolean e(long j10, Object obj) {
        if ((obj instanceof k) && j10 == ((k) obj).k()) {
            return true;
        }
        return false;
    }

    public static final boolean f(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float g(long j10) {
        return h.j(Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final float h(long j10) {
        return h.j(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        if (j10 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return h.p(h(j10)) + " x " + h.p(g(j10));
    }

    public boolean equals(Object obj) {
        return e(this.f19225a, obj);
    }

    public int hashCode() {
        return i(this.f19225a);
    }

    public final /* synthetic */ long k() {
        return this.f19225a;
    }

    public String toString() {
        return j(this.f19225a);
    }

    public static long d(long j10) {
        return j10;
    }
}
