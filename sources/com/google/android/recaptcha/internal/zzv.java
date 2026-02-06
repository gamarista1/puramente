package com.google.android.recaptcha.internal;

import java.util.concurrent.ConcurrentHashMap;

public final class zzv {
    public static final zzv zza = new zzv();
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    private zzv() {
    }

    public static final void zza(int i10, long j10) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i10);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzu();
        }
        zzu zzu = (zzu) obj;
        zzu.zzg(zzu.zzb() + 1);
        zzu.zzf(zzu.zzd() + j10);
        zzu.zze(Math.max(j10, zzu.zzc()));
        concurrentHashMap.put(valueOf, zzu);
    }
}
