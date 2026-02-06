package io.invertase.firebase.perf;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f71452a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f71453b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f71454c;

    public /* synthetic */ j(int i10, Bundle bundle, Bundle bundle2) {
        this.f71452a = i10;
        this.f71453b = bundle;
        this.f71454c = bundle2;
    }

    public final Object call() {
        return q.t(this.f71452a, this.f71453b, this.f71454c);
    }
}
