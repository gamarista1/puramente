package Gg;

import Fg.S;
import Fg.r;
import Fg.v0;
import Jg.i;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.H;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import ng.b;
import yf.C6787a;
import yg.C6812k;

public abstract class g extends r {

    public static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f63180a = new a();

        private a() {
        }

        public C5487e b(b bVar) {
            C6496s.h(bVar, "classId");
            return null;
        }

        public C6812k c(C5487e eVar, C6787a aVar) {
            C6496s.h(eVar, "classDescriptor");
            C6496s.h(aVar, "compute");
            return (C6812k) aVar.invoke();
        }

        public boolean d(H h10) {
            C6496s.h(h10, "moduleDescriptor");
            return false;
        }

        public boolean e(v0 v0Var) {
            C6496s.h(v0Var, "typeConstructor");
            return false;
        }

        public Collection g(C5487e eVar) {
            C6496s.h(eVar, "classDescriptor");
            Collection l10 = eVar.l().l();
            C6496s.g(l10, "getSupertypes(...)");
            return l10;
        }

        /* renamed from: h */
        public S a(i iVar) {
            C6496s.h(iVar, "type");
            return (S) iVar;
        }

        /* renamed from: i */
        public C5487e f(C5495m mVar) {
            C6496s.h(mVar, "descriptor");
            return null;
        }
    }

    public abstract C5487e b(b bVar);

    public abstract C6812k c(C5487e eVar, C6787a aVar);

    public abstract boolean d(H h10);

    public abstract boolean e(v0 v0Var);

    public abstract C5490h f(C5495m mVar);

    public abstract Collection g(C5487e eVar);

    public abstract S h(i iVar);
}
