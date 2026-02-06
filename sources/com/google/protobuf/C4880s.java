package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.C4881t;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.s  reason: case insensitive filesystem */
final class C4880s extends C4865c implements C4881t.d, RandomAccess, U {

    /* renamed from: d  reason: collision with root package name */
    private static final C4880s f58658d;

    /* renamed from: b  reason: collision with root package name */
    private int[] f58659b;

    /* renamed from: c  reason: collision with root package name */
    private int f58660c;

    static {
        C4880s sVar = new C4880s(new int[0], 0);
        f58658d = sVar;
        sVar.l();
    }

    private C4880s(int[] iArr, int i10) {
        this.f58659b = iArr;
        this.f58660c = i10;
    }

    private void g(int i10, int i11) {
        int i12;
        a();
        if (i10 < 0 || i10 > (i12 = this.f58660c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        int[] iArr = this.f58659b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[(((i12 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f58659b, i10, iArr2, i10 + 1, this.f58660c - i10);
            this.f58659b = iArr2;
        }
        this.f58659b[i10] = i11;
        this.f58660c++;
        this.modCount++;
    }

    public static C4880s h() {
        return f58658d;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f58660c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        return "Index:" + i10 + ", Size:" + this.f58660c;
    }

    public void T(int i10) {
        a();
        int i11 = this.f58660c;
        int[] iArr = this.f58659b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f58659b = iArr2;
        }
        int[] iArr3 = this.f58659b;
        int i12 = this.f58660c;
        this.f58660c = i12 + 1;
        iArr3[i12] = i10;
    }

    public boolean addAll(Collection collection) {
        a();
        C4881t.a(collection);
        if (!(collection instanceof C4880s)) {
            return super.addAll(collection);
        }
        C4880s sVar = (C4880s) collection;
        int i10 = sVar.f58660c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f58660c;
        if (a.e.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f58659b;
            if (i12 > iArr.length) {
                this.f58659b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(sVar.f58659b, 0, this.f58659b, this.f58660c, sVar.f58660c);
            this.f58660c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public void add(int i10, Integer num) {
        g(i10, num.intValue());
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean add(Integer num) {
        T(num.intValue());
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4880s)) {
            return super.equals(obj);
        }
        C4880s sVar = (C4880s) obj;
        if (this.f58660c != sVar.f58660c) {
            return false;
        }
        int[] iArr = sVar.f58659b;
        for (int i10 = 0; i10 < this.f58660c; i10++) {
            if (this.f58659b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public int getInt(int i10) {
        k(i10);
        return this.f58659b[i10];
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f58660c; i11++) {
            i10 = (i10 * 31) + this.f58659b[i11];
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f58659b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    /* renamed from: r */
    public Integer remove(int i10) {
        a();
        k(i10);
        int[] iArr = this.f58659b;
        int i11 = iArr[i10];
        int i12 = this.f58660c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f58660c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        a();
        if (i11 >= i10) {
            int[] iArr = this.f58659b;
            System.arraycopy(iArr, i11, iArr, i10, this.f58660c - i11);
            this.f58660c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f58660c;
    }

    /* renamed from: t */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(v(i10, num.intValue()));
    }

    public int v(int i10, int i11) {
        a();
        k(i10);
        int[] iArr = this.f58659b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    public C4881t.d c(int i10) {
        if (i10 >= this.f58660c) {
            return new C4880s(Arrays.copyOf(this.f58659b, i10), this.f58660c);
        }
        throw new IllegalArgumentException();
    }
}
