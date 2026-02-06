package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.g  reason: case insensitive filesystem */
public final class C6451g extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean[] f71659a;

    /* renamed from: b  reason: collision with root package name */
    private int f71660b;

    public C6451g(boolean[] zArr) {
        C6496s.h(zArr, "bufferWithData");
        this.f71659a = zArr;
        this.f71660b = zArr.length;
        b(10);
    }

    public void b(int i10) {
        boolean[] zArr = this.f71659a;
        if (zArr.length < i10) {
            boolean[] copyOf = Arrays.copyOf(zArr, m.d(i10, zArr.length * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71659a = copyOf;
        }
    }

    public int d() {
        return this.f71660b;
    }

    public final void e(boolean z10) {
        C6464m0.c(this, 0, 1, (Object) null);
        boolean[] zArr = this.f71659a;
        int d10 = d();
        this.f71660b = d10 + 1;
        zArr[d10] = z10;
    }

    /* renamed from: f */
    public boolean[] a() {
        boolean[] copyOf = Arrays.copyOf(this.f71659a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return copyOf;
    }
}
