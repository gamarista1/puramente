package W;

import Ef.m;
import W.q;
import c1.p;
import c1.r;
import c1.t;
import k0.c;
import kotlin.jvm.internal.C6496s;

public final class F implements q.a {

    /* renamed from: a  reason: collision with root package name */
    private final c.b f8264a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8265b;

    public F(c.b bVar, int i10) {
        this.f8264a = bVar;
        this.f8265b = i10;
    }

    public int a(p pVar, long j10, int i10, t tVar) {
        if (i10 >= r.g(j10) - (this.f8265b * 2)) {
            return c.f23044a.g().a(i10, r.g(j10), tVar);
        }
        return m.l(this.f8264a.a(i10, r.g(j10), tVar), this.f8265b, (r.g(j10) - this.f8265b) - i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        if (C6496s.c(this.f8264a, f10.f8264a) && this.f8265b == f10.f8265b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8264a.hashCode() * 31) + Integer.hashCode(this.f8265b);
    }

    public String toString() {
        return "Horizontal(alignment=" + this.f8264a + ", margin=" + this.f8265b + ')';
    }
}
