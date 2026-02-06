package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafi  reason: invalid package */
public class zzafi implements zzacu<zzafi> {
    private static final String zza = "zzafi";
    private String zzb;

    public zzafi() {
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final zzafi zza(String str) {
        try {
            this.zzb = p.a(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahe.zza(e10, zza, str);
        }
    }

    public zzafi(String str) {
        this.zzb = str;
    }

    public final String zza() {
        return this.zzb;
    }
}
