package d0;

import java.util.Iterator;
import java.util.Map;
import zf.C6828a;

/* renamed from: d0.i  reason: case insensitive filesystem */
public final class C1905i implements Iterator, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final C1903g f19419a;

    public C1905i(C1902f fVar) {
        C1917u[] uVarArr = new C1917u[8];
        for (int i10 = 0; i10 < 8; i10++) {
            uVarArr[i10] = new C1921y(this);
        }
        this.f19419a = new C1903g(fVar, uVarArr);
    }

    /* renamed from: a */
    public Map.Entry next() {
        return (Map.Entry) this.f19419a.next();
    }

    public final void b(Object obj, Object obj2) {
        this.f19419a.o(obj, obj2);
    }

    public boolean hasNext() {
        return this.f19419a.hasNext();
    }

    public void remove() {
        this.f19419a.remove();
    }
}
