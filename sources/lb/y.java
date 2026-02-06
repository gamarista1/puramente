package Lb;

import Ib.h;
import Ob.d;
import Qb.e;
import Tb.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public class y {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Ob.d f51902a = Ob.d.b();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final G f51903b = new G();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map f51904c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Map f51905d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Set f51906e = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final r f51907f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Nb.e f51908g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Sb.c f51909h;

    /* renamed from: i  reason: collision with root package name */
    private long f51910i = 1;

    class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f51911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f51912b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f51913c;

        a(z zVar, l lVar, Map map) {
            this.f51911a = zVar;
            this.f51912b = lVar;
            this.f51913c = map;
        }

        /* renamed from: a */
        public List call() {
            Qb.i l10 = y.this.S(this.f51911a);
            if (l10 == null) {
                return Collections.emptyList();
            }
            l I10 = l.I(l10.e(), this.f51912b);
            C4368b r10 = C4368b.r(this.f51913c);
            y.this.f51908g.o(this.f51912b, r10);
            return y.this.D(l10, new Mb.c(Mb.e.a(l10.d()), I10, r10));
        }
    }

    class b implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Qb.i f51915a;

        b(Qb.i iVar) {
            this.f51915a = iVar;
        }

        /* renamed from: a */
        public Void call() {
            y.this.f51908g.m(this.f51915a);
            return null;
        }
    }

    class c implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4375i f51917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f51918b;

        c(C4375i iVar, boolean z10) {
            this.f51917a = iVar;
            this.f51918b = z10;
        }

        /* renamed from: a */
        public List call() {
            Qb.a aVar;
            Tb.n d10;
            Tb.b bVar;
            Qb.i e10 = this.f51917a.e();
            l e11 = e10.e();
            Ob.d n10 = y.this.f51902a;
            Tb.n nVar = null;
            l lVar = e11;
            boolean z10 = false;
            while (!n10.isEmpty()) {
                w wVar = (w) n10.getValue();
                if (wVar != null) {
                    if (nVar == null) {
                        nVar = wVar.d(lVar);
                    }
                    if (z10 || wVar.h()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (lVar.isEmpty()) {
                    bVar = Tb.b.e("");
                } else {
                    bVar = lVar.E();
                }
                n10 = n10.r(bVar);
                lVar = lVar.N();
            }
            w wVar2 = (w) y.this.f51902a.n(e11);
            if (wVar2 == null) {
                wVar2 = new w(y.this.f51908g);
                y yVar = y.this;
                Ob.d unused = yVar.f51902a = yVar.f51902a.C(e11, wVar2);
            } else {
                if (z10 || wVar2.h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (nVar == null) {
                    nVar = wVar2.d(l.D());
                }
            }
            y.this.f51908g.m(e10);
            if (nVar != null) {
                aVar = new Qb.a(Tb.i.d(nVar, e10.c()), true, false);
            } else {
                aVar = y.this.f51908g.k(e10);
                if (!aVar.f()) {
                    Tb.n A10 = Tb.g.A();
                    Iterator it = y.this.f51902a.E(e11).t().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        w wVar3 = (w) ((Ob.d) entry.getValue()).getValue();
                        if (!(wVar3 == null || (d10 = wVar3.d(l.D())) == null)) {
                            A10 = A10.b0((Tb.b) entry.getKey(), d10);
                        }
                    }
                    for (Tb.m mVar : aVar.b()) {
                        if (!A10.w(mVar.c())) {
                            A10 = A10.b0(mVar.c(), mVar.d());
                        }
                    }
                    aVar = new Qb.a(Tb.i.d(A10, e10.c()), false, false);
                }
            }
            boolean k10 = wVar2.k(e10);
            if (!k10 && !e10.g()) {
                Ob.l.g(!y.this.f51905d.containsKey(e10), "View does not exist but we have a tag");
                z q10 = y.this.M();
                y.this.f51905d.put(e10, q10);
                y.this.f51904c.put(q10, e10);
            }
            List a10 = wVar2.a(this.f51917a, y.this.f51903b.h(e11), aVar);
            if (!k10 && !z10 && !this.f51918b) {
                y.this.Z(e10, wVar2.l(e10));
            }
            return a10;
        }
    }

    class d implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Qb.i f51920a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C4375i f51921b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Gb.b f51922c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f51923d;

        d(Qb.i iVar, C4375i iVar2, Gb.b bVar, boolean z10) {
            this.f51920a = iVar;
            this.f51921b = iVar2;
            this.f51922c = bVar;
            this.f51923d = z10;
        }

        /* renamed from: a */
        public List call() {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            l e10 = this.f51920a.e();
            w wVar = (w) y.this.f51902a.n(e10);
            List arrayList = new ArrayList();
            if (wVar != null && (this.f51920a.f() || wVar.k(this.f51920a))) {
                Ob.g j10 = wVar.j(this.f51920a, this.f51921b, this.f51922c);
                if (wVar.i()) {
                    y yVar = y.this;
                    Ob.d unused = yVar.f51902a = yVar.f51902a.z(e10);
                }
                List<Qb.i> list = (List) j10.a();
                arrayList = (List) j10.b();
                Iterator it = list.iterator();
                loop0:
                while (true) {
                    z10 = false;
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Qb.i iVar = (Qb.i) it.next();
                        y.this.f51908g.j(this.f51920a);
                        if (z10 || iVar.g()) {
                            z10 = true;
                        }
                    }
                }
                if (this.f51923d) {
                    return null;
                }
                Ob.d n10 = y.this.f51902a;
                if (n10.getValue() == null || !((w) n10.getValue()).h()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                Iterator it2 = e10.iterator();
                while (it2.hasNext()) {
                    n10 = n10.r((Tb.b) it2.next());
                    if (z11 || (n10.getValue() != null && ((w) n10.getValue()).h())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z11) {
                        if (n10.isEmpty()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10 && !z11) {
                    Ob.d E10 = y.this.f51902a.E(e10);
                    if (!E10.isEmpty()) {
                        for (Qb.j jVar : y.this.K(E10)) {
                            q qVar = new q(jVar);
                            y.this.f51907f.a(y.this.R(jVar.h()), qVar.f51965b, qVar, qVar);
                        }
                    }
                }
                if (!z11 && !list.isEmpty() && this.f51922c == null) {
                    if (z10) {
                        y.this.f51907f.b(y.this.R(this.f51920a), (z) null);
                    } else {
                        for (Qb.i iVar2 : list) {
                            z a02 = y.this.a0(iVar2);
                            if (a02 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            Ob.l.f(z12);
                            y.this.f51907f.b(y.this.R(iVar2), a02);
                        }
                    }
                }
                y.this.X(list);
            }
            return arrayList;
        }
    }

    class e implements d.c {
        e() {
        }

        /* renamed from: b */
        public Void a(l lVar, w wVar, Void voidR) {
            if (lVar.isEmpty() || !wVar.h()) {
                for (Qb.j h10 : wVar.f()) {
                    Qb.i h11 = h10.h();
                    y.this.f51907f.b(y.this.R(h11), y.this.a0(h11));
                }
                return null;
            }
            Qb.i h12 = wVar.e().h();
            y.this.f51907f.b(y.this.R(h12), y.this.a0(h12));
            return null;
        }
    }

    class f extends h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Tb.n f51926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ H f51927b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Mb.d f51928c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f51929d;

        f(Tb.n nVar, H h10, Mb.d dVar, List list) {
            this.f51926a = nVar;
            this.f51927b = h10;
            this.f51928c = dVar;
            this.f51929d = list;
        }

        /* renamed from: b */
        public void a(Tb.b bVar, Ob.d dVar) {
            Tb.n nVar;
            Tb.n nVar2 = this.f51926a;
            if (nVar2 != null) {
                nVar = nVar2.k0(bVar);
            } else {
                nVar = null;
            }
            H h10 = this.f51927b.h(bVar);
            Mb.d d10 = this.f51928c.d(bVar);
            if (d10 != null) {
                this.f51929d.addAll(y.this.w(d10, dVar, nVar, h10));
            }
        }
    }

    class g implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f51931a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f51932b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Tb.n f51933c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f51934d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Tb.n f51935e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f51936f;

        g(boolean z10, l lVar, Tb.n nVar, long j10, Tb.n nVar2, boolean z11) {
            this.f51931a = z10;
            this.f51932b = lVar;
            this.f51933c = nVar;
            this.f51934d = j10;
            this.f51935e = nVar2;
            this.f51936f = z11;
        }

        /* renamed from: a */
        public List call() {
            if (this.f51931a) {
                y.this.f51908g.c(this.f51932b, this.f51933c, this.f51934d);
            }
            y.this.f51903b.b(this.f51932b, this.f51935e, Long.valueOf(this.f51934d), this.f51936f);
            if (!this.f51936f) {
                return Collections.emptyList();
            }
            return y.this.y(new Mb.f(Mb.e.f52043d, this.f51932b, this.f51935e));
        }
    }

    class h implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f51938a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f51939b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4368b f51940c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f51941d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4368b f51942e;

        h(boolean z10, l lVar, C4368b bVar, long j10, C4368b bVar2) {
            this.f51938a = z10;
            this.f51939b = lVar;
            this.f51940c = bVar;
            this.f51941d = j10;
            this.f51942e = bVar2;
        }

        /* renamed from: a */
        public List call() {
            if (this.f51938a) {
                y.this.f51908g.d(this.f51939b, this.f51940c, this.f51941d);
            }
            y.this.f51903b.a(this.f51939b, this.f51942e, Long.valueOf(this.f51941d));
            return y.this.y(new Mb.c(Mb.e.f52043d, this.f51939b, this.f51942e));
        }
    }

    class i implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f51944a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f51945b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f51946c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ob.a f51947d;

        i(boolean z10, long j10, boolean z11, Ob.a aVar) {
            this.f51944a = z10;
            this.f51945b = j10;
            this.f51946c = z11;
            this.f51947d = aVar;
        }

        /* renamed from: a */
        public List call() {
            if (this.f51944a) {
                y.this.f51908g.b(this.f51945b);
            }
            C i10 = y.this.f51903b.i(this.f51945b);
            boolean l10 = y.this.f51903b.l(this.f51945b);
            if (i10.f() && !this.f51946c) {
                Map c10 = t.c(this.f51947d);
                if (i10.e()) {
                    y.this.f51908g.g(i10.c(), t.g(i10.b(), y.this, i10.c(), c10));
                } else {
                    y.this.f51908g.h(i10.c(), t.f(i10.a(), y.this, i10.c(), c10));
                }
            }
            if (!l10) {
                return Collections.emptyList();
            }
            Ob.d b10 = Ob.d.b();
            if (i10.e()) {
                b10 = b10.C(l.D(), Boolean.TRUE);
            } else {
                Iterator it = i10.a().iterator();
                while (it.hasNext()) {
                    b10 = b10.C((l) ((Map.Entry) it.next()).getKey(), Boolean.TRUE);
                }
            }
            return y.this.y(new Mb.a(i10.c(), b10, this.f51946c));
        }
    }

    class j implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f51949a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Tb.n f51950b;

        j(l lVar, Tb.n nVar) {
            this.f51949a = lVar;
            this.f51950b = nVar;
        }

        /* renamed from: a */
        public List call() {
            y.this.f51908g.e(Qb.i.a(this.f51949a), this.f51950b);
            return y.this.y(new Mb.f(Mb.e.f52044e, this.f51949a, this.f51950b));
        }
    }

    class k implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f51952a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f51953b;

        k(Map map, l lVar) {
            this.f51952a = map;
            this.f51953b = lVar;
        }

        /* renamed from: a */
        public List call() {
            C4368b r10 = C4368b.r(this.f51952a);
            y.this.f51908g.o(this.f51953b, r10);
            return y.this.y(new Mb.c(Mb.e.f52044e, this.f51953b, r10));
        }
    }

    class l implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f51955a;

        l(l lVar) {
            this.f51955a = lVar;
        }

        /* renamed from: a */
        public List call() {
            y.this.f51908g.i(Qb.i.a(this.f51955a));
            return y.this.y(new Mb.b(Mb.e.f52044e, this.f51955a));
        }
    }

    class m implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f51957a;

        m(z zVar) {
            this.f51957a = zVar;
        }

        /* renamed from: a */
        public List call() {
            Qb.i l10 = y.this.S(this.f51957a);
            if (l10 == null) {
                return Collections.emptyList();
            }
            y.this.f51908g.i(l10);
            return y.this.D(l10, new Mb.b(Mb.e.a(l10.d()), l.D()));
        }
    }

    class n implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f51959a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f51960b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Tb.n f51961c;

        n(z zVar, l lVar, Tb.n nVar) {
            this.f51959a = zVar;
            this.f51960b = lVar;
            this.f51961c = nVar;
        }

        /* renamed from: a */
        public List call() {
            Qb.i iVar;
            Qb.i l10 = y.this.S(this.f51959a);
            if (l10 == null) {
                return Collections.emptyList();
            }
            l I10 = l.I(l10.e(), this.f51960b);
            if (I10.isEmpty()) {
                iVar = l10;
            } else {
                iVar = Qb.i.a(this.f51960b);
            }
            y.this.f51908g.e(iVar, this.f51961c);
            return y.this.D(l10, new Mb.f(Mb.e.a(l10.d()), I10, this.f51961c));
        }
    }

    public interface o {
        List d(Gb.b bVar);
    }

    private class q implements Jb.g, o {

        /* renamed from: a  reason: collision with root package name */
        private final Qb.j f51964a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final z f51965b;

        public q(Qb.j jVar) {
            this.f51964a = jVar;
            this.f51965b = y.this.a0(jVar.h());
        }

        public String a() {
            return this.f51964a.i().M();
        }

        public Jb.a b() {
            Tb.d b10 = Tb.d.b(this.f51964a.i());
            List<l> e10 = b10.e();
            ArrayList arrayList = new ArrayList(e10.size());
            for (l r10 : e10) {
                arrayList.add(r10.r());
            }
            return new Jb.a(arrayList, b10.d());
        }

        public boolean c() {
            if (Ob.e.b(this.f51964a.i()) > 1024) {
                return true;
            }
            return false;
        }

        public List d(Gb.b bVar) {
            if (bVar == null) {
                Qb.i h10 = this.f51964a.h();
                z zVar = this.f51965b;
                if (zVar != null) {
                    return y.this.C(zVar);
                }
                return y.this.v(h10.e());
            }
            Sb.c b10 = y.this.f51909h;
            b10.i("Listen at " + this.f51964a.h().e() + " failed: " + bVar.toString());
            return y.this.T(this.f51964a.h(), bVar);
        }
    }

    public interface r {
        void a(Qb.i iVar, z zVar, Jb.g gVar, o oVar);

        void b(Qb.i iVar, z zVar);
    }

    public y(C4373g gVar, Nb.e eVar, r rVar) {
        this.f51907f = rVar;
        this.f51908g = eVar;
        this.f51909h = gVar.q("SyncTree");
    }

    /* access modifiers changed from: private */
    public List D(Qb.i iVar, Mb.d dVar) {
        boolean z10;
        l e10 = iVar.e();
        w wVar = (w) this.f51902a.n(e10);
        if (wVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Ob.l.g(z10, "Missing sync point for query tag that we're tracking");
        return wVar.b(dVar, this.f51903b.h(e10), (Tb.n) null);
    }

    /* access modifiers changed from: private */
    public List K(Ob.d dVar) {
        ArrayList arrayList = new ArrayList();
        L(dVar, arrayList);
        return arrayList;
    }

    private void L(Ob.d dVar, List list) {
        w wVar = (w) dVar.getValue();
        if (wVar == null || !wVar.h()) {
            if (wVar != null) {
                list.addAll(wVar.f());
            }
            Iterator it = dVar.t().iterator();
            while (it.hasNext()) {
                L((Ob.d) ((Map.Entry) it.next()).getValue(), list);
            }
            return;
        }
        list.add(wVar.e());
    }

    /* access modifiers changed from: private */
    public z M() {
        long j10 = this.f51910i;
        this.f51910i = 1 + j10;
        return new z(j10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Tb.n P(Qb.i iVar) {
        boolean z10;
        Tb.n nVar;
        Tb.b bVar;
        l e10 = iVar.e();
        Ob.d dVar = this.f51902a;
        Tb.n nVar2 = null;
        l lVar = e10;
        boolean z11 = false;
        while (true) {
            z10 = true;
            if (dVar.isEmpty()) {
                break;
            }
            w wVar = (w) dVar.getValue();
            if (wVar != null) {
                if (nVar2 == null) {
                    nVar2 = wVar.d(lVar);
                }
                if (z11 || wVar.h()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (lVar.isEmpty()) {
                bVar = Tb.b.e("");
            } else {
                bVar = lVar.E();
            }
            dVar = dVar.r(bVar);
            lVar = lVar.N();
        }
        w wVar2 = (w) this.f51902a.n(e10);
        if (wVar2 == null) {
            wVar2 = new w(this.f51908g);
            this.f51902a = this.f51902a.C(e10, wVar2);
        } else if (nVar2 == null) {
            nVar2 = wVar2.d(l.D());
        }
        if (nVar2 != null) {
            nVar = nVar2;
        } else {
            nVar = Tb.g.A();
        }
        Tb.i d10 = Tb.i.d(nVar, iVar.c());
        if (nVar2 == null) {
            z10 = false;
        }
        return wVar2.g(iVar, this.f51903b.h(e10), new Qb.a(d10, z10, false)).d();
    }

    /* access modifiers changed from: private */
    public Qb.i R(Qb.i iVar) {
        if (!iVar.g() || iVar.f()) {
            return iVar;
        }
        return Qb.i.a(iVar.e());
    }

    /* access modifiers changed from: private */
    public Qb.i S(z zVar) {
        return (Qb.i) this.f51904c.get(zVar);
    }

    private List W(Qb.i iVar, C4375i iVar2, Gb.b bVar, boolean z10) {
        return (List) this.f51908g.f(new d(iVar, iVar2, bVar, z10));
    }

    /* access modifiers changed from: private */
    public void X(List list) {
        boolean z10;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Qb.i iVar = (Qb.i) it.next();
            if (!iVar.g()) {
                z a02 = a0(iVar);
                if (a02 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Ob.l.f(z10);
                this.f51905d.remove(iVar);
                this.f51904c.remove(a02);
            }
        }
    }

    /* access modifiers changed from: private */
    public void Z(Qb.i iVar, Qb.j jVar) {
        l e10 = iVar.e();
        z a02 = a0(iVar);
        q qVar = new q(jVar);
        this.f51907f.a(R(iVar), a02, qVar, qVar);
        Ob.d E10 = this.f51902a.E(e10);
        if (a02 != null) {
            Ob.l.g(!((w) E10.getValue()).h(), "If we're adding a query, it shouldn't be shadowed");
        } else {
            E10.m(new e());
        }
    }

    /* access modifiers changed from: private */
    public List w(Mb.d dVar, Ob.d dVar2, Tb.n nVar, H h10) {
        w wVar = (w) dVar2.getValue();
        if (nVar == null && wVar != null) {
            nVar = wVar.d(l.D());
        }
        ArrayList arrayList = new ArrayList();
        dVar2.t().m(new f(nVar, h10, dVar, arrayList));
        if (wVar != null) {
            arrayList.addAll(wVar.b(dVar, h10, nVar));
        }
        return arrayList;
    }

    private List x(Mb.d dVar, Ob.d dVar2, Tb.n nVar, H h10) {
        Tb.n nVar2;
        if (dVar.a().isEmpty()) {
            return w(dVar, dVar2, nVar, h10);
        }
        w wVar = (w) dVar2.getValue();
        if (nVar == null && wVar != null) {
            nVar = wVar.d(l.D());
        }
        ArrayList arrayList = new ArrayList();
        Tb.b E10 = dVar.a().E();
        Mb.d d10 = dVar.d(E10);
        Ob.d dVar3 = (Ob.d) dVar2.t().b(E10);
        if (!(dVar3 == null || d10 == null)) {
            if (nVar != null) {
                nVar2 = nVar.k0(E10);
            } else {
                nVar2 = null;
            }
            arrayList.addAll(x(d10, dVar3, nVar2, h10.h(E10)));
        }
        if (wVar != null) {
            arrayList.addAll(wVar.b(dVar, h10, nVar));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List y(Mb.d dVar) {
        return x(dVar, this.f51902a, (Tb.n) null, this.f51903b.h(l.D()));
    }

    public List A(l lVar, Tb.n nVar) {
        return (List) this.f51908g.f(new j(lVar, nVar));
    }

    public List B(l lVar, List list) {
        w wVar = (w) this.f51902a.n(lVar);
        if (wVar == null) {
            return Collections.emptyList();
        }
        Qb.j e10 = wVar.e();
        if (e10 == null) {
            return Collections.emptyList();
        }
        Tb.n i10 = e10.i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i10 = ((s) it.next()).a(i10);
        }
        return A(lVar, i10);
    }

    public List C(z zVar) {
        return (List) this.f51908g.f(new m(zVar));
    }

    public List E(l lVar, Map map, z zVar) {
        return (List) this.f51908g.f(new a(zVar, lVar, map));
    }

    public List F(l lVar, Tb.n nVar, z zVar) {
        return (List) this.f51908g.f(new n(zVar, lVar, nVar));
    }

    public List G(l lVar, List list, z zVar) {
        boolean z10;
        Qb.i S10 = S(zVar);
        if (S10 == null) {
            return Collections.emptyList();
        }
        Ob.l.f(lVar.equals(S10.e()));
        w wVar = (w) this.f51902a.n(S10.e());
        boolean z11 = false;
        if (wVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Ob.l.g(z10, "Missing sync point for query tag that we're tracking");
        Qb.j l10 = wVar.l(S10);
        if (l10 != null) {
            z11 = true;
        }
        Ob.l.g(z11, "Missing view for query tag that we're tracking");
        Tb.n i10 = l10.i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i10 = ((s) it.next()).a(i10);
        }
        return F(lVar, i10, zVar);
    }

    public List H(l lVar, C4368b bVar, C4368b bVar2, long j10, boolean z10) {
        return (List) this.f51908g.f(new h(z10, lVar, bVar, j10, bVar2));
    }

    public List I(l lVar, Tb.n nVar, Tb.n nVar2, long j10, boolean z10, boolean z11) {
        boolean z12;
        if (z10 || !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        Ob.l.g(z12, "We shouldn't be persisting non-visible writes.");
        return (List) this.f51908g.f(new g(z11, lVar, nVar, j10, nVar2, z10));
    }

    public Tb.n J(l lVar, List list) {
        Ob.d dVar = this.f51902a;
        w wVar = (w) dVar.getValue();
        l D10 = l.D();
        Tb.n nVar = null;
        l lVar2 = lVar;
        do {
            Tb.b E10 = lVar2.E();
            lVar2 = lVar2.N();
            D10 = D10.x(E10);
            l I10 = l.I(D10, lVar);
            if (E10 != null) {
                dVar = dVar.r(E10);
            } else {
                dVar = Ob.d.b();
            }
            w wVar2 = (w) dVar.getValue();
            if (wVar2 != null) {
                nVar = wVar2.d(I10);
            }
            if (lVar2.isEmpty()) {
                break;
            }
        } while (nVar == null);
        return this.f51903b.d(lVar, nVar, list, true);
    }

    public Tb.n N(Qb.i iVar) {
        return (Tb.n) this.f51908g.f(new x(this, iVar));
    }

    public void O(Qb.i iVar, boolean z10, boolean z11) {
        if (z10 && !this.f51906e.contains(iVar)) {
            u(new p(iVar), z11);
            this.f51906e.add(iVar);
        } else if (!z10 && this.f51906e.contains(iVar)) {
            V(new p(iVar), z11);
            this.f51906e.remove(iVar);
        }
    }

    public com.google.firebase.database.a Q(com.google.firebase.database.h hVar) {
        return com.google.firebase.database.e.a(hVar.n(), this.f51908g.k(hVar.o()).a());
    }

    public List T(Qb.i iVar, Gb.b bVar) {
        return W(iVar, (C4375i) null, bVar, false);
    }

    public List U(C4375i iVar) {
        return W(iVar.e(), iVar, (Gb.b) null, false);
    }

    public List V(C4375i iVar, boolean z10) {
        return W(iVar.e(), iVar, (Gb.b) null, z10);
    }

    public void Y(Qb.i iVar) {
        this.f51908g.f(new b(iVar));
    }

    public z a0(Qb.i iVar) {
        return (z) this.f51905d.get(iVar);
    }

    public List s(long j10, boolean z10, boolean z11, Ob.a aVar) {
        return (List) this.f51908g.f(new i(z11, j10, z10, aVar));
    }

    public List t(C4375i iVar) {
        return u(iVar, false);
    }

    public List u(C4375i iVar, boolean z10) {
        return (List) this.f51908g.f(new c(iVar, z10));
    }

    public List v(l lVar) {
        return (List) this.f51908g.f(new l(lVar));
    }

    public List z(l lVar, Map map) {
        return (List) this.f51908g.f(new k(map, lVar));
    }

    private static class p extends C4375i {

        /* renamed from: d  reason: collision with root package name */
        private Qb.i f51963d;

        public p(Qb.i iVar) {
            this.f51963d = iVar;
        }

        public C4375i a(Qb.i iVar) {
            return new p(iVar);
        }

        public Qb.d b(Qb.c cVar, Qb.i iVar) {
            return null;
        }

        public Qb.i e() {
            return this.f51963d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof p) || !((p) obj).f51963d.equals(this.f51963d)) {
                return false;
            }
            return true;
        }

        public boolean f(C4375i iVar) {
            return iVar instanceof p;
        }

        public int hashCode() {
            return this.f51963d.hashCode();
        }

        public boolean i(e.a aVar) {
            return false;
        }

        public void c(Gb.b bVar) {
        }

        public void d(Qb.d dVar) {
        }
    }
}
