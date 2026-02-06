package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.C4783e;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafh  reason: invalid package */
public final class zzafh implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private C4783e zze;
    private String zzf;
    private String zzg;

    public zzafh(int i10) {
        this.zza = zza(i10);
    }

    public static zzafh zza(C4783e eVar, String str, String str2) {
        C4536s.f(str);
        C4536s.f(str2);
        C4536s.l(eVar);
        return new zzafh(7, eVar, (String) null, str2, str, (String) null, (String) null);
    }

    public final C4783e zzb() {
        return this.zze;
    }

    public final zzafh zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzafh zzd(String str) {
        this.zzd = C4536s.f(str);
        return this;
    }

    public final zzafh zzb(String str) {
        this.zzb = C4536s.f(str);
        return this;
    }

    private zzafh(int i10, C4783e eVar, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (C4783e) C4536s.l(eVar);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public final zzafh zza(C4783e eVar) {
        this.zze = (C4783e) C4536s.l(eVar);
        return this;
    }

    public final zzafh zza(String str) {
        this.zzg = str;
        return this;
    }

    private static String zza(int i10) {
        if (i10 == 1) {
            return "PASSWORD_RESET";
        }
        if (i10 == 4) {
            return "VERIFY_EMAIL";
        }
        if (i10 == 6) {
            return "EMAIL_SIGNIN";
        }
        if (i10 != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
        }
        return "VERIFY_AND_CHANGE_EMAIL";
    }

    public final String zza() {
        int i10 = 1;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1452371317:
                if (str.equals("PASSWORD_RESET")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1341836234:
                if (str.equals("VERIFY_EMAIL")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1099157829:
                if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    c10 = 2;
                    break;
                }
                break;
            case 870738373:
                if (str.equals("EMAIL_SIGNIN")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                break;
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 7;
                break;
            case 3:
                i10 = 6;
                break;
            default:
                i10 = 0;
                break;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        C4783e eVar = this.zze;
        if (eVar != null) {
            jSONObject.put("androidInstallApp", eVar.p0());
            jSONObject.put("canHandleCodeInApp", this.zze.o0());
            if (this.zze.t0() != null) {
                jSONObject.put("continueUrl", this.zze.t0());
            }
            if (this.zze.s0() != null) {
                jSONObject.put("iosBundleId", this.zze.s0());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.r0() != null) {
                jSONObject.put("androidPackageName", this.zze.r0());
            }
            if (this.zze.q0() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.q0());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzahe.zza(jSONObject, "captchaResp", str6);
        } else {
            zzahe.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
