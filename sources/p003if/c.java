package p003if;

/* renamed from: if.c  reason: invalid package */
public abstract class c {
    public static Throwable a(Throwable th2) {
        h.c(th2, "throwable cannot be null");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        return th2;
    }
}
