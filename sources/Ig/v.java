package ig;

import java.io.IOException;
import pg.C6639a;
import pg.C6640b;
import pg.C6642d;
import pg.C6643e;
import pg.C6644f;
import pg.C6645g;
import pg.C6647i;
import pg.C6648j;
import pg.C6649k;
import pg.q;
import pg.r;

public final class v extends C6647i implements q {

    /* renamed from: l  reason: collision with root package name */
    private static final v f68414l;

    /* renamed from: m  reason: collision with root package name */
    public static r f68415m = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6642d f68416b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f68417c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68418d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f68419e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c f68420f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f68421g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f68422h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public d f68423i;

    /* renamed from: j  reason: collision with root package name */
    private byte f68424j;

    /* renamed from: k  reason: collision with root package name */
    private int f68425k;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public v b(C6643e eVar, C6645g gVar) {
            return new v(eVar, gVar);
        }
    }

    public enum c implements C6648j.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        

        /* renamed from: e  reason: collision with root package name */
        private static C6648j.b f68436e;

        /* renamed from: a  reason: collision with root package name */
        private final int f68438a;

        static class a implements C6648j.b {
            a() {
            }

            /* renamed from: b */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        static {
            f68436e = new a();
        }

        private c(int i10, int i11) {
            this.f68438a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return WARNING;
            }
            if (i10 == 1) {
                return ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return HIDDEN;
        }

        public final int d() {
            return this.f68438a;
        }
    }

    public enum d implements C6648j.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        

        /* renamed from: e  reason: collision with root package name */
        private static C6648j.b f68442e;

        /* renamed from: a  reason: collision with root package name */
        private final int f68444a;

        static class a implements C6648j.b {
            a() {
            }

            /* renamed from: b */
            public d a(int i10) {
                return d.a(i10);
            }
        }

        static {
            f68442e = new a();
        }

        private d(int i10, int i11) {
            this.f68444a = i11;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i10 == 1) {
                return COMPILER_VERSION;
            }
            if (i10 != 2) {
                return null;
            }
            return API_VERSION;
        }

        public final int d() {
            return this.f68444a;
        }
    }

    static {
        v vVar = new v(true);
        f68414l = vVar;
        vVar.M();
    }

    private void M() {
        this.f68418d = 0;
        this.f68419e = 0;
        this.f68420f = c.ERROR;
        this.f68421g = 0;
        this.f68422h = 0;
        this.f68423i = d.LANGUAGE_VERSION;
    }

    public static b N() {
        return b.r();
    }

    public static b O(v vVar) {
        return N().k(vVar);
    }

    public static v z() {
        return f68414l;
    }

    public int A() {
        return this.f68421g;
    }

    public c B() {
        return this.f68420f;
    }

    public int C() {
        return this.f68422h;
    }

    public int D() {
        return this.f68418d;
    }

    public int E() {
        return this.f68419e;
    }

    public d F() {
        return this.f68423i;
    }

    public boolean G() {
        if ((this.f68417c & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean H() {
        if ((this.f68417c & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean I() {
        if ((this.f68417c & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean J() {
        if ((this.f68417c & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean K() {
        if ((this.f68417c & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean L() {
        if ((this.f68417c & 32) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public b c() {
        return N();
    }

    /* renamed from: Q */
    public b g() {
        return O(this);
    }

    public int a() {
        int i10;
        int i11 = this.f68425k;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68417c & 1) == 1) {
            i10 = C6644f.o(1, this.f68418d);
        } else {
            i10 = 0;
        }
        if ((this.f68417c & 2) == 2) {
            i10 += C6644f.o(2, this.f68419e);
        }
        if ((this.f68417c & 4) == 4) {
            i10 += C6644f.h(3, this.f68420f.d());
        }
        if ((this.f68417c & 8) == 8) {
            i10 += C6644f.o(4, this.f68421g);
        }
        if ((this.f68417c & 16) == 16) {
            i10 += C6644f.o(5, this.f68422h);
        }
        if ((this.f68417c & 32) == 32) {
            i10 += C6644f.h(6, this.f68423i.d());
        }
        int size = i10 + this.f68416b.size();
        this.f68425k = size;
        return size;
    }

    public final boolean e() {
        byte b10 = this.f68424j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f68424j = 1;
        return true;
    }

    public void h(C6644f fVar) {
        a();
        if ((this.f68417c & 1) == 1) {
            fVar.Z(1, this.f68418d);
        }
        if ((this.f68417c & 2) == 2) {
            fVar.Z(2, this.f68419e);
        }
        if ((this.f68417c & 4) == 4) {
            fVar.R(3, this.f68420f.d());
        }
        if ((this.f68417c & 8) == 8) {
            fVar.Z(4, this.f68421g);
        }
        if ((this.f68417c & 16) == 16) {
            fVar.Z(5, this.f68422h);
        }
        if ((this.f68417c & 32) == 32) {
            fVar.R(6, this.f68423i.d());
        }
        fVar.h0(this.f68416b);
    }

    private v(C6647i.b bVar) {
        super(bVar);
        this.f68424j = -1;
        this.f68425k = -1;
        this.f68416b = bVar.j();
    }

    private v(boolean z10) {
        this.f68424j = -1;
        this.f68425k = -1;
        this.f68416b = C6642d.f72492a;
    }

    private v(C6643e eVar, C6645g gVar) {
        this.f68424j = -1;
        this.f68425k = -1;
        M();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                int J10 = eVar.J();
                if (J10 != 0) {
                    if (J10 == 8) {
                        this.f68417c |= 1;
                        this.f68418d = eVar.r();
                    } else if (J10 == 16) {
                        this.f68417c |= 2;
                        this.f68419e = eVar.r();
                    } else if (J10 == 24) {
                        int m10 = eVar.m();
                        c a10 = c.a(m10);
                        if (a10 == null) {
                            I10.n0(J10);
                            I10.n0(m10);
                        } else {
                            this.f68417c |= 4;
                            this.f68420f = a10;
                        }
                    } else if (J10 == 32) {
                        this.f68417c |= 8;
                        this.f68421g = eVar.r();
                    } else if (J10 == 40) {
                        this.f68417c |= 16;
                        this.f68422h = eVar.r();
                    } else if (J10 == 48) {
                        int m11 = eVar.m();
                        d a11 = d.a(m11);
                        if (a11 == null) {
                            I10.n0(J10);
                            I10.n0(m11);
                        } else {
                            this.f68417c |= 32;
                            this.f68423i = a11;
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
                    this.f68416b = x10.n();
                    throw th3;
                }
                this.f68416b = x10.n();
                m();
                throw th2;
            }
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68416b = x10.n();
            throw th4;
        }
        this.f68416b = x10.n();
        m();
    }

    public static final class b extends C6647i.b implements q {

        /* renamed from: b  reason: collision with root package name */
        private int f68426b;

        /* renamed from: c  reason: collision with root package name */
        private int f68427c;

        /* renamed from: d  reason: collision with root package name */
        private int f68428d;

        /* renamed from: e  reason: collision with root package name */
        private c f68429e = c.ERROR;

        /* renamed from: f  reason: collision with root package name */
        private int f68430f;

        /* renamed from: g  reason: collision with root package name */
        private int f68431g;

        /* renamed from: h  reason: collision with root package name */
        private d f68432h = d.LANGUAGE_VERSION;

        private b() {
            s();
        }

        /* access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        public b A(int i10) {
            this.f68426b |= 2;
            this.f68428d = i10;
            return this;
        }

        public b B(d dVar) {
            dVar.getClass();
            this.f68426b |= 32;
            this.f68432h = dVar;
            return this;
        }

        /* renamed from: o */
        public v f() {
            v p10 = p();
            if (p10.e()) {
                return p10;
            }
            throw C6639a.C1046a.i(p10);
        }

        public v p() {
            v vVar = new v((C6647i.b) this);
            int i10 = this.f68426b;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = vVar.f68418d = this.f68427c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = vVar.f68419e = this.f68428d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c unused3 = vVar.f68420f = this.f68429e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            int unused4 = vVar.f68421g = this.f68430f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            int unused5 = vVar.f68422h = this.f68431g;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            d unused6 = vVar.f68423i = this.f68432h;
            int unused7 = vVar.f68417c = i11;
            return vVar;
        }

        /* renamed from: q */
        public b clone() {
            return r().k(p());
        }

        /* renamed from: t */
        public b k(v vVar) {
            if (vVar == v.z()) {
                return this;
            }
            if (vVar.J()) {
                z(vVar.D());
            }
            if (vVar.K()) {
                A(vVar.E());
            }
            if (vVar.H()) {
                x(vVar.B());
            }
            if (vVar.G()) {
                w(vVar.A());
            }
            if (vVar.I()) {
                y(vVar.C());
            }
            if (vVar.L()) {
                B(vVar.F());
            }
            l(j().b(vVar.f68416b));
            return this;
        }

        /* renamed from: u */
        public b h0(C6643e eVar, C6645g gVar) {
            v vVar;
            v vVar2 = null;
            try {
                v vVar3 = (v) v.f68415m.b(eVar, gVar);
                if (vVar3 != null) {
                    k(vVar3);
                }
                return this;
            } catch (C6649k e10) {
                vVar = (v) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                vVar2 = vVar;
            }
            if (vVar2 != null) {
                k(vVar2);
            }
            throw th;
        }

        public b w(int i10) {
            this.f68426b |= 8;
            this.f68430f = i10;
            return this;
        }

        public b x(c cVar) {
            cVar.getClass();
            this.f68426b |= 4;
            this.f68429e = cVar;
            return this;
        }

        public b y(int i10) {
            this.f68426b |= 16;
            this.f68431g = i10;
            return this;
        }

        public b z(int i10) {
            this.f68426b |= 1;
            this.f68427c = i10;
            return this;
        }

        private void s() {
        }
    }
}
