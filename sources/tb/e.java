package Tb;

import Ob.l;
import Tb.k;
import Tb.n;
import java.util.Map;

public class e extends k {

    /* renamed from: c  reason: collision with root package name */
    private Map f52528c;

    public e(Map map, n nVar) {
        super(nVar);
        this.f52528c = map;
    }

    /* renamed from: A */
    public e V(n nVar) {
        l.f(r.b(nVar));
        return new e(this.f52528c, nVar);
    }

    public String L(n.b bVar) {
        return t(bVar) + "deferredValue:" + this.f52528c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f52528c.equals(eVar.f52528c) || !this.f52536a.equals(eVar.f52536a)) {
            return false;
        }
        return true;
    }

    public Object getValue() {
        return this.f52528c;
    }

    public int hashCode() {
        return this.f52528c.hashCode() + this.f52536a.hashCode();
    }

    /* access modifiers changed from: protected */
    public k.b r() {
        return k.b.DeferredValue;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int a(e eVar) {
        return 0;
    }
}
