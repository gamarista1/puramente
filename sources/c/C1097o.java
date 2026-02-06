package C;

import Ef.m;
import c1.d;
import c1.t;
import kotlin.jvm.internal.C6496s;

/* renamed from: C.o  reason: case insensitive filesystem */
final class C1097o implements f0 {

    /* renamed from: b  reason: collision with root package name */
    private final f0 f1007b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f1008c;

    public C1097o(f0 f0Var, f0 f0Var2) {
        this.f1007b = f0Var;
        this.f1008c = f0Var2;
    }

    public int a(d dVar) {
        return m.d(this.f1007b.a(dVar) - this.f1008c.a(dVar), 0);
    }

    public int b(d dVar, t tVar) {
        return m.d(this.f1007b.b(dVar, tVar) - this.f1008c.b(dVar, tVar), 0);
    }

    public int c(d dVar) {
        return m.d(this.f1007b.c(dVar) - this.f1008c.c(dVar), 0);
    }

    public int d(d dVar, t tVar) {
        return m.d(this.f1007b.d(dVar, tVar) - this.f1008c.d(dVar, tVar), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1097o)) {
            return false;
        }
        C1097o oVar = (C1097o) obj;
        if (!C6496s.c(oVar.f1007b, this.f1007b) || !C6496s.c(oVar.f1008c, this.f1008c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f1007b.hashCode() * 31) + this.f1008c.hashCode();
    }

    public String toString() {
        return '(' + this.f1007b + " - " + this.f1008c + ')';
    }
}
