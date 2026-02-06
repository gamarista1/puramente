package fd;

import Tc.h;
import com.google.android.gms.common.api.a;
import ed.C4951a;
import ed.C4952b;
import ed.C4953c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f60536a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f60537a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                ed.b[] r0 = ed.C4952b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f60537a = r0
                ed.b r1 = ed.C4952b.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f60537a     // Catch:{ NoSuchFieldError -> 0x001d }
                ed.b r1 = ed.C4952b.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f60537a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ed.b r1 = ed.C4952b.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f60537a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ed.b r1 = ed.C4952b.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fd.c.a.<clinit>():void");
        }
    }

    static void a(String str, Wc.a aVar, String str2) {
        try {
            for (byte d10 : str.getBytes(str2)) {
                aVar.d(d10, 8);
            }
        } catch (UnsupportedEncodingException e10) {
            throw new h((Throwable) e10);
        }
    }

    static void b(CharSequence charSequence, Wc.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int p10 = p(charSequence.charAt(i10));
            if (p10 != -1) {
                int i11 = i10 + 1;
                if (i11 < length) {
                    int p11 = p(charSequence.charAt(i11));
                    if (p11 != -1) {
                        aVar.d((p10 * 45) + p11, 11);
                        i10 += 2;
                    } else {
                        throw new h();
                    }
                } else {
                    aVar.d(p10, 6);
                    i10 = i11;
                }
            } else {
                throw new h();
            }
        }
    }

    static void c(String str, C4952b bVar, Wc.a aVar, String str2) {
        int i10 = a.f60537a[bVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
        } else if (i10 == 2) {
            b(str, aVar);
        } else if (i10 == 3) {
            a(str, aVar, str2);
        } else if (i10 == 4) {
            e(str, aVar);
        } else {
            throw new h("Invalid mode: ".concat(String.valueOf(bVar)));
        }
    }

    private static void d(Wc.c cVar, Wc.a aVar) {
        aVar.d(C4952b.ECI.a(), 4);
        aVar.d(cVar.b(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void e(java.lang.String r6, Wc.a r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = r4
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.d(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            Tc.h r6 = new Tc.h
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            Tc.h r7 = new Tc.h
            r7.<init>((java.lang.Throwable) r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.c.e(java.lang.String, Wc.a):void");
    }

    static void f(int i10, C4953c cVar, C4952b bVar, Wc.a aVar) {
        int b10 = bVar.b(cVar);
        int i11 = 1 << b10;
        if (i10 < i11) {
            aVar.d(i10, b10);
            return;
        }
        throw new h(i10 + " is bigger than " + (i11 - 1));
    }

    static void g(C4952b bVar, Wc.a aVar) {
        aVar.d(bVar.a(), 4);
    }

    static void h(CharSequence charSequence, Wc.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.d((charAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.d((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.d(charAt, 4);
                }
            }
        }
    }

    private static int i(C4952b bVar, Wc.a aVar, Wc.a aVar2, C4953c cVar) {
        return aVar.i() + bVar.b(cVar) + aVar2.i();
    }

    private static int j(C4990b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(Wc.a aVar, C4951a aVar2, C4953c cVar, C4990b bVar) {
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, aVar2, cVar, i12, bVar);
            int j10 = j(bVar);
            if (j10 < i10) {
                i11 = i12;
                i10 = j10;
            }
        }
        return i11;
    }

    private static C4952b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return C4952b.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else if (p(charAt) == -1) {
                return C4952b.BYTE;
            } else {
                z10 = true;
            }
        }
        if (z10) {
            return C4952b.ALPHANUMERIC;
        }
        if (z11) {
            return C4952b.NUMERIC;
        }
        return C4952b.BYTE;
    }

    private static C4953c m(int i10, C4951a aVar) {
        for (int i11 = 1; i11 <= 40; i11++) {
            C4953c e10 = C4953c.e(i11);
            if (v(i10, e10, aVar)) {
                return e10;
            }
        }
        throw new h("Data too big");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static fd.f n(java.lang.String r6, ed.C4951a r7, java.util.Map r8) {
        /*
            if (r8 == 0) goto L_0x000c
            Tc.c r0 = Tc.c.CHARACTER_SET
            boolean r0 = r8.containsKey(r0)
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 == 0) goto L_0x001a
            Tc.c r1 = Tc.c.CHARACTER_SET
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            goto L_0x001c
        L_0x001a:
            java.lang.String r1 = "ISO-8859-1"
        L_0x001c:
            ed.b r2 = l(r6, r1)
            Wc.a r3 = new Wc.a
            r3.<init>()
            ed.b r4 = ed.C4952b.BYTE
            if (r2 != r4) goto L_0x0034
            if (r0 == 0) goto L_0x0034
            Wc.c r0 = Wc.c.a(r1)
            if (r0 == 0) goto L_0x0034
            d(r0, r3)
        L_0x0034:
            if (r8 == 0) goto L_0x0055
            Tc.c r0 = Tc.c.GS1_FORMAT
            boolean r5 = r8.containsKey(r0)
            if (r5 == 0) goto L_0x0055
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0055
            ed.b r0 = ed.C4952b.FNC1_FIRST_POSITION
            g(r0, r3)
        L_0x0055:
            g(r2, r3)
            Wc.a r0 = new Wc.a
            r0.<init>()
            c(r6, r2, r0, r1)
            if (r8 == 0) goto L_0x008d
            Tc.c r1 = Tc.c.QR_VERSION
            boolean r5 = r8.containsKey(r1)
            if (r5 == 0) goto L_0x008d
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = r8.toString()
            int r8 = java.lang.Integer.parseInt(r8)
            ed.c r8 = ed.C4953c.e(r8)
            int r1 = i(r2, r3, r0, r8)
            boolean r1 = v(r1, r8, r7)
            if (r1 == 0) goto L_0x0085
            goto L_0x0091
        L_0x0085:
            Tc.h r6 = new Tc.h
            java.lang.String r7 = "Data too big for requested version"
            r6.<init>((java.lang.String) r7)
            throw r6
        L_0x008d:
            ed.c r8 = t(r7, r2, r3, r0)
        L_0x0091:
            Wc.a r1 = new Wc.a
            r1.<init>()
            r1.c(r3)
            if (r2 != r4) goto L_0x00a0
            int r6 = r0.j()
            goto L_0x00a4
        L_0x00a0:
            int r6 = r6.length()
        L_0x00a4:
            f(r6, r8, r2, r1)
            r1.c(r0)
            ed.c$b r6 = r8.c(r7)
            int r0 = r8.d()
            int r3 = r6.d()
            int r0 = r0 - r3
            u(r0, r1)
            int r3 = r8.d()
            int r6 = r6.c()
            Wc.a r6 = r(r1, r3, r0, r6)
            fd.f r0 = new fd.f
            r0.<init>()
            r0.c(r7)
            r0.f(r2)
            r0.g(r8)
            int r1 = r8.b()
            fd.b r2 = new fd.b
            r2.<init>(r1, r1)
            int r1 = k(r6, r7, r8, r2)
            r0.d(r1)
            fd.e.a(r6, r7, r8, r1, r2)
            r0.e(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.c.n(java.lang.String, ed.a, java.util.Map):fd.f");
    }

    static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[(length + i10)];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new Xc.c(Xc.a.f53507l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    static int p(int i10) {
        int[] iArr = f60536a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 < i12) {
            int i14 = i10 % i12;
            int i15 = i12 - i14;
            int i16 = i10 / i12;
            int i17 = i16 + 1;
            int i18 = i11 / i12;
            int i19 = i18 + 1;
            int i20 = i16 - i18;
            int i21 = i17 - i19;
            if (i20 != i21) {
                throw new h("EC bytes mismatch");
            } else if (i12 != i15 + i14) {
                throw new h("RS blocks mismatch");
            } else if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
                throw new h("Total bytes mismatch");
            } else if (i13 < i15) {
                iArr[0] = i18;
                iArr2[0] = i20;
            } else {
                iArr[0] = i19;
                iArr2[0] = i21;
            }
        } else {
            throw new h("Block ID too large");
        }
    }

    static Wc.a r(Wc.a aVar, int i10, int i11, int i12) {
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        if (aVar.j() == i14) {
            ArrayList<C4989a> arrayList = new ArrayList<>(i15);
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q(i10, i11, i12, i19, iArr, iArr2);
                int i20 = iArr[0];
                byte[] bArr = new byte[i20];
                aVar.l(i16 << 3, bArr, 0, i20);
                byte[] o10 = o(bArr, iArr2[0]);
                arrayList.add(new C4989a(bArr, o10));
                i17 = Math.max(i17, i20);
                i18 = Math.max(i18, o10.length);
                i16 += iArr[0];
            }
            if (i14 == i16) {
                Wc.a aVar2 = new Wc.a();
                for (int i21 = 0; i21 < i17; i21++) {
                    for (C4989a a10 : arrayList) {
                        byte[] a11 = a10.a();
                        if (i21 < a11.length) {
                            aVar2.d(a11[i21], 8);
                        }
                    }
                }
                for (int i22 = 0; i22 < i18; i22++) {
                    for (C4989a b10 : arrayList) {
                        byte[] b11 = b10.b();
                        if (i22 < b11.length) {
                            aVar2.d(b11[i22], 8);
                        }
                    }
                }
                if (i13 == aVar2.j()) {
                    return aVar2;
                }
                throw new h("Interleaving error: " + i13 + " and " + aVar2.j() + " differ.");
            }
            throw new h("Data bytes does not match offset");
        }
        throw new h("Number of bits and data bytes does not match");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10 += 2) {
                byte b10 = bytes[i10] & 255;
                if ((b10 < 129 || b10 > 159) && (b10 < 224 || b10 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static C4953c t(C4951a aVar, C4952b bVar, Wc.a aVar2, Wc.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, C4953c.e(1)), aVar)), aVar);
    }

    static void u(int i10, Wc.a aVar) {
        int i11;
        int i12 = i10 << 3;
        if (aVar.i() <= i12) {
            for (int i13 = 0; i13 < 4 && aVar.i() < i12; i13++) {
                aVar.a(false);
            }
            int i14 = aVar.i() & 7;
            if (i14 > 0) {
                while (i14 < 8) {
                    aVar.a(false);
                    i14++;
                }
            }
            int j10 = i10 - aVar.j();
            for (int i15 = 0; i15 < j10; i15++) {
                if ((i15 & 1) == 0) {
                    i11 = 236;
                } else {
                    i11 = 17;
                }
                aVar.d(i11, 8);
            }
            if (aVar.i() != i12) {
                throw new h("Bits size does not equal capacity");
            }
            return;
        }
        throw new h("data bits cannot fit in the QR Code" + aVar.i() + " > " + i12);
    }

    private static boolean v(int i10, C4953c cVar, C4951a aVar) {
        if (cVar.d() - cVar.c(aVar).d() >= (i10 + 7) / 8) {
            return true;
        }
        return false;
    }
}
