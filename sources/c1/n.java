package c1;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19226b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f19227c = e(0);

    /* renamed from: a  reason: collision with root package name */
    private final long f19228a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return n.f19227c;
        }

        private a() {
        }
    }

    private /* synthetic */ n(long j10) {
        this.f19228a = j10;
    }

    public static final /* synthetic */ n b(long j10) {
        return new n(j10);
    }

    public static final int c(long j10) {
        return j(j10);
    }

    public static final int d(long j10) {
        return k(j10);
    }

    public static final long f(long j10, int i10, int i11) {
        return e((((long) i10) << 32) | (((long) i11) & 4294967295L));
    }

    public static /* synthetic */ long g(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (4294967295L & j10);
        }
        return f(j10, i10, i11);
    }

    public static boolean h(long j10, Object obj) {
        if ((obj instanceof n) && j10 == ((n) obj).p()) {
            return true;
        }
        return false;
    }

    public static final boolean i(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final int j(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int k(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int l(long j10) {
        return Long.hashCode(j10);
    }

    public static final long m(long j10, long j11) {
        return e((((long) (((int) (j10 >> 32)) - ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    public static final long n(long j10, long j11) {
        return e((((long) (((int) (j10 >> 32)) + ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    public static String o(long j10) {
        return '(' + j(j10) + ", " + k(j10) + ')';
    }

    public boolean equals(Object obj) {
        return h(this.f19228a, obj);
    }

    public int hashCode() {
        return l(this.f19228a);
    }

    public final /* synthetic */ long p() {
        return this.f19228a;
    }

    public String toString() {
        return o(this.f19228a);
    }

    public static long e(long j10) {
        return j10;
    }
}
