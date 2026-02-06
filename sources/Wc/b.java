package Wc;

import java.util.Arrays;

public final class b implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final int f53462a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53463b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53464c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f53465d;

    public b(int i10) {
        this(i10, i10);
    }

    private String a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb2 = new StringBuilder(this.f53463b * (this.f53462a + 1));
        for (int i10 = 0; i10 < this.f53463b; i10++) {
            for (int i11 = 0; i11 < this.f53462a; i11++) {
                if (e(i11, i10)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                sb2.append(str4);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public void c() {
        int length = this.f53465d.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f53465d[i10] = 0;
        }
    }

    /* renamed from: d */
    public b clone() {
        return new b(this.f53462a, this.f53463b, this.f53464c, (int[]) this.f53465d.clone());
    }

    public boolean e(int i10, int i11) {
        if (((this.f53465d[(i11 * this.f53464c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f53462a == bVar.f53462a && this.f53463b == bVar.f53463b && this.f53464c == bVar.f53464c && Arrays.equals(this.f53465d, bVar.f53465d)) {
            return true;
        }
        return false;
    }

    public int g() {
        return this.f53463b;
    }

    public int h() {
        return this.f53462a;
    }

    public int hashCode() {
        int i10 = this.f53462a;
        return (((((((i10 * 31) + i10) * 31) + this.f53463b) * 31) + this.f53464c) * 31) + Arrays.hashCode(this.f53465d);
    }

    public void i(int i10, int i11) {
        int i12 = (i11 * this.f53464c) + (i10 / 32);
        int[] iArr = this.f53465d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void j(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i14 = i12 + i10;
            int i15 = i13 + i11;
            if (i15 > this.f53463b || i14 > this.f53462a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i11 < i15) {
                int i16 = this.f53464c * i11;
                for (int i17 = i10; i17 < i14; i17++) {
                    int[] iArr = this.f53465d;
                    int i18 = (i17 / 32) + i16;
                    iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                }
                i11++;
            }
        }
    }

    public String k(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return k("X ", "  ");
    }

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f53462a = i10;
        this.f53463b = i11;
        int i12 = (i10 + 31) / 32;
        this.f53464c = i12;
        this.f53465d = new int[(i12 * i11)];
    }

    private b(int i10, int i11, int i12, int[] iArr) {
        this.f53462a = i10;
        this.f53463b = i11;
        this.f53464c = i12;
        this.f53465d = iArr;
    }
}
