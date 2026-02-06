package com.revenuecat.purchases;

import yf.C6787a;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6787a f59500a;

    public /* synthetic */ f(C6787a aVar) {
        this.f59500a = aVar;
    }

    public final void run() {
        PurchasesOrchestrator.enqueue$lambda$12(this.f59500a);
    }
}
