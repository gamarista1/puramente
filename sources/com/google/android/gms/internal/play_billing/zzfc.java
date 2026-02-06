package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzfc implements Runnable {
    zzff zza;

    zzfc(zzff zzff) {
        this.zza = zzff;
    }

    public final void run() {
        zzeu zzr;
        String str;
        zzff zzff = this.zza;
        if (zzff != null && (zzr = zzff.zzc) != null) {
            this.zza = null;
            if (zzr.isDone()) {
                zzff.zzp(zzr);
                return;
            }
            try {
                ScheduledFuture zzt = zzff.zzd;
                zzff.zzd = null;
                str = "Timed out";
                if (zzt != null) {
                    long abs = Math.abs(zzt.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = str + " (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                zzff.zzo(new zzfd(str + ": " + zzr.toString(), (zzfe) null));
                zzr.cancel(true);
            } catch (Throwable th2) {
                zzr.cancel(true);
                throw th2;
            }
        }
    }
}
