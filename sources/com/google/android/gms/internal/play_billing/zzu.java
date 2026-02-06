package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

final class zzu implements zzeu {
    final WeakReference zza;
    private final zzq zzb = new zzt(this);

    zzu(zzr zzr) {
        this.zza = new WeakReference(zzr);
    }

    public final boolean cancel(boolean z10) {
        zzr zzr = (zzr) this.zza.get();
        boolean cancel = this.zzb.cancel(z10);
        if (!cancel || zzr == null) {
            return cancel;
        }
        zzr.zza();
        return true;
    }

    public final Object get() {
        return this.zzb.get();
    }

    public final boolean isCancelled() {
        return this.zzb.zzc instanceof zzg;
    }

    public final boolean isDone() {
        return this.zzb.isDone();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(Object obj) {
        return this.zzb.zzd(obj);
    }

    public final void zzb(Runnable runnable, Executor executor) {
        this.zzb.zzb(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc(Throwable th2) {
        zzi zzi = new zzi(th2);
        zzf zzf = zzq.zzb;
        zzq zzq = this.zzb;
        if (!zzf.zzd(zzq, (Object) null, zzi)) {
            return false;
        }
        zzq.zzc(zzq);
        return true;
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        return this.zzb.get(j10, timeUnit);
    }
}
