package Tb;

import Ob.l;
import Tb.k;
import Tb.n;

public class f extends k {

    /* renamed from: c  reason: collision with root package name */
    private final Double f52529c;

    public f(Double d10, n nVar) {
        super(nVar);
        this.f52529c = d10;
    }

    /* renamed from: A */
    public f V(n nVar) {
        l.f(r.b(nVar));
        return new f(this.f52529c, nVar);
    }

    public String L(n.b bVar) {
        return (t(bVar) + "number:") + l.c(this.f52529c.doubleValue());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f52529c.equals(fVar.f52529c) || !this.f52536a.equals(fVar.f52536a)) {
            return false;
        }
        return true;
    }

    public Object getValue() {
        return this.f52529c;
    }

    public int hashCode() {
        return this.f52529c.hashCode() + this.f52536a.hashCode();
    }

    /* access modifiers changed from: protected */
    public k.b r() {
        return k.b.Number;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int a(f fVar) {
        return this.f52529c.compareTo(fVar.f52529c);
    }
}
