package q9;

import I9.h;
import com.google.common.collect.C4770v;
import ja.A;
import ja.B;
import java.util.Arrays;
import java.util.List;
import k9.L0;
import q9.t;

public abstract class r {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public t f47893a;

        public a(t tVar) {
            this.f47893a = tVar;
        }
    }

    public static boolean a(l lVar) {
        B b10 = new B(4);
        lVar.l(b10.d(), 0, 4);
        if (b10.F() == 1716281667) {
            return true;
        }
        return false;
    }

    public static int b(l lVar) {
        lVar.e();
        B b10 = new B(2);
        lVar.l(b10.d(), 0, 2);
        int J10 = b10.J();
        if ((J10 >> 2) == 16382) {
            lVar.e();
            return J10;
        }
        lVar.e();
        throw L0.a("First frame does not start with sync code.", (Throwable) null);
    }

    public static D9.a c(l lVar, boolean z10) {
        h.a aVar;
        if (z10) {
            aVar = null;
        } else {
            aVar = h.f31805b;
        }
        D9.a a10 = new w().a(lVar, aVar);
        if (a10 == null || a10.d() == 0) {
            return null;
        }
        return a10;
    }

    public static D9.a d(l lVar, boolean z10) {
        lVar.e();
        long g10 = lVar.g();
        D9.a c10 = c(lVar, z10);
        lVar.j((int) (lVar.g() - g10));
        return c10;
    }

    public static boolean e(l lVar, a aVar) {
        lVar.e();
        A a10 = new A(new byte[4]);
        lVar.l(a10.f44946a, 0, 4);
        boolean g10 = a10.g();
        int h10 = a10.h(7);
        int h11 = a10.h(24) + 4;
        if (h10 == 0) {
            aVar.f47893a = h(lVar);
        } else {
            t tVar = aVar.f47893a;
            if (tVar == null) {
                throw new IllegalArgumentException();
            } else if (h10 == 3) {
                aVar.f47893a = tVar.b(g(lVar, h11));
            } else if (h10 == 4) {
                aVar.f47893a = tVar.c(j(lVar, h11));
            } else if (h10 == 6) {
                B b10 = new B(h11);
                lVar.readFully(b10.d(), 0, h11);
                b10.Q(4);
                aVar.f47893a = tVar.a(C4770v.H(G9.a.a(b10)));
            } else {
                lVar.j(h11);
            }
        }
        return g10;
    }

    public static t.a f(B b10) {
        b10.Q(1);
        int G10 = b10.G();
        long e10 = ((long) b10.e()) + ((long) G10);
        int i10 = G10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long w10 = b10.w();
            if (w10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = w10;
            jArr2[i11] = b10.w();
            b10.Q(2);
            i11++;
        }
        b10.Q((int) (e10 - ((long) b10.e())));
        return new t.a(jArr, jArr2);
    }

    private static t.a g(l lVar, int i10) {
        B b10 = new B(i10);
        lVar.readFully(b10.d(), 0, i10);
        return f(b10);
    }

    private static t h(l lVar) {
        byte[] bArr = new byte[38];
        lVar.readFully(bArr, 0, 38);
        return new t(bArr, 4);
    }

    public static void i(l lVar) {
        B b10 = new B(4);
        lVar.readFully(b10.d(), 0, 4);
        if (b10.F() != 1716281667) {
            throw L0.a("Failed to read FLAC stream marker.", (Throwable) null);
        }
    }

    private static List j(l lVar, int i10) {
        B b10 = new B(i10);
        lVar.readFully(b10.d(), 0, i10);
        b10.Q(4);
        return Arrays.asList(C3965E.j(b10, false, false).f47812b);
    }
}
