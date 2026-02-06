package f1;

import f1.i;
import i1.C2062d;
import i1.C2063e;
import java.util.Arrays;
import java.util.HashMap;

public class d {

    /* renamed from: s  reason: collision with root package name */
    public static boolean f19616s = false;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f19617t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f19618u = true;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f19619v = true;

    /* renamed from: w  reason: collision with root package name */
    public static boolean f19620w = false;

    /* renamed from: x  reason: collision with root package name */
    public static long f19621x;

    /* renamed from: y  reason: collision with root package name */
    public static long f19622y;

    /* renamed from: a  reason: collision with root package name */
    private int f19623a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f19624b = false;

    /* renamed from: c  reason: collision with root package name */
    int f19625c = 0;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f19626d = null;

    /* renamed from: e  reason: collision with root package name */
    private a f19627e;

    /* renamed from: f  reason: collision with root package name */
    private int f19628f = 32;

    /* renamed from: g  reason: collision with root package name */
    private int f19629g = 32;

    /* renamed from: h  reason: collision with root package name */
    b[] f19630h = new b[32];

    /* renamed from: i  reason: collision with root package name */
    public boolean f19631i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f19632j = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean[] f19633k = new boolean[32];

    /* renamed from: l  reason: collision with root package name */
    int f19634l = 1;

    /* renamed from: m  reason: collision with root package name */
    int f19635m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f19636n = 32;

    /* renamed from: o  reason: collision with root package name */
    final c f19637o;

    /* renamed from: p  reason: collision with root package name */
    private i[] f19638p = new i[1000];

    /* renamed from: q  reason: collision with root package name */
    private int f19639q = 0;

    /* renamed from: r  reason: collision with root package name */
    private a f19640r;

    interface a {
        void a(a aVar);

        i b(d dVar, boolean[] zArr);

