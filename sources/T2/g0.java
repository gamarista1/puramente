package t2;

import androidx.media3.exoplayer.U;
import i2.C2076a;
import l2.f;
import m2.C2190B;
import m2.w;
import t2.C2614B;
import v2.x;

final class g0 implements C2614B, C2614B.a {

    /* renamed from: a  reason: collision with root package name */
    private final C2614B f26259a;

    /* renamed from: b  reason: collision with root package name */
    private final long f26260b;

    /* renamed from: c  reason: collision with root package name */
    private C2614B.a f26261c;

    private static final class a implements Z {

        /* renamed from: a  reason: collision with root package name */
        private final Z f26262a;

        /* renamed from: b  reason: collision with root package name */
        private final long f26263b;

        public a(Z z10, long j10) {
            this.f26262a = z10;
            this.f26263b = j10;
        }

        public int a(w wVar, f fVar, int i10) {
            int a10 = this.f26262a.a(wVar, fVar, i10);
            if (a10 == -4) {
                fVar.f23522f += this.f26263b;
            }
            return a10;
        }

        public Z b() {
            return this.f26262a;
        }

        public boolean d() {
            return this.f26262a.d();
        }

        public void e() {
            this.f26262a.e();
        }

        public int k(long j10) {
            return this.f26262a.k(j10 - this.f26263b);
        }
    }

    public g0(C2614B b10, long j10) {
        this.f26259a = b10;
        this.f26260b = j10;
    }

    public long a() {
        long a10 = this.f26259a.a();
        if (a10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f26260b + a10;
    }

    public boolean b() {
        return this.f26259a.b();
    }

    public long c() {
        long c10 = this.f26259a.c();
        if (c10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f26260b + c10;
    }

    public boolean e(U u10) {
        return this.f26259a.e(u10.a().f(u10.f17543a - this.f26260b).d());
    }

    public void f(long j10) {
        this.f26259a.f(j10 - this.f26260b);
    }

    public long g(long j10) {
        return this.f26259a.g(j10 - this.f26260b) + this.f26260b;
    }

    public long h() {
        long h10 = this.f26259a.h();
        if (h10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f26260b + h10;
    }

    public void i(C2614B b10) {
        ((C2614B.a) C2076a.e(this.f26261c)).i(this);
    }

    public void j() {
        this.f26259a.j();
    }

    public C2614B k() {
        return this.f26259a;
    }

    /* renamed from: l */
    public void d(C2614B b10) {
        ((C2614B.a) C2076a.e(this.f26261c)).d(this);
    }

    public j0 n() {
        return this.f26259a.n();
    }

    public void o(long j10, boolean z10) {
        this.f26259a.o(j10 - this.f26260b, z10);
    }

    public void p(C2614B.a aVar, long j10) {
        this.f26261c = aVar;
        this.f26259a.p(this, j10 - this.f26260b);
    }

    public long s(long j10, C2190B b10) {
        return this.f26259a.s(j10 - this.f26260b, b10) + this.f26260b;
    }

    public long t(x[] xVarArr, boolean[] zArr, Z[] zArr2, boolean[] zArr3, long j10) {
        Z[] zArr4 = zArr2;
        Z[] zArr5 = new Z[zArr4.length];
        int i10 = 0;
        while (true) {
            Z z10 = null;
            if (i10 >= zArr4.length) {
                break;
            }
            a aVar = (a) zArr4[i10];
            if (aVar != null) {
                z10 = aVar.b();
            }
            zArr5[i10] = z10;
            i10++;
        }
        long t10 = this.f26259a.t(xVarArr, zArr, zArr5, zArr3, j10 - this.f26260b);
        for (int i11 = 0; i11 < zArr4.length; i11++) {
            Z z11 = zArr5[i11];
            if (z11 == null) {
                zArr4[i11] = null;
            } else {
                Z z12 = zArr4[i11];
                if (z12 == null || ((a) z12).b() != z11) {
                    zArr4[i11] = new a(z11, this.f26260b);
                }
            }
        }
        return t10 + this.f26260b;
    }
}
