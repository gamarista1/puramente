package f3;

import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.z;
import z2.C2964h;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.r;
import z2.u;

/* renamed from: f3.h  reason: case insensitive filesystem */
public final class C1992h implements C2972p {

    /* renamed from: m  reason: collision with root package name */
    public static final u f20521m = new C1991g();

    /* renamed from: a  reason: collision with root package name */
    private final int f20522a;

    /* renamed from: b  reason: collision with root package name */
    private final C1993i f20523b;

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f20524c;

    /* renamed from: d  reason: collision with root package name */
    private final C2073A f20525d;

    /* renamed from: e  reason: collision with root package name */
    private final z f20526e;

    /* renamed from: f  reason: collision with root package name */
    private r f20527f;

    /* renamed from: g  reason: collision with root package name */
    private long f20528g;

    /* renamed from: h  reason: collision with root package name */
    private long f20529h;

    /* renamed from: i  reason: collision with root package name */
    private int f20530i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f20531j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20532k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20533l;

    public C1992h() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(z2.C2973q r10) {
        /*
            r9 = this;
            boolean r0 = r9.f20531j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = -1
            r9.f20530i = r0
            r10.e()
            long r1 = r10.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0018
            r9.m(r10)
        L_0x0018:
            r1 = 0
            r2 = r1
        L_0x001a:
            r5 = 1
            i2.A r6 = r9.f20525d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.e()     // Catch:{ EOFException -> 0x0076 }
            r7 = 2
            boolean r6 = r10.c(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 == 0) goto L_0x0076
            i2.A r6 = r9.f20525d     // Catch:{ EOFException -> 0x0076 }
            r6.U(r1)     // Catch:{ EOFException -> 0x0076 }
            i2.A r6 = r9.f20525d     // Catch:{ EOFException -> 0x0076 }
            int r6 = r6.N()     // Catch:{ EOFException -> 0x0076 }
            boolean r6 = f3.C1993i.m(r6)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x003a
            goto L_0x0077
        L_0x003a:
            i2.A r6 = r9.f20525d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.e()     // Catch:{ EOFException -> 0x0076 }
            r7 = 4
            boolean r6 = r10.c(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            i2.z r6 = r9.f20526e     // Catch:{ EOFException -> 0x0076 }
            r7 = 14
            r6.p(r7)     // Catch:{ EOFException -> 0x0076 }
            i2.z r6 = r9.f20526e     // Catch:{ EOFException -> 0x0076 }
            r7 = 13
            int r6 = r6.h(r7)     // Catch:{ EOFException -> 0x0076 }
            r7 = 6
            if (r6 <= r7) goto L_0x006c
            long r7 = (long) r6     // Catch:{ EOFException -> 0x0076 }
            long r3 = r3 + r7
            int r2 = r2 + 1
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r7) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            int r6 = r6 + -6
            boolean r6 = r10.k(r6, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x001a
        L_0x006b:
            goto L_0x0076
        L_0x006c:
            r9.f20531j = r5     // Catch:{ EOFException -> 0x0076 }
            java.lang.String r1 = "Malformed ADTS stream"
            r6 = 0
            f2.B r1 = f2.C1961B.a(r1, r6)     // Catch:{ EOFException -> 0x0076 }
            throw r1     // Catch:{ EOFException -> 0x0076 }
        L_0x0076:
            r1 = r2
        L_0x0077:
            r10.e()
            if (r1 <= 0) goto L_0x0082
            long r0 = (long) r1
            long r3 = r3 / r0
            int r10 = (int) r3
            r9.f20530i = r10
            goto L_0x0084
        L_0x0082:
            r9.f20530i = r0
        L_0x0084:
            r9.f20531j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.C1992h.c(z2.q):void");
    }

    private static int d(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private J e(long j10, boolean z10) {
        return new C2964h(j10, this.f20529h, d(this.f20530i, this.f20523b.k()), this.f20530i, z10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] g() {
        return new C2972p[]{new C1992h()};
    }

    private void l(long j10, boolean z10) {
        boolean z11;
        if (!this.f20533l) {
            boolean z12 = false;
            if ((this.f20522a & 1) == 0 || this.f20530i <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11 || this.f20523b.k() != -9223372036854775807L || z10) {
                if (!z11 || this.f20523b.k() == -9223372036854775807L) {
                    this.f20527f.u(new J.b(-9223372036854775807L));
                } else {
                    r rVar = this.f20527f;
                    if ((this.f20522a & 2) != 0) {
                        z12 = true;
                    }
                    rVar.u(e(j10, z12));
                }
                this.f20533l = true;
            }
        }
    }

    private int m(C2973q qVar) {
        int i10 = 0;
        while (true) {
            qVar.l(this.f20525d.e(), 0, 10);
            this.f20525d.U(0);
            if (this.f20525d.K() != 4801587) {
                break;
            }
            this.f20525d.V(3);
            int G10 = this.f20525d.G();
            i10 += G10 + 10;
            qVar.h(G10);
        }
        qVar.e();
        qVar.h(i10);
        if (this.f20529h == -1) {
            this.f20529h = (long) i10;
        }
        return i10;
    }

    public void a(long j10, long j11) {
        this.f20532k = false;
        this.f20523b.a();
        this.f20528g = j11;
    }

    public void f(r rVar) {
        this.f20527f = rVar;
        this.f20523b.e(rVar, new K.d(0, 1));
        rVar.k();
    }

    public int i(C2973q qVar, I i10) {
        boolean z10;
        C2076a.i(this.f20527f);
        long a10 = qVar.a();
        int i11 = this.f20522a;
        if (!((i11 & 2) == 0 && ((i11 & 1) == 0 || a10 == -1))) {
            c(qVar);
        }
        int read = qVar.read(this.f20524c.e(), 0, 2048);
        if (read == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        l(a10, z10);
        if (z10) {
            return -1;
        }
        this.f20524c.U(0);
        this.f20524c.T(read);
        if (!this.f20532k) {
            this.f20523b.d(this.f20528g, 4);
            this.f20532k = true;
        }
        this.f20523b.b(this.f20524c);
        return 0;
    }

    public boolean j(C2973q qVar) {
        int m10 = m(qVar);
        int i10 = m10;
        int i11 = 0;
        int i12 = 0;
        do {
            qVar.l(this.f20525d.e(), 0, 2);
            this.f20525d.U(0);
            if (!C1993i.m(this.f20525d.N())) {
                i10++;
                qVar.e();
                qVar.h(i10);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                qVar.l(this.f20525d.e(), 0, 4);
                this.f20526e.p(14);
                int h10 = this.f20526e.h(13);
                if (h10 <= 6) {
                    i10++;
                    qVar.e();
                    qVar.h(i10);
                } else {
                    qVar.h(h10 - 6);
                    i12 += h10;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - m10 < 8192);
        return false;
    }

    public C1992h(int i10) {
        this.f20522a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f20523b = new C1993i(true);
        this.f20524c = new C2073A(2048);
        this.f20530i = -1;
        this.f20529h = -1;
        C2073A a10 = new C2073A(10);
        this.f20525d = a10;
        this.f20526e = new z(a10.e());
    }

    public void release() {
    }
}
