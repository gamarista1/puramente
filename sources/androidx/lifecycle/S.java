package androidx.lifecycle;

import androidx.lifecycle.C1790m;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Closeable;
import kotlin.jvm.internal.C6496s;
import x3.C2912d;

public final class S implements C1795s, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final String f17163a;

    /* renamed from: b  reason: collision with root package name */
    private final P f17164b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17165c;

    public S(String str, P p10) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        C6496s.h(p10, "handle");
        this.f17163a = str;
        this.f17164b = p10;
    }

    public final void a(C2912d dVar, C1790m mVar) {
        C6496s.h(dVar, "registry");
        C6496s.h(mVar, "lifecycle");
        if (!this.f17165c) {
            this.f17165c = true;
            mVar.a(this);
            dVar.h(this.f17163a, this.f17164b.e());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    public final P b() {
        return this.f17164b;
    }

    public void close() {
    }

    public void f(C1798v vVar, C1790m.a aVar) {
        C6496s.h(vVar, "source");
        C6496s.h(aVar, "event");
        if (aVar == C1790m.a.ON_DESTROY) {
            this.f17165c = false;
            vVar.getLifecycle().d(this);
        }
    }

    public final boolean o() {
        return this.f17165c;
    }
}
