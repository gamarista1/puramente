package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahd  reason: invalid package */
public final class zzahd implements zzacr {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzahd(String str, String str2, String str3) {
        this.zza = C4536s.f(str);
        this.zzb = C4536s.f(str2);
        this.zzc = str3;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaEnrollmentId", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
