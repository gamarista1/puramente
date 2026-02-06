package com.revenuecat.purchases.hybridcommon.mappers;

import android.net.Uri;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.Transaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.C6565s;
import mf.O;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"map", "", "", "", "Lcom/revenuecat/purchases/CustomerInfo;", "hybridcommon_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CustomerInfoMapperKt {
    public static final Map<String, Object> map(CustomerInfo customerInfo) {
        String str;
        Long l10;
        String str2;
        String str3;
        Long l11;
        Long l12;
        String str4;
        Long l13;
        String str5;
        C6496s.h(customerInfo, "<this>");
        Pair a10 = C6502A.a(CustomerInfoResponseJsonKeys.ENTITLEMENTS, EntitlementInfosMapperKt.map(customerInfo.getEntitlements()));
        Pair a11 = C6502A.a("activeSubscriptions", C6565s.e1(customerInfo.getActiveSubscriptions()));
        Pair a12 = C6502A.a("allPurchasedProductIdentifiers", C6565s.e1(customerInfo.getAllPurchasedProductIds()));
        Date latestExpirationDate = customerInfo.getLatestExpirationDate();
        if (latestExpirationDate != null) {
            str = MappersHelpersKt.toIso8601(latestExpirationDate);
        } else {
            str = null;
        }
        Pair a13 = C6502A.a("latestExpirationDate", str);
        Date latestExpirationDate2 = customerInfo.getLatestExpirationDate();
        if (latestExpirationDate2 != null) {
            l10 = Long.valueOf(MappersHelpersKt.toMillis(latestExpirationDate2));
        } else {
            l10 = null;
        }
        Pair a14 = C6502A.a("latestExpirationDateMillis", l10);
        Pair a15 = C6502A.a("firstSeen", MappersHelpersKt.toIso8601(customerInfo.getFirstSeen()));
        Pair a16 = C6502A.a("firstSeenMillis", Long.valueOf(MappersHelpersKt.toMillis(customerInfo.getFirstSeen())));
        Pair a17 = C6502A.a("originalAppUserId", customerInfo.getOriginalAppUserId());
        Pair a18 = C6502A.a("requestDate", MappersHelpersKt.toIso8601(customerInfo.getRequestDate()));
        Pair a19 = C6502A.a("requestDateMillis", Long.valueOf(MappersHelpersKt.toMillis(customerInfo.getRequestDate())));
        Map<String, Date> allExpirationDatesByProduct = customerInfo.getAllExpirationDatesByProduct();
        LinkedHashMap linkedHashMap = new LinkedHashMap(O.e(allExpirationDatesByProduct.size()));
        for (Map.Entry entry : allExpirationDatesByProduct.entrySet()) {
            Object key = entry.getKey();
            Date date = (Date) entry.getValue();
            if (date != null) {
                str5 = MappersHelpersKt.toIso8601(date);
            } else {
                str5 = null;
            }
            linkedHashMap.put(key, str5);
        }
        Pair a20 = C6502A.a("allExpirationDates", linkedHashMap);
        Map<String, Date> allExpirationDatesByProduct2 = customerInfo.getAllExpirationDatesByProduct();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(O.e(allExpirationDatesByProduct2.size()));
        for (Map.Entry entry2 : allExpirationDatesByProduct2.entrySet()) {
            Object key2 = entry2.getKey();
            Date date2 = (Date) entry2.getValue();
            if (date2 != null) {
                l13 = Long.valueOf(MappersHelpersKt.toMillis(date2));
            } else {
                l13 = null;
            }
            linkedHashMap2.put(key2, l13);
        }
        Pair a21 = C6502A.a("allExpirationDatesMillis", linkedHashMap2);
        Map<String, Date> allPurchaseDatesByProduct = customerInfo.getAllPurchaseDatesByProduct();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(O.e(allPurchaseDatesByProduct.size()));
        Iterator it = allPurchaseDatesByProduct.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it.next();
            Iterator it2 = it;
            Object key3 = entry3.getKey();
            Date date3 = (Date) entry3.getValue();
            if (date3 != null) {
                str4 = MappersHelpersKt.toIso8601(date3);
            } else {
                str4 = null;
            }
            linkedHashMap3.put(key3, str4);
            it = it2;
        }
        Pair a22 = C6502A.a("allPurchaseDates", linkedHashMap3);
        Map<String, Date> allPurchaseDatesByProduct2 = customerInfo.getAllPurchaseDatesByProduct();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(O.e(allPurchaseDatesByProduct2.size()));
        Iterator it3 = allPurchaseDatesByProduct2.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it3.next();
            Iterator it4 = it3;
            Object key4 = entry4.getKey();
            Date date4 = (Date) entry4.getValue();
            if (date4 != null) {
                l12 = Long.valueOf(MappersHelpersKt.toMillis(date4));
            } else {
                l12 = null;
            }
            linkedHashMap4.put(key4, l12);
            it3 = it4;
        }
        Pair a23 = C6502A.a("allPurchaseDatesMillis", linkedHashMap4);
        Pair a24 = C6502A.a("originalApplicationVersion", (Object) null);
        Uri managementURL = customerInfo.getManagementURL();
        if (managementURL != null) {
            str2 = managementURL.toString();
        } else {
            str2 = null;
        }
        Pair a25 = C6502A.a("managementURL", str2);
        Date originalPurchaseDate = customerInfo.getOriginalPurchaseDate();
        if (originalPurchaseDate != null) {
            str3 = MappersHelpersKt.toIso8601(originalPurchaseDate);
        } else {
            str3 = null;
        }
        Pair a26 = C6502A.a("originalPurchaseDate", str3);
        Date originalPurchaseDate2 = customerInfo.getOriginalPurchaseDate();
        if (originalPurchaseDate2 != null) {
            l11 = Long.valueOf(MappersHelpersKt.toMillis(originalPurchaseDate2));
        } else {
            l11 = null;
        }
        Pair a27 = C6502A.a("originalPurchaseDateMillis", l11);
        Iterable<Transaction> nonSubscriptionTransactions = customerInfo.getNonSubscriptionTransactions();
        Pair pair = a23;
        ArrayList arrayList = new ArrayList(C6565s.y(nonSubscriptionTransactions, 10));
        for (Transaction map : nonSubscriptionTransactions) {
            arrayList.add(TransactionMapperKt.map(map));
        }
        return O.l(a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, pair, a24, a25, a26, a27, C6502A.a("nonSubscriptionTransactions", arrayList));
    }
}
