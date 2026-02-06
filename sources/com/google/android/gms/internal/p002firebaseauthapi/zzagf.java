package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.C4536s;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagf  reason: invalid package */
public final class zzagf implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private zzagr zzg = new zzagr();
    private boolean zzh = true;
    private zzagr zzi = new zzagr();
    private String zzj;

    public final zzagf zza(String str) {
        C4536s.f(str);
        this.zzi.zzb().add(str);
        return this;
    }

    public final zzagf zzb(String str) {
        if (str == null) {
            this.zzg.zzb().add("DISPLAY_NAME");
        } else {
            this.zzb = str;
        }
        return this;
    }

    public final zzagf zzc(String str) {
        if (str == null) {
            this.zzg.zzb().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    public final zzagf zzd(String str) {
        this.zza = C4536s.f(str);
        return this;
    }

    public final zzagf zze(String str) {
        this.zze = C4536s.f(str);
        return this;
    }

    public final zzagf zzf(String str) {
        if (str == null) {
            this.zzg.zzb().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    public final zzagf zzg(String str) {
        if (str == null) {
            this.zzg.zzb().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    public final zzagf zzh(String str) {
        this.zzj = str;
        return this;
    }

    public final boolean zzi(String str) {
        C4536s.f(str);
        return this.zzg.zzb().contains(str);
    }

    public final String zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zza() {
        int i10;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", this.zzh);
        if (!this.zzi.zzb().isEmpty()) {
            List<String> zzb2 = this.zzi.zzb();
            JSONArray jSONArray = new JSONArray();
            for (int i11 = 0; i11 < zzb2.size(); i11++) {
                jSONArray.put(zzb2.get(i11));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List<String> zzb3 = this.zzg.zzb();
        int size = zzb3.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < zzb3.size(); i12++) {
            String str = zzb3.get(i12);
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -333046776:
                    if (str.equals("DISPLAY_NAME")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 66081660:
                    if (str.equals("EMAIL")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1939891618:
                    if (str.equals("PHOTO_URL")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1999612571:
                    if (str.equals("PASSWORD")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = 2;
                    break;
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    i10 = 4;
                    break;
                case 3:
                    i10 = 5;
                    break;
                default:
                    i10 = 0;
                    break;
            }
            iArr[i12] = i10;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i13 = 0; i13 < size; i13++) {
                jSONArray2.put(iArr[i13]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.zza;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put("password", str4);
        }
        String str5 = this.zzb;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.zzf;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.zze;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.zzj;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }
}
