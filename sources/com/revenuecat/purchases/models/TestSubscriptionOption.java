package com.revenuecat.purchases.models;

import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.SubscriptionOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/models/TestSubscriptionOption;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "productIdentifier", "", "pricingPhases", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "basePlanId", "tags", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "installmentsInfo", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/InstallmentsInfo;)V", "getBasePlanId", "()Ljava/lang/String;", "id", "getId", "getInstallmentsInfo", "()Lcom/revenuecat/purchases/models/InstallmentsInfo;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier", "getPricingPhases", "()Ljava/util/List;", "getProductIdentifier", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "getTags", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TestSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final InstallmentsInfo installmentsInfo;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<PricingPhase> pricingPhases;
    private final String productIdentifier;
    private final List<String> tags;

    public TestSubscriptionOption(String str, List<PricingPhase> list, String str2, List<String> list2, PresentedOfferingContext presentedOfferingContext2, InstallmentsInfo installmentsInfo2) {
        C6496s.h(str, "productIdentifier");
        C6496s.h(list, "pricingPhases");
        C6496s.h(str2, "basePlanId");
        C6496s.h(list2, "tags");
        C6496s.h(presentedOfferingContext2, "presentedOfferingContext");
        this.productIdentifier = str;
        this.pricingPhases = list;
        this.basePlanId = str2;
        this.tags = list2;
        this.presentedOfferingContext = presentedOfferingContext2;
        this.installmentsInfo = installmentsInfo2;
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public Period getBillingPeriod() {
        return SubscriptionOption.DefaultImpls.getBillingPeriod(this);
    }

    public PricingPhase getFreePhase() {
        return SubscriptionOption.DefaultImpls.getFreePhase(this);
    }

    public PricingPhase getFullPricePhase() {
        return SubscriptionOption.DefaultImpls.getFullPricePhase(this);
    }

    public String getId() {
        if (getPricingPhases().size() == 1) {
            return this.basePlanId;
        }
        return this.basePlanId + ":testOfferId";
    }

    public InstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    public PricingPhase getIntroPhase() {
        return SubscriptionOption.DefaultImpls.getIntroPhase(this);
    }

    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public String getPresentedOfferingIdentifier() {
        return getPresentedOfferingContext().getOfferingIdentifier();
    }

    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public PurchasingData getPurchasingData() {
        return new TestSubscriptionOption$purchasingData$1(this);
    }

    public List<String> getTags() {
        return this.tags;
    }

    public boolean isBasePlan() {
        return SubscriptionOption.DefaultImpls.isBasePlan(this);
    }

    public boolean isPrepaid() {
        return SubscriptionOption.DefaultImpls.isPrepaid(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TestSubscriptionOption(String str, List list, String str2, List list2, PresentedOfferingContext presentedOfferingContext2, InstallmentsInfo installmentsInfo2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i10 & 4) != 0 ? "testBasePlanId" : str2, (i10 & 8) != 0 ? C6565s.n() : list2, (i10 & 16) != 0 ? new PresentedOfferingContext("offering") : presentedOfferingContext2, (i10 & 32) != 0 ? null : installmentsInfo2);
    }
}
