package J0;

import B0.e;
import G0.a;
import H0.C1203y;
import H0.Q;
import I0.d;
import I0.j;
import O0.l;
import a0.C1538b;
import androidx.collection.H;
import androidx.collection.O;
import androidx.compose.ui.focus.FocusTargetNode;
import k0.i;
import o0.C2344g;
import p0.b;
import p0.c;
import p0.h;
import p0.p;

public abstract class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final H f3852a = O.b();

    public static final void a(i.c cVar) {
        if (!cVar.S1()) {
            a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(i.c cVar, int i10, int i11) {
        if (cVar instanceof C1247m) {
            C1247m mVar = (C1247m) cVar;
            c(cVar, mVar.n2() & i10, i11);
            int i12 = (~mVar.n2()) & i10;
            for (i.c m22 = mVar.m2(); m22 != null; m22 = m22.J1()) {
                b(m22, i12, i11);
            }
            return;
        }
        c(cVar, i10 & cVar.N1(), i11);
    }

    private static final void c(i.c cVar, int i10, int i11) {
        if (i11 != 0 || cVar.Q1()) {
            if ((C1239e0.a(2) & i10) != 0 && (cVar instanceof B)) {
                E.b((B) cVar);
                if (i11 == 2) {
                    C1245k.h(cVar, C1239e0.a(2)).Y2();
                }
            }
            if (!((C1239e0.a(128) & i10) == 0 || !(cVar instanceof A) || i11 == 2)) {
                C1245k.m(cVar).E0();
            }
            if (!((C1239e0.a(256) & i10) == 0 || !(cVar instanceof C1253t) || i11 == 2)) {
                C1245k.m(cVar).F0();
            }
            if ((C1239e0.a(4) & i10) != 0 && (cVar instanceof r)) {
                C1252s.a((r) cVar);
            }
            if ((C1239e0.a(8) & i10) != 0 && (cVar instanceof w0)) {
                x0.b((w0) cVar);
            }
            if ((C1239e0.a(64) & i10) != 0 && (cVar instanceof p0)) {
                q0.a((p0) cVar);
            }
            if (!((C1239e0.a(1024) & i10) == 0 || !(cVar instanceof FocusTargetNode) || i11 == 2)) {
                p.c((FocusTargetNode) cVar);
            }
            if ((C1239e0.a(2048) & i10) != 0 && (cVar instanceof h)) {
                h hVar = (h) cVar;
                if (k(hVar)) {
                    if (i11 == 2) {
                        j(hVar);
                    } else {
                        p0.i.a(hVar);
                    }
                }
            }
            if ((i10 & C1239e0.a(4096)) != 0 && (cVar instanceof b)) {
                c.b((b) cVar);
            }
        }
    }

    public static final void d(i.c cVar) {
        if (!cVar.S1()) {
            a.b("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(i.c cVar) {
        if (!cVar.S1()) {
            a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(i.b bVar) {
        int a10 = C1239e0.a(1);
        if (bVar instanceof C1203y) {
            a10 |= C1239e0.a(2);
        }
        if (bVar instanceof C2344g) {
            a10 |= C1239e0.a(4);
        }
        if (bVar instanceof l) {
            a10 |= C1239e0.a(8);
        }
        if (bVar instanceof D0.H) {
            a10 |= C1239e0.a(16);
        }
        if ((bVar instanceof d) || (bVar instanceof j)) {
            a10 |= C1239e0.a(32);
        }
        if (bVar instanceof H0.O) {
            a10 |= C1239e0.a(256);
        }
        if (bVar instanceof Q) {
            return a10 | C1239e0.a(64);
        }
        return a10;
    }

    public static final int g(i.c cVar) {
        int i10;
        if (cVar.N1() != 0) {
            return cVar.N1();
        }
        H h10 = f3852a;
        Object b10 = k0.b.b(cVar);
        int a10 = h10.a(b10);
        if (a10 >= 0) {
            return h10.f12108c[a10];
        }
        int a11 = C1239e0.a(1);
        if (cVar instanceof B) {
            a11 |= C1239e0.a(2);
        }
        if (cVar instanceof r) {
            a11 |= C1239e0.a(4);
        }
        if (cVar instanceof w0) {
            a11 |= C1239e0.a(8);
        }
        if (cVar instanceof s0) {
            a11 |= C1239e0.a(16);
        }
        if (cVar instanceof I0.h) {
            a11 |= C1239e0.a(32);
        }
        if (cVar instanceof p0) {
            a11 |= C1239e0.a(64);
        }
        if (cVar instanceof A) {
            a11 |= C1239e0.a(128);
        }
        if (cVar instanceof C1253t) {
            a11 |= C1239e0.a(256);
        }
        if (cVar instanceof FocusTargetNode) {
            a11 |= C1239e0.a(1024);
        }
        if (cVar instanceof h) {
            a11 |= C1239e0.a(2048);
        }
        if (cVar instanceof b) {
            a11 |= C1239e0.a(4096);
        }
        if (cVar instanceof e) {
            a11 |= C1239e0.a(8192);
        }
        if (cVar instanceof F0.a) {
            a11 |= C1239e0.a(16384);
        }
        if (cVar instanceof C1242h) {
            a11 |= C1239e0.a(32768);
        }
        if (cVar instanceof B0) {
            i10 = C1239e0.a(262144) | a11;
        } else {
            i10 = a11;
        }
        h10.r(b10, i10);
        return i10;
    }

    public static final int h(i.c cVar) {
        if (!(cVar instanceof C1247m)) {
            return g(cVar);
        }
        C1247m mVar = (C1247m) cVar;
        int n22 = mVar.n2();
        for (i.c m22 = mVar.m2(); m22 != null; m22 = m22.J1()) {
            n22 |= h(m22);
        }
        return n22;
    }

    public static final boolean i(int i10) {
        if ((i10 & C1239e0.a(128)) != 0) {
            return true;
        }
        return false;
    }

    private static final void j(h hVar) {
        int a10 = C1239e0.a(1024);
        if (hVar.v0().S1()) {
            C1538b bVar = new C1538b(new i.c[16], 0);
            i.c J12 = hVar.v0().J1();
            if (J12 == null) {
                C1245k.c(bVar, hVar.v0());
            } else {
                bVar.b(J12);
            }
            while (bVar.t()) {
                i.c cVar = (i.c) bVar.y(bVar.q() - 1);
                if ((cVar.I1() & a10) == 0) {
                    C1245k.c(bVar, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.N1() & a10) != 0) {
                            C1538b bVar2 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    p.c((FocusTargetNode) cVar);
                                } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                    int i10 = 0;
                                    for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                        if ((m22.N1() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar = m22;
                                            } else {
                                                if (bVar2 == null) {
                                                    bVar2 = new C1538b(new i.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar2.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar2.b(m22);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVar = C1245k.g(bVar2);
                            }
                        } else {
                            cVar = cVar.J1();
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static final boolean k(h hVar) {
        C1238e eVar = C1238e.f3850a;
        eVar.p();
        hVar.b1(eVar);
        return eVar.n();
    }
}
