package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;

public final /* synthetic */ class a implements RedeemWebPurchaseListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnResult f59532a;

    public /* synthetic */ a(OnResult onResult) {
        this.f59532a = onResult;
    }

    public final void handleResult(RedeemWebPurchaseListener.Result result) {
        CommonKt.redeemWebPurchase$lambda$11(this.f59532a, result);
    }
}
