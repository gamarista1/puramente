package N9;

import ia.C3604b;
import ia.C3610h;
import ja.B;
import ja.C3645a;
import ja.M;
import ja.w;
import k9.C3717q0;
import k9.C3718r0;
import n9.C3871g;
import o9.m;
import o9.n;
import o9.u;
import o9.v;
import q9.C3962B;

public class L implements C3962B {

    /* renamed from: A  reason: collision with root package name */
    private C3717q0 f33129A;

    /* renamed from: B  reason: collision with root package name */
    private C3717q0 f33130B;

    /* renamed from: C  reason: collision with root package name */
    private int f33131C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f33132D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f33133E;

    /* renamed from: F  reason: collision with root package name */
    private long f33134F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f33135G;

    /* renamed from: a  reason: collision with root package name */
    private final J f33136a;

    /* renamed from: b  reason: collision with root package name */
    private final b f33137b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final Q f33138c = new Q(new K());

    /* renamed from: d  reason: collision with root package name */
    private final v f33139d;

    /* renamed from: e  reason: collision with root package name */
    private final u.a f33140e;

    /* renamed from: f  reason: collision with root package name */
    private d f33141f;

    /* renamed from: g  reason: collision with root package name */
    private C3717q0 f33142g;

    /* renamed from: h  reason: collision with root package name */
    private n f33143h;

    /* renamed from: i  reason: collision with root package name */
    private int f33144i = 1000;

    /* renamed from: j  reason: collision with root package name */
    private int[] f33145j = new int[1000];

    /* renamed from: k  reason: collision with root package name */
    private long[] f33146k = new long[1000];

    /* renamed from: l  reason: collision with root package name */
    private int[] f33147l = new int[1000];

    /* renamed from: m  reason: collision with root package name */
    private int[] f33148m = new int[1000];

    /* renamed from: n  reason: collision with root package name */
    private long[] f33149n = new long[1000];

    /* renamed from: o  reason: collision with root package name */
    private C3962B.a[] f33150o = new C3962B.a[1000];

    /* renamed from: p  reason: collision with root package name */
    private int f33151p;

    /* renamed from: q  reason: collision with root package name */
    private int f33152q;

    /* renamed from: r  reason: collision with root package name */
    private int f33153r;

    /* renamed from: s  reason: collision with root package name */
    private int f33154s;

    /* renamed from: t  reason: collision with root package name */
    private long f33155t = Long.MIN_VALUE;

    /* renamed from: u  reason: collision with root package name */
    private long f33156u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    private long f33157v = Long.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    private boolean f33158w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f33159x = true;

    /* renamed from: y  reason: collision with root package name */
    private boolean f33160y = true;

    /* renamed from: z  reason: collision with root package name */
    private boolean f33161z;

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f33162a;

        /* renamed from: b  reason: collision with root package name */
        public long f33163b;

        /* renamed from: c  reason: collision with root package name */
        public C3962B.a f33164c;

        b() {
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final C3717q0 f33165a;

        /* renamed from: b  reason: collision with root package name */
        public final v.b f33166b;

        private c(C3717q0 q0Var, v.b bVar) {
            this.f33165a = q0Var;
            this.f33166b = bVar;
        }
    }

    public interface d {
        void e(C3717q0 q0Var);
    }

    protected L(C3604b bVar, v vVar, u.a aVar) {
        this.f33139d = vVar;
        this.f33140e = aVar;
        this.f33136a = new J(bVar);
    }

