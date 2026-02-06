package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

/* renamed from: com.google.android.gms.location.x  reason: case insensitive filesystem */
public abstract class C4566x extends zzb implements C4568z {
    public C4566x() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static C4568z zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof C4568z) {
            return (C4568z) queryLocalInterface;
        }
        return new C4565w(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzd((LocationResult) zzc.zzb(parcel, LocationResult.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            zze((LocationAvailability) zzc.zzb(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
