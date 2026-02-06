package com.revenuecat.purchases.google;

import com.android.billingclient.api.C3197d;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/android/billingclient/api/d$a;", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Llf/M;", "setUpgradeInfo", "(Lcom/android/billingclient/api/d$a;Lcom/revenuecat/purchases/common/ReplaceProductInfo;)V", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingFlowParamsExtensionsKt {
    public static final void setUpgradeInfo(C3197d.a aVar, ReplaceProductInfo replaceProductInfo) {
        GoogleReplacementMode googleReplacementMode;
        C6496s.h(aVar, "<this>");
        C6496s.h(replaceProductInfo, "replaceProductInfo");
        C3197d.c.a a10 = C3197d.c.a();
        a10.b(replaceProductInfo.getOldPurchase().getPurchaseToken());
        ReplacementMode replacementMode = replaceProductInfo.getReplacementMode();
        if (replacementMode != null) {
            if (replacementMode instanceof GoogleReplacementMode) {
                googleReplacementMode = (GoogleReplacementMode) replacementMode;
            } else {
                googleReplacementMode = null;
            }
            if (googleReplacementMode == null) {
                LogUtilsKt.errorLog$default("Got non-Google replacement mode", (Throwable) null, 2, (Object) null);
            } else {
                a10.d(googleReplacementMode.getPlayBillingClientMode());
            }
        }
        C6496s.g(a10, "newBuilder().apply {\n   …        }\n        }\n    }");
        aVar.e(a10.a());
    }
}
