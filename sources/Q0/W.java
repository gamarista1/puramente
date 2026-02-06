package Q0;

import kotlin.jvm.internal.C6496s;

public final class W {

    /* renamed from: a  reason: collision with root package name */
    private final String f5300a;

    public W(String str) {
        this.f5300a = str;
    }

    public final String a() {
        return this.f5300a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof W) && C6496s.c(this.f5300a, ((W) obj).f5300a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5300a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f5300a + ')';
    }
}
