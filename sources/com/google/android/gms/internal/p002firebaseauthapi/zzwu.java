package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwu  reason: invalid package */
final class zzwu<JcePrimitiveT> implements zzxa<JcePrimitiveT> {
    private final zzxd<JcePrimitiveT> zza;

    public final JcePrimitiveT zza(String str) {
        Exception exc = null;
        for (Provider zza2 : zzwv.zza("GmsCore_OpenSSL", "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, zza2);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        return this.zza.zza(str, (Provider) null);
    }

    private zzwu(zzxd<JcePrimitiveT> zzxd) {
        this.zza = zzxd;
    }
}
