package C;

import c1.d;
import c1.t;
import kotlin.jvm.internal.C6496s;

final class F implements N {

    /* renamed from: a  reason: collision with root package name */
    private final f0 f839a;

    /* renamed from: b  reason: collision with root package name */
    private final d f840b;

    public F(f0 f0Var, d dVar) {
        this.f839a = f0Var;
        this.f840b = dVar;
    }

    public float a() {
        d dVar = this.f840b;
        return dVar.E(this.f839a.a(dVar));
    }

    public float b(t tVar) {
        d dVar = this.f840b;
        return dVar.E(this.f839a.b(dVar, tVar));
    }

    public float c(t tVar) {
        d dVar = this.f840b;
        return dVar.E(this.f839a.d(dVar, tVar));
    }

    public float d() {
        d dVar = this.f840b;
        return dVar.E(this.f839a.c(dVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        if (!C6496s.c(this.f839a, f10.f839a) || !C6496s.c(this.f840b, f10.f840b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f839a.hashCode() * 31) + this.f840b.hashCode();
    }

    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f839a + ", density=" + this.f840b + ')';
    }
}
