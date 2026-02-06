package com.revenuecat.purchases.amazon;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AmazonBilling f59465a;

    public /* synthetic */ b(AmazonBilling amazonBilling) {
        this.f59465a = amazonBilling;
    }

    public final void run() {
        AmazonBilling.startConnectionOnMainThread$lambda$0(this.f59465a);
    }
}
