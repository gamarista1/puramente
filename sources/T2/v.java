package T2;

import i2.C2076a;
import i2.L;

final class v {

    /* renamed from: a  reason: collision with root package name */
    public final s f6161a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6162b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f6163c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f6164d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6165e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f6166f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f6167g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6168h;

    public v(s sVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        C2076a.a(z11);
        C2076a.a(iArr2.length == jArr2.length ? true : z12);
        this.f6161a = sVar;
        this.f6163c = jArr;
        this.f6164d = iArr;
        this.f6165e = i10;
        this.f6166f = jArr2;
        this.f6167g = iArr2;
        this.f6168h = j10;
        this.f6162b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int g10 = L.g(this.f6166f, j10, true, false); g10 >= 0; g10--) {
            if ((this.f6167g[g10] & 1) != 0) {
                return g10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int d10 = L.d(this.f6166f, j10, true, false); d10 < this.f6166f.length; d10++) {
            if ((this.f6167g[d10] & 1) != 0) {
                return d10;
            }
        }
        return -1;
    }
}
