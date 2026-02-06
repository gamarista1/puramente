package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class T {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f71763a;

    public T(int i10) {
        this.f71763a = new ArrayList(i10);
    }

    public void a(Object obj) {
        this.f71763a.add(obj);
    }

    public void b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList arrayList = this.f71763a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f71763a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f71763a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f71763a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f71763a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    public int c() {
        return this.f71763a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f71763a.toArray(objArr);
    }
}
