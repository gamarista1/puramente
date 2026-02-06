package ig;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pg.C6639a;
import pg.C6640b;
import pg.C6642d;
import pg.C6643e;
import pg.C6644f;
import pg.C6645g;
import pg.C6647i;
import pg.C6649k;
import pg.p;
import pg.q;
import pg.r;

public final class m extends C6647i.d implements q {

    /* renamed from: k  reason: collision with root package name */
    private static final m f68192k;

    /* renamed from: l  reason: collision with root package name */
    public static r f68193l = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f68194c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68195d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public p f68196e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public o f68197f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public l f68198g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public List f68199h;

    /* renamed from: i  reason: collision with root package name */
    private byte f68200i;

    /* renamed from: j  reason: collision with root package name */
    private int f68201j;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public m b(C6643e eVar, C6645g gVar) {
            return new m(eVar, gVar);
        }
    }

    static {
        m mVar = new m(true);
        f68192k = mVar;
        mVar.S();
    }

    public static m K() {
        return f68192k;
    }

    private void S() {
        this.f68196e = p.u();
        this.f68197f = o.u();
        this.f68198g = l.K();
        this.f68199h = Collections.emptyList();
    }

    public static b T() {
        return b.w();
    }

    public static b U(m mVar) {
        return T().k(mVar);
    }

    public static m W(InputStream inputStream, C6645g gVar) {
        return (m) f68193l.c(inputStream, gVar);
    }

    public c H(int i10) {
        return (c) this.f68199h.get(i10);
    }

    public int I() {
        return this.f68199h.size();
    }

    public List J() {
        return this.f68199h;
    }

    /* renamed from: L */
    public m d() {
        return f68192k;
    }

    public l M() {
        return this.f68198g;
    }

    public o N() {
        return this.f68197f;
    }

    public p O() {
        return this.f68196e;
    }

    public boolean P() {
        if ((this.f68195d & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        if ((this.f68195d & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean R() {
        if ((this.f68195d & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public b c() {
        return T();
    }

    /* renamed from: X */
    public b g() {
        return U(this);
    }

    public int a() {
        int i10;
        int i11 = this.f68201j;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68195d & 1) == 1) {
            i10 = C6644f.r(1, this.f68196e);
        } else {
            i10 = 0;
        }
        if ((this.f68195d & 2) == 2) {
            i10 += C6644f.r(2, this.f68197f);
        }
        if ((this.f68195d & 4) == 4) {
            i10 += C6644f.r(3, this.f68198g);
        }
        for (int i12 = 0; i12 < this.f68199h.size(); i12++) {
            i10 += C6644f.r(4, (p) this.f68199h.get(i12));
        }
        int t10 = i10 + t() + this.f68194c.size();
        this.f68201j = t10;
        return t10;
    }

    public final boolean e() {
        byte b10 = this.f68200i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (Q() && !N().e()) {
            this.f68200i = 0;
            return false;
        } else if (!P() || M().e()) {
            for (int i10 = 0; i10 < I(); i10++) {
                if (!H(i10).e()) {
                    this.f68200i = 0;
                    return false;
                }
            }
            if (!s()) {
                this.f68200i = 0;
                return false;
            }
            this.f68200i = 1;
            return true;
        } else {
            this.f68200i = 0;
            return false;
        }
    }

    public void h(C6644f fVar) {
        a();
        C6647i.d.a y10 = y();
        if ((this.f68195d & 1) == 1) {
            fVar.c0(1, this.f68196e);
        }
        if ((this.f68195d & 2) == 2) {
            fVar.c0(2, this.f68197f);
        }
        if ((this.f68195d & 4) == 4) {
            fVar.c0(3, this.f68198g);
        }
        for (int i10 = 0; i10 < this.f68199h.size(); i10++) {
            fVar.c0(4, (p) this.f68199h.get(i10));
        }
        y10.a(200, fVar);
        fVar.h0(this.f68194c);
    }

    private m(C6647i.c cVar) {
        super(cVar);
        this.f68200i = -1;
        this.f68201j = -1;
        this.f68194c = cVar.j();
    }

    private m(boolean z10) {
        this.f68200i = -1;
        this.f68201j = -1;
        this.f68194c = C6642d.f72492a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: ig.p$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: ig.o$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: ig.l$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private m(pg.C6643e r10, pg.C6645g r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f68200i = r0
            r9.f68201j = r0
            r9.S()
            pg.d$b r0 = pg.C6642d.x()
            r1 = 1
            pg.f r2 = pg.C6644f.I(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0016:
            r5 = 8
            if (r3 != 0) goto L_0x0105
            int r6 = r10.J()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            if (r6 == 0) goto L_0x0037
            r7 = 10
            r8 = 0
            if (r6 == r7) goto L_0x00a9
            r7 = 18
            if (r6 == r7) goto L_0x0081
            r7 = 26
            if (r6 == r7) goto L_0x005a
            r7 = 34
            if (r6 == r7) goto L_0x0042
            boolean r5 = r9.p(r10, r2, r11, r6)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            if (r5 != 0) goto L_0x0016
        L_0x0037:
            r3 = r1
            goto L_0x0016
        L_0x0039:
            r10 = move-exception
            goto L_0x00e3
        L_0x003c:
            r10 = move-exception
            goto L_0x00d0
        L_0x003f:
            r10 = move-exception
            goto L_0x00de
        L_0x0042:
            r6 = r4 & 8
            if (r6 == r5) goto L_0x004e
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6.<init>()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f68199h = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r4 = r5
        L_0x004e:
            java.util.List r6 = r9.f68199h     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            pg.r r7 = ig.c.f67971Z     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            pg.p r7 = r10.t(r7, r11)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6.add(r7)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            goto L_0x0016
        L_0x005a:
            int r6 = r9.f68195d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r7 = 4
            r6 = r6 & r7
            if (r6 != r7) goto L_0x0066
            ig.l r6 = r9.f68198g     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            ig.l$b r8 = r6.g()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x0066:
            pg.r r6 = ig.l.f68176m     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            pg.p r6 = r10.t(r6, r11)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            ig.l r6 = (ig.l) r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f68198g = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            if (r8 == 0) goto L_0x007b
            r8.k(r6)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            ig.l r6 = r8.t()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f68198g = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x007b:
            int r6 = r9.f68195d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6 = r6 | r7
            r9.f68195d = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            goto L_0x0016
        L_0x0081:
            int r6 = r9.f68195d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r7 = 2
            r6 = r6 & r7
            if (r6 != r7) goto L_0x008d
            ig.o r6 = r9.f68197f     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            ig.o$b r8 = r6.g()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x008d:
            pg.r r6 = ig.o.f68244g     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            pg.p r6 = r10.t(r6, r11)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            ig.o r6 = (ig.o) r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f68197f = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            if (r8 == 0) goto L_0x00a2
            r8.k(r6)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            ig.o r6 = r8.p()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f68197f = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x00a2:
            int r6 = r9.f68195d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6 = r6 | r7
            r9.f68195d = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            goto L_0x0016
        L_0x00a9:
            int r6 = r9.f68195d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6 = r6 & r1
            if (r6 != r1) goto L_0x00b4
            ig.p r6 = r9.f68196e     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            ig.p$b r8 = r6.g()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x00b4:
            pg.r r6 = ig.p.f68271g     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            pg.p r6 = r10.t(r6, r11)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            ig.p r6 = (ig.p) r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f68196e = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            if (r8 == 0) goto L_0x00c9
            r8.k(r6)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            ig.p r6 = r8.p()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f68196e = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x00c9:
            int r6 = r9.f68195d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6 = r6 | r1
            r9.f68195d = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            goto L_0x0016
        L_0x00d0:
            pg.k r11 = new pg.k     // Catch:{ all -> 0x0039 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0039 }
            r11.<init>(r10)     // Catch:{ all -> 0x0039 }
            pg.k r10 = r11.i(r9)     // Catch:{ all -> 0x0039 }
            throw r10     // Catch:{ all -> 0x0039 }
        L_0x00de:
            pg.k r10 = r10.i(r9)     // Catch:{ all -> 0x0039 }
            throw r10     // Catch:{ all -> 0x0039 }
        L_0x00e3:
            r11 = r4 & 8
            if (r11 != r5) goto L_0x00ef
            java.util.List r11 = r9.f68199h
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f68199h = r11
        L_0x00ef:
            r2.H()     // Catch:{ IOException -> 0x00f2, all -> 0x00f9 }
        L_0x00f2:
            pg.d r11 = r0.n()
            r9.f68194c = r11
            goto L_0x0101
        L_0x00f9:
            r10 = move-exception
            pg.d r11 = r0.n()
            r9.f68194c = r11
            throw r10
        L_0x0101:
            r9.m()
            throw r10
        L_0x0105:
            r10 = r4 & 8
            if (r10 != r5) goto L_0x0111
            java.util.List r10 = r9.f68199h
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f68199h = r10
        L_0x0111:
            r2.H()     // Catch:{ IOException -> 0x0114, all -> 0x011b }
        L_0x0114:
            pg.d r10 = r0.n()
            r9.f68194c = r10
            goto L_0x0123
        L_0x011b:
            r10 = move-exception
            pg.d r11 = r0.n()
            r9.f68194c = r11
            throw r10
        L_0x0123:
            r9.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.m.<init>(pg.e, pg.g):void");
    }

    public static final class b extends C6647i.c implements q {

        /* renamed from: d  reason: collision with root package name */
        private int f68202d;

        /* renamed from: e  reason: collision with root package name */
        private p f68203e = p.u();

        /* renamed from: f  reason: collision with root package name */
        private o f68204f = o.u();

        /* renamed from: g  reason: collision with root package name */
        private l f68205g = l.K();

        /* renamed from: h  reason: collision with root package name */
        private List f68206h = Collections.emptyList();

        private b() {
            y();
        }

        /* access modifiers changed from: private */
        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f68202d & 8) != 8) {
                this.f68206h = new ArrayList(this.f68206h);
                this.f68202d |= 8;
            }
        }

        /* renamed from: A */
        public b h0(C6643e eVar, C6645g gVar) {
            m mVar;
            m mVar2 = null;
            try {
                m mVar3 = (m) m.f68193l.b(eVar, gVar);
                if (mVar3 != null) {
                    k(mVar3);
                }
                return this;
            } catch (C6649k e10) {
                mVar = (m) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                mVar2 = mVar;
            }
            if (mVar2 != null) {
                k(mVar2);
            }
            throw th;
        }

        public b B(l lVar) {
            if ((this.f68202d & 4) != 4 || this.f68205g == l.K()) {
                this.f68205g = lVar;
            } else {
                this.f68205g = l.b0(this.f68205g).k(lVar).t();
            }
            this.f68202d |= 4;
            return this;
        }

        public b C(o oVar) {
            if ((this.f68202d & 2) != 2 || this.f68204f == o.u()) {
                this.f68204f = oVar;
            } else {
                this.f68204f = o.z(this.f68204f).k(oVar).p();
            }
            this.f68202d |= 2;
            return this;
        }

        public b D(p pVar) {
            if ((this.f68202d & 1) != 1 || this.f68203e == p.u()) {
                this.f68203e = pVar;
            } else {
                this.f68203e = p.z(this.f68203e).k(pVar).p();
            }
            this.f68202d |= 1;
            return this;
        }

        /* renamed from: s */
        public m f() {
            m t10 = t();
            if (t10.e()) {
                return t10;
            }
            throw C6639a.C1046a.i(t10);
        }

        public m t() {
            m mVar = new m((C6647i.c) this);
            int i10 = this.f68202d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            p unused = mVar.f68196e = this.f68203e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            o unused2 = mVar.f68197f = this.f68204f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            l unused3 = mVar.f68198g = this.f68205g;
            if ((this.f68202d & 8) == 8) {
                this.f68206h = Collections.unmodifiableList(this.f68206h);
                this.f68202d &= -9;
            }
            List unused4 = mVar.f68199h = this.f68206h;
            int unused5 = mVar.f68195d = i11;
            return mVar;
        }

        /* renamed from: u */
        public b clone() {
            return w().k(t());
        }

        /* renamed from: z */
        public b k(m mVar) {
            if (mVar == m.K()) {
                return this;
            }
            if (mVar.R()) {
                D(mVar.O());
            }
            if (mVar.Q()) {
                C(mVar.N());
            }
            if (mVar.P()) {
                B(mVar.M());
            }
            if (!mVar.f68199h.isEmpty()) {
                if (this.f68206h.isEmpty()) {
                    this.f68206h = mVar.f68199h;
                    this.f68202d &= -9;
                } else {
                    x();
                    this.f68206h.addAll(mVar.f68199h);
                }
            }
            q(mVar);
            l(j().b(mVar.f68194c));
            return this;
        }

        private void y() {
        }
    }
}
