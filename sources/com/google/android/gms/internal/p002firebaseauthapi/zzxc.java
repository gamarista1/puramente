package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc  reason: invalid package */
public final class zzxc implements zzxd<Cipher> {
    public final /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
