package com.google.android.gms.internal.measurement;

public class zzkb {
    private volatile zzkt zza;
    private volatile zzia zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkb)) {
            return false;
        }
        zzkb zzkb = (zzkb) obj;
        zzkt zzkt = this.zza;
        zzkt zzkt2 = zzkb.zza;
        if (zzkt == null && zzkt2 == null) {
            return zzb().equals(zzkb.zzb());
        }
        if (zzkt != null && zzkt2 != null) {
            return zzkt.equals(zzkt2);
        }
        if (zzkt != null) {
            return zzkt.equals(zzkb.zzb(zzkt.zzcj()));
        }
        return zzb(zzkt2.zzcj()).equals(zzkt2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return this.zzb.zzb();
        }
        if (this.zza != null) {
            return this.zza.zzca();
        }
        return 0;
    }

    public final zzia zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    zzia zzia = this.zzb;
                    return zzia;
                }
                if (this.zza == null) {
                    this.zzb = zzia.zza;
                } else {
                    this.zzb = this.zza.zzby();
                }
                zzia zzia2 = this.zzb;
                return zzia2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzkt zza(zzkt zzkt) {
        zzkt zzkt2 = this.zza;
        this.zzb = null;
        this.zza = zzkt;
        return zzkt2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.zzkt zzb(com.google.android.gms.internal.measurement.zzkt r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzkt r0 = r1.zza
            if (r0 != 0) goto L_0x001e
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzkt r0 = r1.zza     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            goto L_0x001e
        L_0x000b:
            r2 = move-exception
            goto L_0x001c
        L_0x000d:
            r1.zza = r2     // Catch:{ zzjs -> 0x0014 }
            com.google.android.gms.internal.measurement.zzia r0 = com.google.android.gms.internal.measurement.zzia.zza     // Catch:{ zzjs -> 0x0014 }
            r1.zzb = r0     // Catch:{ zzjs -> 0x0014 }
            goto L_0x001a
        L_0x0014:
            r1.zza = r2     // Catch:{ all -> 0x000b }
            com.google.android.gms.internal.measurement.zzia r2 = com.google.android.gms.internal.measurement.zzia.zza     // Catch:{ all -> 0x000b }
            r1.zzb = r2     // Catch:{ all -> 0x000b }
        L_0x001a:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            goto L_0x001e
        L_0x001c:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            throw r2
        L_0x001e:
            com.google.android.gms.internal.measurement.zzkt r2 = r1.zza
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkb.zzb(com.google.android.gms.internal.measurement.zzkt):com.google.android.gms.internal.measurement.zzkt");
    }
}
