package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6512K;

public final class L0 extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private short[] f71613a;

    /* renamed from: b  reason: collision with root package name */
    private int f71614b;

    public /* synthetic */ L0(short[] sArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(sArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return C6512K.a(f());
    }

    public void b(int i10) {
        if (C6512K.z(this.f71613a) < i10) {
            short[] sArr = this.f71613a;
            short[] copyOf = Arrays.copyOf(sArr, m.d(i10, C6512K.z(sArr) * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71613a = C6512K.g(copyOf);
        }
    }

    public int d() {
        return this.f71614b;
    }

    public final void e(short s10) {
        C6464m0.c(this, 0, 1, (Object) null);
        short[] sArr = this.f71613a;
        int d10 = d();
        this.f71614b = d10 + 1;
        C6512K.E(sArr, d10, s10);
    }

    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.f71613a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return C6512K.g(copyOf);
    }

    private L0(short[] sArr) {
        C6496s.h(sArr, "bufferWithData");
        this.f71613a = sArr;
        this.f71614b = C6512K.z(sArr);
        b(10);
    }
}
