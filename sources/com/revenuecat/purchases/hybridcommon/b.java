package com.revenuecat.purchases.hybridcommon;

import com.revenuecat.purchases.interfaces.Callback;

public final /* synthetic */ class b implements Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnResultAny f59533a;

    public /* synthetic */ b(OnResultAny onResultAny) {
        this.f59533a = onResultAny;
    }

    public final void onReceived(Object obj) {
        CommonKt.canMakePayments$lambda$3(this.f59533a, (Boolean) obj);
    }
}
