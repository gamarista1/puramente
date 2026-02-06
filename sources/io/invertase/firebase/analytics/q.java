package io.invertase.firebase.analytics;

import java.util.concurrent.Callable;

public final /* synthetic */ class q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f71122a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71123b;

    public /* synthetic */ q(v vVar, String str) {
        this.f71122a = vVar;
        this.f71123b = str;
    }

    public final Object call() {
        return this.f71122a.x(this.f71123b);
    }
}
