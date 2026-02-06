package com.google.android.gms.internal.p002firebaseauthapi;

import Ba.C4246a;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.C4785f;
import com.google.firebase.auth.C4793j;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeo  reason: invalid package */
public class zzaeo implements zzacr {
    private static final String zza = "zzaeo";
    private static final C4246a zzb = new C4246a(zzaeo.class.getSimpleName(), new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzaeo(C4793j jVar, String str, String str2) {
        this.zzc = C4536s.f(jVar.zzc());
        this.zzd = C4536s.f(jVar.zze());
        this.zze = str;
        this.zzf = str2;
    }

    public final String zza() {
        String str;
        C4785f c10 = C4785f.c(this.zzd);
        String str2 = null;
        if (c10 != null) {
            str = c10.a();
        } else {
            str = null;
        }
        if (c10 != null) {
            str2 = c10.d();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        String str4 = this.zzf;
        if (str4 != null) {
            zzahe.zza(jSONObject, "captchaResp", str4);
        } else {
            zzahe.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
