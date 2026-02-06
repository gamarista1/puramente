package t2;

import androidx.media3.exoplayer.U;
import f2.C1960A;
import f2.I;
import f2.s;
import i2.C2076a;
import i2.L;
import i2.p;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import k2.f;
import k2.i;
import k2.j;
import k2.x;
import m2.C2190B;
import m2.w;
import t2.C2614B;
import t2.C2621I;
import w2.C2827i;
import w2.C2828j;

final class d0 implements C2614B, C2828j.b {

    /* renamed from: a  reason: collision with root package name */
    private final j f26193a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f26194b;

    /* renamed from: c  reason: collision with root package name */
    private final x f26195c;

    /* renamed from: d  reason: collision with root package name */
    private final C2827i f26196d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C2621I.a f26197e;

    /* renamed from: f  reason: collision with root package name */
    private final j0 f26198f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList f26199g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final long f26200h;

    /* renamed from: i  reason: collision with root package name */
    final C2828j f26201i = new C2828j("SingleSampleMediaPeriod");

    /* renamed from: j  reason: collision with root package name */
    final s f26202j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f26203k;

    /* renamed from: l  reason: collision with root package name */
    boolean f26204l;

    /* renamed from: m  reason: collision with root package name */
    byte[] f26205m;

    /* renamed from: n  reason: collision with root package name */
    int f26206n;

    private final class b implements Z {

        /* renamed from: a  reason: collision with root package name */
        private int f26207a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f26208b;

        private b() {
        }

        private void b() {
            if (!this.f26208b) {
                d0.this.f26197e.g(C1960A.i(d0.this.f26202j.f20083n), d0.this.f26202j, 0, (Object) null, 0);
                this.f26208b = true;
            }
        }

        public int a(w wVar, l2.f fVar, int i10) {
            b();
            d0 d0Var = d0.this;
            boolean z10 = d0Var.f26204l;
            if (z10 && d0Var.f26205m == null) {
                this.f26207a = 2;
            }
            int i11 = this.f26207a;
            if (i11 == 2) {
                fVar.f(4);
                return -4;
            } else if ((i10 & 2) != 0 || i11 == 0) {
                wVar.f23734b = d0Var.f26202j;
                this.f26207a = 1;
                return -5;
            } else if (!z10) {
                return -3;
            } else {
                C2076a.e(d0Var.f26205m);
                fVar.f(1);
                fVar.f23522f = 0;
                if ((i10 & 4) == 0) {
                    fVar.u(d0.this.f26206n);
                    ByteBuffer byteBuffer = fVar.f23520d;
                    d0 d0Var2 = d0.this;
                    byteBuffer.put(d0Var2.f26205m, 0, d0Var2.f26206n);
                }
                if ((i10 & 1) == 0) {
                    this.f26207a = 2;
                }
                return -4;
            }
        }

        public void c() {
            if (this.f26207a == 2) {
                this.f26207a = 1;
            }
        }

        public boolean d() {
            return d0.this.f26204l;
        }

        public void e() {
            d0 d0Var = d0.this;
            if (!d0Var.f26203k) {
                d0Var.f26201i.j();
            }
        }

        public int k(long j10) {
            b();
            if (j10 <= 0 || this.f26207a == 2) {
                return 0;
            }
            this.f26207a = 2;
            return 1;
        }
    }

    public d0(j jVar, f.a aVar, x xVar, s sVar, long j10, C2827i iVar, C2621I.a aVar2, boolean z10) {
        this.f26193a = jVar;
        this.f26194b = aVar;
        this.f26195c = xVar;
        this.f26202j = sVar;
        this.f26200h = j10;
        this.f26196d = iVar;
        this.f26197e = aVar2;
        this.f26203k = z10;
        this.f26198f = new j0(new I(sVar));
    }

