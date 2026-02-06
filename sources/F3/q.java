package f3;

import f2.C1974i;
import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.C2079d;
import i2.L;
import j2.d;
import java.util.Collections;
import z2.O;
import z2.r;

public final class q implements C1997m {

    /* renamed from: a  reason: collision with root package name */
    private final F f20679a;

    /* renamed from: b  reason: collision with root package name */
    private String f20680b;

    /* renamed from: c  reason: collision with root package name */
    private O f20681c;

    /* renamed from: d  reason: collision with root package name */
    private a f20682d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20683e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f20684f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final w f20685g = new w(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final w f20686h = new w(33, 128);

    /* renamed from: i  reason: collision with root package name */
    private final w f20687i = new w(34, 128);

    /* renamed from: j  reason: collision with root package name */
    private final w f20688j = new w(39, 128);

    /* renamed from: k  reason: collision with root package name */
    private final w f20689k = new w(40, 128);

    /* renamed from: l  reason: collision with root package name */
    private long f20690l;

    /* renamed from: m  reason: collision with root package name */
    private long f20691m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    private final C2073A f20692n = new C2073A();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final O f20693a;

        /* renamed from: b  reason: collision with root package name */
        private long f20694b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f20695c;

        /* renamed from: d  reason: collision with root package name */
        private int f20696d;

        /* renamed from: e  reason: collision with root package name */
        private long f20697e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f20698f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f20699g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f20700h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f20701i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f20702j;

        /* renamed from: k  reason: collision with root package name */
        private long f20703k;

        /* renamed from: l  reason: collision with root package name */
        private long f20704l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f20705m;

        public a(O o10) {
            this.f20693a = o10;
        }

        private static boolean c(int i10) {
            if ((32 > i10 || i10 > 35) && i10 != 39) {
                return false;
            }
            return true;
        }

        private static boolean d(int i10) {
            if (i10 < 32 || i10 == 40) {
                return true;
            }
            return false;
        }

        private void e(int i10) {
            long j10 = this.f20704l;
            if (j10 != -9223372036854775807L) {
                boolean z10 = this.f20705m;
                this.f20693a.d(j10, z10 ? 1 : 0, (int) (this.f20694b - this.f20703k), i10, (O.a) null);
            }
        }

        public void a(long j10) {
            this.f20705m = this.f20695c;
            e((int) (j10 - this.f20694b));
            this.f20703k = this.f20694b;
            this.f20694b = j10;
            e(0);
            this.f20701i = false;
        }

        public void b(long j10, int i10, boolean z10) {
            if (this.f20702j && this.f20699g) {
                this.f20705m = this.f20695c;
                this.f20702j = false;
            } else if (this.f20700h || this.f20699g) {
                if (z10 && this.f20701i) {
                    e(i10 + ((int) (j10 - this.f20694b)));
                }
                this.f20703k = this.f20694b;
                this.f20704l = this.f20697e;
                this.f20705m = this.f20695c;
                this.f20701i = true;
            }
        }

        public void f(byte[] bArr, int i10, int i11) {
            boolean z10;
            if (this.f20698f) {
                int i12 = this.f20696d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    if ((bArr[i13] & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f20699g = z10;
                    this.f20698f = false;
                    return;
                }
                this.f20696d = i12 + (i11 - i10);
            }
        }

        public void g() {
            this.f20698f = false;
            this.f20699g = false;
            this.f20700h = false;
            this.f20701i = false;
            this.f20702j = false;
        }

        public void h(long j10, int i10, int i11, long j11, boolean z10) {
            boolean z11;
            boolean z12 = false;
            this.f20699g = false;
            this.f20700h = false;
            this.f20697e = j11;
            this.f20696d = 0;
            this.f20694b = j10;
            if (!d(i11)) {
                if (this.f20701i && !this.f20702j) {
                    if (z10) {
                        e(i10);
                    }
                    this.f20701i = false;
                }
                if (c(i11)) {
                    this.f20700h = !this.f20702j;
                    this.f20702j = true;
                }
            }
            if (i11 < 16 || i11 > 21) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f20695c = z11;
            if (z11 || i11 <= 9) {
                z12 = true;
            }
            this.f20698f = z12;
        }
    }

    public q(F f10) {
        this.f20679a = f10;
    }

    private void f() {
        C2076a.i(this.f20681c);
        L.h(this.f20682d);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f20682d.b(j10, i10, this.f20683e);
        if (!this.f20683e) {
            this.f20685g.b(i11);
            this.f20686h.b(i11);
            this.f20687i.b(i11);
            if (this.f20685g.c() && this.f20686h.c() && this.f20687i.c()) {
                this.f20681c.c(i(this.f20680b, this.f20685g, this.f20686h, this.f20687i));
                this.f20683e = true;
            }
        }
        if (this.f20688j.b(i11)) {
            w wVar = this.f20688j;
            this.f20692n.S(this.f20688j.f20778d, d.r(wVar.f20778d, wVar.f20779e));
            this.f20692n.V(5);
            this.f20679a.a(j11, this.f20692n);
        }
        if (this.f20689k.b(i11)) {
            w wVar2 = this.f20689k;
            this.f20692n.S(this.f20689k.f20778d, d.r(wVar2.f20778d, wVar2.f20779e));
            this.f20692n.V(5);
            this.f20679a.a(j11, this.f20692n);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f20682d.f(bArr, i10, i11);
        if (!this.f20683e) {
            this.f20685g.a(bArr, i10, i11);
            this.f20686h.a(bArr, i10, i11);
            this.f20687i.a(bArr, i10, i11);
        }
        this.f20688j.a(bArr, i10, i11);
        this.f20689k.a(bArr, i10, i11);
    }

    private static s i(String str, w wVar, w wVar2, w wVar3) {
        int i10 = wVar.f20779e;
        byte[] bArr = new byte[(wVar2.f20779e + i10 + wVar3.f20779e)];
        System.arraycopy(wVar.f20778d, 0, bArr, 0, i10);
        System.arraycopy(wVar2.f20778d, 0, bArr, wVar.f20779e, wVar2.f20779e);
        System.arraycopy(wVar3.f20778d, 0, bArr, wVar.f20779e + wVar2.f20779e, wVar3.f20779e);
        d.a h10 = d.h(wVar2.f20778d, 3, wVar2.f20779e);
        return new s.b().a0(str).o0("video/hevc").O(C2079d.c(h10.f22709a, h10.f22710b, h10.f22711c, h10.f22712d, h10.f22716h, h10.f22717i)).t0(h10.f22719k).Y(h10.f22720l).P(new C1974i.b().d(h10.f22723o).c(h10.f22724p).e(h10.f22725q).g(h10.f22714f + 8).b(h10.f22715g + 8).a()).k0(h10.f22721m).g0(h10.f22722n).b0(Collections.singletonList(bArr)).K();
    }

    private void j(long j10, int i10, int i11, long j11) {
        this.f20682d.h(j10, i10, i11, j11, this.f20683e);
        if (!this.f20683e) {
            this.f20685g.e(i11);
            this.f20686h.e(i11);
            this.f20687i.e(i11);
        }
        this.f20688j.e(i11);
        this.f20689k.e(i11);
    }

    public void a() {
        this.f20690l = 0;
        this.f20691m = -9223372036854775807L;
        d.a(this.f20684f);
        this.f20685g.d();
        this.f20686h.d();
        this.f20687i.d();
        this.f20688j.d();
        this.f20689k.d();
        a aVar = this.f20682d;
        if (aVar != null) {
            aVar.g();
        }
    }

    public void b(C2073A a10) {
        int i10;
        f();
        while (a10.a() > 0) {
            int f10 = a10.f();
            int g10 = a10.g();
            byte[] e10 = a10.e();
            this.f20690l += (long) a10.a();
            this.f20681c.f(a10, a10.a());
            while (true) {
                if (f10 < g10) {
                    int c10 = d.c(e10, f10, g10, this.f20684f);
                    if (c10 == g10) {
                        h(e10, f10, g10);
                        return;
                    }
                    int e11 = d.e(e10, c10);
                    int i11 = c10 - f10;
                    if (i11 > 0) {
                        h(e10, f10, c10);
                    }
                    int i12 = g10 - c10;
                    long j10 = this.f20690l - ((long) i12);
                    if (i11 < 0) {
                        i10 = -i11;
                    } else {
                        i10 = 0;
                    }
                    int i13 = i10;
                    long j11 = j10;
                    int i14 = i12;
                    g(j11, i14, i13, this.f20691m);
                    j(j11, i14, e11, this.f20691m);
                    f10 = c10 + 3;
                }
            }
        }
    }

    public void c(boolean z10) {
        f();
        if (z10) {
            this.f20682d.a(this.f20690l);
        }
    }

    public void d(long j10, int i10) {
        this.f20691m = j10;
    }

    public void e(r rVar, K.d dVar) {
        dVar.a();
        this.f20680b = dVar.b();
        O d10 = rVar.d(dVar.c(), 2);
        this.f20681c = d10;
        this.f20682d = new a(d10);
        this.f20679a.b(rVar, dVar);
    }
}
