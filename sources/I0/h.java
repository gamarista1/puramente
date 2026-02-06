package I0;

import G0.a;
import J0.C1231a0;
import J0.C1239e0;
import J0.C1244j;
import J0.C1245k;
import J0.C1247m;
import J0.G;
import a0.C1538b;
import k0.i;

public interface h extends k, C1244j {
    Object a(c cVar) {
        C1231a0 j02;
        if (!v0().S1()) {
            a.a("ModifierLocal accessed from an unattached node");
        }
        int a10 = C1239e0.a(32);
        if (v0().S1()) {
            i.c P12 = v0().P1();
            G m10 = C1245k.m(this);
            while (m10 != null) {
                if ((m10.j0().k().I1() & a10) != 0) {
                    while (P12 != null) {
                        if ((P12.N1() & a10) != 0) {
                            i.c cVar2 = P12;
                            C1538b bVar = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof h) {
                                    h hVar = (h) cVar2;
                                    if (hVar.q0().a(cVar)) {
                                        return hVar.q0().b(cVar);
                                    }
                                } else if ((cVar2.N1() & a10) != 0 && (cVar2 instanceof C1247m)) {
                                    int i10 = 0;
                                    for (i.c m22 = ((C1247m) cVar2).m2(); m22 != null; m22 = m22.J1()) {
                                        if ((m22.N1() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar2 = m22;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new C1538b(new i.c[16], 0);
                                                }
                                                if (cVar2 != null) {
                                                    bVar.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                bVar.b(m22);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVar2 = C1245k.g(bVar);
                            }
                            continue;
                        }
                        P12 = P12.P1();
                    }
                }
                m10 = m10.n0();
                if (m10 == null || (j02 = m10.j0()) == null) {
                    P12 = null;
                } else {
                    P12 = j02.o();
                }
            }
            return cVar.a().invoke();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    g q0() {
        return b.f2672a;
    }
}
