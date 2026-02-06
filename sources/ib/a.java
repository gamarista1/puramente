package Ib;

import Ib.c;
import Ib.h;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class a extends c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f51130a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f51131b;

    /* renamed from: c  reason: collision with root package name */
    private final Comparator f51132c;

    /* renamed from: Ib.a$a  reason: collision with other inner class name */
    class C0781a implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        int f51133a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f51134b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f51135c;

        C0781a(int i10, boolean z10) {
            this.f51134b = i10;
            this.f51135c = z10;
            this.f51133a = i10;
        }

        /* renamed from: a */
        public Map.Entry next() {
            int i10;
            Object obj = a.this.f51130a[this.f51133a];
            Object[] v10 = a.this.f51131b;
            int i11 = this.f51133a;
            Object obj2 = v10[i11];
            if (this.f51135c) {
                i10 = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
            this.f51133a = i10;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        public boolean hasNext() {
            if (this.f51135c) {
                if (this.f51133a < 0) {
                    return false;
                }
            } else if (this.f51133a >= a.this.f51130a.length) {
                return false;
            }
            return true;
        }

        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public a(Comparator comparator) {
        this.f51130a = new Object[0];
        this.f51131b = new Object[0];
        this.f51132c = comparator;
    }

    private int A(Object obj) {
        int i10 = 0;
        for (Object compare : this.f51130a) {
            if (this.f51132c.compare(obj, compare) == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private int C(Object obj) {
        int i10 = 0;
        while (true) {
            Object[] objArr = this.f51130a;
            if (i10 >= objArr.length || this.f51132c.compare(objArr[i10], obj) >= 0) {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    public static a D(Map map, Comparator comparator) {
        return z(new ArrayList(map.keySet()), map, c.a.e(), comparator);
    }

    private Iterator E(int i10, boolean z10) {
        return new C0781a(i10, z10);
    }

    private static Object[] H(Object[] objArr, int i10) {
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        System.arraycopy(objArr, i10 + 1, objArr2, i10, length - i10);
        return objArr2;
    }

    private static Object[] I(Object[] objArr, int i10, Object obj) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        objArr2[i10] = obj;
        return objArr2;
    }

    private static Object[] x(Object[] objArr, int i10, Object obj) {
        int length = objArr.length + 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        objArr2[i10] = obj;
        System.arraycopy(objArr, i10, objArr2, i10 + 1, (length - i10) - 1);
        return objArr2;
    }

    public static a z(List list, Map map, c.a.C0782a aVar, Comparator comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int i10 = 0;
        for (Object next : list) {
            objArr[i10] = next;
            objArr2[i10] = map.get(aVar.a(next));
            i10++;
        }
        return new a(comparator, objArr, objArr2);
    }

    public boolean a(Object obj) {
        if (A(obj) != -1) {
            return true;
        }
        return false;
    }

    public Object b(Object obj) {
        int A10 = A(obj);
        if (A10 != -1) {
            return this.f51131b[A10];
        }
        return null;
    }

    public Comparator d() {
        return this.f51132c;
    }

    public Object g() {
        Object[] objArr = this.f51130a;
        if (objArr.length > 0) {
            return objArr[objArr.length - 1];
        }
        return null;
    }

    public Object h() {
        Object[] objArr = this.f51130a;
        if (objArr.length > 0) {
            return objArr[0];
        }
        return null;
    }

    public boolean isEmpty() {
        if (this.f51130a.length == 0) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        return E(0, false);
    }

    public Object k(Object obj) {
        int A10 = A(obj);
        if (A10 == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        } else if (A10 > 0) {
            return this.f51130a[A10 - 1];
        } else {
            return null;
        }
    }

    public void m(h.b bVar) {
        int i10 = 0;
        while (true) {
            Object[] objArr = this.f51130a;
            if (i10 < objArr.length) {
                bVar.a(objArr[i10], this.f51131b[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    public Iterator m0() {
        return E(this.f51130a.length - 1, true);
    }

    public c n(Object obj, Object obj2) {
        int A10 = A(obj);
        if (A10 != -1) {
            Object[] objArr = this.f51130a;
            if (objArr[A10] == obj && this.f51131b[A10] == obj2) {
                return this;
            }
            return new a(this.f51132c, I(objArr, A10, obj), I(this.f51131b, A10, obj2));
        } else if (this.f51130a.length > 25) {
            HashMap hashMap = new HashMap(this.f51130a.length + 1);
            int i10 = 0;
            while (true) {
                Object[] objArr2 = this.f51130a;
                if (i10 < objArr2.length) {
                    hashMap.put(objArr2[i10], this.f51131b[i10]);
                    i10++;
                } else {
                    hashMap.put(obj, obj2);
                    return k.v(hashMap, this.f51132c);
                }
            }
        } else {
            int C10 = C(obj);
            return new a(this.f51132c, x(this.f51130a, C10, obj), x(this.f51131b, C10, obj2));
        }
    }

    public c r(Object obj) {
        int A10 = A(obj);
        if (A10 == -1) {
            return this;
        }
        return new a(this.f51132c, H(this.f51130a, A10), H(this.f51131b, A10));
    }

    public int size() {
        return this.f51130a.length;
    }

    private a(Comparator comparator, Object[] objArr, Object[] objArr2) {
        this.f51130a = objArr;
        this.f51131b = objArr2;
        this.f51132c = comparator;
    }
}
