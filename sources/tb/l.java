package Tb;

import Tb.k;
import Tb.n;

public class l extends k {

    /* renamed from: c  reason: collision with root package name */
    private final long f52544c;

    public l(Long l10, n nVar) {
        super(nVar);
        this.f52544c = l10.longValue();
    }

    /* renamed from: A */
    public l V(n nVar) {
        return new l(Long.valueOf(this.f52544c), nVar);
    }

    public String L(n.b bVar) {
        return (t(bVar) + "number:") + Ob.l.c((double) this.f52544c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f52544c != lVar.f52544c || !this.f52536a.equals(lVar.f52536a)) {
            return false;
        }
        return true;
    }

    public Object getValue() {
        return Long.valueOf(this.f52544c);
    }

    public int hashCode() {
        long j10 = this.f52544c;
        return ((int) (j10 ^ (j10 >>> 32))) + this.f52536a.hashCode();
    }

    /* access modifiers changed from: protected */
    public k.b r() {
        return k.b.Number;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int a(l lVar) {
        return Ob.l.b(this.f52544c, lVar.f52544c);
    }
}
