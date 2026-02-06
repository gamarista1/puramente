package D0;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    private final int f1412a;

    private /* synthetic */ N(int i10) {
        this.f1412a = i10;
    }

    public static final /* synthetic */ N a(int i10) {
        return new N(i10);
    }

    public static boolean c(int i10, Object obj) {
        if ((obj instanceof N) && i10 == ((N) obj).f()) {
            return true;
        }
        return false;
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static String e(int i10) {
        return "PointerKeyboardModifiers(packedValue=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f1412a, obj);
    }

    public final /* synthetic */ int f() {
        return this.f1412a;
    }

    public int hashCode() {
        return d(this.f1412a);
    }

    public String toString() {
        return e(this.f1412a);
    }

    public static int b(int i10) {
        return i10;
    }
}
