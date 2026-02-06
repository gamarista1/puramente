package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.j  reason: case insensitive filesystem */
public final class C6457j extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f71665a;

    /* renamed from: b  reason: collision with root package name */
    private int f71666b;

    public C6457j(byte[] bArr) {
        C6496s.h(bArr, "bufferWithData");
        this.f71665a = bArr;
        this.f71666b = bArr.length;
        b(10);
    }

    public void b(int i10) {
        byte[] bArr = this.f71665a;
        if (bArr.length < i10) {
            byte[] copyOf = Arrays.copyOf(bArr, m.d(i10, bArr.length * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71665a = copyOf;
        }
    }

    public int d() {
        return this.f71666b;
    }

    public final void e(byte b10) {
        C6464m0.c(this, 0, 1, (Object) null);
        byte[] bArr = this.f71665a;
        int d10 = d();
        this.f71666b = d10 + 1;
        bArr[d10] = b10;
    }

    /* renamed from: f */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f71665a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return copyOf;
    }
}
