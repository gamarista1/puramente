package com.revenuecat.purchases.google;

import kotlin.Metadata;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class BillingWrapper$getStorefront$3 extends C6494p implements p {
    BillingWrapper$getStorefront$3(Object obj) {
        super(2, obj, BillingWrapper.class, "executeRequestOnUIThread", "executeRequestOnUIThread(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Long) obj, (C6798l) obj2);
        return C6514M.f71813a;
    }

    public final void invoke(Long l10, C6798l lVar) {
        C6496s.h(lVar, "p1");
        ((BillingWrapper) this.receiver).executeRequestOnUIThread(l10, lVar);
    }
}
