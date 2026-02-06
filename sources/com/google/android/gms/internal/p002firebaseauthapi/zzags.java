package com.google.android.gms.internal.p002firebaseauthapi;

import Db.q0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import org.json.JSONObject;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzags  reason: invalid package */
public final class zzags extends C5298a implements zzacr {
    public static final Parcelable.Creator<zzags> CREATOR = new zzagv();
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private boolean zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private boolean zzo;
    private String zzp;

    public zzags() {
        this.zzi = true;
        this.zzj = true;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.zza, false);
        c.D(parcel, 3, this.zzb, false);
        c.D(parcel, 4, this.zzc, false);
        c.D(parcel, 5, this.zzd, false);
        c.D(parcel, 6, this.zze, false);
        c.D(parcel, 7, this.zzf, false);
        c.D(parcel, 8, this.zzg, false);
        c.D(parcel, 9, this.zzh, false);
        c.g(parcel, 10, this.zzi);
        c.g(parcel, 11, this.zzj);
        c.D(parcel, 12, this.zzk, false);
        c.D(parcel, 13, this.zzl, false);
        c.D(parcel, 14, this.zzm, false);
        c.D(parcel, 15, this.zzn, false);
        c.g(parcel, 16, this.zzo);
        c.D(parcel, 17, this.zzp, false);
        c.b(parcel, a10);
    }

    public final zzags zza(boolean z10) {
        this.zzj = false;
        return this;
    }

    public final zzags zzb(boolean z10) {
        this.zzo = true;
        return this;
    }

    public final zzags zzc(boolean z10) {
        this.zzi = true;
        return this;
    }

    public final zzags zza(String str) {
        this.zzb = C4536s.f(str);
        return this;
    }

    public final zzags zzb(String str) {
        this.zzn = str;
        return this;
    }

    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put("sessionId", this.zzl);
        }
        if (!TextUtils.isEmpty(this.zzm)) {
            jSONObject.put("requestUri", this.zzm);
        } else {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public zzags(q0 q0Var, String str) {
        C4536s.l(q0Var);
        this.zzl = C4536s.f(q0Var.d());
        this.zzm = C4536s.f(str);
        this.zze = C4536s.f(q0Var.c());
        this.zzi = true;
        this.zzg = "providerId=" + this.zze;
    }

    public zzags(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.zzd) || !TextUtils.isEmpty(this.zzk)) {
            this.zze = C4536s.f(str3);
            this.zzf = null;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(this.zzc)) {
                sb2.append("id_token=");
                sb2.append(this.zzc);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzd)) {
                sb2.append("access_token=");
                sb2.append(this.zzd);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzf)) {
                sb2.append("identifier=");
                sb2.append(this.zzf);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzh)) {
                sb2.append("oauth_token_secret=");
                sb2.append(this.zzh);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(this.zzk)) {
                sb2.append("code=");
                sb2.append(this.zzk);
                sb2.append("&");
            }
            if (!TextUtils.isEmpty(str9)) {
                sb2.append("nonce=");
                sb2.append(str9);
                sb2.append("&");
            }
            sb2.append("providerId=");
            sb2.append(this.zze);
            this.zzg = sb2.toString();
            this.zzj = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    zzags(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z10, boolean z11, String str9, String str10, String str11, String str12, boolean z12, String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z10;
        this.zzj = z11;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z12;
        this.zzp = str13;
    }
}
