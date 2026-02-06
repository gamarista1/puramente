package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4500l;
import com.google.android.gms.location.C4552i;
import com.google.android.gms.location.LocationRequest;

final class zzt extends zzx {
    final /* synthetic */ LocationRequest zza;
    final /* synthetic */ C4552i zzb;
    final /* synthetic */ Looper zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzt(zzz zzz, f fVar, LocationRequest locationRequest, C4552i iVar, Looper looper) {
        super(fVar);
        this.zza = locationRequest;
        this.zzc = looper;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((zzaz) bVar).zzB(zzba.zza((String) null, this.zza), C4500l.a((Object) null, zzbj.zza(this.zzc), C4552i.class.getSimpleName()), new zzy(this));
    }
}
