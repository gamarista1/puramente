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
import pg.C6649k;
import pg.p;
import pg.q;
import pg.r;

public final class t extends C6647i implements q {

    /* renamed from: h  reason: collision with root package name */
    private static final t f68384h;

    /* renamed from: i  reason: collision with root package name */
    public static r f68385i = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6642d f68386b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f68387c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public List f68388d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f68389e;

    /* renamed from: f  reason: collision with root package name */
    private byte f68390f;

    /* renamed from: g  reason: collision with root package name */
    private int f68391g;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public t b(C6643e eVar, C6645g gVar) {
            return new t(eVar, gVar);
        }
    }

    static {
        t tVar = new t(true);
        f68384h = tVar;
        tVar.C();
    }

    private void C() {
        this.f68388d = Collections.emptyList();
        this.f68389e = -1;
    }

    public static b D() {
        return b.r();
    }

    public static b E(t tVar) {
        return D().k(tVar);
    }

    public static t w() {
        return f68384h;
    }

    public List A() {
        return this.f68388d;
    }

    public boolean B() {
        if ((this.f68387c & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public b c() {
        return D();
    }

    /* renamed from: G */
    public b g() {
        return E(this);
    }

    public int a() {
        int i10 = this.f68391g;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f68388d.size(); i12++) {
            i11 += C6644f.r(1, (p) this.f68388d.get(i12));
        }
        if ((this.f68387c & 1) == 1) {
            i11 += C6644f.o(2, this.f68389e);
        }
        int size = i11 + this.f68386b.size();
        this.f68391g = size;
        return size;
    }

    public final boolean e() {
        byte b10 = this.f68390f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < z(); i10++) {
            if (!y(i10).e()) {
                this.f68390f = 0;
                return false;
            }
        }
        this.f68390f = 1;
        return true;
    }

    public void h(C6644f fVar) {
        a();
        for (int i10 = 0; i10 < this.f68388d.size(); i10++) {
            fVar.c0(1, (p) this.f68388d.get(i10));
        }
        if ((this.f68387c & 1) == 1) {
            fVar.Z(2, this.f68389e);
        }
        fVar.h0(this.f68386b);
    }

    public int x() {
        return this.f68389e;
    }

    public q y(int i10) {
        return (q) this.f68388d.get(i10);
    }

    public int z() {
        return this.f68388d.size();
    }

    private t(C6647i.b bVar) {
        super(bVar);
        this.f68390f = -1;
        this.f68391g = -1;
        this.f68386b = bVar.j();
    }

    private t(boolean z10) {
        this.f68390f = -1;
        this.f68391g = -1;
        this.f68386b = C6642d.f72492a;
    }

    private t(C6643e eVar, C6645g gVar) {
        this.f68390f = -1;
        this.f68391g = -1;
        C();
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
                            this.f68388d = new ArrayList();
                            z11 = true;
                        }
                        this.f68388d.add(eVar.t(q.f68279v, gVar));
                    } else if (J10 == 16) {
                        this.f68387c |= 1;
                        this.f68389e = eVar.r();
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
                    this.f68388d = Collections.unmodifiableList(this.f68388d);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f68386b = x10.n();
                    throw th3;
                }
                this.f68386b = x10.n();
                m();
                throw th2;
            }
        }
        if (z11) {
            this.f68388d = Collections.unmodifiableList(this.f68388d);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68386b = x10.n();
            throw th4;
        }
        this.f68386b = x10.n();
        m();
    }

    public static final class b extends C6647i.b implements q {

        /* renamed from: b  reason: collision with root package name */
        private int f68392b;

        /* renamed from: c  reason: collision with root package name */
        private List f68393c = Collections.emptyList();

        /* renamed from: d  reason: collision with root package name */
        private int f68394d = -1;

        private b() {
            t();
        }

        /* access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f68392b & 1) != 1) {
                this.f68393c = new ArrayList(this.f68393c);
                this.f68392b |= 1;
            }
        }

        /* renamed from: o */
        public t f() {
            t p10 = p();
            if (p10.e()) {
                return p10;
            }
            throw C6639a.C1046a.i(p10);
        }

        public t p() {
            t tVar = new t((C6647i.b) this);
            int i10 = this.f68392b;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f68393c = Collections.unmodifiableList(this.f68393c);
                this.f68392b &= -2;
            }
            List unused = tVar.f68388d = this.f68393c;
            if ((i10 & 2) != 2) {
                i11 = 0;
            }
            int unused2 = tVar.f68389e = this.f68394d;
            int unused3 = tVar.f68387c = i11;
            return tVar;
        }

        /* renamed from: q */
        public b clone() {
            return r().k(p());
        }

        /* renamed from: u */
        public b k(t tVar) {
            if (tVar == t.w()) {
                return this;
            }
            if (!tVar.f68388d.isEmpty()) {
                if (this.f68393c.isEmpty()) {
                    this.f68393c = tVar.f68388d;
                    this.f68392b &= -2;
                } else {
                    s();
                    this.f68393c.addAll(tVar.f68388d);
                }
            }
            if (tVar.B()) {
                x(tVar.x());
            }
            l(j().b(tVar.f68386b));
            return this;
        }

        /* renamed from: w */
        public b h0(C6643e eVar, C6645g gVar) {
            t tVar;
            t tVar2 = null;
            try {
                t tVar3 = (t) t.f68385i.b(eVar, gVar);
                if (tVar3 != null) {
                    k(tVar3);
                }
                return this;
            } catch (C6649k e10) {
                tVar = (t) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                tVar2 = tVar;
            }
            if (tVar2 != null) {
                k(tVar2);
            }
            throw th;
        }

        public b x(int i10) {
            this.f68392b |= 2;
            this.f68394d = i10;
            return this;
        }

        private void t() {
        }
    }
}
