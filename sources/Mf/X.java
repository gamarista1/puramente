package mf;

import Ef.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C6496s;

final class X extends C6550c implements RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f72043b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f72044c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f72045d;

    /* renamed from: e  reason: collision with root package name */
    private int f72046e;

    public static final class a extends C6549b {

        /* renamed from: c  reason: collision with root package name */
        private int f72047c;

        /* renamed from: d  reason: collision with root package name */
        private int f72048d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ X f72049e;

        a(X x10) {
            this.f72049e = x10;
            this.f72047c = x10.size();
            this.f72048d = x10.f72045d;
        }

        /* access modifiers changed from: protected */
        public void a() {
            if (this.f72047c == 0) {
                b();
                return;
            }
            c(this.f72049e.f72043b[this.f72048d]);
            this.f72048d = (this.f72048d + 1) % this.f72049e.f72044c;
            this.f72047c--;
        }
    }

    public X(Object[] objArr, int i10) {
        C6496s.h(objArr, "buffer");
        this.f72043b = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        } else if (i10 <= objArr.length) {
            this.f72044c = objArr.length;
            this.f72046e = i10;
        } else {
            throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
    }

    public int a() {
        return this.f72046e;
    }

    public Object get(int i10) {
        C6550c.f72053a.b(i10, size());
        return this.f72043b[(this.f72045d + i10) % this.f72044c];
    }

    public Iterator iterator() {
        return new a(this);
    }

    public final void n(Object obj) {
        if (!t()) {
            this.f72043b[(this.f72045d + size()) % this.f72044c] = obj;
            this.f72046e = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    public final X r(int i10) {
        Object[] objArr;
        int i11 = this.f72044c;
        int h10 = m.h(i11 + (i11 >> 1) + 1, i10);
        if (this.f72045d == 0) {
            objArr = Arrays.copyOf(this.f72043b, h10);
            C6496s.g(objArr, "copyOf(...)");
        } else {
            objArr = toArray(new Object[h10]);
        }
        return new X(objArr, size());
    }

    public final boolean t() {
        if (size() == this.f72044c) {
            return true;
        }
        return false;
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            C6496s.g(objArr, "copyOf(...)");
        }
        int size = size();
        int i10 = this.f72045d;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size && i10 < this.f72044c) {
            objArr[i12] = this.f72043b[i10];
            i12++;
            i10++;
        }
        while (i12 < size) {
            objArr[i12] = this.f72043b[i11];
            i12++;
            i11++;
        }
        return C6565s.g(size, objArr);
    }

    public final void v(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        } else if (i10 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        } else if (i10 > 0) {
            int i11 = this.f72045d;
            int g10 = (i11 + i10) % this.f72044c;
            if (i11 > g10) {
                C6559l.w(this.f72043b, (Object) null, i11, this.f72044c);
                C6559l.w(this.f72043b, (Object) null, 0, g10);
            } else {
                C6559l.w(this.f72043b, (Object) null, i11, g10);
            }
            this.f72045d = g10;
            this.f72046e = size() - i10;
        }
    }

    public X(int i10) {
        this(new Object[i10], 0);
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
