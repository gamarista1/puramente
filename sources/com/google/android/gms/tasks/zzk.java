package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C4536s;

final class zzk implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzl zzb;

    zzk(zzl zzl, Task task) {
        this.zzb = zzl;
        this.zza = task;
    }

    public final void run() {
        synchronized (this.zzb.zzb) {
            try {
                zzl zzl = this.zzb;
                if (zzl.zzc != null) {
                    zzl.zzc.onFailure((Exception) C4536s.l(this.zza.getException()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
