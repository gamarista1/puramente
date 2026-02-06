package w2;

import f2.C1961B;
import java.io.FileNotFoundException;
import java.io.IOException;
import k2.g;
import k2.p;
import w2.C2827i;
import w2.C2828j;

/* renamed from: w2.h  reason: case insensitive filesystem */
public class C2826h implements C2827i {

    /* renamed from: a  reason: collision with root package name */
    private final int f27752a;

    public C2826h() {
        this(-1);
    }

    public int a(int i10) {
        int i11 = this.f27752a;
        if (i11 != -1) {
            return i11;
        }
        if (i10 == 7) {
            return 6;
        }
        return 3;
    }

    public long c(C2827i.a aVar) {
        IOException iOException = aVar.f27755c;
        if ((iOException instanceof C1961B) || (iOException instanceof FileNotFoundException) || (iOException instanceof p) || (iOException instanceof C2828j.h) || g.a(iOException)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((aVar.f27756d - 1) * 1000, 5000);
    }

    public C2826h(int i10) {
        this.f27752a = i10;
    }
}
