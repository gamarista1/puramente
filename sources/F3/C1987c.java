package f3;

import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import i2.z;
import z2.C2958b;
import z2.O;
import z2.r;

/* renamed from: f3.c  reason: case insensitive filesystem */
public final class C1987c implements C1997m {

    /* renamed from: a  reason: collision with root package name */
    private final z f20490a;

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f20491b;

    /* renamed from: c  reason: collision with root package name */
    private final String f20492c;

    /* renamed from: d  reason: collision with root package name */
    private final int f20493d;

    /* renamed from: e  reason: collision with root package name */
    private String f20494e;

    /* renamed from: f  reason: collision with root package name */
    private O f20495f;

    /* renamed from: g  reason: collision with root package name */
    private int f20496g;

    /* renamed from: h  reason: collision with root package name */
    private int f20497h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f20498i;

    /* renamed from: j  reason: collision with root package name */
    private long f20499j;

    /* renamed from: k  reason: collision with root package name */
    private s f20500k;

    /* renamed from: l  reason: collision with root package name */
    private int f20501l;

    /* renamed from: m  reason: collision with root package name */
    private long f20502m;

    public C1987c() {
        this((String) null, 0);
    }

    private boolean f(C2073A a10, byte[] bArr, int i10) {
        int min = Math.min(a10.a(), i10 - this.f20497h);
        a10.l(bArr, this.f20497h, min);
        int i11 = this.f20497h + min;
        this.f20497h = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private void g() {
        this.f20490a.p(0);
        C2958b.C0490b f10 = C2958b.f(this.f20490a);
        s sVar = this.f20500k;
        if (sVar == null || f10.f29169d != sVar.f20059B || f10.f29168c != sVar.f20060C || !L.c(f10.f29166a, sVar.f20083n)) {
            s.b j02 = new s.b().a0(this.f20494e).o0(f10.f29166a).N(f10.f29169d).p0(f10.f29168c).e0(this.f20492c).m0(this.f20493d).j0(f10.f29172g);
            if ("audio/ac3".equals(f10.f29166a)) {
                j02.M(f10.f29172g);
            }
            s K10 = j02.K();
            this.f20500k = K10;
            this.f20495f.c(K10);
        }
        this.f20501l = f10.f29170e;
        this.f20499j = (((long) f10.f29171f) * 1000000) / ((long) this.f20500k.f20060C);
    }

    private boolean h(C2073A a10) {
        while (true) {
            boolean z10 = false;
            if (a10.a() <= 0) {
                return false;
            }
            if (!this.f20498i) {
                if (a10.H() == 11) {
                    z10 = true;
                }
                this.f20498i = z10;
            } else {
                int H10 = a10.H();
                if (H10 == 119) {
                    this.f20498i = false;
                    return true;
                }
                if (H10 == 11) {
                    z10 = true;
                }
                this.f20498i = z10;
            }
        }
    }

    public void a() {
        this.f20496g = 0;
        this.f20497h = 0;
        this.f20498i = false;
        this.f20502m = -9223372036854775807L;
    }

    public void b(C2073A a10) {
        C2076a.i(this.f20495f);
        while (a10.a() > 0) {
            int i10 = this.f20496g;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(a10.a(), this.f20501l - this.f20497h);
                        this.f20495f.f(a10, min);
                        int i11 = this.f20497h + min;
                        this.f20497h = i11;
                        if (i11 == this.f20501l) {
                            if (this.f20502m == -9223372036854775807L) {
                                z10 = false;
                            }
                            C2076a.g(z10);
                            this.f20495f.d(this.f20502m, 1, this.f20501l, 0, (O.a) null);
                            this.f20502m += this.f20499j;
                            this.f20496g = 0;
                        }
                    }
                } else if (f(a10, this.f20491b.e(), 128)) {
                    g();
                    this.f20491b.U(0);
                    this.f20495f.f(this.f20491b, 128);
                    this.f20496g = 2;
                }
            } else if (h(a10)) {
                this.f20496g = 1;
                this.f20491b.e()[0] = 11;
                this.f20491b.e()[1] = 119;
                this.f20497h = 2;
            }
        }
    }

    public void d(long j10, int i10) {
        this.f20502m = j10;
    }

    public void e(r rVar, K.d dVar) {
        dVar.a();
        this.f20494e = dVar.b();
        this.f20495f = rVar.d(dVar.c(), 1);
    }

    public C1987c(String str, int i10) {
        z zVar = new z(new byte[128]);
        this.f20490a = zVar;
        this.f20491b = new C2073A(zVar.f22164a);
        this.f20496g = 0;
        this.f20502m = -9223372036854775807L;
        this.f20492c = str;
        this.f20493d = i10;
    }

    public void c(boolean z10) {
    }
}
