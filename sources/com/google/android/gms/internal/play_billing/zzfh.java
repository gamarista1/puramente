package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

final class zzfh extends zzee implements RunnableFuture {
    private volatile zzes zzc;

    zzfh(Callable callable) {
        this.zzc = new zzfg(this, callable);
    }

    static zzfh zzr(Runnable runnable, Object obj) {
        return new zzfh(Executors.callable(runnable, obj));
    }

    public final void run() {
        zzes zzes = this.zzc;
        if (zzes != null) {
            zzes.run();
        }
        this.zzc = null;
    }

    /* access modifiers changed from: protected */
    public final String zzg() {
        zzes zzes = this.zzc;
        if (zzes == null) {
            return super.zzg();
        }
        String obj = zzes.toString();
        return "task=[" + obj + "]";
    }

    /* access modifiers changed from: protected */
    public final void zzm() {
        zzes zzes;
        if (zzq() && (zzes = this.zzc) != null) {
            zzes.zze();
        }
        this.zzc = null;
    }
}
