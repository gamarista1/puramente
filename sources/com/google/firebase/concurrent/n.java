package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f57109a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p.b f57110b;

    public /* synthetic */ n(Callable callable, p.b bVar) {
        this.f57109a = callable;
        this.f57110b = bVar;
    }

    public final void run() {
        o.p(this.f57109a, this.f57110b);
    }
}
