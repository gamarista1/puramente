package io.invertase.firebase.database;

import java.util.concurrent.Callable;

public final /* synthetic */ class S implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f71363a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71364b;

    public /* synthetic */ S(String str, String str2) {
        this.f71363a = str;
        this.f71364b = str2;
    }

    public final Object call() {
        return P.b(this.f71363a, this.f71364b).h();
    }
}
