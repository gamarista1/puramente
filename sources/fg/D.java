package Fg;

import Pf.h;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class D extends E0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f62918e = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final E0 f62919c;

    /* renamed from: d  reason: collision with root package name */
    private final E0 f62920d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E0 a(E0 e02, E0 e03) {
            C6496s.h(e02, "first");
            C6496s.h(e03, "second");
            if (e02.f()) {
                return e03;
            }
            if (e03.f()) {
                return e02;
            }
            return new D(e02, e03, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ D(E0 e02, E0 e03, DefaultConstructorMarker defaultConstructorMarker) {
        this(e02, e03);
    }

    public static final E0 i(E0 e02, E0 e03) {
        return f62918e.a(e02, e03);
    }

    public boolean a() {
        if (this.f62919c.a() || this.f62920d.a()) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if (this.f62919c.b() || this.f62920d.b()) {
            return true;
        }
        return false;
    }

    public h d(h hVar) {
        C6496s.h(hVar, "annotations");
        return this.f62920d.d(this.f62919c.d(hVar));
    }

    public B0 e(S s10) {
        C6496s.h(s10, SubscriberAttributeKt.JSON_NAME_KEY);
        B0 e10 = this.f62919c.e(s10);
        if (e10 == null) {
            return this.f62920d.e(s10);
        }
        return e10;
    }

    public boolean f() {
        return false;
    }

    public S g(S s10, N0 n02) {
        C6496s.h(s10, "topLevelType");
        C6496s.h(n02, "position");
        return this.f62920d.g(this.f62919c.g(s10, n02), n02);
    }

    private D(E0 e02, E0 e03) {
        this.f62919c = e02;
        this.f62920d = e03;
    }
}
