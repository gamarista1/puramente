package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import io.intercom.android.sdk.models.AttributeType;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaex  reason: invalid package */
public final class zzaex implements zzaes {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    private zzaex(String str, String str2, String str3, String str4, String str5) {
        this.zza = C4536s.f(str);
        this.zzb = C4536s.f(str2);
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
    }

    public static zzaex zza(String str, String str2, String str3, String str4) {
        C4536s.f(str3);
        C4536s.f(str2);
        return new zzaex(AttributeType.PHONE, str, str2, str3, str4);
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaProvider", 1);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.zzc;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        jSONObject.put("mfaPendingCredential", this.zzb);
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
