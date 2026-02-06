package lg;

import ig.i;
import ig.l;
import ig.n;
import ig.q;
import ig.s;
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
import pg.C6648j;
import pg.C6649k;
import pg.p;
import pg.r;
import pg.y;

/* renamed from: lg.a  reason: case insensitive filesystem */
public abstract class C6536a {

    /* renamed from: a  reason: collision with root package name */
    public static final C6647i.f f71855a;

    /* renamed from: b  reason: collision with root package name */
    public static final C6647i.f f71856b;

    /* renamed from: c  reason: collision with root package name */
    public static final C6647i.f f71857c;

    /* renamed from: d  reason: collision with root package name */
    public static final C6647i.f f71858d;

    /* renamed from: e  reason: collision with root package name */
    public static final C6647i.f f71859e;

    /* renamed from: f  reason: collision with root package name */
    public static final C6647i.f f71860f;

    /* renamed from: g  reason: collision with root package name */
    public static final C6647i.f f71861g = C6647i.o(q.X(), Boolean.FALSE, (p) null, (C6648j.b) null, 101, y.b.BOOL, Boolean.class);

    /* renamed from: h  reason: collision with root package name */
    public static final C6647i.f f71862h;

    /* renamed from: i  reason: collision with root package name */
    public static final C6647i.f f71863i;

    /* renamed from: j  reason: collision with root package name */
    public static final C6647i.f f71864j;

    /* renamed from: k  reason: collision with root package name */
    public static final C6647i.f f71865k;

    /* renamed from: l  reason: collision with root package name */
    public static final C6647i.f f71866l;

    /* renamed from: m  reason: collision with root package name */
    public static final C6647i.f f71867m;

    /* renamed from: n  reason: collision with root package name */
    public static final C6647i.f f71868n;

    /* renamed from: lg.a$e */
    public static final class e extends C6647i implements pg.q {

        /* renamed from: h  reason: collision with root package name */
        private static final e f71908h;

        /* renamed from: i  reason: collision with root package name */
        public static r f71909i = new C1032a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C6642d f71910b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public List f71911c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public List f71912d;

        /* renamed from: e  reason: collision with root package name */
        private int f71913e;

        /* renamed from: f  reason: collision with root package name */
        private byte f71914f;

        /* renamed from: g  reason: collision with root package name */
        private int f71915g;

        /* renamed from: lg.a$e$a  reason: collision with other inner class name */
        static class C1032a extends C6640b {
            C1032a() {
            }

            /* renamed from: j */
            public e b(C6643e eVar, C6645g gVar) {
                return new e(eVar, gVar);
            }
        }

        static {
            e eVar = new e(true);
            f71908h = eVar;
            eVar.z();
        }

        public static b A() {
            return b.r();
        }

        public static b B(e eVar) {
            return A().k(eVar);
        }

        public static e D(InputStream inputStream, C6645g gVar) {
            return (e) f71909i.a(inputStream, gVar);
        }

        public static e w() {
            return f71908h;
        }

        private void z() {
            this.f71911c = Collections.emptyList();
            this.f71912d = Collections.emptyList();
        }

        /* renamed from: C */
        public b c() {
            return A();
        }

        /* renamed from: E */
        public b g() {
            return B(this);
        }

        public int a() {
            int i10 = this.f71915g;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f71911c.size(); i12++) {
                i11 += C6644f.r(1, (p) this.f71911c.get(i12));
            }
            int i13 = 0;
            for (int i14 = 0; i14 < this.f71912d.size(); i14++) {
                i13 += C6644f.p(((Integer) this.f71912d.get(i14)).intValue());
            }
            int i15 = i11 + i13;
            if (!x().isEmpty()) {
                i15 = i15 + 1 + C6644f.p(i13);
            }
            this.f71913e = i13;
            int size = i15 + this.f71910b.size();
            this.f71915g = size;
            return size;
        }

        public final boolean e() {
            byte b10 = this.f71914f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f71914f = 1;
            return true;
        }

        public void h(C6644f fVar) {
            a();
            for (int i10 = 0; i10 < this.f71911c.size(); i10++) {
                fVar.c0(1, (p) this.f71911c.get(i10));
            }
            if (x().size() > 0) {
                fVar.n0(42);
                fVar.n0(this.f71913e);
            }
            for (int i11 = 0; i11 < this.f71912d.size(); i11++) {
                fVar.a0(((Integer) this.f71912d.get(i11)).intValue());
            }
            fVar.h0(this.f71910b);
        }

        public List x() {
            return this.f71912d;
        }

        public List y() {
            return this.f71911c;
        }

        /* renamed from: lg.a$e$c */
        public static final class c extends C6647i implements pg.q {

            /* renamed from: n  reason: collision with root package name */
            private static final c f71919n;

            /* renamed from: o  reason: collision with root package name */
            public static r f71920o = new C1033a();
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public final C6642d f71921b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public int f71922c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public int f71923d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public int f71924e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public Object f71925f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public C1034c f71926g;
            /* access modifiers changed from: private */

            /* renamed from: h  reason: collision with root package name */
            public List f71927h;

            /* renamed from: i  reason: collision with root package name */
            private int f71928i;
            /* access modifiers changed from: private */

            /* renamed from: j  reason: collision with root package name */
            public List f71929j;

            /* renamed from: k  reason: collision with root package name */
            private int f71930k;

            /* renamed from: l  reason: collision with root package name */
            private byte f71931l;

            /* renamed from: m  reason: collision with root package name */
            private int f71932m;

            /* renamed from: lg.a$e$c$a  reason: collision with other inner class name */
            static class C1033a extends C6640b {
                C1033a() {
                }

