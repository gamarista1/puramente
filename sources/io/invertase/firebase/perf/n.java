package io.invertase.firebase.perf;

import java.util.concurrent.Callable;

public final /* synthetic */ class n implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f71462a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f71463b;

    public /* synthetic */ n(String str, int i10) {
        this.f71462a = str;
        this.f71463b = i10;
    }

    public final Object call() {
        return q.q(this.f71462a, this.f71463b);
    }
}
