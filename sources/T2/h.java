package T2;

import K2.c;
import T2.a;
import W2.s;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.a;
import com.google.common.collect.C4770v;
import f2.C1961B;
import f2.C1979n;
import f2.s;
import i2.C2073A;
import i2.C2076a;
import i2.G;
import i2.L;
import i2.p;
import j2.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import z2.B;
import z2.C2963g;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.N;
import z2.O;
import z2.r;
import z2.u;

public class h implements C2972p {

    /* renamed from: K  reason: collision with root package name */
    public static final u f6023K = new f();

    /* renamed from: L  reason: collision with root package name */
    private static final byte[] f6024L = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: M  reason: collision with root package name */
    private static final s f6025M = new s.b().o0("application/x-emsg").K();

    /* renamed from: A  reason: collision with root package name */
    private long f6026A;

    /* renamed from: B  reason: collision with root package name */
    private b f6027B;

    /* renamed from: C  reason: collision with root package name */
    private int f6028C;

    /* renamed from: D  reason: collision with root package name */
    private int f6029D;

    /* renamed from: E  reason: collision with root package name */
    private int f6030E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f6031F;

    /* renamed from: G  reason: collision with root package name */
    private r f6032G;

    /* renamed from: H  reason: collision with root package name */
    private O[] f6033H;

    /* renamed from: I  reason: collision with root package name */
    private O[] f6034I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f6035J;

    /* renamed from: a  reason: collision with root package name */
    private final s.a f6036a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6037b;

    /* renamed from: c  reason: collision with root package name */
    private final s f6038c;

    /* renamed from: d  reason: collision with root package name */
    private final List f6039d;

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray f6040e;

    /* renamed from: f  reason: collision with root package name */
    private final C2073A f6041f;

    /* renamed from: g  reason: collision with root package name */
    private final C2073A f6042g;

    /* renamed from: h  reason: collision with root package name */
    private final C2073A f6043h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f6044i;

    /* renamed from: j  reason: collision with root package name */
    private final C2073A f6045j;

    /* renamed from: k  reason: collision with root package name */
    private final G f6046k;

    /* renamed from: l  reason: collision with root package name */
    private final c f6047l;

    /* renamed from: m  reason: collision with root package name */
    private final C2073A f6048m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayDeque f6049n;

    /* renamed from: o  reason: collision with root package name */
    private final ArrayDeque f6050o;

    /* renamed from: p  reason: collision with root package name */
    private final O f6051p;

    /* renamed from: q  reason: collision with root package name */
    private C4770v f6052q;

    /* renamed from: r  reason: collision with root package name */
    private int f6053r;

    /* renamed from: s  reason: collision with root package name */
    private int f6054s;

    /* renamed from: t  reason: collision with root package name */
    private long f6055t;

    /* renamed from: u  reason: collision with root package name */
    private int f6056u;

    /* renamed from: v  reason: collision with root package name */
    private C2073A f6057v;

    /* renamed from: w  reason: collision with root package name */
    private long f6058w;

    /* renamed from: x  reason: collision with root package name */
    private int f6059x;

    /* renamed from: y  reason: collision with root package name */
    private long f6060y;

    /* renamed from: z  reason: collision with root package name */
    private long f6061z;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f6062a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6063b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6064c;

