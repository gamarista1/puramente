package W;

import Ef.m;
import W.q;
import c1.p;
import c1.r;
import k0.c;
import kotlin.jvm.internal.C6496s;

public final class G implements q.b {

    /* renamed from: a  reason: collision with root package name */
    private final c.C0368c f8266a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8267b;

    public G(c.C0368c cVar, int i10) {
        this.f8266a = cVar;
        this.f8267b = i10;
    }

    public int a(p pVar, long j10, int i10) {
        if (i10 >= r.f(j10) - (this.f8267b * 2)) {
            return c.f23044a.i().a(i10, r.f(j10));
        }
        return m.l(this.f8266a.a(i10, r.f(j10)), this.f8267b, (r.f(j10) - this.f8267b) - i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (C6496s.c(this.f8266a, g10.f8266a) && this.f8267b == g10.f8267b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8266a.hashCode() * 31) + Integer.hashCode(this.f8267b);
    }

    public String toString() {
        return "Vertical(alignment=" + this.f8266a + ", margin=" + this.f8267b + ')';
    }
}
