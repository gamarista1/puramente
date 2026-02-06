package J0;

import G0.a;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

/* renamed from: J0.x  reason: case insensitive filesystem */
final class C1257x {

    /* renamed from: a  reason: collision with root package name */
    private int[] f3941a;

    /* renamed from: b  reason: collision with root package name */
    private int f3942b;

    public C1257x(int i10) {
        this.f3941a = new int[i10];
    }

    private final boolean a(int i10, int i11) {
        int[] iArr = this.f3941a;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        if (i12 < i13) {
            return true;
        }
        if (i12 != i13 || iArr[i10 + 1] > iArr[i11 + 1]) {
            return false;
        }
        return true;
    }

    private final int e(int i10, int i11, int i12) {
        int i13 = i10 - i12;
        while (i10 < i11) {
            if (a(i10, i11)) {
                i13 += i12;
                k(i13, i10);
            }
            i10 += i12;
        }
        int i14 = i13 + i12;
        k(i14, i11);
        return i14;
    }

    private final void i(int i10, int i11, int i12) {
        if (i10 < i11) {
            int e10 = e(i10, i11, i12);
            i(i10, e10 - i12, i12);
            i(e10 + i12, i11, i12);
        }
    }

    private final void k(int i10, int i11) {
        int[] iArr = this.f3941a;
        Y.i(iArr, i10, i11);
        Y.i(iArr, i10 + 1, i11 + 1);
        Y.i(iArr, i10 + 2, i11 + 2);
    }

    public final int b(int i10) {
        return this.f3941a[i10];
    }

    public final int c() {
        return this.f3942b;
    }

    public final boolean d() {
        if (this.f3942b != 0) {
            return true;
        }
        return false;
    }

    public final int f() {
        int[] iArr = this.f3941a;
        int i10 = this.f3942b - 1;
        this.f3942b = i10;
        return iArr[i10];
    }

    public final void g(int i10, int i11, int i12) {
        int i13 = this.f3942b;
        int i14 = i13 + 3;
        int[] iArr = this.f3941a;
        if (i14 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f3941a = copyOf;
        }
        int[] iArr2 = this.f3941a;
        iArr2[i13] = i10 + i12;
        iArr2[i13 + 1] = i11 + i12;
        iArr2[i13 + 2] = i12;
        this.f3942b = i14;
    }

    public final void h(int i10, int i11, int i12, int i13) {
        int i14 = this.f3942b;
        int i15 = i14 + 4;
        int[] iArr = this.f3941a;
        if (i15 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f3941a = copyOf;
        }
        int[] iArr2 = this.f3941a;
        iArr2[i14] = i10;
        iArr2[i14 + 1] = i11;
        iArr2[i14 + 2] = i12;
        iArr2[i14 + 3] = i13;
        this.f3942b = i15;
    }

    public final void j() {
        boolean z10;
        int i10 = this.f3942b;
        if (i10 % 3 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a.b("Array size not a multiple of 3");
        }
        if (i10 > 3) {
            i(0, i10 - 3, 3);
        }
    }
}
