package com.revenuecat.purchases.amazon.handler;

import com.amazon.device.iap.model.RequestId;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProductDataHandler f59466a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RequestId f59467b;

    public /* synthetic */ a(ProductDataHandler productDataHandler, RequestId requestId) {
        this.f59466a = productDataHandler;
        this.f59467b = requestId;
    }

    public final void run() {
        ProductDataHandler.addTimeoutToProductDataRequest$lambda$6(this.f59466a, this.f59467b);
    }
}
