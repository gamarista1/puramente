package androidx.coordinatorlayout.widget;

import androidx.collection.Y;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import x1.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final e f15733a = new Pools$SimplePool(10);

    /* renamed from: b  reason: collision with root package name */
    private final Y f15734b = new Y();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f15735c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet f15736d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) this.f15734b.get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        e(arrayList2.get(i10), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f15733a.b();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    private void l(ArrayList arrayList) {
        arrayList.clear();
        this.f15733a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f15734b.containsKey(obj) || !this.f15734b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f15734b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.f15734b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void b(Object obj) {
        if (!this.f15734b.containsKey(obj)) {
            this.f15734b.put(obj, (Object) null);
        }
    }

    public void c() {
        int size = this.f15734b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f15734b.n(i10);
            if (arrayList != null) {
                l(arrayList);
            }
        }
        this.f15734b.clear();
    }

    public boolean d(Object obj) {
        return this.f15734b.containsKey(obj);
    }

    public List g(Object obj) {
        ArrayList h10 = h(obj);
        if (h10 == null) {
            return null;
        }
        return new ArrayList(h10);
    }

    /* access modifiers changed from: package-private */
    public ArrayList h(Object obj) {
        return (ArrayList) this.f15734b.get(obj);
    }

    public List i(Object obj) {
        int size = this.f15734b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f15734b.n(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f15734b.i(i10));
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        this.f15735c.clear();
        this.f15736d.clear();
        int size = this.f15734b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f15734b.i(i10), this.f15735c, this.f15736d);
        }
        return this.f15735c;
    }

    public boolean k(Object obj) {
        int size = this.f15734b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f15734b.n(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
