package com.revenuecat.purchases;

import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000¨\u0006\u0006"}, d2 = {"withPresentedContext", "Lcom/revenuecat/purchases/Offering;", "placementId", "", "targeting", "Lcom/revenuecat/purchases/Offerings$Targeting;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class OfferingsKt {
    public static final Offering withPresentedContext(Offering offering, String str, Offerings.Targeting targeting) {
        String str2;
        PresentedOfferingContext.TargetingContext targetingContext;
        C6496s.h(offering, "<this>");
        Iterable<Package> availablePackages = offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(C6565s.y(availablePackages, 10));
        for (Package packageR : availablePackages) {
            PresentedOfferingContext presentedOfferingContext = packageR.getPresentedOfferingContext();
            if (str == null) {
                str2 = presentedOfferingContext.getPlacementIdentifier();
            } else {
                str2 = str;
            }
            if (targeting != null) {
                targetingContext = new PresentedOfferingContext.TargetingContext(targeting.getRevision(), targeting.getRuleId());
            } else {
                targetingContext = presentedOfferingContext.getTargetingContext();
            }
            PresentedOfferingContext copy$default = PresentedOfferingContext.copy$default(presentedOfferingContext, (String) null, str2, targetingContext, 1, (Object) null);
            arrayList.add(new Package(packageR.getIdentifier(), packageR.getPackageType(), packageR.getProduct().copyWithPresentedOfferingContext(copy$default), copy$default));
        }
        return new Offering(offering.getIdentifier(), offering.getServerDescription(), offering.getMetadata(), arrayList, offering.getPaywall(), offering.getPaywallComponents());
    }
}
