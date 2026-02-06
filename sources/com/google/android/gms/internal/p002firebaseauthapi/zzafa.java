package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafa  reason: invalid package */
public final class zzafa implements zzacr {
    private String zza = zzaey.REFRESH_TOKEN.toString();
    private String zzb;

    public zzafa(String str) {
        this.zzb = C4536s.f(str);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
