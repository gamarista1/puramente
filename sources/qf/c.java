package Qf;

import Of.C5487e;
import Of.g0;
import kotlin.jvm.internal.C6496s;

public interface c {

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f64720a = new a();

        private a() {
        }

        public boolean a(C5487e eVar, g0 g0Var) {
            C6496s.h(eVar, "classDescriptor");
            C6496s.h(g0Var, "functionDescriptor");
            return true;
        }
    }

    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f64721a = new b();

        private b() {
        }

        public boolean a(C5487e eVar, g0 g0Var) {
            C6496s.h(eVar, "classDescriptor");
            C6496s.h(g0Var, "functionDescriptor");
            return !g0Var.getAnnotations().n0(d.a());
        }
    }

    boolean a(C5487e eVar, g0 g0Var);
}
