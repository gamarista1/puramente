package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import qa.C5146a;
import qa.C5147b;
import qa.i;

public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                zzc.zzb(parcel);
                zzh((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 2:
                zzc.zzb(parcel);
                zzf((Status) zzc.zza(parcel, Status.CREATOR), (i) zzc.zza(parcel, i.CREATOR));
                return true;
            case 3:
                zzc.zzb(parcel);
                zzg((Status) zzc.zza(parcel, Status.CREATOR), (C5147b) zzc.zza(parcel, C5147b.CREATOR));
                return true;
            case 4:
                zze();
                return true;
            case 5:
                zzc.zzb(parcel);
                zzd((Status) zzc.zza(parcel, Status.CREATOR));
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzb(createByteArray);
                return true;
            case 7:
                zzc.zzb(parcel);
                zzc((C5146a) zzc.zza(parcel, C5146a.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
