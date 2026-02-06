package com.revenuecat.purchases.google.usecase;

import J4.C3044j;
import com.android.billingclient.api.C3198e;
import java.util.List;
import yf.C6798l;

public final /* synthetic */ class e implements C3044j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ QueryProductDetailsUseCase f59519a;

    public /* synthetic */ e(QueryProductDetailsUseCase queryProductDetailsUseCase) {
        this.f59519a = queryProductDetailsUseCase;
    }

    public final void a(C3198e eVar, List list) {
        BillingClientUseCase.processResult$default(this.f59519a, eVar, list, (C6798l) null, (C6798l) null, 12, (Object) null);
    }
}
