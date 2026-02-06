package We;

import ff.C5868v;
import java.util.Map;
import p003if.b;
import p003if.h;

/* renamed from: We.b0  reason: case insensitive filesystem */
public final class C5618b0 {

    /* renamed from: a  reason: collision with root package name */
    private C5868v f65802a;

    /* renamed from: b  reason: collision with root package name */
    private Map f65803b;

    /* renamed from: We.b0$a */
    public static final class a {
    }

    public C5618b0(C5618b0 b0Var) {
        this.f65802a = b0Var.f65802a;
        Map b10 = b.b(b0Var.f65803b);
        if (b10 != null) {
            this.f65803b = b10;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5618b0)) {
            return false;
        }
        return this.f65802a.equals(((C5618b0) obj).f65802a);
    }

    public int hashCode() {
        return h.b(this.f65802a);
    }
}
