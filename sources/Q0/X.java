package Q0;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class X extends V {

    /* renamed from: a  reason: collision with root package name */
    private final String f5301a;

    public X(String str) {
        super((DefaultConstructorMarker) null);
        this.f5301a = str;
    }

    public final String a() {
        return this.f5301a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof X) && C6496s.c(this.f5301a, ((X) obj).f5301a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5301a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f5301a + ')';
    }
}
