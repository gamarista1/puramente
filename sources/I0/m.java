package i0;

import mf.C6559l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private int f21736a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f21737b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    private int[] f21738c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    private int[] f21739d;

    /* renamed from: e  reason: collision with root package name */
    private int f21740e;

    public m() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f21739d = iArr;
    }

    private final int b() {
        int length = this.f21739d.length;
        if (this.f21740e >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            C6559l.p(this.f21739d, iArr, 0, 0, 0, 14, (Object) null);
            this.f21739d = iArr;
        }
        int i13 = this.f21740e;
        this.f21740e = this.f21739d[i13];
        return i13;
    }

    private final void c(int i10) {
        int[] iArr = this.f21737b;
        int length = iArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            C6559l.p(iArr, iArr2, 0, 0, 0, 14, (Object) null);
            C6559l.p(this.f21738c, iArr3, 0, 0, 0, 14, (Object) null);
            this.f21737b = iArr2;
            this.f21738c = iArr3;
        }
    }

    private final void d(int i10) {
        this.f21739d[i10] = this.f21740e;
        this.f21740e = i10;
    }

    private final void g(int i10) {
        int i11;
        int[] iArr = this.f21737b;
        int i12 = this.f21736a >> 1;
        while (i10 < i12) {
            int i13 = (i10 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 >= this.f21736a || (i11 = iArr[i13]) >= iArr[i14]) {
                if (iArr[i14] < iArr[i10]) {
                    i(i14, i10);
                    i10 = i14;
                } else {
                    return;
                }
            } else if (i11 < iArr[i10]) {
                i(i13, i10);
                i10 = i13;
            } else {
                return;
            }
        }
    }

    private final void h(int i10) {
        int[] iArr = this.f21737b;
        int i11 = iArr[i10];
        while (i10 > 0) {
            int i12 = ((i10 + 1) >> 1) - 1;
            if (iArr[i12] > i11) {
                i(i12, i10);
                i10 = i12;
            } else {
                return;
            }
        }
    }

    private final void i(int i10, int i11) {
        int[] iArr = this.f21737b;
        int[] iArr2 = this.f21738c;
        int[] iArr3 = this.f21739d;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = iArr2[i10];
        iArr2[i10] = iArr2[i11];
        iArr2[i11] = i13;
        iArr3[iArr2[i10]] = i10;
        iArr3[iArr2[i11]] = i11;
    }

    public final int a(int i10) {
        c(this.f21736a + 1);
        int i11 = this.f21736a;
        this.f21736a = i11 + 1;
        int b10 = b();
        this.f21737b[i11] = i10;
        this.f21738c[i11] = b10;
        this.f21739d[b10] = i11;
        h(i11);
        return b10;
    }

    public final int e(int i10) {
        if (this.f21736a > 0) {
            return this.f21737b[0];
        }
        return i10;
    }

    public final void f(int i10) {
        int i11 = this.f21739d[i10];
        i(i11, this.f21736a - 1);
        this.f21736a--;
        h(i11);
        g(i11);
        d(i10);
    }
}
