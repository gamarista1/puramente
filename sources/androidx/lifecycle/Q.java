package androidx.lifecycle;

import androidx.lifecycle.C1790m;
import kotlin.jvm.internal.C6496s;

public final class Q implements C1795s {

    /* renamed from: a  reason: collision with root package name */
    private final U f17162a;

    public Q(U u10) {
        C6496s.h(u10, "provider");
        this.f17162a = u10;
    }

    public void f(C1798v vVar, C1790m.a aVar) {
        C6496s.h(vVar, "source");
        C6496s.h(aVar, "event");
        if (aVar == C1790m.a.ON_CREATE) {
            vVar.getLifecycle().d(this);
            this.f17162a.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
