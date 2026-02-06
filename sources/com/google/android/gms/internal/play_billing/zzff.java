package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzff extends zzee {
    /* access modifiers changed from: private */
    public zzeu zzc;
    /* access modifiers changed from: private */
    public ScheduledFuture zzd;

    private zzff(zzeu zzeu) {
        this.zzc = zzeu;
    }

    static zzeu zzs(zzeu zzeu, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzff zzff = new zzff(zzeu);
        zzfc zzfc = new zzfc(zzff);
        zzff.zzd = scheduledExecutorService.schedule(zzfc, 28500, timeUnit);
        zzeu.zzb(zzfc, zzed.INSTANCE);
        return zzff;
    }

    /* access modifiers changed from: protected */
    public final String zzg() {
        zzeu zzeu = this.zzc;
        ScheduledFuture scheduledFuture = this.zzd;
        if (zzeu == null) {
            return null;
        }
        String str = "inputFuture=[" + zzeu.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    public final void zzm() {
        boolean z10;
        zzeu zzeu = this.zzc;
        if (zzeu != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && isCancelled()) {
            zzeu.cancel(zzq());
        }
        ScheduledFuture scheduledFuture = this.zzd;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzc = null;
        this.zzd = null;
    }
}
