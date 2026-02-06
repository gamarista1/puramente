package k5;

import androidx.collection.C1587a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o5.j;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f45136a = new AtomicReference();

    /* renamed from: b  reason: collision with root package name */
    private final C1587a f45137b = new C1587a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f45136a.getAndSet((Object) null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f45137b) {
            list = (List) this.f45137b.get(jVar);
        }
        this.f45136a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f45137b) {
            this.f45137b.put(new j(cls, cls2, cls3), list);
        }
    }
}
