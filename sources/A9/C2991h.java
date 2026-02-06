package A9;

import A9.I;
import ja.A;
import ja.B;
import ja.C3645a;
import q9.C3969d;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.y;
import q9.z;

/* renamed from: A9.h  reason: case insensitive filesystem */
public final class C2991h implements k {

    /* renamed from: m  reason: collision with root package name */
    public static final p f29545m = new C2990g();

    /* renamed from: a  reason: collision with root package name */
    private final int f29546a;

    /* renamed from: b  reason: collision with root package name */
    private final C2992i f29547b;

    /* renamed from: c  reason: collision with root package name */
    private final B f29548c;

    /* renamed from: d  reason: collision with root package name */
    private final B f29549d;

    /* renamed from: e  reason: collision with root package name */
    private final A f29550e;

    /* renamed from: f  reason: collision with root package name */
    private m f29551f;

    /* renamed from: g  reason: collision with root package name */
    private long f29552g;

    /* renamed from: h  reason: collision with root package name */
    private long f29553h;

    /* renamed from: i  reason: collision with root package name */
    private int f29554i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f29555j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f29556k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f29557l;

    public C2991h() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(q9.l r10) {
        /*
            r9 = this;
            boolean r0 = r9.f29555j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = -1
            r9.f29554i = r0
            r10.e()
            long r1 = r10.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0018
            r9.k(r10)
        L_0x0018:
            r1 = 0
            r2 = r1
        L_0x001a:
            r5 = 1
            ja.B r6 = r9.f29549d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 2
            boolean r6 = r10.c(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 == 0) goto L_0x0076
            ja.B r6 = r9.f29549d     // Catch:{ EOFException -> 0x0076 }
            r6.P(r1)     // Catch:{ EOFException -> 0x0076 }
            ja.B r6 = r9.f29549d     // Catch:{ EOFException -> 0x0076 }
            int r6 = r6.J()     // Catch:{ EOFException -> 0x0076 }
            boolean r6 = A9.C2992i.m(r6)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x003a
            goto L_0x0077
        L_0x003a:
            ja.B r6 = r9.f29549d     // Catch:{ EOFException -> 0x0076 }
            byte[] r6 = r6.d()     // Catch:{ EOFException -> 0x0076 }
            r7 = 4
            boolean r6 = r10.c(r6, r1, r7, r5)     // Catch:{ EOFException -> 0x0076 }
            if (r6 != 0) goto L_0x0048
            goto L_0x0076
        L_0x0048:
            ja.A r6 = r9.f29550e     // Catch:{ EOFException -> 0x0076 }
            r7 = 14
            r6.p(r7)     // Catch:{ EOFException -> 0x0076 }
            ja.A r6 = r9.f29550e     // Catch:{ EOFException -> 0x0076 }
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
            r9.f29555j = r5     // Catch:{ EOFException -> 0x0076 }
            java.lang.String r1 = "Malformed ADTS stream"
            r6 = 0
            k9.L0 r1 = k9.L0.a(r1, r6)     // Catch:{ EOFException -> 0x0076 }
            throw r1     // Catch:{ EOFException -> 0x0076 }
        L_0x0076:
            r1 = r2
        L_0x0077:
            r10.e()
            if (r1 <= 0) goto L_0x0082
            long r0 = (long) r1
            long r3 = r3 / r0
            int r10 = (int) r3
            r9.f29554i = r10
            goto L_0x0084
        L_0x0082:
            r9.f29554i = r0
        L_0x0084:
            r9.f29555j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.C2991h.c(q9.l):void");
    }

    private static int d(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private z e(long j10, boolean z10) {
        return new C3969d(j10, this.f29553h, d(this.f29554i, this.f29547b.k()), this.f29554i, z10);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] g() {
        return new k[]{new C2991h()};
    }

    private void j(long j10, boolean z10) {
        boolean z11;
        if (!this.f29557l) {
            boolean z12 = false;
            if ((this.f29546a & 1) == 0 || this.f29554i <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11 || this.f29547b.k() != -9223372036854775807L || z10) {
                if (!z11 || this.f29547b.k() == -9223372036854775807L) {
                    this.f29551f.q(new z.b(-9223372036854775807L));
                } else {
                    m mVar = this.f29551f;
                    if ((this.f29546a & 2) != 0) {
                        z12 = true;
                    }
                    mVar.q(e(j10, z12));
                }
                this.f29557l = true;
            }
        }
    }

    private int k(l lVar) {
        int i10 = 0;
        while (true) {
            lVar.l(this.f29549d.d(), 0, 10);
            this.f29549d.P(0);
            if (this.f29549d.G() != 4801587) {
                break;
            }
            this.f29549d.Q(3);
            int C10 = this.f29549d.C();
            i10 += C10 + 10;
            lVar.h(C10);
        }
        lVar.e();
        lVar.h(i10);
        if (this.f29553h == -1) {
            this.f29553h = (long) i10;
        }
        return i10;
    }

    public void a(long j10, long j11) {
        this.f29556k = false;
        this.f29547b.a();
        this.f29552g = j11;
    }

    public void f(m mVar) {
        this.f29551f = mVar;
        this.f29547b.f(mVar, new I.d(0, 1));
        mVar.k();
    }

    public boolean h(l lVar) {
        int k10 = k(lVar);
        int i10 = k10;
        int i11 = 0;
        int i12 = 0;
        do {
            lVar.l(this.f29549d.d(), 0, 2);
            this.f29549d.P(0);
            if (!C2992i.m(this.f29549d.J())) {
                i10++;
                lVar.e();
                lVar.h(i10);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                lVar.l(this.f29549d.d(), 0, 4);
                this.f29550e.p(14);
                int h10 = this.f29550e.h(13);
                if (h10 <= 6) {
                    i10++;
                    lVar.e();
                    lVar.h(i10);
                } else {
                    lVar.h(h10 - 6);
                    i12 += h10;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - k10 < 8192);
        return false;
    }

    public int i(l lVar, y yVar) {
        boolean z10;
        C3645a.h(this.f29551f);
        long a10 = lVar.a();
        int i10 = this.f29546a;
        if (!((i10 & 2) == 0 && ((i10 & 1) == 0 || a10 == -1))) {
            c(lVar);
        }
        int read = lVar.read(this.f29548c.d(), 0, 2048);
        if (read == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        j(a10, z10);
        if (z10) {
            return -1;
        }
        this.f29548c.P(0);
        this.f29548c.O(read);
        if (!this.f29556k) {
            this.f29547b.d(this.f29552g, 4);
            this.f29556k = true;
        }
        this.f29547b.c(this.f29548c);
        return 0;
    }

    public C2991h(int i10) {
        this.f29546a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f29547b = new C2992i(true);
        this.f29548c = new B(2048);
        this.f29554i = -1;
        this.f29553h = -1;
        B b10 = new B(10);
        this.f29549d = b10;
        this.f29550e = new A(b10.d());
    }

    public void release() {
    }
}
