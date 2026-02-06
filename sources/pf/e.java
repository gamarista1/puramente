package Pf;

import Ng.a;
import com.amazon.a.a.o.b;
import sf.C6714a;

public enum e {
    FIELD((String) null, 1, (String) null),
    FILE((String) null, 1, (String) null),
    PROPERTY((String) null, 1, (String) null),
    PROPERTY_GETTER(b.au),
    PROPERTY_SETTER("set"),
    RECEIVER((String) null, 1, (String) null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f64595a;

    static {
        e[] a10;
        f64594l = C6714a.a(a10);
    }

    private e(String str) {
        this.f64595a = str == null ? a.f(name()) : str;
    }

    public final String b() {
        return this.f64595a;
    }
}
