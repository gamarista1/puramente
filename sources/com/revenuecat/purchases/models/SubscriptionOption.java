package com.revenuecat.purchases.models;

import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import lf.C6521e;
import mf.C6565s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0#X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010%¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOption;", "", "billingPeriod", "Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod", "()Lcom/revenuecat/purchases/models/Period;", "freePhase", "Lcom/revenuecat/purchases/models/PricingPhase;", "getFreePhase", "()Lcom/revenuecat/purchases/models/PricingPhase;", "fullPricePhase", "getFullPricePhase", "id", "", "getId", "()Ljava/lang/String;", "installmentsInfo", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "getInstallmentsInfo", "()Lcom/revenuecat/purchases/models/InstallmentsInfo;", "introPhase", "getIntroPhase", "isBasePlan", "", "()Z", "isPrepaid", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "getPresentedOfferingIdentifier", "pricingPhases", "", "getPricingPhases", "()Ljava/util/List;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "tags", "getTags", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SubscriptionOption {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Period getBillingPeriod(SubscriptionOption subscriptionOption) {
            PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
            if (fullPricePhase != null) {
                return fullPricePhase.getBillingPeriod();
            }
            return null;
        }

        public static PricingPhase getFreePhase(SubscriptionOption subscriptionOption) {
            Object obj;
            Iterator it = C6565s.h0(subscriptionOption.getPricingPhases(), 1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PricingPhase) obj).getPrice().getAmountMicros() == 0) {
                    break;
                }
            }
            return (PricingPhase) obj;
        }

        public static PricingPhase getFullPricePhase(SubscriptionOption subscriptionOption) {
            return (PricingPhase) C6565s.B0(subscriptionOption.getPricingPhases());
        }

        public static PricingPhase getIntroPhase(SubscriptionOption subscriptionOption) {
            Object obj;
            Iterator it = C6565s.h0(subscriptionOption.getPricingPhases(), 1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PricingPhase) obj).getPrice().getAmountMicros() > 0) {
                    break;
                }
            }
            return (PricingPhase) obj;
        }

        @C6521e
        public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
        }

        public static boolean isBasePlan(SubscriptionOption subscriptionOption) {
            if (subscriptionOption.getPricingPhases().size() == 1) {
                return true;
            }
            return false;
        }

        public static boolean isPrepaid(SubscriptionOption subscriptionOption) {
            RecurrenceMode recurrenceMode;
            PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
            if (fullPricePhase != null) {
                recurrenceMode = fullPricePhase.getRecurrenceMode();
            } else {
                recurrenceMode = null;
            }
            if (recurrenceMode == RecurrenceMode.NON_RECURRING) {
                return true;
            }
            return false;
        }
    }

    Period getBillingPeriod();

    PricingPhase getFreePhase();

    PricingPhase getFullPricePhase();

    String getId();

    InstallmentsInfo getInstallmentsInfo();

    PricingPhase getIntroPhase();

    PresentedOfferingContext getPresentedOfferingContext();

    String getPresentedOfferingIdentifier();

    List<PricingPhase> getPricingPhases();

    PurchasingData getPurchasingData();

    List<String> getTags();

    boolean isBasePlan();

    boolean isPrepaid();
}
