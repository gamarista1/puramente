package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"toStoreTransaction", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/amazon/device/iap/model/Receipt;", "productId", "", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "purchaseState", "Lcom/revenuecat/purchases/models/PurchaseState;", "userData", "Lcom/amazon/device/iap/model/UserData;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StoreTransactionConversionsKt {
    public static final StoreTransaction toStoreTransaction(Receipt receipt, String str, PresentedOfferingContext presentedOfferingContext, PurchaseState purchaseState, UserData userData) {
        C6496s.h(receipt, "<this>");
        C6496s.h(str, "productId");
        C6496s.h(purchaseState, "purchaseState");
        C6496s.h(userData, "userData");
        ProductType productType = receipt.getProductType();
        C6496s.g(productType, "this.productType");
        com.revenuecat.purchases.ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(productType);
        List e10 = C6565s.e(str);
        long time = receipt.getPurchaseDate().getTime();
        String receiptId = receipt.getReceiptId();
        C6496s.g(receiptId, "this.receiptId");
        boolean z10 = false;
        if (revenueCatProductType == com.revenuecat.purchases.ProductType.SUBS && !receipt.isCanceled()) {
            z10 = true;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        JSONObject json = receipt.toJSON();
        C6496s.g(json, "this.toJSON()");
        return new StoreTransaction((String) null, (List<String>) e10, revenueCatProductType, time, receiptId, purchaseState, valueOf, (String) null, json, presentedOfferingContext, userData.getUserId(), PurchaseType.AMAZON_PURCHASE, userData.getMarketplace(), (String) null, (ReplacementMode) null);
    }
}
