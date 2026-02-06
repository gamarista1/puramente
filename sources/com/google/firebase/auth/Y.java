package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzagq;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import org.json.JSONException;
import org.json.JSONObject;
import za.c;

public class Y extends J {
    public static final Parcelable.Creator<Y> CREATOR = new v0();

    /* renamed from: a  reason: collision with root package name */
    private final String f56978a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56979b;

    /* renamed from: c  reason: collision with root package name */
    private final long f56980c;

    /* renamed from: d  reason: collision with root package name */
    private final zzagq f56981d;

    public Y(String str, String str2, long j10, zzagq zzagq) {
        this.f56978a = C4536s.f(str);
        this.f56979b = str2;
        this.f56980c = j10;
        this.f56981d = (zzagq) C4536s.m(zzagq, "totpInfo cannot be null.");
    }

    public static Y r0(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            long optLong = jSONObject.optLong("enrollmentTimestamp");
            if (jSONObject.opt("totpInfo") != null) {
                return new Y(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzagq());
            }
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
    }

    public String a() {
        return this.f56978a;
    }

    public String g() {
        return this.f56979b;
    }

    public long o0() {
        return this.f56980c;
    }

    public String p0() {
        return "totp";
    }

    public JSONObject q0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f56978a);
            jSONObject.putOpt("displayName", this.f56979b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f56980c));
            jSONObject.putOpt("totpInfo", this.f56981d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxy(e10);
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, a(), false);
        c.D(parcel, 2, g(), false);
        c.w(parcel, 3, o0());
        c.B(parcel, 4, this.f56981d, i10, false);
        c.b(parcel, a10);
    }
}
