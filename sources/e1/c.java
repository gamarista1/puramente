package E1;

import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f1739a = new ArrayList();

    public final void a(b bVar) {
        C6496s.h(bVar, "listener");
        this.f1739a.add(bVar);
    }

    public final void b() {
        for (int p10 = C6565s.p(this.f1739a); -1 < p10; p10--) {
            ((b) this.f1739a.get(p10)).c();
        }
    }

    public final void c(b bVar) {
        C6496s.h(bVar, "listener");
        this.f1739a.remove(bVar);
    }
}
