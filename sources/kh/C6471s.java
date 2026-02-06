package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.s  reason: case insensitive filesystem */
public final class C6471s extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private double[] f71700a;

    /* renamed from: b  reason: collision with root package name */
    private int f71701b;

    public C6471s(double[] dArr) {
        C6496s.h(dArr, "bufferWithData");
        this.f71700a = dArr;
        this.f71701b = dArr.length;
        b(10);
    }

    public void b(int i10) {
        double[] dArr = this.f71700a;
        if (dArr.length < i10) {
            double[] copyOf = Arrays.copyOf(dArr, m.d(i10, dArr.length * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71700a = copyOf;
        }
    }

    public int d() {
        return this.f71701b;
    }

    public final void e(double d10) {
        C6464m0.c(this, 0, 1, (Object) null);
        double[] dArr = this.f71700a;
        int d11 = d();
        this.f71701b = d11 + 1;
        dArr[d11] = d10;
    }

    /* renamed from: f */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.f71700a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return copyOf;
    }
}
