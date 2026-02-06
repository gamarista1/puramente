package z2;

import com.adjust.sdk.network.ErrorCodes;
import f2.C1979n;
import f2.s;
import i2.C2073A;
import i2.z;
import java.nio.ByteBuffer;

/* renamed from: z2.c  reason: case insensitive filesystem */
public abstract class C2959c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f29173a = {2002, 2000, 1920, 1601, 1600, ErrorCodes.SERVER_RETRY_IN, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: z2.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29174a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29175b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29176c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29177d;

        /* renamed from: e  reason: collision with root package name */
        public final int f29178e;

        private b(int i10, int i11, int i12, int i13, int i14) {
            this.f29174a = i10;
            this.f29176c = i11;
            this.f29175b = i12;
            this.f29177d = i13;
            this.f29178e = i14;
        }
    }

    public static void a(int i10, C2073A a10) {
        a10.Q(7);
        byte[] e10 = a10.e();
        e10[0] = -84;
        e10[1] = 64;
        e10[2] = -1;
        e10[3] = -1;
        e10[4] = (byte) ((i10 >> 16) & 255);
        e10[5] = (byte) ((i10 >> 8) & 255);
        e10[6] = (byte) (i10 & 255);
    }

    public static s b(C2073A a10, String str, String str2, C1979n nVar) {
        int i10;
        a10.V(1);
        if (((a10.H() & 32) >> 5) == 1) {
            i10 = 48000;
        } else {
            i10 = 44100;
        }
        return new s.b().a0(str).o0("audio/ac4").N(2).p0(i10).U(nVar).e0(str2).K();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new z(bArr)).f29178e;
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
    public static z2.C2959c.b d(i2.z r11) {
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
            int[] r0 = f29173a
            r11 = r0[r11]
            goto L_0x0091
        L_0x0063:
            if (r9 != r7) goto L_0x0090
            int[] r4 = f29173a
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
            z2.c$b r0 = new z2.c$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.C2959c.d(i2.z):z2.c$b");
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

    private static int f(z zVar, int i10) {
        int i11 = 0;
        while (true) {
            int h10 = i11 + zVar.h(i10);
            if (!zVar.g()) {
                return h10;
            }
            i11 = (h10 + 1) << i10;
        }
    }
}
