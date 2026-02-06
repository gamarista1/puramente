package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import io.intercom.android.sdk.models.AttributeType;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagn  reason: invalid package */
public final class zzagn implements zzagj {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private zzaeh zzg;
    private final String zzh = null;

    private zzagn(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = C4536s.f(str);
        this.zzb = C4536s.f(str2);
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }

    public static zzagn zza(String str, String str2, String str3, String str4, String str5, String str6) {
        C4536s.f(str2);
        return new zzagn(str, AttributeType.PHONE, str2, str3, str4, str5, (String) null);
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaProvider", 1);
        if (this.zzc != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.zzc);
            if (!TextUtils.isEmpty(this.zze)) {
                jSONObject2.put("recaptchaToken", this.zze);
            }
            if (!TextUtils.isEmpty(this.zzf)) {
                jSONObject2.put("playIntegrityToken", this.zzf);
            }
            zzaeh zzaeh = this.zzg;
            if (zzaeh != null) {
                jSONObject2.put("autoRetrievalInfo", zzaeh.zza());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            jSONObject.put("tenantId", (Object) null);
        }
        return jSONObject.toString();
    }

    public final void zza(zzaeh zzaeh) {
        this.zzg = zzaeh;
    }
}