        public a(long j10, boolean z10, int i10) {
            this.f6062a = j10;
            this.f6063b = z10;
            this.f6064c = i10;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final O f6065a;

        /* renamed from: b  reason: collision with root package name */
        public final u f6066b = new u();

        /* renamed from: c  reason: collision with root package name */
        public final C2073A f6067c = new C2073A();

        /* renamed from: d  reason: collision with root package name */
        public v f6068d;

        /* renamed from: e  reason: collision with root package name */
        public d f6069e;

        /* renamed from: f  reason: collision with root package name */
        public int f6070f;

        /* renamed from: g  reason: collision with root package name */
        public int f6071g;

        /* renamed from: h  reason: collision with root package name */
        public int f6072h;

        /* renamed from: i  reason: collision with root package name */
        public int f6073i;

        /* renamed from: j  reason: collision with root package name */
        private final C2073A f6074j = new C2073A(1);

        /* renamed from: k  reason: collision with root package name */
        private final C2073A f6075k = new C2073A();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public boolean f6076l;

        public b(O o10, v vVar, d dVar) {
            this.f6065a = o10;
            this.f6068d = vVar;
            this.f6069e = dVar;
            j(vVar, dVar);
        }

        public int c() {
            int i10;
            if (!this.f6076l) {
                i10 = this.f6068d.f6167g[this.f6070f];
            } else if (this.f6066b.f6153k[this.f6070f]) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (g() != null) {
                return i10 | 1073741824;
            }
            return i10;
        }

        public long d() {
            if (!this.f6076l) {
                return this.f6068d.f6163c[this.f6070f];
            }
            return this.f6066b.f6149g[this.f6072h];
        }

        public long e() {
            if (!this.f6076l) {
                return this.f6068d.f6166f[this.f6070f];
            }
            return this.f6066b.c(this.f6070f);
        }

        public int f() {
            if (!this.f6076l) {
                return this.f6068d.f6164d[this.f6070f];
            }
            return this.f6066b.f6151i[this.f6070f];
        }

        public t g() {
            if (!this.f6076l) {
                return null;
            }
            int i10 = ((d) L.h(this.f6066b.f6143a)).f6012a;
            t tVar = this.f6066b.f6156n;
            if (tVar == null) {
                tVar = this.f6068d.f6161a.a(i10);
            }
            if (tVar == null || !tVar.f6138a) {
                return null;
            }
            return tVar;
        }

        public boolean h() {
            this.f6070f++;
            if (!this.f6076l) {
                return false;
            }
            int i10 = this.f6071g + 1;
            this.f6071g = i10;
            int[] iArr = this.f6066b.f6150h;
            int i11 = this.f6072h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f6072h = i11 + 1;
            this.f6071g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            C2073A a10;
            boolean z10;
            int i12;
            t g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i13 = g10.f6141d;
            if (i13 != 0) {
                a10 = this.f6066b.f6157o;
            } else {
                byte[] bArr = (byte[]) L.h(g10.f6142e);
                this.f6075k.S(bArr, bArr.length);
                C2073A a11 = this.f6075k;
                i13 = bArr.length;
                a10 = a11;
            }
            boolean g11 = this.f6066b.g(this.f6070f);
            if (g11 || i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte[] e10 = this.f6074j.e();
            if (z10) {
                i12 = 128;
            } else {
                i12 = 0;
            }
            e10[0] = (byte) (i12 | i13);
            this.f6074j.U(0);
            this.f6065a.e(this.f6074j, 1, 1);
            this.f6065a.e(a10, i13, 1);
            if (!z10) {
                return i13 + 1;
            }
            if (!g11) {
                this.f6067c.Q(8);
                byte[] e11 = this.f6067c.e();
                e11[0] = 0;
                e11[1] = 1;
                e11[2] = (byte) ((i11 >> 8) & 255);
                e11[3] = (byte) (i11 & 255);
                e11[4] = (byte) ((i10 >> 24) & 255);
                e11[5] = (byte) ((i10 >> 16) & 255);
                e11[6] = (byte) ((i10 >> 8) & 255);
                e11[7] = (byte) (i10 & 255);
                this.f6065a.e(this.f6067c, 8, 1);
                return i13 + 9;
            }
            C2073A a12 = this.f6066b.f6157o;
            int N10 = a12.N();
            a12.V(-2);
            int i14 = (N10 * 6) + 2;
            if (i11 != 0) {
                this.f6067c.Q(i14);
                byte[] e12 = this.f6067c.e();
                a12.l(e12, 0, i14);
                int i15 = (((e12[2] & 255) << 8) | (e12[3] & 255)) + i11;
                e12[2] = (byte) ((i15 >> 8) & 255);
                e12[3] = (byte) (i15 & 255);
                a12 = this.f6067c;
            }
            this.f6065a.e(a12, i14, 1);
            return i13 + 1 + i14;
        }

        public void j(v vVar, d dVar) {
            this.f6068d = vVar;
            this.f6069e = dVar;
            this.f6065a.c(vVar.f6161a.f6132f);
            k();
        }

        public void k() {
            this.f6066b.f();
            this.f6070f = 0;
            this.f6072h = 0;
            this.f6071g = 0;
            this.f6073i = 0;
            this.f6076l = false;
        }

        public void l(long j10) {
            int i10 = this.f6070f;
            while (true) {
                u uVar = this.f6066b;
                if (i10 < uVar.f6148f && uVar.c(i10) <= j10) {
                    if (this.f6066b.f6153k[i10]) {
                        this.f6073i = i10;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        public void m() {
            t g10 = g();
            if (g10 != null) {
                C2073A a10 = this.f6066b.f6157o;
                int i10 = g10.f6141d;
                if (i10 != 0) {
                    a10.V(i10);
                }
                if (this.f6066b.g(this.f6070f)) {
                    a10.V(a10.N() * 6);
                }
            }
        }

        public void n(C1979n nVar) {
            String str;
            t a10 = this.f6068d.f6161a.a(((d) L.h(this.f6066b.f6143a)).f6012a);
            if (a10 != null) {
                str = a10.f6139b;
            } else {
                str = null;
            }
            this.f6065a.c(this.f6068d.f6161a.f6132f.a().U(nVar.b(str)).K());
        }
    }

    public h(s.a aVar, int i10) {
        this(aVar, i10, (G) null, (s) null, C4770v.E(), (O) null);
    }

    private static void A(t tVar, C2073A a10, u uVar) {
        int i10;
        boolean z10;
        int i11 = tVar.f6141d;
        a10.U(8);
        boolean z11 = true;
        if ((a.b(a10.q()) & 1) == 1) {
            a10.V(8);
        }
        int H10 = a10.H();
        int L10 = a10.L();
        if (L10 <= uVar.f6148f) {
            if (H10 == 0) {
                boolean[] zArr = uVar.f6155m;
                i10 = 0;
                for (int i12 = 0; i12 < L10; i12++) {
                    int H11 = a10.H();
                    i10 += H11;
                    if (H11 > i11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zArr[i12] = z10;
                }
            } else {
                if (H10 <= i11) {
                    z11 = false;
                }
                i10 = H10 * L10;
                Arrays.fill(uVar.f6155m, 0, L10, z11);
            }
            Arrays.fill(uVar.f6155m, L10, uVar.f6148f, false);
            if (i10 > 0) {
                uVar.d(i10);
                return;
            }
            return;
        }
        throw C1961B.a("Saiz sample count " + L10 + " is greater than fragment sample count" + uVar.f6148f, (Throwable) null);
    }

    private static void B(a.C0142a aVar, String str, u uVar) {
        boolean z10;
        a.C0142a aVar2 = aVar;
        u uVar2 = uVar;
        byte[] bArr = null;
        C2073A a10 = null;
        C2073A a11 = null;
        for (int i10 = 0; i10 < aVar2.f5977c.size(); i10++) {
            a.b bVar = (a.b) aVar2.f5977c.get(i10);
            C2073A a12 = bVar.f5979b;
            int i11 = bVar.f5975a;
            if (i11 == 1935828848) {
                a12.U(12);
                if (a12.q() == 1936025959) {
                    a10 = a12;
                }
            } else if (i11 == 1936158820) {
                a12.U(12);
                if (a12.q() == 1936025959) {
                    a11 = a12;
                }
            }
        }
        if (a10 != null && a11 != null) {
            a10.U(8);
            int c10 = a.c(a10.q());
            a10.V(4);
            if (c10 == 1) {
                a10.V(4);
            }
            if (a10.q() == 1) {
                a11.U(8);
                int c11 = a.c(a11.q());
                a11.V(4);
                if (c11 == 1) {
                    if (a11.J() == 0) {
                        throw C1961B.c("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c11 >= 2) {
                    a11.V(4);
                }
                if (a11.J() == 1) {
                    a11.V(1);
                    int H10 = a11.H();
                    int i12 = (H10 & 240) >> 4;
                    int i13 = H10 & 15;
                    if (a11.H() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int H11 = a11.H();
                        byte[] bArr2 = new byte[16];
                        a11.l(bArr2, 0, 16);
                        if (H11 == 0) {
                            int H12 = a11.H();
                            bArr = new byte[H12];
                            a11.l(bArr, 0, H12);
                        }
                        uVar2.f6154l = true;
                        uVar2.f6156n = new t(z10, str, H11, bArr2, i12, i13, bArr);
                        return;
                    }
                    return;
                }
                throw C1961B.c("Entry count in sgpd != 1 (unsupported).");
            }
            throw C1961B.c("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private static void C(C2073A a10, int i10, u uVar) {
        boolean z10;
        a10.U(i10 + 8);
        int b10 = a.b(a10.q());
        if ((b10 & 1) == 0) {
            if ((b10 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int L10 = a10.L();
            if (L10 == 0) {
                Arrays.fill(uVar.f6155m, 0, uVar.f6148f, false);
            } else if (L10 == uVar.f6148f) {
                Arrays.fill(uVar.f6155m, 0, L10, z10);
                uVar.d(a10.a());
                uVar.a(a10);
            } else {
                throw C1961B.a("Senc sample count " + L10 + " is different from fragment sample count" + uVar.f6148f, (Throwable) null);
            }
        } else {
            throw C1961B.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    private static void D(C2073A a10, u uVar) {
        C(a10, 0, uVar);
    }

    private static Pair E(C2073A a10, long j10) {
        long M10;
        long M11;
        C2073A a11 = a10;
        a11.U(8);
        int c10 = a.c(a10.q());
        a11.V(4);
        long J10 = a10.J();
        if (c10 == 0) {
            M10 = a10.J();
            M11 = a10.J();
        } else {
            M10 = a10.M();
            M11 = a10.M();
        }
        long j11 = M10;
        long j12 = j10 + M11;
        long U02 = L.U0(j11, 1000000, J10);
        a11.V(2);
        int N10 = a10.N();
        int[] iArr = new int[N10];
        long[] jArr = new long[N10];
        long[] jArr2 = new long[N10];
        long[] jArr3 = new long[N10];
        long j13 = U02;
        long j14 = j11;
        int i10 = 0;
        long j15 = j14;
        while (i10 < N10) {
            int q10 = a10.q();
            if ((q10 & Integer.MIN_VALUE) == 0) {
                long J11 = a10.J();
                iArr[i10] = q10 & a.e.API_PRIORITY_OTHER;
                jArr[i10] = j12;
                jArr3[i10] = j13;
                long j16 = j15 + J11;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i11 = N10;
                int[] iArr2 = iArr;
                long U03 = L.U0(j16, 1000000, J10);
                jArr4[i10] = U03 - jArr5[i10];
                a11.V(4);
                j12 += (long) iArr2[i10];
                i10++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                N10 = i11;
                long j17 = U03;
                j15 = j16;
                j13 = j17;
            } else {
                throw C1961B.a("Unhandled indirect reference", (Throwable) null);
            }
        }
        return Pair.create(Long.valueOf(U02), new C2963g(iArr, jArr, jArr2, jArr3));
    }

    private static long F(C2073A a10) {
        a10.U(8);
        if (a.c(a10.q()) == 1) {
            return a10.M();
        }
        return a10.J();
    }

    private static b G(C2073A a10, SparseArray sparseArray, boolean z10) {
        Object obj;
        int i10;
        int i11;
        int i12;
        int i13;
        a10.U(8);
        int b10 = a.b(a10.q());
        int q10 = a10.q();
        if (z10) {
            obj = sparseArray.valueAt(0);
        } else {
            obj = sparseArray.get(q10);
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return null;
        }
        if ((b10 & 1) != 0) {
            long M10 = a10.M();
            u uVar = bVar.f6066b;
            uVar.f6145c = M10;
            uVar.f6146d = M10;
        }
        d dVar = bVar.f6069e;
        if ((b10 & 2) != 0) {
            i10 = a10.q() - 1;
        } else {
            i10 = dVar.f6012a;
        }
        if ((b10 & 8) != 0) {
            i11 = a10.q();
        } else {
            i11 = dVar.f6013b;
        }
        if ((b10 & 16) != 0) {
            i12 = a10.q();
        } else {
            i12 = dVar.f6014c;
        }
        if ((b10 & 32) != 0) {
            i13 = a10.q();
        } else {
            i13 = dVar.f6015d;
        }
        bVar.f6066b.f6143a = new d(i10, i11, i12, i13);
        return bVar;
    }

    private static void H(a.C0142a aVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) {
        String str;
        b G10 = G(((a.b) C2076a.e(aVar.g(1952868452))).f5979b, sparseArray, z10);
        if (G10 != null) {
            u uVar = G10.f6066b;
            long j10 = uVar.f6159q;
            boolean z11 = uVar.f6160r;
            G10.k();
            boolean unused = G10.f6076l = true;
            a.b g10 = aVar.g(1952867444);
            if (g10 == null || (i10 & 2) != 0) {
                uVar.f6159q = j10;
                uVar.f6160r = z11;
            } else {
                uVar.f6159q = F(g10.f5979b);
                uVar.f6160r = true;
            }
            K(aVar, G10, i10);
            t a10 = G10.f6068d.f6161a.a(((d) C2076a.e(uVar.f6143a)).f6012a);
            a.b g11 = aVar.g(1935763834);
            if (g11 != null) {
                A((t) C2076a.e(a10), g11.f5979b, uVar);
            }
            a.b g12 = aVar.g(1935763823);
            if (g12 != null) {
                z(g12.f5979b, uVar);
            }
            a.b g13 = aVar.g(1936027235);
            if (g13 != null) {
                D(g13.f5979b, uVar);
            }
            if (a10 != null) {
                str = a10.f6139b;
            } else {
                str = null;
            }
            B(aVar, str, uVar);
            int size = aVar.f5977c.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = (a.b) aVar.f5977c.get(i11);
                if (bVar.f5975a == 1970628964) {
                    L(bVar.f5979b, uVar, bArr);
                }
            }
        }
    }

    private static Pair I(C2073A a10) {
        a10.U(12);
        return Pair.create(Integer.valueOf(a10.q()), new d(a10.q() - 1, a10.q(), a10.q(), a10.q()));
    }

    private static int J(b bVar, int i10, int i11, C2073A a10, int i12) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        long j10;
        boolean z15;
        int i13;
        boolean z16;
        int i14;
        boolean z17;
        int i15;
        boolean z18;
        boolean z19;
        boolean z20;
        int i16;
        boolean z21;
        b bVar2 = bVar;
        a10.U(8);
        int b10 = a.b(a10.q());
        s sVar = bVar2.f6068d.f6161a;
        u uVar = bVar2.f6066b;
        d dVar = (d) L.h(uVar.f6143a);
        uVar.f6150h[i10] = a10.L();
        long[] jArr = uVar.f6149g;
        long j11 = uVar.f6145c;
        jArr[i10] = j11;
        if ((b10 & 1) != 0) {
            jArr[i10] = j11 + ((long) a10.q());
        }
        if ((b10 & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i17 = dVar.f6015d;
        if (z10) {
            i17 = a10.q();
        }
        if ((b10 & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((b10 & 512) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((b10 & 1024) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if ((b10 & 2048) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o(sVar)) {
            j10 = ((long[]) L.h(sVar.f6135i))[0];
        } else {
            j10 = 0;
        }
        int[] iArr = uVar.f6151i;
        long[] jArr2 = uVar.f6152j;
        boolean[] zArr = uVar.f6153k;
        int i18 = i17;
        if (sVar.f6128b != 2 || (i11 & 1) == 0) {
            z15 = false;
        } else {
            z15 = true;
        }
        int i19 = i12 + uVar.f6150h[i10];
        boolean z22 = z15;
        long[] jArr3 = jArr2;
        boolean[] zArr2 = zArr;
        long j12 = sVar.f6129c;
        long j13 = uVar.f6159q;
        int i20 = i12;
        while (i20 < i19) {
            if (z11) {
                i13 = a10.q();
            } else {
                i13 = dVar.f6013b;
            }
            int c10 = c(i13);
            if (z12) {
                i14 = a10.q();
                z16 = z11;
            } else {
                z16 = z11;
                i14 = dVar.f6014c;
            }
            int c11 = c(i14);
            if (z13) {
                z17 = z10;
                i15 = a10.q();
            } else if (i20 != 0 || !z10) {
                z17 = z10;
                i15 = dVar.f6015d;
            } else {
                z17 = z10;
                i15 = i18;
            }
            if (z14) {
                z20 = z14;
                z19 = z12;
                z18 = z13;
                i16 = a10.q();
            } else {
                z20 = z14;
                z19 = z12;
                z18 = z13;
                i16 = 0;
            }
            long U02 = L.U0((((long) i16) + j13) - j10, 1000000, j12);
            jArr3[i20] = U02;
            if (!uVar.f6160r) {
                jArr3[i20] = U02 + bVar2.f6068d.f6168h;
            }
            iArr[i20] = c11;
            if (((i15 >> 16) & 1) != 0 || (z22 && i20 != 0)) {
                z21 = false;
            } else {
                z21 = true;
            }
            zArr2[i20] = z21;
            j13 += (long) c10;
            i20++;
            bVar2 = bVar;
            z11 = z16;
            z10 = z17;
            z14 = z20;
            z12 = z19;
            z13 = z18;
        }
        uVar.f6159q = j13;
        return i19;
    }

    private static void K(a.C0142a aVar, b bVar, int i10) {
        List list = aVar.f5977c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = (a.b) list.get(i13);
            if (bVar2.f5975a == 1953658222) {
                C2073A a10 = bVar2.f5979b;
                a10.U(12);
                int L10 = a10.L();
                if (L10 > 0) {
                    i12 += L10;
                    i11++;
                }
            }
        }
        bVar.f6072h = 0;
        bVar.f6071g = 0;
        bVar.f6070f = 0;
        bVar.f6066b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar3 = (a.b) list.get(i16);
            if (bVar3.f5975a == 1953658222) {
                i15 = J(bVar, i14, i10, bVar3.f5979b, i15);
                i14++;
            }
        }
    }

    private static void L(C2073A a10, u uVar, byte[] bArr) {
        a10.U(8);
        a10.l(bArr, 0, 16);
        if (Arrays.equals(bArr, f6024L)) {
            C(a10, 16, uVar);
        }
    }

    private void M(long j10) {
        while (!this.f6049n.isEmpty() && ((a.C0142a) this.f6049n.peek()).f5976b == j10) {
            r((a.C0142a) this.f6049n.pop());
        }
        d();
    }

    private boolean N(C2973q qVar) {
        if (this.f6056u == 0) {
            if (!qVar.f(this.f6048m.e(), 0, 8, true)) {
                return false;
            }
            this.f6056u = 8;
            this.f6048m.U(0);
            this.f6055t = this.f6048m.J();
            this.f6054s = this.f6048m.q();
        }
        long j10 = this.f6055t;
        if (j10 == 1) {
            qVar.readFully(this.f6048m.e(), 8, 8);
            this.f6056u += 8;
            this.f6055t = this.f6048m.M();
        } else if (j10 == 0) {
            long a10 = qVar.a();
            if (a10 == -1 && !this.f6049n.isEmpty()) {
                a10 = ((a.C0142a) this.f6049n.peek()).f5976b;
            }
            if (a10 != -1) {
                this.f6055t = (a10 - qVar.getPosition()) + ((long) this.f6056u);
            }
        }
        if (this.f6055t >= ((long) this.f6056u)) {
            long position = qVar.getPosition() - ((long) this.f6056u);
            int i10 = this.f6054s;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.f6035J) {
                this.f6032G.u(new J.b(this.f6061z, position));
                this.f6035J = true;
            }
            if (this.f6054s == 1836019558) {
                int size = this.f6040e.size();
                for (int i11 = 0; i11 < size; i11++) {
                    u uVar = ((b) this.f6040e.valueAt(i11)).f6066b;
                    uVar.f6144b = position;
                    uVar.f6146d = position;
                    uVar.f6145c = position;
                }
            }
            int i12 = this.f6054s;
            if (i12 == 1835295092) {
                this.f6027B = null;
                this.f6058w = position + this.f6055t;
                this.f6053r = 2;
                return true;
            }
            if (R(i12)) {
                long position2 = (qVar.getPosition() + this.f6055t) - 8;
                this.f6049n.push(new a.C0142a(this.f6054s, position2));
                if (this.f6055t == ((long) this.f6056u)) {
                    M(position2);
                } else {
                    d();
                }
            } else if (S(this.f6054s)) {
                if (this.f6056u != 8) {
                    throw C1961B.c("Leaf atom defines extended atom size (unsupported).");
                } else if (this.f6055t <= 2147483647L) {
                    C2073A a11 = new C2073A((int) this.f6055t);
                    System.arraycopy(this.f6048m.e(), 0, a11.e(), 0, 8);
                    this.f6057v = a11;
                    this.f6053r = 1;
                } else {
                    throw C1961B.c("Leaf atom with length > 2147483647 (unsupported).");
                }
            } else if (this.f6055t <= 2147483647L) {
                this.f6057v = null;
                this.f6053r = 1;
            } else {
                throw C1961B.c("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw C1961B.c("Atom size less than header length (unsupported).");
    }

    private void O(C2973q qVar) {
        int i10 = ((int) this.f6055t) - this.f6056u;
        C2073A a10 = this.f6057v;
        if (a10 != null) {
            qVar.readFully(a10.e(), 8, i10);
            t(new a.b(this.f6054s, a10), qVar.getPosition());
        } else {
            qVar.j(i10);
        }
        M(qVar.getPosition());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: T2.h$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void P(z2.C2973q r10) {
        /*
            r9 = this;
            android.util.SparseArray r0 = r9.f6040e
            int r0 = r0.size()
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r5 = r1
        L_0x000e:
            if (r4 >= r0) goto L_0x0031
            android.util.SparseArray r6 = r9.f6040e
            java.lang.Object r6 = r6.valueAt(r4)
            T2.h$b r6 = (T2.h.b) r6
            T2.u r6 = r6.f6066b
            boolean r7 = r6.f6158p
            if (r7 == 0) goto L_0x002e
            long r6 = r6.f6146d
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x002e
            android.util.SparseArray r2 = r9.f6040e
            java.lang.Object r2 = r2.valueAt(r4)
            r5 = r2
            T2.h$b r5 = (T2.h.b) r5
            r2 = r6
        L_0x002e:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0031:
            if (r5 != 0) goto L_0x0037
            r10 = 3
            r9.f6053r = r10
            return
        L_0x0037:
            long r6 = r10.getPosition()
            long r2 = r2 - r6
            int r0 = (int) r2
            if (r0 < 0) goto L_0x0048
            r10.j(r0)
            T2.u r0 = r5.f6066b
            r0.b(r10)
            return
        L_0x0048:
            java.lang.String r10 = "Offset to encryption data was negative."
            f2.B r10 = f2.C1961B.a(r10, r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.h.P(z2.q):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean Q(z2.C2973q r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            T2.h$b r2 = r0.f6027B
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L_0x0043
            android.util.SparseArray r2 = r0.f6040e
            T2.h$b r2 = l(r2)
            if (r2 != 0) goto L_0x002a
            long r5 = r0.f6058w
            long r7 = r17.getPosition()
            long r5 = r5 - r7
            int r2 = (int) r5
            if (r2 < 0) goto L_0x0023
            r1.j(r2)
            r16.d()
            return r4
        L_0x0023:
            java.lang.String r1 = "Offset to end of mdat was negative."
            f2.B r1 = f2.C1961B.a(r1, r3)
            throw r1
        L_0x002a:
            long r5 = r2.d()
            long r7 = r17.getPosition()
            long r5 = r5 - r7
            int r5 = (int) r5
            if (r5 >= 0) goto L_0x003e
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Ignoring negative offset to sample data."
            i2.p.h(r5, r6)
            r5 = r4
        L_0x003e:
            r1.j(r5)
            r0.f6027B = r2
        L_0x0043:
            int r5 = r0.f6053r
            r6 = 3
            r7 = 4
            r8 = 1
            if (r5 != r6) goto L_0x00b7
            int r5 = r2.f()
            r0.f6028C = r5
            int r9 = r2.f6070f
            int r10 = r2.f6073i
            if (r9 >= r10) goto L_0x0067
            r1.j(r5)
            r2.m()
            boolean r1 = r2.h()
            if (r1 != 0) goto L_0x0064
            r0.f6027B = r3
        L_0x0064:
            r0.f6053r = r6
            return r8
        L_0x0067:
            T2.v r9 = r2.f6068d
            T2.s r9 = r9.f6161a
            int r9 = r9.f6133g
            if (r9 != r8) goto L_0x0077
            r9 = 8
            int r5 = r5 - r9
            r0.f6028C = r5
            r1.j(r9)
        L_0x0077:
            T2.v r5 = r2.f6068d
            T2.s r5 = r5.f6161a
            f2.s r5 = r5.f6132f
            java.lang.String r5 = r5.f20083n
            java.lang.String r9 = "audio/ac4"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x00a4
            int r5 = r0.f6028C
            r9 = 7
            int r5 = r2.i(r5, r9)
            r0.f6029D = r5
            int r5 = r0.f6028C
            i2.A r10 = r0.f6045j
            z2.C2959c.a(r5, r10)
            z2.O r5 = r2.f6065a
            i2.A r10 = r0.f6045j
            r5.f(r10, r9)
            int r5 = r0.f6029D
            int r5 = r5 + r9
            r0.f6029D = r5
            goto L_0x00ac
        L_0x00a4:
            int r5 = r0.f6028C
            int r5 = r2.i(r5, r4)
            r0.f6029D = r5
        L_0x00ac:
            int r5 = r0.f6028C
            int r9 = r0.f6029D
            int r5 = r5 + r9
            r0.f6028C = r5
            r0.f6053r = r7
            r0.f6030E = r4
        L_0x00b7:
            T2.v r5 = r2.f6068d
            T2.s r5 = r5.f6161a
            z2.O r9 = r2.f6065a
            long r10 = r2.e()
            i2.G r12 = r0.f6046k
            if (r12 == 0) goto L_0x00c9
            long r10 = r12.a(r10)
        L_0x00c9:
            r14 = r10
            int r10 = r5.f6136j
            if (r10 == 0) goto L_0x0195
            i2.A r10 = r0.f6042g
            byte[] r10 = r10.e()
            r10[r4] = r4
            r10[r8] = r4
            r11 = 2
            r10[r11] = r4
            int r11 = r5.f6136j
            int r12 = r11 + 1
            int r11 = 4 - r11
        L_0x00e1:
            int r13 = r0.f6029D
            int r6 = r0.f6028C
            if (r13 >= r6) goto L_0x01a6
            int r6 = r0.f6030E
            if (r6 != 0) goto L_0x0138
            r1.readFully(r10, r11, r12)
            i2.A r6 = r0.f6042g
            r6.U(r4)
            i2.A r6 = r0.f6042g
            int r6 = r6.q()
            if (r6 < r8) goto L_0x0131
            int r6 = r6 + -1
            r0.f6030E = r6
            i2.A r6 = r0.f6041f
            r6.U(r4)
            i2.A r6 = r0.f6041f
            r9.f(r6, r7)
            i2.A r6 = r0.f6042g
            r9.f(r6, r8)
            z2.O[] r6 = r0.f6034I
            int r6 = r6.length
            if (r6 <= 0) goto L_0x0121
            f2.s r6 = r5.f6132f
            java.lang.String r6 = r6.f20083n
            byte r13 = r10[r7]
            boolean r6 = j2.d.g(r6, r13)
            if (r6 == 0) goto L_0x0121
            r6 = r8
            goto L_0x0122
        L_0x0121:
            r6 = r4
        L_0x0122:
            r0.f6031F = r6
            int r6 = r0.f6029D
            int r6 = r6 + 5
            r0.f6029D = r6
            int r6 = r0.f6028C
            int r6 = r6 + r11
            r0.f6028C = r6
            r6 = 3
            goto L_0x00e1
        L_0x0131:
            java.lang.String r1 = "Invalid NAL length"
            f2.B r1 = f2.C1961B.a(r1, r3)
            throw r1
        L_0x0138:
            boolean r13 = r0.f6031F
            if (r13 == 0) goto L_0x0181
            i2.A r13 = r0.f6043h
            r13.Q(r6)
            i2.A r6 = r0.f6043h
            byte[] r6 = r6.e()
            int r13 = r0.f6030E
            r1.readFully(r6, r4, r13)
            i2.A r6 = r0.f6043h
            int r13 = r0.f6030E
            r9.f(r6, r13)
            int r6 = r0.f6030E
            i2.A r13 = r0.f6043h
            byte[] r13 = r13.e()
            i2.A r7 = r0.f6043h
            int r7 = r7.g()
            int r7 = j2.d.r(r13, r7)
            i2.A r13 = r0.f6043h
            f2.s r8 = r5.f6132f
            java.lang.String r8 = r8.f20083n
            java.lang.String r3 = "video/hevc"
            boolean r3 = r3.equals(r8)
            r13.U(r3)
            i2.A r3 = r0.f6043h
            r3.T(r7)
            i2.A r3 = r0.f6043h
            z2.O[] r7 = r0.f6034I
            z2.C2962f.a(r14, r3, r7)
            goto L_0x0185
        L_0x0181:
            int r6 = r9.a(r1, r6, r4)
        L_0x0185:
            int r3 = r0.f6029D
            int r3 = r3 + r6
            r0.f6029D = r3
            int r3 = r0.f6030E
            int r3 = r3 - r6
            r0.f6030E = r3
            r3 = 0
            r6 = 3
            r7 = 4
            r8 = 1
            goto L_0x00e1
        L_0x0195:
            int r3 = r0.f6029D
            int r5 = r0.f6028C
            if (r3 >= r5) goto L_0x01a6
            int r5 = r5 - r3
            int r3 = r9.a(r1, r5, r4)
            int r5 = r0.f6029D
            int r5 = r5 + r3
            r0.f6029D = r5
            goto L_0x0195
        L_0x01a6:
            int r12 = r2.c()
            T2.t r1 = r2.g()
            if (r1 == 0) goto L_0x01b3
            z2.O$a r1 = r1.f6140c
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            int r13 = r0.f6028C
            r3 = 0
            r10 = r14
            r4 = r14
            r14 = r3
            r15 = r1
            r9.d(r10, r12, r13, r14, r15)
            r0.w(r4)
            boolean r1 = r2.h()
            if (r1 != 0) goto L_0x01ca
            r1 = 0
            r0.f6027B = r1
        L_0x01ca:
            r1 = 3
            r0.f6053r = r1
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.h.Q(z2.q):boolean");
    }

    private static boolean R(int i10) {
        if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227) {
            return true;
        }
        return false;
    }

    private static boolean S(int i10) {
        if (i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783) {
            return true;
        }
        return false;
    }

    private static int c(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw C1961B.a("Unexpected negative value: " + i10, (Throwable) null);
    }

    private void d() {
        this.f6053r = 0;
        this.f6056u = 0;
    }

    private d e(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (d) sparseArray.valueAt(0);
        }
        return (d) C2076a.e((d) sparseArray.get(i10));
    }

    private static C1979n g(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = (a.b) list.get(i10);
            if (bVar.f5975a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] e10 = bVar.f5979b.e();
                UUID f10 = o.f(e10);
                if (f10 == null) {
                    p.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C1979n.b(f10, "video/mp4", e10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C1979n((List) arrayList);
    }

    private static b l(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) sparseArray.valueAt(i10);
            if ((bVar2.f6076l || bVar2.f6070f != bVar2.f6068d.f6162b) && (!bVar2.f6076l || bVar2.f6072h != bVar2.f6066b.f6147e)) {
                long d10 = bVar2.d();
                if (d10 < j10) {
                    bVar = bVar2;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    private void n() {
        int i10;
        O[] oArr = new O[2];
        this.f6033H = oArr;
        O o10 = this.f6051p;
        int i11 = 0;
        if (o10 != null) {
            oArr[0] = o10;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f6037b & 4) != 0) {
            oArr[i10] = this.f6032G.d(100, 5);
            i12 = 101;
            i10++;
        }
        O[] oArr2 = (O[]) L.P0(this.f6033H, i10);
        this.f6033H = oArr2;
        for (O c10 : oArr2) {
            c10.c(f6025M);
        }
        this.f6034I = new O[this.f6039d.size()];
        while (i11 < this.f6034I.length) {
            O d10 = this.f6032G.d(i12, 3);
            d10.c((f2.s) this.f6039d.get(i11));
            this.f6034I[i11] = d10;
            i11++;
            i12++;
        }
    }

    private static boolean o(s sVar) {
        long[] jArr;
        long[] jArr2 = sVar.f6134h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = sVar.f6135i) == null) {
            return false;
        }
        long j10 = jArr2[0];
        if (j10 == 0) {
            return true;
        }
        if (L.U0(j10 + jArr[0], 1000000, sVar.f6130d) >= sVar.f6131e) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] p() {
        return new C2972p[]{new h(s.a.f8664a, 32)};
    }

    private void r(a.C0142a aVar) {
        int i10 = aVar.f5975a;
        if (i10 == 1836019574) {
            v(aVar);
        } else if (i10 == 1836019558) {
            u(aVar);
        } else if (!this.f6049n.isEmpty()) {
            ((a.C0142a) this.f6049n.peek()).d(aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void s(i2.C2073A r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            z2.O[] r2 = r0.f6033H
            int r2 = r2.length
            if (r2 != 0) goto L_0x000a
            return
        L_0x000a:
            r2 = 8
            r1.U(r2)
            int r2 = r28.q()
            int r2 = T2.a.c(r2)
            r3 = 1
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0074
            if (r2 == r3) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentedMp4Extractor"
            i2.p.h(r2, r1)
            return
        L_0x0038:
            long r12 = r28.J()
            long r6 = r28.M()
            r8 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r12
            long r14 = i2.L.U0(r6, r8, r10)
            long r6 = r28.J()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = i2.L.U0(r6, r8, r10)
            long r8 = r28.J()
            java.lang.String r2 = r28.B()
            java.lang.Object r2 = i2.C2076a.e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r10 = r28.B()
            java.lang.Object r10 = i2.C2076a.e(r10)
            java.lang.String r10 = (java.lang.String) r10
            r20 = r2
            r22 = r6
            r24 = r8
            r21 = r10
            r8 = r4
            goto L_0x00be
        L_0x0074:
            java.lang.String r2 = r28.B()
            java.lang.Object r2 = i2.C2076a.e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r28.B()
            java.lang.Object r6 = i2.C2076a.e(r6)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            long r6 = r28.J()
            long r11 = r28.J()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r6
            long r8 = i2.L.U0(r11, r13, r15)
            long r11 = r0.f6026A
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00a3
            long r11 = r11 + r8
            r17 = r11
            goto L_0x00a5
        L_0x00a3:
            r17 = r4
        L_0x00a5:
            long r11 = r28.J()
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = r6
            long r6 = i2.L.U0(r11, r13, r15)
            long r11 = r28.J()
            r20 = r2
            r22 = r6
            r21 = r10
            r24 = r11
            r14 = r17
        L_0x00be:
            int r2 = r28.a()
            byte[] r2 = new byte[r2]
            int r6 = r28.a()
            r7 = 0
            r1.l(r2, r7, r6)
            K2.a r1 = new K2.a
            r19 = r1
            r26 = r2
            r19.<init>(r20, r21, r22, r24, r26)
            i2.A r2 = new i2.A
            K2.c r6 = r0.f6047l
            byte[] r1 = r6.a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.a()
            z2.O[] r6 = r0.f6033H
            int r10 = r6.length
            r11 = r7
        L_0x00e8:
            if (r11 >= r10) goto L_0x00f5
            r12 = r6[r11]
            r2.U(r7)
            r12.f(r2, r1)
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f5:
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0109
            java.util.ArrayDeque r2 = r0.f6050o
            T2.h$a r4 = new T2.h$a
            r4.<init>(r8, r3, r1)
            r2.addLast(r4)
            int r2 = r0.f6059x
            int r2 = r2 + r1
            r0.f6059x = r2
            goto L_0x015a
        L_0x0109:
            java.util.ArrayDeque r2 = r0.f6050o
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0121
            java.util.ArrayDeque r2 = r0.f6050o
            T2.h$a r3 = new T2.h$a
            r3.<init>(r14, r7, r1)
            r2.addLast(r3)
            int r2 = r0.f6059x
            int r2 = r2 + r1
            r0.f6059x = r2
            goto L_0x015a
        L_0x0121:
            i2.G r2 = r0.f6046k
            if (r2 == 0) goto L_0x013b
            boolean r2 = r2.g()
            if (r2 != 0) goto L_0x013b
            java.util.ArrayDeque r2 = r0.f6050o
            T2.h$a r3 = new T2.h$a
            r3.<init>(r14, r7, r1)
            r2.addLast(r3)
            int r2 = r0.f6059x
            int r2 = r2 + r1
            r0.f6059x = r2
            goto L_0x015a
        L_0x013b:
            i2.G r2 = r0.f6046k
            if (r2 == 0) goto L_0x0143
            long r14 = r2.a(r14)
        L_0x0143:
            z2.O[] r2 = r0.f6033H
            int r3 = r2.length
        L_0x0146:
            if (r7 >= r3) goto L_0x015a
            r16 = r2[r7]
            r21 = 0
            r22 = 0
            r19 = 1
            r17 = r14
            r20 = r1
            r16.d(r17, r19, r20, r21, r22)
            int r7 = r7 + 1
            goto L_0x0146
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.h.s(i2.A):void");
    }

    private void t(a.b bVar, long j10) {
        if (!this.f6049n.isEmpty()) {
            ((a.C0142a) this.f6049n.peek()).e(bVar);
            return;
        }
        int i10 = bVar.f5975a;
        if (i10 == 1936286840) {
            Pair E10 = E(bVar.f5979b, j10);
            this.f6026A = ((Long) E10.first).longValue();
            this.f6032G.u((J) E10.second);
            this.f6035J = true;
        } else if (i10 == 1701671783) {
            s(bVar.f5979b);
        }
    }

    private void u(a.C0142a aVar) {
        boolean z10;
        SparseArray sparseArray = this.f6040e;
        if (this.f6038c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        y(aVar, sparseArray, z10, this.f6037b, this.f6044i);
        C1979n g10 = g(aVar.f5977c);
        if (g10 != null) {
            int size = this.f6040e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f6040e.valueAt(i10)).n(g10);
            }
        }
        if (this.f6060y != -9223372036854775807L) {
            int size2 = this.f6040e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) this.f6040e.valueAt(i11)).l(this.f6060y);
            }
            this.f6060y = -9223372036854775807L;
        }
    }

    private void v(a.C0142a aVar) {
        boolean z10;
        boolean z11;
        int i10 = 0;
        boolean z12 = true;
        if (this.f6038c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.h(z10, "Unexpected moov box.");
        C1979n g10 = g(aVar.f5977c);
        a.C0142a aVar2 = (a.C0142a) C2076a.e(aVar.f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f5977c.size();
        long j10 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = (a.b) aVar2.f5977c.get(i11);
            int i12 = bVar.f5975a;
            if (i12 == 1953654136) {
                Pair I10 = I(bVar.f5979b);
                sparseArray.put(((Integer) I10.first).intValue(), (d) I10.second);
            } else if (i12 == 1835362404) {
                j10 = x(bVar.f5979b);
            }
        }
        B b10 = new B();
        if ((this.f6037b & 16) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        List B10 = b.B(aVar, b10, j10, g10, z11, false, new g(this));
        int size2 = B10.size();
        if (this.f6040e.size() == 0) {
            while (i10 < size2) {
                v vVar = (v) B10.get(i10);
                s sVar = vVar.f6161a;
                this.f6040e.put(sVar.f6127a, new b(this.f6032G.d(i10, sVar.f6128b), vVar, e(sparseArray, sVar.f6127a)));
                this.f6061z = Math.max(this.f6061z, sVar.f6131e);
                i10++;
            }
            this.f6032G.k();
            return;
        }
        if (this.f6040e.size() != size2) {
            z12 = false;
        }
        C2076a.g(z12);
        while (i10 < size2) {
            v vVar2 = (v) B10.get(i10);
            s sVar2 = vVar2.f6161a;
            ((b) this.f6040e.get(sVar2.f6127a)).j(vVar2, e(sparseArray, sVar2.f6127a));
            i10++;
        }
    }

    private void w(long j10) {
        while (!this.f6050o.isEmpty()) {
            a aVar = (a) this.f6050o.removeFirst();
            this.f6059x -= aVar.f6064c;
            long j11 = aVar.f6062a;
            if (aVar.f6063b) {
                j11 += j10;
            }
            G g10 = this.f6046k;
            if (g10 != null) {
                j11 = g10.a(j11);
            }
            for (O d10 : this.f6033H) {
                d10.d(j11, 1, aVar.f6064c, this.f6059x, (O.a) null);
            }
        }
    }

    private static long x(C2073A a10) {
        a10.U(8);
        if (a.c(a10.q()) == 0) {
            return a10.J();
        }
        return a10.M();
    }

    private static void y(a.C0142a aVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = aVar.f5978d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0142a aVar2 = (a.C0142a) aVar.f5978d.get(i11);
            if (aVar2.f5975a == 1953653094) {
                H(aVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void z(C2073A a10, u uVar) {
        long j10;
        a10.U(8);
        int q10 = a10.q();
        if ((a.b(q10) & 1) == 1) {
            a10.V(8);
        }
        int L10 = a10.L();
        if (L10 == 1) {
            int c10 = a.c(q10);
            long j11 = uVar.f6146d;
            if (c10 == 0) {
                j10 = a10.J();
            } else {
                j10 = a10.M();
            }
            uVar.f6146d = j11 + j10;
            return;
        }
        throw C1961B.a("Unexpected saio entry count: " + L10, (Throwable) null);
    }

    public void a(long j10, long j11) {
        int size = this.f6040e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f6040e.valueAt(i10)).k();
        }
        this.f6050o.clear();
        this.f6059x = 0;
        this.f6060y = j11;
        this.f6049n.clear();
        d();
    }

    public void f(r rVar) {
        r rVar2;
        if ((this.f6037b & 32) == 0) {
            rVar2 = new W2.u(rVar, this.f6036a);
        } else {
            rVar2 = rVar;
        }
        this.f6032G = rVar2;
        d();
        n();
        s sVar = this.f6038c;
        if (sVar != null) {
            this.f6040e.put(0, new b(rVar.d(0, sVar.f6128b), new v(this.f6038c, new long[0], new int[0], 0, new long[0], new int[0], 0), new d(0, 0, 0, 0)));
            this.f6032G.k();
        }
    }

    public int i(C2973q qVar, I i10) {
        while (true) {
            int i11 = this.f6053r;
            if (i11 != 0) {
                if (i11 == 1) {
                    O(qVar);
                } else if (i11 == 2) {
                    P(qVar);
                } else if (Q(qVar)) {
                    return 0;
                }
            } else if (!N(qVar)) {
                return -1;
            }
        }
    }

    public boolean j(C2973q qVar) {
        C4770v vVar;
        N b10 = r.b(qVar);
        if (b10 != null) {
            vVar = C4770v.H(b10);
        } else {
            vVar = C4770v.E();
        }
        this.f6052q = vVar;
        if (b10 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public C4770v k() {
        return this.f6052q;
    }

    public h(s.a aVar, int i10, G g10, s sVar, List list, O o10) {
        this.f6036a = aVar;
        this.f6037b = i10;
        this.f6046k = g10;
        this.f6038c = sVar;
        this.f6039d = Collections.unmodifiableList(list);
        this.f6051p = o10;
        this.f6047l = new c();
        this.f6048m = new C2073A(16);
        this.f6041f = new C2073A(d.f22705a);
        this.f6042g = new C2073A(5);
        this.f6043h = new C2073A();
        byte[] bArr = new byte[16];
        this.f6044i = bArr;
        this.f6045j = new C2073A(bArr);
        this.f6049n = new ArrayDeque();
        this.f6050o = new ArrayDeque();
        this.f6040e = new SparseArray();
        this.f6052q = C4770v.E();
        this.f6061z = -9223372036854775807L;
        this.f6060y = -9223372036854775807L;
        this.f6026A = -9223372036854775807L;
        this.f6032G = r.f29275e0;
        this.f6033H = new O[0];
        this.f6034I = new O[0];
    }

    public void release() {
    }

    /* access modifiers changed from: protected */
    public s q(s sVar) {
        return sVar;
    }
}
