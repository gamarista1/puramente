package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaha  reason: invalid package */
public class zzaha implements zzacu<zzaha> {
    private static final String zza = "zzaha";
    private String zzb;
    private String zzc;
    private long zzd;
    private String zze;
    private boolean zzf;
    private String zzg;
    private String zzh;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzaha zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("idToken", (String) null));
            this.zzc = p.a(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0);
            this.zze = p.a(jSONObject.optString("localId", (String) null));
            this.zzf = jSONObject.optBoolean("isNewUser", false);
            this.zzg = p.a(jSONObject.optString("temporaryProof", (String) null));
            this.zzh = p.a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzb;
    }
}
