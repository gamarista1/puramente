package i2;

import java.util.NoSuchElementException;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private int f22150a;

    /* renamed from: b  reason: collision with root package name */
    private int f22151b;

    /* renamed from: c  reason: collision with root package name */
    private int f22152c;

    /* renamed from: d  reason: collision with root package name */
    private long[] f22153d;

    /* renamed from: e  reason: collision with root package name */
    private int f22154e;

    public r() {
        this(16);
    }

    public void a() {
        this.f22150a = 0;
        this.f22151b = -1;
        this.f22152c = 0;
    }

    public long b() {
        if (this.f22152c != 0) {
            return this.f22153d[this.f22150a];
        }
        throw new NoSuchElementException();
    }

    public boolean c() {
        if (this.f22152c == 0) {
            return true;
        }
        return false;
    }

    public long d() {
        int i10 = this.f22152c;
        if (i10 != 0) {
            long[] jArr = this.f22153d;
            int i11 = this.f22150a;
            long j10 = jArr[i11];
            this.f22150a = this.f22154e & (i11 + 1);
            this.f22152c = i10 - 1;
            return j10;
        }
        throw new NoSuchElementException();
    }

    public r(int i10) {
        C2076a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f22150a = 0;
        this.f22151b = -1;
        this.f22152c = 0;
        long[] jArr = new long[i10];
        this.f22153d = jArr;
        this.f22154e = jArr.length - 1;
    }
}
