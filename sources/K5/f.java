package k5;

import T4.l;
import java.util.ArrayList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List f45143a = new ArrayList();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f45144a;

        /* renamed from: b  reason: collision with root package name */
        final l f45145b;

        a(Class cls, l lVar) {
            this.f45144a = cls;
            this.f45145b = lVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Class cls) {
            return this.f45144a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, l lVar) {
        this.f45143a.add(new a(cls, lVar));
    }

    public synchronized l b(Class cls) {
        int size = this.f45143a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f45143a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f45145b;
            }
        }
        return null;
    }

    public synchronized void c(Class cls, l lVar) {
        this.f45143a.add(0, new a(cls, lVar));
    }
}
