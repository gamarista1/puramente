package ig;

import ig.h;
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

public final class f extends C6647i implements q {

    /* renamed from: j  reason: collision with root package name */
    private static final f f68062j;

    /* renamed from: k  reason: collision with root package name */
    public static r f68063k = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6642d f68064b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f68065c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public c f68066d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List f68067e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public h f68068f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public d f68069g;

    /* renamed from: h  reason: collision with root package name */
    private byte f68070h;

    /* renamed from: i  reason: collision with root package name */
    private int f68071i;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public f b(C6643e eVar, C6645g gVar) {
            return new f(eVar, gVar);
        }
    }

    public enum c implements C6648j.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        

        /* renamed from: e  reason: collision with root package name */
        private static C6648j.b f68080e;

        /* renamed from: a  reason: collision with root package name */
        private final int f68082a;

        static class a implements C6648j.b {
            a() {
            }

            /* renamed from: b */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        static {
            f68080e = new a();
        }

        private c(int i10, int i11) {
            this.f68082a = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i10 == 1) {
                return CALLS;
            }
            if (i10 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        public final int d() {
            return this.f68082a;
        }
    }

    public enum d implements C6648j.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        

        /* renamed from: e  reason: collision with root package name */
        private static C6648j.b f68086e;

        /* renamed from: a  reason: collision with root package name */
        private final int f68088a;

        static class a implements C6648j.b {
            a() {
            }

            /* renamed from: b */
            public d a(int i10) {
                return d.a(i10);
            }
        }

        static {
            f68086e = new a();
        }

        private d(int i10, int i11) {
            this.f68088a = i11;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return AT_MOST_ONCE;
            }
            if (i10 == 1) {
                return EXACTLY_ONCE;
            }
            if (i10 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        public final int d() {
            return this.f68088a;
        }
    }

    static {
        f fVar = new f(true);
        f68062j = fVar;
        fVar.H();
    }

    private void H() {
        this.f68066d = c.RETURNS_CONSTANT;
        this.f68067e = Collections.emptyList();
        this.f68068f = h.F();
        this.f68069g = d.AT_MOST_ONCE;
    }

    public static b I() {
        return b.r();
    }

    public static b J(f fVar) {
        return I().k(fVar);
    }

    public static f z() {
        return f68062j;
    }

    public h A(int i10) {
        return (h) this.f68067e.get(i10);
    }

    public int B() {
        return this.f68067e.size();
    }

    public c C() {
        return this.f68066d;
    }

    public d D() {
        return this.f68069g;
    }

    public boolean E() {
        if ((this.f68065c & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean F() {
        if ((this.f68065c & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean G() {
        if ((this.f68065c & 4) == 4) {
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
        int i11 = this.f68071i;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f68065c & 1) == 1) {
            i10 = C6644f.h(1, this.f68066d.d());
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < this.f68067e.size(); i12++) {
            i10 += C6644f.r(2, (p) this.f68067e.get(i12));
        }
        if ((this.f68065c & 2) == 2) {
            i10 += C6644f.r(3, this.f68068f);
        }
        if ((this.f68065c & 4) == 4) {
            i10 += C6644f.h(4, this.f68069g.d());
        }
        int size = i10 + this.f68064b.size();
        this.f68071i = size;
        return size;
    }

    public final boolean e() {
        byte b10 = this.f68070h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < B(); i10++) {
            if (!A(i10).e()) {
                this.f68070h = 0;
                return false;
            }
        }
        if (!E() || y().e()) {
            this.f68070h = 1;
            return true;
        }
        this.f68070h = 0;
        return false;
    }

    public void h(C6644f fVar) {
        a();
        if ((this.f68065c & 1) == 1) {
            fVar.R(1, this.f68066d.d());
        }
        for (int i10 = 0; i10 < this.f68067e.size(); i10++) {
            fVar.c0(2, (p) this.f68067e.get(i10));
        }
        if ((this.f68065c & 2) == 2) {
            fVar.c0(3, this.f68068f);
        }
        if ((this.f68065c & 4) == 4) {
            fVar.R(4, this.f68069g.d());
        }
        fVar.h0(this.f68064b);
    }

    public h y() {
        return this.f68068f;
    }

    private f(C6647i.b bVar) {
        super(bVar);
        this.f68070h = -1;
        this.f68071i = -1;
        this.f68064b = bVar.j();
    }

    private f(boolean z10) {
        this.f68070h = -1;
        this.f68071i = -1;
        this.f68064b = C6642d.f72492a;
    }

    private f(C6643e eVar, C6645g gVar) {
        this.f68070h = -1;
        this.f68071i = -1;
        H();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        boolean z11 = false;
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
                            this.f68065c |= 1;
                            this.f68066d = a10;
                        }
                    } else if (J10 == 18) {
                        if (!(z11 & true)) {
                            this.f68067e = new ArrayList();
                            z11 = true;
                        }
                        this.f68067e.add(eVar.t(h.f68099n, gVar));
                    } else if (J10 == 26) {
                        h.b V10 = (this.f68065c & 2) == 2 ? this.f68068f.g() : null;
                        h hVar = (h) eVar.t(h.f68099n, gVar);
                        this.f68068f = hVar;
                        if (V10 != null) {
                            V10.k(hVar);
                            this.f68068f = V10.p();
                        }
                        this.f68065c |= 2;
                    } else if (J10 == 32) {
                        int m11 = eVar.m();
                        d a11 = d.a(m11);
                        if (a11 == null) {
                            I10.n0(J10);
                            I10.n0(m11);
                        } else {
                            this.f68065c |= 4;
                            this.f68069g = a11;
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
                if (z11 & true) {
                    this.f68067e = Collections.unmodifiableList(this.f68067e);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f68064b = x10.n();
                    throw th3;
                }
                this.f68064b = x10.n();
                m();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f68067e = Collections.unmodifiableList(this.f68067e);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68064b = x10.n();
            throw th4;
        }
        this.f68064b = x10.n();
        m();
    }

    public static final class b extends C6647i.b implements q {

        /* renamed from: b  reason: collision with root package name */
        private int f68072b;

        /* renamed from: c  reason: collision with root package name */
        private c f68073c = c.RETURNS_CONSTANT;

        /* renamed from: d  reason: collision with root package name */
        private List f68074d = Collections.emptyList();

        /* renamed from: e  reason: collision with root package name */
        private h f68075e = h.F();

        /* renamed from: f  reason: collision with root package name */
        private d f68076f = d.AT_MOST_ONCE;

        private b() {
            t();
        }

        /* access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f68072b & 2) != 2) {
                this.f68074d = new ArrayList(this.f68074d);
                this.f68072b |= 2;
            }
        }

        /* renamed from: o */
        public f f() {
            f p10 = p();
            if (p10.e()) {
                return p10;
            }
            throw C6639a.C1046a.i(p10);
        }

        public f p() {
            f fVar = new f((C6647i.b) this);
            int i10 = this.f68072b;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            c unused = fVar.f68066d = this.f68073c;
            if ((this.f68072b & 2) == 2) {
                this.f68074d = Collections.unmodifiableList(this.f68074d);
                this.f68072b &= -3;
            }
            List unused2 = fVar.f68067e = this.f68074d;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            h unused3 = fVar.f68068f = this.f68075e;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            d unused4 = fVar.f68069g = this.f68076f;
            int unused5 = fVar.f68065c = i11;
            return fVar;
        }

        /* renamed from: q */
        public b clone() {
            return r().k(p());
        }

        public b u(h hVar) {
            if ((this.f68072b & 4) != 4 || this.f68075e == h.F()) {
                this.f68075e = hVar;
            } else {
                this.f68075e = h.T(this.f68075e).k(hVar).p();
            }
            this.f68072b |= 4;
            return this;
        }

        /* renamed from: w */
        public b k(f fVar) {
            if (fVar == f.z()) {
                return this;
            }
            if (fVar.F()) {
                y(fVar.C());
            }
            if (!fVar.f68067e.isEmpty()) {
                if (this.f68074d.isEmpty()) {
                    this.f68074d = fVar.f68067e;
                    this.f68072b &= -3;
                } else {
                    s();
                    this.f68074d.addAll(fVar.f68067e);
                }
            }
            if (fVar.E()) {
                u(fVar.y());
            }
            if (fVar.G()) {
                z(fVar.D());
            }
            l(j().b(fVar.f68064b));
            return this;
        }

        /* renamed from: x */
        public b h0(C6643e eVar, C6645g gVar) {
            f fVar;
            f fVar2 = null;
            try {
                f fVar3 = (f) f.f68063k.b(eVar, gVar);
                if (fVar3 != null) {
                    k(fVar3);
                }
                return this;
            } catch (C6649k e10) {
                fVar = (f) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                fVar2 = fVar;
            }
            if (fVar2 != null) {
                k(fVar2);
            }
            throw th;
        }

        public b y(c cVar) {
            cVar.getClass();
            this.f68072b |= 1;
            this.f68073c = cVar;
            return this;
        }

        public b z(d dVar) {
            dVar.getClass();
            this.f68072b |= 8;
            this.f68076f = dVar;
            return this;
        }

        private void t() {
        }
    }
}
