package gg;

import Bg.C5321g;
import Eg.n;
import Fg.S;
import Of.C5487e;
import Of.C5506y;
import Of.H;
import Of.M;
import Of.h0;
import Of.t0;
import Pf.c;
import Pf.d;
import Sg.p;
import gg.C5974x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kg.C6436c;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mg.C6577e;
import ng.f;
import tg.C6730A;
import tg.C6731B;
import tg.C6732C;
import tg.C6733D;
import tg.C6735a;
import tg.C6738d;
import tg.C6740f;
import tg.g;
import tg.i;
import tg.k;
import tg.l;
import tg.s;
import tg.t;
import tg.w;

/* renamed from: gg.h  reason: case insensitive filesystem */
public final class C5958h extends C5954d {

    /* renamed from: d  reason: collision with root package name */
    private final H f67765d;

    /* renamed from: e  reason: collision with root package name */
    private final M f67766e;

    /* renamed from: f  reason: collision with root package name */
    private final C5321g f67767f;

    /* renamed from: g  reason: collision with root package name */
    private C6577e f67768g = C6577e.f72097i;

    /* renamed from: gg.h$a */
    private abstract class a implements C5974x.a {

        /* renamed from: gg.h$a$a  reason: collision with other inner class name */
        public static final class C1000a implements C5974x.a {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ C5974x.a f67770a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5974x.a f67771b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f67772c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ f f67773d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ ArrayList f67774e;

            C1000a(C5974x.a aVar, a aVar2, f fVar, ArrayList arrayList) {
                this.f67771b = aVar;
                this.f67772c = aVar2;
                this.f67773d = fVar;
                this.f67774e = arrayList;
                this.f67770a = aVar;
            }

            public void a() {
                this.f67771b.a();
                this.f67772c.h(this.f67773d, new C6735a((c) C6565s.P0(this.f67774e)));
            }

            public C5974x.b b(f fVar) {
                return this.f67770a.b(fVar);
            }

            public void c(f fVar, ng.b bVar, f fVar2) {
                C6496s.h(bVar, "enumClassId");
                C6496s.h(fVar2, "enumEntryName");
                this.f67770a.c(fVar, bVar, fVar2);
            }

            public C5974x.a d(f fVar, ng.b bVar) {
                C6496s.h(bVar, "classId");
                return this.f67770a.d(fVar, bVar);
            }

            public void e(f fVar, Object obj) {
                this.f67770a.e(fVar, obj);
            }

            public void f(f fVar, C6740f fVar2) {
                C6496s.h(fVar2, "value");
                this.f67770a.f(fVar, fVar2);
            }
        }

        /* renamed from: gg.h$a$b */
        public static final class b implements C5974x.b {
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList f67775a = new ArrayList();

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C5958h f67776b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f f67777c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ a f67778d;

            /* renamed from: gg.h$a$b$a  reason: collision with other inner class name */
            public static final class C1001a implements C5974x.a {

                /* renamed from: a  reason: collision with root package name */
                private final /* synthetic */ C5974x.a f67779a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ C5974x.a f67780b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ b f67781c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ ArrayList f67782d;

                C1001a(C5974x.a aVar, b bVar, ArrayList arrayList) {
                    this.f67780b = aVar;
                    this.f67781c = bVar;
                    this.f67782d = arrayList;
                    this.f67779a = aVar;
                }

                public void a() {
                    this.f67780b.a();
                    this.f67781c.f67775a.add(new C6735a((c) C6565s.P0(this.f67782d)));
                }

                public C5974x.b b(f fVar) {
                    return this.f67779a.b(fVar);
                }

                public void c(f fVar, ng.b bVar, f fVar2) {
                    C6496s.h(bVar, "enumClassId");
                    C6496s.h(fVar2, "enumEntryName");
                    this.f67779a.c(fVar, bVar, fVar2);
                }

                public C5974x.a d(f fVar, ng.b bVar) {
                    C6496s.h(bVar, "classId");
                    return this.f67779a.d(fVar, bVar);
                }

                public void e(f fVar, Object obj) {
                    this.f67779a.e(fVar, obj);
                }

                public void f(f fVar, C6740f fVar2) {
                    C6496s.h(fVar2, "value");
                    this.f67779a.f(fVar, fVar2);
                }
            }

            b(C5958h hVar, f fVar, a aVar) {
                this.f67776b = hVar;
                this.f67777c = fVar;
                this.f67778d = aVar;
            }

            public void a() {
                this.f67778d.g(this.f67777c, this.f67775a);
            }

            public void b(ng.b bVar, f fVar) {
                C6496s.h(bVar, "enumClassId");
                C6496s.h(fVar, "enumEntryName");
                this.f67775a.add(new k(bVar, fVar));
            }

            public C5974x.a c(ng.b bVar) {
                C6496s.h(bVar, "classId");
                ArrayList arrayList = new ArrayList();
                C5958h hVar = this.f67776b;
                h0 h0Var = h0.f64497a;
                C6496s.g(h0Var, "NO_SOURCE");
                C5974x.a x10 = hVar.x(bVar, h0Var, arrayList);
                C6496s.e(x10);
                return new C1001a(x10, this, arrayList);
            }

            public void d(C6740f fVar) {
                C6496s.h(fVar, "value");
                this.f67775a.add(new s(fVar));
            }

            public void e(Object obj) {
                this.f67775a.add(this.f67776b.O(this.f67777c, obj));
            }
        }

        public a() {
        }

        public C5974x.b b(f fVar) {
            return new b(C5958h.this, fVar, this);
        }

        public void c(f fVar, ng.b bVar, f fVar2) {
            C6496s.h(bVar, "enumClassId");
            C6496s.h(fVar2, "enumEntryName");
            h(fVar, new k(bVar, fVar2));
        }

