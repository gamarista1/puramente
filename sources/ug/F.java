package Ug;

import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.N;
import qf.C6658d;
import qf.e;
import qf.g;
import qf.h;
import yf.p;

public abstract class F {

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f65300a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final g invoke(g gVar, g.b bVar) {
            return gVar.n1(bVar);
        }
    }

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f65301a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f65302b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(N n10, boolean z10) {
            super(2);
            this.f65301a = n10;
            this.f65302b = z10;
        }

        /* renamed from: a */
        public final g invoke(g gVar, g.b bVar) {
            return gVar.n1(bVar);
        }
    }

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final c f65303a = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z10, g.b bVar) {
            return Boolean.valueOf(z10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    private static final g a(g gVar, g gVar2, boolean z10) {
        boolean c10 = c(gVar);
        boolean c11 = c(gVar2);
        if (!c10 && !c11) {
            return gVar.n1(gVar2);
        }
        N n10 = new N();
        n10.f71759a = gVar2;
        h hVar = h.f72645a;
        g gVar3 = (g) gVar.f0(hVar, new b(n10, z10));
        if (c11) {
            n10.f71759a = ((g) n10.f71759a).f0(hVar, a.f65300a);
        }
        return gVar3.n1((g) n10.f71759a);
    }

    public static final String b(g gVar) {
        return null;
    }

    private static final boolean c(g gVar) {
        return ((Boolean) gVar.f0(Boolean.FALSE, c.f65303a)).booleanValue();
    }

    public static final g d(K k10, g gVar) {
        g a10 = a(k10.getCoroutineContext(), gVar, true);
        if (a10 == Z.a() || a10.b(e.f72642c0) != null) {
            return a10;
        }
        return a10.n1(Z.a());
    }

    public static final g e(g gVar, g gVar2) {
        if (!c(gVar2)) {
            return gVar.n1(gVar2);
        }
        return a(gVar, gVar2, false);
    }

    public static final g1 f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof W) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof g1) {
                return (g1) eVar;
            }
        }
        return null;
    }

    public static final g1 g(C6658d dVar, g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e) || gVar.b(h1.f65387a) == null) {
            return null;
        }
        g1 f10 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f10 != null) {
            f10.h1(gVar, obj);
        }
        return f10;
    }
}
