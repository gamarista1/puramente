package z9;

import ja.B;
import ja.C3645a;
import java.util.Arrays;
import q9.l;
import q9.n;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private final f f50120a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final B f50121b = new B(new byte[65025], 0);

    /* renamed from: c  reason: collision with root package name */
    private int f50122c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f50123d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f50124e;

    e() {
    }

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f50123d = 0;
        do {
            int i13 = this.f50123d;
            int i14 = i10 + i13;
            f fVar = this.f50120a;
            if (i14 >= fVar.f50131g) {
                break;
            }
            int[] iArr = fVar.f50134j;
            this.f50123d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f50120a;
    }

    public B c() {
        return this.f50121b;
    }

    public boolean d(l lVar) {
        boolean z10;
        boolean z11;
        int i10;
        if (lVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        if (this.f50124e) {
            this.f50124e = false;
            this.f50121b.L(0);
        }
        while (!this.f50124e) {
            if (this.f50122c < 0) {
                if (!this.f50120a.c(lVar) || !this.f50120a.a(lVar, true)) {
                    return false;
                }
                f fVar = this.f50120a;
                int i11 = fVar.f50132h;
                if ((fVar.f50126b & 1) == 1 && this.f50121b.f() == 0) {
                    i11 += a(0);
                    i10 = this.f50123d;
                } else {
                    i10 = 0;
                }
                if (!n.e(lVar, i11)) {
                    return false;
                }
                this.f50122c = i10;
            }
            int a10 = a(this.f50122c);
            int i12 = this.f50122c + this.f50123d;
            if (a10 > 0) {
                B b10 = this.f50121b;
                b10.c(b10.f() + a10);
                if (!n.d(lVar, this.f50121b.d(), this.f50121b.f(), a10)) {
                    return false;
                }
                B b11 = this.f50121b;
                b11.O(b11.f() + a10);
                if (this.f50120a.f50134j[i12 - 1] != 255) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f50124e = z11;
            }
            if (i12 == this.f50120a.f50131g) {
                i12 = -1;
            }
            this.f50122c = i12;
        }
        return true;
    }

    public void e() {
        this.f50120a.b();
        this.f50121b.L(0);
        this.f50122c = -1;
        this.f50124e = false;
    }

    public void f() {
        if (this.f50121b.d().length != 65025) {
            B b10 = this.f50121b;
            b10.N(Arrays.copyOf(b10.d(), Math.max(65025, this.f50121b.f())), this.f50121b.f());
        }
    }
}
