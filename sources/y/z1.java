package Y;

import java.util.ArrayList;

public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f10218a = new ArrayList();

    public final void a() {
        this.f10218a.clear();
    }

    public final int b() {
        return this.f10218a.size();
    }

    public final boolean c() {
        return this.f10218a.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final Object e() {
        return this.f10218a.get(b() - 1);
    }

    public final Object f(int i10) {
        return this.f10218a.get(i10);
    }

    public final Object g() {
        return this.f10218a.remove(b() - 1);
    }

    public final boolean h(Object obj) {
        return this.f10218a.add(obj);
    }

    public final Object[] i() {
        int size = this.f10218a.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = this.f10218a.get(i10);
        }
        return objArr;
    }
}
