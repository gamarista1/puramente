package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

final class zzhh extends zzhi {
    zzhh(Unsafe unsafe) {
        super(unsafe);
    }

    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzhj.zza) {
            zzhj.zzi(obj, j10, z10);
        } else {
            zzhj.zzj(obj, j10, z10);
        }
    }

    public final void zzd(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    public final void zze(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    public final boolean zzf(Object obj, long j10) {
        if (zzhj.zza) {
            return zzhj.zzq(obj, j10);
        }
        return zzhj.zzr(obj, j10);
    }
}
