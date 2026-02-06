package f7;

import java.util.HashSet;
import java.util.Set;

public abstract class u implements C3511A {

    /* renamed from: a  reason: collision with root package name */
    private final Set f43466a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final k f43467b = new k();

    private Object d(Object obj) {
        if (obj != null) {
            synchronized (this) {
                this.f43466a.remove(obj);
            }
        }
        return obj;
    }

    public Object b() {
        return d(this.f43467b.f());
    }

    public void c(Object obj) {
        boolean add;
        synchronized (this) {
            add = this.f43466a.add(obj);
        }
        if (add) {
            this.f43467b.e(a(obj), obj);
        }
    }

    public Object get(int i10) {
        return d(this.f43467b.a(i10));
    }
}
