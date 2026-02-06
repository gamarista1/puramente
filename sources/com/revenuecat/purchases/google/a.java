package com.revenuecat.purchases.google;

import com.android.billingclient.api.C3198e;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C3198e f59501a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BillingWrapper f59502b;

    public /* synthetic */ a(C3198e eVar, BillingWrapper billingWrapper) {
        this.f59501a = eVar;
        this.f59502b = billingWrapper;
    }

    public final void run() {
        BillingWrapper.onBillingSetupFinished$lambda$18(this.f59501a, this.f59502b);
    }
}
