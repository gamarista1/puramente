package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6509H;

public final class I0 extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private long[] f71606a;

    /* renamed from: b  reason: collision with root package name */
    private int f71607b;

    public /* synthetic */ I0(long[] jArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return C6509H.a(f());
    }

    public void b(int i10) {
        if (C6509H.z(this.f71606a) < i10) {
            long[] jArr = this.f71606a;
            long[] copyOf = Arrays.copyOf(jArr, m.d(i10, C6509H.z(jArr) * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71606a = C6509H.g(copyOf);
        }
    }

    public int d() {
        return this.f71607b;
    }

    public final void e(long j10) {
        C6464m0.c(this, 0, 1, (Object) null);
        long[] jArr = this.f71606a;
        int d10 = d();
        this.f71607b = d10 + 1;
        C6509H.E(jArr, d10, j10);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.f71606a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return C6509H.g(copyOf);
    }

    private I0(long[] jArr) {
        C6496s.h(jArr, "bufferWithData");
        this.f71606a = jArr;
        this.f71607b = C6509H.z(jArr);
        b(10);
    }
}
