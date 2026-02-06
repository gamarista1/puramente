package com.revenuecat.purchases.identity;

import yf.C6787a;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6787a f59539a;

    public /* synthetic */ a(C6787a aVar) {
        this.f59539a = aVar;
    }

    public final void run() {
        IdentityManager.enqueue$lambda$3(this.f59539a);
    }
}
