package com.revenuecat.purchases.hybridcommon;

import Sg.p;
import android.app.Activity;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "offerings", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class CommonKt$purchasePackage$2 extends C6498u implements C6798l {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Boolean $googleIsPersonalizedPrice;
    final /* synthetic */ String $googleOldProductId;
    final /* synthetic */ GoogleReplacementMode $googleReplacementMode;
    final /* synthetic */ OnResult $onResult;
    final /* synthetic */ String $packageIdentifier;
    final /* synthetic */ Map<String, Object> $presentedOfferingContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonKt$purchasePackage$2(Map<String, ? extends Object> map, OnResult onResult, Activity activity, String str, GoogleReplacementMode googleReplacementMode, Boolean bool, String str2) {
        super(1);
        this.$presentedOfferingContext = map;
        this.$onResult = onResult;
        this.$activity = activity;
        this.$googleOldProductId = str;
        this.$googleReplacementMode = googleReplacementMode;
        this.$googleIsPersonalizedPrice = bool;
        this.$packageIdentifier = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Offerings) obj);
        return C6514M.f71813a;
    }

    public final void invoke(Offerings offerings) {
        Package packageR;
        List<Package> availablePackages;
        Object obj;
        C6496s.h(offerings, "offerings");
        PresentedOfferingContext presentedOfferingContext = CommonKt.toPresentedOfferingContext(this.$presentedOfferingContext);
        if (presentedOfferingContext == null) {
            this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no or invalid presented offering context data provided to make this purchase"), (Map) null, 1, (Object) null));
            return;
        }
        Offering offering = offerings.get(presentedOfferingContext.getOfferingIdentifier());
        if (offering == null || (availablePackages = offering.getAvailablePackages()) == null) {
            packageR = null;
        } else {
            String str = this.$packageIdentifier;
            Iterator it = availablePackages.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p.v(((Package) obj).getIdentifier(), str, true)) {
                    break;
                }
            }
            packageR = (Package) obj;
        }
        if (packageR != null) {
            PurchaseParams.Builder builder = new PurchaseParams.Builder(this.$activity, packageR);
            builder.presentedOfferingContext(presentedOfferingContext);
            String str2 = this.$googleOldProductId;
            if (str2 != null && !p.d0(str2)) {
                builder.oldProductId(this.$googleOldProductId);
                GoogleReplacementMode googleReplacementMode = this.$googleReplacementMode;
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
        this.$onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product for package " + this.$packageIdentifier), (Map) null, 1, (Object) null));
    }
}
