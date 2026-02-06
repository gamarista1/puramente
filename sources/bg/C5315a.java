package Bg;

import Ag.a;
import Bg.N;
import ig.b;
import ig.d;
import ig.g;
import ig.i;
import ig.n;
import ig.q;
import ig.s;
import ig.u;
import java.util.ArrayList;
import java.util.List;
import kg.C6436c;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import pg.C6647i;
import pg.p;

/* renamed from: Bg.a  reason: case insensitive filesystem */
public abstract class C5315a implements C5322h {

    /* renamed from: a  reason: collision with root package name */
    private final a f62514a;

    /* renamed from: Bg.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0922a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f62515a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Bg.d[] r0 = Bg.C5318d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Bg.d r1 = Bg.C5318d.PROPERTY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Bg.d r1 = Bg.C5318d.PROPERTY_GETTER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Bg.d r1 = Bg.C5318d.PROPERTY_SETTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f62515a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bg.C5315a.C0922a.<clinit>():void");
        }
    }

    public C5315a(a aVar) {
        C6496s.h(aVar, "protocol");
        this.f62514a = aVar;
    }

    public List a(s sVar, C6436c cVar) {
        C6496s.h(sVar, "proto");
        C6496s.h(cVar, "nameResolver");
        List list = (List) sVar.u(this.f62514a.p());
        if (list == null) {
            list = C6565s.n();
        }
        Iterable<b> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (b i10 : iterable) {
            arrayList.add(i(i10, cVar));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List b(Bg.N r4, pg.p r5, Bg.C5318d r6) {
        /*
            r3 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            boolean r0 = r5 instanceof ig.i
            r1 = 0
            if (r0 == 0) goto L_0x0026
            Ag.a r6 = r3.f62514a
            pg.i$f r6 = r6.g()
            if (r6 == 0) goto L_0x0068
            ig.i r5 = (ig.i) r5
            java.lang.Object r5 = r5.u(r6)
            r1 = r5
            java.util.List r1 = (java.util.List) r1
            goto L_0x0068
        L_0x0026:
            boolean r0 = r5 instanceof ig.n
            if (r0 == 0) goto L_0x0098
            int[] r0 = Bg.C5315a.C0922a.f62515a
            int r2 = r6.ordinal()
            r0 = r0[r2]
            r2 = 1
            if (r0 == r2) goto L_0x0057
            r2 = 2
            if (r0 == r2) goto L_0x0057
            r2 = 3
            if (r0 != r2) goto L_0x003c
            goto L_0x0057
        L_0x003c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unsupported callable kind with property proto for receiver annotations: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0057:
            Ag.a r6 = r3.f62514a
            pg.i$f r6 = r6.l()
            if (r6 == 0) goto L_0x0068
            ig.n r5 = (ig.n) r5
            java.lang.Object r5 = r5.u(r6)
            r1 = r5
            java.util.List r1 = (java.util.List) r1
        L_0x0068:
            if (r1 != 0) goto L_0x006e
            java.util.List r1 = mf.C6565s.n()
        L_0x006e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = mf.C6565s.y(r1, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r1.iterator()
        L_0x007f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r6.next()
            ig.b r0 = (ig.b) r0
            kg.c r1 = r4.b()
            java.lang.Object r0 = r3.i(r0, r1)
            r5.add(r0)
            goto L_0x007f
        L_0x0097:
            return r5
        L_0x0098:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Unknown message: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Bg.C5315a.b(Bg.N, pg.p, Bg.d):java.util.List");
    }

    public List c(N.a aVar) {
        C6496s.h(aVar, "container");
        List list = (List) aVar.f().u(this.f62514a.a());
        if (list == null) {
            list = C6565s.n();
        }
        Iterable<b> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (b i10 : iterable) {
            arrayList.add(i(i10, aVar.b()));
        }
        return arrayList;
    }

    public List f(N n10, n nVar) {
        List list;
        C6496s.h(n10, "container");
        C6496s.h(nVar, "proto");
        C6647i.f j10 = this.f62514a.j();
        if (j10 != null) {
            list = (List) nVar.u(j10);
        } else {
            list = null;
        }
        if (list == null) {
            list = C6565s.n();
        }
        Iterable<b> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (b i10 : iterable) {
            arrayList.add(i(i10, n10.b()));
        }
        return arrayList;
    }

    public List g(N n10, p pVar, C5318d dVar, int i10, u uVar) {
        C6496s.h(n10, "container");
        C6496s.h(pVar, "callableProto");
        C6496s.h(dVar, "kind");
        C6496s.h(uVar, "proto");
        List list = (List) uVar.u(this.f62514a.h());
        if (list == null) {
            list = C6565s.n();
        }
        Iterable<b> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (b i11 : iterable) {
            arrayList.add(i(i11, n10.b()));
        }
        return arrayList;
    }

    public List h(N n10, n nVar) {
        List list;
        C6496s.h(n10, "container");
        C6496s.h(nVar, "proto");
        C6647i.f k10 = this.f62514a.k();
        if (k10 != null) {
            list = (List) nVar.u(k10);
        } else {
            list = null;
        }
        if (list == null) {
            list = C6565s.n();
        }
        Iterable<b> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (b i10 : iterable) {
            arrayList.add(i(i10, n10.b()));
        }
        return arrayList;
    }

    public List j(q qVar, C6436c cVar) {
        C6496s.h(qVar, "proto");
        C6496s.h(cVar, "nameResolver");
        List list = (List) qVar.u(this.f62514a.o());
        if (list == null) {
            list = C6565s.n();
        }
        Iterable<b> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (b i10 : iterable) {
            arrayList.add(i(i10, cVar));
        }
        return arrayList;
    }

    public List k(N n10, p pVar, C5318d dVar) {
        List list;
        C6496s.h(n10, "container");
        C6496s.h(pVar, "proto");
        C6496s.h(dVar, "kind");
        if (pVar instanceof d) {
            list = (List) ((d) pVar).u(this.f62514a.c());
        } else if (pVar instanceof i) {
            list = (List) ((i) pVar).u(this.f62514a.f());
        } else if (pVar instanceof n) {
            int i10 = C0922a.f62515a[dVar.ordinal()];
            if (i10 == 1) {
                list = (List) ((n) pVar).u(this.f62514a.i());
            } else if (i10 == 2) {
                list = (List) ((n) pVar).u(this.f62514a.m());
            } else if (i10 == 3) {
                list = (List) ((n) pVar).u(this.f62514a.n());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto");
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + pVar).toString());
        }
        if (list == null) {
            list = C6565s.n();
        }
        Iterable<b> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (b i11 : iterable) {
            arrayList.add(i(i11, n10.b()));
        }
        return arrayList;
    }

    public List l(N n10, g gVar) {
        C6496s.h(n10, "container");
        C6496s.h(gVar, "proto");
        List list = (List) gVar.u(this.f62514a.d());
        if (list == null) {
            list = C6565s.n();
        }
        Iterable<b> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (b i10 : iterable) {
            arrayList.add(i(i10, n10.b()));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final a m() {
        return this.f62514a;
    }
}