                /* renamed from: j */
                public c b(C6643e eVar, C6645g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* renamed from: lg.a$e$c$c  reason: collision with other inner class name */
            public enum C1034c implements C6648j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                

                /* renamed from: e  reason: collision with root package name */
                private static C6648j.b f71943e;

                /* renamed from: a  reason: collision with root package name */
                private final int f71945a;

                /* renamed from: lg.a$e$c$c$a  reason: collision with other inner class name */
                static class C1035a implements C6648j.b {
                    C1035a() {
                    }

                    /* renamed from: b */
                    public C1034c a(int i10) {
                        return C1034c.a(i10);
                    }
                }

                static {
                    f71943e = new C1035a();
                }

                private C1034c(int i10, int i11) {
                    this.f71945a = i11;
                }

                public static C1034c a(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                public final int d() {
                    return this.f71945a;
                }
            }

            static {
                c cVar = new c(true);
                f71919n = cVar;
                cVar.Q();
            }

            public static c C() {
                return f71919n;
            }

            private void Q() {
                this.f71923d = 1;
                this.f71924e = 0;
                this.f71925f = "";
                this.f71926g = C1034c.NONE;
                this.f71927h = Collections.emptyList();
                this.f71929j = Collections.emptyList();
            }

            public static b R() {
                return b.r();
            }

            public static b S(c cVar) {
                return R().k(cVar);
            }

            public C1034c D() {
                return this.f71926g;
            }

            public int E() {
                return this.f71924e;
            }

            public int F() {
                return this.f71923d;
            }

            public int G() {
                return this.f71929j.size();
            }

            public List H() {
                return this.f71929j;
            }

            public String I() {
                Object obj = this.f71925f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C6642d dVar = (C6642d) obj;
                String H10 = dVar.H();
                if (dVar.v()) {
                    this.f71925f = H10;
                }
                return H10;
            }

            public C6642d J() {
                Object obj = this.f71925f;
                if (!(obj instanceof String)) {
                    return (C6642d) obj;
                }
                C6642d k10 = C6642d.k((String) obj);
                this.f71925f = k10;
                return k10;
            }

            public int K() {
                return this.f71927h.size();
            }

            public List L() {
                return this.f71927h;
            }

            public boolean M() {
                if ((this.f71922c & 8) == 8) {
                    return true;
                }
                return false;
            }

            public boolean N() {
                if ((this.f71922c & 2) == 2) {
                    return true;
                }
                return false;
            }

            public boolean O() {
                if ((this.f71922c & 1) == 1) {
                    return true;
                }
                return false;
            }

            public boolean P() {
                if ((this.f71922c & 4) == 4) {
                    return true;
                }
                return false;
            }

            /* renamed from: T */
            public b c() {
                return R();
            }

            /* renamed from: U */
            public b g() {
                return S(this);
            }

            public int a() {
                int i10;
                int i11 = this.f71932m;
                if (i11 != -1) {
                    return i11;
                }
                if ((this.f71922c & 1) == 1) {
                    i10 = C6644f.o(1, this.f71923d);
                } else {
                    i10 = 0;
                }
                if ((this.f71922c & 2) == 2) {
                    i10 += C6644f.o(2, this.f71924e);
                }
                if ((this.f71922c & 8) == 8) {
                    i10 += C6644f.h(3, this.f71926g.d());
                }
                int i12 = 0;
                for (int i13 = 0; i13 < this.f71927h.size(); i13++) {
                    i12 += C6644f.p(((Integer) this.f71927h.get(i13)).intValue());
                }
                int i14 = i10 + i12;
                if (!L().isEmpty()) {
                    i14 = i14 + 1 + C6644f.p(i12);
                }
                this.f71928i = i12;
                int i15 = 0;
                for (int i16 = 0; i16 < this.f71929j.size(); i16++) {
                    i15 += C6644f.p(((Integer) this.f71929j.get(i16)).intValue());
                }
                int i17 = i14 + i15;
                if (!H().isEmpty()) {
                    i17 = i17 + 1 + C6644f.p(i15);
                }
                this.f71930k = i15;
                if ((this.f71922c & 4) == 4) {
                    i17 += C6644f.d(6, J());
                }
                int size = i17 + this.f71921b.size();
                this.f71932m = size;
                return size;
            }

            public final boolean e() {
                byte b10 = this.f71931l;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f71931l = 1;
                return true;
            }

            public void h(C6644f fVar) {
                a();
                if ((this.f71922c & 1) == 1) {
                    fVar.Z(1, this.f71923d);
                }
                if ((this.f71922c & 2) == 2) {
                    fVar.Z(2, this.f71924e);
                }
                if ((this.f71922c & 8) == 8) {
                    fVar.R(3, this.f71926g.d());
                }
                if (L().size() > 0) {
                    fVar.n0(34);
                    fVar.n0(this.f71928i);
                }
                for (int i10 = 0; i10 < this.f71927h.size(); i10++) {
                    fVar.a0(((Integer) this.f71927h.get(i10)).intValue());
                }
                if (H().size() > 0) {
                    fVar.n0(42);
                    fVar.n0(this.f71930k);
                }
                for (int i11 = 0; i11 < this.f71929j.size(); i11++) {
                    fVar.a0(((Integer) this.f71929j.get(i11)).intValue());
                }
                if ((this.f71922c & 4) == 4) {
                    fVar.N(6, J());
                }
                fVar.h0(this.f71921b);
            }

            private c(C6647i.b bVar) {
                super(bVar);
                this.f71928i = -1;
                this.f71930k = -1;
                this.f71931l = -1;
                this.f71932m = -1;
                this.f71921b = bVar.j();
            }

            private c(boolean z10) {
                this.f71928i = -1;
                this.f71930k = -1;
                this.f71931l = -1;
                this.f71932m = -1;
                this.f71921b = C6642d.f72492a;
            }

            private c(C6643e eVar, C6645g gVar) {
                this.f71928i = -1;
                this.f71930k = -1;
                this.f71931l = -1;
                this.f71932m = -1;
                Q();
                C6642d.b x10 = C6642d.x();
                C6644f I10 = C6644f.I(x10, 1);
                boolean z10 = false;
                boolean z11 = false;
                while (!z10) {
                    try {
                        int J10 = eVar.J();
                        if (J10 != 0) {
                            if (J10 == 8) {
                                this.f71922c |= 1;
                                this.f71923d = eVar.r();
                            } else if (J10 == 16) {
                                this.f71922c |= 2;
                                this.f71924e = eVar.r();
                            } else if (J10 == 24) {
                                int m10 = eVar.m();
                                C1034c a10 = C1034c.a(m10);
                                if (a10 == null) {
                                    I10.n0(J10);
                                    I10.n0(m10);
                                } else {
                                    this.f71922c |= 8;
                                    this.f71926g = a10;
                                }
                            } else if (J10 == 32) {
                                if (!(z11 & true)) {
                                    this.f71927h = new ArrayList();
                                    z11 |= true;
                                }
                                this.f71927h.add(Integer.valueOf(eVar.r()));
                            } else if (J10 == 34) {
                                int i10 = eVar.i(eVar.z());
                                if (!(z11 & true) && eVar.e() > 0) {
                                    this.f71927h = new ArrayList();
                                    z11 |= true;
                                }
                                while (eVar.e() > 0) {
                                    this.f71927h.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i10);
                            } else if (J10 == 40) {
                                if (!(z11 & true)) {
                                    this.f71929j = new ArrayList();
                                    z11 |= true;
                                }
                                this.f71929j.add(Integer.valueOf(eVar.r()));
                            } else if (J10 == 42) {
                                int i11 = eVar.i(eVar.z());
                                if (!(z11 & true) && eVar.e() > 0) {
                                    this.f71929j = new ArrayList();
                                    z11 |= true;
                                }
                                while (eVar.e() > 0) {
                                    this.f71929j.add(Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i11);
                            } else if (J10 == 50) {
                                C6642d k10 = eVar.k();
                                this.f71922c |= 4;
                                this.f71925f = k10;
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
                            this.f71927h = Collections.unmodifiableList(this.f71927h);
                        }
                        if (z11 & true) {
                            this.f71929j = Collections.unmodifiableList(this.f71929j);
                        }
                        try {
                            I10.H();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f71921b = x10.n();
                            throw th3;
                        }
                        this.f71921b = x10.n();
                        m();
                        throw th2;
                    }
                }
                if (z11 & true) {
                    this.f71927h = Collections.unmodifiableList(this.f71927h);
                }
                if (z11 & true) {
                    this.f71929j = Collections.unmodifiableList(this.f71929j);
                }
                try {
                    I10.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f71921b = x10.n();
                    throw th4;
                }
                this.f71921b = x10.n();
                m();
            }

            /* renamed from: lg.a$e$c$b */
            public static final class b extends C6647i.b implements pg.q {

                /* renamed from: b  reason: collision with root package name */
                private int f71933b;

                /* renamed from: c  reason: collision with root package name */
                private int f71934c = 1;

                /* renamed from: d  reason: collision with root package name */
                private int f71935d;

                /* renamed from: e  reason: collision with root package name */
                private Object f71936e = "";

                /* renamed from: f  reason: collision with root package name */
                private C1034c f71937f = C1034c.NONE;

                /* renamed from: g  reason: collision with root package name */
                private List f71938g = Collections.emptyList();

                /* renamed from: h  reason: collision with root package name */
                private List f71939h = Collections.emptyList();

                private b() {
                    u();
                }

                /* access modifiers changed from: private */
                public static b r() {
                    return new b();
                }

                private void s() {
                    if ((this.f71933b & 32) != 32) {
                        this.f71939h = new ArrayList(this.f71939h);
                        this.f71933b |= 32;
                    }
                }

                private void t() {
                    if ((this.f71933b & 16) != 16) {
                        this.f71938g = new ArrayList(this.f71938g);
                        this.f71933b |= 16;
                    }
                }

                public b A(int i10) {
                    this.f71933b |= 1;
                    this.f71934c = i10;
                    return this;
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
                    int i10 = this.f71933b;
                    int i11 = 1;
                    if ((i10 & 1) != 1) {
                        i11 = 0;
                    }
                    int unused = cVar.f71923d = this.f71934c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    int unused2 = cVar.f71924e = this.f71935d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    Object unused3 = cVar.f71925f = this.f71936e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    C1034c unused4 = cVar.f71926g = this.f71937f;
                    if ((this.f71933b & 16) == 16) {
                        this.f71938g = Collections.unmodifiableList(this.f71938g);
                        this.f71933b &= -17;
                    }
                    List unused5 = cVar.f71927h = this.f71938g;
                    if ((this.f71933b & 32) == 32) {
                        this.f71939h = Collections.unmodifiableList(this.f71939h);
                        this.f71933b &= -33;
                    }
                    List unused6 = cVar.f71929j = this.f71939h;
                    int unused7 = cVar.f71922c = i11;
                    return cVar;
                }

                /* renamed from: q */
                public b clone() {
                    return r().k(p());
                }

                /* renamed from: w */
                public b k(c cVar) {
                    if (cVar == c.C()) {
                        return this;
                    }
                    if (cVar.O()) {
                        A(cVar.F());
                    }
                    if (cVar.N()) {
                        z(cVar.E());
                    }
                    if (cVar.P()) {
                        this.f71933b |= 4;
                        this.f71936e = cVar.f71925f;
                    }
                    if (cVar.M()) {
                        y(cVar.D());
                    }
                    if (!cVar.f71927h.isEmpty()) {
                        if (this.f71938g.isEmpty()) {
                            this.f71938g = cVar.f71927h;
                            this.f71933b &= -17;
                        } else {
                            t();
                            this.f71938g.addAll(cVar.f71927h);
                        }
                    }
                    if (!cVar.f71929j.isEmpty()) {
                        if (this.f71939h.isEmpty()) {
                            this.f71939h = cVar.f71929j;
                            this.f71933b &= -33;
                        } else {
                            s();
                            this.f71939h.addAll(cVar.f71929j);
                        }
                    }
                    l(j().b(cVar.f71921b));
                    return this;
                }

                /* renamed from: x */
                public b h0(C6643e eVar, C6645g gVar) {
                    c cVar;
                    c cVar2 = null;
                    try {
                        c cVar3 = (c) c.f71920o.b(eVar, gVar);
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

                public b y(C1034c cVar) {
                    cVar.getClass();
                    this.f71933b |= 8;
                    this.f71937f = cVar;
                    return this;
                }

                public b z(int i10) {
                    this.f71933b |= 2;
                    this.f71935d = i10;
                    return this;
                }

                private void u() {
                }
            }
        }

        private e(C6647i.b bVar) {
            super(bVar);
            this.f71913e = -1;
            this.f71914f = -1;
            this.f71915g = -1;
            this.f71910b = bVar.j();
        }

        private e(boolean z10) {
            this.f71913e = -1;
            this.f71914f = -1;
            this.f71915g = -1;
            this.f71910b = C6642d.f72492a;
        }

        private e(C6643e eVar, C6645g gVar) {
            this.f71913e = -1;
            this.f71914f = -1;
            this.f71915g = -1;
            z();
            C6642d.b x10 = C6642d.x();
            C6644f I10 = C6644f.I(x10, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 10) {
                            if (!z11 || !true) {
                                this.f71911c = new ArrayList();
                                z11 |= true;
                            }
                            this.f71911c.add(eVar.t(c.f71920o, gVar));
                        } else if (J10 == 40) {
                            if (!(z11 & true)) {
                                this.f71912d = new ArrayList();
                                z11 |= true;
                            }
                            this.f71912d.add(Integer.valueOf(eVar.r()));
                        } else if (J10 == 42) {
                            int i10 = eVar.i(eVar.z());
                            if (!(z11 & true) && eVar.e() > 0) {
                                this.f71912d = new ArrayList();
                                z11 |= true;
                            }
                            while (eVar.e() > 0) {
                                this.f71912d.add(Integer.valueOf(eVar.r()));
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
                    if (z11 && true) {
                        this.f71911c = Collections.unmodifiableList(this.f71911c);
                    }
                    if (z11 & true) {
                        this.f71912d = Collections.unmodifiableList(this.f71912d);
                    }
                    try {
                        I10.H();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f71910b = x10.n();
                        throw th3;
                    }
                    this.f71910b = x10.n();
                    m();
                    throw th2;
                }
            }
            if (z11 && true) {
                this.f71911c = Collections.unmodifiableList(this.f71911c);
            }
            if (z11 & true) {
                this.f71912d = Collections.unmodifiableList(this.f71912d);
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f71910b = x10.n();
                throw th4;
            }
            this.f71910b = x10.n();
            m();
        }

        /* renamed from: lg.a$e$b */
        public static final class b extends C6647i.b implements pg.q {

            /* renamed from: b  reason: collision with root package name */
            private int f71916b;

            /* renamed from: c  reason: collision with root package name */
            private List f71917c = Collections.emptyList();

            /* renamed from: d  reason: collision with root package name */
            private List f71918d = Collections.emptyList();

            private b() {
                u();
            }

            /* access modifiers changed from: private */
            public static b r() {
                return new b();
            }

            private void s() {
                if ((this.f71916b & 2) != 2) {
                    this.f71918d = new ArrayList(this.f71918d);
                    this.f71916b |= 2;
                }
            }

            private void t() {
                if ((this.f71916b & 1) != 1) {
                    this.f71917c = new ArrayList(this.f71917c);
                    this.f71916b |= 1;
                }
            }

            /* renamed from: o */
            public e f() {
                e p10 = p();
                if (p10.e()) {
                    return p10;
                }
                throw C6639a.C1046a.i(p10);
            }

            public e p() {
                e eVar = new e((C6647i.b) this);
                if ((this.f71916b & 1) == 1) {
                    this.f71917c = Collections.unmodifiableList(this.f71917c);
                    this.f71916b &= -2;
                }
                List unused = eVar.f71911c = this.f71917c;
                if ((this.f71916b & 2) == 2) {
                    this.f71918d = Collections.unmodifiableList(this.f71918d);
                    this.f71916b &= -3;
                }
                List unused2 = eVar.f71912d = this.f71918d;
                return eVar;
            }

            /* renamed from: q */
            public b clone() {
                return r().k(p());
            }

            /* renamed from: w */
            public b k(e eVar) {
                if (eVar == e.w()) {
                    return this;
                }
                if (!eVar.f71911c.isEmpty()) {
                    if (this.f71917c.isEmpty()) {
                        this.f71917c = eVar.f71911c;
                        this.f71916b &= -2;
                    } else {
                        t();
                        this.f71917c.addAll(eVar.f71911c);
                    }
                }
                if (!eVar.f71912d.isEmpty()) {
                    if (this.f71918d.isEmpty()) {
                        this.f71918d = eVar.f71912d;
                        this.f71916b &= -3;
                    } else {
                        s();
                        this.f71918d.addAll(eVar.f71912d);
                    }
                }
                l(j().b(eVar.f71910b));
                return this;
            }

            /* renamed from: x */
            public b h0(C6643e eVar, C6645g gVar) {
                e eVar2;
                e eVar3 = null;
                try {
                    e eVar4 = (e) e.f71909i.b(eVar, gVar);
                    if (eVar4 != null) {
                        k(eVar4);
                    }
                    return this;
                } catch (C6649k e10) {
                    eVar2 = (e) e10.a();
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    eVar3 = eVar2;
                }
                if (eVar3 != null) {
                    k(eVar3);
                }
                throw th;
            }

            private void u() {
            }
        }
    }

    static {
        ig.d H10 = ig.d.H();
        c v10 = c.v();
        c v11 = c.v();
        y.b bVar = y.b.MESSAGE;
        f71855a = C6647i.o(H10, v10, v11, (C6648j.b) null, 100, bVar, c.class);
        y.b bVar2 = bVar;
        f71856b = C6647i.o(i.a0(), c.v(), c.v(), (C6648j.b) null, 100, bVar2, c.class);
        i a02 = i.a0();
        y.b bVar3 = y.b.INT32;
        f71857c = C6647i.o(a02, (Object) null, (p) null, (C6648j.b) null, 101, bVar3, Integer.class);
        f71858d = C6647i.o(n.Y(), d.y(), d.y(), (C6648j.b) null, 100, bVar2, d.class);
        f71859e = C6647i.o(n.Y(), (Object) null, (p) null, (C6648j.b) null, 101, bVar3, Integer.class);
        f71860f = C6647i.n(q.X(), ig.b.z(), (C6648j.b) null, 100, bVar, false, ig.b.class);
        f71862h = C6647i.n(s.K(), ig.b.z(), (C6648j.b) null, 100, bVar, false, ig.b.class);
        f71863i = C6647i.o(ig.c.z0(), (Object) null, (p) null, (C6648j.b) null, 101, bVar3, Integer.class);
        f71864j = C6647i.n(ig.c.z0(), n.Y(), (C6648j.b) null, 102, bVar, false, n.class);
        y.b bVar4 = bVar3;
        f71865k = C6647i.o(ig.c.z0(), (Object) null, (p) null, (C6648j.b) null, 103, bVar4, Integer.class);
        f71866l = C6647i.o(ig.c.z0(), (Object) null, (p) null, (C6648j.b) null, 104, bVar4, Integer.class);
        f71867m = C6647i.o(l.K(), (Object) null, (p) null, (C6648j.b) null, 101, bVar4, Integer.class);
        f71868n = C6647i.n(l.K(), n.Y(), (C6648j.b) null, 102, bVar, false, n.class);
    }

    public static void a(C6645g gVar) {
        gVar.a(f71855a);
        gVar.a(f71856b);
        gVar.a(f71857c);
        gVar.a(f71858d);
        gVar.a(f71859e);
        gVar.a(f71860f);
        gVar.a(f71861g);
        gVar.a(f71862h);
        gVar.a(f71863i);
        gVar.a(f71864j);
        gVar.a(f71865k);
        gVar.a(f71866l);
        gVar.a(f71867m);
        gVar.a(f71868n);
    }

    /* renamed from: lg.a$b */
    public static final class b extends C6647i implements pg.q {

        /* renamed from: h  reason: collision with root package name */
        private static final b f71869h;

        /* renamed from: i  reason: collision with root package name */
        public static r f71870i = new C1028a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C6642d f71871b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f71872c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f71873d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f71874e;

        /* renamed from: f  reason: collision with root package name */
        private byte f71875f;

        /* renamed from: g  reason: collision with root package name */
        private int f71876g;

        /* renamed from: lg.a$b$a  reason: collision with other inner class name */
        static class C1028a extends C6640b {
            C1028a() {
            }

            /* renamed from: j */
            public b b(C6643e eVar, C6645g gVar) {
                return new b(eVar, gVar);
            }
        }

        static {
            b bVar = new b(true);
            f71869h = bVar;
            bVar.A();
        }

        private void A() {
            this.f71873d = 0;
            this.f71874e = 0;
        }

        public static C1029b B() {
            return C1029b.r();
        }

        public static C1029b C(b bVar) {
            return B().k(bVar);
        }

        public static b v() {
            return f71869h;
        }

        /* renamed from: D */
        public C1029b c() {
            return B();
        }

        /* renamed from: E */
        public C1029b g() {
            return C(this);
        }

        public int a() {
            int i10;
            int i11 = this.f71876g;
            if (i11 != -1) {
                return i11;
            }
            if ((this.f71872c & 1) == 1) {
                i10 = C6644f.o(1, this.f71873d);
            } else {
                i10 = 0;
            }
            if ((this.f71872c & 2) == 2) {
                i10 += C6644f.o(2, this.f71874e);
            }
            int size = i10 + this.f71871b.size();
            this.f71876g = size;
            return size;
        }

        public final boolean e() {
            byte b10 = this.f71875f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f71875f = 1;
            return true;
        }

        public void h(C6644f fVar) {
            a();
            if ((this.f71872c & 1) == 1) {
                fVar.Z(1, this.f71873d);
            }
            if ((this.f71872c & 2) == 2) {
                fVar.Z(2, this.f71874e);
            }
            fVar.h0(this.f71871b);
        }

        public int w() {
            return this.f71874e;
        }

        public int x() {
            return this.f71873d;
        }

        public boolean y() {
            if ((this.f71872c & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean z() {
            if ((this.f71872c & 1) == 1) {
                return true;
            }
            return false;
        }

        private b(C6647i.b bVar) {
            super(bVar);
            this.f71875f = -1;
            this.f71876g = -1;
            this.f71871b = bVar.j();
        }

        private b(boolean z10) {
            this.f71875f = -1;
            this.f71876g = -1;
            this.f71871b = C6642d.f72492a;
        }

        private b(C6643e eVar, C6645g gVar) {
            this.f71875f = -1;
            this.f71876g = -1;
            A();
            C6642d.b x10 = C6642d.x();
            C6644f I10 = C6644f.I(x10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 8) {
                            this.f71872c |= 1;
                            this.f71873d = eVar.r();
                        } else if (J10 == 16) {
                            this.f71872c |= 2;
                            this.f71874e = eVar.r();
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
                        this.f71871b = x10.n();
                        throw th3;
                    }
                    this.f71871b = x10.n();
                    m();
                    throw th2;
                }
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f71871b = x10.n();
                throw th4;
            }
            this.f71871b = x10.n();
            m();
        }

        /* renamed from: lg.a$b$b  reason: collision with other inner class name */
        public static final class C1029b extends C6647i.b implements pg.q {

            /* renamed from: b  reason: collision with root package name */
            private int f71877b;

            /* renamed from: c  reason: collision with root package name */
            private int f71878c;

            /* renamed from: d  reason: collision with root package name */
            private int f71879d;

            private C1029b() {
                s();
            }

            /* access modifiers changed from: private */
            public static C1029b r() {
                return new C1029b();
            }

            /* renamed from: o */
            public b f() {
                b p10 = p();
                if (p10.e()) {
                    return p10;
                }
                throw C6639a.C1046a.i(p10);
            }

            public b p() {
                b bVar = new b((C6647i.b) this);
                int i10 = this.f71877b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                int unused = bVar.f71873d = this.f71878c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                int unused2 = bVar.f71874e = this.f71879d;
                int unused3 = bVar.f71872c = i11;
                return bVar;
            }

            /* renamed from: q */
            public C1029b clone() {
                return r().k(p());
            }

            /* renamed from: t */
            public C1029b k(b bVar) {
                if (bVar == b.v()) {
                    return this;
                }
                if (bVar.z()) {
                    x(bVar.x());
                }
                if (bVar.y()) {
                    w(bVar.w());
                }
                l(j().b(bVar.f71871b));
                return this;
            }

            /* renamed from: u */
            public C1029b h0(C6643e eVar, C6645g gVar) {
                b bVar;
                b bVar2 = null;
                try {
                    b bVar3 = (b) b.f71870i.b(eVar, gVar);
                    if (bVar3 != null) {
                        k(bVar3);
                    }
                    return this;
                } catch (C6649k e10) {
                    bVar = (b) e10.a();
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    k(bVar2);
                }
                throw th;
            }

            public C1029b w(int i10) {
                this.f71877b |= 2;
                this.f71879d = i10;
                return this;
            }

            public C1029b x(int i10) {
                this.f71877b |= 1;
                this.f71878c = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    /* renamed from: lg.a$c */
    public static final class c extends C6647i implements pg.q {

        /* renamed from: h  reason: collision with root package name */
        private static final c f71880h;

        /* renamed from: i  reason: collision with root package name */
        public static r f71881i = new C1030a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C6642d f71882b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f71883c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f71884d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f71885e;

        /* renamed from: f  reason: collision with root package name */
        private byte f71886f;

        /* renamed from: g  reason: collision with root package name */
        private int f71887g;

        /* renamed from: lg.a$c$a  reason: collision with other inner class name */
        static class C1030a extends C6640b {
            C1030a() {
            }

            /* renamed from: j */
            public c b(C6643e eVar, C6645g gVar) {
                return new c(eVar, gVar);
            }
        }

        static {
            c cVar = new c(true);
            f71880h = cVar;
            cVar.A();
        }

        private void A() {
            this.f71884d = 0;
            this.f71885e = 0;
        }

        public static b B() {
            return b.r();
        }

        public static b C(c cVar) {
            return B().k(cVar);
        }

        public static c v() {
            return f71880h;
        }

        /* renamed from: D */
        public b c() {
            return B();
        }

        /* renamed from: E */
        public b g() {
            return C(this);
        }

        public int a() {
            int i10;
            int i11 = this.f71887g;
            if (i11 != -1) {
                return i11;
            }
            if ((this.f71883c & 1) == 1) {
                i10 = C6644f.o(1, this.f71884d);
            } else {
                i10 = 0;
            }
            if ((this.f71883c & 2) == 2) {
                i10 += C6644f.o(2, this.f71885e);
            }
            int size = i10 + this.f71882b.size();
            this.f71887g = size;
            return size;
        }

        public final boolean e() {
            byte b10 = this.f71886f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f71886f = 1;
            return true;
        }

        public void h(C6644f fVar) {
            a();
            if ((this.f71883c & 1) == 1) {
                fVar.Z(1, this.f71884d);
            }
            if ((this.f71883c & 2) == 2) {
                fVar.Z(2, this.f71885e);
            }
            fVar.h0(this.f71882b);
        }

        public int w() {
            return this.f71885e;
        }

        public int x() {
            return this.f71884d;
        }

        public boolean y() {
            if ((this.f71883c & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean z() {
            if ((this.f71883c & 1) == 1) {
                return true;
            }
            return false;
        }

        private c(C6647i.b bVar) {
            super(bVar);
            this.f71886f = -1;
            this.f71887g = -1;
            this.f71882b = bVar.j();
        }

        private c(boolean z10) {
            this.f71886f = -1;
            this.f71887g = -1;
            this.f71882b = C6642d.f72492a;
        }

        private c(C6643e eVar, C6645g gVar) {
            this.f71886f = -1;
            this.f71887g = -1;
            A();
            C6642d.b x10 = C6642d.x();
            C6644f I10 = C6644f.I(x10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 8) {
                            this.f71883c |= 1;
                            this.f71884d = eVar.r();
                        } else if (J10 == 16) {
                            this.f71883c |= 2;
                            this.f71885e = eVar.r();
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
                        this.f71882b = x10.n();
                        throw th3;
                    }
                    this.f71882b = x10.n();
                    m();
                    throw th2;
                }
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f71882b = x10.n();
                throw th4;
            }
            this.f71882b = x10.n();
            m();
        }

        /* renamed from: lg.a$c$b */
        public static final class b extends C6647i.b implements pg.q {

            /* renamed from: b  reason: collision with root package name */
            private int f71888b;

            /* renamed from: c  reason: collision with root package name */
            private int f71889c;

            /* renamed from: d  reason: collision with root package name */
            private int f71890d;

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
                int i10 = this.f71888b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                int unused = cVar.f71884d = this.f71889c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                int unused2 = cVar.f71885e = this.f71890d;
                int unused3 = cVar.f71883c = i11;
                return cVar;
            }

            /* renamed from: q */
            public b clone() {
                return r().k(p());
            }

            /* renamed from: t */
            public b k(c cVar) {
                if (cVar == c.v()) {
                    return this;
                }
                if (cVar.z()) {
                    x(cVar.x());
                }
                if (cVar.y()) {
                    w(cVar.w());
                }
                l(j().b(cVar.f71882b));
                return this;
            }

            /* renamed from: u */
            public b h0(C6643e eVar, C6645g gVar) {
                c cVar;
                c cVar2 = null;
                try {
                    c cVar3 = (c) c.f71881i.b(eVar, gVar);
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

            public b w(int i10) {
                this.f71888b |= 2;
                this.f71890d = i10;
                return this;
            }

            public b x(int i10) {
                this.f71888b |= 1;
                this.f71889c = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    /* renamed from: lg.a$d */
    public static final class d extends C6647i implements pg.q {

        /* renamed from: k  reason: collision with root package name */
        private static final d f71891k;

        /* renamed from: l  reason: collision with root package name */
        public static r f71892l = new C1031a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C6642d f71893b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f71894c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public b f71895d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public c f71896e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public c f71897f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public c f71898g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public c f71899h;

        /* renamed from: i  reason: collision with root package name */
        private byte f71900i;

        /* renamed from: j  reason: collision with root package name */
        private int f71901j;

        /* renamed from: lg.a$d$a  reason: collision with other inner class name */
        static class C1031a extends C6640b {
            C1031a() {
            }

            /* renamed from: j */
            public d b(C6643e eVar, C6645g gVar) {
                return new d(eVar, gVar);
            }
        }

        static {
            d dVar = new d(true);
            f71891k = dVar;
            dVar.J();
        }

        private void J() {
            this.f71895d = b.v();
            this.f71896e = c.v();
            this.f71897f = c.v();
            this.f71898g = c.v();
            this.f71899h = c.v();
        }

        public static b K() {
            return b.r();
        }

        public static b L(d dVar) {
            return K().k(dVar);
        }

        public static d y() {
            return f71891k;
        }

        public b A() {
            return this.f71895d;
        }

        public c B() {
            return this.f71897f;
        }

        public c C() {
            return this.f71898g;
        }

        public c D() {
            return this.f71896e;
        }

        public boolean E() {
            if ((this.f71894c & 16) == 16) {
                return true;
            }
            return false;
        }

        public boolean F() {
            if ((this.f71894c & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean G() {
            if ((this.f71894c & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean H() {
            if ((this.f71894c & 8) == 8) {
                return true;
            }
            return false;
        }

        public boolean I() {
            if ((this.f71894c & 2) == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: M */
        public b c() {
            return K();
        }

        /* renamed from: N */
        public b g() {
            return L(this);
        }

        public int a() {
            int i10;
            int i11 = this.f71901j;
            if (i11 != -1) {
                return i11;
            }
            if ((this.f71894c & 1) == 1) {
                i10 = C6644f.r(1, this.f71895d);
            } else {
                i10 = 0;
            }
            if ((this.f71894c & 2) == 2) {
                i10 += C6644f.r(2, this.f71896e);
            }
            if ((this.f71894c & 4) == 4) {
                i10 += C6644f.r(3, this.f71897f);
            }
            if ((this.f71894c & 8) == 8) {
                i10 += C6644f.r(4, this.f71898g);
            }
            if ((this.f71894c & 16) == 16) {
                i10 += C6644f.r(5, this.f71899h);
            }
            int size = i10 + this.f71893b.size();
            this.f71901j = size;
            return size;
        }

        public final boolean e() {
            byte b10 = this.f71900i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f71900i = 1;
            return true;
        }

        public void h(C6644f fVar) {
            a();
            if ((this.f71894c & 1) == 1) {
                fVar.c0(1, this.f71895d);
            }
            if ((this.f71894c & 2) == 2) {
                fVar.c0(2, this.f71896e);
            }
            if ((this.f71894c & 4) == 4) {
                fVar.c0(3, this.f71897f);
            }
            if ((this.f71894c & 8) == 8) {
                fVar.c0(4, this.f71898g);
            }
            if ((this.f71894c & 16) == 16) {
                fVar.c0(5, this.f71899h);
            }
            fVar.h0(this.f71893b);
        }

        public c z() {
            return this.f71899h;
        }

        private d(C6647i.b bVar) {
            super(bVar);
            this.f71900i = -1;
            this.f71901j = -1;
            this.f71893b = bVar.j();
        }

        private d(boolean z10) {
            this.f71900i = -1;
            this.f71901j = -1;
            this.f71893b = C6642d.f72492a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: lg.a$b$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: lg.a$c$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: lg.a$c$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: lg.a$c$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: lg.a$c$b} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v11 */
        /* JADX WARNING: type inference failed for: r6v12 */
        /* JADX WARNING: type inference failed for: r6v13 */
        /* JADX WARNING: type inference failed for: r6v14 */
        /* JADX WARNING: type inference failed for: r6v15 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private d(pg.C6643e r8, pg.C6645g r9) {
            /*
                r7 = this;
                r7.<init>()
                r0 = -1
                r7.f71900i = r0
                r7.f71901j = r0
                r7.J()
                pg.d$b r0 = pg.C6642d.x()
                r1 = 1
                pg.f r2 = pg.C6644f.I(r0, r1)
                r3 = 0
            L_0x0015:
                if (r3 != 0) goto L_0x0133
                int r4 = r8.J()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r4 == 0) goto L_0x0038
                r5 = 10
                r6 = 0
                if (r4 == r5) goto L_0x00e3
                r5 = 18
                if (r4 == r5) goto L_0x00bb
                r5 = 26
                if (r4 == r5) goto L_0x0093
                r5 = 34
                if (r4 == r5) goto L_0x006b
                r5 = 42
                if (r4 == r5) goto L_0x0043
                boolean r4 = r7.p(r8, r2, r9, r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r4 != 0) goto L_0x0015
            L_0x0038:
                r3 = r1
                goto L_0x0015
            L_0x003a:
                r8 = move-exception
                goto L_0x011d
            L_0x003d:
                r8 = move-exception
                goto L_0x010a
            L_0x0040:
                r8 = move-exception
                goto L_0x0118
            L_0x0043:
                int r4 = r7.f71894c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r5 = 16
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0050
                lg.a$c r4 = r7.f71899h     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c$b r6 = r4.g()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x0050:
                pg.r r4 = lg.C6536a.c.f71881i     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                pg.p r4 = r8.t(r4, r9)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c r4 = (lg.C6536a.c) r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f71899h = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r6 == 0) goto L_0x0065
                r6.k(r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c r4 = r6.p()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f71899h = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x0065:
                int r4 = r7.f71894c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 | r5
                r7.f71894c = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                goto L_0x0015
            L_0x006b:
                int r4 = r7.f71894c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r5 = 8
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0078
                lg.a$c r4 = r7.f71898g     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c$b r6 = r4.g()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x0078:
                pg.r r4 = lg.C6536a.c.f71881i     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                pg.p r4 = r8.t(r4, r9)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c r4 = (lg.C6536a.c) r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f71898g = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r6 == 0) goto L_0x008d
                r6.k(r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c r4 = r6.p()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f71898g = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x008d:
                int r4 = r7.f71894c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 | r5
                r7.f71894c = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                goto L_0x0015
            L_0x0093:
                int r4 = r7.f71894c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r5 = 4
                r4 = r4 & r5
                if (r4 != r5) goto L_0x009f
                lg.a$c r4 = r7.f71897f     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c$b r6 = r4.g()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x009f:
                pg.r r4 = lg.C6536a.c.f71881i     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                pg.p r4 = r8.t(r4, r9)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c r4 = (lg.C6536a.c) r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f71897f = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r6 == 0) goto L_0x00b4
                r6.k(r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c r4 = r6.p()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f71897f = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x00b4:
                int r4 = r7.f71894c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 | r5
                r7.f71894c = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                goto L_0x0015
            L_0x00bb:
                int r4 = r7.f71894c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r5 = 2
                r4 = r4 & r5
                if (r4 != r5) goto L_0x00c7
                lg.a$c r4 = r7.f71896e     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c$b r6 = r4.g()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x00c7:
                pg.r r4 = lg.C6536a.c.f71881i     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                pg.p r4 = r8.t(r4, r9)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c r4 = (lg.C6536a.c) r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f71896e = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r6 == 0) goto L_0x00dc
                r6.k(r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$c r4 = r6.p()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f71896e = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x00dc:
                int r4 = r7.f71894c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 | r5
                r7.f71894c = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                goto L_0x0015
            L_0x00e3:
                int r4 = r7.f71894c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 & r1
                if (r4 != r1) goto L_0x00ee
                lg.a$b r4 = r7.f71895d     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$b$b r6 = r4.g()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x00ee:
                pg.r r4 = lg.C6536a.b.f71870i     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                pg.p r4 = r8.t(r4, r9)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$b r4 = (lg.C6536a.b) r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f71895d = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                if (r6 == 0) goto L_0x0103
                r6.k(r4)     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                lg.a$b r4 = r6.p()     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r7.f71895d = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
            L_0x0103:
                int r4 = r7.f71894c     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                r4 = r4 | r1
                r7.f71894c = r4     // Catch:{ k -> 0x0040, IOException -> 0x003d }
                goto L_0x0015
            L_0x010a:
                pg.k r9 = new pg.k     // Catch:{ all -> 0x003a }
                java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x003a }
                r9.<init>(r8)     // Catch:{ all -> 0x003a }
                pg.k r8 = r9.i(r7)     // Catch:{ all -> 0x003a }
                throw r8     // Catch:{ all -> 0x003a }
            L_0x0118:
                pg.k r8 = r8.i(r7)     // Catch:{ all -> 0x003a }
                throw r8     // Catch:{ all -> 0x003a }
            L_0x011d:
                r2.H()     // Catch:{ IOException -> 0x0120, all -> 0x0127 }
            L_0x0120:
                pg.d r9 = r0.n()
                r7.f71893b = r9
                goto L_0x012f
            L_0x0127:
                r8 = move-exception
                pg.d r9 = r0.n()
                r7.f71893b = r9
                throw r8
            L_0x012f:
                r7.m()
                throw r8
            L_0x0133:
                r2.H()     // Catch:{ IOException -> 0x0136, all -> 0x013d }
            L_0x0136:
                pg.d r8 = r0.n()
                r7.f71893b = r8
                goto L_0x0145
            L_0x013d:
                r8 = move-exception
                pg.d r9 = r0.n()
                r7.f71893b = r9
                throw r8
            L_0x0145:
                r7.m()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lg.C6536a.d.<init>(pg.e, pg.g):void");
        }

        /* renamed from: lg.a$d$b */
        public static final class b extends C6647i.b implements pg.q {

            /* renamed from: b  reason: collision with root package name */
            private int f71902b;

            /* renamed from: c  reason: collision with root package name */
            private b f71903c = b.v();

            /* renamed from: d  reason: collision with root package name */
            private c f71904d = c.v();

            /* renamed from: e  reason: collision with root package name */
            private c f71905e = c.v();

            /* renamed from: f  reason: collision with root package name */
            private c f71906f = c.v();

            /* renamed from: g  reason: collision with root package name */
            private c f71907g = c.v();

            private b() {
                s();
            }

            /* access modifiers changed from: private */
            public static b r() {
                return new b();
            }

            public b A(c cVar) {
                if ((this.f71902b & 2) != 2 || this.f71904d == c.v()) {
                    this.f71904d = cVar;
                } else {
                    this.f71904d = c.C(this.f71904d).k(cVar).p();
                }
                this.f71902b |= 2;
                return this;
            }

            /* renamed from: o */
            public d f() {
                d p10 = p();
                if (p10.e()) {
                    return p10;
                }
                throw C6639a.C1046a.i(p10);
            }

            public d p() {
                d dVar = new d((C6647i.b) this);
                int i10 = this.f71902b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                b unused = dVar.f71895d = this.f71903c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c unused2 = dVar.f71896e = this.f71904d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                c unused3 = dVar.f71897f = this.f71905e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                c unused4 = dVar.f71898g = this.f71906f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                c unused5 = dVar.f71899h = this.f71907g;
                int unused6 = dVar.f71894c = i11;
                return dVar;
            }

            /* renamed from: q */
            public b clone() {
                return r().k(p());
            }

            public b t(c cVar) {
                if ((this.f71902b & 16) != 16 || this.f71907g == c.v()) {
                    this.f71907g = cVar;
                } else {
                    this.f71907g = c.C(this.f71907g).k(cVar).p();
                }
                this.f71902b |= 16;
                return this;
            }

            public b u(b bVar) {
                if ((this.f71902b & 1) != 1 || this.f71903c == b.v()) {
                    this.f71903c = bVar;
                } else {
                    this.f71903c = b.C(this.f71903c).k(bVar).p();
                }
                this.f71902b |= 1;
                return this;
            }

            /* renamed from: w */
            public b k(d dVar) {
                if (dVar == d.y()) {
                    return this;
                }
                if (dVar.F()) {
                    u(dVar.A());
                }
                if (dVar.I()) {
                    A(dVar.D());
                }
                if (dVar.G()) {
                    y(dVar.B());
                }
                if (dVar.H()) {
                    z(dVar.C());
                }
                if (dVar.E()) {
                    t(dVar.z());
                }
                l(j().b(dVar.f71893b));
                return this;
            }

            /* renamed from: x */
            public b h0(C6643e eVar, C6645g gVar) {
                d dVar;
                d dVar2 = null;
                try {
                    d dVar3 = (d) d.f71892l.b(eVar, gVar);
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

            public b y(c cVar) {
                if ((this.f71902b & 4) != 4 || this.f71905e == c.v()) {
                    this.f71905e = cVar;
                } else {
                    this.f71905e = c.C(this.f71905e).k(cVar).p();
                }
                this.f71902b |= 4;
                return this;
            }

            public b z(c cVar) {
                if ((this.f71902b & 8) != 8 || this.f71906f == c.v()) {
                    this.f71906f = cVar;
                } else {
                    this.f71906f = c.C(this.f71906f).k(cVar).p();
                }
                this.f71902b |= 8;
                return this;
            }

            private void s() {
            }
        }
    }
}
