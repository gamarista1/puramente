package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafd  reason: invalid package */
public final class zzafd implements zzacr {
    private String zza;

    public zzafd(String str) {
        this.zza = C4536s.f(str);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        return jSONObject.toString();
    }
}
