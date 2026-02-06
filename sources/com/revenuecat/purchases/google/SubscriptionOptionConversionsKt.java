package com.revenuecat.purchases.google;

import com.android.billingclient.api.C3201h;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.GoogleInstallmentsInfo;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0012\u001a\u00020\u000f*\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/android/billingclient/api/h$e;", "", "productId", "Lcom/android/billingclient/api/h;", "productDetails", "Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "toSubscriptionOption", "(Lcom/android/billingclient/api/h$e;Ljava/lang/String;Lcom/android/billingclient/api/h;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "getSubscriptionBillingPeriod", "(Lcom/android/billingclient/api/h$e;)Ljava/lang/String;", "subscriptionBillingPeriod", "", "isBasePlan", "(Lcom/android/billingclient/api/h$e;)Z", "Lcom/android/billingclient/api/h$a;", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getInstallmentsInfo", "(Lcom/android/billingclient/api/h$a;)Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "installmentsInfo", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SubscriptionOptionConversionsKt {
    private static final GoogleInstallmentsInfo getInstallmentsInfo(C3201h.a aVar) {
        return new GoogleInstallmentsInfo(aVar.a(), aVar.b());
    }

    public static final String getSubscriptionBillingPeriod(C3201h.e eVar) {
        C6496s.h(eVar, "<this>");
        List a10 = eVar.f().a();
        C6496s.g(a10, "this.pricingPhases.pricingPhaseList");
        C3201h.c cVar = (C3201h.c) C6565s.B0(a10);
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public static final boolean isBasePlan(C3201h.e eVar) {
        C6496s.h(eVar, "<this>");
        if (eVar.f().a().size() == 1) {
            return true;
        }
        return false;
    }

    public static final GoogleSubscriptionOption toSubscriptionOption(C3201h.e eVar, String str, C3201h hVar) {
        GoogleInstallmentsInfo googleInstallmentsInfo;
        C6496s.h(eVar, "<this>");
        C6496s.h(str, "productId");
        C6496s.h(hVar, "productDetails");
        List a10 = eVar.f().a();
        C6496s.g(a10, "pricingPhases.pricingPhaseList");
        Iterable<C3201h.c> iterable = a10;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (C3201h.c cVar : iterable) {
            C6496s.g(cVar, "it");
            arrayList.add(PricingPhaseConversionsKt.toRevenueCatPricingPhase(cVar));
        }
        String a11 = eVar.a();
        C6496s.g(a11, "basePlanId");
        String c10 = eVar.c();
        List d10 = eVar.d();
        C6496s.g(d10, "offerTags");
        String e10 = eVar.e();
        C6496s.g(e10, "offerToken");
        C3201h.a b10 = eVar.b();
        if (b10 != null) {
            googleInstallmentsInfo = getInstallmentsInfo(b10);
        } else {
            googleInstallmentsInfo = null;
        }
        return new GoogleSubscriptionOption(str, a11, c10, arrayList, d10, hVar, e10, (PresentedOfferingContext) null, googleInstallmentsInfo);
    }
}
