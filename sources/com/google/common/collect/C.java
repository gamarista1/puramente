package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import nb.o;
import nb.p;

public abstract class C {

    class a extends C4751b {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Iterator f56595c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f56596d;

        a(Iterator it, p pVar) {
            this.f56595c = it;
            this.f56596d = pVar;
        }

        /* access modifiers changed from: protected */
        public Object a() {
            while (this.f56595c.hasNext()) {
                Object next = this.f56595c.next();
                if (this.f56596d.apply(next)) {
                    return next;
                }
            }
            return b();
        }
    }

    private static final class b extends C4750a {

        /* renamed from: d  reason: collision with root package name */
        static final h0 f56597d = new b(new Object[0], 0);

        /* renamed from: c  reason: collision with root package name */
        private final Object[] f56598c;

        b(Object[] objArr, int i10) {
            super(objArr.length, i10);
            this.f56598c = objArr;
        }

        /* access modifiers changed from: protected */
        public Object a(int i10) {
            return this.f56598c[i10];
        }
    }

    private enum c implements Iterator {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            C4758i.c(false);
        }
    }

    private static final class d extends g0 {

        /* renamed from: b  reason: collision with root package name */
        private static final Object f56601b = new Object();

        /* renamed from: a  reason: collision with root package name */
        private Object f56602a;

        d(Object obj) {
            this.f56602a = obj;
        }

        public boolean hasNext() {
            if (this.f56602a != f56601b) {
                return true;
            }
            return false;
        }

        public Object next() {
            Object obj = this.f56602a;
            Object obj2 = f56601b;
            if (obj != obj2) {
                this.f56602a = obj2;
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        o.j(collection);
        o.j(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static boolean b(Iterator it, p pVar) {
        if (o(it, pVar) != -1) {
            return true;
        }
        return false;
    }

    static void c(Iterator it) {
        o.j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean e(java.util.Iterator r3, java.util.Iterator r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = nb.k.a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C.e(java.util.Iterator, java.util.Iterator):boolean");
    }

    static g0 f() {
        return g();
    }

    static h0 g() {
        return b.f56597d;
    }

    static Iterator h() {
        return c.INSTANCE;
    }

    public static g0 i(Iterator it, p pVar) {
        o.j(it);
        o.j(pVar);
        return new a(it, pVar);
    }

    public static Object j(Iterator it, p pVar) {
        o.j(it);
        o.j(pVar);
        while (it.hasNext()) {
            Object next = it.next();
            if (pVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public static Object k(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object l(Iterator it, Object obj) {
        if (it.hasNext()) {
            return k(it);
        }
        return obj;
    }

    public static Object m(Iterator it, Object obj) {
        if (it.hasNext()) {
            return it.next();
        }
        return obj;
    }

    public static Object n(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i10 = 0; i10 < 4 && it.hasNext(); i10++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append('>');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int o(Iterator it, p pVar) {
        o.k(pVar, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (pVar.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static Object p(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static boolean q(Iterator it, Collection collection) {
        o.j(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean r(Iterator it, p pVar) {
        o.j(pVar);
        boolean z10 = false;
        while (it.hasNext()) {
            if (pVar.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static g0 s(Object obj) {
        return new d(obj);
    }
}
