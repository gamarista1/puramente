package C;

import c1.d;
import c1.h;
import c1.t;
import kotlin.jvm.internal.C6496s;

final class Q implements f0 {

    /* renamed from: b  reason: collision with root package name */
    private final N f861b;

    public Q(N n10) {
        this.f861b = n10;
    }

    public int a(d dVar) {
        return dVar.E0(this.f861b.a());
    }

    public int b(d dVar, t tVar) {
        return dVar.E0(this.f861b.b(tVar));
    }

    public int c(d dVar) {
        return dVar.E0(this.f861b.d());
    }

    public int d(d dVar, t tVar) {
        return dVar.E0(this.f861b.c(tVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        return C6496s.c(((Q) obj).f861b, this.f861b);
    }

    public int hashCode() {
        return this.f861b.hashCode();
    }

    public String toString() {
        t tVar = t.Ltr;
        float c10 = this.f861b.c(tVar);
        float d10 = this.f861b.d();
        float b10 = this.f861b.b(tVar);
        float a10 = this.f861b.a();
        return "PaddingValues(" + h.p(c10) + ", " + h.p(d10) + ", " + h.p(b10) + ", " + h.p(a10) + ')';
    }
}
