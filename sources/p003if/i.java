package p003if;

/* renamed from: if.i  reason: invalid package */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    static boolean f67894a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f67895b;

    static {
        boolean z10;
        try {
            f67894a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f67894a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                if (Double.valueOf(property).doubleValue() >= 9.0d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f67895b = z10;
                return;
            }
            f67895b = false;
        } catch (Throwable unused2) {
            f67895b = false;
        }
    }

    public static boolean a() {
        return f67895b;
    }

    public static boolean b() {
        return !f67894a;
    }
}
