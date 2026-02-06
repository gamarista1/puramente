package com.revenuecat.purchases.hybridcommon.mappers;

import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/EntitlementInfo;", "hybridcommon_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class EntitlementInfoMapperKt {
    public static final Map<String, Object> map(EntitlementInfo entitlementInfo) {
        Long l10;
        String str;
        String str2;
        Long l11;
        String str3;
        Long l12;
        C6496s.h(entitlementInfo, "<this>");
        Pair a10 = C6502A.a("identifier", entitlementInfo.getIdentifier());
        Pair a11 = C6502A.a("isActive", Boolean.valueOf(entitlementInfo.isActive()));
        Pair a12 = C6502A.a("willRenew", Boolean.valueOf(entitlementInfo.getWillRenew()));
        Pair a13 = C6502A.a("periodType", entitlementInfo.getPeriodType().name());
        Pair a14 = C6502A.a("latestPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getLatestPurchaseDate())));
        Pair a15 = C6502A.a("latestPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getLatestPurchaseDate()));
        Pair a16 = C6502A.a("originalPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getOriginalPurchaseDate())));
        Pair a17 = C6502A.a("originalPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getOriginalPurchaseDate()));
        Date expirationDate = entitlementInfo.getExpirationDate();
        if (expirationDate != null) {
            l10 = Long.valueOf(MappersHelpersKt.toMillis(expirationDate));
        } else {
            l10 = null;
        }
        Pair a18 = C6502A.a("expirationDateMillis", l10);
        Date expirationDate2 = entitlementInfo.getExpirationDate();
        if (expirationDate2 != null) {
            str = MappersHelpersKt.toIso8601(expirationDate2);
        } else {
            str = null;
        }
        Pair a19 = C6502A.a("expirationDate", str);
        Pair a20 = C6502A.a(ProductResponseJsonKeys.STORE, entitlementInfo.getStore().name());
        Pair a21 = C6502A.a("productIdentifier", entitlementInfo.getProductIdentifier());
        Pair a22 = C6502A.a("productPlanIdentifier", entitlementInfo.getProductPlanIdentifier());
        Pair a23 = C6502A.a("isSandbox", Boolean.valueOf(entitlementInfo.isSandbox()));
        Date unsubscribeDetectedAt = entitlementInfo.getUnsubscribeDetectedAt();
        if (unsubscribeDetectedAt != null) {
            str2 = MappersHelpersKt.toIso8601(unsubscribeDetectedAt);
        } else {
            str2 = null;
        }
        Pair a24 = C6502A.a("unsubscribeDetectedAt", str2);
        Date unsubscribeDetectedAt2 = entitlementInfo.getUnsubscribeDetectedAt();
        if (unsubscribeDetectedAt2 != null) {
            l11 = Long.valueOf(MappersHelpersKt.toMillis(unsubscribeDetectedAt2));
        } else {
            l11 = null;
        }
        Pair a25 = C6502A.a("unsubscribeDetectedAtMillis", l11);
        Date billingIssueDetectedAt = entitlementInfo.getBillingIssueDetectedAt();
        if (billingIssueDetectedAt != null) {
            str3 = MappersHelpersKt.toIso8601(billingIssueDetectedAt);
        } else {
            str3 = null;
        }
        Pair a26 = C6502A.a("billingIssueDetectedAt", str3);
        Date billingIssueDetectedAt2 = entitlementInfo.getBillingIssueDetectedAt();
        if (billingIssueDetectedAt2 != null) {
            l12 = Long.valueOf(MappersHelpersKt.toMillis(billingIssueDetectedAt2));
        } else {
            l12 = null;
        }
        return O.l(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, C6502A.a("billingIssueDetectedAtMillis", l12), C6502A.a("ownershipType", entitlementInfo.getOwnershipType().name()), C6502A.a("verification", entitlementInfo.getVerification().name()));
    }
}
