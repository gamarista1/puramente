package z2;

import f2.C1961B;
import f2.C1979n;
import f2.s;
import i2.L;
import i2.z;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: z2.o  reason: case insensitive filesystem */
public abstract class C2971o {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f29260a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f29261b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f29262c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f29263d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f29264e = {5, 8, 10, 12};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f29265f = {6, 9, 12, 15};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f29266g = {2, 4, 6, 8};

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f29267h = {9, 11, 13, 16};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f29268i = {5, 8, 10, 12};

    /* renamed from: z2.o$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f29269a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29270b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29271c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29272d;

        /* renamed from: e  reason: collision with root package name */
        public final long f29273e;

        /* renamed from: f  reason: collision with root package name */
        public final int f29274f;

        private b(String str, int i10, int i11, int i12, long j10, int i13) {
            this.f29269a = str;
            this.f29271c = i10;
            this.f29270b = i11;
            this.f29272d = i12;
            this.f29273e = j10;
            this.f29274f = i13;
        }
    }

    private static void a(byte[] bArr, int i10) {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & 255) | ((bArr[i11] << 8) & 65535)) != L.u(bArr, 0, i11, 65535)) {
            throw C1961B.a("CRC check failed", (Throwable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L_0x004f
            r2 = -1
            if (r1 == r2) goto L_0x003e
            r2 = 31
            if (r1 == r2) goto L_0x0026
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r3]
        L_0x0020:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L_0x005e
        L_0x0026:
            byte r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
        L_0x0036:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L_0x005e
        L_0x003e:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
            goto L_0x0036
        L_0x004f:
            byte r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r4]
            goto L_0x0020
        L_0x005e:
            if (r0 == 0) goto L_0x0064
            int r7 = r7 * 16
            int r7 = r7 / 14
        L_0x0064:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.C2971o.b(byte[]):int");
    }

    public static int c(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        if (i10 == 1908687592 || i10 == -398277519) {
            return 4;
        }
        return 0;
    }

    private static z d(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == Byte.MAX_VALUE || b10 == 100 || b10 == 64 || b10 == 113) {
            return new z(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b11 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b11;
            }
        }
        z zVar = new z(copyOf);
        if (copyOf[0] == 31) {
            z zVar2 = new z(copyOf);
            while (zVar2.b() >= 16) {
                zVar2.r(2);
                zVar.f(zVar2.h(14), 14);
            }
        }
        zVar.n(copyOf);
        return zVar;
    }

    private static boolean e(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            return true;
        }
        return false;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        byte b11;
        int i11;
        byte b12;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position = byteBuffer.position();
        byte b13 = byteBuffer.get(position);
        if (b13 != -2) {
            if (b13 == -1) {
                i11 = (byteBuffer.get(position + 4) & 7) << 4;
                b12 = byteBuffer.get(position + 7);
            } else if (b13 != 31) {
                i10 = (byteBuffer.get(position + 4) & 1) << 6;
                b10 = byteBuffer.get(position + 5);
            } else {
                i11 = (byteBuffer.get(position + 5) & 7) << 4;
                b12 = byteBuffer.get(position + 6);
            }
            b11 = b12 & 60;
            return (((b11 >> 2) | i11) + 1) * 32;
        }
        i10 = (byteBuffer.get(position + 5) & 1) << 6;
        b10 = byteBuffer.get(position + 4);
        b11 = b10 & 252;
        return (((b11 >> 2) | i11) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i10;
        byte b10;
        byte b11;
        int i11;
        byte b12;
        byte b13 = bArr[0];
        if (b13 != -2) {
            if (b13 == -1) {
                i11 = (bArr[4] & 7) << 4;
                b12 = bArr[7];
            } else if (b13 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i11 = (bArr[5] & 7) << 4;
                b12 = bArr[6];
            }
            b11 = b12 & 60;
            return (((b11 >> 2) | i11) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        b11 = b10 & 252;
        return (((b11 >> 2) | i11) + 1) * 32;
    }

    public static s h(byte[] bArr, String str, String str2, int i10, C1979n nVar) {
        int i11;
        int i12;
        z d10 = d(bArr);
        d10.r(60);
        int i13 = f29260a[d10.h(6)];
        int i14 = f29261b[d10.h(4)];
        int h10 = d10.h(5);
        int[] iArr = f29262c;
        if (h10 >= iArr.length) {
            i11 = -1;
        } else {
            i11 = (iArr[h10] * 1000) / 2;
        }
        d10.r(10);
        if (d10.h(2) > 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return new s.b().a0(str).o0("audio/vnd.dts").M(i11).N(i13 + i12).p0(i14).U(nVar).e0(str2).m0(i10).K();
    }

    public static b i(byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j10;
        int i15;
        z d10 = d(bArr);
        d10.r(40);
        int h10 = d10.h(2);
        if (!d10.g()) {
            i11 = 16;
            i10 = 8;
        } else {
            i11 = 20;
            i10 = 12;
        }
        d10.r(i10);
        int h11 = d10.h(i11) + 1;
        boolean g10 = d10.g();
        int i16 = 0;
        if (g10) {
            i12 = d10.h(2);
            int h12 = (d10.h(3) + 1) * 512;
            if (d10.g()) {
                d10.r(36);
            }
            int h13 = d10.h(3) + 1;
            int h14 = d10.h(3) + 1;
            if (h13 == 1 && h14 == 1) {
                int i17 = h10 + 1;
                int h15 = d10.h(i17);
                for (int i18 = 0; i18 < i17; i18++) {
                    if (((h15 >> i18) & 1) == 1) {
                        d10.r(8);
                    }
                }
                if (d10.g()) {
                    d10.r(2);
                    int h16 = (d10.h(2) + 1) << 2;
                    int h17 = d10.h(2) + 1;
                    while (i16 < h17) {
                        d10.r(h16);
                        i16++;
                    }
                }
                i16 = h12;
            } else {
                throw C1961B.c("Multiple audio presentations or assets not supported");
            }
        } else {
            i12 = -1;
        }
        d10.r(i11);
        d10.r(12);
        if (g10) {
            if (d10.g()) {
                d10.r(4);
            }
            if (d10.g()) {
                d10.r(24);
            }
            if (d10.g()) {
                d10.s(d10.h(10) + 1);
            }
            d10.r(5);
            int i19 = f29263d[d10.h(4)];
            i14 = d10.h(8) + 1;
            i13 = i19;
        } else {
            i13 = -2147483647;
            i14 = -1;
        }
        if (g10) {
            if (i12 == 0) {
                i15 = 32000;
            } else if (i12 == 1) {
                i15 = 44100;
            } else if (i12 == 2) {
                i15 = 48000;
            } else {
                throw C1961B.a("Unsupported reference clock code in DTS HD header: " + i12, (Throwable) null);
            }
            j10 = L.U0((long) i16, 1000000, (long) i15);
        } else {
            j10 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", i14, i13, h11, j10, 0);
    }

    public static int j(byte[] bArr) {
        int i10;
        z d10 = d(bArr);
        d10.r(42);
        if (d10.g()) {
            i10 = 12;
        } else {
            i10 = 8;
        }
        return d10.h(i10) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) {
        int i10;
        int i11;
        long j10;
        int i12;
        int i13;
        z d10 = d(bArr);
        int i14 = 0;
        if (d10.h(32) == 1078008818) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int m10 = m(d10, f29264e, true) + 1;
        if (i10 == 0) {
            i11 = -2147483647;
            j10 = -9223372036854775807L;
        } else if (d10.g()) {
            a(bArr, m10);
            int h10 = d10.h(2);
            if (h10 == 0) {
                i12 = 512;
            } else if (h10 == 1) {
                i12 = 480;
            } else if (h10 == 2) {
                i12 = 384;
            } else {
                throw C1961B.a("Unsupported base duration index in DTS UHD header: " + h10, (Throwable) null);
            }
            int h11 = i12 * (d10.h(3) + 1);
            int h12 = d10.h(2);
            if (h12 == 0) {
                i13 = 32000;
            } else if (h12 == 1) {
                i13 = 44100;
            } else if (h12 == 2) {
                i13 = 48000;
            } else {
                throw C1961B.a("Unsupported clock rate index in DTS UHD header: " + h12, (Throwable) null);
            }
            if (d10.g()) {
                d10.r(36);
            }
            i11 = (1 << d10.h(2)) * i13;
            j10 = L.U0((long) h11, 1000000, (long) i13);
        } else {
            throw C1961B.c("Only supports full channel mask-based audio presentation");
        }
        int i15 = i11;
        long j11 = j10;
        int i16 = 0;
        for (int i17 = 0; i17 < i10; i17++) {
            i16 += m(d10, f29265f, true);
        }
        if (i10 != 0) {
            atomicInteger.set(m(d10, f29266g, true));
        } else {
            AtomicInteger atomicInteger2 = atomicInteger;
        }
        if (atomicInteger.get() != 0) {
            i14 = m(d10, f29267h, true);
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i15, m10 + i16 + i14, j11, 0);
    }

    public static int l(byte[] bArr) {
        z d10 = d(bArr);
        d10.r(32);
        return m(d10, f29268i, true) + 1;
    }

    private static int m(z zVar, int[] iArr, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && zVar.g(); i12++) {
            i11++;
        }
        if (z10) {
            int i13 = 0;
            while (i10 < i11) {
                i13 += 1 << iArr[i10];
                i10++;
            }
            i10 = i13;
        }
        return i10 + zVar.h(iArr[i11]);
    }
}
