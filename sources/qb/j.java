package Qb;

import Lb.C4375i;
import Lb.H;
import Mb.d;
import Ob.l;
import Qb.l;
import Rb.b;
import Rb.d;
import Tb.g;
import Tb.i;
import Tb.m;
import Tb.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final i f52287a;

    /* renamed from: b  reason: collision with root package name */
    private final l f52288b;

    /* renamed from: c  reason: collision with root package name */
    private k f52289c;

    /* renamed from: d  reason: collision with root package name */
    private final List f52290d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final f f52291e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final List f52292a;

        /* renamed from: b  reason: collision with root package name */
        public final List f52293b;

        public a(List list, List list2) {
            this.f52292a = list;
            this.f52293b = list2;
        }
    }

    public j(i iVar, k kVar) {
        this.f52287a = iVar;
        b bVar = new b(iVar.c());
        d j10 = iVar.d().j();
        this.f52288b = new l(j10);
        a d10 = kVar.d();
        a c10 = kVar.c();
        i d11 = i.d(g.A(), iVar.c());
        i c11 = bVar.c(d11, d10.a(), (Rb.a) null);
        i c12 = j10.c(d11, c10.a(), (Rb.a) null);
        this.f52289c = new k(new a(c12, c10.f(), j10.d()), new a(c11, d10.f(), bVar.d()));
        this.f52291e = new f(iVar);
    }

    private List c(List list, i iVar, C4375i iVar2) {
        List list2;
        if (iVar2 == null) {
            list2 = this.f52290d;
        } else {
            list2 = Arrays.asList(new C4375i[]{iVar2});
        }
        return this.f52291e.d(list, iVar, list2);
    }

    public void a(C4375i iVar) {
        this.f52290d.add(iVar);
    }

    public a b(Mb.d dVar, H h10, n nVar) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (dVar.c() == d.a.Merge && dVar.b().b() != null) {
            if (this.f52289c.b() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            l.g(z10, "We should always have a full cache before handling merges");
            if (this.f52289c.a() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            l.g(z11, "Missing event cache, even though we have a server cache");
        }
        k kVar = this.f52289c;
        l.c b10 = this.f52288b.b(kVar, dVar, h10, nVar);
        if (b10.f52299a.d().f() || !kVar.d().f()) {
            z12 = true;
        }
        Ob.l.g(z12, "Once a server snap is complete, it should never go back");
        k kVar2 = b10.f52299a;
        this.f52289c = kVar2;
        return new a(c(b10.f52300b, kVar2.c().a(), (C4375i) null), b10.f52300b);
    }

    public n d() {
        return this.f52289c.a();
    }

    public n e(Lb.l lVar) {
        n b10 = this.f52289c.b();
        if (b10 == null) {
            return null;
        }
        if (this.f52287a.g() || (!lVar.isEmpty() && !b10.k0(lVar.E()).isEmpty())) {
            return b10.U(lVar);
        }
        return null;
    }

    public n f() {
        return this.f52289c.c().b();
    }

    public List g(C4375i iVar) {
        a c10 = this.f52289c.c();
        ArrayList arrayList = new ArrayList();
        for (m mVar : c10.b()) {
            arrayList.add(c.c(mVar.c(), mVar.d()));
        }
        if (c10.f()) {
            arrayList.add(c.n(c10.a()));
        }
        return c(arrayList, c10.a(), iVar);
    }

    public i h() {
        return this.f52287a;
    }

    public n i() {
        return this.f52289c.d().b();
    }

    public boolean j() {
        return this.f52290d.isEmpty();
    }

    public List k(C4375i iVar, Gb.b bVar) {
        List list;
        boolean z10;
        int i10 = 0;
        if (bVar != null) {
            list = new ArrayList();
            if (iVar == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Ob.l.g(z10, "A cancel should cancel all event registrations");
            Lb.l e10 = this.f52287a.e();
            for (C4375i bVar2 : this.f52290d) {
                list.add(new b(bVar2, bVar, e10));
            }
        } else {
            list = Collections.emptyList();
        }
        if (iVar != null) {
            int i11 = -1;
            while (true) {
                if (i10 >= this.f52290d.size()) {
                    i10 = i11;
                    break;
                }
                C4375i iVar2 = (C4375i) this.f52290d.get(i10);
                if (iVar2.f(iVar)) {
                    if (iVar2.h()) {
                        break;
                    }
                    i11 = i10;
                }
                i10++;
            }
            if (i10 != -1) {
                this.f52290d.remove(i10);
                ((C4375i) this.f52290d.get(i10)).l();
            }
        } else {
            for (C4375i l10 : this.f52290d) {
                l10.l();
            }
            this.f52290d.clear();
        }
        return list;
    }
}
