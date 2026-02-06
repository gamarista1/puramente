package Fe;

import java.io.UnsupportedEncodingException;

/* renamed from: Fe.d  reason: case insensitive filesystem */
abstract class C3015d {

    /* renamed from: Fe.d$a */
    static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f31021a;

        /* renamed from: b  reason: collision with root package name */
        public int f31022b;

        a() {
        }
    }

    /* renamed from: Fe.d$b */
    static class b extends a {

        /* renamed from: f  reason: collision with root package name */
        private static final int[] f31023f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g  reason: collision with root package name */
        private static final int[] f31024g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c  reason: collision with root package name */
        private int f31025c;

        /* renamed from: d  reason: collision with root package name */
        private int f31026d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f31027e;

        public b(int i10, byte[] bArr) {
            int[] iArr;
            this.f31021a = bArr;
            if ((i10 & 8) == 0) {
                iArr = f31023f;
            } else {
                iArr = f31024g;
            }
            this.f31027e = iArr;
            this.f31025c = 0;
            this.f31026d = 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:73:0x00eb A[EDGE_INSN: B:73:0x00eb->B:54:0x00eb ?: BREAK  , SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(byte[] r17, int r18, int r19, boolean r20) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f31025c
                r2 = 0
                r3 = 6
                if (r1 != r3) goto L_0x0009
                return r2
            L_0x0009:
                int r4 = r19 + r18
                int r5 = r0.f31026d
                byte[] r6 = r0.f31021a
                int[] r7 = r0.f31027e
                r9 = r2
                r8 = r5
                r5 = r1
                r1 = r18
            L_0x0016:
                r10 = 3
                r11 = 4
                r12 = 2
                r13 = 1
                if (r1 >= r4) goto L_0x00eb
                if (r5 != 0) goto L_0x0063
            L_0x001e:
                int r14 = r1 + 4
                if (r14 > r4) goto L_0x005f
                byte r8 = r17[r1]
                r8 = r8 & 255(0xff, float:3.57E-43)
                r8 = r7[r8]
                int r8 = r8 << 18
                int r15 = r1 + 1
                byte r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                int r15 = r15 << 12
                r8 = r8 | r15
                int r15 = r1 + 2
                byte r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                int r15 = r15 << r3
                r8 = r8 | r15
                int r15 = r1 + 3
                byte r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                r8 = r8 | r15
                if (r8 < 0) goto L_0x005f
                int r1 = r9 + 2
                byte r15 = (byte) r8
                r6[r1] = r15
                int r1 = r9 + 1
                int r15 = r8 >> 8
                byte r15 = (byte) r15
                r6[r1] = r15
                int r1 = r8 >> 16
                byte r1 = (byte) r1
                r6[r9] = r1
                int r9 = r9 + 3
                r1 = r14
                goto L_0x001e
            L_0x005f:
                if (r1 < r4) goto L_0x0063
                goto L_0x00eb
            L_0x0063:
                int r14 = r1 + 1
                byte r1 = r17[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                r1 = r7[r1]
                r15 = -1
                if (r5 == 0) goto L_0x00e0
                if (r5 == r13) goto L_0x00d8
                r13 = -2
                if (r5 == r12) goto L_0x00be
                r12 = 5
                if (r5 == r10) goto L_0x008c
                if (r5 == r11) goto L_0x0081
                if (r5 == r12) goto L_0x007c
                goto L_0x00e8
            L_0x007c:
                if (r1 == r15) goto L_0x00e8
                r0.f31025c = r3
                return r2
            L_0x0081:
                if (r1 != r13) goto L_0x0087
                int r5 = r5 + 1
                goto L_0x00e8
            L_0x0087:
                if (r1 == r15) goto L_0x00e8
                r0.f31025c = r3
                return r2
            L_0x008c:
                if (r1 < 0) goto L_0x00a7
                int r5 = r8 << 6
                r1 = r1 | r5
                int r5 = r9 + 2
                byte r8 = (byte) r1
                r6[r5] = r8
                int r5 = r9 + 1
                int r8 = r1 >> 8
                byte r8 = (byte) r8
                r6[r5] = r8
                int r5 = r1 >> 16
                byte r5 = (byte) r5
                r6[r9] = r5
                int r9 = r9 + 3
                r8 = r1
                r5 = r2
                goto L_0x00e8
            L_0x00a7:
                if (r1 != r13) goto L_0x00b9
                int r1 = r9 + 1
                int r5 = r8 >> 2
                byte r5 = (byte) r5
                r6[r1] = r5
                int r1 = r8 >> 10
                byte r1 = (byte) r1
                r6[r9] = r1
                int r9 = r9 + 2
                r5 = r12
                goto L_0x00e8
            L_0x00b9:
                if (r1 == r15) goto L_0x00e8
                r0.f31025c = r3
                return r2
            L_0x00be:
                if (r1 < 0) goto L_0x00c7
            L_0x00c0:
                int r8 = r8 << 6
                r1 = r1 | r8
            L_0x00c3:
                int r5 = r5 + 1
                r8 = r1
                goto L_0x00e8
            L_0x00c7:
                if (r1 != r13) goto L_0x00d3
                int r1 = r9 + 1
                int r5 = r8 >> 4
                byte r5 = (byte) r5
                r6[r9] = r5
                r9 = r1
                r5 = r11
                goto L_0x00e8
            L_0x00d3:
                if (r1 == r15) goto L_0x00e8
                r0.f31025c = r3
                return r2
            L_0x00d8:
                if (r1 < 0) goto L_0x00db
                goto L_0x00c0
            L_0x00db:
                if (r1 == r15) goto L_0x00e8
                r0.f31025c = r3
                return r2
            L_0x00e0:
                if (r1 < 0) goto L_0x00e3
                goto L_0x00c3
            L_0x00e3:
                if (r1 == r15) goto L_0x00e8
                r0.f31025c = r3
                return r2
            L_0x00e8:
                r1 = r14
                goto L_0x0016
            L_0x00eb:
                if (r20 != 0) goto L_0x00f4
                r0.f31025c = r5
                r0.f31026d = r8
                r0.f31022b = r9
                return r13
            L_0x00f4:
                if (r5 == r13) goto L_0x011c
                if (r5 == r12) goto L_0x010f
                if (r5 == r10) goto L_0x0100
                if (r5 == r11) goto L_0x00fd
                goto L_0x0117
            L_0x00fd:
                r0.f31025c = r3
                return r2
            L_0x0100:
                int r1 = r9 + 1
                int r2 = r8 >> 10
                byte r2 = (byte) r2
                r6[r9] = r2
                int r9 = r9 + 2
                int r2 = r8 >> 2
                byte r2 = (byte) r2
                r6[r1] = r2
                goto L_0x0117
            L_0x010f:
                int r1 = r9 + 1
                int r2 = r8 >> 4
                byte r2 = (byte) r2
                r6[r9] = r2
                r9 = r1
            L_0x0117:
                r0.f31025c = r5
                r0.f31022b = r9
                return r13
            L_0x011c:
                r0.f31025c = r3
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: Fe.C3015d.b.a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: Fe.d$c */
    static class c extends a {

        /* renamed from: j  reason: collision with root package name */
        private static final byte[] f31028j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k  reason: collision with root package name */
        private static final byte[] f31029k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f31030c;

        /* renamed from: d  reason: collision with root package name */
        int f31031d;

        /* renamed from: e  reason: collision with root package name */
        private int f31032e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f31033f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f31034g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f31035h;

        /* renamed from: i  reason: collision with root package name */
        private final byte[] f31036i;

        public c(int i10, byte[] bArr) {
            boolean z10;
            boolean z11;
            byte[] bArr2;
            int i11;
            this.f31021a = bArr;
            boolean z12 = true;
            if ((i10 & 1) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f31033f = z10;
            if ((i10 & 2) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f31034g = z11;
            this.f31035h = (i10 & 4) == 0 ? false : z12;
            if ((i10 & 8) == 0) {
                bArr2 = f31028j;
            } else {
                bArr2 = f31029k;
            }
            this.f31036i = bArr2;
            this.f31030c = new byte[2];
            this.f31031d = 0;
            if (z11) {
                i11 = 19;
            } else {
                i11 = -1;
            }
            this.f31032e = i11;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01b3  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00e6 A[SYNTHETIC] */
        public boolean a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                r17 = this;
                r0 = r17
                byte[] r1 = r0.f31036i
                byte[] r2 = r0.f31021a
                int r3 = r0.f31032e
                int r4 = r20 + r19
                int r5 = r0.f31031d
                r6 = 2
                r7 = 1
                r8 = 0
                r9 = -1
                if (r5 == r7) goto L_0x0031
                if (r5 == r6) goto L_0x0015
                goto L_0x0050
            L_0x0015:
                int r5 = r19 + 1
                if (r5 > r4) goto L_0x0050
                byte[] r10 = r0.f31030c
                byte r11 = r10[r8]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 16
                byte r10 = r10[r7]
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r10 = r10 << 8
                r10 = r10 | r11
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r10 = r10 | r11
                r0.f31031d = r8
                r11 = r5
                goto L_0x0053
            L_0x0031:
                int r5 = r19 + 2
                if (r5 > r4) goto L_0x0050
                byte[] r5 = r0.f31030c
                byte r5 = r5[r8]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 16
                int r10 = r19 + 1
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 8
                r5 = r5 | r11
                int r11 = r19 + 2
                byte r10 = r18[r10]
                r10 = r10 & 255(0xff, float:3.57E-43)
                r10 = r10 | r5
                r0.f31031d = r8
                goto L_0x0053
            L_0x0050:
                r11 = r19
                r10 = r9
            L_0x0053:
                r12 = 13
                r13 = 4
                r14 = 10
                if (r10 == r9) goto L_0x008f
                int r9 = r10 >> 18
                r9 = r9 & 63
                byte r9 = r1[r9]
                r2[r8] = r9
                int r9 = r10 >> 12
                r9 = r9 & 63
                byte r9 = r1[r9]
                r2[r7] = r9
                int r9 = r10 >> 6
                r9 = r9 & 63
                byte r9 = r1[r9]
                r2[r6] = r9
                r9 = r10 & 63
                byte r9 = r1[r9]
                r10 = 3
                r2[r10] = r9
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x008d
                boolean r3 = r0.f31035h
                if (r3 == 0) goto L_0x0085
                r2[r13] = r12
                r3 = 5
                goto L_0x0086
            L_0x0085:
                r3 = r13
            L_0x0086:
                int r9 = r3 + 1
                r2[r3] = r14
            L_0x008a:
                r3 = 19
                goto L_0x0090
            L_0x008d:
                r9 = r13
                goto L_0x0090
            L_0x008f:
                r9 = r8
            L_0x0090:
                int r10 = r11 + 3
                if (r10 > r4) goto L_0x00e6
                byte r15 = r18[r11]
                r15 = r15 & 255(0xff, float:3.57E-43)
                int r15 = r15 << 16
                int r16 = r11 + 1
                byte r5 = r18[r16]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 8
                r5 = r5 | r15
                int r11 = r11 + 2
                byte r11 = r18[r11]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r5 = r5 | r11
                int r11 = r5 >> 18
                r11 = r11 & 63
                byte r11 = r1[r11]
                r2[r9] = r11
                int r11 = r9 + 1
                int r15 = r5 >> 12
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r9 + 2
                int r15 = r5 >> 6
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r9 + 3
                r5 = r5 & 63
                byte r5 = r1[r5]
                r2[r11] = r5
                int r5 = r9 + 4
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x00e3
                boolean r3 = r0.f31035h
                if (r3 == 0) goto L_0x00dd
                int r9 = r9 + 5
                r2[r5] = r12
                r5 = r9
            L_0x00dd:
                int r9 = r5 + 1
                r2[r5] = r14
                r11 = r10
                goto L_0x008a
            L_0x00e3:
                r9 = r5
                r11 = r10
                goto L_0x0090
            L_0x00e6:
                if (r21 == 0) goto L_0x01b3
                int r5 = r0.f31031d
                int r10 = r11 - r5
                int r15 = r4 + -1
                r16 = 61
                if (r10 != r15) goto L_0x0136
                if (r5 <= 0) goto L_0x00fa
                byte[] r4 = r0.f31030c
                byte r4 = r4[r8]
                r8 = r7
                goto L_0x00fc
            L_0x00fa:
                byte r4 = r18[r11]
            L_0x00fc:
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << r13
                int r5 = r5 - r8
                r0.f31031d = r5
                int r5 = r9 + 1
                int r6 = r4 >> 6
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r9] = r6
                int r6 = r9 + 2
                r4 = r4 & 63
                byte r1 = r1[r4]
                r2[r5] = r1
                boolean r1 = r0.f31033f
                if (r1 == 0) goto L_0x0120
                int r1 = r9 + 3
                r2[r6] = r16
                int r6 = r9 + 4
                r2[r1] = r16
            L_0x0120:
                boolean r1 = r0.f31034g
                if (r1 == 0) goto L_0x0133
                boolean r1 = r0.f31035h
                if (r1 == 0) goto L_0x012d
                int r1 = r6 + 1
                r2[r6] = r12
                r6 = r1
            L_0x012d:
                int r1 = r6 + 1
                r2[r6] = r14
                goto L_0x01b1
            L_0x0133:
                r9 = r6
                goto L_0x01db
            L_0x0136:
                int r10 = r11 - r5
                int r4 = r4 - r6
                if (r10 != r4) goto L_0x019a
                if (r5 <= r7) goto L_0x0143
                byte[] r4 = r0.f31030c
                byte r4 = r4[r8]
                r8 = r7
                goto L_0x0149
            L_0x0143:
                int r4 = r11 + 1
                byte r10 = r18[r11]
                r11 = r4
                r4 = r10
            L_0x0149:
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << r14
                if (r5 <= 0) goto L_0x0155
                byte[] r10 = r0.f31030c
                int r11 = r8 + 1
                byte r8 = r10[r8]
                goto L_0x0159
            L_0x0155:
                byte r10 = r18[r11]
                r11 = r8
                r8 = r10
            L_0x0159:
                r8 = r8 & 255(0xff, float:3.57E-43)
                int r6 = r8 << 2
                r4 = r4 | r6
                int r5 = r5 - r11
                r0.f31031d = r5
                int r5 = r9 + 1
                int r6 = r4 >> 12
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r9] = r6
                int r6 = r9 + 2
                int r8 = r4 >> 6
                r8 = r8 & 63
                byte r8 = r1[r8]
                r2[r5] = r8
                int r5 = r9 + 3
                r4 = r4 & 63
                byte r1 = r1[r4]
                r2[r6] = r1
                boolean r1 = r0.f31033f
                if (r1 == 0) goto L_0x0186
                int r9 = r9 + 4
                r2[r5] = r16
                r5 = r9
            L_0x0186:
                boolean r1 = r0.f31034g
                if (r1 == 0) goto L_0x0198
                boolean r1 = r0.f31035h
                if (r1 == 0) goto L_0x0193
                int r1 = r5 + 1
                r2[r5] = r12
                r5 = r1
            L_0x0193:
                int r1 = r5 + 1
                r2[r5] = r14
                goto L_0x01b1
            L_0x0198:
                r9 = r5
                goto L_0x01db
            L_0x019a:
                boolean r1 = r0.f31034g
                if (r1 == 0) goto L_0x01db
                if (r9 <= 0) goto L_0x01db
                r1 = 19
                if (r3 == r1) goto L_0x01db
                boolean r1 = r0.f31035h
                if (r1 == 0) goto L_0x01ad
                int r1 = r9 + 1
                r2[r9] = r12
                r9 = r1
            L_0x01ad:
                int r1 = r9 + 1
                r2[r9] = r14
            L_0x01b1:
                r9 = r1
                goto L_0x01db
            L_0x01b3:
                int r1 = r4 + -1
                if (r11 != r1) goto L_0x01c4
                byte[] r1 = r0.f31030c
                int r2 = r0.f31031d
                int r4 = r2 + 1
                r0.f31031d = r4
                byte r4 = r18[r11]
                r1[r2] = r4
                goto L_0x01db
            L_0x01c4:
                int r4 = r4 - r6
                if (r11 != r4) goto L_0x01db
                byte[] r1 = r0.f31030c
                int r2 = r0.f31031d
                int r4 = r2 + 1
                r0.f31031d = r4
                byte r5 = r18[r11]
                r1[r2] = r5
                int r2 = r2 + r6
                r0.f31031d = r2
                int r11 = r11 + r7
                byte r2 = r18[r11]
                r1[r4] = r2
            L_0x01db:
                r0.f31022b = r9
                r0.f31032e = r3
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Fe.C3015d.c.a(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] a(byte[] bArr, int i10) {
        return b(bArr, 0, bArr.length, i10);
    }

    public static byte[] b(byte[] bArr, int i10, int i11, int i12) {
        b bVar = new b(i12, new byte[((i11 * 3) / 4)]);
        if (bVar.a(bArr, i10, i11, true)) {
            int i13 = bVar.f31022b;
            byte[] bArr2 = bVar.f31021a;
            if (i13 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i13];
            System.arraycopy(bArr2, 0, bArr3, 0, i13);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] c(byte[] bArr, int i10) {
        return d(bArr, 0, bArr.length, i10);
    }

    public static byte[] d(byte[] bArr, int i10, int i11, int i12) {
        c cVar = new c(i12, (byte[]) null);
        int i13 = (i11 / 3) * 4;
        int i14 = 2;
        if (!cVar.f31033f) {
            int i15 = i11 % 3;
            if (i15 == 1) {
                i13 += 2;
            } else if (i15 == 2) {
                i13 += 3;
            }
        } else if (i11 % 3 > 0) {
            i13 += 4;
        }
        if (cVar.f31034g && i11 > 0) {
            int i16 = ((i11 - 1) / 57) + 1;
            if (!cVar.f31035h) {
                i14 = 1;
            }
            i13 += i16 * i14;
        }
        cVar.f31021a = new byte[i13];
        cVar.a(bArr, i10, i11, true);
        return cVar.f31021a;
    }

    public static String e(byte[] bArr, int i10) {
        try {
            return new String(c(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
