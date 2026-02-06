package o7;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C6496s;
import org.json.JSONObject;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    public static final O f47150a = new O();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f47151b = new ConcurrentHashMap();

    private O() {
    }

    public static final JSONObject a(String str) {
        C6496s.h(str, "accessToken");
        return (JSONObject) f47151b.get(str);
    }

    public static final void b(String str, JSONObject jSONObject) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(jSONObject, "value");
        f47151b.put(str, jSONObject);
    }
}
