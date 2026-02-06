package expo.modules.fetch;

import kotlin.jvm.internal.C6496s;
import rh.C;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private C f60415a;

    public c(C c10) {
        this.f60415a = c10;
    }

    public final void a(C c10) {
        this.f60415a = c10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && C6496s.c(this.f60415a, ((c) obj).f60415a);
    }

    public int hashCode() {
        C c10 = this.f60415a;
        if (c10 == null) {
            return 0;
        }
        return c10.hashCode();
    }

    public String toString() {
        C c10 = this.f60415a;
        return "RequestHolder(request=" + c10 + ")";
    }
}
