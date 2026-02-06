package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4500l;
import com.google.android.gms.location.C4553j;
import com.google.android.gms.location.LocationRequest;

final class zzr extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ C4553j zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzr(zzz zzz, f fVar, LocationRequest locationRequest, C4553j jVar) {
        super(fVar);
        this.zza = locationRequest;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzC(this.zza, C4500l.a((Object) null, zzbj.zzb(), C4553j.class.getSimpleName()), new zzy(this));
    }
}