    private long B(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int D10 = D(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f33149n[D10]);
            if ((this.f33148m[D10] & 1) != 0) {
                break;
            }
            D10--;
            if (D10 == -1) {
                D10 = this.f33144i - 1;
            }
        }
        return j10;
    }

    private int D(int i10) {
        int i11 = this.f33153r + i10;
        int i12 = this.f33144i;
        if (i11 < i12) {
            return i11;
        }
        return i11 - i12;
    }

    private boolean H() {
        if (this.f33154s != this.f33151p) {
            return true;
        }
        return false;
    }

    private boolean M(int i10) {
        n nVar = this.f33143h;
        if (nVar == null || nVar.getState() == 4 || ((this.f33148m[i10] & 1073741824) == 0 && this.f33143h.c())) {
            return true;
        }
        return false;
    }

    private void O(C3717q0 q0Var, C3718r0 r0Var) {
        boolean z10;
        m mVar;
        C3717q0 q0Var2;
        C3717q0 q0Var3 = this.f33142g;
        if (q0Var3 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            mVar = null;
        } else {
            mVar = q0Var3.f45773o;
        }
        this.f33142g = q0Var;
        m mVar2 = q0Var.f45773o;
        v vVar = this.f33139d;
        if (vVar != null) {
            q0Var2 = q0Var.c(vVar.d(q0Var));
        } else {
            q0Var2 = q0Var;
        }
        r0Var.f45824b = q0Var2;
        r0Var.f45823a = this.f33143h;
        if (this.f33139d != null) {
            if (z10 || !M.c(mVar, mVar2)) {
                n nVar = this.f33143h;
                n a10 = this.f33139d.a(this.f33140e, q0Var);
                this.f33143h = a10;
                r0Var.f45823a = a10;
                if (nVar != null) {
                    nVar.i(this.f33140e);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        return -3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized int P(k9.C3718r0 r5, n9.C3871g r6, boolean r7, boolean r8, N9.L.b r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r6.f46951d = r0     // Catch:{ all -> 0x001f }
            boolean r0 = r4.H()     // Catch:{ all -> 0x001f }
            r1 = -4
            r2 = -3
            r3 = -5
            if (r0 != 0) goto L_0x0034
            if (r8 != 0) goto L_0x002e
            boolean r8 = r4.f33158w     // Catch:{ all -> 0x001f }
            if (r8 == 0) goto L_0x0014
            goto L_0x002e
        L_0x0014:
            k9.q0 r6 = r4.f33130B     // Catch:{ all -> 0x001f }
            if (r6 == 0) goto L_0x002c
            if (r7 != 0) goto L_0x0021
            k9.q0 r7 = r4.f33142g     // Catch:{ all -> 0x001f }
            if (r6 == r7) goto L_0x002c
            goto L_0x0021
        L_0x001f:
            r5 = move-exception
            goto L_0x008b
        L_0x0021:
            java.lang.Object r6 = ja.C3645a.e(r6)     // Catch:{ all -> 0x001f }
            k9.q0 r6 = (k9.C3717q0) r6     // Catch:{ all -> 0x001f }
            r4.O(r6, r5)     // Catch:{ all -> 0x001f }
            monitor-exit(r4)
            return r3
        L_0x002c:
            monitor-exit(r4)
            return r2
        L_0x002e:
            r5 = 4
            r6.t(r5)     // Catch:{ all -> 0x001f }
            monitor-exit(r4)
            return r1
        L_0x0034:
            N9.Q r8 = r4.f33138c     // Catch:{ all -> 0x001f }
            int r0 = r4.C()     // Catch:{ all -> 0x001f }
            java.lang.Object r8 = r8.e(r0)     // Catch:{ all -> 0x001f }
            N9.L$c r8 = (N9.L.c) r8     // Catch:{ all -> 0x001f }
            k9.q0 r8 = r8.f33165a     // Catch:{ all -> 0x001f }
            if (r7 != 0) goto L_0x0086
            k9.q0 r7 = r4.f33142g     // Catch:{ all -> 0x001f }
            if (r8 == r7) goto L_0x0049
            goto L_0x0086
        L_0x0049:
            int r5 = r4.f33154s     // Catch:{ all -> 0x001f }
            int r5 = r4.D(r5)     // Catch:{ all -> 0x001f }
            boolean r7 = r4.M(r5)     // Catch:{ all -> 0x001f }
            if (r7 != 0) goto L_0x005a
            r5 = 1
            r6.f46951d = r5     // Catch:{ all -> 0x001f }
            monitor-exit(r4)
            return r2
        L_0x005a:
            int[] r7 = r4.f33148m     // Catch:{ all -> 0x001f }
            r7 = r7[r5]     // Catch:{ all -> 0x001f }
            r6.t(r7)     // Catch:{ all -> 0x001f }
            long[] r7 = r4.f33149n     // Catch:{ all -> 0x001f }
            r2 = r7[r5]     // Catch:{ all -> 0x001f }
            r6.f46952e = r2     // Catch:{ all -> 0x001f }
            long r7 = r4.f33155t     // Catch:{ all -> 0x001f }
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0072
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.f(r7)     // Catch:{ all -> 0x001f }
        L_0x0072:
            int[] r6 = r4.f33147l     // Catch:{ all -> 0x001f }
            r6 = r6[r5]     // Catch:{ all -> 0x001f }
            r9.f33162a = r6     // Catch:{ all -> 0x001f }
            long[] r6 = r4.f33146k     // Catch:{ all -> 0x001f }
            r7 = r6[r5]     // Catch:{ all -> 0x001f }
            r9.f33163b = r7     // Catch:{ all -> 0x001f }
            q9.B$a[] r6 = r4.f33150o     // Catch:{ all -> 0x001f }
            r5 = r6[r5]     // Catch:{ all -> 0x001f }
            r9.f33164c = r5     // Catch:{ all -> 0x001f }
            monitor-exit(r4)
            return r1
        L_0x0086:
            r4.O(r8, r5)     // Catch:{ all -> 0x001f }
            monitor-exit(r4)
            return r3
        L_0x008b:
            monitor-exit(r4)     // Catch:{ all -> 0x001f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.L.P(k9.r0, n9.g, boolean, boolean, N9.L$b):int");
    }

    private void U() {
        n nVar = this.f33143h;
        if (nVar != null) {
            nVar.i(this.f33140e);
            this.f33143h = null;
            this.f33142g = null;
        }
    }

    private synchronized void X() {
        this.f33154s = 0;
        this.f33136a.o();
    }

    private synchronized boolean c0(C3717q0 q0Var) {
        try {
            this.f33160y = false;
            if (M.c(q0Var, this.f33130B)) {
                return false;
            }
            if (this.f33138c.g() || !((c) this.f33138c.f()).f33165a.equals(q0Var)) {
                this.f33130B = q0Var;
            } else {
                this.f33130B = ((c) this.f33138c.f()).f33165a;
            }
            C3717q0 q0Var2 = this.f33130B;
            this.f33132D = w.a(q0Var2.f45770l, q0Var2.f45767i);
            this.f33133E = false;
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
            int r0 = r5.f33151p     // Catch:{ all -> 0x0010 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0012
            long r3 = r5.f33156u     // Catch:{ all -> 0x0010 }
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
            long r3 = r5.A()     // Catch:{ all -> 0x0010 }
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x001c
            monitor-exit(r5)
            return r1
        L_0x001c:
            int r6 = r5.j(r6)     // Catch:{ all -> 0x0010 }
            int r7 = r5.f33152q     // Catch:{ all -> 0x0010 }
            int r7 = r7 + r6
            r5.t(r7)     // Catch:{ all -> 0x0010 }
            monitor-exit(r5)
            return r2
        L_0x0028:
            monitor-exit(r5)     // Catch:{ all -> 0x0010 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.L.h(long):boolean");
    }

    private synchronized void i(long j10, int i10, long j11, int i11, C3962B.a aVar) {
        boolean z10;
        v.b bVar;
        boolean z11;
        try {
            int i12 = this.f33151p;
            if (i12 > 0) {
                int D10 = D(i12 - 1);
                if (this.f33146k[D10] + ((long) this.f33147l[D10]) <= j11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C3645a.a(z11);
            }
            if ((536870912 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f33158w = z10;
            this.f33157v = Math.max(this.f33157v, j10);
            int D11 = D(this.f33151p);
            this.f33149n[D11] = j10;
            this.f33146k[D11] = j11;
            this.f33147l[D11] = i11;
            this.f33148m[D11] = i10;
            this.f33150o[D11] = aVar;
            this.f33145j[D11] = this.f33131C;
            if (this.f33138c.g() || !((c) this.f33138c.f()).f33165a.equals(this.f33130B)) {
                v vVar = this.f33139d;
                if (vVar != null) {
                    bVar = vVar.c(this.f33140e, this.f33130B);
                } else {
                    bVar = v.b.f47549a;
                }
                this.f33138c.a(G(), new c((C3717q0) C3645a.e(this.f33130B), bVar));
            }
            int i13 = this.f33151p + 1;
            this.f33151p = i13;
            int i14 = this.f33144i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                int[] iArr = new int[i15];
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                int[] iArr2 = new int[i15];
                int[] iArr3 = new int[i15];
                C3962B.a[] aVarArr = new C3962B.a[i15];
                int i16 = this.f33153r;
                int i17 = i14 - i16;
                System.arraycopy(this.f33146k, i16, jArr, 0, i17);
                System.arraycopy(this.f33149n, this.f33153r, jArr2, 0, i17);
                System.arraycopy(this.f33148m, this.f33153r, iArr2, 0, i17);
                System.arraycopy(this.f33147l, this.f33153r, iArr3, 0, i17);
                System.arraycopy(this.f33150o, this.f33153r, aVarArr, 0, i17);
                System.arraycopy(this.f33145j, this.f33153r, iArr, 0, i17);
                int i18 = this.f33153r;
                System.arraycopy(this.f33146k, 0, jArr, i17, i18);
                System.arraycopy(this.f33149n, 0, jArr2, i17, i18);
                System.arraycopy(this.f33148m, 0, iArr2, i17, i18);
                System.arraycopy(this.f33147l, 0, iArr3, i17, i18);
                System.arraycopy(this.f33150o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f33145j, 0, iArr, i17, i18);
                this.f33146k = jArr;
                this.f33149n = jArr2;
                this.f33148m = iArr2;
                this.f33147l = iArr3;
                this.f33150o = aVarArr;
                this.f33145j = iArr;
                this.f33153r = 0;
                this.f33144i = i15;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    private int j(long j10) {
        int i10 = this.f33151p;
        int D10 = D(i10 - 1);
        while (i10 > this.f33154s && this.f33149n[D10] >= j10) {
            i10--;
            D10--;
            if (D10 == -1) {
                D10 = this.f33144i - 1;
            }
        }
        return i10;
    }

    public static L k(C3604b bVar, v vVar, u.a aVar) {
        return new L(bVar, (v) C3645a.e(vVar), (u.a) C3645a.e(aVar));
    }

    public static L l(C3604b bVar) {
        return new L(bVar, (v) null, (u.a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized long m(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f33151p     // Catch:{ all -> 0x001c }
            r1 = -1
            if (r0 == 0) goto L_0x0030
            long[] r3 = r10.f33149n     // Catch:{ all -> 0x001c }
            int r5 = r10.f33153r     // Catch:{ all -> 0x001c }
            r6 = r3[r5]     // Catch:{ all -> 0x001c }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x0030
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.f33154s     // Catch:{ all -> 0x001c }
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
            int r11 = r4.v(r5, r6, r7, r9)     // Catch:{ all -> 0x001c }
            r12 = -1
            if (r11 != r12) goto L_0x002a
            monitor-exit(r10)
            return r1
        L_0x002a:
            long r11 = r10.p(r11)     // Catch:{ all -> 0x001c }
            monitor-exit(r10)
            return r11
        L_0x0030:
            monitor-exit(r10)
            return r1
        L_0x0032:
            monitor-exit(r10)     // Catch:{ all -> 0x001c }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.L.m(long, boolean, boolean):long");
    }

    private synchronized long n() {
        int i10 = this.f33151p;
        if (i10 == 0) {
            return -1;
        }
        return p(i10);
    }

    private long p(int i10) {
        this.f33156u = Math.max(this.f33156u, B(i10));
        this.f33151p -= i10;
        int i11 = this.f33152q + i10;
        this.f33152q = i11;
        int i12 = this.f33153r + i10;
        this.f33153r = i12;
        int i13 = this.f33144i;
        if (i12 >= i13) {
            this.f33153r = i12 - i13;
        }
        int i14 = this.f33154s - i10;
        this.f33154s = i14;
        if (i14 < 0) {
            this.f33154s = 0;
        }
        this.f33138c.d(i11);
        if (this.f33151p != 0) {
            return this.f33146k[this.f33153r];
        }
        int i15 = this.f33153r;
        if (i15 == 0) {
            i15 = this.f33144i;
        }
        int i16 = i15 - 1;
        return this.f33146k[i16] + ((long) this.f33147l[i16]);
    }

    private long t(int i10) {
        boolean z10;
        int G10 = G() - i10;
        boolean z11 = false;
        if (G10 < 0 || G10 > this.f33151p - this.f33154s) {
            z10 = false;
        } else {
            z10 = true;
        }
        C3645a.a(z10);
        int i11 = this.f33151p - G10;
        this.f33151p = i11;
        this.f33157v = Math.max(this.f33156u, B(i11));
        if (G10 == 0 && this.f33158w) {
            z11 = true;
        }
        this.f33158w = z11;
        this.f33138c.c(i10);
        int i12 = this.f33151p;
        if (i12 == 0) {
            return 0;
        }
        int D10 = D(i12 - 1);
        return this.f33146k[D10] + ((long) this.f33147l[D10]);
    }

    private int v(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f33149n[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f33148m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f33144i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long A() {
        return Math.max(this.f33156u, B(this.f33154s));
    }

    public final int C() {
        return this.f33152q + this.f33154s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int E(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f33154s     // Catch:{ all -> 0x0026 }
            int r2 = r8.D(r0)     // Catch:{ all -> 0x0026 }
            boolean r0 = r8.H()     // Catch:{ all -> 0x0026 }
            r7 = 0
            if (r0 == 0) goto L_0x003c
            long[] r0 = r8.f33149n     // Catch:{ all -> 0x0026 }
            r3 = r0[r2]     // Catch:{ all -> 0x0026 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003c
        L_0x0017:
            long r0 = r8.f33157v     // Catch:{ all -> 0x0026 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            if (r11 == 0) goto L_0x0028
            int r9 = r8.f33151p     // Catch:{ all -> 0x0026 }
            int r10 = r8.f33154s     // Catch:{ all -> 0x0026 }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            r9 = move-exception
            goto L_0x003e
        L_0x0028:
            int r11 = r8.f33151p     // Catch:{ all -> 0x0026 }
            int r0 = r8.f33154s     // Catch:{ all -> 0x0026 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.v(r2, r3, r4, r6)     // Catch:{ all -> 0x0026 }
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
        throw new UnsupportedOperationException("Method not decompiled: N9.L.E(long, boolean):int");
    }

    public final synchronized C3717q0 F() {
        C3717q0 q0Var;
        if (this.f33160y) {
            q0Var = null;
        } else {
            q0Var = this.f33130B;
        }
        return q0Var;
    }

    public final int G() {
        return this.f33152q + this.f33151p;
    }

    /* access modifiers changed from: protected */
    public final void I() {
        this.f33161z = true;
    }

    public final synchronized boolean J() {
        return this.f33158w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean K(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.H()     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r0 != 0) goto L_0x001c
            if (r3 != 0) goto L_0x001a
            boolean r3 = r2.f33158w     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x001a
            k9.q0 r3 = r2.f33130B     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0019
            k9.q0 r0 = r2.f33142g     // Catch:{ all -> 0x0017 }
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
            N9.Q r3 = r2.f33138c     // Catch:{ all -> 0x0017 }
            int r0 = r2.C()     // Catch:{ all -> 0x0017 }
            java.lang.Object r3 = r3.e(r0)     // Catch:{ all -> 0x0017 }
            N9.L$c r3 = (N9.L.c) r3     // Catch:{ all -> 0x0017 }
            k9.q0 r3 = r3.f33165a     // Catch:{ all -> 0x0017 }
            k9.q0 r0 = r2.f33142g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            int r3 = r2.f33154s     // Catch:{ all -> 0x0017 }
            int r3 = r2.D(r3)     // Catch:{ all -> 0x0017 }
            boolean r3 = r2.M(r3)     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return r3
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.L.K(boolean):boolean");
    }

    public void N() {
        n nVar = this.f33143h;
        if (nVar != null && nVar.getState() == 1) {
            throw ((n.a) C3645a.e(this.f33143h.a()));
        }
    }

    public final synchronized int Q() {
        int i10;
        try {
            int D10 = D(this.f33154s);
            if (H()) {
                i10 = this.f33145j[D10];
            } else {
                i10 = this.f33131C;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return i10;
    }

    public void R() {
        r();
        U();
    }

    public int S(C3718r0 r0Var, C3871g gVar, int i10, boolean z10) {
        boolean z11;
        boolean z12 = false;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int P10 = P(r0Var, gVar, z11, z10, this.f33137b);
        if (P10 == -4 && !gVar.p()) {
            if ((i10 & 1) != 0) {
                z12 = true;
            }
            if ((i10 & 4) == 0) {
                if (z12) {
                    this.f33136a.f(gVar, this.f33137b);
                } else {
                    this.f33136a.m(gVar, this.f33137b);
                }
            }
            if (!z12) {
                this.f33154s++;
            }
        }
        return P10;
    }

    public void T() {
        W(true);
        U();
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z10) {
        this.f33136a.n();
        this.f33151p = 0;
        this.f33152q = 0;
        this.f33153r = 0;
        this.f33154s = 0;
        this.f33159x = true;
        this.f33155t = Long.MIN_VALUE;
        this.f33156u = Long.MIN_VALUE;
        this.f33157v = Long.MIN_VALUE;
        this.f33158w = false;
        this.f33138c.b();
        if (z10) {
            this.f33129A = null;
            this.f33130B = null;
            this.f33160y = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean Y(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.X()     // Catch:{ all -> 0x0018 }
            int r0 = r3.f33152q     // Catch:{ all -> 0x0018 }
            if (r4 < r0) goto L_0x001a
            int r1 = r3.f33151p     // Catch:{ all -> 0x0018 }
            int r1 = r1 + r0
            if (r4 <= r1) goto L_0x000e
            goto L_0x001a
        L_0x000e:
            r1 = -9223372036854775808
            r3.f33155t = r1     // Catch:{ all -> 0x0018 }
            int r4 = r4 - r0
            r3.f33154s = r4     // Catch:{ all -> 0x0018 }
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
        throw new UnsupportedOperationException("Method not decompiled: N9.L.Y(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean Z(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.X()     // Catch:{ all -> 0x003e }
            int r0 = r8.f33154s     // Catch:{ all -> 0x003e }
            int r2 = r8.D(r0)     // Catch:{ all -> 0x003e }
            boolean r0 = r8.H()     // Catch:{ all -> 0x003e }
            r7 = 0
            if (r0 == 0) goto L_0x0040
            long[] r0 = r8.f33149n     // Catch:{ all -> 0x003e }
            r3 = r0[r2]     // Catch:{ all -> 0x003e }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0040
            long r0 = r8.f33157v     // Catch:{ all -> 0x003e }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            if (r11 != 0) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            int r11 = r8.f33151p     // Catch:{ all -> 0x003e }
            int r0 = r8.f33154s     // Catch:{ all -> 0x003e }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.v(r2, r3, r4, r6)     // Catch:{ all -> 0x003e }
            r0 = -1
            if (r11 != r0) goto L_0x0034
            monitor-exit(r8)
            return r7
        L_0x0034:
            r8.f33155t = r9     // Catch:{ all -> 0x003e }
            int r9 = r8.f33154s     // Catch:{ all -> 0x003e }
            int r9 = r9 + r11
            r8.f33154s = r9     // Catch:{ all -> 0x003e }
            monitor-exit(r8)
            r9 = 1
            return r9
        L_0x003e:
            r9 = move-exception
            goto L_0x0042
        L_0x0040:
            monitor-exit(r8)
            return r7
        L_0x0042:
            monitor-exit(r8)     // Catch:{ all -> 0x003e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.L.Z(long, boolean):boolean");
    }

    public final void a0(long j10) {
        if (this.f33134F != j10) {
            this.f33134F = j10;
            I();
        }
    }

    public final void b(B b10, int i10, int i11) {
        this.f33136a.q(b10, i10);
    }

    public final void b0(long j10) {
        this.f33155t = j10;
    }

    public final void c(C3717q0 q0Var) {
        C3717q0 w10 = w(q0Var);
        this.f33161z = false;
        this.f33129A = q0Var;
        boolean c02 = c0(w10);
        d dVar = this.f33141f;
        if (dVar != null && c02) {
            dVar.e(w10);
        }
    }

    public final void d0(d dVar) {
        this.f33141f = dVar;
    }

    public final int e(C3610h hVar, int i10, boolean z10, int i11) {
        return this.f33136a.p(hVar, i10, z10);
    }

    public final synchronized void e0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f33154s + i10 <= this.f33151p) {
                    z10 = true;
                    C3645a.a(z10);
                    this.f33154s += i10;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        z10 = false;
        C3645a.a(z10);
        this.f33154s += i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(long r12, int r14, int r15, int r16, q9.C3962B.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f33161z
            if (r0 == 0) goto L_0x0010
            k9.q0 r0 = r8.f33129A
            java.lang.Object r0 = ja.C3645a.h(r0)
            k9.q0 r0 = (k9.C3717q0) r0
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
            boolean r4 = r8.f33159x
            if (r4 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0020
            return
        L_0x0020:
            r8.f33159x = r1
        L_0x0022:
            long r4 = r8.f33134F
            long r4 = r4 + r12
            boolean r6 = r8.f33132D
            if (r6 == 0) goto L_0x0054
            long r6 = r8.f33155t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0030
            return
        L_0x0030:
            if (r0 != 0) goto L_0x0054
            boolean r0 = r8.f33133E
            if (r0 != 0) goto L_0x0050
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            k9.q0 r6 = r8.f33130B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            ja.s.i(r6, r0)
            r8.f33133E = r2
        L_0x0050:
            r0 = r14 | 1
            r6 = r0
            goto L_0x0055
        L_0x0054:
            r6 = r14
        L_0x0055:
            boolean r0 = r8.f33135G
            if (r0 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0065
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r8.f33135G = r1
            goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            N9.J r0 = r8.f33136a
            long r0 = r0.e()
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
        throw new UnsupportedOperationException("Method not decompiled: N9.L.f(long, int, int, int, q9.B$a):void");
    }

    public final void f0(int i10) {
        this.f33131C = i10;
    }

    public final void g0() {
        this.f33135G = true;
    }

    public synchronized long o() {
        int i10 = this.f33154s;
        if (i10 == 0) {
            return -1;
        }
        return p(i10);
    }

    public final void q(long j10, boolean z10, boolean z11) {
        this.f33136a.b(m(j10, z10, z11));
    }

    public final void r() {
        this.f33136a.b(n());
    }

    public final void s() {
        this.f33136a.b(o());
    }

    public final void u(int i10) {
        this.f33136a.c(t(i10));
    }

    /* access modifiers changed from: protected */
    public C3717q0 w(C3717q0 q0Var) {
        if (this.f33134F == 0 || q0Var.f45774p == Long.MAX_VALUE) {
            return q0Var;
        }
        return q0Var.b().i0(q0Var.f45774p + this.f33134F).E();
    }

    public final int x() {
        return this.f33152q;
    }

    public final synchronized long y() {
        long j10;
        if (this.f33151p == 0) {
            j10 = Long.MIN_VALUE;
        } else {
            j10 = this.f33149n[this.f33153r];
        }
        return j10;
    }

    public final synchronized long z() {
        return this.f33157v;
    }
}
