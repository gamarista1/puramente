package com.revenuecat.purchases.google.usecase;

import com.android.billingclient.api.C3198e;
import kotlin.Metadata;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class BillingClientUseCase$processResult$2 extends C6494p implements C6798l {
    BillingClientUseCase$processResult$2(Object obj) {
        super(1, obj, BillingClientUseCase.class, "forwardError", "forwardError(Lcom/android/billingclient/api/BillingResult;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C3198e) obj);
        return C6514M.f71813a;
    }

    public final void invoke(C3198e eVar) {
        C6496s.h(eVar, "p0");
        ((BillingClientUseCase) this.receiver).forwardError(eVar);
    }
}
