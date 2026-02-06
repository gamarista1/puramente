package A9;

import A9.I;
import android.util.SparseArray;
import ja.B;
import ja.C;
import ja.C3645a;
import ja.C3649e;
import ja.M;
import ja.x;
import java.util.ArrayList;
import java.util.Arrays;
import k9.C3717q0;
import q9.C3962B;
import q9.m;

public final class p implements m {

    /* renamed from: a  reason: collision with root package name */
    private final D f29647a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f29648b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f29649c;

    /* renamed from: d  reason: collision with root package name */
    private final u f29650d = new u(7, 128);

    /* renamed from: e  reason: collision with root package name */
    private final u f29651e = new u(8, 128);

    /* renamed from: f  reason: collision with root package name */
    private final u f29652f = new u(6, 128);

    /* renamed from: g  reason: collision with root package name */
    private long f29653g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f29654h = new boolean[3];

    /* renamed from: i  reason: collision with root package name */
    private String f29655i;

    /* renamed from: j  reason: collision with root package name */
    private C3962B f29656j;

    /* renamed from: k  reason: collision with root package name */
    private b f29657k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f29658l;

    /* renamed from: m  reason: collision with root package name */
    private long f29659m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private boolean f29660n;

    /* renamed from: o  reason: collision with root package name */
    private final B f29661o = new B();

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C3962B f29662a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f29663b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f29664c;

        /* renamed from: d  reason: collision with root package name */
        private final SparseArray f29665d = new SparseArray();

        /* renamed from: e  reason: collision with root package name */
        private final SparseArray f29666e = new SparseArray();

        /* renamed from: f  reason: collision with root package name */
        private final C f29667f;

        /* renamed from: g  reason: collision with root package name */
        private byte[] f29668g;

        /* renamed from: h  reason: collision with root package name */
        private int f29669h;

        /* renamed from: i  reason: collision with root package name */
        private int f29670i;

        /* renamed from: j  reason: collision with root package name */
        private long f29671j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f29672k;

        /* renamed from: l  reason: collision with root package name */
        private long f29673l;

        /* renamed from: m  reason: collision with root package name */
        private a f29674m = new a();

        /* renamed from: n  reason: collision with root package name */
        private a f29675n = new a();

        /* renamed from: o  reason: collision with root package name */
        private boolean f29676o;

        /* renamed from: p  reason: collision with root package name */
        private long f29677p;

        /* renamed from: q  reason: collision with root package name */
        private long f29678q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f29679r;

        private static final class a {

            /* renamed from: a  reason: collision with root package name */
            private boolean f29680a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f29681b;

            /* renamed from: c  reason: collision with root package name */
            private x.c f29682c;

            /* renamed from: d  reason: collision with root package name */
            private int f29683d;

            /* renamed from: e  reason: collision with root package name */
            private int f29684e;

            /* renamed from: f  reason: collision with root package name */
            private int f29685f;

            /* renamed from: g  reason: collision with root package name */
            private int f29686g;

            /* renamed from: h  reason: collision with root package name */
            private boolean f29687h;

            /* renamed from: i  reason: collision with root package name */
            private boolean f29688i;

            /* renamed from: j  reason: collision with root package name */
            private boolean f29689j;

            /* renamed from: k  reason: collision with root package name */
            private boolean f29690k;

            /* renamed from: l  reason: collision with root package name */
            private int f29691l;

            /* renamed from: m  reason: collision with root package name */
            private int f29692m;

            /* renamed from: n  reason: collision with root package name */
            private int f29693n;

            /* renamed from: o  reason: collision with root package name */
            private int f29694o;

            /* renamed from: p  reason: collision with root package name */
            private int f29695p;

            private a() {
            }

