package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

final class zzeo implements zzeu {
    private static final zzet zza = new zzet(zzeo.class);
    private final Object zzb;

    zzeo(Object obj) {
        this.zzb = obj;
    }

    public final boolean cancel(boolean z10) {
        return false;
    }

    public final Object get() {
        return this.zzb;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.zzb;
        String obj2 = super.toString();
        String obj3 = obj.toString();
        return obj2 + "[status=SUCCESS, result=[" + obj3 + "]]";
    }

    public final void zzb(Runnable runnable, Executor executor) {
        zzbe.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            Logger zza2 = zza.zza();
            Level level = Level.SEVERE;
            String obj = runnable.toString();
            String valueOf = String.valueOf(executor);
            zza2.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + obj + " with executor " + valueOf, e10);
        }
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.zzb;
    }
}
