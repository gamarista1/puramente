package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafl  reason: invalid package */
public class zzafl implements zzacu<zzafl> {
    private static final String zza = "zzafl";
    private List<String> zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzafl zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.zzb.add(optJSONArray.getString(i10));
                }
            }
            return this;
        } catch (JSONException e10) {
            throw zzahe.zza((Exception) e10, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
