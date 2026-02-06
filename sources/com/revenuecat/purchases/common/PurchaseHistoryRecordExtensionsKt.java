package com.revenuecat.purchases.common;

import com.android.billingclient.api.PurchaseHistoryRecord;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"firstSku", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "getFirstSku", "(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/lang/String;", "listOfSkus", "Ljava/util/ArrayList;", "getListOfSkus", "(Lcom/android/billingclient/api/PurchaseHistoryRecord;)Ljava/util/ArrayList;", "toHumanReadableDescription", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PurchaseHistoryRecordExtensionsKt {
    public static final String getFirstSku(PurchaseHistoryRecord purchaseHistoryRecord) {
        C6496s.h(purchaseHistoryRecord, "<this>");
        Object obj = purchaseHistoryRecord.f().get(0);
        String str = (String) obj;
        if (purchaseHistoryRecord.f().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        C6496s.g(obj, "skus[0].also {\n        i…_ONE_SKU)\n        }\n    }");
        return str;
    }

    public static final ArrayList<String> getListOfSkus(PurchaseHistoryRecord purchaseHistoryRecord) {
        C6496s.h(purchaseHistoryRecord, "<this>");
        ArrayList<String> f10 = purchaseHistoryRecord.f();
        C6496s.g(f10, "this.skus");
        return f10;
    }

    public static final String toHumanReadableDescription(PurchaseHistoryRecord purchaseHistoryRecord) {
        C6496s.h(purchaseHistoryRecord, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("skus: ");
        ArrayList f10 = purchaseHistoryRecord.f();
        C6496s.g(f10, "this.skus");
        sb2.append(C6565s.x0(f10, (CharSequence) null, "[", "]", 0, (CharSequence) null, (C6798l) null, 57, (Object) null));
        sb2.append(", purchaseTime: ");
        sb2.append(purchaseHistoryRecord.c());
        sb2.append(", purchaseToken: ");
        sb2.append(purchaseHistoryRecord.d());
        return sb2.toString();
    }
}
