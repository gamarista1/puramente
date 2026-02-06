package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafy  reason: invalid package */
public abstract class zzafy implements zzacr {
    public static zzagb zzg() {
        return new zzaei();
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", zzc());
        jSONObject.put("token", zzf());
        jSONObject.put("providerId", zzd());
        jSONObject.put("tokenType", zzb().toString());
        jSONObject.put("tenantId", zze());
        return jSONObject.toString();
    }

    public abstract zzafb zzb();

    public abstract String zzc();

    public abstract String zzd();

    public abstract String zze();

    public abstract String zzf();
}
