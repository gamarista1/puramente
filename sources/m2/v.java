package m2;

public final class v extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final int f23732a;

    public v(int i10) {
        super(a(i10));
        this.f23732a = i10;
    }

    private static String a(int i10) {
        if (i10 == 1) {
            return "Player release timed out.";
        }
        if (i10 == 2) {
            return "Setting foreground mode timed out.";
        }
        if (i10 != 3) {
            return "Undefined timeout.";
        }
        return "Detaching surface timed out.";
    }
}
