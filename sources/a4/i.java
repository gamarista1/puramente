package A4;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import x1.d;

public class i {

    /* renamed from: a  reason: collision with root package name */
    Object f29374a;

    /* renamed from: b  reason: collision with root package name */
    Object f29375b;

    private static boolean a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public void b(Object obj, Object obj2) {
        this.f29374a = obj;
        this.f29375b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!a(dVar.f28213a, this.f29374a) || !a(dVar.f28214b, this.f29375b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        Object obj = this.f29374a;
        int i11 = 0;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        Object obj2 = this.f29375b;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        }
        return i10 ^ i11;
    }

    public String toString() {
        return "Pair{" + this.f29374a + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f29375b + "}";
    }
}
