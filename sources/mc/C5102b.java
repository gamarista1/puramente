package mc;

/* renamed from: mc.b  reason: case insensitive filesystem */
public class C5102b implements C5101a {

    /* renamed from: a  reason: collision with root package name */
    private static C5102b f61070a;

    private C5102b() {
    }

    public static C5102b a() {
        if (f61070a == null) {
            f61070a = new C5102b();
        }
        return f61070a;
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
