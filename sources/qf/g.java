package qf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import qf.e;
import yf.p;

public interface g {

    public static final class a {

        /* renamed from: qf.g$a$a  reason: collision with other inner class name */
        static final class C1052a extends C6498u implements p {

            /* renamed from: a  reason: collision with root package name */
            public static final C1052a f72644a = new C1052a();

            C1052a() {
                super(2);
            }

            /* renamed from: a */
            public final g invoke(g gVar, b bVar) {
                C6657c cVar;
                C6496s.h(gVar, "acc");
                C6496s.h(bVar, "element");
                g R02 = gVar.R0(bVar.getKey());
                h hVar = h.f72645a;
                if (R02 == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f72642c0;
                e eVar = (e) R02.b(bVar2);
                if (eVar == null) {
                    cVar = new C6657c(R02, bVar);
                } else {
                    g R03 = R02.R0(bVar2);
                    if (R03 == hVar) {
                        return new C6657c(bVar, eVar);
                    }
                    cVar = new C6657c(new C6657c(R03, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            C6496s.h(gVar2, "context");
            if (gVar2 == h.f72645a) {
                return gVar;
            }
            return (g) gVar2.f0(gVar, C1052a.f72644a);
        }
    }

    public interface b extends g {

        public static final class a {
            public static Object a(b bVar, Object obj, p pVar) {
                C6496s.h(pVar, "operation");
                return pVar.invoke(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                C6496s.h(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
                if (!C6496s.c(bVar.getKey(), cVar)) {
                    return null;
                }
                C6496s.f(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c cVar) {
                C6496s.h(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
                if (C6496s.c(bVar.getKey(), cVar)) {
                    return h.f72645a;
                }
                return bVar;
            }

            public static g d(b bVar, g gVar) {
                C6496s.h(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        b b(c cVar);

        c getKey();
    }

    public interface c {
    }

    g R0(c cVar);

    b b(c cVar);

    Object f0(Object obj, p pVar);

    g n1(g gVar);
}
