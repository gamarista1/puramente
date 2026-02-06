package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import com.google.android.gms.common.internal.C4536s;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafn  reason: invalid package */
public class zzafn implements zzacu<zzafn> {
    private static final String zza = "zzafn";
    private String zzb;
    private zzaq<zzafx> zzc;

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final zzafn zza(String str) {
        zzaq<zzafx> zzaq;
        zzafx zzafx;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = p.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        zzap zzg = zzaq.zzg();
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                            if (jSONObject2 == null) {
                                zzafx = zzafx.zza((String) null, (String) null);
                            } else {
                                zzafx = zzafx.zza(p.a(jSONObject2.optString("provider")), p.a(jSONObject2.optString("enforcementState")));
                            }
                            zzg.zza(zzafx);
                        }
                        zzaq = zzg.zza();
                        this.zzc = zzaq;
                    }
                }
                zzaq = zzaq.zza(new ArrayList());
                this.zzc = zzaq;
            }
            return this;
        } catch (JSONException e10) {
            e = e10;
            throw zzahe.zza(e, zza, str);
        } catch (NullPointerException e11) {
            e = e11;
            throw zzahe.zza(e, zza, str);
        }
    }

    public final boolean zzb(String str) {
        C4536s.f(str);
        zzaq<zzafx> zzaq = this.zzc;
        String str2 = null;
        if (zzaq != null && !zzaq.isEmpty()) {
            zzaq<zzafx> zzaq2 = this.zzc;
            int size = zzaq2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                zzafx zzafx = zzaq2.get(i10);
                i10++;
                zzafx zzafx2 = zzafx;
                String zza2 = zzafx2.zza();
                String zzb2 = zzafx2.zzb();
                if (zza2 != null && zzb2 != null && zzb2.equals(str)) {
                    str2 = zzafx2.zza();
                    break;
                }
            }
        }
        if (str2 == null) {
            return false;
        }
        if (str2.equals("ENFORCE") || str2.equals("AUDIT")) {
            return true;
        }
        return false;
    }

    public final String zza() {
        return this.zzb;
    }
}
