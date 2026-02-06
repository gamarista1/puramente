package C9;

import java.util.NoSuchElementException;

final class k {

    /* renamed from: a  reason: collision with root package name */
    private int f30153a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f30154b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f30155c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int[] f30156d;

    /* renamed from: e  reason: collision with root package name */
    private int f30157e;

    public k() {
        int[] iArr = new int[16];
        this.f30156d = iArr;
        this.f30157e = iArr.length - 1;
    }

    private void c() {
        int[] iArr = this.f30156d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i10 = this.f30153a;
            int i11 = length2 - i10;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f30156d, 0, iArr2, i11, i10);
            this.f30153a = 0;
            this.f30154b = this.f30155c - 1;
            this.f30156d = iArr2;
            this.f30157e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void a(int i10) {
        if (this.f30155c == this.f30156d.length) {
            c();
        }
        int i11 = (this.f30154b + 1) & this.f30157e;
        this.f30154b = i11;
        this.f30156d[i11] = i10;
        this.f30155c++;
    }

    public void b() {
        this.f30153a = 0;
        this.f30154b = -1;
        this.f30155c = 0;
    }

    public boolean d() {
        if (this.f30155c == 0) {
            return true;
        }
        return false;
    }

    public int e() {
        int i10 = this.f30155c;
        if (i10 != 0) {
            int[] iArr = this.f30156d;
            int i11 = this.f30153a;
            int i12 = iArr[i11];
            this.f30153a = (i11 + 1) & this.f30157e;
            this.f30155c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
