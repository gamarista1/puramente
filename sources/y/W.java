package Y;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

public final class W {

    /* renamed from: a  reason: collision with root package name */
    private int[] f9909a = new int[10];

    /* renamed from: b  reason: collision with root package name */
    private int f9910b;

    public final void a() {
        this.f9910b = 0;
    }

    public final int b() {
        return this.f9910b;
    }

    public final int c(int i10) {
        int i11 = this.f9910b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f9909a[i12] == i10) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean d() {
        if (this.f9910b == 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return this.f9909a[this.f9910b - 1];
    }

    public final int f(int i10) {
        return this.f9909a[i10];
    }

    public final int g() {
        return this.f9909a[this.f9910b - 2];
    }

    public final int h(int i10) {
        if (this.f9910b > 0) {
            return e();
        }
        return i10;
    }

    public final int i() {
        int[] iArr = this.f9909a;
        int i10 = this.f9910b - 1;
        this.f9910b = i10;
        return iArr[i10];
    }

    public final void j(int i10) {
        int i11 = this.f9910b;
        int[] iArr = this.f9909a;
        if (i11 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f9909a = copyOf;
        }
        int[] iArr2 = this.f9909a;
        int i12 = this.f9910b;
        this.f9910b = i12 + 1;
        iArr2[i12] = i10;
    }
}
