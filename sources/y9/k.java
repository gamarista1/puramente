package y9;

import J9.b;
import android.util.Pair;
import ja.B;
import ja.C3645a;
import ja.M;
import ja.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k9.C3717q0;
import k9.L0;
import m9.C3845c;
import q9.C3962B;
import q9.C3963C;
import q9.l;
import q9.m;
import q9.p;
import q9.v;
import q9.y;
import q9.z;
import y9.C4227a;

public final class k implements q9.k, z {

    /* renamed from: y  reason: collision with root package name */
    public static final p f49982y = new j();

    /* renamed from: a  reason: collision with root package name */
    private final int f49983a;

    /* renamed from: b  reason: collision with root package name */
    private final B f49984b;

    /* renamed from: c  reason: collision with root package name */
    private final B f49985c;

    /* renamed from: d  reason: collision with root package name */
    private final B f49986d;

    /* renamed from: e  reason: collision with root package name */
    private final B f49987e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque f49988f;

    /* renamed from: g  reason: collision with root package name */
    private final m f49989g;

    /* renamed from: h  reason: collision with root package name */
    private final List f49990h;

    /* renamed from: i  reason: collision with root package name */
    private int f49991i;

    /* renamed from: j  reason: collision with root package name */
    private int f49992j;

    /* renamed from: k  reason: collision with root package name */
    private long f49993k;

    /* renamed from: l  reason: collision with root package name */
    private int f49994l;

    /* renamed from: m  reason: collision with root package name */
    private B f49995m;

    /* renamed from: n  reason: collision with root package name */
    private int f49996n;

    /* renamed from: o  reason: collision with root package name */
    private int f49997o;

    /* renamed from: p  reason: collision with root package name */
    private int f49998p;

    /* renamed from: q  reason: collision with root package name */
    private int f49999q;

    /* renamed from: r  reason: collision with root package name */
    private m f50000r;

    /* renamed from: s  reason: collision with root package name */
    private a[] f50001s;

    /* renamed from: t  reason: collision with root package name */
    private long[][] f50002t;

    /* renamed from: u  reason: collision with root package name */
    private int f50003u;

    /* renamed from: v  reason: collision with root package name */
    private long f50004v;

    /* renamed from: w  reason: collision with root package name */
    private int f50005w;

    /* renamed from: x  reason: collision with root package name */
    private b f50006x;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final o f50007a;

        /* renamed from: b  reason: collision with root package name */
        public final r f50008b;

        /* renamed from: c  reason: collision with root package name */
        public final C3962B f50009c;

        /* renamed from: d  reason: collision with root package name */
        public final C3963C f50010d;

        /* renamed from: e  reason: collision with root package name */
        public int f50011e;

