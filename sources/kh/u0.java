package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

public final class u0 extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private short[] f71708a;

    /* renamed from: b  reason: collision with root package name */
    private int f71709b;

    public u0(short[] sArr) {
        C6496s.h(sArr, "bufferWithData");
        this.f71708a = sArr;
        this.f71709b = sArr.length;
        b(10);
    }

    public void b(int i10) {
        short[] sArr = this.f71708a;
        if (sArr.length < i10) {
            short[] copyOf = Arrays.copyOf(sArr, m.d(i10, sArr.length * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71708a = copyOf;
        }
    }

    public int d() {
        return this.f71709b;
    }

    public final void e(short s10) {
        C6464m0.c(this, 0, 1, (Object) null);
        short[] sArr = this.f71708a;
        int d10 = d();
        this.f71709b = d10 + 1;
        sArr[d10] = s10;
    }

    /* renamed from: f */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.f71708a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return copyOf;
    }
}
