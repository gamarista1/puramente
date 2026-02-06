package com.revenuecat.purchases.google;

import yf.C6798l;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6798l f59503a;

    public /* synthetic */ b(C6798l lVar) {
        this.f59503a = lVar;
    }

    public final void run() {
        BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$0(this.f59503a);
    }
}
