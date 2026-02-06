package Ie;

import Fe.C3031u;
import Fe.y;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    b f31884a;

    /* renamed from: b  reason: collision with root package name */
    public Double f31885b;

    /* renamed from: c  reason: collision with root package name */
    public Double f31886c;

    /* renamed from: d  reason: collision with root package name */
    public e f31887d;

    /* renamed from: e  reason: collision with root package name */
    public String f31888e;

    /* renamed from: f  reason: collision with root package name */
    public String f31889f;

    /* renamed from: g  reason: collision with root package name */
    public String f31890g;

    /* renamed from: h  reason: collision with root package name */
    public h f31891h;

    /* renamed from: i  reason: collision with root package name */
    public b f31892i;

    /* renamed from: j  reason: collision with root package name */
    public String f31893j;

    /* renamed from: k  reason: collision with root package name */
    public Double f31894k;

    /* renamed from: l  reason: collision with root package name */
    public Double f31895l;

    /* renamed from: m  reason: collision with root package name */
    public Integer f31896m;

    /* renamed from: n  reason: collision with root package name */
    public Double f31897n;

    /* renamed from: o  reason: collision with root package name */
    public String f31898o;

    /* renamed from: p  reason: collision with root package name */
    public String f31899p;

    /* renamed from: q  reason: collision with root package name */
    public String f31900q;

    /* renamed from: r  reason: collision with root package name */
    public String f31901r;

    /* renamed from: s  reason: collision with root package name */
    public String f31902s;

    /* renamed from: t  reason: collision with root package name */
    public Double f31903t;

    /* renamed from: u  reason: collision with root package name */
    public Double f31904u;

    /* renamed from: v  reason: collision with root package name */
    private final ArrayList f31905v;

    /* renamed from: w  reason: collision with root package name */
    private final HashMap f31906w;

    class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public enum b {
        OTHER,
        NEW,
        GOOD,
        FAIR,
        POOR,
        USED,
        REFURBISHED,
        EXCELLENT;

        public static b b(String str) {
            if (!TextUtils.isEmpty(str)) {
                for (b bVar : values()) {
                    if (bVar.name().equalsIgnoreCase(str)) {
                        return bVar;
                    }
                }
            }
            return null;
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static d d(C3031u.a aVar) {
        d dVar = new d();
        dVar.f31884a = b.b(aVar.h(y.ContentSchema.b()));
        dVar.f31885b = aVar.d(y.Quantity.b(), (Double) null);
        dVar.f31886c = aVar.d(y.Price.b(), (Double) null);
        dVar.f31887d = e.b(aVar.h(y.PriceCurrency.b()));
        dVar.f31888e = aVar.h(y.SKU.b());
        dVar.f31889f = aVar.h(y.ProductName.b());
        dVar.f31890g = aVar.h(y.ProductBrand.b());
        dVar.f31891h = h.c(aVar.h(y.ProductCategory.b()));
        dVar.f31892i = b.b(aVar.h(y.Condition.b()));
        dVar.f31893j = aVar.h(y.ProductVariant.b());
        dVar.f31894k = aVar.d(y.Rating.b(), (Double) null);
        dVar.f31895l = aVar.d(y.RatingAverage.b(), (Double) null);
        dVar.f31896m = aVar.e(y.RatingCount.b(), (Integer) null);
        dVar.f31897n = aVar.d(y.RatingMax.b(), (Double) null);
        dVar.f31898o = aVar.h(y.AddressStreet.b());
        dVar.f31899p = aVar.h(y.AddressCity.b());
        dVar.f31900q = aVar.h(y.AddressRegion.b());
        dVar.f31901r = aVar.h(y.AddressCountry.b());
        dVar.f31902s = aVar.h(y.AddressPostalCode.b());
        dVar.f31903t = aVar.d(y.Latitude.b(), (Double) null);
        dVar.f31904u = aVar.d(y.Longitude.b(), (Double) null);
        JSONArray f10 = aVar.f(y.ImageCaptions.b());
        if (f10 != null) {
            for (int i10 = 0; i10 < f10.length(); i10++) {
                dVar.f31905v.add(f10.optString(i10));
            }
        }
        try {
            JSONObject a10 = aVar.a();
            Iterator<String> keys = a10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                dVar.f31906w.put(next, a10.optString(next));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return dVar;
    }

    public d a(String str, String str2) {
        this.f31906w.put(str, str2);
        return this;
    }

    public d b(String... strArr) {
        Collections.addAll(this.f31905v, strArr);
        return this;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f31884a != null) {
                jSONObject.put(y.ContentSchema.b(), this.f31884a.name());
            }
            if (this.f31885b != null) {
                jSONObject.put(y.Quantity.b(), this.f31885b);
            }
            if (this.f31886c != null) {
                jSONObject.put(y.Price.b(), this.f31886c);
            }
            if (this.f31887d != null) {
                jSONObject.put(y.PriceCurrency.b(), this.f31887d.toString());
            }
            if (!TextUtils.isEmpty(this.f31888e)) {
                jSONObject.put(y.SKU.b(), this.f31888e);
            }
            if (!TextUtils.isEmpty(this.f31889f)) {
                jSONObject.put(y.ProductName.b(), this.f31889f);
            }
            if (!TextUtils.isEmpty(this.f31890g)) {
                jSONObject.put(y.ProductBrand.b(), this.f31890g);
            }
            if (this.f31891h != null) {
                jSONObject.put(y.ProductCategory.b(), this.f31891h.b());
            }
            if (this.f31892i != null) {
                jSONObject.put(y.Condition.b(), this.f31892i.name());
            }
            if (!TextUtils.isEmpty(this.f31893j)) {
                jSONObject.put(y.ProductVariant.b(), this.f31893j);
            }
            if (this.f31894k != null) {
                jSONObject.put(y.Rating.b(), this.f31894k);
            }
            if (this.f31895l != null) {
                jSONObject.put(y.RatingAverage.b(), this.f31895l);
            }
            if (this.f31896m != null) {
                jSONObject.put(y.RatingCount.b(), this.f31896m);
            }
            if (this.f31897n != null) {
                jSONObject.put(y.RatingMax.b(), this.f31897n);
            }
            if (!TextUtils.isEmpty(this.f31898o)) {
                jSONObject.put(y.AddressStreet.b(), this.f31898o);
            }
            if (!TextUtils.isEmpty(this.f31899p)) {
                jSONObject.put(y.AddressCity.b(), this.f31899p);
            }
            if (!TextUtils.isEmpty(this.f31900q)) {
                jSONObject.put(y.AddressRegion.b(), this.f31900q);
            }
            if (!TextUtils.isEmpty(this.f31901r)) {
                jSONObject.put(y.AddressCountry.b(), this.f31901r);
            }
            if (!TextUtils.isEmpty(this.f31902s)) {
                jSONObject.put(y.AddressPostalCode.b(), this.f31902s);
            }
            if (this.f31903t != null) {
                jSONObject.put(y.Latitude.b(), this.f31903t);
            }
            if (this.f31904u != null) {
                jSONObject.put(y.Longitude.b(), this.f31904u);
            }
            if (this.f31905v.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put(y.ImageCaptions.b(), jSONArray);
                Iterator it = this.f31905v.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            }
            if (this.f31906w.size() > 0) {
                for (String str : this.f31906w.keySet()) {
                    jSONObject.put(str, this.f31906w.get(str));
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public HashMap e() {
        return this.f31906w;
    }

    public d f(String str, String str2, String str3, String str4, String str5) {
        this.f31898o = str;
        this.f31899p = str2;
        this.f31900q = str3;
        this.f31901r = str4;
        this.f31902s = str5;
        return this;
    }

    public d g(b bVar) {
        this.f31884a = bVar;
        return this;
    }

    public d h(Double d10, Double d11) {
        this.f31903t = d10;
        this.f31904u = d11;
        return this;
    }

    public d i(Double d10, e eVar) {
        this.f31886c = d10;
        this.f31887d = eVar;
        return this;
    }

    public d j(String str) {
        this.f31890g = str;
        return this;
    }

    public d k(h hVar) {
        this.f31891h = hVar;
        return this;
    }

    public d l(b bVar) {
        this.f31892i = bVar;
        return this;
    }

    public d n(String str) {
        this.f31889f = str;
        return this;
    }

    public d o(String str) {
        this.f31893j = str;
        return this;
    }

    public d p(Double d10) {
        this.f31885b = d10;
        return this;
    }

    public d q(Double d10, Double d11, Integer num) {
        this.f31895l = d10;
        this.f31897n = d11;
        this.f31896m = num;
        return this;
    }

    public d s(String str) {
        this.f31888e = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        String str;
        String str2;
        String str3;
        b bVar = this.f31884a;
        String str4 = "";
        if (bVar != null) {
            str = bVar.name();
        } else {
            str = str4;
        }
        parcel.writeString(str);
        parcel.writeSerializable(this.f31885b);
        parcel.writeSerializable(this.f31886c);
        e eVar = this.f31887d;
        if (eVar != null) {
            str2 = eVar.name();
        } else {
            str2 = str4;
        }
        parcel.writeString(str2);
        parcel.writeString(this.f31888e);
        parcel.writeString(this.f31889f);
        parcel.writeString(this.f31890g);
        h hVar = this.f31891h;
        if (hVar != null) {
            str3 = hVar.b();
        } else {
            str3 = str4;
        }
        parcel.writeString(str3);
        b bVar2 = this.f31892i;
        if (bVar2 != null) {
            str4 = bVar2.name();
        }
        parcel.writeString(str4);
        parcel.writeString(this.f31893j);
        parcel.writeSerializable(this.f31894k);
        parcel.writeSerializable(this.f31895l);
        parcel.writeSerializable(this.f31896m);
        parcel.writeSerializable(this.f31897n);
        parcel.writeString(this.f31898o);
        parcel.writeString(this.f31899p);
        parcel.writeString(this.f31900q);
        parcel.writeString(this.f31901r);
        parcel.writeString(this.f31902s);
        parcel.writeSerializable(this.f31903t);
        parcel.writeSerializable(this.f31904u);
        parcel.writeSerializable(this.f31905v);
        parcel.writeSerializable(this.f31906w);
    }

    public d() {
        this.f31905v = new ArrayList();
        this.f31906w = new HashMap();
    }

    private d(Parcel parcel) {
        this();
        this.f31884a = b.b(parcel.readString());
        this.f31885b = (Double) parcel.readSerializable();
        this.f31886c = (Double) parcel.readSerializable();
        this.f31887d = e.b(parcel.readString());
        this.f31888e = parcel.readString();
        this.f31889f = parcel.readString();
        this.f31890g = parcel.readString();
        this.f31891h = h.c(parcel.readString());
        this.f31892i = b.b(parcel.readString());
        this.f31893j = parcel.readString();
        this.f31894k = (Double) parcel.readSerializable();
        this.f31895l = (Double) parcel.readSerializable();
        this.f31896m = (Integer) parcel.readSerializable();
        this.f31897n = (Double) parcel.readSerializable();
        this.f31898o = parcel.readString();
        this.f31899p = parcel.readString();
        this.f31900q = parcel.readString();
        this.f31901r = parcel.readString();
        this.f31902s = parcel.readString();
        this.f31903t = (Double) parcel.readSerializable();
        this.f31904u = (Double) parcel.readSerializable();
        this.f31905v.addAll((ArrayList) parcel.readSerializable());
        this.f31906w.putAll((HashMap) parcel.readSerializable());
    }
}
