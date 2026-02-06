package y9;

import F9.c;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.a;
import ja.B;
import ja.C3645a;
import ja.I;
import ja.M;
import ja.s;
import ja.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k9.C3717q0;
import k9.L0;
import o9.m;
import q9.C3962B;
import q9.C3968c;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.v;
import q9.y;
import q9.z;
import y9.C4227a;

public class g implements k {

    /* renamed from: I  reason: collision with root package name */
    public static final p f49929I = new e();

    /* renamed from: J  reason: collision with root package name */
    private static final byte[] f49930J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K  reason: collision with root package name */
    private static final C3717q0 f49931K = new C3717q0.b().e0("application/x-emsg").E();

    /* renamed from: A  reason: collision with root package name */
    private int f49932A;

    /* renamed from: B  reason: collision with root package name */
    private int f49933B;

    /* renamed from: C  reason: collision with root package name */
    private int f49934C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f49935D;

    /* renamed from: E  reason: collision with root package name */
    private m f49936E;

    /* renamed from: F  reason: collision with root package name */
    private C3962B[] f49937F;

    /* renamed from: G  reason: collision with root package name */
    private C3962B[] f49938G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f49939H;

    /* renamed from: a  reason: collision with root package name */
    private final int f49940a;

    /* renamed from: b  reason: collision with root package name */
    private final o f49941b;

    /* renamed from: c  reason: collision with root package name */
    private final List f49942c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray f49943d;

    /* renamed from: e  reason: collision with root package name */
    private final B f49944e;

    /* renamed from: f  reason: collision with root package name */
    private final B f49945f;

    /* renamed from: g  reason: collision with root package name */
    private final B f49946g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f49947h;

    /* renamed from: i  reason: collision with root package name */
    private final B f49948i;

    /* renamed from: j  reason: collision with root package name */
    private final I f49949j;

    /* renamed from: k  reason: collision with root package name */
    private final c f49950k;

    /* renamed from: l  reason: collision with root package name */
    private final B f49951l;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayDeque f49952m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayDeque f49953n;

    /* renamed from: o  reason: collision with root package name */
    private final C3962B f49954o;

    /* renamed from: p  reason: collision with root package name */
    private int f49955p;

    /* renamed from: q  reason: collision with root package name */
    private int f49956q;

    /* renamed from: r  reason: collision with root package name */
    private long f49957r;

    /* renamed from: s  reason: collision with root package name */
    private int f49958s;

    /* renamed from: t  reason: collision with root package name */
    private B f49959t;

    /* renamed from: u  reason: collision with root package name */
    private long f49960u;

    /* renamed from: v  reason: collision with root package name */
    private int f49961v;

    /* renamed from: w  reason: collision with root package name */
    private long f49962w;

    /* renamed from: x  reason: collision with root package name */
    private long f49963x;

    /* renamed from: y  reason: collision with root package name */
    private long f49964y;

    /* renamed from: z  reason: collision with root package name */
    private b f49965z;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f49966a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f49967b;

        /* renamed from: c  reason: collision with root package name */
        public final int f49968c;

