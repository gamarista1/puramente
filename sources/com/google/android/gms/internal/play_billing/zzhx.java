package com.google.android.gms.internal.play_billing;

public class zzhx {
    protected volatile zzim zza;
    private volatile zzgk zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhx)) {
            return false;
        }
        zzhx zzhx = (zzhx) obj;
        zzim zzim = this.zza;
        zzim zzim2 = zzhx.zza;
        if (zzim == null && zzim2 == null) {
            return zzb().equals(zzhx.zzb());
        }
        if (zzim != null && zzim2 != null) {
            return zzim.equals(zzim2);
        }
        if (zzim != null) {
            zzhx.zzd(zzim.zzi());
            return zzim.equals(zzhx.zza);
        }
        zzd(zzim2.zzi());
        return this.zza.equals(zzim2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzgi) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzk();
        }
        return 0;
    }

    public final zzgk zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    zzgk zzgk = this.zzb;
                    return zzgk;
                }
                if (this.zza == null) {
                    this.zzb = zzgk.zzb;
                } else {
                    this.zzb = this.zza.zzf();
                }
                zzgk zzgk2 = this.zzb;
                return zzgk2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzim zzc(zzim zzim) {
        zzim zzim2 = this.zza;
        this.zzb = null;
        this.zza = zzim;
        return zzim2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.gms.internal.play_billing.zzim r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.play_billing.zzim r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.play_billing.zzim r0 = r1.zza     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r2 = move-exception
            goto L_0x001d
        L_0x000e:
            r1.zza = r2     // Catch:{ zzhr -> 0x0015 }
            com.google.android.gms.internal.play_billing.zzgk r0 = com.google.android.gms.internal.play_billing.zzgk.zzb     // Catch:{ zzhr -> 0x0015 }
            r1.zzb = r0     // Catch:{ zzhr -> 0x0015 }
            goto L_0x001b
        L_0x0015:
            r1.zza = r2     // Catch:{ all -> 0x000c }
            com.google.android.gms.internal.play_billing.zzgk r2 = com.google.android.gms.internal.play_billing.zzgk.zzb     // Catch:{ all -> 0x000c }
            r1.zzb = r2     // Catch:{ all -> 0x000c }
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            return
        L_0x001d:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhx.zzd(com.google.android.gms.internal.play_billing.zzim):void");
    }
}
