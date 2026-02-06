package Z1;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final Map f10386a = new LinkedHashMap();

    /* renamed from: Z1.a$a  reason: collision with other inner class name */
    public static final class C0192a extends a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0192a f10387b = new C0192a();

        private C0192a() {
        }

        public Object a(b bVar) {
            C6496s.h(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
            return null;
        }
    }

    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f10386a;
    }
}