        public a(long j10, boolean z10, int i10) {
            this.f49966a = j10;
            this.f49967b = z10;
            this.f49968c = i10;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final C3962B f49969a;

        /* renamed from: b  reason: collision with root package name */
        public final q f49970b = new q();

        /* renamed from: c  reason: collision with root package name */
        public final B f49971c = new B();

        /* renamed from: d  reason: collision with root package name */
        public r f49972d;

        /* renamed from: e  reason: collision with root package name */
        public C4229c f49973e;

        /* renamed from: f  reason: collision with root package name */
        public int f49974f;

        /* renamed from: g  reason: collision with root package name */
        public int f49975g;

        /* renamed from: h  reason: collision with root package name */
        public int f49976h;

        /* renamed from: i  reason: collision with root package name */
        public int f49977i;

        /* renamed from: j  reason: collision with root package name */
        private final B f49978j = new B(1);

        /* renamed from: k  reason: collision with root package name */
        private final B f49979k = new B();
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public boolean f49980l;

        public b(C3962B b10, r rVar, C4229c cVar) {
            this.f49969a = b10;
            this.f49972d = rVar;
            this.f49973e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i10;
            if (!this.f49980l) {
                i10 = this.f49972d.f50064g[this.f49974f];
            } else if (this.f49970b.f50050k[this.f49974f]) {
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
            if (!this.f49980l) {
                return this.f49972d.f50060c[this.f49974f];
            }
            return this.f49970b.f50046g[this.f49976h];
        }

        public long e() {
            if (!this.f49980l) {
                return this.f49972d.f50063f[this.f49974f];
            }
            return this.f49970b.c(this.f49974f);
        }

        public int f() {
            if (!this.f49980l) {
                return this.f49972d.f50061d[this.f49974f];
            }
            return this.f49970b.f50048i[this.f49974f];
        }

        public p g() {
            if (!this.f49980l) {
                return null;
            }
            int i10 = ((C4229c) M.j(this.f49970b.f50040a)).f49918a;
            p pVar = this.f49970b.f50053n;
            if (pVar == null) {
                pVar = this.f49972d.f50058a.a(i10);
            }
            if (pVar == null || !pVar.f50035a) {
                return null;
            }
            return pVar;
        }

        public boolean h() {
            this.f49974f++;
            if (!this.f49980l) {
                return false;
            }
            int i10 = this.f49975g + 1;
            this.f49975g = i10;
            int[] iArr = this.f49970b.f50047h;
            int i11 = this.f49976h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f49976h = i11 + 1;
            this.f49975g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            B b10;
            boolean z10;
            int i12;
            p g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i13 = g10.f50038d;
            if (i13 != 0) {
                b10 = this.f49970b.f50054o;
            } else {
                byte[] bArr = (byte[]) M.j(g10.f50039e);
                this.f49979k.N(bArr, bArr.length);
                B b11 = this.f49979k;
                i13 = bArr.length;
                b10 = b11;
            }
            boolean g11 = this.f49970b.g(this.f49974f);
            if (g11 || i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte[] d10 = this.f49978j.d();
            if (z10) {
                i12 = 128;
            } else {
                i12 = 0;
            }
            d10[0] = (byte) (i12 | i13);
            this.f49978j.P(0);
            this.f49969a.b(this.f49978j, 1, 1);
            this.f49969a.b(b10, i13, 1);
            if (!z10) {
                return i13 + 1;
            }
            if (!g11) {
                this.f49971c.L(8);
                byte[] d11 = this.f49971c.d();
                d11[0] = 0;
                d11[1] = 1;
                d11[2] = (byte) ((i11 >> 8) & 255);
                d11[3] = (byte) (i11 & 255);
                d11[4] = (byte) ((i10 >> 24) & 255);
                d11[5] = (byte) ((i10 >> 16) & 255);
                d11[6] = (byte) ((i10 >> 8) & 255);
                d11[7] = (byte) (i10 & 255);
                this.f49969a.b(this.f49971c, 8, 1);
                return i13 + 9;
            }
            B b12 = this.f49970b.f50054o;
            int J10 = b12.J();
            b12.Q(-2);
            int i14 = (J10 * 6) + 2;
            if (i11 != 0) {
                this.f49971c.L(i14);
                byte[] d12 = this.f49971c.d();
                b12.j(d12, 0, i14);
                int i15 = (((d12[2] & 255) << 8) | (d12[3] & 255)) + i11;
                d12[2] = (byte) ((i15 >> 8) & 255);
                d12[3] = (byte) (i15 & 255);
                b12 = this.f49971c;
            }
            this.f49969a.b(b12, i14, 1);
            return i13 + 1 + i14;
        }

        public void j(r rVar, C4229c cVar) {
            this.f49972d = rVar;
            this.f49973e = cVar;
            this.f49969a.c(rVar.f50058a.f50029f);
            k();
        }

        public void k() {
            this.f49970b.f();
            this.f49974f = 0;
            this.f49976h = 0;
            this.f49975g = 0;
            this.f49977i = 0;
            this.f49980l = false;
        }

        public void l(long j10) {
            int i10 = this.f49974f;
            while (true) {
                q qVar = this.f49970b;
                if (i10 < qVar.f50045f && qVar.c(i10) < j10) {
                    if (this.f49970b.f50050k[i10]) {
                        this.f49977i = i10;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        public void m() {
            p g10 = g();
            if (g10 != null) {
                B b10 = this.f49970b.f50054o;
                int i10 = g10.f50038d;
                if (i10 != 0) {
                    b10.Q(i10);
                }
                if (this.f49970b.g(this.f49974f)) {
                    b10.Q(b10.J() * 6);
                }
            }
        }

        public void n(o9.m mVar) {
            String str;
            p a10 = this.f49972d.f50058a.a(((C4229c) M.j(this.f49970b.f50040a)).f49918a);
            if (a10 != null) {
                str = a10.f50036b;
            } else {
                str = null;
            }
            this.f49969a.c(this.f49972d.f50058a.f50029f.b().M(mVar.c(str)).E());
        }
    }

    public g() {
        this(0);
    }

    private static Pair A(B b10, long j10) {
        long I10;
        long I11;
        B b11 = b10;
        b11.P(8);
        int c10 = C4227a.c(b10.n());
        b11.Q(4);
        long F10 = b10.F();
        if (c10 == 0) {
            I10 = b10.F();
            I11 = b10.F();
        } else {
            I10 = b10.I();
            I11 = b10.I();
        }
        long j11 = I10;
        long j12 = j10 + I11;
        long O02 = M.O0(j11, 1000000, F10);
        b11.Q(2);
        int J10 = b10.J();
        int[] iArr = new int[J10];
        long[] jArr = new long[J10];
        long[] jArr2 = new long[J10];
        long[] jArr3 = new long[J10];
        long j13 = O02;
        long j14 = j11;
        int i10 = 0;
        long j15 = j14;
        while (i10 < J10) {
            int n10 = b10.n();
            if ((n10 & Integer.MIN_VALUE) == 0) {
                long F11 = b10.F();
                iArr[i10] = n10 & a.e.API_PRIORITY_OTHER;
                jArr[i10] = j12;
                jArr3[i10] = j13;
                long j16 = j15 + F11;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i11 = J10;
                int[] iArr2 = iArr;
                long O03 = M.O0(j16, 1000000, F10);
                jArr4[i10] = O03 - jArr5[i10];
                b11.Q(4);
                j12 += (long) iArr2[i10];
                i10++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                J10 = i11;
                long j17 = O03;
                j15 = j16;
                j13 = j17;
            } else {
                throw L0.a("Unhandled indirect reference", (Throwable) null);
            }
        }
        return Pair.create(Long.valueOf(O02), new C3968c(iArr, jArr, jArr2, jArr3));
    }

    private static long B(B b10) {
        b10.P(8);
        if (C4227a.c(b10.n()) == 1) {
            return b10.I();
        }
        return b10.F();
    }

    private static b C(B b10, SparseArray sparseArray, boolean z10) {
        Object obj;
        int i10;
        int i11;
        int i12;
        int i13;
        b10.P(8);
        int b11 = C4227a.b(b10.n());
        int n10 = b10.n();
        if (z10) {
            obj = sparseArray.valueAt(0);
        } else {
            obj = sparseArray.get(n10);
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return null;
        }
        if ((b11 & 1) != 0) {
            long I10 = b10.I();
            q qVar = bVar.f49970b;
            qVar.f50042c = I10;
            qVar.f50043d = I10;
        }
        C4229c cVar = bVar.f49973e;
        if ((b11 & 2) != 0) {
            i10 = b10.n() - 1;
        } else {
            i10 = cVar.f49918a;
        }
        if ((b11 & 8) != 0) {
            i11 = b10.n();
        } else {
            i11 = cVar.f49919b;
        }
        if ((b11 & 16) != 0) {
            i12 = b10.n();
        } else {
            i12 = cVar.f49920c;
        }
        if ((b11 & 32) != 0) {
            i13 = b10.n();
        } else {
            i13 = cVar.f49921d;
        }
        bVar.f49970b.f50040a = new C4229c(i10, i11, i12, i13);
        return bVar;
    }

    private static void D(C4227a.C0755a aVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) {
        String str;
        b C10 = C(((C4227a.b) C3645a.e(aVar.g(1952868452))).f49888b, sparseArray, z10);
        if (C10 != null) {
            q qVar = C10.f49970b;
            long j10 = qVar.f50056q;
            boolean z11 = qVar.f50057r;
            C10.k();
            boolean unused = C10.f49980l = true;
            C4227a.b g10 = aVar.g(1952867444);
            if (g10 == null || (i10 & 2) != 0) {
                qVar.f50056q = j10;
                qVar.f50057r = z11;
            } else {
                qVar.f50056q = B(g10.f49888b);
                qVar.f50057r = true;
            }
            G(aVar, C10, i10);
            p a10 = C10.f49972d.f50058a.a(((C4229c) C3645a.e(qVar.f50040a)).f49918a);
            C4227a.b g11 = aVar.g(1935763834);
            if (g11 != null) {
                w((p) C3645a.e(a10), g11.f49888b, qVar);
            }
            C4227a.b g12 = aVar.g(1935763823);
            if (g12 != null) {
                v(g12.f49888b, qVar);
            }
            C4227a.b g13 = aVar.g(1936027235);
            if (g13 != null) {
                z(g13.f49888b, qVar);
            }
            if (a10 != null) {
                str = a10.f50036b;
            } else {
                str = null;
            }
            x(aVar, str, qVar);
            int size = aVar.f49886c.size();
            for (int i11 = 0; i11 < size; i11++) {
                C4227a.b bVar = (C4227a.b) aVar.f49886c.get(i11);
                if (bVar.f49884a == 1970628964) {
                    H(bVar.f49888b, qVar, bArr);
                }
            }
        }
    }

    private static Pair E(B b10) {
        b10.P(12);
        return Pair.create(Integer.valueOf(b10.n()), new C4229c(b10.n() - 1, b10.n(), b10.n(), b10.n()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int F(y9.g.b r34, int r35, int r36, ja.B r37, int r38) {
        /*
            r0 = r34
            r1 = 8
            r2 = r37
            r2.P(r1)
            int r1 = r37.n()
            int r1 = y9.C4227a.b(r1)
            y9.r r3 = r0.f49972d
            y9.o r3 = r3.f50058a
            y9.q r4 = r0.f49970b
            y9.c r5 = r4.f50040a
            java.lang.Object r5 = ja.M.j(r5)
            y9.c r5 = (y9.C4229c) r5
            int[] r6 = r4.f50047h
            int r7 = r37.H()
            r6[r35] = r7
            long[] r6 = r4.f50046g
            long r7 = r4.f50042c
            r6[r35] = r7
            r9 = r1 & 1
            if (r9 == 0) goto L_0x0039
            int r9 = r37.n()
            long r9 = (long) r9
            long r7 = r7 + r9
            r6[r35] = r7
        L_0x0039:
            r6 = r1 & 4
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0041
            r6 = r8
            goto L_0x0042
        L_0x0041:
            r6 = r7
        L_0x0042:
            int r9 = r5.f49921d
            if (r6 == 0) goto L_0x004a
            int r9 = r37.n()
        L_0x004a:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0050
            r10 = r8
            goto L_0x0051
        L_0x0050:
            r10 = r7
        L_0x0051:
            r11 = r1 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0057
            r11 = r8
            goto L_0x0058
        L_0x0057:
            r11 = r7
        L_0x0058:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005e
            r12 = r8
            goto L_0x005f
        L_0x005e:
            r12 = r7
        L_0x005f:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0065
            r1 = r8
            goto L_0x0066
        L_0x0065:
            r1 = r7
        L_0x0066:
            long[] r13 = r3.f50031h
            if (r13 == 0) goto L_0x0080
            int r14 = r13.length
            if (r14 != r8) goto L_0x0080
            r14 = r13[r7]
            r16 = 0
            int r13 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x0082
            long[] r13 = r3.f50032i
            java.lang.Object r13 = ja.M.j(r13)
            long[] r13 = (long[]) r13
            r14 = r13[r7]
            goto L_0x0084
        L_0x0080:
            r16 = 0
        L_0x0082:
            r14 = r16
        L_0x0084:
            int[] r13 = r4.f50048i
            long[] r7 = r4.f50049j
            boolean[] r8 = r4.f50050k
            int r2 = r3.f50025b
            r18 = r9
            r9 = 2
            if (r2 != r9) goto L_0x0098
            r2 = 1
            r9 = r36 & 1
            if (r9 == 0) goto L_0x0098
            r2 = 1
            goto L_0x0099
        L_0x0098:
            r2 = 0
        L_0x0099:
            int[] r9 = r4.f50047h
            r9 = r9[r35]
            int r9 = r38 + r9
            r36 = r2
            long r2 = r3.f50026c
            r25 = r7
            r26 = r8
            long r7 = r4.f50056q
            r27 = r2
            r2 = r7
            r7 = r38
        L_0x00ae:
            if (r7 >= r9) goto L_0x013b
            if (r10 == 0) goto L_0x00b7
            int r8 = r37.n()
            goto L_0x00b9
        L_0x00b7:
            int r8 = r5.f49919b
        L_0x00b9:
            int r8 = c(r8)
            if (r11 == 0) goto L_0x00c6
            int r19 = r37.n()
            r29 = r10
            goto L_0x00cc
        L_0x00c6:
            r29 = r10
            int r10 = r5.f49920c
            r19 = r10
        L_0x00cc:
            int r10 = c(r19)
            if (r12 == 0) goto L_0x00db
            int r19 = r37.n()
            r30 = r6
            r6 = r19
            goto L_0x00e8
        L_0x00db:
            if (r7 != 0) goto L_0x00e4
            if (r6 == 0) goto L_0x00e4
            r30 = r6
            r6 = r18
            goto L_0x00e8
        L_0x00e4:
            r30 = r6
            int r6 = r5.f49921d
        L_0x00e8:
            if (r1 == 0) goto L_0x00f7
            int r19 = r37.n()
            r31 = r1
            r32 = r11
            r33 = r12
            r1 = r19
            goto L_0x00fe
        L_0x00f7:
            r31 = r1
            r32 = r11
            r33 = r12
            r1 = 0
        L_0x00fe:
            long r11 = (long) r1
            long r11 = r11 + r2
            long r19 = r11 - r14
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r23 = r27
            long r11 = ja.M.O0(r19, r21, r23)
            r25[r7] = r11
            boolean r1 = r4.f50057r
            if (r1 != 0) goto L_0x0118
            y9.r r1 = r0.f49972d
            long r0 = r1.f50065h
            long r11 = r11 + r0
            r25[r7] = r11
        L_0x0118:
            r13[r7] = r10
            int r0 = r6 >> 16
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0126
            if (r36 == 0) goto L_0x0124
            if (r7 != 0) goto L_0x0126
        L_0x0124:
            r0 = r1
            goto L_0x0127
        L_0x0126:
            r0 = 0
        L_0x0127:
            r26[r7] = r0
            long r10 = (long) r8
            long r2 = r2 + r10
            int r7 = r7 + 1
            r0 = r34
            r10 = r29
            r6 = r30
            r1 = r31
            r11 = r32
            r12 = r33
            goto L_0x00ae
        L_0x013b:
            r4.f50056q = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.g.F(y9.g$b, int, int, ja.B, int):int");
    }

    private static void G(C4227a.C0755a aVar, b bVar, int i10) {
        List list = aVar.f49886c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            C4227a.b bVar2 = (C4227a.b) list.get(i13);
            if (bVar2.f49884a == 1953658222) {
                B b10 = bVar2.f49888b;
                b10.P(12);
                int H10 = b10.H();
                if (H10 > 0) {
                    i12 += H10;
                    i11++;
                }
            }
        }
        bVar.f49976h = 0;
        bVar.f49975g = 0;
        bVar.f49974f = 0;
        bVar.f49970b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            C4227a.b bVar3 = (C4227a.b) list.get(i16);
            if (bVar3.f49884a == 1953658222) {
                i15 = F(bVar, i14, i10, bVar3.f49888b, i15);
                i14++;
            }
        }
    }

    private static void H(B b10, q qVar, byte[] bArr) {
        b10.P(8);
        b10.j(bArr, 0, 16);
        if (Arrays.equals(bArr, f49930J)) {
            y(b10, 16, qVar);
        }
    }

    private void I(long j10) {
        while (!this.f49952m.isEmpty() && ((C4227a.C0755a) this.f49952m.peek()).f49885b == j10) {
            n((C4227a.C0755a) this.f49952m.pop());
        }
        d();
    }

    private boolean J(l lVar) {
        if (this.f49958s == 0) {
            if (!lVar.f(this.f49951l.d(), 0, 8, true)) {
                return false;
            }
            this.f49958s = 8;
            this.f49951l.P(0);
            this.f49957r = this.f49951l.F();
            this.f49956q = this.f49951l.n();
        }
        long j10 = this.f49957r;
        if (j10 == 1) {
            lVar.readFully(this.f49951l.d(), 8, 8);
            this.f49958s += 8;
            this.f49957r = this.f49951l.I();
        } else if (j10 == 0) {
            long a10 = lVar.a();
            if (a10 == -1 && !this.f49952m.isEmpty()) {
                a10 = ((C4227a.C0755a) this.f49952m.peek()).f49885b;
            }
            if (a10 != -1) {
                this.f49957r = (a10 - lVar.getPosition()) + ((long) this.f49958s);
            }
        }
        if (this.f49957r >= ((long) this.f49958s)) {
            long position = lVar.getPosition() - ((long) this.f49958s);
            int i10 = this.f49956q;
            if ((i10 == 1836019558 || i10 == 1835295092) && !this.f49939H) {
                this.f49936E.q(new z.b(this.f49963x, position));
                this.f49939H = true;
            }
            if (this.f49956q == 1836019558) {
                int size = this.f49943d.size();
                for (int i11 = 0; i11 < size; i11++) {
                    q qVar = ((b) this.f49943d.valueAt(i11)).f49970b;
                    qVar.f50041b = position;
                    qVar.f50043d = position;
                    qVar.f50042c = position;
                }
            }
            int i12 = this.f49956q;
            if (i12 == 1835295092) {
                this.f49965z = null;
                this.f49960u = position + this.f49957r;
                this.f49955p = 2;
                return true;
            }
            if (N(i12)) {
                long position2 = (lVar.getPosition() + this.f49957r) - 8;
                this.f49952m.push(new C4227a.C0755a(this.f49956q, position2));
                if (this.f49957r == ((long) this.f49958s)) {
                    I(position2);
                } else {
                    d();
                }
            } else if (O(this.f49956q)) {
                if (this.f49958s == 8) {
                    long j11 = this.f49957r;
                    if (j11 <= 2147483647L) {
                        B b10 = new B((int) j11);
                        System.arraycopy(this.f49951l.d(), 0, b10.d(), 0, 8);
                        this.f49959t = b10;
                        this.f49955p = 1;
                    } else {
                        throw L0.d("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw L0.d("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f49957r <= 2147483647L) {
                this.f49959t = null;
                this.f49955p = 1;
            } else {
                throw L0.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw L0.d("Atom size less than header length (unsupported).");
    }

    private void K(l lVar) {
        int i10 = ((int) this.f49957r) - this.f49958s;
        B b10 = this.f49959t;
        if (b10 != null) {
            lVar.readFully(b10.d(), 8, i10);
            p(new C4227a.b(this.f49956q, b10), lVar.getPosition());
        } else {
            lVar.j(i10);
        }
        I(lVar.getPosition());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: y9.g$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void L(q9.l r10) {
        /*
            r9 = this;
            android.util.SparseArray r0 = r9.f49943d
            int r0 = r0.size()
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r5 = r1
        L_0x000e:
            if (r4 >= r0) goto L_0x0031
            android.util.SparseArray r6 = r9.f49943d
            java.lang.Object r6 = r6.valueAt(r4)
            y9.g$b r6 = (y9.g.b) r6
            y9.q r6 = r6.f49970b
            boolean r7 = r6.f50055p
            if (r7 == 0) goto L_0x002e
            long r6 = r6.f50043d
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x002e
            android.util.SparseArray r2 = r9.f49943d
            java.lang.Object r2 = r2.valueAt(r4)
            r5 = r2
            y9.g$b r5 = (y9.g.b) r5
            r2 = r6
        L_0x002e:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0031:
            if (r5 != 0) goto L_0x0037
            r10 = 3
            r9.f49955p = r10
            return
        L_0x0037:
            long r6 = r10.getPosition()
            long r2 = r2 - r6
            int r0 = (int) r2
            if (r0 < 0) goto L_0x0048
            r10.j(r0)
            y9.q r0 = r5.f49970b
            r0.b(r10)
            return
        L_0x0048:
            java.lang.String r10 = "Offset to encryption data was negative."
            k9.L0 r10 = k9.L0.a(r10, r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.g.L(q9.l):void");
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
    private boolean M(q9.l r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            y9.g$b r2 = r0.f49965z
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L_0x0043
            android.util.SparseArray r2 = r0.f49943d
            y9.g$b r2 = j(r2)
            if (r2 != 0) goto L_0x002a
            long r5 = r0.f49960u
            long r7 = r17.getPosition()
            long r5 = r5 - r7
            int r2 = (int) r5
            if (r2 < 0) goto L_0x0023
            r1.j(r2)
            r16.d()
            return r4
        L_0x0023:
            java.lang.String r1 = "Offset to end of mdat was negative."
            k9.L0 r1 = k9.L0.a(r1, r3)
            throw r1
        L_0x002a:
            long r5 = r2.d()
            long r7 = r17.getPosition()
            long r5 = r5 - r7
            int r5 = (int) r5
            if (r5 >= 0) goto L_0x003e
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Ignoring negative offset to sample data."
            ja.s.i(r5, r6)
            r5 = r4
        L_0x003e:
            r1.j(r5)
            r0.f49965z = r2
        L_0x0043:
            int r5 = r0.f49955p
            r6 = 3
            r7 = 4
            r8 = 1
            if (r5 != r6) goto L_0x00b7
            int r5 = r2.f()
            r0.f49932A = r5
            int r9 = r2.f49974f
            int r10 = r2.f49977i
            if (r9 >= r10) goto L_0x0067
            r1.j(r5)
            r2.m()
            boolean r1 = r2.h()
            if (r1 != 0) goto L_0x0064
            r0.f49965z = r3
        L_0x0064:
            r0.f49955p = r6
            return r8
        L_0x0067:
            y9.r r9 = r2.f49972d
            y9.o r9 = r9.f50058a
            int r9 = r9.f50030g
            if (r9 != r8) goto L_0x0077
            r9 = 8
            int r5 = r5 - r9
            r0.f49932A = r5
            r1.j(r9)
        L_0x0077:
            y9.r r5 = r2.f49972d
            y9.o r5 = r5.f50058a
            k9.q0 r5 = r5.f50029f
            java.lang.String r5 = r5.f45770l
            java.lang.String r9 = "audio/ac4"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x00a4
            int r5 = r0.f49932A
            r9 = 7
            int r5 = r2.i(r5, r9)
            r0.f49933B = r5
            int r5 = r0.f49932A
            ja.B r10 = r0.f49948i
            m9.C3845c.a(r5, r10)
            q9.B r5 = r2.f49969a
            ja.B r10 = r0.f49948i
            r5.d(r10, r9)
            int r5 = r0.f49933B
            int r5 = r5 + r9
            r0.f49933B = r5
            goto L_0x00ac
        L_0x00a4:
            int r5 = r0.f49932A
            int r5 = r2.i(r5, r4)
            r0.f49933B = r5
        L_0x00ac:
            int r5 = r0.f49932A
            int r9 = r0.f49933B
            int r5 = r5 + r9
            r0.f49932A = r5
            r0.f49955p = r7
            r0.f49934C = r4
        L_0x00b7:
            y9.r r5 = r2.f49972d
            y9.o r5 = r5.f50058a
            q9.B r9 = r2.f49969a
            long r10 = r2.e()
            ja.I r12 = r0.f49949j
            if (r12 == 0) goto L_0x00c9
            long r10 = r12.a(r10)
        L_0x00c9:
            r14 = r10
            int r10 = r5.f50033j
            if (r10 == 0) goto L_0x0195
            ja.B r10 = r0.f49945f
            byte[] r10 = r10.d()
            r10[r4] = r4
            r10[r8] = r4
            r11 = 2
            r10[r11] = r4
            int r11 = r5.f50033j
            int r12 = r11 + 1
            int r11 = 4 - r11
        L_0x00e1:
            int r13 = r0.f49933B
            int r6 = r0.f49932A
            if (r13 >= r6) goto L_0x01a6
            int r6 = r0.f49934C
            if (r6 != 0) goto L_0x0138
            r1.readFully(r10, r11, r12)
            ja.B r6 = r0.f49945f
            r6.P(r4)
            ja.B r6 = r0.f49945f
            int r6 = r6.n()
            if (r6 < r8) goto L_0x0131
            int r6 = r6 + -1
            r0.f49934C = r6
            ja.B r6 = r0.f49944e
            r6.P(r4)
            ja.B r6 = r0.f49944e
            r9.d(r6, r7)
            ja.B r6 = r0.f49945f
            r9.d(r6, r8)
            q9.B[] r6 = r0.f49938G
            int r6 = r6.length
            if (r6 <= 0) goto L_0x0121
            k9.q0 r6 = r5.f50029f
            java.lang.String r6 = r6.f45770l
            byte r13 = r10[r7]
            boolean r6 = ja.x.g(r6, r13)
            if (r6 == 0) goto L_0x0121
            r6 = r8
            goto L_0x0122
        L_0x0121:
            r6 = r4
        L_0x0122:
            r0.f49935D = r6
            int r6 = r0.f49933B
            int r6 = r6 + 5
            r0.f49933B = r6
            int r6 = r0.f49932A
            int r6 = r6 + r11
            r0.f49932A = r6
            r6 = 3
            goto L_0x00e1
        L_0x0131:
            java.lang.String r1 = "Invalid NAL length"
            k9.L0 r1 = k9.L0.a(r1, r3)
            throw r1
        L_0x0138:
            boolean r13 = r0.f49935D
            if (r13 == 0) goto L_0x0181
            ja.B r13 = r0.f49946g
            r13.L(r6)
            ja.B r6 = r0.f49946g
            byte[] r6 = r6.d()
            int r13 = r0.f49934C
            r1.readFully(r6, r4, r13)
            ja.B r6 = r0.f49946g
            int r13 = r0.f49934C
            r9.d(r6, r13)
            int r6 = r0.f49934C
            ja.B r13 = r0.f49946g
            byte[] r13 = r13.d()
            ja.B r7 = r0.f49946g
            int r7 = r7.f()
            int r7 = ja.x.q(r13, r7)
            ja.B r13 = r0.f49946g
            k9.q0 r8 = r5.f50029f
            java.lang.String r8 = r8.f45770l
            java.lang.String r3 = "video/hevc"
            boolean r3 = r3.equals(r8)
            r13.P(r3)
            ja.B r3 = r0.f49946g
            r3.O(r7)
            ja.B r3 = r0.f49946g
            q9.B[] r7 = r0.f49938G
            q9.C3967b.a(r14, r3, r7)
            goto L_0x0185
        L_0x0181:
            int r6 = r9.a(r1, r6, r4)
        L_0x0185:
            int r3 = r0.f49933B
            int r3 = r3 + r6
            r0.f49933B = r3
            int r3 = r0.f49934C
            int r3 = r3 - r6
            r0.f49934C = r3
            r3 = 0
            r6 = 3
            r7 = 4
            r8 = 1
            goto L_0x00e1
        L_0x0195:
            int r3 = r0.f49933B
            int r5 = r0.f49932A
            if (r3 >= r5) goto L_0x01a6
            int r5 = r5 - r3
            int r3 = r9.a(r1, r5, r4)
            int r5 = r0.f49933B
            int r5 = r5 + r3
            r0.f49933B = r5
            goto L_0x0195
        L_0x01a6:
            int r12 = r2.c()
            y9.p r1 = r2.g()
            if (r1 == 0) goto L_0x01b3
            q9.B$a r1 = r1.f50037c
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            int r13 = r0.f49932A
            r3 = 0
            r10 = r14
            r4 = r14
            r14 = r3
            r15 = r1
            r9.f(r10, r12, r13, r14, r15)
            r0.s(r4)
            boolean r1 = r2.h()
            if (r1 != 0) goto L_0x01ca
            r1 = 0
            r0.f49965z = r1
        L_0x01ca:
            r1 = 3
            r0.f49955p = r1
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.g.M(q9.l):boolean");
    }

    private static boolean N(int i10) {
        if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227) {
            return true;
        }
        return false;
    }

    private static boolean O(int i10) {
        if (i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783) {
            return true;
        }
        return false;
    }

    private static int c(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw L0.a("Unexpected negative value: " + i10, (Throwable) null);
    }

    private void d() {
        this.f49955p = 0;
        this.f49958s = 0;
    }

    private C4229c e(SparseArray sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return (C4229c) sparseArray.valueAt(0);
        }
        return (C4229c) C3645a.e((C4229c) sparseArray.get(i10));
    }

    private static o9.m g(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            C4227a.b bVar = (C4227a.b) list.get(i10);
            if (bVar.f49884a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d10 = bVar.f49888b.d();
                UUID f10 = l.f(d10);
                if (f10 == null) {
                    s.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new m.b(f10, "video/mp4", d10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new o9.m((List) arrayList);
    }

    private static b j(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) sparseArray.valueAt(i10);
            if ((bVar2.f49980l || bVar2.f49974f != bVar2.f49972d.f50059b) && (!bVar2.f49980l || bVar2.f49976h != bVar2.f49970b.f50044e)) {
                long d10 = bVar2.d();
                if (d10 < j10) {
                    bVar = bVar2;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    private void k() {
        int i10;
        C3962B[] bArr = new C3962B[2];
        this.f49937F = bArr;
        C3962B b10 = this.f49954o;
        int i11 = 0;
        if (b10 != null) {
            bArr[0] = b10;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f49940a & 4) != 0) {
            bArr[i10] = this.f49936E.d(100, 5);
            i12 = 101;
            i10++;
        }
        C3962B[] bArr2 = (C3962B[]) M.H0(this.f49937F, i10);
        this.f49937F = bArr2;
        for (C3962B c10 : bArr2) {
            c10.c(f49931K);
        }
        this.f49938G = new C3962B[this.f49942c.size()];
        while (i11 < this.f49938G.length) {
            C3962B d10 = this.f49936E.d(i12, 3);
            d10.c((C3717q0) this.f49942c.get(i11));
            this.f49938G[i11] = d10;
            i11++;
            i12++;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] l() {
        return new k[]{new g()};
    }

    private void n(C4227a.C0755a aVar) {
        int i10 = aVar.f49884a;
        if (i10 == 1836019574) {
            r(aVar);
        } else if (i10 == 1836019558) {
            q(aVar);
        } else if (!this.f49952m.isEmpty()) {
            ((C4227a.C0755a) this.f49952m.peek()).d(aVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void o(ja.B r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            q9.B[] r2 = r0.f49937F
            int r2 = r2.length
            if (r2 != 0) goto L_0x000a
            return
        L_0x000a:
            r2 = 8
            r1.P(r2)
            int r2 = r28.n()
            int r2 = y9.C4227a.c(r2)
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
            ja.s.i(r2, r1)
            return
        L_0x0038:
            long r12 = r28.F()
            long r6 = r28.I()
            r8 = 1000000(0xf4240, double:4.940656E-318)
            r10 = r12
            long r14 = ja.M.O0(r6, r8, r10)
            long r6 = r28.F()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = ja.M.O0(r6, r8, r10)
            long r8 = r28.F()
            java.lang.String r2 = r28.x()
            java.lang.Object r2 = ja.C3645a.e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r10 = r28.x()
            java.lang.Object r10 = ja.C3645a.e(r10)
            java.lang.String r10 = (java.lang.String) r10
            r20 = r2
            r22 = r6
            r24 = r8
            r21 = r10
            r8 = r4
            goto L_0x00be
        L_0x0074:
            java.lang.String r2 = r28.x()
            java.lang.Object r2 = ja.C3645a.e(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r28.x()
            java.lang.Object r6 = ja.C3645a.e(r6)
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            long r6 = r28.F()
            long r11 = r28.F()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r6
            long r8 = ja.M.O0(r11, r13, r15)
            long r11 = r0.f49964y
            int r13 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x00a3
            long r11 = r11 + r8
            r17 = r11
            goto L_0x00a5
        L_0x00a3:
            r17 = r4
        L_0x00a5:
            long r11 = r28.F()
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = r6
            long r6 = ja.M.O0(r11, r13, r15)
            long r11 = r28.F()
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
            r1.j(r2, r7, r6)
            F9.a r1 = new F9.a
            r19 = r1
            r26 = r2
            r19.<init>(r20, r21, r22, r24, r26)
            ja.B r2 = new ja.B
            F9.c r6 = r0.f49950k
            byte[] r1 = r6.a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.a()
            q9.B[] r6 = r0.f49937F
            int r10 = r6.length
            r11 = r7
        L_0x00e8:
            if (r11 >= r10) goto L_0x00f5
            r12 = r6[r11]
            r2.P(r7)
            r12.d(r2, r1)
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f5:
            int r2 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0109
            java.util.ArrayDeque r2 = r0.f49953n
            y9.g$a r4 = new y9.g$a
            r4.<init>(r8, r3, r1)
            r2.addLast(r4)
            int r2 = r0.f49961v
            int r2 = r2 + r1
            r0.f49961v = r2
            goto L_0x0140
        L_0x0109:
            java.util.ArrayDeque r2 = r0.f49953n
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0121
            java.util.ArrayDeque r2 = r0.f49953n
            y9.g$a r3 = new y9.g$a
            r3.<init>(r14, r7, r1)
            r2.addLast(r3)
            int r2 = r0.f49961v
            int r2 = r2 + r1
            r0.f49961v = r2
            goto L_0x0140
        L_0x0121:
            ja.I r2 = r0.f49949j
            if (r2 == 0) goto L_0x0129
            long r14 = r2.a(r14)
        L_0x0129:
            q9.B[] r2 = r0.f49937F
            int r3 = r2.length
        L_0x012c:
            if (r7 >= r3) goto L_0x0140
            r16 = r2[r7]
            r21 = 0
            r22 = 0
            r19 = 1
            r17 = r14
            r20 = r1
            r16.f(r17, r19, r20, r21, r22)
            int r7 = r7 + 1
            goto L_0x012c
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.g.o(ja.B):void");
    }

    private void p(C4227a.b bVar, long j10) {
        if (!this.f49952m.isEmpty()) {
            ((C4227a.C0755a) this.f49952m.peek()).e(bVar);
            return;
        }
        int i10 = bVar.f49884a;
        if (i10 == 1936286840) {
            Pair A10 = A(bVar.f49888b, j10);
            this.f49964y = ((Long) A10.first).longValue();
            this.f49936E.q((z) A10.second);
            this.f49939H = true;
        } else if (i10 == 1701671783) {
            o(bVar.f49888b);
        }
    }

    private void q(C4227a.C0755a aVar) {
        boolean z10;
        SparseArray sparseArray = this.f49943d;
        if (this.f49941b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u(aVar, sparseArray, z10, this.f49940a, this.f49947h);
        o9.m g10 = g(aVar.f49886c);
        if (g10 != null) {
            int size = this.f49943d.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f49943d.valueAt(i10)).n(g10);
            }
        }
        if (this.f49962w != -9223372036854775807L) {
            int size2 = this.f49943d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) this.f49943d.valueAt(i11)).l(this.f49962w);
            }
            this.f49962w = -9223372036854775807L;
        }
    }

    private void r(C4227a.C0755a aVar) {
        boolean z10;
        boolean z11;
        int i10 = 0;
        boolean z12 = true;
        if (this.f49941b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.g(z10, "Unexpected moov box.");
        o9.m g10 = g(aVar.f49886c);
        C4227a.C0755a aVar2 = (C4227a.C0755a) C3645a.e(aVar.f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f49886c.size();
        long j10 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            C4227a.b bVar = (C4227a.b) aVar2.f49886c.get(i11);
            int i12 = bVar.f49884a;
            if (i12 == 1953654136) {
                Pair E10 = E(bVar.f49888b);
                sparseArray.put(((Integer) E10.first).intValue(), (C4229c) E10.second);
            } else if (i12 == 1835362404) {
                j10 = t(bVar.f49888b);
            }
        }
        v vVar = new v();
        if ((this.f49940a & 16) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        List A10 = C4228b.A(aVar, vVar, j10, g10, z11, false, new f(this));
        int size2 = A10.size();
        if (this.f49943d.size() == 0) {
            while (i10 < size2) {
                r rVar = (r) A10.get(i10);
                o oVar = rVar.f50058a;
                this.f49943d.put(oVar.f50024a, new b(this.f49936E.d(i10, oVar.f50025b), rVar, e(sparseArray, oVar.f50024a)));
                this.f49963x = Math.max(this.f49963x, oVar.f50028e);
                i10++;
            }
            this.f49936E.k();
            return;
        }
        if (this.f49943d.size() != size2) {
            z12 = false;
        }
        C3645a.f(z12);
        while (i10 < size2) {
            r rVar2 = (r) A10.get(i10);
            o oVar2 = rVar2.f50058a;
            ((b) this.f49943d.get(oVar2.f50024a)).j(rVar2, e(sparseArray, oVar2.f50024a));
            i10++;
        }
    }

    private void s(long j10) {
        while (!this.f49953n.isEmpty()) {
            a aVar = (a) this.f49953n.removeFirst();
            this.f49961v -= aVar.f49968c;
            long j11 = aVar.f49966a;
            if (aVar.f49967b) {
                j11 += j10;
            }
            I i10 = this.f49949j;
            if (i10 != null) {
                j11 = i10.a(j11);
            }
            for (C3962B f10 : this.f49937F) {
                f10.f(j11, 1, aVar.f49968c, this.f49961v, (C3962B.a) null);
            }
        }
    }

    private static long t(B b10) {
        b10.P(8);
        if (C4227a.c(b10.n()) == 0) {
            return b10.F();
        }
        return b10.I();
    }

    private static void u(C4227a.C0755a aVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = aVar.f49887d.size();
        for (int i11 = 0; i11 < size; i11++) {
            C4227a.C0755a aVar2 = (C4227a.C0755a) aVar.f49887d.get(i11);
            if (aVar2.f49884a == 1953653094) {
                D(aVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void v(B b10, q qVar) {
        long j10;
        b10.P(8);
        int n10 = b10.n();
        if ((C4227a.b(n10) & 1) == 1) {
            b10.Q(8);
        }
        int H10 = b10.H();
        if (H10 == 1) {
            int c10 = C4227a.c(n10);
            long j11 = qVar.f50043d;
            if (c10 == 0) {
                j10 = b10.F();
            } else {
                j10 = b10.I();
            }
            qVar.f50043d = j11 + j10;
            return;
        }
        throw L0.a("Unexpected saio entry count: " + H10, (Throwable) null);
    }

    private static void w(p pVar, B b10, q qVar) {
        int i10;
        boolean z10;
        int i11 = pVar.f50038d;
        b10.P(8);
        boolean z11 = true;
        if ((C4227a.b(b10.n()) & 1) == 1) {
            b10.Q(8);
        }
        int D10 = b10.D();
        int H10 = b10.H();
        if (H10 <= qVar.f50045f) {
            if (D10 == 0) {
                boolean[] zArr = qVar.f50052m;
                i10 = 0;
                for (int i12 = 0; i12 < H10; i12++) {
                    int D11 = b10.D();
                    i10 += D11;
                    if (D11 > i11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zArr[i12] = z10;
                }
            } else {
                if (D10 <= i11) {
                    z11 = false;
                }
                i10 = D10 * H10;
                Arrays.fill(qVar.f50052m, 0, H10, z11);
            }
            Arrays.fill(qVar.f50052m, H10, qVar.f50045f, false);
            if (i10 > 0) {
                qVar.d(i10);
                return;
            }
            return;
        }
        throw L0.a("Saiz sample count " + H10 + " is greater than fragment sample count" + qVar.f50045f, (Throwable) null);
    }

    private static void x(C4227a.C0755a aVar, String str, q qVar) {
        boolean z10;
        C4227a.C0755a aVar2 = aVar;
        q qVar2 = qVar;
        byte[] bArr = null;
        B b10 = null;
        B b11 = null;
        for (int i10 = 0; i10 < aVar2.f49886c.size(); i10++) {
            C4227a.b bVar = (C4227a.b) aVar2.f49886c.get(i10);
            B b12 = bVar.f49888b;
            int i11 = bVar.f49884a;
            if (i11 == 1935828848) {
                b12.P(12);
                if (b12.n() == 1936025959) {
                    b10 = b12;
                }
            } else if (i11 == 1936158820) {
                b12.P(12);
                if (b12.n() == 1936025959) {
                    b11 = b12;
                }
            }
        }
        if (b10 != null && b11 != null) {
            b10.P(8);
            int c10 = C4227a.c(b10.n());
            b10.Q(4);
            if (c10 == 1) {
                b10.Q(4);
            }
            if (b10.n() == 1) {
                b11.P(8);
                int c11 = C4227a.c(b11.n());
                b11.Q(4);
                if (c11 == 1) {
                    if (b11.F() == 0) {
                        throw L0.d("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c11 >= 2) {
                    b11.Q(4);
                }
                if (b11.F() == 1) {
                    b11.Q(1);
                    int D10 = b11.D();
                    int i12 = (D10 & 240) >> 4;
                    int i13 = D10 & 15;
                    if (b11.D() == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int D11 = b11.D();
                        byte[] bArr2 = new byte[16];
                        b11.j(bArr2, 0, 16);
                        if (D11 == 0) {
                            int D12 = b11.D();
                            bArr = new byte[D12];
                            b11.j(bArr, 0, D12);
                        }
                        qVar2.f50051l = true;
                        qVar2.f50053n = new p(z10, str, D11, bArr2, i12, i13, bArr);
                        return;
                    }
                    return;
                }
                throw L0.d("Entry count in sgpd != 1 (unsupported).");
            }
            throw L0.d("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private static void y(B b10, int i10, q qVar) {
        boolean z10;
        b10.P(i10 + 8);
        int b11 = C4227a.b(b10.n());
        if ((b11 & 1) == 0) {
            if ((b11 & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int H10 = b10.H();
            if (H10 == 0) {
                Arrays.fill(qVar.f50052m, 0, qVar.f50045f, false);
            } else if (H10 == qVar.f50045f) {
                Arrays.fill(qVar.f50052m, 0, H10, z10);
                qVar.d(b10.a());
                qVar.a(b10);
            } else {
                throw L0.a("Senc sample count " + H10 + " is different from fragment sample count" + qVar.f50045f, (Throwable) null);
            }
        } else {
            throw L0.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    private static void z(B b10, q qVar) {
        y(b10, 0, qVar);
    }

    public void a(long j10, long j11) {
        int size = this.f49943d.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f49943d.valueAt(i10)).k();
        }
        this.f49953n.clear();
        this.f49961v = 0;
        this.f49962w = j11;
        this.f49952m.clear();
        d();
    }

    public void f(q9.m mVar) {
        this.f49936E = mVar;
        d();
        k();
        o oVar = this.f49941b;
        if (oVar != null) {
            this.f49943d.put(0, new b(mVar.d(0, oVar.f50025b), new r(this.f49941b, new long[0], new int[0], 0, new long[0], new int[0], 0), new C4229c(0, 0, 0, 0)));
            this.f49936E.k();
        }
    }

    public boolean h(l lVar) {
        return n.b(lVar);
    }

    public int i(l lVar, y yVar) {
        while (true) {
            int i10 = this.f49955p;
            if (i10 != 0) {
                if (i10 == 1) {
                    K(lVar);
                } else if (i10 == 2) {
                    L(lVar);
                } else if (M(lVar)) {
                    return 0;
                }
            } else if (!J(lVar)) {
                return -1;
            }
        }
    }

    public g(int i10) {
        this(i10, (I) null);
    }

    public g(int i10, I i11) {
        this(i10, i11, (o) null, Collections.emptyList());
    }

    public g(int i10, I i11, o oVar) {
        this(i10, i11, oVar, Collections.emptyList());
    }

    public g(int i10, I i11, o oVar, List list) {
        this(i10, i11, oVar, list, (C3962B) null);
    }

    public g(int i10, I i11, o oVar, List list, C3962B b10) {
        this.f49940a = i10;
        this.f49949j = i11;
        this.f49941b = oVar;
        this.f49942c = Collections.unmodifiableList(list);
        this.f49954o = b10;
        this.f49950k = new c();
        this.f49951l = new B(16);
        this.f49944e = new B(x.f45063a);
        this.f49945f = new B(5);
        this.f49946g = new B();
        byte[] bArr = new byte[16];
        this.f49947h = bArr;
        this.f49948i = new B(bArr);
        this.f49952m = new ArrayDeque();
        this.f49953n = new ArrayDeque();
        this.f49943d = new SparseArray();
        this.f49963x = -9223372036854775807L;
        this.f49962w = -9223372036854775807L;
        this.f49964y = -9223372036854775807L;
        this.f49936E = q9.m.f47890b0;
        this.f49937F = new C3962B[0];
        this.f49938G = new C3962B[0];
    }

    public void release() {
    }

    /* access modifiers changed from: protected */
    public o m(o oVar) {
        return oVar;
    }
}
