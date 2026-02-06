package com.revenuecat.purchases.google;

import com.revenuecat.purchases.PurchasesError;
import yf.C6798l;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6798l f59506a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PurchasesError f59507b;

    public /* synthetic */ e(C6798l lVar, PurchasesError purchasesError) {
        this.f59506a = lVar;
        this.f59507b = purchasesError;
    }

    public final void run() {
        BillingWrapper.sendErrorsToAllPendingRequests$lambda$31$lambda$30(this.f59506a, this.f59507b);
    }
}
