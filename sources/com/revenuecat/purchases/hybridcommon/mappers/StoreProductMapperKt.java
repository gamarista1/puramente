package com.revenuecat.purchases.hybridcommon.mappers;

import com.amazon.a.a.o.b;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.amazon.AmazonStoreProduct;
import com.revenuecat.purchases.models.InstallmentsInfo;
import com.revenuecat.purchases.models.OfferPaymentMode;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6535s;
import mf.C6565s;
import mf.O;

@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u00020&H\u0002\u001a\u0018\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u00020\u0005\u001a$\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$0'*\b\u0012\u0004\u0012\u00020\u00050'\u001a\u001c\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$*\u00020\u0005H\u0001\u001a\u001c\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$*\u00020\tH\u0002\u001a\u001a\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u00020\tH\u0002\u001a\u001a\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u00020,H\u0002\u001a\u001a\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u00020\rH\u0002\u001a\f\u0010.\u001a\u00020/*\u00020\u0005H\u0001\u001a\f\u00100\u001a\u00020\u0011*\u00020\u0005H\u0001\u001a\"\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010%0$*\u0002022\u0006\u00103\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003XT¢\u0006\u0002\n\u0000\"\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\"\u0017\u0010\u001b\u001a\u0004\u0018\u00010\t*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000b\"\u0015\u0010\u001d\u001a\u00020\u0015*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017\"\u0015\u0010\u001f\u001a\u00020\u0011*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b \u0010\u0013\"\u0015\u0010!\u001a\u00020\u0011*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013¨\u00064"}, d2 = {"DAYS_PER_WEEK", "", "MICROS_CONVERSION_METRIC", "", "googleFreeTrialCycles", "Lcom/revenuecat/purchases/models/StoreProduct;", "getGoogleFreeTrialCycles", "(Lcom/revenuecat/purchases/models/StoreProduct;)Ljava/lang/Integer;", "googleFreeTrialPeriod", "Lcom/revenuecat/purchases/models/Period;", "getGoogleFreeTrialPeriod", "(Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/Period;", "googleIntroductoryPhase", "Lcom/revenuecat/purchases/models/PricingPhase;", "getGoogleIntroductoryPhase", "(Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/PricingPhase;", "googleIntroductoryPrice", "", "getGoogleIntroductoryPrice", "(Lcom/revenuecat/purchases/models/StoreProduct;)Ljava/lang/String;", "googleIntroductoryPriceAmountMicros", "", "getGoogleIntroductoryPriceAmountMicros", "(Lcom/revenuecat/purchases/models/StoreProduct;)J", "googleIntroductoryPriceCycles", "getGoogleIntroductoryPriceCycles", "(Lcom/revenuecat/purchases/models/StoreProduct;)I", "googleIntroductoryPricePeriod", "getGoogleIntroductoryPricePeriod", "priceAmountMicros", "getPriceAmountMicros", "priceCurrencyCode", "getPriceCurrencyCode", "priceString", "getPriceString", "map", "", "", "Lcom/revenuecat/purchases/models/InstallmentsInfo;", "", "mapIntroPrice", "mapPeriod", "mapPeriodForStoreProduct", "mapPrice", "Lcom/revenuecat/purchases/models/Price;", "mapPricingPhase", "mapProductCategory", "Lcom/revenuecat/purchases/hybridcommon/mappers/MappedProductCategory;", "mapProductType", "mapSubscriptionOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "storeProduct", "hybridcommon_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StoreProductMapperKt {
    private static final int DAYS_PER_WEEK = 7;
    private static final double MICROS_CONVERSION_METRIC = 1000000.0d;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
        static {
            /*
                com.revenuecat.purchases.ProductType[] r0 = com.revenuecat.purchases.ProductType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.revenuecat.purchases.ProductType r2 = com.revenuecat.purchases.ProductType.INAPP     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.revenuecat.purchases.ProductType r3 = com.revenuecat.purchases.ProductType.SUBS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.revenuecat.purchases.ProductType r4 = com.revenuecat.purchases.ProductType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                com.revenuecat.purchases.models.Period$Unit[] r0 = com.revenuecat.purchases.models.Period.Unit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.models.Period$Unit r4 = com.revenuecat.purchases.models.Period.Unit.DAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.WEEK     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.MONTH     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.YEAR     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                com.revenuecat.purchases.models.Period$Unit r1 = com.revenuecat.purchases.models.Period.Unit.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0055 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.hybridcommon.mappers.StoreProductMapperKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Integer getGoogleFreeTrialCycles(StoreProduct storeProduct) {
        PricingPhase freePhase;
        C6496s.h(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingCycleCount();
    }

    public static final Period getGoogleFreeTrialPeriod(StoreProduct storeProduct) {
        PricingPhase freePhase;
        C6496s.h(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingPeriod();
    }

    private static final PricingPhase getGoogleIntroductoryPhase(StoreProduct storeProduct) {
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption != null) {
            return defaultOption.getIntroPhase();
        }
        return null;
    }

    public static final String getGoogleIntroductoryPrice(StoreProduct storeProduct) {
        Price price;
        C6496s.h(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (price = googleIntroductoryPhase.getPrice()) == null) {
            return null;
        }
        return price.getFormatted();
    }

    public static final long getGoogleIntroductoryPriceAmountMicros(StoreProduct storeProduct) {
        Price price;
        C6496s.h(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (price = googleIntroductoryPhase.getPrice()) == null) {
            return 0;
        }
        return price.getAmountMicros();
    }

    public static final int getGoogleIntroductoryPriceCycles(StoreProduct storeProduct) {
        Integer billingCycleCount;
        C6496s.h(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (billingCycleCount = googleIntroductoryPhase.getBillingCycleCount()) == null) {
            return 0;
        }
        return billingCycleCount.intValue();
    }

    public static final Period getGoogleIntroductoryPricePeriod(StoreProduct storeProduct) {
        C6496s.h(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase != null) {
            return googleIntroductoryPhase.getBillingPeriod();
        }
        return null;
    }

    public static final long getPriceAmountMicros(StoreProduct storeProduct) {
        C6496s.h(storeProduct, "<this>");
        return storeProduct.getPrice().getAmountMicros();
    }

    public static final String getPriceCurrencyCode(StoreProduct storeProduct) {
        C6496s.h(storeProduct, "<this>");
        return storeProduct.getPrice().getCurrencyCode();
    }

    public static final String getPriceString(StoreProduct storeProduct) {
        C6496s.h(storeProduct, "<this>");
        return storeProduct.getPrice().getFormatted();
    }

    public static final Map<String, Object> map(StoreProduct storeProduct) {
        Pair pair;
        String str;
        Pair pair2;
        Map<String, Object> map;
        Pair pair3;
        Pair pair4;
        ArrayList arrayList;
        StoreProduct storeProduct2 = storeProduct;
        C6496s.h(storeProduct2, "<this>");
        Pair a10 = C6502A.a("identifier", storeProduct.getId());
        Pair a11 = C6502A.a(b.f37480c, storeProduct.getDescription());
        Pair a12 = C6502A.a(b.f37461S, storeProduct.getTitle());
        Pair a13 = C6502A.a(b.f37501x, Double.valueOf(((double) getPriceAmountMicros(storeProduct)) / MICROS_CONVERSION_METRIC));
        Pair a14 = C6502A.a("priceString", getPriceString(storeProduct));
        Pair a15 = C6502A.a("currencyCode", getPriceCurrencyCode(storeProduct));
        Pair a16 = C6502A.a("introPrice", mapIntroPrice(storeProduct));
        Pair a17 = C6502A.a("discounts", (Object) null);
        Price pricePerWeek$default = StoreProduct.DefaultImpls.pricePerWeek$default(storeProduct2, (Locale) null, 1, (Object) null);
        Pair a18 = C6502A.a("pricePerWeek", pricePerWeek$default != null ? Long.valueOf(pricePerWeek$default.getAmountMicros()) : null);
        Price pricePerMonth$default = StoreProduct.DefaultImpls.pricePerMonth$default(storeProduct2, (Locale) null, 1, (Object) null);
        Pair a19 = C6502A.a("pricePerMonth", pricePerMonth$default != null ? Long.valueOf(pricePerMonth$default.getAmountMicros()) : null);
        Price pricePerYear$default = StoreProduct.DefaultImpls.pricePerYear$default(storeProduct2, (Locale) null, 1, (Object) null);
        Pair a20 = C6502A.a("pricePerYear", pricePerYear$default != null ? Long.valueOf(pricePerYear$default.getAmountMicros()) : null);
        Price pricePerWeek$default2 = StoreProduct.DefaultImpls.pricePerWeek$default(storeProduct2, (Locale) null, 1, (Object) null);
        Pair a21 = C6502A.a("pricePerWeekString", pricePerWeek$default2 != null ? pricePerWeek$default2.getFormatted() : null);
        Price pricePerMonth$default2 = StoreProduct.DefaultImpls.pricePerMonth$default(storeProduct2, (Locale) null, 1, (Object) null);
        Pair pair5 = a21;
        Pair a22 = C6502A.a("pricePerMonthString", pricePerMonth$default2 != null ? pricePerMonth$default2.getFormatted() : null);
        Price pricePerYear$default2 = StoreProduct.DefaultImpls.pricePerYear$default(storeProduct2, (Locale) null, 1, (Object) null);
        Pair a23 = C6502A.a("pricePerYearString", pricePerYear$default2 != null ? pricePerYear$default2.getFormatted() : null);
        Pair a24 = C6502A.a("productCategory", mapProductCategory(storeProduct).getValue());
        Pair a25 = C6502A.a("productType", mapProductType(storeProduct));
        Period period = storeProduct.getPeriod();
        if (period != null) {
            str = period.getIso8601();
            pair = a25;
        } else {
            pair = a25;
            str = null;
        }
        Pair a26 = C6502A.a(b.f37492o, str);
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption != null) {
            map = mapSubscriptionOption(defaultOption, storeProduct2);
            pair2 = a26;
        } else {
            pair2 = a26;
            map = null;
        }
        Pair a27 = C6502A.a("defaultOption", map);
        SubscriptionOptions<SubscriptionOption> subscriptionOptions = storeProduct.getSubscriptionOptions();
        if (subscriptionOptions != null) {
            pair4 = a27;
            pair3 = a23;
            arrayList = new ArrayList(C6565s.y(subscriptionOptions, 10));
            for (SubscriptionOption mapSubscriptionOption : subscriptionOptions) {
                arrayList.add(mapSubscriptionOption(mapSubscriptionOption, storeProduct2));
            }
        } else {
            pair3 = a23;
            pair4 = a27;
            arrayList = null;
        }
        Pair a28 = C6502A.a("subscriptionOptions", arrayList);
        PresentedOfferingContext presentedOfferingContext = storeProduct.getPresentedOfferingContext();
        Pair a29 = C6502A.a("presentedOfferingIdentifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = storeProduct.getPresentedOfferingContext();
        return O.l(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, pair5, a22, pair3, a24, pair, pair2, pair4, a28, a29, C6502A.a("presentedOfferingContext", presentedOfferingContext2 != null ? OfferingsMapperKt.map(presentedOfferingContext2) : null));
    }

    public static final Map<String, Object> mapIntroPrice(StoreProduct storeProduct) {
        Period googleIntroductoryPricePeriod;
        Map<String, Object> mapPeriodForStoreProduct;
        Map<String, Object> mapPeriodForStoreProduct2;
        Map<String, Object> mapPeriodForStoreProduct3;
        C6496s.h(storeProduct, "<this>");
        int i10 = 1;
        String str = null;
        if (storeProduct instanceof AmazonStoreProduct) {
            AmazonStoreProduct amazonStoreProduct = (AmazonStoreProduct) storeProduct;
            Period freeTrialPeriod = amazonStoreProduct.getFreeTrialPeriod();
            if (freeTrialPeriod == null || (mapPeriodForStoreProduct3 = mapPeriodForStoreProduct(freeTrialPeriod)) == null) {
                return null;
            }
            Pair a10 = C6502A.a(b.f37501x, 0);
            Pair a11 = C6502A.a("priceString", MappersHelpersKt.formatUsingDeviceLocale(getPriceCurrencyCode(storeProduct), 0));
            Period freeTrialPeriod2 = amazonStoreProduct.getFreeTrialPeriod();
            if (freeTrialPeriod2 != null) {
                str = freeTrialPeriod2.getIso8601();
            }
            return O.p(O.l(a10, a11, C6502A.a("period", str), C6502A.a("cycles", 1)), mapPeriodForStoreProduct3);
        } else if (getGoogleFreeTrialPeriod(storeProduct) != null) {
            Period googleFreeTrialPeriod = getGoogleFreeTrialPeriod(storeProduct);
            if (googleFreeTrialPeriod == null || (mapPeriodForStoreProduct2 = mapPeriodForStoreProduct(googleFreeTrialPeriod)) == null) {
                return null;
            }
            Pair a12 = C6502A.a(b.f37501x, 0);
            Pair a13 = C6502A.a("priceString", MappersHelpersKt.formatUsingDeviceLocale(getPriceCurrencyCode(storeProduct), 0));
            Period googleFreeTrialPeriod2 = getGoogleFreeTrialPeriod(storeProduct);
            if (googleFreeTrialPeriod2 != null) {
                str = googleFreeTrialPeriod2.getIso8601();
            }
            Pair a14 = C6502A.a("period", str);
            Integer googleFreeTrialCycles = getGoogleFreeTrialCycles(storeProduct);
            if (googleFreeTrialCycles != null) {
                i10 = googleFreeTrialCycles.intValue();
            }
            return O.p(O.l(a12, a13, a14, C6502A.a("cycles", Integer.valueOf(i10))), mapPeriodForStoreProduct2);
        } else if (getGoogleIntroductoryPrice(storeProduct) == null || (googleIntroductoryPricePeriod = getGoogleIntroductoryPricePeriod(storeProduct)) == null || (mapPeriodForStoreProduct = mapPeriodForStoreProduct(googleIntroductoryPricePeriod)) == null) {
            return null;
        } else {
            Pair a15 = C6502A.a(b.f37501x, Double.valueOf(((double) getGoogleIntroductoryPriceAmountMicros(storeProduct)) / MICROS_CONVERSION_METRIC));
            Pair a16 = C6502A.a("priceString", getGoogleIntroductoryPrice(storeProduct));
            Period googleIntroductoryPricePeriod2 = getGoogleIntroductoryPricePeriod(storeProduct);
            if (googleIntroductoryPricePeriod2 != null) {
                str = googleIntroductoryPricePeriod2.getIso8601();
            }
            return O.p(O.l(a15, a16, C6502A.a("period", str), C6502A.a("cycles", Integer.valueOf(getGoogleIntroductoryPriceCycles(storeProduct)))), mapPeriodForStoreProduct);
        }
    }

    private static final Map<String, Object> mapPeriod(Period period) {
        Map map;
        int i10 = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i10 == 1) {
            map = O.l(C6502A.a("unit", "DAY"), C6502A.a("value", Integer.valueOf(period.getValue())));
        } else if (i10 == 2) {
            map = O.l(C6502A.a("unit", "DAY"), C6502A.a("value", Integer.valueOf(period.getValue() * 7)));
        } else if (i10 == 3) {
            map = O.l(C6502A.a("unit", "MONTH"), C6502A.a("value", Integer.valueOf(period.getValue())));
        } else if (i10 == 4) {
            map = O.l(C6502A.a("unit", "YEAR"), C6502A.a("value", Integer.valueOf(period.getValue())));
        } else if (i10 == 5) {
            map = O.l(C6502A.a("unit", "DAY"), C6502A.a("value", 0));
        } else {
            throw new C6535s();
        }
        return O.p(map, O.f(C6502A.a("iso8601", period.getIso8601())));
    }

    private static final Map<String, Object> mapPeriodForStoreProduct(Period period) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i10 == 1) {
            return O.l(C6502A.a("periodUnit", "DAY"), C6502A.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i10 == 2) {
            return O.l(C6502A.a("periodUnit", "DAY"), C6502A.a("periodNumberOfUnits", Integer.valueOf(period.getValue() * 7)));
        }
        if (i10 == 3) {
            return O.l(C6502A.a("periodUnit", "MONTH"), C6502A.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i10 == 4) {
            return O.l(C6502A.a("periodUnit", "YEAR"), C6502A.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i10 == 5) {
            return O.l(C6502A.a("periodUnit", "DAY"), C6502A.a("periodNumberOfUnits", 0));
        }
        throw new C6535s();
    }

    private static final Map<String, Object> mapPrice(Price price) {
        return O.l(C6502A.a("formatted", price.getFormatted()), C6502A.a("amountMicros", Long.valueOf(price.getAmountMicros())), C6502A.a("currencyCode", price.getCurrencyCode()));
    }

    private static final Map<String, Object> mapPricingPhase(PricingPhase pricingPhase) {
        Map<String, Object> map;
        Period billingPeriod = pricingPhase.getBillingPeriod();
        String str = null;
        if (billingPeriod != null) {
            map = mapPeriod(billingPeriod);
        } else {
            map = null;
        }
        Pair a10 = C6502A.a("billingPeriod", map);
        Pair a11 = C6502A.a("recurrenceMode", pricingPhase.getRecurrenceMode().getIdentifier());
        Pair a12 = C6502A.a("billingCycleCount", pricingPhase.getBillingCycleCount());
        Pair a13 = C6502A.a(b.f37501x, mapPrice(pricingPhase.getPrice()));
        OfferPaymentMode offerPaymentMode = pricingPhase.getOfferPaymentMode();
        if (offerPaymentMode != null) {
            str = offerPaymentMode.toString();
        }
        return O.l(a10, a11, a12, a13, C6502A.a("offerPaymentMode", str));
    }

    public static final MappedProductCategory mapProductCategory(StoreProduct storeProduct) {
        C6496s.h(storeProduct, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i10 == 1) {
            return MappedProductCategory.NON_SUBSCRIPTION;
        }
        if (i10 == 2) {
            return MappedProductCategory.SUBSCRIPTION;
        }
        if (i10 == 3) {
            return MappedProductCategory.UNKNOWN;
        }
        throw new C6535s();
    }

    public static final String mapProductType(StoreProduct storeProduct) {
        C6496s.h(storeProduct, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i10 == 1) {
            return "CONSUMABLE";
        }
        if (i10 == 2) {
            SubscriptionOption defaultOption = storeProduct.getDefaultOption();
            if (defaultOption == null || !defaultOption.isPrepaid()) {
                return "AUTO_RENEWABLE_SUBSCRIPTION";
            }
            return "PREPAID_SUBSCRIPTION";
        } else if (i10 == 3) {
            return "UNKNOWN";
        } else {
            throw new C6535s();
        }
    }

    private static final Map<String, Object> mapSubscriptionOption(SubscriptionOption subscriptionOption, StoreProduct storeProduct) {
        Map<String, Object> map;
        Map<String, Object> map2;
        Map<String, Object> map3;
        Map<String, Object> map4;
        String str;
        Map<String, Object> map5;
        Pair a10 = C6502A.a("id", subscriptionOption.getId());
        Pair a11 = C6502A.a("storeProductId", storeProduct.getId());
        Pair a12 = C6502A.a("productId", storeProduct.getPurchasingData().getProductId());
        Iterable<PricingPhase> pricingPhases = subscriptionOption.getPricingPhases();
        ArrayList arrayList = new ArrayList(C6565s.y(pricingPhases, 10));
        for (PricingPhase mapPricingPhase : pricingPhases) {
            arrayList.add(mapPricingPhase(mapPricingPhase));
        }
        Pair a13 = C6502A.a("pricingPhases", arrayList);
        Pair a14 = C6502A.a("tags", subscriptionOption.getTags());
        Pair a15 = C6502A.a("isBasePlan", Boolean.valueOf(subscriptionOption.isBasePlan()));
        Period billingPeriod = subscriptionOption.getBillingPeriod();
        Map<String, Object> map6 = null;
        if (billingPeriod != null) {
            map = mapPeriod(billingPeriod);
        } else {
            map = null;
        }
        Pair a16 = C6502A.a("billingPeriod", map);
        Pair a17 = C6502A.a("isPrepaid", Boolean.valueOf(subscriptionOption.isPrepaid()));
        PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
        if (fullPricePhase != null) {
            map2 = mapPricingPhase(fullPricePhase);
        } else {
            map2 = null;
        }
        Pair a18 = C6502A.a("fullPricePhase", map2);
        PricingPhase freePhase = subscriptionOption.getFreePhase();
        if (freePhase != null) {
            map3 = mapPricingPhase(freePhase);
        } else {
            map3 = null;
        }
        Pair a19 = C6502A.a("freePhase", map3);
        PricingPhase introPhase = subscriptionOption.getIntroPhase();
        if (introPhase != null) {
            map4 = mapPricingPhase(introPhase);
        } else {
            map4 = null;
        }
        Pair a20 = C6502A.a("introPhase", map4);
        PresentedOfferingContext presentedOfferingContext = subscriptionOption.getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            str = presentedOfferingContext.getOfferingIdentifier();
        } else {
            str = null;
        }
        Pair a21 = C6502A.a("presentedOfferingIdentifier", str);
        PresentedOfferingContext presentedOfferingContext2 = subscriptionOption.getPresentedOfferingContext();
        if (presentedOfferingContext2 != null) {
            map5 = OfferingsMapperKt.map(presentedOfferingContext2);
        } else {
            map5 = null;
        }
        Pair a22 = C6502A.a("presentedOfferingContext", map5);
        InstallmentsInfo installmentsInfo = subscriptionOption.getInstallmentsInfo();
        if (installmentsInfo != null) {
            map6 = map(installmentsInfo);
        }
        return O.l(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, C6502A.a("installmentsInfo", map6));
    }

    public static final List<Map<String, Object>> map(List<? extends StoreProduct> list) {
        C6496s.h(list, "<this>");
        Iterable<StoreProduct> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (StoreProduct map : iterable) {
            arrayList.add(map(map));
        }
        return arrayList;
    }

    private static final Map<String, Object> map(InstallmentsInfo installmentsInfo) {
        return O.l(C6502A.a("commitmentPaymentsCount", Integer.valueOf(installmentsInfo.getCommitmentPaymentsCount())), C6502A.a("renewalCommitmentPaymentsCount", Integer.valueOf(installmentsInfo.getRenewalCommitmentPaymentsCount())));
    }
}
