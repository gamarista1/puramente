package t2;

import f2.C1960A;
import f2.C1975j;
import f2.C1979n;
import f2.s;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import l2.f;
import m2.w;
import p2.C2409m;
import p2.t;
import p2.u;
import w2.C2820b;
import z2.O;

public class Y implements O {

    /* renamed from: A  reason: collision with root package name */
    private s f26117A;

    /* renamed from: B  reason: collision with root package name */
    private s f26118B;

    /* renamed from: C  reason: collision with root package name */
    private long f26119C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f26120D = true;

    /* renamed from: E  reason: collision with root package name */
    private boolean f26121E;

    /* renamed from: F  reason: collision with root package name */
    private long f26122F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f26123G;

    /* renamed from: a  reason: collision with root package name */
    private final C2634W f26124a;

    /* renamed from: b  reason: collision with root package name */
    private final b f26125b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final f0 f26126c = new f0(new X());

    /* renamed from: d  reason: collision with root package name */
    private final u f26127d;

    /* renamed from: e  reason: collision with root package name */
    private final t.a f26128e;

    /* renamed from: f  reason: collision with root package name */
    private d f26129f;

    /* renamed from: g  reason: collision with root package name */
    private s f26130g;

    /* renamed from: h  reason: collision with root package name */
    private C2409m f26131h;

    /* renamed from: i  reason: collision with root package name */
    private int f26132i = 1000;

    /* renamed from: j  reason: collision with root package name */
    private long[] f26133j = new long[1000];

    /* renamed from: k  reason: collision with root package name */
    private long[] f26134k = new long[1000];

    /* renamed from: l  reason: collision with root package name */
    private int[] f26135l = new int[1000];

    /* renamed from: m  reason: collision with root package name */
    private int[] f26136m = new int[1000];

    /* renamed from: n  reason: collision with root package name */
    private long[] f26137n = new long[1000];

    /* renamed from: o  reason: collision with root package name */
    private O.a[] f26138o = new O.a[1000];

    /* renamed from: p  reason: collision with root package name */
    private int f26139p;

    /* renamed from: q  reason: collision with root package name */
    private int f26140q;

    /* renamed from: r  reason: collision with root package name */
    private int f26141r;

    /* renamed from: s  reason: collision with root package name */
    private int f26142s;

    /* renamed from: t  reason: collision with root package name */
    private long f26143t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    private long f26144u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    private long f26145v = Long.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    private boolean f26146w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f26147x = true;

    /* renamed from: y  reason: collision with root package name */
    private boolean f26148y = true;

    /* renamed from: z  reason: collision with root package name */
    private boolean f26149z;

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f26150a;

        /* renamed from: b  reason: collision with root package name */
        public long f26151b;

        /* renamed from: c  reason: collision with root package name */
        public O.a f26152c;

        b() {
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final s f26153a;

        /* renamed from: b  reason: collision with root package name */
        public final u.b f26154b;

        private c(s sVar, u.b bVar) {
            this.f26153a = sVar;
            this.f26154b = bVar;
        }
    }

    public interface d {
        void l(s sVar);
    }

    protected Y(C2820b bVar, u uVar, t.a aVar) {
        this.f26127d = uVar;
        this.f26128e = aVar;
        this.f26124a = new C2634W(bVar);
    }

    private boolean D() {
        if (this.f26142s != this.f26139p) {
            return true;
        }
        return false;
    }

    private boolean H(int i10) {
        C2409m mVar = this.f26131h;
        if (mVar == null || mVar.getState() == 4 || ((this.f26136m[i10] & 1073741824) == 0 && this.f26131h.c())) {
            return true;
        }
        return false;
    }

