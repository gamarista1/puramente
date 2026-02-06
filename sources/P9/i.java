package P9;

import N9.A;
import N9.C3065n;
import N9.L;
import N9.M;
import N9.N;
import ia.B;
import ia.C3604b;
import ja.C3645a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k9.C3717q0;
import k9.C3718r0;
import k9.e1;
import n9.C3871g;
import o9.u;
import o9.v;

public class i implements M, N, B.b, B.f {

    /* renamed from: a  reason: collision with root package name */
    public final int f33611a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int[] f33612b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C3717q0[] f33613c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final boolean[] f33614d;

    /* renamed from: e  reason: collision with root package name */
    private final j f33615e;

    /* renamed from: f  reason: collision with root package name */
    private final N.a f33616f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final A.a f33617g;

    /* renamed from: h  reason: collision with root package name */
    private final ia.A f33618h;

    /* renamed from: i  reason: collision with root package name */
    private final B f33619i;

    /* renamed from: j  reason: collision with root package name */
    private final h f33620j;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList f33621k;

    /* renamed from: l  reason: collision with root package name */
    private final List f33622l;

    /* renamed from: m  reason: collision with root package name */
    private final L f33623m;

    /* renamed from: n  reason: collision with root package name */
    private final L[] f33624n;

    /* renamed from: o  reason: collision with root package name */
    private final c f33625o;

    /* renamed from: p  reason: collision with root package name */
    private f f33626p;

    /* renamed from: q  reason: collision with root package name */
    private C3717q0 f33627q;

    /* renamed from: r  reason: collision with root package name */
    private b f33628r;

    /* renamed from: s  reason: collision with root package name */
    private long f33629s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public long f33630t;

    /* renamed from: u  reason: collision with root package name */
    private int f33631u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public a f33632v;

    /* renamed from: w  reason: collision with root package name */
    boolean f33633w;

    public interface b {
        void e(i iVar);
    }

    public i(int i10, int[] iArr, C3717q0[] q0VarArr, j jVar, N.a aVar, C3604b bVar, long j10, v vVar, u.a aVar2, ia.A a10, A.a aVar3) {
        this.f33611a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f33612b = iArr;
        this.f33613c = q0VarArr == null ? new C3717q0[0] : q0VarArr;
        this.f33615e = jVar;
        this.f33616f = aVar;
        this.f33617g = aVar3;
        this.f33618h = a10;
        this.f33619i = new B("ChunkSampleStream");
        this.f33620j = new h();
        ArrayList arrayList = new ArrayList();
        this.f33621k = arrayList;
        this.f33622l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f33624n = new L[length];
        this.f33614d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        L[] lArr = new L[i12];
        L k10 = L.k(bVar, vVar, aVar2);
        this.f33623m = k10;
        iArr2[0] = i10;
        lArr[0] = k10;
        while (i11 < length) {
            L l10 = L.l(bVar);
            this.f33624n[i11] = l10;
            int i13 = i11 + 1;
            lArr[i13] = l10;
            iArr2[i13] = this.f33612b[i11];
            i11 = i13;
        }
        this.f33625o = new c(iArr2, lArr);
        this.f33629s = j10;
        this.f33630t = j10;
    }

    private void B(int i10) {
        int min = Math.min(O(i10, 0), this.f33631u);
        if (min > 0) {
            ja.M.N0(this.f33621k, 0, min);
            this.f33631u -= min;
        }
    }

    private void C(int i10) {
        C3645a.f(!this.f33619i.j());
        int size = this.f33621k.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!G(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            long j10 = F().f33607h;
            a D10 = D(i10);
            if (this.f33621k.isEmpty()) {
                this.f33629s = this.f33630t;
            }
            this.f33633w = false;
            this.f33617g.D(this.f33611a, D10.f33606g, j10);
        }
    }

