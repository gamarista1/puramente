package m9;

import ja.A;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k9.C3717q0;
import o9.m;

/* renamed from: m9.A  reason: case insensitive filesystem */
public abstract class C3840A {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f46521a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f46522b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f46523c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(byte[] r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: m9.C3840A.a(byte[]):int");
    }

    private static A b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new A(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(copyOf)) {
            for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                byte b10 = copyOf[i10];
                int i11 = i10 + 1;
                copyOf[i10] = copyOf[i11];
                copyOf[i11] = b10;
            }
        }
        A a10 = new A(copyOf);
        if (copyOf[0] == 31) {
            A a11 = new A(copyOf);
            while (a11.b() >= 16) {
                a11.r(2);
                a10.f(a11.h(14), 14);
            }
        }
        a10.n(copyOf);
        return a10;
    }

    private static boolean c(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == -2 || b10 == -1) {
            return true;
        }
        return false;
    }

    public static boolean d(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return true;
        }
        return false;
    }

    public static int e(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        byte b11;
        int i11;
        byte b12;
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

    public static int f(byte[] bArr) {
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

    public static C3717q0 g(byte[] bArr, String str, String str2, m mVar) {
        int i10;
        int i11;
        A b10 = b(bArr);
        b10.r(60);
        int i12 = f46521a[b10.h(6)];
        int i13 = f46522b[b10.h(4)];
        int h10 = b10.h(5);
        int[] iArr = f46523c;
        if (h10 >= iArr.length) {
            i10 = -1;
        } else {
            i10 = (iArr[h10] * 1000) / 2;
        }
        b10.r(10);
        if (b10.h(2) > 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        return new C3717q0.b().S(str).e0("audio/vnd.dts").G(i10).H(i12 + i11).f0(i13).M(mVar).V(str2).E();
    }
}