    private void J(s sVar, w wVar) {
        boolean z10;
        C1979n nVar;
        s sVar2;
        s sVar3 = this.f26130g;
        if (sVar3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (sVar3 == null) {
            nVar = null;
        } else {
            nVar = sVar3.f20087r;
        }
        this.f26130g = sVar;
        C1979n nVar2 = sVar.f20087r;
        u uVar = this.f26127d;
        if (uVar != null) {
            sVar2 = sVar.b(uVar.d(sVar));
        } else {
            sVar2 = sVar;
        }
        wVar.f23734b = sVar2;
        wVar.f23733a = this.f26131h;
        if (this.f26127d != null) {
            if (z10 || !L.c(nVar, nVar2)) {
                C2409m mVar = this.f26131h;
                C2409m c10 = this.f26127d.c(this.f26128e, sVar);
                this.f26131h = c10;
                wVar.f23733a = c10;
                if (mVar != null) {
                    mVar.h(this.f26128e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int K(m2.w r6, l2.f r7, boolean r8, boolean r9, t2.Y.b r10) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r7.f23521e = r0     // Catch:{ all -> 0x001f }
            boolean r0 = r5.D()     // Catch:{ all -> 0x001f }
            r1 = -4
            r2 = -3
            r3 = -5
            if (r0 != 0) goto L_0x0039
            if (r9 != 0) goto L_0x002f
            boolean r9 = r5.f26146w     // Catch:{ all -> 0x001f }
            if (r9 == 0) goto L_0x0014
            goto L_0x002f
        L_0x0014:
            f2.s r7 = r5.f26118B     // Catch:{ all -> 0x001f }
            if (r7 == 0) goto L_0x002d
            if (r8 != 0) goto L_0x0022
            f2.s r8 = r5.f26130g     // Catch:{ all -> 0x001f }
            if (r7 == r8) goto L_0x002d
            goto L_0x0022
        L_0x001f:
            r6 = move-exception
            goto L_0x0097
        L_0x0022:
            java.lang.Object r7 = i2.C2076a.e(r7)     // Catch:{ all -> 0x001f }
            f2.s r7 = (f2.s) r7     // Catch:{ all -> 0x001f }
            r5.J(r7, r6)     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r3
        L_0x002d:
            monitor-exit(r5)
            return r2
        L_0x002f:
            r6 = 4
            r7.s(r6)     // Catch:{ all -> 0x001f }
            r8 = -9223372036854775808
            r7.f23522f = r8     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r1
        L_0x0039:
            t2.f0 r0 = r5.f26126c     // Catch:{ all -> 0x001f }
            int r4 = r5.y()     // Catch:{ all -> 0x001f }
            java.lang.Object r0 = r0.e(r4)     // Catch:{ all -> 0x001f }
            t2.Y$c r0 = (t2.Y.c) r0     // Catch:{ all -> 0x001f }
            f2.s r0 = r0.f26153a     // Catch:{ all -> 0x001f }
            if (r8 != 0) goto L_0x0092
            f2.s r8 = r5.f26130g     // Catch:{ all -> 0x001f }
            if (r0 == r8) goto L_0x004e
            goto L_0x0092
        L_0x004e:
            int r6 = r5.f26142s     // Catch:{ all -> 0x001f }
            int r6 = r5.z(r6)     // Catch:{ all -> 0x001f }
            boolean r8 = r5.H(r6)     // Catch:{ all -> 0x001f }
            r0 = 1
            if (r8 != 0) goto L_0x005f
            r7.f23521e = r0     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r2
        L_0x005f:
            int[] r8 = r5.f26136m     // Catch:{ all -> 0x001f }
            r8 = r8[r6]     // Catch:{ all -> 0x001f }
            r7.s(r8)     // Catch:{ all -> 0x001f }
            int r8 = r5.f26142s     // Catch:{ all -> 0x001f }
            int r2 = r5.f26139p     // Catch:{ all -> 0x001f }
            int r2 = r2 - r0
            if (r8 != r2) goto L_0x0078
            if (r9 != 0) goto L_0x0073
            boolean r8 = r5.f26146w     // Catch:{ all -> 0x001f }
            if (r8 == 0) goto L_0x0078
        L_0x0073:
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            r7.f(r8)     // Catch:{ all -> 0x001f }
        L_0x0078:
            long[] r8 = r5.f26137n     // Catch:{ all -> 0x001f }
            r2 = r8[r6]     // Catch:{ all -> 0x001f }
            r7.f23522f = r2     // Catch:{ all -> 0x001f }
            int[] r7 = r5.f26135l     // Catch:{ all -> 0x001f }
            r7 = r7[r6]     // Catch:{ all -> 0x001f }
            r10.f26150a = r7     // Catch:{ all -> 0x001f }
            long[] r7 = r5.f26134k     // Catch:{ all -> 0x001f }
            r8 = r7[r6]     // Catch:{ all -> 0x001f }
            r10.f26151b = r8     // Catch:{ all -> 0x001f }
            z2.O$a[] r7 = r5.f26138o     // Catch:{ all -> 0x001f }
            r6 = r7[r6]     // Catch:{ all -> 0x001f }
            r10.f26152c = r6     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r1
        L_0x0092:
            r5.J(r0, r6)     // Catch:{ all -> 0x001f }
            monitor-exit(r5)
            return r3
        L_0x0097:
            monitor-exit(r5)     // Catch:{ all -> 0x001f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.Y.K(m2.w, l2.f, boolean, boolean, t2.Y$b):int");
    }

    private void O() {
        C2409m mVar = this.f26131h;
        if (mVar != null) {
            mVar.h(this.f26128e);
            this.f26131h = null;
            this.f26130g = null;
        }
    }

    private synchronized void R() {
        this.f26142s = 0;
        this.f26124a.n();
    }

    private synchronized boolean V(s sVar) {
        try {
            this.f26148y = false;
            if (L.c(sVar, this.f26118B)) {
                return false;
            }
            if (this.f26126c.g() || !((c) this.f26126c.f()).f26153a.equals(sVar)) {
                this.f26118B = sVar;
            } else {
                this.f26118B = ((c) this.f26126c.f()).f26153a;
            }
            boolean z10 = this.f26120D;
            s sVar2 = this.f26118B;
            this.f26120D = z10 & C1960A.a(sVar2.f20083n, sVar2.f20079j);
            this.f26121E = false;
            return true;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean h(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f26139p     // Catch:{ all -> 0x0010 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0012
            long r3 = r5.f26144u     // Catch:{ all -> 0x0010 }
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x000e
            r1 = r2
        L_0x000e:
            monitor-exit(r5)
            return r1
        L_0x0010:
            r6 = move-exception
            goto L_0x0028
        L_0x0012:
            long r3 = r5.w()     // Catch:{ all -> 0x0010 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001c
            monitor-exit(r5)
            return r1
        L_0x001c:
            int r6 = r5.j(r6)     // Catch:{ all -> 0x0010 }
            int r7 = r5.f26140q     // Catch:{ all -> 0x0010 }
            int r7 = r7 + r6
            r5.q(r7)     // Catch:{ all -> 0x0010 }
            monitor-exit(r5)
            return r2
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x0010 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.Y.h(long):boolean");
    }

    private synchronized void i(long j10, int i10, long j11, int i11, O.a aVar) {
        boolean z10;
        u.b bVar;
        boolean z11;
        try {
            int i12 = this.f26139p;
            if (i12 > 0) {
                int z12 = z(i12 - 1);
                if (this.f26134k[z12] + ((long) this.f26135l[z12]) <= j11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C2076a.a(z11);
            }
            if ((536870912 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f26146w = z10;
            this.f26145v = Math.max(this.f26145v, j10);
            int z13 = z(this.f26139p);
            this.f26137n[z13] = j10;
            this.f26134k[z13] = j11;
            this.f26135l[z13] = i11;
            this.f26136m[z13] = i10;
            this.f26138o[z13] = aVar;
            this.f26133j[z13] = this.f26119C;
            if (this.f26126c.g() || !((c) this.f26126c.f()).f26153a.equals(this.f26118B)) {
                s sVar = (s) C2076a.e(this.f26118B);
                u uVar = this.f26127d;
                if (uVar != null) {
                    bVar = uVar.a(this.f26128e, sVar);
                } else {
                    bVar = u.b.f25308a;
                }
                this.f26126c.a(C(), new c(sVar, bVar));
            }
            int i13 = this.f26139p + 1;
            this.f26139p = i13;
            int i14 = this.f26132i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                O.a[] aVarArr = new O.a[i15];
                int i16 = this.f26141r;
                int i17 = i14 - i16;
                System.arraycopy(this.f26134k, i16, jArr2, 0, i17);
                System.arraycopy(this.f26137n, this.f26141r, jArr3, 0, i17);
                System.arraycopy(this.f26136m, this.f26141r, iArr, 0, i17);
                System.arraycopy(this.f26135l, this.f26141r, iArr2, 0, i17);
                System.arraycopy(this.f26138o, this.f26141r, aVarArr, 0, i17);
                System.arraycopy(this.f26133j, this.f26141r, jArr, 0, i17);
                int i18 = this.f26141r;
                System.arraycopy(this.f26134k, 0, jArr2, i17, i18);
                System.arraycopy(this.f26137n, 0, jArr3, i17, i18);
                System.arraycopy(this.f26136m, 0, iArr, i17, i18);
                System.arraycopy(this.f26135l, 0, iArr2, i17, i18);
                System.arraycopy(this.f26138o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f26133j, 0, jArr, i17, i18);
                this.f26134k = jArr2;
                this.f26137n = jArr3;
                this.f26136m = iArr;
                this.f26135l = iArr2;
                this.f26138o = aVarArr;
                this.f26133j = jArr;
                this.f26141r = 0;
                this.f26132i = i15;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private int j(long j10) {
        int i10 = this.f26139p;
        int z10 = z(i10 - 1);
        while (i10 > this.f26142s && this.f26137n[z10] >= j10) {
            i10--;
            z10--;
            if (z10 == -1) {
                z10 = this.f26132i - 1;
            }
        }
        return i10;
    }

    public static Y k(C2820b bVar, u uVar, t.a aVar) {
        return new Y(bVar, (u) C2076a.e(uVar), (t.a) C2076a.e(aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long l(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f26139p     // Catch:{ all -> 0x001c }
            r1 = -1
            if (r0 == 0) goto L_0x0030
            long[] r3 = r10.f26137n     // Catch:{ all -> 0x001c }
            int r5 = r10.f26141r     // Catch:{ all -> 0x001c }
            r6 = r3[r5]     // Catch:{ all -> 0x001c }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x0030
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.f26142s     // Catch:{ all -> 0x001c }
            if (r14 == r0) goto L_0x001a
            int r0 = r14 + 1
        L_0x001a:
            r6 = r0
            goto L_0x001e
        L_0x001c:
            r11 = move-exception
            goto L_0x0032
        L_0x001e:
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.s(r5, r6, r7, r9)     // Catch:{ all -> 0x001c }
            r12 = -1
            if (r11 != r12) goto L_0x002a
            monitor-exit(r10)
            return r1
        L_0x002a:
            long r11 = r10.n(r11)     // Catch:{ all -> 0x001c }
            monitor-exit(r10)
            return r11
        L_0x0030:
            monitor-exit(r10)
            return r1
        L_0x0032:
            monitor-exit(r10)     // Catch:{ all -> 0x001c }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.Y.l(long, boolean, boolean):long");
    }

    private synchronized long m() {
        int i10 = this.f26139p;
        if (i10 == 0) {
            return -1;
        }
        return n(i10);
    }

    private long n(int i10) {
        this.f26144u = Math.max(this.f26144u, x(i10));
        this.f26139p -= i10;
        int i11 = this.f26140q + i10;
        this.f26140q = i11;
        int i12 = this.f26141r + i10;
        this.f26141r = i12;
        int i13 = this.f26132i;
        if (i12 >= i13) {
            this.f26141r = i12 - i13;
        }
        int i14 = this.f26142s - i10;
        this.f26142s = i14;
        if (i14 < 0) {
            this.f26142s = 0;
        }
        this.f26126c.d(i11);
        if (this.f26139p != 0) {
            return this.f26134k[this.f26141r];
        }
        int i15 = this.f26141r;
        if (i15 == 0) {
            i15 = this.f26132i;
        }
        int i16 = i15 - 1;
        return this.f26134k[i16] + ((long) this.f26135l[i16]);
    }

    private long q(int i10) {
        boolean z10;
        int C10 = C() - i10;
        boolean z11 = false;
        if (C10 < 0 || C10 > this.f26139p - this.f26142s) {
            z10 = false;
        } else {
            z10 = true;
        }
        C2076a.a(z10);
        int i11 = this.f26139p - C10;
        this.f26139p = i11;
        this.f26145v = Math.max(this.f26144u, x(i11));
        if (C10 == 0 && this.f26146w) {
            z11 = true;
        }
        this.f26146w = z11;
        this.f26126c.c(i10);
        int i12 = this.f26139p;
        if (i12 == 0) {
            return 0;
        }
        int z12 = z(i12 - 1);
        return this.f26134k[z12] + ((long) this.f26135l[z12]);
    }

    private int r(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f26137n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f26132i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    private int s(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f26137n[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f26136m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f26132i) {
                i10 = 0;
            }
        }
        return i12;
    }

    private long x(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int z10 = z(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f26137n[z10]);
            if ((this.f26136m[z10] & 1) != 0) {
                break;
            }
            z10--;
            if (z10 == -1) {
                z10 = this.f26132i - 1;
            }
        }
        return j10;
    }

    private int z(int i10) {
        int i11 = this.f26141r + i10;
        int i12 = this.f26132i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int A(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f26142s     // Catch:{ all -> 0x0026 }
            int r2 = r8.z(r0)     // Catch:{ all -> 0x0026 }
            boolean r0 = r8.D()     // Catch:{ all -> 0x0026 }
            r7 = 0
            if (r0 == 0) goto L_0x003c
            long[] r0 = r8.f26137n     // Catch:{ all -> 0x0026 }
            r3 = r0[r2]     // Catch:{ all -> 0x0026 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003c
        L_0x0017:
            long r0 = r8.f26145v     // Catch:{ all -> 0x0026 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            if (r11 == 0) goto L_0x0028
            int r9 = r8.f26139p     // Catch:{ all -> 0x0026 }
            int r10 = r8.f26142s     // Catch:{ all -> 0x0026 }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            r9 = move-exception
            goto L_0x003e
        L_0x0028:
            int r11 = r8.f26139p     // Catch:{ all -> 0x0026 }
            int r0 = r8.f26142s     // Catch:{ all -> 0x0026 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.s(r2, r3, r4, r6)     // Catch:{ all -> 0x0026 }
            r10 = -1
            if (r9 != r10) goto L_0x003a
            monitor-exit(r8)
            return r7
        L_0x003a:
            monitor-exit(r8)
            return r9
        L_0x003c:
            monitor-exit(r8)
            return r7
        L_0x003e:
            monitor-exit(r8)     // Catch:{ all -> 0x0026 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.Y.A(long, boolean):int");
    }

    public final synchronized s B() {
        s sVar;
        if (this.f26148y) {
            sVar = null;
        } else {
            sVar = this.f26118B;
        }
        return sVar;
    }

    public final int C() {
        return this.f26140q + this.f26139p;
    }

    public final synchronized boolean E() {
        return this.f26146w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean F(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.D()     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r0 != 0) goto L_0x001c
            if (r3 != 0) goto L_0x001a
            boolean r3 = r2.f26146w     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x001a
            f2.s r3 = r2.f26118B     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0019
            f2.s r0 = r2.f26130g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0019
            goto L_0x001a
        L_0x0017:
            r3 = move-exception
            goto L_0x003c
        L_0x0019:
            r1 = 0
        L_0x001a:
            monitor-exit(r2)
            return r1
        L_0x001c:
            t2.f0 r3 = r2.f26126c     // Catch:{ all -> 0x0017 }
            int r0 = r2.y()     // Catch:{ all -> 0x0017 }
            java.lang.Object r3 = r3.e(r0)     // Catch:{ all -> 0x0017 }
            t2.Y$c r3 = (t2.Y.c) r3     // Catch:{ all -> 0x0017 }
            f2.s r3 = r3.f26153a     // Catch:{ all -> 0x0017 }
            f2.s r0 = r2.f26130g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            int r3 = r2.f26142s     // Catch:{ all -> 0x0017 }
            int r3 = r2.z(r3)     // Catch:{ all -> 0x0017 }
            boolean r3 = r2.H(r3)     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return r3
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.Y.F(boolean):boolean");
    }

    public void I() {
        C2409m mVar = this.f26131h;
        if (mVar != null && mVar.getState() == 1) {
            throw ((C2409m.a) C2076a.e(this.f26131h.a()));
        }
    }

    public void L() {
        p();
        O();
    }

    public int M(w wVar, f fVar, int i10, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int K10 = K(wVar, fVar, z11, z10, this.f26125b);
        if (K10 == -4 && !fVar.m()) {
            if ((i10 & 1) != 0) {
                z12 = true;
            }
            if ((i10 & 4) == 0) {
                if (z12) {
                    this.f26124a.e(fVar, this.f26125b);
                } else {
                    this.f26124a.l(fVar, this.f26125b);
                }
            }
            if (!z12) {
                this.f26142s++;
            }
        }
        return K10;
    }

    public void N() {
        Q(true);
        O();
    }

    public final void P() {
        Q(false);
    }

    public void Q(boolean z10) {
        this.f26124a.m();
        this.f26139p = 0;
        this.f26140q = 0;
        this.f26141r = 0;
        this.f26142s = 0;
        this.f26147x = true;
        this.f26143t = Long.MIN_VALUE;
        this.f26144u = Long.MIN_VALUE;
        this.f26145v = Long.MIN_VALUE;
        this.f26146w = false;
        this.f26126c.b();
        if (z10) {
            this.f26117A = null;
            this.f26118B = null;
            this.f26148y = true;
            this.f26120D = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean S(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.R()     // Catch:{ all -> 0x0018 }
            int r0 = r3.f26140q     // Catch:{ all -> 0x0018 }
            if (r4 < r0) goto L_0x001a
            int r1 = r3.f26139p     // Catch:{ all -> 0x0018 }
            int r1 = r1 + r0
            if (r4 <= r1) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            r1 = -9223372036854775808
            r3.f26143t = r1     // Catch:{ all -> 0x0018 }
            int r4 = r4 - r0
            r3.f26142s = r4     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)
            r4 = 1
            return r4
        L_0x0018:
            r4 = move-exception
            goto L_0x001d
        L_0x001a:
            monitor-exit(r3)
            r4 = 0
            return r4
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.Y.S(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean T(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.R()     // Catch:{ all -> 0x0034 }
            int r0 = r8.f26142s     // Catch:{ all -> 0x0034 }
            int r2 = r8.z(r0)     // Catch:{ all -> 0x0034 }
            boolean r0 = r8.D()     // Catch:{ all -> 0x0034 }
            r7 = 0
            if (r0 == 0) goto L_0x0052
            long[] r0 = r8.f26137n     // Catch:{ all -> 0x0034 }
            r3 = r0[r2]     // Catch:{ all -> 0x0034 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0052
            long r0 = r8.f26145v     // Catch:{ all -> 0x0034 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x0052
        L_0x0022:
            boolean r0 = r8.f26120D     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0036
            int r0 = r8.f26139p     // Catch:{ all -> 0x0034 }
            int r1 = r8.f26142s     // Catch:{ all -> 0x0034 }
            int r3 = r0 - r1
            r1 = r8
            r4 = r9
            r6 = r11
            int r11 = r1.r(r2, r3, r4, r6)     // Catch:{ all -> 0x0034 }
            goto L_0x0043
        L_0x0034:
            r9 = move-exception
            goto L_0x0054
        L_0x0036:
            int r11 = r8.f26139p     // Catch:{ all -> 0x0034 }
            int r0 = r8.f26142s     // Catch:{ all -> 0x0034 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.s(r2, r3, r4, r6)     // Catch:{ all -> 0x0034 }
        L_0x0043:
            r0 = -1
            if (r11 != r0) goto L_0x0048
            monitor-exit(r8)
            return r7
        L_0x0048:
            r8.f26143t = r9     // Catch:{ all -> 0x0034 }
            int r9 = r8.f26142s     // Catch:{ all -> 0x0034 }
            int r9 = r9 + r11
            r8.f26142s = r9     // Catch:{ all -> 0x0034 }
            monitor-exit(r8)
            r9 = 1
            return r9
        L_0x0052:
            monitor-exit(r8)
            return r7
        L_0x0054:
            monitor-exit(r8)     // Catch:{ all -> 0x0034 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.Y.T(long, boolean):boolean");
    }

    public final void U(long j10) {
        this.f26143t = j10;
    }

    public final void W(d dVar) {
        this.f26129f = dVar;
    }

    public final synchronized void X(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f26142s + i10 <= this.f26139p) {
                    z10 = true;
                    C2076a.a(z10);
                    this.f26142s += i10;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        z10 = false;
        C2076a.a(z10);
        this.f26142s += i10;
    }

    public final int b(C1975j jVar, int i10, boolean z10, int i11) {
        return this.f26124a.o(jVar, i10, z10);
    }

    public final void c(s sVar) {
        s t10 = t(sVar);
        this.f26149z = false;
        this.f26117A = sVar;
        boolean V10 = V(t10);
        d dVar = this.f26129f;
        if (dVar != null && V10) {
            dVar.l(t10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(long r12, int r14, int r15, int r16, z2.O.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f26149z
            if (r0 == 0) goto L_0x0010
            f2.s r0 = r8.f26117A
            java.lang.Object r0 = i2.C2076a.i(r0)
            f2.s r0 = (f2.s) r0
            r11.c(r0)
        L_0x0010:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            r3 = r2
            goto L_0x0019
        L_0x0018:
            r3 = r1
        L_0x0019:
            boolean r4 = r8.f26147x
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.f26147x = r1
        L_0x0022:
            long r4 = r8.f26122F
            long r4 = r4 + r12
            boolean r6 = r8.f26120D
            if (r6 == 0) goto L_0x0054
            long r6 = r8.f26143t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x0054
            boolean r0 = r8.f26121E
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            f2.s r6 = r8.f26118B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            i2.p.h(r6, r0)
            r8.f26121E = r2
        L_0x0050:
            r0 = r14 | 1
            r6 = r0
            goto L_0x0055
        L_0x0054:
            r6 = r14
        L_0x0055:
            boolean r0 = r8.f26123G
            if (r0 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0065
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.f26123G = r1
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            t2.W r0 = r8.f26124a
            long r0 = r0.d()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.Y.d(long, int, int, int, z2.O$a):void");
    }

    public final void e(C2073A a10, int i10, int i11) {
        this.f26124a.p(a10, i10);
    }

    public final void o(long j10, boolean z10, boolean z11) {
        this.f26124a.b(l(j10, z10, z11));
    }

    public final void p() {
        this.f26124a.b(m());
    }

    /* access modifiers changed from: protected */
    public s t(s sVar) {
        if (this.f26122F == 0 || sVar.f20088s == Long.MAX_VALUE) {
            return sVar;
        }
        return sVar.a().s0(sVar.f20088s + this.f26122F).K();
    }

    public final int u() {
        return this.f26140q;
    }

    public final synchronized long v() {
        return this.f26145v;
    }

    public final synchronized long w() {
        return Math.max(this.f26144u, x(this.f26142s));
    }

    public final int y() {
        return this.f26140q + this.f26142s;
    }
}
