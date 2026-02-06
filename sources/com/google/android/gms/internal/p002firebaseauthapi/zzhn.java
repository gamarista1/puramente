package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhn  reason: invalid package */
final class zzhn extends ThreadLocal<Cipher> {
    zzhn() {
    }

    private static Cipher zza() {
        try {
            return zzwv.zza.zza("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return zza();
    }
}
