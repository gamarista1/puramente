package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzdy;

final class zzez extends zzdy.zzi implements Runnable {
    private final Runnable zzc;

    public zzez(Runnable runnable) {
        runnable.getClass();
        this.zzc = runnable;
    }

    public final void run() {
        try {
            this.zzc.run();
        } catch (Throwable th2) {
            zzo(th2);
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public final String zzg() {
        String obj = this.zzc.toString();
        return "task=[" + obj + "]";
    }
}
