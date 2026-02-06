package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import io.intercom.android.sdk.models.AttributeType;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagl  reason: invalid package */
public final class zzagl implements zzacr {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private zzaeh zzh;

    private zzagl(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = C4536s.f(str);
        this.zzb = C4536s.f(str2);
        this.zzc = C4536s.f(str3);
        this.zze = str4;
        this.zzd = str5;
        this.zzf = str6;
        this.zzg = str7;
    }

    public static zzagl zza(String str, String str2, String str3, String str4, String str5, String str6) {
        C4536s.f(str3);
        return new zzagl(AttributeType.PHONE, str, str2, str3, str4, str5, str6);
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.zzb);
        jSONObject.put("mfaEnrollmentId", this.zzc);
        this.zza.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.zze != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zze);
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("recaptchaToken", this.zzf);
            }
            if (!TextUtils.isEmpty(this.zzg)) {
                jSONObject2.put("playIntegrityToken", this.zzg);
            }
            zzaeh zzaeh = this.zzh;
            if (zzaeh != null) {
                jSONObject2.put("autoRetrievalInfo", zzaeh.zza());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }

    public final void zza(zzaeh zzaeh) {
        this.zzh = zzaeh;
    }
}
