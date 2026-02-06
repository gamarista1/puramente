package ja;

import java.util.Arrays;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    private long[] f44972a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f44973b;

    /* renamed from: c  reason: collision with root package name */
    private int f44974c;

    /* renamed from: d  reason: collision with root package name */
    private int f44975d;

    public H() {
        this(10);
    }

    private void b(long j10, Object obj) {
        int i10 = this.f44974c;
        int i11 = this.f44975d;
        Object[] objArr = this.f44973b;
        int length = (i10 + i11) % objArr.length;
        this.f44972a[length] = j10;
        objArr[length] = obj;
        this.f44975d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f44975d;
        if (i10 > 0) {
            if (j10 <= this.f44972a[((this.f44974c + i10) - 1) % this.f44973b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f44973b.length;
        if (this.f44975d >= length) {
            int i10 = length * 2;
            long[] jArr = new long[i10];
            Object[] f10 = f(i10);
            int i11 = this.f44974c;
            int i12 = length - i11;
            System.arraycopy(this.f44972a, i11, jArr, 0, i12);
            System.arraycopy(this.f44973b, this.f44974c, f10, 0, i12);
            int i13 = this.f44974c;
            if (i13 > 0) {
                System.arraycopy(this.f44972a, 0, jArr, i12, i13);
                System.arraycopy(this.f44973b, 0, f10, i12, this.f44974c);
            }
            this.f44972a = jArr;
            this.f44973b = f10;
            this.f44974c = 0;
        }
    }

    private static Object[] f(int i10) {
        return new Object[i10];
    }

    private Object h(long j10, boolean z10) {
        Object obj = null;
        long j11 = Long.MAX_VALUE;
        while (this.f44975d > 0) {
            long j12 = j10 - this.f44972a[this.f44974c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            obj = k();
            j11 = j12;
        }
        return obj;
    }

    private Object k() {
        boolean z10;
        if (this.f44975d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        Object[] objArr = this.f44973b;
        int i10 = this.f44974c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f44974c = (i10 + 1) % objArr.length;
        this.f44975d--;
        return obj;
    }

    public synchronized void a(long j10, Object obj) {
        d(j10);
        e();
        b(j10, obj);
    }

    public synchronized void c() {
        this.f44974c = 0;
        this.f44975d = 0;
        Arrays.fill(this.f44973b, (Object) null);
    }

    public synchronized Object g(long j10) {
        return h(j10, false);
    }

    public synchronized Object i() {
        Object obj;
        if (this.f44975d == 0) {
            obj = null;
        } else {
            obj = k();
        }
        return obj;
    }

    public synchronized Object j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f44975d;
    }

    public H(int i10) {
        this.f44972a = new long[i10];
        this.f44973b = f(i10);
    }
}
