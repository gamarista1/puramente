package lf;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: lf.G  reason: case insensitive filesystem */
public final class C6508G implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f71802b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f71803a;

    /* renamed from: lf.G$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ C6508G(long j10) {
        this.f71803a = j10;
    }

    public static final /* synthetic */ C6508G a(long j10) {
        return new C6508G(j10);
    }

    public static boolean c(long j10, Object obj) {
        if ((obj instanceof C6508G) && j10 == ((C6508G) obj).j()) {
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

    public static int f(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return C6516O.d(j10, 10);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C6516O.b(j(), ((C6508G) obj).j());
    }

    public boolean equals(Object obj) {
        return c(this.f71803a, obj);
    }

    public int hashCode() {
        return f(this.f71803a);
    }

    public final /* synthetic */ long j() {
        return this.f71803a;
    }

    public String toString() {
        return i(this.f71803a);
    }

    public static long b(long j10) {
        return j10;
    }
}
