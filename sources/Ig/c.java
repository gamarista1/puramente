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
import pg.C6648j;
import pg.C6649k;
import pg.p;
import pg.q;
import pg.r;

public final class c extends C6647i.d implements q {

    /* renamed from: Y  reason: collision with root package name */
    private static final c f67970Y;

    /* renamed from: Z  reason: collision with root package name */
    public static r f67971Z = new a();
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public List f67972A;

    /* renamed from: B  reason: collision with root package name */
    private int f67973B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public List f67974C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public List f67975D;

    /* renamed from: E  reason: collision with root package name */
    private int f67976E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public t f67977F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public List f67978G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public w f67979H;

    /* renamed from: I  reason: collision with root package name */
    private byte f67980I;

    /* renamed from: X  reason: collision with root package name */
    private int f67981X;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f67982c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f67983d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f67984e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f67985f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f67986g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public List f67987h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public List f67988i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List f67989j;

    /* renamed from: k  reason: collision with root package name */
    private int f67990k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public List f67991l;

    /* renamed from: m  reason: collision with root package name */
    private int f67992m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public List f67993n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public List f67994o;

    /* renamed from: p  reason: collision with root package name */
    private int f67995p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public List f67996q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public List f67997r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public List f67998s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public List f67999t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public List f68000u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public List f68001v;

