package L4;

import kotlin.jvm.internal.C6496s;

public final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f32515a;

    public g(Object obj) {
        this.f32515a = obj;
    }

    public Object a() {
        return get();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && C6496s.c(this.f32515a, ((g) obj).f32515a)) {
            return true;
        }
        return false;
    }

    public Object get() {
        return this.f32515a;
    }

    public int hashCode() {
        Object obj = this.f32515a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "ValueProvider(value=" + this.f32515a + ')';
    }
}
