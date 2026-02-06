package androidx.compose.ui.focus;

import H0.C1198t;
import J0.C1231a0;
import J0.C1235c0;
import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import J0.G;
import a0.C1538b;
import androidx.compose.ui.focus.d;
import k0.i;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import q0.C2423i;
import yf.C6798l;

public abstract class t {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13356a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f13357b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        static {
            /*
                c1.t[] r0 = c1.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                c1.t r2 = c1.t.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                c1.t r3 = c1.t.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f13356a = r0
                p0.m[] r0 = p0.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p0.m r3 = p0.m.Active     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                p0.m r1 = p0.m.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                p0.m r1 = p0.m.Captured     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                p0.m r1 = p0.m.Inactive     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                f13357b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.t.a.<clinit>():void");
        }
    }

    public static final o a(FocusTargetNode focusTargetNode, int i10, c1.t tVar) {
        o oVar;
        o oVar2;
        k q22 = focusTargetNode.q2();
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.e())) {
            return q22.l();
        }
        if (d.l(i10, aVar.f())) {
            return q22.k();
        }
        if (d.l(i10, aVar.h())) {
            return q22.c();
        }
        if (d.l(i10, aVar.a())) {
            return q22.g();
        }
        if (d.l(i10, aVar.d())) {
            int i11 = a.f13356a[tVar.ordinal()];
            if (i11 == 1) {
                oVar2 = q22.a();
            } else if (i11 == 2) {
                oVar2 = q22.e();
            } else {
                throw new C6535s();
            }
            if (oVar2 == o.f13345b.b()) {
                oVar2 = null;
            }
            if (oVar2 == null) {
                return q22.b();
            }
        } else if (d.l(i10, aVar.g())) {
            int i12 = a.f13356a[tVar.ordinal()];
            if (i12 == 1) {
                oVar = q22.e();
            } else if (i12 == 2) {
                oVar = q22.a();
            } else {
                throw new C6535s();
            }
            if (oVar == o.f13345b.b()) {
                oVar = null;
            }
            if (oVar2 == null) {
                return q22.o();
            }
        } else if (d.l(i10, aVar.b())) {
            return (o) q22.i().invoke(d.i(i10));
        } else {
            if (d.l(i10, aVar.c())) {
                return (o) q22.d().invoke(d.i(i10));
            }
            throw new IllegalStateException("invalid FocusDirection");
        }
        return oVar2;
    }

    public static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        int i10 = a.f13357b[focusTargetNode.s2().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                int a10 = C1239e0.a(1024);
                if (focusTargetNode.v0().S1()) {
                    C1538b bVar = new C1538b(new i.c[16], 0);
                    i.c J12 = focusTargetNode.v0().J1();
                    if (J12 == null) {
                        C1245k.c(bVar, focusTargetNode.v0());
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
                                    continue;
                                    break;
                                } else if ((cVar.N1() & a10) != 0) {
                                    C1538b bVar2 = null;
                                    while (cVar != null) {
                                        if (cVar instanceof FocusTargetNode) {
                                            FocusTargetNode b10 = b((FocusTargetNode) cVar);
                                            if (b10 != null) {
                                                return b10;
                                            }
                                        } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                            int i11 = 0;
                                            for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                                if ((m22.N1() & a10) != 0) {
                                                    i11++;
                                                    if (i11 == 1) {
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
                                            if (i11 == 1) {
                                            }
                                        }
                                        cVar = C1245k.g(bVar2);
                                    }
                                    continue;
                                } else {
                                    cVar = cVar.J1();
                                }
                            }
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("visitChildren called on an unattached node");
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return null;
                }
                throw new C6535s();
            }
        }
        return focusTargetNode;
    }

    private static final FocusTargetNode c(FocusTargetNode focusTargetNode) {
        C1231a0 j02;
        int a10 = C1239e0.a(1024);
        if (focusTargetNode.v0().S1()) {
            i.c P12 = focusTargetNode.v0().P1();
            G m10 = C1245k.m(focusTargetNode);
            while (m10 != null) {
                if ((m10.j0().k().I1() & a10) != 0) {
                    while (P12 != null) {
                        if ((P12.N1() & a10) != 0) {
                            i.c cVar = P12;
                            C1538b bVar = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                    if (focusTargetNode2.q2().j()) {
                                        return focusTargetNode2;
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

    public static final C2423i d(FocusTargetNode focusTargetNode) {
        C2423i b02;
        C1235c0 K12 = focusTargetNode.K1();
        if (K12 == null || (b02 = C1198t.d(K12).b0(K12, false)) == null) {
            return C2423i.f25325e.a();
        }
        return b02;
    }

    public static final Boolean e(FocusTargetNode focusTargetNode, int i10, c1.t tVar, C2423i iVar, C6798l lVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.e())) {
            z10 = true;
        } else {
            z10 = d.l(i10, aVar.f());
        }
        if (z10) {
            return Boolean.valueOf(v.f(focusTargetNode, i10, lVar));
        }
        if (d.l(i10, aVar.d())) {
            z11 = true;
        } else {
            z11 = d.l(i10, aVar.g());
        }
        if (z11) {
            z12 = true;
        } else {
            z12 = d.l(i10, aVar.h());
        }
        if (z12) {
            z13 = true;
        } else {
            z13 = d.l(i10, aVar.a());
        }
        if (z13) {
            return w.t(focusTargetNode, i10, iVar, lVar);
        }
        FocusTargetNode focusTargetNode2 = null;
        if (d.l(i10, aVar.b())) {
            int i12 = a.f13356a[tVar.ordinal()];
            if (i12 == 1) {
                i11 = aVar.g();
            } else if (i12 == 2) {
                i11 = aVar.d();
            } else {
                throw new C6535s();
            }
            FocusTargetNode b10 = b(focusTargetNode);
            if (b10 != null) {
                return w.t(b10, i11, iVar, lVar);
            }
            return null;
        } else if (d.l(i10, aVar.c())) {
            FocusTargetNode b11 = b(focusTargetNode);
            if (b11 != null) {
                focusTargetNode2 = c(b11);
            }
            if (focusTargetNode2 == null || C6496s.c(focusTargetNode2, focusTargetNode)) {
                z14 = false;
            } else {
                z14 = ((Boolean) lVar.invoke(focusTargetNode2)).booleanValue();
            }
            return Boolean.valueOf(z14);
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + d.n(i10)).toString());
        }
    }

    public static final FocusTargetNode f(FocusTargetNode focusTargetNode) {
        if (!focusTargetNode.v0().S1()) {
            return null;
        }
        int a10 = C1239e0.a(1024);
        if (focusTargetNode.v0().S1()) {
            C1538b bVar = new C1538b(new i.c[16], 0);
            i.c J12 = focusTargetNode.v0().J1();
            if (J12 == null) {
                C1245k.c(bVar, focusTargetNode.v0());
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
                            continue;
                            break;
                        } else if ((cVar.N1() & a10) != 0) {
                            C1538b bVar2 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                    if (focusTargetNode2.v0().S1()) {
                                        int i10 = a.f13357b[focusTargetNode2.s2().ordinal()];
                                        if (i10 == 1 || i10 == 2 || i10 == 3) {
                                            return focusTargetNode2;
                                        }
                                    }
                                } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                    int i11 = 0;
                                    for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                        if ((m22.N1() & a10) != 0) {
                                            i11++;
                                            if (i11 == 1) {
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
                                    if (i11 == 1) {
                                    }
                                }
                                cVar = C1245k.g(bVar2);
                            }
                            continue;
                        } else {
                            cVar = cVar.J1();
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    public static final boolean g(FocusTargetNode focusTargetNode) {
        G A12;
        C1235c0 K12;
        G A13;
        C1235c0 K13 = focusTargetNode.K1();
        if (K13 == null || (A12 = K13.A1()) == null || !A12.e() || (K12 = focusTargetNode.K1()) == null || (A13 = K12.A1()) == null || !A13.J0()) {
            return false;
        }
        return true;
    }
}
