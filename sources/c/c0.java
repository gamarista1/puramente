package C;

import c1.d;
import c1.t;
import kotlin.jvm.internal.C6496s;

final class c0 implements f0 {

    /* renamed from: b  reason: collision with root package name */
    private final f0 f910b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f911c;

    public c0(f0 f0Var, f0 f0Var2) {
        this.f910b = f0Var;
        this.f911c = f0Var2;
    }

    public int a(d dVar) {
        return Math.max(this.f910b.a(dVar), this.f911c.a(dVar));
    }

    public int b(d dVar, t tVar) {
        return Math.max(this.f910b.b(dVar, tVar), this.f911c.b(dVar, tVar));
    }

    public int c(d dVar) {
        return Math.max(this.f910b.c(dVar), this.f911c.c(dVar));
    }

    public int d(d dVar, t tVar) {
        return Math.max(this.f910b.d(dVar, tVar), this.f911c.d(dVar, tVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!C6496s.c(c0Var.f910b, this.f910b) || !C6496s.c(c0Var.f911c, this.f911c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f910b.hashCode() + (this.f911c.hashCode() * 31);
    }

    public String toString() {
        return '(' + this.f910b + " ∪ " + this.f911c + ')';
    }
}
