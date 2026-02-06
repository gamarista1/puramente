package pg;

abstract class x {
    private static int a(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    private static int b(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    private static int c(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    private static int d(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return a(b10);
        }
        if (i12 == 1) {
            return b(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return c(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static boolean f(byte[] bArr, int i10, int i11) {
        if (h(bArr, i10, i11) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        if (r7[r8] > -65) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0083, code lost:
        if (r7[r6] > -65) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r7[r8] > -65) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L_0x0086
            if (r8 < r9) goto L_0x0005
            return r6
        L_0x0005:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L_0x001c
            r6 = -62
            if (r0 < r6) goto L_0x001b
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r8 <= r3) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            r8 = r6
            goto L_0x0086
        L_0x001b:
            return r2
        L_0x001c:
            r4 = -16
            if (r0 >= r4) goto L_0x0049
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L_0x0034
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r6 < r9) goto L_0x0031
            int r6 = b(r0, r8)
            return r6
        L_0x0031:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0034:
            if (r6 > r3) goto L_0x0048
            r4 = -96
            if (r0 != r1) goto L_0x003c
            if (r6 < r4) goto L_0x0048
        L_0x003c:
            r1 = -19
            if (r0 != r1) goto L_0x0042
            if (r6 >= r4) goto L_0x0048
        L_0x0042:
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r8 <= r3) goto L_0x0018
        L_0x0048:
            return r2
        L_0x0049:
            int r1 = r6 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            if (r1 != 0) goto L_0x005c
            int r6 = r8 + 1
            byte r1 = r7[r8]
            if (r6 < r9) goto L_0x005a
            int r6 = b(r0, r1)
            return r6
        L_0x005a:
            r8 = 0
            goto L_0x0062
        L_0x005c:
            int r6 = r6 >> 16
            byte r6 = (byte) r6
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0062:
            if (r8 != 0) goto L_0x0072
            int r8 = r6 + 1
            byte r6 = r7[r6]
            if (r8 < r9) goto L_0x006f
            int r6 = c(r0, r1, r6)
            return r6
        L_0x006f:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0072:
            if (r1 > r3) goto L_0x0085
            int r0 = r0 << 28
            int r1 = r1 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L_0x0085
            if (r8 > r3) goto L_0x0085
            int r8 = r6 + 1
            byte r6 = r7[r6]
            if (r6 <= r3) goto L_0x0086
        L_0x0085:
            return r2
        L_0x0086:
            int r6 = h(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.x.g(int, byte[], int, int):int");
    }

    public static int h(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        return i(bArr, i10, i11);
    }

    private static int i(byte[] bArr, int i10, int i11) {
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                i10 = i12;
            } else if (b10 < -32) {
                if (i12 >= i11) {
                    return b10;
                }
                if (b10 >= -62) {
                    i10 += 2;
                    if (bArr[i12] > -65) {
                    }
                }
                return -1;
            } else if (b10 < -16) {
                if (i12 >= i11 - 1) {
                    return d(bArr, i12, i11);
                }
                int i13 = i10 + 2;
                byte b11 = bArr[i12];
                if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                    i10 += 3;
                    if (bArr[i13] > -65) {
                    }
                }
                return -1;
            } else if (i12 >= i11 - 2) {
                return d(bArr, i12, i11);
            } else {
                int i14 = i10 + 2;
                byte b12 = bArr[i12];
                if (b12 <= -65 && (((b10 << 28) + (b12 + 112)) >> 30) == 0) {
                    int i15 = i10 + 3;
                    if (bArr[i14] <= -65) {
                        i10 += 4;
                        if (bArr[i15] > -65) {
                        }
                    }
                }
                return -1;
            }
        }
        return 0;
    }
}
