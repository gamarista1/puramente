package Id;

import androidx.collection.C1587a;
import ia.y;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import p9.C3942a;
import rh.C6707d;
import rh.C6708e;

public final class a extends y.a {

    /* renamed from: b  reason: collision with root package name */
    private final C6708e.a f51181b;

    /* renamed from: c  reason: collision with root package name */
    private final String f51182c;

    /* renamed from: d  reason: collision with root package name */
    private final C6707d f51183d;

    public a(C6708e.a aVar, String str, Map map) {
        C6496s.h(aVar, "callFactory");
        this.f51181b = aVar;
        this.f51182c = str;
        f(map);
    }

    private final void f(Map map) {
        if (map != null) {
            C1587a aVar = new C1587a();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    aVar.put(str, value);
                }
            }
            d(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C3942a c(y.g gVar) {
        C6496s.h(gVar, "defaultRequestProperties");
        return new C3942a(this.f51181b, this.f51182c, this.f51183d, gVar);
    }
}
