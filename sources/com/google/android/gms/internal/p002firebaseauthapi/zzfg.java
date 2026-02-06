package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfi;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfg  reason: invalid package */
public class zzfg extends zzcu {
    private final zzfi zza;
    private final zzxv zzb;
    private final Integer zzc;

    private zzfg(zzfi zzfi, zzxv zzxv, Integer num) {
        this.zza = zzfi;
        this.zzb = zzxv;
        this.zzc = num;
    }

    public static zzfg zza(zzfi zzfi, Integer num) {
        zzxv zzxv;
        if (zzfi.zzc() == zzfi.zzc.zzb) {
            if (num == null) {
                zzxv = zznt.zza;
            } else {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
        } else if (zzfi.zzc() != zzfi.zzc.zza) {
            String valueOf = String.valueOf(zzfi.zzc());
            throw new GeneralSecurityException("Unknown Variant: " + valueOf);
        } else if (num != null) {
            zzxv = zznt.zzb(num.intValue());
        } else {
            throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
        }
        return new zzfg(zzfi, zzxv, num);
    }

    public final zzfi zzb() {
        return this.zza;
    }

    public final zzxv zzc() {
        return this.zzb;
    }

    public final Integer zza() {
        return this.zzc;
    }
}
