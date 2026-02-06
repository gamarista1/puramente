package Fg;

import Pf.h;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;

/* renamed from: Fg.z  reason: case insensitive filesystem */
public abstract class C5398z extends E0 {

    /* renamed from: c  reason: collision with root package name */
    private final E0 f63084c;

    public C5398z(E0 e02) {
        C6496s.h(e02, "substitution");
        this.f63084c = e02;
    }

    public boolean a() {
        return this.f63084c.a();
    }

    public h d(h hVar) {
        C6496s.h(hVar, "annotations");
        return this.f63084c.d(hVar);
    }

    public B0 e(S s10) {
        C6496s.h(s10, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.f63084c.e(s10);
    }

    public boolean f() {
        return this.f63084c.f();
    }

    public S g(S s10, N0 n02) {
        C6496s.h(s10, "topLevelType");
        C6496s.h(n02, "position");
        return this.f63084c.g(s10, n02);
    }
}
