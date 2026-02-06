package com.google.common.collect;

import com.google.android.gms.common.api.a;
import com.google.common.collect.C4770v;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import nb.o;

/* renamed from: com.google.common.collect.t  reason: case insensitive filesystem */
public abstract class C4768t extends AbstractCollection implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f56740a = new Object[0];
    private static final long serialVersionUID = 912559;

    /* renamed from: com.google.common.collect.t$a */
    static abstract class a extends b {

        /* renamed from: a  reason: collision with root package name */
        Object[] f56741a;

        /* renamed from: b  reason: collision with root package name */
        int f56742b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f56743c;

        a(int i10) {
            C4758i.b(i10, "initialCapacity");
            this.f56741a = new Object[i10];
        }

        private void g(int i10) {
            Object[] objArr = this.f56741a;
            if (objArr.length < i10) {
                this.f56741a = Arrays.copyOf(objArr, b.c(objArr.length, i10));
                this.f56743c = false;
            } else if (this.f56743c) {
                this.f56741a = (Object[]) objArr.clone();
                this.f56743c = false;
            }
        }

        public b b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(this.f56742b + collection.size());
                if (collection instanceof C4768t) {
                    this.f56742b = ((C4768t) collection).b(this.f56741a, this.f56742b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a d(Object obj) {
            o.j(obj);
            g(this.f56742b + 1);
            Object[] objArr = this.f56741a;
            int i10 = this.f56742b;
            this.f56742b = i10 + 1;
            objArr[i10] = obj;
            return this;
        }

        public b e(Object... objArr) {
            f(objArr, objArr.length);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void f(Object[] objArr, int i10) {
            N.c(objArr, i10);
            g(this.f56742b + i10);
            System.arraycopy(objArr, 0, this.f56741a, this.f56742b, i10);
            this.f56742b += i10;
        }
    }

    /* renamed from: com.google.common.collect.t$b */
    public static abstract class b {
        b() {
        }

        static int c(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                if (i12 < 0) {
                    return a.e.API_PRIORITY_OTHER;
                }
                return i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        public abstract b a(Object obj);

        public b b(Iterable iterable) {
            for (Object a10 : iterable) {
                a(a10);
            }
            return this;
        }
    }

    C4768t() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public C4770v a() {
        if (isEmpty()) {
            return C4770v.E();
        }
        return C4770v.n(toArray());
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        g0 m10 = m();
        while (m10.hasNext()) {
            objArr[i10] = m10.next();
            i10++;
        }
        return i10;
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean k();

    public abstract g0 m();

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f56740a);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C4770v.d(toArray());
    }

    public final Object[] toArray(Object[] objArr) {
        o.j(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] d10 = d();
            if (d10 != null) {
                return P.a(d10, h(), g(), objArr);
            }
            objArr = N.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        b(objArr, 0);
        return objArr;
    }
}
