package bg;

import Eg.i;
import Eg.m;
import Ff.l;
import Of.C5487e;
import Of.h0;
import Pf.h;
import Rf.H;
import ag.c;
import ag.k;
import eg.C5830g;
import eg.u;
import eg.z;
import gg.C5944D;
import gg.C5973w;
import gg.C5974x;
import gg.C5975y;
import hg.C5996a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6502A;
import mf.C6565s;
import mg.C6577e;
import ng.b;
import wg.C6768d;

/* renamed from: bg.D  reason: case insensitive filesystem */
public final class C5738D extends H {

    /* renamed from: o  reason: collision with root package name */
    static final /* synthetic */ l[] f67125o;

    /* renamed from: g  reason: collision with root package name */
    private final u f67126g;

    /* renamed from: h  reason: collision with root package name */
    private final k f67127h;

    /* renamed from: i  reason: collision with root package name */
    private final C6577e f67128i;

    /* renamed from: j  reason: collision with root package name */
    private final i f67129j;

    /* renamed from: k  reason: collision with root package name */
    private final C5765f f67130k;

    /* renamed from: l  reason: collision with root package name */
    private final i f67131l;

    /* renamed from: m  reason: collision with root package name */
    private final h f67132m;

    /* renamed from: n  reason: collision with root package name */
    private final i f67133n;

    /* renamed from: bg.D$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f67134a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                hg.a$a[] r0 = hg.C5996a.C1007a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                hg.a$a r1 = hg.C5996a.C1007a.MULTIFILE_CLASS_PART     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                hg.a$a r1 = hg.C5996a.C1007a.FILE_FACADE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f67134a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bg.C5738D.a.<clinit>():void");
        }
    }

    static {
        Class<C5738D> cls = C5738D.class;
        f67125o = new l[]{O.i(new F(O.b(cls), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), O.i(new F(O.b(cls), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5738D(k kVar, u uVar) {
        super(kVar.d(), uVar.f());
        h hVar;
        C6496s.h(kVar, "outerContext");
        C6496s.h(uVar, "jPackage");
        this.f67126g = uVar;
        k f10 = c.f(kVar, this, (z) null, 0, 6, (Object) null);
        this.f67127h = f10;
        this.f67128i = Pg.c.a(kVar.a().b().f().g());
        this.f67129j = f10.e().g(new C5735A(this));
        this.f67130k = new C5765f(f10, uVar, this);
        this.f67131l = f10.e().b(new C5736B(this), C6565s.n());
        if (f10.a().i().b()) {
            hVar = h.f64602L.b();
        } else {
            hVar = ag.h.a(f10, uVar);
        }
        this.f67132m = hVar;
        this.f67133n = f10.e().g(new C5737C(this));
    }

    /* access modifiers changed from: private */
    public static final Map M0(C5738D d10) {
        Pair pair;
        C5944D o10 = d10.f67127h.a().o();
        String b10 = d10.f().b();
        C6496s.g(b10, "asString(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : o10.a(b10)) {
            b.a aVar = b.f72283d;
            ng.c e10 = C6768d.d(str).e();
            C6496s.g(e10, "getFqNameForTopLevelClassMaybeWithDollars(...)");
            C5974x b11 = C5973w.b(d10.f67127h.a().j(), aVar.c(e10), d10.f67128i);
            if (b11 != null) {
                pair = C6502A.a(str, b11);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return mf.O.w(arrayList);
    }

    /* access modifiers changed from: private */
    public static final HashMap R0(C5738D d10) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : d10.O0().entrySet()) {
            C6768d d11 = C6768d.d((String) entry.getKey());
            C6496s.g(d11, "byInternalName(...)");
            C5996a e10 = ((C5974x) entry.getValue()).e();
            int i10 = a.f67134a[e10.c().ordinal()];
            if (i10 == 1) {
                String e11 = e10.e();
                if (e11 != null) {
                    hashMap.put(d11, C6768d.d(e11));
                }
            } else if (i10 == 2) {
                hashMap.put(d11, d11);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static final List S0(C5738D d10) {
        Iterable<u> v10 = d10.f67126g.v();
        ArrayList arrayList = new ArrayList(C6565s.y(v10, 10));
        for (u f10 : v10) {
            arrayList.add(f10.f());
        }
        return arrayList;
    }

    public final C5487e N0(C5830g gVar) {
        C6496s.h(gVar, "jClass");
        return this.f67130k.i().k0(gVar);
    }

    public final Map O0() {
        return (Map) m.a(this.f67129j, this, f67125o[0]);
    }

    /* renamed from: P0 */
    public C5765f o() {
        return this.f67130k;
    }

    public final List Q0() {
        return (List) this.f67131l.invoke();
    }

    public h getAnnotations() {
        return this.f67132m;
    }

    public h0 i() {
        return new C5975y(this);
    }

    public String toString() {
        return "Lazy Java package fragment: " + f() + " of module " + this.f67127h.a().m();
    }
}
