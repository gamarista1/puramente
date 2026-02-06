package wh;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import rh.G;

/* renamed from: wh.h  reason: case insensitive filesystem */
public final class C6778h {

    /* renamed from: a  reason: collision with root package name */
    private final Set f73859a = new LinkedHashSet();

    public final synchronized void a(G g10) {
        C6496s.h(g10, "route");
        this.f73859a.remove(g10);
    }

    public final synchronized void b(G g10) {
        C6496s.h(g10, "failedRoute");
        this.f73859a.add(g10);
    }

    public final synchronized boolean c(G g10) {
        C6496s.h(g10, "route");
        return this.f73859a.contains(g10);
    }
}
