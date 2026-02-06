package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagw  reason: invalid package */
public class zzagw implements zzacu<zzagw> {
    private static final String zza = "zzagw";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagw zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("idToken", (String) null));
            this.zzc = p.a(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0);
            this.zze = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
