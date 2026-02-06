package rg;

import Fg.C5371g;
import Fg.L;
import Fg.S;
import Fg.W;
import Fg.u0;
import Fg.v0;
import Gg.e;
import Gg.f;
import Gg.g;
import Of.C5483a;
import Of.C5484b;
import Of.C5487e;
import Of.C5495m;
import Of.C5499q;
import Of.C5501t;
import Of.C5502u;
import Of.C5507z;
import Of.D;
import Of.E;
import Of.Y;
import Of.Z;
import Of.c0;
import Of.m0;
import Of.t0;
import Pg.l;
import Rf.C5529s;
import Rf.J;
import Rf.K;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.swmansion.reanimated.BuildConfig;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.SurveyViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import lf.C6514M;
import mf.C6565s;
import rg.C6692j;
import vg.C6755e;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: rg.o  reason: case insensitive filesystem */
public class C6697o {

    /* renamed from: e  reason: collision with root package name */
    private static final List f73032e;

    /* renamed from: f  reason: collision with root package name */
    public static final C6697o f73033f;

    /* renamed from: g  reason: collision with root package name */
    private static final e.a f73034g;

    /* renamed from: a  reason: collision with root package name */
    private final Gg.g f73035a;

    /* renamed from: b  reason: collision with root package name */
    private final Gg.f f73036b;

    /* renamed from: c  reason: collision with root package name */
    private final e.a f73037c;

    /* renamed from: d  reason: collision with root package name */
    private final p f73038d;

    /* renamed from: rg.o$a */
    static class a implements e.a {
        a() {
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean a(v0 v0Var, v0 v0Var2) {
            if (v0Var == null) {
                b(0);
            }
            if (v0Var2 == null) {
                b(1);
            }
            return v0Var.equals(v0Var2);
        }
    }

    /* renamed from: rg.o$b */
    static class b implements p {
        b() {
        }

        /* renamed from: a */
        public Pair invoke(C5483a aVar, C5483a aVar2) {
            return new Pair(aVar, aVar2);
        }
    }

    /* renamed from: rg.o$c */
    static class c implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5495m f73039a;

        c(C5495m mVar) {
            this.f73039a = mVar;
        }

