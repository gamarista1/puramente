package z2;

import f2.C1979n;
import f2.s;
import i2.C2073A;
import i2.L;
import i2.z;
import java.nio.ByteBuffer;

/* renamed from: z2.b  reason: case insensitive filesystem */
public abstract class C2958b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f29160a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f29161b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f29162c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f29163d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f29164e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f29165f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: z2.b$b  reason: collision with other inner class name */
    public static final class C0490b {

        /* renamed from: a  reason: collision with root package name */
        public final String f29166a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29167b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29168c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29169d;

        /* renamed from: e  reason: collision with root package name */
        public final int f29170e;

        /* renamed from: f  reason: collision with root package name */
        public final int f29171f;

        /* renamed from: g  reason: collision with root package name */
        public final int f29172g;

        private C0490b(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f29166a = str;
            this.f29167b = i10;
            this.f29169d = i11;
            this.f29168c = i12;
            this.f29170e = i13;
            this.f29171f = i14;
            this.f29172g = i15;
        }
    }

    private static int a(int i10, int i11, int i12) {
        return (i10 * i11) / (i12 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((L.N(byteBuffer, i10 + 4) & -2) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int c(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f29161b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f29165f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f29164e[i12];
        if (i13 == 32000) {
            return i14 * 6;
        }
        return i14 * 4;
    }

    public static s d(C2073A a10, String str, String str2, C1979n nVar) {
        z zVar = new z();
        zVar.m(a10);
        int i10 = f29161b[zVar.h(2)];
        zVar.r(8);
        int i11 = f29163d[zVar.h(3)];
        if (zVar.h(1) != 0) {
            i11++;
        }
        int i12 = f29164e[zVar.h(5)] * 1000;
        zVar.c();
        a10.U(zVar.d());
        return new s.b().a0(str).o0("audio/ac3").N(i11).p0(i10).U(nVar).e0(str2).M(i12).j0(i12).K();
    }

    public static int e(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f29160a[i10] * 256;
    }

    public static C0490b f(z zVar) {
        boolean z10;
        String str;
        int i10;
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str3;
        int i21;
        int i22;
        z zVar2 = zVar;
        int e10 = zVar.e();
        zVar2.r(40);
        if (zVar2.h(5) > 10) {
            z10 = true;
        } else {
            z10 = false;
        }
        zVar2.p(e10);
        int i23 = -1;
        if (z10) {
            zVar2.r(16);
            int h10 = zVar2.h(2);
            if (h10 == 0) {
                i23 = 0;
            } else if (h10 == 1) {
                i23 = 1;
            } else if (h10 == 2) {
                i23 = 2;
            }
            zVar2.r(3);
            int h11 = (zVar2.h(11) + 1) * 2;
            int h12 = zVar2.h(2);
            if (h12 == 3) {
                i19 = f29162c[zVar2.h(2)];
                i18 = 3;
                i17 = 6;
            } else {
                int h13 = zVar2.h(2);
                int i24 = f29160a[h13];
                i18 = h13;
                i19 = f29161b[h12];
                i17 = i24;
            }
            int i25 = i17 * 256;
            int a10 = a(h11, i19, i17);
            int h14 = zVar2.h(3);
            boolean g10 = zVar.g();
            i11 = f29163d[h14] + (g10 ? 1 : 0);
            zVar2.r(10);
            if (zVar.g()) {
                zVar2.r(8);
            }
            if (h14 == 0) {
                zVar2.r(5);
                if (zVar.g()) {
                    zVar2.r(8);
                }
            }
            if (i23 == 1 && zVar.g()) {
                zVar2.r(16);
            }
            if (zVar.g()) {
                if (h14 > 2) {
                    zVar2.r(2);
                }
                if ((h14 & 1) == 0 || h14 <= 2) {
                    i21 = 6;
                } else {
                    i21 = 6;
                    zVar2.r(6);
                }
                if ((h14 & 4) != 0) {
                    zVar2.r(i21);
                }
                if (g10 && zVar.g()) {
                    zVar2.r(5);
                }
                if (i23 == 0) {
                    if (zVar.g()) {
                        i22 = 6;
                        zVar2.r(6);
                    } else {
                        i22 = 6;
                    }
                    if (h14 == 0 && zVar.g()) {
                        zVar2.r(i22);
                    }
                    if (zVar.g()) {
                        zVar2.r(i22);
                    }
                    int h15 = zVar2.h(2);
                    if (h15 == 1) {
                        zVar2.r(5);
                    } else if (h15 == 2) {
                        zVar2.r(12);
                    } else if (h15 == 3) {
                        int h16 = zVar2.h(5);
                        if (zVar.g()) {
                            zVar2.r(5);
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                zVar2.r(4);
                            }
                            if (zVar.g()) {
                                if (zVar.g()) {
                                    zVar2.r(4);
                                }
                                if (zVar.g()) {
                                    zVar2.r(4);
                                }
                            }
                        }
                        if (zVar.g()) {
                            zVar2.r(5);
                            if (zVar.g()) {
                                zVar2.r(7);
                                if (zVar.g()) {
                                    zVar2.r(8);
                                }
                            }
                        }
                        zVar2.r((h16 + 2) * 8);
                        zVar.c();
                    }
                    if (h14 < 2) {
                        if (zVar.g()) {
                            zVar2.r(14);
                        }
                        if (h14 == 0 && zVar.g()) {
                            zVar2.r(14);
                        }
                    }
                    if (zVar.g()) {
                        if (i18 == 0) {
                            zVar2.r(5);
                        } else {
                            for (int i26 = 0; i26 < i17; i26++) {
                                if (zVar.g()) {
                                    zVar2.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zVar.g()) {
                zVar2.r(5);
                if (h14 == 2) {
                    zVar2.r(4);
                }
                if (h14 >= 6) {
                    zVar2.r(2);
                }
                if (zVar.g()) {
                    zVar2.r(8);
                }
                if (h14 == 0 && zVar.g()) {
                    zVar2.r(8);
                }
                if (h12 < 3) {
                    zVar.q();
                }
            }
            if (i23 == 0 && i18 != 3) {
                zVar.q();
            }
            if (i23 != 2 || (i18 != 3 && !zVar.g())) {
                i20 = 6;
            } else {
                i20 = 6;
                zVar2.r(6);
            }
            if (zVar.g() && zVar2.h(i20) == 1 && zVar2.h(8) == 1) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
            str2 = str3;
            i12 = i23;
            i13 = i25;
            i15 = h11;
            i16 = i19;
            i14 = a10;
        } else {
            zVar2.r(32);
            int h17 = zVar2.h(2);
            if (h17 == 3) {
                str = null;
            } else {
                str = "audio/ac3";
            }
            int h18 = zVar2.h(6);
            int i27 = f29164e[h18 / 2] * 1000;
            int c10 = c(h17, h18);
            zVar2.r(8);
            int h19 = zVar2.h(3);
            if (!((h19 & 1) == 0 || h19 == 1)) {
                zVar2.r(2);
            }
            if ((h19 & 4) != 0) {
                zVar2.r(2);
            }
            if (h19 == 2) {
                zVar2.r(2);
            }
            int[] iArr = f29161b;
            if (h17 < iArr.length) {
                i10 = iArr[h17];
            } else {
                i10 = -1;
            }
            i11 = f29163d[h19] + (zVar.g() ? 1 : 0);
            i12 = -1;
            str2 = str;
            i13 = 1536;
            i14 = i27;
            i15 = c10;
            i16 = i10;
        }
        return new C0490b(str2, i12, i11, i16, i15, i13, i14);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return c((b10 & 192) >> 6, b10 & 63);
    }

    public static s h(C2073A a10, String str, String str2, C1979n nVar) {
        String str3;
        z zVar = new z();
        zVar.m(a10);
        int h10 = zVar.h(13) * 1000;
        zVar.r(3);
        int i10 = f29161b[zVar.h(2)];
        zVar.r(10);
        int i11 = f29163d[zVar.h(3)];
        if (zVar.h(1) != 0) {
            i11++;
        }
        zVar.r(3);
        int h11 = zVar.h(4);
        zVar.r(1);
        if (h11 > 0) {
            zVar.r(6);
            if (zVar.h(1) != 0) {
                i11 += 2;
            }
            zVar.r(1);
        }
        if (zVar.b() > 7) {
            zVar.r(7);
            if (zVar.h(1) != 0) {
                str3 = "audio/eac3-joc";
                zVar.c();
                a10.U(zVar.d());
                return new s.b().a0(str).o0(str3).N(i11).p0(i10).U(nVar).e0(str2).j0(h10).K();
            }
        }
        str3 = "audio/eac3";
        zVar.c();
        a10.U(zVar.d());
        return new s.b().a0(str).o0(str3).N(i11).p0(i10).U(nVar).e0(str2).j0(h10).K();
    }

    public static int i(ByteBuffer byteBuffer, int i10) {
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

    public static int j(byte[] bArr) {
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
