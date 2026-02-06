package e;

import androidx.core.app.c;
import g.C2000c;
import lf.C6514M;

/* renamed from: e.a  reason: case insensitive filesystem */
public final class C1928a {

    /* renamed from: a  reason: collision with root package name */
    private C2000c f19469a;

    public final void a(Object obj, c cVar) {
        C6514M m10;
        C2000c cVar2 = this.f19469a;
        if (cVar2 != null) {
            cVar2.c(obj, cVar);
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void b(C2000c cVar) {
        this.f19469a = cVar;
    }

    public final void c() {
        C6514M m10;
        C2000c cVar = this.f19469a;
        if (cVar != null) {
            cVar.d();
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
