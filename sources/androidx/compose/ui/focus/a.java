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
import yf.C6798l;

public abstract class a {
    public static final Object a(FocusTargetNode focusTargetNode, int i10, C6798l lVar) {
        FocusTargetNode focusTargetNode2;
        C1184e r22;
        int i11;
        C1231a0 j02;
        int a10 = C1239e0.a(1024);
        if (focusTargetNode.v0().S1()) {
            i.c P12 = focusTargetNode.v0().P1();
            G m10 = C1245k.m(focusTargetNode);
            loop0:
            while (true) {
                if (m10 == null) {
                    focusTargetNode2 = null;
                    break;
                }
                if ((m10.j0().k().I1() & a10) != 0) {
                    while (P12 != null) {
                        if ((P12.N1() & a10) != 0) {
                            focusTargetNode2 = P12;
                            C1538b bVar = null;
                            while (focusTargetNode2 != null) {
                                if (focusTargetNode2 instanceof FocusTargetNode) {
                                    break loop0;
                                }
                                if ((focusTargetNode2.N1() & a10) != 0 && (focusTargetNode2 instanceof C1247m)) {
                                    int i12 = 0;
                                    for (i.c m22 = ((C1247m) focusTargetNode2).m2(); m22 != null; m22 = m22.J1()) {
                                        if ((m22.N1() & a10) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                focusTargetNode2 = m22;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new C1538b(new i.c[16], 0);
                                                }
                                                if (focusTargetNode2 != null) {
                                                    bVar.b(focusTargetNode2);
                                                    focusTargetNode2 = null;
                                                }
                                                bVar.b(m22);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                focusTargetNode2 = C1245k.g(bVar);
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
            FocusTargetNode focusTargetNode3 = focusTargetNode2;
            if ((focusTargetNode3 != null && C6496s.c(focusTargetNode3.r2(), focusTargetNode.r2())) || (r22 = focusTargetNode.r2()) == null) {
                return null;
            }
            d.a aVar = d.f13315b;
            if (d.l(i10, aVar.h())) {
                i11 = C1184e.b.f2587a.a();
            } else if (d.l(i10, aVar.a())) {
                i11 = C1184e.b.f2587a.d();
            } else if (d.l(i10, aVar.d())) {
                i11 = C1184e.b.f2587a.e();
            } else if (d.l(i10, aVar.g())) {
                i11 = C1184e.b.f2587a.f();
            } else if (d.l(i10, aVar.e())) {
                i11 = C1184e.b.f2587a.b();
            } else if (d.l(i10, aVar.f())) {
                i11 = C1184e.b.f2587a.c();
            } else {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            return r22.a(i11, lVar);
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }
}
