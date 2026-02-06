package J0;

import G0.a;
import a0.C1538b;
import k0.b;
import k0.i;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public abstract class C0 {
    public static final B0 a(C1244j jVar, Object obj) {
        C1231a0 j02;
        int a10 = C1239e0.a(262144);
        if (jVar.v0().S1()) {
            i.c P12 = jVar.v0().P1();
            G m10 = C1245k.m(jVar);
            while (m10 != null) {
                if ((m10.j0().k().I1() & a10) != 0) {
                    while (P12 != null) {
                        if ((P12.N1() & a10) != 0) {
                            i.c cVar = P12;
                            C1538b bVar = null;
                            while (cVar != null) {
                                if (cVar instanceof B0) {
                                    B0 b02 = (B0) cVar;
                                    if (C6496s.c(obj, b02.L())) {
                                        return b02;
                                    }
                                } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                    int i10 = 0;
                                    for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                        if ((m22.N1() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar = m22;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new C1538b(new i.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar.b(m22);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVar = C1245k.g(bVar);
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
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public static final B0 b(B0 b02) {
        C1231a0 j02;
        int a10 = C1239e0.a(262144);
        if (b02.v0().S1()) {
            i.c P12 = b02.v0().P1();
            G m10 = C1245k.m(b02);
            while (m10 != null) {
                if ((m10.j0().k().I1() & a10) != 0) {
                    while (P12 != null) {
                        if ((P12.N1() & a10) != 0) {
                            i.c cVar = P12;
                            C1538b bVar = null;
                            while (cVar != null) {
                                if (cVar instanceof B0) {
                                    B0 b03 = (B0) cVar;
                                    if (C6496s.c(b02.L(), b03.L()) && b.a(b02, b03)) {
                                        return b03;
                                    }
                                } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                    int i10 = 0;
                                    for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                        if ((m22.N1() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar = m22;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new C1538b(new i.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar.b(m22);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVar = C1245k.g(bVar);
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
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public static final void c(C1244j jVar, Object obj, C6798l lVar) {
        C1231a0 j02;
        boolean z10;
        boolean z11;
        int a10 = C1239e0.a(262144);
        if (jVar.v0().S1()) {
            i.c P12 = jVar.v0().P1();
            G m10 = C1245k.m(jVar);
            while (m10 != null) {
                if ((m10.j0().k().I1() & a10) != 0) {
                    while (P12 != null) {
                        if ((P12.N1() & a10) != 0) {
                            i.c cVar = P12;
                            C1538b bVar = null;
                            while (cVar != null) {
                                boolean z12 = true;
                                if (cVar instanceof B0) {
                                    B0 b02 = (B0) cVar;
                                    if (C6496s.c(obj, b02.L())) {
                                        z12 = ((Boolean) lVar.invoke(b02)).booleanValue();
                                    }
                                    if (!z12) {
                                        return;
                                    }
                                } else {
                                    if ((cVar.N1() & a10) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10 && (cVar instanceof C1247m)) {
                                        int i10 = 0;
                                        for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                            if ((m22.N1() & a10) != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                i10++;
                                                if (i10 == 1) {
                                                    cVar = m22;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new C1538b(new i.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        bVar.b(cVar);
                                                        cVar = null;
                                                    }
                                                    bVar.b(m22);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                }
                                cVar = C1245k.g(bVar);
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public static final void d(B0 b02, C6798l lVar) {
        C1231a0 j02;
        boolean z10;
        boolean z11;
        int a10 = C1239e0.a(262144);
        if (b02.v0().S1()) {
            i.c P12 = b02.v0().P1();
            G m10 = C1245k.m(b02);
            while (m10 != null) {
                if ((m10.j0().k().I1() & a10) != 0) {
                    while (P12 != null) {
                        if ((P12.N1() & a10) != 0) {
                            i.c cVar = P12;
                            C1538b bVar = null;
                            while (cVar != null) {
                                boolean z12 = true;
                                if (cVar instanceof B0) {
                                    B0 b03 = (B0) cVar;
                                    if (C6496s.c(b02.L(), b03.L()) && b.a(b02, b03)) {
                                        z12 = ((Boolean) lVar.invoke(b03)).booleanValue();
                                    }
                                    if (!z12) {
                                        return;
                                    }
                                } else {
                                    if ((cVar.N1() & a10) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10 && (cVar instanceof C1247m)) {
                                        int i10 = 0;
                                        for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                            if ((m22.N1() & a10) != 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                i10++;
                                                if (i10 == 1) {
                                                    cVar = m22;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new C1538b(new i.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        bVar.b(cVar);
                                                        cVar = null;
                                                    }
                                                    bVar.b(m22);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                }
                                cVar = C1245k.g(bVar);
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
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public static final void e(C1244j jVar, Object obj, C6798l lVar) {
        A0 a02;
        int a10 = C1239e0.a(262144);
        if (!jVar.v0().S1()) {
            a.b("visitSubtreeIf called on an unattached node");
        }
        C1538b bVar = new C1538b(new i.c[16], 0);
        i.c J12 = jVar.v0().J1();
        if (J12 == null) {
            C1245k.c(bVar, jVar.v0());
        } else {
            bVar.b(J12);
        }
        while (bVar.t()) {
            i.c cVar = (i.c) bVar.y(bVar.q() - 1);
            if ((cVar.I1() & a10) != 0) {
                i.c cVar2 = cVar;
                while (true) {
                    if (cVar2 == null) {
                        break;
                    }
                    if ((cVar2.N1() & a10) != 0) {
                        i.c cVar3 = cVar2;
                        C1538b bVar2 = null;
                        while (cVar3 != null) {
                            if (cVar3 instanceof B0) {
                                B0 b02 = (B0) cVar3;
                                if (C6496s.c(obj, b02.L())) {
                                    a02 = (A0) lVar.invoke(b02);
                                } else {
                                    a02 = A0.ContinueTraversal;
                                }
                                if (a02 != A0.CancelTraversal) {
                                    if (a02 == A0.SkipSubtreeAndContinueTraversal) {
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            } else if ((cVar3.N1() & a10) != 0 && (cVar3 instanceof C1247m)) {
                                int i10 = 0;
                                for (i.c m22 = ((C1247m) cVar3).m2(); m22 != null; m22 = m22.J1()) {
                                    if ((m22.N1() & a10) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar3 = m22;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new C1538b(new i.c[16], 0);
                                            }
                                            if (cVar3 != null) {
                                                bVar2.b(cVar3);
                                                cVar3 = null;
                                            }
                                            bVar2.b(m22);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVar3 = C1245k.g(bVar2);
                        }
                        continue;
                    }
                    cVar2 = cVar2.J1();
                }
            }
            C1245k.c(bVar, cVar);
        }
    }

    public static final void f(B0 b02, C6798l lVar) {
        A0 a02;
        int a10 = C1239e0.a(262144);
        if (!b02.v0().S1()) {
            a.b("visitSubtreeIf called on an unattached node");
        }
        C1538b bVar = new C1538b(new i.c[16], 0);
        i.c J12 = b02.v0().J1();
        if (J12 == null) {
            C1245k.c(bVar, b02.v0());
        } else {
            bVar.b(J12);
        }
        while (bVar.t()) {
            i.c cVar = (i.c) bVar.y(bVar.q() - 1);
            if ((cVar.I1() & a10) != 0) {
                i.c cVar2 = cVar;
                while (true) {
                    if (cVar2 == null) {
                        break;
                    }
                    if ((cVar2.N1() & a10) != 0) {
                        i.c cVar3 = cVar2;
                        C1538b bVar2 = null;
                        while (cVar3 != null) {
                            if (cVar3 instanceof B0) {
                                B0 b03 = (B0) cVar3;
                                if (!C6496s.c(b02.L(), b03.L()) || !b.a(b02, b03)) {
                                    a02 = A0.ContinueTraversal;
                                } else {
                                    a02 = (A0) lVar.invoke(b03);
                                }
                                if (a02 != A0.CancelTraversal) {
                                    if (a02 == A0.SkipSubtreeAndContinueTraversal) {
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            } else if ((cVar3.N1() & a10) != 0 && (cVar3 instanceof C1247m)) {
                                int i10 = 0;
                                for (i.c m22 = ((C1247m) cVar3).m2(); m22 != null; m22 = m22.J1()) {
                                    if ((m22.N1() & a10) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar3 = m22;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new C1538b(new i.c[16], 0);
                                            }
                                            if (cVar3 != null) {
                                                bVar2.b(cVar3);
                                                cVar3 = null;
                                            }
                                            bVar2.b(m22);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVar3 = C1245k.g(bVar2);
                        }
                        continue;
                    }
                    cVar2 = cVar2.J1();
                }
            }
            C1245k.c(bVar, cVar);
        }
    }
}
