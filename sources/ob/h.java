package Ob;

import Lb.l;
import Lb.q;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public q f52116a;

    /* renamed from: b  reason: collision with root package name */
    public l f52117b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f52116a.equals(hVar.f52116a)) {
            return false;
        }
        return this.f52117b.equals(hVar.f52117b);
    }

    public int hashCode() {
        return (this.f52116a.hashCode() * 31) + this.f52117b.hashCode();
    }
}
