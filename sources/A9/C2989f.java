package A9;

import A9.I;
import ja.A;
import ja.B;
import ja.C3645a;
import k9.C3717q0;
import m9.C3845c;
import q9.C3962B;
import q9.m;

/* renamed from: A9.f  reason: case insensitive filesystem */
public final class C2989f implements m {

    /* renamed from: a  reason: collision with root package name */
    private final A f29532a;

    /* renamed from: b  reason: collision with root package name */
    private final B f29533b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29534c;

    /* renamed from: d  reason: collision with root package name */
    private String f29535d;

    /* renamed from: e  reason: collision with root package name */
    private C3962B f29536e;

    /* renamed from: f  reason: collision with root package name */
    private int f29537f;

    /* renamed from: g  reason: collision with root package name */
    private int f29538g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29539h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f29540i;

    /* renamed from: j  reason: collision with root package name */
    private long f29541j;

    /* renamed from: k  reason: collision with root package name */
    private C3717q0 f29542k;

    /* renamed from: l  reason: collision with root package name */
    private int f29543l;

    /* renamed from: m  reason: collision with root package name */
    private long f29544m;

    public C2989f() {
        this((String) null);
    }

    private boolean b(B b10, byte[] bArr, int i10) {
        int min = Math.min(b10.a(), i10 - this.f29538g);
        b10.j(bArr, this.f29538g, min);
        int i11 = this.f29538g + min;
        this.f29538g = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private void g() {
        this.f29532a.p(0);
        C3845c.b d10 = C3845c.d(this.f29532a);
        C3717q0 q0Var = this.f29542k;
        if (q0Var == null || d10.f46628c != q0Var.f45783y || d10.f46627b != q0Var.f45784z || !"audio/ac4".equals(q0Var.f45770l)) {
            C3717q0 E10 = new C3717q0.b().S(this.f29535d).e0("audio/ac4").H(d10.f46628c).f0(d10.f46627b).V(this.f29534c).E();
            this.f29542k = E10;
            this.f29536e.c(E10);
        }
        this.f29543l = d10.f46629d;
        this.f29541j = (((long) d10.f46630e) * 1000000) / ((long) this.f29542k.f45784z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean h(ja.B r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f29539h
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.D()
            if (r0 != r2) goto L_0x0015
            r1 = r3
        L_0x0015:
            r5.f29539h = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.D()
            if (r0 != r2) goto L_0x0020
            r2 = r3
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            r5.f29539h = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = r3
        L_0x002e:
            r5.f29540i = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.C2989f.h(ja.B):boolean");
    }

    public void a() {
        this.f29537f = 0;
        this.f29538g = 0;
        this.f29539h = false;
        this.f29540i = false;
        this.f29544m = -9223372036854775807L;
    }

    public void c(B b10) {
        int i10;
        C3645a.h(this.f29536e);
        while (b10.a() > 0) {
            int i11 = this.f29537f;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int min = Math.min(b10.a(), this.f29543l - this.f29538g);
                        this.f29536e.d(b10, min);
                        int i12 = this.f29538g + min;
                        this.f29538g = i12;
                        int i13 = this.f29543l;
                        if (i12 == i13) {
                            long j10 = this.f29544m;
                            if (j10 != -9223372036854775807L) {
                                this.f29536e.f(j10, 1, i13, 0, (C3962B.a) null);
                                this.f29544m += this.f29541j;
                            }
                            this.f29537f = 0;
                        }
                    }
                } else if (b(b10, this.f29533b.d(), 16)) {
                    g();
                    this.f29533b.P(0);
                    this.f29536e.d(this.f29533b, 16);
                    this.f29537f = 2;
                }
            } else if (h(b10)) {
                this.f29537f = 1;
                this.f29533b.d()[0] = -84;
                byte[] d10 = this.f29533b.d();
                if (this.f29540i) {
                    i10 = 65;
                } else {
                    i10 = 64;
                }
                d10[1] = (byte) i10;
                this.f29538g = 2;
            }
        }
    }

    public void d(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f29544m = j10;
        }
    }

    public void f(m mVar, I.d dVar) {
        dVar.a();
        this.f29535d = dVar.b();
        this.f29536e = mVar.d(dVar.c(), 1);
    }

    public C2989f(String str) {
        A a10 = new A(new byte[16]);
        this.f29532a = a10;
        this.f29533b = new B(a10.f44946a);
        this.f29537f = 0;
        this.f29538g = 0;
        this.f29539h = false;
        this.f29540i = false;
        this.f29544m = -9223372036854775807L;
        this.f29534c = str;
    }

    public void e() {
    }
}
