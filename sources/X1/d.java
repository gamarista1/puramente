package x1;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f28213a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f28214b;

    public d(Object obj, Object obj2) {
        this.f28213a = obj;
        this.f28214b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!c.a(dVar.f28213a, this.f28213a) || !c.a(dVar.f28214b, this.f28214b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        Object obj = this.f28213a;
        int i11 = 0;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        Object obj2 = this.f28214b;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i10 ^ i11;
    }

    public String toString() {
        return "Pair{" + this.f28213a + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f28214b + "}";
    }
}
