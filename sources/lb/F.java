package Lb;

import Tb.n;
import java.util.ArrayList;

abstract class F {

    public static class a extends F {

        /* renamed from: a  reason: collision with root package name */
        private final y f51699a;

        /* renamed from: b  reason: collision with root package name */
        private final l f51700b;

        a(y yVar, l lVar) {
            this.f51699a = yVar;
            this.f51700b = lVar;
        }

        public F a(Tb.b bVar) {
            return new a(this.f51699a, this.f51700b.x(bVar));
        }

        public n b() {
            return this.f51699a.J(this.f51700b, new ArrayList());
        }
    }

    public static class b extends F {

        /* renamed from: a  reason: collision with root package name */
        private final n f51701a;

        b(n nVar) {
            this.f51701a = nVar;
        }

        public F a(Tb.b bVar) {
            return new b(this.f51701a.k0(bVar));
        }

        public n b() {
            return this.f51701a;
        }
    }

    F() {
    }

    public abstract F a(Tb.b bVar);

    public abstract n b();
}
