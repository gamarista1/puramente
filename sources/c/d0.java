package C;

import Y.C1510r0;
import Y.o1;
import c1.d;
import c1.t;
import kotlin.jvm.internal.C6496s;

public final class d0 implements f0 {

    /* renamed from: b  reason: collision with root package name */
    private final String f912b;

    /* renamed from: c  reason: collision with root package name */
    private final C1510r0 f913c;

    public d0(G g10, String str) {
        this.f912b = str;
        this.f913c = u1.d(g10, (o1) null, 2, (Object) null);
    }

    public int a(d dVar) {
        return e().a();
    }

    public int b(d dVar, t tVar) {
        return e().c();
    }

    public int c(d dVar) {
        return e().d();
    }

    public int d(d dVar, t tVar) {
        return e().b();
    }

    public final G e() {
        return (G) this.f913c.getValue();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return C6496s.c(e(), ((d0) obj).e());
    }

    public final void f(G g10) {
        this.f913c.setValue(g10);
    }

    public int hashCode() {
        return this.f912b.hashCode();
    }

    public String toString() {
        return this.f912b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
