package com.android.billingclient.api;

import com.android.billingclient.api.C3201h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class S {
    S(JSONObject jSONObject) {
        jSONObject.getString("type");
        JSONArray optJSONArray = jSONObject.optJSONArray("balanceThresholds");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                arrayList.add(Integer.valueOf(optJSONArray.getInt(i10)));
            }
        }
        new C3201h.d(jSONObject.getJSONArray("pricingPhases"));
    }
}
