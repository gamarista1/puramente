package T2;

import O2.d;
import f2.z;
import i2.C2073A;

public abstract class q {
    private static int a(int i10, C2073A a10, int i11) {
        if (i10 == 12) {
            return 240;
        }
        if (i10 == 13) {
            return 120;
        }
        if (i10 == 21 && a10.a() >= 8 && a10.f() + 8 <= i11) {
            int q10 = a10.q();
            int q11 = a10.q();
            if (q10 >= 12 && q11 == 1936877170) {
                return a10.I();
            }
        }
        return -2147483647;
    }

    public static z b(C2073A a10, int i10) {
        a10.V(12);
        while (a10.f() < i10) {
            int f10 = a10.f();
            int q10 = a10.q();
            if (a10.q() != 1935766900) {
                a10.U(f10 + q10);
            } else if (q10 < 16) {
                return null;
            } else {
                a10.V(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int H10 = a10.H();
                    int H11 = a10.H();
                    if (H10 == 0) {
                        i11 = H11;
                    } else if (H10 == 1) {
                        i12 = H11;
                    }
                }
                int a11 = a(i11, a10, i10);
                if (a11 == -2147483647) {
                    return null;
                }
                return new z(new d((float) a11, i12));
            }
        }
        return null;
    }
}
