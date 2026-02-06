package com.amazon.device.iap.internal.a.a;

import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.c;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f37826d = "b";

    public b(c cVar, Set<String> set) {
        super(cVar, "1.0", set);
    }

    private Product a(String str, Map map) {
        String str2 = (String) map.get(str);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            ProductType valueOf = ProductType.valueOf(jSONObject.getString(com.amazon.a.a.o.b.f37488k).toUpperCase());
            String string = jSONObject.getString(com.amazon.a.a.o.b.f37480c);
            String optString = jSONObject.optString(com.amazon.a.a.o.b.f37501x);
            String string2 = jSONObject.getString(com.amazon.a.a.o.b.f37461S);
            String string3 = jSONObject.getString(com.amazon.a.a.o.b.f37487j);
            return new ProductBuilder().setSku(str).setProductType(valueOf).setDescription(string).setPrice(optString).setSmallIconUrl(string3).setTitle(string2).setCoinsRewardAmount(jSONObject.optInt(com.amazon.a.a.o.b.f37462T, 0)).build();
        } catch (JSONException unused) {
            throw new IllegalArgumentException("error in parsing json string" + str2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean b(j jVar) {
        Map b10 = jVar.b();
        String str = f37826d;
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
                    String str2 = f37826d;
                    com.amazon.device.iap.internal.util.b.b(str2, "Error parsing JSON for SKU " + next + ": " + e10.getMessage());
                }
            }
        }
        c cVar = (c) j();
        cVar.a().a((Object) new ProductDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(ProductDataResponse.RequestStatus.SUCCESSFUL).setUnavailableSkus(linkedHashSet).setProductData(hashMap).build());
        return true;
    }
}
