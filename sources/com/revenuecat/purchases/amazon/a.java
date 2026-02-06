package com.revenuecat.purchases.amazon;

import yf.C6798l;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6798l f59464a;

    public /* synthetic */ a(C6798l lVar) {
        this.f59464a = lVar;
    }

    public final void run() {
        AmazonBilling.executePendingRequests$lambda$9$lambda$8(this.f59464a);
    }
}
