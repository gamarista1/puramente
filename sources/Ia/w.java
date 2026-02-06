package ia;

import ia.A;
import ia.B;
import ia.y;
import java.io.FileNotFoundException;
import java.io.IOException;
import k9.L0;

public class w implements A {

    /* renamed from: a  reason: collision with root package name */
    private final int f44553a;

    public w() {
        this(-1);
    }

    public int a(int i10) {
        int i11 = this.f44553a;
        if (i11 != -1) {
            return i11;
        }
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    public long c(A.c cVar) {
        IOException iOException = cVar.f44360c;
        if ((iOException instanceof L0) || (iOException instanceof FileNotFoundException) || (iOException instanceof y.b) || (iOException instanceof B.h) || C3613k.a(iOException)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((cVar.f44361d - 1) * 1000, 5000);
    }

    public A.b d(A.a aVar, A.c cVar) {
        if (!e(cVar.f44360c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new A.b(1, 300000);
        }
        if (aVar.a(2)) {
            return new A.b(2, 60000);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean e(IOException iOException) {
        if (!(iOException instanceof y.f)) {
            return false;
        }
        int i10 = ((y.f) iOException).f44562d;
        if (i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503) {
            return true;
        }
        return false;
    }

    public w(int i10) {
        this.f44553a = i10;
    }
}
