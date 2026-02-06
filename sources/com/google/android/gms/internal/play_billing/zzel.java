package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzel extends zzen {
    public static zzeu zza(Object obj) {
        return new zzeo(obj);
    }

    public static zzeu zzb(zzeu zzeu, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (zzeu.isDone()) {
            return zzeu;
        }
        return zzff.zzs(zzeu, 28500, timeUnit, scheduledExecutorService);
    }

    public static void zzc(zzeu zzeu, zzej zzej, Executor executor) {
        zzeu.zzb(new zzek(zzeu, zzej), executor);
    }
}
