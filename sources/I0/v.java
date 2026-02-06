package i0;

import Y.C1474c;
import Y.H1;
import mf.C6559l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private int f21808a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f21809b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    private H1[] f21810c = new H1[16];

    private final int b(Object obj, int i10) {
        Object obj2;
        int i11 = this.f21808a - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = this.f21809b[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 > i10) {
                i11 = i13 - 1;
            } else {
                H1 h12 = this.f21810c[i13];
                if (h12 != null) {
                    obj2 = h12.get();
                } else {
                    obj2 = null;
                }
                if (obj == obj2) {
                    return i13;
                }
                return c(i13, obj, i10);
            }
        }
        return -(i12 + 1);
    }

    private final int c(int i10, Object obj, int i11) {
        Object obj2;
        int i12 = i10 - 1;
        while (true) {
            Object obj3 = null;
            if (-1 >= i12 || this.f21809b[i12] != i11) {
                int i13 = i10 + 1;
                int i14 = this.f21808a;
            } else {
                H1 h12 = this.f21810c[i12];
                if (h12 != null) {
                    obj3 = h12.get();
                }
                if (obj3 == obj) {
                    return i12;
                }
                i12--;
            }
        }
        int i132 = i10 + 1;
        int i142 = this.f21808a;
        while (true) {
            if (i132 >= i142) {
                i132 = this.f21808a;
                break;
            } else if (this.f21809b[i132] != i11) {
                break;
            } else {
                H1 h13 = this.f21810c[i132];
                if (h13 != null) {
                    obj2 = h13.get();
                } else {
                    obj2 = null;
                }
                if (obj2 == obj) {
                    return i132;
                }
                i132++;
            }
        }
        return -(i132 + 1);
    }

    public final boolean a(Object obj) {
        int i10;
        int i11 = this.f21808a;
        int c10 = C1474c.c(obj);
        if (i11 > 0) {
            i10 = b(obj, c10);
            if (i10 >= 0) {
                return false;
            }
        } else {
            i10 = -1;
        }
        int i12 = -(i10 + 1);
        H1[] h1Arr = this.f21810c;
        int length = h1Arr.length;
        if (i11 == length) {
            int i13 = length * 2;
            H1[] h1Arr2 = new H1[i13];
            int[] iArr = new int[i13];
            int i14 = i12 + 1;
            C6559l.m(h1Arr, h1Arr2, i14, i12, i11);
            int i15 = i12;
            C6559l.q(this.f21810c, h1Arr2, 0, 0, i15, 6, (Object) null);
            C6559l.k(this.f21809b, iArr, i14, i12, i11);
            C6559l.p(this.f21809b, iArr, 0, 0, i15, 6, (Object) null);
            this.f21810c = h1Arr2;
            this.f21809b = iArr;
        } else {
            int i16 = i12 + 1;
            C6559l.m(h1Arr, h1Arr, i16, i12, i11);
            int[] iArr2 = this.f21809b;
            C6559l.k(iArr2, iArr2, i16, i12, i11);
        }
        this.f21810c[i12] = new H1(obj);
        this.f21809b[i12] = c10;
        this.f21808a++;
        return true;
    }

    public final int[] d() {
        return this.f21809b;
    }

    public final int e() {
        return this.f21808a;
    }

    public final H1[] f() {
        return this.f21810c;
    }

    public final void g(int i10) {
        this.f21808a = i10;
    }
}
