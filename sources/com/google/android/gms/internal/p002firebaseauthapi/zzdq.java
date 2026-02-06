package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdq  reason: invalid package */
public final class zzdq extends zzcw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzb zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdq$zza */
    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private zzb zzd;

        public final zza zza(int i10) {
            if (i10 == 12 || i10 == 16) {
                this.zzb = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(i10)}));
        }

        public final zza zzb(int i10) {
            if (i10 == 16 || i10 == 24 || i10 == 32) {
                this.zza = Integer.valueOf(i10);
                return this;
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(i10)}));
        }

        public final zza zzc(int i10) {
            this.zzc = 16;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzb.zzc;
        }

        public final zza zza(zzb zzb2) {
            this.zzd = zzb2;
            return this;
        }

        public final zzdq zza() {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            } else if (this.zzb == null) {
                throw new GeneralSecurityException("IV size is not set");
            } else if (this.zzd == null) {
                throw new GeneralSecurityException("Variant is not set");
            } else if (this.zzc != null) {
                return new zzdq(num.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd);
            } else {
                throw new GeneralSecurityException("Tag size is not set");
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdq$zzb */
    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("NO_PREFIX");
        private final String zzd;

        private zzb(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static zza zze() {
        return new zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdq)) {
            return false;
        }
        zzdq zzdq = (zzdq) obj;
        if (zzdq.zza == this.zza && zzdq.zzb == this.zzb && zzdq.zzc == this.zzc && zzdq.zzd == this.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzdq.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int i11 = this.zzc;
        int i12 = this.zza;
        return "AesEax Parameters (variant: " + valueOf + ", " + i10 + "-byte IV, " + i11 + "-byte tag, and " + i12 + "-byte key)";
    }

    public final boolean zza() {
        if (this.zzd != zzb.zzc) {
            return true;
        }
        return false;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final zzb zzf() {
        return this.zzd;
    }

    private zzdq(int i10, int i11, int i12, zzb zzb2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = zzb2;
    }
}
