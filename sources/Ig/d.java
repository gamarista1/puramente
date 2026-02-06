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

public final class d extends C6647i.d implements q {

    /* renamed from: j  reason: collision with root package name */
    private static final d f68041j;

    /* renamed from: k  reason: collision with root package name */
    public static r f68042k = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f68043c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68044d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f68045e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List f68046f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public List f68047g;

    /* renamed from: h  reason: collision with root package name */
    private byte f68048h;

    /* renamed from: i  reason: collision with root package name */
    private int f68049i;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public d b(C6643e eVar, C6645g gVar) {
            return new d(eVar, gVar);
        }
    }

    static {
        d dVar = new d(true);
        f68041j = dVar;
        dVar.P();
    }

    public static d H() {
        return f68041j;
    }

    private void P() {
        this.f68045e = 6;
        this.f68046f = Collections.emptyList();
        this.f68047g = Collections.emptyList();
    }

    public static b Q() {
        return b.w();
    }

    public static b R(d dVar) {
        return Q().k(dVar);
    }

    /* renamed from: I */
    public d d() {
        return f68041j;
    }

    public int J() {
        return this.f68045e;
    }

    public u K(int i10) {
        return (u) this.f68046f.get(i10);
    }

    public int L() {
        return this.f68046f.size();
    }

    public List M() {
        return this.f68046f;
    }

    public List N() {
        return this.f68047g;
    }

    public boolean O() {
        if ((this.f68044d & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public b c() {
        return Q();
    }

    /* renamed from: T */
    public b g() {
        return R(this);
    }

    public int a() {
        int i10;
        int i11 = this.f68049i;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68044d & 1) == 1) {
            i10 = C6644f.o(1, this.f68045e);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < this.f68046f.size(); i12++) {
            i10 += C6644f.r(2, (p) this.f68046f.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f68047g.size(); i14++) {
            i13 += C6644f.p(((Integer) this.f68047g.get(i14)).intValue());
        }
        int size = i10 + i13 + (N().size() * 2) + t() + this.f68043c.size();
        this.f68049i = size;
        return size;
    }

    public final boolean e() {
        byte b10 = this.f68048h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < L(); i10++) {
            if (!K(i10).e()) {
                this.f68048h = 0;
                return false;
            }
        }
        if (!s()) {
            this.f68048h = 0;
            return false;
        }
        this.f68048h = 1;
        return true;
    }

    public void h(C6644f fVar) {
        a();
        C6647i.d.a y10 = y();
        if ((this.f68044d & 1) == 1) {
            fVar.Z(1, this.f68045e);
        }
        for (int i10 = 0; i10 < this.f68046f.size(); i10++) {
            fVar.c0(2, (p) this.f68046f.get(i10));
        }
        for (int i11 = 0; i11 < this.f68047g.size(); i11++) {
            fVar.Z(31, ((Integer) this.f68047g.get(i11)).intValue());
        }
        y10.a(19000, fVar);
        fVar.h0(this.f68043c);
    }

    private d(C6647i.c cVar) {
        super(cVar);
        this.f68048h = -1;
        this.f68049i = -1;
        this.f68043c = cVar.j();
    }

    private d(boolean z10) {
        this.f68048h = -1;
        this.f68049i = -1;
        this.f68043c = C6642d.f72492a;
    }

    private d(C6643e eVar, C6645g gVar) {
        this.f68048h = -1;
        this.f68049i = -1;
        P();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int J10 = eVar.J();
                if (J10 != 0) {
                    if (J10 == 8) {
                        this.f68044d |= 1;
                        this.f68045e = eVar.r();
                    } else if (J10 == 18) {
                        if (!(z11 & true)) {
                            this.f68046f = new ArrayList();
                            z11 |= true;
                        }
                        this.f68046f.add(eVar.t(u.f68396n, gVar));
                    } else if (J10 == 248) {
                        if (!(z11 & true)) {
                            this.f68047g = new ArrayList();
                            z11 |= true;
                        }
                        this.f68047g.add(Integer.valueOf(eVar.r()));
                    } else if (J10 == 250) {
                        int i10 = eVar.i(eVar.z());
                        if (!(z11 & true) && eVar.e() > 0) {
                            this.f68047g = new ArrayList();
                            z11 |= true;
                        }
                        while (eVar.e() > 0) {
                            this.f68047g.add(Integer.valueOf(eVar.r()));
                        }
                        eVar.h(i10);
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
                    this.f68046f = Collections.unmodifiableList(this.f68046f);
                }
                if (z11 & true) {
                    this.f68047g = Collections.unmodifiableList(this.f68047g);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f68043c = x10.n();
                    throw th3;
                }
                this.f68043c = x10.n();
                m();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f68046f = Collections.unmodifiableList(this.f68046f);
        }
        if (z11 & true) {
            this.f68047g = Collections.unmodifiableList(this.f68047g);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68043c = x10.n();
            throw th4;
        }
        this.f68043c = x10.n();
        m();
    }

    public static final class b extends C6647i.c implements q {

        /* renamed from: d  reason: collision with root package name */
        private int f68050d;

        /* renamed from: e  reason: collision with root package name */
        private int f68051e = 6;

        /* renamed from: f  reason: collision with root package name */
        private List f68052f = Collections.emptyList();

        /* renamed from: g  reason: collision with root package name */
        private List f68053g = Collections.emptyList();

        private b() {
            z();
        }

        /* access modifiers changed from: private */
        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f68050d & 2) != 2) {
                this.f68052f = new ArrayList(this.f68052f);
                this.f68050d |= 2;
            }
        }

        private void y() {
            if ((this.f68050d & 4) != 4) {
                this.f68053g = new ArrayList(this.f68053g);
                this.f68050d |= 4;
            }
        }

        /* renamed from: A */
        public b k(d dVar) {
            if (dVar == d.H()) {
                return this;
            }
            if (dVar.O()) {
                C(dVar.J());
            }
            if (!dVar.f68046f.isEmpty()) {
                if (this.f68052f.isEmpty()) {
                    this.f68052f = dVar.f68046f;
                    this.f68050d &= -3;
                } else {
                    x();
                    this.f68052f.addAll(dVar.f68046f);
                }
            }
            if (!dVar.f68047g.isEmpty()) {
                if (this.f68053g.isEmpty()) {
                    this.f68053g = dVar.f68047g;
                    this.f68050d &= -5;
                } else {
                    y();
                    this.f68053g.addAll(dVar.f68047g);
                }
            }
            q(dVar);
            l(j().b(dVar.f68043c));
            return this;
        }

        /* renamed from: B */
        public b h0(C6643e eVar, C6645g gVar) {
            d dVar;
            d dVar2 = null;
            try {
                d dVar3 = (d) d.f68042k.b(eVar, gVar);
                if (dVar3 != null) {
                    k(dVar3);
                }
                return this;
            } catch (C6649k e10) {
                dVar = (d) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                dVar2 = dVar;
            }
            if (dVar2 != null) {
                k(dVar2);
            }
            throw th;
        }

        public b C(int i10) {
            this.f68050d |= 1;
            this.f68051e = i10;
            return this;
        }

        /* renamed from: s */
        public d f() {
            d t10 = t();
            if (t10.e()) {
                return t10;
            }
            throw C6639a.C1046a.i(t10);
        }

        public d t() {
            d dVar = new d((C6647i.c) this);
            int i10 = 1;
            if ((this.f68050d & 1) != 1) {
                i10 = 0;
            }
            int unused = dVar.f68045e = this.f68051e;
            if ((this.f68050d & 2) == 2) {
                this.f68052f = Collections.unmodifiableList(this.f68052f);
                this.f68050d &= -3;
            }
            List unused2 = dVar.f68046f = this.f68052f;
            if ((this.f68050d & 4) == 4) {
                this.f68053g = Collections.unmodifiableList(this.f68053g);
                this.f68050d &= -5;
            }
            List unused3 = dVar.f68047g = this.f68053g;
            int unused4 = dVar.f68044d = i10;
            return dVar;
        }

        /* renamed from: u */
        public b clone() {
            return w().k(t());
        }

        private void z() {
        }
    }
}
