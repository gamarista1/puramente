package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import za.C5298a;
import za.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaft  reason: invalid package */
public final class zzaft extends C5298a {
    public static final Parcelable.Creator<zzaft> CREATOR = new zzafs();
    private final String zza;
    private final String zzb;
    private final String zzc;

    zzaft(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public static zzaq<zzaft> zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzaq.zza(new ArrayList());
        }
        zzap zzg = zzaq.zzg();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            zzg.zza(new zzaft(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzg.zza();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.zza, false);
        c.D(parcel, 2, this.zzb, false);
        c.D(parcel, 3, this.zzc, false);
        c.b(parcel, a10);
    }

    public static final zzaft zza(JSONObject jSONObject) {
        return new zzaft(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public static final JSONObject zza(zzaft zzaft) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", zzaft.zza);
        jSONObject.put("name", zzaft.zzb);
        jSONObject.put("displayName", zzaft.zzc);
        return jSONObject;
    }
}
