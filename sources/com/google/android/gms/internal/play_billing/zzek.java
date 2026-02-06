package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class zzek implements Runnable {
    final Future zza;
    final zzej zzb;

    zzek(Future future, zzej zzej) {
        this.zza = future;
        this.zzb = zzej;
    }

    public final void run() {
        boolean z10;
        Object obj;
        Throwable zza2;
        Future future = this.zza;
        if (!(future instanceof zzfi) || (zza2 = zzfj.zza((zzfi) future)) == null) {
            try {
                Future future2 = this.zza;
                if (future2.isDone()) {
                    z10 = false;
                    while (true) {
                        obj = future2.get();
                        break;
                    }
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    this.zzb.zzb(obj);
                    return;
                }
                throw new IllegalStateException(zzbf.zza("Future was expected to be done: %s", future2));
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (ExecutionException e10) {
                this.zzb.zza(e10.getCause());
            } catch (Throwable th2) {
                this.zzb.zza(th2);
            }
        } else {
            this.zzb.zza(zza2);
        }
    }

    public final String toString() {
        zzba zza2 = zzbc.zza(this);
        zza2.zza(this.zzb);
        return zza2.toString();
    }
}
