package q9;

import ja.C3645a;

/* renamed from: q9.D  reason: case insensitive filesystem */
public final class C3964D {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f47802a;

    /* renamed from: b  reason: collision with root package name */
    private final int f47803b;

    /* renamed from: c  reason: collision with root package name */
    private int f47804c;

    /* renamed from: d  reason: collision with root package name */
    private int f47805d;

    public C3964D(byte[] bArr) {
        this.f47802a = bArr;
        this.f47803b = bArr.length;
    }

    private void a() {
        boolean z10;
        int i10;
        int i11 = this.f47804c;
        if (i11 < 0 || (i11 >= (i10 = this.f47803b) && !(i11 == i10 && this.f47805d == 0))) {
            z10 = false;
        } else {
            z10 = true;
        }
        C3645a.f(z10);
    }

    public int b() {
        return (this.f47804c * 8) + this.f47805d;
    }

    public boolean c() {
        boolean z10;
        if ((((this.f47802a[this.f47804c] & 255) >> this.f47805d) & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f47804c;
        int min = Math.min(i10, 8 - this.f47805d);
        int i12 = i11 + 1;
        int i13 = ((this.f47802a[i11] & 255) >> this.f47805d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f47802a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & (-1 >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f47804c + i11;
        this.f47804c = i12;
        int i13 = this.f47805d + (i10 - (i11 * 8));
        this.f47805d = i13;
        if (i13 > 7) {
            this.f47804c = i12 + 1;
            this.f47805d = i13 - 8;
        }
        a();
    }
}
