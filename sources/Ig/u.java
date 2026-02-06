package ig;

import ig.q;
import java.io.IOException;
import pg.C6639a;
import pg.C6640b;
import pg.C6642d;
import pg.C6643e;
import pg.C6644f;
import pg.C6645g;
import pg.C6647i;
import pg.C6649k;
import pg.q;
import pg.r;

public final class u extends C6647i.d implements q {

    /* renamed from: m  reason: collision with root package name */
    private static final u f68395m;

    /* renamed from: n  reason: collision with root package name */
    public static r f68396n = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f68397c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68398d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f68399e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f68400f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public q f68401g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f68402h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public q f68403i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f68404j;

    /* renamed from: k  reason: collision with root package name */
    private byte f68405k;

    /* renamed from: l  reason: collision with root package name */
    private int f68406l;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public u b(C6643e eVar, C6645g gVar) {
            return new u(eVar, gVar);
        }
    }

    static {
        u uVar = new u(true);
        f68395m = uVar;
        uVar.W();
    }

    public static u I() {
        return f68395m;
    }

    private void W() {
        this.f68399e = 0;
        this.f68400f = 0;
        this.f68401g = q.X();
        this.f68402h = 0;
        this.f68403i = q.X();
        this.f68404j = 0;
    }

    public static b X() {
        return b.w();
    }

    public static b Y(u uVar) {
        return X().k(uVar);
    }

    /* renamed from: J */
    public u d() {
        return f68395m;
    }

    public int K() {
        return this.f68399e;
    }

    public int L() {
        return this.f68400f;
    }

    public q M() {
        return this.f68401g;
    }

    public int N() {
        return this.f68402h;
    }

    public q O() {
        return this.f68403i;
    }

    public int P() {
        return this.f68404j;
    }

    public boolean Q() {
        if ((this.f68398d & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean R() {
        if ((this.f68398d & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean S() {
        if ((this.f68398d & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean T() {
        if ((this.f68398d & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean U() {
        if ((this.f68398d & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean V() {
        if ((this.f68398d & 32) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public b c() {
        return X();
    }

    public int a() {
        int i10;
        int i11 = this.f68406l;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68398d & 1) == 1) {
            i10 = C6644f.o(1, this.f68399e);
        } else {
            i10 = 0;
        }
        if ((this.f68398d & 2) == 2) {
            i10 += C6644f.o(2, this.f68400f);
        }
        if ((this.f68398d & 4) == 4) {
            i10 += C6644f.r(3, this.f68401g);
        }
        if ((this.f68398d & 16) == 16) {
            i10 += C6644f.r(4, this.f68403i);
        }
        if ((this.f68398d & 8) == 8) {
            i10 += C6644f.o(5, this.f68402h);
        }
        if ((this.f68398d & 32) == 32) {
            i10 += C6644f.o(6, this.f68404j);
        }
        int t10 = i10 + t() + this.f68397c.size();
        this.f68406l = t10;
        return t10;
    }

    /* renamed from: a0 */
    public b g() {
        return Y(this);
    }

    public final boolean e() {
        byte b10 = this.f68405k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!R()) {
            this.f68405k = 0;
            return false;
        } else if (S() && !M().e()) {
            this.f68405k = 0;
            return false;
        } else if (U() && !O().e()) {
            this.f68405k = 0;
            return false;
        } else if (!s()) {
            this.f68405k = 0;
            return false;
        } else {
            this.f68405k = 1;
            return true;
        }
    }

    public void h(C6644f fVar) {
        a();
        C6647i.d.a y10 = y();
        if ((this.f68398d & 1) == 1) {
            fVar.Z(1, this.f68399e);
        }
        if ((this.f68398d & 2) == 2) {
            fVar.Z(2, this.f68400f);
        }
        if ((this.f68398d & 4) == 4) {
            fVar.c0(3, this.f68401g);
        }
        if ((this.f68398d & 16) == 16) {
            fVar.c0(4, this.f68403i);
        }
        if ((this.f68398d & 8) == 8) {
            fVar.Z(5, this.f68402h);
        }
        if ((this.f68398d & 32) == 32) {
            fVar.Z(6, this.f68404j);
        }
        y10.a(200, fVar);
        fVar.h0(this.f68397c);
    }

    private u(C6647i.c cVar) {
        super(cVar);
        this.f68405k = -1;
        this.f68406l = -1;
        this.f68397c = cVar.j();
    }

    private u(boolean z10) {
        this.f68405k = -1;
        this.f68406l = -1;
        this.f68397c = C6642d.f72492a;
    }

    private u(C6643e eVar, C6645g gVar) {
        this.f68405k = -1;
        this.f68406l = -1;
        W();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                int J10 = eVar.J();
                if (J10 != 0) {
                    if (J10 == 8) {
                        this.f68398d |= 1;
                        this.f68399e = eVar.r();
                    } else if (J10 != 16) {
                        q.c cVar = null;
                        if (J10 == 26) {
                            cVar = (this.f68398d & 4) == 4 ? this.f68401g.g() : cVar;
                            q qVar = (q) eVar.t(q.f68279v, gVar);
                            this.f68401g = qVar;
                            if (cVar != null) {
                                cVar.k(qVar);
                                this.f68401g = cVar.t();
                            }
                            this.f68398d |= 4;
                        } else if (J10 == 34) {
                            cVar = (this.f68398d & 16) == 16 ? this.f68403i.g() : cVar;
                            q qVar2 = (q) eVar.t(q.f68279v, gVar);
                            this.f68403i = qVar2;
                            if (cVar != null) {
                                cVar.k(qVar2);
                                this.f68403i = cVar.t();
                            }
                            this.f68398d |= 16;
                        } else if (J10 == 40) {
                            this.f68398d |= 8;
                            this.f68402h = eVar.r();
                        } else if (J10 == 48) {
                            this.f68398d |= 32;
                            this.f68404j = eVar.r();
                        } else if (p(eVar, I10, gVar, J10)) {
                        }
                    } else {
                        this.f68398d |= 2;
                        this.f68400f = eVar.r();
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
                    this.f68397c = x10.n();
                    throw th3;
                }
                this.f68397c = x10.n();
                m();
                throw th2;
            }
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68397c = x10.n();
            throw th4;
        }
        this.f68397c = x10.n();
        m();
    }

    public static final class b extends C6647i.c implements pg.q {

        /* renamed from: d  reason: collision with root package name */
        private int f68407d;

        /* renamed from: e  reason: collision with root package name */
        private int f68408e;

        /* renamed from: f  reason: collision with root package name */
        private int f68409f;

        /* renamed from: g  reason: collision with root package name */
        private q f68410g = q.X();

        /* renamed from: h  reason: collision with root package name */
        private int f68411h;

        /* renamed from: i  reason: collision with root package name */
        private q f68412i = q.X();

        /* renamed from: j  reason: collision with root package name */
        private int f68413j;

        private b() {
            x();
        }

        /* access modifiers changed from: private */
        public static b w() {
            return new b();
        }

        public b A(q qVar) {
            if ((this.f68407d & 4) != 4 || this.f68410g == q.X()) {
                this.f68410g = qVar;
            } else {
                this.f68410g = q.z0(this.f68410g).k(qVar).t();
            }
            this.f68407d |= 4;
            return this;
        }

        public b B(q qVar) {
            if ((this.f68407d & 16) != 16 || this.f68412i == q.X()) {
                this.f68412i = qVar;
            } else {
                this.f68412i = q.z0(this.f68412i).k(qVar).t();
            }
            this.f68407d |= 16;
            return this;
        }

        public b C(int i10) {
            this.f68407d |= 1;
            this.f68408e = i10;
            return this;
        }

        public b D(int i10) {
            this.f68407d |= 2;
            this.f68409f = i10;
            return this;
        }

        public b E(int i10) {
            this.f68407d |= 8;
            this.f68411h = i10;
            return this;
        }

        public b F(int i10) {
            this.f68407d |= 32;
            this.f68413j = i10;
            return this;
        }

        /* renamed from: s */
        public u f() {
            u t10 = t();
            if (t10.e()) {
                return t10;
            }
            throw C6639a.C1046a.i(t10);
        }

        public u t() {
            u uVar = new u((C6647i.c) this);
            int i10 = this.f68407d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = uVar.f68399e = this.f68408e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = uVar.f68400f = this.f68409f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            q unused3 = uVar.f68401g = this.f68410g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            int unused4 = uVar.f68402h = this.f68411h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            q unused5 = uVar.f68403i = this.f68412i;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            int unused6 = uVar.f68404j = this.f68413j;
            int unused7 = uVar.f68398d = i11;
            return uVar;
        }

        /* renamed from: u */
        public b clone() {
            return w().k(t());
        }

        /* renamed from: y */
        public b k(u uVar) {
            if (uVar == u.I()) {
                return this;
            }
            if (uVar.Q()) {
                C(uVar.K());
            }
            if (uVar.R()) {
                D(uVar.L());
            }
            if (uVar.S()) {
                A(uVar.M());
            }
            if (uVar.T()) {
                E(uVar.N());
            }
            if (uVar.U()) {
                B(uVar.O());
            }
            if (uVar.V()) {
                F(uVar.P());
            }
            q(uVar);
            l(j().b(uVar.f68397c));
            return this;
        }

        /* renamed from: z */
        public b h0(C6643e eVar, C6645g gVar) {
            u uVar;
            u uVar2 = null;
            try {
                u uVar3 = (u) u.f68396n.b(eVar, gVar);
                if (uVar3 != null) {
                    k(uVar3);
                }
                return this;
            } catch (C6649k e10) {
                uVar = (u) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                uVar2 = uVar;
            }
            if (uVar2 != null) {
                k(uVar2);
            }
            throw th;
        }

        private void x() {
        }
    }
}
