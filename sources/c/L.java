package C;

import c1.d;
import c1.t;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class L implements f0 {

    /* renamed from: b  reason: collision with root package name */
    private final f0 f854b;

    /* renamed from: c  reason: collision with root package name */
    private final int f855c;

    public /* synthetic */ L(f0 f0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f0Var, i10);
    }

    public int a(d dVar) {
        if (k0.j(this.f855c, k0.f979a.e())) {
            return this.f854b.a(dVar);
        }
        return 0;
    }

    public int b(d dVar, t tVar) {
        int i10;
        if (tVar == t.Ltr) {
            i10 = k0.f979a.c();
        } else {
            i10 = k0.f979a.d();
        }
        if (k0.j(this.f855c, i10)) {
            return this.f854b.b(dVar, tVar);
        }
        return 0;
    }

    public int c(d dVar) {
        if (k0.j(this.f855c, k0.f979a.g())) {
            return this.f854b.c(dVar);
        }
        return 0;
    }

    public int d(d dVar, t tVar) {
        int i10;
        if (tVar == t.Ltr) {
            i10 = k0.f979a.a();
        } else {
            i10 = k0.f979a.b();
        }
        if (k0.j(this.f855c, i10)) {
            return this.f854b.d(dVar, tVar);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        if (!C6496s.c(this.f854b, l10.f854b) || !k0.i(this.f855c, l10.f855c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f854b.hashCode() * 31) + k0.k(this.f855c);
    }

    public String toString() {
        return '(' + this.f854b + " only " + k0.m(this.f855c) + ')';
    }

    private L(f0 f0Var, int i10) {
        this.f854b = f0Var;
        this.f855c = i10;
    }
}
