package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import nb.o;
import nb.p;

/* renamed from: com.google.common.collect.j  reason: case insensitive filesystem */
public abstract class C4759j {

    /* renamed from: com.google.common.collect.j$a */
    static class a extends AbstractCollection {

        /* renamed from: a  reason: collision with root package name */
        final Collection f56708a;

        /* renamed from: b  reason: collision with root package name */
        final p f56709b;

        a(Collection collection, p pVar) {
            this.f56708a = collection;
            this.f56709b = pVar;
        }

        public boolean add(Object obj) {
            o.d(this.f56709b.apply(obj));
            return this.f56708a.add(obj);
        }

        public boolean addAll(Collection collection) {
            for (Object apply : collection) {
                o.d(this.f56709b.apply(apply));
            }
            return this.f56708a.addAll(collection);
        }

        public void clear() {
            B.h(this.f56708a, this.f56709b);
        }

        public boolean contains(Object obj) {
            if (C4759j.c(this.f56708a, obj)) {
                return this.f56709b.apply(obj);
            }
            return false;
        }

        public boolean containsAll(Collection collection) {
            return C4759j.a(this, collection);
        }

        public boolean isEmpty() {
            return !B.a(this.f56708a, this.f56709b);
        }

        public Iterator iterator() {
            return C.i(this.f56708a.iterator(), this.f56709b);
        }

        public boolean remove(Object obj) {
            if (!contains(obj) || !this.f56708a.remove(obj)) {
                return false;
            }
            return true;
        }

        public boolean removeAll(Collection collection) {
            Iterator it = this.f56708a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f56709b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        public boolean retainAll(Collection collection) {
            Iterator it = this.f56708a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f56709b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        public int size() {
            int i10 = 0;
            for (Object apply : this.f56708a) {
                if (this.f56709b.apply(apply)) {
                    i10++;
                }
            }
            return i10;
        }

        public Object[] toArray() {
            return E.i(iterator()).toArray();
        }

        public Object[] toArray(Object[] objArr) {
            return E.i(iterator()).toArray(objArr);
        }
    }

    static boolean a(Collection collection, Collection collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    static StringBuilder b(int i10) {
        C4758i.b(i10, "size");
        return new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824));
    }

    static boolean c(Collection collection, Object obj) {
        o.j(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
