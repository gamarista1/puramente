package Bg;

import Ef.m;
import Fg.C5366d0;
import Fg.S;
import Lf.i;
import Of.C5486d;
import Of.C5487e;
import Of.C5490h;
import Of.C5506y;
import Of.H;
import Of.M;
import Of.h0;
import Of.t0;
import Pf.c;
import Pf.d;
import ig.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.C6435b;
import kg.C6436c;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.L;
import mf.O;
import ng.f;
import rg.C6691i;
import tg.C6730A;
import tg.C6731B;
import tg.C6732C;
import tg.C6733D;
import tg.C6735a;
import tg.C6736b;
import tg.C6737c;
import tg.C6738d;
import tg.C6739e;
import tg.g;
import tg.j;
import tg.k;
import tg.l;
import tg.n;
import tg.s;
import tg.t;
import tg.w;
import tg.x;

/* renamed from: Bg.g  reason: case insensitive filesystem */
public final class C5321g {

    /* renamed from: a  reason: collision with root package name */
    private final H f62528a;

    /* renamed from: b  reason: collision with root package name */
    private final M f62529b;

    /* renamed from: Bg.g$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f62530a;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(2:25|26)|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ig.b$b$c$c[] r0 = ig.b.C1013b.c.C1016c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.BYTE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.CHAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.SHORT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.INT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.LONG     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.FLOAT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.STRING     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.CLASS     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.ENUM     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.ANNOTATION     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                ig.b$b$c$c r1 = ig.b.C1013b.c.C1016c.ARRAY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                f62530a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Bg.C5321g.a.<clinit>():void");
        }
    }

    public C5321g(H h10, M m10) {
        C6496s.h(h10, "module");
        C6496s.h(m10, "notFoundClasses");
        this.f62528a = h10;
        this.f62529b = m10;
    }

    private final boolean b(g gVar, S s10, b.C1013b.c cVar) {
        int i10;
        C5487e eVar;
        b.C1013b.c.C1016c S10 = cVar.S();
        if (S10 == null) {
            i10 = -1;
        } else {
            i10 = a.f62530a[S10.ordinal()];
        }
        if (i10 == 10) {
            C5490h o10 = s10.N0().o();
            if (o10 instanceof C5487e) {
                eVar = (C5487e) o10;
            } else {
                eVar = null;
            }
            if (eVar != null && !i.l0(eVar)) {
                return false;
            }
        } else if (i10 != 13) {
            return C6496s.c(gVar.a(this.f62528a), s10);
        } else {
            if (!(gVar instanceof C6736b) || ((List) ((C6736b) gVar).b()).size() != cVar.J().size()) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
            S k10 = c().k(s10);
            C6496s.g(k10, "getArrayElementType(...)");
            C6736b bVar = (C6736b) gVar;
            Ef.i o11 = C6565s.o((Collection) bVar.b());
            if (!(o11 instanceof Collection) || !((Collection) o11).isEmpty()) {
                Iterator it = o11.iterator();
                while (it.hasNext()) {
                    int a10 = ((L) it).a();
                    b.C1013b.c H10 = cVar.H(a10);
                    C6496s.g(H10, "getArrayElement(...)");
                    if (!b((g) ((List) bVar.b()).get(a10), k10, H10)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final i c() {
        return this.f62528a.m();
    }

    private final Pair d(b.C1013b bVar, Map map, C6436c cVar) {
        t0 t0Var = (t0) map.get(L.b(cVar, bVar.w()));
        if (t0Var == null) {
            return null;
        }
        f b10 = L.b(cVar, bVar.w());
        S type = t0Var.getType();
        C6496s.g(type, "getType(...)");
        b.C1013b.c x10 = bVar.x();
        C6496s.g(x10, "getValue(...)");
        return new Pair(b10, g(type, x10, cVar));
    }

    private final C5487e e(ng.b bVar) {
        return C5506y.d(this.f62528a, bVar, this.f62529b);
    }

    private final g g(S s10, b.C1013b.c cVar, C6436c cVar2) {
        g f10 = f(s10, cVar, cVar2);
        if (!b(f10, s10, cVar)) {
            f10 = null;
        }
        if (f10 != null) {
            return f10;
        }
        l.a aVar = l.f73561b;
        return aVar.a("Unexpected argument value: actual type " + cVar.S() + " != expected type " + s10);
    }

    public final c a(b bVar, C6436c cVar) {
        C6496s.h(bVar, "proto");
        C6496s.h(cVar, "nameResolver");
        C5487e e10 = e(L.a(cVar, bVar.A()));
        Map i10 = O.i();
        if (bVar.x() != 0 && !Hg.l.m(e10) && C6691i.t(e10)) {
            Collection j10 = e10.j();
            C6496s.g(j10, "getConstructors(...)");
            C5486d dVar = (C5486d) C6565s.Q0(j10);
            if (dVar != null) {
                List k10 = dVar.k();
                C6496s.g(k10, "getValueParameters(...)");
                Iterable iterable = k10;
                LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(C6565s.y(iterable, 10)), 16));
                for (Object next : iterable) {
                    linkedHashMap.put(((t0) next).getName(), next);
                }
                List<b.C1013b> y10 = bVar.y();
                C6496s.g(y10, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (b.C1013b bVar2 : y10) {
                    C6496s.e(bVar2);
                    Pair d10 = d(bVar2, linkedHashMap, cVar);
                    if (d10 != null) {
                        arrayList.add(d10);
                    }
                }
                i10 = O.w(arrayList);
            }
        }
        return new d(e10.p(), i10, h0.f64497a);
    }

    public final g f(S s10, b.C1013b.c cVar, C6436c cVar2) {
        int i10;
        g dVar;
        g tVar;
        boolean z10;
        C6496s.h(s10, "expectedType");
        C6496s.h(cVar, "value");
        C6496s.h(cVar2, "nameResolver");
        Boolean f10 = C6435b.f71541P.d(cVar.O());
        C6496s.g(f10, "get(...)");
        boolean booleanValue = f10.booleanValue();
        b.C1013b.c.C1016c S10 = cVar.S();
        if (S10 == null) {
            i10 = -1;
        } else {
            i10 = a.f62530a[S10.ordinal()];
        }
        switch (i10) {
            case 1:
                byte Q10 = (byte) ((int) cVar.Q());
                if (!booleanValue) {
                    dVar = new C6738d(Q10);
                    break;
                } else {
                    dVar = new C6730A(Q10);
                    break;
                }
            case 2:
                return new C6739e((char) ((int) cVar.Q()));
            case 3:
                short Q11 = (short) ((int) cVar.Q());
                if (!booleanValue) {
                    dVar = new w(Q11);
                    break;
                } else {
                    dVar = new C6733D(Q11);
                    break;
                }
            case 4:
                int Q12 = (int) cVar.Q();
                if (!booleanValue) {
                    dVar = new n(Q12);
                    break;
                } else {
                    dVar = new C6731B(Q12);
                    break;
                }
            case 5:
                long Q13 = cVar.Q();
                if (booleanValue) {
                    tVar = new C6732C(Q13);
                } else {
                    tVar = new t(Q13);
                }
                return tVar;
            case 6:
                return new tg.m(cVar.P());
            case 7:
                return new j(cVar.M());
            case 8:
                if (cVar.Q() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return new C6737c(z10);
            case 9:
                return new x(cVar2.getString(cVar.R()));
            case 10:
                return new s(L.a(cVar2, cVar.K()), cVar.G());
            case 11:
                return new k(L.a(cVar2, cVar.K()), L.b(cVar2, cVar.N()));
            case 12:
                b F10 = cVar.F();
                C6496s.g(F10, "getAnnotation(...)");
                return new C6735a(a(F10, cVar2));
            case 13:
                tg.i iVar = tg.i.f73558a;
                List J10 = cVar.J();
                C6496s.g(J10, "getArrayElementList(...)");
                Iterable<b.C1013b.c> iterable = J10;
                ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
                for (b.C1013b.c cVar3 : iterable) {
                    C5366d0 i11 = c().i();
                    C6496s.g(i11, "getAnyType(...)");
                    C6496s.e(cVar3);
                    arrayList.add(f(i11, cVar3, cVar2));
                }
                return iVar.b(arrayList, s10);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.S() + " (expected " + s10 + ')').toString());
        }
        return dVar;
    }
}
