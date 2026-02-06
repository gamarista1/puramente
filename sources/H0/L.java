package H0;

import J0.U;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class L implements F {

    /* renamed from: a  reason: collision with root package name */
    private final K f2543a;

    public L(K k10) {
        this.f2543a = k10;
    }

    public int a(C1194o oVar, List list, int i10) {
        return this.f2543a.a(oVar, U.a(oVar), i10);
    }

    public int b(C1194o oVar, List list, int i10) {
        return this.f2543a.b(oVar, U.a(oVar), i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof L) && C6496s.c(this.f2543a, ((L) obj).f2543a)) {
            return true;
        }
        return false;
    }

    public int g(C1194o oVar, List list, int i10) {
        return this.f2543a.g(oVar, U.a(oVar), i10);
    }

    public int h(C1194o oVar, List list, int i10) {
        return this.f2543a.h(oVar, U.a(oVar), i10);
    }

    public int hashCode() {
        return this.f2543a.hashCode();
    }

    public G j(H h10, List list, long j10) {
        return this.f2543a.j(h10, U.a(h10), j10);
    }

    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f2543a + ')';
    }
}
