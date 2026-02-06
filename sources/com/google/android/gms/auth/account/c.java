package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.auth.zzb;
import com.google.android.gms.internal.auth.zzc;

public abstract class c extends zzb implements d {
    public c() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            boolean z10 = false;
            if (i10 != 2) {
                return false;
            }
            int i12 = zzc.zza;
            int readInt = parcel.readInt();
            zzc.zzb(parcel);
            if (readInt != 0) {
                z10 = true;
            }
            zzc(z10);
        } else {
            zzc.zzb(parcel);
            zzb((Account) zzc.zza(parcel, Account.CREATOR));
        }
        return true;
    }
}
