package androidx.lifecycle;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

public class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f17212a = new LinkedHashMap();

    public final void a() {
        for (a0 clear$lifecycle_viewmodel_release : this.f17212a.values()) {
            clear$lifecycle_viewmodel_release.clear$lifecycle_viewmodel_release();
        }
        this.f17212a.clear();
    }

    public final a0 b(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return (a0) this.f17212a.get(str);
    }

    public final Set c() {
        return new HashSet(this.f17212a.keySet());
    }

    public final void d(String str, a0 a0Var) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(a0Var, "viewModel");
        a0 a0Var2 = (a0) this.f17212a.put(str, a0Var);
        if (a0Var2 != null) {
            a0Var2.clear$lifecycle_viewmodel_release();
        }
    }
}
