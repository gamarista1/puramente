package z2;

import i2.C2076a;

public final class Q {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f29134a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29135b;

    /* renamed from: c  reason: collision with root package name */
    private int f29136c;

    /* renamed from: d  reason: collision with root package name */
    private int f29137d;

    public Q(byte[] bArr) {
        this.f29134a = bArr;
        this.f29135b = bArr.length;
    }

    private void a() {
        boolean z10;
        int i10;
        int i11 = this.f29136c;
        if (i11 < 0 || (i11 >= (i10 = this.f29135b) && !(i11 == i10 && this.f29137d == 0))) {
            z10 = false;
        } else {
            z10 = true;
        }
        C2076a.g(z10);
    }

    public int b() {
        return (this.f29136c * 8) + this.f29137d;
    }

    public boolean c() {
        boolean z10;
        if ((((this.f29134a[this.f29136c] & 255) >> this.f29137d) & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f29136c;
        int min = Math.min(i10, 8 - this.f29137d);
        int i12 = i11 + 1;
        int i13 = ((this.f29134a[i11] & 255) >> this.f29137d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.f29134a[i12] & 255) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & (-1 >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f29136c + i11;
        this.f29136c = i12;
        int i13 = this.f29137d + (i10 - (i11 * 8));
        this.f29137d = i13;
        if (i13 > 7) {
            this.f29136c = i12 + 1;
            this.f29137d = i13 - 8;
        }
        a();
    }
}
