package A9;

import A9.I;
import ja.B;
import ja.C;
import ja.C3645a;
import ja.C3649e;
import ja.M;
import ja.s;
import ja.x;
import java.util.Collections;
import k9.C3717q0;
import q9.C3962B;
import q9.m;

public final class q implements m {

    /* renamed from: a  reason: collision with root package name */
    private final D f29696a;

    /* renamed from: b  reason: collision with root package name */
    private String f29697b;

    /* renamed from: c  reason: collision with root package name */
    private C3962B f29698c;

    /* renamed from: d  reason: collision with root package name */
    private a f29699d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f29700e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f29701f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final u f29702g = new u(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final u f29703h = new u(33, 128);

    /* renamed from: i  reason: collision with root package name */
    private final u f29704i = new u(34, 128);

    /* renamed from: j  reason: collision with root package name */
    private final u f29705j = new u(39, 128);

    /* renamed from: k  reason: collision with root package name */
    private final u f29706k = new u(40, 128);

    /* renamed from: l  reason: collision with root package name */
    private long f29707l;

    /* renamed from: m  reason: collision with root package name */
    private long f29708m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private final B f29709n = new B();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C3962B f29710a;

        /* renamed from: b  reason: collision with root package name */
        private long f29711b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f29712c;

        /* renamed from: d  reason: collision with root package name */
        private int f29713d;

        /* renamed from: e  reason: collision with root package name */
        private long f29714e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f29715f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f29716g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f29717h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f29718i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f29719j;

        /* renamed from: k  reason: collision with root package name */
        private long f29720k;

        /* renamed from: l  reason: collision with root package name */
        private long f29721l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f29722m;

        public a(C3962B b10) {
            this.f29710a = b10;
        }

        private static boolean b(int i10) {
            if ((32 > i10 || i10 > 35) && i10 != 39) {
                return false;
            }
            return true;
        }

        private static boolean c(int i10) {
            if (i10 < 32 || i10 == 40) {
                return true;
            }
            return false;
        }

        private void d(int i10) {
            long j10 = this.f29721l;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f29722m;
                this.f29710a.f(j10, z10 ? 1 : 0, (int) (this.f29711b - this.f29720k), i10, (C3962B.a) null);
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f29719j && this.f29716g) {
                this.f29722m = this.f29712c;
                this.f29719j = false;
            } else if (this.f29717h || this.f29716g) {
                if (z10 && this.f29718i) {
                    d(i10 + ((int) (j10 - this.f29711b)));
                }
                this.f29720k = this.f29711b;
                this.f29721l = this.f29714e;
                this.f29722m = this.f29712c;
                this.f29718i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            boolean z10;
            if (this.f29715f) {
                int i12 = this.f29713d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    if ((bArr[i13] & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f29716g = z10;
                    this.f29715f = false;
                    return;
                }
                this.f29713d = i12 + (i11 - i10);
            }
        }

        public void f() {
            this.f29715f = false;
            this.f29716g = false;
            this.f29717h = false;
            this.f29718i = false;
            this.f29719j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            boolean z11;
            boolean z12 = false;
            this.f29716g = false;
            this.f29717h = false;
            this.f29714e = j11;
            this.f29713d = 0;
            this.f29711b = j10;
            if (!c(i11)) {
                if (this.f29718i && !this.f29719j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f29718i = false;
                }
                if (b(i11)) {
                    this.f29717h = !this.f29719j;
                    this.f29719j = true;
                }
            }
            if (i11 < 16 || i11 > 21) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f29712c = z11;
            if (z11 || i11 <= 9) {
                z12 = true;
            }
            this.f29715f = z12;
        }
    }

    public q(D d10) {
        this.f29696a = d10;
    }

    private void b() {
        C3645a.h(this.f29698c);
        M.j(this.f29699d);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f29699d.a(j10, i10, this.f29700e);
        if (!this.f29700e) {
            this.f29702g.b(i11);
            this.f29703h.b(i11);
            this.f29704i.b(i11);
            if (this.f29702g.c() && this.f29703h.c() && this.f29704i.c()) {
                this.f29698c.c(i(this.f29697b, this.f29702g, this.f29703h, this.f29704i));
                this.f29700e = true;
            }
        }
        if (this.f29705j.b(i11)) {
            u uVar = this.f29705j;
            this.f29709n.N(this.f29705j.f29765d, x.q(uVar.f29765d, uVar.f29766e));
            this.f29709n.Q(5);
            this.f29696a.a(j11, this.f29709n);
        }
        if (this.f29706k.b(i11)) {
            u uVar2 = this.f29706k;
            this.f29709n.N(this.f29706k.f29765d, x.q(uVar2.f29765d, uVar2.f29766e));
            this.f29709n.Q(5);
            this.f29696a.a(j11, this.f29709n);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f29699d.e(bArr, i10, i11);
        if (!this.f29700e) {
            this.f29702g.a(bArr, i10, i11);
            this.f29703h.a(bArr, i10, i11);
            this.f29704i.a(bArr, i10, i11);
        }
        this.f29705j.a(bArr, i10, i11);
        this.f29706k.a(bArr, i10, i11);
    }

    private static C3717q0 i(String str, u uVar, u uVar2, u uVar3) {
        int i10;
        int i11;
        int i12;
        u uVar4 = uVar;
        u uVar5 = uVar2;
        u uVar6 = uVar3;
        int i13 = uVar4.f29766e;
        byte[] bArr = new byte[(uVar5.f29766e + i13 + uVar6.f29766e)];
        int i14 = 0;
        System.arraycopy(uVar4.f29765d, 0, bArr, 0, i13);
        System.arraycopy(uVar5.f29765d, 0, bArr, uVar4.f29766e, uVar5.f29766e);
        System.arraycopy(uVar6.f29765d, 0, bArr, uVar4.f29766e + uVar5.f29766e, uVar6.f29766e);
        C c10 = new C(uVar5.f29765d, 0, uVar5.f29766e);
        c10.l(44);
        int e10 = c10.e(3);
        c10.k();
        int e11 = c10.e(2);
        boolean d10 = c10.d();
        int e12 = c10.e(5);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i10 = 1;
            if (i16 >= 32) {
                break;
            }
            if (c10.d()) {
                i15 |= 1 << i16;
            }
            i16++;
        }
        int[] iArr = new int[6];
        for (int i17 = 0; i17 < 6; i17++) {
            iArr[i17] = c10.e(8);
        }
        int e13 = c10.e(8);
        for (int i18 = 0; i18 < e10; i18++) {
            if (c10.d()) {
                i14 += 89;
            }
            if (c10.d()) {
                i14 += 8;
            }
        }
        c10.l(i14);
        if (e10 > 0) {
            c10.l((8 - e10) * 2);
        }
        c10.h();
        int h10 = c10.h();
        if (h10 == 3) {
            c10.k();
        }
        int h11 = c10.h();
        int h12 = c10.h();
        if (c10.d()) {
            int h13 = c10.h();
            int h14 = c10.h();
            int h15 = c10.h();
            int h16 = c10.h();
            if (h10 == 1 || h10 == 2) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            if (h10 == 1) {
                i10 = 2;
            }
            h11 -= i12 * (h13 + h14);
            h12 -= i10 * (h15 + h16);
        }
        c10.h();
        c10.h();
        int h17 = c10.h();
        if (c10.d()) {
            i11 = 0;
        } else {
            i11 = e10;
        }
        while (i11 <= e10) {
            c10.h();
            c10.h();
            c10.h();
            i11++;
        }
        c10.h();
        c10.h();
        c10.h();
        c10.h();
        c10.h();
        c10.h();
        if (c10.d() && c10.d()) {
            j(c10);
        }
        c10.l(2);
        if (c10.d()) {
            c10.l(8);
            c10.h();
            c10.h();
            c10.k();
        }
        k(c10);
        if (c10.d()) {
            for (int i19 = 0; i19 < c10.h(); i19++) {
                c10.l(h17 + 5);
            }
        }
        c10.l(2);
        float f10 = 1.0f;
        if (c10.d()) {
            if (c10.d()) {
                int e14 = c10.e(8);
                if (e14 == 255) {
                    int e15 = c10.e(16);
                    int e16 = c10.e(16);
                    if (!(e15 == 0 || e16 == 0)) {
                        f10 = ((float) e15) / ((float) e16);
                    }
                } else {
                    float[] fArr = x.f45064b;
                    if (e14 < fArr.length) {
                        f10 = fArr[e14];
                    } else {
                        s.i("H265Reader", "Unexpected aspect_ratio_idc value: " + e14);
                    }
                }
            }
            if (c10.d()) {
                c10.k();
            }
            if (c10.d()) {
                c10.l(4);
                if (c10.d()) {
                    c10.l(24);
                }
            }
            if (c10.d()) {
                c10.h();
                c10.h();
            }
            c10.k();
            if (c10.d()) {
                h12 *= 2;
            }
        }
        return new C3717q0.b().S(str).e0("video/hevc").I(C3649e.c(e11, d10, e12, i15, iArr, e13)).j0(h11).Q(h12).a0(f10).T(Collections.singletonList(bArr)).E();
    }

    private static void j(C c10) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!c10.d()) {
                    c10.h();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        c10.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        c10.g();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void k(C c10) {
        int h10 = c10.h();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < h10; i11++) {
            if (i11 != 0) {
                z10 = c10.d();
            }
            if (z10) {
                c10.k();
                c10.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (c10.d()) {
                        c10.k();
                    }
                }
            } else {
                int h11 = c10.h();
                int h12 = c10.h();
                int i13 = h11 + h12;
                for (int i14 = 0; i14 < h11; i14++) {
                    c10.h();
                    c10.k();
                }
                for (int i15 = 0; i15 < h12; i15++) {
                    c10.h();
                    c10.k();
                }
                i10 = i13;
            }
        }
    }

    private void l(long j10, int i10, int i11, long j11) {
        this.f29699d.g(j10, i10, i11, j11, this.f29700e);
        if (!this.f29700e) {
            this.f29702g.e(i11);
            this.f29703h.e(i11);
            this.f29704i.e(i11);
        }
        this.f29705j.e(i11);
        this.f29706k.e(i11);
    }

    public void a() {
        this.f29707l = 0;
        this.f29708m = -9223372036854775807L;
        x.a(this.f29701f);
        this.f29702g.d();
        this.f29703h.d();
        this.f29704i.d();
        this.f29705j.d();
        this.f29706k.d();
        a aVar = this.f29699d;
        if (aVar != null) {
            aVar.f();
        }
    }

    public void c(B b10) {
        int i10;
        b();
        while (b10.a() > 0) {
            int e10 = b10.e();
            int f10 = b10.f();
            byte[] d10 = b10.d();
            this.f29707l += (long) b10.a();
            this.f29698c.d(b10, b10.a());
            while (true) {
                if (e10 < f10) {
                    int c10 = x.c(d10, e10, f10, this.f29701f);
                    if (c10 == f10) {
                        h(d10, e10, f10);
                        return;
                    }
                    int e11 = x.e(d10, c10);
                    int i11 = c10 - e10;
                    if (i11 > 0) {
                        h(d10, e10, c10);
                    }
                    int i12 = f10 - c10;
                    long j10 = this.f29707l - ((long) i12);
                    if (i11 < 0) {
                        i10 = -i11;
                    } else {
                        i10 = 0;
                    }
                    int i13 = i10;
                    long j11 = j10;
                    int i14 = i12;
                    g(j11, i14, i13, this.f29708m);
                    l(j11, i14, e11, this.f29708m);
                    e10 = c10 + 3;
                }
            }
        }
    }

    public void d(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f29708m = j10;
        }
    }

    public void f(m mVar, I.d dVar) {
        dVar.a();
        this.f29697b = dVar.b();
        C3962B d10 = mVar.d(dVar.c(), 2);
        this.f29698c = d10;
        this.f29699d = new a(d10);
        this.f29696a.b(mVar, dVar);
    }

    public void e() {
    }
}
