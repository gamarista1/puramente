package kh;

import Ef.m;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.n  reason: case insensitive filesystem */
public final class C6465n extends C6464m0 {

    /* renamed from: a  reason: collision with root package name */
    private char[] f71687a;

    /* renamed from: b  reason: collision with root package name */
    private int f71688b;

    public C6465n(char[] cArr) {
        C6496s.h(cArr, "bufferWithData");
        this.f71687a = cArr;
        this.f71688b = cArr.length;
        b(10);
    }

    public void b(int i10) {
        char[] cArr = this.f71687a;
        if (cArr.length < i10) {
            char[] copyOf = Arrays.copyOf(cArr, m.d(i10, cArr.length * 2));
            C6496s.g(copyOf, "copyOf(...)");
            this.f71687a = copyOf;
        }
    }

    public int d() {
        return this.f71688b;
    }

    public final void e(char c10) {
        C6464m0.c(this, 0, 1, (Object) null);
        char[] cArr = this.f71687a;
        int d10 = d();
        this.f71688b = d10 + 1;
        cArr[d10] = c10;
    }

    /* renamed from: f */
    public char[] a() {
        char[] copyOf = Arrays.copyOf(this.f71687a, d());
        C6496s.g(copyOf, "copyOf(...)");
        return copyOf;
    }
}
