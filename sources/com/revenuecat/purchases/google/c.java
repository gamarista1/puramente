package com.revenuecat.purchases.google;

import yf.C6798l;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6798l f59504a;

    public /* synthetic */ c(C6798l lVar) {
        this.f59504a = lVar;
    }

    public final void run() {
        BillingWrapper.executePendingRequests$lambda$3$lambda$2$lambda$1(this.f59504a);
    }
}
