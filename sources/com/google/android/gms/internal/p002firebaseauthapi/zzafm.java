package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.h;
import Ea.p;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import org.json.JSONException;
import org.json.JSONObject;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafm  reason: invalid package */
public class zzafm extends C5298a implements zzacu<zzafm> {
    public static final Parcelable.Creator<zzafm> CREATOR = new zzafp();
    private static final String zza = "zzafm";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzafm() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    /* access modifiers changed from: private */
    /* renamed from: zzd */
    public final zzafm zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("refresh_token"));
            this.zzc = p.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.zze = p.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, this.zzb, false);
        c.D(parcel, 3, this.zzc, false);
        c.y(parcel, 4, Long.valueOf(zza()), false);
        c.D(parcel, 5, this.zze, false);
        Long l10 = this.zzf;
        l10.longValue();
        c.y(parcel, 6, l10, false);
        c.b(parcel, a10);
    }

    public final long zza() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0;
        }
        return l10.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzxy(e10);
        }
    }

    public final boolean zzg() {
        if (h.c().currentTimeMillis() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000)) {
            return true;
        }
        return false;
    }

    public static zzafm zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzafm zzafm = new zzafm();
            zzafm.zzb = jSONObject.optString("refresh_token", (String) null);
            zzafm.zzc = jSONObject.optString("access_token", (String) null);
            zzafm.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzafm.zze = jSONObject.optString("token_type", (String) null);
            zzafm.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzafm;
        } catch (JSONException e10) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzxy(e10);
        }
    }

    public final void zzc(String str) {
        this.zzb = C4536s.f(str);
    }

    public zzafm(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    zzafm(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }

    public final String zzd() {
        return this.zzb;
    }
}
