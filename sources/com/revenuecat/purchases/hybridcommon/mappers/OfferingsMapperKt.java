package com.revenuecat.purchases.hybridcommon.mappers;

import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0005\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0006\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0007\u001a\u0016\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\b¨\u0006\t"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/Offering;", "Lcom/revenuecat/purchases/Offerings;", "Lcom/revenuecat/purchases/Package;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "hybridcommon_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class OfferingsMapperKt {
    public static final Map<String, Object> map(Offerings offerings) {
        C6496s.h(offerings, "<this>");
        Map<String, Offering> all = offerings.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(all.size()));
        for (Map.Entry entry : all.entrySet()) {
            linkedHashMap.put(entry.getKey(), map((Offering) entry.getValue()));
        }
        Pair a10 = C6502A.a("all", linkedHashMap);
        Offering current = offerings.getCurrent();
        return O.l(a10, C6502A.a("current", current != null ? map(current) : null));
    }

    public static final Map<String, Object> map(Offering offering) {
        C6496s.h(offering, "<this>");
        Pair a10 = C6502A.a("identifier", offering.getIdentifier());
        Pair a11 = C6502A.a("serverDescription", offering.getServerDescription());
        Pair a12 = C6502A.a("metadata", offering.getMetadata());
        Iterable<Package> availablePackages = offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(C6565s.y(availablePackages, 10));
        for (Package map : availablePackages) {
            arrayList.add(map(map));
        }
        Pair a13 = C6502A.a("availablePackages", arrayList);
        Package lifetime = offering.getLifetime();
        Map<String, Object> map2 = null;
        Pair a14 = C6502A.a("lifetime", lifetime != null ? map(lifetime) : null);
        Package annual = offering.getAnnual();
        Pair a15 = C6502A.a("annual", annual != null ? map(annual) : null);
        Package sixMonth = offering.getSixMonth();
        Pair a16 = C6502A.a("sixMonth", sixMonth != null ? map(sixMonth) : null);
        Package threeMonth = offering.getThreeMonth();
        Pair a17 = C6502A.a("threeMonth", threeMonth != null ? map(threeMonth) : null);
        Package twoMonth = offering.getTwoMonth();
        Pair a18 = C6502A.a("twoMonth", twoMonth != null ? map(twoMonth) : null);
        Package monthly = offering.getMonthly();
        Pair a19 = C6502A.a("monthly", monthly != null ? map(monthly) : null);
        Package weekly = offering.getWeekly();
        if (weekly != null) {
            map2 = map(weekly);
        }
        return O.l(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, C6502A.a("weekly", map2));
    }

    public static final Map<String, Object> map(Package packageR) {
        C6496s.h(packageR, "<this>");
        return O.l(C6502A.a("identifier", packageR.getIdentifier()), C6502A.a("packageType", packageR.getPackageType().name()), C6502A.a("product", StoreProductMapperKt.map(packageR.getProduct())), C6502A.a("offeringIdentifier", packageR.getPresentedOfferingContext().getOfferingIdentifier()), C6502A.a("presentedOfferingContext", map(packageR.getPresentedOfferingContext())));
    }

    public static final Map<String, Object> map(PresentedOfferingContext presentedOfferingContext) {
        C6496s.h(presentedOfferingContext, "<this>");
        Pair a10 = C6502A.a("offeringIdentifier", presentedOfferingContext.getOfferingIdentifier());
        Pair a11 = C6502A.a("placementIdentifier", presentedOfferingContext.getPlacementIdentifier());
        PresentedOfferingContext.TargetingContext targetingContext = presentedOfferingContext.getTargetingContext();
        return O.l(a10, a11, C6502A.a("targetingContext", targetingContext != null ? map(targetingContext) : null));
    }

    public static final Map<String, Object> map(PresentedOfferingContext.TargetingContext targetingContext) {
        C6496s.h(targetingContext, "<this>");
        return O.l(C6502A.a("revision", Integer.valueOf(targetingContext.getRevision())), C6502A.a("ruleId", targetingContext.getRuleId()));
    }
}
