package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdq;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdj  reason: invalid package */
public final class zzdj extends zzcu {
    private final zzdq zza;
    private final zzxw zzb;
    private final zzxv zzc;
    private final Integer zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdj$zza */
    public static class zza {
        private zzdq zza;
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

        public final zza zza(zzdq zzdq) {
            this.zza = zzdq;
            return this;
        }

        public final zzdj zza() {
            zzxv zzb2;
            zzdq zzdq = this.zza;
            if (zzdq == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            } else if (zzdq.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            } else if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            } else if (this.zza.zza() || this.zzc == null) {
                if (this.zza.zzf() == zzdq.zzb.zzc) {
                    zzb2 = zznt.zza;
                } else if (this.zza.zzf() == zzdq.zzb.zzb) {
                    zzb2 = zznt.zza(this.zzc.intValue());
                } else if (this.zza.zzf() == zzdq.zzb.zza) {
                    zzb2 = zznt.zzb(this.zzc.intValue());
                } else {
                    String valueOf = String.valueOf(this.zza.zzf());
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + valueOf);
                }
                return new zzdj(this.zza, this.zzb, zzb2, this.zzc);
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

    public final zzdq zzc() {
        return this.zza;
    }

    public final zzxv zzd() {
        return this.zzc;
    }

    public final zzxw zze() {
        return this.zzb;
    }

    private zzdj(zzdq zzdq, zzxw zzxw, zzxv zzxv, Integer num) {
        this.zza = zzdq;
        this.zzb = zzxw;
        this.zzc = zzxv;
        this.zzd = num;
    }
}
