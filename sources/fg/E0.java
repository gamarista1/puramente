package Fg;

import Pf.h;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class E0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f62923a = new b((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final E0 f62924b = new a();

    public static final class a extends E0 {
        a() {
        }

        public /* bridge */ /* synthetic */ B0 e(S s10) {
            return (B0) i(s10);
        }

        public boolean f() {
            return true;
        }

        public Void i(S s10) {
            C6496s.h(s10, SubscriberAttributeKt.JSON_NAME_KEY);
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends E0 {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ E0 f62925c;

        c(E0 e02) {
            this.f62925c = e02;
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public h d(h hVar) {
            C6496s.h(hVar, "annotations");
            return this.f62925c.d(hVar);
        }

        public B0 e(S s10) {
            C6496s.h(s10, SubscriberAttributeKt.JSON_NAME_KEY);
            return this.f62925c.e(s10);
        }

        public boolean f() {
            return this.f62925c.f();
        }

        public S g(S s10, N0 n02) {
            C6496s.h(s10, "topLevelType");
            C6496s.h(n02, "position");
            return this.f62925c.g(s10, n02);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final G0 c() {
        G0 g10 = G0.g(this);
        C6496s.g(g10, "create(...)");
        return g10;
    }

    public h d(h hVar) {
        C6496s.h(hVar, "annotations");
        return hVar;
    }

    public abstract B0 e(S s10);

    public boolean f() {
        return false;
    }

    public S g(S s10, N0 n02) {
        C6496s.h(s10, "topLevelType");
        C6496s.h(n02, "position");
        return s10;
    }

    public final E0 h() {
        return new c(this);
    }
}
