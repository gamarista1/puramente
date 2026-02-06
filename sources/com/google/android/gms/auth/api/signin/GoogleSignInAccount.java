package com.google.android.gms.auth.api.signin;

import Ea.e;
import Ea.h;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ua.C5221d;
import za.C5298a;
import za.c;

@Deprecated
public class GoogleSignInAccount extends C5298a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: n  reason: collision with root package name */
    public static final e f53833n = h.c();

    /* renamed from: a  reason: collision with root package name */
    final int f53834a;

    /* renamed from: b  reason: collision with root package name */
    private final String f53835b;

    /* renamed from: c  reason: collision with root package name */
    private final String f53836c;

    /* renamed from: d  reason: collision with root package name */
    private final String f53837d;

    /* renamed from: e  reason: collision with root package name */
    private final String f53838e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f53839f;

    /* renamed from: g  reason: collision with root package name */
    private String f53840g;

    /* renamed from: h  reason: collision with root package name */
    private final long f53841h;

    /* renamed from: i  reason: collision with root package name */
    private final String f53842i;

    /* renamed from: j  reason: collision with root package name */
    final List f53843j;

    /* renamed from: k  reason: collision with root package name */
    private final String f53844k;

    /* renamed from: l  reason: collision with root package name */
    private final String f53845l;

    /* renamed from: m  reason: collision with root package name */
    private final Set f53846m = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f53834a = i10;
        this.f53835b = str;
        this.f53836c = str2;
        this.f53837d = str3;
        this.f53838e = str4;
        this.f53839f = uri;
        this.f53840g = str5;
        this.f53841h = j10;
        this.f53842i = str6;
        this.f53843j = list;
        this.f53844k = str7;
        this.f53845l = str8;
    }

    public static GoogleSignInAccount w0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l10.longValue(), C4536s.f(str7), new ArrayList((Collection) C4536s.l(set)), str5, str6);
    }

    public static GoogleSignInAccount x0(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount w02 = w0(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        w02.f53840g = str7;
        return w02;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f53842i.equals(this.f53842i) || !googleSignInAccount.t0().equals(t0())) {
            return false;
        }
        return true;
    }

    public String g() {
        return this.f53838e;
    }

    public Uri h() {
        return this.f53839f;
    }

    public int hashCode() {
        return ((this.f53842i.hashCode() + 527) * 31) + t0().hashCode();
    }

    public String j0() {
        return this.f53837d;
    }

    public String o0() {
        return this.f53845l;
    }

    public String p0() {
        return this.f53844k;
    }

    public Set q0() {
        return new HashSet(this.f53843j);
    }

    public String r0() {
        return this.f53835b;
    }

    public String s0() {
        return this.f53836c;
    }

    public Set t0() {
        HashSet hashSet = new HashSet(this.f53843j);
        hashSet.addAll(this.f53846m);
        return hashSet;
    }

    public String u0() {
        return this.f53840g;
    }

    public boolean v0() {
        if (f53833n.currentTimeMillis() / 1000 >= this.f53841h - 300) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f53834a);
        c.D(parcel, 2, r0(), false);
        c.D(parcel, 3, s0(), false);
        c.D(parcel, 4, j0(), false);
        c.D(parcel, 5, g(), false);
        c.B(parcel, 6, h(), i10, false);
        c.D(parcel, 7, u0(), false);
        c.w(parcel, 8, this.f53841h);
        c.D(parcel, 9, this.f53842i, false);
        c.H(parcel, 10, this.f53843j, false);
        c.D(parcel, 11, p0(), false);
        c.D(parcel, 12, o0(), false);
        c.b(parcel, a10);
    }

    public final String y0() {
        return this.f53842i;
    }

    public final String z0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (r0() != null) {
                jSONObject.put("id", r0());
            }
            if (s0() != null) {
                jSONObject.put("tokenId", s0());
            }
            if (j0() != null) {
                jSONObject.put("email", j0());
            }
            if (g() != null) {
                jSONObject.put("displayName", g());
            }
            if (p0() != null) {
                jSONObject.put("givenName", p0());
            }
            if (o0() != null) {
                jSONObject.put("familyName", o0());
            }
            Uri h10 = h();
            if (h10 != null) {
                jSONObject.put("photoUrl", h10.toString());
            }
            if (u0() != null) {
                jSONObject.put("serverAuthCode", u0());
            }
            jSONObject.put("expirationTime", this.f53841h);
            jSONObject.put("obfuscatedIdentifier", this.f53842i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f53843j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C5221d.f61673a);
            for (Scope o02 : scopeArr) {
                jSONArray.put(o02.o0());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}
