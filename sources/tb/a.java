package Tb;

import Tb.k;
import Tb.n;

public class a extends k {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f52501c;

    public a(Boolean bool, n nVar) {
        super(nVar);
        this.f52501c = bool.booleanValue();
    }

    /* renamed from: A */
    public a V(n nVar) {
        return new a(Boolean.valueOf(this.f52501c), nVar);
    }

    public String L(n.b bVar) {
        return t(bVar) + "boolean:" + this.f52501c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f52501c != aVar.f52501c || !this.f52536a.equals(aVar.f52536a)) {
            return false;
        }
        return true;
    }

    public Object getValue() {
        return Boolean.valueOf(this.f52501c);
    }

    public int hashCode() {
        boolean z10 = this.f52501c;
        return (z10 ? 1 : 0) + this.f52536a.hashCode();
    }

    /* access modifiers changed from: protected */
    public k.b r() {
        return k.b.Boolean;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int a(a aVar) {
        boolean z10 = this.f52501c;
        if (z10 == aVar.f52501c) {
            return 0;
        }
        if (z10) {
            return 1;
        }
        return -1;
    }
}
