package x0;

import java.util.ArrayList;
import java.util.List;
import x0.C2895h;

public abstract class i {
    public static final void a(char c10, ArrayList arrayList, float[] fArr, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (c10 == 'z' || c10 == 'Z') {
            arrayList.add(C2895h.b.f28101c);
        } else if (c10 == 'm') {
            c(arrayList, fArr, i10);
        } else if (c10 == 'M') {
            b(arrayList, fArr, i10);
        } else {
            int i11 = 0;
            if (c10 == 'l') {
                int i12 = i10 - 2;
                while (i11 <= i12) {
                    arrayList.add(new C2895h.m(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
            } else if (c10 == 'L') {
                int i13 = i10 - 2;
                while (i11 <= i13) {
                    arrayList.add(new C2895h.e(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
            } else if (c10 == 'h') {
                int i14 = i10 - 1;
                while (i11 <= i14) {
                    arrayList.add(new C2895h.l(fArr[i11]));
                    i11++;
                }
            } else if (c10 == 'H') {
                int i15 = i10 - 1;
                while (i11 <= i15) {
                    arrayList.add(new C2895h.d(fArr[i11]));
                    i11++;
                }
            } else if (c10 == 'v') {
                int i16 = i10 - 1;
                while (i11 <= i16) {
                    arrayList.add(new C2895h.r(fArr[i11]));
                    i11++;
                }
            } else if (c10 == 'V') {
                int i17 = i10 - 1;
                while (i11 <= i17) {
                    arrayList.add(new C2895h.s(fArr[i11]));
                    i11++;
                }
            } else if (c10 == 'c') {
                int i18 = i10 - 6;
                while (i11 <= i18) {
                    arrayList.add(new C2895h.k(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
            } else if (c10 == 'C') {
                int i19 = i10 - 6;
                while (i11 <= i19) {
                    arrayList.add(new C2895h.c(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]));
                    i11 += 6;
                }
            } else if (c10 == 's') {
                int i20 = i10 - 4;
                while (i11 <= i20) {
                    arrayList.add(new C2895h.p(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
            } else if (c10 == 'S') {
                int i21 = i10 - 4;
                while (i11 <= i21) {
                    arrayList.add(new C2895h.C0470h(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
            } else if (c10 == 'q') {
                int i22 = i10 - 4;
                while (i11 <= i22) {
                    arrayList.add(new C2895h.o(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
            } else if (c10 == 'Q') {
                int i23 = i10 - 4;
                while (i11 <= i23) {
                    arrayList.add(new C2895h.g(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3]));
                    i11 += 4;
                }
            } else if (c10 == 't') {
                int i24 = i10 - 2;
                while (i11 <= i24) {
                    arrayList.add(new C2895h.q(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
            } else if (c10 == 'T') {
                int i25 = i10 - 2;
                while (i11 <= i25) {
                    arrayList.add(new C2895h.i(fArr[i11], fArr[i11 + 1]));
                    i11 += 2;
                }
            } else if (c10 == 'a') {
                int i26 = i10 - 7;
                for (int i27 = 0; i27 <= i26; i27 += 7) {
                    float f10 = fArr[i27];
                    float f11 = fArr[i27 + 1];
                    float f12 = fArr[i27 + 2];
                    if (Float.compare(fArr[i27 + 3], 0.0f) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (Float.compare(fArr[i27 + 4], 0.0f) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    arrayList.add(new C2895h.j(f10, f11, f12, z12, z13, fArr[i27 + 5], fArr[i27 + 6]));
                }
            } else if (c10 == 'A') {
                int i28 = i10 - 7;
                for (int i29 = 0; i29 <= i28; i29 += 7) {
                    float f13 = fArr[i29];
                    float f14 = fArr[i29 + 1];
                    float f15 = fArr[i29 + 2];
                    if (Float.compare(fArr[i29 + 3], 0.0f) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Float.compare(fArr[i29 + 4], 0.0f) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    arrayList.add(new C2895h.a(f13, f14, f15, z10, z11, fArr[i29 + 5], fArr[i29 + 6]));
                }
            } else {
                throw new IllegalArgumentException("Unknown command for: " + c10);
            }
        }
    }

    private static final void b(List list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new C2895h.f(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new C2895h.e(fArr[i12], fArr[i12 + 1]));
            }
        }
    }

    private static final void c(List list, float[] fArr, int i10) {
        int i11 = i10 - 2;
        if (i11 >= 0) {
            list.add(new C2895h.n(fArr[0], fArr[1]));
            for (int i12 = 2; i12 <= i11; i12 += 2) {
                list.add(new C2895h.m(fArr[i12], fArr[i12 + 1]));
            }
        }
    }
}
