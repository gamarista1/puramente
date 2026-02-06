package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

public final class zzdh extends zzdi implements Serializable {
    public static final /* synthetic */ int zzc = 0;
    private static final zzdh zzd = new zzdh(zzcd.zzb, zzcb.zzb);
    final zzce zza;
    final zzce zzb;

    private zzdh(zzce zzce, zzce zzce2) {
        this.zza = zzce;
        this.zzb = zzce2;
        if (zzce.compareTo(zzce2) > 0 || zzce == zzcb.zzb || zzce2 == zzcd.zzb) {
            throw new IllegalArgumentException("Invalid range: ".concat(zze(zzce, zzce2)));
        }
    }

    public static zzdh zza() {
        return zzd;
    }

    private static String zze(zzce zzce, zzce zzce2) {
        StringBuilder sb2 = new StringBuilder(16);
        zzce.zzc(sb2);
        sb2.append("..");
        zzce2.zzd(sb2);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdh) {
            zzdh zzdh = (zzdh) obj;
            if (!this.zza.equals(zzdh.zza) || !this.zzb.equals(zzdh.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return zze(this.zza, this.zzb);
    }

    public final zzdh zzb(zzdh zzdh) {
        zzce zzce;
        zzce zzce2;
        boolean z10;
        int zza2 = this.zza.compareTo(zzdh.zza);
        int zza3 = this.zzb.compareTo(zzdh.zzb);
        if (zza2 >= 0 && zza3 <= 0) {
            return this;
        }
        if (zza2 <= 0 && zza3 >= 0) {
            return zzdh;
        }
        if (zza2 >= 0) {
            zzce = this.zza;
        } else {
            zzce = zzdh.zza;
        }
        if (zza3 <= 0) {
            zzce2 = this.zzb;
        } else {
            zzce2 = zzdh.zzb;
        }
        if (zzce.compareTo(zzce2) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzbe.zzd(z10, "intersection is undefined for disconnected ranges %s and %s", this, zzdh);
        return new zzdh(zzce, zzce2);
    }

    public final zzdh zzc(zzdh zzdh) {
        zzce zzce;
        int zza2 = this.zza.compareTo(zzdh.zza);
        int zza3 = this.zzb.compareTo(zzdh.zzb);
        if (zza2 <= 0 && zza3 >= 0) {
            return this;
        }
        if (zza2 >= 0 && zza3 <= 0) {
            return zzdh;
        }
        if (zza2 <= 0) {
            zzce = this.zza;
        } else {
            zzce = zzdh.zza;
        }
        if (zza3 >= 0) {
            zzdh = this;
        }
        return new zzdh(zzce, zzdh.zzb);
    }

    public final boolean zzd() {
        return this.zza.equals(this.zzb);
    }
}
