package x1;

import androidx.core.util.Pools$SimplePool;
import kotlin.jvm.internal.C6496s;

public class f extends Pools$SimplePool {

    /* renamed from: c  reason: collision with root package name */
    private final Object f28215c = new Object();

    public f(int i10) {
        super(i10);
    }

    public boolean a(Object obj) {
        boolean a10;
        C6496s.h(obj, "instance");
        synchronized (this.f28215c) {
            a10 = super.a(obj);
        }
        return a10;
    }

    public Object b() {
        Object b10;
        synchronized (this.f28215c) {
            b10 = super.b();
        }
        return b10;
    }
}
