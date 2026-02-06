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

public final class i extends C6647i.d implements q {

    /* renamed from: v  reason: collision with root package name */
    private static final i f68125v;

    /* renamed from: w  reason: collision with root package name */
    public static r f68126w = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f68127c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68128d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f68129e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f68130f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f68131g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public q f68132h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f68133i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List f68134j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public q f68135k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f68136l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public List f68137m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public List f68138n;

    /* renamed from: o  reason: collision with root package name */
    private int f68139o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public List f68140p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public t f68141q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public List f68142r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public e f68143s;

    /* renamed from: t  reason: collision with root package name */
    private byte f68144t;

    /* renamed from: u  reason: collision with root package name */
    private int f68145u;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public i b(C6643e eVar, C6645g gVar) {
            return new i(eVar, gVar);
        }
    }

    static {
        i iVar = new i(true);
        f68125v = iVar;
        iVar.B0();
    }

    private void B0() {
        this.f68129e = 6;
        this.f68130f = 6;
        this.f68131g = 0;
        this.f68132h = q.X();
        this.f68133i = 0;
        this.f68134j = Collections.emptyList();
        this.f68135k = q.X();
        this.f68136l = 0;
        this.f68137m = Collections.emptyList();
        this.f68138n = Collections.emptyList();
        this.f68140p = Collections.emptyList();
        this.f68141q = t.w();
        this.f68142r = Collections.emptyList();
        this.f68143s = e.u();
    }

    public static b C0() {
        return b.w();
    }

    public static b D0(i iVar) {
        return C0().k(iVar);
    }

    public static i F0(InputStream inputStream, C6645g gVar) {
        return (i) f68126w.c(inputStream, gVar);
    }

    public static i a0() {
        return f68125v;
    }

    public boolean A0() {
        if ((this.f68128d & 128) == 128) {
            return true;
        }
        return false;
    }

    /* renamed from: E0 */
    public b c() {
        return C0();
    }

    /* renamed from: G0 */
    public b g() {
        return D0(this);
    }

    public q V(int i10) {
        return (q) this.f68137m.get(i10);
    }

    public int W() {
        return this.f68137m.size();
    }

    public List X() {
        return this.f68138n;
    }

    public List Y() {
        return this.f68137m;
    }

    public e Z() {
        return this.f68143s;
    }

    public int a() {
        int i10;
        int i11 = this.f68145u;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68128d & 2) == 2) {
            i10 = C6644f.o(1, this.f68130f);
        } else {
            i10 = 0;
        }
        if ((this.f68128d & 4) == 4) {
            i10 += C6644f.o(2, this.f68131g);
        }
        if ((this.f68128d & 8) == 8) {
            i10 += C6644f.r(3, this.f68132h);
        }
        for (int i12 = 0; i12 < this.f68134j.size(); i12++) {
            i10 += C6644f.r(4, (p) this.f68134j.get(i12));
        }
        if ((this.f68128d & 32) == 32) {
            i10 += C6644f.r(5, this.f68135k);
        }
        for (int i13 = 0; i13 < this.f68140p.size(); i13++) {
            i10 += C6644f.r(6, (p) this.f68140p.get(i13));
        }
        if ((this.f68128d & 16) == 16) {
            i10 += C6644f.o(7, this.f68133i);
        }
        if ((this.f68128d & 64) == 64) {
            i10 += C6644f.o(8, this.f68136l);
        }
        if ((this.f68128d & 1) == 1) {
            i10 += C6644f.o(9, this.f68129e);
        }
        for (int i14 = 0; i14 < this.f68137m.size(); i14++) {
            i10 += C6644f.r(10, (p) this.f68137m.get(i14));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f68138n.size(); i16++) {
            i15 += C6644f.p(((Integer) this.f68138n.get(i16)).intValue());
        }
        int i17 = i10 + i15;
        if (!X().isEmpty()) {
            i17 = i17 + 1 + C6644f.p(i15);
        }
        this.f68139o = i15;
        if ((this.f68128d & 128) == 128) {
            i17 += C6644f.r(30, this.f68141q);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f68142r.size(); i19++) {
            i18 += C6644f.p(((Integer) this.f68142r.get(i19)).intValue());
        }
        int size = i17 + i18 + (r0().size() * 2);
        if ((this.f68128d & 256) == 256) {
            size += C6644f.r(32, this.f68143s);
        }
        int t10 = size + t() + this.f68127c.size();
        this.f68145u = t10;
        return t10;
    }

    /* renamed from: b0 */
    public i d() {
        return f68125v;
    }

    public int c0() {
        return this.f68129e;
    }

    public int d0() {
        return this.f68131g;
    }

    public final boolean e() {
        byte b10 = this.f68144t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!u0()) {
            this.f68144t = 0;
            return false;
        } else if (!y0() || i0().e()) {
            for (int i10 = 0; i10 < l0(); i10++) {
                if (!k0(i10).e()) {
                    this.f68144t = 0;
                    return false;
                }
            }
            if (!w0() || f0().e()) {
                for (int i11 = 0; i11 < W(); i11++) {
                    if (!V(i11).e()) {
                        this.f68144t = 0;
                        return false;
                    }
                }
                for (int i12 = 0; i12 < p0(); i12++) {
                    if (!o0(i12).e()) {
                        this.f68144t = 0;
                        return false;
                    }
                }
                if (A0() && !n0().e()) {
                    this.f68144t = 0;
                    return false;
                } else if (s0() && !Z().e()) {
                    this.f68144t = 0;
                    return false;
                } else if (!s()) {
                    this.f68144t = 0;
                    return false;
                } else {
                    this.f68144t = 1;
                    return true;
                }
            } else {
                this.f68144t = 0;
                return false;
            }
        } else {
            this.f68144t = 0;
            return false;
        }
    }

    public int e0() {
        return this.f68130f;
    }

    public q f0() {
        return this.f68135k;
    }

    public int g0() {
        return this.f68136l;
    }

    public void h(C6644f fVar) {
        a();
        C6647i.d.a y10 = y();
        if ((this.f68128d & 2) == 2) {
            fVar.Z(1, this.f68130f);
        }
        if ((this.f68128d & 4) == 4) {
            fVar.Z(2, this.f68131g);
        }
        if ((this.f68128d & 8) == 8) {
            fVar.c0(3, this.f68132h);
        }
        for (int i10 = 0; i10 < this.f68134j.size(); i10++) {
            fVar.c0(4, (p) this.f68134j.get(i10));
        }
        if ((this.f68128d & 32) == 32) {
            fVar.c0(5, this.f68135k);
        }
        for (int i11 = 0; i11 < this.f68140p.size(); i11++) {
            fVar.c0(6, (p) this.f68140p.get(i11));
        }
        if ((this.f68128d & 16) == 16) {
            fVar.Z(7, this.f68133i);
        }
        if ((this.f68128d & 64) == 64) {
            fVar.Z(8, this.f68136l);
        }
        if ((this.f68128d & 1) == 1) {
            fVar.Z(9, this.f68129e);
        }
        for (int i12 = 0; i12 < this.f68137m.size(); i12++) {
            fVar.c0(10, (p) this.f68137m.get(i12));
        }
        if (X().size() > 0) {
            fVar.n0(90);
            fVar.n0(this.f68139o);
        }
        for (int i13 = 0; i13 < this.f68138n.size(); i13++) {
            fVar.a0(((Integer) this.f68138n.get(i13)).intValue());
        }
        if ((this.f68128d & 128) == 128) {
            fVar.c0(30, this.f68141q);
        }
        for (int i14 = 0; i14 < this.f68142r.size(); i14++) {
            fVar.Z(31, ((Integer) this.f68142r.get(i14)).intValue());
        }
        if ((this.f68128d & 256) == 256) {
            fVar.c0(32, this.f68143s);
        }
        y10.a(19000, fVar);
        fVar.h0(this.f68127c);
    }

    public q i0() {
        return this.f68132h;
    }

    public int j0() {
        return this.f68133i;
    }

    public s k0(int i10) {
        return (s) this.f68134j.get(i10);
    }

    public int l0() {
        return this.f68134j.size();
    }

    public List m0() {
        return this.f68134j;
    }

    public t n0() {
        return this.f68141q;
    }

    public u o0(int i10) {
        return (u) this.f68140p.get(i10);
    }

    public int p0() {
        return this.f68140p.size();
    }

    public List q0() {
        return this.f68140p;
    }

    public List r0() {
        return this.f68142r;
    }

    public boolean s0() {
        if ((this.f68128d & 256) == 256) {
            return true;
        }
        return false;
    }

    public boolean t0() {
        if ((this.f68128d & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean u0() {
        if ((this.f68128d & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean v0() {
        if ((this.f68128d & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean w0() {
        if ((this.f68128d & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean x0() {
        if ((this.f68128d & 64) == 64) {
            return true;
        }
        return false;
    }

    public boolean y0() {
        if ((this.f68128d & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean z0() {
        if ((this.f68128d & 16) == 16) {
            return true;
        }
        return false;
    }

    private i(C6647i.c cVar) {
        super(cVar);
        this.f68139o = -1;
        this.f68144t = -1;
        this.f68145u = -1;
        this.f68127c = cVar.j();
    }

    private i(boolean z10) {
        this.f68139o = -1;
        this.f68144t = -1;
        this.f68145u = -1;
        this.f68127c = C6642d.f72492a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: ig.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: ig.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: ig.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: ig.e$b} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v29 */
    /* JADX WARNING: type inference failed for: r11v30 */
    /* JADX WARNING: type inference failed for: r11v31 */
    /* JADX WARNING: type inference failed for: r11v32 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private i(pg.C6643e r14, pg.C6645g r15) {
        /*
            r13 = this;
            r13.<init>()
            r0 = -1
            r13.f68139o = r0
            r13.f68144t = r0
            r13.f68145u = r0
            r13.B0()
            pg.d$b r0 = pg.C6642d.x()
            r1 = 1
            pg.f r2 = pg.C6644f.I(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0018:
            r5 = 1024(0x400, float:1.435E-42)
            r6 = 32
            r7 = 512(0x200, float:7.175E-43)
            r8 = 4096(0x1000, float:5.74E-42)
            r9 = 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0273
            int r10 = r14.J()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11 = 0
            switch(r10) {
                case 0: goto L_0x0032;
                case 8: goto L_0x0200;
                case 16: goto L_0x01f2;
                case 26: goto L_0x01c9;
                case 34: goto L_0x01af;
                case 42: goto L_0x0188;
                case 50: goto L_0x016e;
                case 56: goto L_0x0160;
                case 64: goto L_0x0152;
                case 72: goto L_0x0145;
                case 82: goto L_0x012b;
                case 88: goto L_0x010f;
                case 90: goto L_0x00db;
                case 242: goto L_0x00b2;
                case 248: goto L_0x0096;
                case 250: goto L_0x0063;
                case 258: goto L_0x003d;
                default: goto L_0x002c;
            }     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x002c:
            boolean r5 = r13.p(r14, r2, r15, r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r5 != 0) goto L_0x0018
        L_0x0032:
            r3 = r1
            goto L_0x0018
        L_0x0034:
            r14 = move-exception
            goto L_0x0221
        L_0x0037:
            r14 = move-exception
            goto L_0x020e
        L_0x003a:
            r14 = move-exception
            goto L_0x021c
        L_0x003d:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 & r9
            if (r10 != r9) goto L_0x0048
            ig.e r10 = r13.f68143s     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.e$b r11 = r10.g()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x0048:
            pg.r r10 = ig.e.f68055g     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            pg.p r10 = r14.t(r10, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.e r10 = (ig.e) r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68143s = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 == 0) goto L_0x005d
            r11.k(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.e r10 = r11.p()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68143s = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x005d:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | r9
            r13.f68128d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0063:
            int r10 = r14.z()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.i(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11 = r4 & 4096(0x1000, float:5.74E-42)
            if (r11 == r8) goto L_0x007e
            int r11 = r14.e()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 <= 0) goto L_0x007e
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68142r = r11     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
        L_0x007e:
            int r11 = r14.e()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 <= 0) goto L_0x0092
            java.util.List r11 = r13.f68142r     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r12 = r14.r()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11.add(r12)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x007e
        L_0x0092:
            r14.h(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0096:
            r10 = r4 & 4096(0x1000, float:5.74E-42)
            if (r10 == r8) goto L_0x00a3
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68142r = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
        L_0x00a3:
            java.util.List r10 = r13.f68142r     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r11 = r14.r()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.add(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x00b2:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r12 = 128(0x80, float:1.794E-43)
            r10 = r10 & r12
            if (r10 != r12) goto L_0x00bf
            ig.t r10 = r13.f68141q     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.t$b r11 = r10.g()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x00bf:
            pg.r r10 = ig.t.f68385i     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            pg.p r10 = r14.t(r10, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.t r10 = (ig.t) r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68141q = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 == 0) goto L_0x00d4
            r11.k(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.t r10 = r11.p()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68141q = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x00d4:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | r12
            r13.f68128d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x00db:
            int r10 = r14.z()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.i(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11 = r4 & 512(0x200, float:7.175E-43)
            if (r11 == r7) goto L_0x00f6
            int r11 = r14.e()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 <= 0) goto L_0x00f6
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68138n = r11     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x00f6:
            int r11 = r14.e()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 <= 0) goto L_0x010a
            java.util.List r11 = r13.f68138n     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r12 = r14.r()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11.add(r12)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x00f6
        L_0x010a:
            r14.h(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x010f:
            r10 = r4 & 512(0x200, float:7.175E-43)
            if (r10 == r7) goto L_0x011c
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68138n = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x011c:
            java.util.List r10 = r13.f68138n     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r11 = r14.r()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.add(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x012b:
            r10 = r4 & 256(0x100, float:3.59E-43)
            if (r10 == r9) goto L_0x0138
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68137m = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 256(0x100, float:3.59E-43)
        L_0x0138:
            java.util.List r10 = r13.f68137m     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            pg.r r11 = ig.q.f68279v     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            pg.p r11 = r14.t(r11, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.add(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0145:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | r1
            r13.f68128d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.r()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68129e = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0152:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | 64
            r13.f68128d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.r()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68136l = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0160:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | 16
            r13.f68128d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.r()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68133i = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x016e:
            r10 = r4 & 1024(0x400, float:1.435E-42)
            if (r10 == r5) goto L_0x017b
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68140p = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 1024(0x400, float:1.435E-42)
        L_0x017b:
            java.util.List r10 = r13.f68140p     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            pg.r r11 = ig.u.f68396n     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            pg.p r11 = r14.t(r11, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.add(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0188:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 & r6
            if (r10 != r6) goto L_0x0193
            ig.q r10 = r13.f68135k     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.q$c r11 = r10.g()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x0193:
            pg.r r10 = ig.q.f68279v     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            pg.p r10 = r14.t(r10, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.q r10 = (ig.q) r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68135k = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 == 0) goto L_0x01a8
            r11.k(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.q r10 = r11.t()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68135k = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x01a8:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | r6
            r13.f68128d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x01af:
            r10 = r4 & 32
            if (r10 == r6) goto L_0x01bc
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68134j = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 32
        L_0x01bc:
            java.util.List r10 = r13.f68134j     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            pg.r r11 = ig.s.f68359o     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            pg.p r11 = r14.t(r11, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.add(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x01c9:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r12 = 8
            r10 = r10 & r12
            if (r10 != r12) goto L_0x01d6
            ig.q r10 = r13.f68132h     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.q$c r11 = r10.g()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x01d6:
            pg.r r10 = ig.q.f68279v     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            pg.p r10 = r14.t(r10, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.q r10 = (ig.q) r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68132h = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 == 0) goto L_0x01eb
            r11.k(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            ig.q r10 = r11.t()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68132h = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x01eb:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | r12
            r13.f68128d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x01f2:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | 4
            r13.f68128d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.r()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68131g = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0200:
            int r10 = r13.f68128d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | 2
            r13.f68128d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.r()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f68130f = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x020e:
            pg.k r15 = new pg.k     // Catch:{ all -> 0x0034 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x0034 }
            r15.<init>(r14)     // Catch:{ all -> 0x0034 }
            pg.k r14 = r15.i(r13)     // Catch:{ all -> 0x0034 }
            throw r14     // Catch:{ all -> 0x0034 }
        L_0x021c:
            pg.k r14 = r14.i(r13)     // Catch:{ all -> 0x0034 }
            throw r14     // Catch:{ all -> 0x0034 }
        L_0x0221:
            r15 = r4 & 32
            if (r15 != r6) goto L_0x022d
            java.util.List r15 = r13.f68134j
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.f68134j = r15
        L_0x022d:
            r15 = r4 & 1024(0x400, float:1.435E-42)
            if (r15 != r5) goto L_0x0239
            java.util.List r15 = r13.f68140p
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.f68140p = r15
        L_0x0239:
            r15 = r4 & 256(0x100, float:3.59E-43)
            if (r15 != r9) goto L_0x0245
            java.util.List r15 = r13.f68137m
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.f68137m = r15
        L_0x0245:
            r15 = r4 & 512(0x200, float:7.175E-43)
            if (r15 != r7) goto L_0x0251
            java.util.List r15 = r13.f68138n
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.f68138n = r15
        L_0x0251:
            r15 = r4 & 4096(0x1000, float:5.74E-42)
            if (r15 != r8) goto L_0x025d
            java.util.List r15 = r13.f68142r
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.f68142r = r15
        L_0x025d:
            r2.H()     // Catch:{ IOException -> 0x0260, all -> 0x0267 }
        L_0x0260:
            pg.d r15 = r0.n()
            r13.f68127c = r15
            goto L_0x026f
        L_0x0267:
            r14 = move-exception
            pg.d r15 = r0.n()
            r13.f68127c = r15
            throw r14
        L_0x026f:
            r13.m()
            throw r14
        L_0x0273:
            r14 = r4 & 32
            if (r14 != r6) goto L_0x027f
            java.util.List r14 = r13.f68134j
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.f68134j = r14
        L_0x027f:
            r14 = r4 & 1024(0x400, float:1.435E-42)
            if (r14 != r5) goto L_0x028b
            java.util.List r14 = r13.f68140p
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.f68140p = r14
        L_0x028b:
            r14 = r4 & 256(0x100, float:3.59E-43)
            if (r14 != r9) goto L_0x0297
            java.util.List r14 = r13.f68137m
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.f68137m = r14
        L_0x0297:
            r14 = r4 & 512(0x200, float:7.175E-43)
            if (r14 != r7) goto L_0x02a3
            java.util.List r14 = r13.f68138n
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.f68138n = r14
        L_0x02a3:
            r14 = r4 & 4096(0x1000, float:5.74E-42)
            if (r14 != r8) goto L_0x02af
            java.util.List r14 = r13.f68142r
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.f68142r = r14
        L_0x02af:
            r2.H()     // Catch:{ IOException -> 0x02b2, all -> 0x02b9 }
        L_0x02b2:
            pg.d r14 = r0.n()
            r13.f68127c = r14
            goto L_0x02c1
        L_0x02b9:
            r14 = move-exception
            pg.d r15 = r0.n()
            r13.f68127c = r15
            throw r14
        L_0x02c1:
            r13.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.i.<init>(pg.e, pg.g):void");
    }

    public static final class b extends C6647i.c implements q {

        /* renamed from: d  reason: collision with root package name */
        private int f68146d;

        /* renamed from: e  reason: collision with root package name */
        private int f68147e = 6;

        /* renamed from: f  reason: collision with root package name */
        private int f68148f = 6;

        /* renamed from: g  reason: collision with root package name */
        private int f68149g;

        /* renamed from: h  reason: collision with root package name */
        private q f68150h = q.X();

        /* renamed from: i  reason: collision with root package name */
        private int f68151i;

        /* renamed from: j  reason: collision with root package name */
        private List f68152j = Collections.emptyList();

        /* renamed from: k  reason: collision with root package name */
        private q f68153k = q.X();

        /* renamed from: l  reason: collision with root package name */
        private int f68154l;

        /* renamed from: m  reason: collision with root package name */
        private List f68155m = Collections.emptyList();

        /* renamed from: n  reason: collision with root package name */
        private List f68156n = Collections.emptyList();

        /* renamed from: o  reason: collision with root package name */
        private List f68157o = Collections.emptyList();

        /* renamed from: p  reason: collision with root package name */
        private t f68158p = t.w();

        /* renamed from: q  reason: collision with root package name */
        private List f68159q = Collections.emptyList();

        /* renamed from: r  reason: collision with root package name */
        private e f68160r = e.u();

        private b() {
            C();
        }

        private void A() {
            if ((this.f68146d & 1024) != 1024) {
                this.f68157o = new ArrayList(this.f68157o);
                this.f68146d |= 1024;
            }
        }

        private void B() {
            if ((this.f68146d & 4096) != 4096) {
                this.f68159q = new ArrayList(this.f68159q);
                this.f68146d |= 4096;
            }
        }

        /* access modifiers changed from: private */
        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f68146d & 512) != 512) {
                this.f68156n = new ArrayList(this.f68156n);
                this.f68146d |= 512;
            }
        }

        private void y() {
            if ((this.f68146d & 256) != 256) {
                this.f68155m = new ArrayList(this.f68155m);
                this.f68146d |= 256;
            }
        }

        private void z() {
            if ((this.f68146d & 32) != 32) {
                this.f68152j = new ArrayList(this.f68152j);
                this.f68146d |= 32;
            }
        }

        public b D(e eVar) {
            if ((this.f68146d & 8192) != 8192 || this.f68160r == e.u()) {
                this.f68160r = eVar;
            } else {
                this.f68160r = e.z(this.f68160r).k(eVar).p();
            }
            this.f68146d |= 8192;
            return this;
        }

        /* renamed from: E */
        public b k(i iVar) {
            if (iVar == i.a0()) {
                return this;
            }
            if (iVar.t0()) {
                J(iVar.c0());
            }
            if (iVar.v0()) {
                L(iVar.e0());
            }
            if (iVar.u0()) {
                K(iVar.d0());
            }
            if (iVar.y0()) {
                H(iVar.i0());
            }
            if (iVar.z0()) {
                N(iVar.j0());
            }
            if (!iVar.f68134j.isEmpty()) {
                if (this.f68152j.isEmpty()) {
                    this.f68152j = iVar.f68134j;
                    this.f68146d &= -33;
                } else {
                    z();
                    this.f68152j.addAll(iVar.f68134j);
                }
            }
            if (iVar.w0()) {
                G(iVar.f0());
            }
            if (iVar.x0()) {
                M(iVar.g0());
            }
            if (!iVar.f68137m.isEmpty()) {
                if (this.f68155m.isEmpty()) {
                    this.f68155m = iVar.f68137m;
                    this.f68146d &= -257;
                } else {
                    y();
                    this.f68155m.addAll(iVar.f68137m);
                }
            }
            if (!iVar.f68138n.isEmpty()) {
                if (this.f68156n.isEmpty()) {
                    this.f68156n = iVar.f68138n;
                    this.f68146d &= -513;
                } else {
                    x();
                    this.f68156n.addAll(iVar.f68138n);
                }
            }
            if (!iVar.f68140p.isEmpty()) {
                if (this.f68157o.isEmpty()) {
                    this.f68157o = iVar.f68140p;
                    this.f68146d &= -1025;
                } else {
                    A();
                    this.f68157o.addAll(iVar.f68140p);
                }
            }
            if (iVar.A0()) {
                I(iVar.n0());
            }
            if (!iVar.f68142r.isEmpty()) {
                if (this.f68159q.isEmpty()) {
                    this.f68159q = iVar.f68142r;
                    this.f68146d &= -4097;
                } else {
                    B();
                    this.f68159q.addAll(iVar.f68142r);
                }
            }
            if (iVar.s0()) {
                D(iVar.Z());
            }
            q(iVar);
            l(j().b(iVar.f68127c));
            return this;
        }

        /* renamed from: F */
        public b h0(C6643e eVar, C6645g gVar) {
            i iVar;
            i iVar2 = null;
            try {
                i iVar3 = (i) i.f68126w.b(eVar, gVar);
                if (iVar3 != null) {
                    k(iVar3);
                }
                return this;
            } catch (C6649k e10) {
                iVar = (i) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                iVar2 = iVar;
            }
            if (iVar2 != null) {
                k(iVar2);
            }
            throw th;
        }

        public b G(q qVar) {
            if ((this.f68146d & 64) != 64 || this.f68153k == q.X()) {
                this.f68153k = qVar;
            } else {
                this.f68153k = q.z0(this.f68153k).k(qVar).t();
            }
            this.f68146d |= 64;
            return this;
        }

        public b H(q qVar) {
            if ((this.f68146d & 8) != 8 || this.f68150h == q.X()) {
                this.f68150h = qVar;
            } else {
                this.f68150h = q.z0(this.f68150h).k(qVar).t();
            }
            this.f68146d |= 8;
            return this;
        }

        public b I(t tVar) {
            if ((this.f68146d & 2048) != 2048 || this.f68158p == t.w()) {
                this.f68158p = tVar;
            } else {
                this.f68158p = t.E(this.f68158p).k(tVar).p();
            }
            this.f68146d |= 2048;
            return this;
        }

        public b J(int i10) {
            this.f68146d |= 1;
            this.f68147e = i10;
            return this;
        }

        public b K(int i10) {
            this.f68146d |= 4;
            this.f68149g = i10;
            return this;
        }

        public b L(int i10) {
            this.f68146d |= 2;
            this.f68148f = i10;
            return this;
        }

        public b M(int i10) {
            this.f68146d |= 128;
            this.f68154l = i10;
            return this;
        }

        public b N(int i10) {
            this.f68146d |= 16;
            this.f68151i = i10;
            return this;
        }

        /* renamed from: s */
        public i f() {
            i t10 = t();
            if (t10.e()) {
                return t10;
            }
            throw C6639a.C1046a.i(t10);
        }

        public i t() {
            i iVar = new i((C6647i.c) this);
            int i10 = this.f68146d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = iVar.f68129e = this.f68147e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = iVar.f68130f = this.f68148f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            int unused3 = iVar.f68131g = this.f68149g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            q unused4 = iVar.f68132h = this.f68150h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            int unused5 = iVar.f68133i = this.f68151i;
            if ((this.f68146d & 32) == 32) {
                this.f68152j = Collections.unmodifiableList(this.f68152j);
                this.f68146d &= -33;
            }
            List unused6 = iVar.f68134j = this.f68152j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            q unused7 = iVar.f68135k = this.f68153k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            int unused8 = iVar.f68136l = this.f68154l;
            if ((this.f68146d & 256) == 256) {
                this.f68155m = Collections.unmodifiableList(this.f68155m);
                this.f68146d &= -257;
            }
            List unused9 = iVar.f68137m = this.f68155m;
            if ((this.f68146d & 512) == 512) {
                this.f68156n = Collections.unmodifiableList(this.f68156n);
                this.f68146d &= -513;
            }
            List unused10 = iVar.f68138n = this.f68156n;
            if ((this.f68146d & 1024) == 1024) {
                this.f68157o = Collections.unmodifiableList(this.f68157o);
                this.f68146d &= -1025;
            }
            List unused11 = iVar.f68140p = this.f68157o;
            if ((i10 & 2048) == 2048) {
                i11 |= 128;
            }
            t unused12 = iVar.f68141q = this.f68158p;
            if ((this.f68146d & 4096) == 4096) {
                this.f68159q = Collections.unmodifiableList(this.f68159q);
                this.f68146d &= -4097;
            }
            List unused13 = iVar.f68142r = this.f68159q;
            if ((i10 & 8192) == 8192) {
                i11 |= 256;
            }
            e unused14 = iVar.f68143s = this.f68160r;
            int unused15 = iVar.f68128d = i11;
            return iVar;
        }

        /* renamed from: u */
        public b clone() {
            return w().k(t());
        }

        private void C() {
        }
    }
}
