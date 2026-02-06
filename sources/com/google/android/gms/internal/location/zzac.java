package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.location.C4551h;

final class zzac extends zzae {
    final /* synthetic */ C4551h zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzac(zzaf zzaf, f fVar, C4551h hVar, PendingIntent pendingIntent) {
        super(fVar);
        this.zza = hVar;
        this.zzb = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzv(this.zza, this.zzb, this);
    }
}
