package f2;

public final class M extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final long f19905a;

    public M(Throwable th2, long j10) {
        super(th2);
        this.f19905a = j10;
    }

    public static M a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }

    public static M b(Exception exc, long j10) {
        if (exc instanceof M) {
            return (M) exc;
        }
        return new M(exc, j10);
    }
}
