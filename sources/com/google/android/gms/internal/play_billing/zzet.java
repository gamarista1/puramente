package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

final class zzet {
    private final zzbg zza = new zzbg();
    private final String zzb;
    private volatile Logger zzc;

    zzet(Class cls) {
        this.zzb = cls.getName();
    }

    /* access modifiers changed from: package-private */
    public final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            try {
                Logger logger2 = this.zzc;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.zzb);
                this.zzc = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
