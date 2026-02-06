package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"errorGettingReceiptInfo", "Lcom/revenuecat/purchases/PurchasesError;", "error", "missingTermSkuError", "response", "Lorg/json/JSONObject;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ErrorsKt {
    public static final PurchasesError errorGettingReceiptInfo(PurchasesError purchasesError) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.InvalidReceiptError;
        return new PurchasesError(purchasesErrorCode, "Couldn't get Amazon receipt data from RevenueCat backend. Error: " + purchasesError);
    }

    public static final PurchasesError missingTermSkuError(JSONObject jSONObject) {
        C6496s.h(jSONObject, "response");
        PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnexpectedBackendResponseError;
        return new PurchasesError(purchasesErrorCode, "Amazon receipt data response is missing termSku. Response:\n" + jSONObject);
    }
}
