package m9;

import com.adjust.sdk.network.ErrorCodes;
import ja.A;
import ja.B;
import java.nio.ByteBuffer;
import k9.C3717q0;
import o9.m;

/* renamed from: m9.c  reason: case insensitive filesystem */
public abstract class C3845c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f46625a = {2002, 2000, 1920, 1601, 1600, ErrorCodes.SERVER_RETRY_IN, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: m9.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f46626a;

        /* renamed from: b  reason: collision with root package name */
        public final int f46627b;

        /* renamed from: c  reason: collision with root package name */
        public final int f46628c;

        /* renamed from: d  reason: collision with root package name */
        public final int f46629d;

        /* renamed from: e  reason: collision with root package name */
        public final int f46630e;

        private b(int i10, int i11, int i12, int i13, int i14) {
            this.f46626a = i10;
            this.f46628c = i11;
            this.f46627b = i12;
            this.f46629d = i13;
            this.f46630e = i14;
        }
    }

    public static void a(int i10, B b10) {
        b10.L(7);
        byte[] d10 = b10.d();
        d10[0] = -84;
        d10[1] = 64;
        d10[2] = -1;
        d10[3] = -1;
        d10[4] = (byte) ((i10 >> 16) & 255);
        d10[5] = (byte) ((i10 >> 8) & 255);
        d10[6] = (byte) (i10 & 255);
    }

    public static C3717q0 b(B b10, String str, String str2, m mVar) {
        int i10;
        b10.Q(1);
        if (((b10.D() & 32) >> 5) == 1) {
            i10 = 48000;
        } else {
            i10 = 44100;
        }
        return new C3717q0.b().S(str).e0("audio/ac4").H(2).f0(i10).M(mVar).V(str2).E();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new A(bArr)).f46630e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        if (r11 != 11) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r11 != 11) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r11 != 8) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static m9.C3845c.b d(ja.A r11) {
        /*
            r0 = 16
            int r1 = r11.h(r0)
            int r0 = r11.h(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r11.h(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r8 = r0
            r0 = 2
            int r1 = r11.h(r0)
            r2 = 3
            if (r1 != r2) goto L_0x002f
            int r4 = f(r11, r0)
            int r1 = r1 + r4
        L_0x002f:
            r5 = r1
            r1 = 10
            int r1 = r11.h(r1)
            boolean r4 = r11.g()
            if (r4 == 0) goto L_0x0045
            int r4 = r11.h(r2)
            if (r4 <= 0) goto L_0x0045
            r11.r(r0)
        L_0x0045:
            boolean r4 = r11.g()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L_0x0053
            r9 = r7
            goto L_0x0054
        L_0x0053:
            r9 = r6
        L_0x0054:
            int r11 = r11.h(r3)
            if (r9 != r6) goto L_0x0063
            r4 = 13
            if (r11 != r4) goto L_0x0063
            int[] r0 = f46625a
            r11 = r0[r11]
            goto L_0x0091
        L_0x0063:
            if (r9 != r7) goto L_0x0090
            int[] r4 = f46625a
            int r6 = r4.length
            if (r11 >= r6) goto L_0x0090
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 8
            r7 = 1
            if (r1 == r7) goto L_0x008b
            r7 = 11
            if (r1 == r0) goto L_0x0086
            if (r1 == r2) goto L_0x008b
            if (r1 == r3) goto L_0x007c
            goto L_0x0084
        L_0x007c:
            if (r11 == r2) goto L_0x0082
            if (r11 == r6) goto L_0x0082
            if (r11 != r7) goto L_0x0084
        L_0x0082:
            int r4 = r4 + 1
        L_0x0084:
            r11 = r4
            goto L_0x0091
        L_0x0086:
            if (r11 == r6) goto L_0x0082
            if (r11 != r7) goto L_0x0084
            goto L_0x0082
        L_0x008b:
            if (r11 == r2) goto L_0x0082
            if (r11 != r6) goto L_0x0084
            goto L_0x0082
        L_0x0090:
            r11 = 0
        L_0x0091:
            m9.c$b r0 = new m9.c$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.C3845c.d(ja.A):m9.c$b");
    }

    public static int e(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        byte b10 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (b10 == 65535) {
            b10 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return b10 + i11;
    }

    private static int f(A a10, int i10) {
        int i11 = 0;
        while (true) {
            int h10 = i11 + a10.h(i10);
            if (!a10.g()) {
                return h10;
            }
            i11 = (h10 + 1) << i10;
        }
    }
}
