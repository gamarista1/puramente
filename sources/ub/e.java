package Ub;

public class e extends RuntimeException {
    private static final long serialVersionUID = 1;

    public e(String str) {
        super(str);
    }

    public e(String str, Throwable th2) {
        super(str, th2);
    }
}
