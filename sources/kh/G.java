package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

public final class G extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private int[] f71598a;

    /* renamed from: b  reason: collision with root package name */
    private int f71599b;

    public G(int[] iArr) {
        C6496s.h(iArr, "bufferWithData");
        this.f71598a = iArr;
        this.f71599b = iArr.length;
        b(10);
    }

    public void b(int i10) {
        int[] iArr = this.f71598a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, m.d(i10, iArr.length * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71598a = copyOf;
        }
    }

    public int d() {
        return this.f71599b;
    }

    public final void e(int i10) {
        C6464m0.c(this, 0, 1, (Object) null);
        int[] iArr = this.f71598a;
        int d10 = d();
        this.f71599b = d10 + 1;
        iArr[d10] = i10;
    }

    /* renamed from: f */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.f71598a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return copyOf;
    }
}
