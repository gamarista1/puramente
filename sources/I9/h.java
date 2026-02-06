package I9;

import D9.d;
import D9.g;
import com.adjust.sdk.Constants;
import com.reactnativecommunity.clipboard.ClipboardModule;
import ja.A;
import ja.B;
import ja.M;
import ja.s;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import nb.C5108c;

public final class h extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f31805b = new g();

    /* renamed from: a  reason: collision with root package name */
    private final a f31806a;

    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f31807a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f31808b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f31809c;

        public b(int i10, boolean z10, int i11) {
            this.f31807a = i10;
            this.f31808b = z10;
            this.f31809c = i11;
        }
    }

    public h() {
        this((a) null);
    }

    private static int A(B b10, int i10) {
        byte[] d10 = b10.d();
        int e10 = b10.e();
        int i11 = e10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= e10 + i10) {
                return i10;
            }
            if ((d10[i11] & 255) == 255 && d10[i12] == 0) {
                System.arraycopy(d10, i11 + 2, d10, i12, (i10 - (i11 - e10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        if ((r10 & 1) != 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        if ((r10 & 128) != 0) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b A[SYNTHETIC, Splitter:B:48:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0097 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean B(ja.B r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.e()
        L_0x0008:
            int r3 = r18.a()     // Catch:{ all -> 0x0022 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0025
            int r7 = r18.n()     // Catch:{ all -> 0x0022 }
            long r8 = r18.F()     // Catch:{ all -> 0x0022 }
            int r10 = r18.J()     // Catch:{ all -> 0x0022 }
            goto L_0x002f
        L_0x0022:
            r0 = move-exception
            goto L_0x00b2
        L_0x0025:
            int r7 = r18.G()     // Catch:{ all -> 0x0022 }
            int r8 = r18.G()     // Catch:{ all -> 0x0022 }
            long r8 = (long) r8
            r10 = r6
        L_0x002f:
            r11 = 0
            if (r7 != 0) goto L_0x003d
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003d
            if (r10 != 0) goto L_0x003d
            r1.P(r2)
            return r4
        L_0x003d:
            r7 = 4
            if (r0 != r7) goto L_0x006e
            if (r21 != 0) goto L_0x006e
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x004e
            r1.P(r2)
            return r6
        L_0x004e:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006e:
            if (r0 != r7) goto L_0x007e
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0076
            r3 = r4
            goto L_0x0077
        L_0x0076:
            r3 = r6
        L_0x0077:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x007c
            goto L_0x008e
        L_0x007c:
            r4 = r6
            goto L_0x008e
        L_0x007e:
            if (r0 != r3) goto L_0x008c
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0086
            r3 = r4
            goto L_0x0087
        L_0x0086:
            r3 = r6
        L_0x0087:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x007c
            goto L_0x008e
        L_0x008c:
            r3 = r6
            r4 = r3
        L_0x008e:
            if (r4 == 0) goto L_0x0092
            int r3 = r3 + 4
        L_0x0092:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x009b
            r1.P(r2)
            return r6
        L_0x009b:
            int r3 = r18.a()     // Catch:{ all -> 0x0022 }
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a8
            r1.P(r2)
            return r6
        L_0x00a8:
            int r3 = (int) r8
            r1.Q(r3)     // Catch:{ all -> 0x0022 }
            goto L_0x0008
        L_0x00ae:
            r1.P(r2)
            return r4
        L_0x00b2:
            r1.P(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I9.h.B(ja.B, int, int, boolean):boolean");
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return M.f44986f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    private static a f(B b10, int i10, int i11) {
        int i12;
        String str;
        int D10 = b10.D();
        String v10 = v(D10);
        int i13 = i10 - 1;
        byte[] bArr = new byte[i13];
        b10.j(bArr, 0, i13);
        if (i11 == 2) {
            str = "image/" + C5108c.e(new String(bArr, 0, 3, "ISO-8859-1"));
            if (ClipboardModule.MIMETYPE_JPG.equals(str)) {
                str = ClipboardModule.MIMETYPE_JPEG;
            }
            i12 = 2;
        } else {
            i12 = y(bArr, 0);
            str = C5108c.e(new String(bArr, 0, i12, "ISO-8859-1"));
            if (str.indexOf(47) == -1) {
                str = "image/" + str;
            }
        }
        int i14 = i12 + 2;
        int x10 = x(bArr, i14, D10);
        return new a(str, new String(bArr, i14, x10 - i14, v10), bArr[i12 + 1] & 255, d(bArr, x10 + u(D10), i13));
    }

    private static b g(B b10, int i10, String str) {
        byte[] bArr = new byte[i10];
        b10.j(bArr, 0, i10);
        return new b(str, bArr);
    }

    private static c h(B b10, int i10, int i11, boolean z10, int i12, a aVar) {
        long j10;
        long j11;
        B b11 = b10;
        int e10 = b10.e();
        int y10 = y(b10.d(), e10);
        String str = new String(b10.d(), e10, y10 - e10, "ISO-8859-1");
        b10.P(y10 + 1);
        int n10 = b10.n();
        int n11 = b10.n();
        long F10 = b10.F();
        if (F10 == 4294967295L) {
            j10 = -1;
        } else {
            j10 = F10;
        }
        long F11 = b10.F();
        if (F11 == 4294967295L) {
            j11 = -1;
        } else {
            j11 = F11;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = e10 + i10;
        while (b10.e() < i13) {
            i k10 = k(i11, b10, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new c(str, n10, n11, j10, j11, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(B b10, int i10, int i11, boolean z10, int i12, a aVar) {
        boolean z11;
        boolean z12;
        B b11 = b10;
        int e10 = b10.e();
        int y10 = y(b10.d(), e10);
        String str = new String(b10.d(), e10, y10 - e10, "ISO-8859-1");
        b11.P(y10 + 1);
        int D10 = b10.D();
        if ((D10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((D10 & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int D11 = b10.D();
        String[] strArr = new String[D11];
        for (int i13 = 0; i13 < D11; i13++) {
            int e11 = b10.e();
            int y11 = y(b10.d(), e11);
            strArr[i13] = new String(b10.d(), e11, y11 - e11, "ISO-8859-1");
            b11.P(y11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = e10 + i10;
        while (b10.e() < i14) {
            i k10 = k(i11, b11, z10, i12, aVar);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(B b10, int i10) {
        if (i10 < 4) {
            return null;
        }
        int D10 = b10.D();
        String v10 = v(D10);
        byte[] bArr = new byte[3];
        b10.j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        b10.j(bArr2, 0, i11);
        int x10 = x(bArr2, 0, D10);
        String str2 = new String(bArr2, 0, x10, v10);
        int u10 = x10 + u(D10);
        return new e(str, str2, p(bArr2, u10, x(bArr2, u10, D10), v10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static I9.i k(int r19, ja.B r20, boolean r21, int r22, I9.h.a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.D()
            int r9 = r20.D()
            int r10 = r20.D()
            r12 = 3
            if (r0 < r12) goto L_0x0019
            int r1 = r20.D()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.H()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r12) goto L_0x0043
            int r1 = r20.H()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.G()
            goto L_0x003a
        L_0x0048:
            if (r0 < r12) goto L_0x0050
            int r1 = r20.J()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.f()
            r7.P(r0)
            return r16
        L_0x0067:
            int r1 = r20.e()
            int r5 = r1 + r15
            int r1 = r20.f()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            ja.s.i(r4, r0)
            int r0 = r20.f()
            r7.P(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r11 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.P(r14)
            return r16
        L_0x009a:
            r11 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r12) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = r1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = r1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = r1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = r1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = r1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = r1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = r1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = r1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x0225
            if (r4 == 0) goto L_0x00f8
            goto L_0x0225
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.Q(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.Q(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = A(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 88
            r3 = 2
            if (r8 != r1) goto L_0x0125
            if (r9 != r2) goto L_0x0125
            if (r10 != r2) goto L_0x0125
            if (r0 == r3) goto L_0x011c
            if (r13 != r2) goto L_0x0125
        L_0x011c:
            I9.m r1 = r(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0122:
            r0 = move-exception
            goto L_0x0221
        L_0x0125:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            I9.m r1 = q(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r2) goto L_0x0143
            if (r10 != r2) goto L_0x0143
            if (r0 == r3) goto L_0x013d
            if (r13 != r2) goto L_0x0143
        L_0x013d:
            I9.n r1 = t(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            I9.n r1 = s(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x014f:
            r2 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r2) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            I9.l r1 = o(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r3) goto L_0x017d
        L_0x0177:
            I9.f r1 = l(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x017d:
            r5 = 65
            r12 = 67
            if (r0 != r3) goto L_0x018a
            if (r8 != r4) goto L_0x0198
            if (r9 != r2) goto L_0x0198
            if (r10 != r12) goto L_0x0198
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0198
            if (r9 != r4) goto L_0x0198
            if (r10 != r2) goto L_0x0198
            if (r13 != r12) goto L_0x0198
        L_0x0192:
            I9.a r1 = f(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0198:
            r2 = 77
            if (r8 != r12) goto L_0x01a9
            if (r9 != r6) goto L_0x01a9
            if (r10 != r2) goto L_0x01a9
            if (r13 == r2) goto L_0x01a4
            if (r0 != r3) goto L_0x01a9
        L_0x01a4:
            I9.e r1 = j(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01a9:
            if (r8 != r12) goto L_0x01c3
            r3 = 72
            if (r9 != r3) goto L_0x01c3
            if (r10 != r5) goto L_0x01c3
            if (r13 != r4) goto L_0x01c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            I9.c r1 = h(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01c3:
            if (r8 != r12) goto L_0x01db
            if (r9 != r1) goto L_0x01db
            if (r10 != r6) goto L_0x01db
            if (r13 != r12) goto L_0x01db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            I9.d r1 = i(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01db:
            if (r8 != r2) goto L_0x01ea
            r2 = 76
            if (r9 != r2) goto L_0x01ea
            if (r10 != r2) goto L_0x01ea
            if (r13 != r1) goto L_0x01ea
            I9.k r1 = n(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01ea:
            java.lang.String r1 = w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            I9.b r1 = g(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x01f2:
            if (r1 != 0) goto L_0x0214
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            ja.s.i(r11, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x0214:
            r7.P(r14)
            return r1
        L_0x0218:
            java.lang.String r0 = "Unsupported character encoding"
            ja.s.i(r11, r0)     // Catch:{ all -> 0x0122 }
            r7.P(r14)
            return r16
        L_0x0221:
            r7.P(r14)
            throw r0
        L_0x0225:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            ja.s.i(r11, r0)
            r7.P(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: I9.h.k(int, ja.B, boolean, int, I9.h$a):I9.i");
    }

    private static f l(B b10, int i10) {
        int D10 = b10.D();
        String v10 = v(D10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b10.j(bArr, 0, i11);
        int y10 = y(bArr, 0);
        String str = new String(bArr, 0, y10, "ISO-8859-1");
        int i12 = y10 + 1;
        int x10 = x(bArr, i12, D10);
        String p10 = p(bArr, i12, x10, v10);
        int u10 = x10 + u(D10);
        int x11 = x(bArr, u10, D10);
        return new f(str, p10, p(bArr, u10, x11, v10), d(bArr, x11 + u(D10), i11));
    }

    private static b m(B b10) {
        if (b10.a() < 10) {
            s.i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int G10 = b10.G();
        if (G10 != 4801587) {
            s.i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", new Object[]{Integer.valueOf(G10)}));
            return null;
        }
        int D10 = b10.D();
        boolean z10 = true;
        b10.Q(1);
        int D11 = b10.D();
        int C10 = b10.C();
        if (D10 == 2) {
            if ((D11 & 64) != 0) {
                s.i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (D10 == 3) {
            if ((D11 & 64) != 0) {
                int n10 = b10.n();
                b10.Q(n10);
                C10 -= n10 + 4;
            }
        } else if (D10 == 4) {
            if ((D11 & 64) != 0) {
                int C11 = b10.C();
                b10.Q(C11 - 4);
                C10 -= C11;
            }
            if ((D11 & 16) != 0) {
                C10 -= 10;
            }
        } else {
            s.i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + D10);
            return null;
        }
        if (D10 >= 4 || (D11 & 128) == 0) {
            z10 = false;
        }
        return new b(D10, z10, C10);
    }

    private static k n(B b10, int i10) {
        int J10 = b10.J();
        int G10 = b10.G();
        int G11 = b10.G();
        int D10 = b10.D();
        int D11 = b10.D();
        A a10 = new A();
        a10.m(b10);
        int i11 = ((i10 - 10) * 8) / (D10 + D11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = a10.h(D10);
            int h11 = a10.h(D11);
            iArr[i12] = h10;
            iArr2[i12] = h11;
        }
        return new k(J10, G10, G11, iArr, iArr2);
    }

    private static l o(B b10, int i10) {
        byte[] bArr = new byte[i10];
        b10.j(bArr, 0, i10);
        int y10 = y(bArr, 0);
        return new l(new String(bArr, 0, y10, "ISO-8859-1"), d(bArr, y10 + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, String str) {
        if (i11 <= i10 || i11 > bArr.length) {
            return "";
        }
        return new String(bArr, i10, i11 - i10, str);
    }

    private static m q(B b10, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int D10 = b10.D();
        String v10 = v(D10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b10.j(bArr, 0, i11);
        return new m(str, (String) null, new String(bArr, 0, x(bArr, 0, D10), v10));
    }

    private static m r(B b10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int D10 = b10.D();
        String v10 = v(D10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b10.j(bArr, 0, i11);
        int x10 = x(bArr, 0, D10);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(D10);
        return new m("TXXX", str, p(bArr, u10, x(bArr, u10, D10), v10));
    }

    private static n s(B b10, int i10, String str) {
        byte[] bArr = new byte[i10];
        b10.j(bArr, 0, i10);
        return new n(str, (String) null, new String(bArr, 0, y(bArr, 0), "ISO-8859-1"));
    }

    private static n t(B b10, int i10) {
        if (i10 < 1) {
            return null;
        }
        int D10 = b10.D();
        String v10 = v(D10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        b10.j(bArr, 0, i11);
        int x10 = x(bArr, 0, D10);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(D10);
        return new n("WXXX", str, p(bArr, u10, y(bArr, u10), "ISO-8859-1"));
    }

    private static int u(int i10) {
        if (i10 == 0 || i10 == 3) {
            return 1;
        }
        return 2;
    }

    private static String v(int i10) {
        if (i10 == 1) {
            return "UTF-16";
        }
        if (i10 == 2) {
            return "UTF-16BE";
        }
        if (i10 != 3) {
            return "ISO-8859-1";
        }
        return Constants.ENCODING;
    }

    private static String w(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
    }

    private static int x(byte[] bArr, int i10, int i11) {
        int y10 = y(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return y10;
        }
        while (y10 < bArr.length - 1) {
            if ((y10 - i10) % 2 == 0 && bArr[y10 + 1] == 0) {
                return y10;
            }
            y10 = y(bArr, y10 + 1);
        }
        return bArr.length;
    }

    private static int y(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean z(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    /* access modifiers changed from: protected */
    public D9.a b(d dVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public D9.a e(byte[] bArr, int i10) {
        int i11;
        ArrayList arrayList = new ArrayList();
        B b10 = new B(bArr, i10);
        b m10 = m(b10);
        if (m10 == null) {
            return null;
        }
        int e10 = b10.e();
        if (m10.f31807a == 2) {
            i11 = 6;
        } else {
            i11 = 10;
        }
        int b11 = m10.f31809c;
        if (m10.f31808b) {
            b11 = A(b10, m10.f31809c);
        }
        b10.O(e10 + b11);
        boolean z10 = false;
        if (!B(b10, m10.f31807a, i11, false)) {
            if (m10.f31807a != 4 || !B(b10, 4, i11, true)) {
                s.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m10.f31807a);
                return null;
            }
            z10 = true;
        }
        while (b10.a() >= i11) {
            i k10 = k(m10.f31807a, b10, z10, i11, this.f31806a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new D9.a((List) arrayList);
    }

    public h(a aVar) {
        this.f31806a = aVar;
    }
}