        /* renamed from: a */
        public Boolean invoke(C5484b bVar) {
            boolean z10;
            if (bVar.b() == this.f73039a) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: rg.o$e */
    static class e implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5487e f73040a;

        e(C5487e eVar) {
            this.f73040a = eVar;
        }

        /* renamed from: a */
        public Boolean invoke(C5484b bVar) {
            boolean z10 = false;
            if (!C5501t.g(bVar.getVisibility()) && C5501t.h(bVar, this.f73040a, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: rg.o$g */
    static class g implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6696n f73041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5484b f73042b;

        g(C6696n nVar, C5484b bVar) {
            this.f73041a = nVar;
            this.f73042b = bVar;
        }

        /* renamed from: a */
        public C6514M invoke(C5484b bVar) {
            this.f73041a.b(this.f73042b, bVar);
            return C6514M.f71813a;
        }
    }

    /* renamed from: rg.o$h */
    static /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f73043a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f73044b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f73045c;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        static {
            /*
                Of.E[] r0 = Of.E.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f73045c = r0
                r1 = 1
                Of.E r2 = Of.E.FINAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f73045c     // Catch:{ NoSuchFieldError -> 0x001d }
                Of.E r3 = Of.E.SEALED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f73045c     // Catch:{ NoSuchFieldError -> 0x0028 }
                Of.E r4 = Of.E.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f73045c     // Catch:{ NoSuchFieldError -> 0x0033 }
                Of.E r4 = Of.E.ABSTRACT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                rg.o$i$a[] r3 = rg.C6697o.i.a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f73044b = r3
                rg.o$i$a r4 = rg.C6697o.i.a.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r3 = f73044b     // Catch:{ NoSuchFieldError -> 0x004e }
                rg.o$i$a r4 = rg.C6697o.i.a.CONFLICT     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f73044b     // Catch:{ NoSuchFieldError -> 0x0058 }
                rg.o$i$a r4 = rg.C6697o.i.a.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                rg.j$b[] r3 = rg.C6692j.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f73043a = r3
                rg.j$b r4 = rg.C6692j.b.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r1 = f73043a     // Catch:{ NoSuchFieldError -> 0x0073 }
                rg.j$b r3 = rg.C6692j.b.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f73043a     // Catch:{ NoSuchFieldError -> 0x007d }
                rg.j$b r1 = rg.C6692j.b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rg.C6697o.h.<clinit>():void");
        }
    }

    /* renamed from: rg.o$i */
    public static class i {

        /* renamed from: c  reason: collision with root package name */
        private static final i f73046c = new i(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a  reason: collision with root package name */
        private final a f73047a;

        /* renamed from: b  reason: collision with root package name */
        private final String f73048b;

        /* renamed from: rg.o$i$a */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f73047a = aVar;
            this.f73048b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = r2
                goto L_0x001c
            L_0x001b:
                r5 = r1
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: rg.C6697o.i.a(int):void");
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f73046c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f73047a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }

        public String toString() {
            return this.f73047a + ": " + this.f73048b;
        }
    }

    static {
        Class<C6692j> cls = C6692j.class;
        f73032e = C6565s.e1(ServiceLoader.load(cls, cls.getClassLoader()));
        a aVar = new a();
        f73034g = aVar;
        f73033f = new C6697o(aVar, g.a.f63180a, f.a.f63179a, (p) null);
    }

    private C6697o(e.a aVar, Gg.g gVar, Gg.f fVar, p pVar) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f73037c = aVar;
        this.f73035a = gVar;
        this.f73036b = fVar;
        this.f73038d = pVar;
    }

    private static boolean A(Y y10, Y y11) {
        if (y10 == null || y11 == null) {
            return true;
        }
        return H(y10, y11);
    }

    public static boolean B(C5483a aVar, C5483a aVar2) {
        if (aVar == null) {
            a(65);
        }
        if (aVar2 == null) {
            a(66);
        }
        S returnType = aVar.getReturnType();
        S returnType2 = aVar2.getReturnType();
        if (!H(aVar, aVar2)) {
            return false;
        }
        u0 l10 = f73033f.l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof C5507z) {
            return G(aVar, returnType, aVar2, returnType2, l10);
        }
        if (aVar instanceof Z) {
            Z z10 = (Z) aVar;
            Z z11 = (Z) aVar2;
            if (!A(z10.g(), z11.g())) {
                return false;
            }
            if (z10.O() && z11.O()) {
                return C5371g.f63009a.m(l10, returnType.Q0(), returnType2.Q0());
            }
            if ((z10.O() || !z11.O()) && G(aVar, returnType, aVar2, returnType2, l10)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
    }

    private static boolean C(C5483a aVar, Collection collection) {
        if (aVar == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!B(aVar, (C5483a) it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(C5483a aVar, S s10, C5483a aVar2, S s11, u0 u0Var) {
        if (aVar == null) {
            a(71);
        }
        if (s10 == null) {
            a(72);
        }
        if (aVar2 == null) {
            a(73);
        }
        if (s11 == null) {
            a(74);
        }
        if (u0Var == null) {
            a(75);
        }
        return C5371g.f63009a.t(u0Var, s10.Q0(), s11.Q0());
    }

    private static boolean H(C5499q qVar, C5499q qVar2) {
        if (qVar == null) {
            a(67);
        }
        if (qVar2 == null) {
            a(68);
        }
        Integer d10 = C5501t.d(qVar.getVisibility(), qVar2.getVisibility());
        if (d10 == null || d10.intValue() >= 0) {
            return true;
        }
        return false;
    }

    public static boolean I(D d10, D d11, boolean z10) {
        if (d10 == null) {
            a(55);
        }
        if (d11 == null) {
            a(56);
        }
        if (C5501t.g(d11.getVisibility()) || !C5501t.h(d11, d10, z10)) {
            return false;
        }
        return true;
    }

    public static boolean J(C5483a aVar, C5483a aVar2, boolean z10, boolean z11) {
        if (aVar == null) {
            a(13);
        }
        if (aVar2 == null) {
            a(14);
        }
        if (!aVar.equals(aVar2) && C6689g.f73019a.k(aVar.a(), aVar2.a(), z10, z11)) {
            return true;
        }
        C5483a a10 = aVar2.a();
        for (C5483a k10 : C6691i.d(aVar)) {
            if (C6689g.f73019a.k(a10, k10, z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void K(C5484b bVar, C6798l lVar) {
        C5502u uVar;
        C6798l lVar2;
        if (bVar == null) {
            a(105);
        }
        for (C5484b bVar2 : bVar.e()) {
            if (bVar2.getVisibility() == C5501t.f64511g) {
                K(bVar2, lVar);
            }
        }
        if (bVar.getVisibility() == C5501t.f64511g) {
            C5502u h10 = h(bVar);
            if (h10 == null) {
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                uVar = C5501t.f64509e;
            } else {
                uVar = h10;
            }
            if (bVar instanceof K) {
                ((K) bVar).c1(uVar);
                for (Y y10 : ((Z) bVar).w()) {
                    if (h10 == null) {
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                    }
                    K(y10, lVar2);
                }
            } else if (bVar instanceof C5529s) {
                ((C5529s) bVar).j1(uVar);
            } else {
                J j10 = (J) bVar;
                j10.N0(uVar);
                if (uVar != j10.X().getVisibility()) {
                    j10.L0(false);
                }
            }
        }
    }

    public static Object L(Collection collection, C6798l lVar) {
        Object obj;
        if (collection == null) {
            a(76);
        }
        if (lVar == null) {
            a(77);
        }
        if (collection.size() == 1) {
            Object n02 = C6565s.n0(collection);
            if (n02 == null) {
                a(78);
            }
            return n02;
        }
        ArrayList arrayList = new ArrayList(2);
        List C02 = C6565s.C0(collection, lVar);
        Object n03 = C6565s.n0(collection);
        C5483a aVar = (C5483a) lVar.invoke(n03);
        for (Object next : collection) {
            C5483a aVar2 = (C5483a) lVar.invoke(next);
            if (C(aVar2, C02)) {
                arrayList.add(next);
            }
            if (B(aVar2, aVar) && !B(aVar, aVar2)) {
                n03 = next;
            }
        }
        if (arrayList.isEmpty()) {
            if (n03 == null) {
                a(79);
            }
            return n03;
        } else if (arrayList.size() == 1) {
            Object n04 = C6565s.n0(arrayList);
            if (n04 == null) {
                a(80);
            }
            return n04;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!L.b(((C5483a) lVar.invoke(obj)).getReturnType())) {
                    break;
                }
            }
            if (obj != null) {
                return obj;
            }
            Object n05 = C6565s.n0(arrayList);
            if (n05 == null) {
                a(82);
            }
            return n05;
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        int i12 = i10;
        if (!(i12 == 11 || i12 == 12 || i12 == 16 || i12 == 21 || i12 == 93 || i12 == 96 || i12 == 101 || i12 == 42 || i12 == 43)) {
            switch (i12) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i12) {
                        case 30:
                        case 31:
                        case com.amazon.c.a.a.c.f37660h:
                        case CharsToNameCanonicalizer.HASH_MULT:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i12) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i12) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i12 == 11 || i12 == 12 || i12 == 16 || i12 == 21 || i12 == 93 || i12 == 96 || i12 == 101 || i12 == 42 || i12 == 43)) {
            switch (i12) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i12) {
                        case 30:
                        case 31:
                        case com.amazon.c.a.a.c.f37660h:
                        case CharsToNameCanonicalizer.HASH_MULT:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i12) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i12) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i11 = 2;
        Object[] objArr = new Object[i11];
        switch (i12) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case com.amazon.c.a.a.c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case StdKeyDeserializer.TYPE_URL:
                objArr[0] = "g";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case InboxPagingSource.PAGE_SIZE:
            case 23:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case Carousel.ENTITY_TYPE:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case SurveyViewModel.ENTITY_TYPE:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case BuildConfig.REACT_NATIVE_MINOR_VERSION:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
        }
        if (i12 == 11 || i12 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i12 != 16) {
            if (i12 != 21) {
                if (i12 == 93) {
                    objArr[1] = "getMinimalModality";
                } else if (i12 == 96) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i12 != 101) {
                    if (i12 != 42 && i12 != 43) {
                        switch (i12) {
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                                break;
                            default:
                                switch (i12) {
                                    case 30:
                                    case 31:
                                    case com.amazon.c.a.a.c.f37660h:
                                    case CharsToNameCanonicalizer.HASH_MULT:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                        objArr[1] = "isOverridableByWithoutExternalConditions";
                                        break;
                                    default:
                                        switch (i12) {
                                            case 78:
                                            case 79:
                                            case 80:
                                            case 81:
                                            case 82:
                                                objArr[1] = "selectMostSpecificMember";
                                                break;
                                            default:
                                                switch (i12) {
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                        objArr[1] = "determineModalityForFakeOverride";
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        objArr[1] = "createTypeCheckerState";
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i12) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case com.amazon.c.a.a.c.f37660h:
            case CharsToNameCanonicalizer.HASH_MULT:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case StdKeyDeserializer.TYPE_URL:
                objArr[2] = "overrides";
                break;
            case StdKeyDeserializer.TYPE_CLASS:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case InboxPagingSource.PAGE_SIZE:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case Carousel.ENTITY_TYPE:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case BuildConfig.REACT_NATIVE_MINOR_VERSION:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case SurveyViewModel.ENTITY_TYPE:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i12 == 11 || i12 == 12 || i12 == 16 || i12 == 21 || i12 == 93 || i12 == 96 || i12 == 101 || i12 == 42 || i12 == 43)) {
            switch (i12) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i12) {
                        case 30:
                        case 31:
                        case com.amazon.c.a.a.c.f37660h:
                        case CharsToNameCanonicalizer.HASH_MULT:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i12) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i12) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            th2 = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th2 = new IllegalStateException(format);
        throw th2;
    }

    private static boolean b(Collection collection) {
        if (collection == null) {
            a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return C6565s.a0(collection, new c(((C5484b) collection.iterator().next()).b()));
    }

    private static boolean c(m0 m0Var, m0 m0Var2, u0 u0Var) {
        if (m0Var == null) {
            a(47);
        }
        if (m0Var2 == null) {
            a(48);
        }
        if (u0Var == null) {
            a(49);
        }
        List<S> upperBounds = m0Var.getUpperBounds();
        ArrayList arrayList = new ArrayList(m0Var2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (S s10 : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (d(s10, (S) listIterator.next(), u0Var)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    private static boolean d(S s10, S s11, u0 u0Var) {
        if (s10 == null) {
            a(44);
        }
        if (s11 == null) {
            a(45);
        }
        if (u0Var == null) {
            a(46);
        }
        if (!W.a(s10) || !W.a(s11)) {
            return C5371g.f63009a.m(u0Var, s10.Q0(), s11.Q0());
        }
        return true;
    }

    private static i e(C5483a aVar, C5483a aVar2) {
        boolean z10;
        boolean z11 = false;
        if (aVar.P() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar2.P() == null) {
            z11 = true;
        }
        if (z10 != z11) {
            return i.d("Receiver presence mismatch");
        }
        if (aVar.k().size() != aVar2.k().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(C5484b bVar, Set set) {
        if (bVar == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (bVar.h().a()) {
            set.add(bVar);
        } else if (!bVar.e().isEmpty()) {
            for (C5484b f10 : bVar.e()) {
                f(f10, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
    }

    private static List g(C5483a aVar) {
        c0 P10 = aVar.P();
        ArrayList arrayList = new ArrayList();
        if (P10 != null) {
            arrayList.add(P10.getType());
        }
        for (t0 type : aVar.k()) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    private static C5502u h(C5484b bVar) {
        if (bVar == null) {
            a(106);
        }
        Collection<C5484b> e10 = bVar.e();
        C5502u u10 = u(e10);
        if (u10 == null) {
            return null;
        }
        if (bVar.h() != C5484b.a.FAKE_OVERRIDE) {
            return u10.f();
        }
        for (C5484b bVar2 : e10) {
            if (bVar2.r() != E.ABSTRACT && !bVar2.getVisibility().equals(u10)) {
                return null;
            }
        }
        return u10;
    }

    public static C6697o i(Gg.g gVar, e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new C6697o(aVar, gVar, f.a.f63179a, (p) null);
    }

    private static void j(Collection collection, C5487e eVar, C6696n nVar) {
        C5502u uVar;
        if (collection == null) {
            a(83);
        }
        if (eVar == null) {
            a(84);
        }
        if (nVar == null) {
            a(85);
        }
        Collection t10 = t(eVar, collection);
        boolean isEmpty = t10.isEmpty();
        if (!isEmpty) {
            collection = t10;
        }
        E n10 = n(collection, eVar);
        if (isEmpty) {
            uVar = C5501t.f64512h;
        } else {
            uVar = C5501t.f64511g;
        }
        C5484b p02 = ((C5484b) L(collection, new d())).p0(eVar, n10, uVar, C5484b.a.FAKE_OVERRIDE, false);
        nVar.d(p02, collection);
        nVar.a(p02);
    }

    private static void k(C5487e eVar, Collection collection, C6696n nVar) {
        if (eVar == null) {
            a(62);
        }
        if (collection == null) {
            a(63);
        }
        if (nVar == null) {
            a(64);
        }
        if (b(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton((C5484b) it.next()), eVar, nVar);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            j(p(w.a(linkedList), linkedList, nVar), eVar, nVar);
        }
    }

    private u0 l(List list, List list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        if (list.isEmpty()) {
            u0 K02 = new C6698p((Map) null, this.f73037c, this.f73035a, this.f73036b, this.f73038d).K0(true, true);
            if (K02 == null) {
                a(42);
            }
            return K02;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashMap.put(((m0) list.get(i10)).l(), ((m0) list2.get(i10)).l());
        }
        u0 K03 = new C6698p(hashMap, this.f73037c, this.f73035a, this.f73036b, this.f73038d).K0(true, true);
        if (K03 == null) {
            a(43);
        }
        return K03;
    }

    public static C6697o m(Gg.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new C6697o(f73034g, gVar, f.a.f63179a, (p) null);
    }

    private static E n(Collection collection, C5487e eVar) {
        E e10;
        if (collection == null) {
            a(86);
        }
        if (eVar == null) {
            a(87);
        }
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (it.hasNext()) {
            C5484b bVar = (C5484b) it.next();
            int i10 = h.f73045c[bVar.r().ordinal()];
            if (i10 == 1) {
                E e11 = E.FINAL;
                if (e11 == null) {
                    a(88);
                }
                return e11;
            } else if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + bVar);
            } else if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (!(!eVar.k0() || eVar.r() == E.ABSTRACT || eVar.r() == E.SEALED)) {
            z10 = true;
        }
        if (z11 && !z12) {
            E e12 = E.OPEN;
            if (e12 == null) {
                a(89);
            }
            return e12;
        } else if (z11 || !z12) {
            HashSet hashSet = new HashSet();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                hashSet.addAll(z((C5484b) it2.next()));
            }
            return y(r(hashSet), z10, eVar.r());
        } else {
            if (z10) {
                e10 = eVar.r();
            } else {
                e10 = E.ABSTRACT;
            }
            if (e10 == null) {
                a(90);
            }
            return e10;
        }
    }

    private Collection o(C5484b bVar, Collection collection, C5487e eVar, C6696n nVar) {
        if (bVar == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (eVar == null) {
            a(59);
        }
        if (nVar == null) {
            a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        l b10 = l.b();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C5484b bVar2 = (C5484b) it.next();
            i.a c10 = D(bVar2, bVar, eVar).c();
            boolean I10 = I(bVar, bVar2, false);
            int i10 = h.f73044b[c10.ordinal()];
            if (i10 == 1) {
                if (I10) {
                    b10.add(bVar2);
                }
                arrayList.add(bVar2);
            } else if (i10 == 2) {
                if (I10) {
                    nVar.c(bVar2, bVar);
                }
                arrayList.add(bVar2);
            }
        }
        nVar.d(bVar, b10);
        return arrayList;
    }

    private static Collection p(C5484b bVar, Queue queue, C6696n nVar) {
        if (bVar == null) {
            a(102);
        }
        if (queue == null) {
            a(103);
        }
        if (nVar == null) {
            a(104);
        }
        return q(bVar, queue, new f(), new g(nVar, bVar));
    }

    public static Collection q(Object obj, Collection collection, C6798l lVar, C6798l lVar2) {
        if (obj == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (lVar == null) {
            a(99);
        }
        if (lVar2 == null) {
            a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        C5483a aVar = (C5483a) lVar.invoke(obj);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C5483a aVar2 = (C5483a) lVar.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                i.a x10 = x(aVar, aVar2);
                if (x10 == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (x10 == i.a.CONFLICT) {
                    lVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static Set r(Set set) {
        boolean z10;
        if (set == null) {
            a(8);
        }
        if (set.isEmpty() || !C6755e.y(C6755e.s((C5495m) set.iterator().next()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        return s(set, z10, (C6787a) null, new b());
    }

    public static Set s(Set set, boolean z10, C6787a aVar, p pVar) {
        if (set == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object next : set) {
            if (aVar != null) {
                aVar.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(next);
                    break;
                }
                Pair pair = (Pair) pVar.invoke(next, it.next());
                C5483a aVar2 = (C5483a) pair.a();
                C5483a aVar3 = (C5483a) pair.b();
                if (J(aVar2, aVar3, z10, true)) {
                    it.remove();
                } else if (J(aVar3, aVar2, z10, true)) {
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection t(C5487e eVar, Collection collection) {
        if (eVar == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        List k02 = C6565s.k0(collection, new e(eVar));
        if (k02 == null) {
            a(96);
        }
        return k02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Of.C5502u u(java.util.Collection r5) {
        /*
            if (r5 != 0) goto L_0x0007
            r0 = 107(0x6b, float:1.5E-43)
            a(r0)
        L_0x0007:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0010
            Of.u r5 = Of.C5501t.f64516l
            return r5
        L_0x0010:
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L_0x0015:
            r2 = r1
        L_0x0016:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r0.next()
            Of.b r3 = (Of.C5484b) r3
            Of.u r3 = r3.getVisibility()
            if (r2 != 0) goto L_0x002a
        L_0x0028:
            r2 = r3
            goto L_0x0016
        L_0x002a:
            java.lang.Integer r4 = Of.C5501t.d(r3, r2)
            if (r4 != 0) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x0016
            goto L_0x0028
        L_0x0038:
            if (r2 != 0) goto L_0x003b
            return r1
        L_0x003b:
            java.util.Iterator r5 = r5.iterator()
        L_0x003f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r5.next()
            Of.b r0 = (Of.C5484b) r0
            Of.u r0 = r0.getVisibility()
            java.lang.Integer r0 = Of.C5501t.d(r2, r0)
            if (r0 == 0) goto L_0x005b
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x003f
        L_0x005b:
            return r1
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.C6697o.u(java.util.Collection):Of.u");
    }

    public static i w(C5483a aVar, C5483a aVar2) {
        boolean z10;
        if (aVar == null) {
            a(38);
        }
        if (aVar2 == null) {
            a(39);
        }
        boolean z11 = aVar instanceof C5507z;
        if ((z11 && !(aVar2 instanceof C5507z)) || (((z10 = aVar instanceof Z)) && !(aVar2 instanceof Z))) {
            return i.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
        } else if (!aVar.getName().equals(aVar2.getName())) {
            return i.d("Name mismatch");
        } else {
            i e10 = e(aVar, aVar2);
            if (e10 != null) {
                return e10;
            }
            return null;
        }
    }

    public static i.a x(C5483a aVar, C5483a aVar2) {
        C6697o oVar = f73033f;
        i.a c10 = oVar.D(aVar2, aVar, (C5487e) null).c();
        i.a c11 = oVar.D(aVar, aVar2, (C5487e) null).c();
        i.a aVar3 = i.a.OVERRIDABLE;
        if (c10 == aVar3 && c11 == aVar3) {
            return aVar3;
        }
        i.a aVar4 = i.a.CONFLICT;
        if (c10 == aVar4 || c11 == aVar4) {
            return aVar4;
        }
        return i.a.INCOMPATIBLE;
    }

    private static E y(Collection collection, boolean z10, E e10) {
        E e11;
        if (collection == null) {
            a(91);
        }
        if (e10 == null) {
            a(92);
        }
        E e12 = E.ABSTRACT;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C5484b bVar = (C5484b) it.next();
            if (!z10 || bVar.r() != E.ABSTRACT) {
                e11 = bVar.r();
            } else {
                e11 = e10;
            }
            if (e11.compareTo(e12) < 0) {
                e12 = e11;
            }
        }
        if (e12 == null) {
            a(93);
        }
        return e12;
    }

    public static Set z(C5484b bVar) {
        if (bVar == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(bVar, linkedHashSet);
        return linkedHashSet;
    }

    public i D(C5483a aVar, C5483a aVar2, C5487e eVar) {
        if (aVar == null) {
            a(19);
        }
        if (aVar2 == null) {
            a(20);
        }
        i E10 = E(aVar, aVar2, eVar, false);
        if (E10 == null) {
            a(21);
        }
        return E10;
    }

    public i E(C5483a aVar, C5483a aVar2, C5487e eVar, boolean z10) {
        boolean z11;
        if (aVar == null) {
            a(22);
        }
        if (aVar2 == null) {
            a(23);
        }
        i F10 = F(aVar, aVar2, z10);
        if (F10.c() == i.a.OVERRIDABLE) {
            z11 = true;
        } else {
            z11 = false;
        }
        for (C6692j jVar : f73032e) {
            if (jVar.b() != C6692j.a.CONFLICTS_ONLY && (!z11 || jVar.b() != C6692j.a.SUCCESS_ONLY)) {
                int i10 = h.f73043a[jVar.a(aVar, aVar2, eVar).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else if (i10 == 2) {
                    i d10 = i.d("External condition");
                    if (d10 == null) {
                        a(24);
                    }
                    return d10;
                }
            }
        }
        if (!z11) {
            return F10;
        }
        for (C6692j jVar2 : f73032e) {
            if (jVar2.b() == C6692j.a.CONFLICTS_ONLY) {
                int i11 = h.f73043a[jVar2.a(aVar, aVar2, eVar).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + jVar2.getClass().getName() + " condition. It's not supposed to end with success");
                } else if (i11 == 2) {
                    i d11 = i.d("External condition");
                    if (d11 == null) {
                        a(26);
                    }
                    return d11;
                }
            }
        }
        i e10 = i.e();
        if (e10 == null) {
            a(27);
        }
        return e10;
    }

    public i F(C5483a aVar, C5483a aVar2, boolean z10) {
        if (aVar == null) {
            a(28);
        }
        if (aVar2 == null) {
            a(29);
        }
        i w10 = w(aVar, aVar2);
        if (w10 != null) {
            return w10;
        }
        List g10 = g(aVar);
        List g11 = g(aVar2);
        List typeParameters = aVar.getTypeParameters();
        List typeParameters2 = aVar2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < g10.size()) {
                if (!Gg.e.f63178a.b((S) g10.get(i10), (S) g11.get(i10))) {
                    i d10 = i.d("Type parameter number mismatch");
                    if (d10 == null) {
                        a(31);
                    }
                    return d10;
                }
                i10++;
            }
            i b10 = i.b("Type parameter number mismatch");
            if (b10 == null) {
                a(32);
            }
            return b10;
        }
        u0 l10 = l(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            if (!c((m0) typeParameters.get(i11), (m0) typeParameters2.get(i11), l10)) {
                i d11 = i.d("Type parameter bounds mismatch");
                if (d11 == null) {
                    a(33);
                }
                return d11;
            }
        }
        while (i10 < g10.size()) {
            if (!d((S) g10.get(i10), (S) g11.get(i10), l10)) {
                i d12 = i.d("Value parameter type mismatch");
                if (d12 == null) {
                    a(34);
                }
                return d12;
            }
            i10++;
        }
        if (!(aVar instanceof C5507z) || !(aVar2 instanceof C5507z) || ((C5507z) aVar).isSuspend() == ((C5507z) aVar2).isSuspend()) {
            if (z10) {
                S returnType = aVar.getReturnType();
                S returnType2 = aVar2.getReturnType();
                if (!(returnType == null || returnType2 == null || ((W.a(returnType2) && W.a(returnType)) || C5371g.f63009a.t(l10, returnType2.Q0(), returnType.Q0())))) {
                    i b11 = i.b("Return type mismatch");
                    if (b11 == null) {
                        a(36);
                    }
                    return b11;
                }
            }
            i e10 = i.e();
            if (e10 == null) {
                a(37);
            }
            return e10;
        }
        i b12 = i.b("Incompatible suspendability");
        if (b12 == null) {
            a(35);
        }
        return b12;
    }

    public void v(ng.f fVar, Collection collection, Collection collection2, C5487e eVar, C6696n nVar) {
        if (fVar == null) {
            a(50);
        }
        if (collection == null) {
            a(51);
        }
        if (collection2 == null) {
            a(52);
        }
        if (eVar == null) {
            a(53);
        }
        if (nVar == null) {
            a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o((C5484b) it.next(), collection, eVar, nVar));
        }
        k(eVar, linkedHashSet, nVar);
    }

    /* renamed from: rg.o$d */
    static class d implements C6798l {
        d() {
        }

        /* renamed from: a */
        public C5484b invoke(C5484b bVar) {
            return bVar;
        }
    }

    /* renamed from: rg.o$f */
    static class f implements C6798l {
        f() {
        }

        /* renamed from: a */
        public C5483a invoke(C5484b bVar) {
            return bVar;
        }
    }
}
