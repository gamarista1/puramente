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

public final class s extends C6647i.d implements q {

    /* renamed from: n  reason: collision with root package name */
    private static final s f68358n;

    /* renamed from: o  reason: collision with root package name */
    public static r f68359o = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C6642d f68360c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f68361d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f68362e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f68363f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f68364g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public c f68365h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public List f68366i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List f68367j;

    /* renamed from: k  reason: collision with root package name */
    private int f68368k;

    /* renamed from: l  reason: collision with root package name */
    private byte f68369l;

    /* renamed from: m  reason: collision with root package name */
    private int f68370m;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public s b(C6643e eVar, C6645g gVar) {
            return new s(eVar, gVar);
        }
    }

    public enum c implements C6648j.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        

        /* renamed from: e  reason: collision with root package name */
        private static C6648j.b f68381e;

        /* renamed from: a  reason: collision with root package name */
        private final int f68383a;

        static class a implements C6648j.b {
            a() {
            }

            /* renamed from: b */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        static {
            f68381e = new a();
        }

        private c(int i10, int i11) {
            this.f68383a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return IN;
            }
            if (i10 == 1) {
                return OUT;
            }
            if (i10 != 2) {
                return null;
            }
            return INV;
        }

        public final int d() {
            return this.f68383a;
        }
    }

    static {
        s sVar = new s(true);
        f68358n = sVar;
        sVar.Y();
    }

    public static s K() {
        return f68358n;
    }

    private void Y() {
        this.f68362e = 0;
        this.f68363f = 0;
        this.f68364g = false;
        this.f68365h = c.INV;
        this.f68366i = Collections.emptyList();
        this.f68367j = Collections.emptyList();
    }

    public static b Z() {
        return b.w();
    }

    public static b a0(s sVar) {
        return Z().k(sVar);
    }

    /* renamed from: L */
    public s d() {
        return f68358n;
    }

    public int M() {
        return this.f68362e;
    }

    public int N() {
        return this.f68363f;
    }

    public boolean O() {
        return this.f68364g;
    }

    public q P(int i10) {
        return (q) this.f68366i.get(i10);
    }

    public int Q() {
        return this.f68366i.size();
    }

    public List R() {
        return this.f68367j;
    }

    public List S() {
        return this.f68366i;
    }

    public c T() {
        return this.f68365h;
    }

    public boolean U() {
        if ((this.f68361d & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean V() {
        if ((this.f68361d & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean W() {
        if ((this.f68361d & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean X() {
        if ((this.f68361d & 8) == 8) {
            return true;
        }
        return false;
    }

    public int a() {
        int i10;
        int i11 = this.f68370m;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68361d & 1) == 1) {
            i10 = C6644f.o(1, this.f68362e);
        } else {
            i10 = 0;
        }
        if ((this.f68361d & 2) == 2) {
            i10 += C6644f.o(2, this.f68363f);
        }
        if ((this.f68361d & 4) == 4) {
            i10 += C6644f.a(3, this.f68364g);
        }
        if ((this.f68361d & 8) == 8) {
            i10 += C6644f.h(4, this.f68365h.d());
        }
        for (int i12 = 0; i12 < this.f68366i.size(); i12++) {
            i10 += C6644f.r(5, (p) this.f68366i.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f68367j.size(); i14++) {
            i13 += C6644f.p(((Integer) this.f68367j.get(i14)).intValue());
        }
        int i15 = i10 + i13;
        if (!R().isEmpty()) {
            i15 = i15 + 1 + C6644f.p(i13);
        }
        this.f68368k = i13;
        int t10 = i15 + t() + this.f68360c.size();
        this.f68370m = t10;
        return t10;
    }

    /* renamed from: b0 */
    public b c() {
        return Z();
    }

    /* renamed from: c0 */
    public b g() {
        return a0(this);
    }

    public final boolean e() {
        byte b10 = this.f68369l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!U()) {
            this.f68369l = 0;
            return false;
        } else if (!V()) {
            this.f68369l = 0;
            return false;
        } else {
            for (int i10 = 0; i10 < Q(); i10++) {
                if (!P(i10).e()) {
                    this.f68369l = 0;
                    return false;
                }
            }
            if (!s()) {
                this.f68369l = 0;
                return false;
            }
            this.f68369l = 1;
            return true;
        }
    }

    public void h(C6644f fVar) {
        a();
        C6647i.d.a y10 = y();
        if ((this.f68361d & 1) == 1) {
            fVar.Z(1, this.f68362e);
        }
        if ((this.f68361d & 2) == 2) {
            fVar.Z(2, this.f68363f);
        }
        if ((this.f68361d & 4) == 4) {
            fVar.K(3, this.f68364g);
        }
        if ((this.f68361d & 8) == 8) {
            fVar.R(4, this.f68365h.d());
        }
        for (int i10 = 0; i10 < this.f68366i.size(); i10++) {
            fVar.c0(5, (p) this.f68366i.get(i10));
        }
        if (R().size() > 0) {
            fVar.n0(50);
            fVar.n0(this.f68368k);
        }
        for (int i11 = 0; i11 < this.f68367j.size(); i11++) {
            fVar.a0(((Integer) this.f68367j.get(i11)).intValue());
        }
        y10.a(1000, fVar);
        fVar.h0(this.f68360c);
    }

    private s(C6647i.c cVar) {
        super(cVar);
        this.f68368k = -1;
        this.f68369l = -1;
        this.f68370m = -1;
        this.f68360c = cVar.j();
    }

    private s(boolean z10) {
        this.f68368k = -1;
        this.f68369l = -1;
        this.f68370m = -1;
        this.f68360c = C6642d.f72492a;
    }

    private s(C6643e eVar, C6645g gVar) {
        this.f68368k = -1;
        this.f68369l = -1;
        this.f68370m = -1;
        Y();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int J10 = eVar.J();
                if (J10 != 0) {
                    if (J10 == 8) {
                        this.f68361d |= 1;
                        this.f68362e = eVar.r();
                    } else if (J10 == 16) {
                        this.f68361d |= 2;
                        this.f68363f = eVar.r();
                    } else if (J10 == 24) {
                        this.f68361d |= 4;
                        this.f68364g = eVar.j();
                    } else if (J10 == 32) {
                        int m10 = eVar.m();
                        c a10 = c.a(m10);
                        if (a10 == null) {
                            I10.n0(J10);
                            I10.n0(m10);
                        } else {
                            this.f68361d |= 8;
                            this.f68365h = a10;
                        }
                    } else if (J10 == 42) {
                        if (!(z11 & true)) {
                            this.f68366i = new ArrayList();
                            z11 |= true;
                        }
                        this.f68366i.add(eVar.t(q.f68279v, gVar));
                    } else if (J10 == 48) {
                        if (!(z11 & true)) {
                            this.f68367j = new ArrayList();
                            z11 |= true;
                        }
                        this.f68367j.add(Integer.valueOf(eVar.r()));
                    } else if (J10 == 50) {
                        int i10 = eVar.i(eVar.z());
                        if (!(z11 & true) && eVar.e() > 0) {
                            this.f68367j = new ArrayList();
                            z11 |= true;
                        }
                        while (eVar.e() > 0) {
                            this.f68367j.add(Integer.valueOf(eVar.r()));
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
                    this.f68366i = Collections.unmodifiableList(this.f68366i);
                }
                if (z11 & true) {
                    this.f68367j = Collections.unmodifiableList(this.f68367j);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f68360c = x10.n();
                    throw th3;
                }
                this.f68360c = x10.n();
                m();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f68366i = Collections.unmodifiableList(this.f68366i);
        }
        if (z11 & true) {
            this.f68367j = Collections.unmodifiableList(this.f68367j);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68360c = x10.n();
            throw th4;
        }
        this.f68360c = x10.n();
        m();
    }

    public static final class b extends C6647i.c implements q {

        /* renamed from: d  reason: collision with root package name */
        private int f68371d;

        /* renamed from: e  reason: collision with root package name */
        private int f68372e;

        /* renamed from: f  reason: collision with root package name */
        private int f68373f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f68374g;

        /* renamed from: h  reason: collision with root package name */
        private c f68375h = c.INV;

        /* renamed from: i  reason: collision with root package name */
        private List f68376i = Collections.emptyList();

        /* renamed from: j  reason: collision with root package name */
        private List f68377j = Collections.emptyList();

        private b() {
            z();
        }

        /* access modifiers changed from: private */
        public static b w() {
            return new b();
        }

        private void x() {
            if ((this.f68371d & 32) != 32) {
                this.f68377j = new ArrayList(this.f68377j);
                this.f68371d |= 32;
            }
        }

        private void y() {
            if ((this.f68371d & 16) != 16) {
                this.f68376i = new ArrayList(this.f68376i);
                this.f68371d |= 16;
            }
        }

        /* renamed from: A */
        public b k(s sVar) {
            if (sVar == s.K()) {
                return this;
            }
            if (sVar.U()) {
                C(sVar.M());
            }
            if (sVar.V()) {
                D(sVar.N());
            }
            if (sVar.W()) {
                E(sVar.O());
            }
            if (sVar.X()) {
                F(sVar.T());
            }
            if (!sVar.f68366i.isEmpty()) {
                if (this.f68376i.isEmpty()) {
                    this.f68376i = sVar.f68366i;
                    this.f68371d &= -17;
                } else {
                    y();
                    this.f68376i.addAll(sVar.f68366i);
                }
            }
            if (!sVar.f68367j.isEmpty()) {
                if (this.f68377j.isEmpty()) {
                    this.f68377j = sVar.f68367j;
                    this.f68371d &= -33;
                } else {
                    x();
                    this.f68377j.addAll(sVar.f68367j);
                }
            }
            q(sVar);
            l(j().b(sVar.f68360c));
            return this;
        }

        /* renamed from: B */
        public b h0(C6643e eVar, C6645g gVar) {
            s sVar;
            s sVar2 = null;
            try {
                s sVar3 = (s) s.f68359o.b(eVar, gVar);
                if (sVar3 != null) {
                    k(sVar3);
                }
                return this;
            } catch (C6649k e10) {
                sVar = (s) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                sVar2 = sVar;
            }
            if (sVar2 != null) {
                k(sVar2);
            }
            throw th;
        }

        public b C(int i10) {
            this.f68371d |= 1;
            this.f68372e = i10;
            return this;
        }

        public b D(int i10) {
            this.f68371d |= 2;
            this.f68373f = i10;
            return this;
        }

        public b E(boolean z10) {
            this.f68371d |= 4;
            this.f68374g = z10;
            return this;
        }

        public b F(c cVar) {
            cVar.getClass();
            this.f68371d |= 8;
            this.f68375h = cVar;
            return this;
        }

        /* renamed from: s */
        public s f() {
            s t10 = t();
            if (t10.e()) {
                return t10;
            }
            throw C6639a.C1046a.i(t10);
        }

        public s t() {
            s sVar = new s((C6647i.c) this);
            int i10 = this.f68371d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = sVar.f68362e = this.f68372e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = sVar.f68363f = this.f68373f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            boolean unused3 = sVar.f68364g = this.f68374g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c unused4 = sVar.f68365h = this.f68375h;
            if ((this.f68371d & 16) == 16) {
                this.f68376i = Collections.unmodifiableList(this.f68376i);
                this.f68371d &= -17;
            }
            List unused5 = sVar.f68366i = this.f68376i;
            if ((this.f68371d & 32) == 32) {
                this.f68377j = Collections.unmodifiableList(this.f68377j);
                this.f68371d &= -33;
            }
            List unused6 = sVar.f68367j = this.f68377j;
            int unused7 = sVar.f68361d = i11;
            return sVar;
        }

        /* renamed from: u */
        public b clone() {
            return w().k(t());
        }

        private void z() {
        }
    }
}
