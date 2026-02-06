package com.google.common.collect;

import com.google.common.collect.C4773y;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import nb.o;

public abstract class A extends C4773y implements NavigableSet, c0 {
    private static final long serialVersionUID = 912559;

    /* renamed from: c  reason: collision with root package name */
    final transient Comparator f56590c;

    /* renamed from: d  reason: collision with root package name */
    transient A f56591d;

    public static final class a extends C4773y.a {

        /* renamed from: f  reason: collision with root package name */
        private final Comparator f56592f;

        public a(Comparator comparator) {
            this.f56592f = (Comparator) o.j(comparator);
        }

        /* renamed from: m */
        public a h(Object obj) {
            super.a(obj);
            return this;
        }

        /* renamed from: n */
        public a i(Object... objArr) {
            super.i(objArr);
            return this;
        }

        /* renamed from: o */
        public a j(Iterable iterable) {
            super.j(iterable);
            return this;
        }

        /* renamed from: p */
        public A l() {
            A R10 = A.R(this.f56592f, this.f56742b, this.f56741a);
            this.f56742b = R10.size();
            this.f56743c = true;
            return R10;
        }
    }

    private static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        final Comparator f56593a;

        /* renamed from: b  reason: collision with root package name */
        final Object[] f56594b;

        public b(Comparator comparator, Object[] objArr) {
            this.f56593a = comparator;
            this.f56594b = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return new a(this.f56593a).i(this.f56594b).l();
        }
    }

    A(Comparator comparator) {
        this.f56590c = comparator;
    }

    static A R(Comparator comparator, int i10, Object... objArr) {
        if (i10 == 0) {
            return c0(comparator);
        }
        N.c(objArr, i10);
        Arrays.sort(objArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (comparator.compare(obj, objArr[i11 - 1]) != 0) {
                objArr[i11] = obj;
                i11++;
            }
        }
        Arrays.fill(objArr, i11, i10, (Object) null);
        if (i11 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new U(C4770v.r(objArr, i11), comparator);
    }

    public static A S(Comparator comparator, Iterable iterable) {
        o.j(comparator);
        if (d0.b(comparator, iterable) && (iterable instanceof A)) {
            A a10 = (A) iterable;
            if (!a10.k()) {
                return a10;
            }
        }
        Object[] k10 = B.k(iterable);
        return R(comparator, k10.length, k10);
    }

    public static A W(Comparator comparator, Collection collection) {
        return S(comparator, collection);
    }

    static U c0(Comparator comparator) {
        if (O.d().equals(comparator)) {
            return U.f56647f;
        }
        return new U(C4770v.E(), comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static int s0(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* access modifiers changed from: package-private */
    public abstract A Z();

    /* renamed from: a0 */
    public A descendingSet() {
        A a10 = this.f56591d;
        if (a10 != null) {
            return a10;
        }
        A Z10 = Z();
        this.f56591d = Z10;
        Z10.f56591d = this;
        return Z10;
    }

    public Comparator comparator() {
        return this.f56590c;
    }

    /* renamed from: f0 */
    public A headSet(Object obj) {
        return headSet(obj, false);
    }

    /* renamed from: g0 */
    public A headSet(Object obj, boolean z10) {
        return h0(o.j(obj), z10);
    }

    /* access modifiers changed from: package-private */
    public abstract A h0(Object obj, boolean z10);

    /* renamed from: i0 */
    public A subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    /* renamed from: j0 */
    public A subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        boolean z12;
        o.j(obj);
        o.j(obj2);
        if (this.f56590c.compare(obj, obj2) <= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        o.d(z12);
        return l0(obj, z10, obj2, z11);
    }

    /* access modifiers changed from: package-private */
    public abstract A l0(Object obj, boolean z10, Object obj2, boolean z11);

    /* renamed from: o0 */
    public A tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* renamed from: p0 */
    public A tailSet(Object obj, boolean z10) {
        return q0(o.j(obj), z10);
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract A q0(Object obj, boolean z10);

    /* access modifiers changed from: package-private */
    public int r0(Object obj, Object obj2) {
        return s0(this.f56590c, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new b(this.f56590c, toArray());
    }
}
