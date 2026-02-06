package p0;

import J0.C1231a0;
import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import J0.G;
import a0.C1538b;
import androidx.compose.ui.focus.FocusTargetNode;
import k0.i;

public abstract class c {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25099a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                p0.m[] r0 = p0.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p0.m r1 = p0.m.Active     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p0.m r1 = p0.m.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                p0.m r1 = p0.m.Captured     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                p0.m r1 = p0.m.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f25099a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p0.c.a.<clinit>():void");
        }
    }

    public static final l a(b bVar) {
        int a10 = C1239e0.a(1024);
        i.c v02 = bVar.v0();
        C1538b bVar2 = null;
        while (v02 != null) {
            if (v02 instanceof FocusTargetNode) {
                m s22 = ((FocusTargetNode) v02).s2();
                int i10 = a.f25099a[s22.ordinal()];
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return s22;
                }
            } else if ((v02.N1() & a10) != 0 && (v02 instanceof C1247m)) {
                int i11 = 0;
                for (i.c m22 = ((C1247m) v02).m2(); m22 != null; m22 = m22.J1()) {
                    if ((m22.N1() & a10) != 0) {
                        i11++;
                        if (i11 == 1) {
                            v02 = m22;
                        } else {
                            if (bVar2 == null) {
                                bVar2 = new C1538b(new i.c[16], 0);
                            }
                            if (v02 != null) {
                                bVar2.b(v02);
                                v02 = null;
                            }
                            bVar2.b(m22);
                        }
                    }
                }
                if (i11 == 1) {
                }
            }
            v02 = C1245k.g(bVar2);
        }
        if (bVar.v0().S1()) {
            C1538b bVar3 = new C1538b(new i.c[16], 0);
            i.c J12 = bVar.v0().J1();
            if (J12 == null) {
                C1245k.c(bVar3, bVar.v0());
            } else {
                bVar3.b(J12);
            }
            while (bVar3.t()) {
                i.c cVar = (i.c) bVar3.y(bVar3.q() - 1);
                if ((cVar.I1() & a10) == 0) {
                    C1245k.c(bVar3, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            continue;
                            break;
                        } else if ((cVar.N1() & a10) != 0) {
                            C1538b bVar4 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    m s23 = ((FocusTargetNode) cVar).s2();
                                    int i12 = a.f25099a[s23.ordinal()];
                                    if (i12 == 1 || i12 == 2 || i12 == 3) {
                                        return s23;
                                    }
                                } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                    int i13 = 0;
                                    for (i.c m23 = ((C1247m) cVar).m2(); m23 != null; m23 = m23.J1()) {
                                        if ((m23.N1() & a10) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                cVar = m23;
                                            } else {
                                                if (bVar4 == null) {
                                                    bVar4 = new C1538b(new i.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar4.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar4.b(m23);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                cVar = C1245k.g(bVar4);
                            }
                            continue;
                        } else {
                            cVar = cVar.J1();
                        }
                    }
                }
            }
            return m.Inactive;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    public static final void b(b bVar) {
        C1245k.n(bVar).getFocusOwner().g(bVar);
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        C1231a0 j02;
        int a10 = C1239e0.a(4096);
        int a11 = C1239e0.a(1024);
        i.c v02 = focusTargetNode.v0();
        int i10 = a10 | a11;
        if (focusTargetNode.v0().S1()) {
            i.c v03 = focusTargetNode.v0();
            G m10 = C1245k.m(focusTargetNode);
            while (m10 != null) {
                if ((m10.j0().k().I1() & i10) != 0) {
                    while (v03 != null) {
                        if ((v03.N1() & i10) != 0) {
                            if (v03 != v02 && (v03.N1() & a11) != 0) {
                                return;
                            }
                            if ((v03.N1() & a10) != 0) {
                                i.c cVar = v03;
                                C1538b bVar = null;
                                while (cVar != null) {
                                    if (cVar instanceof b) {
                                        b bVar2 = (b) cVar;
                                        bVar2.m0(a(bVar2));
                                    } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                        int i11 = 0;
                                        for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                            if ((m22.N1() & a10) != 0) {
                                                i11++;
                                                if (i11 == 1) {
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
                                        if (i11 == 1) {
                                        }
                                    }
                                    cVar = C1245k.g(bVar);
                                }
                            }
                        }
                        v03 = v03.P1();
                    }
                }
                m10 = m10.n0();
                if (m10 == null || (j02 = m10.j0()) == null) {
                    v03 = null;
                } else {
                    v03 = j02.o();
                }
            }
            return;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }
}
