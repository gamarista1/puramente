package qf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;
import qf.g;

public interface e extends g.b {

    /* renamed from: c0  reason: collision with root package name */
    public static final b f72642c0 = b.f72643a;

    public static final class a {
        public static g.b a(e eVar, g.c cVar) {
            g.b b10;
            C6496s.h(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
            if (cVar instanceof C6656b) {
                C6656b bVar = (C6656b) cVar;
                if (!bVar.a(eVar.getKey()) || (b10 = bVar.b(eVar)) == null) {
                    return null;
                }
                return b10;
            } else if (e.f72642c0 != cVar) {
                return null;
            } else {
                C6496s.f(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        public static g b(e eVar, g.c cVar) {
            C6496s.h(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
            if (cVar instanceof C6656b) {
                C6656b bVar = (C6656b) cVar;
                if (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) {
                    return eVar;
                }
                return h.f72645a;
            } else if (e.f72642c0 == cVar) {
                return h.f72645a;
            } else {
                return eVar;
            }
        }
    }

    public static final class b implements g.c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f72643a = new b();

        private b() {
        }
    }

    void Q(C6658d dVar);

    C6658d V(C6658d dVar);
}
