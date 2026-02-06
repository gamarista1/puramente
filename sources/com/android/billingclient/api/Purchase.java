package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Purchase {

    /* renamed from: a  reason: collision with root package name */
    private final String f38170a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38171b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f38172c;

    public Purchase(String str, String str2) {
        this.f38170a = str;
        this.f38171b = str2;
        this.f38172c = new JSONObject(str);
    }

    private final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        if (this.f38172c.has("productIds")) {
            JSONArray optJSONArray = this.f38172c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.optString(i10));
                }
            }
        } else if (this.f38172c.has("productId")) {
            arrayList.add(this.f38172c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        String optString = this.f38172c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    public String b() {
        return this.f38170a;
    }

    public List c() {
        return j();
    }

    public int d() {
        if (this.f38172c.optInt("purchaseState", 1) != 4) {
            return 1;
        }
        return 2;
    }

    public long e() {
        return this.f38172c.optLong("purchaseTime");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (!TextUtils.equals(this.f38170a, purchase.b()) || !TextUtils.equals(this.f38171b, purchase.g())) {
            return false;
        }
        return true;
    }

    public String f() {
        JSONObject jSONObject = this.f38172c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String g() {
        return this.f38171b;
    }

    public boolean h() {
        return this.f38172c.optBoolean("acknowledged", true);
    }

    public int hashCode() {
        return this.f38170a.hashCode();
    }

    public boolean i() {
        return this.f38172c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f38170a));
    }
}
