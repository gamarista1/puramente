package androidx.compose.ui.focus;

import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import a0.C1538b;
import k0.i;
import kotlin.jvm.internal.C6498u;
import p0.k;
import yf.C6798l;

public abstract class q {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13350a = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(s.j(focusTargetNode));
        }
    }

    public static final boolean a(k kVar) {
        int a10 = C1239e0.a(1024);
        i.c v02 = kVar.v0();
        C1538b bVar = null;
        while (v02 != null) {
            if (v02 instanceof FocusTargetNode) {
                FocusTargetNode focusTargetNode = (FocusTargetNode) v02;
                if (focusTargetNode.q2().j()) {
                    return s.j(focusTargetNode);
                }
                return w.k(focusTargetNode, d.f13315b.b(), a.f13350a);
            }
            if ((v02.N1() & a10) != 0 && (v02 instanceof C1247m)) {
                int i10 = 0;
                for (i.c m22 = ((C1247m) v02).m2(); m22 != null; m22 = m22.J1()) {
                    if ((m22.N1() & a10) != 0) {
                        i10++;
                        if (i10 == 1) {
                            v02 = m22;
                        } else {
                            if (bVar == null) {
                                bVar = new C1538b(new i.c[16], 0);
                            }
                            if (v02 != null) {
                                bVar.b(v02);
                                v02 = null;
                            }
                            bVar.b(m22);
                        }
                    }
                }
                if (i10 == 1) {
                }
            }
            v02 = C1245k.g(bVar);
        }
        if (kVar.v0().S1()) {
            C1538b bVar2 = new C1538b(new i.c[16], 0);
            i.c J12 = kVar.v0().J1();
            if (J12 == null) {
                C1245k.c(bVar2, kVar.v0());
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
                            continue;
                            break;
                        } else if ((cVar.N1() & a10) != 0) {
                            C1538b bVar3 = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                    if (focusTargetNode2.q2().j()) {
                                        return s.j(focusTargetNode2);
                                    }
                                    return w.k(focusTargetNode2, d.f13315b.b(), a.f13350a);
                                }
                                if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                    int i11 = 0;
                                    for (i.c m23 = ((C1247m) cVar).m2(); m23 != null; m23 = m23.J1()) {
                                        if ((m23.N1() & a10) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVar = m23;
                                            } else {
                                                if (bVar3 == null) {
                                                    bVar3 = new C1538b(new i.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar3.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar3.b(m23);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVar = C1245k.g(bVar3);
                            }
                            continue;
                        } else {
                            cVar = cVar.J1();
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("visitChildren called on an unattached node");
    }
}
