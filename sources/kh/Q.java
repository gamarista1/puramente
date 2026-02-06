package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

public final class Q extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private long[] f71624a;

    /* renamed from: b  reason: collision with root package name */
    private int f71625b;

    public Q(long[] jArr) {
        C6496s.h(jArr, "bufferWithData");
        this.f71624a = jArr;
        this.f71625b = jArr.length;
        b(10);
    }

    public void b(int i10) {
        long[] jArr = this.f71624a;
        if (jArr.length < i10) {
            long[] copyOf = Arrays.copyOf(jArr, m.d(i10, jArr.length * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71624a = copyOf;
        }
    }

    public int d() {
        return this.f71625b;
    }

    public final void e(long j10) {
        C6464m0.c(this, 0, 1, (Object) null);
        long[] jArr = this.f71624a;
        int d10 = d();
        this.f71625b = d10 + 1;
        jArr[d10] = j10;
    }

    /* renamed from: f */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.f71624a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return copyOf;
    }
}
