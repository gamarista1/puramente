package A9;

import A9.I;
import android.util.SparseArray;
import ja.B;
import ja.C3645a;
import ja.I;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.y;
import q9.z;

public final class A implements k {

    /* renamed from: l  reason: collision with root package name */
    public static final p f29430l = new z();

    /* renamed from: a  reason: collision with root package name */
    private final I f29431a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray f29432b;

    /* renamed from: c  reason: collision with root package name */
    private final B f29433c;

    /* renamed from: d  reason: collision with root package name */
    private final y f29434d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f29435e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f29436f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f29437g;

    /* renamed from: h  reason: collision with root package name */
    private long f29438h;

    /* renamed from: i  reason: collision with root package name */
    private x f29439i;

    /* renamed from: j  reason: collision with root package name */
    private m f29440j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f29441k;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final m f29442a;

        /* renamed from: b  reason: collision with root package name */
        private final I f29443b;

        /* renamed from: c  reason: collision with root package name */
        private final ja.A f29444c = new ja.A(new byte[64]);

        /* renamed from: d  reason: collision with root package name */
        private boolean f29445d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f29446e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f29447f;

        /* renamed from: g  reason: collision with root package name */
        private int f29448g;

        /* renamed from: h  reason: collision with root package name */
        private long f29449h;

        public a(m mVar, I i10) {
            this.f29442a = mVar;
            this.f29443b = i10;
        }

        private void b() {
            this.f29444c.r(8);
            this.f29445d = this.f29444c.g();
            this.f29446e = this.f29444c.g();
            this.f29444c.r(6);
            this.f29448g = this.f29444c.h(8);
        }

        private void c() {
            this.f29449h = 0;
            if (this.f29445d) {
                this.f29444c.r(4);
                this.f29444c.r(1);
                this.f29444c.r(1);
                long h10 = (((long) this.f29444c.h(3)) << 30) | ((long) (this.f29444c.h(15) << 15)) | ((long) this.f29444c.h(15));
                this.f29444c.r(1);
                if (!this.f29447f && this.f29446e) {
                    this.f29444c.r(4);
                    this.f29444c.r(1);
                    this.f29444c.r(1);
                    this.f29444c.r(1);
                    this.f29443b.b((((long) this.f29444c.h(3)) << 30) | ((long) (this.f29444c.h(15) << 15)) | ((long) this.f29444c.h(15)));
                    this.f29447f = true;
                }
                this.f29449h = this.f29443b.b(h10);
            }
        }

        public void a(B b10) {
            b10.j(this.f29444c.f44946a, 0, 3);
            this.f29444c.p(0);
            b();
            b10.j(this.f29444c.f44946a, 0, this.f29448g);
            this.f29444c.p(0);
            c();
            this.f29442a.d(this.f29449h, 4);
            this.f29442a.c(b10);
            this.f29442a.e();
        }

        public void d() {
            this.f29447f = false;
            this.f29442a.a();
        }
    }

    public A() {
        this(new I(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] c() {
        return new k[]{new A()};
    }

    private void d(long j10) {
        if (!this.f29441k) {
            this.f29441k = true;
            if (this.f29434d.c() != -9223372036854775807L) {
                x xVar = new x(this.f29434d.d(), this.f29434d.c(), j10);
                this.f29439i = xVar;
                this.f29440j.q(xVar.b());
                return;
            }
            this.f29440j.q(new z.b(this.f29434d.c()));
        }
    }

    public void a(long j10, long j11) {
        boolean z10;
        boolean z11 = true;
        if (this.f29431a.e() == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            long c10 = this.f29431a.c();
            if (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            this.f29431a.g(j11);
        }
        x xVar = this.f29439i;
        if (xVar != null) {
            xVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f29432b.size(); i10++) {
            ((a) this.f29432b.valueAt(i10)).d();
        }
    }

    public void f(m mVar) {
        this.f29440j = mVar;
    }

    public boolean h(l lVar) {
        byte[] bArr = new byte[14];
        lVar.l(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lVar.h(bArr[13] & 7);
        lVar.l(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    public int i(l lVar, y yVar) {
        long j10;
        long j11;
        m mVar;
        C3645a.h(this.f29440j);
        long a10 = lVar.a();
        int i10 = (a10 > -1 ? 1 : (a10 == -1 ? 0 : -1));
        if (i10 != 0 && !this.f29434d.e()) {
            return this.f29434d.g(lVar, yVar);
        }
        d(a10);
        x xVar = this.f29439i;
        if (xVar != null && xVar.d()) {
            return this.f29439i.c(lVar, yVar);
        }
        lVar.e();
        if (i10 != 0) {
            j10 = a10 - lVar.g();
        } else {
            j10 = -1;
        }
        if ((j10 != -1 && j10 < 4) || !lVar.c(this.f29433c.d(), 0, 4, true)) {
            return -1;
        }
        this.f29433c.P(0);
        int n10 = this.f29433c.n();
        if (n10 == 441) {
            return -1;
        }
        if (n10 == 442) {
            lVar.l(this.f29433c.d(), 0, 10);
            this.f29433c.P(9);
            lVar.j((this.f29433c.D() & 7) + 14);
            return 0;
        } else if (n10 == 443) {
            lVar.l(this.f29433c.d(), 0, 2);
            this.f29433c.P(0);
            lVar.j(this.f29433c.J() + 6);
            return 0;
        } else if (((n10 & -256) >> 8) != 1) {
            lVar.j(1);
            return 0;
        } else {
            int i11 = n10 & 255;
            a aVar = (a) this.f29432b.get(i11);
            if (!this.f29435e) {
                if (aVar == null) {
                    if (i11 == 189) {
                        mVar = new C2986c();
                        this.f29436f = true;
                        this.f29438h = lVar.getPosition();
                    } else if ((n10 & 224) == 192) {
                        mVar = new t();
                        this.f29436f = true;
                        this.f29438h = lVar.getPosition();
                    } else if ((n10 & 240) == 224) {
                        mVar = new n();
                        this.f29437g = true;
                        this.f29438h = lVar.getPosition();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        mVar.f(this.f29440j, new I.d(i11, 256));
                        aVar = new a(mVar, this.f29431a);
                        this.f29432b.put(i11, aVar);
                    }
                }
                if (!this.f29436f || !this.f29437g) {
                    j11 = 1048576;
                } else {
                    j11 = this.f29438h + 8192;
                }
                if (lVar.getPosition() > j11) {
                    this.f29435e = true;
                    this.f29440j.k();
                }
            }
            lVar.l(this.f29433c.d(), 0, 2);
            this.f29433c.P(0);
            int J10 = this.f29433c.J() + 6;
            if (aVar == null) {
                lVar.j(J10);
            } else {
                this.f29433c.L(J10);
                lVar.readFully(this.f29433c.d(), 0, J10);
                this.f29433c.P(6);
                aVar.a(this.f29433c);
                B b10 = this.f29433c;
                b10.O(b10.b());
            }
            return 0;
        }
    }

    public A(ja.I i10) {
        this.f29431a = i10;
        this.f29433c = new B(4096);
        this.f29432b = new SparseArray();
        this.f29434d = new y();
    }

    public void release() {
    }
}
