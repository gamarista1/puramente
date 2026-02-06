package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6505D;

public final class C0 extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f71589a;

    /* renamed from: b  reason: collision with root package name */
    private int f71590b;

    public /* synthetic */ C0(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return C6505D.a(f());
    }

    public void b(int i10) {
        if (C6505D.z(this.f71589a) < i10) {
            byte[] bArr = this.f71589a;
            byte[] copyOf = Arrays.copyOf(bArr, m.d(i10, C6505D.z(bArr) * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71589a = C6505D.g(copyOf);
        }
    }

    public int d() {
        return this.f71590b;
    }

    public final void e(byte b10) {
        C6464m0.c(this, 0, 1, (Object) null);
        byte[] bArr = this.f71589a;
        int d10 = d();
        this.f71590b = d10 + 1;
        C6505D.E(bArr, d10, b10);
    }

    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.f71589a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return C6505D.g(copyOf);
    }

    private C0(byte[] bArr) {
        C6496s.h(bArr, "bufferWithData");
        this.f71589a = bArr;
        this.f71590b = C6505D.z(bArr);
        b(10);
    }
}
