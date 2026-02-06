package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

final class X extends C4865c implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final X f58420d;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f58421b;

    /* renamed from: c  reason: collision with root package name */
    private int f58422c;

    static {
        X x10 = new X(new Object[0], 0);
        f58420d = x10;
        x10.l();
    }

    private X(Object[] objArr, int i10) {
        this.f58421b = objArr;
        this.f58422c = i10;
    }

    private static Object[] b(int i10) {
        return new Object[i10];
    }

    public static X d() {
        return f58420d;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f58422c) {
            throw new IndexOutOfBoundsException(h(i10));
        }
    }

    private String h(int i10) {
        return "Index:" + i10 + ", Size:" + this.f58422c;
    }

    public boolean add(Object obj) {
        a();
        int i10 = this.f58422c;
        Object[] objArr = this.f58421b;
        if (i10 == objArr.length) {
            this.f58421b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f58421b;
        int i11 = this.f58422c;
        this.f58422c = i11 + 1;
        objArr2[i11] = obj;
        this.modCount++;
        return true;
    }

    public Object get(int i10) {
        g(i10);
        return this.f58421b[i10];
    }

    /* renamed from: k */
    public X c(int i10) {
        if (i10 >= this.f58422c) {
            return new X(Arrays.copyOf(this.f58421b, i10), this.f58422c);
        }
        throw new IllegalArgumentException();
    }

    public Object remove(int i10) {
        a();
        g(i10);
        Object[] objArr = this.f58421b;
        Object obj = objArr[i10];
        int i11 = this.f58422c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f58422c--;
        this.modCount++;
        return obj;
    }

    public Object set(int i10, Object obj) {
        a();
        g(i10);
        Object[] objArr = this.f58421b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        this.modCount++;
        return obj2;
    }

    public int size() {
        return this.f58422c;
    }

    public void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f58422c)) {
            throw new IndexOutOfBoundsException(h(i10));
        }
        Object[] objArr = this.f58421b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] b10 = b(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f58421b, 0, b10, 0, i10);
            System.arraycopy(this.f58421b, i10, b10, i10 + 1, this.f58422c - i10);
            this.f58421b = b10;
        }
        this.f58421b[i10] = obj;
        this.f58422c++;
        this.modCount++;
    }
}
