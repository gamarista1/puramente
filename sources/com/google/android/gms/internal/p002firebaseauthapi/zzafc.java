package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import com.google.firebase.auth.C0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafc  reason: invalid package */
public class zzafc implements zzacu<zzafc> {
    private static final String zza = "zzafc";
    private zzafe zzb;

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzafc zza(String str) {
        zzafe zzafe;
        int i10;
        zzaff zzaff;
        String str2 = str;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("users")) {
                zzafe = new zzafe();
            } else {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList(optJSONArray.length());
                        boolean z10 = false;
                        int i11 = 0;
                        while (i11 < optJSONArray.length()) {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                            if (jSONObject2 == null) {
                                zzaff = new zzaff();
                                i10 = i11;
                            } else {
                                i10 = i11;
                                zzaff = new zzaff(p.a(jSONObject2.optString("localId", (String) null)), p.a(jSONObject2.optString("email", (String) null)), jSONObject2.optBoolean("emailVerified", z10), p.a(jSONObject2.optString("displayName", (String) null)), p.a(jSONObject2.optString("photoUrl", (String) null)), zzafu.zza(jSONObject2.optJSONArray("providerUserInfo")), p.a(jSONObject2.optString("rawPassword", (String) null)), p.a(jSONObject2.optString("phoneNumber", (String) null)), jSONObject2.optLong("createdAt", 0), jSONObject2.optLong("lastLoginAt", 0), false, (C0) null, zzafq.zza(jSONObject2.optJSONArray("mfaInfo")), zzaft.zza(jSONObject2.optJSONArray("passkeyInfo")));
                            }
                            arrayList.add(zzaff);
                            i11 = i10 + 1;
                            z10 = false;
                        }
                        zzafe = new zzafe(arrayList);
                    }
                }
                zzafe = new zzafe(new ArrayList());
            }
            this.zzb = zzafe;
            return this;
        } catch (JSONException e10) {
            e = e10;
            throw zzahe.zza(e, zza, str2);
        } catch (NullPointerException e11) {
            e = e11;
            throw zzahe.zza(e, zza, str2);
        }
    }

    public final List<zzaff> zza() {
        return this.zzb.zza();
    }
}
