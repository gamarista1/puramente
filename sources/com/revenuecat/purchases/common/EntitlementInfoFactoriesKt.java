package com.revenuecat.purchases.common;

import com.adjust.sdk.Constants;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.responses.EntitlementsResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.DateActive;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.EntitlementInfoHelper;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a,\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a,\u0010\r\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0000¨\u0006\u0018"}, d2 = {"isDateActive", "", "identifier", "", "expirationDate", "Ljava/util/Date;", "requestDate", "buildEntitlementInfo", "Lcom/revenuecat/purchases/EntitlementInfo;", "Lorg/json/JSONObject;", "productData", "verificationResult", "Lcom/revenuecat/purchases/VerificationResult;", "buildEntitlementInfos", "Lcom/revenuecat/purchases/EntitlementInfos;", "subscriptions", "nonSubscriptionsLatestPurchases", "getStore", "Lcom/revenuecat/purchases/Store;", "name", "optOwnershipType", "Lcom/revenuecat/purchases/OwnershipType;", "optPeriodType", "Lcom/revenuecat/purchases/PeriodType;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EntitlementInfoFactoriesKt {
    public static final EntitlementInfo buildEntitlementInfo(JSONObject jSONObject, String str, JSONObject jSONObject2, Date date, VerificationResult verificationResult) {
        JSONObject jSONObject3 = jSONObject;
        String str2 = str;
        JSONObject jSONObject4 = jSONObject2;
        Date date2 = date;
        String str3 = str;
        C6496s.h(jSONObject3, "<this>");
        C6496s.h(str2, "identifier");
        C6496s.h(jSONObject4, "productData");
        C6496s.h(date2, "requestDate");
        C6496s.h(verificationResult, "verificationResult");
        Date optDate = JSONObjectExtensionsKt.optDate(jSONObject3, "expires_date");
        Date date3 = optDate;
        Date optDate2 = JSONObjectExtensionsKt.optDate(jSONObject4, ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT);
        Date date4 = optDate2;
        Date optDate3 = JSONObjectExtensionsKt.optDate(jSONObject4, ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT);
        Date date5 = optDate3;
        PeriodType optPeriodType = optPeriodType(jSONObject4, ProductResponseJsonKeys.PERIOD_TYPE);
        PeriodType periodType = optPeriodType;
        Store store = getStore(jSONObject4, ProductResponseJsonKeys.STORE);
        Store store2 = store;
        boolean isDateActive = isDateActive(str2, optDate, date2);
        boolean willRenew = EntitlementInfoHelper.INSTANCE.getWillRenew(store, optDate, optDate2, optDate3, optPeriodType);
        Date date6 = JSONObjectExtensionsKt.getDate(jSONObject3, "purchase_date");
        Date date7 = JSONObjectExtensionsKt.getDate(jSONObject4, "original_purchase_date");
        String string = jSONObject3.getString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
        String str4 = string;
        C6496s.g(string, "getString(EntitlementsRe…nKeys.PRODUCT_IDENTIFIER)");
        return new EntitlementInfo(str3, isDateActive, willRenew, periodType, date6, date7, date3, store2, str4, JSONObjectExtensionsKt.optNullableString(jSONObject3, "product_plan_identifier"), jSONObject4.getBoolean(ProductResponseJsonKeys.IS_SANDBOX), date4, date5, optOwnershipType(jSONObject4, ProductResponseJsonKeys.OWNERSHIP_TYPE), jSONObject, verificationResult);
    }

    public static final EntitlementInfos buildEntitlementInfos(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Date date, VerificationResult verificationResult) {
        C6496s.h(jSONObject, "<this>");
        C6496s.h(jSONObject2, CustomerInfoResponseJsonKeys.SUBSCRIPTIONS);
        C6496s.h(jSONObject3, "nonSubscriptionsLatestPurchases");
        C6496s.h(date, "requestDate");
        C6496s.h(verificationResult, "verificationResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        C6496s.g(keys, "keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject4 = jSONObject.getJSONObject(next);
            String optString = jSONObject4.optString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
            C6496s.g(optString, "it");
            if (optString.length() <= 0) {
                optString = null;
            }
            if (optString != null) {
                if (jSONObject2.has(optString)) {
                    C6496s.g(next, "entitlementId");
                    C6496s.g(jSONObject4, "entitlement");
                    JSONObject jSONObject5 = jSONObject2.getJSONObject(optString);
                    C6496s.g(jSONObject5, "subscriptions.getJSONObject(productIdentifier)");
                    linkedHashMap.put(next, buildEntitlementInfo(jSONObject4, next, jSONObject5, date, verificationResult));
                } else if (jSONObject3.has(optString)) {
                    C6496s.g(next, "entitlementId");
                    C6496s.g(jSONObject4, "entitlement");
                    JSONObject jSONObject6 = jSONObject3.getJSONObject(optString);
                    C6496s.g(jSONObject6, "nonSubscriptionsLatestPu…Object(productIdentifier)");
                    linkedHashMap.put(next, buildEntitlementInfo(jSONObject4, next, jSONObject6, date, verificationResult));
                }
            }
        }
        return new EntitlementInfos(linkedHashMap, verificationResult);
    }

    public static final Store getStore(JSONObject jSONObject, String str) {
        C6496s.h(jSONObject, "<this>");
        C6496s.h(str, "name");
        String string = jSONObject.getString(str);
        if (string != null) {
            switch (string.hashCode()) {
                case -1820761141:
                    if (string.equals("external")) {
                        return Store.EXTERNAL;
                    }
                    break;
                case -1523640723:
                    if (string.equals("rc_billing")) {
                        return Store.RC_BILLING;
                    }
                    break;
                case -1414265340:
                    if (string.equals("amazon")) {
                        return Store.AMAZON;
                    }
                    break;
                case -891985843:
                    if (string.equals("stripe")) {
                        return Store.STRIPE;
                    }
                    break;
                case 564036179:
                    if (string.equals("mac_app_store")) {
                        return Store.MAC_APP_STORE;
                    }
                    break;
                case 756050958:
                    if (string.equals("promotional")) {
                        return Store.PROMOTIONAL;
                    }
                    break;
                case 1842542915:
                    if (string.equals("app_store")) {
                        return Store.APP_STORE;
                    }
                    break;
                case 1925951510:
                    if (string.equals("play_store")) {
                        return Store.PLAY_STORE;
                    }
                    break;
            }
        }
        return Store.UNKNOWN_STORE;
    }

    private static final boolean isDateActive(String str, Date date, Date date2) {
        DateActive r02 = DateHelper.Companion.m127isDateActiveSxA4cEA$default(DateHelper.Companion, date, date2, 0, 4, (Object) null);
        if (!r02.isActive() && !r02.getInGracePeriod()) {
            String format = String.format(PurchaseStrings.ENTITLEMENT_EXPIRED_OUTSIDE_GRACE_PERIOD, Arrays.copyOf(new Object[]{str, date, date2}, 3));
            C6496s.g(format, "format(this, *args)");
            LogUtilsKt.warnLog(format);
        }
        return r02.isActive();
    }

    public static final OwnershipType optOwnershipType(JSONObject jSONObject, String str) {
        C6496s.h(jSONObject, "<this>");
        C6496s.h(str, "name");
        String optString = jSONObject.optString(str);
        if (C6496s.c(optString, "PURCHASED")) {
            return OwnershipType.PURCHASED;
        }
        if (C6496s.c(optString, "FAMILY_SHARED")) {
            return OwnershipType.FAMILY_SHARED;
        }
        return OwnershipType.UNKNOWN;
    }

    public static final PeriodType optPeriodType(JSONObject jSONObject, String str) {
        C6496s.h(jSONObject, "<this>");
        C6496s.h(str, "name");
        String optString = jSONObject.optString(str);
        if (optString != null) {
            switch (optString.hashCode()) {
                case -1039745817:
                    if (optString.equals(Constants.NORMAL)) {
                        return PeriodType.NORMAL;
                    }
                    break;
                case -318370833:
                    if (optString.equals("prepaid")) {
                        return PeriodType.PREPAID;
                    }
                    break;
                case 100361836:
                    if (optString.equals("intro")) {
                        return PeriodType.INTRO;
                    }
                    break;
                case 110628630:
                    if (optString.equals("trial")) {
                        return PeriodType.TRIAL;
                    }
                    break;
            }
        }
        return PeriodType.NORMAL;
    }
}
