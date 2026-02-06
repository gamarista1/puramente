package Of;

import sf.C6714a;

/* renamed from: Of.f  reason: case insensitive filesystem */
public enum C5488f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY((String) null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f64490a;

    static {
        C5488f[] a10;
        f64489i = C6714a.a(a10);
    }

    private C5488f(String str) {
        this.f64490a = str;
    }

    public final boolean b() {
        if (this == OBJECT || this == ENUM_ENTRY) {
            return true;
        }
        return false;
    }
}
