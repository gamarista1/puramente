package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagk  reason: invalid package */
public class zzagk implements zzacu<zzagk> {
    private static final String zza = "zzagk";
    private String zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagk zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.zzb = p.a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
