package qf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Serializable;
import kotlin.jvm.internal.C6496s;
import qf.g;
import yf.p;

public final class h implements g, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final h f72645a = new h();
    private static final long serialVersionUID = 0;

    private h() {
    }

    private final Object readResolve() {
        return f72645a;
    }

    public g R0(g.c cVar) {
        C6496s.h(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return this;
    }

    public g.b b(g.c cVar) {
        C6496s.h(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return null;
    }

    public Object f0(Object obj, p pVar) {
        C6496s.h(pVar, "operation");
        return obj;
    }

    public int hashCode() {
        return 0;
    }

    public g n1(g gVar) {
        C6496s.h(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
