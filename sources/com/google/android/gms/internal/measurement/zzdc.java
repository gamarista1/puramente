package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class zzdc extends zzdf {
    private final AtomicReference<Bundle> zza = new AtomicReference<>();
    private boolean zzb;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle zza(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r0 = r2.zza
            monitor-enter(r0)
            boolean r1 = r2.zzb     // Catch:{ all -> 0x000d }
            if (r1 != 0) goto L_0x0012
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r1 = r2.zza     // Catch:{ InterruptedException -> 0x000f }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000f }
            goto L_0x0012
        L_0x000d:
            r3 = move-exception
            goto L_0x001c
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            r3 = 0
            return r3
        L_0x0012:
            java.util.concurrent.atomic.AtomicReference<android.os.Bundle> r3 = r2.zza     // Catch:{ all -> 0x000d }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x000d }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x000d }
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            return r3
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x000d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdc.zza(long):android.os.Bundle");
    }

    public final Long zzb(long j10) {
        return (Long) zza(zza(j10), Long.class);
    }

    public final String zzc(long j10) {
        return (String) zza(zza(j10), String.class);
    }

    public static <T> T zza(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e10) {
            String canonicalName = cls.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            Log.w("AM", String.format("Unexpected object type. Expected, Received" + ": %s, %s", new Object[]{canonicalName, canonicalName2}), e10);
            throw e10;
        }
    }

    public final void zza(Bundle bundle) {
        synchronized (this.zza) {
            try {
                this.zza.set(bundle);
                this.zzb = true;
                this.zza.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
