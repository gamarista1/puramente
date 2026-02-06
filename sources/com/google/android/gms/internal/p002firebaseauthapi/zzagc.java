package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagc  reason: invalid package */
public class zzagc implements zzacu<zzagc> {
    private static final String zza = "zzagc";
    private String zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagc zza(String str) {
        try {
            this.zzb = p.a(new JSONObject(str).optString("sessionInfo", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
