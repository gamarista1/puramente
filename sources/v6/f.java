package V6;

import M5.d;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f34692a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f34693b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f34694c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f34695d;

    public /* synthetic */ f(Object obj, AtomicBoolean atomicBoolean, j jVar, d dVar) {
        this.f34692a = obj;
        this.f34693b = atomicBoolean;
        this.f34694c = jVar;
        this.f34695d = dVar;
    }

    public final Object call() {
        return j.o(this.f34692a, this.f34693b, this.f34694c, this.f34695d);
    }
}
