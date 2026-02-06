package j1;

import i1.C2059a;
import i1.C2062d;
import i1.C2063e;
import i1.C2064f;
import i1.C2066h;
import j1.C2121b;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private static C2121b.a f22650a = new C2121b.a();

    /* renamed from: b  reason: collision with root package name */
    private static int f22651b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static int f22652c = 0;

    private static boolean a(int i10, C2063e eVar) {
        C2064f fVar;
        boolean z10;
        boolean z11;
        C2063e.b bVar;
        C2063e.b bVar2;
        C2063e.b C10 = eVar.C();
        C2063e.b V10 = eVar.V();
        if (eVar.M() != null) {
            fVar = (C2064f) eVar.M();
        } else {
            fVar = null;
        }
        if (fVar != null) {
            C2063e.b C11 = fVar.C();
            C2063e.b bVar3 = C2063e.b.FIXED;
        }
        if (fVar != null) {
            C2063e.b V11 = fVar.V();
            C2063e.b bVar4 = C2063e.b.FIXED;
        }
        C2063e.b bVar5 = C2063e.b.FIXED;
        if (C10 == bVar5 || eVar.p0() || C10 == C2063e.b.WRAP_CONTENT || ((C10 == (bVar2 = C2063e.b.MATCH_CONSTRAINT) && eVar.f21954w == 0 && eVar.f21921f0 == 0.0f && eVar.c0(0)) || (C10 == bVar2 && eVar.f21954w == 1 && eVar.f0(0, eVar.Y())))) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (V10 == bVar5 || eVar.q0() || V10 == C2063e.b.WRAP_CONTENT || ((V10 == (bVar = C2063e.b.MATCH_CONSTRAINT) && eVar.f21956x == 0 && eVar.f21921f0 == 0.0f && eVar.c0(1)) || (V10 == bVar && eVar.f21956x == 1 && eVar.f0(1, eVar.z())))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (eVar.f21921f0 > 0.0f && (z10 || z11)) {
            return true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    private static void b(int i10, C2063e eVar, C2121b.C0361b bVar, boolean z10) {
        boolean z11;
        C2062d dVar;
        C2062d dVar2;
        boolean z12;
        C2062d dVar3;
        C2062d dVar4;
        C2063e eVar2 = eVar;
        C2121b.C0361b bVar2 = bVar;
        boolean z13 = z10;
        if (!eVar.i0()) {
            boolean z14 = true;
            f22651b++;
            if (!(eVar2 instanceof C2064f) && eVar.o0()) {
                int i11 = i10 + 1;
                if (a(i11, eVar2)) {
                    C2064f.Y1(i11, eVar2, bVar2, new C2121b.a(), C2121b.a.f22604k);
                }
            }
            C2062d q10 = eVar2.q(C2062d.a.LEFT);
            C2062d q11 = eVar2.q(C2062d.a.RIGHT);
            int e10 = q10.e();
            int e11 = q11.e();
            if (q10.d() != null && q10.n()) {
                Iterator it = q10.d().iterator();
                while (it.hasNext()) {
                    C2062d dVar5 = (C2062d) it.next();
                    C2063e eVar3 = dVar5.f21847d;
                    int i12 = i10 + 1;
                    boolean a10 = a(i12, eVar3);
                    if (eVar3.o0() && a10) {
                        C2064f.Y1(i12, eVar3, bVar2, new C2121b.a(), C2121b.a.f22604k);
                    }
                    if ((dVar5 != eVar3.f21896Q || (dVar4 = eVar3.f21900S.f21849f) == null || !dVar4.n()) && (dVar5 != eVar3.f21900S || (dVar3 = eVar3.f21896Q.f21849f) == null || !dVar3.n())) {
                        z12 = false;
                    } else {
                        z12 = z14;
                    }
                    C2063e.b C10 = eVar3.C();
                    C2063e.b bVar3 = C2063e.b.MATCH_CONSTRAINT;
                    if (C10 != bVar3 || a10) {
                        if (!eVar3.o0()) {
                            C2062d dVar6 = eVar3.f21896Q;
                            if (dVar5 == dVar6 && eVar3.f21900S.f21849f == null) {
                                int f10 = dVar6.f() + e10;
                                eVar3.K0(f10, eVar3.Y() + f10);
                                b(i12, eVar3, bVar2, z13);
                            } else {
                                C2062d dVar7 = eVar3.f21900S;
                                if (dVar5 == dVar7 && dVar6.f21849f == null) {
                                    int f11 = e10 - dVar7.f();
                                    eVar3.K0(f11 - eVar3.Y(), f11);
                                    b(i12, eVar3, bVar2, z13);
                                } else if (z12 && !eVar3.k0()) {
                                    d(i12, bVar2, eVar3, z13);
                                }
                            }
                        }
                    } else if (eVar3.C() == bVar3 && eVar3.f21864A >= 0 && eVar3.f21960z >= 0 && ((eVar3.X() == 8 || (eVar3.f21954w == 0 && eVar3.x() == 0.0f)) && !eVar3.k0() && !eVar3.n0() && z12 && !eVar3.k0())) {
                        e(i12, eVar2, bVar2, eVar3, z13);
                    }
                    z14 = true;
                }
            }
            if (!(eVar2 instanceof C2066h)) {
                if (q11.d() != null && q11.n()) {
                    Iterator it2 = q11.d().iterator();
                    while (it2.hasNext()) {
                        C2062d dVar8 = (C2062d) it2.next();
                        C2063e eVar4 = dVar8.f21847d;
                        int i13 = i10 + 1;
                        boolean a11 = a(i13, eVar4);
                        if (eVar4.o0() && a11) {
                            C2064f.Y1(i13, eVar4, bVar2, new C2121b.a(), C2121b.a.f22604k);
                        }
                        if ((dVar8 != eVar4.f21896Q || (dVar2 = eVar4.f21900S.f21849f) == null || !dVar2.n()) && (dVar8 != eVar4.f21900S || (dVar = eVar4.f21896Q.f21849f) == null || !dVar.n())) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        C2063e.b C11 = eVar4.C();
                        C2063e.b bVar4 = C2063e.b.MATCH_CONSTRAINT;
                        if (C11 != bVar4 || a11) {
                            if (!eVar4.o0()) {
                                C2062d dVar9 = eVar4.f21896Q;
                                if (dVar8 == dVar9 && eVar4.f21900S.f21849f == null) {
                                    int f12 = dVar9.f() + e11;
                                    eVar4.K0(f12, eVar4.Y() + f12);
                                    b(i13, eVar4, bVar2, z13);
                                } else {
                                    C2062d dVar10 = eVar4.f21900S;
                                    if (dVar8 == dVar10 && dVar9.f21849f == null) {
                                        int f13 = e11 - dVar10.f();
                                        eVar4.K0(f13 - eVar4.Y(), f13);
                                        b(i13, eVar4, bVar2, z13);
                                    } else if (z11 && !eVar4.k0()) {
                                        d(i13, bVar2, eVar4, z13);
                                    }
                                }
                            }
                        } else if (eVar4.C() == bVar4 && eVar4.f21864A >= 0 && eVar4.f21960z >= 0) {
                            if ((eVar4.X() == 8 || (eVar4.f21954w == 0 && eVar4.x() == 0.0f)) && !eVar4.k0() && !eVar4.n0() && z11 && !eVar4.k0()) {
                                e(i13, eVar2, bVar2, eVar4, z13);
                            }
                        }
                    }
                }
                eVar.s0();
            }
        }
    }

    private static void c(int i10, C2059a aVar, C2121b.C0361b bVar, int i11, boolean z10) {
        if (!aVar.y1()) {
            return;
        }
        if (i11 == 0) {
            b(i10 + 1, aVar, bVar, z10);
        } else {
            i(i10 + 1, aVar, bVar);
        }
    }

    private static void d(int i10, C2121b.C0361b bVar, C2063e eVar, boolean z10) {
        float f10;
        float A10 = eVar.A();
        int e10 = eVar.f21896Q.f21849f.e();
        int e11 = eVar.f21900S.f21849f.e();
        int f11 = eVar.f21896Q.f() + e10;
        int f12 = e11 - eVar.f21900S.f();
        if (e10 == e11) {
            A10 = 0.5f;
        } else {
            e10 = f11;
            e11 = f12;
        }
        int Y10 = eVar.Y();
        int i11 = (e11 - e10) - Y10;
        if (e10 > e11) {
            i11 = (e10 - e11) - Y10;
        }
        if (i11 > 0) {
            f10 = (A10 * ((float) i11)) + 0.5f;
        } else {
            f10 = A10 * ((float) i11);
        }
        int i12 = ((int) f10) + e10;
        int i13 = i12 + Y10;
        if (e10 > e11) {
            i13 = i12 - Y10;
        }
        eVar.K0(i12, i13);
        b(i10 + 1, eVar, bVar, z10);
    }

    private static void e(int i10, C2063e eVar, C2121b.C0361b bVar, C2063e eVar2, boolean z10) {
        int i11;
        float A10 = eVar2.A();
        int e10 = eVar2.f21896Q.f21849f.e() + eVar2.f21896Q.f();
        int e11 = eVar2.f21900S.f21849f.e() - eVar2.f21900S.f();
        if (e11 >= e10) {
            int Y10 = eVar2.Y();
            if (eVar2.X() != 8) {
                int i12 = eVar2.f21954w;
                if (i12 == 2) {
                    if (eVar instanceof C2064f) {
                        i11 = eVar.Y();
                    } else {
                        i11 = eVar.M().Y();
                    }
                    Y10 = (int) (eVar2.A() * 0.5f * ((float) i11));
                } else if (i12 == 0) {
                    Y10 = e11 - e10;
                }
                Y10 = Math.max(eVar2.f21960z, Y10);
                int i13 = eVar2.f21864A;
                if (i13 > 0) {
                    Y10 = Math.min(i13, Y10);
                }
            }
            int i14 = e10 + ((int) ((A10 * ((float) ((e11 - e10) - Y10))) + 0.5f));
            eVar2.K0(i14, Y10 + i14);
            b(i10 + 1, eVar2, bVar, z10);
        }
    }

    private static void f(int i10, C2121b.C0361b bVar, C2063e eVar) {
        float f10;
        float T10 = eVar.T();
        int e10 = eVar.f21898R.f21849f.e();
        int e11 = eVar.f21902T.f21849f.e();
        int f11 = eVar.f21898R.f() + e10;
        int f12 = e11 - eVar.f21902T.f();
        if (e10 == e11) {
            T10 = 0.5f;
        } else {
            e10 = f11;
            e11 = f12;
        }
        int z10 = eVar.z();
        int i11 = (e11 - e10) - z10;
        if (e10 > e11) {
            i11 = (e10 - e11) - z10;
        }
        if (i11 > 0) {
            f10 = (T10 * ((float) i11)) + 0.5f;
        } else {
            f10 = T10 * ((float) i11);
        }
        int i12 = (int) f10;
        int i13 = e10 + i12;
        int i14 = i13 + z10;
        if (e10 > e11) {
            i13 = e10 - i12;
            i14 = i13 - z10;
        }
        eVar.N0(i13, i14);
        i(i10 + 1, eVar, bVar);
    }

    private static void g(int i10, C2063e eVar, C2121b.C0361b bVar, C2063e eVar2) {
        int i11;
        float T10 = eVar2.T();
        int e10 = eVar2.f21898R.f21849f.e() + eVar2.f21898R.f();
        int e11 = eVar2.f21902T.f21849f.e() - eVar2.f21902T.f();
        if (e11 >= e10) {
            int z10 = eVar2.z();
            if (eVar2.X() != 8) {
                int i12 = eVar2.f21956x;
                if (i12 == 2) {
                    if (eVar instanceof C2064f) {
                        i11 = eVar.z();
                    } else {
                        i11 = eVar.M().z();
                    }
                    z10 = (int) (T10 * 0.5f * ((float) i11));
                } else if (i12 == 0) {
                    z10 = e11 - e10;
                }
                z10 = Math.max(eVar2.f21868C, z10);
                int i13 = eVar2.f21870D;
                if (i13 > 0) {
                    z10 = Math.min(i13, z10);
                }
            }
            int i14 = e10 + ((int) ((T10 * ((float) ((e11 - e10) - z10))) + 0.5f));
            eVar2.N0(i14, z10 + i14);
            i(i10 + 1, eVar2, bVar);
        }
    }

    public static void h(C2064f fVar, C2121b.C0361b bVar) {
        C2063e.b C10 = fVar.C();
        C2063e.b V10 = fVar.V();
        f22651b = 0;
        f22652c = 0;
        fVar.y0();
        ArrayList w12 = fVar.w1();
        int size = w12.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C2063e) w12.get(i10)).y0();
        }
        boolean V12 = fVar.V1();
        if (C10 == C2063e.b.FIXED) {
            fVar.K0(0, fVar.Y());
        } else {
            fVar.L0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C2063e eVar = (C2063e) w12.get(i11);
            if (eVar instanceof C2066h) {
                C2066h hVar = (C2066h) eVar;
                if (hVar.x1() == 1) {
                    if (hVar.y1() != -1) {
                        hVar.B1(hVar.y1());
                    } else if (hVar.z1() != -1 && fVar.p0()) {
                        hVar.B1(fVar.Y() - hVar.z1());
                    } else if (fVar.p0()) {
                        hVar.B1((int) ((hVar.A1() * ((float) fVar.Y())) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((eVar instanceof C2059a) && ((C2059a) eVar).C1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                C2063e eVar2 = (C2063e) w12.get(i12);
                if (eVar2 instanceof C2066h) {
                    C2066h hVar2 = (C2066h) eVar2;
                    if (hVar2.x1() == 1) {
                        b(0, hVar2, bVar, V12);
                    }
                }
            }
        }
        b(0, fVar, bVar, V12);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                C2063e eVar3 = (C2063e) w12.get(i13);
                if (eVar3 instanceof C2059a) {
                    C2059a aVar = (C2059a) eVar3;
                    if (aVar.C1() == 0) {
                        c(0, aVar, bVar, 0, V12);
                    }
                }
            }
        }
        if (V10 == C2063e.b.FIXED) {
            fVar.N0(0, fVar.z());
        } else {
            fVar.M0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            C2063e eVar4 = (C2063e) w12.get(i14);
            if (eVar4 instanceof C2066h) {
                C2066h hVar3 = (C2066h) eVar4;
                if (hVar3.x1() == 0) {
                    if (hVar3.y1() != -1) {
                        hVar3.B1(hVar3.y1());
                    } else if (hVar3.z1() != -1 && fVar.q0()) {
                        hVar3.B1(fVar.z() - hVar3.z1());
                    } else if (fVar.q0()) {
                        hVar3.B1((int) ((hVar3.A1() * ((float) fVar.z())) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((eVar4 instanceof C2059a) && ((C2059a) eVar4).C1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                C2063e eVar5 = (C2063e) w12.get(i15);
                if (eVar5 instanceof C2066h) {
                    C2066h hVar4 = (C2066h) eVar5;
                    if (hVar4.x1() == 0) {
                        i(1, hVar4, bVar);
                    }
                }
            }
        }
        i(0, fVar, bVar);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                C2063e eVar6 = (C2063e) w12.get(i16);
                if (eVar6 instanceof C2059a) {
                    C2059a aVar2 = (C2059a) eVar6;
                    if (aVar2.C1() == 1) {
                        c(0, aVar2, bVar, 1, V12);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            C2063e eVar7 = (C2063e) w12.get(i17);
            if (eVar7.o0() && a(0, eVar7)) {
                C2064f.Y1(0, eVar7, bVar, f22650a, C2121b.a.f22604k);
                if (!(eVar7 instanceof C2066h)) {
                    b(0, eVar7, bVar, V12);
                    i(0, eVar7, bVar);
                } else if (((C2066h) eVar7).x1() == 0) {
                    i(0, eVar7, bVar);
                } else {
                    b(0, eVar7, bVar, V12);
                }
            }
        }
    }

    private static void i(int i10, C2063e eVar, C2121b.C0361b bVar) {
        boolean z10;
        C2062d dVar;
        C2062d dVar2;
        boolean z11;
        C2062d dVar3;
        C2062d dVar4;
        C2063e eVar2 = eVar;
        C2121b.C0361b bVar2 = bVar;
        if (!eVar.r0()) {
            f22652c++;
            if (!(eVar2 instanceof C2064f) && eVar.o0()) {
                int i11 = i10 + 1;
                if (a(i11, eVar2)) {
                    C2064f.Y1(i11, eVar2, bVar2, new C2121b.a(), C2121b.a.f22604k);
                }
            }
            C2062d q10 = eVar2.q(C2062d.a.TOP);
            C2062d q11 = eVar2.q(C2062d.a.BOTTOM);
            int e10 = q10.e();
            int e11 = q11.e();
            if (q10.d() != null && q10.n()) {
                Iterator it = q10.d().iterator();
                while (it.hasNext()) {
                    C2062d dVar5 = (C2062d) it.next();
                    C2063e eVar3 = dVar5.f21847d;
                    int i12 = i10 + 1;
                    boolean a10 = a(i12, eVar3);
                    if (eVar3.o0() && a10) {
                        C2064f.Y1(i12, eVar3, bVar2, new C2121b.a(), C2121b.a.f22604k);
                    }
                    if ((dVar5 != eVar3.f21898R || (dVar4 = eVar3.f21902T.f21849f) == null || !dVar4.n()) && (dVar5 != eVar3.f21902T || (dVar3 = eVar3.f21898R.f21849f) == null || !dVar3.n())) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    C2063e.b V10 = eVar3.V();
                    C2063e.b bVar3 = C2063e.b.MATCH_CONSTRAINT;
                    if (V10 != bVar3 || a10) {
                        if (!eVar3.o0()) {
                            C2062d dVar6 = eVar3.f21898R;
                            if (dVar5 == dVar6 && eVar3.f21902T.f21849f == null) {
                                int f10 = dVar6.f() + e10;
                                eVar3.N0(f10, eVar3.z() + f10);
                                i(i12, eVar3, bVar2);
                            } else {
                                C2062d dVar7 = eVar3.f21902T;
                                if (dVar5 == dVar7 && dVar6.f21849f == null) {
                                    int f11 = e10 - dVar7.f();
                                    eVar3.N0(f11 - eVar3.z(), f11);
                                    i(i12, eVar3, bVar2);
                                } else if (z11 && !eVar3.m0()) {
                                    f(i12, bVar2, eVar3);
                                }
                            }
                        }
                    } else if (eVar3.V() == bVar3 && eVar3.f21870D >= 0 && eVar3.f21868C >= 0) {
                        if ((eVar3.X() == 8 || (eVar3.f21956x == 0 && eVar3.x() == 0.0f)) && !eVar3.m0() && !eVar3.n0() && z11 && !eVar3.m0()) {
                            g(i12, eVar2, bVar2, eVar3);
                        }
                    }
                }
            }
            if (!(eVar2 instanceof C2066h)) {
                if (q11.d() != null && q11.n()) {
                    Iterator it2 = q11.d().iterator();
                    while (it2.hasNext()) {
                        C2062d dVar8 = (C2062d) it2.next();
                        C2063e eVar4 = dVar8.f21847d;
                        int i13 = i10 + 1;
                        boolean a11 = a(i13, eVar4);
                        if (eVar4.o0() && a11) {
                            C2064f.Y1(i13, eVar4, bVar2, new C2121b.a(), C2121b.a.f22604k);
                        }
                        if ((dVar8 != eVar4.f21898R || (dVar2 = eVar4.f21902T.f21849f) == null || !dVar2.n()) && (dVar8 != eVar4.f21902T || (dVar = eVar4.f21898R.f21849f) == null || !dVar.n())) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        C2063e.b V11 = eVar4.V();
                        C2063e.b bVar4 = C2063e.b.MATCH_CONSTRAINT;
                        if (V11 != bVar4 || a11) {
                            if (!eVar4.o0()) {
                                C2062d dVar9 = eVar4.f21898R;
                                if (dVar8 == dVar9 && eVar4.f21902T.f21849f == null) {
                                    int f12 = dVar9.f() + e11;
                                    eVar4.N0(f12, eVar4.z() + f12);
                                    i(i13, eVar4, bVar2);
                                } else {
                                    C2062d dVar10 = eVar4.f21902T;
                                    if (dVar8 == dVar10 && dVar9.f21849f == null) {
                                        int f13 = e11 - dVar10.f();
                                        eVar4.N0(f13 - eVar4.z(), f13);
                                        i(i13, eVar4, bVar2);
                                    } else if (z10 && !eVar4.m0()) {
                                        f(i13, bVar2, eVar4);
                                    }
                                }
                            }
                        } else if (eVar4.V() == bVar4 && eVar4.f21870D >= 0 && eVar4.f21868C >= 0) {
                            if ((eVar4.X() == 8 || (eVar4.f21956x == 0 && eVar4.x() == 0.0f)) && !eVar4.m0() && !eVar4.n0() && z10 && !eVar4.m0()) {
                                g(i13, eVar2, bVar2, eVar4);
                            }
                        }
                    }
                }
                C2062d q12 = eVar2.q(C2062d.a.BASELINE);
                if (q12.d() != null && q12.n()) {
                    int e12 = q12.e();
                    Iterator it3 = q12.d().iterator();
                    while (it3.hasNext()) {
                        C2062d dVar11 = (C2062d) it3.next();
                        C2063e eVar5 = dVar11.f21847d;
                        int i14 = i10 + 1;
                        boolean a12 = a(i14, eVar5);
                        if (eVar5.o0() && a12) {
                            C2064f.Y1(i14, eVar5, bVar2, new C2121b.a(), C2121b.a.f22604k);
                        }
                        if ((eVar5.V() != C2063e.b.MATCH_CONSTRAINT || a12) && !eVar5.o0() && dVar11 == eVar5.f21904U) {
                            eVar5.J0(dVar11.f() + e12);
                            i(i14, eVar5, bVar2);
                        }
                    }
                }
                eVar.t0();
            }
        }
    }
}
