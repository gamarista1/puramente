package y9;

import ja.C3645a;
import ja.M;

final class r {

    /* renamed from: a  reason: collision with root package name */
    public final o f50058a;

    /* renamed from: b  reason: collision with root package name */
    public final int f50059b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f50060c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f50061d;

    /* renamed from: e  reason: collision with root package name */
    public final int f50062e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f50063f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f50064g;

    /* renamed from: h  reason: collision with root package name */
    public final long f50065h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3645a.a(z11);
        C3645a.a(iArr2.length == jArr2.length ? true : z12);
        this.f50058a = oVar;
        this.f50060c = jArr;
        this.f50061d = iArr;
        this.f50062e = i10;
        this.f50063f = jArr2;
        this.f50064g = iArr2;
        this.f50065h = j10;
        this.f50059b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int i10 = M.i(this.f50063f, j10, true, false); i10 >= 0; i10--) {
            if ((this.f50064g[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int e10 = M.e(this.f50063f, j10, true, false); e10 < this.f50063f.length; e10++) {
            if ((this.f50064g[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }
}
