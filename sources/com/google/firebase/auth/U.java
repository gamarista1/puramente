package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzxy;
import io.intercom.android.sdk.models.AttributeType;
import org.json.JSONException;
import org.json.JSONObject;
import za.c;

public class U extends J {
    public static final Parcelable.Creator<U> CREATOR = new C4813t0();

    /* renamed from: a  reason: collision with root package name */
    private final String f56973a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56974b;

    /* renamed from: c  reason: collision with root package name */
    private final long f56975c;

    /* renamed from: d  reason: collision with root package name */
    private final String f56976d;

    public U(String str, String str2, long j10, String str3) {
        this.f56973a = C4536s.f(str);
        this.f56974b = str2;
        this.f56975c = j10;
        this.f56976d = C4536s.f(str3);
    }

    public static U r0(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new U(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    public String a() {
        return this.f56973a;
    }

    public String d() {
        return this.f56976d;
    }

    public String g() {
        return this.f56974b;
    }

    public long o0() {
        return this.f56975c;
    }

    public String p0() {
        return AttributeType.PHONE;
    }

    public JSONObject q0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", AttributeType.PHONE);
            jSONObject.putOpt("uid", this.f56973a);
            jSONObject.putOpt("displayName", this.f56974b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f56975c));
            jSONObject.putOpt("phoneNumber", this.f56976d);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxy(e10);
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, a(), false);
        c.D(parcel, 2, g(), false);
        c.w(parcel, 3, o0());
        c.D(parcel, 4, d(), false);
        c.b(parcel, a10);
    }
}
