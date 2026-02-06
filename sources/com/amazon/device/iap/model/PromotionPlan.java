package com.amazon.device.iap.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class PromotionPlan implements Parcelable {
    public static final Parcelable.Creator<PromotionPlan> CREATOR = new Parcelable.Creator<PromotionPlan>() {
        public PromotionPlan createFromParcel(Parcel parcel) {
            return new PromotionPlan(parcel);
        }

        public PromotionPlan[] newArray(int i10) {
            return new PromotionPlan[i10];
        }
    };
    private final String promotionPrice;
    private final int promotionPriceCycles;
    private final String promotionPricePeriod;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionPlan)) {
            return false;
        }
        PromotionPlan promotionPlan = (PromotionPlan) obj;
        if (getPromotionPriceCycles() != promotionPlan.getPromotionPriceCycles() || getPromotionPrice() == null || !getPromotionPrice().equals(promotionPlan.getPromotionPrice()) || getPromotionPricePeriod() == null || !getPromotionPricePeriod().equals(promotionPlan.getPromotionPricePeriod())) {
            return false;
        }
        return true;
    }

    public String getPromotionPrice() {
        return this.promotionPrice;
    }

    public int getPromotionPriceCycles() {
        return this.promotionPriceCycles;
    }

    public String getPromotionPricePeriod() {
        return this.promotionPricePeriod;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(b.f37497t, getPromotionPricePeriod());
        jSONObject.put(b.f37499v, getPromotionPrice());
        jSONObject.put(b.f37498u, getPromotionPriceCycles());
        return jSONObject;
    }

    public String toString() {
        try {
            return toJSON().toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.promotionPricePeriod);
        parcel.writeString(this.promotionPrice);
        parcel.writeInt(this.promotionPriceCycles);
    }

    public PromotionPlan(String str, String str2, int i10) {
        this.promotionPricePeriod = str;
        this.promotionPrice = str2;
        this.promotionPriceCycles = i10;
    }

    private PromotionPlan(Parcel parcel) {
        this.promotionPricePeriod = parcel.readString();
        this.promotionPrice = parcel.readString();
        this.promotionPriceCycles = parcel.readInt();
    }
}
