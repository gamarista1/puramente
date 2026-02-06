package Z1;

import Z1.a;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b extends a {
    public b() {
        this((a) null, 1, (DefaultConstructorMarker) null);
    }

    public Object a(a.b bVar) {
        C6496s.h(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return b().get(bVar);
    }

    public final void c(a.b bVar, Object obj) {
        C6496s.h(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
        b().put(bVar, obj);
    }

    public b(a aVar) {
        C6496s.h(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.C0192a.f10387b : aVar);
    }
}
