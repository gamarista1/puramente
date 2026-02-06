package Vc;

import Wc.a;
import Wc.b;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f53439a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(a aVar, int i10, int i11) {
        int i12;
        int[] iArr = new int[i11];
        int i13 = aVar.i() / i10;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                if (aVar.h((i14 * i10) + i16)) {
                    i12 = 1 << ((i10 - i16) - 1);
                } else {
                    i12 = 0;
                }
                i15 |= i12;
            }
            iArr[i14] = i15;
        }
        return iArr;
    }

    private static void b(b bVar, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 > i15) {
                    break;
                }
                bVar.i(i14, i13);
                bVar.i(i14, i15);
                bVar.i(i13, i14);
                bVar.i(i15, i14);
                i14++;
            }
        }
        int i16 = i10 - i11;
        bVar.i(i16, i16);
        int i17 = i16 + 1;
        bVar.i(i17, i16);
        bVar.i(i16, i17);
        int i18 = i10 + i11;
        bVar.i(i18, i16);
        bVar.i(i18, i17);
        bVar.i(i18, i18 - 1);
    }

    private static void c(b bVar, boolean z10, int i10, a aVar) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (aVar.h(i12)) {
                    bVar.i(i13, i11 - 5);
                }
                if (aVar.h(i12 + 7)) {
                    bVar.i(i11 + 5, i13);
                }
                if (aVar.h(20 - i12)) {
                    bVar.i(i13, i11 + 5);
                }
                if (aVar.h(27 - i12)) {
                    bVar.i(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (aVar.h(i12)) {
                bVar.i(i14, i11 - 7);
            }
            if (aVar.h(i12 + 10)) {
                bVar.i(i11 + 7, i14);
            }
            if (aVar.h(29 - i12)) {
                bVar.i(i14, i11 + 7);
            }
            if (aVar.h(39 - i12)) {
                bVar.i(i11 - 7, i14);
            }
            i12++;
        }
    }

    public static a d(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        a aVar;
        int i15;
        int i16;
        boolean z11;
        int i17;
        a a10 = new d(bArr).a();
        int i18 = 11;
        int i19 = ((a10.i() * i10) / 100) + 11;
        int i20 = a10.i() + i19;
        int i21 = 32;
        boolean z12 = true;
        if (i11 != 0) {
            if (i11 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i13 = Math.abs(i11);
            if (z10) {
                i21 = 4;
            }
            if (i13 <= i21) {
                i14 = i(i13, z10);
                i12 = f53439a[i13];
                int i22 = i14 - (i14 % i12);
                aVar = h(a10, i12);
                if (aVar.i() + i19 > i22) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                } else if (z10 && aVar.i() > (i12 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i11)}));
            }
        } else {
            a aVar2 = null;
            int i23 = 0;
            int i24 = 0;
            while (i23 <= 32) {
                if (i23 <= 3) {
                    z11 = z12;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i17 = i23 + 1;
                } else {
                    i17 = i23;
                }
                int i25 = i(i17, z11);
                if (i20 <= i25) {
                    if (aVar2 == null || i24 != f53439a[i17]) {
                        int i26 = f53439a[i17];
                        i24 = i26;
                        aVar2 = h(a10, i26);
                    }
                    int i27 = i25 - (i25 % i24);
                    if ((!z11 || aVar2.i() <= (i24 << 6)) && aVar2.i() + i19 <= i27) {
                        aVar = aVar2;
                        i12 = i24;
                        z10 = z11;
                        i13 = i17;
                        i14 = i25;
                    }
                }
                i23++;
                z12 = z12;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        a e10 = e(aVar, i14, i12);
        int i28 = aVar.i() / i12;
        a f10 = f(z10, i13, i28);
        if (!z10) {
            i18 = 14;
        }
        int i29 = i18 + (i13 << 2);
        int[] iArr = new int[i29];
        int i30 = 2;
        if (z10) {
            for (int i31 = 0; i31 < i29; i31++) {
                iArr[i31] = i31;
            }
            i15 = i29;
        } else {
            int i32 = i29 / 2;
            i15 = i29 + 1 + (((i32 - 1) / 15) * 2);
            int i33 = i15 / 2;
            for (int i34 = 0; i34 < i32; i34++) {
                int i35 = (i34 / 15) + i34;
                iArr[(i32 - i34) - (z12 ? 1 : 0)] = (i33 - i35) - 1;
                iArr[i32 + i34] = i35 + i33 + z12;
            }
        }
        b bVar = new b(i15);
        int i36 = 0;
        int i37 = 0;
        while (i36 < i13) {
            int i38 = (i13 - i36) << i30;
            if (z10) {
                i16 = 9;
            } else {
                i16 = 12;
            }
            int i39 = i38 + i16;
            int i40 = 0;
            while (i40 < i39) {
                int i41 = i40 << 1;
                int i42 = 0;
                while (i42 < i30) {
                    if (e10.h(i37 + i41 + i42)) {
                        int i43 = i36 << 1;
                        bVar.i(iArr[i43 + i42], iArr[i43 + i40]);
                    }
                    if (e10.h((i39 << 1) + i37 + i41 + i42)) {
                        int i44 = i36 << 1;
                        bVar.i(iArr[i44 + i40], iArr[((i29 - 1) - i44) - i42]);
                    }
                    if (e10.h((i39 << 2) + i37 + i41 + i42)) {
                        int i45 = (i29 - 1) - (i36 << 1);
                        bVar.i(iArr[i45 - i42], iArr[i45 - i40]);
                    }
                    if (e10.h((i39 * 6) + i37 + i41 + i42)) {
                        int i46 = i36 << 1;
                        bVar.i(iArr[((i29 - 1) - i46) - i40], iArr[i46 + i42]);
                    }
                    i42++;
                    i30 = 2;
                }
                i40++;
                i30 = 2;
            }
            i37 += i39 << 3;
            i36++;
            i30 = 2;
        }
        c(bVar, z10, i15, f10);
        if (z10) {
            b(bVar, i15 / 2, 5);
        } else {
            int i47 = i15 / 2;
            b(bVar, i47, 7);
            int i48 = 0;
            int i49 = 0;
            while (i49 < (i29 / 2) - 1) {
                for (int i50 = i47 & 1; i50 < i15; i50 += 2) {
                    int i51 = i47 - i48;
                    bVar.i(i51, i50);
                    int i52 = i47 + i48;
                    bVar.i(i52, i50);
                    bVar.i(i50, i51);
                    bVar.i(i50, i52);
                }
                i49 += 15;
                i48 += 16;
            }
        }
        a aVar3 = new a();
        aVar3.c(z10);
        aVar3.f(i15);
        aVar3.d(i13);
        aVar3.b(i28);
        aVar3.e(bVar);
        return aVar3;
    }

    private static a e(a aVar, int i10, int i11) {
        Xc.c cVar = new Xc.c(g(i11));
        int i12 = i10 / i11;
        int[] a10 = a(aVar, i11, i12);
        cVar.b(a10, i12 - (aVar.i() / i11));
        a aVar2 = new a();
        aVar2.d(0, i10 % i11);
        for (int d10 : a10) {
            aVar2.d(d10, i11);
        }
        return aVar2;
    }

    static a f(boolean z10, int i10, int i11) {
        a aVar = new a();
        if (z10) {
            aVar.d(i10 - 1, 2);
            aVar.d(i11 - 1, 6);
            return e(aVar, 28, 4);
        }
        aVar.d(i10 - 1, 5);
        aVar.d(i11 - 1, 11);
        return e(aVar, 40, 4);
    }

    private static Xc.a g(int i10) {
        if (i10 == 4) {
            return Xc.a.f53506k;
        }
        if (i10 == 6) {
            return Xc.a.f53505j;
        }
        if (i10 == 8) {
            return Xc.a.f53509n;
        }
        if (i10 == 10) {
            return Xc.a.f53504i;
        }
        if (i10 == 12) {
            return Xc.a.f53503h;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i10)));
    }

    static a h(a aVar, int i10) {
        a aVar2 = new a();
        int i11 = aVar.i();
        int i12 = (1 << i10) - 2;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                int i16 = i13 + i15;
                if (i16 >= i11 || aVar.h(i16)) {
                    i14 |= 1 << ((i10 - 1) - i15);
                }
            }
            int i17 = i14 & i12;
            if (i17 == i12) {
                aVar2.d(i17, i10);
            } else if (i17 == 0) {
                aVar2.d(i14 | 1, i10);
            } else {
                aVar2.d(i14, i10);
                i13 += i10;
            }
            i13--;
            i13 += i10;
        }
        return aVar2;
    }

    private static int i(int i10, boolean z10) {
        int i11;
        if (z10) {
            i11 = 88;
        } else {
            i11 = 112;
        }
        return (i11 + (i10 << 4)) * i10;
    }
}
