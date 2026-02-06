package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;

final class zzfg extends zzes {
    final /* synthetic */ zzfh zza;
    private final Callable zzb;

    zzfg(zzfh zzfh, Callable callable) {
        this.zza = zzfh;
        callable.getClass();
        this.zzb = callable;
    }

    /* access modifiers changed from: package-private */
    public final Object zza() {
        return this.zzb.call();
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Throwable th2) {
        this.zza.zzo(th2);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(Object obj) {
        this.zza.zzn(obj);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return this.zza.isDone();
    }
}
