package com.revenuecat.purchases;

import android.app.Activity;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.N;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "purchaseRecord", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$2 extends C6498u implements C6798l {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
    final /* synthetic */ Boolean $isPersonalizedPrice;
    final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
    final /* synthetic */ N $previousProductId;
    final /* synthetic */ PurchasingData $purchasingData;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$2(N n10, PurchasesOrchestrator purchasesOrchestrator, Activity activity, String str, PurchasingData purchasingData, GoogleReplacementMode googleReplacementMode, PresentedOfferingContext presentedOfferingContext, Boolean bool) {
        super(1);
        this.$previousProductId = n10;
        this.this$0 = purchasesOrchestrator;
        this.$activity = activity;
        this.$appUserID = str;
        this.$purchasingData = purchasingData;
        this.$googleReplacementMode = googleReplacementMode;
        this.$presentedOfferingContext = presentedOfferingContext;
        this.$isPersonalizedPrice = bool;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((StoreTransaction) obj);
        return C6514M.f71813a;
    }

    public final void invoke(StoreTransaction storeTransaction) {
        C6496s.h(storeTransaction, "purchaseRecord");
        LogIntent logIntent = LogIntent.PURCHASE;
        String format = String.format(PurchaseStrings.FOUND_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$previousProductId.f71759a}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.this$0.billing.makePurchaseAsync(this.$activity, this.$appUserID, this.$purchasingData, new ReplaceProductInfo(storeTransaction, this.$googleReplacementMode), this.$presentedOfferingContext, this.$isPersonalizedPrice);
    }
}
