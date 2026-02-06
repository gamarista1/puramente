package ig;

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

public final class g extends C6647i.d implements q {

    /* renamed from: h  reason: collision with root package name */
    private static final g f68089h;

    /* renamed from: i  reason: collision with root package name */
    public static r f68090i = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f68091c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68092d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f68093e;

    /* renamed from: f  reason: collision with root package name */
    private byte f68094f;

    /* renamed from: g  reason: collision with root package name */
    private int f68095g;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public g b(C6643e eVar, C6645g gVar) {
            return new g(eVar, gVar);
        }
    }

    static {
        g gVar = new g(true);
        f68089h = gVar;
        gVar.H();
    }

    public static g D() {
        return f68089h;
    }

    private void H() {
        this.f68093e = 0;
    }

    public static b I() {
        return b.w();
    }

    public static b J(g gVar) {
        return I().k(gVar);
    }

    /* renamed from: E */
    public g d() {
        return f68089h;
    }

    public int F() {
        return this.f68093e;
    }

    public boolean G() {
        if ((this.f68092d & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public b c() {
        return I();
    }

    /* renamed from: L */
    public b g() {
        return J(this);
    }

    public int a() {
        int i10;
        int i11 = this.f68095g;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68092d & 1) == 1) {
            i10 = C6644f.o(1, this.f68093e);
        } else {
            i10 = 0;
        }
        int t10 = i10 + t() + this.f68091c.size();
        this.f68095g = t10;
        return t10;
    }

    public final boolean e() {
        byte b10 = this.f68094f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!s()) {
            this.f68094f = 0;
            return false;
        }
        this.f68094f = 1;
        return true;
    }

    public void h(C6644f fVar) {
        a();
        C6647i.d.a y10 = y();
        if ((this.f68092d & 1) == 1) {
            fVar.Z(1, this.f68093e);
        }
        y10.a(200, fVar);
        fVar.h0(this.f68091c);
    }

    private g(C6647i.c cVar) {
        super(cVar);
        this.f68094f = -1;
        this.f68095g = -1;
        this.f68091c = cVar.j();
    }

    private g(boolean z10) {
        this.f68094f = -1;
        this.f68095g = -1;
        this.f68091c = C6642d.f72492a;
    }

    private g(C6643e eVar, C6645g gVar) {
        this.f68094f = -1;
        this.f68095g = -1;
        H();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                int J10 = eVar.J();
                if (J10 != 0) {
                    if (J10 == 8) {
                        this.f68092d |= 1;
                        this.f68093e = eVar.r();
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
                    this.f68091c = x10.n();
                    throw th3;
                }
                this.f68091c = x10.n();
                m();
                throw th2;
            }
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68091c = x10.n();
            throw th4;
        }
        this.f68091c = x10.n();
        m();
    }

    public static final class b extends C6647i.c implements q {

        /* renamed from: d  reason: collision with root package name */
        private int f68096d;

        /* renamed from: e  reason: collision with root package name */
        private int f68097e;

        private b() {
            x();
        }

        /* access modifiers changed from: private */
        public static b w() {
            return new b();
        }

        public b A(int i10) {
            this.f68096d |= 1;
            this.f68097e = i10;
            return this;
        }

        /* renamed from: s */
        public g f() {
            g t10 = t();
            if (t10.e()) {
                return t10;
            }
            throw C6639a.C1046a.i(t10);
        }

        public g t() {
            g gVar = new g((C6647i.c) this);
            int i10 = 1;
            if ((this.f68096d & 1) != 1) {
                i10 = 0;
            }
            int unused = gVar.f68093e = this.f68097e;
            int unused2 = gVar.f68092d = i10;
            return gVar;
        }

        /* renamed from: u */
        public b clone() {
            return w().k(t());
        }

        /* renamed from: y */
        public b k(g gVar) {
            if (gVar == g.D()) {
                return this;
            }
            if (gVar.G()) {
                A(gVar.F());
            }
            q(gVar);
            l(j().b(gVar.f68091c));
            return this;
        }

        /* renamed from: z */
        public b h0(C6643e eVar, C6645g gVar) {
            g gVar2;
            g gVar3 = null;
            try {
                g gVar4 = (g) g.f68090i.b(eVar, gVar);
                if (gVar4 != null) {
                    k(gVar4);
                }
                return this;
            } catch (C6649k e10) {
                gVar2 = (g) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                gVar3 = gVar2;
            }
            if (gVar3 != null) {
                k(gVar3);
            }
            throw th;
        }

        private void x() {
        }
    }
}
