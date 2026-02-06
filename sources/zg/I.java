package Zg;

abstract /* synthetic */ class I {

    /* renamed from: a  reason: collision with root package name */
    private static final int f66953a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f66953a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
