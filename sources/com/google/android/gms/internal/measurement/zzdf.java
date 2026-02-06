package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzdf extends zzbx implements zzdg {
    public zzdf() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        zzbw.zzb(parcel);
        zza((Bundle) zzbw.zza(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
