package q9;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import ja.B;
import ja.M;
import k9.L0;

public abstract class q {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f47892a;
    }

    private static boolean a(B b10, t tVar, int i10) {
        int j10 = j(b10, i10);
        if (j10 == -1 || j10 > tVar.f47897b) {
            return false;
        }
        return true;
    }

    private static boolean b(B b10, int i10) {
        if (b10.D() == M.u(b10.d(), i10, b10.e() - 1, 0)) {
            return true;
        }
        return false;
    }

    private static boolean c(B b10, t tVar, boolean z10, a aVar) {
        try {
            long K10 = b10.K();
            if (!z10) {
                K10 *= (long) tVar.f47897b;
            }
            aVar.f47892a = K10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(B b10, t tVar, int i10, a aVar) {
        boolean z10;
        boolean z11;
        B b11 = b10;
        t tVar2 = tVar;
        int e10 = b10.e();
        long F10 = b10.F();
        long j10 = F10 >>> 16;
        if (j10 != ((long) i10)) {
            return false;
        }
        if ((j10 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (int) ((F10 >> 12) & 15);
        int i12 = (int) ((F10 >> 8) & 15);
        int i13 = (int) ((F10 >> 4) & 15);
        int i14 = (int) ((F10 >> 1) & 7);
        if ((F10 & 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!g(i13, tVar2) || !f(i14, tVar2) || z11 || !c(b11, tVar2, z10, aVar) || !a(b11, tVar2, i11) || !e(b11, tVar2, i12) || !b(b11, e10)) {
            return false;
        }
        return true;
    }

    private static boolean e(B b10, t tVar, int i10) {
        int i11 = tVar.f47900e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            if (i10 == tVar.f47901f) {
                return true;
            }
            return false;
        } else if (i10 == 12) {
            if (b10.D() * 1000 == i11) {
                return true;
            }
            return false;
        } else if (i10 > 14) {
            return false;
        } else {
            int J10 = b10.J();
            if (i10 == 14) {
                J10 *= 10;
            }
            if (J10 == i11) {
                return true;
            }
            return false;
        }
    }

    private static boolean f(int i10, t tVar) {
        if (i10 == 0 || i10 == tVar.f47904i) {
            return true;
        }
        return false;
    }

    private static boolean g(int i10, t tVar) {
        if (i10 <= 7) {
            if (i10 == tVar.f47902g - 1) {
                return true;
            }
            return false;
        } else if (i10 > 10 || tVar.f47902g != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean h(l lVar, t tVar, int i10, a aVar) {
        long g10 = lVar.g();
        byte[] bArr = new byte[2];
        lVar.l(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            lVar.e();
            lVar.h((int) (g10 - lVar.getPosition()));
            return false;
        }
        B b10 = new B(16);
        System.arraycopy(bArr, 0, b10.d(), 0, 2);
        b10.O(n.c(lVar, b10.d(), 2, 14));
        lVar.e();
        lVar.h((int) (g10 - lVar.getPosition()));
        return d(b10, tVar, i10, aVar);
    }

    public static long i(l lVar, t tVar) {
        int i10;
        lVar.e();
        boolean z10 = true;
        lVar.h(1);
        byte[] bArr = new byte[1];
        lVar.l(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        lVar.h(2);
        if (z10) {
            i10 = 7;
        } else {
            i10 = 6;
        }
        B b10 = new B(i10);
        b10.O(n.c(lVar, b10.d(), 0, i10));
        lVar.e();
        a aVar = new a();
        if (c(b10, tVar, z10, aVar)) {
            return aVar.f47892a;
        }
        throw L0.a((String) null, (Throwable) null);
    }

    public static int j(B b10, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return b10.D() + 1;
            case 7:
                return b10.J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case StdKeyDeserializer.TYPE_URL:
            case StdKeyDeserializer.TYPE_CLASS:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
