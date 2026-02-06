package qf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;
import qf.g;
import yf.C6798l;

/* renamed from: qf.b  reason: case insensitive filesystem */
public abstract class C6656b implements g.c {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f72633a;

    /* renamed from: b  reason: collision with root package name */
    private final g.c f72634b;

    public C6656b(g.c cVar, C6798l lVar) {
        C6496s.h(cVar, "baseKey");
        C6496s.h(lVar, "safeCast");
        this.f72633a = lVar;
        this.f72634b = cVar instanceof C6656b ? ((C6656b) cVar).f72634b : cVar;
    }

    public final boolean a(g.c cVar) {
        C6496s.h(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        if (cVar == this || this.f72634b == cVar) {
            return true;
        }
        return false;
    }

    public final g.b b(g.b bVar) {
        C6496s.h(bVar, "element");
        return (g.b) this.f72633a.invoke(bVar);
    }
}
