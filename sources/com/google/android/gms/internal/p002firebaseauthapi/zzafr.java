package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import io.jsonwebtoken.Claims;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafr  reason: invalid package */
public final class zzafr {
    private String zza;
    private String zzb;
    private String zzc;
    private Long zzd;
    private Long zze;
    private boolean zzf;

    public static zzafr zza(String str) {
        try {
            zzafr zzafr = new zzafr();
            JSONObject jSONObject = new JSONObject(str);
            zzafr.zza = jSONObject.optString(Claims.ISSUER);
            zzafr.zzb = jSONObject.optString(Claims.AUDIENCE);
            zzafr.zzc = jSONObject.optString(Claims.SUBJECT);
            zzafr.zzd = Long.valueOf(jSONObject.optLong(Claims.ISSUED_AT));
            zzafr.zze = Long.valueOf(jSONObject.optLong(Claims.EXPIRATION));
            zzafr.zzf = jSONObject.optBoolean("is_anonymous");
            return zzafr;
        } catch (JSONException e10) {
            if (Log.isLoggable("JwtToken", 3)) {
                String valueOf = String.valueOf(e10);
                Log.d("JwtToken", "Failed to read JwtToken from JSONObject. " + valueOf);
            }
            String valueOf2 = String.valueOf(e10);
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. " + valueOf2);
        }
    }

    public final Long zzb() {
        return this.zzd;
    }

    public final Long zza() {
        return this.zze;
    }
}
