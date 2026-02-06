package Y;

import g0.h;
import g0.i;
import java.util.concurrent.atomic.AtomicReference;
import lf.C6514M;

public final class v1 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference f10184a = new AtomicReference(i.a());

    /* renamed from: b  reason: collision with root package name */
    private final Object f10185b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private Object f10186c;

    public final Object a() {
        long id2 = Thread.currentThread().getId();
        if (id2 == C1471b.e()) {
            return this.f10186c;
        }
        return ((h) this.f10184a.get()).b(id2);
    }

    public final void b(Object obj) {
        long id2 = Thread.currentThread().getId();
        if (id2 == C1471b.e()) {
            this.f10186c = obj;
            return;
        }
        synchronized (this.f10185b) {
            h hVar = (h) this.f10184a.get();
            if (!hVar.d(id2, obj)) {
                this.f10184a.set(hVar.c(id2, obj));
                C6514M m10 = C6514M.f71813a;
            }
        }
    }
}
