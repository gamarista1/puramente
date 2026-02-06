package com.google.android.gms.internal.location;

import android.os.Parcel;

public abstract class zzah extends zzb implements zzai {
    public zzah() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzb((zzaa) zzc.zzb(parcel, zzaa.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            zzc();
        }
        return true;
    }
}
