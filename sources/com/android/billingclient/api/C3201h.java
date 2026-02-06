package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.h  reason: case insensitive filesystem */
public final class C3201h {

    /* renamed from: a  reason: collision with root package name */
    private final String f38277a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f38278b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38279c;

    /* renamed from: d  reason: collision with root package name */
    private final String f38280d;

    /* renamed from: e  reason: collision with root package name */
    private final String f38281e;

    /* renamed from: f  reason: collision with root package name */
    private final String f38282f;

    /* renamed from: g  reason: collision with root package name */
    private final String f38283g;

    /* renamed from: h  reason: collision with root package name */
    private final String f38284h;

    /* renamed from: i  reason: collision with root package name */
    private final String f38285i;

    /* renamed from: j  reason: collision with root package name */
    private final List f38286j;

    /* renamed from: k  reason: collision with root package name */
    private final List f38287k;

    /* renamed from: com.android.billingclient.api.h$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f38288a;

        /* renamed from: b  reason: collision with root package name */
        private final int f38289b;

        a(JSONObject jSONObject) {
            this.f38288a = jSONObject.getInt("commitmentPaymentsCount");
            this.f38289b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        public int a() {
            return this.f38288a;
        }

        public int b() {
            return this.f38289b;
        }
    }

    /* renamed from: com.android.billingclient.api.h$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f38290a;

        /* renamed from: b  reason: collision with root package name */
        private final long f38291b;

        /* renamed from: c  reason: collision with root package name */
        private final String f38292c;

        /* renamed from: d  reason: collision with root package name */
        private final String f38293d;

        /* renamed from: e  reason: collision with root package name */
        private final String f38294e;

        /* renamed from: f  reason: collision with root package name */
        private final S f38295f;

