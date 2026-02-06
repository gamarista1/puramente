package w;

import kotlin.jvm.internal.C6496s;

final class h0 implements C2797i {

    /* renamed from: a  reason: collision with root package name */
    private final C2797i f27430a;

    /* renamed from: b  reason: collision with root package name */
    private final long f27431b;

    public h0(C2797i iVar, long j10) {
        this.f27430a = iVar;
        this.f27431b = j10;
    }

    public u0 a(r0 r0Var) {
        return new i0(this.f27430a.a(r0Var), this.f27431b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (h0Var.f27431b != this.f27431b || !C6496s.c(h0Var.f27430a, this.f27430a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f27430a.hashCode() * 31) + Long.hashCode(this.f27431b);
    }
}
