package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.o.b;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.model.Promotion;
import com.amazon.device.iap.model.PromotionPlan;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class e {
    e() {
    }

    static List<Promotion> a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(b.f37494q);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(b(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }

    private static Promotion b(JSONObject jSONObject) {
        return new Promotion(jSONObject.getString(b.f37495r), a(jSONObject.getJSONArray(b.f37496s)));
    }

    private static PromotionPlan c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String string = jSONObject.getString(b.f37497t);
        int i10 = jSONObject.getInt(b.f37498u);
        String optString = jSONObject.optString(b.f37499v);
        if (f.a(optString) && (jSONObject2 = jSONObject.getJSONObject(b.f37500w)) != null) {
            Currency instance = Currency.getInstance(jSONObject2.getString(b.f37469a));
            optString = instance.getSymbol() + new BigDecimal(jSONObject2.getString("value"));
        }
        return new PromotionPlan(string, optString, i10);
    }

    private static List<PromotionPlan> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(c(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }
}
