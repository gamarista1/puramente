package com.revenuecat.purchases;

import J4.C3047m;
import com.android.billingclient.api.C3198e;
import com.revenuecat.purchases.PurchasesOrchestrator;
import java.util.List;

public final /* synthetic */ class g implements C3047m {
    public final void onPurchasesUpdated(C3198e eVar, List list) {
        PurchasesOrchestrator.Companion.canMakePayments$lambda$0(eVar, list);
    }
}
