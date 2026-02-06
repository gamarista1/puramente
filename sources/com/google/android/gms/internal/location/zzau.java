package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C4499k;
import com.google.android.gms.location.B;

final class zzau extends B {
    private final C4499k zza;

    zzau(C4499k kVar) {
        this.zza = kVar;
    }

    public final synchronized void zzc() {
        this.zza.a();
    }

    public final synchronized void zzd(Location location) {
        this.zza.c(new zzat(this, location));
    }
}
