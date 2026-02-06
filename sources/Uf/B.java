package Uf;

import eg.C5824a;
import eg.u;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.c;
import yf.C6798l;

public final class B extends u implements u {

    /* renamed from: a  reason: collision with root package name */
    private final c f65212a;

    public B(c cVar) {
        C6496s.h(cVar, "fqName");
        this.f65212a = cVar;
    }

    public boolean E() {
        return false;
    }

    public Collection G(C6798l lVar) {
        C6496s.h(lVar, "nameFilter");
        return C6565s.n();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof B) || !C6496s.c(f(), ((B) obj).f())) {
            return false;
        }
        return true;
    }

    public c f() {
        return this.f65212a;
    }

    public int hashCode() {
        return f().hashCode();
    }

    public C5824a i(c cVar) {
        C6496s.h(cVar, "fqName");
        return null;
    }

    public String toString() {
        return B.class.getName() + ": " + f();
    }

    public Collection v() {
        return C6565s.n();
    }

    public List getAnnotations() {
        return C6565s.n();
    }
}