            /* access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f29680a) {
                    return false;
                }
                if (!aVar.f29680a) {
                    return true;
                }
                x.c cVar = (x.c) C3645a.h(this.f29682c);
                x.c cVar2 = (x.c) C3645a.h(aVar.f29682c);
                if (this.f29685f == aVar.f29685f && this.f29686g == aVar.f29686g && this.f29687h == aVar.f29687h && ((!this.f29688i || !aVar.f29688i || this.f29689j == aVar.f29689j) && (((i10 = this.f29683d) == (i11 = aVar.f29683d) || (i10 != 0 && i11 != 0)) && (((i12 = cVar.f45091l) != 0 || cVar2.f45091l != 0 || (this.f29692m == aVar.f29692m && this.f29693n == aVar.f29693n)) && ((i12 != 1 || cVar2.f45091l != 1 || (this.f29694o == aVar.f29694o && this.f29695p == aVar.f29695p)) && (z10 = this.f29690k) == aVar.f29690k && (!z10 || this.f29691l == aVar.f29691l)))))) {
                    return false;
                }
                return true;
            }

            public void b() {
                this.f29681b = false;
                this.f29680a = false;
            }

            public boolean d() {
                int i10;
                if (!this.f29681b || ((i10 = this.f29684e) != 7 && i10 != 2)) {
                    return false;
                }
                return true;
            }

            public void e(x.c cVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f29682c = cVar;
                this.f29683d = i10;
                this.f29684e = i11;
                this.f29685f = i12;
                this.f29686g = i13;
                this.f29687h = z10;
                this.f29688i = z11;
                this.f29689j = z12;
                this.f29690k = z13;
                this.f29691l = i14;
                this.f29692m = i15;
                this.f29693n = i16;
                this.f29694o = i17;
                this.f29695p = i18;
                this.f29680a = true;
                this.f29681b = true;
            }

            public void f(int i10) {
                this.f29684e = i10;
                this.f29681b = true;
            }
        }

        public b(C3962B b10, boolean z10, boolean z11) {
            this.f29662a = b10;
            this.f29663b = z10;
            this.f29664c = z11;
            byte[] bArr = new byte[128];
            this.f29668g = bArr;
            this.f29667f = new C(bArr, 0, 0);
            g();
        }

        private void d(int i10) {
            long j10 = this.f29678q;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f29679r;
                this.f29662a.f(j10, z10 ? 1 : 0, (int) (this.f29671j - this.f29677p), i10, (C3962B.a) null);
            }
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
                boolean r2 = r0.f29672k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r26 - r1
                byte[] r3 = r0.f29668g
                int r4 = r3.length
                int r5 = r0.f29669h
                int r6 = r5 + r2
                r7 = 2
                if (r4 >= r6) goto L_0x001d
                int r5 = r5 + r2
                int r5 = r5 * r7
                byte[] r3 = java.util.Arrays.copyOf(r3, r5)
                r0.f29668g = r3
            L_0x001d:
                byte[] r3 = r0.f29668g
                int r4 = r0.f29669h
                r5 = r24
                java.lang.System.arraycopy(r5, r1, r3, r4, r2)
                int r1 = r0.f29669h
                int r1 = r1 + r2
                r0.f29669h = r1
                ja.C r2 = r0.f29667f
                byte[] r3 = r0.f29668g
                r4 = 0
                r2.i(r3, r4, r1)
                ja.C r1 = r0.f29667f
                r2 = 8
                boolean r1 = r1.b(r2)
                if (r1 != 0) goto L_0x003e
                return
            L_0x003e:
                ja.C r1 = r0.f29667f
                r1.k()
                ja.C r1 = r0.f29667f
                int r10 = r1.e(r7)
                ja.C r1 = r0.f29667f
                r2 = 5
                r1.l(r2)
                ja.C r1 = r0.f29667f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0058
                return
            L_0x0058:
                ja.C r1 = r0.f29667f
                r1.h()
                ja.C r1 = r0.f29667f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0066
                return
            L_0x0066:
                ja.C r1 = r0.f29667f
                int r11 = r1.h()
                boolean r1 = r0.f29664c
                if (r1 != 0) goto L_0x0078
                r0.f29672k = r4
                A9.p$b$a r1 = r0.f29675n
                r1.f(r11)
                return
            L_0x0078:
                ja.C r1 = r0.f29667f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0081
                return
            L_0x0081:
                ja.C r1 = r0.f29667f
                int r13 = r1.h()
                android.util.SparseArray r1 = r0.f29666e
                int r1 = r1.indexOfKey(r13)
                if (r1 >= 0) goto L_0x0092
                r0.f29672k = r4
                return
            L_0x0092:
                android.util.SparseArray r1 = r0.f29666e
                java.lang.Object r1 = r1.get(r13)
                ja.x$b r1 = (ja.x.b) r1
                android.util.SparseArray r3 = r0.f29665d
                int r5 = r1.f45078b
                java.lang.Object r3 = r3.get(r5)
                r9 = r3
                ja.x$c r9 = (ja.x.c) r9
                boolean r3 = r9.f45088i
                if (r3 == 0) goto L_0x00b7
                ja.C r3 = r0.f29667f
                boolean r3 = r3.b(r7)
                if (r3 != 0) goto L_0x00b2
                return
            L_0x00b2:
                ja.C r3 = r0.f29667f
                r3.l(r7)
            L_0x00b7:
                ja.C r3 = r0.f29667f
                int r5 = r9.f45090k
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00c2
                return
            L_0x00c2:
                ja.C r3 = r0.f29667f
                int r5 = r9.f45090k
                int r12 = r3.e(r5)
                boolean r3 = r9.f45089j
                r5 = 1
                if (r3 != 0) goto L_0x00f9
                ja.C r3 = r0.f29667f
                boolean r3 = r3.b(r5)
                if (r3 != 0) goto L_0x00d8
                return
            L_0x00d8:
                ja.C r3 = r0.f29667f
                boolean r3 = r3.d()
                if (r3 == 0) goto L_0x00f4
                ja.C r6 = r0.f29667f
                boolean r6 = r6.b(r5)
                if (r6 != 0) goto L_0x00e9
                return
            L_0x00e9:
                ja.C r6 = r0.f29667f
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
                int r3 = r0.f29670i
                if (r3 != r2) goto L_0x0103
                r17 = r5
                goto L_0x0105
            L_0x0103:
                r17 = r4
            L_0x0105:
                if (r17 == 0) goto L_0x0119
                ja.C r2 = r0.f29667f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x0110
                return
            L_0x0110:
                ja.C r2 = r0.f29667f
                int r2 = r2.h()
                r18 = r2
                goto L_0x011b
            L_0x0119:
                r18 = r4
            L_0x011b:
                int r2 = r9.f45091l
                if (r2 != 0) goto L_0x0157
                ja.C r2 = r0.f29667f
                int r3 = r9.f45092m
                boolean r2 = r2.b(r3)
                if (r2 != 0) goto L_0x012a
                return
            L_0x012a:
                ja.C r2 = r0.f29667f
                int r3 = r9.f45092m
                int r2 = r2.e(r3)
                boolean r1 = r1.f45079c
                if (r1 == 0) goto L_0x0150
                if (r14 != 0) goto L_0x0150
                ja.C r1 = r0.f29667f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x0141
                return
            L_0x0141:
                ja.C r1 = r0.f29667f
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
                boolean r2 = r9.f45093n
                if (r2 != 0) goto L_0x0193
                ja.C r2 = r0.f29667f
                boolean r2 = r2.c()
                if (r2 != 0) goto L_0x0166
                return
            L_0x0166:
                ja.C r2 = r0.f29667f
                int r2 = r2.g()
                boolean r1 = r1.f45079c
                if (r1 == 0) goto L_0x018a
                if (r14 != 0) goto L_0x018a
                ja.C r1 = r0.f29667f
                boolean r1 = r1.c()
                if (r1 != 0) goto L_0x017b
                return
            L_0x017b:
                ja.C r1 = r0.f29667f
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
                A9.p$b$a r8 = r0.f29675n
                r8.e(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                r0.f29672k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: A9.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10, boolean z11) {
            boolean z12 = false;
            if (this.f29670i == 9 || (this.f29664c && this.f29675n.c(this.f29674m))) {
                if (z10 && this.f29676o) {
                    d(i10 + ((int) (j10 - this.f29671j)));
                }
                this.f29677p = this.f29671j;
                this.f29678q = this.f29673l;
                this.f29679r = false;
                this.f29676o = true;
            }
            if (this.f29663b) {
                z11 = this.f29675n.d();
            }
            boolean z13 = this.f29679r;
            int i11 = this.f29670i;
            if (i11 == 5 || (z11 && i11 == 1)) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            this.f29679r = z14;
            return z14;
        }

        public boolean c() {
            return this.f29664c;
        }

        public void e(x.b bVar) {
            this.f29666e.append(bVar.f45077a, bVar);
        }

        public void f(x.c cVar) {
            this.f29665d.append(cVar.f45083d, cVar);
        }

        public void g() {
            this.f29672k = false;
            this.f29676o = false;
            this.f29675n.b();
        }

        public void h(long j10, int i10, long j11) {
            this.f29670i = i10;
            this.f29673l = j11;
            this.f29671j = j10;
            if (!this.f29663b || i10 != 1) {
                if (!this.f29664c) {
                    return;
                }
                if (!(i10 == 5 || i10 == 1 || i10 == 2)) {
                    return;
                }
            }
            a aVar = this.f29674m;
            this.f29674m = this.f29675n;
            this.f29675n = aVar;
            aVar.b();
            this.f29669h = 0;
            this.f29672k = true;
        }
    }

    public p(D d10, boolean z10, boolean z11) {
        this.f29647a = d10;
        this.f29648b = z10;
        this.f29649c = z11;
    }

    private void b() {
        C3645a.h(this.f29656j);
        M.j(this.f29657k);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f29658l || this.f29657k.c()) {
            this.f29650d.b(i11);
            this.f29651e.b(i11);
            if (!this.f29658l) {
                if (this.f29650d.c() && this.f29651e.c()) {
                    ArrayList arrayList = new ArrayList();
                    u uVar = this.f29650d;
                    arrayList.add(Arrays.copyOf(uVar.f29765d, uVar.f29766e));
                    u uVar2 = this.f29651e;
                    arrayList.add(Arrays.copyOf(uVar2.f29765d, uVar2.f29766e));
                    u uVar3 = this.f29650d;
                    x.c l10 = x.l(uVar3.f29765d, 3, uVar3.f29766e);
                    u uVar4 = this.f29651e;
                    x.b j12 = x.j(uVar4.f29765d, 3, uVar4.f29766e);
                    this.f29656j.c(new C3717q0.b().S(this.f29655i).e0("video/avc").I(C3649e.a(l10.f45080a, l10.f45081b, l10.f45082c)).j0(l10.f45085f).Q(l10.f45086g).a0(l10.f45087h).T(arrayList).E());
                    this.f29658l = true;
                    this.f29657k.f(l10);
                    this.f29657k.e(j12);
                    this.f29650d.d();
                    this.f29651e.d();
                }
            } else if (this.f29650d.c()) {
                u uVar5 = this.f29650d;
                this.f29657k.f(x.l(uVar5.f29765d, 3, uVar5.f29766e));
                this.f29650d.d();
            } else if (this.f29651e.c()) {
                u uVar6 = this.f29651e;
                this.f29657k.e(x.j(uVar6.f29765d, 3, uVar6.f29766e));
                this.f29651e.d();
            }
        }
        if (this.f29652f.b(i11)) {
            u uVar7 = this.f29652f;
            this.f29661o.N(this.f29652f.f29765d, x.q(uVar7.f29765d, uVar7.f29766e));
            this.f29661o.P(4);
            this.f29647a.a(j11, this.f29661o);
        }
        if (this.f29657k.b(j10, i10, this.f29658l, this.f29660n)) {
            this.f29660n = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f29658l || this.f29657k.c()) {
            this.f29650d.a(bArr, i10, i11);
            this.f29651e.a(bArr, i10, i11);
        }
        this.f29652f.a(bArr, i10, i11);
        this.f29657k.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f29658l || this.f29657k.c()) {
            this.f29650d.e(i10);
            this.f29651e.e(i10);
        }
        this.f29652f.e(i10);
        this.f29657k.h(j10, i10, j11);
    }

    public void a() {
        this.f29653g = 0;
        this.f29660n = false;
        this.f29659m = -9223372036854775807L;
        x.a(this.f29654h);
        this.f29650d.d();
        this.f29651e.d();
        this.f29652f.d();
        b bVar = this.f29657k;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void c(B b10) {
        int i10;
        b();
        int e10 = b10.e();
        int f10 = b10.f();
        byte[] d10 = b10.d();
        this.f29653g += (long) b10.a();
        this.f29656j.d(b10, b10.a());
        while (true) {
            int c10 = x.c(d10, e10, f10, this.f29654h);
            if (c10 == f10) {
                h(d10, e10, f10);
                return;
            }
            int f11 = x.f(d10, c10);
            int i11 = c10 - e10;
            if (i11 > 0) {
                h(d10, e10, c10);
            }
            int i12 = f10 - c10;
            long j10 = this.f29653g - ((long) i12);
            if (i11 < 0) {
                i10 = -i11;
            } else {
                i10 = 0;
            }
            g(j10, i12, i10, this.f29659m);
            i(j10, f11, this.f29659m);
            e10 = c10 + 3;
        }
    }

    public void d(long j10, int i10) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            this.f29659m = j10;
        }
        boolean z11 = this.f29660n;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29660n = z11 | z10;
    }

    public void f(m mVar, I.d dVar) {
        dVar.a();
        this.f29655i = dVar.b();
        C3962B d10 = mVar.d(dVar.c(), 2);
        this.f29656j = d10;
        this.f29657k = new b(d10, this.f29648b, this.f29649c);
        this.f29647a.b(mVar, dVar);
    }

    public void e() {
    }
}
