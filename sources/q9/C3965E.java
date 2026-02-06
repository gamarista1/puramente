package q9;

import android.util.Base64;
import com.amazon.a.a.o.b.f;
import ja.B;
import ja.M;
import ja.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k9.L0;

/* renamed from: q9.E  reason: case insensitive filesystem */
public abstract class C3965E {

    /* renamed from: q9.E$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f47806a;

        /* renamed from: b  reason: collision with root package name */
        public final int f47807b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f47808c;

        /* renamed from: d  reason: collision with root package name */
        public final int f47809d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f47810e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f47806a = i10;
            this.f47807b = i11;
            this.f47808c = jArr;
            this.f47809d = i12;
            this.f47810e = z10;
        }
    }

    /* renamed from: q9.E$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f47811a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f47812b;

        /* renamed from: c  reason: collision with root package name */
        public final int f47813c;

        public b(String str, String[] strArr, int i10) {
            this.f47811a = str;
            this.f47812b = strArr;
            this.f47813c = i10;
        }
    }

    /* renamed from: q9.E$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47814a;

        /* renamed from: b  reason: collision with root package name */
        public final int f47815b;

        /* renamed from: c  reason: collision with root package name */
        public final int f47816c;

        /* renamed from: d  reason: collision with root package name */
        public final int f47817d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f47814a = z10;
            this.f47815b = i10;
            this.f47816c = i11;
            this.f47817d = i12;
        }
    }

    /* renamed from: q9.E$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f47818a;

        /* renamed from: b  reason: collision with root package name */
        public final int f47819b;

        /* renamed from: c  reason: collision with root package name */
        public final int f47820c;

        /* renamed from: d  reason: collision with root package name */
        public final int f47821d;

        /* renamed from: e  reason: collision with root package name */
        public final int f47822e;

        /* renamed from: f  reason: collision with root package name */
        public final int f47823f;

        /* renamed from: g  reason: collision with root package name */
        public final int f47824g;

        /* renamed from: h  reason: collision with root package name */
        public final int f47825h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f47826i;

        /* renamed from: j  reason: collision with root package name */
        public final byte[] f47827j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f47818a = i10;
            this.f47819b = i11;
            this.f47820c = i12;
            this.f47821d = i13;
            this.f47822e = i14;
            this.f47823f = i15;
            this.f47824g = i16;
            this.f47825h = i17;
            this.f47826i = z10;
            this.f47827j = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long b(long j10, long j11) {
        return (long) Math.floor(Math.pow((double) j10, 1.0d / ((double) j11)));
    }

    public static D9.a c(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] S02 = M.S0(str, f.f37530b);
            if (S02.length != 2) {
                s.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (S02[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(G9.a.a(new B(Base64.decode(S02[1], 0))));
                } catch (RuntimeException e10) {
                    s.j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new L9.a(S02[0], S02[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new D9.a((List) arrayList);
    }

    private static a d(C3964D d10) {
        if (d10.d(24) == 5653314) {
            int d11 = d10.d(16);
            int d12 = d10.d(24);
            long[] jArr = new long[d12];
            boolean c10 = d10.c();
            long j10 = 0;
            if (!c10) {
                boolean c11 = d10.c();
                for (int i10 = 0; i10 < d12; i10++) {
                    if (!c11) {
                        jArr[i10] = (long) (d10.d(5) + 1);
                    } else if (d10.c()) {
                        jArr[i10] = (long) (d10.d(5) + 1);
                    } else {
                        jArr[i10] = 0;
                    }
                }
            } else {
                int d13 = d10.d(5) + 1;
                int i11 = 0;
                while (i11 < d12) {
                    int d14 = d10.d(a(d12 - i11));
                    for (int i12 = 0; i12 < d14 && i11 < d12; i12++) {
                        jArr[i11] = (long) d13;
                        i11++;
                    }
                    d13++;
                }
            }
            int d15 = d10.d(4);
            if (d15 <= 2) {
                if (d15 == 1 || d15 == 2) {
                    d10.e(32);
                    d10.e(32);
                    int d16 = d10.d(4) + 1;
                    d10.e(1);
                    if (d15 != 1) {
                        j10 = ((long) d12) * ((long) d11);
                    } else if (d11 != 0) {
                        j10 = b((long) d12, (long) d11);
                    }
                    d10.e((int) (j10 * ((long) d16)));
                }
                return new a(d11, d12, jArr, d15, c10);
            }
            throw L0.a("lookup type greater than 2 not decodable: " + d15, (Throwable) null);
        }
        throw L0.a("expected code book to start with [0x56, 0x43, 0x42] at " + d10.b(), (Throwable) null);
    }

    private static void e(C3964D d10) {
        int d11 = d10.d(6) + 1;
        for (int i10 = 0; i10 < d11; i10++) {
            int d12 = d10.d(16);
            if (d12 == 0) {
                d10.e(8);
                d10.e(16);
                d10.e(16);
                d10.e(6);
                d10.e(8);
                int d13 = d10.d(4) + 1;
                for (int i11 = 0; i11 < d13; i11++) {
                    d10.e(8);
                }
            } else if (d12 == 1) {
                int d14 = d10.d(5);
                int[] iArr = new int[d14];
                int i12 = -1;
                for (int i13 = 0; i13 < d14; i13++) {
                    int d15 = d10.d(4);
                    iArr[i13] = d15;
                    if (d15 > i12) {
                        i12 = d15;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = d10.d(3) + 1;
                    int d16 = d10.d(2);
                    if (d16 > 0) {
                        d10.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << d16); i16++) {
                        d10.e(8);
                    }
                }
                d10.e(2);
                int d17 = d10.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < d14; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        d10.e(d17);
                        i18++;
                    }
                }
            } else {
                throw L0.a("floor type greater than 1 not decodable: " + d12, (Throwable) null);
            }
        }
    }

    private static void f(int i10, C3964D d10) {
        int i11;
        int d11 = d10.d(6) + 1;
        for (int i12 = 0; i12 < d11; i12++) {
            int d12 = d10.d(16);
            if (d12 != 0) {
                s.c("VorbisUtil", "mapping type other than 0 not supported: " + d12);
            } else {
                if (d10.c()) {
                    i11 = d10.d(4) + 1;
                } else {
                    i11 = 1;
                }
                if (d10.c()) {
                    int d13 = d10.d(8) + 1;
                    for (int i13 = 0; i13 < d13; i13++) {
                        int i14 = i10 - 1;
                        d10.e(a(i14));
                        d10.e(a(i14));
                    }
                }
                if (d10.d(2) == 0) {
                    if (i11 > 1) {
                        for (int i15 = 0; i15 < i10; i15++) {
                            d10.e(4);
                        }
                    }
                    for (int i16 = 0; i16 < i11; i16++) {
                        d10.e(8);
                        d10.e(8);
                        d10.e(8);
                    }
                } else {
                    throw L0.a("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
            }
        }
    }

    private static c[] g(C3964D d10) {
        int d11 = d10.d(6) + 1;
        c[] cVarArr = new c[d11];
        for (int i10 = 0; i10 < d11; i10++) {
            cVarArr[i10] = new c(d10.c(), d10.d(16), d10.d(16), d10.d(8));
        }
        return cVarArr;
    }

    private static void h(C3964D d10) {
        int i10;
        int d11 = d10.d(6) + 1;
        int i11 = 0;
        while (i11 < d11) {
            if (d10.d(16) <= 2) {
                d10.e(24);
                d10.e(24);
                d10.e(24);
                int d12 = d10.d(6) + 1;
                d10.e(8);
                int[] iArr = new int[d12];
                for (int i12 = 0; i12 < d12; i12++) {
                    int d13 = d10.d(3);
                    if (d10.c()) {
                        i10 = d10.d(5);
                    } else {
                        i10 = 0;
                    }
                    iArr[i12] = (i10 * 8) + d13;
                }
                for (int i13 = 0; i13 < d12; i13++) {
                    for (int i14 = 0; i14 < 8; i14++) {
                        if ((iArr[i13] & (1 << i14)) != 0) {
                            d10.e(8);
                        }
                    }
                }
                i11++;
            } else {
                throw L0.a("residueType greater than 2 is not decodable", (Throwable) null);
            }
        }
    }

    public static b i(B b10) {
        return j(b10, true, true);
    }

    public static b j(B b10, boolean z10, boolean z11) {
        if (z10) {
            m(3, b10, false);
        }
        String A10 = b10.A((int) b10.t());
        int length = A10.length();
        long t10 = b10.t();
        String[] strArr = new String[((int) t10)];
        int i10 = length + 15;
        for (int i11 = 0; ((long) i11) < t10; i11++) {
            String A11 = b10.A((int) b10.t());
            strArr[i11] = A11;
            i10 = i10 + 4 + A11.length();
        }
        if (!z11 || (b10.D() & 1) != 0) {
            return new b(A10, strArr, i10 + 1);
        }
        throw L0.a("framing bit expected to be set", (Throwable) null);
    }

    public static d k(B b10) {
        boolean z10 = true;
        m(1, b10, false);
        int u10 = b10.u();
        int D10 = b10.D();
        int u11 = b10.u();
        int q10 = b10.q();
        if (q10 <= 0) {
            q10 = -1;
        }
        int q11 = b10.q();
        if (q11 <= 0) {
            q11 = -1;
        }
        int q12 = b10.q();
        if (q12 <= 0) {
            q12 = -1;
        }
        int D11 = b10.D();
        int pow = (int) Math.pow(2.0d, (double) (D11 & 15));
        int pow2 = (int) Math.pow(2.0d, (double) ((D11 & 240) >> 4));
        if ((b10.D() & 1) <= 0) {
            z10 = false;
        }
        return new d(u10, D10, u11, q10, q11, q12, pow, pow2, z10, Arrays.copyOf(b10.d(), b10.f()));
    }

    public static c[] l(B b10, int i10) {
        int i11 = 0;
        m(5, b10, false);
        int D10 = b10.D() + 1;
        C3964D d10 = new C3964D(b10.d());
        d10.e(b10.e() * 8);
        for (int i12 = 0; i12 < D10; i12++) {
            d(d10);
        }
        int d11 = d10.d(6) + 1;
        while (i11 < d11) {
            if (d10.d(16) == 0) {
                i11++;
            } else {
                throw L0.a("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        e(d10);
        h(d10);
        f(i10, d10);
        c[] g10 = g(d10);
        if (d10.c()) {
            return g10;
        }
        throw L0.a("framing bit after modes not set as expected", (Throwable) null);
    }

    public static boolean m(int i10, B b10, boolean z10) {
        if (b10.a() < 7) {
            if (z10) {
                return false;
            }
            throw L0.a("too short header: " + b10.a(), (Throwable) null);
        } else if (b10.D() != i10) {
            if (z10) {
                return false;
            }
            throw L0.a("expected header type " + Integer.toHexString(i10), (Throwable) null);
        } else if (b10.D() == 118 && b10.D() == 111 && b10.D() == 114 && b10.D() == 98 && b10.D() == 105 && b10.D() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw L0.a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
