package io.invertase.firebase.database;

import java.util.concurrent.Callable;

public final /* synthetic */ class Q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f71340a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71341b;

    public /* synthetic */ Q(String str, String str2) {
        this.f71340a = str;
        this.f71341b = str2;
    }

    public final Object call() {
        return P.b(this.f71340a, this.f71341b).i();
    }
}
