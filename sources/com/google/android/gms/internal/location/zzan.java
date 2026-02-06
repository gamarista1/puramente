package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.location.C4556m;

public abstract class zzan extends zzb implements zzao {
    public zzan() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzb((C4556m) zzc.zzb(parcel, C4556m.CREATOR));
        return true;
    }
}
