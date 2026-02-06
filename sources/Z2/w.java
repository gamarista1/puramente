package z2;

import N2.h;
import com.google.common.collect.C4770v;
import f2.C1961B;
import f2.z;
import i2.C2073A;
import java.util.Arrays;
import java.util.List;
import z2.y;

public abstract class w {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public y f29278a;

        public a(y yVar) {
            this.f29278a = yVar;
        }
    }

    public static boolean a(C2973q qVar) {
        C2073A a10 = new C2073A(4);
        qVar.l(a10.e(), 0, 4);
        if (a10.J() == 1716281667) {
            return true;
        }
        return false;
    }

    public static int b(C2973q qVar) {
        qVar.e();
        C2073A a10 = new C2073A(2);
        qVar.l(a10.e(), 0, 2);
        int N10 = a10.N();
        if ((N10 >> 2) == 16382) {
            qVar.e();
            return N10;
        }
        qVar.e();
        throw C1961B.a("First frame does not start with sync code.", (Throwable) null);
    }

    public static z c(C2973q qVar, boolean z10) {
        h.a aVar;
        if (z10) {
            aVar = null;
        } else {
            aVar = h.f4413b;
        }
        z a10 = new D().a(qVar, aVar);
        if (a10 == null || a10.e() == 0) {
            return null;
        }
        return a10;
    }

    public static z d(C2973q qVar, boolean z10) {
        qVar.e();
        long g10 = qVar.g();
        z c10 = c(qVar, z10);
        qVar.j((int) (qVar.g() - g10));
        return c10;
    }

    public static boolean e(C2973q qVar, a aVar) {
        qVar.e();
        i2.z zVar = new i2.z(new byte[4]);
        qVar.l(zVar.f22164a, 0, 4);
        boolean g10 = zVar.g();
        int h10 = zVar.h(7);
        int h11 = zVar.h(24) + 4;
        if (h10 == 0) {
            aVar.f29278a = h(qVar);
        } else {
            y yVar = aVar.f29278a;
            if (yVar == null) {
                throw new IllegalArgumentException();
            } else if (h10 == 3) {
                aVar.f29278a = yVar.b(g(qVar, h11));
            } else if (h10 == 4) {
                aVar.f29278a = yVar.c(j(qVar, h11));
            } else if (h10 == 6) {
                C2073A a10 = new C2073A(h11);
                qVar.readFully(a10.e(), 0, h11);
                a10.V(4);
                aVar.f29278a = yVar.a(C4770v.H(L2.a.a(a10)));
            } else {
                qVar.j(h11);
            }
        }
        return g10;
    }

    public static y.a f(C2073A a10) {
        a10.V(1);
        int K10 = a10.K();
        long f10 = ((long) a10.f()) + ((long) K10);
        int i10 = K10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long A10 = a10.A();
            if (A10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = A10;
            jArr2[i11] = a10.A();
            a10.V(2);
            i11++;
        }
        a10.V((int) (f10 - ((long) a10.f())));
        return new y.a(jArr, jArr2);
    }

    private static y.a g(C2973q qVar, int i10) {
        C2073A a10 = new C2073A(i10);
        qVar.readFully(a10.e(), 0, i10);
        return f(a10);
    }

    private static y h(C2973q qVar) {
        byte[] bArr = new byte[38];
        qVar.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(C2973q qVar) {
        C2073A a10 = new C2073A(4);
        qVar.readFully(a10.e(), 0, 4);
        if (a10.J() != 1716281667) {
            throw C1961B.a("Failed to read FLAC stream marker.", (Throwable) null);
        }
    }

    private static List j(C2973q qVar, int i10) {
        C2073A a10 = new C2073A(i10);
        qVar.readFully(a10.e(), 0, i10);
        a10.V(4);
        return Arrays.asList(S.k(a10, false, false).f29139b);
    }
}
