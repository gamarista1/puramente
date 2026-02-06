package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagg  reason: invalid package */
public class zzagg implements zzacu<zzagg> {
    private static final String zza = "zzagg";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagg zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("idToken", (String) null));
            this.zzc = p.a(jSONObject.optString("displayName", (String) null));
            this.zzd = p.a(jSONObject.optString("email", (String) null));
            this.zze = p.a(jSONObject.optString("refreshToken", (String) null));
            this.zzf = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
