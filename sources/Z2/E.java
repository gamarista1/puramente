package z2;

import i2.C2076a;
import i2.L;
import z2.J;

public final class E implements J {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f29088a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f29089b;

    /* renamed from: c  reason: collision with root package name */
    private final long f29090c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f29091d;

    public E(long[] jArr, long[] jArr2, long j10) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29091d = z11;
        if (!z11 || jArr2[0] <= 0) {
            this.f29088a = jArr;
            this.f29089b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f29088a = jArr3;
            long[] jArr4 = new long[i10];
            this.f29089b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f29090c = j10;
    }

    public J.a c(long j10) {
        if (!this.f29091d) {
            return new J.a(K.f29111c);
        }
        int g10 = L.g(this.f29089b, j10, true, true);
        K k10 = new K(this.f29089b[g10], this.f29088a[g10]);
        if (k10.f29112a == j10 || g10 == this.f29089b.length - 1) {
            return new J.a(k10);
        }
        int i10 = g10 + 1;
        return new J.a(k10, new K(this.f29089b[i10], this.f29088a[i10]));
    }

    public boolean e() {
        return this.f29091d;
    }

    public long g() {
        return this.f29090c;
    }
}
