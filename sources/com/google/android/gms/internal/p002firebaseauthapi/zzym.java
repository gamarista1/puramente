package com.google.android.gms.internal.p002firebaseauthapi;

import Db.K;
import com.google.firebase.auth.C0;
import com.google.firebase.auth.J;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzym  reason: invalid package */
public final class zzym {
    private String zza;
    private List<zzafq> zzb;
    private C0 zzc;

    public zzym(String str, List<zzafq> list, C0 c02) {
        this.zza = str;
        this.zzb = list;
        this.zzc = c02;
    }

    public final C0 zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<J> zzc() {
        return K.b(this.zzb);
    }
}
