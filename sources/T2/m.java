package T2;

import T2.a;
import W2.s;
import com.google.common.collect.C4770v;
import f2.C1961B;
import f2.C1979n;
import f2.s;
import f2.z;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import j2.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import z2.B;
import z2.C2959c;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.N;
import z2.O;
import z2.P;
import z2.r;
import z2.u;

public final class m implements C2972p, J {

    /* renamed from: B  reason: collision with root package name */
    public static final u f6080B = new l();

    /* renamed from: A  reason: collision with root package name */
    private O2.a f6081A;

    /* renamed from: a  reason: collision with root package name */
    private final s.a f6082a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6083b;

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f6084c;

    /* renamed from: d  reason: collision with root package name */
    private final C2073A f6085d;

    /* renamed from: e  reason: collision with root package name */
    private final C2073A f6086e;

    /* renamed from: f  reason: collision with root package name */
    private final C2073A f6087f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque f6088g;

    /* renamed from: h  reason: collision with root package name */
    private final p f6089h;

    /* renamed from: i  reason: collision with root package name */
    private final List f6090i;

    /* renamed from: j  reason: collision with root package name */
    private C4770v f6091j = C4770v.E();

    /* renamed from: k  reason: collision with root package name */
    private int f6092k;

    /* renamed from: l  reason: collision with root package name */
    private int f6093l;

    /* renamed from: m  reason: collision with root package name */
    private long f6094m;

    /* renamed from: n  reason: collision with root package name */
    private int f6095n;

    /* renamed from: o  reason: collision with root package name */
    private C2073A f6096o;

    /* renamed from: p  reason: collision with root package name */
    private int f6097p;

    /* renamed from: q  reason: collision with root package name */
    private int f6098q;

    /* renamed from: r  reason: collision with root package name */
    private int f6099r;

    /* renamed from: s  reason: collision with root package name */
    private int f6100s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6101t;

    /* renamed from: u  reason: collision with root package name */
    private r f6102u;

    /* renamed from: v  reason: collision with root package name */
    private a[] f6103v;

    /* renamed from: w  reason: collision with root package name */
    private long[][] f6104w;

    /* renamed from: x  reason: collision with root package name */
    private int f6105x;

    /* renamed from: y  reason: collision with root package name */
    private long f6106y;

    /* renamed from: z  reason: collision with root package name */
    private int f6107z;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final s f6108a;

        /* renamed from: b  reason: collision with root package name */
        public final v f6109b;

        /* renamed from: c  reason: collision with root package name */
        public final O f6110c;

        /* renamed from: d  reason: collision with root package name */
        public final P f6111d;

        /* renamed from: e  reason: collision with root package name */
        public int f6112e;