    private a D(int i10) {
        a aVar = (a) this.f33621k.get(i10);
        ArrayList arrayList = this.f33621k;
        ja.M.N0(arrayList, i10, arrayList.size());
        this.f33631u = Math.max(this.f33631u, this.f33621k.size());
        int i11 = 0;
        this.f33623m.u(aVar.i(0));
        while (true) {
            L[] lArr = this.f33624n;
            if (i11 >= lArr.length) {
                return aVar;
            }
            L l10 = lArr[i11];
            i11++;
            l10.u(aVar.i(i11));
        }
    }

    private a F() {
        ArrayList arrayList = this.f33621k;
        return (a) arrayList.get(arrayList.size() - 1);
    }

    private boolean G(int i10) {
        int C10;
        a aVar = (a) this.f33621k.get(i10);
        if (this.f33623m.C() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            L[] lArr = this.f33624n;
            if (i11 >= lArr.length) {
                return false;
            }
            C10 = lArr[i11].C();
            i11++;
        } while (C10 <= aVar.i(i11));
        return true;
    }

    private boolean H(f fVar) {
        return fVar instanceof a;
    }

    private void J() {
        int O10 = O(this.f33623m.C(), this.f33631u - 1);
        while (true) {
            int i10 = this.f33631u;
            if (i10 <= O10) {
                this.f33631u = i10 + 1;
                K(i10);
            } else {
                return;
            }
        }
    }

    private void K(int i10) {
        a aVar = (a) this.f33621k.get(i10);
        C3717q0 q0Var = aVar.f33603d;
        if (!q0Var.equals(this.f33627q)) {
            this.f33617g.i(this.f33611a, q0Var, aVar.f33604e, aVar.f33605f, aVar.f33606g);
        }
        this.f33627q = q0Var;
    }