        b(JSONObject jSONObject) {
            this.f38290a = jSONObject.optString("formattedPrice");
            this.f38291b = jSONObject.optLong("priceAmountMicros");
            this.f38292c = jSONObject.optString("priceCurrencyCode");
            String optString = jSONObject.optString("offerIdToken");
            S s10 = null;
            this.f38293d = true == optString.isEmpty() ? null : optString;
            jSONObject.optString("offerId").isEmpty();
            jSONObject.optString("purchaseOptionId").isEmpty();
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
            zzco.zzk(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (optJSONObject != null) {
                optJSONObject.getInt("percentageDiscount");
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (optJSONObject2 != null) {
                optJSONObject2.getLong("startTimeMillis");
                optJSONObject2.getLong("endTimeMillis");
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (optJSONObject3 != null) {
                optJSONObject3.getInt("maximumQuantity");
                optJSONObject3.getInt("remainingQuantity");
            }
            this.f38294e = jSONObject.optString("serializedDocid");
            JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (optJSONObject4 != null) {
                optJSONObject4.getLong("preorderReleaseTimeMillis");
                optJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (optJSONObject5 != null) {
                optJSONObject5.getString("rentalPeriod");
                optJSONObject5.optString("rentalExpirationPeriod").isEmpty();
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.f38295f = optJSONObject6 != null ? new S(optJSONObject6) : s10;
        }

        public String a() {
            return this.f38290a;
        }

        public long b() {
            return this.f38291b;
        }

        public String c() {
            return this.f38292c;
        }

        public final S d() {
            return this.f38295f;
        }

        public final String e() {
            return this.f38293d;
        }

        /* access modifiers changed from: package-private */
        public final String f() {
            return this.f38294e;
        }
    }

    /* renamed from: com.android.billingclient.api.h$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f38296a;

        /* renamed from: b  reason: collision with root package name */
        private final long f38297b;

        /* renamed from: c  reason: collision with root package name */
        private final String f38298c;

        /* renamed from: d  reason: collision with root package name */
        private final String f38299d;

        /* renamed from: e  reason: collision with root package name */
        private final int f38300e;

        /* renamed from: f  reason: collision with root package name */
        private final int f38301f;

        c(JSONObject jSONObject) {
            this.f38299d = jSONObject.optString("billingPeriod");
            this.f38298c = jSONObject.optString("priceCurrencyCode");
            this.f38296a = jSONObject.optString("formattedPrice");
            this.f38297b = jSONObject.optLong("priceAmountMicros");
            this.f38301f = jSONObject.optInt("recurrenceMode");
            this.f38300e = jSONObject.optInt("billingCycleCount");
        }

        public int a() {
            return this.f38300e;
        }

        public String b() {
            return this.f38299d;
        }

        public String c() {
            return this.f38296a;
        }

        public long d() {
            return this.f38297b;
        }

        public String e() {
            return this.f38298c;
        }

        public int f() {
            return this.f38301f;
        }
    }

    /* renamed from: com.android.billingclient.api.h$d */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final List f38302a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        arrayList.add(new c(optJSONObject));
                    }
                }
            }
            this.f38302a = arrayList;
        }

        public List a() {
            return this.f38302a;
        }
    }

    /* renamed from: com.android.billingclient.api.h$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final String f38303a;

        /* renamed from: b  reason: collision with root package name */
        private final String f38304b;

        /* renamed from: c  reason: collision with root package name */
        private final String f38305c;

        /* renamed from: d  reason: collision with root package name */
        private final d f38306d;

        /* renamed from: e  reason: collision with root package name */
        private final List f38307e;

        /* renamed from: f  reason: collision with root package name */
        private final a f38308f;

        e(JSONObject jSONObject) {
            this.f38303a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            a aVar = null;
            this.f38304b = true == optString.isEmpty() ? null : optString;
            this.f38305c = jSONObject.getString("offerIdToken");
            this.f38306d = new d(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f38308f = optJSONObject != null ? new a(optJSONObject) : aVar;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (optJSONObject2 != null) {
                optJSONObject2.getString("productId");
                optJSONObject2.optString(com.amazon.a.a.o.b.f37461S);
                optJSONObject2.optString("name");
                optJSONObject2.optString(com.amazon.a.a.o.b.f37480c);
                optJSONObject2.optString("basePlanId");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
                if (optJSONObject3 != null) {
                    new c(optJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList.add(optJSONArray.getString(i10));
                }
            }
            this.f38307e = arrayList;
        }

        public String a() {
            return this.f38303a;
        }

        public a b() {
            return this.f38308f;
        }

        public String c() {
            return this.f38304b;
        }

        public List d() {
            return this.f38307e;
        }

        public String e() {
            return this.f38305c;
        }

        public d f() {
            return this.f38306d;
        }
    }

    C3201h(String str) {
        ArrayList arrayList;
        this.f38277a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f38278b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f38279c = optString;
        String optString2 = jSONObject.optString("type");
        this.f38280d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        } else if (!TextUtils.isEmpty(optString2)) {
            this.f38281e = jSONObject.optString(com.amazon.a.a.o.b.f37461S);
            this.f38282f = jSONObject.optString("name");
            this.f38283g = jSONObject.optString(com.amazon.a.a.o.b.f37480c);
            jSONObject.optString("packageDisplayName");
            jSONObject.optString(com.amazon.a.a.o.b.f37487j);
            this.f38284h = jSONObject.optString("skuDetailsToken");
            this.f38285i = jSONObject.optString("serializedDocid");
            JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
            if (optJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    arrayList2.add(new e(optJSONArray.getJSONObject(i10)));
                }
                this.f38286j = arrayList2;
            } else {
                if (optString2.equals("subs") || optString2.equals("play_pass_subs")) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                this.f38286j = arrayList;
            }
            JSONObject optJSONObject = this.f38278b.optJSONObject("oneTimePurchaseOfferDetails");
            JSONArray optJSONArray2 = this.f38278b.optJSONArray("oneTimePurchaseOfferDetailsList");
            ArrayList arrayList3 = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                    arrayList3.add(new b(optJSONArray2.getJSONObject(i11)));
                }
                this.f38287k = arrayList3;
            } else if (optJSONObject != null) {
                arrayList3.add(new b(optJSONObject));
                this.f38287k = arrayList3;
            } else {
                this.f38287k = null;
            }
        } else {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
    }

    public String a() {
        return this.f38283g;
    }

    public String b() {
        return this.f38282f;
    }

    public b c() {
        List list = this.f38287k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) this.f38287k.get(0);
    }

    public String d() {
        return this.f38279c;
    }

    public String e() {
        return this.f38280d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3201h)) {
            return false;
        }
        return TextUtils.equals(this.f38277a, ((C3201h) obj).f38277a);
    }

    public List f() {
        return this.f38286j;
    }

    public String g() {
        return this.f38281e;
    }

    public final String h() {
        return this.f38278b.optString("packageName");
    }

    public int hashCode() {
        return this.f38277a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final String i() {
        return this.f38284h;
    }

    public String j() {
        return this.f38285i;
    }

    /* access modifiers changed from: package-private */
    public final List k() {
        return this.f38287k;
    }

    public String toString() {
        List list = this.f38286j;
        String obj = this.f38278b.toString();
        String valueOf = String.valueOf(list);
        return "ProductDetails{jsonString='" + this.f38277a + "', parsedJson=" + obj + ", productId='" + this.f38279c + "', productType='" + this.f38280d + "', title='" + this.f38281e + "', productDetailsToken='" + this.f38284h + "', subscriptionOfferDetails=" + valueOf + "}";
    }
}
