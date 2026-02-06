package m9;

import ja.A;
import ja.B;
import ja.M;
import java.nio.ByteBuffer;
import k9.C3717q0;
import o9.m;

/* renamed from: m9.b  reason: case insensitive filesystem */
public abstract class C3844b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f46613a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f46614b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f46615c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f46616d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f46617e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f46618f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: m9.b$b  reason: collision with other inner class name */
    public static final class C0698b {

        /* renamed from: a  reason: collision with root package name */
        public final String f46619a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46620b;

        /* renamed from: c  reason: collision with root package name */
        public final int f46621c;

        /* renamed from: d  reason: collision with root package name */
        public final int f46622d;

        /* renamed from: e  reason: collision with root package name */
        public final int f46623e;

        /* renamed from: f  reason: collision with root package name */
        public final int f46624f;

        private C0698b(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f46619a = str;
            this.f46620b = i10;
            this.f46622d = i11;
            this.f46621c = i12;
            this.f46623e = i13;
            this.f46624f = i14;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((M.I(byteBuffer, i10 + 4) & -2) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int b(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f46614b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f46618f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f46617e[i12];
        if (i13 == 32000) {
            return i14 * 6;
        }
        return i14 * 4;
    }

    public static C3717q0 c(B b10, String str, String str2, m mVar) {
        int i10 = f46614b[(b10.D() & 192) >> 6];
        int D10 = b10.D();
        int i11 = f46616d[(D10 & 56) >> 3];
        if ((D10 & 4) != 0) {
            i11++;
        }
        return new C3717q0.b().S(str).e0("audio/ac3").H(i11).f0(i10).M(mVar).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f46613a[i10] * 256;
    }

    public static C0698b e(A a10) {
        boolean z10;
        String str;
        int b10;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        int i17;
        String str3;
        int i18;
        int i19;
        A a11 = a10;
        int e10 = a10.e();
        a11.r(40);
        if (a11.h(5) > 10) {
            z10 = true;
        } else {
            z10 = false;
        }
        a11.p(e10);
        int i20 = -1;
        if (z10) {
            a11.r(16);
            int h10 = a11.h(2);
            if (h10 == 0) {
                i20 = 0;
            } else if (h10 == 1) {
                i20 = 1;
            } else if (h10 == 2) {
                i20 = 2;
            }
            a11.r(3);
            b10 = (a11.h(11) + 1) * 2;
            int h11 = a11.h(2);
            if (h11 == 3) {
                i10 = f46615c[a11.h(2)];
                i15 = 6;
                i16 = 3;
            } else {
                i16 = a11.h(2);
                i15 = f46613a[i16];
                i10 = f46614b[h11];
            }
            i12 = i15 * 256;
            int h12 = a11.h(3);
            boolean g10 = a10.g();
            i11 = f46616d[h12] + (g10 ? 1 : 0);
            a11.r(10);
            if (a10.g()) {
                a11.r(8);
            }
            if (h12 == 0) {
                a11.r(5);
                if (a10.g()) {
                    a11.r(8);
                }
            }
            if (i20 == 1 && a10.g()) {
                a11.r(16);
            }
            if (a10.g()) {
                if (h12 > 2) {
                    a11.r(2);
                }
                if ((h12 & 1) == 0 || h12 <= 2) {
                    i18 = 6;
                } else {
                    i18 = 6;
                    a11.r(6);
                }
                if ((h12 & 4) != 0) {
                    a11.r(i18);
                }
                if (g10 && a10.g()) {
                    a11.r(5);
                }
                if (i20 == 0) {
                    if (a10.g()) {
                        i19 = 6;
                        a11.r(6);
                    } else {
                        i19 = 6;
                    }
                    if (h12 == 0 && a10.g()) {
                        a11.r(i19);
                    }
                    if (a10.g()) {
                        a11.r(i19);
                    }
                    int h13 = a11.h(2);
                    if (h13 == 1) {
                        a11.r(5);
                    } else if (h13 == 2) {
                        a11.r(12);
                    } else if (h13 == 3) {
                        int h14 = a11.h(5);
                        if (a10.g()) {
                            a11.r(5);
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                a11.r(4);
                            }
                            if (a10.g()) {
                                if (a10.g()) {
                                    a11.r(4);
                                }
                                if (a10.g()) {
                                    a11.r(4);
                                }
                            }
                        }
                        if (a10.g()) {
                            a11.r(5);
                            if (a10.g()) {
                                a11.r(7);
                                if (a10.g()) {
                                    a11.r(8);
                                }
                            }
                        }
                        a11.r((h14 + 2) * 8);
                        a10.c();
                    }
                    if (h12 < 2) {
                        if (a10.g()) {
                            a11.r(14);
                        }
                        if (h12 == 0 && a10.g()) {
                            a11.r(14);
                        }
                    }
                    if (a10.g()) {
                        if (i16 == 0) {
                            a11.r(5);
                        } else {
                            for (int i21 = 0; i21 < i15; i21++) {
                                if (a10.g()) {
                                    a11.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (a10.g()) {
                a11.r(5);
                if (h12 == 2) {
                    a11.r(4);
                }
                if (h12 >= 6) {
                    a11.r(2);
                }
                if (a10.g()) {
                    a11.r(8);
                }
                if (h12 == 0 && a10.g()) {
                    a11.r(8);
                }
                if (h11 < 3) {
                    a10.q();
                }
            }
            if (i20 == 0 && i16 != 3) {
                a10.q();
            }
            if (i20 != 2 || (i16 != 3 && !a10.g())) {
                i17 = 6;
            } else {
                i17 = 6;
                a11.r(6);
            }
            if (a10.g() && a11.h(i17) == 1 && a11.h(8) == 1) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
            str2 = str3;
            i13 = i20;
        } else {
            a11.r(32);
            int h15 = a11.h(2);
            if (h15 == 3) {
                str = null;
            } else {
                str = "audio/ac3";
            }
            b10 = b(h15, a11.h(6));
            a11.r(8);
            int h16 = a11.h(3);
            if (!((h16 & 1) == 0 || h16 == 1)) {
                a11.r(2);
            }
            if ((h16 & 4) != 0) {
                a11.r(2);
            }
            if (h16 == 2) {
                a11.r(2);
            }
            int[] iArr = f46614b;
            if (h15 < iArr.length) {
                i14 = iArr[h15];
            } else {
                i14 = -1;
            }
            i11 = f46616d[h16] + (a10.g() ? 1 : 0);
            i12 = 1536;
            i13 = -1;
            str2 = str;
        }
        return new C0698b(str2, i13, i11, i10, b10, i12);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return b((b10 & 192) >> 6, b10 & 63);
    }

    public static C3717q0 g(B b10, String str, String str2, m mVar) {
        String str3;
        b10.Q(2);
        int i10 = f46614b[(b10.D() & 192) >> 6];
        int D10 = b10.D();
        int i11 = f46616d[(D10 & 14) >> 1];
        if ((D10 & 1) != 0) {
            i11++;
        }
        if (((b10.D() & 30) >> 1) > 0 && (2 & b10.D()) != 0) {
            i11 += 2;
        }
        if (b10.a() <= 0 || (b10.D() & 1) == 0) {
            str3 = "audio/eac3";
        } else {
            str3 = "audio/eac3-joc";
        }
        return new C3717q0.b().S(str).e0(str3).H(i11).f0(i10).M(mVar).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i10) {
        boolean z10;
        int i11;
        if ((byteBuffer.get(byteBuffer.position() + i10 + 7) & 255) == 187) {
            z10 = true;
        } else {
            z10 = false;
        }
        int position = byteBuffer.position() + i10;
        if (z10) {
            i11 = 9;
        } else {
            i11 = 8;
        }
        return 40 << ((byteBuffer.get(position + i11) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        char c10;
        boolean z10 = false;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                if ((b10 & 255) == 187) {
                    z10 = true;
                }
                if (z10) {
                    c10 = 9;
                } else {
                    c10 = 8;
                }
                return 40 << ((bArr[c10] >> 4) & 7);
            }
        }
        return 0;
    }
}
