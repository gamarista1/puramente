package f3;

import android.util.SparseArray;
import f2.C1974i;
import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.C2079d;
import i2.L;
import j2.d;
import j2.e;
import java.util.ArrayList;
import java.util.Arrays;
import z2.O;
import z2.r;

public final class p implements C1997m {

    /* renamed from: a  reason: collision with root package name */
    private final F f20629a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f20630b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f20631c;

    /* renamed from: d  reason: collision with root package name */
    private final w f20632d = new w(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final w f20633e = new w(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final w f20634f = new w(6, 128);

    /* renamed from: g  reason: collision with root package name */
    private long f20635g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f20636h = new boolean[3];

    /* renamed from: i  reason: collision with root package name */
    private String f20637i;

    /* renamed from: j  reason: collision with root package name */
    private O f20638j;

    /* renamed from: k  reason: collision with root package name */
    private b f20639k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20640l;

    /* renamed from: m  reason: collision with root package name */
    private long f20641m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private boolean f20642n;

    /* renamed from: o  reason: collision with root package name */
    private final C2073A f20643o = new C2073A();

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final O f20644a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f20645b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f20646c;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray f20647d = new SparseArray();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray f20648e = new SparseArray();

        /* renamed from: f  reason: collision with root package name */
        private final e f20649f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f20650g;

        /* renamed from: h  reason: collision with root package name */
        private int f20651h;

        /* renamed from: i  reason: collision with root package name */
        private int f20652i;

        /* renamed from: j  reason: collision with root package name */
        private long f20653j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f20654k;

        /* renamed from: l  reason: collision with root package name */
        private long f20655l;

        /* renamed from: m  reason: collision with root package name */
        private a f20656m = new a();

        /* renamed from: n  reason: collision with root package name */
        private a f20657n = new a();

        /* renamed from: o  reason: collision with root package name */
        private boolean f20658o;

        /* renamed from: p  reason: collision with root package name */
        private long f20659p;

        /* renamed from: q  reason: collision with root package name */
        private long f20660q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f20661r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f20662s;

        private static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f20663a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f20664b;

            /* renamed from: c  reason: collision with root package name */
            private d.c f20665c;

            /* renamed from: d  reason: collision with root package name */
            private int f20666d;

            /* renamed from: e  reason: collision with root package name */
            private int f20667e;

            /* renamed from: f  reason: collision with root package name */
            private int f20668f;

            /* renamed from: g  reason: collision with root package name */
            private int f20669g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f20670h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f20671i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f20672j;

            /* renamed from: k  reason: collision with root package name */
            private boolean f20673k;

            /* renamed from: l  reason: collision with root package name */
            private int f20674l;

            /* renamed from: m  reason: collision with root package name */
            private int f20675m;

            /* renamed from: n  reason: collision with root package name */
            private int f20676n;

            /* renamed from: o  reason: collision with root package name */
            private int f20677o;

            /* renamed from: p  reason: collision with root package name */
            private int f20678p;

            private a() {
            }

            /* access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f20663a) {
                    return false;
                }
                if (!aVar.f20663a) {
                    return true;
                }
                d.c cVar = (d.c) C2076a.i(this.f20665c);
                d.c cVar2 = (d.c) C2076a.i(aVar.f20665c);
                if (this.f20668f == aVar.f20668f && this.f20669g == aVar.f20669g && this.f20670h == aVar.f20670h && ((!this.f20671i || !aVar.f20671i || this.f20672j == aVar.f20672j) && (((i10 = this.f20666d) == (i11 = aVar.f20666d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f22742n) != 0 || cVar2.f22742n != 0 || (this.f20675m == aVar.f20675m && this.f20676n == aVar.f20676n)) && ((i12 != 1 || cVar2.f22742n != 1 || (this.f20677o == aVar.f20677o && this.f20678p == aVar.f20678p)) && (z10 = this.f20673k) == aVar.f20673k && (!z10 || this.f20674l == aVar.f20674l)))))) {
                    return false;
                }
                return true;
            }

            public void b() {
                this.f20664b = false;
                this.f20663a = false;
            }

            public boolean d() {
                int i10;
                if (!this.f20664b || ((i10 = this.f20667e) != 7 && i10 != 2)) {
                    return false;
                }
                return true;
            }

            public void e(d.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f20665c = cVar;
                this.f20666d = i10;
                this.f20667e = i11;
                this.f20668f = i12;
                this.f20669g = i13;
                this.f20670h = z10;
                this.f20671i = z11;
                this.f20672j = z12;
                this.f20673k = z13;
                this.f20674l = i14;
                this.f20675m = i15;
                this.f20676n = i16;
                this.f20677o = i17;
                this.f20678p = i18;
                this.f20663a = true;
                this.f20664b = true;
            }

            public void f(int i10) {
                this.f20667e = i10;
                this.f20664b = true;
            }
        }

        public b(O o10, boolean z10, boolean z11) {
            this.f20644a = o10;
            this.f20645b = z10;
            this.f20646c = z11;
            byte[] bArr = new byte[128];
            this.f20650g = bArr;
            this.f20649f = new e(bArr, 0, 0);
            h();
        }

        private void e(int i10) {
            long j10 = this.f20660q;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f20661r;
                this.f20644a.d(j10, z10 ? 1 : 0, (int) (this.f20653j - this.f20659p), i10, (O.a) null);
            }
        }

        private void i() {
            boolean z10;
            if (this.f20645b) {
                z10 = this.f20657n.d();
            } else {
                z10 = this.f20662s;
            }
            boolean z11 = this.f20661r;
            int i10 = this.f20652i;
            boolean z12 = true;
            if (i10 != 5 && (!z10 || i10 != 1)) {
                z12 = false;
            }
            this.f20661r = z11 | z12;
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0103  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0157  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(byte[] r24, int r25, int r26) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                boolean r2 = r0.f20654k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f20650g
                int r4 = r3.length
                int r5 = r0.f20651h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001d
                int r5 = r5 + r2
                int r5 = r5 * r7
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f20650g = r3
            L_0x001d:
                byte[] r3 = r0.f20650g
                int r4 = r0.f20651h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f20651h
                int r1 = r1 + r2
                r0.f20651h = r1
                j2.e r2 = r0.f20649f
                byte[] r3 = r0.f20650g
                r4 = 0
                r2.i(r3, r4, r1)
                j2.e r1 = r0.f20649f
                r2 = 8
                boolean r1 = r1.b(r2)
                if (r1 != 0) goto L_0x003e
                return
            L_0x003e:
                j2.e r1 = r0.f20649f
                r1.k()
                j2.e r1 = r0.f20649f
                int r10 = r1.e(r7)
                j2.e r1 = r0.f20649f
                r2 = 5
                r1.l(r2)
                j2.e r1 = r0.f20649f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0058
                return
            L_0x0058:
                j2.e r1 = r0.f20649f
                r1.h()
                j2.e r1 = r0.f20649f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0066
                return
            L_0x0066:
                j2.e r1 = r0.f20649f
                int r11 = r1.h()
                boolean r1 = r0.f20646c
                if (r1 != 0) goto L_0x0078
                r0.f20654k = r4
                f3.p$b$a r1 = r0.f20657n
                r1.f(r11)
                return
            L_0x0078:
                j2.e r1 = r0.f20649f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0081
                return
            L_0x0081:
                j2.e r1 = r0.f20649f
                int r13 = r1.h()
                android.util.SparseArray r1 = r0.f20648e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0092
                r0.f20654k = r4
                return
            L_0x0092:
                android.util.SparseArray r1 = r0.f20648e
                java.lang.Object r1 = r1.get(r13)
                j2.d$b r1 = (j2.d.b) r1
                android.util.SparseArray r3 = r0.f20647d
                int r5 = r1.f22727b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                j2.d$c r9 = (j2.d.c) r9
                boolean r3 = r9.f22739k
                if (r3 == 0) goto L_0x00b7
                j2.e r3 = r0.f20649f
                boolean r3 = r3.b(r7)
                if (r3 != 0) goto L_0x00b2
                return
            L_0x00b2:
                j2.e r3 = r0.f20649f
                r3.l(r7)
            L_0x00b7:
                j2.e r3 = r0.f20649f
                int r5 = r9.f22741m
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00c2
                return
            L_0x00c2:
                j2.e r3 = r0.f20649f
                int r5 = r9.f22741m
                int r12 = r3.e(r5)
                boolean r3 = r9.f22740l
                r5 = 1
                if (r3 != 0) goto L_0x00f9
                j2.e r3 = r0.f20649f
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00d8
                return
            L_0x00d8:
                j2.e r3 = r0.f20649f
                boolean r3 = r3.d()
                if (r3 == 0) goto L_0x00f4
                j2.e r6 = r0.f20649f
                boolean r6 = r6.b(r5)
                if (r6 != 0) goto L_0x00e9
                return
            L_0x00e9:
                j2.e r6 = r0.f20649f
                boolean r6 = r6.d()
                r14 = r3
                r15 = r5
                r16 = r6
                goto L_0x00fc
            L_0x00f4:
                r14 = r3
                r15 = r4
            L_0x00f6:
                r16 = r15
                goto L_0x00fc
            L_0x00f9:
                r14 = r4
                r15 = r14
                goto L_0x00f6
            L_0x00fc:
                int r3 = r0.f20652i
                if (r3 != r2) goto L_0x0103
                r17 = r5
                goto L_0x0105
            L_0x0103:
                r17 = r4
            L_0x0105:
                if (r17 == 0) goto L_0x0119
                j2.e r2 = r0.f20649f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x0110
                return
            L_0x0110:
                j2.e r2 = r0.f20649f
                int r2 = r2.h()
                r18 = r2
                goto L_0x011b
            L_0x0119:
                r18 = r4
            L_0x011b:
                int r2 = r9.f22742n
                if (r2 != 0) goto L_0x0157
                j2.e r2 = r0.f20649f
                int r3 = r9.f22743o
                boolean r2 = r2.b(r3)
                if (r2 != 0) goto L_0x012a
                return
            L_0x012a:
                j2.e r2 = r0.f20649f
                int r3 = r9.f22743o
                int r2 = r2.e(r3)
                boolean r1 = r1.f22728c
                if (r1 == 0) goto L_0x0150
                if (r14 != 0) goto L_0x0150
                j2.e r1 = r0.f20649f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0141
                return
            L_0x0141:
                j2.e r1 = r0.f20649f
                int r1 = r1.g()
                r20 = r1
                r19 = r2
                r21 = r4
            L_0x014d:
                r22 = r21
                goto L_0x0198
            L_0x0150:
                r19 = r2
                r20 = r4
            L_0x0154:
                r21 = r20
                goto L_0x014d
            L_0x0157:
                if (r2 != r5) goto L_0x0193
                boolean r2 = r9.f22744p
                if (r2 != 0) goto L_0x0193
                j2.e r2 = r0.f20649f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x0166
                return
            L_0x0166:
                j2.e r2 = r0.f20649f
                int r2 = r2.g()
                boolean r1 = r1.f22728c
                if (r1 == 0) goto L_0x018a
                if (r14 != 0) goto L_0x018a
                j2.e r1 = r0.f20649f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x017b
                return
            L_0x017b:
                j2.e r1 = r0.f20649f
                int r1 = r1.g()
                r22 = r1
                r21 = r2
                r19 = r4
                r20 = r19
                goto L_0x0198
            L_0x018a:
                r21 = r2
                r19 = r4
                r20 = r19
                r22 = r20
                goto L_0x0198
            L_0x0193:
                r19 = r4
                r20 = r19
                goto L_0x0154
            L_0x0198:
                f3.p$b$a r8 = r0.f20657n
                r8.e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f20654k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f3.p.b.a(byte[], int, int):void");
        }

        public void b(long j10) {
            i();
            this.f20653j = j10;
            e(0);
            this.f20658o = false;
        }

        public boolean c(long j10, int i10, boolean z10) {
            if (this.f20652i == 9 || (this.f20646c && this.f20657n.c(this.f20656m))) {
                if (z10 && this.f20658o) {
                    e(i10 + ((int) (j10 - this.f20653j)));
                }
                this.f20659p = this.f20653j;
                this.f20660q = this.f20655l;
                this.f20661r = false;
                this.f20658o = true;
            }
            i();
            return this.f20661r;
        }

        public boolean d() {
            return this.f20646c;
        }

        public void f(d.b bVar) {
            this.f20648e.append(bVar.f22726a, bVar);
        }

        public void g(d.c cVar) {
            this.f20647d.append(cVar.f22732d, cVar);
        }

        public void h() {
            this.f20654k = false;
            this.f20658o = false;
            this.f20657n.b();
        }

        public void j(long j10, int i10, long j11, boolean z10) {
            this.f20652i = i10;
            this.f20655l = j11;
            this.f20653j = j10;
            this.f20662s = z10;
            if (!this.f20645b || i10 != 1) {
                if (!this.f20646c) {
                    return;
                }
                if (!(i10 == 5 || i10 == 1 || i10 == 2)) {
                    return;
                }
            }
            a aVar = this.f20656m;
            this.f20656m = this.f20657n;
            this.f20657n = aVar;
            aVar.b();
            this.f20651h = 0;
            this.f20654k = true;
        }
    }

    public p(F f10, boolean z10, boolean z11) {
        this.f20629a = f10;
        this.f20630b = z10;
        this.f20631c = z11;
    }

    private void f() {
        C2076a.i(this.f20638j);
        L.h(this.f20639k);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f20640l || this.f20639k.d()) {
            this.f20632d.b(i11);
            this.f20633e.b(i11);
            if (!this.f20640l) {
                if (this.f20632d.c() && this.f20633e.c()) {
                    ArrayList arrayList = new ArrayList();
                    w wVar = this.f20632d;
                    arrayList.add(Arrays.copyOf(wVar.f20778d, wVar.f20779e));
                    w wVar2 = this.f20633e;
                    arrayList.add(Arrays.copyOf(wVar2.f20778d, wVar2.f20779e));
                    w wVar3 = this.f20632d;
                    d.c l10 = d.l(wVar3.f20778d, 3, wVar3.f20779e);
                    w wVar4 = this.f20633e;
                    d.b j12 = d.j(wVar4.f20778d, 3, wVar4.f20779e);
                    this.f20638j.c(new s.b().a0(this.f20637i).o0("video/avc").O(C2079d.a(l10.f22729a, l10.f22730b, l10.f22731c)).t0(l10.f22734f).Y(l10.f22735g).P(new C1974i.b().d(l10.f22745q).c(l10.f22746r).e(l10.f22747s).g(l10.f22737i + 8).b(l10.f22738j + 8).a()).k0(l10.f22736h).b0(arrayList).g0(l10.f22748t).K());
                    this.f20640l = true;
                    this.f20639k.g(l10);
                    this.f20639k.f(j12);
                    this.f20632d.d();
                    this.f20633e.d();
                }
            } else if (this.f20632d.c()) {
                w wVar5 = this.f20632d;
                this.f20639k.g(d.l(wVar5.f20778d, 3, wVar5.f20779e));
                this.f20632d.d();
            } else if (this.f20633e.c()) {
                w wVar6 = this.f20633e;
                this.f20639k.f(d.j(wVar6.f20778d, 3, wVar6.f20779e));
                this.f20633e.d();
            }
        }
        if (this.f20634f.b(i11)) {
            w wVar7 = this.f20634f;
            this.f20643o.S(this.f20634f.f20778d, d.r(wVar7.f20778d, wVar7.f20779e));
            this.f20643o.U(4);
            this.f20629a.a(j11, this.f20643o);
        }
        if (this.f20639k.c(j10, i10, this.f20640l)) {
            this.f20642n = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f20640l || this.f20639k.d()) {
            this.f20632d.a(bArr, i10, i11);
            this.f20633e.a(bArr, i10, i11);
        }
        this.f20634f.a(bArr, i10, i11);
        this.f20639k.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f20640l || this.f20639k.d()) {
            this.f20632d.e(i10);
            this.f20633e.e(i10);
        }
        this.f20634f.e(i10);
        this.f20639k.j(j10, i10, j11, this.f20642n);
    }

    public void a() {
        this.f20635g = 0;
        this.f20642n = false;
        this.f20641m = -9223372036854775807L;
        d.a(this.f20636h);
        this.f20632d.d();
        this.f20633e.d();
        this.f20634f.d();
        b bVar = this.f20639k;
        if (bVar != null) {
            bVar.h();
        }
    }

    public void b(C2073A a10) {
        int i10;
        f();
        int f10 = a10.f();
        int g10 = a10.g();
        byte[] e10 = a10.e();
        this.f20635g += (long) a10.a();
        this.f20638j.f(a10, a10.a());
        while (true) {
            int c10 = d.c(e10, f10, g10, this.f20636h);
            if (c10 == g10) {
                h(e10, f10, g10);
                return;
            }
            int f11 = d.f(e10, c10);
            int i11 = c10 - f10;
            if (i11 > 0) {
                h(e10, f10, c10);
            }
            int i12 = g10 - c10;
            long j10 = this.f20635g - ((long) i12);
            if (i11 < 0) {
                i10 = -i11;
            } else {
                i10 = 0;
            }
            g(j10, i12, i10, this.f20641m);
            i(j10, f11, this.f20641m);
            f10 = c10 + 3;
        }
    }

    public void c(boolean z10) {
        f();
        if (z10) {
            this.f20639k.b(this.f20635g);
        }
    }

    public void d(long j10, int i10) {
        boolean z10;
        this.f20641m = j10;
        boolean z11 = this.f20642n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20642n = z11 | z10;
    }

    public void e(r rVar, K.d dVar) {
        dVar.a();
        this.f20637i = dVar.b();
        O d10 = rVar.d(dVar.c(), 2);
        this.f20638j = d10;
        this.f20639k = new b(d10, this.f20630b, this.f20631c);
        this.f20629a.b(rVar, dVar);
    }
}
