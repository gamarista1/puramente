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
import pg.q;
import pg.r;

public final class o extends C6647i implements q {

    /* renamed from: f  reason: collision with root package name */
    private static final o f68243f;

    /* renamed from: g  reason: collision with root package name */
    public static r f68244g = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6642d f68245b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List f68246c;

    /* renamed from: d  reason: collision with root package name */
    private byte f68247d;

    /* renamed from: e  reason: collision with root package name */
    private int f68248e;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public o b(C6643e eVar, C6645g gVar) {
            return new o(eVar, gVar);
        }
    }

    static {
        o oVar = new o(true);
        f68243f = oVar;
        oVar.x();
    }

    public static o u() {
        return f68243f;
    }

    private void x() {
        this.f68246c = Collections.emptyList();
    }

    public static b y() {
        return b.r();
    }

    public static b z(o oVar) {
        return y().k(oVar);
    }

    /* renamed from: A */
    public b c() {
        return y();
    }

    /* renamed from: B */
    public b g() {
        return z(this);
    }

    public int a() {
        int i10 = this.f68248e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f68246c.size(); i12++) {
            i11 += C6644f.r(1, (p) this.f68246c.get(i12));
        }
        int size = i11 + this.f68245b.size();
        this.f68248e = size;
        return size;
    }

    public final boolean e() {
        byte b10 = this.f68247d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < w(); i10++) {
            if (!v(i10).e()) {
                this.f68247d = 0;
                return false;
            }
        }
        this.f68247d = 1;
        return true;
    }

    public void h(C6644f fVar) {
        a();
        for (int i10 = 0; i10 < this.f68246c.size(); i10++) {
            fVar.c0(1, (p) this.f68246c.get(i10));
        }
        fVar.h0(this.f68245b);
    }

    public c v(int i10) {
        return (c) this.f68246c.get(i10);
    }

    public int w() {
        return this.f68246c.size();
    }

    public static final class c extends C6647i implements q {

        /* renamed from: i  reason: collision with root package name */
        private static final c f68251i;

        /* renamed from: j  reason: collision with root package name */
        public static r f68252j = new a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C6642d f68253b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f68254c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f68255d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f68256e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public C1018c f68257f;

        /* renamed from: g  reason: collision with root package name */
        private byte f68258g;

        /* renamed from: h  reason: collision with root package name */
        private int f68259h;

        static class a extends C6640b {
            a() {
            }

            /* renamed from: j */
            public c b(C6643e eVar, C6645g gVar) {
                return new c(eVar, gVar);
            }
        }

        /* renamed from: ig.o$c$c  reason: collision with other inner class name */
        public enum C1018c implements C6648j.a {
            CLASS(0, 0),
            f68265c(1, 1),
            LOCAL(2, 2);
            

            /* renamed from: e  reason: collision with root package name */
            private static C6648j.b f68267e;

            /* renamed from: a  reason: collision with root package name */
            private final int f68269a;

            /* renamed from: ig.o$c$c$a */
            static class a implements C6648j.b {
                a() {
                }

                /* renamed from: b */
                public C1018c a(int i10) {
                    return C1018c.a(i10);
                }
            }

            static {
                f68267e = new a();
            }

            private C1018c(int i10, int i11) {
                this.f68269a = i11;
            }

            public static C1018c a(int i10) {
                if (i10 == 0) {
                    return CLASS;
                }
                if (i10 == 1) {
                    return f68265c;
                }
                if (i10 != 2) {
                    return null;
                }
                return LOCAL;
            }

            public final int d() {
                return this.f68269a;
            }
        }

        static {
            c cVar = new c(true);
            f68251i = cVar;
            cVar.D();
        }

        private void D() {
            this.f68255d = -1;
            this.f68256e = 0;
            this.f68257f = C1018c.f68265c;
        }

        public static b E() {
            return b.r();
        }

        public static b F(c cVar) {
            return E().k(cVar);
        }

        public static c w() {
            return f68251i;
        }

        public boolean A() {
            if ((this.f68254c & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean B() {
            if ((this.f68254c & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean C() {
            if ((this.f68254c & 2) == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: G */
        public b c() {
            return E();
        }

        /* renamed from: H */
        public b g() {
            return F(this);
        }

        public int a() {
            int i10;
            int i11 = this.f68259h;
            if (i11 != -1) {
                return i11;
            }
            if ((this.f68254c & 1) == 1) {
                i10 = C6644f.o(1, this.f68255d);
            } else {
                i10 = 0;
            }
            if ((this.f68254c & 2) == 2) {
                i10 += C6644f.o(2, this.f68256e);
            }
            if ((this.f68254c & 4) == 4) {
                i10 += C6644f.h(3, this.f68257f.d());
            }
            int size = i10 + this.f68253b.size();
            this.f68259h = size;
            return size;
        }

        public final boolean e() {
            byte b10 = this.f68258g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!C()) {
                this.f68258g = 0;
                return false;
            }
            this.f68258g = 1;
            return true;
        }

        public void h(C6644f fVar) {
            a();
            if ((this.f68254c & 1) == 1) {
                fVar.Z(1, this.f68255d);
            }
            if ((this.f68254c & 2) == 2) {
                fVar.Z(2, this.f68256e);
            }
            if ((this.f68254c & 4) == 4) {
                fVar.R(3, this.f68257f.d());
            }
            fVar.h0(this.f68253b);
        }

        public C1018c x() {
            return this.f68257f;
        }

        public int y() {
            return this.f68255d;
        }

        public int z() {
            return this.f68256e;
        }

        private c(C6647i.b bVar) {
            super(bVar);
            this.f68258g = -1;
            this.f68259h = -1;
            this.f68253b = bVar.j();
        }

        private c(boolean z10) {
            this.f68258g = -1;
            this.f68259h = -1;
            this.f68253b = C6642d.f72492a;
        }

        private c(C6643e eVar, C6645g gVar) {
            this.f68258g = -1;
            this.f68259h = -1;
            D();
            C6642d.b x10 = C6642d.x();
            C6644f I10 = C6644f.I(x10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 8) {
                            this.f68254c |= 1;
                            this.f68255d = eVar.r();
                        } else if (J10 == 16) {
                            this.f68254c |= 2;
                            this.f68256e = eVar.r();
                        } else if (J10 == 24) {
                            int m10 = eVar.m();
                            C1018c a10 = C1018c.a(m10);
                            if (a10 == null) {
                                I10.n0(J10);
                                I10.n0(m10);
                            } else {
                                this.f68254c |= 4;
                                this.f68257f = a10;
                            }
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
                        this.f68253b = x10.n();
                        throw th3;
                    }
                    this.f68253b = x10.n();
                    m();
                    throw th2;
                }
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f68253b = x10.n();
                throw th4;
            }
            this.f68253b = x10.n();
            m();
        }

        public static final class b extends C6647i.b implements q {

            /* renamed from: b  reason: collision with root package name */
            private int f68260b;

            /* renamed from: c  reason: collision with root package name */
            private int f68261c = -1;

            /* renamed from: d  reason: collision with root package name */
            private int f68262d;

            /* renamed from: e  reason: collision with root package name */
            private C1018c f68263e = C1018c.f68265c;

            private b() {
                s();
            }

            /* access modifiers changed from: private */
            public static b r() {
                return new b();
            }

            /* renamed from: o */
            public c f() {
                c p10 = p();
                if (p10.e()) {
                    return p10;
                }
                throw C6639a.C1046a.i(p10);
            }

            public c p() {
                c cVar = new c((C6647i.b) this);
                int i10 = this.f68260b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                int unused = cVar.f68255d = this.f68261c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                int unused2 = cVar.f68256e = this.f68262d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                C1018c unused3 = cVar.f68257f = this.f68263e;
                int unused4 = cVar.f68254c = i11;
                return cVar;
            }

            /* renamed from: q */
            public b clone() {
                return r().k(p());
            }

            /* renamed from: t */
            public b k(c cVar) {
                if (cVar == c.w()) {
                    return this;
                }
                if (cVar.B()) {
                    x(cVar.y());
                }
                if (cVar.C()) {
                    y(cVar.z());
                }
                if (cVar.A()) {
                    w(cVar.x());
                }
                l(j().b(cVar.f68253b));
                return this;
            }

            /* renamed from: u */
            public b h0(C6643e eVar, C6645g gVar) {
                c cVar;
                c cVar2 = null;
                try {
                    c cVar3 = (c) c.f68252j.b(eVar, gVar);
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

            public b w(C1018c cVar) {
                cVar.getClass();
                this.f68260b |= 4;
                this.f68263e = cVar;
                return this;
            }

            public b x(int i10) {
                this.f68260b |= 1;
                this.f68261c = i10;
                return this;
            }

            public b y(int i10) {
                this.f68260b |= 2;
                this.f68262d = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    private o(C6647i.b bVar) {
        super(bVar);
        this.f68247d = -1;
        this.f68248e = -1;
        this.f68245b = bVar.j();
    }

    private o(boolean z10) {
        this.f68247d = -1;
        this.f68248e = -1;
        this.f68245b = C6642d.f72492a;
    }

    private o(C6643e eVar, C6645g gVar) {
        this.f68247d = -1;
        this.f68248e = -1;
        x();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int J10 = eVar.J();
                if (J10 != 0) {
                    if (J10 == 10) {
                        if (!z11) {
                            this.f68246c = new ArrayList();
                            z11 = true;
                        }
                        this.f68246c.add(eVar.t(c.f68252j, gVar));
                    } else if (p(eVar, I10, gVar, J10)) {
                    }
                }
                z10 = true;
            } catch (C6649k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C6649k(e11.getMessage()).i(this);
            } catch (Throwable th2) {
                if (z11) {
                    this.f68246c = Collections.unmodifiableList(this.f68246c);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f68245b = x10.n();
                    throw th3;
                }
                this.f68245b = x10.n();
                m();
                throw th2;
            }
        }
        if (z11) {
            this.f68246c = Collections.unmodifiableList(this.f68246c);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68245b = x10.n();
            throw th4;
        }
        this.f68245b = x10.n();
        m();
    }

    public static final class b extends C6647i.b implements q {

        /* renamed from: b  reason: collision with root package name */
        private int f68249b;

        /* renamed from: c  reason: collision with root package name */
        private List f68250c = Collections.emptyList();

        private b() {
            t();
        }

        /* access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f68249b & 1) != 1) {
                this.f68250c = new ArrayList(this.f68250c);
                this.f68249b |= 1;
            }
        }

        /* renamed from: o */
        public o f() {
            o p10 = p();
            if (p10.e()) {
                return p10;
            }
            throw C6639a.C1046a.i(p10);
        }

        public o p() {
            o oVar = new o((C6647i.b) this);
            if ((this.f68249b & 1) == 1) {
                this.f68250c = Collections.unmodifiableList(this.f68250c);
                this.f68249b &= -2;
            }
            List unused = oVar.f68246c = this.f68250c;
            return oVar;
        }

        /* renamed from: q */
        public b clone() {
            return r().k(p());
        }

        /* renamed from: u */
        public b k(o oVar) {
            if (oVar == o.u()) {
                return this;
            }
            if (!oVar.f68246c.isEmpty()) {
                if (this.f68250c.isEmpty()) {
                    this.f68250c = oVar.f68246c;
                    this.f68249b &= -2;
                } else {
                    s();
                    this.f68250c.addAll(oVar.f68246c);
                }
            }
            l(j().b(oVar.f68245b));
            return this;
        }

        /* renamed from: w */
        public b h0(C6643e eVar, C6645g gVar) {
            o oVar;
            o oVar2 = null;
            try {
                o oVar3 = (o) o.f68244g.b(eVar, gVar);
                if (oVar3 != null) {
                    k(oVar3);
                }
                return this;
            } catch (C6649k e10) {
                oVar = (o) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                oVar2 = oVar;
            }
            if (oVar2 != null) {
                k(oVar2);
            }
            throw th;
        }

        private void t() {
        }
    }
}
