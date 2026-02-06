package com.revenuecat.purchases.google;

import com.android.billingclient.api.C3201h;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/android/billingclient/api/h$c;", "Lcom/revenuecat/purchases/models/PricingPhase;", "toRevenueCatPricingPhase", "(Lcom/android/billingclient/api/h$c;)Lcom/revenuecat/purchases/models/PricingPhase;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PricingPhaseConversionsKt {
    public static final PricingPhase toRevenueCatPricingPhase(C3201h.c cVar) {
        C6496s.h(cVar, "<this>");
        Period.Factory factory = Period.Factory;
        String b10 = cVar.b();
        C6496s.g(b10, "billingPeriod");
        Period create = factory.create(b10);
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(cVar.f()));
        Integer valueOf = Integer.valueOf(cVar.a());
        String c10 = cVar.c();
        C6496s.g(c10, "formattedPrice");
        long d10 = cVar.d();
        String e10 = cVar.e();
        C6496s.g(e10, "priceCurrencyCode");
        return new PricingPhase(create, recurrenceMode, valueOf, new Price(c10, d10, e10));
    }
}
