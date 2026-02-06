package Tf;

import Sg.p;
import Uf.C5553f;
import gg.C5974x;
import hg.C5996a;
import hg.C5997b;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.b;

public final class f implements C5974x {

    /* renamed from: c  reason: collision with root package name */
    public static final a f65155c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Class f65156a;

    /* renamed from: b  reason: collision with root package name */
    private final C5996a f65157b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Class cls) {
            C6496s.h(cls, "klass");
            C5997b bVar = new C5997b();
            c.f65153a.b(cls, bVar);
            C5996a n10 = bVar.n();
            if (n10 == null) {
                return null;
            }
            return new f(cls, n10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Class cls, C5996a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, aVar);
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f65156a.getName();
        C6496s.g(name, "getName(...)");
        sb2.append(p.C(name, '.', '/', false, 4, (Object) null));
        sb2.append(".class");
        return sb2.toString();
    }

    public void b(C5974x.c cVar, byte[] bArr) {
        C6496s.h(cVar, "visitor");
        c.f65153a.b(this.f65156a, cVar);
    }

    public void c(C5974x.d dVar, byte[] bArr) {
        C6496s.h(dVar, "visitor");
        c.f65153a.i(this.f65156a, dVar);
    }

    public b d() {
        return C5553f.e(this.f65156a);
    }

    public C5996a e() {
        return this.f65157b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f) || !C6496s.c(this.f65156a, ((f) obj).f65156a)) {
            return false;
        }
        return true;
    }

    public final Class f() {
        return this.f65156a;
    }

    public int hashCode() {
        return this.f65156a.hashCode();
    }

    public String toString() {
        return f.class.getName() + ": " + this.f65156a;
    }

    private f(Class cls, C5996a aVar) {
        this.f65156a = cls;
        this.f65157b = aVar;
    }
}
