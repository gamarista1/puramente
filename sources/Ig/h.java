package ig;

import ig.q;
import java.io.IOException;
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

public final class h extends C6647i implements q {

    /* renamed from: m  reason: collision with root package name */
    private static final h f68098m;

    /* renamed from: n  reason: collision with root package name */
    public static r f68099n = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6642d f68100b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f68101c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68102d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f68103e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c f68104f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public q f68105g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f68106h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public List f68107i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List f68108j;

    /* renamed from: k  reason: collision with root package name */
    private byte f68109k;

    /* renamed from: l  reason: collision with root package name */
    private int f68110l;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public h b(C6643e eVar, C6645g gVar) {
            return new h(eVar, gVar);
        }
    }

    public enum c implements C6648j.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        

        /* renamed from: e  reason: collision with root package name */
        private static C6648j.b f68122e;

        /* renamed from: a  reason: collision with root package name */
        private final int f68124a;

        static class a implements C6648j.b {
            a() {
            }

            /* renamed from: b */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        static {
            f68122e = new a();
        }

        private c(int i10, int i11) {
            this.f68124a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return TRUE;
            }
            if (i10 == 1) {
                return FALSE;
            }
            if (i10 != 2) {
                return null;
            }
            return NULL;
        }

        public final int d() {
            return this.f68124a;
        }
    }

    static {
        h hVar = new h(true);
        f68098m = hVar;
        hVar.R();
    }

    public static h F() {
        return f68098m;
    }

    private void R() {
        this.f68102d = 0;
        this.f68103e = 0;
        this.f68104f = c.TRUE;
        this.f68105g = q.X();
        this.f68106h = 0;
        this.f68107i = Collections.emptyList();
        this.f68108j = Collections.emptyList();
    }

    public static b S() {
        return b.r();
    }

    public static b T(h hVar) {
        return S().k(hVar);
    }

    public h C(int i10) {
        return (h) this.f68107i.get(i10);
    }

    public int D() {
        return this.f68107i.size();
    }

    public c E() {
        return this.f68104f;
    }

    public int G() {
        return this.f68102d;
    }

    public q H() {
        return this.f68105g;
    }

    public int I() {
        return this.f68106h;
    }

    public h J(int i10) {
        return (h) this.f68108j.get(i10);
    }

    public int K() {
        return this.f68108j.size();
    }

    public int L() {
        return this.f68103e;
    }

    public boolean M() {
        if ((this.f68101c & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean N() {
        if ((this.f68101c & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean O() {
        if ((this.f68101c & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean P() {
        if ((this.f68101c & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        if ((this.f68101c & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public b c() {
        return S();
    }

    /* renamed from: V */
    public b g() {
        return T(this);
    }

    public int a() {
        int i10;
        int i11 = this.f68110l;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68101c & 1) == 1) {
            i10 = C6644f.o(1, this.f68102d);
        } else {
            i10 = 0;
        }
        if ((this.f68101c & 2) == 2) {
            i10 += C6644f.o(2, this.f68103e);
        }
        if ((this.f68101c & 4) == 4) {
            i10 += C6644f.h(3, this.f68104f.d());
        }
        if ((this.f68101c & 8) == 8) {
            i10 += C6644f.r(4, this.f68105g);
        }
        if ((this.f68101c & 16) == 16) {
            i10 += C6644f.o(5, this.f68106h);
        }
        for (int i12 = 0; i12 < this.f68107i.size(); i12++) {
            i10 += C6644f.r(6, (p) this.f68107i.get(i12));
        }
        for (int i13 = 0; i13 < this.f68108j.size(); i13++) {
            i10 += C6644f.r(7, (p) this.f68108j.get(i13));
        }
        int size = i10 + this.f68100b.size();
        this.f68110l = size;
        return size;
    }

    public final boolean e() {
        byte b10 = this.f68109k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!O() || H().e()) {
            for (int i10 = 0; i10 < D(); i10++) {
                if (!C(i10).e()) {
                    this.f68109k = 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < K(); i11++) {
                if (!J(i11).e()) {
                    this.f68109k = 0;
                    return false;
                }
            }
            this.f68109k = 1;
            return true;
        }
        this.f68109k = 0;
        return false;
    }

    public void h(C6644f fVar) {
        a();
        if ((this.f68101c & 1) == 1) {
            fVar.Z(1, this.f68102d);
        }
        if ((this.f68101c & 2) == 2) {
            fVar.Z(2, this.f68103e);
        }
        if ((this.f68101c & 4) == 4) {
            fVar.R(3, this.f68104f.d());
        }
        if ((this.f68101c & 8) == 8) {
            fVar.c0(4, this.f68105g);
        }
        if ((this.f68101c & 16) == 16) {
            fVar.Z(5, this.f68106h);
        }
        for (int i10 = 0; i10 < this.f68107i.size(); i10++) {
            fVar.c0(6, (p) this.f68107i.get(i10));
        }
        for (int i11 = 0; i11 < this.f68108j.size(); i11++) {
            fVar.c0(7, (p) this.f68108j.get(i11));
        }
        fVar.h0(this.f68100b);
    }

    private h(C6647i.b bVar) {
        super(bVar);
        this.f68109k = -1;
        this.f68110l = -1;
        this.f68100b = bVar.j();
    }

    private h(boolean z10) {
        this.f68109k = -1;
        this.f68110l = -1;
        this.f68100b = C6642d.f72492a;
    }

    private h(C6643e eVar, C6645g gVar) {
        this.f68109k = -1;
        this.f68110l = -1;
        R();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int J10 = eVar.J();
                if (J10 != 0) {
                    if (J10 == 8) {
                        this.f68101c |= 1;
                        this.f68102d = eVar.r();
                    } else if (J10 == 16) {
                        this.f68101c |= 2;
                        this.f68103e = eVar.r();
                    } else if (J10 == 24) {
                        int m10 = eVar.m();
                        c a10 = c.a(m10);
                        if (a10 == null) {
                            I10.n0(J10);
                            I10.n0(m10);
                        } else {
                            this.f68101c |= 4;
                            this.f68104f = a10;
                        }
                    } else if (J10 == 34) {
                        q.c B02 = (this.f68101c & 8) == 8 ? this.f68105g.g() : null;
                        q qVar = (q) eVar.t(q.f68279v, gVar);
                        this.f68105g = qVar;
                        if (B02 != null) {
                            B02.k(qVar);
                            this.f68105g = B02.t();
                        }
                        this.f68101c |= 8;
                    } else if (J10 == 40) {
                        this.f68101c |= 16;
                        this.f68106h = eVar.r();
                    } else if (J10 == 50) {
                        if (!(z11 & true)) {
                            this.f68107i = new ArrayList();
                            z11 |= true;
                        }
                        this.f68107i.add(eVar.t(f68099n, gVar));
                    } else if (J10 == 58) {
                        if (!(z11 & true)) {
                            this.f68108j = new ArrayList();
                            z11 |= true;
                        }
                        this.f68108j.add(eVar.t(f68099n, gVar));
                    } else if (p(eVar, I10, gVar, J10)) {
                    }
                }
                z10 = true;
            } catch (C6649k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C6649k(e11.getMessage()).i(this);
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f68107i = Collections.unmodifiableList(this.f68107i);
                }
                if (z11 & true) {
                    this.f68108j = Collections.unmodifiableList(this.f68108j);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f68100b = x10.n();
                    throw th3;
                }
                this.f68100b = x10.n();
                m();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f68107i = Collections.unmodifiableList(this.f68107i);
        }
        if (z11 & true) {
            this.f68108j = Collections.unmodifiableList(this.f68108j);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68100b = x10.n();
            throw th4;
        }
        this.f68100b = x10.n();
        m();
    }

    public static final class b extends C6647i.b implements pg.q {

        /* renamed from: b  reason: collision with root package name */
        private int f68111b;

        /* renamed from: c  reason: collision with root package name */
        private int f68112c;

        /* renamed from: d  reason: collision with root package name */
        private int f68113d;

        /* renamed from: e  reason: collision with root package name */
        private c f68114e = c.TRUE;

        /* renamed from: f  reason: collision with root package name */
        private q f68115f = q.X();

        /* renamed from: g  reason: collision with root package name */
        private int f68116g;

        /* renamed from: h  reason: collision with root package name */
        private List f68117h = Collections.emptyList();

        /* renamed from: i  reason: collision with root package name */
        private List f68118i = Collections.emptyList();

        private b() {
            u();
        }

        /* access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f68111b & 32) != 32) {
                this.f68117h = new ArrayList(this.f68117h);
                this.f68111b |= 32;
            }
        }

        private void t() {
            if ((this.f68111b & 64) != 64) {
                this.f68118i = new ArrayList(this.f68118i);
                this.f68111b |= 64;
            }
        }

        public b A(int i10) {
            this.f68111b |= 1;
            this.f68112c = i10;
            return this;
        }

        public b B(int i10) {
            this.f68111b |= 16;
            this.f68116g = i10;
            return this;
        }

        public b C(int i10) {
            this.f68111b |= 2;
            this.f68113d = i10;
            return this;
        }

        /* renamed from: o */
        public h f() {
            h p10 = p();
            if (p10.e()) {
                return p10;
            }
            throw C6639a.C1046a.i(p10);
        }

        public h p() {
            h hVar = new h((C6647i.b) this);
            int i10 = this.f68111b;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = hVar.f68102d = this.f68112c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = hVar.f68103e = this.f68113d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c unused3 = hVar.f68104f = this.f68114e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            q unused4 = hVar.f68105g = this.f68115f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            int unused5 = hVar.f68106h = this.f68116g;
            if ((this.f68111b & 32) == 32) {
                this.f68117h = Collections.unmodifiableList(this.f68117h);
                this.f68111b &= -33;
            }
            List unused6 = hVar.f68107i = this.f68117h;
            if ((this.f68111b & 64) == 64) {
                this.f68118i = Collections.unmodifiableList(this.f68118i);
                this.f68111b &= -65;
            }
            List unused7 = hVar.f68108j = this.f68118i;
            int unused8 = hVar.f68101c = i11;
            return hVar;
        }

        /* renamed from: q */
        public b clone() {
            return r().k(p());
        }

        /* renamed from: w */
        public b k(h hVar) {
            if (hVar == h.F()) {
                return this;
            }
            if (hVar.N()) {
                A(hVar.G());
            }
            if (hVar.Q()) {
                C(hVar.L());
            }
            if (hVar.M()) {
                z(hVar.E());
            }
            if (hVar.O()) {
                y(hVar.H());
            }
            if (hVar.P()) {
                B(hVar.I());
            }
            if (!hVar.f68107i.isEmpty()) {
                if (this.f68117h.isEmpty()) {
                    this.f68117h = hVar.f68107i;
                    this.f68111b &= -33;
                } else {
                    s();
                    this.f68117h.addAll(hVar.f68107i);
                }
            }
            if (!hVar.f68108j.isEmpty()) {
                if (this.f68118i.isEmpty()) {
                    this.f68118i = hVar.f68108j;
                    this.f68111b &= -65;
                } else {
                    t();
                    this.f68118i.addAll(hVar.f68108j);
                }
            }
            l(j().b(hVar.f68100b));
            return this;
        }

        /* renamed from: x */
        public b h0(C6643e eVar, C6645g gVar) {
            h hVar;
            h hVar2 = null;
            try {
                h hVar3 = (h) h.f68099n.b(eVar, gVar);
                if (hVar3 != null) {
                    k(hVar3);
                }
                return this;
            } catch (C6649k e10) {
                hVar = (h) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                hVar2 = hVar;
            }
            if (hVar2 != null) {
                k(hVar2);
            }
            throw th;
        }

        public b y(q qVar) {
            if ((this.f68111b & 8) != 8 || this.f68115f == q.X()) {
                this.f68115f = qVar;
            } else {
                this.f68115f = q.z0(this.f68115f).k(qVar).t();
            }
            this.f68111b |= 8;
            return this;
        }

        public b z(c cVar) {
            cVar.getClass();
            this.f68111b |= 4;
            this.f68114e = cVar;
            return this;
        }

        private void u() {
        }
    }
}
