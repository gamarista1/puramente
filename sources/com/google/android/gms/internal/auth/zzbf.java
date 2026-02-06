package com.google.android.gms.internal.auth;

import android.os.Parcel;
import ta.C5205c;

public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzc.zzb(parcel);
            zzb((C5205c) zzc.zza(parcel, C5205c.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            String readString = parcel.readString();
            zzc.zzb(parcel);
            zzc(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
