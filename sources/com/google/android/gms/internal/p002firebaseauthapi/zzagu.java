package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import android.text.TextUtils;
import com.amazon.a.a.o.b;
import com.google.firebase.auth.C0;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagu  reason: invalid package */
public class zzagu implements zzacu<zzagu> {
    private static final String zza = "zzagu";
    private boolean zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private boolean zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private List<zzafq> zzt;
    private String zzu;

    public final long zza() {
        return this.zzf;
    }

    public final C0 zzb() {
        if (!TextUtils.isEmpty(this.zzn) || !TextUtils.isEmpty(this.zzo)) {
            return C0.y0(this.zzk, this.zzo, this.zzn, this.zzr, this.zzp);
        }
        return null;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zzu;
    }

    public final String zzg() {
        return this.zzk;
    }

    public final String zzh() {
        return this.zzl;
    }

    public final String zzi() {
        return this.zze;
    }

    public final String zzj() {
        return this.zzs;
    }

    public final List<zzafq> zzk() {
        return this.zzt;
    }

    public final boolean zzl() {
        if (!TextUtils.isEmpty(this.zzu)) {
            return true;
        }
        return false;
    }

    public final boolean zzm() {
        return this.zzb;
    }

    public final boolean zzn() {
        return this.zzm;
    }

    public final boolean zzo() {
        if (this.zzb || !TextUtils.isEmpty(this.zzq)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzagu zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            this.zzc = jSONObject.optBoolean("needEmail", false);
            this.zzd = p.a(jSONObject.optString("idToken", (String) null));
            this.zze = p.a(jSONObject.optString("refreshToken", (String) null));
            this.zzf = jSONObject.optLong("expiresIn", 0);
            this.zzg = p.a(jSONObject.optString("localId", (String) null));
            this.zzh = p.a(jSONObject.optString("email", (String) null));
            this.zzi = p.a(jSONObject.optString("displayName", (String) null));
            this.zzj = p.a(jSONObject.optString("photoUrl", (String) null));
            this.zzk = p.a(jSONObject.optString("providerId", (String) null));
            this.zzl = p.a(jSONObject.optString("rawUserInfo", (String) null));
            this.zzm = jSONObject.optBoolean("isNewUser", false);
            this.zzn = jSONObject.optString("oauthAccessToken", (String) null);
            this.zzo = jSONObject.optString("oauthIdToken", (String) null);
            this.zzq = p.a(jSONObject.optString(b.f37483f, (String) null));
            this.zzr = p.a(jSONObject.optString("pendingToken", (String) null));
            this.zzs = p.a(jSONObject.optString("tenantId", (String) null));
            this.zzt = zzafq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzu = p.a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.zzp = p.a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }
}
