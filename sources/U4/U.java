package u4;

import java.util.Arrays;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    private final Object f48430a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f48431b;

    public U(Object obj) {
        this.f48430a = obj;
        this.f48431b = null;
    }

    public Throwable a() {
        return this.f48431b;
    }

    public Object b() {
        return this.f48430a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u10 = (U) obj;
        if (b() != null && b().equals(u10.b())) {
            return true;
        }
        if (a() == null || u10.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public U(Throwable th2) {
        this.f48431b = th2;
        this.f48430a = null;
    }
}
