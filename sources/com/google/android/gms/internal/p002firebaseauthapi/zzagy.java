package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagy  reason: invalid package */
public class zzagy implements zzacu<zzagy> {
    private static final String zza = "zzagy";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private List<zzafq> zzi;
    private String zzj;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagy zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("localId", (String) null));
            this.zzc = p.a(jSONObject.optString("email", (String) null));
            this.zzd = p.a(jSONObject.optString("displayName", (String) null));
            this.zze = p.a(jSONObject.optString("idToken", (String) null));
            this.zzf = p.a(jSONObject.optString("photoUrl", (String) null));
            this.zzg = p.a(jSONObject.optString("refreshToken", (String) null));
            this.zzh = jSONObject.optLong("expiresIn", 0);
            this.zzi = zzafq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzj = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final List<zzafq> zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        if (!TextUtils.isEmpty(this.zzj)) {
            return true;
        }
        return false;
    }

    public final String zzb() {
        return this.zze;
    }
}
