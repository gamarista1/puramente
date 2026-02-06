package j1;

import f1.d;
import i1.C2062d;
import i1.C2063e;
import i1.C2064f;
import i1.C2066h;
import i1.C2067i;
import i1.C2069k;
import i1.C2071m;
import java.util.ArrayList;

/* renamed from: j1.b  reason: case insensitive filesystem */
public class C2121b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f22601a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private a f22602b = new a();

    /* renamed from: c  reason: collision with root package name */
    private C2064f f22603c;

    /* renamed from: j1.b$a */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f22604k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f22605l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f22606m = 2;

        /* renamed from: a  reason: collision with root package name */
        public C2063e.b f22607a;

        /* renamed from: b  reason: collision with root package name */
        public C2063e.b f22608b;

        /* renamed from: c  reason: collision with root package name */
        public int f22609c;

        /* renamed from: d  reason: collision with root package name */
        public int f22610d;

        /* renamed from: e  reason: collision with root package name */
        public int f22611e;

        /* renamed from: f  reason: collision with root package name */
        public int f22612f;

        /* renamed from: g  reason: collision with root package name */
        public int f22613g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f22614h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f22615i;

        /* renamed from: j  reason: collision with root package name */
        public int f22616j;
    }

    /* renamed from: j1.b$b  reason: collision with other inner class name */
    public interface C0361b {
        void a();

        void b(C2063e eVar, a aVar);
    }

    public C2121b(C2064f fVar) {
        this.f22603c = fVar;
    }

    private boolean a(C0361b bVar, C2063e eVar, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        this.f22602b.f22607a = eVar.C();
        this.f22602b.f22608b = eVar.V();
        this.f22602b.f22609c = eVar.Y();
        this.f22602b.f22610d = eVar.z();
        a aVar = this.f22602b;
        aVar.f22615i = false;
        aVar.f22616j = i10;
        C2063e.b bVar2 = aVar.f22607a;
        C2063e.b bVar3 = C2063e.b.MATCH_CONSTRAINT;
        if (bVar2 == bVar3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar.f22608b == bVar3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || eVar.f21921f0 <= 0.0f) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z11 || eVar.f21921f0 <= 0.0f) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z12 && eVar.f21958y[0] == 4) {
            aVar.f22607a = C2063e.b.FIXED;
        }
        if (z13 && eVar.f21958y[1] == 4) {
            aVar.f22608b = C2063e.b.FIXED;
        }
        bVar.b(eVar, aVar);
        eVar.p1(this.f22602b.f22611e);
        eVar.Q0(this.f22602b.f22612f);
        eVar.P0(this.f22602b.f22614h);
        eVar.F0(this.f22602b.f22613g);
        a aVar2 = this.f22602b;
        aVar2.f22616j = a.f22604k;
        return aVar2.f22615i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        if (r8 != r9) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        if (r5.f21921f0 <= 0.0f) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(i1.C2064f r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.f22048V0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.Z1(r1)
            j1.b$b r2 = r13.O1()
            r3 = 0
            r4 = r3
        L_0x0012:
            if (r4 >= r0) goto L_0x00a4
            java.util.ArrayList r5 = r13.f22048V0
            java.lang.Object r5 = r5.get(r4)
            i1.e r5 = (i1.C2063e) r5
            boolean r6 = r5 instanceof i1.C2066h
            if (r6 == 0) goto L_0x0022
            goto L_0x00a0
        L_0x0022:
            boolean r6 = r5 instanceof i1.C2059a
            if (r6 == 0) goto L_0x0028
            goto L_0x00a0
        L_0x0028:
            boolean r6 = r5.n0()
            if (r6 == 0) goto L_0x0030
            goto L_0x00a0
        L_0x0030:
            if (r1 == 0) goto L_0x0047
            j1.l r6 = r5.f21918e
            if (r6 == 0) goto L_0x0047
            j1.n r7 = r5.f21920f
            if (r7 == 0) goto L_0x0047
            j1.g r6 = r6.f22684e
            boolean r6 = r6.f22637j
            if (r6 == 0) goto L_0x0047
            j1.g r6 = r7.f22684e
            boolean r6 = r6.f22637j
            if (r6 == 0) goto L_0x0047
            goto L_0x00a0
        L_0x0047:
            i1.e$b r6 = r5.w(r3)
            r7 = 1
            i1.e$b r8 = r5.w(r7)
            i1.e$b r9 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0060
            int r10 = r5.f21954w
            if (r10 == r7) goto L_0x0060
            if (r8 != r9) goto L_0x0060
            int r10 = r5.f21956x
            if (r10 == r7) goto L_0x0060
            r10 = r7
            goto L_0x0061
        L_0x0060:
            r10 = r3
        L_0x0061:
            if (r10 != 0) goto L_0x0097
            boolean r11 = r13.Z1(r7)
            if (r11 == 0) goto L_0x0097
            boolean r11 = r5 instanceof i1.C2071m
            if (r11 != 0) goto L_0x0097
            if (r6 != r9) goto L_0x007c
            int r11 = r5.f21954w
            if (r11 != 0) goto L_0x007c
            if (r8 == r9) goto L_0x007c
            boolean r11 = r5.k0()
            if (r11 != 0) goto L_0x007c
            r10 = r7
        L_0x007c:
            if (r8 != r9) goto L_0x008b
            int r11 = r5.f21956x
            if (r11 != 0) goto L_0x008b
            if (r6 == r9) goto L_0x008b
            boolean r11 = r5.k0()
            if (r11 != 0) goto L_0x008b
            r10 = r7
        L_0x008b:
            if (r6 == r9) goto L_0x008f
            if (r8 != r9) goto L_0x0097
        L_0x008f:
            float r6 = r5.f21921f0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            if (r7 == 0) goto L_0x009b
            goto L_0x00a0
        L_0x009b:
            int r6 = j1.C2121b.a.f22604k
            r12.a(r2, r5, r6)
        L_0x00a0:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00a4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C2121b.b(i1.f):void");
    }

    private void c(C2064f fVar, String str, int i10, int i11, int i12) {
        fVar.getClass();
        int K10 = fVar.K();
        int J10 = fVar.J();
        fVar.f1(0);
        fVar.e1(0);
        fVar.p1(i11);
        fVar.Q0(i12);
        fVar.f1(K10);
        fVar.e1(J10);
        this.f22603c.d2(i10);
        this.f22603c.x1();
    }

    public long d(C2064f fVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean z10;
        boolean z11;
        int i19;
        boolean z12;
        boolean z13;
        int i20;
        C2064f fVar2;
        boolean z14;
        boolean z15;
        boolean z16;
        int i21;
        boolean z17;
        int i22;
        int i23;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        C2121b bVar = this;
        C2064f fVar3 = fVar;
        int i24 = i10;
        int i25 = i13;
        int i26 = i15;
        C0361b O12 = fVar.O1();
        int size = fVar3.f22048V0.size();
        int Y10 = fVar.Y();
        int z24 = fVar.z();
        boolean b10 = C2069k.b(i24, 128);
        int i27 = 1;
        if (b10 || C2069k.b(i24, 64)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i28 = 0;
            while (true) {
                if (i28 >= size) {
                    break;
                }
                C2063e eVar = (C2063e) fVar3.f22048V0.get(i28);
                C2063e.b C10 = eVar.C();
                C2063e.b bVar2 = C2063e.b.MATCH_CONSTRAINT;
                if (C10 == bVar2) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (eVar.V() == bVar2) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (!z21 || !z22 || eVar.x() <= 0.0f) {
                    z23 = false;
                } else {
                    z23 = true;
                }
                if ((!eVar.k0() || !z23) && ((!eVar.m0() || !z23) && !(eVar instanceof C2071m) && !eVar.k0() && !eVar.m0())) {
                    i28++;
                }
            }
            z10 = false;
        }
        if (z10) {
            boolean z25 = d.f19616s;
        }
        if (!(i25 == 1073741824 && i26 == 1073741824) && !b10) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z26 = z10 & z11;
        int i29 = 2;
        if (z26) {
            int min = Math.min(fVar.I(), i14);
            int min2 = Math.min(fVar.H(), i16);
            if (i25 == 1073741824 && fVar.Y() != min) {
                fVar3.p1(min);
                fVar.S1();
            }
            if (i26 == 1073741824 && fVar.z() != min2) {
                fVar3.Q0(min2);
                fVar.S1();
            }
            if (i25 == 1073741824 && i26 == 1073741824) {
                z13 = fVar3.K1(b10);
                i19 = 2;
                z12 = false;
            } else {
                boolean L12 = fVar3.L1(b10);
                z12 = false;
                if (i25 == 1073741824) {
                    L12 &= fVar3.M1(b10, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i26 == 1073741824) {
                    z13 = fVar3.M1(b10, 1) & L12;
                    i19++;
                } else {
                    z13 = L12;
                }
            }
            if (z13) {
                if (i25 == 1073741824) {
                    z19 = true;
                } else {
                    z19 = z12;
                }
                if (i26 == 1073741824) {
                    z20 = true;
                } else {
                    z20 = z12;
                }
                fVar3.u1(z19, z20);
            }
        } else {
            z12 = false;
            z13 = false;
            i19 = 0;
        }
        if (z13 && i19 == 2) {
            return 0;
        }
        int P12 = fVar.P1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f22601a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, Y10, z24);
        }
        if (size2 > 0) {
            C2063e.b C11 = fVar.C();
            C2063e.b bVar3 = C2063e.b.WRAP_CONTENT;
            if (C11 == bVar3) {
                z14 = true;
            } else {
                z14 = z12;
            }
            if (fVar.V() == bVar3) {
                z15 = true;
            } else {
                z15 = z12;
            }
            int max = Math.max(fVar.Y(), bVar.f22603c.K());
            int max2 = Math.max(fVar.z(), bVar.f22603c.J());
            int i30 = z12;
            boolean z27 = i30;
            while (i30 < size2) {
                C2063e eVar2 = (C2063e) bVar.f22601a.get(i30);
                if (!(eVar2 instanceof C2071m)) {
                    i22 = P12;
                    i23 = i27;
                } else {
                    int Y11 = eVar2.Y();
                    int z28 = eVar2.z();
                    boolean a10 = z27 | bVar.a(O12, eVar2, a.f22605l);
                    int Y12 = eVar2.Y();
                    i22 = P12;
                    int z29 = eVar2.z();
                    if (Y12 != Y11) {
                        eVar2.p1(Y12);
                        if (z14 && eVar2.O() > max) {
                            max = Math.max(max, eVar2.O() + eVar2.q(C2062d.a.RIGHT).f());
                        }
                        z18 = true;
                    } else {
                        z18 = a10;
                    }
                    if (z29 != z28) {
                        eVar2.Q0(z29);
                        if (z15 && eVar2.t() > max2) {
                            max2 = Math.max(max2, eVar2.t() + eVar2.q(C2062d.a.BOTTOM).f());
                        }
                        z18 = true;
                    }
                    z27 = z18 | ((C2071m) eVar2).E1();
                    i23 = 1;
                }
                i30 += i23;
                P12 = i22;
                i27 = i23;
                i29 = 2;
                C2064f fVar4 = fVar;
            }
            int i31 = P12;
            int i32 = i29;
            int i33 = 0;
            while (i33 < i32) {
                int i34 = 0;
                while (i34 < size2) {
                    C2063e eVar3 = (C2063e) bVar.f22601a.get(i34);
                    if ((!(eVar3 instanceof C2067i) || (eVar3 instanceof C2071m)) && !(eVar3 instanceof C2066h) && eVar3.X() != 8 && ((!z26 || !eVar3.f21918e.f22684e.f22637j || !eVar3.f21920f.f22684e.f22637j) && !(eVar3 instanceof C2071m))) {
                        int Y13 = eVar3.Y();
                        int z30 = eVar3.z();
                        int r10 = eVar3.r();
                        int i35 = a.f22605l;
                        z16 = z26;
                        if (i33 == 1) {
                            i35 = a.f22606m;
                        }
                        int Y14 = eVar3.Y();
                        boolean a11 = z27 | bVar.a(O12, eVar3, i35);
                        int z31 = eVar3.z();
                        if (Y14 != Y13) {
                            eVar3.p1(Y14);
                            if (z14 && eVar3.O() > max) {
                                max = Math.max(max, eVar3.O() + eVar3.q(C2062d.a.RIGHT).f());
                            }
                            z17 = true;
                        } else {
                            z17 = a11;
                        }
                        if (z31 != z30) {
                            eVar3.Q0(z31);
                            if (z15 && eVar3.t() > max2) {
                                max2 = Math.max(max2, eVar3.t() + eVar3.q(C2062d.a.BOTTOM).f());
                            }
                            z17 = true;
                        }
                        if (!eVar3.b0() || r10 == eVar3.r()) {
                            z27 = z17;
                        } else {
                            i21 = 1;
                            z27 = 1;
                            i34 += i21;
                            bVar = this;
                            z26 = z16;
                        }
                    } else {
                        z16 = z26;
                    }
                    i21 = 1;
                    i34 += i21;
                    bVar = this;
                    z26 = z16;
                }
                boolean z32 = z26;
                if (z27 == 0) {
                    break;
                }
                i33++;
                c(fVar, "intermediate pass", i33, Y10, z24);
                i32 = 2;
                z27 = 0;
                bVar = this;
                z26 = z32;
            }
            fVar2 = fVar;
            i20 = i31;
        } else {
            fVar2 = fVar;
            i20 = P12;
        }
        fVar2.c2(i20);
        return 0;
    }

    public void e(C2064f fVar) {
        this.f22601a.clear();
        int size = fVar.f22048V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2063e eVar = (C2063e) fVar.f22048V0.get(i10);
            C2063e.b C10 = eVar.C();
            C2063e.b bVar = C2063e.b.MATCH_CONSTRAINT;
            if (C10 == bVar || eVar.V() == bVar) {
                this.f22601a.add(eVar);
            }
        }
        fVar.S1();
    }
}
