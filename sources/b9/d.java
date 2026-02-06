package B9;

import android.util.Pair;
import ja.B;
import ja.C3645a;
import ja.M;
import ja.s;
import k9.L0;
import q9.l;

abstract class d {

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f29884a;

        /* renamed from: b  reason: collision with root package name */
        public final long f29885b;

        private a(int i10, long j10) {
            this.f29884a = i10;
            this.f29885b = j10;
        }

        public static a a(l lVar, B b10) {
            lVar.l(b10.d(), 0, 8);
            b10.P(0);
            return new a(b10.n(), b10.t());
        }
    }

    public static boolean a(l lVar) {
        B b10 = new B(8);
        int i10 = a.a(lVar, b10).f29884a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        lVar.l(b10.d(), 0, 4);
        b10.P(0);
        int n10 = b10.n();
        if (n10 == 1463899717) {
            return true;
        }
        s.c("WavHeaderReader", "Unsupported form type: " + n10);
        return false;
    }

    public static c b(l lVar) {
        boolean z10;
        byte[] bArr;
        B b10 = new B(16);
        a d10 = d(1718449184, lVar, b10);
        if (d10.f29885b >= 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        lVar.l(b10.d(), 0, 16);
        b10.P(0);
        int v10 = b10.v();
        int v11 = b10.v();
        int u10 = b10.u();
        int u11 = b10.u();
        int v12 = b10.v();
        int v13 = b10.v();
        int i10 = ((int) d10.f29885b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            lVar.l(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = M.f44986f;
        }
        lVar.j((int) (lVar.g() - lVar.getPosition()));
        return new c(v10, v11, u10, u11, v12, v13, bArr);
    }

    public static long c(l lVar) {
        B b10 = new B(8);
        a a10 = a.a(lVar, b10);
        if (a10.f29884a != 1685272116) {
            lVar.e();
            return -1;
        }
        lVar.h(8);
        b10.P(0);
        lVar.l(b10.d(), 0, 8);
        long r10 = b10.r();
        lVar.j(((int) a10.f29885b) + 8);
        return r10;
    }

    private static a d(int i10, l lVar, B b10) {
        a a10 = a.a(lVar, b10);
        while (a10.f29884a != i10) {
            s.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + a10.f29884a);
            long j10 = a10.f29885b + 8;
            if (j10 <= 2147483647L) {
                lVar.j((int) j10);
                a10 = a.a(lVar, b10);
            } else {
                throw L0.d("Chunk is too large (~2GB+) to skip; id: " + a10.f29884a);
            }
        }
        return a10;
    }

    public static Pair e(l lVar) {
        lVar.e();
        a d10 = d(1684108385, lVar, new B(8));
        lVar.j(8);
        return Pair.create(Long.valueOf(lVar.getPosition()), Long.valueOf(d10.f29885b));
    }
}
