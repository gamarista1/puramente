package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafw  reason: invalid package */
public final class zzafw implements zzacr {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzafw(String str, String str2, String str3) {
        this.zza = C4536s.f(str);
        this.zzb = str2;
        this.zzc = str3;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.zza);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
