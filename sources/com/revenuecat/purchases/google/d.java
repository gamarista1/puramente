package com.revenuecat.purchases.google;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BillingWrapper f59505a;

    public /* synthetic */ d(BillingWrapper billingWrapper) {
        this.f59505a = billingWrapper;
    }

    public final void run() {
        BillingWrapper.endConnection$lambda$9(this.f59505a);
    }
}
