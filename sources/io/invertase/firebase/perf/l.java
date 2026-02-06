package io.invertase.firebase.perf;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f71458a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f71459b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f71460c;

    public /* synthetic */ l(int i10, Bundle bundle, Bundle bundle2) {
        this.f71458a = i10;
        this.f71459b = bundle;
        this.f71460c = bundle2;
    }

    public final Object call() {
        return q.r(this.f71458a, this.f71459b, this.f71460c);
    }
}
