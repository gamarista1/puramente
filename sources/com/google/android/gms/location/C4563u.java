package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzb;

/* renamed from: com.google.android.gms.location.u  reason: case insensitive filesystem */
public abstract class C4563u extends zzb implements C4564v {
    public static C4564v zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof C4564v) {
            return (C4564v) queryLocalInterface;
        }
        return new C4562t(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        throw null;
    }
}
