package C;

import c1.d;
import c1.t;
import kotlin.jvm.internal.C6496s;

/* renamed from: C.a  reason: case insensitive filesystem */
final class C1083a implements f0 {

    /* renamed from: b  reason: collision with root package name */
    private final f0 f874b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f875c;

    public C1083a(f0 f0Var, f0 f0Var2) {
        this.f874b = f0Var;
        this.f875c = f0Var2;
    }

    public int a(d dVar) {
        return this.f874b.a(dVar) + this.f875c.a(dVar);
    }

    public int b(d dVar, t tVar) {
        return this.f874b.b(dVar, tVar) + this.f875c.b(dVar, tVar);
    }

    public int c(d dVar) {
        return this.f874b.c(dVar) + this.f875c.c(dVar);
    }

    public int d(d dVar, t tVar) {
        return this.f874b.d(dVar, tVar) + this.f875c.d(dVar, tVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1083a)) {
            return false;
        }
        C1083a aVar = (C1083a) obj;
        if (!C6496s.c(aVar.f874b, this.f874b) || !C6496s.c(aVar.f875c, this.f875c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f874b.hashCode() + (this.f875c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.f874b + " + " + this.f875c + ')';
    }
}
