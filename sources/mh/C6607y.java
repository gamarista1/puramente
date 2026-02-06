package mh;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ih.f;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import yf.C6787a;

/* renamed from: mh.y  reason: case insensitive filesystem */
public final class C6607y {

    /* renamed from: a  reason: collision with root package name */
    private final Map f72224a = C6606x.a(16);

    /* renamed from: mh.y$a */
    public static final class a {
    }

    public final Object a(f fVar, a aVar) {
        Object obj;
        C6496s.h(fVar, "descriptor");
        C6496s.h(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        Map map = (Map) this.f72224a.get(fVar);
        if (map != null) {
            obj = map.get(aVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public final Object b(f fVar, a aVar, C6787a aVar2) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(aVar2, "defaultValue");
        Object a10 = a(fVar, aVar);
        if (a10 != null) {
            return a10;
        }
        Object invoke = aVar2.invoke();
        c(fVar, aVar, invoke);
        return invoke;
    }

    public final void c(f fVar, a aVar, Object obj) {
        C6496s.h(fVar, "descriptor");
        C6496s.h(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(obj, "value");
        Map map = this.f72224a;
        Object obj2 = map.get(fVar);
        if (obj2 == null) {
            obj2 = C6606x.a(2);
            map.put(fVar, obj2);
        }
        ((Map) obj2).put(aVar, obj);
    }
}
