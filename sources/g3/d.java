package g3;

import android.util.Pair;
import f2.C1961B;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import i2.p;
import z2.C2973q;

abstract class d {

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f21085a;

        /* renamed from: b  reason: collision with root package name */
        public final long f21086b;

        private a(int i10, long j10) {
            this.f21085a = i10;
            this.f21086b = j10;
        }

        public static a a(C2973q qVar, C2073A a10) {
            qVar.l(a10.e(), 0, 8);
            a10.U(0);
            return new a(a10.q(), a10.x());
        }
    }

    public static boolean a(C2973q qVar) {
        C2073A a10 = new C2073A(8);
        int i10 = a.a(qVar, a10).f21085a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        qVar.l(a10.e(), 0, 4);
        a10.U(0);
        int q10 = a10.q();
        if (q10 == 1463899717) {
            return true;
        }
        p.c("WavHeaderReader", "Unsupported form type: " + q10);
        return false;
    }

    public static c b(C2973q qVar) {
        boolean z10;
        byte[] bArr;
        C2073A a10 = new C2073A(16);
        a d10 = d(1718449184, qVar, a10);
        if (d10.f21086b >= 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        qVar.l(a10.e(), 0, 16);
        a10.U(0);
        int z11 = a10.z();
        int z12 = a10.z();
        int y10 = a10.y();
        int y11 = a10.y();
        int z13 = a10.z();
        int z14 = a10.z();
        int i10 = ((int) d10.f21086b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            qVar.l(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = L.f22077f;
        }
        qVar.j((int) (qVar.g() - qVar.getPosition()));
        return new c(z11, z12, y10, y11, z13, z14, bArr);
    }

    public static long c(C2973q qVar) {
        C2073A a10 = new C2073A(8);
        a a11 = a.a(qVar, a10);
        if (a11.f21085a != 1685272116) {
            qVar.e();
            return -1;
        }
        qVar.h(8);
        a10.U(0);
        qVar.l(a10.e(), 0, 8);
        long v10 = a10.v();
        qVar.j(((int) a11.f21086b) + 8);
        return v10;
    }

    private static a d(int i10, C2973q qVar, C2073A a10) {
        a a11 = a.a(qVar, a10);
        while (a11.f21085a != i10) {
            p.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + a11.f21085a);
            long j10 = a11.f21086b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 <= 2147483647L) {
                qVar.j((int) j11);
                a11 = a.a(qVar, a10);
            } else {
                throw C1961B.c("Chunk is too large (~2GB+) to skip; id: " + a11.f21085a);
            }
        }
        return a11;
    }

    public static Pair e(C2973q qVar) {
        qVar.e();
        a d10 = d(1684108385, qVar, new C2073A(8));
        qVar.j(8);
        return Pair.create(Long.valueOf(qVar.getPosition()), Long.valueOf(d10.f21086b));
    }
}