    private int O(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f33621k.size()) {
                return this.f33621k.size() - 1;
            }
        } while (((a) this.f33621k.get(i11)).i(0) <= i10);
        return i11 - 1;
    }

    private void R() {
        this.f33623m.V();
        for (L V10 : this.f33624n) {
            V10.V();
        }
    }

    public j E() {
        return this.f33615e;
    }

    /* access modifiers changed from: package-private */
    public boolean I() {
        if (this.f33629s != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    public void t(f fVar, long j10, long j11, boolean z10) {
        f fVar2 = fVar;
        this.f33626p = null;
        this.f33632v = null;
        C3065n nVar = new C3065n(fVar2.f33600a, fVar2.f33601b, fVar.f(), fVar.e(), j10, j11, fVar.c());
        this.f33618h.b(fVar2.f33600a);
        this.f33617g.r(nVar, fVar2.f33602c, this.f33611a, fVar2.f33603d, fVar2.f33604e, fVar2.f33605f, fVar2.f33606g, fVar2.f33607h);
        if (!z10) {
            if (I()) {
                R();
            } else if (H(fVar)) {
                D(this.f33621k.size() - 1);
                if (this.f33621k.isEmpty()) {
                    this.f33629s = this.f33630t;
                }
            }
            this.f33616f.p(this);
        }
    }

    /* renamed from: M */
    public void p(f fVar, long j10, long j11) {
        f fVar2 = fVar;
        this.f33626p = null;
        this.f33615e.d(fVar2);
        C3065n nVar = new C3065n(fVar2.f33600a, fVar2.f33601b, fVar.f(), fVar.e(), j10, j11, fVar.c());
        this.f33618h.b(fVar2.f33600a);
        this.f33617g.u(nVar, fVar2.f33602c, this.f33611a, fVar2.f33603d, fVar2.f33604e, fVar2.f33605f, fVar2.f33606g, fVar2.f33607h);
        this.f33616f.p(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ef  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ia.B.c u(P9.f r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            long r12 = r31.c()
            boolean r14 = r30.H(r31)
            java.util.ArrayList r2 = r0.f33621k
            int r2 = r2.size()
            r15 = 1
            int r10 = r2 + -1
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            r11 = 0
            if (r2 == 0) goto L_0x0027
            if (r14 == 0) goto L_0x0027
            boolean r2 = r0.G(r10)
            if (r2 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r8 = r11
            goto L_0x0028
        L_0x0027:
            r8 = r15
        L_0x0028:
            N9.n r9 = new N9.n
            long r3 = r1.f33600a
            ia.n r5 = r1.f33601b
            android.net.Uri r6 = r31.f()
            java.util.Map r7 = r31.e()
            r2 = r9
            r15 = r8
            r17 = r14
            r14 = r9
            r8 = r32
            r29 = r10
            r10 = r34
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            N9.q r2 = new N9.q
            int r3 = r1.f33602c
            int r4 = r0.f33611a
            k9.q0 r5 = r1.f33603d
            int r6 = r1.f33604e
            java.lang.Object r7 = r1.f33605f
            long r8 = r1.f33606g
            long r24 = ja.M.Z0(r8)
            long r8 = r1.f33607h
            long r26 = ja.M.Z0(r8)
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r26)
            ia.A$c r3 = new ia.A$c
            r4 = r36
            r5 = r37
            r3.<init>(r14, r2, r4, r5)
            P9.j r2 = r0.f33615e
            ia.A r5 = r0.f33618h
            boolean r2 = r2.b(r1, r15, r3, r5)
            if (r2 == 0) goto L_0x00a6
            if (r15 == 0) goto L_0x009f
            ia.B$c r2 = ia.B.f44364f
            if (r17 == 0) goto L_0x00a7
            r6 = r29
            P9.a r6 = r0.D(r6)
            if (r6 != r1) goto L_0x008e
            r15 = 1
            goto L_0x008f
        L_0x008e:
            r15 = 0
        L_0x008f:
            ja.C3645a.f(r15)
            java.util.ArrayList r6 = r0.f33621k
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00a7
            long r6 = r0.f33630t
            r0.f33629s = r6
            goto L_0x00a7
        L_0x009f:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r6 = "Ignoring attempt to cancel non-cancelable load."
            ja.s.i(r2, r6)
        L_0x00a6:
            r2 = 0
        L_0x00a7:
            if (r2 != 0) goto L_0x00c0
            ia.A r2 = r0.f33618h
            long r2 = r2.c(r3)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x00be
            r6 = 0
            ia.B$c r2 = ia.B.h(r6, r2)
            goto L_0x00c0
        L_0x00be:
            ia.B$c r2 = ia.B.f44365g
        L_0x00c0:
            boolean r3 = r2.c()
            r28 = r3 ^ 1
            N9.A$a r6 = r0.f33617g
            int r7 = r1.f33602c
            int r8 = r0.f33611a
            k9.q0 r9 = r1.f33603d
            int r10 = r1.f33604e
            java.lang.Object r11 = r1.f33605f
            long r12 = r1.f33606g
            long r4 = r1.f33607h
            r16 = r6
            r17 = r14
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r11
            r23 = r12
            r25 = r4
            r27 = r36
            r16.w(r17, r18, r19, r20, r21, r22, r23, r25, r27, r28)
            if (r3 != 0) goto L_0x00fe
            r3 = 0
            r0.f33626p = r3
            ia.A r3 = r0.f33618h
            long r4 = r1.f33600a
            r3.b(r4)
            N9.N$a r1 = r0.f33616f
            r1.p(r0)
        L_0x00fe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: P9.i.u(P9.f, long, long, java.io.IOException, int):ia.B$c");
    }

    public void P() {
        Q((b) null);
    }

    public void Q(b bVar) {
        this.f33628r = bVar;
        this.f33623m.R();
        for (L R10 : this.f33624n) {
            R10.R();
        }
        this.f33619i.m(this);
    }

    public void S(long j10) {
        a aVar;
        boolean z10;
        boolean z11;
        this.f33630t = j10;
        if (I()) {
            this.f33629s = j10;
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f33621k.size()) {
                break;
            }
            aVar = (a) this.f33621k.get(i11);
            int i12 = (aVar.f33606g > j10 ? 1 : (aVar.f33606g == j10 ? 0 : -1));
            if (i12 == 0 && aVar.f33573k == -9223372036854775807L) {
                break;
            } else if (i12 > 0) {
                break;
            } else {
                i11++;
            }
        }
        aVar = null;
        if (aVar != null) {
            z10 = this.f33623m.Y(aVar.i(0));
        } else {
            L l10 = this.f33623m;
            if (j10 < a()) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 = l10.Z(j10, z11);
        }
        if (z10) {
            this.f33631u = O(this.f33623m.C(), 0);
            L[] lArr = this.f33624n;
            int length = lArr.length;
            while (i10 < length) {
                lArr[i10].Z(j10, true);
                i10++;
            }
            return;
        }
        this.f33629s = j10;
        this.f33633w = false;
        this.f33621k.clear();
        this.f33631u = 0;
        if (this.f33619i.j()) {
            this.f33623m.r();
            L[] lArr2 = this.f33624n;
            int length2 = lArr2.length;
            while (i10 < length2) {
                lArr2[i10].r();
                i10++;
            }
            this.f33619i.f();
            return;
        }
        this.f33619i.g();
        R();
    }

    public a T(long j10, int i10) {
        for (int i11 = 0; i11 < this.f33624n.length; i11++) {
            if (this.f33612b[i11] == i10) {
                C3645a.f(!this.f33614d[i11]);
                this.f33614d[i11] = true;
                this.f33624n[i11].Z(j10, true);
                return new a(this, this.f33624n[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    public long a() {
        if (I()) {
            return this.f33629s;
        }
        if (this.f33633w) {
            return Long.MIN_VALUE;
        }
        return F().f33607h;
    }

    public boolean b() {
        return this.f33619i.j();
    }

    public long c() {
        if (this.f33633w) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.f33629s;
        }
        long j10 = this.f33630t;
        a F10 = F();
        if (!F10.h()) {
            if (this.f33621k.size() > 1) {
                ArrayList arrayList = this.f33621k;
                F10 = (a) arrayList.get(arrayList.size() - 2);
            } else {
                F10 = null;
            }
        }
        if (F10 != null) {
            j10 = Math.max(j10, F10.f33607h);
        }
        return Math.max(j10, this.f33623m.z());
    }

    public boolean d() {
        if (I() || !this.f33623m.K(this.f33633w)) {
            return false;
        }
        return true;
    }

    public void e() {
        this.f33619i.e();
        this.f33623m.N();
        if (!this.f33619i.j()) {
            this.f33615e.e();
        }
    }

    public void f(long j10) {
        if (!this.f33619i.i() && !I()) {
            if (this.f33619i.j()) {
                f fVar = (f) C3645a.e(this.f33626p);
                if ((!H(fVar) || !G(this.f33621k.size() - 1)) && this.f33615e.f(j10, fVar, this.f33622l)) {
                    this.f33619i.f();
                    if (H(fVar)) {
                        this.f33632v = (a) fVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int h10 = this.f33615e.h(j10, this.f33622l);
            if (h10 < this.f33621k.size()) {
                C(h10);
            }
        }
    }

    public void i() {
        this.f33623m.T();
        for (L T10 : this.f33624n) {
            T10.T();
        }
        this.f33615e.release();
        b bVar = this.f33628r;
        if (bVar != null) {
            bVar.e(this);
        }
    }

    public int k(long j10) {
        if (I()) {
            return 0;
        }
        int E10 = this.f33623m.E(j10, this.f33633w);
        a aVar = this.f33632v;
        if (aVar != null) {
            E10 = Math.min(E10, aVar.i(0) - this.f33623m.C());
        }
        this.f33623m.e0(E10);
        J();
        return E10;
    }

    public long l(long j10, e1 e1Var) {
        return this.f33615e.l(j10, e1Var);
    }

    public boolean m(long j10) {
        List list;
        long j11;
        if (this.f33633w || this.f33619i.j() || this.f33619i.i()) {
            return false;
        }
        boolean I10 = I();
        if (I10) {
            list = Collections.emptyList();
            j11 = this.f33629s;
        } else {
            list = this.f33622l;
            j11 = F().f33607h;
        }
        this.f33615e.g(j10, j11, list, this.f33620j);
        h hVar = this.f33620j;
        boolean z10 = hVar.f33610b;
        f fVar = hVar.f33609a;
        hVar.a();
        if (z10) {
            this.f33629s = -9223372036854775807L;
            this.f33633w = true;
            return true;
        } else if (fVar == null) {
            return false;
        } else {
            this.f33626p = fVar;
            if (H(fVar)) {
                a aVar = (a) fVar;
                if (I10) {
                    long j12 = aVar.f33606g;
                    long j13 = this.f33629s;
                    if (j12 != j13) {
                        this.f33623m.b0(j13);
                        for (L b02 : this.f33624n) {
                            b02.b0(this.f33629s);
                        }
                    }
                    this.f33629s = -9223372036854775807L;
                }
                aVar.k(this.f33625o);
                this.f33621k.add(aVar);
            } else if (fVar instanceof m) {
                ((m) fVar).g(this.f33625o);
            }
            this.f33617g.A(new C3065n(fVar.f33600a, fVar.f33601b, this.f33619i.n(fVar, this, this.f33618h.a(fVar.f33602c))), fVar.f33602c, this.f33611a, fVar.f33603d, fVar.f33604e, fVar.f33605f, fVar.f33606g, fVar.f33607h);
            return true;
        }
    }

    public void o(long j10, boolean z10) {
        if (!I()) {
            int x10 = this.f33623m.x();
            this.f33623m.q(j10, z10, true);
            int x11 = this.f33623m.x();
            if (x11 > x10) {
                long y10 = this.f33623m.y();
                int i10 = 0;
                while (true) {
                    L[] lArr = this.f33624n;
                    if (i10 >= lArr.length) {
                        break;
                    }
                    lArr[i10].q(y10, z10, this.f33614d[i10]);
                    i10++;
                }
            }
            B(x11);
        }
    }

    public int q(C3718r0 r0Var, C3871g gVar, int i10) {
        if (I()) {
            return -3;
        }
        a aVar = this.f33632v;
        if (aVar != null && aVar.i(0) <= this.f33623m.C()) {
            return -3;
        }
        J();
        return this.f33623m.S(r0Var, gVar, i10, this.f33633w);
    }

    public final class a implements M {

        /* renamed from: a  reason: collision with root package name */
        public final i f33634a;

        /* renamed from: b  reason: collision with root package name */
        private final L f33635b;

        /* renamed from: c  reason: collision with root package name */
        private final int f33636c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f33637d;

        public a(i iVar, L l10, int i10) {
            this.f33634a = iVar;
            this.f33635b = l10;
            this.f33636c = i10;
        }

        private void a() {
            if (!this.f33637d) {
                i.this.f33617g.i(i.this.f33612b[this.f33636c], i.this.f33613c[this.f33636c], 0, (Object) null, i.this.f33630t);
                this.f33637d = true;
            }
        }

        public void b() {
            C3645a.f(i.this.f33614d[this.f33636c]);
            i.this.f33614d[this.f33636c] = false;
        }

        public boolean d() {
            if (i.this.I() || !this.f33635b.K(i.this.f33633w)) {
                return false;
            }
            return true;
        }

        public int k(long j10) {
            if (i.this.I()) {
                return 0;
            }
            int E10 = this.f33635b.E(j10, i.this.f33633w);
            if (i.this.f33632v != null) {
                E10 = Math.min(E10, i.this.f33632v.i(this.f33636c + 1) - this.f33635b.C());
            }
            this.f33635b.e0(E10);
            if (E10 > 0) {
                a();
            }
            return E10;
        }

        public int q(C3718r0 r0Var, C3871g gVar, int i10) {
            if (i.this.I()) {
                return -3;
            }
            if (i.this.f33632v != null && i.this.f33632v.i(this.f33636c + 1) <= this.f33635b.C()) {
                return -3;
            }
            a();
            return this.f33635b.S(r0Var, gVar, i10, i.this.f33633w);
        }

        public void e() {
        }
    }
}
