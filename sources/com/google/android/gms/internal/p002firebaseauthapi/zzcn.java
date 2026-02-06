package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcn  reason: invalid package */
public final class zzcn {
    private static final zzcn zza = new zzcn();

    private zzcn() {
    }

    static zzcn zza() {
        return zza;
    }

    public static zzcn zza(zzcn zzcn) {
        if (zzcn != null) {
            return zzcn;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
