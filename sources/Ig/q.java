package ig;

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
import pg.r;

public final class q extends C6647i.d implements pg.q {

    /* renamed from: u  reason: collision with root package name */
    private static final q f68278u;

    /* renamed from: v  reason: collision with root package name */
    public static r f68279v = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f68280c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68281d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List f68282e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f68283f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f68284g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public q f68285h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f68286i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f68287j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f68288k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f68289l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f68290m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public q f68291n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f68292o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public q f68293p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public int f68294q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public int f68295r;

    /* renamed from: s  reason: collision with root package name */
    private byte f68296s;

    /* renamed from: t  reason: collision with root package name */
    private int f68297t;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public q b(C6643e eVar, C6645g gVar) {
            return new q(eVar, gVar);
        }
    }

    static {
        q qVar = new q(true);
        f68278u = qVar;
        qVar.x0();
    }

    public static q X() {
        return f68278u;
    }

    private void x0() {
        this.f68282e = Collections.emptyList();
        this.f68283f = false;
        this.f68284g = 0;
        this.f68285h = X();
        this.f68286i = 0;
        this.f68287j = 0;
        this.f68288k = 0;
        this.f68289l = 0;
        this.f68290m = 0;
        this.f68291n = X();
        this.f68292o = 0;
        this.f68293p = X();
        this.f68294q = 0;
        this.f68295r = 0;
    }

    public static c y0() {
        return c.w();
    }

    public static c z0(q qVar) {
        return y0().k(qVar);
    }

    /* renamed from: A0 */
    public c c() {
        return y0();
    }

    /* renamed from: B0 */
    public c g() {
        return z0(this);
    }

    public q R() {
        return this.f68293p;
    }

    public int S() {
        return this.f68294q;
    }

    public b T(int i10) {
        return (b) this.f68282e.get(i10);
    }

    public int U() {
        return this.f68282e.size();
    }

    public List V() {
        return this.f68282e;
    }

    public int W() {
        return this.f68287j;
    }

    /* renamed from: Y */
    public q d() {
        return f68278u;
    }

    public int Z() {
        return this.f68295r;
    }

    public int a() {
        int i10;
        int i11 = this.f68297t;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68281d & 4096) == 4096) {
            i10 = C6644f.o(1, this.f68295r);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < this.f68282e.size(); i12++) {
            i10 += C6644f.r(2, (p) this.f68282e.get(i12));
        }
        if ((this.f68281d & 1) == 1) {
            i10 += C6644f.a(3, this.f68283f);
        }
        if ((this.f68281d & 2) == 2) {
            i10 += C6644f.o(4, this.f68284g);
        }
        if ((this.f68281d & 4) == 4) {
            i10 += C6644f.r(5, this.f68285h);
        }
        if ((this.f68281d & 16) == 16) {
            i10 += C6644f.o(6, this.f68287j);
        }
        if ((this.f68281d & 32) == 32) {
            i10 += C6644f.o(7, this.f68288k);
        }
        if ((this.f68281d & 8) == 8) {
            i10 += C6644f.o(8, this.f68286i);
        }
        if ((this.f68281d & 64) == 64) {
            i10 += C6644f.o(9, this.f68289l);
        }
        if ((this.f68281d & 256) == 256) {
            i10 += C6644f.r(10, this.f68291n);
        }
        if ((this.f68281d & 512) == 512) {
            i10 += C6644f.o(11, this.f68292o);
        }
        if ((this.f68281d & 128) == 128) {
            i10 += C6644f.o(12, this.f68290m);
        }
        if ((this.f68281d & 1024) == 1024) {
            i10 += C6644f.r(13, this.f68293p);
        }
        if ((this.f68281d & 2048) == 2048) {
            i10 += C6644f.o(14, this.f68294q);
        }
        int t10 = i10 + t() + this.f68280c.size();
        this.f68297t = t10;
        return t10;
    }

    public int a0() {
        return this.f68284g;
    }

    public q b0() {
        return this.f68285h;
    }

    public int c0() {
        return this.f68286i;
    }

    public boolean d0() {
        return this.f68283f;
    }

    public final boolean e() {
        byte b10 = this.f68296s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < U(); i10++) {
            if (!T(i10).e()) {
                this.f68296s = 0;
                return false;
            }
        }
        if (p0() && !b0().e()) {
            this.f68296s = 0;
            return false;
        } else if (s0() && !e0().e()) {
            this.f68296s = 0;
            return false;
        } else if (k0() && !R().e()) {
            this.f68296s = 0;
            return false;
        } else if (!s()) {
            this.f68296s = 0;
            return false;
        } else {
            this.f68296s = 1;
            return true;
        }
    }

    public q e0() {
        return this.f68291n;
    }

    public int f0() {
        return this.f68292o;
    }

    public int g0() {
        return this.f68290m;
    }

    public void h(C6644f fVar) {
        a();
        C6647i.d.a y10 = y();
        if ((this.f68281d & 4096) == 4096) {
            fVar.Z(1, this.f68295r);
        }
        for (int i10 = 0; i10 < this.f68282e.size(); i10++) {
            fVar.c0(2, (p) this.f68282e.get(i10));
        }
        if ((this.f68281d & 1) == 1) {
            fVar.K(3, this.f68283f);
        }
        if ((this.f68281d & 2) == 2) {
            fVar.Z(4, this.f68284g);
        }
        if ((this.f68281d & 4) == 4) {
            fVar.c0(5, this.f68285h);
        }
        if ((this.f68281d & 16) == 16) {
            fVar.Z(6, this.f68287j);
        }
        if ((this.f68281d & 32) == 32) {
            fVar.Z(7, this.f68288k);
        }
        if ((this.f68281d & 8) == 8) {
            fVar.Z(8, this.f68286i);
        }
        if ((this.f68281d & 64) == 64) {
            fVar.Z(9, this.f68289l);
        }
        if ((this.f68281d & 256) == 256) {
            fVar.c0(10, this.f68291n);
        }
        if ((this.f68281d & 512) == 512) {
            fVar.Z(11, this.f68292o);
        }
        if ((this.f68281d & 128) == 128) {
            fVar.Z(12, this.f68290m);
        }
        if ((this.f68281d & 1024) == 1024) {
            fVar.c0(13, this.f68293p);
        }
        if ((this.f68281d & 2048) == 2048) {
            fVar.Z(14, this.f68294q);
        }
        y10.a(200, fVar);
        fVar.h0(this.f68280c);
    }

    public int i0() {
        return this.f68288k;
    }

    public int j0() {
        return this.f68289l;
    }

    public boolean k0() {
        if ((this.f68281d & 1024) == 1024) {
            return true;
        }
        return false;
    }

    public boolean l0() {
        if ((this.f68281d & 2048) == 2048) {
            return true;
        }
        return false;
    }

    public boolean m0() {
        if ((this.f68281d & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean n0() {
        if ((this.f68281d & 4096) == 4096) {
            return true;
        }
        return false;
    }

    public boolean o0() {
        if ((this.f68281d & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean p0() {
        if ((this.f68281d & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean q0() {
        if ((this.f68281d & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean r0() {
        if ((this.f68281d & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean s0() {
        if ((this.f68281d & 256) == 256) {
            return true;
        }
        return false;
    }

    public boolean t0() {
        if ((this.f68281d & 512) == 512) {
            return true;
        }
        return false;
    }

    public boolean u0() {
        if ((this.f68281d & 128) == 128) {
            return true;
        }
        return false;
    }

    public boolean v0() {
        if ((this.f68281d & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean w0() {
        if ((this.f68281d & 64) == 64) {
            return true;
        }
        return false;
    }

    public static final class b extends C6647i implements pg.q {

        /* renamed from: i  reason: collision with root package name */
        private static final b f68298i;

        /* renamed from: j  reason: collision with root package name */
        public static r f68299j = new a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C6642d f68300b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f68301c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public c f68302d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public q f68303e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f68304f;

        /* renamed from: g  reason: collision with root package name */
        private byte f68305g;

        /* renamed from: h  reason: collision with root package name */
        private int f68306h;

        static class a extends C6640b {
            a() {
            }

            /* renamed from: j */
            public b b(C6643e eVar, C6645g gVar) {
                return new b(eVar, gVar);
            }
        }

        public enum c implements C6648j.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            

            /* renamed from: f  reason: collision with root package name */
            private static C6648j.b f68315f;

            /* renamed from: a  reason: collision with root package name */
            private final int f68317a;

            static class a implements C6648j.b {
                a() {
                }

                /* renamed from: b */
                public c a(int i10) {
                    return c.a(i10);
                }
            }

            static {
                f68315f = new a();
            }

            private c(int i10, int i11) {
                this.f68317a = i11;
            }

            public static c a(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }

            public final int d() {
                return this.f68317a;
            }
        }

        static {
            b bVar = new b(true);
            f68298i = bVar;
            bVar.D();
        }

        private void D() {
            this.f68302d = c.INV;
            this.f68303e = q.X();
            this.f68304f = 0;
        }

        public static C1019b E() {
            return C1019b.r();
        }

        public static C1019b F(b bVar) {
            return E().k(bVar);
        }

        public static b w() {
            return f68298i;
        }

        public boolean A() {
            if ((this.f68301c & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean B() {
            if ((this.f68301c & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean C() {
            if ((this.f68301c & 4) == 4) {
                return true;
            }
            return false;
        }

        /* renamed from: G */
        public C1019b c() {
            return E();
        }

        /* renamed from: H */
        public C1019b g() {
            return F(this);
        }

        public int a() {
            int i10;
            int i11 = this.f68306h;
            if (i11 != -1) {
                return i11;
            }
            if ((this.f68301c & 1) == 1) {
                i10 = C6644f.h(1, this.f68302d.d());
            } else {
                i10 = 0;
            }
            if ((this.f68301c & 2) == 2) {
                i10 += C6644f.r(2, this.f68303e);
            }
            if ((this.f68301c & 4) == 4) {
                i10 += C6644f.o(3, this.f68304f);
            }
            int size = i10 + this.f68300b.size();
            this.f68306h = size;
            return size;
        }

        public final boolean e() {
            byte b10 = this.f68305g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!B() || y().e()) {
                this.f68305g = 1;
                return true;
            }
            this.f68305g = 0;
            return false;
        }

        public void h(C6644f fVar) {
            a();
            if ((this.f68301c & 1) == 1) {
                fVar.R(1, this.f68302d.d());
            }
            if ((this.f68301c & 2) == 2) {
                fVar.c0(2, this.f68303e);
            }
            if ((this.f68301c & 4) == 4) {
                fVar.Z(3, this.f68304f);
            }
            fVar.h0(this.f68300b);
        }

        public c x() {
            return this.f68302d;
        }

        public q y() {
            return this.f68303e;
        }

        public int z() {
            return this.f68304f;
        }

        private b(C6647i.b bVar) {
            super(bVar);
            this.f68305g = -1;
            this.f68306h = -1;
            this.f68300b = bVar.j();
        }

        private b(boolean z10) {
            this.f68305g = -1;
            this.f68306h = -1;
            this.f68300b = C6642d.f72492a;
        }

        private b(C6643e eVar, C6645g gVar) {
            this.f68305g = -1;
            this.f68306h = -1;
            D();
            C6642d.b x10 = C6642d.x();
            C6644f I10 = C6644f.I(x10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 8) {
                            int m10 = eVar.m();
                            c a10 = c.a(m10);
                            if (a10 == null) {
                                I10.n0(J10);
                                I10.n0(m10);
                            } else {
                                this.f68301c |= 1;
                                this.f68302d = a10;
                            }
                        } else if (J10 == 18) {
                            c B02 = (this.f68301c & 2) == 2 ? this.f68303e.g() : null;
                            q qVar = (q) eVar.t(q.f68279v, gVar);
                            this.f68303e = qVar;
                            if (B02 != null) {
                                B02.k(qVar);
                                this.f68303e = B02.t();
                            }
                            this.f68301c |= 2;
                        } else if (J10 == 24) {
                            this.f68301c |= 4;
                            this.f68304f = eVar.r();
                        } else if (p(eVar, I10, gVar, J10)) {
                        }
                    }
                    z10 = true;
                } catch (C6649k e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new C6649k(e11.getMessage()).i(this);
                } catch (Throwable th2) {
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f68300b = x10.n();
                        throw th3;
                    }
                    this.f68300b = x10.n();
                    m();
                    throw th2;
                }
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f68300b = x10.n();
                throw th4;
            }
            this.f68300b = x10.n();
            m();
        }

        /* renamed from: ig.q$b$b  reason: collision with other inner class name */
        public static final class C1019b extends C6647i.b implements pg.q {

            /* renamed from: b  reason: collision with root package name */
            private int f68307b;

            /* renamed from: c  reason: collision with root package name */
            private c f68308c = c.INV;

            /* renamed from: d  reason: collision with root package name */
            private q f68309d = q.X();

            /* renamed from: e  reason: collision with root package name */
            private int f68310e;

            private C1019b() {
                s();
            }

            /* access modifiers changed from: private */
            public static C1019b r() {
                return new C1019b();
            }

            /* renamed from: o */
            public b f() {
                b p10 = p();
                if (p10.e()) {
                    return p10;
                }
                throw C6639a.C1046a.i(p10);
            }

            public b p() {
                b bVar = new b((C6647i.b) this);
                int i10 = this.f68307b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                c unused = bVar.f68302d = this.f68308c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                q unused2 = bVar.f68303e = this.f68309d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                int unused3 = bVar.f68304f = this.f68310e;
                int unused4 = bVar.f68301c = i11;
                return bVar;
            }

            /* renamed from: q */
            public C1019b clone() {
                return r().k(p());
            }

            /* renamed from: t */
            public C1019b k(b bVar) {
                if (bVar == b.w()) {
                    return this;
                }
                if (bVar.A()) {
                    x(bVar.x());
                }
                if (bVar.B()) {
                    w(bVar.y());
                }
                if (bVar.C()) {
                    y(bVar.z());
                }
                l(j().b(bVar.f68300b));
                return this;
            }

            /* renamed from: u */
            public C1019b h0(C6643e eVar, C6645g gVar) {
                b bVar;
                b bVar2 = null;
                try {
                    b bVar3 = (b) b.f68299j.b(eVar, gVar);
                    if (bVar3 != null) {
                        k(bVar3);
                    }
                    return this;
                } catch (C6649k e10) {
                    bVar = (b) e10.a();
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    k(bVar2);
                }
                throw th;
            }

            public C1019b w(q qVar) {
                if ((this.f68307b & 2) != 2 || this.f68309d == q.X()) {
                    this.f68309d = qVar;
                } else {
                    this.f68309d = q.z0(this.f68309d).k(qVar).t();
                }
                this.f68307b |= 2;
                return this;
            }

            public C1019b x(c cVar) {
                cVar.getClass();
                this.f68307b |= 1;
                this.f68308c = cVar;
                return this;
            }

            public C1019b y(int i10) {
                this.f68307b |= 4;
                this.f68310e = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    private q(C6647i.c cVar) {
        super(cVar);
        this.f68296s = -1;
        this.f68297t = -1;
        this.f68280c = cVar.j();
    }

    private q(boolean z10) {
        this.f68296s = -1;
        this.f68297t = -1;
        this.f68280c = C6642d.f72492a;
    }

    private q(C6643e eVar, C6645g gVar) {
        this.f68296s = -1;
        this.f68297t = -1;
        x0();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int J10 = eVar.J();
                c cVar = null;
                switch (J10) {
                    case 0:
                        z10 = true;
                        break;
                    case 8:
                        this.f68281d |= 4096;
                        this.f68295r = eVar.r();
                        break;
                    case 18:
                        if (!z11) {
                            this.f68282e = new ArrayList();
                            z11 = true;
                        }
                        this.f68282e.add(eVar.t(b.f68299j, gVar));
                        break;
                    case 24:
                        this.f68281d |= 1;
                        this.f68283f = eVar.j();
                        break;
                    case com.amazon.c.a.a.c.f37660h:
                        this.f68281d |= 2;
                        this.f68284g = eVar.r();
                        break;
                    case 42:
                        cVar = (this.f68281d & 4) == 4 ? this.f68285h.g() : cVar;
                        q qVar = (q) eVar.t(f68279v, gVar);
                        this.f68285h = qVar;
                        if (cVar != null) {
                            cVar.k(qVar);
                            this.f68285h = cVar.t();
                        }
                        this.f68281d |= 4;
                        break;
                    case 48:
                        this.f68281d |= 16;
                        this.f68287j = eVar.r();
                        break;
                    case 56:
                        this.f68281d |= 32;
                        this.f68288k = eVar.r();
                        break;
                    case 64:
                        this.f68281d |= 8;
                        this.f68286i = eVar.r();
                        break;
                    case 72:
                        this.f68281d |= 64;
                        this.f68289l = eVar.r();
                        break;
                    case 82:
                        cVar = (this.f68281d & 256) == 256 ? this.f68291n.g() : cVar;
                        q qVar2 = (q) eVar.t(f68279v, gVar);
                        this.f68291n = qVar2;
                        if (cVar != null) {
                            cVar.k(qVar2);
                            this.f68291n = cVar.t();
                        }
                        this.f68281d |= 256;
                        break;
                    case 88:
                        this.f68281d |= 512;
                        this.f68292o = eVar.r();
                        break;
                    case 96:
                        this.f68281d |= 128;
                        this.f68290m = eVar.r();
                        break;
                    case 106:
                        cVar = (this.f68281d & 1024) == 1024 ? this.f68293p.g() : cVar;
                        q qVar3 = (q) eVar.t(f68279v, gVar);
                        this.f68293p = qVar3;
                        if (cVar != null) {
                            cVar.k(qVar3);
                            this.f68293p = cVar.t();
                        }
                        this.f68281d |= 1024;
                        break;
                    case 112:
                        this.f68281d |= 2048;
                        this.f68294q = eVar.r();
                        break;
                    default:
                        if (p(eVar, I10, gVar, J10)) {
                            break;
                        }
                        z10 = true;
                        break;
                }
            } catch (C6649k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C6649k(e11.getMessage()).i(this);
            } catch (Throwable th2) {
                if (z11) {
                    this.f68282e = Collections.unmodifiableList(this.f68282e);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f68280c = x10.n();
                    throw th3;
                }
                this.f68280c = x10.n();
                m();
                throw th2;
            }
        }
        if (z11) {
            this.f68282e = Collections.unmodifiableList(this.f68282e);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68280c = x10.n();
            throw th4;
        }
        this.f68280c = x10.n();
        m();
    }

    public static final class c extends C6647i.c implements pg.q {

        /* renamed from: d  reason: collision with root package name */
        private int f68318d;

        /* renamed from: e  reason: collision with root package name */
        private List f68319e = Collections.emptyList();

        /* renamed from: f  reason: collision with root package name */
        private boolean f68320f;

        /* renamed from: g  reason: collision with root package name */
        private int f68321g;

        /* renamed from: h  reason: collision with root package name */
        private q f68322h = q.X();

        /* renamed from: i  reason: collision with root package name */
        private int f68323i;

        /* renamed from: j  reason: collision with root package name */
        private int f68324j;

        /* renamed from: k  reason: collision with root package name */
        private int f68325k;

        /* renamed from: l  reason: collision with root package name */
        private int f68326l;

        /* renamed from: m  reason: collision with root package name */
        private int f68327m;

        /* renamed from: n  reason: collision with root package name */
        private q f68328n = q.X();

        /* renamed from: o  reason: collision with root package name */
        private int f68329o;

        /* renamed from: p  reason: collision with root package name */
        private q f68330p = q.X();

        /* renamed from: q  reason: collision with root package name */
        private int f68331q;

        /* renamed from: r  reason: collision with root package name */
        private int f68332r;

        private c() {
            y();
        }

        /* access modifiers changed from: private */
        public static c w() {
            return new c();
        }

        private void x() {
            if ((this.f68318d & 1) != 1) {
                this.f68319e = new ArrayList(this.f68319e);
                this.f68318d |= 1;
            }
        }

        public c A(q qVar) {
            if ((this.f68318d & 8) != 8 || this.f68322h == q.X()) {
                this.f68322h = qVar;
            } else {
                this.f68322h = q.z0(this.f68322h).k(qVar).t();
            }
            this.f68318d |= 8;
            return this;
        }

        /* renamed from: B */
        public c k(q qVar) {
            if (qVar == q.X()) {
                return this;
            }
            if (!qVar.f68282e.isEmpty()) {
                if (this.f68319e.isEmpty()) {
                    this.f68319e = qVar.f68282e;
                    this.f68318d &= -2;
                } else {
                    x();
                    this.f68319e.addAll(qVar.f68282e);
                }
            }
            if (qVar.r0()) {
                J(qVar.d0());
            }
            if (qVar.o0()) {
                H(qVar.a0());
            }
            if (qVar.p0()) {
                A(qVar.b0());
            }
            if (qVar.q0()) {
                I(qVar.c0());
            }
            if (qVar.m0()) {
                F(qVar.W());
            }
            if (qVar.v0()) {
                M(qVar.i0());
            }
            if (qVar.w0()) {
                N(qVar.j0());
            }
            if (qVar.u0()) {
                L(qVar.g0());
            }
            if (qVar.s0()) {
                D(qVar.e0());
            }
            if (qVar.t0()) {
                K(qVar.f0());
            }
            if (qVar.k0()) {
                z(qVar.R());
            }
            if (qVar.l0()) {
                E(qVar.S());
            }
            if (qVar.n0()) {
                G(qVar.Z());
            }
            q(qVar);
            l(j().b(qVar.f68280c));
            return this;
        }

        /* renamed from: C */
        public c h0(C6643e eVar, C6645g gVar) {
            q qVar;
            q qVar2 = null;
            try {
                q qVar3 = (q) q.f68279v.b(eVar, gVar);
                if (qVar3 != null) {
                    k(qVar3);
                }
                return this;
            } catch (C6649k e10) {
                qVar = (q) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                qVar2 = qVar;
            }
            if (qVar2 != null) {
                k(qVar2);
            }
            throw th;
        }

        public c D(q qVar) {
            if ((this.f68318d & 512) != 512 || this.f68328n == q.X()) {
                this.f68328n = qVar;
            } else {
                this.f68328n = q.z0(this.f68328n).k(qVar).t();
            }
            this.f68318d |= 512;
            return this;
        }

        public c E(int i10) {
            this.f68318d |= 4096;
            this.f68331q = i10;
            return this;
        }

        public c F(int i10) {
            this.f68318d |= 32;
            this.f68324j = i10;
            return this;
        }

        public c G(int i10) {
            this.f68318d |= 8192;
            this.f68332r = i10;
            return this;
        }

        public c H(int i10) {
            this.f68318d |= 4;
            this.f68321g = i10;
            return this;
        }

        public c I(int i10) {
            this.f68318d |= 16;
            this.f68323i = i10;
            return this;
        }

        public c J(boolean z10) {
            this.f68318d |= 2;
            this.f68320f = z10;
            return this;
        }

        public c K(int i10) {
            this.f68318d |= 1024;
            this.f68329o = i10;
            return this;
        }

        public c L(int i10) {
            this.f68318d |= 256;
            this.f68327m = i10;
            return this;
        }

        public c M(int i10) {
            this.f68318d |= 64;
            this.f68325k = i10;
            return this;
        }

        public c N(int i10) {
            this.f68318d |= 128;
            this.f68326l = i10;
            return this;
        }

        /* renamed from: s */
        public q f() {
            q t10 = t();
            if (t10.e()) {
                return t10;
            }
            throw C6639a.C1046a.i(t10);
        }

        public q t() {
            q qVar = new q((C6647i.c) this);
            int i10 = this.f68318d;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f68319e = Collections.unmodifiableList(this.f68319e);
                this.f68318d &= -2;
            }
            List unused = qVar.f68282e = this.f68319e;
            if ((i10 & 2) != 2) {
                i11 = 0;
            }
            boolean unused2 = qVar.f68283f = this.f68320f;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            int unused3 = qVar.f68284g = this.f68321g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            q unused4 = qVar.f68285h = this.f68322h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            int unused5 = qVar.f68286i = this.f68323i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            int unused6 = qVar.f68287j = this.f68324j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            int unused7 = qVar.f68288k = this.f68325k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            int unused8 = qVar.f68289l = this.f68326l;
            if ((i10 & 256) == 256) {
                i11 |= 128;
            }
            int unused9 = qVar.f68290m = this.f68327m;
            if ((i10 & 512) == 512) {
                i11 |= 256;
            }
            q unused10 = qVar.f68291n = this.f68328n;
            if ((i10 & 1024) == 1024) {
                i11 |= 512;
            }
            int unused11 = qVar.f68292o = this.f68329o;
            if ((i10 & 2048) == 2048) {
                i11 |= 1024;
            }
            q unused12 = qVar.f68293p = this.f68330p;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            int unused13 = qVar.f68294q = this.f68331q;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            int unused14 = qVar.f68295r = this.f68332r;
            int unused15 = qVar.f68281d = i11;
            return qVar;
        }

        /* renamed from: u */
        public c clone() {
            return w().k(t());
        }

        public c z(q qVar) {
            if ((this.f68318d & 2048) != 2048 || this.f68330p == q.X()) {
                this.f68330p = qVar;
            } else {
                this.f68330p = q.z0(this.f68330p).k(qVar).t();
            }
            this.f68318d |= 2048;
            return this;
        }

        private void y() {
        }
    }
}
