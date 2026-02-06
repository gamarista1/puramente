package io.invertase.firebase.analytics;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final /* synthetic */ class o implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f71118a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f71119b;

    public /* synthetic */ o(v vVar, Bundle bundle) {
        this.f71118a = vVar;
        this.f71119b = bundle;
    }

    public final Object call() {
        return this.f71118a.u(this.f71119b);
    }
}
