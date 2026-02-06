package f3;

import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.z;
import z2.C2959c;
import z2.O;
import z2.r;

/* renamed from: f3.f  reason: case insensitive filesystem */
public final class C1990f implements C1997m {

    /* renamed from: a  reason: collision with root package name */
    private final z f20507a;

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f20508b;

    /* renamed from: c  reason: collision with root package name */
    private final String f20509c;

    /* renamed from: d  reason: collision with root package name */
    private final int f20510d;

    /* renamed from: e  reason: collision with root package name */
    private String f20511e;

    /* renamed from: f  reason: collision with root package name */
    private O f20512f;

    /* renamed from: g  reason: collision with root package name */
    private int f20513g;

    /* renamed from: h  reason: collision with root package name */
    private int f20514h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f20515i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f20516j;

    /* renamed from: k  reason: collision with root package name */
    private long f20517k;

    /* renamed from: l  reason: collision with root package name */
    private s f20518l;

    /* renamed from: m  reason: collision with root package name */
    private int f20519m;

    /* renamed from: n  reason: collision with root package name */
    private long f20520n;

    public C1990f() {
        this((String) null, 0);
    }

    private boolean f(C2073A a10, byte[] bArr, int i10) {
        int min = Math.min(a10.a(), i10 - this.f20514h);
        a10.l(bArr, this.f20514h, min);
        int i11 = this.f20514h + min;
        this.f20514h = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private void g() {
        this.f20507a.p(0);
        C2959c.b d10 = C2959c.d(this.f20507a);
        s sVar = this.f20518l;
        if (sVar == null || d10.f29176c != sVar.f20059B || d10.f29175b != sVar.f20060C || !"audio/ac4".equals(sVar.f20083n)) {
            s K10 = new s.b().a0(this.f20511e).o0("audio/ac4").N(d10.f29176c).p0(d10.f29175b).e0(this.f20509c).m0(this.f20510d).K();
            this.f20518l = K10;
            this.f20512f.c(K10);
        }
        this.f20519m = d10.f29177d;
        this.f20517k = (((long) d10.f29178e) * 1000000) / ((long) this.f20518l.f20060C);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean h(i2.C2073A r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f20515i
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.H()
            if (r0 != r2) goto L_0x0015
            r1 = r3
        L_0x0015:
            r5.f20515i = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.H()
            if (r0 != r2) goto L_0x0020
            r2 = r3
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            r5.f20515i = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = r3
        L_0x002e:
            r5.f20516j = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.C1990f.h(i2.A):boolean");
    }

    public void a() {
        this.f20513g = 0;
        this.f20514h = 0;
        this.f20515i = false;
        this.f20516j = false;
        this.f20520n = -9223372036854775807L;
    }

    public void b(C2073A a10) {
        int i10;
        C2076a.i(this.f20512f);
        while (a10.a() > 0) {
            int i11 = this.f20513g;
            boolean z10 = true;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int min = Math.min(a10.a(), this.f20519m - this.f20514h);
                        this.f20512f.f(a10, min);
                        int i12 = this.f20514h + min;
                        this.f20514h = i12;
                        if (i12 == this.f20519m) {
                            if (this.f20520n == -9223372036854775807L) {
                                z10 = false;
                            }
                            C2076a.g(z10);
                            this.f20512f.d(this.f20520n, 1, this.f20519m, 0, (O.a) null);
                            this.f20520n += this.f20517k;
                            this.f20513g = 0;
                        }
                    }
                } else if (f(a10, this.f20508b.e(), 16)) {
                    g();
                    this.f20508b.U(0);
                    this.f20512f.f(this.f20508b, 16);
                    this.f20513g = 2;
                }
            } else if (h(a10)) {
                this.f20513g = 1;
                this.f20508b.e()[0] = -84;
                byte[] e10 = this.f20508b.e();
                if (this.f20516j) {
                    i10 = 65;
                } else {
                    i10 = 64;
                }
                e10[1] = (byte) i10;
                this.f20514h = 2;
            }
        }
    }

    public void d(long j10, int i10) {
        this.f20520n = j10;
    }

    public void e(r rVar, K.d dVar) {
        dVar.a();
        this.f20511e = dVar.b();
        this.f20512f = rVar.d(dVar.c(), 1);
    }

    public C1990f(String str, int i10) {
        z zVar = new z(new byte[16]);
        this.f20507a = zVar;
        this.f20508b = new C2073A(zVar.f22164a);
        this.f20513g = 0;
        this.f20514h = 0;
        this.f20515i = false;
        this.f20516j = false;
        this.f20520n = -9223372036854775807L;
        this.f20509c = str;
        this.f20510d = i10;
    }

    public void c(boolean z10) {
    }
}
