package i2;

import java.util.Arrays;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private int f22148a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f22149b;

    public q() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f22148a;
        long[] jArr = this.f22149b;
        if (i10 == jArr.length) {
            this.f22149b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f22149b;
        int i11 = this.f22148a;
        this.f22148a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f22148a) {
            return this.f22149b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f22148a);
    }

    public int c() {
        return this.f22148a;
    }

    public q(int i10) {
        this.f22149b = new long[i10];
    }
}
