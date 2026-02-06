package com.amazon.device.iap.internal.c;

import com.amazon.a.a.o.b;
import com.amazon.device.iap.model.Promotion;
import com.amazon.device.iap.model.PromotionPlan;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class a {
    a() {
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
        String str;
        String string = jSONObject.getString(b.f37497t);
        int i10 = jSONObject.getInt(b.f37498u);
        JSONObject optJSONObject = jSONObject.optJSONObject(b.f37500w);
        if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
            str = null;
        } else {
            Currency instance = Currency.getInstance(optJSONObject.optString(b.f37469a));
            str = instance.getSymbol() + optJSONObject.optString("value");
        }
        return new PromotionPlan(string, str, i10);
    }

    private static List<PromotionPlan> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(c(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }
}
