package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafq  reason: invalid package */
public final class zzafq {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzagq zze;
    private String zzf;

    private zzafq(String str, String str2, String str3, long j10, zzagq zzagq) {
        if (TextUtils.isEmpty(str) || zzagq == null) {
            this.zza = str;
            this.zzb = C4536s.f(str2);
            this.zzc = str3;
            this.zzd = j10;
            this.zze = zzagq;
            return;
        }
        Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
        throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
    }

    private static long zza(String str) {
        try {
            return zzane.zza(zzane.zza(str));
        } catch (ParseException e10) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e10);
            return 0;
        }
    }

    public final zzagq zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }

    public final long zza() {
        return this.zzd;
    }

    public static zzafq zza(JSONObject jSONObject) {
        zzafq zzafq = new zzafq(jSONObject.optString("phoneInfo", (String) null), jSONObject.optString("mfaEnrollmentId", (String) null), jSONObject.optString("displayName", (String) null), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzagq() : null);
        zzafq.zzf = jSONObject.optString("unobfuscatedPhoneInfo");
        return zzafq;
    }

    public static List<zzafq> zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(zza(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }
}
