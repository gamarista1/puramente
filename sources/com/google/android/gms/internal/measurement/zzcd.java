package com.google.android.gms.internal.measurement;

final class zzcd extends zzcm {
    private String zza;
    private zzcl zzb;
    private byte zzc;

    zzcd() {
    }

    public final zzcm zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzcm zzb(boolean z10) {
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    public final zzcm zza(zzcl zzcl) {
        if (zzcl != null) {
            this.zzb = zzcl;
            return this;
        }
        throw new NullPointerException("Null filePurpose");
    }

    public final zzcm zza(boolean z10) {
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    public final zzcj zza() {
        if (this.zzc == 3 && this.zza != null && this.zzb != null) {
            return new zzce(this.zza, false, false, (zzcc) null, (zzcb) null, this.zzb, (zzcg) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" fileOwner");
        }
        if ((this.zzc & 1) == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" skipChecks");
        }
        if (this.zzb == null) {
            sb2.append(" filePurpose");
        }
        String valueOf = String.valueOf(sb2);
        throw new IllegalStateException("Missing required properties:" + valueOf);
    }
}
