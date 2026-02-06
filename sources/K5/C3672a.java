package k5;

import T4.d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k5.a  reason: case insensitive filesystem */
public class C3672a {

    /* renamed from: a  reason: collision with root package name */
    private final List f45129a = new ArrayList();

    /* renamed from: k5.a$a  reason: collision with other inner class name */
    private static final class C0690a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f45130a;

        /* renamed from: b  reason: collision with root package name */
        final d f45131b;

        C0690a(Class cls, d dVar) {
            this.f45130a = cls;
            this.f45131b = dVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Class cls) {
            return this.f45130a.isAssignableFrom(cls);
        }
    }

    public synchronized void a(Class cls, d dVar) {
        this.f45129a.add(new C0690a(cls, dVar));
    }

    public synchronized d b(Class cls) {
        for (C0690a aVar : this.f45129a) {
            if (aVar.a(cls)) {
                return aVar.f45131b;
            }
        }
        return null;
    }
}
