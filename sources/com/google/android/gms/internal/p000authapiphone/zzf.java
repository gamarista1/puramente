package com.google.android.gms.internal.p000authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzf  reason: invalid package */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z10 = false;
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        if (parcel.readInt() != 0) {
            z10 = true;
        }
        zzc.zzb(parcel);
        zzb(status, z10);
        return true;
    }
}
