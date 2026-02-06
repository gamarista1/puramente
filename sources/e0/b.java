package E0;

import D0.z;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f1716a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f1717b = new long[2];

    public final boolean a(long j10) {
        if (d(j10)) {
            return false;
        }
        k(this.f1716a, j10);
        return true;
    }

    public final boolean b(long j10) {
        return a(j10);
    }

    public final void c() {
        this.f1716a = 0;
    }

    public final boolean d(long j10) {
        int i10 = this.f1716a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f1717b[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    public final long e(int i10) {
        return z.b(this.f1717b[i10]);
    }

    public final int f() {
        return this.f1716a;
    }

    public final boolean g() {
        if (this.f1716a == 0) {
            return true;
        }
        return false;
    }

    public final boolean h(long j10) {
        int i10 = this.f1716a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (j10 == e(i11)) {
                j(i11);
                return true;
            }
        }
        return false;
    }

    public final boolean i(long j10) {
        return h(j10);
    }

    public final boolean j(int i10) {
        int i11 = this.f1716a;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i11 - 1;
        while (i10 < i12) {
            long[] jArr = this.f1717b;
            int i13 = i10 + 1;
            jArr[i10] = jArr[i13];
            i10 = i13;
        }
        this.f1716a--;
        return true;
    }

    public final void k(int i10, long j10) {
        long[] jArr = this.f1717b;
        if (i10 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i10 + 1, jArr.length * 2));
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f1717b = copyOf;
        }
        this.f1717b[i10] = j10;
        if (i10 >= this.f1716a) {
            this.f1716a = i10 + 1;
        }
    }
}
