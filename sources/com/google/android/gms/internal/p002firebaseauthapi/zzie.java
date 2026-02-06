package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzie  reason: invalid package */
final class zzie extends ThreadLocal<Cipher> {
    zzie() {
    }

    private static Cipher zza() {
        try {
            Cipher zza = zzwv.zza.zza("AES/GCM-SIV/NoPadding");
            if (!zzif.zzb(zza)) {
                return null;
            }
            return zza;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return zza();
    }
}
