package m9;

public abstract class D {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f46538a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f46539b = {44100, 48000, 32000};
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f46540c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f46541d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f46542e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f46543f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f46544g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f46545a;

        /* renamed from: b  reason: collision with root package name */
        public String f46546b;

        /* renamed from: c  reason: collision with root package name */
        public int f46547c;

        /* renamed from: d  reason: collision with root package name */
        public int f46548d;

        /* renamed from: e  reason: collision with root package name */
        public int f46549e;

        /* renamed from: f  reason: collision with root package name */
        public int f46550f;

        /* renamed from: g  reason: collision with root package name */
        public int f46551g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            if (!D.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f46545a = i11;
            this.f46546b = D.f46538a[3 - i12];
            int i17 = D.f46539b[i14];
            this.f46548d = i17;
            int i18 = 2;
            if (i11 == 2) {
                this.f46548d = i17 / 2;
            } else if (i11 == 0) {
                this.f46548d = i17 / 4;
            }
            int i19 = (i10 >>> 9) & 1;
            this.f46551g = D.k(i11, i12);
            if (i12 == 3) {
                if (i11 == 3) {
                    i16 = D.f46540c[i13 - 1];
                } else {
                    i16 = D.f46541d[i13 - 1];
                }
                this.f46550f = i16;
                this.f46547c = (((i16 * 12) / this.f46548d) + i19) * 4;
            } else {
                int i20 = 144;
                if (i11 == 3) {
                    if (i12 == 2) {
                        i15 = D.f46542e[i13 - 1];
                    } else {
                        i15 = D.f46543f[i13 - 1];
                    }
                    this.f46550f = i15;
                    this.f46547c = ((i15 * 144) / this.f46548d) + i19;
                } else {
                    int i21 = D.f46544g[i13 - 1];
                    this.f46550f = i21;
                    if (i12 == 1) {
                        i20 = 72;
                    }
                    this.f46547c = ((i20 * i21) / this.f46548d) + i19;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i18 = 1;
            }
            this.f46549e = i18;
            return true;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = f46539b[i14];
        if (i11 == 2) {
            i17 /= 2;
        } else if (i11 == 0) {
            i17 /= 4;
        }
        int i18 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = f46540c[i13 - 1];
            } else {
                i16 = f46541d[i13 - 1];
            }
            return (((i16 * 12) / i17) + i18) * 4;
        }
        if (i11 != 3) {
            i15 = f46544g[i13 - 1];
        } else if (i12 == 2) {
            i15 = f46542e[i13 - 1];
        } else {
            i15 = f46543f[i13 - 1];
        }
        int i19 = 144;
        if (i11 == 3) {
            return ((i15 * 144) / i17) + i18;
        }
        if (i12 == 1) {
            i19 = 72;
        }
        return ((i19 * i15) / i17) + i18;
    }

    /* access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                return 1152;
            }
            if (i11 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else if (i10 == 3) {
            return 1152;
        } else {
            return 576;
        }
    }

    /* access modifiers changed from: private */
    public static boolean l(int i10) {
        if ((i10 & -2097152) == -2097152) {
            return true;
        }
        return false;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
