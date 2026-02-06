package ja;

import java.util.Arrays;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private int f45057a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f45058b;

    public t() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f45057a;
        long[] jArr = this.f45058b;
        if (i10 == jArr.length) {
            this.f45058b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f45058b;
        int i11 = this.f45057a;
        this.f45057a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 >= 0 && i10 < this.f45057a) {
            return this.f45058b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f45057a);
    }

    public int c() {
        return this.f45057a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f45058b, this.f45057a);
    }

    public t(int i10) {
        this.f45058b = new long[i10];
    }
}
