package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6507F;

public final class F0 extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private int[] f71596a;

    /* renamed from: b  reason: collision with root package name */
    private int f71597b;

    public /* synthetic */ F0(int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return C6507F.a(f());
    }

    public void b(int i10) {
        if (C6507F.z(this.f71596a) < i10) {
            int[] iArr = this.f71596a;
            int[] copyOf = Arrays.copyOf(iArr, m.d(i10, C6507F.z(iArr) * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71596a = C6507F.g(copyOf);
        }
    }

    public int d() {
        return this.f71597b;
    }

    public final void e(int i10) {
        C6464m0.c(this, 0, 1, (Object) null);
        int[] iArr = this.f71596a;
        int d10 = d();
        this.f71597b = d10 + 1;
        C6507F.E(iArr, d10, i10);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.f71596a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return C6507F.g(copyOf);
    }

    private F0(int[] iArr) {
        C6496s.h(iArr, "bufferWithData");
        this.f71596a = iArr;
        this.f71597b = C6507F.z(iArr);
        b(10);
    }
}