    public long a() {
        if (this.f26204l || this.f26201i.i()) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public boolean b() {
        return this.f26201i.i();
    }

    public long c() {
        if (this.f26204l) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public boolean e(U u10) {
        if (this.f26204l || this.f26201i.i() || this.f26201i.h()) {
            return false;
        }
        f a10 = this.f26194b.a();
        x xVar = this.f26195c;
        if (xVar != null) {
            a10.n(xVar);
        }
        c cVar = new c(this.f26193a, a10);
        this.f26197e.t(new C2658x(cVar.f26210a, this.f26193a, this.f26201i.n(cVar, this, this.f26196d.a(1))), 1, -1, this.f26202j, 0, (Object) null, 0, this.f26200h);
        return true;
    }

    public long g(long j10) {
        for (int i10 = 0; i10 < this.f26199g.size(); i10++) {
            ((b) this.f26199g.get(i10)).c();
        }
        return j10;
    }

    public long h() {
        return -9223372036854775807L;
    }

    /* renamed from: i */
    public void m(c cVar, long j10, long j11, boolean z10) {
        c cVar2 = cVar;
        k2.w c10 = cVar.f26212c;
        C2658x xVar = new C2658x(cVar2.f26210a, cVar2.f26211b, c10.p(), c10.q(), j10, j11, c10.o());
        this.f26196d.b(cVar2.f26210a);
        this.f26197e.n(xVar, 1, -1, (s) null, 0, (Object) null, 0, this.f26200h);
    }

    /* renamed from: k */
    public void r(c cVar, long j10, long j11) {
        c cVar2 = cVar;
        this.f26206n = (int) cVar.f26212c.o();
        this.f26205m = (byte[]) C2076a.e(cVar.f26213d);
        this.f26204l = true;
        k2.w c10 = cVar.f26212c;
        C2658x xVar = new C2658x(cVar2.f26210a, cVar2.f26211b, c10.p(), c10.q(), j10, j11, (long) this.f26206n);
        this.f26196d.b(cVar2.f26210a);
        this.f26197e.p(xVar, 1, -1, this.f26202j, 0, (Object) null, 0, this.f26200h);
    }

    /* renamed from: l */
    public C2828j.c q(c cVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        C2828j.c cVar2;
        c cVar3 = cVar;
        IOException iOException2 = iOException;
        int i11 = i10;
        k2.w c10 = cVar.f26212c;
        C2658x xVar = new C2658x(cVar3.f26210a, cVar3.f26211b, c10.p(), c10.q(), j10, j11, c10.o());
        long c11 = this.f26196d.c(new C2827i.a(xVar, new C2613A(1, -1, this.f26202j, 0, (Object) null, 0, L.h1(this.f26200h)), iOException2, i11));
        int i12 = (c11 > -9223372036854775807L ? 1 : (c11 == -9223372036854775807L ? 0 : -1));
        if (i12 == 0 || i11 >= this.f26196d.a(1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f26203k && z10) {
            p.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.f26204l = true;
            cVar2 = C2828j.f27759f;
        } else if (i12 != 0) {
            cVar2 = C2828j.g(false, c11);
        } else {
            cVar2 = C2828j.f27760g;
        }
        C2828j.c cVar4 = cVar2;
        boolean c12 = cVar4.c();
        this.f26197e.r(xVar, 1, -1, this.f26202j, 0, (Object) null, 0, this.f26200h, iOException, !c12);
        if (!c12) {
            this.f26196d.b(cVar3.f26210a);
        }
        return cVar4;
    }

    public j0 n() {
        return this.f26198f;
    }

    public void p(C2614B.a aVar, long j10) {
        aVar.i(this);
    }

    public long t(v2.x[] xVarArr, boolean[] zArr, Z[] zArr2, boolean[] zArr3, long j10) {
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            Z z10 = zArr2[i10];
            if (z10 != null && (xVarArr[i10] == null || !zArr[i10])) {
                this.f26199g.remove(z10);
                zArr2[i10] = null;
            }
            if (zArr2[i10] == null && xVarArr[i10] != null) {
                b bVar = new b();
                this.f26199g.add(bVar);
                zArr2[i10] = bVar;
                zArr3[i10] = true;
            }
        }
        return j10;
    }

    public void u() {
        this.f26201i.l();
    }

    static final class c implements C2828j.e {

        /* renamed from: a  reason: collision with root package name */
        public final long f26210a = C2658x.a();

        /* renamed from: b  reason: collision with root package name */
        public final j f26211b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final k2.w f26212c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public byte[] f26213d;

        public c(j jVar, f fVar) {
            this.f26211b = jVar;
            this.f26212c = new k2.w(fVar);
        }

        public void a() {
            this.f26212c.r();
            try {
                this.f26212c.m(this.f26211b);
                int i10 = 0;
                while (i10 != -1) {
                    int o10 = (int) this.f26212c.o();
                    byte[] bArr = this.f26213d;
                    if (bArr == null) {
                        this.f26213d = new byte[1024];
                    } else if (o10 == bArr.length) {
                        this.f26213d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    k2.w wVar = this.f26212c;
                    byte[] bArr2 = this.f26213d;
                    i10 = wVar.read(bArr2, o10, bArr2.length - o10);
                }
                i.a(this.f26212c);
            } catch (Throwable th2) {
                i.a(this.f26212c);
                throw th2;
            }
        }

        public void b() {
        }
    }

    public void j() {
    }

    public void f(long j10) {
    }

    public void o(long j10, boolean z10) {
    }

    public long s(long j10, C2190B b10) {
        return j10;
    }
}