    /* renamed from: w  reason: collision with root package name */
    private int f68002w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public int f68003x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public q f68004y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public int f68005z;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public c b(C6643e eVar, C6645g gVar) {
            return new c(eVar, gVar);
        }
    }

    /* renamed from: ig.c$c  reason: collision with other inner class name */
    public enum C1017c implements C6648j.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        

        /* renamed from: i  reason: collision with root package name */
        private static C6648j.b f68038i;

        /* renamed from: a  reason: collision with root package name */
        private final int f68040a;

        /* renamed from: ig.c$c$a */
        static class a implements C6648j.b {
            a() {
            }

            /* renamed from: b */
            public C1017c a(int i10) {
                return C1017c.a(i10);
            }
        }

        static {
            f68038i = new a();
        }

        private C1017c(int i10, int i11) {
            this.f68040a = i11;
        }

        public static C1017c a(int i10) {
            switch (i10) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        public final int d() {
            return this.f68040a;
        }
    }

    static {
        c cVar = new c(true);
        f67970Y = cVar;
        cVar.t1();
    }

    private void t1() {
        this.f67984e = 6;
        this.f67985f = 0;
        this.f67986g = 0;
        this.f67987h = Collections.emptyList();
        this.f67988i = Collections.emptyList();
        this.f67989j = Collections.emptyList();
        this.f67991l = Collections.emptyList();
        this.f67993n = Collections.emptyList();
        this.f67994o = Collections.emptyList();
        this.f67996q = Collections.emptyList();
        this.f67997r = Collections.emptyList();
        this.f67998s = Collections.emptyList();
        this.f67999t = Collections.emptyList();
        this.f68000u = Collections.emptyList();
        this.f68001v = Collections.emptyList();
        this.f68003x = 0;
        this.f68004y = q.X();
        this.f68005z = 0;
        this.f67972A = Collections.emptyList();
        this.f67974C = Collections.emptyList();
        this.f67975D = Collections.emptyList();
        this.f67977F = t.w();
        this.f67978G = Collections.emptyList();
        this.f67979H = w.u();
    }

    public static b u1() {
        return b.w();
    }

    public static b v1(c cVar) {
        return u1().k(cVar);
    }

    public static c x1(InputStream inputStream, C6645g gVar) {
        return (c) f67971Z.c(inputStream, gVar);
    }

    public static c z0() {
        return f67970Y;
    }

    /* renamed from: A0 */
    public c d() {
        return f67970Y;
    }

    public g B0(int i10) {
        return (g) this.f68000u.get(i10);
    }

    public int C0() {
        return this.f68000u.size();
    }

    public List D0() {
        return this.f68000u;
    }

    public int E0() {
        return this.f67984e;
    }

    public int F0() {
        return this.f67985f;
    }

    public i G0(int i10) {
        return (i) this.f67997r.get(i10);
    }

    public int H0() {
        return this.f67997r.size();
    }

    public List I0() {
        return this.f67997r;
    }

    public int J0() {
        return this.f68003x;
    }

    public q K0() {
        return this.f68004y;
    }

    public int L0() {
        return this.f68005z;
    }

    public int M0() {
        return this.f67972A.size();
    }

    public List N0() {
        return this.f67972A;
    }

    public q O0(int i10) {
        return (q) this.f67974C.get(i10);
    }

    public int P0() {
        return this.f67974C.size();
    }

    public int Q0() {
        return this.f67975D.size();
    }

    public List R0() {
        return this.f67975D;
    }

    public List S0() {
        return this.f67974C;
    }

    public List T0() {
        return this.f67991l;
    }

    public n U0(int i10) {
        return (n) this.f67998s.get(i10);
    }

    public int V0() {
        return this.f67998s.size();
    }

    public List W0() {
        return this.f67998s;
    }

    public List X0() {
        return this.f68001v;
    }

    public q Y0(int i10) {
        return (q) this.f67988i.get(i10);
    }

    public int Z0() {
        return this.f67988i.size();
    }

    public int a() {
        int i10;
        int i11 = this.f67981X;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f67983d & 1) == 1) {
            i10 = C6644f.o(1, this.f67984e);
        } else {
            i10 = 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f67989j.size(); i13++) {
            i12 += C6644f.p(((Integer) this.f67989j.get(i13)).intValue());
        }
        int i14 = i10 + i12;
        if (!a1().isEmpty()) {
            i14 = i14 + 1 + C6644f.p(i12);
        }
        this.f67990k = i12;
        if ((this.f67983d & 2) == 2) {
            i14 += C6644f.o(3, this.f67985f);
        }
        if ((this.f67983d & 4) == 4) {
            i14 += C6644f.o(4, this.f67986g);
        }
        for (int i15 = 0; i15 < this.f67987h.size(); i15++) {
            i14 += C6644f.r(5, (p) this.f67987h.get(i15));
        }
        for (int i16 = 0; i16 < this.f67988i.size(); i16++) {
            i14 += C6644f.r(6, (p) this.f67988i.get(i16));
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f67991l.size(); i18++) {
            i17 += C6644f.p(((Integer) this.f67991l.get(i18)).intValue());
        }
        int i19 = i14 + i17;
        if (!T0().isEmpty()) {
            i19 = i19 + 1 + C6644f.p(i17);
        }
        this.f67992m = i17;
        for (int i20 = 0; i20 < this.f67996q.size(); i20++) {
            i19 += C6644f.r(8, (p) this.f67996q.get(i20));
        }
        for (int i21 = 0; i21 < this.f67997r.size(); i21++) {
            i19 += C6644f.r(9, (p) this.f67997r.get(i21));
        }
        for (int i22 = 0; i22 < this.f67998s.size(); i22++) {
            i19 += C6644f.r(10, (p) this.f67998s.get(i22));
        }
        for (int i23 = 0; i23 < this.f67999t.size(); i23++) {
            i19 += C6644f.r(11, (p) this.f67999t.get(i23));
        }
        for (int i24 = 0; i24 < this.f68000u.size(); i24++) {
            i19 += C6644f.r(13, (p) this.f68000u.get(i24));
        }
        int i25 = 0;
        for (int i26 = 0; i26 < this.f68001v.size(); i26++) {
            i25 += C6644f.p(((Integer) this.f68001v.get(i26)).intValue());
        }
        int i27 = i19 + i25;
        if (!X0().isEmpty()) {
            i27 = i27 + 2 + C6644f.p(i25);
        }
        this.f68002w = i25;
        if ((this.f67983d & 8) == 8) {
            i27 += C6644f.o(17, this.f68003x);
        }
        if ((this.f67983d & 16) == 16) {
            i27 += C6644f.r(18, this.f68004y);
        }
        if ((this.f67983d & 32) == 32) {
            i27 += C6644f.o(19, this.f68005z);
        }
        for (int i28 = 0; i28 < this.f67993n.size(); i28++) {
            i27 += C6644f.r(20, (p) this.f67993n.get(i28));
        }
        int i29 = 0;
        for (int i30 = 0; i30 < this.f67994o.size(); i30++) {
            i29 += C6644f.p(((Integer) this.f67994o.get(i30)).intValue());
        }
        int i31 = i27 + i29;
        if (!x0().isEmpty()) {
            i31 = i31 + 2 + C6644f.p(i29);
        }
        this.f67995p = i29;
        int i32 = 0;
        for (int i33 = 0; i33 < this.f67972A.size(); i33++) {
            i32 += C6644f.p(((Integer) this.f67972A.get(i33)).intValue());
        }
        int i34 = i31 + i32;
        if (!N0().isEmpty()) {
            i34 = i34 + 2 + C6644f.p(i32);
        }
        this.f67973B = i32;
        for (int i35 = 0; i35 < this.f67974C.size(); i35++) {
            i34 += C6644f.r(23, (p) this.f67974C.get(i35));
        }
        int i36 = 0;
        for (int i37 = 0; i37 < this.f67975D.size(); i37++) {
            i36 += C6644f.p(((Integer) this.f67975D.get(i37)).intValue());
        }
        int i38 = i34 + i36;
        if (!R0().isEmpty()) {
            i38 = i38 + 2 + C6644f.p(i36);
        }
        this.f67976E = i36;
        if ((this.f67983d & 64) == 64) {
            i38 += C6644f.r(30, this.f67977F);
        }
        int i39 = 0;
        for (int i40 = 0; i40 < this.f67978G.size(); i40++) {
            i39 += C6644f.p(((Integer) this.f67978G.get(i40)).intValue());
        }
        int size = i38 + i39 + (j1().size() * 2);
        if ((this.f67983d & 128) == 128) {
            size += C6644f.r(32, this.f67979H);
        }
        int t10 = size + t() + this.f67982c.size();
        this.f67981X = t10;
        return t10;
    }

    public List a1() {
        return this.f67989j;
    }

    public List b1() {
        return this.f67988i;
    }

    public r c1(int i10) {
        return (r) this.f67999t.get(i10);
    }

    public int d1() {
        return this.f67999t.size();
    }

    public final boolean e() {
        byte b10 = this.f67980I;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!n1()) {
            this.f67980I = 0;
            return false;
        }
        for (int i10 = 0; i10 < g1(); i10++) {
            if (!f1(i10).e()) {
                this.f67980I = 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < Z0(); i11++) {
            if (!Y0(i11).e()) {
                this.f67980I = 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < w0(); i12++) {
            if (!v0(i12).e()) {
                this.f67980I = 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < t0(); i13++) {
            if (!s0(i13).e()) {
                this.f67980I = 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < H0(); i14++) {
            if (!G0(i14).e()) {
                this.f67980I = 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < V0(); i15++) {
            if (!U0(i15).e()) {
                this.f67980I = 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < d1(); i16++) {
            if (!c1(i16).e()) {
                this.f67980I = 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < C0(); i17++) {
            if (!B0(i17).e()) {
                this.f67980I = 0;
                return false;
            }
        }
        if (!p1() || K0().e()) {
            for (int i18 = 0; i18 < P0(); i18++) {
                if (!O0(i18).e()) {
                    this.f67980I = 0;
                    return false;
                }
            }
            if (r1() && !i1().e()) {
                this.f67980I = 0;
                return false;
            } else if (!s()) {
                this.f67980I = 0;
                return false;
            } else {
                this.f67980I = 1;
                return true;
            }
        } else {
            this.f67980I = 0;
            return false;
        }
    }

    public List e1() {
        return this.f67999t;
    }

    public s f1(int i10) {
        return (s) this.f67987h.get(i10);
    }

    public int g1() {
        return this.f67987h.size();
    }

    public void h(C6644f fVar) {
        a();
        C6647i.d.a y10 = y();
        if ((this.f67983d & 1) == 1) {
            fVar.Z(1, this.f67984e);
        }
        if (a1().size() > 0) {
            fVar.n0(18);
            fVar.n0(this.f67990k);
        }
        for (int i10 = 0; i10 < this.f67989j.size(); i10++) {
            fVar.a0(((Integer) this.f67989j.get(i10)).intValue());
        }
        if ((this.f67983d & 2) == 2) {
            fVar.Z(3, this.f67985f);
        }
        if ((this.f67983d & 4) == 4) {
            fVar.Z(4, this.f67986g);
        }
        for (int i11 = 0; i11 < this.f67987h.size(); i11++) {
            fVar.c0(5, (p) this.f67987h.get(i11));
        }
        for (int i12 = 0; i12 < this.f67988i.size(); i12++) {
            fVar.c0(6, (p) this.f67988i.get(i12));
        }
        if (T0().size() > 0) {
            fVar.n0(58);
            fVar.n0(this.f67992m);
        }
        for (int i13 = 0; i13 < this.f67991l.size(); i13++) {
            fVar.a0(((Integer) this.f67991l.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.f67996q.size(); i14++) {
            fVar.c0(8, (p) this.f67996q.get(i14));
        }
        for (int i15 = 0; i15 < this.f67997r.size(); i15++) {
            fVar.c0(9, (p) this.f67997r.get(i15));
        }
        for (int i16 = 0; i16 < this.f67998s.size(); i16++) {
            fVar.c0(10, (p) this.f67998s.get(i16));
        }
        for (int i17 = 0; i17 < this.f67999t.size(); i17++) {
            fVar.c0(11, (p) this.f67999t.get(i17));
        }
        for (int i18 = 0; i18 < this.f68000u.size(); i18++) {
            fVar.c0(13, (p) this.f68000u.get(i18));
        }
        if (X0().size() > 0) {
            fVar.n0(130);
            fVar.n0(this.f68002w);
        }
        for (int i19 = 0; i19 < this.f68001v.size(); i19++) {
            fVar.a0(((Integer) this.f68001v.get(i19)).intValue());
        }
        if ((this.f67983d & 8) == 8) {
            fVar.Z(17, this.f68003x);
        }
        if ((this.f67983d & 16) == 16) {
            fVar.c0(18, this.f68004y);
        }
        if ((this.f67983d & 32) == 32) {
            fVar.Z(19, this.f68005z);
        }
        for (int i20 = 0; i20 < this.f67993n.size(); i20++) {
            fVar.c0(20, (p) this.f67993n.get(i20));
        }
        if (x0().size() > 0) {
            fVar.n0(170);
            fVar.n0(this.f67995p);
        }
        for (int i21 = 0; i21 < this.f67994o.size(); i21++) {
            fVar.a0(((Integer) this.f67994o.get(i21)).intValue());
        }
        if (N0().size() > 0) {
            fVar.n0(178);
            fVar.n0(this.f67973B);
        }
        for (int i22 = 0; i22 < this.f67972A.size(); i22++) {
            fVar.a0(((Integer) this.f67972A.get(i22)).intValue());
        }
        for (int i23 = 0; i23 < this.f67974C.size(); i23++) {
            fVar.c0(23, (p) this.f67974C.get(i23));
        }
        if (R0().size() > 0) {
            fVar.n0(194);
            fVar.n0(this.f67976E);
        }
        for (int i24 = 0; i24 < this.f67975D.size(); i24++) {
            fVar.a0(((Integer) this.f67975D.get(i24)).intValue());
        }
        if ((this.f67983d & 64) == 64) {
            fVar.c0(30, this.f67977F);
        }
        for (int i25 = 0; i25 < this.f67978G.size(); i25++) {
            fVar.Z(31, ((Integer) this.f67978G.get(i25)).intValue());
        }
        if ((this.f67983d & 128) == 128) {
            fVar.c0(32, this.f67979H);
        }
        y10.a(19000, fVar);
        fVar.h0(this.f67982c);
    }

    public List h1() {
        return this.f67987h;
    }

    public t i1() {
        return this.f67977F;
    }

    public List j1() {
        return this.f67978G;
    }

    public w k1() {
        return this.f67979H;
    }

    public boolean l1() {
        if ((this.f67983d & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean m1() {
        if ((this.f67983d & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean n1() {
        if ((this.f67983d & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean o1() {
        if ((this.f67983d & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean p1() {
        if ((this.f67983d & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean q1() {
        if ((this.f67983d & 32) == 32) {
            return true;
        }
        return false;
    }

    public int r0() {
        return this.f67986g;
    }

    public boolean r1() {
        if ((this.f67983d & 64) == 64) {
            return true;
        }
        return false;
    }

    public d s0(int i10) {
        return (d) this.f67996q.get(i10);
    }

    public boolean s1() {
        if ((this.f67983d & 128) == 128) {
            return true;
        }
        return false;
    }

    public int t0() {
        return this.f67996q.size();
    }

    public List u0() {
        return this.f67996q;
    }

    public q v0(int i10) {
        return (q) this.f67993n.get(i10);
    }

    public int w0() {
        return this.f67993n.size();
    }

    /* renamed from: w1 */
    public b c() {
        return u1();
    }

    public List x0() {
        return this.f67994o;
    }

    public List y0() {
        return this.f67993n;
    }

    /* renamed from: y1 */
    public b g() {
        return v1(this);
    }

    private c(C6647i.c cVar) {
        super(cVar);
        this.f67990k = -1;
        this.f67992m = -1;
        this.f67995p = -1;
        this.f68002w = -1;
        this.f67973B = -1;
        this.f67976E = -1;
        this.f67980I = -1;
        this.f67981X = -1;
        this.f67982c = cVar.j();
    }

    private c(boolean z10) {
        this.f67990k = -1;
        this.f67992m = -1;
        this.f67995p = -1;
        this.f68002w = -1;
        this.f67973B = -1;
        this.f67976E = -1;
        this.f67980I = -1;
        this.f67981X = -1;
        this.f67982c = C6642d.f72492a;
    }

    public static final class b extends C6647i.c implements q {

        /* renamed from: A  reason: collision with root package name */
        private List f68006A = Collections.emptyList();

        /* renamed from: B  reason: collision with root package name */
        private w f68007B = w.u();

        /* renamed from: d  reason: collision with root package name */
        private int f68008d;

        /* renamed from: e  reason: collision with root package name */
        private int f68009e = 6;

        /* renamed from: f  reason: collision with root package name */
        private int f68010f;

        /* renamed from: g  reason: collision with root package name */
        private int f68011g;

        /* renamed from: h  reason: collision with root package name */
        private List f68012h = Collections.emptyList();

        /* renamed from: i  reason: collision with root package name */
        private List f68013i = Collections.emptyList();

        /* renamed from: j  reason: collision with root package name */
        private List f68014j = Collections.emptyList();

        /* renamed from: k  reason: collision with root package name */
        private List f68015k = Collections.emptyList();

        /* renamed from: l  reason: collision with root package name */
        private List f68016l = Collections.emptyList();

        /* renamed from: m  reason: collision with root package name */
        private List f68017m = Collections.emptyList();

        /* renamed from: n  reason: collision with root package name */
        private List f68018n = Collections.emptyList();

        /* renamed from: o  reason: collision with root package name */
        private List f68019o = Collections.emptyList();

        /* renamed from: p  reason: collision with root package name */
        private List f68020p = Collections.emptyList();

        /* renamed from: q  reason: collision with root package name */
        private List f68021q = Collections.emptyList();

        /* renamed from: r  reason: collision with root package name */
        private List f68022r = Collections.emptyList();

        /* renamed from: s  reason: collision with root package name */
        private List f68023s = Collections.emptyList();

        /* renamed from: t  reason: collision with root package name */
        private int f68024t;

        /* renamed from: u  reason: collision with root package name */
        private q f68025u = q.X();

        /* renamed from: v  reason: collision with root package name */
        private int f68026v;

        /* renamed from: w  reason: collision with root package name */
        private List f68027w = Collections.emptyList();

        /* renamed from: x  reason: collision with root package name */
        private List f68028x = Collections.emptyList();

        /* renamed from: y  reason: collision with root package name */
        private List f68029y = Collections.emptyList();

        /* renamed from: z  reason: collision with root package name */
        private t f68030z = t.w();

        private b() {
            N();
        }

        private void A() {
            if ((this.f68008d & 8192) != 8192) {
                this.f68022r = new ArrayList(this.f68022r);
                this.f68008d |= 8192;
            }
        }

        private void B() {
            if ((this.f68008d & 1024) != 1024) {
                this.f68019o = new ArrayList(this.f68019o);
                this.f68008d |= 1024;
            }
        }

        private void C() {
            if ((this.f68008d & 262144) != 262144) {
                this.f68027w = new ArrayList(this.f68027w);
                this.f68008d |= 262144;
            }
        }

        private void D() {
            if ((this.f68008d & 1048576) != 1048576) {
                this.f68029y = new ArrayList(this.f68029y);
                this.f68008d |= 1048576;
            }
        }

        private void E() {
            if ((this.f68008d & 524288) != 524288) {
                this.f68028x = new ArrayList(this.f68028x);
                this.f68008d |= 524288;
            }
        }

        private void F() {
            if ((this.f68008d & 64) != 64) {
                this.f68015k = new ArrayList(this.f68015k);
                this.f68008d |= 64;
            }
        }

        private void G() {
            if ((this.f68008d & 2048) != 2048) {
                this.f68020p = new ArrayList(this.f68020p);
                this.f68008d |= 2048;
            }
        }

        private void H() {
            if ((this.f68008d & 16384) != 16384) {
                this.f68023s = new ArrayList(this.f68023s);
                this.f68008d |= 16384;
            }
        }

        private void I() {
            if ((this.f68008d & 32) != 32) {
                this.f68014j = new ArrayList(this.f68014j);
                this.f68008d |= 32;
            }
        }

        private void J() {
            if ((this.f68008d & 16) != 16) {
                this.f68013i = new ArrayList(this.f68013i);
                this.f68008d |= 16;
            }
        }

        private void K() {
            if ((this.f68008d & 4096) != 4096) {
                this.f68021q = new ArrayList(this.f68021q);
                this.f68008d |= 4096;
            }
        }

        private void L() {
            if ((this.f68008d & 8) != 8) {
                this.f68012h = new ArrayList(this.f68012h);
                this.f68008d |= 8;
            }
        }

        private void M() {
            if ((this.f68008d & 4194304) != 4194304) {
                this.f68006A = new ArrayList(this.f68006A);
                this.f68008d |= 4194304;
            }
        }

        /* access modifiers changed from: private */
        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f68008d & 512) != 512) {
                this.f68018n = new ArrayList(this.f68018n);
                this.f68008d |= 512;
            }
        }

        private void y() {
            if ((this.f68008d & 256) != 256) {
                this.f68017m = new ArrayList(this.f68017m);
                this.f68008d |= 256;
            }
        }

        private void z() {
            if ((this.f68008d & 128) != 128) {
                this.f68016l = new ArrayList(this.f68016l);
                this.f68008d |= 128;
            }
        }

        /* renamed from: O */
        public b k(c cVar) {
            if (cVar == c.z0()) {
                return this;
            }
            if (cVar.m1()) {
                U(cVar.E0());
            }
            if (cVar.n1()) {
                V(cVar.F0());
            }
            if (cVar.l1()) {
                T(cVar.r0());
            }
            if (!cVar.f67987h.isEmpty()) {
                if (this.f68012h.isEmpty()) {
                    this.f68012h = cVar.f67987h;
                    this.f68008d &= -9;
                } else {
                    L();
                    this.f68012h.addAll(cVar.f67987h);
                }
            }
            if (!cVar.f67988i.isEmpty()) {
                if (this.f68013i.isEmpty()) {
                    this.f68013i = cVar.f67988i;
                    this.f68008d &= -17;
                } else {
                    J();
                    this.f68013i.addAll(cVar.f67988i);
                }
            }
            if (!cVar.f67989j.isEmpty()) {
                if (this.f68014j.isEmpty()) {
                    this.f68014j = cVar.f67989j;
                    this.f68008d &= -33;
                } else {
                    I();
                    this.f68014j.addAll(cVar.f67989j);
                }
            }
            if (!cVar.f67991l.isEmpty()) {
                if (this.f68015k.isEmpty()) {
                    this.f68015k = cVar.f67991l;
                    this.f68008d &= -65;
                } else {
                    F();
                    this.f68015k.addAll(cVar.f67991l);
                }
            }
            if (!cVar.f67993n.isEmpty()) {
                if (this.f68016l.isEmpty()) {
                    this.f68016l = cVar.f67993n;
                    this.f68008d &= -129;
                } else {
                    z();
                    this.f68016l.addAll(cVar.f67993n);
                }
            }
            if (!cVar.f67994o.isEmpty()) {
                if (this.f68017m.isEmpty()) {
                    this.f68017m = cVar.f67994o;
                    this.f68008d &= -257;
                } else {
                    y();
                    this.f68017m.addAll(cVar.f67994o);
                }
            }
            if (!cVar.f67996q.isEmpty()) {
                if (this.f68018n.isEmpty()) {
                    this.f68018n = cVar.f67996q;
                    this.f68008d &= -513;
                } else {
                    x();
                    this.f68018n.addAll(cVar.f67996q);
                }
            }
            if (!cVar.f67997r.isEmpty()) {
                if (this.f68019o.isEmpty()) {
                    this.f68019o = cVar.f67997r;
                    this.f68008d &= -1025;
                } else {
                    B();
                    this.f68019o.addAll(cVar.f67997r);
                }
            }
            if (!cVar.f67998s.isEmpty()) {
                if (this.f68020p.isEmpty()) {
                    this.f68020p = cVar.f67998s;
                    this.f68008d &= -2049;
                } else {
                    G();
                    this.f68020p.addAll(cVar.f67998s);
                }
            }
            if (!cVar.f67999t.isEmpty()) {
                if (this.f68021q.isEmpty()) {
                    this.f68021q = cVar.f67999t;
                    this.f68008d &= -4097;
                } else {
                    K();
                    this.f68021q.addAll(cVar.f67999t);
                }
            }
            if (!cVar.f68000u.isEmpty()) {
                if (this.f68022r.isEmpty()) {
                    this.f68022r = cVar.f68000u;
                    this.f68008d &= -8193;
                } else {
                    A();
                    this.f68022r.addAll(cVar.f68000u);
                }
            }
            if (!cVar.f68001v.isEmpty()) {
                if (this.f68023s.isEmpty()) {
                    this.f68023s = cVar.f68001v;
                    this.f68008d &= -16385;
                } else {
                    H();
                    this.f68023s.addAll(cVar.f68001v);
                }
            }
            if (cVar.o1()) {
                W(cVar.J0());
            }
            if (cVar.p1()) {
                Q(cVar.K0());
            }
            if (cVar.q1()) {
                X(cVar.L0());
            }
            if (!cVar.f67972A.isEmpty()) {
                if (this.f68027w.isEmpty()) {
                    this.f68027w = cVar.f67972A;
                    this.f68008d &= -262145;
                } else {
                    C();
                    this.f68027w.addAll(cVar.f67972A);
                }
            }
            if (!cVar.f67974C.isEmpty()) {
                if (this.f68028x.isEmpty()) {
                    this.f68028x = cVar.f67974C;
                    this.f68008d &= -524289;
                } else {
                    E();
                    this.f68028x.addAll(cVar.f67974C);
                }
            }
            if (!cVar.f67975D.isEmpty()) {
                if (this.f68029y.isEmpty()) {
                    this.f68029y = cVar.f67975D;
                    this.f68008d &= -1048577;
                } else {
                    D();
                    this.f68029y.addAll(cVar.f67975D);
                }
            }
            if (cVar.r1()) {
                R(cVar.i1());
            }
            if (!cVar.f67978G.isEmpty()) {
                if (this.f68006A.isEmpty()) {
                    this.f68006A = cVar.f67978G;
                    this.f68008d &= -4194305;
                } else {
                    M();
                    this.f68006A.addAll(cVar.f67978G);
                }
            }
            if (cVar.s1()) {
                S(cVar.k1());
            }
            q(cVar);
            l(j().b(cVar.f67982c));
            return this;
        }

        /* renamed from: P */
        public b h0(C6643e eVar, C6645g gVar) {
            c cVar;
            c cVar2 = null;
            try {
                c cVar3 = (c) c.f67971Z.b(eVar, gVar);
                if (cVar3 != null) {
                    k(cVar3);
                }
                return this;
            } catch (C6649k e10) {
                cVar = (c) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                cVar2 = cVar;
            }
            if (cVar2 != null) {
                k(cVar2);
            }
            throw th;
        }

        public b Q(q qVar) {
            if ((this.f68008d & 65536) != 65536 || this.f68025u == q.X()) {
                this.f68025u = qVar;
            } else {
                this.f68025u = q.z0(this.f68025u).k(qVar).t();
            }
            this.f68008d |= 65536;
            return this;
        }

        public b R(t tVar) {
            if ((this.f68008d & 2097152) != 2097152 || this.f68030z == t.w()) {
                this.f68030z = tVar;
            } else {
                this.f68030z = t.E(this.f68030z).k(tVar).p();
            }
            this.f68008d |= 2097152;
            return this;
        }

        public b S(w wVar) {
            if ((this.f68008d & 8388608) != 8388608 || this.f68007B == w.u()) {
                this.f68007B = wVar;
            } else {
                this.f68007B = w.z(this.f68007B).k(wVar).p();
            }
            this.f68008d |= 8388608;
            return this;
        }

        public b T(int i10) {
            this.f68008d |= 4;
            this.f68011g = i10;
            return this;
        }

        public b U(int i10) {
            this.f68008d |= 1;
            this.f68009e = i10;
            return this;
        }

        public b V(int i10) {
            this.f68008d |= 2;
            this.f68010f = i10;
            return this;
        }

        public b W(int i10) {
            this.f68008d |= 32768;
            this.f68024t = i10;
            return this;
        }

        public b X(int i10) {
            this.f68008d |= 131072;
            this.f68026v = i10;
            return this;
        }

        /* renamed from: s */
        public c f() {
            c t10 = t();
            if (t10.e()) {
                return t10;
            }
            throw C6639a.C1046a.i(t10);
        }

        public c t() {
            c cVar = new c((C6647i.c) this);
            int i10 = this.f68008d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = cVar.f67984e = this.f68009e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = cVar.f67985f = this.f68010f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            int unused3 = cVar.f67986g = this.f68011g;
            if ((this.f68008d & 8) == 8) {
                this.f68012h = Collections.unmodifiableList(this.f68012h);
                this.f68008d &= -9;
            }
            List unused4 = cVar.f67987h = this.f68012h;
            if ((this.f68008d & 16) == 16) {
                this.f68013i = Collections.unmodifiableList(this.f68013i);
                this.f68008d &= -17;
            }
            List unused5 = cVar.f67988i = this.f68013i;
            if ((this.f68008d & 32) == 32) {
                this.f68014j = Collections.unmodifiableList(this.f68014j);
                this.f68008d &= -33;
            }
            List unused6 = cVar.f67989j = this.f68014j;
            if ((this.f68008d & 64) == 64) {
                this.f68015k = Collections.unmodifiableList(this.f68015k);
                this.f68008d &= -65;
            }
            List unused7 = cVar.f67991l = this.f68015k;
            if ((this.f68008d & 128) == 128) {
                this.f68016l = Collections.unmodifiableList(this.f68016l);
                this.f68008d &= -129;
            }
            List unused8 = cVar.f67993n = this.f68016l;
            if ((this.f68008d & 256) == 256) {
                this.f68017m = Collections.unmodifiableList(this.f68017m);
                this.f68008d &= -257;
            }
            List unused9 = cVar.f67994o = this.f68017m;
            if ((this.f68008d & 512) == 512) {
                this.f68018n = Collections.unmodifiableList(this.f68018n);
                this.f68008d &= -513;
            }
            List unused10 = cVar.f67996q = this.f68018n;
            if ((this.f68008d & 1024) == 1024) {
                this.f68019o = Collections.unmodifiableList(this.f68019o);
                this.f68008d &= -1025;
            }
            List unused11 = cVar.f67997r = this.f68019o;
            if ((this.f68008d & 2048) == 2048) {
                this.f68020p = Collections.unmodifiableList(this.f68020p);
                this.f68008d &= -2049;
            }
            List unused12 = cVar.f67998s = this.f68020p;
            if ((this.f68008d & 4096) == 4096) {
                this.f68021q = Collections.unmodifiableList(this.f68021q);
                this.f68008d &= -4097;
            }
            List unused13 = cVar.f67999t = this.f68021q;
            if ((this.f68008d & 8192) == 8192) {
                this.f68022r = Collections.unmodifiableList(this.f68022r);
                this.f68008d &= -8193;
            }
            List unused14 = cVar.f68000u = this.f68022r;
            if ((this.f68008d & 16384) == 16384) {
                this.f68023s = Collections.unmodifiableList(this.f68023s);
                this.f68008d &= -16385;
            }
            List unused15 = cVar.f68001v = this.f68023s;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            int unused16 = cVar.f68003x = this.f68024t;
            if ((i10 & 65536) == 65536) {
                i11 |= 16;
            }
            q unused17 = cVar.f68004y = this.f68025u;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            int unused18 = cVar.f68005z = this.f68026v;
            if ((this.f68008d & 262144) == 262144) {
                this.f68027w = Collections.unmodifiableList(this.f68027w);
                this.f68008d &= -262145;
            }
            List unused19 = cVar.f67972A = this.f68027w;
            if ((this.f68008d & 524288) == 524288) {
                this.f68028x = Collections.unmodifiableList(this.f68028x);
                this.f68008d &= -524289;
            }
            List unused20 = cVar.f67974C = this.f68028x;
            if ((this.f68008d & 1048576) == 1048576) {
                this.f68029y = Collections.unmodifiableList(this.f68029y);
                this.f68008d &= -1048577;
            }
            List unused21 = cVar.f67975D = this.f68029y;
            if ((i10 & 2097152) == 2097152) {
                i11 |= 64;
            }
            t unused22 = cVar.f67977F = this.f68030z;
            if ((this.f68008d & 4194304) == 4194304) {
                this.f68006A = Collections.unmodifiableList(this.f68006A);
                this.f68008d &= -4194305;
            }
            List unused23 = cVar.f67978G = this.f68006A;
            if ((i10 & 8388608) == 8388608) {
                i11 |= 128;
            }
            w unused24 = cVar.f67979H = this.f68007B;
            int unused25 = cVar.f67983d = i11;
            return cVar;
        }

        /* renamed from: u */
        public b clone() {
            return w().k(t());
        }

        private void N() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: ig.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: ig.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: ig.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v95, resolved type: ig.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: ig.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: ig.w$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: ig.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: ig.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: ig.q$c} */
    /* JADX WARNING: type inference failed for: r16v4, types: [ig.t$b] */
    /* JADX WARNING: type inference failed for: r16v7, types: [ig.w$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private c(pg.C6643e r18, pg.C6645g r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r17.<init>()
            r4 = -1
            r1.f67990k = r4
            r1.f67992m = r4
            r1.f67995p = r4
            r1.f68002w = r4
            r1.f67973B = r4
            r1.f67976E = r4
            r1.f67980I = r4
            r1.f67981X = r4
            r17.t1()
            pg.d$b r4 = pg.C6642d.x()
            r5 = 1
            pg.f r6 = pg.C6644f.I(r4, r5)
            r7 = 0
            r8 = r7
        L_0x0028:
            r14 = 524288(0x80000, float:7.34684E-40)
            r11 = 262144(0x40000, float:3.67342E-40)
            r12 = 1048576(0x100000, float:1.469368E-39)
            r13 = 4194304(0x400000, float:5.877472E-39)
            r5 = 128(0x80, float:1.794E-43)
            r9 = 64
            if (r7 != 0) goto L_0x054f
            int r15 = r18.J()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r16 = 0
            switch(r15) {
                case 0: goto L_0x044a;
                case 8: goto L_0x043d;
                case 16: goto L_0x041f;
                case 18: goto L_0x03e9;
                case 24: goto L_0x03db;
                case 32: goto L_0x03cd;
                case 42: goto L_0x03b1;
                case 50: goto L_0x0395;
                case 56: goto L_0x0379;
                case 58: goto L_0x0345;
                case 66: goto L_0x0329;
                case 74: goto L_0x030d;
                case 82: goto L_0x02f1;
                case 90: goto L_0x02d5;
                case 106: goto L_0x02b9;
                case 128: goto L_0x029b;
                case 130: goto L_0x0265;
                case 136: goto L_0x0256;
                case 146: goto L_0x0229;
                case 152: goto L_0x021a;
                case 162: goto L_0x01fe;
                case 168: goto L_0x01e0;
                case 170: goto L_0x01aa;
                case 176: goto L_0x018f;
                case 178: goto L_0x015c;
                case 186: goto L_0x0143;
                case 192: goto L_0x0128;
                case 194: goto L_0x00f5;
                case 242: goto L_0x00cc;
                case 248: goto L_0x00b1;
                case 250: goto L_0x007d;
                case 258: goto L_0x0055;
                default: goto L_0x003f;
            }     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x003f:
            boolean r5 = r1.p(r2, r6, r3, r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r5 != 0) goto L_0x0046
            r7 = 1
        L_0x0046:
            r10 = 1
            goto L_0x044c
        L_0x0049:
            r0 = move-exception
            r2 = r0
            goto L_0x0462
        L_0x004d:
            r0 = move-exception
            r2 = r0
            goto L_0x044f
        L_0x0051:
            r0 = move-exception
            r2 = r0
            goto L_0x045d
        L_0x0055:
            int r15 = r1.f67983d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r15 = r15 & r5
            if (r15 != r5) goto L_0x0060
            ig.w r15 = r1.f67979H     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            ig.w$b r16 = r15.g()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x0060:
            r15 = r16
            pg.r r10 = ig.w.f68446g     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            ig.w r10 = (ig.w) r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67979H = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r15 == 0) goto L_0x0077
            r15.k(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            ig.w r10 = r15.p()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67979H = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x0077:
            int r10 = r1.f67983d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r10 | r5
            r1.f67983d = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x007d:
            int r10 = r18.z()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r2.i(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r15 = r8 & r13
            if (r15 == r13) goto L_0x0097
            int r15 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r15 <= 0) goto L_0x0097
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r15.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67978G = r15     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r13
        L_0x0097:
            int r15 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r15 <= 0) goto L_0x00ad
            java.util.List r15 = r1.f67978G     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r16 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r15.add(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5 = 128(0x80, float:1.794E-43)
            goto L_0x0097
        L_0x00ad:
            r2.h(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x00b1:
            r5 = r8 & r13
            if (r5 == r13) goto L_0x00bd
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67978G = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r13
        L_0x00bd:
            java.util.List r5 = r1.f67978G     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x00cc:
            int r5 = r1.f67983d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5 = r5 & r9
            if (r5 != r9) goto L_0x00d7
            ig.t r5 = r1.f67977F     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            ig.t$b r16 = r5.g()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x00d7:
            r5 = r16
            pg.r r10 = ig.t.f68385i     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            ig.t r10 = (ig.t) r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67977F = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r5 == 0) goto L_0x00ee
            r5.k(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            ig.t r5 = r5.p()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67977F = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x00ee:
            int r5 = r1.f67983d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5 = r5 | r9
            r1.f67983d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x00f5:
            int r5 = r18.z()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & r12
            if (r10 == r12) goto L_0x010f
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x010f
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67975D = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r12
        L_0x010f:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0123
            java.util.List r10 = r1.f67975D     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x010f
        L_0x0123:
            r2.h(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0128:
            r5 = r8 & r12
            if (r5 == r12) goto L_0x0134
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67975D = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r12
        L_0x0134:
            java.util.List r5 = r1.f67975D     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0143:
            r5 = r8 & r14
            if (r5 == r14) goto L_0x014f
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67974C = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r14
        L_0x014f:
            java.util.List r5 = r1.f67974C     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.r r10 = ig.q.f68279v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x015c:
            int r5 = r18.z()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & r11
            if (r10 == r11) goto L_0x0176
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0176
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67972A = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r11
        L_0x0176:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x018a
            java.util.List r10 = r1.f67972A     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0176
        L_0x018a:
            r2.h(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x018f:
            r5 = r8 & r11
            if (r5 == r11) goto L_0x019b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67972A = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r11
        L_0x019b:
            java.util.List r5 = r1.f67972A     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x01aa:
            int r5 = r18.z()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & 256(0x100, float:3.59E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r10 == r15) goto L_0x01c7
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x01c7
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67994o = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x01c7:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x01db
            java.util.List r10 = r1.f67994o     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x01c7
        L_0x01db:
            r2.h(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x01e0:
            r5 = r8 & 256(0x100, float:3.59E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r5 == r10) goto L_0x01ef
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67994o = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x01ef:
            java.util.List r5 = r1.f67994o     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x01fe:
            r5 = r8 & 128(0x80, float:1.794E-43)
            r10 = 128(0x80, float:1.794E-43)
            if (r5 == r10) goto L_0x020d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67993n = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 128(0x80, float:1.794E-43)
        L_0x020d:
            java.util.List r5 = r1.f67993n     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.r r10 = ig.q.f68279v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x021a:
            int r5 = r1.f67983d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = 32
            r5 = r5 | r10
            r1.f67983d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f68005z = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0229:
            int r5 = r1.f67983d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = 16
            r5 = r5 & r10
            if (r5 != r10) goto L_0x0236
            ig.q r5 = r1.f68004y     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            ig.q$c r16 = r5.g()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x0236:
            r5 = r16
            pg.r r10 = ig.q.f68279v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            ig.q r10 = (ig.q) r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f68004y = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r5 == 0) goto L_0x024d
            r5.k(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            ig.q r5 = r5.t()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f68004y = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x024d:
            int r5 = r1.f67983d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = 16
            r5 = r5 | r10
            r1.f67983d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0256:
            int r5 = r1.f67983d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = 8
            r5 = r5 | r10
            r1.f67983d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f68003x = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0265:
            int r5 = r18.z()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & 16384(0x4000, float:2.2959E-41)
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r10 == r15) goto L_0x0282
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0282
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f68001v = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x0282:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0296
            java.util.List r10 = r1.f68001v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0282
        L_0x0296:
            r2.h(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x029b:
            r5 = r8 & 16384(0x4000, float:2.2959E-41)
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r5 == r10) goto L_0x02aa
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f68001v = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x02aa:
            java.util.List r5 = r1.f68001v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x02b9:
            r5 = r8 & 8192(0x2000, float:1.14794E-41)
            r10 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r10) goto L_0x02c8
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f68000u = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
        L_0x02c8:
            java.util.List r5 = r1.f68000u     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.r r10 = ig.g.f68090i     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x02d5:
            r5 = r8 & 4096(0x1000, float:5.74E-42)
            r10 = 4096(0x1000, float:5.74E-42)
            if (r5 == r10) goto L_0x02e4
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67999t = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 4096(0x1000, float:5.74E-42)
        L_0x02e4:
            java.util.List r5 = r1.f67999t     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.r r10 = ig.r.f68334q     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x02f1:
            r5 = r8 & 2048(0x800, float:2.87E-42)
            r10 = 2048(0x800, float:2.87E-42)
            if (r5 == r10) goto L_0x0300
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67998s = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 2048(0x800, float:2.87E-42)
        L_0x0300:
            java.util.List r5 = r1.f67998s     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.r r10 = ig.n.f68208w     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x030d:
            r5 = r8 & 1024(0x400, float:1.435E-42)
            r10 = 1024(0x400, float:1.435E-42)
            if (r5 == r10) goto L_0x031c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67997r = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 1024(0x400, float:1.435E-42)
        L_0x031c:
            java.util.List r5 = r1.f67997r     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.r r10 = ig.i.f68126w     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0329:
            r5 = r8 & 512(0x200, float:7.175E-43)
            r10 = 512(0x200, float:7.175E-43)
            if (r5 == r10) goto L_0x0338
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67996q = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 512(0x200, float:7.175E-43)
        L_0x0338:
            java.util.List r5 = r1.f67996q     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.r r10 = ig.d.f68042k     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0345:
            int r5 = r18.z()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & 64
            if (r10 == r9) goto L_0x0360
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0360
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67991l = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 64
        L_0x0360:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0374
            java.util.List r10 = r1.f67991l     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0360
        L_0x0374:
            r2.h(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0379:
            r5 = r8 & 64
            if (r5 == r9) goto L_0x0386
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67991l = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 64
        L_0x0386:
            java.util.List r5 = r1.f67991l     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0395:
            r5 = r8 & 16
            r10 = 16
            if (r5 == r10) goto L_0x03a4
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67988i = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 16
        L_0x03a4:
            java.util.List r5 = r1.f67988i     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.r r10 = ig.q.f68279v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x03b1:
            r5 = r8 & 8
            r10 = 8
            if (r5 == r10) goto L_0x03c0
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67987h = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 8
        L_0x03c0:
            java.util.List r5 = r1.f67987h     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.r r10 = ig.s.f68359o     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            pg.p r10 = r2.t(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x03cd:
            int r5 = r1.f67983d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5 = r5 | 4
            r1.f67983d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67986g = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x03db:
            int r5 = r1.f67983d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5 = r5 | 2
            r1.f67983d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67985f = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x03e9:
            int r5 = r18.z()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & 32
            r15 = 32
            if (r10 == r15) goto L_0x0406
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0406
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67989j = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 32
        L_0x0406:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x041a
            java.util.List r10 = r1.f67989j     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0406
        L_0x041a:
            r2.h(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x041f:
            r5 = r8 & 32
            r10 = 32
            if (r5 == r10) goto L_0x042e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67989j = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 32
        L_0x042e:
            java.util.List r5 = r1.f67989j     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x043d:
            int r5 = r1.f67983d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = 1
            r5 = r5 | r10
            r1.f67983d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r18.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f67984e = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x044c
        L_0x044a:
            r10 = 1
            r7 = r10
        L_0x044c:
            r5 = r10
            goto L_0x0028
        L_0x044f:
            pg.k r3 = new pg.k     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0049 }
            r3.<init>(r2)     // Catch:{ all -> 0x0049 }
            pg.k r2 = r3.i(r1)     // Catch:{ all -> 0x0049 }
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x045d:
            pg.k r2 = r2.i(r1)     // Catch:{ all -> 0x0049 }
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0462:
            r3 = r8 & 32
            r5 = 32
            if (r3 != r5) goto L_0x0470
            java.util.List r3 = r1.f67989j
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67989j = r3
        L_0x0470:
            r3 = r8 & 8
            r5 = 8
            if (r3 != r5) goto L_0x047e
            java.util.List r3 = r1.f67987h
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67987h = r3
        L_0x047e:
            r3 = r8 & 16
            r5 = 16
            if (r3 != r5) goto L_0x048c
            java.util.List r3 = r1.f67988i
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67988i = r3
        L_0x048c:
            r3 = r8 & 64
            if (r3 != r9) goto L_0x0498
            java.util.List r3 = r1.f67991l
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67991l = r3
        L_0x0498:
            r3 = r8 & 512(0x200, float:7.175E-43)
            r5 = 512(0x200, float:7.175E-43)
            if (r3 != r5) goto L_0x04a6
            java.util.List r3 = r1.f67996q
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67996q = r3
        L_0x04a6:
            r3 = r8 & 1024(0x400, float:1.435E-42)
            r5 = 1024(0x400, float:1.435E-42)
            if (r3 != r5) goto L_0x04b4
            java.util.List r3 = r1.f67997r
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67997r = r3
        L_0x04b4:
            r3 = r8 & 2048(0x800, float:2.87E-42)
            r5 = 2048(0x800, float:2.87E-42)
            if (r3 != r5) goto L_0x04c2
            java.util.List r3 = r1.f67998s
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67998s = r3
        L_0x04c2:
            r3 = r8 & 4096(0x1000, float:5.74E-42)
            r5 = 4096(0x1000, float:5.74E-42)
            if (r3 != r5) goto L_0x04d0
            java.util.List r3 = r1.f67999t
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67999t = r3
        L_0x04d0:
            r3 = r8 & 8192(0x2000, float:1.14794E-41)
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r3 != r5) goto L_0x04de
            java.util.List r3 = r1.f68000u
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f68000u = r3
        L_0x04de:
            r3 = r8 & 16384(0x4000, float:2.2959E-41)
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r3 != r5) goto L_0x04ec
            java.util.List r3 = r1.f68001v
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f68001v = r3
        L_0x04ec:
            r3 = r8 & 128(0x80, float:1.794E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r3 != r5) goto L_0x04fa
            java.util.List r3 = r1.f67993n
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67993n = r3
        L_0x04fa:
            r3 = r8 & 256(0x100, float:3.59E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r3 != r5) goto L_0x0508
            java.util.List r3 = r1.f67994o
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67994o = r3
        L_0x0508:
            r3 = r8 & r11
            if (r3 != r11) goto L_0x0514
            java.util.List r3 = r1.f67972A
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67972A = r3
        L_0x0514:
            r3 = r8 & r14
            if (r3 != r14) goto L_0x0520
            java.util.List r3 = r1.f67974C
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67974C = r3
        L_0x0520:
            r3 = r8 & r12
            if (r3 != r12) goto L_0x052c
            java.util.List r3 = r1.f67975D
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67975D = r3
        L_0x052c:
            r3 = r8 & r13
            if (r3 != r13) goto L_0x0538
            java.util.List r3 = r1.f67978G
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f67978G = r3
        L_0x0538:
            r6.H()     // Catch:{ IOException -> 0x053b, all -> 0x0542 }
        L_0x053b:
            pg.d r3 = r4.n()
            r1.f67982c = r3
            goto L_0x054b
        L_0x0542:
            r0 = move-exception
            r2 = r0
            pg.d r3 = r4.n()
            r1.f67982c = r3
            throw r2
        L_0x054b:
            r17.m()
            throw r2
        L_0x054f:
            r2 = r8 & 32
            r3 = 32
            if (r2 != r3) goto L_0x055d
            java.util.List r2 = r1.f67989j
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67989j = r2
        L_0x055d:
            r2 = r8 & 8
            r3 = 8
            if (r2 != r3) goto L_0x056b
            java.util.List r2 = r1.f67987h
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67987h = r2
        L_0x056b:
            r2 = r8 & 16
            r3 = 16
            if (r2 != r3) goto L_0x0579
            java.util.List r2 = r1.f67988i
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67988i = r2
        L_0x0579:
            r2 = r8 & 64
            if (r2 != r9) goto L_0x0585
            java.util.List r2 = r1.f67991l
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67991l = r2
        L_0x0585:
            r2 = r8 & 512(0x200, float:7.175E-43)
            r3 = 512(0x200, float:7.175E-43)
            if (r2 != r3) goto L_0x0593
            java.util.List r2 = r1.f67996q
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67996q = r2
        L_0x0593:
            r2 = r8 & 1024(0x400, float:1.435E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 != r3) goto L_0x05a1
            java.util.List r2 = r1.f67997r
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67997r = r2
        L_0x05a1:
            r2 = r8 & 2048(0x800, float:2.87E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 != r3) goto L_0x05af
            java.util.List r2 = r1.f67998s
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67998s = r2
        L_0x05af:
            r2 = r8 & 4096(0x1000, float:5.74E-42)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r2 != r3) goto L_0x05bd
            java.util.List r2 = r1.f67999t
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67999t = r2
        L_0x05bd:
            r2 = r8 & 8192(0x2000, float:1.14794E-41)
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r2 != r3) goto L_0x05cb
            java.util.List r2 = r1.f68000u
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f68000u = r2
        L_0x05cb:
            r2 = r8 & 16384(0x4000, float:2.2959E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r3) goto L_0x05d9
            java.util.List r2 = r1.f68001v
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f68001v = r2
        L_0x05d9:
            r2 = r8 & 128(0x80, float:1.794E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r2 != r3) goto L_0x05e7
            java.util.List r2 = r1.f67993n
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67993n = r2
        L_0x05e7:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L_0x05f5
            java.util.List r2 = r1.f67994o
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67994o = r2
        L_0x05f5:
            r2 = r8 & r11
            if (r2 != r11) goto L_0x0601
            java.util.List r2 = r1.f67972A
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67972A = r2
        L_0x0601:
            r2 = r8 & r14
            if (r2 != r14) goto L_0x060d
            java.util.List r2 = r1.f67974C
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67974C = r2
        L_0x060d:
            r2 = r8 & r12
            if (r2 != r12) goto L_0x0619
            java.util.List r2 = r1.f67975D
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67975D = r2
        L_0x0619:
            r2 = r8 & r13
            if (r2 != r13) goto L_0x0625
            java.util.List r2 = r1.f67978G
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f67978G = r2
        L_0x0625:
            r6.H()     // Catch:{ IOException -> 0x0628, all -> 0x062f }
        L_0x0628:
            pg.d r2 = r4.n()
            r1.f67982c = r2
            goto L_0x0638
        L_0x062f:
            r0 = move-exception
            r2 = r0
            pg.d r3 = r4.n()
            r1.f67982c = r3
            throw r2
        L_0x0638:
            r17.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.c.<init>(pg.e, pg.g):void");
    }
}
