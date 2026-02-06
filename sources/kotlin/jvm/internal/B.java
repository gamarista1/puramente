package kotlin.jvm.internal;

public final class B implements C6486h {

    /* renamed from: a  reason: collision with root package name */
    private final Class f71752a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71753b;

    public B(Class cls, String str) {
        C6496s.h(cls, "jClass");
        C6496s.h(str, "moduleName");
        this.f71752a = cls;
        this.f71753b = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof B) || !C6496s.c(f(), ((B) obj).f())) {
            return false;
        }
        return true;
    }

    public Class f() {
        return this.f71752a;
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString() + " (Kotlin reflection is not available)";
    }
}
