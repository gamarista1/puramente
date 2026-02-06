package qe;

import Ff.d;
import Ff.p;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class C implements p {

    /* renamed from: a  reason: collision with root package name */
    private final d f61386a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f61387b;

    public C(d dVar, boolean z10) {
        C6496s.h(dVar, "classifier");
        this.f61386a = dVar;
        this.f61387b = z10;
    }

    public List c() {
        return C6565s.n();
    }

    public boolean e() {
        return this.f61387b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (!C6496s.c(b(), c10.b()) || e() != c10.e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public d b() {
        return this.f61386a;
    }

    public List getAnnotations() {
        return C6565s.n();
    }

    public int hashCode() {
        return (b().hashCode() * 31) + Boolean.hashCode(e());
    }
}
