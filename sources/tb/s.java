package Tb;

import Jb.o;
import Lb.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final l f52555a;

    /* renamed from: b  reason: collision with root package name */
    private final l f52556b;

    /* renamed from: c  reason: collision with root package name */
    private final n f52557c;

    public s(o oVar) {
        l lVar;
        List a10 = oVar.a();
        l lVar2 = null;
        if (a10 != null) {
            lVar = new l(a10);
        } else {
            lVar = null;
        }
        this.f52555a = lVar;
        List b10 = oVar.b();
        this.f52556b = b10 != null ? new l(b10) : lVar2;
        this.f52557c = o.a(oVar.c());
    }

    private n b(l lVar, n nVar, n nVar2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        l lVar2 = this.f52555a;
        boolean z12 = true;
        if (lVar2 == null) {
            i10 = 1;
        } else {
            i10 = lVar.compareTo(lVar2);
        }
        l lVar3 = this.f52556b;
        if (lVar3 == null) {
            i11 = -1;
        } else {
            i11 = lVar.compareTo(lVar3);
        }
        l lVar4 = this.f52555a;
        if (lVar4 == null || !lVar.A(lVar4)) {
            z10 = false;
        } else {
            z10 = true;
        }
        l lVar5 = this.f52556b;
        if (lVar5 == null || !lVar.A(lVar5)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (i10 > 0 && i11 < 0 && !z11) {
            return nVar2;
        }
        if (i10 > 0 && z11 && nVar2.e0()) {
            return nVar2;
        }
        if (i10 > 0 && i11 == 0) {
            Ob.l.f(z11);
            Ob.l.f(!nVar2.e0());
            if (nVar.e0()) {
                return g.A();
            }
            return nVar;
        } else if (z10 || z11) {
            HashSet hashSet = new HashSet();
            Iterator it = nVar.iterator();
            while (it.hasNext()) {
                hashSet.add(((m) it.next()).c());
            }
            Iterator it2 = nVar2.iterator();
            while (it2.hasNext()) {
                hashSet.add(((m) it2.next()).c());
            }
            ArrayList<b> arrayList = new ArrayList<>(hashSet.size() + 1);
            arrayList.addAll(hashSet);
            if (!nVar2.q().isEmpty() || !nVar.q().isEmpty()) {
                arrayList.add(b.l());
            }
            n nVar3 = nVar;
            for (b bVar : arrayList) {
                n k02 = nVar.k0(bVar);
                n b10 = b(lVar.x(bVar), nVar.k0(bVar), nVar2.k0(bVar));
                if (b10 != k02) {
                    nVar3 = nVar3.b0(bVar, b10);
                }
            }
            return nVar3;
        } else {
            if (i11 <= 0 && i10 > 0) {
                z12 = false;
            }
            Ob.l.f(z12);
            return nVar;
        }
    }

    public n a(n nVar) {
        return b(l.D(), nVar, this.f52557c);
    }

    public String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f52555a + ", optInclusiveEnd=" + this.f52556b + ", snap=" + this.f52557c + '}';
    }
}
