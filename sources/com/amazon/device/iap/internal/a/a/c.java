package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.o.b;
import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.util.MetricsHelper;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Promotion;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f37827d = "c";

    public c(com.amazon.device.iap.internal.a.c cVar, Set<String> set) {
        super(cVar, b.f37477ah, set);
    }

    private Product a(String str, Map map) {
        String str2;
        String str3;
        JSONObject optJSONObject;
        String str4 = (String) map.get(str);
        try {
            JSONObject jSONObject = new JSONObject(str4);
            ProductType valueOf = ProductType.valueOf(jSONObject.getString(b.f37488k).toUpperCase());
            String string = jSONObject.getString(b.f37480c);
            List<Promotion> list = null;
            String optString = jSONObject.optString(b.f37501x, (String) null);
            if (f.a(optString) && (optJSONObject = jSONObject.optJSONObject(b.f37502y)) != null) {
                Currency instance = Currency.getInstance(optJSONObject.getString(b.f37469a));
                optString = instance.getSymbol() + new BigDecimal(optJSONObject.getString("value"));
            }
            String string2 = jSONObject.getString(b.f37461S);
            String string3 = jSONObject.getString(b.f37487j);
            int optInt = jSONObject.optInt(b.f37462T, 0);
            if (jSONObject.isNull(b.f37492o)) {
                str2 = null;
            } else {
                str2 = jSONObject.getString(b.f37492o);
            }
            if (jSONObject.isNull(b.f37493p)) {
                str3 = null;
            } else {
                str3 = jSONObject.getString(b.f37493p);
            }
            if (!jSONObject.isNull(b.f37494q)) {
                list = e.a(jSONObject);
            }
            return new ProductBuilder().setSku(str).setProductType(valueOf).setDescription(string).setPrice(optString).setSmallIconUrl(string3).setTitle(string2).setCoinsRewardAmount(optInt).setSubscriptionPeriod(str2).setFreeTrialPeriod(str3).setPromotions(list).build();
        } catch (JSONException unused) {
            throw new IllegalArgumentException("error in parsing json string" + str4);
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        Map b10 = jVar.b();
        String str = f37827d;
        com.amazon.device.iap.internal.util.b.a(str, "data: " + b10);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        for (String next : this.f37825c) {
            if (!b10.containsKey(next)) {
                linkedHashSet.add(next);
            } else {
                try {
                    hashMap.put(next, a(next, b10));
                } catch (IllegalArgumentException e10) {
                    linkedHashSet.add(next);
                    String k10 = k();
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = f37827d;
                    sb2.append(str2);
                    sb2.append(".onResult()");
                    MetricsHelper.submitJsonParsingExceptionMetrics(k10, (String) b10.get(next), sb2.toString());
                    com.amazon.device.iap.internal.util.b.b(str2, "Error parsing JSON for SKU " + next + ": " + e10.getMessage());
                }
            }
        }
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        cVar.a().a((Object) new ProductDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(ProductDataResponse.RequestStatus.SUCCESSFUL).setUnavailableSkus(linkedHashSet).setProductData(hashMap).build());
        return true;
    }
}
