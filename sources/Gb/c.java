package Gb;

public class c extends RuntimeException {
    public c(String str) {
        super(str);
    }

    public c(String str, Throwable th2) {
        super(str, th2);
    }
}
