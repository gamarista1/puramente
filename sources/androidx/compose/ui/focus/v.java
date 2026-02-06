package androidx.compose.ui.focus;

import H0.C1184e;
import J0.C1231a0;
import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import J0.G;
import a0.C1538b;
import androidx.compose.ui.focus.d;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6535s;
import p0.m;
import yf.C6798l;

public abstract class v {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13359a;

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
                p0.m r1 = p0.m.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p0.m r1 = p0.m.Active     // Catch:{ NoSuchFieldError -> 0x0019 }
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
                f13359a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.v.a.<clinit>():void");
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f13360a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f13361b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f13362c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f13363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, C6798l lVar) {
            super(1);
            this.f13360a = focusTargetNode;
            this.f13361b = focusTargetNode2;
            this.f13362c = i10;
            this.f13363d = lVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C1184e.a aVar) {
            boolean a10 = v.i(this.f13360a, this.f13361b, this.f13362c, this.f13363d);
            Boolean valueOf = Boolean.valueOf(a10);
            if (a10 || !aVar.a()) {
                return valueOf;
            }
            return null;
        }
    }

    private static final boolean b(FocusTargetNode focusTargetNode, C6798l lVar) {
        boolean z10;
        m s22 = focusTargetNode.s2();
        int[] iArr = a.f13359a;
        int i10 = iArr[s22.ordinal()];
        if (i10 == 1) {
            FocusTargetNode f10 = t.f(focusTargetNode);
            if (f10 != null) {
                int i11 = iArr[f10.s2().ordinal()];
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        return d(focusTargetNode, f10, d.f13315b.f(), lVar);
                    }
                    if (i11 != 4) {
                        throw new C6535s();
                    }
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                } else if (!b(f10, lVar) && !d(focusTargetNode, f10, d.f13315b.f(), lVar) && (!f10.q2().j() || !((Boolean) lVar.invoke(f10)).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        } else if (i10 == 2 || i10 == 3) {
            return g(focusTargetNode, lVar);
        } else {
            if (i10 != 4) {
                throw new C6535s();
            } else if (!g(focusTargetNode, lVar)) {
                if (focusTargetNode.q2().j()) {
                    z10 = ((Boolean) lVar.invoke(focusTargetNode)).booleanValue();
                } else {
                    z10 = false;
                }
                if (!z10) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final boolean c(FocusTargetNode focusTargetNode, C6798l lVar) {
        int i10 = a.f13359a[focusTargetNode.s2().ordinal()];
        if (i10 == 1) {
            FocusTargetNode f10 = t.f(focusTargetNode);
            if (f10 == null) {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            } else if (c(f10, lVar) || d(focusTargetNode, f10, d.f13315b.e(), lVar)) {
                return true;
            } else {
                return false;
            }
        } else if (i10 == 2 || i10 == 3) {
            return h(focusTargetNode, lVar);
        } else {
            if (i10 != 4) {
                throw new C6535s();
            } else if (focusTargetNode.q2().j()) {
                return ((Boolean) lVar.invoke(focusTargetNode)).booleanValue();
            } else {
                return h(focusTargetNode, lVar);
            }
        }
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, C6798l lVar) {
        if (i(focusTargetNode, focusTargetNode2, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) a.a(focusTargetNode, i10, new b(focusTargetNode, focusTargetNode2, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode) {
        i.c cVar;
        C1231a0 j02;
        int a10 = C1239e0.a(1024);
        if (focusTargetNode.v0().S1()) {
            i.c P12 = focusTargetNode.v0().P1();
            G m10 = C1245k.m(focusTargetNode);
            loop0:
            while (true) {
                cVar = null;
                if (m10 == null) {
                    break;
                }
                if ((m10.j0().k().I1() & a10) != 0) {
                    while (P12 != null) {
                        if ((P12.N1() & a10) != 0) {
                            i.c cVar2 = P12;
                            C1538b bVar = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof FocusTargetNode) {
                                    cVar = cVar2;
                                    break loop0;
                                }
                                if ((cVar2.N1() & a10) != 0 && (cVar2 instanceof C1247m)) {
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
            if (cVar == null) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public static final boolean f(FocusTargetNode focusTargetNode, int i10, C6798l lVar) {
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.e())) {
            return c(focusTargetNode, lVar);
        }
        if (d.l(i10, aVar.f())) {
            return b(focusTargetNode, lVar);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search");
    }

    private static final boolean g(FocusTargetNode focusTargetNode, C6798l lVar) {
        C1538b bVar = new C1538b(new FocusTargetNode[16], 0);
        int a10 = C1239e0.a(1024);
        if (focusTargetNode.v0().S1()) {
            C1538b bVar2 = new C1538b(new i.c[16], 0);
            i.c J12 = focusTargetNode.v0().J1();
            if (J12 == null) {
                C1245k.c(bVar2, focusTargetNode.v0());
            } else {
                bVar2.b(J12);
            }
            while (bVar2.t()) {
                i.c cVar = (i.c) bVar2.y(bVar2.q() - 1);
                if ((cVar.I1() & a10) == 0) {
                    C1245k.c(bVar2, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.N1() & a10) != 0) {
                            C1538b bVar3 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    bVar.b((FocusTargetNode) cVar);
                                } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                    int i10 = 0;
                                    for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                        if ((m22.N1() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar = m22;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new C1538b(new i.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar3.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar3.b(m22);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVar = C1245k.g(bVar3);
                            }
                        } else {
                            cVar = cVar.J1();
                        }
                    }
                }
            }
            bVar.D(u.f13358a);
            int q10 = bVar.q();
            if (q10 > 0) {
                int i11 = q10 - 1;
                Object[] p10 = bVar.p();
                do {
                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) p10[i11];
                    if (t.g(focusTargetNode2) && b(focusTargetNode2, lVar)) {
                        return true;
                    }
                    i11--;
                } while (i11 >= 0);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static final boolean h(FocusTargetNode focusTargetNode, C6798l lVar) {
        C1538b bVar = new C1538b(new FocusTargetNode[16], 0);
        int a10 = C1239e0.a(1024);
        if (focusTargetNode.v0().S1()) {
            C1538b bVar2 = new C1538b(new i.c[16], 0);
            i.c J12 = focusTargetNode.v0().J1();
            if (J12 == null) {
                C1245k.c(bVar2, focusTargetNode.v0());
            } else {
                bVar2.b(J12);
            }
            while (bVar2.t()) {
                i.c cVar = (i.c) bVar2.y(bVar2.q() - 1);
                if ((cVar.I1() & a10) == 0) {
                    C1245k.c(bVar2, cVar);
                } else {
                    while (true) {
                        if (cVar == null) {
                            break;
                        } else if ((cVar.N1() & a10) != 0) {
                            C1538b bVar3 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    bVar.b((FocusTargetNode) cVar);
                                } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                    int i10 = 0;
                                    for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                        if ((m22.N1() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                cVar = m22;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new C1538b(new i.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar3.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar3.b(m22);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                cVar = C1245k.g(bVar3);
                            }
                        } else {
                            cVar = cVar.J1();
                        }
                    }
                }
            }
            bVar.D(u.f13358a);
            int q10 = bVar.q();
            if (q10 <= 0) {
                return false;
            }
            Object[] p10 = bVar.p();
            int i11 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) p10[i11];
                if (t.g(focusTargetNode2) && c(focusTargetNode2, lVar)) {
                    return true;
                }
                i11++;
            } while (i11 < q10);
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    /* access modifiers changed from: private */
    public static final boolean i(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, C6798l lVar) {
        if (focusTargetNode.s2() == m.ActiveParent) {
            C1538b bVar = new C1538b(new FocusTargetNode[16], 0);
            int a10 = C1239e0.a(1024);
            if (focusTargetNode.v0().S1()) {
                C1538b bVar2 = new C1538b(new i.c[16], 0);
                i.c J12 = focusTargetNode.v0().J1();
                if (J12 == null) {
                    C1245k.c(bVar2, focusTargetNode.v0());
                } else {
                    bVar2.b(J12);
                }
                while (bVar2.t()) {
                    i.c cVar = (i.c) bVar2.y(bVar2.q() - 1);
                    if ((cVar.I1() & a10) == 0) {
                        C1245k.c(bVar2, cVar);
                    } else {
                        while (true) {
                            if (cVar == null) {
                                break;
                            } else if ((cVar.N1() & a10) != 0) {
                                C1538b bVar3 = null;
                                while (cVar != null) {
                                    if (cVar instanceof FocusTargetNode) {
                                        bVar.b((FocusTargetNode) cVar);
                                    } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                        int i11 = 0;
                                        for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                            if ((m22.N1() & a10) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    cVar = m22;
                                                } else {
                                                    if (bVar3 == null) {
                                                        bVar3 = new C1538b(new i.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        bVar3.b(cVar);
                                                        cVar = null;
                                                    }
                                                    bVar3.b(m22);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    cVar = C1245k.g(bVar3);
                                }
                            } else {
                                cVar = cVar.J1();
                            }
                        }
                    }
                }
                bVar.D(u.f13358a);
                d.a aVar = d.f13315b;
                if (d.l(i10, aVar.e())) {
                    Ef.i iVar = new Ef.i(0, bVar.q() - 1);
                    int k10 = iVar.k();
                    int n10 = iVar.n();
                    if (k10 <= n10) {
                        boolean z10 = false;
                        while (true) {
                            if (z10) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) bVar.p()[k10];
                                if (t.g(focusTargetNode3) && c(focusTargetNode3, lVar)) {
                                    return true;
                                }
                            }
                            if (C6496s.c(bVar.p()[k10], focusTargetNode2)) {
                                z10 = true;
                            }
                            if (k10 == n10) {
                                break;
                            }
                            k10++;
                        }
                    }
                } else if (d.l(i10, aVar.f())) {
                    Ef.i iVar2 = new Ef.i(0, bVar.q() - 1);
                    int k11 = iVar2.k();
                    int n11 = iVar2.n();
                    if (k11 <= n11) {
                        boolean z11 = false;
                        while (true) {
                            if (z11) {
                                FocusTargetNode focusTargetNode4 = (FocusTargetNode) bVar.p()[n11];
                                if (t.g(focusTargetNode4) && b(focusTargetNode4, lVar)) {
                                    return true;
                                }
                            }
                            if (C6496s.c(bVar.p()[n11], focusTargetNode2)) {
                                z11 = true;
                            }
                            if (n11 == k11) {
                                break;
                            }
                            n11--;
                        }
                    }
                } else {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                if (d.l(i10, d.f13315b.e()) || !focusTargetNode.q2().j() || e(focusTargetNode)) {
                    return false;
                }
                return ((Boolean) lVar.invoke(focusTargetNode)).booleanValue();
            }
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.");
    }
}
