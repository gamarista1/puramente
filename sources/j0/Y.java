package J0;

public abstract class Y {
    private static final void b(C1257x xVar, C1250p pVar) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < xVar.c()) {
            int i13 = i10 + 2;
            int b10 = xVar.b(i10) - xVar.b(i13);
            int b11 = xVar.b(i10 + 1) - xVar.b(i13);
            int b12 = xVar.b(i13);
            i10 += 3;
            while (i11 < b10) {
                pVar.a(i12, i11);
                i11++;
            }
            while (i12 < b11) {
                pVar.c(i12);
                i12++;
            }
            while (true) {
                int i14 = b12 - 1;
                if (b12 > 0) {
                    pVar.d(i11, i12);
                    i11++;
                    i12++;
                    b12 = i14;
                }
            }
        }
    }

    private static final boolean c(int i10, int i11, int i12, int i13, C1250p pVar, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = i10;
        int i20 = i12;
        int[] iArr4 = iArr2;
        int i21 = i14;
        int i22 = (i11 - i19) - (i13 - i20);
        if (i22 % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i23 = -i21;
        for (int i24 = i23; i24 <= i21; i24 += 2) {
            if (i24 == i23 || (i24 != i21 && C1240f.b(iArr4, i24 + 1) < C1240f.b(iArr4, i24 - 1))) {
                i16 = C1240f.b(iArr4, i24 + 1);
                i15 = i16;
            } else {
                i16 = C1240f.b(iArr4, i24 - 1);
                i15 = i16 - 1;
            }
            int i25 = i13 - ((i11 - i15) - i24);
            if (i21 == 0 || i15 != i16) {
                i17 = i25;
            } else {
                i17 = i25 + 1;
            }
            while (true) {
                if (i15 > i19 && i25 > i20) {
                    if (!pVar.b(i15 - 1, i25 - 1)) {
                        break;
                    }
                    i15--;
                    i25--;
                } else {
                    C1250p pVar2 = pVar;
                }
            }
            C1250p pVar22 = pVar;
            C1240f.d(iArr4, i24, i15);
            if (!z10 || (i18 = i22 - i24) < i23 || i18 > i21) {
                int[] iArr5 = iArr;
            } else if (C1240f.b(iArr, i18) >= i15) {
                f(i15, i25, i16, i17, true, iArr3);
                return true;
            }
        }
        return false;
    }

    private static final C1257x d(int i10, int i11, C1250p pVar) {
        int i12 = i10;
        int i13 = i11;
        int i14 = ((i12 + i13) + 1) / 2;
        C1257x xVar = new C1257x(i14 * 3);
        C1257x xVar2 = new C1257x(i14 * 4);
        xVar2.h(0, i12, 0, i13);
        int i15 = (i14 * 2) + 1;
        int[] a10 = C1240f.a(new int[i15]);
        int[] a11 = C1240f.a(new int[i15]);
        int[] b10 = y0.b(new int[5]);
        while (xVar2.d()) {
            int f10 = xVar2.f();
            int f11 = xVar2.f();
            int f12 = xVar2.f();
            int f13 = xVar2.f();
            int i16 = f13;
            int i17 = f12;
            int[] iArr = a10;
            int[] iArr2 = a10;
            int i18 = f11;
            int[] iArr3 = a11;
            int[] iArr4 = a11;
            int i19 = f10;
            if (h(f13, f12, f11, f10, pVar, iArr, iArr3, b10)) {
                if (y0.c(b10) > 0) {
                    y0.a(b10, xVar);
                }
                xVar2.h(i16, y0.h(b10), i18, y0.i(b10));
                xVar2.h(y0.d(b10), i17, y0.e(b10), i19);
            }
            int i20 = i10;
            a10 = iArr2;
            a11 = iArr4;
        }
        xVar.j();
        xVar.g(i10, i13, 0);
        return xVar;
    }

    public static final void e(int i10, int i11, C1250p pVar) {
        b(d(i10, i11, pVar), pVar);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v0, types: [int[]] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(int r1, int r2, int r3, int r4, boolean r5, int[] r6) {
        /*
            r0 = 0
            r6[r0] = r1
            r1 = 1
            r6[r1] = r2
            r1 = 2
            r6[r1] = r3
            r1 = 3
            r6[r1] = r4
            r1 = 4
            r6[r1] = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.Y.f(int, int, int, int, boolean, int[]):void");
    }

    private static final boolean g(int i10, int i11, int i12, int i13, C1250p pVar, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        boolean z10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = i11;
        int i20 = i13;
        int[] iArr4 = iArr;
        int i21 = i14;
        int i22 = (i19 - i10) - (i20 - i12);
        if (Math.abs(i22) % 2 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i23 = -i21;
        for (int i24 = i23; i24 <= i21; i24 += 2) {
            if (i24 == i23 || (i24 != i21 && C1240f.b(iArr4, i24 + 1) > C1240f.b(iArr4, i24 - 1))) {
                i16 = C1240f.b(iArr4, i24 + 1);
                i15 = i16;
            } else {
                i16 = C1240f.b(iArr4, i24 - 1);
                i15 = i16 + 1;
            }
            int i25 = (i12 + (i15 - i10)) - i24;
            if (i21 == 0 || i15 != i16) {
                i17 = i25;
            } else {
                i17 = i25 - 1;
            }
            while (true) {
                if (i15 < i19 && i25 < i20) {
                    if (!pVar.b(i15, i25)) {
                        break;
                    }
                    i15++;
                    i25++;
                } else {
                    C1250p pVar2 = pVar;
                }
            }
            C1250p pVar22 = pVar;
            C1240f.d(iArr4, i24, i15);
            if (!z10 || (i18 = i22 - i24) < i23 + 1 || i18 > i21 - 1) {
                int[] iArr5 = iArr2;
            } else if (C1240f.b(iArr2, i18) <= i15) {
                f(i16, i17, i15, i25, false, iArr3);
                return true;
            }
        }
        return false;
    }

    private static final boolean h(int i10, int i11, int i12, int i13, C1250p pVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i10;
        int i15 = i11;
        int i16 = i15 - i14;
        int i17 = i13 - i12;
        if (i16 >= 1 && i17 >= 1) {
            int i18 = ((i16 + i17) + 1) / 2;
            C1240f.d(iArr, 1, i14);
            C1240f.d(iArr2, 1, i15);
            int i19 = 0;
            while (i19 < i18) {
                int i20 = i19;
                if (g(i10, i11, i12, i13, pVar, iArr, iArr2, i19, iArr3) || c(i10, i11, i12, i13, pVar, iArr, iArr2, i20, iArr3)) {
                    return true;
                }
                i19 = i20 + 1;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }
}
