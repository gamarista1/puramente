package Eb;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    private final Class f50680a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f50681b;

    private @interface a {
    }

    public E(Class cls, Class cls2) {
        this.f50680a = cls;
        this.f50681b = cls2;
    }

    public static E a(Class cls, Class cls2) {
        return new E(cls, cls2);
    }

    public static E b(Class cls) {
        return new E(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e10 = (E) obj;
        if (!this.f50681b.equals(e10.f50681b)) {
            return false;
        }
        return this.f50680a.equals(e10.f50680a);
    }

    public int hashCode() {
        return (this.f50681b.hashCode() * 31) + this.f50680a.hashCode();
    }

    public String toString() {
        if (this.f50680a == a.class) {
            return this.f50681b.getName();
        }
        return "@" + this.f50680a.getName() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f50681b.getName();
    }
}
