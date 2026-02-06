package androidx.compose.ui.focus;

import H0.C1184e;
import J0.C1239e0;
import J0.C1244j;
import J0.C1245k;
import J0.C1247m;
import a0.C1538b;
import androidx.compose.ui.focus.d;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6535s;
import p0.m;
import q0.C2423i;
import yf.C6798l;

public abstract class w {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13364a;

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
                f13364a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.w.a.<clinit>():void");
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f13365a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2423i f13366b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f13367c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6798l f13368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode, C2423i iVar, int i10, C6798l lVar) {
            super(1);
            this.f13365a = focusTargetNode;
            this.f13366b = iVar;
            this.f13367c = i10;
            this.f13368d = lVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C1184e.a aVar) {
            boolean a10 = w.r(this.f13365a, this.f13366b, this.f13367c, this.f13368d);
            Boolean valueOf = Boolean.valueOf(a10);
            if (a10 || !aVar.a()) {
                return valueOf;
            }
            return null;
        }
    }

    private static final FocusTargetNode b(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.s2() == m.ActiveParent) {
            FocusTargetNode b10 = t.b(focusTargetNode);
            if (b10 != null) {
                return b10;
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        throw new IllegalStateException("Searching for active node in inactive hierarchy");
    }

    private static final boolean c(C2423i iVar, C2423i iVar2, C2423i iVar3, int i10) {
        if (d(iVar3, i10, iVar) || !d(iVar2, i10, iVar)) {
            return false;
        }
        if (e(iVar3, i10, iVar)) {
            d.a aVar = d.f13315b;
            if (!d.l(i10, aVar.d()) && !d.l(i10, aVar.g()) && f(iVar2, i10, iVar) >= g(iVar3, i10, iVar)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean d(C2423i iVar, int i10, C2423i iVar2) {
        boolean z10;
        boolean z11;
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.d())) {
            z10 = true;
        } else {
            z10 = d.l(i10, aVar.g());
        }
        if (!z10) {
            if (d.l(i10, aVar.h())) {
                z11 = true;
            } else {
                z11 = d.l(i10, aVar.a());
            }
            if (!z11) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            } else if (iVar.j() > iVar2.i() && iVar.i() < iVar2.j()) {
                return true;
            }
        } else if (iVar.e() > iVar2.l() && iVar.l() < iVar2.e()) {
            return true;
        }
        return false;
    }

    private static final boolean e(C2423i iVar, int i10, C2423i iVar2) {
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.d())) {
            if (iVar2.i() < iVar.j()) {
                return false;
            }
        } else if (d.l(i10, aVar.g())) {
            if (iVar2.j() > iVar.i()) {
                return false;
            }
        } else if (d.l(i10, aVar.h())) {
            if (iVar2.l() < iVar.e()) {
                return false;
            }
        } else if (!d.l(i10, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        } else if (iVar2.e() > iVar.l()) {
            return false;
        }
        return true;
    }

    private static final float f(C2423i iVar, int i10, C2423i iVar2) {
        float f10;
        float l10;
        float e10;
        float l11;
        float e11;
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.d())) {
            l11 = iVar2.i();
            e11 = iVar.j();
        } else {
            if (d.l(i10, aVar.g())) {
                l10 = iVar.i();
                e10 = iVar2.j();
            } else if (d.l(i10, aVar.h())) {
                l11 = iVar2.l();
                e11 = iVar.e();
            } else if (d.l(i10, aVar.a())) {
                l10 = iVar.l();
                e10 = iVar2.e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = l10 - e10;
            return Math.max(0.0f, f10);
        }
        f10 = l11 - e11;
        return Math.max(0.0f, f10);
    }

    private static final float g(C2423i iVar, int i10, C2423i iVar2) {
        float f10;
        float e10;
        float e11;
        float l10;
        float l11;
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.d())) {
            l10 = iVar2.i();
            l11 = iVar.i();
        } else {
            if (d.l(i10, aVar.g())) {
                e10 = iVar.j();
                e11 = iVar2.j();
            } else if (d.l(i10, aVar.h())) {
                l10 = iVar2.l();
                l11 = iVar.l();
            } else if (d.l(i10, aVar.a())) {
                e10 = iVar.e();
                e11 = iVar2.e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = e10 - e11;
            return Math.max(1.0f, f10);
        }
        f10 = l10 - l11;
        return Math.max(1.0f, f10);
    }

    private static final C2423i h(C2423i iVar) {
        return new C2423i(iVar.j(), iVar.e(), iVar.j(), iVar.e());
    }

    private static final void i(C1244j jVar, C1538b bVar) {
        int a10 = C1239e0.a(1024);
        if (jVar.v0().S1()) {
            C1538b bVar2 = new C1538b(new i.c[16], 0);
            i.c J12 = jVar.v0().J1();
            if (J12 == null) {
                C1245k.c(bVar2, jVar.v0());
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
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) cVar;
                                    if (focusTargetNode.S1() && !C1245k.m(focusTargetNode).K0()) {
                                        if (focusTargetNode.q2().j()) {
                                            bVar.b(focusTargetNode);
                                        } else {
                                            i(focusTargetNode, bVar);
                                        }
                                    }
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
            return;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static final FocusTargetNode j(C1538b bVar, C2423i iVar, int i10) {
        C2423i iVar2;
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.d())) {
            iVar2 = iVar.s(iVar.n() + ((float) 1), 0.0f);
        } else if (d.l(i10, aVar.g())) {
            iVar2 = iVar.s(-(iVar.n() + ((float) 1)), 0.0f);
        } else if (d.l(i10, aVar.h())) {
            iVar2 = iVar.s(0.0f, iVar.h() + ((float) 1));
        } else if (d.l(i10, aVar.a())) {
            iVar2 = iVar.s(0.0f, -(iVar.h() + ((float) 1)));
        } else {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        int q10 = bVar.q();
        FocusTargetNode focusTargetNode = null;
        if (q10 > 0) {
            Object[] p10 = bVar.p();
            int i11 = 0;
            do {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) p10[i11];
                if (t.g(focusTargetNode2)) {
                    C2423i d10 = t.d(focusTargetNode2);
                    if (m(d10, iVar2, iVar, i10)) {
                        focusTargetNode = focusTargetNode2;
                        iVar2 = d10;
                    }
                }
                i11++;
            } while (i11 < q10);
        }
        return focusTargetNode;
    }

    public static final boolean k(FocusTargetNode focusTargetNode, int i10, C6798l lVar) {
        boolean z10;
        C2423i iVar;
        Object obj;
        C1538b bVar = new C1538b(new FocusTargetNode[16], 0);
        i(focusTargetNode, bVar);
        boolean z11 = true;
        if (bVar.q() <= 1) {
            if (bVar.s()) {
                obj = null;
            } else {
                obj = bVar.p()[0];
            }
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) obj;
            if (focusTargetNode2 != null) {
                return ((Boolean) lVar.invoke(focusTargetNode2)).booleanValue();
            }
            return false;
        }
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.b())) {
            i10 = aVar.g();
        }
        if (d.l(i10, aVar.g())) {
            z10 = true;
        } else {
            z10 = d.l(i10, aVar.a());
        }
        if (z10) {
            iVar = s(t.d(focusTargetNode));
        } else {
            if (!d.l(i10, aVar.d())) {
                z11 = d.l(i10, aVar.h());
            }
            if (z11) {
                iVar = h(t.d(focusTargetNode));
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
        FocusTargetNode j10 = j(bVar, iVar, i10);
        if (j10 != null) {
            return ((Boolean) lVar.invoke(j10)).booleanValue();
        }
        return false;
    }

    private static final boolean l(FocusTargetNode focusTargetNode, C2423i iVar, int i10, C6798l lVar) {
        if (r(focusTargetNode, iVar, i10, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) a.a(focusTargetNode, i10, new b(focusTargetNode, iVar, i10, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean m(C2423i iVar, C2423i iVar2, C2423i iVar3, int i10) {
        if (!n(iVar, i10, iVar3)) {
            return false;
        }
        if (n(iVar2, i10, iVar3) && !c(iVar3, iVar, iVar2, i10) && (c(iVar3, iVar2, iVar, i10) || q(i10, iVar3, iVar) >= q(i10, iVar3, iVar2))) {
            return false;
        }
        return true;
    }

    private static final boolean n(C2423i iVar, int i10, C2423i iVar2) {
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.d())) {
            if ((iVar2.j() <= iVar.j() && iVar2.i() < iVar.j()) || iVar2.i() <= iVar.i()) {
                return false;
            }
        } else if (d.l(i10, aVar.g())) {
            if ((iVar2.i() >= iVar.i() && iVar2.j() > iVar.i()) || iVar2.j() >= iVar.j()) {
                return false;
            }
        } else if (d.l(i10, aVar.h())) {
            if ((iVar2.e() <= iVar.e() && iVar2.l() < iVar.e()) || iVar2.l() <= iVar.l()) {
                return false;
            }
        } else if (!d.l(i10, aVar.a())) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        } else if ((iVar2.l() >= iVar.l() && iVar2.e() > iVar.l()) || iVar2.e() >= iVar.e()) {
            return false;
        }
        return true;
    }

    private static final float o(C2423i iVar, int i10, C2423i iVar2) {
        float f10;
        float l10;
        float e10;
        float l11;
        float e11;
        d.a aVar = d.f13315b;
        if (d.l(i10, aVar.d())) {
            l11 = iVar2.i();
            e11 = iVar.j();
        } else {
            if (d.l(i10, aVar.g())) {
                l10 = iVar.i();
                e10 = iVar2.j();
            } else if (d.l(i10, aVar.h())) {
                l11 = iVar2.l();
                e11 = iVar.e();
            } else if (d.l(i10, aVar.a())) {
                l10 = iVar.l();
                e10 = iVar2.e();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = l10 - e10;
            return Math.max(0.0f, f10);
        }
        f10 = l11 - e11;
        return Math.max(0.0f, f10);
    }

    private static final float p(C2423i iVar, int i10, C2423i iVar2) {
        boolean z10;
        float f10;
        float i11;
        float i12;
        float n10;
        d.a aVar = d.f13315b;
        boolean z11 = true;
        if (d.l(i10, aVar.d())) {
            z10 = true;
        } else {
            z10 = d.l(i10, aVar.g());
        }
        if (z10) {
            f10 = (float) 2;
            i11 = iVar2.l() + (iVar2.h() / f10);
            i12 = iVar.l();
            n10 = iVar.h();
        } else {
            if (!d.l(i10, aVar.h())) {
                z11 = d.l(i10, aVar.a());
            }
            if (z11) {
                f10 = (float) 2;
                i11 = iVar2.i() + (iVar2.n() / f10);
                i12 = iVar.i();
                n10 = iVar.n();
            } else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
        return i11 - (i12 + (n10 / f10));
    }

    private static final long q(int i10, C2423i iVar, C2423i iVar2) {
        long abs = (long) Math.abs(o(iVar2, i10, iVar));
        long abs2 = (long) Math.abs(p(iVar2, i10, iVar));
        return (((long) 13) * abs * abs) + (abs2 * abs2);
    }

    /* access modifiers changed from: private */
    public static final boolean r(FocusTargetNode focusTargetNode, C2423i iVar, int i10, C6798l lVar) {
        FocusTargetNode j10;
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
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                    if (focusTargetNode2.S1()) {
                                        bVar.b(focusTargetNode2);
                                    }
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
            while (bVar.t() && (j10 = j(bVar, iVar, i10)) != null) {
                if (j10.q2().j()) {
                    return ((Boolean) lVar.invoke(j10)).booleanValue();
                }
                if (l(j10, iVar, i10, lVar)) {
                    return true;
                }
                bVar.w(j10);
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }

    private static final C2423i s(C2423i iVar) {
        return new C2423i(iVar.i(), iVar.l(), iVar.i(), iVar.l());
    }

    public static final Boolean t(FocusTargetNode focusTargetNode, int i10, C2423i iVar, C6798l lVar) {
        m s22 = focusTargetNode.s2();
        int[] iArr = a.f13364a;
        int i11 = iArr[s22.ordinal()];
        if (i11 == 1) {
            FocusTargetNode f10 = t.f(focusTargetNode);
            if (f10 != null) {
                int i12 = iArr[f10.s2().ordinal()];
                if (i12 == 1) {
                    Boolean t10 = t(f10, i10, iVar, lVar);
                    if (!C6496s.c(t10, Boolean.FALSE)) {
                        return t10;
                    }
                    if (iVar == null) {
                        iVar = t.d(b(f10));
                    }
                    return Boolean.valueOf(l(focusTargetNode, iVar, i10, lVar));
                } else if (i12 == 2 || i12 == 3) {
                    if (iVar == null) {
                        iVar = t.d(f10);
                    }
                    return Boolean.valueOf(l(focusTargetNode, iVar, i10, lVar));
                } else if (i12 != 4) {
                    throw new C6535s();
                } else {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
            } else {
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
        } else if (i11 == 2 || i11 == 3) {
            return Boolean.valueOf(k(focusTargetNode, i10, lVar));
        } else {
            if (i11 != 4) {
                throw new C6535s();
            } else if (focusTargetNode.q2().j()) {
                return (Boolean) lVar.invoke(focusTargetNode);
            } else {
                if (iVar == null) {
                    return Boolean.valueOf(k(focusTargetNode, i10, lVar));
                }
                return Boolean.valueOf(r(focusTargetNode, iVar, i10, lVar));
            }
        }
    }
}
