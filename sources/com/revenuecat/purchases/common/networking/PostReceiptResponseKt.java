package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.O;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"buildPostReceiptResponse", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "result", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PostReceiptResponseKt {
    public static final PostReceiptResponse buildPostReceiptResponse(HTTPResult hTTPResult) {
        Boolean bool;
        C6496s.h(hTTPResult, "result");
        CustomerInfo buildCustomerInfo = CustomerInfoFactory.INSTANCE.buildCustomerInfo(hTTPResult);
        JSONObject optJSONObject = hTTPResult.getBody().optJSONObject("purchased_products");
        LinkedHashMap linkedHashMap = null;
        if (optJSONObject != null) {
            Map map$default = JSONObjectExtensionsKt.toMap$default(optJSONObject, false, 1, (Object) null);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(O.e(map$default.size()));
            for (Map.Entry entry : map$default.entrySet()) {
                Object key = entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                if (!jSONObject.has("should_consume")) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    bool = Boolean.valueOf(jSONObject.optBoolean("should_consume"));
                } else {
                    bool = null;
                }
                linkedHashMap2.put(key, new PostReceiptProductInfo(bool));
            }
            linkedHashMap = linkedHashMap2;
        }
        return new PostReceiptResponse(buildCustomerInfo, linkedHashMap, hTTPResult.getBody());
    }
}
