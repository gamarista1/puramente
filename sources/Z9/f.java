package z9;

import ja.B;
import ja.C3645a;
import k9.L0;
import q9.l;
import q9.n;

final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f50125a;

    /* renamed from: b  reason: collision with root package name */
    public int f50126b;

    /* renamed from: c  reason: collision with root package name */
    public long f50127c;

    /* renamed from: d  reason: collision with root package name */
    public long f50128d;

    /* renamed from: e  reason: collision with root package name */
    public long f50129e;

    /* renamed from: f  reason: collision with root package name */
    public long f50130f;

    /* renamed from: g  reason: collision with root package name */
    public int f50131g;

    /* renamed from: h  reason: collision with root package name */
    public int f50132h;

    /* renamed from: i  reason: collision with root package name */
    public int f50133i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f50134j = new int[255];

    /* renamed from: k  reason: collision with root package name */
    private final B f50135k = new B(255);

    f() {
    }

    public boolean a(l lVar, boolean z10) {
        b();
        this.f50135k.L(27);
        if (!n.b(lVar, this.f50135k.d(), 0, 27, z10) || this.f50135k.F() != 1332176723) {
            return false;
        }
        int D10 = this.f50135k.D();
        this.f50125a = D10;
        if (D10 == 0) {
            this.f50126b = this.f50135k.D();
            this.f50127c = this.f50135k.r();
            this.f50128d = this.f50135k.t();
            this.f50129e = this.f50135k.t();
            this.f50130f = this.f50135k.t();
            int D11 = this.f50135k.D();
            this.f50131g = D11;
            this.f50132h = D11 + 27;
            this.f50135k.L(D11);
            if (!n.b(lVar, this.f50135k.d(), 0, this.f50131g, z10)) {
                return false;
            }
            for (int i10 = 0; i10 < this.f50131g; i10++) {
                this.f50134j[i10] = this.f50135k.D();
                this.f50133i += this.f50134j[i10];
            }
            return true;
        } else if (z10) {
            return false;
        } else {
            throw L0.d("unsupported bit stream revision");
        }
    }

    public void b() {
        this.f50125a = 0;
        this.f50126b = 0;
        this.f50127c = 0;
        this.f50128d = 0;
        this.f50129e = 0;
        this.f50130f = 0;
        this.f50131g = 0;
        this.f50132h = 0;
        this.f50133i = 0;
    }

    public boolean c(l lVar) {
        return d(lVar, -1);
    }

    public boolean d(l lVar, long j10) {
        boolean z10;
        int i10;
        if (lVar.getPosition() == lVar.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        this.f50135k.L(4);
        while (true) {
            i10 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
            if ((i10 == 0 || lVar.getPosition() + 4 < j10) && n.b(lVar, this.f50135k.d(), 0, 4, true)) {
                this.f50135k.P(0);
                if (this.f50135k.F() == 1332176723) {
                    lVar.e();
                    return true;
                }
                lVar.j(1);
            }
        }
        do {
            if ((i10 != 0 && lVar.getPosition() >= j10) || lVar.b(1) == -1) {
                return false;
            }
            break;
        } while (lVar.b(1) == -1);
        return false;
    }
}
