package u;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

/* renamed from: u.c  reason: case insensitive filesystem */
public final class C2666c {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap f26376a;

    public C2666c(int i10, float f10) {
        this.f26376a = new LinkedHashMap(i10, f10, true);
    }

    public final Object a(Object obj) {
        C6496s.h(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.f26376a.get(obj);
    }

    public final Set b() {
        Set entrySet = this.f26376a.entrySet();
        C6496s.g(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean c() {
        return this.f26376a.isEmpty();
    }

    public final Object d(Object obj, Object obj2) {
        C6496s.h(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(obj2, "value");
        return this.f26376a.put(obj, obj2);
    }

    public final Object e(Object obj) {
        C6496s.h(obj, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.f26376a.remove(obj);
    }
}
