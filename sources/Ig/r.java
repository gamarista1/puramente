package ig;

import ig.q;
import java.io.IOException;
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

public final class r extends C6647i.d implements q {

    /* renamed from: p  reason: collision with root package name */
    private static final r f68333p;

    /* renamed from: q  reason: collision with root package name */
    public static pg.r f68334q = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f68335c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68336d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f68337e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f68338f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public List f68339g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public q f68340h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f68341i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public q f68342j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f68343k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public List f68344l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public List f68345m;

    /* renamed from: n  reason: collision with root package name */
    private byte f68346n;

    /* renamed from: o  reason: collision with root package name */
    private int f68347o;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public r b(C6643e eVar, C6645g gVar) {
            return new r(eVar, gVar);
        }
    }

    static {
        r rVar = new r(true);
        f68333p = rVar;
        rVar.k0();
    }

    public static r R() {
        return f68333p;
    }

    private void k0() {
        this.f68337e = 6;
        this.f68338f = 0;
        this.f68339g = Collections.emptyList();
        this.f68340h = q.X();
        this.f68341i = 0;
        this.f68342j = q.X();
        this.f68343k = 0;
        this.f68344l = Collections.emptyList();
        this.f68345m = Collections.emptyList();
    }

    public static b l0() {
        return b.w();
    }

    public static b m0(r rVar) {
        return l0().k(rVar);
    }

    public static r o0(InputStream inputStream, C6645g gVar) {
        return (r) f68334q.a(inputStream, gVar);
    }

    public b O(int i10) {
        return (b) this.f68344l.get(i10);
    }

    public int P() {
        return this.f68344l.size();
    }

    public List Q() {
        return this.f68344l;
    }

    /* renamed from: S */
    public r d() {
        return f68333p;
    }

    public q T() {
        return this.f68342j;
    }

    public int U() {
        return this.f68343k;
    }

    public int V() {
        return this.f68337e;
    }

    public int W() {
        return this.f68338f;
    }

    public s X(int i10) {
        return (s) this.f68339g.get(i10);
    }

    public int Y() {
        return this.f68339g.size();
    }

    public List Z() {
        return this.f68339g;
    }

    public int a() {
        int i10;
        int i11 = this.f68347o;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68336d & 1) == 1) {
            i10 = C6644f.o(1, this.f68337e);
        } else {
            i10 = 0;
        }
        if ((this.f68336d & 2) == 2) {
            i10 += C6644f.o(2, this.f68338f);
        }
        for (int i12 = 0; i12 < this.f68339g.size(); i12++) {
            i10 += C6644f.r(3, (p) this.f68339g.get(i12));
        }
        if ((this.f68336d & 4) == 4) {
            i10 += C6644f.r(4, this.f68340h);
        }
        if ((this.f68336d & 8) == 8) {
            i10 += C6644f.o(5, this.f68341i);
        }
        if ((this.f68336d & 16) == 16) {
            i10 += C6644f.r(6, this.f68342j);
        }
        if ((this.f68336d & 32) == 32) {
            i10 += C6644f.o(7, this.f68343k);
        }
        for (int i13 = 0; i13 < this.f68344l.size(); i13++) {
            i10 += C6644f.r(8, (p) this.f68344l.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f68345m.size(); i15++) {
            i14 += C6644f.p(((Integer) this.f68345m.get(i15)).intValue());
        }
        int size = i10 + i14 + (c0().size() * 2) + t() + this.f68335c.size();
        this.f68347o = size;
        return size;
    }

    public q a0() {
        return this.f68340h;
    }

    public int b0() {
        return this.f68341i;
    }

    public List c0() {
        return this.f68345m;
    }

    public boolean d0() {
        if ((this.f68336d & 16) == 16) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        byte b10 = this.f68346n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!g0()) {
            this.f68346n = 0;
            return false;
        }
        for (int i10 = 0; i10 < Y(); i10++) {
            if (!X(i10).e()) {
                this.f68346n = 0;
                return false;
            }
        }
        if (i0() && !a0().e()) {
            this.f68346n = 0;
            return false;
        } else if (!d0() || T().e()) {
            for (int i11 = 0; i11 < P(); i11++) {
                if (!O(i11).e()) {
                    this.f68346n = 0;
                    return false;
                }
            }
            if (!s()) {
                this.f68346n = 0;
                return false;
            }
            this.f68346n = 1;
            return true;
        } else {
            this.f68346n = 0;
            return false;
        }
    }

    public boolean e0() {
        if ((this.f68336d & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean f0() {
        if ((this.f68336d & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean g0() {
        if ((this.f68336d & 2) == 2) {
            return true;
        }
        return false;
    }

    public void h(C6644f fVar) {
        a();
        C6647i.d.a y10 = y();
        if ((this.f68336d & 1) == 1) {
            fVar.Z(1, this.f68337e);
        }
        if ((this.f68336d & 2) == 2) {
            fVar.Z(2, this.f68338f);
        }
        for (int i10 = 0; i10 < this.f68339g.size(); i10++) {
            fVar.c0(3, (p) this.f68339g.get(i10));
        }
        if ((this.f68336d & 4) == 4) {
            fVar.c0(4, this.f68340h);
        }
        if ((this.f68336d & 8) == 8) {
            fVar.Z(5, this.f68341i);
        }
        if ((this.f68336d & 16) == 16) {
            fVar.c0(6, this.f68342j);
        }
        if ((this.f68336d & 32) == 32) {
            fVar.Z(7, this.f68343k);
        }
        for (int i11 = 0; i11 < this.f68344l.size(); i11++) {
            fVar.c0(8, (p) this.f68344l.get(i11));
        }
        for (int i12 = 0; i12 < this.f68345m.size(); i12++) {
            fVar.Z(31, ((Integer) this.f68345m.get(i12)).intValue());
        }
        y10.a(200, fVar);
        fVar.h0(this.f68335c);
    }

    public boolean i0() {
        if ((this.f68336d & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean j0() {
        if ((this.f68336d & 8) == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    public b c() {
        return l0();
    }

    /* renamed from: p0 */
    public b g() {
        return m0(this);
    }

    private r(C6647i.c cVar) {
        super(cVar);
        this.f68346n = -1;
        this.f68347o = -1;
        this.f68335c = cVar.j();
    }

    private r(boolean z10) {
        this.f68346n = -1;
        this.f68347o = -1;
        this.f68335c = C6642d.f72492a;
    }

    private r(C6643e eVar, C6645g gVar) {
        this.f68346n = -1;
        this.f68347o = -1;
        k0();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int J10 = eVar.J();
                q.c cVar = null;
                switch (J10) {
                    case 0:
                        z10 = true;
                        break;
                    case 8:
                        this.f68336d |= 1;
                        this.f68337e = eVar.r();
                        break;
                    case 16:
                        this.f68336d |= 2;
                        this.f68338f = eVar.r();
                        break;
                    case 26:
                        if (!(z11 & true)) {
                            this.f68339g = new ArrayList();
                            z11 |= true;
                        }
                        this.f68339g.add(eVar.t(s.f68359o, gVar));
                        break;
                    case 34:
                        cVar = (this.f68336d & 4) == 4 ? this.f68340h.g() : cVar;
                        q qVar = (q) eVar.t(q.f68279v, gVar);
                        this.f68340h = qVar;
                        if (cVar != null) {
                            cVar.k(qVar);
                            this.f68340h = cVar.t();
                        }
                        this.f68336d |= 4;
                        break;
                    case 40:
                        this.f68336d |= 8;
                        this.f68341i = eVar.r();
                        break;
                    case 50:
                        cVar = (this.f68336d & 16) == 16 ? this.f68342j.g() : cVar;
                        q qVar2 = (q) eVar.t(q.f68279v, gVar);
                        this.f68342j = qVar2;
                        if (cVar != null) {
                            cVar.k(qVar2);
                            this.f68342j = cVar.t();
                        }
                        this.f68336d |= 16;
                        break;
                    case 56:
                        this.f68336d |= 32;
                        this.f68343k = eVar.r();
                        break;
                    case 66:
                        if (!(z11 & true)) {
                            this.f68344l = new ArrayList();
                            z11 |= true;
                        }
                        this.f68344l.add(eVar.t(b.f67904i, gVar));
                        break;
                    case 248:
                        if (!(z11 & true)) {
                            this.f68345m = new ArrayList();
                            z11 |= true;
                        }
                        this.f68345m.add(Integer.valueOf(eVar.r()));
                        break;
                    case 250:
                        int i10 = eVar.i(eVar.z());
                        if (!(z11 & true) && eVar.e() > 0) {
                            this.f68345m = new ArrayList();
                            z11 |= true;
                        }
                        while (eVar.e() > 0) {
                            this.f68345m.add(Integer.valueOf(eVar.r()));
                        }
                        eVar.h(i10);
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
                if (z11 & true) {
                    this.f68339g = Collections.unmodifiableList(this.f68339g);
                }
                if (z11 & true) {
                    this.f68344l = Collections.unmodifiableList(this.f68344l);
                }
                if (z11 & true) {
                    this.f68345m = Collections.unmodifiableList(this.f68345m);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f68335c = x10.n();
                    throw th3;
                }
                this.f68335c = x10.n();
                m();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f68339g = Collections.unmodifiableList(this.f68339g);
        }
        if (z11 & true) {
            this.f68344l = Collections.unmodifiableList(this.f68344l);
        }
        if (z11 & true) {
            this.f68345m = Collections.unmodifiableList(this.f68345m);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68335c = x10.n();
            throw th4;
        }
        this.f68335c = x10.n();
        m();
    }

    public static final class b extends C6647i.c implements pg.q {

        /* renamed from: d  reason: collision with root package name */
        private int f68348d;

        /* renamed from: e  reason: collision with root package name */
        private int f68349e = 6;

        /* renamed from: f  reason: collision with root package name */
        private int f68350f;

        /* renamed from: g  reason: collision with root package name */
        private List f68351g = Collections.emptyList();

        /* renamed from: h  reason: collision with root package name */
        private q f68352h = q.X();

        /* renamed from: i  reason: collision with root package name */
        private int f68353i;

        /* renamed from: j  reason: collision with root package name */
        private q f68354j = q.X();

        /* renamed from: k  reason: collision with root package name */
        private int f68355k;

        /* renamed from: l  reason: collision with root package name */
        private List f68356l = Collections.emptyList();

        /* renamed from: m  reason: collision with root package name */
        private List f68357m = Collections.emptyList();

        private b() {
            A();
        }

        /* access modifiers changed from: private */
        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f68348d & 128) != 128) {
                this.f68356l = new ArrayList(this.f68356l);
                this.f68348d |= 128;
            }
        }

        private void y() {
            if ((this.f68348d & 4) != 4) {
                this.f68351g = new ArrayList(this.f68351g);
                this.f68348d |= 4;
            }
        }

        private void z() {
            if ((this.f68348d & 256) != 256) {
                this.f68357m = new ArrayList(this.f68357m);
                this.f68348d |= 256;
            }
        }

        public b B(q qVar) {
            if ((this.f68348d & 32) != 32 || this.f68354j == q.X()) {
                this.f68354j = qVar;
            } else {
                this.f68354j = q.z0(this.f68354j).k(qVar).t();
            }
            this.f68348d |= 32;
            return this;
        }

        /* renamed from: C */
        public b k(r rVar) {
            if (rVar == r.R()) {
                return this;
            }
            if (rVar.f0()) {
                G(rVar.V());
            }
            if (rVar.g0()) {
                H(rVar.W());
            }
            if (!rVar.f68339g.isEmpty()) {
                if (this.f68351g.isEmpty()) {
                    this.f68351g = rVar.f68339g;
                    this.f68348d &= -5;
                } else {
                    y();
                    this.f68351g.addAll(rVar.f68339g);
                }
            }
            if (rVar.i0()) {
                E(rVar.a0());
            }
            if (rVar.j0()) {
                I(rVar.b0());
            }
            if (rVar.d0()) {
                B(rVar.T());
            }
            if (rVar.e0()) {
                F(rVar.U());
            }
            if (!rVar.f68344l.isEmpty()) {
                if (this.f68356l.isEmpty()) {
                    this.f68356l = rVar.f68344l;
                    this.f68348d &= -129;
                } else {
                    x();
                    this.f68356l.addAll(rVar.f68344l);
                }
            }
            if (!rVar.f68345m.isEmpty()) {
                if (this.f68357m.isEmpty()) {
                    this.f68357m = rVar.f68345m;
                    this.f68348d &= -257;
                } else {
                    z();
                    this.f68357m.addAll(rVar.f68345m);
                }
            }
            q(rVar);
            l(j().b(rVar.f68335c));
            return this;
        }

        /* renamed from: D */
        public b h0(C6643e eVar, C6645g gVar) {
            r rVar;
            r rVar2 = null;
            try {
                r rVar3 = (r) r.f68334q.b(eVar, gVar);
                if (rVar3 != null) {
                    k(rVar3);
                }
                return this;
            } catch (C6649k e10) {
                rVar = (r) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                rVar2 = rVar;
            }
            if (rVar2 != null) {
                k(rVar2);
            }
            throw th;
        }

        public b E(q qVar) {
            if ((this.f68348d & 8) != 8 || this.f68352h == q.X()) {
                this.f68352h = qVar;
            } else {
                this.f68352h = q.z0(this.f68352h).k(qVar).t();
            }
            this.f68348d |= 8;
            return this;
        }

        public b F(int i10) {
            this.f68348d |= 64;
            this.f68355k = i10;
            return this;
        }

        public b G(int i10) {
            this.f68348d |= 1;
            this.f68349e = i10;
            return this;
        }

        public b H(int i10) {
            this.f68348d |= 2;
            this.f68350f = i10;
            return this;
        }

        public b I(int i10) {
            this.f68348d |= 16;
            this.f68353i = i10;
            return this;
        }

        /* renamed from: s */
        public r f() {
            r t10 = t();
            if (t10.e()) {
                return t10;
            }
            throw C6639a.C1046a.i(t10);
        }

        public r t() {
            r rVar = new r((C6647i.c) this);
            int i10 = this.f68348d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = rVar.f68337e = this.f68349e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = rVar.f68338f = this.f68350f;
            if ((this.f68348d & 4) == 4) {
                this.f68351g = Collections.unmodifiableList(this.f68351g);
                this.f68348d &= -5;
            }
            List unused3 = rVar.f68339g = this.f68351g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            q unused4 = rVar.f68340h = this.f68352h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            int unused5 = rVar.f68341i = this.f68353i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            q unused6 = rVar.f68342j = this.f68354j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            int unused7 = rVar.f68343k = this.f68355k;
            if ((this.f68348d & 128) == 128) {
                this.f68356l = Collections.unmodifiableList(this.f68356l);
                this.f68348d &= -129;
            }
            List unused8 = rVar.f68344l = this.f68356l;
            if ((this.f68348d & 256) == 256) {
                this.f68357m = Collections.unmodifiableList(this.f68357m);
                this.f68348d &= -257;
            }
            List unused9 = rVar.f68345m = this.f68357m;
            int unused10 = rVar.f68336d = i11;
            return rVar;
        }

        /* renamed from: u */
        public b clone() {
            return w().k(t());
        }

        private void A() {
        }
    }
}
