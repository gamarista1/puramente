package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import nb.o;

final class U extends A {

    /* renamed from: f  reason: collision with root package name */
    static final U f56647f = new U(C4770v.E(), O.d());

    /* renamed from: e  reason: collision with root package name */
    final transient C4770v f56648e;

    U(C4770v vVar, Comparator comparator) {
        super(comparator);
        this.f56648e = vVar;
    }

    private int x0(Object obj) {
        return Collections.binarySearch(this.f56648e, obj, y0());
    }

    /* access modifiers changed from: package-private */
    public A Z() {
        Comparator reverseOrder = Collections.reverseOrder(this.f56590c);
        if (isEmpty()) {
            return A.c0(reverseOrder);
        }
        return new U(this.f56648e.S(), reverseOrder);
    }

    public C4770v a() {
        return this.f56648e;
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        return this.f56648e.b(objArr, i10);
    }

    public Object ceiling(Object obj) {
        int w02 = w0(obj, true);
        if (w02 == size()) {
            return null;
        }
        return this.f56648e.get(w02);
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            if (x0(obj) >= 0) {
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection collection) {
        if (collection instanceof K) {
            collection = ((K) collection).O();
        }
        if (!d0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        g0 m10 = iterator();
        Iterator it = collection.iterator();
        if (!m10.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = m10.next();
        while (true) {
            try {
                int r02 = r0(next2, next);
                if (r02 < 0) {
                    if (!m10.hasNext()) {
                        return false;
                    }
                    next2 = m10.next();
                } else if (r02 == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (r02 > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f56648e.d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.util.Comparator r1 = r5.f56590c
            boolean r1 = com.google.common.collect.d0.b(r1, r6)
            if (r1 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()
            com.google.common.collect.g0 r1 = r5.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
        L_0x002e:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r4 == 0) goto L_0x0044
            int r3 = r5.r0(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x002e
        L_0x0044:
            return r2
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        L_0x0047:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.U.equals(java.lang.Object):boolean");
    }

    public Object first() {
        if (!isEmpty()) {
            return this.f56648e.get(0);
        }
        throw new NoSuchElementException();
    }

    public Object floor(Object obj) {
        int v02 = v0(obj, true) - 1;
        if (v02 == -1) {
            return null;
        }
        return this.f56648e.get(v02);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f56648e.g();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.f56648e.h();
    }

    /* access modifiers changed from: package-private */
    public A h0(Object obj, boolean z10) {
        return u0(0, v0(obj, z10));
    }

    public Object higher(Object obj) {
        int w02 = w0(obj, false);
        if (w02 == size()) {
            return null;
        }
        return this.f56648e.get(w02);
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f56648e.k();
    }

    /* access modifiers changed from: package-private */
    public A l0(Object obj, boolean z10, Object obj2, boolean z11) {
        return q0(obj, z10).h0(obj2, z11);
    }

    public Object last() {
        if (!isEmpty()) {
            return this.f56648e.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public Object lower(Object obj) {
        int v02 = v0(obj, false) - 1;
        if (v02 == -1) {
            return null;
        }
        return this.f56648e.get(v02);
    }

    /* renamed from: m */
    public g0 iterator() {
        return this.f56648e.iterator();
    }

    /* access modifiers changed from: package-private */
    public A q0(Object obj, boolean z10) {
        return u0(w0(obj, z10), size());
    }

    public int size() {
        return this.f56648e.size();
    }

    /* renamed from: t0 */
    public g0 descendingIterator() {
        return this.f56648e.S().iterator();
    }

    /* access modifiers changed from: package-private */
    public U u0(int i10, int i11) {
        if (i10 == 0 && i11 == size()) {
            return this;
        }
        if (i10 < i11) {
            return new U(this.f56648e.subList(i10, i11), this.f56590c);
        }
        return A.c0(this.f56590c);
    }

    /* access modifiers changed from: package-private */
    public int v0(Object obj, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f56648e, o.j(obj), comparator());
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (z10) {
            return binarySearch + 1;
        }
        return binarySearch;
    }

    /* access modifiers changed from: package-private */
    public int w0(Object obj, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f56648e, o.j(obj), comparator());
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        if (z10) {
            return binarySearch;
        }
        return binarySearch + 1;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return super.writeReplace();
    }

    /* access modifiers changed from: package-private */
    public Comparator y0() {
        return this.f56590c;
    }
}
