package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C4499k;
import com.google.android.gms.location.C4566x;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

final class zzar extends C4566x {
    private final C4499k zza;

    zzar(C4499k kVar) {
        this.zza = kVar;
    }

    public final synchronized void zzc() {
        this.zza.a();
    }

    public final void zzd(LocationResult locationResult) {
        this.zza.c(new zzap(this, locationResult));
    }

    public final void zze(LocationAvailability locationAvailability) {
        this.zza.c(new zzaq(this, locationAvailability));
    }
}
