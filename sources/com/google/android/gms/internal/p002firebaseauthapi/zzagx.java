package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagx  reason: invalid package */
public final class zzagx implements zzacr {
    private String zza;
    private String zzb;

    public zzagx(String str, String str2) {
        this.zza = C4536s.f(str);
        this.zzb = str2;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.zza);
        jSONObject.put("returnSecureToken", true);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
