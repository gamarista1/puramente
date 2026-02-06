package U2;

import i2.C2073A;
import i2.C2076a;
import java.util.Arrays;
import z2.C2973q;
import z2.C2974s;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final f f6359a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f6360b = new C2073A(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    private int f6361c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f6362d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6363e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f6362d = 0;
        do {
            int i13 = this.f6362d;
            int i14 = i10 + i13;
            f fVar = this.f6359a;
            if (i14 >= fVar.f6370g) {
                break;
            }
            int[] iArr = fVar.f6373j;
            this.f6362d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f6359a;
    }

    public C2073A c() {
        return this.f6360b;
    }

    public boolean d(C2973q qVar) {
        boolean z10;
        boolean z11;
        int i10;
        if (qVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        if (this.f6363e) {
            this.f6363e = false;
            this.f6360b.Q(0);
        }
        while (!this.f6363e) {
            if (this.f6361c < 0) {
                if (!this.f6359a.c(qVar) || !this.f6359a.a(qVar, true)) {
                    return false;
                }
                f fVar = this.f6359a;
                int i11 = fVar.f6371h;
                if ((fVar.f6365b & 1) == 1 && this.f6360b.g() == 0) {
                    i11 += a(0);
                    i10 = this.f6362d;
                } else {
                    i10 = 0;
                }
                if (!C2974s.e(qVar, i11)) {
                    return false;
                }
                this.f6361c = i10;
            }
            int a10 = a(this.f6361c);
            int i12 = this.f6361c + this.f6362d;
            if (a10 > 0) {
                C2073A a11 = this.f6360b;
                a11.c(a11.g() + a10);
                if (!C2974s.d(qVar, this.f6360b.e(), this.f6360b.g(), a10)) {
                    return false;
                }
                C2073A a12 = this.f6360b;
                a12.T(a12.g() + a10);
                if (this.f6359a.f6373j[i12 - 1] != 255) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f6363e = z11;
            }
            if (i12 == this.f6359a.f6370g) {
                i12 = -1;
            }
            this.f6361c = i12;
        }
        return true;
    }

    public void e() {
        this.f6359a.b();
        this.f6360b.Q(0);
        this.f6361c = -1;
        this.f6363e = false;
    }

    public void f() {
        if (this.f6360b.e().length != 65025) {
            C2073A a10 = this.f6360b;
            a10.S(Arrays.copyOf(a10.e(), Math.max(65025, this.f6360b.g())), this.f6360b.g());
        }
    }
}
