package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

public abstract class B extends zzb implements C {
    public B() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static C zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof C) {
            return (C) queryLocalInterface;
        }
        return new A(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzd((Location) zzc.zzb(parcel, Location.CREATOR));
        return true;
    }
}
