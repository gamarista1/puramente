package Tf;

import Of.i0;
import Uf.u;
import dg.C5815a;
import dg.C5816b;
import eg.C5835l;
import kotlin.jvm.internal.C6496s;

public final class l implements C5816b {

    /* renamed from: a  reason: collision with root package name */
    public static final l f65165a = new l();

    public static final class a implements C5815a {

        /* renamed from: b  reason: collision with root package name */
        private final u f65166b;

        public a(u uVar) {
            C6496s.h(uVar, "javaElement");
            this.f65166b = uVar;
        }

        public i0 b() {
            i0 i0Var = i0.f64498a;
            C6496s.g(i0Var, "NO_SOURCE_FILE");
            return i0Var;
        }

        /* renamed from: d */
        public u c() {
            return this.f65166b;
        }

        public String toString() {
            return a.class.getName() + ": " + c();
        }
    }

    private l() {
    }

    public C5815a a(C5835l lVar) {
        C6496s.h(lVar, "javaElement");
        return new a((u) lVar);
    }
}
