package f3;

import android.util.SparseArray;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.G;
import i2.z;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.r;
import z2.u;

/* renamed from: f3.C  reason: case insensitive filesystem */
public final class C1984C implements C2972p {

    /* renamed from: l  reason: collision with root package name */
    public static final u f20401l = new C1983B();

    /* renamed from: a  reason: collision with root package name */
    private final G f20402a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray f20403b;

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f20404c;

    /* renamed from: d  reason: collision with root package name */
    private final C1982A f20405d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20406e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20407f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20408g;

    /* renamed from: h  reason: collision with root package name */
    private long f20409h;

    /* renamed from: i  reason: collision with root package name */
    private z f20410i;

    /* renamed from: j  reason: collision with root package name */
    private r f20411j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20412k;

    /* renamed from: f3.C$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C1997m f20413a;

        /* renamed from: b  reason: collision with root package name */
        private final G f20414b;

        /* renamed from: c  reason: collision with root package name */
        private final z f20415c = new z(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        private boolean f20416d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f20417e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f20418f;

        /* renamed from: g  reason: collision with root package name */
        private int f20419g;

        /* renamed from: h  reason: collision with root package name */
        private long f20420h;

        public a(C1997m mVar, G g10) {
            this.f20413a = mVar;
            this.f20414b = g10;
        }

        private void b() {
            this.f20415c.r(8);
            this.f20416d = this.f20415c.g();
            this.f20417e = this.f20415c.g();
            this.f20415c.r(6);
            this.f20419g = this.f20415c.h(8);
        }

        private void c() {
            this.f20420h = 0;
            if (this.f20416d) {
                this.f20415c.r(4);
                this.f20415c.r(1);
                this.f20415c.r(1);
                long h10 = (((long) this.f20415c.h(3)) << 30) | ((long) (this.f20415c.h(15) << 15)) | ((long) this.f20415c.h(15));
                this.f20415c.r(1);
                if (!this.f20418f && this.f20417e) {
                    this.f20415c.r(4);
                    this.f20415c.r(1);
                    this.f20415c.r(1);
                    this.f20415c.r(1);
                    this.f20414b.b((((long) this.f20415c.h(3)) << 30) | ((long) (this.f20415c.h(15) << 15)) | ((long) this.f20415c.h(15)));
                    this.f20418f = true;
                }
                this.f20420h = this.f20414b.b(h10);
            }
        }

        public void a(C2073A a10) {
            a10.l(this.f20415c.f22164a, 0, 3);
            this.f20415c.p(0);
            b();
            a10.l(this.f20415c.f22164a, 0, this.f20419g);
            this.f20415c.p(0);
            c();
            this.f20413a.d(this.f20420h, 4);
            this.f20413a.b(a10);
            this.f20413a.c(false);
        }

        public void d() {
            this.f20418f = false;
            this.f20413a.a();
        }
    }

    public C1984C() {
        this(new G(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] c() {
        return new C2972p[]{new C1984C()};
    }

    private void d(long j10) {
        if (!this.f20412k) {
            this.f20412k = true;
            if (this.f20405d.c() != -9223372036854775807L) {
                z zVar = new z(this.f20405d.d(), this.f20405d.c(), j10);
                this.f20410i = zVar;
                this.f20411j.u(zVar.b());
                return;
            }
            this.f20411j.u(new J.b(this.f20405d.c()));
        }
    }

    public void a(long j10, long j11) {
        boolean z10;
        boolean z11 = true;
        if (this.f20402a.f() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long d10 = this.f20402a.d();
            if (d10 == -9223372036854775807L || d10 == 0 || d10 == j11) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            this.f20402a.i(j11);
        }
        z zVar = this.f20410i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f20403b.size(); i10++) {
            ((a) this.f20403b.valueAt(i10)).d();
        }
    }

    public void f(r rVar) {
        this.f20411j = rVar;
    }

    public int i(C2973q qVar, I i10) {
        long j10;
        long j11;
        C1997m mVar;
        C2076a.i(this.f20411j);
        long a10 = qVar.a();
        int i11 = (a10 > -1 ? 1 : (a10 == -1 ? 0 : -1));
        if (i11 != 0 && !this.f20405d.e()) {
            return this.f20405d.g(qVar, i10);
        }
        d(a10);
        z zVar = this.f20410i;
        if (zVar != null && zVar.d()) {
            return this.f20410i.c(qVar, i10);
        }
        qVar.e();
        if (i11 != 0) {
            j10 = a10 - qVar.g();
        } else {
            j10 = -1;
        }
        if ((j10 != -1 && j10 < 4) || !qVar.c(this.f20404c.e(), 0, 4, true)) {
            return -1;
        }
        this.f20404c.U(0);
        int q10 = this.f20404c.q();
        if (q10 == 441) {
            return -1;
        }
        if (q10 == 442) {
            qVar.l(this.f20404c.e(), 0, 10);
            this.f20404c.U(9);
            qVar.j((this.f20404c.H() & 7) + 14);
            return 0;
        } else if (q10 == 443) {
            qVar.l(this.f20404c.e(), 0, 2);
            this.f20404c.U(0);
            qVar.j(this.f20404c.N() + 6);
            return 0;
        } else if (((q10 & -256) >> 8) != 1) {
            qVar.j(1);
            return 0;
        } else {
            int i12 = q10 & 255;
            a aVar = (a) this.f20403b.get(i12);
            if (!this.f20406e) {
                if (aVar == null) {
                    if (i12 == 189) {
                        mVar = new C1987c();
                        this.f20407f = true;
                        this.f20409h = qVar.getPosition();
                    } else if ((q10 & 224) == 192) {
                        mVar = new t();
                        this.f20407f = true;
                        this.f20409h = qVar.getPosition();
                    } else if ((q10 & 240) == 224) {
                        mVar = new n();
                        this.f20408g = true;
                        this.f20409h = qVar.getPosition();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        mVar.e(this.f20411j, new K.d(i12, 256));
                        aVar = new a(mVar, this.f20402a);
                        this.f20403b.put(i12, aVar);
                    }
                }
                if (!this.f20407f || !this.f20408g) {
                    j11 = 1048576;
                } else {
                    j11 = this.f20409h + 8192;
                }
                if (qVar.getPosition() > j11) {
                    this.f20406e = true;
                    this.f20411j.k();
                }
            }
            qVar.l(this.f20404c.e(), 0, 2);
            this.f20404c.U(0);
            int N10 = this.f20404c.N() + 6;
            if (aVar == null) {
                qVar.j(N10);
            } else {
                this.f20404c.Q(N10);
                qVar.readFully(this.f20404c.e(), 0, N10);
                this.f20404c.U(6);
                aVar.a(this.f20404c);
                C2073A a11 = this.f20404c;
                a11.T(a11.b());
            }
            return 0;
        }
    }

    public boolean j(C2973q qVar) {
        byte[] bArr = new byte[14];
        qVar.l(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        qVar.h(bArr[13] & 7);
        qVar.l(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    public C1984C(G g10) {
        this.f20402a = g10;
        this.f20404c = new C2073A(4096);
        this.f20403b = new SparseArray();
        this.f20405d = new C1982A();
    }

    public void release() {
    }
}