        public C5974x.a d(f fVar, ng.b bVar) {
            C6496s.h(bVar, "classId");
            ArrayList arrayList = new ArrayList();
            C5958h hVar = C5958h.this;
            h0 h0Var = h0.f64497a;
            C6496s.g(h0Var, "NO_SOURCE");
            C5974x.a x10 = hVar.x(bVar, h0Var, arrayList);
            C6496s.e(x10);
            return new C1000a(x10, this, fVar, arrayList);
        }

        public void e(f fVar, Object obj) {
            h(fVar, C5958h.this.O(fVar, obj));
        }

        public void f(f fVar, C6740f fVar2) {
            C6496s.h(fVar2, "value");
            h(fVar, new s(fVar2));
        }

        public abstract void g(f fVar, ArrayList arrayList);

        public abstract void h(f fVar, g gVar);
    }

    /* renamed from: gg.h$b */
    public static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        private final HashMap f67783b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5958h f67784c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5487e f67785d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ng.b f67786e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f67787f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h0 f67788g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5958h hVar, C5487e eVar, ng.b bVar, List list, h0 h0Var) {
            super();
            this.f67784c = hVar;
            this.f67785d = eVar;
            this.f67786e = bVar;
            this.f67787f = list;
            this.f67788g = h0Var;
        }

        public void a() {
            if (!this.f67784c.F(this.f67786e, this.f67783b) && !this.f67784c.w(this.f67786e)) {
                this.f67787f.add(new d(this.f67785d.p(), this.f67783b, this.f67788g));
            }
        }

        public void g(f fVar, ArrayList arrayList) {
            C6496s.h(arrayList, "elements");
            if (fVar != null) {
                t0 b10 = Yf.a.b(fVar, this.f67785d);
                if (b10 != null) {
                    HashMap hashMap = this.f67783b;
                    i iVar = i.f73558a;
                    List c10 = Pg.a.c(arrayList);
                    S type = b10.getType();
                    C6496s.g(type, "getType(...)");
                    hashMap.put(fVar, iVar.b(c10, type));
                } else if (this.f67784c.w(this.f67786e) && C6496s.c(fVar.b(), "value")) {
                    ArrayList<C6735a> arrayList2 = new ArrayList<>();
                    for (Object next : arrayList) {
                        if (next instanceof C6735a) {
                            arrayList2.add(next);
                        }
                    }
                    Collection collection = this.f67787f;
                    for (C6735a b11 : arrayList2) {
                        collection.add((c) b11.b());
                    }
                }
            }
        }

        public void h(f fVar, g gVar) {
            C6496s.h(gVar, "value");
            if (fVar != null) {
                this.f67783b.put(fVar, gVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5958h(H h10, M m10, n nVar, C5972v vVar) {
        super(nVar, vVar);
        C6496s.h(h10, "module");
        C6496s.h(m10, "notFoundClasses");
        C6496s.h(nVar, "storageManager");
        C6496s.h(vVar, "kotlinClassFinder");
        this.f67765d = h10;
        this.f67766e = m10;
        this.f67767f = new C5321g(h10, m10);
    }

    /* access modifiers changed from: private */
    public final g O(f fVar, Object obj) {
        g e10 = i.f73558a.e(obj, this.f67765d);
        if (e10 != null) {
            return e10;
        }
        l.a aVar = l.f73561b;
        return aVar.a("Unsupported annotation argument: " + fVar);
    }

    private final C5487e R(ng.b bVar) {
        return C5506y.d(this.f67765d, bVar, this.f67766e);
    }

    /* renamed from: P */
    public c i(ig.b bVar, C6436c cVar) {
        C6496s.h(bVar, "proto");
        C6496s.h(cVar, "nameResolver");
        return this.f67767f.a(bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public g I(String str, Object obj) {
        C6496s.h(str, "desc");
        C6496s.h(obj, "initializer");
        boolean z10 = false;
        if (p.O("ZBCS", str, false, 2, (Object) null)) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode != 66) {
                if (hashCode != 67) {
                    if (hashCode != 83) {
                        if (hashCode == 90 && str.equals("Z")) {
                            if (intValue != 0) {
                                z10 = true;
                            }
                            obj = Boolean.valueOf(z10);
                        }
                    } else if (str.equals("S")) {
                        obj = Short.valueOf((short) intValue);
                    }
                } else if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
            } else if (str.equals("B")) {
                obj = Byte.valueOf((byte) intValue);
            }
            throw new AssertionError(str);
        }
        return i.f73558a.e(obj, this.f67765d);
    }

    public void S(C6577e eVar) {
        C6496s.h(eVar, "<set-?>");
        this.f67768g = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public g M(g gVar) {
        g c10;
        C6496s.h(gVar, "constant");
        if (gVar instanceof C6738d) {
            c10 = new C6730A(((Number) ((C6738d) gVar).b()).byteValue());
        } else if (gVar instanceof w) {
            c10 = new C6733D(((Number) ((w) gVar).b()).shortValue());
        } else if (gVar instanceof tg.n) {
            c10 = new C6731B(((Number) ((tg.n) gVar).b()).intValue());
        } else if (!(gVar instanceof t)) {
            return gVar;
        } else {
            c10 = new C6732C(((Number) ((t) gVar).b()).longValue());
        }
        return c10;
    }

    public C6577e u() {
        return this.f67768g;
    }

    /* access modifiers changed from: protected */
    public C5974x.a x(ng.b bVar, h0 h0Var, List list) {
        C6496s.h(bVar, "annotationClassId");
        C6496s.h(h0Var, "source");
        C6496s.h(list, "result");
        return new b(this, R(bVar), bVar, list, h0Var);
    }
}
