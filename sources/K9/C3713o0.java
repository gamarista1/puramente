package k9;

/* renamed from: k9.o0  reason: case insensitive filesystem */
public final class C3713o0 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final int f45745a;

    public C3713o0(int i10) {
        super(a(i10));
        this.f45745a = i10;
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
