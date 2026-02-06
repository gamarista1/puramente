package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;

final class zze extends zzf {
    final /* synthetic */ PendingIntent zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zze(zzg zzg, f fVar, PendingIntent pendingIntent) {
        super(fVar);
        this.zza = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzt(this.zza);
        setResult(Status.f53907f);
    }
}
