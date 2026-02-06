package N4;

public class p extends RuntimeException {
    public p(String str) {
        super(str);
    }

    public p(Throwable th2) {
        super(th2);
    }

    public p(String str, Throwable th2) {
        super(str, th2);
    }
}
