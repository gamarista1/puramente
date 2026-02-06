package com.google.common.collect;

import com.google.common.collect.C4768t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import nb.o;

/* renamed from: com.google.common.collect.v  reason: case insensitive filesystem */
public abstract class C4770v extends C4768t implements List, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final h0 f56746b = new b(Q.f56623e, 0);
    private static final long serialVersionUID = -889275714;

    /* renamed from: com.google.common.collect.v$a */
    public static final class a extends C4768t.a {
        public a() {
            this(4);
        }

        /* renamed from: h */
        public a a(Object obj) {
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            super.e(objArr);
            return this;
        }

        public a j(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public C4770v k() {
            this.f56743c = true;
            return C4770v.r(this.f56741a, this.f56742b);
        }

        a(int i10) {
            super(i10);
        }
    }

    /* renamed from: com.google.common.collect.v$b */
    static class b extends C4750a {

        /* renamed from: c  reason: collision with root package name */
        private final C4770v f56747c;

        b(C4770v vVar, int i10) {
            super(vVar.size(), i10);
            this.f56747c = vVar;
        }

        /* access modifiers changed from: protected */
        public Object a(int i10) {
            return this.f56747c.get(i10);
        }
    }

    /* renamed from: com.google.common.collect.v$c */
    private static class c extends C4770v {

        /* renamed from: c  reason: collision with root package name */
        private final transient C4770v f56748c;

        c(C4770v vVar) {
            this.f56748c = vVar;
        }

        private int c0(int i10) {
            return (size() - 1) - i10;
        }

        private int f0(int i10) {
            return size() - i10;
        }

        public C4770v S() {
            return this.f56748c;
        }

        /* renamed from: Z */
        public C4770v subList(int i10, int i11) {
            o.n(i10, i11, size());
            return this.f56748c.subList(f0(i11), f0(i10)).S();
        }

        public boolean contains(Object obj) {
            return this.f56748c.contains(obj);
        }

        public Object get(int i10) {
            o.h(i10, size());
            return this.f56748c.get(c0(i10));
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.f56748c.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return c0(lastIndexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C4770v.super.iterator();
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return this.f56748c.k();
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.f56748c.indexOf(obj);
            if (indexOf >= 0) {
                return c0(indexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C4770v.super.listIterator();
        }

        public int size() {
            return this.f56748c.size();
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return C4770v.super.writeReplace();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return C4770v.super.listIterator(i10);
        }
    }

    /* renamed from: com.google.common.collect.v$d */
    static class d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        final Object[] f56749a;

        d(Object[] objArr) {
            this.f56749a = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return C4770v.A(this.f56749a);
        }
    }

    /* renamed from: com.google.common.collect.v$e */
    class e extends C4770v {

        /* renamed from: c  reason: collision with root package name */
        final transient int f56750c;

        /* renamed from: d  reason: collision with root package name */
        final transient int f56751d;

        e(int i10, int i11) {
            this.f56750c = i10;
            this.f56751d = i11;
        }

        /* renamed from: Z */
        public C4770v subList(int i10, int i11) {
            o.n(i10, i11, this.f56751d);
            C4770v vVar = C4770v.this;
            int i12 = this.f56750c;
            return vVar.subList(i10 + i12, i11 + i12);
        }

        /* access modifiers changed from: package-private */
        public Object[] d() {
            return C4770v.this.d();
        }

        /* access modifiers changed from: package-private */
        public int g() {
            return C4770v.this.h() + this.f56750c + this.f56751d;
        }

        public Object get(int i10) {
            o.h(i10, this.f56751d);
            return C4770v.this.get(i10 + this.f56750c);
        }

        /* access modifiers changed from: package-private */
        public int h() {
            return C4770v.this.h() + this.f56750c;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C4770v.super.iterator();
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return true;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C4770v.super.listIterator();
        }

        public int size() {
            return this.f56751d;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return C4770v.super.writeReplace();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return C4770v.super.listIterator(i10);
        }
    }

    C4770v() {
    }

    public static C4770v A(Object[] objArr) {
        if (objArr.length == 0) {
            return E();
        }
        return x((Object[]) objArr.clone());
    }

    public static C4770v E() {
        return Q.f56623e;
    }

    public static C4770v H(Object obj) {
        return x(obj);
    }

    public static C4770v I(Object obj, Object obj2) {
        return x(obj, obj2);
    }

    public static C4770v N(Object obj, Object obj2, Object obj3) {
        return x(obj, obj2, obj3);
    }

    public static C4770v P(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return x(obj, obj2, obj3, obj4, obj5);
    }

    public static C4770v Q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return x(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static C4770v R(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        boolean z10;
        Object[] objArr2 = objArr;
        if (objArr2.length <= 2147483635) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.e(z10, "the total number of elements must fit in an int");
        Object[] objArr3 = new Object[(objArr2.length + 12)];
        objArr3[0] = obj;
        objArr3[1] = obj2;
        objArr3[2] = obj3;
        objArr3[3] = obj4;
        objArr3[4] = obj5;
        objArr3[5] = obj6;
        objArr3[6] = obj7;
        objArr3[7] = obj8;
        objArr3[8] = obj9;
        objArr3[9] = obj10;
        objArr3[10] = obj11;
        objArr3[11] = obj12;
        System.arraycopy(objArr2, 0, objArr3, 12, objArr2.length);
        return x(objArr3);
    }

    public static C4770v W(Comparator comparator, Iterable iterable) {
        o.j(comparator);
        Object[] k10 = B.k(iterable);
        N.b(k10);
        Arrays.sort(k10, comparator);
        return n(k10);
    }

    static C4770v n(Object[] objArr) {
        return r(objArr, objArr.length);
    }

    static C4770v r(Object[] objArr, int i10) {
        if (i10 == 0) {
            return E();
        }
        return new Q(objArr, i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static a t() {
        return new a();
    }

    public static a v(int i10) {
        C4758i.b(i10, "expectedSize");
        return new a(i10);
    }

    private static C4770v x(Object... objArr) {
        return n(N.b(objArr));
    }

    public static C4770v z(Collection collection) {
        if (!(collection instanceof C4768t)) {
            return x(collection.toArray());
        }
        C4770v a10 = ((C4768t) collection).a();
        if (a10.k()) {
            return n(a10.toArray());
        }
        return a10;
    }

    /* renamed from: C */
    public h0 listIterator() {
        return listIterator(0);
    }

    /* renamed from: D */
    public h0 listIterator(int i10) {
        o.l(i10, size());
        if (isEmpty()) {
            return f56746b;
        }
        return new b(this, i10);
    }

    public C4770v S() {
        if (size() <= 1) {
            return this;
        }
        return new c(this);
    }

    /* renamed from: Z */
    public C4770v subList(int i10, int i11) {
        o.n(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return E();
        }
        return a0(i10, i11);
    }

    public final C4770v a() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public C4770v a0(int i10, int i11) {
        return new e(i10, i11 - i10);
    }

    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        return E.c(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return E.d(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return E.f(this, obj);
    }

    /* renamed from: m */
    public g0 iterator() {
        return listIterator();
    }

    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new d(toArray());
    }
}
