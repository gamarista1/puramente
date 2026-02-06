package com.revenuecat.purchases.google.usecase;

import kotlin.Metadata;
import kotlin.jvm.internal.C6494p;
import yf.C6798l;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class BillingClientUseCase$processResult$1 extends C6494p implements C6798l {
    BillingClientUseCase$processResult$1(Object obj) {
        super(1, obj, BillingClientUseCase.class, "onOk", "onOk(Ljava/lang/Object;)V", 0);
    }

    public final void invoke(T t10) {
        ((BillingClientUseCase) this.receiver).onOk(t10);
    }
}
