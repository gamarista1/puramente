package Q0;

import b1.t;
import c1.b;
import kotlin.jvm.internal.C6496s;

/* renamed from: Q0.g  reason: case insensitive filesystem */
public final class C1324g {

    /* renamed from: a  reason: collision with root package name */
    private final K f5339a;

    public C1324g(K k10) {
        this.f5339a = k10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1324g)) {
            return false;
        }
        K k10 = this.f5339a;
        C1324g gVar = (C1324g) obj;
        if (C6496s.c(k10.j(), gVar.f5339a.j()) && k10.i().G(gVar.f5339a.i()) && C6496s.c(k10.g(), gVar.f5339a.g()) && k10.e() == gVar.f5339a.e() && k10.h() == gVar.f5339a.h() && t.e(k10.f(), gVar.f5339a.f()) && C6496s.c(k10.b(), gVar.f5339a.b()) && k10.d() == gVar.f5339a.d() && k10.c() == gVar.f5339a.c() && b.l(k10.a()) == b.l(gVar.f5339a.a()) && b.k(k10.a()) == b.k(gVar.f5339a.a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        K k10 = this.f5339a;
        return (((((((((((((((((((k10.j().hashCode() * 31) + k10.i().H()) * 31) + k10.g().hashCode()) * 31) + k10.e()) * 31) + Boolean.hashCode(k10.h())) * 31) + t.f(k10.f())) * 31) + k10.b().hashCode()) * 31) + k10.d().hashCode()) * 31) + k10.c().hashCode()) * 31) + Integer.hashCode(b.l(k10.a()))) * 31) + Integer.hashCode(b.k(k10.a()));
    }
}
