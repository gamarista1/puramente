package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;

public abstract class zzaj extends zzb implements zzak {
    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzb(parcel.readInt(), parcel.createStringArray());
        } else if (i10 == 2) {
            zzc(parcel.readInt(), parcel.createStringArray());
        } else if (i10 != 3) {
            return false;
        } else {
            zzd(parcel.readInt(), (PendingIntent) zzc.zzb(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
