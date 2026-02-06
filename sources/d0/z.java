package D0;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final long f1517a;

    private /* synthetic */ z(long j10) {
        this.f1517a = j10;
    }

    public static final /* synthetic */ z a(long j10) {
        return new z(j10);
    }

    public static boolean c(long j10, Object obj) {
        if ((obj instanceof z) && j10 == ((z) obj).g()) {
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

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f1517a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f1517a;
    }

    public int hashCode() {
        return e(this.f1517a);
    }

    public String toString() {
        return f(this.f1517a);
    }

    public static long b(long j10) {
        return j10;
    }
}
