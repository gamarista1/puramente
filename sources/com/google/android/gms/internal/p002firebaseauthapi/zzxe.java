package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxe  reason: invalid package */
public final class zzxe implements zzxd<KeyFactory> {
    public final /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
