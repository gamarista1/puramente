package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzage  reason: invalid package */
public class zzage implements zzacu<zzage> {
    private static final String zza = "zzage";
    private String zzb;
    private String zzc;
    private Boolean zzd;
    private String zze;
    private String zzf;
    private zzafu zzg;
    private String zzh;
    private String zzi;
    private long zzj;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzage zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("email", (String) null));
            this.zzc = p.a(jSONObject.optString("passwordHash", (String) null));
            this.zzd = Boolean.valueOf(jSONObject.optBoolean("emailVerified", false));
            this.zze = p.a(jSONObject.optString("displayName", (String) null));
            this.zzf = p.a(jSONObject.optString("photoUrl", (String) null));
            this.zzg = zzafu.zza(jSONObject.optJSONArray("providerUserInfo"));
            this.zzh = p.a(jSONObject.optString("idToken", (String) null));
            this.zzi = p.a(jSONObject.optString("refreshToken", (String) null));
            this.zzj = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzj;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final List<zzafv> zze() {
        zzafu zzafu = this.zzg;
        if (zzafu != null) {
            return zzafu.zza();
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }
}
