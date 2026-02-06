package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ta.C5204b;

public final class zzbh extends zza implements IInterface {
    zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbg) {
        Parcel zza = zza();
        zzc.zzd(zza, zzbg);
        zzc(3, zza);
    }

    public final void zze(zzbg zzbg, C5204b bVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzbg);
        zzc.zzc(zza, bVar);
        zzc(1, zza);
    }
}
