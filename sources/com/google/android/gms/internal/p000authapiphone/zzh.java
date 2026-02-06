package com.google.android.gms.internal.p000authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C4496h;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzh  reason: invalid package */
public final class zzh extends zza implements IInterface {
    zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zzc(zze zze) {
        Parcel zza = zza();
        zzc.zzc(zza, zze);
        zzb(4, zza);
    }

    public final void zzd(String str, zzg zzg) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, zzg);
        zzb(5, zza);
    }

    public final void zze(C4496h hVar) {
        Parcel zza = zza();
        zzc.zzc(zza, hVar);
        zzb(3, zza);
    }

    public final void zzf(C4496h hVar) {
        Parcel zza = zza();
        zzc.zzc(zza, hVar);
        zzb(6, zza);
    }

    public final void zzg(zzj zzj) {
        Parcel zza = zza();
        zzc.zzc(zza, zzj);
        zzb(1, zza);
    }

    public final void zzh(String str, zzj zzj) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, zzj);
        zzb(2, zza);
    }
}
