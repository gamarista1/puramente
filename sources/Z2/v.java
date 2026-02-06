package z2;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import f2.C1961B;
import i2.C2073A;
import i2.L;

public abstract class v {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f29277a;
    }

    private static boolean a(C2073A a10, y yVar, int i10) {
        int j10 = j(a10, i10);
        if (j10 == -1 || j10 > yVar.f29282b) {
            return false;
        }
        return true;
    }

    private static boolean b(C2073A a10, int i10) {
        if (a10.H() == L.x(a10.e(), i10, a10.f() - 1, 0)) {
            return true;
        }
        return false;
    }

    private static boolean c(C2073A a10, y yVar, boolean z10, a aVar) {
        try {
            long O10 = a10.O();
            if (!z10) {
                O10 *= (long) yVar.f29282b;
            }
            aVar.f29277a = O10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(C2073A a10, y yVar, int i10, a aVar) {
        boolean z10;
        boolean z11;
        C2073A a11 = a10;
        y yVar2 = yVar;
        int f10 = a10.f();
        long J10 = a10.J();
        long j10 = J10 >>> 16;
        if (j10 != ((long) i10)) {
            return false;
        }
        if ((j10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (int) ((J10 >> 12) & 15);
        int i12 = (int) ((J10 >> 8) & 15);
        int i13 = (int) ((J10 >> 4) & 15);
        int i14 = (int) ((J10 >> 1) & 7);
        if ((J10 & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!g(i13, yVar2) || !f(i14, yVar2) || z11 || !c(a11, yVar2, z10, aVar) || !a(a11, yVar2, i11) || !e(a11, yVar2, i12) || !b(a11, f10)) {
            return false;
        }
        return true;
    }

    private static boolean e(C2073A a10, y yVar, int i10) {
        int i11 = yVar.f29285e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            if (i10 == yVar.f29286f) {
                return true;
            }
            return false;
        } else if (i10 == 12) {
            if (a10.H() * 1000 == i11) {
                return true;
            }
            return false;
        } else if (i10 > 14) {
            return false;
        } else {
            int N10 = a10.N();
            if (i10 == 14) {
                N10 *= 10;
            }
            if (N10 == i11) {
                return true;
            }
            return false;
        }
    }

    private static boolean f(int i10, y yVar) {
        if (i10 == 0 || i10 == yVar.f29289i) {
            return true;
        }
        return false;
    }

    private static boolean g(int i10, y yVar) {
        if (i10 <= 7) {
            if (i10 == yVar.f29287g - 1) {
                return true;
            }
            return false;
        } else if (i10 > 10 || yVar.f29287g != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean h(C2973q qVar, y yVar, int i10, a aVar) {
        long g10 = qVar.g();
        byte[] bArr = new byte[2];
        qVar.l(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            qVar.e();
            qVar.h((int) (g10 - qVar.getPosition()));
            return false;
        }
        C2073A a10 = new C2073A(16);
        System.arraycopy(bArr, 0, a10.e(), 0, 2);
        a10.T(C2974s.c(qVar, a10.e(), 2, 14));
        qVar.e();
        qVar.h((int) (g10 - qVar.getPosition()));
        return d(a10, yVar, i10, aVar);
    }

    public static long i(C2973q qVar, y yVar) {
        int i10;
        qVar.e();
        boolean z10 = true;
        qVar.h(1);
        byte[] bArr = new byte[1];
        qVar.l(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        qVar.h(2);
        if (z10) {
            i10 = 7;
        } else {
            i10 = 6;
        }
        C2073A a10 = new C2073A(i10);
        a10.T(C2974s.c(qVar, a10.e(), 0, i10));
        qVar.e();
        a aVar = new a();
        if (c(a10, yVar, z10, aVar)) {
            return aVar.f29277a;
        }
        throw C1961B.a((String) null, (Throwable) null);
    }

    public static int j(C2073A a10, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return a10.H() + 1;
            case 7:
                return a10.N() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL /*14*/:
            case StdKeyDeserializer.TYPE_CLASS /*15*/:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
