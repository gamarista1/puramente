package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagi  reason: invalid package */
public class zzagi implements zzacu<zzagi> {
    private static final String zza = "zzagi";

    public String zza() {
        return null;
    }

    /* renamed from: zzb */
    public zzagi zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                return (zzagm) ((zzagi) new zzagm().zza(str));
            }
            if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                return (zzago) ((zzagi) new zzago().zza(str));
            }
            throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
        } catch (JSONException e10) {
            e = e10;
            throw zzahe.zza(e, zza, str);
        } catch (NullPointerException e11) {
            e = e11;
            throw zzahe.zza(e, zza, str);
        }
    }
}
