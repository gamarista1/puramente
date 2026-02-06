package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzgd;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfx  reason: invalid package */
public final class zzfx extends zzcu {
    private final zzgd zza;
    private final zzxw zzb;
    private final zzxv zzc;
    private final Integer zzd;

    private zzfx(zzgd zzgd, zzxw zzxw, zzxv zzxv, Integer num) {
        this.zza = zzgd;
        this.zzb = zzxw;
        this.zzc = zzxv;
        this.zzd = num;
    }

    public static zzfx zza(zzgd.zza zza2, zzxw zzxw, Integer num) {
        zzxv zzxv;
        zzgd.zza zza3 = zzgd.zza.zzc;
        if (zza2 != zza3 && num == null) {
            String valueOf = String.valueOf(zza2);
            throw new GeneralSecurityException("For given Variant " + valueOf + " the value of idRequirement must be non-null");
        } else if (zza2 == zza3 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else if (zzxw.zza() == 32) {
            zzgd zza4 = zzgd.zza(zza2);
            if (zza4.zzb() == zza3) {
                zzxv = zznt.zza;
            } else if (zza4.zzb() == zzgd.zza.zzb) {
                zzxv = zznt.zza(num.intValue());
            } else if (zza4.zzb() == zzgd.zza.zza) {
                zzxv = zznt.zzb(num.intValue());
            } else {
                String valueOf2 = String.valueOf(zza4.zzb());
                throw new IllegalStateException("Unknown Variant: " + valueOf2);
            }
            return new zzfx(zza4, zzxw, zzxv, num);
        } else {
            int zza5 = zzxw.zza();
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza5);
        }
    }

    public final zzgd zzb() {
        return this.zza;
    }

    public final zzxv zzc() {
        return this.zzc;
    }

    public final zzxw zzd() {
        return this.zzb;
    }

    public final Integer zza() {
        return this.zzd;
    }
}
