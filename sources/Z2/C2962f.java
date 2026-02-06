package z2;

import i2.C2073A;
import i2.C2076a;
import i2.p;
import z2.O;

/* renamed from: z2.f  reason: case insensitive filesystem */
public abstract class C2962f {
    public static void a(long j10, C2073A a10, O[] oArr) {
        int i10;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (a10.a() > 1) {
                int c10 = c(a10);
                int c11 = c(a10);
                int f10 = a10.f() + c11;
                if (c11 == -1 || c11 > a10.a()) {
                    p.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    f10 = a10.g();
                } else if (c10 == 4 && c11 >= 8) {
                    int H10 = a10.H();
                    int N10 = a10.N();
                    if (N10 == 49) {
                        i10 = a10.q();
                    } else {
                        i10 = 0;
                    }
                    int H11 = a10.H();
                    if (N10 == 47) {
                        a10.V(1);
                    }
                    if (H10 == 181 && ((N10 == 49 || N10 == 47) && H11 == 3)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (N10 == 49) {
                        if (i10 != 1195456820) {
                            z11 = false;
                        }
                        z10 &= z11;
                    }
                    if (z10) {
                        b(j10, a10, oArr);
                    }
                }
                a10.U(f10);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, C2073A a10, O[] oArr) {
        boolean z10;
        C2073A a11 = a10;
        O[] oArr2 = oArr;
        int H10 = a10.H();
        if ((H10 & 64) != 0) {
            a11.V(1);
            int i10 = (H10 & 31) * 3;
            int f10 = a10.f();
            for (O o10 : oArr2) {
                a11.U(f10);
                o10.f(a11, i10);
                if (j10 != -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C2076a.g(z10);
                o10.d(j10, 1, i10, 0, (O.a) null);
            }
        }
    }

    private static int c(C2073A a10) {
        int i10 = 0;
        while (a10.a() != 0) {
            int H10 = a10.H();
            i10 += H10;
            if (H10 != 255) {
                return i10;
            }
        }
        return -1;
    }
}
