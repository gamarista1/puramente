package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C4496h;
import oa.b;

public final class zzp extends zza implements IInterface {
    zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void zzd(C4496h hVar, zzbw zzbw) {
        Parcel zza = zza();
        zzc.zzd(zza, hVar);
        zzc.zzc(zza, zzbw);
        zzc(2, zza);
    }

    public final void zze(zzm zzm, b bVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzm);
        zzc.zzc(zza, bVar);
        zzc(4, zza);
    }

    public final void zzf(zzo zzo, Account account, String str, Bundle bundle) {
        Parcel zza = zza();
        zzc.zzd(zza, zzo);
        zzc.zzc(zza, account);
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        zzc(1, zza);
    }

    public final void zzg(zzk zzk, Account account) {
        Parcel zza = zza();
        zzc.zzd(zza, zzk);
        zzc.zzc(zza, account);
        zzc(6, zza);
    }

    public final void zzh(zzk zzk, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, zzk);
        zza.writeString(str);
        zzc(3, zza);
    }
}
