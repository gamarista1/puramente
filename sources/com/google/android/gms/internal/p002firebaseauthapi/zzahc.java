package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahc  reason: invalid package */
public class zzahc implements zzacu<zzahc> {
    private static final String zza = "zzahc";
    private String zzb;
    private String zzc;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzahc zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("idToken", (String) null));
            this.zzc = p.a(jSONObject.optString("refreshToken", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
