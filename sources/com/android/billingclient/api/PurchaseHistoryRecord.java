package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class PurchaseHistoryRecord {

    /* renamed from: a  reason: collision with root package name */
    private final String f38173a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38174b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f38175c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f38173a = str;
        this.f38174b = str2;
        this.f38175c = new JSONObject(str);
    }

    private final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        if (this.f38175c.has("productIds")) {
            JSONArray optJSONArray = this.f38175c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.optString(i10));
                }
            }
        } else if (this.f38175c.has("productId")) {
            arrayList.add(this.f38175c.optString("productId"));
        }
        return arrayList;
    }

    public String a() {
        return this.f38173a;
    }

    public List b() {
        return g();
    }

    public long c() {
        return this.f38175c.optLong("purchaseTime");
    }

    public String d() {
        JSONObject jSONObject = this.f38175c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public String e() {
        return this.f38174b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        if (!TextUtils.equals(this.f38173a, purchaseHistoryRecord.a()) || !TextUtils.equals(this.f38174b, purchaseHistoryRecord.e())) {
            return false;
        }
        return true;
    }

    public ArrayList f() {
        return g();
    }

    public int hashCode() {
        return this.f38173a.hashCode();
    }

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f38173a));
    }
}
