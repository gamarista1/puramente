package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/utils/EntitlementInfoHelper;", "", "()V", "getWillRenew", "", "store", "Lcom/revenuecat/purchases/Store;", "expirationDate", "Ljava/util/Date;", "unsubscribeDetectedAt", "billingIssueDetectedAt", "periodType", "Lcom/revenuecat/purchases/PeriodType;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EntitlementInfoHelper {
    public static final EntitlementInfoHelper INSTANCE = new EntitlementInfoHelper();

    private EntitlementInfoHelper() {
    }

    public final boolean getWillRenew(Store store, Date date, Date date2, Date date3, PeriodType periodType) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        C6496s.h(store, ProductResponseJsonKeys.STORE);
        if (store == Store.PROMOTIONAL) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (date == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (date2 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (date3 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (periodType == PeriodType.PREPAID) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z10 || z11 || z12 || z13 || z14) {
            return false;
        }
        return true;
    }
}
