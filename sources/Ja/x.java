package ja;

import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f45063a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f45064b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    private static final Object f45065c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static int[] f45066d = new int[10];

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f45067a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f45068b;

        /* renamed from: c  reason: collision with root package name */
        public final int f45069c;

        /* renamed from: d  reason: collision with root package name */
        public final int f45070d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f45071e;

        /* renamed from: f  reason: collision with root package name */
        public final int f45072f;

        /* renamed from: g  reason: collision with root package name */
        public final int f45073g;

        /* renamed from: h  reason: collision with root package name */
        public final int f45074h;

        /* renamed from: i  reason: collision with root package name */
        public final int f45075i;

        /* renamed from: j  reason: collision with root package name */
        public final float f45076j;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10) {
            this.f45067a = i10;
            this.f45068b = z10;
            this.f45069c = i11;
            this.f45070d = i12;
            this.f45071e = iArr;
            this.f45072f = i13;
            this.f45073g = i14;
            this.f45074h = i15;
            this.f45075i = i16;
            this.f45076j = f10;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f45077a;

        /* renamed from: b  reason: collision with root package name */
        public final int f45078b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f45079c;

        public b(int i10, int i11, boolean z10) {
            this.f45077a = i10;
            this.f45078b = i11;
            this.f45079c = z10;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f45080a;

        /* renamed from: b  reason: collision with root package name */
        public final int f45081b;

        /* renamed from: c  reason: collision with root package name */
        public final int f45082c;

        /* renamed from: d  reason: collision with root package name */
        public final int f45083d;

        /* renamed from: e  reason: collision with root package name */
        public final int f45084e;

        /* renamed from: f  reason: collision with root package name */
        public final int f45085f;

        /* renamed from: g  reason: collision with root package name */
        public final int f45086g;

        /* renamed from: h  reason: collision with root package name */
        public final float f45087h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f45088i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f45089j;

        /* renamed from: k  reason: collision with root package name */
        public final int f45090k;

        /* renamed from: l  reason: collision with root package name */
        public final int f45091l;

        /* renamed from: m  reason: collision with root package name */
        public final int f45092m;

        /* renamed from: n  reason: collision with root package name */
        public final boolean f45093n;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, boolean z10, boolean z11, int i17, int i18, int i19, boolean z12) {
            this.f45080a = i10;
            this.f45081b = i11;
            this.f45082c = i12;
            this.f45083d = i13;
            this.f45084e = i14;
            this.f45085f = i15;
            this.f45086g = i16;
            this.f45087h = f10;
            this.f45088i = z10;
            this.f45089j = z11;
            this.f45090k = i17;
            this.f45091l = i18;
            this.f45092m = i19;
            this.f45093n = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < position) {
                byte b10 = byteBuffer.get(i10) & 255;
                if (i11 == 3) {
                    if (b10 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i10 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b10 == 0) {
                    i11++;
                }
                if (b10 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12 = i11 - i10;
        boolean z13 = false;
        if (i12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        } else if (i12 <= 2 || !zArr[2] || bArr[i10] != 0 || bArr[i10 + 1] != 1) {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                byte b10 = bArr[i14];
                if ((b10 & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                        a(zArr);
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            if (i12 <= 2 ? i12 != 2 ? !zArr[1] || bArr[i13] != 1 : !(zArr[2] && bArr[i11 - 2] == 0 && bArr[i13] == 1) : !(bArr[i11 - 3] == 0 && bArr[i11 - 2] == 0 && bArr[i13] == 1)) {
                z11 = false;
            } else {
                z11 = true;
            }
            zArr[0] = z11;
            if (i12 <= 1 ? !zArr[2] || bArr[i13] != 0 : !(bArr[i11 - 2] == 0 && bArr[i13] == 0)) {
                z12 = false;
            } else {
                z12 = true;
            }
            zArr[1] = z12;
            if (bArr[i13] == 0) {
                z13 = true;
            }
            zArr[2] = z13;
            return i11;
        } else {
            a(zArr);
            return i10 - 1;
        }
    }

    private static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean g(String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        if (!"video/hevc".equals(str) || ((b10 & 126) >> 1) != 39) {
            return false;
        }
        return true;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10 + 2, i11);
    }

    public static a i(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        C c10 = new C(bArr, i10, i11);
        c10.l(4);
        int e10 = c10.e(3);
        c10.k();
        int e11 = c10.e(2);
        boolean d10 = c10.d();
        int e12 = c10.e(5);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i12 = 1;
            if (i16 >= 32) {
                break;
            }
            if (c10.d()) {
                i15 |= 1 << i16;
            }
            i16++;
        }
        int[] iArr = new int[6];
        for (int i17 = 0; i17 < 6; i17++) {
            iArr[i17] = c10.e(8);
        }
        int e13 = c10.e(8);
        int i18 = 0;
        for (int i19 = 0; i19 < e10; i19++) {
            if (c10.d()) {
                i18 += 89;
            }
            if (c10.d()) {
                i18 += 8;
            }
        }
        c10.l(i18);
        if (e10 > 0) {
            c10.l((8 - e10) * 2);
        }
        int h10 = c10.h();
        int h11 = c10.h();
        if (h11 == 3) {
            c10.k();
        }
        int h12 = c10.h();
        int h13 = c10.h();
        if (c10.d()) {
            int h14 = c10.h();
            int h15 = c10.h();
            int h16 = c10.h();
            int h17 = c10.h();
            if (h11 == 1 || h11 == 2) {
                i14 = 2;
            } else {
                i14 = 1;
            }
            if (h11 == 1) {
                i12 = 2;
            }
            h12 -= i14 * (h14 + h15);
            h13 -= i12 * (h16 + h17);
        }
        int i20 = h12;
        c10.h();
        c10.h();
        int h18 = c10.h();
        if (c10.d()) {
            i13 = 0;
        } else {
            i13 = e10;
        }
        while (i13 <= e10) {
            c10.h();
            c10.h();
            c10.h();
            i13++;
        }
        c10.h();
        c10.h();
        c10.h();
        c10.h();
        c10.h();
        c10.h();
        if (c10.d() && c10.d()) {
            n(c10);
        }
        c10.l(2);
        if (c10.d()) {
            c10.l(8);
            c10.h();
            c10.h();
            c10.k();
        }
        p(c10);
        if (c10.d()) {
            for (int i21 = 0; i21 < c10.h(); i21++) {
                c10.l(h18 + 5);
            }
        }
        c10.l(2);
        float f10 = 1.0f;
        if (c10.d()) {
            if (c10.d()) {
                int e14 = c10.e(8);
                if (e14 == 255) {
                    int e15 = c10.e(16);
                    int e16 = c10.e(16);
                    if (!(e15 == 0 || e16 == 0)) {
                        f10 = ((float) e15) / ((float) e16);
                    }
                } else {
                    float[] fArr = f45064b;
                    if (e14 < fArr.length) {
                        f10 = fArr[e14];
                    } else {
                        s.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e14);
                    }
                }
            }
            if (c10.d()) {
                c10.k();
            }
            if (c10.d()) {
                c10.l(4);
                if (c10.d()) {
                    c10.l(24);
                }
            }
            if (c10.d()) {
                c10.h();
                c10.h();
            }
            c10.k();
            if (c10.d()) {
                h13 *= 2;
            }
        }
        return new a(e11, d10, e12, i15, iArr, e13, h10, i20, h13, f10);
    }

    public static b j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10 + 1, i11);
    }

    public static b k(byte[] bArr, int i10, int i11) {
        C c10 = new C(bArr, i10, i11);
        int h10 = c10.h();
        int h11 = c10.h();
        c10.k();
        return new b(h10, h11, c10.d());
    }

    public static c l(byte[] bArr, int i10, int i11) {
        return m(bArr, i10 + 1, i11);
    }

    public static c m(byte[] bArr, int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        float f10;
        int i15;
        int i16;
        int i17;
        int i18;
        C c10 = new C(bArr, i10, i11);
        int e10 = c10.e(8);
        int e11 = c10.e(8);
        int e12 = c10.e(8);
        int h10 = c10.h();
        int i19 = 1;
        if (e10 == 100 || e10 == 110 || e10 == 122 || e10 == 244 || e10 == 44 || e10 == 83 || e10 == 86 || e10 == 118 || e10 == 128 || e10 == 138) {
            i12 = c10.h();
            if (i12 == 3) {
                z10 = c10.d();
            } else {
                z10 = false;
            }
            c10.h();
            c10.h();
            c10.k();
            if (c10.d()) {
                if (i12 != 3) {
                    i17 = 8;
                } else {
                    i17 = 12;
                }
                for (int i20 = 0; i20 < i17; i20++) {
                    if (c10.d()) {
                        if (i20 < 6) {
                            i18 = 16;
                        } else {
                            i18 = 64;
                        }
                        o(c10, i18);
                    }
                }
            }
        } else {
            i12 = 1;
            z10 = false;
        }
        int h11 = c10.h() + 4;
        int h12 = c10.h();
        if (h12 == 0) {
            i13 = i12;
            z11 = z10;
            i14 = c10.h() + 4;
            z12 = false;
        } else {
            if (h12 == 1) {
                boolean d10 = c10.d();
                c10.g();
                c10.g();
                z11 = z10;
                long h13 = (long) c10.h();
                i13 = i12;
                for (int i21 = 0; ((long) i21) < h13; i21++) {
                    c10.h();
                }
                z12 = d10;
            } else {
                i13 = i12;
                z11 = z10;
                z12 = false;
            }
            i14 = 0;
        }
        int h14 = c10.h();
        c10.k();
        int h15 = c10.h() + 1;
        boolean d11 = c10.d();
        int h16 = (true - (d11 ? 1 : 0)) * (c10.h() + 1);
        if (!d11) {
            c10.k();
        }
        c10.k();
        int i22 = h15 * 16;
        int i23 = h16 * 16;
        if (c10.d()) {
            int h17 = c10.h();
            int h18 = c10.h();
            int h19 = c10.h();
            int h20 = c10.h();
            if (i13 == 0) {
                i15 = true - d11;
            } else {
                int i24 = i13;
                if (i24 == 3) {
                    i16 = 1;
                } else {
                    i16 = 2;
                }
                if (i24 == 1) {
                    i19 = 2;
                }
                int i25 = (true - d11) * i19;
                i19 = i16;
                i15 = i25;
            }
            i22 -= (h17 + h18) * i19;
            i23 -= (h19 + h20) * i15;
        }
        int i26 = i22;
        int i27 = i23;
        float f11 = 1.0f;
        if (c10.d() && c10.d()) {
            int e13 = c10.e(8);
            if (e13 == 255) {
                int e14 = c10.e(16);
                int e15 = c10.e(16);
                if (!(e14 == 0 || e15 == 0)) {
                    f11 = ((float) e14) / ((float) e15);
                }
            } else {
                float[] fArr = f45064b;
                if (e13 < fArr.length) {
                    f10 = fArr[e13];
                    return new c(e10, e11, e12, h10, h14, i26, i27, f10, z11, d11, h11, h12, i14, z12);
                }
                s.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e13);
            }
        }
        f10 = f11;
        return new c(e10, e11, e12, h10, h14, i26, i27, f10, z11, d11, h11, h12, i14, z12);
    }

    private static void n(C c10) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!c10.d()) {
                    c10.h();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        c10.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        c10.g();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void o(C c10, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((c10.g() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    private static void p(C c10) {
        int h10 = c10.h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < h10; i12++) {
            if (i12 == 0 || !c10.d()) {
                int h11 = c10.h();
                int h12 = c10.h();
                int[] iArr3 = new int[h11];
                for (int i13 = 0; i13 < h11; i13++) {
                    iArr3[i13] = c10.h() + 1;
                    c10.k();
                }
                int[] iArr4 = new int[h12];
                for (int i14 = 0; i14 < h12; i14++) {
                    iArr4[i14] = c10.h() + 1;
                    c10.k();
                }
                int[] iArr5 = iArr3;
                i10 = h11;
                iArr = iArr5;
                int[] iArr6 = iArr4;
                i11 = h12;
                iArr2 = iArr6;
            } else {
                int i15 = i10 + i11;
                int h13 = (1 - ((c10.d() ? 1 : 0) * true)) * (c10.h() + 1);
                int i16 = i15 + 1;
                boolean[] zArr = new boolean[i16];
                for (int i17 = 0; i17 <= i15; i17++) {
                    if (!c10.d()) {
                        zArr[i17] = c10.d();
                    } else {
                        zArr[i17] = true;
                    }
                }
                int[] iArr7 = new int[i16];
                int[] iArr8 = new int[i16];
                int i18 = 0;
                for (int i19 = i11 - 1; i19 >= 0; i19--) {
                    int i20 = iArr2[i19] + h13;
                    if (i20 < 0 && zArr[i10 + i19]) {
                        iArr7[i18] = i20;
                        i18++;
                    }
                }
                if (h13 < 0 && zArr[i15]) {
                    iArr7[i18] = h13;
                    i18++;
                }
                for (int i21 = 0; i21 < i10; i21++) {
                    int i22 = iArr[i21] + h13;
                    if (i22 < 0 && zArr[i21]) {
                        iArr7[i18] = i22;
                        i18++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr7, i18);
                int i23 = 0;
                for (int i24 = i10 - 1; i24 >= 0; i24--) {
                    int i25 = iArr[i24] + h13;
                    if (i25 > 0 && zArr[i24]) {
                        iArr8[i23] = i25;
                        i23++;
                    }
                }
                if (h13 > 0 && zArr[i15]) {
                    iArr8[i23] = h13;
                    i23++;
                }
                for (int i26 = 0; i26 < i11; i26++) {
                    int i27 = iArr2[i26] + h13;
                    if (i27 > 0 && zArr[i10 + i26]) {
                        iArr8[i23] = i27;
                        i23++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr8, i23);
                iArr = copyOf;
                i10 = i18;
                i11 = i23;
            }
        }
    }

    public static int q(byte[] bArr, int i10) {
        int i11;
        synchronized (f45065c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = d(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f45066d;
                        if (iArr.length <= i13) {
                            f45066d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f45066d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } finally {
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f45066d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
