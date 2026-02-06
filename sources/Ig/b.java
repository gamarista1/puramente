package ig;

import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
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

public final class b extends C6647i implements q {

    /* renamed from: h  reason: collision with root package name */
    private static final b f67903h;

    /* renamed from: i  reason: collision with root package name */
    public static r f67904i = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6642d f67905b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f67906c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f67907d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List f67908e;

    /* renamed from: f  reason: collision with root package name */
    private byte f67909f;

    /* renamed from: g  reason: collision with root package name */
    private int f67910g;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public b b(C6643e eVar, C6645g gVar) {
            return new b(eVar, gVar);
        }
    }

    /* renamed from: ig.b$b  reason: collision with other inner class name */
    public static final class C1013b extends C6647i implements q {

        /* renamed from: h  reason: collision with root package name */
        private static final C1013b f67911h;

        /* renamed from: i  reason: collision with root package name */
        public static r f67912i = new a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C6642d f67913b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f67914c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f67915d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public c f67916e;

        /* renamed from: f  reason: collision with root package name */
        private byte f67917f;

        /* renamed from: g  reason: collision with root package name */
        private int f67918g;

        /* renamed from: ig.b$b$a */
        static class a extends C6640b {
            a() {
            }

            /* renamed from: j */
            public C1013b b(C6643e eVar, C6645g gVar) {
                return new C1013b(eVar, gVar);
            }
        }

        static {
            C1013b bVar = new C1013b(true);
            f67911h = bVar;
            bVar.A();
        }

        private void A() {
            this.f67915d = 0;
            this.f67916e = c.L();
        }

        public static C1014b B() {
            return C1014b.r();
        }

        public static C1014b C(C1013b bVar) {
            return B().k(bVar);
        }

        public static C1013b v() {
            return f67911h;
        }

        /* renamed from: D */
        public C1014b c() {
            return B();
        }

        /* renamed from: E */
        public C1014b g() {
            return C(this);
        }

        public int a() {
            int i10;
            int i11 = this.f67918g;
            if (i11 != -1) {
                return i11;
            }
            if ((this.f67914c & 1) == 1) {
                i10 = C6644f.o(1, this.f67915d);
            } else {
                i10 = 0;
            }
            if ((this.f67914c & 2) == 2) {
                i10 += C6644f.r(2, this.f67916e);
            }
            int size = i10 + this.f67913b.size();
            this.f67918g = size;
            return size;
        }

        public final boolean e() {
            byte b10 = this.f67917f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!y()) {
                this.f67917f = 0;
                return false;
            } else if (!z()) {
                this.f67917f = 0;
                return false;
            } else if (!x().e()) {
                this.f67917f = 0;
                return false;
            } else {
                this.f67917f = 1;
                return true;
            }
        }

        public void h(C6644f fVar) {
            a();
            if ((this.f67914c & 1) == 1) {
                fVar.Z(1, this.f67915d);
            }
            if ((this.f67914c & 2) == 2) {
                fVar.c0(2, this.f67916e);
            }
            fVar.h0(this.f67913b);
        }

        public int w() {
            return this.f67915d;
        }

        public c x() {
            return this.f67916e;
        }

        public boolean y() {
            if ((this.f67914c & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean z() {
            if ((this.f67914c & 2) == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: ig.b$b$c */
        public static final class c extends C6647i implements q {

            /* renamed from: q  reason: collision with root package name */
            private static final c f67922q;

            /* renamed from: r  reason: collision with root package name */
            public static r f67923r = new a();
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public final C6642d f67924b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public int f67925c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public C1016c f67926d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public long f67927e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public float f67928f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public double f67929g;
            /* access modifiers changed from: private */

            /* renamed from: h  reason: collision with root package name */
            public int f67930h;
            /* access modifiers changed from: private */

            /* renamed from: i  reason: collision with root package name */
            public int f67931i;
            /* access modifiers changed from: private */

            /* renamed from: j  reason: collision with root package name */
            public int f67932j;
            /* access modifiers changed from: private */

            /* renamed from: k  reason: collision with root package name */
            public b f67933k;
            /* access modifiers changed from: private */

            /* renamed from: l  reason: collision with root package name */
            public List f67934l;
            /* access modifiers changed from: private */

            /* renamed from: m  reason: collision with root package name */
            public int f67935m;
            /* access modifiers changed from: private */

            /* renamed from: n  reason: collision with root package name */
            public int f67936n;

            /* renamed from: o  reason: collision with root package name */
            private byte f67937o;

            /* renamed from: p  reason: collision with root package name */
            private int f67938p;

            /* renamed from: ig.b$b$c$a */
            static class a extends C6640b {
                a() {
                }

                /* renamed from: j */
                public c b(C6643e eVar, C6645g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* renamed from: ig.b$b$c$c  reason: collision with other inner class name */
            public enum C1016c implements C6648j.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                

                /* renamed from: o  reason: collision with root package name */
                private static C6648j.b f67964o;

                /* renamed from: a  reason: collision with root package name */
                private final int f67966a;

                /* renamed from: ig.b$b$c$c$a */
                static class a implements C6648j.b {
                    a() {
                    }

                    /* renamed from: b */
                    public C1016c a(int i10) {
                        return C1016c.a(i10);
                    }
                }

                static {
                    f67964o = new a();
                }

                private C1016c(int i10, int i11) {
                    this.f67966a = i11;
                }

                public static C1016c a(int i10) {
                    switch (i10) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                public final int d() {
                    return this.f67966a;
                }
            }

            static {
                c cVar = new c(true);
                f67922q = cVar;
                cVar.d0();
            }

            public static c L() {
                return f67922q;
            }

            private void d0() {
                this.f67926d = C1016c.BYTE;
                this.f67927e = 0;
                this.f67928f = 0.0f;
                this.f67929g = 0.0d;
                this.f67930h = 0;
                this.f67931i = 0;
                this.f67932j = 0;
                this.f67933k = b.z();
                this.f67934l = Collections.emptyList();
                this.f67935m = 0;
                this.f67936n = 0;
            }

            public static C1015b e0() {
                return C1015b.r();
            }

            public static C1015b f0(c cVar) {
                return e0().k(cVar);
            }

            public b F() {
                return this.f67933k;
            }

            public int G() {
                return this.f67935m;
            }

            public c H(int i10) {
                return (c) this.f67934l.get(i10);
            }

            public int I() {
                return this.f67934l.size();
            }

            public List J() {
                return this.f67934l;
            }

            public int K() {
                return this.f67931i;
            }

            public double M() {
                return this.f67929g;
            }

            public int N() {
                return this.f67932j;
            }

            public int O() {
                return this.f67936n;
            }

            public float P() {
                return this.f67928f;
            }

            public long Q() {
                return this.f67927e;
            }

            public int R() {
                return this.f67930h;
            }

            public C1016c S() {
                return this.f67926d;
            }

            public boolean T() {
                if ((this.f67925c & 128) == 128) {
                    return true;
                }
                return false;
            }

            public boolean U() {
                if ((this.f67925c & 256) == 256) {
                    return true;
                }
                return false;
            }

            public boolean V() {
                if ((this.f67925c & 32) == 32) {
                    return true;
                }
                return false;
            }

            public boolean W() {
                if ((this.f67925c & 8) == 8) {
                    return true;
                }
                return false;
            }

            public boolean X() {
                if ((this.f67925c & 64) == 64) {
                    return true;
                }
                return false;
            }

            public boolean Y() {
                if ((this.f67925c & 512) == 512) {
                    return true;
                }
                return false;
            }

            public boolean Z() {
                if ((this.f67925c & 4) == 4) {
                    return true;
                }
                return false;
            }

            public int a() {
                int i10;
                int i11 = this.f67938p;
                if (i11 != -1) {
                    return i11;
                }
                if ((this.f67925c & 1) == 1) {
                    i10 = C6644f.h(1, this.f67926d.d());
                } else {
                    i10 = 0;
                }
                if ((this.f67925c & 2) == 2) {
                    i10 += C6644f.z(2, this.f67927e);
                }
                if ((this.f67925c & 4) == 4) {
                    i10 += C6644f.l(3, this.f67928f);
                }
                if ((this.f67925c & 8) == 8) {
                    i10 += C6644f.f(4, this.f67929g);
                }
                if ((this.f67925c & 16) == 16) {
                    i10 += C6644f.o(5, this.f67930h);
                }
                if ((this.f67925c & 32) == 32) {
                    i10 += C6644f.o(6, this.f67931i);
                }
                if ((this.f67925c & 64) == 64) {
                    i10 += C6644f.o(7, this.f67932j);
                }
                if ((this.f67925c & 128) == 128) {
                    i10 += C6644f.r(8, this.f67933k);
                }
                for (int i12 = 0; i12 < this.f67934l.size(); i12++) {
                    i10 += C6644f.r(9, (p) this.f67934l.get(i12));
                }
                if ((this.f67925c & 512) == 512) {
                    i10 += C6644f.o(10, this.f67936n);
                }
                if ((this.f67925c & 256) == 256) {
                    i10 += C6644f.o(11, this.f67935m);
                }
                int size = i10 + this.f67924b.size();
                this.f67938p = size;
                return size;
            }

            public boolean a0() {
                if ((this.f67925c & 2) == 2) {
                    return true;
                }
                return false;
            }

            public boolean b0() {
                if ((this.f67925c & 16) == 16) {
                    return true;
                }
                return false;
            }

            public boolean c0() {
                if ((this.f67925c & 1) == 1) {
                    return true;
                }
                return false;
            }

            public final boolean e() {
                byte b10 = this.f67937o;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!T() || F().e()) {
                    for (int i10 = 0; i10 < I(); i10++) {
                        if (!H(i10).e()) {
                            this.f67937o = 0;
                            return false;
                        }
                    }
                    this.f67937o = 1;
                    return true;
                }
                this.f67937o = 0;
                return false;
            }

            /* renamed from: g0 */
            public C1015b c() {
                return e0();
            }

            public void h(C6644f fVar) {
                a();
                if ((this.f67925c & 1) == 1) {
                    fVar.R(1, this.f67926d.d());
                }
                if ((this.f67925c & 2) == 2) {
                    fVar.s0(2, this.f67927e);
                }
                if ((this.f67925c & 4) == 4) {
                    fVar.V(3, this.f67928f);
                }
                if ((this.f67925c & 8) == 8) {
                    fVar.P(4, this.f67929g);
                }
                if ((this.f67925c & 16) == 16) {
                    fVar.Z(5, this.f67930h);
                }
                if ((this.f67925c & 32) == 32) {
                    fVar.Z(6, this.f67931i);
                }
                if ((this.f67925c & 64) == 64) {
                    fVar.Z(7, this.f67932j);
                }
                if ((this.f67925c & 128) == 128) {
                    fVar.c0(8, this.f67933k);
                }
                for (int i10 = 0; i10 < this.f67934l.size(); i10++) {
                    fVar.c0(9, (p) this.f67934l.get(i10));
                }
                if ((this.f67925c & 512) == 512) {
                    fVar.Z(10, this.f67936n);
                }
                if ((this.f67925c & 256) == 256) {
                    fVar.Z(11, this.f67935m);
                }
                fVar.h0(this.f67924b);
            }

            /* renamed from: i0 */
            public C1015b g() {
                return f0(this);
            }

            private c(C6647i.b bVar) {
                super(bVar);
                this.f67937o = -1;
                this.f67938p = -1;
                this.f67924b = bVar.j();
            }

            private c(boolean z10) {
                this.f67937o = -1;
                this.f67938p = -1;
                this.f67924b = C6642d.f72492a;
            }

            private c(C6643e eVar, C6645g gVar) {
                this.f67937o = -1;
                this.f67938p = -1;
                d0();
                C6642d.b x10 = C6642d.x();
                C6644f I10 = C6644f.I(x10, 1);
                boolean z10 = false;
                boolean z11 = false;
                while (!z10) {
                    try {
                        int J10 = eVar.J();
                        switch (J10) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                int m10 = eVar.m();
                                C1016c a10 = C1016c.a(m10);
                                if (a10 != null) {
                                    this.f67925c |= 1;
                                    this.f67926d = a10;
                                    break;
                                } else {
                                    I10.n0(J10);
                                    I10.n0(m10);
                                    break;
                                }
                            case 16:
                                this.f67925c |= 2;
                                this.f67927e = eVar.G();
                                break;
                            case 29:
                                this.f67925c |= 4;
                                this.f67928f = eVar.p();
                                break;
                            case CharsToNameCanonicalizer.HASH_MULT:
                                this.f67925c |= 8;
                                this.f67929g = eVar.l();
                                break;
                            case 40:
                                this.f67925c |= 16;
                                this.f67930h = eVar.r();
                                break;
                            case 48:
                                this.f67925c |= 32;
                                this.f67931i = eVar.r();
                                break;
                            case 56:
                                this.f67925c |= 64;
                                this.f67932j = eVar.r();
                                break;
                            case 66:
                                c G10 = (this.f67925c & 128) == 128 ? this.f67933k.g() : null;
                                b bVar = (b) eVar.t(b.f67904i, gVar);
                                this.f67933k = bVar;
                                if (G10 != null) {
                                    G10.k(bVar);
                                    this.f67933k = G10.p();
                                }
                                this.f67925c |= 128;
                                break;
                            case 74:
                                if (!(z11 & true)) {
                                    this.f67934l = new ArrayList();
                                    z11 = true;
                                }
                                this.f67934l.add(eVar.t(f67923r, gVar));
                                break;
                            case 80:
                                this.f67925c |= 512;
                                this.f67936n = eVar.r();
                                break;
                            case 88:
                                this.f67925c |= 256;
                                this.f67935m = eVar.r();
                                break;
                            default:
                                if (p(eVar, I10, gVar, J10)) {
                                    break;
                                }
                                z10 = true;
                                break;
                        }
                    } catch (C6649k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new C6649k(e11.getMessage()).i(this);
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f67934l = Collections.unmodifiableList(this.f67934l);
                        }
                        try {
                            I10.H();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f67924b = x10.n();
                            throw th3;
                        }
                        this.f67924b = x10.n();
                        m();
                        throw th2;
                    }
                }
                if (z11 & true) {
                    this.f67934l = Collections.unmodifiableList(this.f67934l);
                }
                try {
                    I10.H();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f67924b = x10.n();
                    throw th4;
                }
                this.f67924b = x10.n();
                m();
            }

            /* renamed from: ig.b$b$c$b  reason: collision with other inner class name */
            public static final class C1015b extends C6647i.b implements q {

                /* renamed from: b  reason: collision with root package name */
                private int f67939b;

                /* renamed from: c  reason: collision with root package name */
                private C1016c f67940c = C1016c.BYTE;

                /* renamed from: d  reason: collision with root package name */
                private long f67941d;

                /* renamed from: e  reason: collision with root package name */
                private float f67942e;

                /* renamed from: f  reason: collision with root package name */
                private double f67943f;

                /* renamed from: g  reason: collision with root package name */
                private int f67944g;

                /* renamed from: h  reason: collision with root package name */
                private int f67945h;

                /* renamed from: i  reason: collision with root package name */
                private int f67946i;

                /* renamed from: j  reason: collision with root package name */
                private b f67947j = b.z();

                /* renamed from: k  reason: collision with root package name */
                private List f67948k = Collections.emptyList();

                /* renamed from: l  reason: collision with root package name */
                private int f67949l;

                /* renamed from: m  reason: collision with root package name */
                private int f67950m;

                private C1015b() {
                    t();
                }

                /* access modifiers changed from: private */
                public static C1015b r() {
                    return new C1015b();
                }

                private void s() {
                    if ((this.f67939b & 256) != 256) {
                        this.f67948k = new ArrayList(this.f67948k);
                        this.f67939b |= 256;
                    }
                }

                public C1015b A(double d10) {
                    this.f67939b |= 8;
                    this.f67943f = d10;
                    return this;
                }

                public C1015b B(int i10) {
                    this.f67939b |= 64;
                    this.f67946i = i10;
                    return this;
                }

                public C1015b C(int i10) {
                    this.f67939b |= 1024;
                    this.f67950m = i10;
                    return this;
                }

                public C1015b D(float f10) {
                    this.f67939b |= 4;
                    this.f67942e = f10;
                    return this;
                }

                public C1015b E(long j10) {
                    this.f67939b |= 2;
                    this.f67941d = j10;
                    return this;
                }

                public C1015b F(int i10) {
                    this.f67939b |= 16;
                    this.f67944g = i10;
                    return this;
                }

                public C1015b G(C1016c cVar) {
                    cVar.getClass();
                    this.f67939b |= 1;
                    this.f67940c = cVar;
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
                    int i10 = this.f67939b;
                    int i11 = 1;
                    if ((i10 & 1) != 1) {
                        i11 = 0;
                    }
                    C1016c unused = cVar.f67926d = this.f67940c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    long unused2 = cVar.f67927e = this.f67941d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    float unused3 = cVar.f67928f = this.f67942e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    double unused4 = cVar.f67929g = this.f67943f;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    int unused5 = cVar.f67930h = this.f67944g;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    int unused6 = cVar.f67931i = this.f67945h;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    int unused7 = cVar.f67932j = this.f67946i;
                    if ((i10 & 128) == 128) {
                        i11 |= 128;
                    }
                    b unused8 = cVar.f67933k = this.f67947j;
                    if ((this.f67939b & 256) == 256) {
                        this.f67948k = Collections.unmodifiableList(this.f67948k);
                        this.f67939b &= -257;
                    }
                    List unused9 = cVar.f67934l = this.f67948k;
                    if ((i10 & 512) == 512) {
                        i11 |= 256;
                    }
                    int unused10 = cVar.f67935m = this.f67949l;
                    if ((i10 & 1024) == 1024) {
                        i11 |= 512;
                    }
                    int unused11 = cVar.f67936n = this.f67950m;
                    int unused12 = cVar.f67925c = i11;
                    return cVar;
                }

                /* renamed from: q */
                public C1015b clone() {
                    return r().k(p());
                }

                public C1015b u(b bVar) {
                    if ((this.f67939b & 128) != 128 || this.f67947j == b.z()) {
                        this.f67947j = bVar;
                    } else {
                        this.f67947j = b.E(this.f67947j).k(bVar).p();
                    }
                    this.f67939b |= 128;
                    return this;
                }

                /* renamed from: w */
                public C1015b k(c cVar) {
                    if (cVar == c.L()) {
                        return this;
                    }
                    if (cVar.c0()) {
                        G(cVar.S());
                    }
                    if (cVar.a0()) {
                        E(cVar.Q());
                    }
                    if (cVar.Z()) {
                        D(cVar.P());
                    }
                    if (cVar.W()) {
                        A(cVar.M());
                    }
                    if (cVar.b0()) {
                        F(cVar.R());
                    }
                    if (cVar.V()) {
                        z(cVar.K());
                    }
                    if (cVar.X()) {
                        B(cVar.N());
                    }
                    if (cVar.T()) {
                        u(cVar.F());
                    }
                    if (!cVar.f67934l.isEmpty()) {
                        if (this.f67948k.isEmpty()) {
                            this.f67948k = cVar.f67934l;
                            this.f67939b &= -257;
                        } else {
                            s();
                            this.f67948k.addAll(cVar.f67934l);
                        }
                    }
                    if (cVar.U()) {
                        y(cVar.G());
                    }
                    if (cVar.Y()) {
                        C(cVar.O());
                    }
                    l(j().b(cVar.f67924b));
                    return this;
                }

                /* renamed from: x */
                public C1015b h0(C6643e eVar, C6645g gVar) {
                    c cVar;
                    c cVar2 = null;
                    try {
                        c cVar3 = (c) c.f67923r.b(eVar, gVar);
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

                public C1015b y(int i10) {
                    this.f67939b |= 512;
                    this.f67949l = i10;
                    return this;
                }

                public C1015b z(int i10) {
                    this.f67939b |= 32;
                    this.f67945h = i10;
                    return this;
                }

                private void t() {
                }
            }
        }

        private C1013b(C6647i.b bVar) {
            super(bVar);
            this.f67917f = -1;
            this.f67918g = -1;
            this.f67913b = bVar.j();
        }

        private C1013b(boolean z10) {
            this.f67917f = -1;
            this.f67918g = -1;
            this.f67913b = C6642d.f72492a;
        }

        private C1013b(C6643e eVar, C6645g gVar) {
            this.f67917f = -1;
            this.f67918g = -1;
            A();
            C6642d.b x10 = C6642d.x();
            C6644f I10 = C6644f.I(x10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    int J10 = eVar.J();
                    if (J10 != 0) {
                        if (J10 == 8) {
                            this.f67914c |= 1;
                            this.f67915d = eVar.r();
                        } else if (J10 == 18) {
                            c.C1015b i02 = (this.f67914c & 2) == 2 ? this.f67916e.g() : null;
                            c cVar = (c) eVar.t(c.f67923r, gVar);
                            this.f67916e = cVar;
                            if (i02 != null) {
                                i02.k(cVar);
                                this.f67916e = i02.p();
                            }
                            this.f67914c |= 2;
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
                        this.f67913b = x10.n();
                        throw th3;
                    }
                    this.f67913b = x10.n();
                    m();
                    throw th2;
                }
            }
            try {
                I10.H();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f67913b = x10.n();
                throw th4;
            }
            this.f67913b = x10.n();
            m();
        }

        /* renamed from: ig.b$b$b  reason: collision with other inner class name */
        public static final class C1014b extends C6647i.b implements q {

            /* renamed from: b  reason: collision with root package name */
            private int f67919b;

            /* renamed from: c  reason: collision with root package name */
            private int f67920c;

            /* renamed from: d  reason: collision with root package name */
            private c f67921d = c.L();

            private C1014b() {
                s();
            }

            /* access modifiers changed from: private */
            public static C1014b r() {
                return new C1014b();
            }

            /* renamed from: o */
            public C1013b f() {
                C1013b p10 = p();
                if (p10.e()) {
                    return p10;
                }
                throw C6639a.C1046a.i(p10);
            }

            public C1013b p() {
                C1013b bVar = new C1013b((C6647i.b) this);
                int i10 = this.f67919b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                int unused = bVar.f67915d = this.f67920c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c unused2 = bVar.f67916e = this.f67921d;
                int unused3 = bVar.f67914c = i11;
                return bVar;
            }

            /* renamed from: q */
            public C1014b clone() {
                return r().k(p());
            }

            /* renamed from: t */
            public C1014b k(C1013b bVar) {
                if (bVar == C1013b.v()) {
                    return this;
                }
                if (bVar.y()) {
                    x(bVar.w());
                }
                if (bVar.z()) {
                    w(bVar.x());
                }
                l(j().b(bVar.f67913b));
                return this;
            }

            /* renamed from: u */
            public C1014b h0(C6643e eVar, C6645g gVar) {
                C1013b bVar;
                C1013b bVar2 = null;
                try {
                    C1013b bVar3 = (C1013b) C1013b.f67912i.b(eVar, gVar);
                    if (bVar3 != null) {
                        k(bVar3);
                    }
                    return this;
                } catch (C6649k e10) {
                    bVar = (C1013b) e10.a();
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

            public C1014b w(c cVar) {
                if ((this.f67919b & 2) != 2 || this.f67921d == c.L()) {
                    this.f67921d = cVar;
                } else {
                    this.f67921d = c.f0(this.f67921d).k(cVar).p();
                }
                this.f67919b |= 2;
                return this;
            }

            public C1014b x(int i10) {
                this.f67919b |= 1;
                this.f67920c = i10;
                return this;
            }

            private void s() {
            }
        }
    }

    static {
        b bVar = new b(true);
        f67903h = bVar;
        bVar.C();
    }

    private void C() {
        this.f67907d = 0;
        this.f67908e = Collections.emptyList();
    }

    public static c D() {
        return c.r();
    }

    public static c E(b bVar) {
        return D().k(bVar);
    }

    public static b z() {
        return f67903h;
    }

    public int A() {
        return this.f67907d;
    }

    public boolean B() {
        if ((this.f67906c & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public c c() {
        return D();
    }

    /* renamed from: G */
    public c g() {
        return E(this);
    }

    public int a() {
        int i10;
        int i11 = this.f67910g;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f67906c & 1) == 1) {
            i10 = C6644f.o(1, this.f67907d);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < this.f67908e.size(); i12++) {
            i10 += C6644f.r(2, (p) this.f67908e.get(i12));
        }
        int size = i10 + this.f67905b.size();
        this.f67910g = size;
        return size;
    }

    public final boolean e() {
        byte b10 = this.f67909f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!B()) {
            this.f67909f = 0;
            return false;
        }
        for (int i10 = 0; i10 < x(); i10++) {
            if (!w(i10).e()) {
                this.f67909f = 0;
                return false;
            }
        }
        this.f67909f = 1;
        return true;
    }

    public void h(C6644f fVar) {
        a();
        if ((this.f67906c & 1) == 1) {
            fVar.Z(1, this.f67907d);
        }
        for (int i10 = 0; i10 < this.f67908e.size(); i10++) {
            fVar.c0(2, (p) this.f67908e.get(i10));
        }
        fVar.h0(this.f67905b);
    }

    public C1013b w(int i10) {
        return (C1013b) this.f67908e.get(i10);
    }

    public int x() {
        return this.f67908e.size();
    }

    public List y() {
        return this.f67908e;
    }

    private b(C6647i.b bVar) {
        super(bVar);
        this.f67909f = -1;
        this.f67910g = -1;
        this.f67905b = bVar.j();
    }

    private b(boolean z10) {
        this.f67909f = -1;
        this.f67910g = -1;
        this.f67905b = C6642d.f72492a;
    }

    private b(C6643e eVar, C6645g gVar) {
        this.f67909f = -1;
        this.f67910g = -1;
        C();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int J10 = eVar.J();
                if (J10 != 0) {
                    if (J10 == 8) {
                        this.f67906c |= 1;
                        this.f67907d = eVar.r();
                    } else if (J10 == 18) {
                        if (!(z11 & true)) {
                            this.f67908e = new ArrayList();
                            z11 = true;
                        }
                        this.f67908e.add(eVar.t(C1013b.f67912i, gVar));
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
                    this.f67908e = Collections.unmodifiableList(this.f67908e);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f67905b = x10.n();
                    throw th3;
                }
                this.f67905b = x10.n();
                m();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f67908e = Collections.unmodifiableList(this.f67908e);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f67905b = x10.n();
            throw th4;
        }
        this.f67905b = x10.n();
        m();
    }

    public static final class c extends C6647i.b implements q {

        /* renamed from: b  reason: collision with root package name */
        private int f67967b;

        /* renamed from: c  reason: collision with root package name */
        private int f67968c;

        /* renamed from: d  reason: collision with root package name */
        private List f67969d = Collections.emptyList();

        private c() {
            t();
        }

        /* access modifiers changed from: private */
        public static c r() {
            return new c();
        }

        private void s() {
            if ((this.f67967b & 2) != 2) {
                this.f67969d = new ArrayList(this.f67969d);
                this.f67967b |= 2;
            }
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
            int i10 = 1;
            if ((this.f67967b & 1) != 1) {
                i10 = 0;
            }
            int unused = bVar.f67907d = this.f67968c;
            if ((this.f67967b & 2) == 2) {
                this.f67969d = Collections.unmodifiableList(this.f67969d);
                this.f67967b &= -3;
            }
            List unused2 = bVar.f67908e = this.f67969d;
            int unused3 = bVar.f67906c = i10;
            return bVar;
        }

        /* renamed from: q */
        public c clone() {
            return r().k(p());
        }

        /* renamed from: u */
        public c k(b bVar) {
            if (bVar == b.z()) {
                return this;
            }
            if (bVar.B()) {
                x(bVar.A());
            }
            if (!bVar.f67908e.isEmpty()) {
                if (this.f67969d.isEmpty()) {
                    this.f67969d = bVar.f67908e;
                    this.f67967b &= -3;
                } else {
                    s();
                    this.f67969d.addAll(bVar.f67908e);
                }
            }
            l(j().b(bVar.f67905b));
            return this;
        }

        /* renamed from: w */
        public c h0(C6643e eVar, C6645g gVar) {
            b bVar;
            b bVar2 = null;
            try {
                b bVar3 = (b) b.f67904i.b(eVar, gVar);
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

        public c x(int i10) {
            this.f67967b |= 1;
            this.f67968c = i10;
            return this;
        }

        private void t() {
        }
    }
}
