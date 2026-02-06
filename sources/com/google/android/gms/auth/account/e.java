package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzc;

public final class e extends zza implements g {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    public final void d0(boolean z10) {
        Parcel zza = zza();
        int i10 = zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zzc(1, zza);
    }

    public final void g1(d dVar, String str) {
        Parcel zza = zza();
        zzc.zzd(zza, dVar);
        zza.writeString(str);
        zzc(2, zza);
    }

    public final void h1(d dVar, Account account) {
        Parcel zza = zza();
        zzc.zzd(zza, dVar);
        zzc.zzc(zza, account);
        zzc(3, zza);
    }
}
