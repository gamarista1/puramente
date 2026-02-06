package q9;

import ja.C3645a;
import ja.M;
import q9.z;

public final class x implements z {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f47915a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f47916b;

    /* renamed from: c  reason: collision with root package name */
    private final long f47917c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f47918d;

    public x(long[] jArr, long[] jArr2, long j10) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47918d = z11;
        if (!z11 || jArr2[0] <= 0) {
            this.f47915a = jArr;
            this.f47916b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f47915a = jArr3;
            long[] jArr4 = new long[i10];
            this.f47916b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f47917c = j10;
    }

    public z.a c(long j10) {
        if (!this.f47918d) {
            return new z.a(C3961A.f47788c);
        }
        int i10 = M.i(this.f47916b, j10, true, true);
        C3961A a10 = new C3961A(this.f47916b[i10], this.f47915a[i10]);
        if (a10.f47789a == j10 || i10 == this.f47916b.length - 1) {
            return new z.a(a10);
        }
        int i11 = i10 + 1;
        return new z.a(a10, new C3961A(this.f47916b[i11], this.f47915a[i11]));
    }

    public boolean e() {
        return this.f47918d;
    }

    public long g() {
        return this.f47917c;
    }
}
