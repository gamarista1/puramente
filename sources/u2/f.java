package U2;

import f2.C1961B;
import i2.C2073A;
import i2.C2076a;
import z2.C2973q;
import z2.C2974s;

final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f6364a;

    /* renamed from: b  reason: collision with root package name */
    public int f6365b;

    /* renamed from: c  reason: collision with root package name */
    public long f6366c;

    /* renamed from: d  reason: collision with root package name */
    public long f6367d;

    /* renamed from: e  reason: collision with root package name */
    public long f6368e;

    /* renamed from: f  reason: collision with root package name */
    public long f6369f;

    /* renamed from: g  reason: collision with root package name */
    public int f6370g;

    /* renamed from: h  reason: collision with root package name */
    public int f6371h;

    /* renamed from: i  reason: collision with root package name */
    public int f6372i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f6373j = new int[255];

    /* renamed from: k  reason: collision with root package name */
    private final C2073A f6374k = new C2073A(255);

    f() {
    }

    public boolean a(C2973q qVar, boolean z10) {
        b();
        this.f6374k.Q(27);
        if (!C2974s.b(qVar, this.f6374k.e(), 0, 27, z10) || this.f6374k.J() != 1332176723) {
            return false;
        }
        int H10 = this.f6374k.H();
        this.f6364a = H10;
        if (H10 == 0) {
            this.f6365b = this.f6374k.H();
            this.f6366c = this.f6374k.v();
            this.f6367d = this.f6374k.x();
            this.f6368e = this.f6374k.x();
            this.f6369f = this.f6374k.x();
            int H11 = this.f6374k.H();
            this.f6370g = H11;
            this.f6371h = H11 + 27;
            this.f6374k.Q(H11);
            if (!C2974s.b(qVar, this.f6374k.e(), 0, this.f6370g, z10)) {
                return false;
            }
            for (int i10 = 0; i10 < this.f6370g; i10++) {
                this.f6373j[i10] = this.f6374k.H();
                this.f6372i += this.f6373j[i10];
            }
            return true;
        } else if (z10) {
            return false;
        } else {
            throw C1961B.c("unsupported bit stream revision");
        }
    }

    public void b() {
        this.f6364a = 0;
        this.f6365b = 0;
        this.f6366c = 0;
        this.f6367d = 0;
        this.f6368e = 0;
        this.f6369f = 0;
        this.f6370g = 0;
        this.f6371h = 0;
        this.f6372i = 0;
    }

    public boolean c(C2973q qVar) {
        return d(qVar, -1);
    }

    public boolean d(C2973q qVar, long j10) {
        boolean z10;
        int i10;
        if (qVar.getPosition() == qVar.g()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f6374k.Q(4);
        while (true) {
            i10 = (j10 > -1 ? 1 : (j10 == -1 ? 0 : -1));
            if ((i10 == 0 || qVar.getPosition() + 4 < j10) && C2974s.b(qVar, this.f6374k.e(), 0, 4, true)) {
                this.f6374k.U(0);
                if (this.f6374k.J() == 1332176723) {
                    qVar.e();
                    return true;
                }
                qVar.j(1);
            }
        }
        do {
            if ((i10 != 0 && qVar.getPosition() >= j10) || qVar.b(1) == -1) {
                return false;
            }
            break;
        } while (qVar.b(1) == -1);
        return false;
    }
}
