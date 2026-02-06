package b2;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

/* renamed from: b2.f  reason: case insensitive filesystem */
public final class C1882f {

    /* renamed from: a  reason: collision with root package name */
    private final C1881e f19161a = new C1881e();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map f19162b = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Set f19163c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f19164d;

    /* access modifiers changed from: private */
    public final void g(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(AutoCloseable autoCloseable) {
        C6496s.h(autoCloseable, "closeable");
        if (this.f19164d) {
            g(autoCloseable);
            return;
        }
        synchronized (this.f19161a) {
            this.f19163c.add(autoCloseable);
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void e(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(autoCloseable, "closeable");
        if (this.f19164d) {
            g(autoCloseable);
            return;
        }
        synchronized (this.f19161a) {
            autoCloseable2 = (AutoCloseable) this.f19162b.put(str, autoCloseable);
        }
        g(autoCloseable2);
    }

    public final void f() {
        if (!this.f19164d) {
            this.f19164d = true;
            synchronized (this.f19161a) {
                try {
                    for (AutoCloseable a10 : this.f19162b.values()) {
                        g(a10);
                    }
                    for (AutoCloseable a11 : this.f19163c) {
                        g(a11);
                    }
                    this.f19163c.clear();
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final AutoCloseable h(String str) {
        AutoCloseable autoCloseable;
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        synchronized (this.f19161a) {
            autoCloseable = (AutoCloseable) this.f19162b.get(str);
        }
        return autoCloseable;
    }
}
