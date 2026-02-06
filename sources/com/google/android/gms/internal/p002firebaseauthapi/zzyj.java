package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyj  reason: invalid package */
public final class zzyj {
    private final Status zza;
    private final C0 zzb;
    private final String zzc;
    private final String zzd;

    public zzyj(Status status, C0 c02, String str, String str2) {
        this.zza = status;
        this.zzb = c02;
        this.zzc = str;
        this.zzd = str2;
    }

    public final Status zza() {
        return this.zza;
    }

    public final C0 zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
