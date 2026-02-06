package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.A  reason: case insensitive filesystem */
public final class C6438A extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private float[] f71578a;

    /* renamed from: b  reason: collision with root package name */
    private int f71579b;

    public C6438A(float[] fArr) {
        C6496s.h(fArr, "bufferWithData");
        this.f71578a = fArr;
        this.f71579b = fArr.length;
        b(10);
    }

    public void b(int i10) {
        float[] fArr = this.f71578a;
        if (fArr.length < i10) {
            float[] copyOf = Arrays.copyOf(fArr, m.d(i10, fArr.length * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71578a = copyOf;
        }
    }

    public int d() {
        return this.f71579b;
    }

    public final void e(float f10) {
        C6464m0.c(this, 0, 1, (Object) null);
        float[] fArr = this.f71578a;
        int d10 = d();
        this.f71579b = d10 + 1;
        fArr[d10] = f10;
    }

    /* renamed from: f */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f71578a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return copyOf;
    }
}
