package C;

import I0.d;
import I0.k;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

/* renamed from: C.l  reason: case insensitive filesystem */
final class C1094l implements d {

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f992b;

    /* renamed from: c  reason: collision with root package name */
    private f0 f993c;

    public C1094l(C6798l lVar) {
        this.f992b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1094l)) {
            return false;
        }
        if (((C1094l) obj).f992b == this.f992b) {
            return true;
        }
        return false;
    }

    public void g(k kVar) {
        f0 f0Var = (f0) kVar.a(i0.b());
        if (!C6496s.c(f0Var, this.f993c)) {
            this.f993c = f0Var;
            this.f992b.invoke(f0Var);
        }
    }

    public int hashCode() {
        return this.f992b.hashCode();
    }
}
