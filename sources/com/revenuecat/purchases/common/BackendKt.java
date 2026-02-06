package com.revenuecat.purchases.common;

import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PricingPhase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6535s;
import mf.O;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00028\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u0018\u0010\r\u001a\u00020\n*\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f*\u0018\b\u0000\u0010\u000f\"\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\u0012\u0004\u0012\u00020\u00020\u000e*T\b\u0000\u0010\u0015\"&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00130\u00110\u00102&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00130\u00110\u0010*`\b\u0000\u0010\u0019\",\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00170\u00102,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00170\u0010*`\b\u0000\u0010\u001b\",\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00170\u00102,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00170\u0010*`\b\u0000\u0010\u001c\",\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00130\u00110\u00102,\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00130\u00110\u0010*`\b\u0000\u0010\u001d\",\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00170\u00102,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00170\u0010*T\b\u0000\u0010\u001f\"&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00170\u00102&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00170\u0010*R\b\u0000\u0010%\"\u000e\u0012\u0004\u0012\u0002` \u0012\u0004\u0012\u0002`!0\u00102<\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00130\u0011j\u0002` \u0012\"\u0012 \u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00130#j\u0002`!0\u0010*@\b\u0000\u0010&\"\u001c\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00130#2\u001c\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00130#*$\b\u0000\u0010'\"\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00130\u00112\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00130\u0011*T\b\u0000\u0010)\"&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00130\u00110\u00102&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00130\u00110\u0010*$\b\u0000\u0010+\"\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00130\u00112\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00130\u0011¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/models/PricingPhase;", "", "", "", "toMap", "(Lcom/revenuecat/purchases/models/PricingPhase;)Ljava/util/Map;", "ATTRIBUTES_ERROR_RESPONSE_KEY", "Ljava/lang/String;", "ATTRIBUTE_ERRORS_KEY", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "Lcom/revenuecat/purchases/common/LegacyProrationMode;", "getAsLegacyProrationMode", "(Lcom/revenuecat/purchases/models/GoogleReplacementMode;)Lcom/revenuecat/purchases/common/LegacyProrationMode;", "asLegacyProrationMode", "", "CallbackCacheKey", "Lkotlin/Pair;", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "Llf/M;", "Lcom/revenuecat/purchases/PurchasesError;", "CustomerCenterCallback", "Lcom/revenuecat/purchases/CustomerInfo;", "Lkotlin/Function2;", "", "CustomerInfoCallback", "Lorg/json/JSONObject;", "DiagnosticsCallback", "IdentifyCallback", "OfferingsCallback", "Lkotlin/Function0;", "PaywallEventsCallback", "Lcom/revenuecat/purchases/common/PostReceiptDataSuccessCallback;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "PostReceiptCallback", "PostReceiptDataErrorCallback", "PostReceiptDataSuccessCallback", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "ProductEntitlementCallback", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "RedeemWebPurchaseCallback", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BackendKt {
    public static final String ATTRIBUTES_ERROR_RESPONSE_KEY = "attributes_error_response";
    public static final String ATTRIBUTE_ERRORS_KEY = "attribute_errors";

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.revenuecat.purchases.models.GoogleReplacementMode[] r0 = com.revenuecat.purchases.models.GoogleReplacementMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.models.GoogleReplacementMode r1 = com.revenuecat.purchases.models.GoogleReplacementMode.WITHOUT_PRORATION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.models.GoogleReplacementMode r1 = com.revenuecat.purchases.models.GoogleReplacementMode.WITH_TIME_PRORATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.revenuecat.purchases.models.GoogleReplacementMode r1 = com.revenuecat.purchases.models.GoogleReplacementMode.CHARGE_FULL_PRICE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.revenuecat.purchases.models.GoogleReplacementMode r1 = com.revenuecat.purchases.models.GoogleReplacementMode.CHARGE_PRORATED_PRICE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.revenuecat.purchases.models.GoogleReplacementMode r1 = com.revenuecat.purchases.models.GoogleReplacementMode.DEFERRED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.BackendKt.WhenMappings.<clinit>():void");
        }
    }

    public static /* synthetic */ void CustomerCenterCallback$annotations() {
    }

    public static /* synthetic */ void RedeemWebPurchaseCallback$annotations() {
    }

    /* access modifiers changed from: private */
    public static final LegacyProrationMode getAsLegacyProrationMode(GoogleReplacementMode googleReplacementMode) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[googleReplacementMode.ordinal()];
        if (i10 == 1) {
            return LegacyProrationMode.IMMEDIATE_WITHOUT_PRORATION;
        }
        if (i10 == 2) {
            return LegacyProrationMode.IMMEDIATE_WITH_TIME_PRORATION;
        }
        if (i10 == 3) {
            return LegacyProrationMode.IMMEDIATE_AND_CHARGE_FULL_PRICE;
        }
        if (i10 == 4) {
            return LegacyProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE;
        }
        if (i10 == 5) {
            return LegacyProrationMode.DEFERRED;
        }
        throw new C6535s();
    }

    public static final Map<String, Object> toMap(PricingPhase pricingPhase) {
        C6496s.h(pricingPhase, "<this>");
        return O.l(C6502A.a("billingPeriod", pricingPhase.getBillingPeriod().getIso8601()), C6502A.a("billingCycleCount", pricingPhase.getBillingCycleCount()), C6502A.a("recurrenceMode", pricingPhase.getRecurrenceMode().getIdentifier()), C6502A.a("formattedPrice", pricingPhase.getPrice().getFormatted()), C6502A.a("priceAmountMicros", Long.valueOf(pricingPhase.getPrice().getAmountMicros())), C6502A.a("priceCurrencyCode", pricingPhase.getPrice().getCurrencyCode()));
    }
}
