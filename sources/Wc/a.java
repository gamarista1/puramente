package Wc;

import java.util.Arrays;

public final class a implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private int[] f53460a;

    /* renamed from: b  reason: collision with root package name */
    private int f53461b;

    public a() {
        this.f53461b = 0;
        this.f53460a = new int[1];
    }

    private void g(int i10) {
        if (i10 > (this.f53460a.length << 5)) {
            int[] k10 = k(i10);
            int[] iArr = this.f53460a;
            System.arraycopy(iArr, 0, k10, 0, iArr.length);
            this.f53460a = k10;
        }
    }

    private static int[] k(int i10) {
        return new int[((i10 + 31) / 32)];
    }

    public void a(boolean z10) {
        g(this.f53461b + 1);
        if (z10) {
            int[] iArr = this.f53460a;
            int i10 = this.f53461b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f53461b++;
    }

    public void c(a aVar) {
        int i10 = aVar.f53461b;
        g(this.f53461b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.h(i11));
        }
    }

    public void d(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        g(this.f53461b + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    /* renamed from: e */
    public a clone() {
        return new a((int[]) this.f53460a.clone(), this.f53461b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f53461b != aVar.f53461b || !Arrays.equals(this.f53460a, aVar.f53460a)) {
            return false;
        }
        return true;
    }

    public boolean h(int i10) {
        if (((1 << (i10 & 31)) & this.f53460a[i10 / 32]) != 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f53461b * 31) + Arrays.hashCode(this.f53460a);
    }

    public int i() {
        return this.f53461b;
    }

    public int j() {
        return (this.f53461b + 7) / 8;
    }

    public void l(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (h(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void m(a aVar) {
        if (this.f53461b == aVar.f53461b) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f53460a;
                if (i10 < iArr.length) {
                    iArr[i10] = iArr[i10] ^ aVar.f53460a[i10];
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public String toString() {
        char c10;
        int i10 = this.f53461b;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f53461b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            if (h(i11)) {
                c10 = 'X';
            } else {
                c10 = '.';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    a(int[] iArr, int i10) {
        this.f53460a = iArr;
        this.f53461b = i10;
    }
}
