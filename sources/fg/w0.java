package Fg;

import Of.m0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.O;

public abstract class w0 extends E0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a f63074c = new a((DefaultConstructorMarker) null);

    public static final class a {

        /* renamed from: Fg.w0$a$a  reason: collision with other inner class name */
        public static final class C0934a extends w0 {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Map f63075d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ boolean f63076e;

            C0934a(Map map, boolean z10) {
                this.f63075d = map;
                this.f63076e = z10;
            }

            public boolean a() {
                return this.f63076e;
            }

            public boolean f() {
                return this.f63075d.isEmpty();
            }

            public B0 k(v0 v0Var) {
                C6496s.h(v0Var, SubscriberAttributeKt.JSON_NAME_KEY);
                return (B0) this.f63075d.get(v0Var);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ w0 e(a aVar, Map map, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.d(map, z10);
        }

        public final E0 a(S s10) {
            C6496s.h(s10, "kotlinType");
            return b(s10.N0(), s10.L0());
        }

        public final E0 b(v0 v0Var, List list) {
            C6496s.h(v0Var, "typeConstructor");
            C6496s.h(list, "arguments");
            List parameters = v0Var.getParameters();
            C6496s.g(parameters, "getParameters(...)");
            m0 m0Var = (m0) C6565s.B0(parameters);
            if (m0Var == null || !m0Var.R()) {
                return new M(parameters, list);
            }
            List parameters2 = v0Var.getParameters();
            C6496s.g(parameters2, "getParameters(...)");
            Iterable<m0> iterable = parameters2;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (m0 l10 : iterable) {
                arrayList.add(l10.l());
            }
            return e(this, O.w(C6565s.n1(arrayList, list)), false, 2, (Object) null);
        }

        public final w0 c(Map map) {
            C6496s.h(map, "map");
            return e(this, map, false, 2, (Object) null);
        }

        public final w0 d(Map map, boolean z10) {
            C6496s.h(map, "map");
            return new C0934a(map, z10);
        }

        private a() {
        }
    }

    public static final E0 i(v0 v0Var, List list) {
        return f63074c.b(v0Var, list);
    }

    public static final w0 j(Map map) {
        return f63074c.c(map);
    }

    public B0 e(S s10) {
        C6496s.h(s10, SubscriberAttributeKt.JSON_NAME_KEY);
        return k(s10.N0());
    }

    public abstract B0 k(v0 v0Var);
}
