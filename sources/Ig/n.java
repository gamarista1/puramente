package ig;

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

public final class n extends C6647i.d implements q {

    /* renamed from: v  reason: collision with root package name */
    private static final n f68207v;

    /* renamed from: w  reason: collision with root package name */
    public static r f68208w = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f68209c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68210d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f68211e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f68212f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f68213g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public q f68214h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f68215i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List f68216j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public q f68217k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f68218l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public List f68219m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public List f68220n;

    /* renamed from: o  reason: collision with root package name */
    private int f68221o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public u f68222p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public int f68223q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public int f68224r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public List f68225s;

    /* renamed from: t  reason: collision with root package name */
    private byte f68226t;

    /* renamed from: u  reason: collision with root package name */
    private int f68227u;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public n b(C6643e eVar, C6645g gVar) {
            return new n(eVar, gVar);
        }
    }

    static {
        n nVar = new n(true);
        f68207v = nVar;
        nVar.z0();
    }

    public static b A0() {
        return b.w();
    }

    public static b B0(n nVar) {
        return A0().k(nVar);
    }

    public static n Y() {
        return f68207v;
    }

    private void z0() {
        this.f68211e = 518;
        this.f68212f = 2054;
        this.f68213g = 0;
        this.f68214h = q.X();
        this.f68215i = 0;
        this.f68216j = Collections.emptyList();
        this.f68217k = q.X();
        this.f68218l = 0;
        this.f68219m = Collections.emptyList();
        this.f68220n = Collections.emptyList();
        this.f68222p = u.I();
        this.f68223q = 0;
        this.f68224r = 0;
        this.f68225s = Collections.emptyList();
    }

    /* renamed from: C0 */
    public b c() {
        return A0();
    }

    /* renamed from: D0 */
    public b g() {
        return B0(this);
    }

    public q U(int i10) {
        return (q) this.f68219m.get(i10);
    }

    public int V() {
        return this.f68219m.size();
    }

    public List W() {
        return this.f68220n;
    }

    public List X() {
        return this.f68219m;
    }

    /* renamed from: Z */
    public n d() {
        return f68207v;
    }

    public int a() {
        int i10;
        int i11 = this.f68227u;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68210d & 2) == 2) {
            i10 = C6644f.o(1, this.f68212f);
        } else {
            i10 = 0;
        }
        if ((this.f68210d & 4) == 4) {
            i10 += C6644f.o(2, this.f68213g);
        }
        if ((this.f68210d & 8) == 8) {
            i10 += C6644f.r(3, this.f68214h);
        }
        for (int i12 = 0; i12 < this.f68216j.size(); i12++) {
            i10 += C6644f.r(4, (p) this.f68216j.get(i12));
        }
        if ((this.f68210d & 32) == 32) {
            i10 += C6644f.r(5, this.f68217k);
        }
        if ((this.f68210d & 128) == 128) {
            i10 += C6644f.r(6, this.f68222p);
        }
        if ((this.f68210d & 256) == 256) {
            i10 += C6644f.o(7, this.f68223q);
        }
        if ((this.f68210d & 512) == 512) {
            i10 += C6644f.o(8, this.f68224r);
        }
        if ((this.f68210d & 16) == 16) {
            i10 += C6644f.o(9, this.f68215i);
        }
        if ((this.f68210d & 64) == 64) {
            i10 += C6644f.o(10, this.f68218l);
        }
        if ((this.f68210d & 1) == 1) {
            i10 += C6644f.o(11, this.f68211e);
        }
        for (int i13 = 0; i13 < this.f68219m.size(); i13++) {
            i10 += C6644f.r(12, (p) this.f68219m.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f68220n.size(); i15++) {
            i14 += C6644f.p(((Integer) this.f68220n.get(i15)).intValue());
        }
        int i16 = i10 + i14;
        if (!W().isEmpty()) {
            i16 = i16 + 1 + C6644f.p(i14);
        }
        this.f68221o = i14;
        int i17 = 0;
        for (int i18 = 0; i18 < this.f68225s.size(); i18++) {
            i17 += C6644f.p(((Integer) this.f68225s.get(i18)).intValue());
        }
        int size = i16 + i17 + (o0().size() * 2) + t() + this.f68209c.size();
        this.f68227u = size;
        return size;
    }

    public int a0() {
        return this.f68211e;
    }

    public int b0() {
        return this.f68223q;
    }

    public int c0() {
        return this.f68213g;
    }

    public int d0() {
        return this.f68212f;
    }

    public final boolean e() {
        byte b10 = this.f68226t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!r0()) {
            this.f68226t = 0;
            return false;
        } else if (!v0() || g0().e()) {
            for (int i10 = 0; i10 < m0(); i10++) {
                if (!l0(i10).e()) {
                    this.f68226t = 0;
                    return false;
                }
            }
            if (!t0() || e0().e()) {
                for (int i11 = 0; i11 < V(); i11++) {
                    if (!U(i11).e()) {
                        this.f68226t = 0;
                        return false;
                    }
                }
                if (y0() && !k0().e()) {
                    this.f68226t = 0;
                    return false;
                } else if (!s()) {
                    this.f68226t = 0;
                    return false;
                } else {
                    this.f68226t = 1;
                    return true;
                }
            } else {
                this.f68226t = 0;
                return false;
            }
        } else {
            this.f68226t = 0;
            return false;
        }
    }

    public q e0() {
        return this.f68217k;
    }

    public int f0() {
        return this.f68218l;
    }

    public q g0() {
        return this.f68214h;
    }

    public void h(C6644f fVar) {
        a();
        C6647i.d.a y10 = y();
        if ((this.f68210d & 2) == 2) {
            fVar.Z(1, this.f68212f);
        }
        if ((this.f68210d & 4) == 4) {
            fVar.Z(2, this.f68213g);
        }
        if ((this.f68210d & 8) == 8) {
            fVar.c0(3, this.f68214h);
        }
        for (int i10 = 0; i10 < this.f68216j.size(); i10++) {
            fVar.c0(4, (p) this.f68216j.get(i10));
        }
        if ((this.f68210d & 32) == 32) {
            fVar.c0(5, this.f68217k);
        }
        if ((this.f68210d & 128) == 128) {
            fVar.c0(6, this.f68222p);
        }
        if ((this.f68210d & 256) == 256) {
            fVar.Z(7, this.f68223q);
        }
        if ((this.f68210d & 512) == 512) {
            fVar.Z(8, this.f68224r);
        }
        if ((this.f68210d & 16) == 16) {
            fVar.Z(9, this.f68215i);
        }
        if ((this.f68210d & 64) == 64) {
            fVar.Z(10, this.f68218l);
        }
        if ((this.f68210d & 1) == 1) {
            fVar.Z(11, this.f68211e);
        }
        for (int i11 = 0; i11 < this.f68219m.size(); i11++) {
            fVar.c0(12, (p) this.f68219m.get(i11));
        }
        if (W().size() > 0) {
            fVar.n0(106);
            fVar.n0(this.f68221o);
        }
        for (int i12 = 0; i12 < this.f68220n.size(); i12++) {
            fVar.a0(((Integer) this.f68220n.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f68225s.size(); i13++) {
            fVar.Z(31, ((Integer) this.f68225s.get(i13)).intValue());
        }
        y10.a(19000, fVar);
        fVar.h0(this.f68209c);
    }

    public int i0() {
        return this.f68215i;
    }

    public int j0() {
        return this.f68224r;
    }

    public u k0() {
        return this.f68222p;
    }

    public s l0(int i10) {
        return (s) this.f68216j.get(i10);
    }

    public int m0() {
        return this.f68216j.size();
    }

    public List n0() {
        return this.f68216j;
    }

    public List o0() {
        return this.f68225s;
    }

    public boolean p0() {
        if ((this.f68210d & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean q0() {
        if ((this.f68210d & 256) == 256) {
            return true;
        }
        return false;
    }

    public boolean r0() {
        if ((this.f68210d & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean s0() {
        if ((this.f68210d & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean t0() {
        if ((this.f68210d & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean u0() {
        if ((this.f68210d & 64) == 64) {
            return true;
        }
        return false;
    }

    public boolean v0() {
        if ((this.f68210d & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean w0() {
        if ((this.f68210d & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean x0() {
        if ((this.f68210d & 512) == 512) {
            return true;
        }
        return false;
    }

    public boolean y0() {
        if ((this.f68210d & 128) == 128) {
            return true;
        }
        return false;
    }

    private n(C6647i.c cVar) {
        super(cVar);
        this.f68221o = -1;
        this.f68226t = -1;
        this.f68227u = -1;
        this.f68209c = cVar.j();
    }

    private n(boolean z10) {
        this.f68221o = -1;
        this.f68226t = -1;
        this.f68227u = -1;
        this.f68209c = C6642d.f72492a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: ig.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: ig.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: ig.u$b} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v25 */
    /* JADX WARNING: type inference failed for: r10v26 */
    /* JADX WARNING: type inference failed for: r10v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private n(pg.C6643e r13, pg.C6645g r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = -1
            r12.f68221o = r0
            r12.f68226t = r0
            r12.f68227u = r0
            r12.z0()
            pg.d$b r0 = pg.C6642d.x()
            r1 = 1
            pg.f r2 = pg.C6644f.I(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0018:
            r5 = 256(0x100, float:3.59E-43)
            r6 = 32
            r7 = 8192(0x2000, float:1.14794E-41)
            r8 = 512(0x200, float:7.175E-43)
            if (r3 != 0) goto L_0x023e
            int r9 = r13.J()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10 = 0
            switch(r9) {
                case 0: goto L_0x0030;
                case 8: goto L_0x01d7;
                case 16: goto L_0x01c9;
                case 26: goto L_0x01a0;
                case 34: goto L_0x0186;
                case 42: goto L_0x015f;
                case 50: goto L_0x0136;
                case 56: goto L_0x0129;
                case 64: goto L_0x011c;
                case 72: goto L_0x010e;
                case 80: goto L_0x0100;
                case 88: goto L_0x00f3;
                case 98: goto L_0x00d9;
                case 104: goto L_0x00bd;
                case 106: goto L_0x0089;
                case 248: goto L_0x006e;
                case 250: goto L_0x003b;
                default: goto L_0x002a;
            }     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x002a:
            boolean r5 = r12.p(r13, r2, r14, r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r5 != 0) goto L_0x0018
        L_0x0030:
            r3 = r1
            goto L_0x0018
        L_0x0032:
            r13 = move-exception
            goto L_0x01f8
        L_0x0035:
            r13 = move-exception
            goto L_0x01e5
        L_0x0038:
            r13 = move-exception
            goto L_0x01f3
        L_0x003b:
            int r9 = r13.z()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.i(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r10 == r7) goto L_0x0056
            int r10 = r13.e()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 <= 0) goto L_0x0056
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68225s = r10     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x0056:
            int r10 = r13.e()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 <= 0) goto L_0x006a
            java.util.List r10 = r12.f68225s     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r11 = r13.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10.add(r11)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0056
        L_0x006a:
            r13.h(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x006e:
            r9 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r9 == r7) goto L_0x007b
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68225s = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x007b:
            java.util.List r9 = r12.f68225s     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r10 = r13.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.add(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x0089:
            int r9 = r13.z()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.i(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10 = r4 & 512(0x200, float:7.175E-43)
            if (r10 == r8) goto L_0x00a4
            int r10 = r13.e()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 <= 0) goto L_0x00a4
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68220n = r10     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x00a4:
            int r10 = r13.e()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 <= 0) goto L_0x00b8
            java.util.List r10 = r12.f68220n     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r11 = r13.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10.add(r11)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x00a4
        L_0x00b8:
            r13.h(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x00bd:
            r9 = r4 & 512(0x200, float:7.175E-43)
            if (r9 == r8) goto L_0x00ca
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68220n = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x00ca:
            java.util.List r9 = r12.f68220n     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r10 = r13.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.add(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x00d9:
            r9 = r4 & 256(0x100, float:3.59E-43)
            if (r9 == r5) goto L_0x00e6
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68219m = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 256(0x100, float:3.59E-43)
        L_0x00e6:
            java.util.List r9 = r12.f68219m     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            pg.r r10 = ig.q.f68279v     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            pg.p r10 = r13.t(r10, r14)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.add(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x00f3:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r1
            r12.f68210d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68211e = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x0100:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | 64
            r12.f68210d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68218l = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x010e:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | 16
            r12.f68210d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68215i = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x011c:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r8
            r12.f68210d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68224r = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x0129:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r5
            r12.f68210d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68223q = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x0136:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r11 = 128(0x80, float:1.794E-43)
            r9 = r9 & r11
            if (r9 != r11) goto L_0x0143
            ig.u r9 = r12.f68222p     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            ig.u$b r10 = r9.g()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x0143:
            pg.r r9 = ig.u.f68396n     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            pg.p r9 = r13.t(r9, r14)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            ig.u r9 = (ig.u) r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68222p = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 == 0) goto L_0x0158
            r10.k(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            ig.u r9 = r10.t()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68222p = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x0158:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r11
            r12.f68210d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x015f:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 & r6
            if (r9 != r6) goto L_0x016a
            ig.q r9 = r12.f68217k     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            ig.q$c r10 = r9.g()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x016a:
            pg.r r9 = ig.q.f68279v     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            pg.p r9 = r13.t(r9, r14)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            ig.q r9 = (ig.q) r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68217k = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 == 0) goto L_0x017f
            r10.k(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            ig.q r9 = r10.t()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68217k = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x017f:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r6
            r12.f68210d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x0186:
            r9 = r4 & 32
            if (r9 == r6) goto L_0x0193
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68216j = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 32
        L_0x0193:
            java.util.List r9 = r12.f68216j     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            pg.r r10 = ig.s.f68359o     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            pg.p r10 = r13.t(r10, r14)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.add(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x01a0:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r11 = 8
            r9 = r9 & r11
            if (r9 != r11) goto L_0x01ad
            ig.q r9 = r12.f68214h     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            ig.q$c r10 = r9.g()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x01ad:
            pg.r r9 = ig.q.f68279v     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            pg.p r9 = r13.t(r9, r14)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            ig.q r9 = (ig.q) r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68214h = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 == 0) goto L_0x01c2
            r10.k(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            ig.q r9 = r10.t()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68214h = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x01c2:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r11
            r12.f68210d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x01c9:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | 4
            r12.f68210d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68213g = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x01d7:
            int r9 = r12.f68210d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | 2
            r12.f68210d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f68212f = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x01e5:
            pg.k r14 = new pg.k     // Catch:{ all -> 0x0032 }
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x0032 }
            r14.<init>(r13)     // Catch:{ all -> 0x0032 }
            pg.k r13 = r14.i(r12)     // Catch:{ all -> 0x0032 }
            throw r13     // Catch:{ all -> 0x0032 }
        L_0x01f3:
            pg.k r13 = r13.i(r12)     // Catch:{ all -> 0x0032 }
            throw r13     // Catch:{ all -> 0x0032 }
        L_0x01f8:
            r14 = r4 & 32
            if (r14 != r6) goto L_0x0204
            java.util.List r14 = r12.f68216j
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f68216j = r14
        L_0x0204:
            r14 = r4 & 256(0x100, float:3.59E-43)
            if (r14 != r5) goto L_0x0210
            java.util.List r14 = r12.f68219m
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f68219m = r14
        L_0x0210:
            r14 = r4 & 512(0x200, float:7.175E-43)
            if (r14 != r8) goto L_0x021c
            java.util.List r14 = r12.f68220n
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f68220n = r14
        L_0x021c:
            r14 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r14 != r7) goto L_0x0228
            java.util.List r14 = r12.f68225s
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f68225s = r14
        L_0x0228:
            r2.H()     // Catch:{ IOException -> 0x022b, all -> 0x0232 }
        L_0x022b:
            pg.d r14 = r0.n()
            r12.f68209c = r14
            goto L_0x023a
        L_0x0232:
            r13 = move-exception
            pg.d r14 = r0.n()
            r12.f68209c = r14
            throw r13
        L_0x023a:
            r12.m()
            throw r13
        L_0x023e:
            r13 = r4 & 32
            if (r13 != r6) goto L_0x024a
            java.util.List r13 = r12.f68216j
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f68216j = r13
        L_0x024a:
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 != r5) goto L_0x0256
            java.util.List r13 = r12.f68219m
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f68219m = r13
        L_0x0256:
            r13 = r4 & 512(0x200, float:7.175E-43)
            if (r13 != r8) goto L_0x0262
            java.util.List r13 = r12.f68220n
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f68220n = r13
        L_0x0262:
            r13 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r13 != r7) goto L_0x026e
            java.util.List r13 = r12.f68225s
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f68225s = r13
        L_0x026e:
            r2.H()     // Catch:{ IOException -> 0x0271, all -> 0x0278 }
        L_0x0271:
            pg.d r13 = r0.n()
            r12.f68209c = r13
            goto L_0x0280
        L_0x0278:
            r13 = move-exception
            pg.d r14 = r0.n()
            r12.f68209c = r14
            throw r13
        L_0x0280:
            r12.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.n.<init>(pg.e, pg.g):void");
    }

    public static final class b extends C6647i.c implements q {

        /* renamed from: d  reason: collision with root package name */
        private int f68228d;

        /* renamed from: e  reason: collision with root package name */
        private int f68229e = 518;

        /* renamed from: f  reason: collision with root package name */
        private int f68230f = 2054;

        /* renamed from: g  reason: collision with root package name */
        private int f68231g;

        /* renamed from: h  reason: collision with root package name */
        private q f68232h = q.X();

        /* renamed from: i  reason: collision with root package name */
        private int f68233i;

        /* renamed from: j  reason: collision with root package name */
        private List f68234j = Collections.emptyList();

        /* renamed from: k  reason: collision with root package name */
        private q f68235k = q.X();

        /* renamed from: l  reason: collision with root package name */
        private int f68236l;

        /* renamed from: m  reason: collision with root package name */
        private List f68237m = Collections.emptyList();

        /* renamed from: n  reason: collision with root package name */
        private List f68238n = Collections.emptyList();

        /* renamed from: o  reason: collision with root package name */
        private u f68239o = u.I();

        /* renamed from: p  reason: collision with root package name */
        private int f68240p;

        /* renamed from: q  reason: collision with root package name */
        private int f68241q;

        /* renamed from: r  reason: collision with root package name */
        private List f68242r = Collections.emptyList();

        private b() {
            B();
        }

        private void A() {
            if ((this.f68228d & 8192) != 8192) {
                this.f68242r = new ArrayList(this.f68242r);
                this.f68228d |= 8192;
            }
        }

        /* access modifiers changed from: private */
        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f68228d & 512) != 512) {
                this.f68238n = new ArrayList(this.f68238n);
                this.f68228d |= 512;
            }
        }

        private void y() {
            if ((this.f68228d & 256) != 256) {
                this.f68237m = new ArrayList(this.f68237m);
                this.f68228d |= 256;
            }
        }

        private void z() {
            if ((this.f68228d & 32) != 32) {
                this.f68234j = new ArrayList(this.f68234j);
                this.f68228d |= 32;
            }
        }

        /* renamed from: C */
        public b k(n nVar) {
            if (nVar == n.Y()) {
                return this;
            }
            if (nVar.p0()) {
                H(nVar.a0());
            }
            if (nVar.s0()) {
                K(nVar.d0());
            }
            if (nVar.r0()) {
                J(nVar.c0());
            }
            if (nVar.v0()) {
                F(nVar.g0());
            }
            if (nVar.w0()) {
                M(nVar.i0());
            }
            if (!nVar.f68216j.isEmpty()) {
                if (this.f68234j.isEmpty()) {
                    this.f68234j = nVar.f68216j;
                    this.f68228d &= -33;
                } else {
                    z();
                    this.f68234j.addAll(nVar.f68216j);
                }
            }
            if (nVar.t0()) {
                E(nVar.e0());
            }
            if (nVar.u0()) {
                L(nVar.f0());
            }
            if (!nVar.f68219m.isEmpty()) {
                if (this.f68237m.isEmpty()) {
                    this.f68237m = nVar.f68219m;
                    this.f68228d &= -257;
                } else {
                    y();
                    this.f68237m.addAll(nVar.f68219m);
                }
            }
            if (!nVar.f68220n.isEmpty()) {
                if (this.f68238n.isEmpty()) {
                    this.f68238n = nVar.f68220n;
                    this.f68228d &= -513;
                } else {
                    x();
                    this.f68238n.addAll(nVar.f68220n);
                }
            }
            if (nVar.y0()) {
                G(nVar.k0());
            }
            if (nVar.q0()) {
                I(nVar.b0());
            }
            if (nVar.x0()) {
                N(nVar.j0());
            }
            if (!nVar.f68225s.isEmpty()) {
                if (this.f68242r.isEmpty()) {
                    this.f68242r = nVar.f68225s;
                    this.f68228d &= -8193;
                } else {
                    A();
                    this.f68242r.addAll(nVar.f68225s);
                }
            }
            q(nVar);
            l(j().b(nVar.f68209c));
            return this;
        }

        /* renamed from: D */
        public b h0(C6643e eVar, C6645g gVar) {
            n nVar;
            n nVar2 = null;
            try {
                n nVar3 = (n) n.f68208w.b(eVar, gVar);
                if (nVar3 != null) {
                    k(nVar3);
                }
                return this;
            } catch (C6649k e10) {
                nVar = (n) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                nVar2 = nVar;
            }
            if (nVar2 != null) {
                k(nVar2);
            }
            throw th;
        }

        public b E(q qVar) {
            if ((this.f68228d & 64) != 64 || this.f68235k == q.X()) {
                this.f68235k = qVar;
            } else {
                this.f68235k = q.z0(this.f68235k).k(qVar).t();
            }
            this.f68228d |= 64;
            return this;
        }

        public b F(q qVar) {
            if ((this.f68228d & 8) != 8 || this.f68232h == q.X()) {
                this.f68232h = qVar;
            } else {
                this.f68232h = q.z0(this.f68232h).k(qVar).t();
            }
            this.f68228d |= 8;
            return this;
        }

        public b G(u uVar) {
            if ((this.f68228d & 1024) != 1024 || this.f68239o == u.I()) {
                this.f68239o = uVar;
            } else {
                this.f68239o = u.Y(this.f68239o).k(uVar).t();
            }
            this.f68228d |= 1024;
            return this;
        }

        public b H(int i10) {
            this.f68228d |= 1;
            this.f68229e = i10;
            return this;
        }

        public b I(int i10) {
            this.f68228d |= 2048;
            this.f68240p = i10;
            return this;
        }

        public b J(int i10) {
            this.f68228d |= 4;
            this.f68231g = i10;
            return this;
        }

        public b K(int i10) {
            this.f68228d |= 2;
            this.f68230f = i10;
            return this;
        }

        public b L(int i10) {
            this.f68228d |= 128;
            this.f68236l = i10;
            return this;
        }

        public b M(int i10) {
            this.f68228d |= 16;
            this.f68233i = i10;
            return this;
        }

        public b N(int i10) {
            this.f68228d |= 4096;
            this.f68241q = i10;
            return this;
        }

        /* renamed from: s */
        public n f() {
            n t10 = t();
            if (t10.e()) {
                return t10;
            }
            throw C6639a.C1046a.i(t10);
        }

        public n t() {
            n nVar = new n((C6647i.c) this);
            int i10 = this.f68228d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = nVar.f68211e = this.f68229e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = nVar.f68212f = this.f68230f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            int unused3 = nVar.f68213g = this.f68231g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            q unused4 = nVar.f68214h = this.f68232h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            int unused5 = nVar.f68215i = this.f68233i;
            if ((this.f68228d & 32) == 32) {
                this.f68234j = Collections.unmodifiableList(this.f68234j);
                this.f68228d &= -33;
            }
            List unused6 = nVar.f68216j = this.f68234j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            q unused7 = nVar.f68217k = this.f68235k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            int unused8 = nVar.f68218l = this.f68236l;
            if ((this.f68228d & 256) == 256) {
                this.f68237m = Collections.unmodifiableList(this.f68237m);
                this.f68228d &= -257;
            }
            List unused9 = nVar.f68219m = this.f68237m;
            if ((this.f68228d & 512) == 512) {
                this.f68238n = Collections.unmodifiableList(this.f68238n);
                this.f68228d &= -513;
            }
            List unused10 = nVar.f68220n = this.f68238n;
            if ((i10 & 1024) == 1024) {
                i11 |= 128;
            }
            u unused11 = nVar.f68222p = this.f68239o;
            if ((i10 & 2048) == 2048) {
                i11 |= 256;
            }
            int unused12 = nVar.f68223q = this.f68240p;
            if ((i10 & 4096) == 4096) {
                i11 |= 512;
            }
            int unused13 = nVar.f68224r = this.f68241q;
            if ((this.f68228d & 8192) == 8192) {
                this.f68242r = Collections.unmodifiableList(this.f68242r);
                this.f68228d &= -8193;
            }
            List unused14 = nVar.f68225s = this.f68242r;
            int unused15 = nVar.f68210d = i11;
            return nVar;
        }

        /* renamed from: u */
        public b clone() {
            return w().k(t());
        }

        private void B() {
        }
    }
}
