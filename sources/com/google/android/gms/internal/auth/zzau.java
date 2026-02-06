package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class zzau extends zza implements IInterface {
    zzau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
    }

    public final void zzd(zzat zzat, zzaq zzaq) {
        Parcel zza = zza();
        zzc.zzd(zza, zzat);
        zzc.zzc(zza, zzaq);
        zzc(7, zza);
    }

    public final void zze(zzat zzat, zzbb zzbb) {
        Parcel zza = zza();
        zzc.zzd(zza, zzat);
        zzc.zzc(zza, zzbb);
        zzc(8, zza);
    }

    public final void zzf(zzat zzat, zzav zzav) {
        Parcel zza = zza();
        zzc.zzd(zza, zzat);
        zzc.zzc(zza, zzav);
        zzc(9, zza);
    }

    public final void zzg(zzat zzat, zzax zzax) {
        Parcel zza = zza();
        zzc.zzd(zza, zzat);
        zzc.zzc(zza, zzax);
        zzc(6, zza);
    }

    public final void zzh(zzat zzat, zzaz zzaz) {
        Parcel zza = zza();
        zzc.zzd(zza, zzat);
        zzc.zzc(zza, zzaz);
        zzc(5, zza);
    }
}
