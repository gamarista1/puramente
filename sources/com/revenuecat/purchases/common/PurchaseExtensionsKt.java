package com.revenuecat.purchases.common;

import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"firstProductId", "", "Lcom/android/billingclient/api/Purchase;", "getFirstProductId", "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;", "toHumanReadableDescription", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(Purchase purchase) {
        C6496s.h(purchase, "<this>");
        Object obj = purchase.c().get(0);
        String str = (String) obj;
        if (purchase.c().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        C6496s.g(obj, "products[0].also {\n     …_ONE_SKU)\n        }\n    }");
        return str;
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        C6496s.h(purchase, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("productIds: ");
        List c10 = purchase.c();
        C6496s.g(c10, "this.products");
        sb2.append(C6565s.x0(c10, (CharSequence) null, "[", "]", 0, (CharSequence) null, (C6798l) null, 57, (Object) null));
        sb2.append(", orderId: ");
        sb2.append(purchase.a());
        sb2.append(", purchaseToken: ");
        sb2.append(purchase.f());
        return sb2.toString();
    }
}
