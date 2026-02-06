package com.google.android.recaptcha.internal;

public final class zzbr {
    public static final zzbr zza = new zzbr();

    private zzbr() {
    }

    public static final zzp zza(int i10) {
        if (i10 == 403) {
            return new zzp(zzn.zzl, zzl.zzV, (String) null);
        }
        if (i10 == 404) {
            return new zzp(zzn.zze, zzl.zzs, (String) null);
        }
        if (i10 != 503) {
            return new zzp(zzn.zzc, zzl.zzW, (String) null);
        }
        return new zzp(zzn.zzl, zzl.zzV, (String) null);
    }
}
