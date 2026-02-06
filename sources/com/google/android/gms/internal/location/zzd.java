package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;

final class zzd extends zzf {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzd(zzg zzg, f fVar, long j10, PendingIntent pendingIntent) {
        super(fVar);
        this.zza = j10;
        this.zzb = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzq(this.zza, this.zzb);
        setResult(Status.f53907f);
    }
}
