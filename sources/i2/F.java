package i2;

import java.util.Arrays;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    private long[] f22063a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f22064b;

    /* renamed from: c  reason: collision with root package name */
    private int f22065c;

    /* renamed from: d  reason: collision with root package name */
    private int f22066d;

    public F() {
        this(10);
    }

    private void b(long j10, Object obj) {
        int i10 = this.f22065c;
        int i11 = this.f22066d;
        Object[] objArr = this.f22064b;
        int length = (i10 + i11) % objArr.length;
        this.f22063a[length] = j10;
        objArr[length] = obj;
        this.f22066d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f22066d;
        if (i10 > 0) {
            if (j10 <= this.f22063a[((this.f22065c + i10) - 1) % this.f22064b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f22064b.length;
        if (this.f22066d >= length) {
            int i10 = length * 2;
            long[] jArr = new long[i10];
            Object[] f10 = f(i10);
            int i11 = this.f22065c;
            int i12 = length - i11;
            System.arraycopy(this.f22063a, i11, jArr, 0, i12);
            System.arraycopy(this.f22064b, this.f22065c, f10, 0, i12);
            int i13 = this.f22065c;
            if (i13 > 0) {
                System.arraycopy(this.f22063a, 0, jArr, i12, i13);
                System.arraycopy(this.f22064b, 0, f10, i12, this.f22065c);
            }
            this.f22063a = jArr;
            this.f22064b = f10;
            this.f22065c = 0;
        }
    }

    private static Object[] f(int i10) {
        return new Object[i10];
    }

    private Object h(long j10, boolean z10) {
        Object obj = null;
        long j11 = Long.MAX_VALUE;
        while (this.f22066d > 0) {
            long j12 = j10 - this.f22063a[this.f22065c];
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
        if (this.f22066d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        Object[] objArr = this.f22064b;
        int i10 = this.f22065c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f22065c = (i10 + 1) % objArr.length;
        this.f22066d--;
        return obj;
    }

    public synchronized void a(long j10, Object obj) {
        d(j10);
        e();
        b(j10, obj);
    }

    public synchronized void c() {
        this.f22065c = 0;
        this.f22066d = 0;
        Arrays.fill(this.f22064b, (Object) null);
    }

    public synchronized Object g(long j10) {
        return h(j10, false);
    }

    public synchronized Object i() {
        Object obj;
        if (this.f22066d == 0) {
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
        return this.f22066d;
    }

    public F(int i10) {
        this.f22063a = new long[i10];
        this.f22064b = f(i10);
    }
}
