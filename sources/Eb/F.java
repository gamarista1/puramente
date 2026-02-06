package Eb;

import dc.C4942a;
import dc.C4944c;
import ic.C5026a;
import ic.C5027b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class F implements C4283d {

    /* renamed from: a  reason: collision with root package name */
    private final Set f50682a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f50683b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f50684c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f50685d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f50686e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f50687f;

    /* renamed from: g  reason: collision with root package name */
    private final C4283d f50688g;

    private static class a implements C4944c {

        /* renamed from: a  reason: collision with root package name */
        private final Set f50689a;

        /* renamed from: b  reason: collision with root package name */
        private final C4944c f50690b;

        public a(Set set, C4944c cVar) {
            this.f50689a = set;
            this.f50690b = cVar;
        }

        public void d(C4942a aVar) {
            if (this.f50689a.contains(aVar.b())) {
                this.f50690b.d(aVar);
                return;
            }
            throw new s(String.format("Attempting to publish an undeclared event %s.", new Object[]{aVar}));
        }
    }

    F(C4282c cVar, C4283d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : cVar.g()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(E.b(C4944c.class));
        }
        this.f50682a = Collections.unmodifiableSet(hashSet);
        this.f50683b = Collections.unmodifiableSet(hashSet2);
        this.f50684c = Collections.unmodifiableSet(hashSet3);
        this.f50685d = Collections.unmodifiableSet(hashSet4);
        this.f50686e = Collections.unmodifiableSet(hashSet5);
        this.f50687f = cVar.k();
        this.f50688g = dVar;
    }

    public C5026a a(E e10) {
        if (this.f50684c.contains(e10)) {
            return this.f50688g.a(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{e10}));
    }

    public C5027b c(E e10) {
        if (this.f50686e.contains(e10)) {
            return this.f50688g.c(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{e10}));
    }

    public Object d(E e10) {
        if (this.f50682a.contains(e10)) {
            return this.f50688g.d(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", new Object[]{e10}));
    }

    public C5027b e(Class cls) {
        return f(E.b(cls));
    }

    public C5027b f(E e10) {
        if (this.f50683b.contains(e10)) {
            return this.f50688g.f(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{e10}));
    }

    public Set g(E e10) {
        if (this.f50685d.contains(e10)) {
            return this.f50688g.g(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{e10}));
    }

    public Object get(Class cls) {
        if (this.f50682a.contains(E.b(cls))) {
            Object obj = this.f50688g.get(cls);
            if (!cls.equals(C4944c.class)) {
                return obj;
            }
            return new a(this.f50687f, (C4944c) obj);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public C5026a h(Class cls) {
        return a(E.b(cls));
    }
}
