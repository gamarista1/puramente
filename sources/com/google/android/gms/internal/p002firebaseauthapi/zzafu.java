package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafu  reason: invalid package */
public final class zzafu {
    private List<zzafv> zza;

    public zzafu() {
        this.zza = new ArrayList();
    }

    public static zzafu zza(JSONArray jSONArray) {
        zzafv zzafv;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzafu(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject == null) {
                zzafv = new zzafv();
            } else {
                String a10 = p.a(jSONObject.optString("federatedId", (String) null));
                String a11 = p.a(jSONObject.optString("displayName", (String) null));
                String a12 = p.a(jSONObject.optString("photoUrl", (String) null));
                zzafv = new zzafv(a10, a11, a12, p.a(jSONObject.optString("providerId", (String) null)), (String) null, p.a(jSONObject.optString("phoneNumber", (String) null)), p.a(jSONObject.optString("email", (String) null)));
            }
            arrayList.add(zzafv);
        }
        return new zzafu(arrayList);
    }

    private zzafu(List<zzafv> list) {
        if (!list.isEmpty()) {
            this.zza = Collections.unmodifiableList(list);
        } else {
            this.zza = Collections.emptyList();
        }
    }

    public final List<zzafv> zza() {
        return this.zza;
    }
}
