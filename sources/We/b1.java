package We;

import java.util.Objects;
import p003if.f;

public final class b1 {

    /* renamed from: b  reason: collision with root package name */
    public static final b1 f65804b = new b1("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));

    /* renamed from: a  reason: collision with root package name */
    private final f f65805a;

    public static final class a {
    }

    public b1(String str) {
        Objects.requireNonNull(str, "value is required");
        this.f65805a = new f(new a1(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        return ((String) this.f65805a.a()).equals(((b1) obj).f65805a.a());
    }

    public int hashCode() {
        return ((String) this.f65805a.a()).hashCode();
    }

    public String toString() {
        return (String) this.f65805a.a();
    }

    public b1() {
        this.f65805a = new f(new Z0());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String b(String str) {
        return str;
    }
}
