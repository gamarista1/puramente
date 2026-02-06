package qf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;
import qf.g;
import yf.p;

/* renamed from: qf.a  reason: case insensitive filesystem */
public abstract class C6655a implements g.b {

    /* renamed from: a  reason: collision with root package name */
    private final g.c f72632a;

    public C6655a(g.c cVar) {
        C6496s.h(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        this.f72632a = cVar;
    }

    public g R0(g.c cVar) {
        return g.b.a.c(this, cVar);
    }

    public g.b b(g.c cVar) {
        return g.b.a.b(this, cVar);
    }

    public Object f0(Object obj, p pVar) {
        return g.b.a.a(this, obj, pVar);
    }

    public g.c getKey() {
        return this.f72632a;
    }

    public g n1(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
