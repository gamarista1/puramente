package Q0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Q {

    /* renamed from: b  reason: collision with root package name */
    public static final a f5291b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f5292c = S.a(0);

    /* renamed from: a  reason: collision with root package name */
    private final long f5293a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return Q.f5292c;
        }

        private a() {
        }
    }

    private /* synthetic */ Q(long j10) {
        this.f5293a = j10;
    }

    public static final /* synthetic */ Q b(long j10) {
        return new Q(j10);
    }

    public static final boolean d(long j10, long j11) {
        if (l(j10) > l(j11) || k(j11) > k(j10)) {
            return false;
        }
        return true;
    }

    public static final boolean e(long j10, int i10) {
        int l10 = l(j10);
        if (i10 >= k(j10) || l10 > i10) {
            return false;
        }
        return true;
    }

    public static boolean f(long j10, Object obj) {
        if ((obj instanceof Q) && j10 == ((Q) obj).r()) {
            return true;
        }
        return false;
    }

    public static final boolean g(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final boolean h(long j10) {
        if (n(j10) == i(j10)) {
            return true;
        }
        return false;
    }

    public static final int i(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int j(long j10) {
        return k(j10) - l(j10);
    }

    public static final int k(long j10) {
        if (n(j10) > i(j10)) {
            return n(j10);
        }
        return i(j10);
    }

    public static final int l(long j10) {
        if (n(j10) > i(j10)) {
            return i(j10);
        }
        return n(j10);
    }

    public static final boolean m(long j10) {
        if (n(j10) > i(j10)) {
            return true;
        }
        return false;
    }

    public static final int n(long j10) {
        return (int) (j10 >> 32);
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean p(long j10, long j11) {
        if (l(j10) >= k(j11) || l(j11) >= k(j10)) {
            return false;
        }
        return true;
    }

    public static String q(long j10) {
        return "TextRange(" + n(j10) + ", " + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f5293a, obj);
    }

    public int hashCode() {
        return o(this.f5293a);
    }

    public final /* synthetic */ long r() {
        return this.f5293a;
    }

    public String toString() {
        return q(this.f5293a);
    }

    public static long c(long j10) {
        return j10;
    }
}
