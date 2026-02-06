package com.revenuecat.purchases.hybridcommon;

import Sg.p;
import android.app.Activity;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Llf/M;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1 extends C6498u implements C6798l {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Boolean $googleIsPersonalizedPrice;
    final /* synthetic */ String $googleOldProductId;
    final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
    final /* synthetic */ OnResult $onResult;
    final /* synthetic */ String $optionIdentifier;
    final /* synthetic */ Map<String, Object> $presentedOfferingContext;
    final /* synthetic */ String $productIdentifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1(Activity activity, Map<String, ? extends Object> map, String str, Boolean bool, OnResult onResult, String str2, String str3, GoogleReplacementMode googleReplacementMode) {
        super(1);
        this.$activity = activity;
        this.$presentedOfferingContext = map;
        this.$googleOldProductId = str;
        this.$googleIsPersonalizedPrice = bool;
        this.$onResult = onResult;
        this.$productIdentifier = str2;
        this.$optionIdentifier = str3;
        this.$googleReplacementMode = googleReplacementMode;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) (List) obj);
        return C6514M.f71813a;
    }

    public final void invoke(List<? extends StoreProduct> list) {
        String str;
        SubscriptionOption subscriptionOption;
        PresentedOfferingContext presentedOfferingContext;
        Object obj;
        C6496s.h(list, "storeProducts");
        String str2 = this.$productIdentifier;
        String str3 = this.$optionIdentifier;
        Iterator it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                subscriptionOption = null;
                break;
            }
            StoreProduct storeProduct = (StoreProduct) it.next();
            SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
            if (subscriptionOptions != null) {
                Iterator it2 = subscriptionOptions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    SubscriptionOption subscriptionOption2 = (SubscriptionOption) obj;
                    if (C6496s.c(storeProduct.getPurchasingData().getProductId(), str2) && C6496s.c(subscriptionOption2.getId(), str3)) {
                        break;
                    }
                }
                subscriptionOption = (SubscriptionOption) obj;
                continue;
            } else {
                subscriptionOption = null;
                continue;
            }
            if (subscriptionOption != null) {
                break;
            }
        }
        if (subscriptionOption != null) {
            PurchaseParams.Builder builder = new PurchaseParams.Builder(this.$activity, subscriptionOption);
            Map<String, Object> map = this.$presentedOfferingContext;
            if (!(map == null || (presentedOfferingContext = CommonKt.toPresentedOfferingContext(map)) == null)) {
                builder.presentedOfferingContext(presentedOfferingContext);
            }
            String str4 = this.$googleOldProductId;
            if (str4 != null && !p.d0(str4)) {
                str = str4;
            }
            if (str != null) {
                GoogleReplacementMode googleReplacementMode = this.$googleReplacementMode;
                builder.oldProductId(str);
                if (googleReplacementMode != null) {
                    builder.googleReplacementMode(googleReplacementMode);
                }
            }
            Boolean bool = this.$googleIsPersonalizedPrice;
            if (bool != null) {
                builder.isPersonalizedPrice(bool.booleanValue());
            }
            ListenerConversionsCommonKt.purchaseWith(Purchases.Companion.getSharedInstance(), builder.build(), CommonKt.getPurchaseErrorFunction(this.$onResult), CommonKt.getPurchaseCompletedFunction(this.$onResult));
            return;
        }
        this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product " + this.$productIdentifier + ':' + this.$optionIdentifier), (Map) null, 1, (Object) null));
    }
}
