package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class zzfb {
    public static zzev zza(ExecutorService executorService) {
        zzev zzex;
        if (executorService instanceof zzev) {
            return (zzev) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzex = new zzfa((ScheduledExecutorService) executorService);
        } else {
            zzex = new zzex(executorService);
        }
        return zzex;
    }

    public static zzew zzb(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof zzew) {
            return (zzew) scheduledExecutorService;
        }
        return new zzfa(scheduledExecutorService);
    }
}
