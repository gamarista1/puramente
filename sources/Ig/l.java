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

public final class l extends C6647i.d implements q {

    /* renamed from: l  reason: collision with root package name */
    private static final l f68175l;

    /* renamed from: m  reason: collision with root package name */
    public static r f68176m = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f68177c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68178d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List f68179e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List f68180f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public List f68181g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public t f68182h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public w f68183i;

    /* renamed from: j  reason: collision with root package name */
    private byte f68184j;

    /* renamed from: k  reason: collision with root package name */
    private int f68185k;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public l b(C6643e eVar, C6645g gVar) {
            return new l(eVar, gVar);
        }
    }

    static {
        l lVar = new l(true);
        f68175l = lVar;
        lVar.Z();
    }

    public static l K() {
        return f68175l;
    }

    private void Z() {
        this.f68179e = Collections.emptyList();
        this.f68180f = Collections.emptyList();
        this.f68181g = Collections.emptyList();
        this.f68182h = t.w();
        this.f68183i = w.u();
    }

    public static b a0() {
        return b.w();
    }

    public static b b0(l lVar) {
        return a0().k(lVar);
    }

    public static l d0(InputStream inputStream, C6645g gVar) {
        return (l) f68176m.c(inputStream, gVar);
    }

    /* renamed from: L */
    public l d() {
        return f68175l;
    }

    public i M(int i10) {
        return (i) this.f68179e.get(i10);
    }

    public int N() {
        return this.f68179e.size();
    }

    public List O() {
        return this.f68179e;
    }

    public n P(int i10) {
        return (n) this.f68180f.get(i10);
    }

    public int Q() {
        return this.f68180f.size();
    }

    public List R() {
        return this.f68180f;
    }

    public r S(int i10) {
        return (r) this.f68181g.get(i10);
    }

    public int T() {
        return this.f68181g.size();
    }

    public List U() {
        return this.f68181g;
    }

    public t V() {
        return this.f68182h;
    }

    public w W() {
        return this.f68183i;
    }

    public boolean X() {
        if ((this.f68178d & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean Y() {
        if ((this.f68178d & 2) == 2) {
            return true;
        }
        return false;
    }

    public int a() {
        int i10 = this.f68185k;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f68179e.size(); i12++) {
            i11 += C6644f.r(3, (p) this.f68179e.get(i12));
        }
        for (int i13 = 0; i13 < this.f68180f.size(); i13++) {
            i11 += C6644f.r(4, (p) this.f68180f.get(i13));
        }
        for (int i14 = 0; i14 < this.f68181g.size(); i14++) {
            i11 += C6644f.r(5, (p) this.f68181g.get(i14));
        }
        if ((this.f68178d & 1) == 1) {
            i11 += C6644f.r(30, this.f68182h);
        }
        if ((this.f68178d & 2) == 2) {
            i11 += C6644f.r(32, this.f68183i);
        }
        int t10 = i11 + t() + this.f68177c.size();
        this.f68185k = t10;
        return t10;
    }

    /* renamed from: c0 */
    public b c() {
        return a0();
    }

    public final boolean e() {
        byte b10 = this.f68184j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < N(); i10++) {
            if (!M(i10).e()) {
                this.f68184j = 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < Q(); i11++) {
            if (!P(i11).e()) {
                this.f68184j = 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < T(); i12++) {
            if (!S(i12).e()) {
                this.f68184j = 0;
                return false;
            }
        }
        if (X() && !V().e()) {
            this.f68184j = 0;
            return false;
        } else if (!s()) {
            this.f68184j = 0;
            return false;
        } else {
            this.f68184j = 1;
            return true;
        }
    }

    /* renamed from: e0 */
    public b g() {
        return b0(this);
    }

    public void h(C6644f fVar) {
        a();
        C6647i.d.a y10 = y();
        for (int i10 = 0; i10 < this.f68179e.size(); i10++) {
            fVar.c0(3, (p) this.f68179e.get(i10));
        }
        for (int i11 = 0; i11 < this.f68180f.size(); i11++) {
            fVar.c0(4, (p) this.f68180f.get(i11));
        }
        for (int i12 = 0; i12 < this.f68181g.size(); i12++) {
            fVar.c0(5, (p) this.f68181g.get(i12));
        }
        if ((this.f68178d & 1) == 1) {
            fVar.c0(30, this.f68182h);
        }
        if ((this.f68178d & 2) == 2) {
            fVar.c0(32, this.f68183i);
        }
        y10.a(200, fVar);
        fVar.h0(this.f68177c);
    }

    private l(C6647i.c cVar) {
        super(cVar);
        this.f68184j = -1;
        this.f68185k = -1;
        this.f68177c = cVar.j();
    }

    private l(boolean z10) {
        this.f68184j = -1;
        this.f68185k = -1;
        this.f68177c = C6642d.f72492a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: ig.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: ig.w$b} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private l(pg.C6643e r11, pg.C6645g r12) {
        /*
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.f68184j = r0
            r10.f68185k = r0
            r10.Z()
            pg.d$b r0 = pg.C6642d.x()
            r1 = 1
            pg.f r2 = pg.C6644f.I(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0016:
            r5 = 4
            r6 = 2
            if (r3 != 0) goto L_0x012d
            int r7 = r11.J()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            if (r7 == 0) goto L_0x003b
            r8 = 26
            if (r7 == r8) goto L_0x00c6
            r8 = 34
            if (r7 == r8) goto L_0x00ac
            r8 = 42
            if (r7 == r8) goto L_0x0092
            r8 = 242(0xf2, float:3.39E-43)
            r9 = 0
            if (r7 == r8) goto L_0x006c
            r8 = 258(0x102, float:3.62E-43)
            if (r7 == r8) goto L_0x0046
            boolean r5 = r10.p(r11, r2, r12, r7)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            if (r5 != 0) goto L_0x0016
        L_0x003b:
            r3 = r1
            goto L_0x0016
        L_0x003d:
            r11 = move-exception
            goto L_0x00f3
        L_0x0040:
            r11 = move-exception
            goto L_0x00e0
        L_0x0043:
            r11 = move-exception
            goto L_0x00ee
        L_0x0046:
            int r7 = r10.f68178d     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7 = r7 & r6
            if (r7 != r6) goto L_0x0051
            ig.w r7 = r10.f68183i     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            ig.w$b r9 = r7.g()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
        L_0x0051:
            pg.r r7 = ig.w.f68446g     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            pg.p r7 = r11.t(r7, r12)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            ig.w r7 = (ig.w) r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f68183i = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            if (r9 == 0) goto L_0x0066
            r9.k(r7)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            ig.w r7 = r9.p()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f68183i = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
        L_0x0066:
            int r7 = r10.f68178d     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7 = r7 | r6
            r10.f68178d = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            goto L_0x0016
        L_0x006c:
            int r7 = r10.f68178d     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7 = r7 & r1
            if (r7 != r1) goto L_0x0077
            ig.t r7 = r10.f68182h     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            ig.t$b r9 = r7.g()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
        L_0x0077:
            pg.r r7 = ig.t.f68385i     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            pg.p r7 = r11.t(r7, r12)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            ig.t r7 = (ig.t) r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f68182h = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            if (r9 == 0) goto L_0x008c
            r9.k(r7)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            ig.t r7 = r9.p()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f68182h = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
        L_0x008c:
            int r7 = r10.f68178d     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7 = r7 | r1
            r10.f68178d = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            goto L_0x0016
        L_0x0092:
            r7 = r4 & 4
            if (r7 == r5) goto L_0x009f
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.<init>()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f68181g = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r4 = r4 | 4
        L_0x009f:
            java.util.List r7 = r10.f68181g     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            pg.r r8 = ig.r.f68334q     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            pg.p r8 = r11.t(r8, r12)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.add(r8)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            goto L_0x0016
        L_0x00ac:
            r7 = r4 & 2
            if (r7 == r6) goto L_0x00b9
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.<init>()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f68180f = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r4 = r4 | 2
        L_0x00b9:
            java.util.List r7 = r10.f68180f     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            pg.r r8 = ig.n.f68208w     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            pg.p r8 = r11.t(r8, r12)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.add(r8)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            goto L_0x0016
        L_0x00c6:
            r7 = r4 & 1
            if (r7 == r1) goto L_0x00d3
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.<init>()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f68179e = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r4 = r4 | 1
        L_0x00d3:
            java.util.List r7 = r10.f68179e     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            pg.r r8 = ig.i.f68126w     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            pg.p r8 = r11.t(r8, r12)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.add(r8)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            goto L_0x0016
        L_0x00e0:
            pg.k r12 = new pg.k     // Catch:{ all -> 0x003d }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x003d }
            r12.<init>(r11)     // Catch:{ all -> 0x003d }
            pg.k r11 = r12.i(r10)     // Catch:{ all -> 0x003d }
            throw r11     // Catch:{ all -> 0x003d }
        L_0x00ee:
            pg.k r11 = r11.i(r10)     // Catch:{ all -> 0x003d }
            throw r11     // Catch:{ all -> 0x003d }
        L_0x00f3:
            r12 = r4 & 1
            if (r12 != r1) goto L_0x00ff
            java.util.List r12 = r10.f68179e
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f68179e = r12
        L_0x00ff:
            r12 = r4 & 2
            if (r12 != r6) goto L_0x010b
            java.util.List r12 = r10.f68180f
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f68180f = r12
        L_0x010b:
            r12 = r4 & 4
            if (r12 != r5) goto L_0x0117
            java.util.List r12 = r10.f68181g
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f68181g = r12
        L_0x0117:
            r2.H()     // Catch:{ IOException -> 0x011a, all -> 0x0121 }
        L_0x011a:
            pg.d r12 = r0.n()
            r10.f68177c = r12
            goto L_0x0129
        L_0x0121:
            r11 = move-exception
            pg.d r12 = r0.n()
            r10.f68177c = r12
            throw r11
        L_0x0129:
            r10.m()
            throw r11
        L_0x012d:
            r11 = r4 & 1
            if (r11 != r1) goto L_0x0139
            java.util.List r11 = r10.f68179e
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f68179e = r11
        L_0x0139:
            r11 = r4 & 2
            if (r11 != r6) goto L_0x0145
            java.util.List r11 = r10.f68180f
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f68180f = r11
        L_0x0145:
            r11 = r4 & 4
            if (r11 != r5) goto L_0x0151
            java.util.List r11 = r10.f68181g
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f68181g = r11
        L_0x0151:
            r2.H()     // Catch:{ IOException -> 0x0154, all -> 0x015b }
        L_0x0154:
            pg.d r11 = r0.n()
            r10.f68177c = r11
            goto L_0x0163
        L_0x015b:
            r11 = move-exception
            pg.d r12 = r0.n()
            r10.f68177c = r12
            throw r11
        L_0x0163:
            r10.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.l.<init>(pg.e, pg.g):void");
    }

    public static final class b extends C6647i.c implements q {

        /* renamed from: d  reason: collision with root package name */
        private int f68186d;

        /* renamed from: e  reason: collision with root package name */
        private List f68187e = Collections.emptyList();

        /* renamed from: f  reason: collision with root package name */
        private List f68188f = Collections.emptyList();

        /* renamed from: g  reason: collision with root package name */
        private List f68189g = Collections.emptyList();

        /* renamed from: h  reason: collision with root package name */
        private t f68190h = t.w();

        /* renamed from: i  reason: collision with root package name */
        private w f68191i = w.u();

        private b() {
            A();
        }

        /* access modifiers changed from: private */
        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f68186d & 1) != 1) {
                this.f68187e = new ArrayList(this.f68187e);
                this.f68186d |= 1;
            }
        }

        private void y() {
            if ((this.f68186d & 2) != 2) {
                this.f68188f = new ArrayList(this.f68188f);
                this.f68186d |= 2;
            }
        }

        private void z() {
            if ((this.f68186d & 4) != 4) {
                this.f68189g = new ArrayList(this.f68189g);
                this.f68186d |= 4;
            }
        }

        /* renamed from: B */
        public b k(l lVar) {
            if (lVar == l.K()) {
                return this;
            }
            if (!lVar.f68179e.isEmpty()) {
                if (this.f68187e.isEmpty()) {
                    this.f68187e = lVar.f68179e;
                    this.f68186d &= -2;
                } else {
                    x();
                    this.f68187e.addAll(lVar.f68179e);
                }
            }
            if (!lVar.f68180f.isEmpty()) {
                if (this.f68188f.isEmpty()) {
                    this.f68188f = lVar.f68180f;
                    this.f68186d &= -3;
                } else {
                    y();
                    this.f68188f.addAll(lVar.f68180f);
                }
            }
            if (!lVar.f68181g.isEmpty()) {
                if (this.f68189g.isEmpty()) {
                    this.f68189g = lVar.f68181g;
                    this.f68186d &= -5;
                } else {
                    z();
                    this.f68189g.addAll(lVar.f68181g);
                }
            }
            if (lVar.X()) {
                D(lVar.V());
            }
            if (lVar.Y()) {
                E(lVar.W());
            }
            q(lVar);
            l(j().b(lVar.f68177c));
            return this;
        }

        /* renamed from: C */
        public b h0(C6643e eVar, C6645g gVar) {
            l lVar;
            l lVar2 = null;
            try {
                l lVar3 = (l) l.f68176m.b(eVar, gVar);
                if (lVar3 != null) {
                    k(lVar3);
                }
                return this;
            } catch (C6649k e10) {
                lVar = (l) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                lVar2 = lVar;
            }
            if (lVar2 != null) {
                k(lVar2);
            }
            throw th;
        }

        public b D(t tVar) {
            if ((this.f68186d & 8) != 8 || this.f68190h == t.w()) {
                this.f68190h = tVar;
            } else {
                this.f68190h = t.E(this.f68190h).k(tVar).p();
            }
            this.f68186d |= 8;
            return this;
        }

        public b E(w wVar) {
            if ((this.f68186d & 16) != 16 || this.f68191i == w.u()) {
                this.f68191i = wVar;
            } else {
                this.f68191i = w.z(this.f68191i).k(wVar).p();
            }
            this.f68186d |= 16;
            return this;
        }

        /* renamed from: s */
        public l f() {
            l t10 = t();
            if (t10.e()) {
                return t10;
            }
            throw C6639a.C1046a.i(t10);
        }

        public l t() {
            l lVar = new l((C6647i.c) this);
            int i10 = this.f68186d;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f68187e = Collections.unmodifiableList(this.f68187e);
                this.f68186d &= -2;
            }
            List unused = lVar.f68179e = this.f68187e;
            if ((this.f68186d & 2) == 2) {
                this.f68188f = Collections.unmodifiableList(this.f68188f);
                this.f68186d &= -3;
            }
            List unused2 = lVar.f68180f = this.f68188f;
            if ((this.f68186d & 4) == 4) {
                this.f68189g = Collections.unmodifiableList(this.f68189g);
                this.f68186d &= -5;
            }
            List unused3 = lVar.f68181g = this.f68189g;
            if ((i10 & 8) != 8) {
                i11 = 0;
            }
            t unused4 = lVar.f68182h = this.f68190h;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            w unused5 = lVar.f68183i = this.f68191i;
            int unused6 = lVar.f68178d = i11;
            return lVar;
        }

        /* renamed from: u */
        public b clone() {
            return w().k(t());
        }

        private void A() {
        }
    }
}
