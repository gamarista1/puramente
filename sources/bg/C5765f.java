package bg;

import Eg.i;
import Eg.m;
import Ff.l;
import Of.C5487e;
import Of.C5490h;
import Of.C5491i;
import Of.D;
import Og.a;
import Wf.b;
import ag.k;
import eg.u;
import gg.C5974x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mf.C6559l;
import mf.C6565s;
import mf.Y;
import ng.f;
import yf.C6798l;
import yg.C6805d;
import yg.C6812k;
import yg.C6814m;

/* renamed from: bg.f  reason: case insensitive filesystem */
public final class C5765f implements C6812k {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ l[] f67205f = {O.i(new F(O.b(C5765f.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b  reason: collision with root package name */
    private final k f67206b;

    /* renamed from: c  reason: collision with root package name */
    private final C5738D f67207c;

    /* renamed from: d  reason: collision with root package name */
    private final C5741G f67208d;

    /* renamed from: e  reason: collision with root package name */
    private final i f67209e;

    public C5765f(k kVar, u uVar, C5738D d10) {
        C6496s.h(kVar, "c");
        C6496s.h(uVar, "jPackage");
        C6496s.h(d10, "packageFragment");
        this.f67206b = kVar;
        this.f67207c = d10;
        this.f67208d = new C5741G(kVar, uVar, d10);
        this.f67209e = kVar.e().g(new C5764e(this));
    }

    private final C6812k[] j() {
        return (C6812k[]) m.a(this.f67209e, this, f67205f[0]);
    }

    /* access modifiers changed from: private */
    public static final C6812k[] k(C5765f fVar) {
        ArrayList arrayList = new ArrayList();
        for (C5974x c10 : fVar.f67207c.O0().values()) {
            C6812k c11 = fVar.f67206b.a().b().c(fVar.f67207c, c10);
            if (c11 != null) {
                arrayList.add(c11);
            }
        }
        return (C6812k[]) a.b(arrayList).toArray(new C6812k[0]);
    }

    public Set a() {
        C6812k[] j10 = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C6812k a10 : j10) {
            C6565s.D(linkedHashSet, a10.a());
        }
        linkedHashSet.addAll(this.f67208d.a());
        return linkedHashSet;
    }

    public Collection b(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        l(fVar, bVar);
        C5741G g10 = this.f67208d;
        C6812k[] j10 = j();
        Collection b10 = g10.b(fVar, bVar);
        for (C6812k b11 : j10) {
            b10 = a.a(b10, b11.b(fVar, bVar));
        }
        if (b10 == null) {
            return Y.e();
        }
        return b10;
    }

    public Collection c(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        l(fVar, bVar);
        C5741G g10 = this.f67208d;
        C6812k[] j10 = j();
        Collection c10 = g10.c(fVar, bVar);
        for (C6812k c11 : j10) {
            c10 = a.a(c10, c11.c(fVar, bVar));
        }
        if (c10 == null) {
            return Y.e();
        }
        return c10;
    }

    public Set d() {
        C6812k[] j10 = j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C6812k d10 : j10) {
            C6565s.D(linkedHashSet, d10.d());
        }
        linkedHashSet.addAll(this.f67208d.d());
        return linkedHashSet;
    }

    public C5490h e(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        l(fVar, bVar);
        C5487e l02 = this.f67208d.e(fVar, bVar);
        if (l02 != null) {
            return l02;
        }
        C5490h hVar = null;
        for (C6812k e10 : j()) {
            C5490h e11 = e10.e(fVar, bVar);
            if (e11 != null) {
                if (!(e11 instanceof C5491i) || !((D) e11).k0()) {
                    return e11;
                }
                if (hVar == null) {
                    hVar = e11;
                }
            }
        }
        return hVar;
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        C5741G g10 = this.f67208d;
        C6812k[] j10 = j();
        Collection f10 = g10.f(dVar, lVar);
        for (C6812k f11 : j10) {
            f10 = a.a(f10, f11.f(dVar, lVar));
        }
        if (f10 == null) {
            return Y.e();
        }
        return f10;
    }

    public Set g() {
        Set a10 = C6814m.a(C6559l.R(j()));
        if (a10 == null) {
            return null;
        }
        a10.addAll(this.f67208d.g());
        return a10;
    }

    public final C5741G i() {
        return this.f67208d;
    }

    public void l(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        Vf.a.b(this.f67206b.a().l(), bVar, this.f67207c, fVar);
    }

    public String toString() {
        return "scope for " + this.f67207c;
    }
}