        public a(o oVar, r rVar, C3962B b10) {
            C3963C c10;
            this.f50007a = oVar;
            this.f50008b = rVar;
            this.f50009c = b10;
            if ("audio/true-hd".equals(oVar.f50029f.f45770l)) {
                c10 = new C3963C();
            } else {
                c10 = null;
            }
            this.f50010d = c10;
        }
    }

    public k() {
        this(0);
    }

    private boolean A(l lVar) {
        boolean z10;
        boolean z11;
        C4227a.C0755a aVar;
        if (this.f49994l == 0) {
            if (!lVar.f(this.f49987e.d(), 0, 8, true)) {
                w();
                return false;
            }
            this.f49994l = 8;
            this.f49987e.P(0);
            this.f49993k = this.f49987e.F();
            this.f49992j = this.f49987e.n();
        }
        long j10 = this.f49993k;
        if (j10 == 1) {
            lVar.readFully(this.f49987e.d(), 8, 8);
            this.f49994l += 8;
            this.f49993k = this.f49987e.I();
        } else if (j10 == 0) {
            long a10 = lVar.a();
            if (a10 == -1 && (aVar = (C4227a.C0755a) this.f49988f.peek()) != null) {
                a10 = aVar.f49885b;
            }
            if (a10 != -1) {
                this.f49993k = (a10 - lVar.getPosition()) + ((long) this.f49994l);
            }
        }
        if (this.f49993k >= ((long) this.f49994l)) {
            if (E(this.f49992j)) {
                long position = lVar.getPosition();
                long j11 = this.f49993k;
                int i10 = this.f49994l;
                long j12 = (position + j11) - ((long) i10);
                if (j11 != ((long) i10) && this.f49992j == 1835365473) {
                    u(lVar);
                }
                this.f49988f.push(new C4227a.C0755a(this.f49992j, j12));
                if (this.f49993k == ((long) this.f49994l)) {
                    v(j12);
                } else {
                    n();
                }
            } else if (F(this.f49992j)) {
                if (this.f49994l == 8) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C3645a.f(z10);
                if (this.f49993k <= 2147483647L) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C3645a.f(z11);
                B b10 = new B((int) this.f49993k);
                System.arraycopy(this.f49987e.d(), 0, b10.d(), 0, 8);
                this.f49995m = b10;
                this.f49991i = 1;
            } else {
                z(lVar.getPosition() - ((long) this.f49994l));
                this.f49995m = null;
                this.f49991i = 1;
            }
            return true;
        }
        throw L0.d("Atom size less than header length (unsupported).");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean B(q9.l r10, q9.y r11) {
        /*
            r9 = this;
            long r0 = r9.f49993k
            int r2 = r9.f49994l
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            ja.B r4 = r9.f49995m
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0044
            byte[] r11 = r4.d()
            int r7 = r9.f49994l
            int r0 = (int) r0
            r10.readFully(r11, r7, r0)
            int r10 = r9.f49992j
            r11 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r11) goto L_0x0029
            int r10 = x(r4)
            r9.f50005w = r10
            goto L_0x004f
        L_0x0029:
            java.util.ArrayDeque r10 = r9.f49988f
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x004f
            java.util.ArrayDeque r10 = r9.f49988f
            java.lang.Object r10 = r10.peek()
            y9.a$a r10 = (y9.C4227a.C0755a) r10
            y9.a$b r11 = new y9.a$b
            int r0 = r9.f49992j
            r11.<init>(r0, r4)
            r10.e(r11)
            goto L_0x004f
        L_0x0044:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0051
            int r11 = (int) r0
            r10.j(r11)
        L_0x004f:
            r10 = r6
            goto L_0x0059
        L_0x0051:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f47919a = r7
            r10 = r5
        L_0x0059:
            r9.v(r2)
            if (r10 == 0) goto L_0x0064
            int r10 = r9.f49991i
            r11 = 2
            if (r10 == r11) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r5 = r6
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.k.B(q9.l, q9.y):boolean");
    }

    private int C(l lVar, y yVar) {
        int i10;
        y yVar2;
        l lVar2 = lVar;
        long position = lVar.getPosition();
        if (this.f49996n == -1) {
            int q10 = q(position);
            this.f49996n = q10;
            if (q10 == -1) {
                return -1;
            }
        }
        a aVar = this.f50001s[this.f49996n];
        C3962B b10 = aVar.f50009c;
        int i11 = aVar.f50011e;
        r rVar = aVar.f50008b;
        long j10 = rVar.f50060c[i11];
        int i12 = rVar.f50061d[i11];
        C3963C c10 = aVar.f50010d;
        long j11 = (j10 - position) + ((long) this.f49997o);
        if (j11 < 0) {
            i10 = 1;
            yVar2 = yVar;
        } else if (j11 >= 262144) {
            yVar2 = yVar;
            i10 = 1;
        } else {
            if (aVar.f50007a.f50030g == 1) {
                j11 += 8;
                i12 -= 8;
            }
            lVar2.j((int) j11);
            o oVar = aVar.f50007a;
            if (oVar.f50033j == 0) {
                if ("audio/ac4".equals(oVar.f50029f.f45770l)) {
                    if (this.f49998p == 0) {
                        C3845c.a(i12, this.f49986d);
                        b10.d(this.f49986d, 7);
                        this.f49998p += 7;
                    }
                    i12 += 7;
                } else if (c10 != null) {
                    c10.d(lVar2);
                }
                while (true) {
                    int i13 = this.f49998p;
                    if (i13 >= i12) {
                        break;
                    }
                    int a10 = b10.a(lVar2, i12 - i13, false);
                    this.f49997o += a10;
                    this.f49998p += a10;
                    this.f49999q -= a10;
                }
            } else {
                byte[] d10 = this.f49985c.d();
                d10[0] = 0;
                d10[1] = 0;
                d10[2] = 0;
                int i14 = aVar.f50007a.f50033j;
                int i15 = 4 - i14;
                while (this.f49998p < i12) {
                    int i16 = this.f49999q;
                    if (i16 == 0) {
                        lVar2.readFully(d10, i15, i14);
                        this.f49997o += i14;
                        this.f49985c.P(0);
                        int n10 = this.f49985c.n();
                        if (n10 >= 0) {
                            this.f49999q = n10;
                            this.f49984b.P(0);
                            b10.d(this.f49984b, 4);
                            this.f49998p += 4;
                            i12 += i15;
                        } else {
                            throw L0.a("Invalid NAL length", (Throwable) null);
                        }
                    } else {
                        int a11 = b10.a(lVar2, i16, false);
                        this.f49997o += a11;
                        this.f49998p += a11;
                        this.f49999q -= a11;
                    }
                }
            }
            int i17 = i12;
            r rVar2 = aVar.f50008b;
            long j12 = rVar2.f50063f[i11];
            int i18 = rVar2.f50064g[i11];
            if (c10 != null) {
                int i19 = i17;
                C3963C c11 = c10;
                c10.c(b10, j12, i18, i19, 0, (C3962B.a) null);
                if (i11 + 1 == aVar.f50008b.f50059b) {
                    c11.a(b10, (C3962B.a) null);
                }
            } else {
                b10.f(j12, i18, i17, 0, (C3962B.a) null);
            }
            aVar.f50011e++;
            this.f49996n = -1;
            this.f49997o = 0;
            this.f49998p = 0;
            this.f49999q = 0;
            return 0;
        }
        yVar2.f47919a = j10;
        return i10;
    }

    private int D(l lVar, y yVar) {
        int c10 = this.f49989g.c(lVar, yVar, this.f49990h);
        if (c10 == 1 && yVar.f47919a == 0) {
            n();
        }
        return c10;
    }

    private static boolean E(int i10) {
        if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473) {
            return true;
        }
        return false;
    }

    private static boolean F(int i10) {
        if (i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124) {
            return true;
        }
        return false;
    }

    private void G(a aVar, long j10) {
        r rVar = aVar.f50008b;
        int a10 = rVar.a(j10);
        if (a10 == -1) {
            a10 = rVar.b(j10);
        }
        aVar.f50011e = a10;
    }

    private static int l(int i10) {
        if (i10 == 1751476579) {
            return 2;
        }
        if (i10 != 1903435808) {
            return 0;
        }
        return 1;
    }

    private static long[][] m(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f50008b.f50059b];
            jArr2[i10] = aVarArr[i10].f50008b.f50063f[0];
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
            r rVar = aVarArr[i12].f50008b;
            j10 += (long) rVar.f50061d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = rVar.f50063f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void n() {
        this.f49991i = 0;
        this.f49994l = 0;
    }

    private static int p(r rVar, long j10) {
        int a10 = rVar.a(j10);
        if (a10 == -1) {
            return rVar.b(j10);
        }
        return a10;
    }

    private int q(long j10) {
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
            a[] aVarArr = this.f50001s;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f50011e;
            r rVar = aVar.f50008b;
            if (i13 != rVar.f50059b) {
                long j14 = rVar.f50060c[i13];
                long j15 = ((long[][]) M.j(this.f50002t))[i12][i13];
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
    public static /* synthetic */ q9.k[] s() {
        return new q9.k[]{new k()};
    }

    private static long t(r rVar, long j10, long j11) {
        int p10 = p(rVar, j10);
        if (p10 == -1) {
            return j11;
        }
        return Math.min(rVar.f50060c[p10], j11);
    }

    private void u(l lVar) {
        this.f49986d.L(8);
        lVar.l(this.f49986d.d(), 0, 8);
        C4228b.e(this.f49986d);
        lVar.j(this.f49986d.e());
        lVar.e();
    }

    private void v(long j10) {
        while (!this.f49988f.isEmpty() && ((C4227a.C0755a) this.f49988f.peek()).f49885b == j10) {
            C4227a.C0755a aVar = (C4227a.C0755a) this.f49988f.pop();
            if (aVar.f49884a == 1836019574) {
                y(aVar);
                this.f49988f.clear();
                this.f49991i = 2;
            } else if (!this.f49988f.isEmpty()) {
                ((C4227a.C0755a) this.f49988f.peek()).d(aVar);
            }
        }
        if (this.f49991i != 2) {
            n();
        }
    }

    private void w() {
        D9.a aVar;
        if (this.f50005w == 2 && (this.f49983a & 2) != 0) {
            C3962B d10 = this.f50000r.d(0, 4);
            if (this.f50006x == null) {
                aVar = null;
            } else {
                aVar = new D9.a(this.f50006x);
            }
            d10.c(new C3717q0.b().X(aVar).E());
            this.f50000r.k();
            this.f50000r.q(new z.b(-9223372036854775807L));
        }
    }

    private static int x(B b10) {
        b10.P(8);
        int l10 = l(b10.n());
        if (l10 != 0) {
            return l10;
        }
        b10.Q(4);
        while (b10.a() > 0) {
            int l11 = l(b10.n());
            if (l11 != 0) {
                return l11;
            }
        }
        return 0;
    }

    private void y(C4227a.C0755a aVar) {
        boolean z10;
        D9.a aVar2;
        D9.a aVar3;
        D9.a aVar4;
        boolean z11;
        int i10;
        List list;
        int i11;
        D9.a aVar5;
        C4227a.C0755a aVar6 = aVar;
        ArrayList arrayList = new ArrayList();
        if (this.f50005w == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        v vVar = new v();
        C4227a.b g10 = aVar6.g(1969517665);
        if (g10 != null) {
            Pair B10 = C4228b.B(g10);
            D9.a aVar7 = (D9.a) B10.first;
            D9.a aVar8 = (D9.a) B10.second;
            if (aVar7 != null) {
                vVar.c(aVar7);
            }
            aVar3 = aVar8;
            aVar2 = aVar7;
        } else {
            aVar3 = null;
            aVar2 = null;
        }
        C4227a.C0755a f10 = aVar6.f(1835365473);
        if (f10 != null) {
            aVar4 = C4228b.n(f10);
        } else {
            aVar4 = null;
        }
        if ((this.f49983a & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        D9.a aVar9 = aVar4;
        List A10 = C4228b.A(aVar, vVar, -9223372036854775807L, (o9.m) null, z11, z10, new i());
        int size = A10.size();
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        int i12 = 0;
        int i13 = -1;
        while (i12 < size) {
            r rVar = (r) A10.get(i12);
            if (rVar.f50059b == 0) {
                list = A10;
                i10 = size;
            } else {
                o oVar = rVar.f50058a;
                list = A10;
                i10 = size;
                long j12 = oVar.f50028e;
                if (j12 == j10) {
                    j12 = rVar.f50065h;
                }
                long max = Math.max(j11, j12);
                a aVar10 = new a(oVar, rVar, this.f50000r.d(i12, oVar.f50025b));
                if ("audio/true-hd".equals(oVar.f50029f.f45770l)) {
                    i11 = rVar.f50062e * 16;
                } else {
                    i11 = rVar.f50062e + 30;
                }
                C3717q0.b b10 = oVar.f50029f.b();
                b10.W(i11);
                if (oVar.f50025b == 2 && j12 > 0) {
                    int i14 = rVar.f50059b;
                    if (i14 > 1) {
                        b10.P(((float) i14) / (((float) j12) / 1000000.0f));
                    }
                }
                h.k(oVar.f50025b, vVar, b10);
                int i15 = oVar.f50025b;
                if (this.f49990h.isEmpty()) {
                    aVar5 = null;
                } else {
                    aVar5 = new D9.a(this.f49990h);
                }
                h.l(i15, aVar2, aVar9, b10, aVar3, aVar5);
                aVar10.f50009c.c(b10.E());
                if (oVar.f50025b == 2) {
                    if (i13 == -1) {
                        i13 = arrayList.size();
                    }
                }
                arrayList.add(aVar10);
                j11 = max;
            }
            i12++;
            A10 = list;
            size = i10;
            j10 = -9223372036854775807L;
        }
        this.f50003u = i13;
        this.f50004v = j11;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f50001s = aVarArr;
        this.f50002t = m(aVarArr);
        this.f50000r.k();
        this.f50000r.q(this);
    }

    private void z(long j10) {
        if (this.f49992j == 1836086884) {
            int i10 = this.f49994l;
            this.f50006x = new b(0, j10, -9223372036854775807L, j10 + ((long) i10), this.f49993k - ((long) i10));
        }
    }

    public void a(long j10, long j11) {
        this.f49988f.clear();
        this.f49994l = 0;
        this.f49996n = -1;
        this.f49997o = 0;
        this.f49998p = 0;
        this.f49999q = 0;
        if (j10 != 0) {
            for (a aVar : this.f50001s) {
                G(aVar, j11);
                C3963C c10 = aVar.f50010d;
                if (c10 != null) {
                    c10.b();
                }
            }
        } else if (this.f49991i != 3) {
            n();
        } else {
            this.f49989g.g();
            this.f49990h.clear();
        }
    }

    public z.a c(long j10) {
        return o(j10, -1);
    }

    public boolean e() {
        return true;
    }

    public void f(m mVar) {
        this.f50000r = mVar;
    }

    public long g() {
        return this.f50004v;
    }

    public boolean h(l lVar) {
        boolean z10;
        if ((this.f49983a & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return n.d(lVar, z10);
    }

    public int i(l lVar, y yVar) {
        while (true) {
            int i10 = this.f49991i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return C(lVar, yVar);
                    }
                    if (i10 == 3) {
                        return D(lVar, yVar);
                    }
                    throw new IllegalStateException();
                } else if (B(lVar, yVar)) {
                    return 1;
                }
            } else if (!A(lVar)) {
                return -1;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q9.z.a o(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            y9.k$a[] r4 = r0.f50001s
            int r5 = r4.length
            if (r5 != 0) goto L_0x0013
            q9.z$a r1 = new q9.z$a
            q9.A r2 = q9.C3961A.f47788c
            r1.<init>(r2)
            return r1
        L_0x0013:
            r5 = -1
            if (r3 == r5) goto L_0x0018
            r6 = r3
            goto L_0x001a
        L_0x0018:
            int r6 = r0.f50003u
        L_0x001a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L_0x0058
            r4 = r4[r6]
            y9.r r4 = r4.f50008b
            int r6 = p(r4, r1)
            if (r6 != r5) goto L_0x0035
            q9.z$a r1 = new q9.z$a
            q9.A r2 = q9.C3961A.f47788c
            r1.<init>(r2)
            return r1
        L_0x0035:
            long[] r11 = r4.f50063f
            r12 = r11[r6]
            long[] r11 = r4.f50060c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L_0x005e
            int r11 = r4.f50059b
            int r11 = r11 + -1
            if (r6 >= r11) goto L_0x005e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L_0x005e
            if (r1 == r6) goto L_0x005e
            long[] r2 = r4.f50063f
            r9 = r2[r1]
            long[] r2 = r4.f50060c
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
            y9.k$a[] r4 = r0.f50001s
            int r5 = r4.length
            if (r3 >= r5) goto L_0x0080
            int r5 = r0.f50003u
            if (r3 == r5) goto L_0x007d
            r4 = r4[r3]
            y9.r r4 = r4.f50008b
            long r5 = t(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x007c
            long r1 = t(r4, r9, r1)
        L_0x007c:
            r14 = r5
        L_0x007d:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x0080:
            q9.A r3 = new q9.A
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x008f
            q9.z$a r1 = new q9.z$a
            r1.<init>(r3)
            return r1
        L_0x008f:
            q9.A r4 = new q9.A
            r4.<init>(r9, r1)
            q9.z$a r1 = new q9.z$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.k.o(long, int):q9.z$a");
    }

    public k(int i10) {
        this.f49983a = i10;
        this.f49991i = (i10 & 4) != 0 ? 3 : 0;
        this.f49989g = new m();
        this.f49990h = new ArrayList();
        this.f49987e = new B(16);
        this.f49988f = new ArrayDeque();
        this.f49984b = new B(x.f45063a);
        this.f49985c = new B(4);
        this.f49986d = new B();
        this.f49996n = -1;
        this.f50000r = m.f47890b0;
        this.f50001s = new a[0];
    }

    public void release() {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ o r(o oVar) {
        return oVar;
    }
}
