package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagp  reason: invalid package */
public final class zzagp implements zzagj {
    private final String zza;
    private final String zzb;

    private zzagp(String str, String str2) {
        this.zza = C4536s.f(str);
        this.zzb = str2;
    }

    public static zzagp zza(String str, String str2) {
        return new zzagp(str, str2);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("tenantId", this.zzb);
        }
        jSONObject.put("totpEnrollmentInfo", new JSONObject());
        return jSONObject.toString();
    }
}
