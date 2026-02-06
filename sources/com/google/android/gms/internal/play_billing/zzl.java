package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class zzl extends zzf {
    final AtomicReferenceFieldUpdater zza;
    final AtomicReferenceFieldUpdater zzb;
    final AtomicReferenceFieldUpdater zzc;
    final AtomicReferenceFieldUpdater zzd;
    final AtomicReferenceFieldUpdater zze;

    zzl(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super((zzp) null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicReferenceFieldUpdater2;
        this.zzc = atomicReferenceFieldUpdater3;
        this.zzd = atomicReferenceFieldUpdater4;
        this.zze = atomicReferenceFieldUpdater5;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzo zzo, zzo zzo2) {
        this.zzb.lazySet(zzo, zzo2);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzo zzo, Thread thread) {
        this.zza.lazySet(zzo, thread);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc(zzq zzq, zzj zzj, zzj zzj2) {
        return zzk.zza(this.zzd, zzq, zzj, zzj2);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzd(zzq zzq, Object obj, Object obj2) {
        return zzk.zza(this.zze, zzq, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    public final boolean zze(zzq zzq, zzo zzo, zzo zzo2) {
        return zzk.zza(this.zzc, zzq, zzo, zzo2);
    }
}