        public a(s sVar, v vVar, O o10) {
            P p10;
            this.f6108a = sVar;
            this.f6109b = vVar;
            this.f6110c = o10;
            if ("audio/true-hd".equals(sVar.f6132f.f20083n)) {
                p10 = new P();
            } else {
                p10 = null;
            }
            this.f6111d = p10;
        }
    }

    public m(s.a aVar, int i10) {
        int i11;
        this.f6082a = aVar;
        this.f6083b = i10;
        if ((i10 & 4) != 0) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        this.f6092k = i11;
        this.f6089h = new p();
        this.f6090i = new ArrayList();
        this.f6087f = new C2073A(16);
        this.f6088g = new ArrayDeque();
        this.f6084c = new C2073A(d.f22705a);
        this.f6085d = new C2073A(4);
        this.f6086e = new C2073A();
        this.f6097p = -1;
        this.f6102u = r.f29275e0;
        this.f6103v = new a[0];
    }

    private void A() {
        z zVar;
        if (this.f6107z == 2 && (this.f6083b & 2) != 0) {
            O d10 = this.f6102u.d(0, 4);
            if (this.f6081A == null) {
                zVar = null;
            } else {
                zVar = new z(this.f6081A);
            }
            d10.c(new s.b().h0(zVar).K());
            this.f6102u.k();
            this.f6102u.u(new J.b(-9223372036854775807L));
        }
    }

    private static int B(C2073A a10) {
        a10.U(8);
        int o10 = o(a10.q());
        if (o10 != 0) {
            return o10;
        }
        a10.V(4);
        while (a10.a() > 0) {
            int o11 = o(a10.q());
            if (o11 != 0) {
                return o11;
            }
        }
        return 0;
    }

    private void C(a.C0142a aVar) {
        boolean z10;
        z zVar;
        z zVar2;
        boolean z11;
        int i10;
        List list;
        int i11;
        z zVar3;
        z zVar4;
        z zVar5;
        int i12;
        int i13;
        a.C0142a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        if (this.f6107z == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        B b10 = new B();
        a.b g10 = aVar2.g(1969517665);
        if (g10 != null) {
            z C10 = b.C(g10);
            b10.c(C10);
            zVar = C10;
        } else {
            zVar = null;
        }
        a.C0142a f10 = aVar2.f(1835365473);
        if (f10 != null) {
            zVar2 = b.p(f10);
        } else {
            zVar2 = null;
        }
        z zVar6 = new z(b.r(((a.b) C2076a.e(aVar2.g(1836476516))).f5979b));
        if ((this.f6083b & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        long j10 = -9223372036854775807L;
        z zVar7 = zVar6;
        List B10 = b.B(aVar, b10, -9223372036854775807L, (C1979n) null, z11, z10, new k());
        long j11 = -9223372036854775807L;
        int i15 = 0;
        int i16 = -1;
        while (i15 < B10.size()) {
            v vVar = (v) B10.get(i15);
            if (vVar.f6162b == 0) {
                list = B10;
                i10 = i14;
                zVar4 = zVar7;
                zVar3 = zVar;
            } else {
                s sVar = vVar.f6161a;
                z zVar8 = zVar7;
                z zVar9 = zVar;
                long j12 = sVar.f6131e;
                if (j12 == j10) {
                    j12 = vVar.f6168h;
                }
                j11 = Math.max(j11, j12);
                i10 = i14 + 1;
                list = B10;
                a aVar3 = new a(sVar, vVar, this.f6102u.d(i14, sVar.f6128b));
                if ("audio/true-hd".equals(sVar.f6132f.f20083n)) {
                    i11 = vVar.f6165e * 16;
                } else {
                    i11 = vVar.f6165e + 30;
                }
                s.b a10 = sVar.f6132f.a();
                a10.f0(i11);
                if (sVar.f6128b == 2) {
                    if ((this.f6083b & 8) != 0) {
                        int i17 = sVar.f6132f.f20075f;
                        if (i16 == -1) {
                            i13 = 1;
                        } else {
                            i13 = 2;
                        }
                        a10.m0(i17 | i13);
                    }
                    if (j12 > 0 && (i12 = vVar.f6162b) > 0) {
                        a10.X(((float) i12) / (((float) j12) / 1000000.0f));
                    }
                }
                j.k(sVar.f6128b, b10, a10);
                int i18 = sVar.f6128b;
                if (this.f6090i.isEmpty()) {
                    zVar3 = zVar9;
                    zVar4 = zVar8;
                    zVar5 = null;
                } else {
                    zVar5 = new z(this.f6090i);
                    zVar3 = zVar9;
                    zVar4 = zVar8;
                }
                j.l(i18, zVar2, a10, zVar5, zVar3, zVar4);
                aVar3.f6110c.c(a10.K());
                if (sVar.f6128b == 2) {
                    if (i16 == -1) {
                        i16 = arrayList.size();
                    }
                }
                arrayList.add(aVar3);
            }
            i15++;
            zVar = zVar3;
            B10 = list;
            j10 = -9223372036854775807L;
            zVar7 = zVar4;
            i14 = i10;
        }
        this.f6105x = i16;
        this.f6106y = j11;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f6103v = aVarArr;
        this.f6104w = p(aVarArr);
        this.f6102u.k();
        this.f6102u.u(this);
    }

    private void D(long j10) {
        if (this.f6093l == 1836086884) {
            int i10 = this.f6095n;
            this.f6081A = new O2.a(0, j10, -9223372036854775807L, j10 + ((long) i10), this.f6094m - ((long) i10));
        }
    }

    private boolean E(C2973q qVar) {
        boolean z10;
        boolean z11;
        a.C0142a aVar;
        if (this.f6095n == 0) {
            if (!qVar.f(this.f6087f.e(), 0, 8, true)) {
                A();
                return false;
            }
            this.f6095n = 8;
            this.f6087f.U(0);
            this.f6094m = this.f6087f.J();
            this.f6093l = this.f6087f.q();
        }
        long j10 = this.f6094m;
        if (j10 == 1) {
            qVar.readFully(this.f6087f.e(), 8, 8);
            this.f6095n += 8;
            this.f6094m = this.f6087f.M();
        } else if (j10 == 0) {
            long a10 = qVar.a();
            if (a10 == -1 && (aVar = (a.C0142a) this.f6088g.peek()) != null) {
                a10 = aVar.f5976b;
            }
            if (a10 != -1) {
                this.f6094m = (a10 - qVar.getPosition()) + ((long) this.f6095n);
            }
        }
        if (this.f6094m >= ((long) this.f6095n)) {
            if (I(this.f6093l)) {
                long position = qVar.getPosition();
                long j11 = this.f6094m;
                int i10 = this.f6095n;
                long j12 = (position + j11) - ((long) i10);
                if (j11 != ((long) i10) && this.f6093l == 1835365473) {
                    y(qVar);
                }
                this.f6088g.push(new a.C0142a(this.f6093l, j12));
                if (this.f6094m == ((long) this.f6095n)) {
                    z(j12);
                } else {
                    q();
                }
            } else if (J(this.f6093l)) {
                if (this.f6095n == 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C2076a.g(z10);
                if (this.f6094m <= 2147483647L) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C2076a.g(z11);
                C2073A a11 = new C2073A((int) this.f6094m);
                System.arraycopy(this.f6087f.e(), 0, a11.e(), 0, 8);
                this.f6096o = a11;
                this.f6092k = 1;
            } else {
                D(qVar.getPosition() - ((long) this.f6095n));
                this.f6096o = null;
                this.f6092k = 1;
            }
            return true;
        }
        throw C1961B.c("Atom size less than header length (unsupported).");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean F(z2.C2973q r10, z2.I r11) {
        /*
            r9 = this;
            long r0 = r9.f6094m
            int r2 = r9.f6095n
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            i2.A r4 = r9.f6096o
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0046
            byte[] r11 = r4.e()
            int r7 = r9.f6095n
            int r0 = (int) r0
            r10.readFully(r11, r7, r0)
            int r10 = r9.f6093l
            r11 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r11) goto L_0x002b
            r9.f6101t = r5
            int r10 = B(r4)
            r9.f6107z = r10
            goto L_0x005e
        L_0x002b:
            java.util.ArrayDeque r10 = r9.f6088g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x005e
            java.util.ArrayDeque r10 = r9.f6088g
            java.lang.Object r10 = r10.peek()
            T2.a$a r10 = (T2.a.C0142a) r10
            T2.a$b r11 = new T2.a$b
            int r0 = r9.f6093l
            r11.<init>(r0, r4)
            r10.e(r11)
            goto L_0x005e
        L_0x0046:
            boolean r4 = r9.f6101t
            if (r4 != 0) goto L_0x0053
            int r4 = r9.f6093l
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L_0x0053
            r9.f6107z = r5
        L_0x0053:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0060
            int r11 = (int) r0
            r10.j(r11)
        L_0x005e:
            r10 = r6
            goto L_0x0068
        L_0x0060:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f29106a = r7
            r10 = r5
        L_0x0068:
            r9.z(r2)
            if (r10 == 0) goto L_0x0073
            int r10 = r9.f6092k
            r11 = 2
            if (r10 == r11) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r5 = r6
        L_0x0074:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.m.F(z2.q, z2.I):boolean");
    }

    private int G(C2973q qVar, I i10) {
        int i11;
        I i12;
        C2973q qVar2 = qVar;
        long position = qVar.getPosition();
        if (this.f6097p == -1) {
            int u10 = u(position);
            this.f6097p = u10;
            if (u10 == -1) {
                return -1;
            }
        }
        a aVar = this.f6103v[this.f6097p];
        O o10 = aVar.f6110c;
        int i13 = aVar.f6112e;
        v vVar = aVar.f6109b;
        long j10 = vVar.f6163c[i13];
        int i14 = vVar.f6164d[i13];
        P p10 = aVar.f6111d;
        long j11 = (j10 - position) + ((long) this.f6098q);
        if (j11 < 0) {
            i11 = 1;
            i12 = i10;
        } else if (j11 >= 262144) {
            i12 = i10;
            i11 = 1;
        } else {
            if (aVar.f6108a.f6133g == 1) {
                j11 += 8;
                i14 -= 8;
            }
            qVar2.j((int) j11);
            s sVar = aVar.f6108a;
            if (sVar.f6136j == 0) {
                if ("audio/ac4".equals(sVar.f6132f.f20083n)) {
                    if (this.f6099r == 0) {
                        C2959c.a(i14, this.f6086e);
                        o10.f(this.f6086e, 7);
                        this.f6099r += 7;
                    }
                    i14 += 7;
                } else if (p10 != null) {
                    p10.d(qVar2);
                }
                while (true) {
                    int i15 = this.f6099r;
                    if (i15 >= i14) {
                        break;
                    }
                    int a10 = o10.a(qVar2, i14 - i15, false);
                    this.f6098q += a10;
                    this.f6099r += a10;
                    this.f6100s -= a10;
                }
            } else {
                byte[] e10 = this.f6085d.e();
                e10[0] = 0;
                e10[1] = 0;
                e10[2] = 0;
                int i16 = aVar.f6108a.f6136j;
                int i17 = 4 - i16;
                while (this.f6099r < i14) {
                    int i18 = this.f6100s;
                    if (i18 == 0) {
                        qVar2.readFully(e10, i17, i16);
                        this.f6098q += i16;
                        this.f6085d.U(0);
                        int q10 = this.f6085d.q();
                        if (q10 >= 0) {
                            this.f6100s = q10;
                            this.f6084c.U(0);
                            o10.f(this.f6084c, 4);
                            this.f6099r += 4;
                            i14 += i17;
                        } else {
                            throw C1961B.a("Invalid NAL length", (Throwable) null);
                        }
                    } else {
                        int a11 = o10.a(qVar2, i18, false);
                        this.f6098q += a11;
                        this.f6099r += a11;
                        this.f6100s -= a11;
                    }
                }
            }
            int i19 = i14;
            v vVar2 = aVar.f6109b;
            long j12 = vVar2.f6166f[i13];
            int i20 = vVar2.f6167g[i13];
            if (p10 != null) {
                int i21 = i19;
                P p11 = p10;
                p10.c(o10, j12, i20, i21, 0, (O.a) null);
                if (i13 + 1 == aVar.f6109b.f6162b) {
                    p11.a(o10, (O.a) null);
                }
            } else {
                o10.d(j12, i20, i19, 0, (O.a) null);
            }
            aVar.f6112e++;
            this.f6097p = -1;
            this.f6098q = 0;
            this.f6099r = 0;
            this.f6100s = 0;
            return 0;
        }
        i12.f29106a = j10;
        return i11;
    }

    private int H(C2973q qVar, I i10) {
        int c10 = this.f6089h.c(qVar, i10, this.f6090i);
        if (c10 == 1 && i10.f29106a == 0) {
            q();
        }
        return c10;
    }

    private static boolean I(int i10) {
        if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473) {
            return true;
        }
        return false;
    }

    private static boolean J(int i10) {
        if (i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124) {
            return true;
        }
        return false;
    }

    private void K(a aVar, long j10) {
        v vVar = aVar.f6109b;
        int a10 = vVar.a(j10);
        if (a10 == -1) {
            a10 = vVar.b(j10);
        }
        aVar.f6112e = a10;
    }

    private static int o(int i10) {
        if (i10 == 1751476579) {
            return 2;
        }
        if (i10 != 1903435808) {
            return 0;
        }
        return 1;
    }

    private static long[][] p(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f6109b.f6162b];
            jArr2[i10] = aVarArr[i10].f6109b.f6166f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            v vVar = aVarArr[i12].f6109b;
            j10 += (long) vVar.f6164d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = vVar.f6166f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void q() {
        this.f6092k = 0;
        this.f6095n = 0;
    }

    private static int t(v vVar, long j10) {
        int a10 = vVar.a(j10);
        if (a10 == -1) {
            return vVar.b(j10);
        }
        return a10;
    }

    private int u(long j10) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z11 = true;
        long j12 = Long.MAX_VALUE;
        boolean z12 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f6103v;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f6112e;
            v vVar = aVar.f6109b;
            if (i13 != vVar.f6162b) {
                long j14 = vVar.f6163c[i13];
                long j15 = ((long[][]) L.h(this.f6104w))[i12][i13];
                long j16 = j14 - j10;
                if (j16 < 0 || j16 >= 262144) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((!z10 && z12) || (z10 == z12 && j16 < j13)) {
                    z12 = z10;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z11 = z10;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        if (j11 == Long.MAX_VALUE || !z11 || j12 < j11 + 10485760) {
            return i11;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] w() {
        return new C2972p[]{new m(s.a.f8664a, 16)};
    }

    private static long x(v vVar, long j10, long j11) {
        int t10 = t(vVar, j10);
        if (t10 == -1) {
            return j11;
        }
        return Math.min(vVar.f6163c[t10], j11);
    }

    private void y(C2973q qVar) {
        this.f6086e.Q(8);
        qVar.l(this.f6086e.e(), 0, 8);
        b.f(this.f6086e);
        qVar.j(this.f6086e.f());
        qVar.e();
    }

    private void z(long j10) {
        while (!this.f6088g.isEmpty() && ((a.C0142a) this.f6088g.peek()).f5976b == j10) {
            a.C0142a aVar = (a.C0142a) this.f6088g.pop();
            if (aVar.f5975a == 1836019574) {
                C(aVar);
                this.f6088g.clear();
                this.f6092k = 2;
            } else if (!this.f6088g.isEmpty()) {
                ((a.C0142a) this.f6088g.peek()).d(aVar);
            }
        }
        if (this.f6092k != 2) {
            q();
        }
    }

    public void a(long j10, long j11) {
        this.f6088g.clear();
        this.f6095n = 0;
        this.f6097p = -1;
        this.f6098q = 0;
        this.f6099r = 0;
        this.f6100s = 0;
        if (j10 != 0) {
            for (a aVar : this.f6103v) {
                K(aVar, j11);
                P p10 = aVar.f6111d;
                if (p10 != null) {
                    p10.b();
                }
            }
        } else if (this.f6092k != 3) {
            q();
        } else {
            this.f6089h.g();
            this.f6090i.clear();
        }
    }

    public J.a c(long j10) {
        return r(j10, -1);
    }

    public boolean e() {
        return true;
    }

    public void f(r rVar) {
        if ((this.f6083b & 16) == 0) {
            rVar = new W2.u(rVar, this.f6082a);
        }
        this.f6102u = rVar;
    }

    public long g() {
        return this.f6106y;
    }

    public int i(C2973q qVar, I i10) {
        while (true) {
            int i11 = this.f6092k;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        return G(qVar, i10);
                    }
                    if (i11 == 3) {
                        return H(qVar, i10);
                    }
                    throw new IllegalStateException();
                } else if (F(qVar, i10)) {
                    return 1;
                }
            } else if (!E(qVar)) {
                return -1;
            }
        }
    }

    public boolean j(C2973q qVar) {
        boolean z10;
        C4770v vVar;
        if ((this.f6083b & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        N d10 = r.d(qVar, z10);
        if (d10 != null) {
            vVar = C4770v.H(d10);
        } else {
            vVar = C4770v.E();
        }
        this.f6091j = vVar;
        if (d10 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z2.J.a r(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            T2.m$a[] r4 = r0.f6103v
            int r5 = r4.length
            if (r5 != 0) goto L_0x0013
            z2.J$a r1 = new z2.J$a
            z2.K r2 = z2.K.f29111c
            r1.<init>(r2)
            return r1
        L_0x0013:
            r5 = -1
            if (r3 == r5) goto L_0x0018
            r6 = r3
            goto L_0x001a
        L_0x0018:
            int r6 = r0.f6105x
        L_0x001a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L_0x0058
            r4 = r4[r6]
            T2.v r4 = r4.f6109b
            int r6 = t(r4, r1)
            if (r6 != r5) goto L_0x0035
            z2.J$a r1 = new z2.J$a
            z2.K r2 = z2.K.f29111c
            r1.<init>(r2)
            return r1
        L_0x0035:
            long[] r11 = r4.f6166f
            r12 = r11[r6]
            long[] r11 = r4.f6163c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L_0x005e
            int r11 = r4.f6162b
            int r11 = r11 + -1
            if (r6 >= r11) goto L_0x005e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L_0x005e
            if (r1 == r6) goto L_0x005e
            long[] r2 = r4.f6166f
            r9 = r2[r1]
            long[] r2 = r4.f6163c
            r1 = r2[r1]
            goto L_0x0060
        L_0x0058:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L_0x005e:
            r1 = r9
            r9 = r7
        L_0x0060:
            if (r3 != r5) goto L_0x0080
            r3 = 0
        L_0x0063:
            T2.m$a[] r4 = r0.f6103v
            int r5 = r4.length
            if (r3 >= r5) goto L_0x0080
            int r5 = r0.f6105x
            if (r3 == r5) goto L_0x007d
            r4 = r4[r3]
            T2.v r4 = r4.f6109b
            long r5 = x(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x007c
            long r1 = x(r4, r9, r1)
        L_0x007c:
            r14 = r5
        L_0x007d:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x0080:
            z2.K r3 = new z2.K
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x008f
            z2.J$a r1 = new z2.J$a
            r1.<init>(r3)
            return r1
        L_0x008f:
            z2.K r4 = new z2.K
            r4.<init>(r9, r1)
            z2.J$a r1 = new z2.J$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.m.r(long, int):z2.J$a");
    }

    /* renamed from: s */
    public C4770v k() {
        return this.f6091j;
    }

    public void release() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ s v(s sVar) {
        return sVar;
    }
}
