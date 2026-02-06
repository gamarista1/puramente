package u9;

import ja.B;
import ja.C3645a;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.y;
import q9.z;

public final class c implements k {

    /* renamed from: q  reason: collision with root package name */
    public static final p f48672q = new b();

    /* renamed from: a  reason: collision with root package name */
    private final B f48673a = new B(4);

    /* renamed from: b  reason: collision with root package name */
    private final B f48674b = new B(9);

    /* renamed from: c  reason: collision with root package name */
    private final B f48675c = new B(11);

    /* renamed from: d  reason: collision with root package name */
    private final B f48676d = new B();

    /* renamed from: e  reason: collision with root package name */
    private final d f48677e = new d();

    /* renamed from: f  reason: collision with root package name */
    private m f48678f;

    /* renamed from: g  reason: collision with root package name */
    private int f48679g = 1;

    /* renamed from: h  reason: collision with root package name */
    private boolean f48680h;

    /* renamed from: i  reason: collision with root package name */
    private long f48681i;

    /* renamed from: j  reason: collision with root package name */
    private int f48682j;

    /* renamed from: k  reason: collision with root package name */
    private int f48683k;

    /* renamed from: l  reason: collision with root package name */
    private int f48684l;

    /* renamed from: m  reason: collision with root package name */
    private long f48685m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f48686n;

    /* renamed from: o  reason: collision with root package name */
    private C4102a f48687o;

    /* renamed from: p  reason: collision with root package name */
    private f f48688p;

    private void c() {
        if (!this.f48686n) {
            this.f48678f.q(new z.b(-9223372036854775807L));
            this.f48686n = true;
        }
    }

    private long d() {
        if (this.f48680h) {
            return this.f48681i + this.f48685m;
        }
        if (this.f48677e.d() == -9223372036854775807L) {
            return 0;
        }
        return this.f48685m;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] e() {
        return new k[]{new c()};
    }

    private B g(l lVar) {
        if (this.f48684l > this.f48676d.b()) {
            B b10 = this.f48676d;
            b10.N(new byte[Math.max(b10.b() * 2, this.f48684l)], 0);
        } else {
            this.f48676d.P(0);
        }
        this.f48676d.O(this.f48684l);
        lVar.readFully(this.f48676d.d(), 0, this.f48684l);
        return this.f48676d;
    }

    private boolean j(l lVar) {
        boolean z10;
        boolean z11 = false;
        if (!lVar.f(this.f48674b.d(), 0, 9, true)) {
            return false;
        }
        this.f48674b.P(0);
        this.f48674b.Q(4);
        int D10 = this.f48674b.D();
        if ((D10 & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((D10 & 1) != 0) {
            z11 = true;
        }
        if (z10 && this.f48687o == null) {
            this.f48687o = new C4102a(this.f48678f.d(8, 1));
        }
        if (z11 && this.f48688p == null) {
            this.f48688p = new f(this.f48678f.d(9, 2));
        }
        this.f48678f.k();
        this.f48682j = this.f48674b.n() - 5;
        this.f48679g = 2;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k(q9.l r10) {
        /*
            r9 = this;
            long r0 = r9.d()
            int r2 = r9.f48683k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L_0x0023
            u9.a r3 = r9.f48687o
            if (r3 == 0) goto L_0x0023
            r9.c()
            u9.a r2 = r9.f48687o
            ja.B r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
        L_0x0021:
            r0 = r6
            goto L_0x0075
        L_0x0023:
            r3 = 9
            if (r2 != r3) goto L_0x0039
            u9.f r3 = r9.f48688p
            if (r3 == 0) goto L_0x0039
            r9.c()
            u9.f r2 = r9.f48688p
            ja.B r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
            goto L_0x0021
        L_0x0039:
            r3 = 18
            if (r2 != r3) goto L_0x006e
            boolean r2 = r9.f48686n
            if (r2 != 0) goto L_0x006e
            u9.d r2 = r9.f48677e
            ja.B r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
            u9.d r0 = r9.f48677e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            q9.m r2 = r9.f48678f
            q9.x r3 = new q9.x
            u9.d r7 = r9.f48677e
            long[] r7 = r7.e()
            u9.d r8 = r9.f48677e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.q(r3)
            r9.f48686n = r6
            goto L_0x0021
        L_0x006e:
            int r0 = r9.f48684l
            r10.j(r0)
            r10 = 0
            r0 = r10
        L_0x0075:
            boolean r1 = r9.f48680h
            if (r1 != 0) goto L_0x008f
            if (r10 == 0) goto L_0x008f
            r9.f48680h = r6
            u9.d r10 = r9.f48677e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x008b
            long r1 = r9.f48685m
            long r1 = -r1
            goto L_0x008d
        L_0x008b:
            r1 = 0
        L_0x008d:
            r9.f48681i = r1
        L_0x008f:
            r10 = 4
            r9.f48682j = r10
            r10 = 2
            r9.f48679g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.c.k(q9.l):boolean");
    }

    private boolean l(l lVar) {
        if (!lVar.f(this.f48675c.d(), 0, 11, true)) {
            return false;
        }
        this.f48675c.P(0);
        this.f48683k = this.f48675c.D();
        this.f48684l = this.f48675c.G();
        this.f48685m = (long) this.f48675c.G();
        this.f48685m = (((long) (this.f48675c.D() << 24)) | this.f48685m) * 1000;
        this.f48675c.Q(3);
        this.f48679g = 4;
        return true;
    }

    private void m(l lVar) {
        lVar.j(this.f48682j);
        this.f48682j = 0;
        this.f48679g = 3;
    }

    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f48679g = 1;
            this.f48680h = false;
        } else {
            this.f48679g = 3;
        }
        this.f48682j = 0;
    }

    public void f(m mVar) {
        this.f48678f = mVar;
    }

    public boolean h(l lVar) {
        lVar.l(this.f48673a.d(), 0, 3);
        this.f48673a.P(0);
        if (this.f48673a.G() != 4607062) {
            return false;
        }
        lVar.l(this.f48673a.d(), 0, 2);
        this.f48673a.P(0);
        if ((this.f48673a.J() & 250) != 0) {
            return false;
        }
        lVar.l(this.f48673a.d(), 0, 4);
        this.f48673a.P(0);
        int n10 = this.f48673a.n();
        lVar.e();
        lVar.h(n10);
        lVar.l(this.f48673a.d(), 0, 4);
        this.f48673a.P(0);
        if (this.f48673a.n() == 0) {
            return true;
        }
        return false;
    }

    public int i(l lVar, y yVar) {
        C3645a.h(this.f48678f);
        while (true) {
            int i10 = this.f48679g;
            if (i10 != 1) {
                if (i10 == 2) {
                    m(lVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    } else if (k(lVar)) {
                        return 0;
                    }
                } else if (!l(lVar)) {
                    return -1;
                }
            } else if (!j(lVar)) {
                return -1;
            }
        }
    }

    public void release() {
    }
}
