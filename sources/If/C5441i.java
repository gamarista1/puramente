package If;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

/* renamed from: If.i  reason: case insensitive filesystem */
final class C5441i extends C5425a {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f63685a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap f63686b = new ConcurrentHashMap();

    public C5441i(C6798l lVar) {
        C6496s.h(lVar, "compute");
        this.f63685a = lVar;
    }

    public Object a(Class cls) {
        C6496s.h(cls, SubscriberAttributeKt.JSON_NAME_KEY);
        ConcurrentHashMap concurrentHashMap = this.f63686b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return obj;
        }
        Object invoke = this.f63685a.invoke(cls);
        Object putIfAbsent = concurrentHashMap.putIfAbsent(cls, invoke);
        if (putIfAbsent == null) {
            return invoke;
        }
        return putIfAbsent;
    }
}