        void c(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    static class b extends b {
        b(c cVar) {
            this.f19610e = new j(this, cVar);
        }
    }

    public d() {
        D();
        c cVar = new c();
        this.f19637o = cVar;
        this.f19627e = new h(cVar);
        if (f19620w) {
            this.f19640r = new b(cVar);
        } else {
            this.f19640r = new b(cVar);
        }
    }

    private int C(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f19634l; i10++) {
            this.f19633k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f19634l * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f19633k[aVar.getKey().f19656c] = true;
            }
            i b10 = aVar.b(this, this.f19633k);
            if (b10 != null) {
                boolean[] zArr = this.f19633k;
                int i12 = b10.f19656c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (b10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f19635m; i14++) {
                    b bVar = this.f19630h[i14];
                    if (bVar.f19606a.f19663j != i.a.UNRESTRICTED && !bVar.f19611f && bVar.t(b10)) {
                        float h10 = bVar.f19610e.h(b10);
                        if (h10 < 0.0f) {
                            float f11 = (-bVar.f19607b) / h10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar2 = this.f19630h[i13];
                    bVar2.f19606a.f19657d = -1;
                    bVar2.x(b10);
                    i iVar = bVar2.f19606a;
                    iVar.f19657d = i13;
                    iVar.l(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void D() {
        int i10 = 0;
        if (f19620w) {
            while (i10 < this.f19635m) {
                b bVar = this.f19630h[i10];
                if (bVar != null) {
                    this.f19637o.f19612a.a(bVar);
                }
                this.f19630h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f19635m) {
            b bVar2 = this.f19630h[i10];
            if (bVar2 != null) {
                this.f19637o.f19613b.a(bVar2);
            }
            this.f19630h[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f19637o.f19614c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.j(aVar, str);
        } else {
            iVar.f();
            iVar.j(aVar, str);
        }
        int i10 = this.f19639q;
        int i11 = this.f19623a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f19623a = i12;
            this.f19638p = (i[]) Arrays.copyOf(this.f19638p, i12);
        }
        i[] iVarArr = this.f19638p;
        int i13 = this.f19639q;
        this.f19639q = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    private void l(b bVar) {
        int i10;
        if (!f19618u || !bVar.f19611f) {
            b[] bVarArr = this.f19630h;
            int i11 = this.f19635m;
            bVarArr[i11] = bVar;
            i iVar = bVar.f19606a;
            iVar.f19657d = i11;
            this.f19635m = i11 + 1;
            iVar.l(this, bVar);
        } else {
            bVar.f19606a.i(this, bVar.f19607b);
        }
        if (f19618u && this.f19624b) {
            int i12 = 0;
            while (i12 < this.f19635m) {
                if (this.f19630h[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f19630h[i12];
                if (bVar2 != null && bVar2.f19611f) {
                    bVar2.f19606a.i(this, bVar2.f19607b);
                    if (f19620w) {
                        this.f19637o.f19612a.a(bVar2);
                    } else {
                        this.f19637o.f19613b.a(bVar2);
                    }
                    this.f19630h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f19635m;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f19630h;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        i iVar2 = bVar3.f19606a;
                        if (iVar2.f19657d == i13) {
                            iVar2.f19657d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f19630h[i14] = null;
                    }
                    this.f19635m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f19624b = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f19635m; i10++) {
            b bVar = this.f19630h[i10];
            bVar.f19606a.f19659f = bVar.f19607b;
        }
    }

    public static b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        for (int i10 = 0; i10 < this.f19635m; i10++) {
            b bVar = this.f19630h[i10];
            if (bVar.f19606a.f19663j != i.a.UNRESTRICTED && bVar.f19607b < 0.0f) {
                boolean z10 = false;
                int i11 = 0;
                while (!z10) {
                    i11++;
                    float f10 = Float.MAX_VALUE;
                    int i12 = 0;
                    int i13 = -1;
                    int i14 = -1;
                    int i15 = 0;
                    while (true) {
                        if (i12 >= this.f19635m) {
                            break;
                        }
                        b bVar2 = this.f19630h[i12];
                        if (bVar2.f19606a.f19663j != i.a.UNRESTRICTED && !bVar2.f19611f && bVar2.f19607b < 0.0f) {
                            int i16 = 9;
                            if (f19619v) {
                                int f11 = bVar2.f19610e.f();
                                int i17 = 0;
                                while (i17 < f11) {
                                    i a10 = bVar2.f19610e.a(i17);
                                    float h10 = bVar2.f19610e.h(a10);
                                    if (h10 > 0.0f) {
                                        int i18 = 0;
                                        while (i18 < i16) {
                                            float f12 = a10.f19661h[i18] / h10;
                                            if ((f12 < f10 && i18 == i15) || i18 > i15) {
                                                i15 = i18;
                                                i14 = a10.f19656c;
                                                i13 = i12;
                                                f10 = f12;
                                            }
                                            i18++;
                                            i16 = 9;
                                        }
                                    }
                                    i17++;
                                    i16 = 9;
                                }
                            } else {
                                for (int i19 = 1; i19 < this.f19634l; i19++) {
                                    i iVar = this.f19637o.f19615d[i19];
                                    float h11 = bVar2.f19610e.h(iVar);
                                    if (h11 > 0.0f) {
                                        for (int i20 = 0; i20 < 9; i20++) {
                                            float f13 = iVar.f19661h[i20] / h11;
                                            if ((f13 < f10 && i20 == i15) || i20 > i15) {
                                                i13 = i12;
                                                i14 = i19;
                                                i15 = i20;
                                                f10 = f13;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i12++;
                    }
                    if (i13 != -1) {
                        b bVar3 = this.f19630h[i13];
                        bVar3.f19606a.f19657d = -1;
                        bVar3.x(this.f19637o.f19615d[i14]);
                        i iVar2 = bVar3.f19606a;
                        iVar2.f19657d = i13;
                        iVar2.l(this, bVar3);
                    } else {
                        z10 = true;
                    }
                    if (i11 > this.f19634l / 2) {
                        z10 = true;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    public static e x() {
        return null;
    }

    private void z() {
        int i10 = this.f19628f * 2;
        this.f19628f = i10;
        this.f19630h = (b[]) Arrays.copyOf(this.f19630h, i10);
        c cVar = this.f19637o;
        cVar.f19615d = (i[]) Arrays.copyOf(cVar.f19615d, this.f19628f);
        int i11 = this.f19628f;
        this.f19633k = new boolean[i11];
        this.f19629g = i11;
        this.f19636n = i11;
    }

    public void A() {
        if (this.f19627e.isEmpty()) {
            n();
        } else if (this.f19631i || this.f19632j) {
            for (int i10 = 0; i10 < this.f19635m; i10++) {
                if (!this.f19630h[i10].f19611f) {
                    B(this.f19627e);
                    return;
                }
            }
            n();
        } else {
            B(this.f19627e);
        }
    }

    /* access modifiers changed from: package-private */
    public void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f19637o;
            i[] iVarArr = cVar.f19615d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.f();
            }
            i10++;
        }
        cVar.f19614c.c(this.f19638p, this.f19639q);
        this.f19639q = 0;
        Arrays.fill(this.f19637o.f19615d, (Object) null);
        HashMap hashMap = this.f19626d;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f19625c = 0;
        this.f19627e.clear();
        this.f19634l = 1;
        for (int i11 = 0; i11 < this.f19635m; i11++) {
            b bVar = this.f19630h[i11];
            if (bVar != null) {
                bVar.f19608c = false;
            }
        }
        D();
        this.f19635m = 0;
        if (f19620w) {
            this.f19640r = new b(this.f19637o);
        } else {
            this.f19640r = new b(this.f19637o);
        }
    }

    public void b(C2063e eVar, C2063e eVar2, float f10, int i10) {
        C2063e eVar3 = eVar;
        C2063e eVar4 = eVar2;
        C2062d.a aVar = C2062d.a.LEFT;
        i q10 = q(eVar3.q(aVar));
        C2062d.a aVar2 = C2062d.a.TOP;
        i q11 = q(eVar3.q(aVar2));
        C2062d.a aVar3 = C2062d.a.RIGHT;
        i q12 = q(eVar3.q(aVar3));
        C2062d.a aVar4 = C2062d.a.BOTTOM;
        i q13 = q(eVar3.q(aVar4));
        i q14 = q(eVar4.q(aVar));
        i q15 = q(eVar4.q(aVar2));
        i q16 = q(eVar4.q(aVar3));
        i q17 = q(eVar4.q(aVar4));
        b r10 = r();
        double d10 = (double) f10;
        i iVar = q16;
        double d11 = (double) i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        b r11 = r();
        r11.q(q10, q12, q14, iVar, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        int i13 = i12;
        b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i13 != 8) {
            r10.d(this, i13);
        }
        d(r10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(f1.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.f19635m
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f19636n
            if (r0 >= r2) goto L_0x0012
            int r0 = r5.f19634l
            int r0 = r0 + r1
            int r2 = r5.f19629g
            if (r0 < r2) goto L_0x0015
        L_0x0012:
            r5.z()
        L_0x0015:
            boolean r0 = r6.f19611f
            r2 = 0
            if (r0 != 0) goto L_0x0084
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0024
            return
        L_0x0024:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L_0x007b
            f1.i r0 = r5.p()
            r6.f19606a = r0
            int r3 = r5.f19635m
            r5.l(r6)
            int r4 = r5.f19635m
            int r3 = r3 + r1
            if (r4 != r3) goto L_0x007b
            f1.d$a r2 = r5.f19640r
            r2.a(r6)
            f1.d$a r2 = r5.f19640r
            r5.C(r2, r1)
            int r2 = r0.f19657d
            r3 = -1
            if (r2 != r3) goto L_0x007c
            f1.i r2 = r6.f19606a
            if (r2 != r0) goto L_0x0059
            f1.i r0 = r6.v(r0)
            if (r0 == 0) goto L_0x0059
            r6.x(r0)
        L_0x0059:
            boolean r0 = r6.f19611f
            if (r0 != 0) goto L_0x0062
            f1.i r0 = r6.f19606a
            r0.l(r5, r6)
        L_0x0062:
            boolean r0 = f19620w
            if (r0 == 0) goto L_0x006e
            f1.c r0 = r5.f19637o
            f1.f r0 = r0.f19612a
            r0.a(r6)
            goto L_0x0075
        L_0x006e:
            f1.c r0 = r5.f19637o
            f1.f r0 = r0.f19613b
            r0.a(r6)
        L_0x0075:
            int r0 = r5.f19635m
            int r0 = r0 - r1
            r5.f19635m = r0
            goto L_0x007c
        L_0x007b:
            r1 = r2
        L_0x007c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L_0x0083
            return
        L_0x0083:
            r2 = r1
        L_0x0084:
            if (r2 != 0) goto L_0x0089
            r5.l(r6)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.d.d(f1.b):void");
    }

    public b e(i iVar, i iVar2, int i10, int i11) {
        if (!f19617t || i11 != 8 || !iVar2.f19660g || iVar.f19657d != -1) {
            b r10 = r();
            r10.n(iVar, iVar2, i10);
            if (i11 != 8) {
                r10.d(this, i11);
            }
            d(r10);
            return r10;
        }
        iVar.i(this, iVar2.f19659f + ((float) i10));
        return null;
    }

    public void f(i iVar, int i10) {
        if (!f19617t || iVar.f19657d != -1) {
            int i11 = iVar.f19657d;
            if (i11 != -1) {
                b bVar = this.f19630h[i11];
                if (bVar.f19611f) {
                    bVar.f19607b = (float) i10;
                } else if (bVar.f19610e.f() == 0) {
                    bVar.f19611f = true;
                    bVar.f19607b = (float) i10;
                } else {
                    b r10 = r();
                    r10.m(iVar, i10);
                    d(r10);
                }
            } else {
                b r11 = r();
                r11.i(iVar, i10);
                d(r11);
            }
        } else {
            float f10 = (float) i10;
            iVar.i(this, f10);
            for (int i12 = 0; i12 < this.f19625c + 1; i12++) {
                i iVar2 = this.f19637o.f19615d[i12];
                if (iVar2 != null && iVar2.f19667n && iVar2.f19668o == iVar.f19656c) {
                    iVar2.i(this, iVar2.f19669p + f10);
                }
            }
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        b r10 = r();
        i t10 = t();
        t10.f19658e = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        b r10 = r();
        i t10 = t();
        t10.f19658e = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f19610e.h(t10) * -1.0f), i11);
        }
        d(r10);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        b r10 = r();
        i t10 = t();
        t10.f19658e = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        b r10 = r();
        i t10 = t();
        t10.f19658e = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f19610e.h(t10) * -1.0f), i11);
        }
        d(r10);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    /* access modifiers changed from: package-private */
    public void m(b bVar, int i10, int i11) {
        bVar.e(o(i11, (String) null), i10);
    }

    public i o(int i10, String str) {
        if (this.f19634l + 1 >= this.f19629g) {
            z();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f19625c + 1;
        this.f19625c = i11;
        this.f19634l++;
        a10.f19656c = i11;
        a10.f19658e = i10;
        this.f19637o.f19615d[i11] = a10;
        this.f19627e.c(a10);
        return a10;
    }

    public i p() {
        if (this.f19634l + 1 >= this.f19629g) {
            z();
        }
        i a10 = a(i.a.SLACK, (String) null);
        int i10 = this.f19625c + 1;
        this.f19625c = i10;
        this.f19634l++;
        a10.f19656c = i10;
        this.f19637o.f19615d[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f19634l + 1 >= this.f19629g) {
            z();
        }
        if (obj instanceof C2062d) {
            C2062d dVar = (C2062d) obj;
            iVar = dVar.i();
            if (iVar == null) {
                dVar.s(this.f19637o);
                iVar = dVar.i();
            }
            int i10 = iVar.f19656c;
            if (i10 == -1 || i10 > this.f19625c || this.f19637o.f19615d[i10] == null) {
                if (i10 != -1) {
                    iVar.f();
                }
                int i11 = this.f19625c + 1;
                this.f19625c = i11;
                this.f19634l++;
                iVar.f19656c = i11;
                iVar.f19663j = i.a.UNRESTRICTED;
                this.f19637o.f19615d[i11] = iVar;
            }
        }
        return iVar;
    }

    public b r() {
        b bVar;
        if (f19620w) {
            bVar = (b) this.f19637o.f19612a.b();
            if (bVar == null) {
                bVar = new b(this.f19637o);
                f19622y++;
            } else {
                bVar.y();
            }
        } else {
            bVar = (b) this.f19637o.f19613b.b();
            if (bVar == null) {
                bVar = new b(this.f19637o);
                f19621x++;
            } else {
                bVar.y();
            }
        }
        i.c();
        return bVar;
    }

    public i t() {
        if (this.f19634l + 1 >= this.f19629g) {
            z();
        }
        i a10 = a(i.a.SLACK, (String) null);
        int i10 = this.f19625c + 1;
        this.f19625c = i10;
        this.f19634l++;
        a10.f19656c = i10;
        this.f19637o.f19615d[i10] = a10;
        return a10;
    }

    public c w() {
        return this.f19637o;
    }

    public int y(Object obj) {
        i i10 = ((C2062d) obj).i();
        if (i10 != null) {
            return (int) (i10.f19659f + 0.5f);
        }
        return 0;
    }

    public void v(e eVar) {
    }
}
