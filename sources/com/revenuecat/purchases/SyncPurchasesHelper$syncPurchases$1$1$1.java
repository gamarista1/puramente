package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SyncPurchasesHelper$syncPurchases$1$1$1 extends C6498u implements C6798l {
    final /* synthetic */ boolean $appInBackground;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ List<PurchasesError> $errors;
    final /* synthetic */ boolean $isRestore;
    final /* synthetic */ StoreTransaction $lastPurchase;
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ SyncPurchasesHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SyncPurchasesHelper$syncPurchases$1$1$1(StoreTransaction storeTransaction, StoreTransaction storeTransaction2, List<PurchasesError> list, SyncPurchasesHelper syncPurchasesHelper, String str, boolean z10, boolean z11, C6798l lVar, C6798l lVar2) {
        super(1);
        this.$purchase = storeTransaction;
        this.$lastPurchase = storeTransaction2;
        this.$errors = list;
        this.this$0 = syncPurchasesHelper;
        this.$appUserID = str;
        this.$appInBackground = z10;
        this.$isRestore = z11;
        this.$onSuccess = lVar;
        this.$onError = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return C6514M.f71813a;
    }

    public final void invoke(CustomerInfo customerInfo) {
        C6496s.h(customerInfo, "it");
        LogIntent logIntent = LogIntent.PURCHASE;
        String format = String.format(PurchaseStrings.PURCHASE_SYNCED, Arrays.copyOf(new Object[]{this.$purchase}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        SyncPurchasesHelper$syncPurchases$1.invoke$handleLastPurchase(this.$errors, this.this$0, this.$appUserID, this.$appInBackground, this.$isRestore, this.$onSuccess, this.$onError, this.$purchase, this.$lastPurchase);
    }
}
