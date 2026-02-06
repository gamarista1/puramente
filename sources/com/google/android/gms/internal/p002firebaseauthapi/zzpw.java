package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqf;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpw  reason: invalid package */
public final class zzpw extends zzqi {
    private final zzqf zza;
    private final zzxw zzb;
    private final zzxv zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpw$zza */
    public static class zza {
        private zzqf zza;
        private zzxw zzb;
        private Integer zzc;

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzxw zzxw) {
            this.zzb = zzxw;
            return this;
        }

        public final zza zza(zzqf zzqf) {
            this.zza = zzqf;
            return this;
        }

        public final zzpw zza() {
            zzxv zza2;
            zzqf zzqf = this.zza;
            if (zzqf == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (zzqf.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzc == null) {
                if (this.zza.zzf() == zzqf.zzc.zzd) {
                    zza2 = zznt.zza;
                } else if (this.zza.zzf() == zzqf.zzc.zzc || this.zza.zzf() == zzqf.zzc.zzb) {
                    zza2 = zznt.zza(this.zzc.intValue());
                } else if (this.zza.zzf() == zzqf.zzc.zza) {
                    zza2 = zznt.zzb(this.zzc.intValue());
                } else {
                    String valueOf = String.valueOf(this.zza.zzf());
                    throw new IllegalStateException("Unknown HmacParameters.Variant: " + valueOf);
                }
                return new zzpw(this.zza, this.zzb, zza2, this.zzc);
            } else {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
        }
    }

    public static zza zzb() {
        return new zza();
    }

    public final Integer zza() {
        return this.zzd;
    }

    public final zzqf zzc() {
        return this.zza;
    }

    public final zzxv zzd() {
        return this.zzc;
    }

    public final zzxw zze() {
        return this.zzb;
    }

    private zzpw(zzqf zzqf, zzxw zzxw, zzxv zzxv, Integer num) {
        this.zza = zzqf;
        this.zzb = zzxw;
        this.zzc = zzxv;
        this.zzd = num;
    }
}
