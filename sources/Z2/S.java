package z2;

import android.util.Base64;
import com.amazon.a.a.o.b.f;
import com.google.common.collect.C4770v;
import f2.C1961B;
import f2.z;
import i2.C2073A;
import i2.L;
import i2.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class S {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f29138a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f29139b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29140c;

        public a(String str, String[] strArr, int i10) {
            this.f29138a = str;
            this.f29139b = strArr;
            this.f29140c = i10;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f29141a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29142b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29143c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29144d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f29141a = z10;
            this.f29142b = i10;
            this.f29143c = i11;
            this.f29144d = i12;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f29145a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29146b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29147c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29148d;

        /* renamed from: e  reason: collision with root package name */
        public final int f29149e;

        /* renamed from: f  reason: collision with root package name */
        public final int f29150f;

        /* renamed from: g  reason: collision with root package name */
        public final int f29151g;

        /* renamed from: h  reason: collision with root package name */
        public final int f29152h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f29153i;

        /* renamed from: j  reason: collision with root package name */
        public final byte[] f29154j;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f29145a = i10;
            this.f29146b = i11;
            this.f29147c = i12;
            this.f29148d = i13;
            this.f29149e = i14;
            this.f29150f = i15;
            this.f29151g = i16;
            this.f29152h = i17;
            this.f29153i = z10;
            this.f29154j = bArr;
        }
    }

    public static int[] a(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long c(long j10, long j11) {
        return (long) Math.floor(Math.pow((double) j10, 1.0d / ((double) j11)));
    }

    public static z d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] b12 = L.b1(str, f.f37530b);
            if (b12.length != 2) {
                p.h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (b12[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(L2.a.a(new C2073A(Base64.decode(b12[1], 0))));
                } catch (RuntimeException e10) {
                    p.i("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new Q2.a(b12[0], b12[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new z((List) arrayList);
    }

    public static C4770v e(byte[] bArr) {
        C2073A a10 = new C2073A(bArr);
        a10.V(1);
        int i10 = 0;
        while (a10.a() > 0 && a10.j() == 255) {
            i10 += 255;
            a10.V(1);
        }
        int H10 = i10 + a10.H();
        int i11 = 0;
        while (a10.a() > 0 && a10.j() == 255) {
            i11 += 255;
            a10.V(1);
        }
        int H11 = i11 + a10.H();
        byte[] bArr2 = new byte[H10];
        int f10 = a10.f();
        System.arraycopy(bArr, f10, bArr2, 0, H10);
        int i12 = f10 + H10 + H11;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return C4770v.I(bArr2, bArr3);
    }

    private static void f(Q q10) {
        int d10 = q10.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            int d11 = q10.d(16);
            if (d11 == 0) {
                q10.e(8);
                q10.e(16);
                q10.e(16);
                q10.e(6);
                q10.e(8);
                int d12 = q10.d(4) + 1;
                for (int i11 = 0; i11 < d12; i11++) {
                    q10.e(8);
                }
            } else if (d11 == 1) {
                int d13 = q10.d(5);
                int[] iArr = new int[d13];
                int i12 = -1;
                for (int i13 = 0; i13 < d13; i13++) {
                    int d14 = q10.d(4);
                    iArr[i13] = d14;
                    if (d14 > i12) {
                        i12 = d14;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = q10.d(3) + 1;
                    int d15 = q10.d(2);
                    if (d15 > 0) {
                        q10.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << d15); i16++) {
                        q10.e(8);
                    }
                }
                q10.e(2);
                int d16 = q10.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < d13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        q10.e(d16);
                        i18++;
                    }
                }
            } else {
                throw C1961B.a("floor type greater than 1 not decodable: " + d11, (Throwable) null);
            }
        }
    }

    private static void g(int i10, Q q10) {
        int i11;
        int d10 = q10.d(6) + 1;
        for (int i12 = 0; i12 < d10; i12++) {
            int d11 = q10.d(16);
            if (d11 != 0) {
                p.c("VorbisUtil", "mapping type other than 0 not supported: " + d11);
            } else {
                if (q10.c()) {
                    i11 = q10.d(4) + 1;
                } else {
                    i11 = 1;
                }
                if (q10.c()) {
                    int d12 = q10.d(8) + 1;
                    for (int i13 = 0; i13 < d12; i13++) {
                        int i14 = i10 - 1;
                        q10.e(b(i14));
                        q10.e(b(i14));
                    }
                }
                if (q10.d(2) == 0) {
                    if (i11 > 1) {
                        for (int i15 = 0; i15 < i10; i15++) {
                            q10.e(4);
                        }
                    }
                    for (int i16 = 0; i16 < i11; i16++) {
                        q10.e(8);
                        q10.e(8);
                        q10.e(8);
                    }
                } else {
                    throw C1961B.a("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
            }
        }
    }

    private static b[] h(Q q10) {
        int d10 = q10.d(6) + 1;
        b[] bVarArr = new b[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            bVarArr[i10] = new b(q10.c(), q10.d(16), q10.d(16), q10.d(8));
        }
        return bVarArr;
    }

    private static void i(Q q10) {
        int i10;
        int d10 = q10.d(6) + 1;
        int i11 = 0;
        while (i11 < d10) {
            if (q10.d(16) <= 2) {
                q10.e(24);
                q10.e(24);
                q10.e(24);
                int d11 = q10.d(6) + 1;
                q10.e(8);
                int[] iArr = new int[d11];
                for (int i12 = 0; i12 < d11; i12++) {
                    int d12 = q10.d(3);
                    if (q10.c()) {
                        i10 = q10.d(5);
                    } else {
                        i10 = 0;
                    }
                    iArr[i12] = (i10 * 8) + d12;
                }
                for (int i13 = 0; i13 < d11; i13++) {
                    for (int i14 = 0; i14 < 8; i14++) {
                        if ((iArr[i13] & (1 << i14)) != 0) {
                            q10.e(8);
                        }
                    }
                }
                i11++;
            } else {
                throw C1961B.a("residueType greater than 2 is not decodable", (Throwable) null);
            }
        }
    }

    public static a j(C2073A a10) {
        return k(a10, true, true);
    }

    public static a k(C2073A a10, boolean z10, boolean z11) {
        if (z10) {
            o(3, a10, false);
        }
        String E10 = a10.E((int) a10.x());
        int length = E10.length();
        long x10 = a10.x();
        String[] strArr = new String[((int) x10)];
        int i10 = length + 15;
        for (int i11 = 0; ((long) i11) < x10; i11++) {
            String E11 = a10.E((int) a10.x());
            strArr[i11] = E11;
            i10 = i10 + 4 + E11.length();
        }
        if (!z11 || (a10.H() & 1) != 0) {
            return new a(E10, strArr, i10 + 1);
        }
        throw C1961B.a("framing bit expected to be set", (Throwable) null);
    }

    public static c l(C2073A a10) {
        boolean z10 = true;
        o(1, a10, false);
        int y10 = a10.y();
        int H10 = a10.H();
        int y11 = a10.y();
        int u10 = a10.u();
        if (u10 <= 0) {
            u10 = -1;
        }
        int u11 = a10.u();
        if (u11 <= 0) {
            u11 = -1;
        }
        int u12 = a10.u();
        if (u12 <= 0) {
            u12 = -1;
        }
        int H11 = a10.H();
        int pow = (int) Math.pow(2.0d, (double) (H11 & 15));
        int pow2 = (int) Math.pow(2.0d, (double) ((H11 & 240) >> 4));
        if ((a10.H() & 1) <= 0) {
            z10 = false;
        }
        return new c(y10, H10, y11, u10, u11, u12, pow, pow2, z10, Arrays.copyOf(a10.e(), a10.g()));
    }

    public static b[] m(C2073A a10, int i10) {
        int i11 = 0;
        o(5, a10, false);
        int H10 = a10.H() + 1;
        Q q10 = new Q(a10.e());
        q10.e(a10.f() * 8);
        for (int i12 = 0; i12 < H10; i12++) {
            n(q10);
        }
        int d10 = q10.d(6) + 1;
        while (i11 < d10) {
            if (q10.d(16) == 0) {
                i11++;
            } else {
                throw C1961B.a("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        f(q10);
        i(q10);
        g(i10, q10);
        b[] h10 = h(q10);
        if (q10.c()) {
            return h10;
        }
        throw C1961B.a("framing bit after modes not set as expected", (Throwable) null);
    }

    private static void n(Q q10) {
        long j10;
        if (q10.d(24) == 5653314) {
            int d10 = q10.d(16);
            int d11 = q10.d(24);
            int i10 = 0;
            if (!q10.c()) {
                boolean c10 = q10.c();
                while (i10 < d11) {
                    if (!c10) {
                        q10.e(5);
                    } else if (q10.c()) {
                        q10.e(5);
                    }
                    i10++;
                }
            } else {
                q10.e(5);
                while (i10 < d11) {
                    i10 += q10.d(b(d11 - i10));
                }
            }
            int d12 = q10.d(4);
            if (d12 > 2) {
                throw C1961B.a("lookup type greater than 2 not decodable: " + d12, (Throwable) null);
            } else if (d12 == 1 || d12 == 2) {
                q10.e(32);
                q10.e(32);
                int d13 = q10.d(4) + 1;
                q10.e(1);
                if (d12 != 1) {
                    j10 = ((long) d10) * ((long) d11);
                } else if (d10 != 0) {
                    j10 = c((long) d11, (long) d10);
                } else {
                    j10 = 0;
                }
                q10.e((int) (j10 * ((long) d13)));
            }
        } else {
            throw C1961B.a("expected code book to start with [0x56, 0x43, 0x42] at " + q10.b(), (Throwable) null);
        }
    }

    public static boolean o(int i10, C2073A a10, boolean z10) {
        if (a10.a() < 7) {
            if (z10) {
                return false;
            }
            throw C1961B.a("too short header: " + a10.a(), (Throwable) null);
        } else if (a10.H() != i10) {
            if (z10) {
                return false;
            }
            throw C1961B.a("expected header type " + Integer.toHexString(i10), (Throwable) null);
        } else if (a10.H() == 118 && a10.H() == 111 && a10.H() == 114 && a10.H() == 98 && a10.H() == 105 && a10.H() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw C1961B.a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
