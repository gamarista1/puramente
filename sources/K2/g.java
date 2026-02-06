package k2;

import java.io.IOException;

public class g extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final int f23187a;

    public g(int i10) {
        this.f23187a = i10;
    }

    public static boolean a(IOException iOException) {
        Throwable th2;
        while (th2 != null) {
            if ((th2 instanceof g) && ((g) th2).f23187a == 2008) {
                return true;
            }
            Throwable cause = th2.getCause();
            th2 = iOException;
            th2 = cause;
        }
        return false;
    }

    public g(Throwable th2, int i10) {
        super(th2);
        this.f23187a = i10;
    }

    public g(String str, int i10) {
        super(str);
        this.f23187a = i10;
    }

    public g(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f23187a = i10;
    }
}
