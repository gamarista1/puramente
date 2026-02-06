package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqj  reason: invalid package */
public final class zzqj {
    private static final String zza = "type.googleapis.com/google.crypto.tink.HmacKey";
    @Deprecated
    private static final zzvu zzb;
    @Deprecated
    private static final zzvu zzc;
    @Deprecated
    private static final zzvu zzd;

    static {
        zzvu zzb2 = zzvu.zzb();
        zzb = zzb2;
        zzc = zzb2;
        zzd = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() {
        zzqk.zzc();
        zzpv.zzc();
        zzpz.zza(true);
        if (!zzig.zzb()) {
            zzpn.zza(true);
        }
    }
}
