package Fg;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

public abstract class C0 implements B0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        if (a() == b02.a() && b() == b02.b() && getType().equals(b02.getType())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = b().hashCode();
        if (J0.w(getType())) {
            return (hashCode * 31) + 19;
        }
        int i11 = hashCode * 31;
        if (a()) {
            i10 = 17;
        } else {
            i10 = getType().hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        if (a()) {
            return "*";
        }
        if (b() == N0.INVARIANT) {
            return getType().toString();
        }
        return b() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + getType();
    }
}
