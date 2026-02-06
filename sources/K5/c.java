package k5;

import V4.i;
import V4.t;
import androidx.collection.C1587a;
import h5.g;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import o5.j;
import x1.e;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final t f45133c;

    /* renamed from: a  reason: collision with root package name */
    private final C1587a f45134a = new C1587a();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference f45135b = new AtomicReference();

    static {
        Class<Object> cls = Object.class;
        Class<Object> cls2 = Object.class;
        Class<Object> cls3 = Object.class;
        f45133c = new t(cls, cls2, cls3, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), (e) null)), (e) null);
    }

    private j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f45135b.getAndSet((Object) null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public t a(Class cls, Class cls2, Class cls3) {
        t tVar;
        j b10 = b(cls, cls2, cls3);
        synchronized (this.f45134a) {
            tVar = (t) this.f45134a.get(b10);
        }
        this.f45135b.set(b10);
        return tVar;
    }

    public boolean c(t tVar) {
        return f45133c.equals(tVar);
    }

    public void d(Class cls, Class cls2, Class cls3, t tVar) {
        synchronized (this.f45134a) {
            C1587a aVar = this.f45134a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f45133c;
            }
            aVar.put(jVar, tVar);
        }
    }
}
