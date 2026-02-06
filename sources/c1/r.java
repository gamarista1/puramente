package c1;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19235b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f19236c = c(0);

    /* renamed from: a  reason: collision with root package name */
    private final long f19237a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return r.f19236c;
        }

        private a() {
        }
    }

    private /* synthetic */ r(long j10) {
        this.f19237a = j10;
    }

    public static final /* synthetic */ r b(long j10) {
        return new r(j10);
    }

    public static boolean d(long j10, Object obj) {
        if ((obj instanceof r) && j10 == ((r) obj).j()) {
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

    public static final int f(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int g(long j10) {
        return (int) (j10 >> 32);
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return g(j10) + " x " + f(j10);
    }

    public boolean equals(Object obj) {
        return d(this.f19237a, obj);
    }

    public int hashCode() {
        return h(this.f19237a);
    }

    public final /* synthetic */ long j() {
        return this.f19237a;
    }

    public String toString() {
        return i(this.f19237a);
    }

    public static long c(long j10) {
        return j10;
    }
}
