package com.facebook;

import Sg.C5541d;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import io.jsonwebtoken.Claims;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.r;
import o7.W;
import o7.X;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.l  reason: case insensitive filesystem */
public final class C3322l implements Parcelable {
    public static final Parcelable.Creator<C3322l> CREATOR = new a();

    /* renamed from: u  reason: collision with root package name */
    public static final b f40110u = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f40111a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40112b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40113c;

    /* renamed from: d  reason: collision with root package name */
    private final String f40114d;

    /* renamed from: e  reason: collision with root package name */
    private final long f40115e;

    /* renamed from: f  reason: collision with root package name */
    private final long f40116f;

    /* renamed from: g  reason: collision with root package name */
    private final String f40117g;

    /* renamed from: h  reason: collision with root package name */
    private final String f40118h;

    /* renamed from: i  reason: collision with root package name */
    private final String f40119i;

    /* renamed from: j  reason: collision with root package name */
    private final String f40120j;

    /* renamed from: k  reason: collision with root package name */
    private final String f40121k;

    /* renamed from: l  reason: collision with root package name */
    private final String f40122l;

    /* renamed from: m  reason: collision with root package name */
    private final String f40123m;

    /* renamed from: n  reason: collision with root package name */
    private final Set f40124n;

    /* renamed from: o  reason: collision with root package name */
    private final String f40125o;

    /* renamed from: p  reason: collision with root package name */
    private final Map f40126p;

    /* renamed from: q  reason: collision with root package name */
    private final Map f40127q;

    /* renamed from: r  reason: collision with root package name */
    private final Map f40128r;

    /* renamed from: s  reason: collision with root package name */
    private final String f40129s;

    /* renamed from: t  reason: collision with root package name */
    private final String f40130t;

