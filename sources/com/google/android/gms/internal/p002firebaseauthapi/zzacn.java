package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacn  reason: invalid package */
public class zzacn {
    final zzacv zza;
    private final String zzb;

    public zzacn(String str, zzacv zzacv) {
        this.zzb = str;
        this.zza = zzacv;
    }

    /* access modifiers changed from: package-private */
    public final String zza(String str, String str2) {
        String str3 = this.zzb;
        return str3 + str + "?key=" + str2;
    }
}
