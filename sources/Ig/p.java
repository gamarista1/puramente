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
import pg.C6651m;
import pg.n;
import pg.q;
import pg.r;
import pg.s;

public final class p extends C6647i implements q {

    /* renamed from: f  reason: collision with root package name */
    private static final p f68270f;

    /* renamed from: g  reason: collision with root package name */
    public static r f68271g = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6642d f68272b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public n f68273c;

    /* renamed from: d  reason: collision with root package name */
    private byte f68274d;

    /* renamed from: e  reason: collision with root package name */
    private int f68275e;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public p b(C6643e eVar, C6645g gVar) {
            return new p(eVar, gVar);
        }
    }

    static {
        p pVar = new p(true);
        f68270f = pVar;
        pVar.x();
    }

    public static p u() {
        return f68270f;
    }

    private void x() {
        this.f68273c = C6651m.f72551b;
    }

    public static b y() {
        return b.r();
    }

    public static b z(p pVar) {
        return y().k(pVar);
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
        int i10 = this.f68275e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f68273c.size(); i12++) {
            i11 += C6644f.e(this.f68273c.G(i12));
        }
        int size = i11 + w().size() + this.f68272b.size();
        this.f68275e = size;
        return size;
    }

    public final boolean e() {
        byte b10 = this.f68274d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f68274d = 1;
        return true;
    }

    public void h(C6644f fVar) {
        a();
        for (int i10 = 0; i10 < this.f68273c.size(); i10++) {
            fVar.N(1, this.f68273c.G(i10));
        }
        fVar.h0(this.f68272b);
    }

    public String v(int i10) {
        return (String) this.f68273c.get(i10);
    }

    public s w() {
        return this.f68273c;
    }

    private p(C6647i.b bVar) {
        super(bVar);
        this.f68274d = -1;
        this.f68275e = -1;
        this.f68272b = bVar.j();
    }

    private p(boolean z10) {
        this.f68274d = -1;
        this.f68275e = -1;
        this.f68272b = C6642d.f72492a;
    }

    private p(C6643e eVar, C6645g gVar) {
        this.f68274d = -1;
        this.f68275e = -1;
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
                        C6642d k10 = eVar.k();
                        if (!z11) {
                            this.f68273c = new C6651m();
                            z11 = true;
                        }
                        this.f68273c.d0(k10);
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
                    this.f68273c = this.f68273c.j();
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f68272b = x10.n();
                    throw th3;
                }
                this.f68272b = x10.n();
                m();
                throw th2;
            }
        }
        if (z11) {
            this.f68273c = this.f68273c.j();
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68272b = x10.n();
            throw th4;
        }
        this.f68272b = x10.n();
        m();
    }

    public static final class b extends C6647i.b implements q {

        /* renamed from: b  reason: collision with root package name */
        private int f68276b;

        /* renamed from: c  reason: collision with root package name */
        private n f68277c = C6651m.f72551b;

        private b() {
            t();
        }

        /* access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f68276b & 1) != 1) {
                this.f68277c = new C6651m(this.f68277c);
                this.f68276b |= 1;
            }
        }

        /* renamed from: o */
        public p f() {
            p p10 = p();
            if (p10.e()) {
                return p10;
            }
            throw C6639a.C1046a.i(p10);
        }

        public p p() {
            p pVar = new p((C6647i.b) this);
            if ((this.f68276b & 1) == 1) {
                this.f68277c = this.f68277c.j();
                this.f68276b &= -2;
            }
            n unused = pVar.f68273c = this.f68277c;
            return pVar;
        }

        /* renamed from: q */
        public b clone() {
            return r().k(p());
        }

        /* renamed from: u */
        public b k(p pVar) {
            if (pVar == p.u()) {
                return this;
            }
            if (!pVar.f68273c.isEmpty()) {
                if (this.f68277c.isEmpty()) {
                    this.f68277c = pVar.f68273c;
                    this.f68276b &= -2;
                } else {
                    s();
                    this.f68277c.addAll(pVar.f68273c);
                }
            }
            l(j().b(pVar.f68272b));
            return this;
        }

        /* renamed from: w */
        public b h0(C6643e eVar, C6645g gVar) {
            p pVar;
            p pVar2 = null;
            try {
                p pVar3 = (p) p.f68271g.b(eVar, gVar);
                if (pVar3 != null) {
                    k(pVar3);
                }
                return this;
            } catch (C6649k e10) {
                pVar = (p) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                pVar2 = pVar;
            }
            if (pVar2 != null) {
                k(pVar2);
            }
            throw th;
        }

        private void t() {
        }
    }
}
