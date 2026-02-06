package Tc;

public abstract class f extends Exception {

    /* renamed from: a  reason: collision with root package name */
    protected static final boolean f52594a;

    /* renamed from: b  reason: collision with root package name */
    protected static final StackTraceElement[] f52595b = new StackTraceElement[0];

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f52594a = z10;
    }

    f() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
