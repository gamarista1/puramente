package com.revenuecat.purchases;

import yf.C6787a;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6787a f59470a;

    public /* synthetic */ b(C6787a aVar) {
        this.f59470a = aVar;
    }

    public final void run() {
        CustomerInfoUpdateHandler.dispatch$lambda$5(this.f59470a);
    }
}
