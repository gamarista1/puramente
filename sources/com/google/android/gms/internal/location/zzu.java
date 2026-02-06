package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.location.LocationRequest;

final class zzu extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzu(zzz zzz, f fVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(fVar);
        this.zza = locationRequest;
        this.zzb = pendingIntent;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzE(this.zza, this.zzb, new zzy(this));
    }
}
