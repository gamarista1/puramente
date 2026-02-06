package Tf;

import Sg.p;
import Uf.B;
import Uf.q;
import Xf.C5687u;
import eg.C5830g;
import eg.u;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import ng.b;
import ng.c;

public final class d implements C5687u {

    /* renamed from: a  reason: collision with root package name */
    private final ClassLoader f65154a;

    public d(ClassLoader classLoader) {
        C6496s.h(classLoader, "classLoader");
        this.f65154a = classLoader;
    }

    public u a(c cVar, boolean z10) {
        C6496s.h(cVar, "fqName");
        return new B(cVar);
    }

    public C5830g b(C5687u.a aVar) {
        C6496s.h(aVar, "request");
        b a10 = aVar.a();
        c f10 = a10.f();
        String b10 = a10.g().b();
        C6496s.g(b10, "asString(...)");
        String C10 = p.C(b10, '.', '$', false, 4, (Object) null);
        if (!f10.d()) {
            C10 = f10.b() + '.' + C10;
        }
        Class a11 = e.a(this.f65154a, C10);
        if (a11 != null) {
            return new q(a11);
        }
        return null;
    }

    public Set c(c cVar) {
        C6496s.h(cVar, "packageFqName");
        return null;
    }
}
