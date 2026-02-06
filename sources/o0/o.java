package O0;

import J0.C1231a0;
import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import J0.G;
import J0.w0;
import a0.C1538b;
import k0.i;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public abstract class o {
    public static final n a(G g10, boolean z10) {
        C1231a0 j02 = g10.j0();
        int a10 = C1239e0.a(8);
        i.c cVar = null;
        if ((j02.i() & a10) != 0) {
            i.c k10 = j02.k();
            loop0:
            while (true) {
                if (k10 != null) {
                    if ((k10.N1() & a10) != 0) {
                        i.c cVar2 = k10;
                        C1538b bVar = null;
                        while (true) {
                            if (cVar2 == null) {
                                break;
                            } else if (cVar2 instanceof w0) {
                                cVar = cVar2;
                                break loop0;
                            } else {
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
                        }
                    }
                    if ((k10.I1() & a10) == 0) {
                        break;
                    }
                    k10 = k10.J1();
                } else {
                    break;
                }
            }
        }
        C6496s.e(cVar);
        i.c v02 = ((w0) cVar).v0();
        j I10 = g10.I();
        C6496s.e(I10);
        return new n(v02, z10, g10, I10);
    }

    /* access modifiers changed from: private */
    public static final int e(n nVar) {
        return nVar.o() + 2000000000;
    }

    public static final G f(G g10, C6798l lVar) {
        for (G n02 = g10.n0(); n02 != null; n02 = n02.n0()) {
            if (((Boolean) lVar.invoke(n02)).booleanValue()) {
                return n02;
            }
        }
        return null;
    }

    public static final w0 g(G g10) {
        C1231a0 j02 = g10.j0();
        int a10 = C1239e0.a(8);
        i.c cVar = null;
        if ((j02.i() & a10) != 0) {
            i.c k10 = j02.k();
            loop0:
            while (true) {
                if (k10 != null) {
                    if ((k10.N1() & a10) != 0) {
                        i.c cVar2 = k10;
                        C1538b bVar = null;
                        while (true) {
                            if (cVar2 == null) {
                                break;
                            }
                            if (cVar2 instanceof w0) {
                                if (((w0) cVar2).F1()) {
                                    cVar = cVar2;
                                    break loop0;
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
                    }
                    if ((k10.I1() & a10) == 0) {
                        break;
                    }
                    k10 = k10.J1();
                } else {
                    break;
                }
            }
        }
        return (w0) cVar;
    }

    /* access modifiers changed from: private */
    public static final g h(n nVar) {
        return (g) k.a(nVar.w(), q.f4613a.y());
    }

    /* access modifiers changed from: private */
    public static final int i(n nVar) {
        return nVar.o() + 1000000000;
    }
}
