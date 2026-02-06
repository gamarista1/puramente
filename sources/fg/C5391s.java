package Fg;

import Ff.d;
import Pf.h;
import Pf.j;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;

/* renamed from: Fg.s  reason: case insensitive filesystem */
public final class C5391s extends p0 {

    /* renamed from: a  reason: collision with root package name */
    private final h f63048a;

    public C5391s(h hVar) {
        C6496s.h(hVar, "annotations");
        this.f63048a = hVar;
    }

    public d b() {
        return O.b(C5391s.class);
    }

    /* renamed from: d */
    public C5391s a(C5391s sVar) {
        if (sVar == null) {
            return this;
        }
        return new C5391s(j.a(this.f63048a, sVar.f63048a));
    }

    public final h e() {
        return this.f63048a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5391s)) {
            return false;
        }
        return C6496s.c(((C5391s) obj).f63048a, this.f63048a);
    }

    /* renamed from: f */
    public C5391s c(C5391s sVar) {
        if (C6496s.c(sVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f63048a.hashCode();
    }
}
