package com.revenuecat.purchases.common;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f59477a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Dispatcher f59478b;

    public /* synthetic */ b(Runnable runnable, Dispatcher dispatcher) {
        this.f59477a = runnable;
        this.f59478b = dispatcher;
    }

    public final void run() {
        Dispatcher.enqueue$lambda$2$lambda$1(this.f59477a, this.f59478b);
    }
}
