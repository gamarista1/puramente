package com.google.common.primitives;

import com.google.android.gms.common.api.a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import nb.o;

public abstract class f extends g {

    private static class a extends AbstractList implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        final int[] f56795a;

        /* renamed from: b  reason: collision with root package name */
        final int f56796b;

        /* renamed from: c  reason: collision with root package name */
        final int f56797c;

        a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        /* renamed from: a */
        public Integer get(int i10) {
            o.h(i10, size());
            return Integer.valueOf(this.f56795a[this.f56796b + i10]);
        }

        /* renamed from: b */
        public Integer set(int i10, Integer num) {
            o.h(i10, size());
            int[] iArr = this.f56795a;
            int i11 = this.f56796b;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) o.j(num)).intValue();
            return Integer.valueOf(i12);
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Integer) || f.k(this.f56795a, ((Integer) obj).intValue(), this.f56796b, this.f56797c) == -1) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public int[] d() {
            return Arrays.copyOfRange(this.f56795a, this.f56796b, this.f56797c);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f56795a[this.f56796b + i10] != aVar.f56795a[aVar.f56796b + i10]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f56796b; i11 < this.f56797c; i11++) {
                i10 = (i10 * 31) + f.i(this.f56795a[i11]);
            }
            return i10;
        }

        public int indexOf(Object obj) {
            int a10;
            if (!(obj instanceof Integer) || (a10 = f.k(this.f56795a, ((Integer) obj).intValue(), this.f56796b, this.f56797c)) < 0) {
                return -1;
            }
            return a10 - this.f56796b;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b10;
            if (!(obj instanceof Integer) || (b10 = f.l(this.f56795a, ((Integer) obj).intValue(), this.f56796b, this.f56797c)) < 0) {
                return -1;
            }
            return b10 - this.f56796b;
        }

        public int size() {
            return this.f56797c - this.f56796b;
        }

        public List subList(int i10, int i11) {
            o.n(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f56795a;
            int i12 = this.f56796b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f56795a[this.f56796b]);
            int i10 = this.f56796b;
            while (true) {
                i10++;
                if (i10 < this.f56797c) {
                    sb2.append(", ");
                    sb2.append(this.f56795a[i10]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        a(int[] iArr, int i10, int i11) {
            this.f56795a = iArr;
            this.f56796b = i10;
            this.f56797c = i11;
        }
    }

    public static List c(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(iArr);
    }

    public static int d(long j10) {
        boolean z10;
        int i10 = (int) j10;
        if (((long) i10) == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.g(z10, "Out of range: %s", j10);
        return i10;
    }

    public static int e(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int f(int i10, int i11, int i12) {
        boolean z10;
        if (i11 <= i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.f(z10, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int g(byte[] bArr) {
        boolean z10;
        if (bArr.length >= 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.f(z10, "array too small: %s < %s", bArr.length, 4);
        return h(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int h(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & 255) << 16) | ((b12 & 255) << 8) | (b13 & 255);
    }

    public static int i(int i10) {
        return i10;
    }

    public static int j(int[] iArr, int i10) {
        return k(iArr, i10, 0, iArr.length);
    }

    /* access modifiers changed from: private */
    public static int k(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static int l(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int m(long j10) {
        if (j10 > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] n(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).d();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) o.j(array[i10])).intValue();
        }
        return iArr;
    }

    public static Integer o(String str) {
        return p(str, 10);
    }

    public static Integer p(String str, int i10) {
        Long d10 = h.d(str, i10);
        if (d10 == null || d10.longValue() != ((long) d10.intValue())) {
            return null;
        }
        return Integer.valueOf(d10.intValue());
    }
}
