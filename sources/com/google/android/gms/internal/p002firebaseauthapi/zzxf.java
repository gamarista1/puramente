package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxf  reason: invalid package */
public final class zzxf implements zzxd<KeyAgreement> {
    public final /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
