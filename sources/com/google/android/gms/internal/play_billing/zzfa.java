package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzfa extends zzex implements zzew {
    final ScheduledExecutorService zza;

    zzfa(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzfh zzr = zzfh.zzr(runnable, (Object) null);
        return new zzey(zzr, scheduledExecutorService.schedule(zzr, j10, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzez zzez = new zzez(runnable);
        return new zzey(zzez, this.zza.scheduleAtFixedRate(zzez, j10, j11, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzez zzez = new zzez(runnable);
        return new zzey(zzez, this.zza.scheduleWithFixedDelay(zzez, j10, j11, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        zzfh zzfh = new zzfh(callable);
        return new zzey(zzfh, this.zza.schedule(zzfh, j10, timeUnit));
    }
}
