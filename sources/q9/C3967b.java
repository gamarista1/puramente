package q9;

import ja.B;
import ja.s;
import q9.C3962B;

/* renamed from: q9.b  reason: case insensitive filesystem */
public abstract class C3967b {
    public static void a(long j10, B b10, C3962B[] bArr) {
        int i10;
        boolean z10;
        while (true) {
            boolean z11 = true;
            if (b10.a() > 1) {
                int c10 = c(b10);
                int c11 = c(b10);
                int e10 = b10.e() + c11;
                if (c11 == -1 || c11 > b10.a()) {
                    s.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    e10 = b10.f();
                } else if (c10 == 4 && c11 >= 8) {
                    int D10 = b10.D();
                    int J10 = b10.J();
                    if (J10 == 49) {
                        i10 = b10.n();
                    } else {
                        i10 = 0;
                    }
                    int D11 = b10.D();
                    if (J10 == 47) {
                        b10.Q(1);
                    }
                    if (D10 == 181 && ((J10 == 49 || J10 == 47) && D11 == 3)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (J10 == 49) {
                        if (i10 != 1195456820) {
                            z11 = false;
                        }
                        z10 &= z11;
                    }
                    if (z10) {
                        b(j10, b10, bArr);
                    }
                }
                b10.P(e10);
            } else {
                return;
            }
        }
    }

    public static void b(long j10, B b10, C3962B[] bArr) {
        int D10 = b10.D();
        if ((D10 & 64) != 0) {
            b10.Q(1);
            int i10 = (D10 & 31) * 3;
            int e10 = b10.e();
            for (C3962B b11 : bArr) {
                b10.P(e10);
                b11.d(b10, i10);
                if (j10 != -9223372036854775807L) {
                    b11.f(j10, 1, i10, 0, (C3962B.a) null);
                }
            }
        }
    }

    private static int c(B b10) {
        int i10 = 0;
        while (b10.a() != 0) {
            int D10 = b10.D();
            i10 += D10;
            if (D10 != 255) {
                return i10;
            }
        }
        return -1;
    }
}
