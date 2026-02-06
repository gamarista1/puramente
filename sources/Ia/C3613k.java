package ia;

import java.io.IOException;

/* renamed from: ia.k  reason: case insensitive filesystem */
public class C3613k extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final int f44449a;

    public C3613k(int i10) {
        this.f44449a = i10;
    }

    public static boolean a(IOException iOException) {
        Throwable th2;
        while (th2 != null) {
            if ((th2 instanceof C3613k) && ((C3613k) th2).f44449a == 2008) {
                return true;
            }
            Throwable cause = th2.getCause();
            th2 = iOException;
            th2 = cause;
        }
        return false;
    }

    public C3613k(Throwable th2, int i10) {
        super(th2);
        this.f44449a = i10;
    }

    public C3613k(String str, int i10) {
        super(str);
        this.f44449a = i10;
    }

    public C3613k(String str, Throwable th2, int i10) {
        super(str, th2);
        this.f44449a = i10;
    }
}