    /* renamed from: com.facebook.l$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        /* renamed from: a */
        public C3322l createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new C3322l(parcel);
        }

        /* renamed from: b */
        public C3322l[] newArray(int i10) {
            return new C3322l[i10];
        }
    }

    /* renamed from: com.facebook.l$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(JSONObject jSONObject, String str) {
            C6496s.h(jSONObject, "<this>");
            C6496s.h(str, "name");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }

        private b() {
        }
    }

    public C3322l(String str, String str2) {
        Set set;
        Map map;
        Map map2;
        C6496s.h(str, "encodedClaims");
        C6496s.h(str2, "expectedNonce");
        X.j(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 8);
        C6496s.g(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, C5541d.f65029b));
        if (a(jSONObject, str2)) {
            String string = jSONObject.getString(Claims.ID);
            C6496s.g(string, "jsonObj.getString(JSON_KEY_JIT)");
            this.f40111a = string;
            String string2 = jSONObject.getString(Claims.ISSUER);
            C6496s.g(string2, "jsonObj.getString(JSON_KEY_ISS)");
            this.f40112b = string2;
            String string3 = jSONObject.getString(Claims.AUDIENCE);
            C6496s.g(string3, "jsonObj.getString(JSON_KEY_AUD)");
            this.f40113c = string3;
            String string4 = jSONObject.getString("nonce");
            C6496s.g(string4, "jsonObj.getString(JSON_KEY_NONCE)");
            this.f40114d = string4;
            this.f40115e = jSONObject.getLong(Claims.EXPIRATION);
            this.f40116f = jSONObject.getLong(Claims.ISSUED_AT);
            String string5 = jSONObject.getString(Claims.SUBJECT);
            C6496s.g(string5, "jsonObj.getString(JSON_KEY_SUB)");
            this.f40117g = string5;
            b bVar = f40110u;
            this.f40118h = bVar.a(jSONObject, "name");
            this.f40119i = bVar.a(jSONObject, "given_name");
            this.f40120j = bVar.a(jSONObject, "middle_name");
            this.f40121k = bVar.a(jSONObject, "family_name");
            this.f40122l = bVar.a(jSONObject, "email");
            this.f40123m = bVar.a(jSONObject, "picture");
            JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
            Map map3 = null;
            if (optJSONArray == null) {
                set = null;
            } else {
                set = Collections.unmodifiableSet(W.h0(optJSONArray));
            }
            this.f40124n = set;
            this.f40125o = bVar.a(jSONObject, "user_birthday");
            JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
            if (optJSONObject == null) {
                map = null;
            } else {
                map = Collections.unmodifiableMap(W.o(optJSONObject));
            }
            this.f40126p = map;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
            if (optJSONObject2 == null) {
                map2 = null;
            } else {
                map2 = Collections.unmodifiableMap(W.p(optJSONObject2));
            }
            this.f40127q = map2;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
            this.f40128r = optJSONObject3 != null ? Collections.unmodifiableMap(W.p(optJSONObject3)) : map3;
            this.f40129s = bVar.a(jSONObject, "user_gender");
            this.f40130t = bVar.a(jSONObject, "user_link");
            return;
        }
        throw new IllegalArgumentException("Invalid claims");
    }

    private final boolean a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString(Claims.ID);
        C6496s.g(optString, Claims.ID);
        if (optString.length() == 0) {
            return false;
        }
        try {
            String optString2 = jSONObject.optString(Claims.ISSUER);
            C6496s.g(optString2, Claims.ISSUER);
            if (optString2.length() != 0) {
                if (C6496s.c(new URL(optString2).getHost(), "facebook.com") || C6496s.c(new URL(optString2).getHost(), "www.facebook.com")) {
                    String optString3 = jSONObject.optString(Claims.AUDIENCE);
                    C6496s.g(optString3, Claims.AUDIENCE);
                    if (optString3.length() == 0 || !C6496s.c(optString3, I.m())) {
                        return false;
                    }
                    long j10 = (long) 1000;
                    if (new Date().after(new Date(jSONObject.optLong(Claims.EXPIRATION) * j10))) {
                        return false;
                    }
                    if (new Date().after(new Date((jSONObject.optLong(Claims.ISSUED_AT) * j10) + 600000))) {
                        return false;
                    }
                    String optString4 = jSONObject.optString(Claims.SUBJECT);
                    C6496s.g(optString4, Claims.SUBJECT);
                    if (optString4.length() == 0) {
                        return false;
                    }
                    String optString5 = jSONObject.optString("nonce");
                    C6496s.g(optString5, "nonce");
                    if (optString5.length() != 0 && C6496s.c(optString5, str)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Claims.ID, this.f40111a);
        jSONObject.put(Claims.ISSUER, this.f40112b);
        jSONObject.put(Claims.AUDIENCE, this.f40113c);
        jSONObject.put("nonce", this.f40114d);
        jSONObject.put(Claims.EXPIRATION, this.f40115e);
        jSONObject.put(Claims.ISSUED_AT, this.f40116f);
        String str = this.f40117g;
        if (str != null) {
            jSONObject.put(Claims.SUBJECT, str);
        }
        String str2 = this.f40118h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f40119i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f40120j;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f40121k;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f40122l;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f40123m;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f40124n != null) {
            jSONObject.put("user_friends", new JSONArray(this.f40124n));
        }
        String str8 = this.f40125o;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.f40126p != null) {
            jSONObject.put("user_age_range", new JSONObject(this.f40126p));
        }
        if (this.f40127q != null) {
            jSONObject.put("user_hometown", new JSONObject(this.f40127q));
        }
        if (this.f40128r != null) {
            jSONObject.put("user_location", new JSONObject(this.f40128r));
        }
        String str9 = this.f40129s;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f40130t;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3322l)) {
            return false;
        }
        C3322l lVar = (C3322l) obj;
        if (!C6496s.c(this.f40111a, lVar.f40111a) || !C6496s.c(this.f40112b, lVar.f40112b) || !C6496s.c(this.f40113c, lVar.f40113c) || !C6496s.c(this.f40114d, lVar.f40114d) || this.f40115e != lVar.f40115e || this.f40116f != lVar.f40116f || !C6496s.c(this.f40117g, lVar.f40117g) || !C6496s.c(this.f40118h, lVar.f40118h) || !C6496s.c(this.f40119i, lVar.f40119i) || !C6496s.c(this.f40120j, lVar.f40120j) || !C6496s.c(this.f40121k, lVar.f40121k) || !C6496s.c(this.f40122l, lVar.f40122l) || !C6496s.c(this.f40123m, lVar.f40123m) || !C6496s.c(this.f40124n, lVar.f40124n) || !C6496s.c(this.f40125o, lVar.f40125o) || !C6496s.c(this.f40126p, lVar.f40126p) || !C6496s.c(this.f40127q, lVar.f40127q) || !C6496s.c(this.f40128r, lVar.f40128r) || !C6496s.c(this.f40129s, lVar.f40129s) || !C6496s.c(this.f40130t, lVar.f40130t)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int hashCode = (((((((((((((527 + this.f40111a.hashCode()) * 31) + this.f40112b.hashCode()) * 31) + this.f40113c.hashCode()) * 31) + this.f40114d.hashCode()) * 31) + Long.hashCode(this.f40115e)) * 31) + Long.hashCode(this.f40116f)) * 31) + this.f40117g.hashCode()) * 31;
        String str = this.f40118h;
        int i22 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (hashCode + i10) * 31;
        String str2 = this.f40119i;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 31;
        String str3 = this.f40120j;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 31;
        String str4 = this.f40121k;
        if (str4 != null) {
            i13 = str4.hashCode();
        } else {
            i13 = 0;
        }
        int i26 = (i25 + i13) * 31;
        String str5 = this.f40122l;
        if (str5 != null) {
            i14 = str5.hashCode();
        } else {
            i14 = 0;
        }
        int i27 = (i26 + i14) * 31;
        String str6 = this.f40123m;
        if (str6 != null) {
            i15 = str6.hashCode();
        } else {
            i15 = 0;
        }
        int i28 = (i27 + i15) * 31;
        Set set = this.f40124n;
        if (set != null) {
            i16 = set.hashCode();
        } else {
            i16 = 0;
        }
        int i29 = (i28 + i16) * 31;
        String str7 = this.f40125o;
        if (str7 != null) {
            i17 = str7.hashCode();
        } else {
            i17 = 0;
        }
        int i30 = (i29 + i17) * 31;
        Map map = this.f40126p;
        if (map != null) {
            i18 = map.hashCode();
        } else {
            i18 = 0;
        }
        int i31 = (i30 + i18) * 31;
        Map map2 = this.f40127q;
        if (map2 != null) {
            i19 = map2.hashCode();
        } else {
            i19 = 0;
        }
        int i32 = (i31 + i19) * 31;
        Map map3 = this.f40128r;
        if (map3 != null) {
            i20 = map3.hashCode();
        } else {
            i20 = 0;
        }
        int i33 = (i32 + i20) * 31;
        String str8 = this.f40129s;
        if (str8 != null) {
            i21 = str8.hashCode();
        } else {
            i21 = 0;
        }
        int i34 = (i33 + i21) * 31;
        String str9 = this.f40130t;
        if (str9 != null) {
            i22 = str9.hashCode();
        }
        return i34 + i22;
    }

    public String toString() {
        String jSONObject = b().toString();
        C6496s.g(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeString(this.f40111a);
        parcel.writeString(this.f40112b);
        parcel.writeString(this.f40113c);
        parcel.writeString(this.f40114d);
        parcel.writeLong(this.f40115e);
        parcel.writeLong(this.f40116f);
        parcel.writeString(this.f40117g);
        parcel.writeString(this.f40118h);
        parcel.writeString(this.f40119i);
        parcel.writeString(this.f40120j);
        parcel.writeString(this.f40121k);
        parcel.writeString(this.f40122l);
        parcel.writeString(this.f40123m);
        if (this.f40124n == null) {
            parcel.writeStringList((List) null);
        } else {
            parcel.writeStringList(new ArrayList(this.f40124n));
        }
        parcel.writeString(this.f40125o);
        parcel.writeMap(this.f40126p);
        parcel.writeMap(this.f40127q);
        parcel.writeMap(this.f40128r);
        parcel.writeString(this.f40129s);
        parcel.writeString(this.f40130t);
    }

    public C3322l(Parcel parcel) {
        C6496s.h(parcel, "parcel");
        this.f40111a = X.n(parcel.readString(), Claims.ID);
        this.f40112b = X.n(parcel.readString(), Claims.ISSUER);
        this.f40113c = X.n(parcel.readString(), Claims.AUDIENCE);
        this.f40114d = X.n(parcel.readString(), "nonce");
        this.f40115e = parcel.readLong();
        this.f40116f = parcel.readLong();
        this.f40117g = X.n(parcel.readString(), Claims.SUBJECT);
        this.f40118h = parcel.readString();
        this.f40119i = parcel.readString();
        this.f40120j = parcel.readString();
        this.f40121k = parcel.readString();
        this.f40122l = parcel.readString();
        this.f40123m = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        Map map = null;
        this.f40124n = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f40125o = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(r.f71790a.getClass().getClassLoader());
        readHashMap = readHashMap == null ? null : readHashMap;
        this.f40126p = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        U u10 = U.f71764a;
        HashMap readHashMap2 = parcel.readHashMap(u10.getClass().getClassLoader());
        readHashMap2 = readHashMap2 == null ? null : readHashMap2;
        this.f40127q = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(u10.getClass().getClassLoader());
        readHashMap3 = readHashMap3 == null ? null : readHashMap3;
        this.f40128r = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : map;
        this.f40129s = parcel.readString();
        this.f40130t = parcel.readString();
    }
}
