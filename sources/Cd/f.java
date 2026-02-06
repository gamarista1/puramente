package cd;

import Tc.h;
import Wc.c;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f53737a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f53738b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f53739c;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f53740d = new byte[128];

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f53741e = StandardCharsets.ISO_8859_1;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53742a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                cd.c[] r0 = cd.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53742a = r0
                cd.c r1 = cd.c.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53742a     // Catch:{ NoSuchFieldError -> 0x001d }
                cd.c r1 = cd.c.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53742a     // Catch:{ NoSuchFieldError -> 0x0028 }
                cd.c r1 = cd.c.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cd.f.a.<clinit>():void");
        }
    }

    static {
        int i10 = 0;
        byte[] bArr = new byte[128];
        f53739c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f53737a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f53739c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f53740d, (byte) -1);
        while (true) {
            byte[] bArr3 = f53738b;
            if (i10 < bArr3.length) {
                byte b11 = bArr3[i10];
                if (b11 > 0) {
                    f53740d[b11] = (byte) i10;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.lang.String r5, int r6, java.nio.charset.Charset r7) {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L_0x0009:
            if (r1 >= r0) goto L_0x0057
            char r2 = r5.charAt(r1)
            r3 = 0
        L_0x0010:
            r4 = 13
            if (r3 >= r4) goto L_0x0025
            boolean r2 = k(r2)
            if (r2 == 0) goto L_0x0025
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L_0x0025
            char r2 = r5.charAt(r2)
            goto L_0x0010
        L_0x0025:
            if (r3 < r4) goto L_0x0029
            int r1 = r1 - r6
            return r1
        L_0x0029:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L_0x0036
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0036:
            Tc.h r5 = new Tc.h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x0057:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.f.a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    private static int b(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        if (i10 < length) {
            char charAt = charSequence.charAt(i10);
            while (k(charAt) && i10 < length) {
                i11++;
                i10++;
                if (i10 < length) {
                    charAt = charSequence.charAt(i10);
                }
            }
        }
        return i11;
    }

    private static int c(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = i10;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            int i12 = 0;
            while (i12 < 13 && k(charAt) && i11 < length) {
                i12++;
                i11++;
                if (i11 < length) {
                    charAt = charSequence.charAt(i11);
                }
            }
            if (i12 < 13) {
                if (i12 <= 0) {
                    if (!n(charSequence.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
            } else {
                return (i11 - i10) - i12;
            }
        }
        return i11 - i10;
    }

    private static void d(byte[] bArr, int i10, int i11, int i12, StringBuilder sb2) {
        int i13;
        if (i11 == 1 && i12 == 0) {
            sb2.append(913);
        } else if (i11 % 6 == 0) {
            sb2.append(924);
        } else {
            sb2.append(901);
        }
        if (i11 >= 6) {
            char[] cArr = new char[5];
            i13 = i10;
            while ((i10 + i11) - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + ((long) (bArr[i13 + i14] & 255));
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) ((int) (j10 % 900));
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb2.append(cArr[i16]);
                }
                i13 += 6;
            }
        } else {
            i13 = i10;
        }
        while (i13 < i10 + i11) {
            sb2.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    static String e(String str, c cVar, Charset charset) {
        c a10;
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charset == null) {
            charset = f53741e;
        } else if (!f53741e.equals(charset) && (a10 = c.a(charset.name())) != null) {
            h(a10.b(), sb2);
        }
        int length = str.length();
        int i10 = a.f53742a[cVar.ordinal()];
        if (i10 == 1) {
            g(str, 0, length, sb2, 0);
        } else if (i10 == 2) {
            byte[] bytes = str.getBytes(charset);
            d(bytes, 0, bytes.length, 1, sb2);
        } else if (i10 != 3) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int b10 = b(str, i11);
                if (b10 >= 13) {
                    sb2.append(902);
                    f(str, i11, b10, sb2);
                    i11 += b10;
                    i12 = 0;
                    i13 = 2;
                } else {
                    int c10 = c(str, i11);
                    if (c10 >= 5 || b10 == length) {
                        if (i13 != 0) {
                            sb2.append(900);
                            i12 = 0;
                            i13 = 0;
                        }
                        i12 = g(str, i11, c10, sb2, i12);
                        i11 += c10;
                    } else {
                        int a11 = a(str, i11, charset);
                        if (a11 == 0) {
                            a11 = 1;
                        }
                        int i14 = a11 + i11;
                        byte[] bytes2 = str.substring(i11, i14).getBytes(charset);
                        if (bytes2.length == 1 && i13 == 0) {
                            d(bytes2, 0, 1, 0, sb2);
                        } else {
                            d(bytes2, 0, bytes2.length, i13, sb2);
                            i13 = 1;
                            i12 = 0;
                        }
                        i11 = i14;
                    }
                }
            }
        } else {
            sb2.append(902);
            f(str, 0, length, sb2);
        }
        return sb2.toString();
    }

    private static void f(String str, int i10, int i11, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int min = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder("1");
            int i13 = i10 + i12;
            sb4.append(str.substring(i13, i13 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i12 += min;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f4 A[EDGE_INSN: B:65:0x00f4->B:53:0x00f4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x000f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int g(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 0
            r5 = r20
            r6 = r4
        L_0x000f:
            int r7 = r17 + r6
            char r8 = r0.charAt(r7)
            r9 = 26
            r10 = 32
            r11 = 27
            r12 = 28
            r13 = 29
            r14 = 2
            r15 = 1
            if (r5 == 0) goto L_0x00be
            if (r5 == r15) goto L_0x0083
            if (r5 == r14) goto L_0x003c
            boolean r7 = m(r8)
            if (r7 == 0) goto L_0x0037
            byte[] r7 = f53740d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f0
        L_0x0037:
            r3.append(r13)
        L_0x003a:
            r5 = r4
            goto L_0x000f
        L_0x003c:
            boolean r9 = l(r8)
            if (r9 == 0) goto L_0x004c
            byte[] r7 = f53739c
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f0
        L_0x004c:
            boolean r9 = j(r8)
            if (r9 == 0) goto L_0x0056
            r3.append(r12)
            goto L_0x003a
        L_0x0056:
            boolean r9 = i(r8)
            if (r9 == 0) goto L_0x0061
            r3.append(r11)
        L_0x005f:
            r5 = r15
            goto L_0x000f
        L_0x0061:
            int r7 = r7 + 1
            if (r7 >= r1) goto L_0x0076
            char r7 = r0.charAt(r7)
            boolean r7 = m(r7)
            if (r7 == 0) goto L_0x0076
            r5 = 25
            r3.append(r5)
            r5 = 3
            goto L_0x000f
        L_0x0076:
            r3.append(r13)
            byte[] r7 = f53740d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f0
        L_0x0083:
            boolean r7 = i(r8)
            if (r7 == 0) goto L_0x0096
            if (r8 != r10) goto L_0x008f
            r3.append(r9)
            goto L_0x00f0
        L_0x008f:
            int r8 = r8 + -97
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x00f0
        L_0x0096:
            boolean r7 = j(r8)
            if (r7 == 0) goto L_0x00a6
            r3.append(r11)
            int r8 = r8 + -65
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x00f0
        L_0x00a6:
            boolean r7 = l(r8)
            if (r7 == 0) goto L_0x00b2
            r3.append(r12)
        L_0x00af:
            r5 = r14
            goto L_0x000f
        L_0x00b2:
            r3.append(r13)
            byte[] r7 = f53740d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x00f0
        L_0x00be:
            boolean r7 = j(r8)
            if (r7 == 0) goto L_0x00d1
            if (r8 != r10) goto L_0x00ca
            r3.append(r9)
            goto L_0x00f0
        L_0x00ca:
            int r8 = r8 + -65
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x00f0
        L_0x00d1:
            boolean r7 = i(r8)
            if (r7 == 0) goto L_0x00db
            r3.append(r11)
            goto L_0x005f
        L_0x00db:
            boolean r7 = l(r8)
            if (r7 == 0) goto L_0x00e5
            r3.append(r12)
            goto L_0x00af
        L_0x00e5:
            r3.append(r13)
            byte[] r7 = f53740d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
        L_0x00f0:
            int r6 = r6 + 1
            if (r6 < r1) goto L_0x000f
            int r0 = r3.length()
            r1 = r4
        L_0x00f9:
            if (r4 >= r0) goto L_0x0112
            int r6 = r4 % 2
            if (r6 == 0) goto L_0x010b
            int r1 = r1 * 30
            char r6 = r3.charAt(r4)
            int r1 = r1 + r6
            char r1 = (char) r1
            r2.append(r1)
            goto L_0x010f
        L_0x010b:
            char r1 = r3.charAt(r4)
        L_0x010f:
            int r4 = r4 + 1
            goto L_0x00f9
        L_0x0112:
            int r0 = r0 % r14
            if (r0 == 0) goto L_0x011c
            int r1 = r1 * 30
            int r1 = r1 + r13
            char r0 = (char) r1
            r2.append(r0)
        L_0x011c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cd.f.g(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    private static void h(int i10, StringBuilder sb2) {
        if (i10 >= 0 && i10 < 900) {
            sb2.append(927);
            sb2.append((char) i10);
        } else if (i10 < 810900) {
            sb2.append(926);
            sb2.append((char) ((i10 / 900) - 1));
            sb2.append((char) (i10 % 900));
        } else if (i10 < 811800) {
            sb2.append(925);
            sb2.append((char) (810900 - i10));
        } else {
            throw new h("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i10)));
        }
    }

    private static boolean i(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < 'a' || c10 > 'z') {
            return false;
        }
        return true;
    }

    private static boolean j(char c10) {
        if (c10 == ' ') {
            return true;
        }
        if (c10 < 'A' || c10 > 'Z') {
            return false;
        }
        return true;
    }

    private static boolean k(char c10) {
        if (c10 < '0' || c10 > '9') {
            return false;
        }
        return true;
    }

    private static boolean l(char c10) {
        if (f53739c[c10] != -1) {
            return true;
        }
        return false;
    }

    private static boolean m(char c10) {
        if (f53740d[c10] != -1) {
            return true;
        }
        return false;
    }

    private static boolean n(char c10) {
        if (c10 == 9 || c10 == 10 || c10 == 13) {
            return true;
        }
        if (c10 < ' ' || c10 > '~') {
            return false;
        }
        return true;
    }
}
